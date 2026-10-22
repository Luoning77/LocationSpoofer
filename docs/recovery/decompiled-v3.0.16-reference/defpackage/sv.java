package defpackage;

import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class sv implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lu0 f;

    public /* synthetic */ sv(int i, lu0 lu0Var) {
        this.e = i;
        this.f = lu0Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        lu0 lu0Var = this.f;
        switch (i) {
            case 0:
                return CancellableContinuationImpl.resume$lambda$13$lambda$12(lu0Var, (Throwable) obj, obj2, (y70) obj3);
            default:
                lu0Var.invoke(new c12(((x92) obj2).c));
                return mf3.a;
        }
    }
}
