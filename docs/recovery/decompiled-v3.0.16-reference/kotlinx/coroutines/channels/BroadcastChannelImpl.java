package kotlinx.coroutines.channels;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.p91;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.uj0;
import defpackage.z70;
import defpackage.zy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements BroadcastChannel<E> {
    private final int capacity;
    private Object lastConflatedElement;
    private final ReentrantLock lock;
    private final HashMap<SelectInstance<?>, Object> onSendInternalResult;
    private List<? extends BufferedChannel<E>> subscribers;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public final class SubscriberBuffered extends BufferedChannel<E> {
        /* JADX WARN: Multi-variable type inference failed */
        public SubscriberBuffered() {
            super(BroadcastChannelImpl.this.getCapacity(), null, 2, 0 == true ? 1 : 0);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: cancelImpl, reason: merged with bridge method [inline-methods] */
        public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
            ReentrantLock reentrantLock = ((BroadcastChannelImpl) BroadcastChannelImpl.this).lock;
            BroadcastChannelImpl<E> broadcastChannelImpl = BroadcastChannelImpl.this;
            reentrantLock.lock();
            try {
                broadcastChannelImpl.removeSubscriber(this);
                return super.cancelImpl$kotlinx_coroutines_core(th);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public final class SubscriberConflated extends ConflatedBufferedChannel<E> {
        public SubscriberConflated() {
            super(1, BufferOverflow.DROP_OLDEST, null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* JADX INFO: renamed from: cancelImpl, reason: merged with bridge method [inline-methods] */
        public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
            BroadcastChannelImpl.this.removeSubscriber(this);
            return super.cancelImpl$kotlinx_coroutines_core(th);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", l = {240}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        final /* synthetic */ Object $element;
        final /* synthetic */ SelectInstance<?> $select;
        int label;
        final /* synthetic */ BroadcastChannelImpl<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BroadcastChannelImpl<E> broadcastChannelImpl, Object obj, SelectInstance<?> selectInstance, q60 q60Var) {
            super(2, q60Var);
            this.this$0 = broadcastChannelImpl;
            this.$element = obj;
            this.$select = selectInstance;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            return new AnonymousClass2(this.this$0, this.$element, this.$select, q60Var);
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            boolean z = true;
            try {
                if (i == 0) {
                    ee0.J(obj);
                    BroadcastChannelImpl<E> broadcastChannelImpl = this.this$0;
                    Object obj2 = this.$element;
                    this.label = 1;
                    Object objSend = broadcastChannelImpl.send((E) obj2, this);
                    z70 z70Var = z70.e;
                    if (objSend == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
            } catch (Throwable th) {
                if (!this.this$0.isClosedForSend() || (!(th instanceof ClosedSendChannelException) && this.this$0.getSendException() != th)) {
                    throw th;
                }
                z = false;
            }
            ReentrantLock reentrantLock = ((BroadcastChannelImpl) this.this$0).lock;
            BroadcastChannelImpl<E> broadcastChannelImpl2 = this.this$0;
            SelectInstance<?> selectInstance = this.$select;
            reentrantLock.lock();
            try {
                HashMap map = ((BroadcastChannelImpl) broadcastChannelImpl2).onSendInternalResult;
                Object obj3 = mf3.a;
                map.put(selectInstance, z ? obj3 : BufferedChannelKt.getCHANNEL_CLOSED());
                selectInstance.getClass();
                if (((SelectImplementation) selectInstance).trySelectDetailed(broadcastChannelImpl2, obj3) != TrySelectDetailedResult.REREGISTER) {
                    ((BroadcastChannelImpl) broadcastChannelImpl2).onSendInternalResult.remove(selectInstance);
                }
                return obj3;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$send$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", l = {179}, m = "send")
    public static final class AnonymousClass1 extends r60 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BroadcastChannelImpl<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BroadcastChannelImpl<E> broadcastChannelImpl, q60 q60Var) {
            super(q60Var);
            this.this$0 = broadcastChannelImpl;
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.send(null, this);
        }
    }

    public BroadcastChannelImpl(int i) {
        super(0, null);
        this.capacity = i;
        if (i < 1 && i != -1) {
            fo.f(p91.m(i, "BroadcastChannel capacity must be positive or Channel.CONFLATED, but ", " was specified"));
            throw null;
        }
        this.lock = new ReentrantLock();
        this.subscribers = uj0.e;
        this.lastConflatedElement = BroadcastChannelKt.NO_ELEMENT;
        this.onSendInternalResult = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void removeSubscriber(ReceiveChannel<? extends E> receiveChannel) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List<? extends BufferedChannel<E>> list = this.subscribers;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BufferedChannel) obj) != receiveChannel) {
                    arrayList.add(obj);
                }
            }
            this.subscribers = arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).cancelImpl$kotlinx_coroutines_core(th);
            }
            this.lastConflatedElement = BroadcastChannelKt.NO_ELEMENT;
            return super.cancelImpl$kotlinx_coroutines_core(th);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).close(th);
            }
            List<? extends BufferedChannel<E>> list = this.subscribers;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BufferedChannel) obj).hasElements$kotlinx_coroutines_core()) {
                    arrayList.add(obj);
                }
            }
            this.subscribers = arrayList;
            return super.close(th);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final E getValue() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (isClosedForSend()) {
                Throwable closeCause = getCloseCause();
                if (closeCause == null) {
                    throw new IllegalStateException("This broadcast channel is closed");
                }
                throw closeCause;
            }
            if (this.lastConflatedElement == BroadcastChannelKt.NO_ELEMENT) {
                throw new IllegalStateException("No value");
            }
            E e = (E) this.lastConflatedElement;
            reentrantLock.unlock();
            return e;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final E getValueOrNull() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            E e = null;
            if (!isClosedForReceive() && this.lastConflatedElement != BroadcastChannelKt.NO_ELEMENT) {
                e = (E) this.lastConflatedElement;
            }
            return e;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.isClosedForSend();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            SubscriberBuffered subscriberConflated = this.capacity == -1 ? new SubscriberConflated() : new SubscriberBuffered();
            if (isClosedForSend() && this.lastConflatedElement == BroadcastChannelKt.NO_ELEMENT) {
                ((BufferedChannel) subscriberConflated).close(getCloseCause());
                return subscriberConflated;
            }
            if (this.lastConflatedElement != BroadcastChannelKt.NO_ELEMENT) {
                ((BufferedChannel) subscriberConflated).mo32trySendJP2dKIU(getValue());
            }
            this.subscribers = zy.w0(this.subscribers, subscriberConflated);
            return subscriberConflated;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Object objRemove = this.onSendInternalResult.remove(selectInstance);
            if (objRemove != null) {
                selectInstance.selectInRegistrationPhase(objRemove);
                reentrantLock.unlock();
            } else {
                reentrantLock.unlock();
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(selectInstance.getContext()), null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(this, obj, selectInstance, null), 1, null);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007c -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E r6, defpackage.q60 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = (kotlinx.coroutines.channels.BroadcastChannelImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            java.lang.Object r5 = r0.L$2
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$1
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.channels.BroadcastChannelImpl r1 = (kotlinx.coroutines.channels.BroadcastChannelImpl) r1
            defpackage.ee0.J(r7)
            r4 = r0
            r0 = r6
            r6 = r1
        L31:
            r1 = r4
            goto L80
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r5)
            r5 = 0
            return r5
        L3a:
            defpackage.ee0.J(r7)
            java.util.concurrent.locks.ReentrantLock r7 = r5.lock
            r7.lock()
            boolean r1 = r5.isClosedForSend()     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L9a
            int r1 = r5.capacity     // Catch: java.lang.Throwable -> L50
            r3 = -1
            if (r1 != r3) goto L52
            r5.lastConflatedElement = r6     // Catch: java.lang.Throwable -> L50
            goto L52
        L50:
            r5 = move-exception
            goto L9f
        L52:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r1 = r5.subscribers     // Catch: java.lang.Throwable -> L50
            r7.unlock()
            java.util.Iterator r7 = r1.iterator()
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L5f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r5.next()
            kotlinx.coroutines.channels.BufferedChannel r1 = (kotlinx.coroutines.channels.BufferedChannel) r1
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r5
            r0.label = r2
            java.lang.Object r1 = r1.sendBroadcast$kotlinx_coroutines_core(r7, r0)
            z70 r3 = defpackage.z70.e
            if (r1 != r3) goto L7c
            return r3
        L7c:
            r4 = r0
            r0 = r7
            r7 = r1
            goto L31
        L80:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L94
            boolean r7 = r6.isClosedForSend()
            if (r7 != 0) goto L8f
            goto L94
        L8f:
            java.lang.Throwable r5 = r6.getSendException()
            throw r5
        L94:
            r7 = r0
            r0 = r1
            goto L5f
        L97:
            mf3 r5 = defpackage.mf3.a
            return r5
        L9a:
            java.lang.Throwable r5 = r5.getSendException()     // Catch: java.lang.Throwable -> L50
            throw r5     // Catch: java.lang.Throwable -> L50
        L9f:
            r7.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.send(java.lang.Object, q60):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public String toString() {
        String str;
        if (this.lastConflatedElement != BroadcastChannelKt.NO_ELEMENT) {
            str = "CONFLATED_ELEMENT=" + this.lastConflatedElement + "; ";
        } else {
            str = "";
        }
        return str + "BROADCAST=<" + super.toString() + ">; SUBSCRIBERS=" + zy.s0(this.subscribers, ";", "<", ">", null, 56);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU, reason: not valid java name */
    public Object mo32trySendJP2dKIU(E e) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (isClosedForSend()) {
                Object objMo32trySendJP2dKIU = super.mo32trySendJP2dKIU(e);
                reentrantLock.unlock();
                return objMo32trySendJP2dKIU;
            }
            List<? extends BufferedChannel<E>> list = this.subscribers;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((BufferedChannel) it.next()).shouldSendSuspend$kotlinx_coroutines_core()) {
                        Object objM60failurePtdJZtk = ChannelResult.Companion.m60failurePtdJZtk();
                        reentrantLock.unlock();
                        return objM60failurePtdJZtk;
                    }
                }
            }
            if (this.capacity == -1) {
                this.lastConflatedElement = e;
            }
            Iterator<T> it2 = this.subscribers.iterator();
            while (it2.hasNext()) {
                ((BufferedChannel) it2.next()).mo32trySendJP2dKIU(e);
            }
            Object objM61successJP2dKIU = ChannelResult.Companion.m61successJP2dKIU(mf3.a);
            reentrantLock.unlock();
            return objM61successJP2dKIU;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static /* synthetic */ void getValueOrNull$annotations() {
    }
}
