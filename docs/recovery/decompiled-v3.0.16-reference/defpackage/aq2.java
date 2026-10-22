package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class aq2 implements pu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ ar2 f;
    public final /* synthetic */ er2 g;
    public final /* synthetic */ p10 h;

    public /* synthetic */ aq2(ar2 ar2Var, er2 er2Var, p10 p10Var) {
        this.f = ar2Var;
        this.g = er2Var;
        this.h = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        p10 p10Var = this.h;
        er2 er2Var = this.g;
        ar2 ar2Var = this.f;
        f30 f30Var = (f30) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    k22.b(fr2.a.a(er2Var), sb.a0(610483127, new j00(p10Var, ar2Var), ov0Var), ov0Var, 56);
                }
                break;
            default:
                ov0 ov0Var2 = (ov0) f30Var;
                if (!ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    n51.c(ar2Var, sb.a0(-284825865, new aq2(er2Var, p10Var, ar2Var), ov0Var2), ov0Var2, 48);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ aq2(er2 er2Var, p10 p10Var, ar2 ar2Var) {
        this.g = er2Var;
        this.h = p10Var;
        this.f = ar2Var;
    }
}
