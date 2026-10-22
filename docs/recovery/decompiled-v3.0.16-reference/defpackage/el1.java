package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class el1 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ ey1 h;

    public /* synthetic */ el1(ul1 ul1Var, ey1 ey1Var, ey1 ey1Var2, int i) {
        this.e = i;
        this.f = ul1Var;
        this.g = ey1Var;
        this.h = ey1Var2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.h;
        ey1 ey1Var2 = this.g;
        ul1 ul1Var = this.f;
        double dDoubleValue = ((Double) obj).doubleValue();
        double dDoubleValue2 = ((Double) obj2).doubleValue();
        switch (i) {
            case 0:
                if (((Number) ey1Var2.getValue()).intValue() == js.Location.ordinal() && !((Boolean) ey1Var.getValue()).booleanValue()) {
                    hn1.b(ul1Var, new fz2(dDoubleValue, dDoubleValue2));
                }
                break;
            default:
                if (((Number) ey1Var2.getValue()).intValue() == js.Location.ordinal() && !((Boolean) ey1Var.getValue()).booleanValue()) {
                    hn1.b(ul1Var, new hz2(dDoubleValue, dDoubleValue2));
                }
                break;
        }
        return mf3Var;
    }
}
