package kotlinx.coroutines;

import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class DispatchException extends Exception {
    private final Throwable cause;

    public DispatchException(Throwable th, CoroutineDispatcher coroutineDispatcher, y70 y70Var) {
        super("Coroutine dispatcher " + coroutineDispatcher + " threw an exception, context = " + y70Var, th);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
