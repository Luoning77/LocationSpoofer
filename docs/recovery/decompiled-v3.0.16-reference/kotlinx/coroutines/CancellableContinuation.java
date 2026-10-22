package kotlinx.coroutines;

import defpackage.b81;
import defpackage.cc0;
import defpackage.lu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface CancellableContinuation<T> extends q60 {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(CancellableContinuation cancellableContinuation, Throwable th, int i, Object obj) {
            if (obj != null) {
                b81.s("Super calls with default arguments not supported in this target, function: cancel");
                return false;
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return cancellableContinuation.cancel(th);
        }

        public static /* synthetic */ Object tryResume$default(CancellableContinuation cancellableContinuation, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 != null) {
                b81.s("Super calls with default arguments not supported in this target, function: tryResume");
                return null;
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            return cancellableContinuation.tryResume(obj, obj2);
        }
    }

    boolean cancel(Throwable th);

    void completeResume(Object obj);

    @Override // defpackage.q60
    /* synthetic */ y70 getContext();

    void initCancellability();

    void invokeOnCancellation(lu0 lu0Var);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @cc0
    void resume(T t, lu0 lu0Var);

    <R extends T> void resume(R r, qu0 qu0Var);

    void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, T t);

    void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th);

    @Override // defpackage.q60
    /* synthetic */ void resumeWith(Object obj);

    Object tryResume(T t, Object obj);

    <R extends T> Object tryResume(R r, Object obj, qu0 qu0Var);

    Object tryResumeWithException(Throwable th);
}
