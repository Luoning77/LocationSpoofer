package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class c9 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ p10 f;

    public /* synthetic */ c9(p10 p10Var, int i) {
        this.e = i;
        this.f = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        p10 p10Var = this.f;
        f30 f30Var = (f30) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                i9.b(p10Var, f30Var, wc0.m0(439));
                break;
            case 1:
                int iIntValue = num.intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    p10Var.invoke(ov0Var, 0);
                }
                break;
            case 2:
                num.getClass();
                vd0.b(p10Var, f30Var, wc0.m0(7));
                break;
            case 3:
                num.getClass();
                wc0.g(p10Var, f30Var, wc0.m0(7));
                break;
            default:
                int iIntValue2 = num.intValue();
                ov0 ov0Var2 = (ov0) f30Var;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    p10Var.invoke(ov0Var2, 0);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ c9(p10 p10Var, int i, int i2) {
        this.e = i2;
        this.f = p10Var;
    }
}
