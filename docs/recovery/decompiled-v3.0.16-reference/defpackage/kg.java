package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class kg implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ dv1 f;
    public final /* synthetic */ p10 g;
    public final /* synthetic */ int h;

    public /* synthetic */ kg(dv1 dv1Var, p10 p10Var, int i, int i2) {
        this.e = i2;
        this.f = dv1Var;
        this.g = p10Var;
        this.h = i;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = this.h;
        p10 p10Var = this.g;
        dv1 dv1Var = this.f;
        f30 f30Var = (f30) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ym3.k(dv1Var, p10Var, f30Var, wc0.m0(i2 | 1));
                break;
            case 1:
                ym3.l(dv1Var, p10Var, f30Var, wc0.m0(i2 | 1));
                break;
            case 2:
                eb0.d(dv1Var, p10Var, f30Var, wc0.m0(i2 | 1));
                break;
            case 3:
                ke0.m(dv1Var, p10Var, f30Var, wc0.m0(i2 | 1));
                break;
            default:
                ke0.l(dv1Var, p10Var, f30Var, wc0.m0(i2 | 1));
                break;
        }
        return mf3Var;
    }
}
