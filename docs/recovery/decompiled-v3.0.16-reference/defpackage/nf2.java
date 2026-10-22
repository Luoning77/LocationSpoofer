package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nf2 extends z implements CoroutineExceptionHandler {
    public final /* synthetic */ r30 e;
    public final /* synthetic */ of2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf2(CoroutineExceptionHandler.Key key, r30 r30Var, of2 of2Var) {
        super(key);
        this.e = r30Var;
        this.f = of2Var;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(y70 y70Var, Throwable th) throws Throwable {
        r30 r30Var = this.e;
        of2 of2Var = this.f;
        o51.H(th, new m5(10, r30Var, of2Var));
        CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key;
        key.getClass();
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) of2Var.e.get(key);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(y70Var, th);
    }
}
