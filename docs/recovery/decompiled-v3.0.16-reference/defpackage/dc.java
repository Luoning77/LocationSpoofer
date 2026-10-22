package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class dc implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ dc(dv1 dv1Var, int i, int i2) {
        this.e = 0;
        this.g = dv1Var;
        this.f = i2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                gc.b((dv1) obj3, (f30) obj, wc0.m0(1), i2);
                break;
            case 1:
                ((Integer) obj2).intValue();
                ca1.b((ul1) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
            default:
                ld1 ld1Var = (ld1) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    d51 d51VarD = ld1Var.b.a.d(i2);
                    ((p10) d51VarD.c.c).invoke(ld1Var.c, Integer.valueOf(i2 - d51VarD.a), ov0Var, 0);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ dc(int i, int i2, Object obj) {
        this.e = i2;
        this.g = obj;
        this.f = i;
    }
}
