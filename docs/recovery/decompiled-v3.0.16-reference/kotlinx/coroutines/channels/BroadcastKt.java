package kotlinx.coroutines.channels;

import defpackage.cc0;
import defpackage.k33;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.sj0;
import defpackage.t;
import defpackage.y70;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class BroadcastKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastKt$broadcast$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", l = {26, 27}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        final /* synthetic */ ReceiveChannel<E> $channel;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ReceiveChannel<? extends E> receiveChannel, q60 q60Var) {
            super(2, q60Var);
            this.$channel = receiveChannel;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$channel, q60Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.pu0
        public final Object invoke(ProducerScope<? super E> producerScope, q60 q60Var) {
            return ((AnonymousClass2) create(producerScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0046  */
        /* JADX WARN: Code duplicated, block: B:18:0x0051  */
        /* JADX WARN: Code duplicated, block: B:21:0x0062  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            if (r4.send(r7, r6) == r3) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:7:0x0017). Please report as a decompilation issue!!! */
        @Override // defpackage.oq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 2
                r2 = 1
                z70 r3 = defpackage.z70.e
                if (r0 == 0) goto L2c
                if (r0 == r2) goto L20
                if (r0 != r1) goto L19
                java.lang.Object r0 = r6.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r4 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                defpackage.ee0.J(r7)
            L17:
                r7 = r4
                goto L39
            L19:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fo.n(r6)
                r6 = 0
                return r6
            L20:
                java.lang.Object r0 = r6.L$1
                kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
                java.lang.Object r4 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                defpackage.ee0.J(r7)
                goto L49
            L2c:
                defpackage.ee0.J(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
                kotlinx.coroutines.channels.ReceiveChannel<E> r0 = r6.$channel
                kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
            L39:
                r6.L$0 = r7
                r6.L$1 = r0
                r6.label = r2
                java.lang.Object r4 = r0.hasNext(r6)
                if (r4 != r3) goto L46
                goto L61
            L46:
                r5 = r4
                r4 = r7
                r7 = r5
            L49:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L62
                java.lang.Object r7 = r0.next()
                r6.L$0 = r4
                r6.L$1 = r0
                r6.label = r1
                java.lang.Object r7 = r4.send(r7, r6)
                if (r7 != r3) goto L17
            L61:
                return r3
            L62:
                mf3 r6 = defpackage.mf3.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @cc0
    public static final <E> BroadcastChannel<E> broadcast(ReceiveChannel<? extends E> receiveChannel, int i, CoroutineStart coroutineStart) {
        return broadcast$default(CoroutineScopeKt.plus(CoroutineScopeKt.plus(GlobalScope.INSTANCE, Dispatchers.getUnconfined()), new BroadcastKt$broadcast$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)), null, i, coroutineStart, new t(receiveChannel, 8), new AnonymousClass2(receiveChannel, null), 1, null);
    }

    public static /* synthetic */ BroadcastChannel broadcast$default(CoroutineScope coroutineScope, y70 y70Var, int i, CoroutineStart coroutineStart, lu0 lu0Var, pu0 pu0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            y70Var = sj0.e;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        if ((i2 & 8) != 0) {
            lu0Var = null;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        return broadcast(coroutineScope, y70Var, i, coroutineStart2, lu0Var, pu0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 broadcast$lambda$1(ReceiveChannel receiveChannel, Throwable th) {
        ChannelsKt.cancelConsumed(receiveChannel, th);
        return mf3.a;
    }

    public static /* synthetic */ BroadcastChannel broadcast$default(ReceiveChannel receiveChannel, int i, CoroutineStart coroutineStart, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        return broadcast(receiveChannel, i, coroutineStart);
    }

    @cc0
    public static final <E> BroadcastChannel<E> broadcast(CoroutineScope coroutineScope, y70 y70Var, int i, CoroutineStart coroutineStart, lu0 lu0Var, pu0 pu0Var) {
        BroadcastCoroutine broadcastCoroutine;
        y70 y70VarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, y70Var);
        BroadcastChannel BroadcastChannel = BroadcastChannelKt.BroadcastChannel(i);
        if (coroutineStart.isLazy()) {
            broadcastCoroutine = new LazyBroadcastCoroutine(y70VarNewCoroutineContext, BroadcastChannel, pu0Var);
        } else {
            broadcastCoroutine = new BroadcastCoroutine(y70VarNewCoroutineContext, BroadcastChannel, true);
        }
        if (lu0Var != null) {
            ((JobSupport) broadcastCoroutine).invokeOnCompletion(lu0Var);
        }
        ((AbstractCoroutine) broadcastCoroutine).start(coroutineStart, broadcastCoroutine, pu0Var);
        return (BroadcastChannel<E>) broadcastCoroutine;
    }
}
