package kotlinx.coroutines.channels;

import defpackage.b81;
import defpackage.cc0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.z70;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface ReceiveChannel<E> {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", l = {770}, m = "receiveOrNull")
    public static final class AnonymousClass1<E> extends r60 {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(q60 q60Var) {
            super(q60Var);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.receiveOrNull(null, this);
        }
    }

    @cc0
    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    @cc0
    /* synthetic */ boolean cancel(Throwable th);

    SelectClause1<E> getOnReceive();

    SelectClause1<ChannelResult<E>> getOnReceiveCatching();

    SelectClause1<E> getOnReceiveOrNull();

    boolean isClosedForReceive();

    boolean isEmpty();

    ChannelIterator<E> iterator();

    @cc0
    E poll();

    Object receive(q60 q60Var);

    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    Object mo38receiveCatchingJP2dKIU(q60 q60Var);

    @cc0
    Object receiveOrNull(q60 q60Var);

    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    Object mo39tryReceivePtdJZtk();

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(ReceiveChannel receiveChannel, Throwable th, int i, Object obj) {
            if (obj != null) {
                b81.s("Super calls with default arguments not supported in this target, function: cancel");
                return false;
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return receiveChannel.cancel(th);
        }

        public static <E> SelectClause1<E> getOnReceiveOrNull(ReceiveChannel<? extends E> receiveChannel) {
            receiveChannel.getClass();
            return ((BufferedChannel) receiveChannel).getOnReceiveOrNull();
        }

        @cc0
        public static <E> E poll(ReceiveChannel<? extends E> receiveChannel) throws Throwable {
            Object objMo39tryReceivePtdJZtk = receiveChannel.mo39tryReceivePtdJZtk();
            if (ChannelResult.m56isSuccessimpl(objMo39tryReceivePtdJZtk)) {
                return (E) ChannelResult.m52getOrThrowimpl(objMo39tryReceivePtdJZtk);
            }
            Throwable thM50exceptionOrNullimpl = ChannelResult.m50exceptionOrNullimpl(objMo39tryReceivePtdJZtk);
            if (thM50exceptionOrNullimpl == null) {
                return null;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(thM50exceptionOrNullimpl);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @cc0
        public static <E> Object receiveOrNull(ReceiveChannel<? extends E> receiveChannel, q60 q60Var) {
            AnonymousClass1 anonymousClass1;
            Object objMo38receiveCatchingJP2dKIU;
            if (q60Var instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) q60Var;
                int i = anonymousClass1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(q60Var);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(q60Var);
            }
            Object obj = anonymousClass1.result;
            int i2 = anonymousClass1.label;
            if (i2 == 0) {
                ee0.J(obj);
                anonymousClass1.label = 1;
                objMo38receiveCatchingJP2dKIU = receiveChannel.mo38receiveCatchingJP2dKIU(anonymousClass1);
                z70 z70Var = z70.e;
                if (objMo38receiveCatchingJP2dKIU == z70Var) {
                    return z70Var;
                }
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                objMo38receiveCatchingJP2dKIU = ((ChannelResult) obj).m58unboximpl();
            }
            return ChannelResult.m51getOrNullimpl(objMo38receiveCatchingJP2dKIU);
        }

        public static /* synthetic */ void cancel$default(ReceiveChannel receiveChannel, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                b81.s("Super calls with default arguments not supported in this target, function: cancel");
                return;
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            receiveChannel.cancel(cancellationException);
        }

        @cc0
        public static /* synthetic */ void getOnReceiveOrNull$annotations() {
        }

        public static /* synthetic */ void isClosedForReceive$annotations() {
        }

        public static /* synthetic */ void isEmpty$annotations() {
        }
    }
}
