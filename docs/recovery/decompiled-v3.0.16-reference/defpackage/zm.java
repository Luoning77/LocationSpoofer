package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class zm implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ dv1 g;

    public /* synthetic */ zm(String str, dv1 dv1Var, int i, int i2) {
        this.e = i2;
        this.f = str;
        this.g = dv1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        dv1 dv1Var = this.g;
        String str = this.f;
        f30 f30Var = (f30) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ks.C(str, dv1Var, f30Var, wc0.m0(49));
                break;
            default:
                rq1.b(str, dv1Var, f30Var, wc0.m0(1));
                break;
        }
        return mf3Var;
    }
}
