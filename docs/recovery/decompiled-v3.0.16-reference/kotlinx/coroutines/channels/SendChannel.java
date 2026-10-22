package kotlinx.coroutines.channels;

import defpackage.b81;
import defpackage.cc0;
import defpackage.lu0;
import defpackage.q60;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.selects.SelectClause2;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface SendChannel<E> {
    boolean close(Throwable th);

    SelectClause2<E, SendChannel<E>> getOnSend();

    void invokeOnClose(lu0 lu0Var);

    boolean isClosedForSend();

    @cc0
    boolean offer(E e);

    Object send(E e, q60 q60Var);

    /* JADX INFO: renamed from: trySend-JP2dKIU */
    Object mo32trySendJP2dKIU(E e);

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean close$default(SendChannel sendChannel, Throwable th, int i, Object obj) {
            if (obj != null) {
                b81.s("Super calls with default arguments not supported in this target, function: close");
                return false;
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return sendChannel.close(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @cc0
        public static <E> boolean offer(SendChannel<? super E> sendChannel, E e) throws Throwable {
            Object objMo32trySendJP2dKIU = sendChannel.mo32trySendJP2dKIU(e);
            if (ChannelResult.m56isSuccessimpl(objMo32trySendJP2dKIU)) {
                return true;
            }
            Throwable thM50exceptionOrNullimpl = ChannelResult.m50exceptionOrNullimpl(objMo32trySendJP2dKIU);
            if (thM50exceptionOrNullimpl == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(thM50exceptionOrNullimpl);
        }

        public static /* synthetic */ void isClosedForSend$annotations() {
        }
    }
}
