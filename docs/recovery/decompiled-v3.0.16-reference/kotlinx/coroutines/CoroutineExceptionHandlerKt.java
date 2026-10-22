package kotlinx.coroutines;

import defpackage.pu0;
import defpackage.vd0;
import defpackage.y70;
import defpackage.z;
import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CoroutineExceptionHandlerKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass1 extends z implements CoroutineExceptionHandler {
        final /* synthetic */ pu0 $handler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(pu0 pu0Var, CoroutineExceptionHandler.Key key) {
            super(key);
            this.$handler = pu0Var;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(y70 y70Var, Throwable th) {
            this.$handler.invoke(y70Var, th);
        }
    }

    public static final CoroutineExceptionHandler CoroutineExceptionHandler(pu0 pu0Var) {
        return new AnonymousClass1(pu0Var, CoroutineExceptionHandler.Key);
    }

    public static final void handleCoroutineException(y70 y70Var, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) y70Var.get(CoroutineExceptionHandler.Key);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(y70Var, th);
            } else {
                CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(y70Var, th);
            }
        } catch (Throwable th2) {
            CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(y70Var, handlerException(th, th2));
        }
    }

    public static final Throwable handlerException(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        vd0.d(runtimeException, th);
        return runtimeException;
    }
}
