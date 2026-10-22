package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g9 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ pu0 f;
    public final /* synthetic */ p10 g;

    public /* synthetic */ g9(pu0 pu0Var, p10 p10Var, int i) {
        this.e = i;
        this.f = pu0Var;
        this.g = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        p10 p10Var = this.g;
        pu0 pu0Var = this.f;
        int i2 = 0;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Number) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    if (pu0Var == null) {
                        ov0Var.c0(-1102039173);
                    } else {
                        ov0Var.c0(795734342);
                        pu0Var.invoke(ov0Var, 0);
                    }
                    ov0Var.p(false);
                    p10Var.invoke(ov0Var, 0);
                }
                break;
            default:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    b52 b52Var = i9.a;
                    i9.b(sb.a0(-459506658, new g9(pu0Var, p10Var, i2), ov0Var2), ov0Var2, 438);
                }
                break;
        }
        return mf3Var;
    }
}
