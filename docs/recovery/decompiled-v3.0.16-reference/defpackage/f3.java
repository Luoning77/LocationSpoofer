package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class f3 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ey1 f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ ey1 h;

    public /* synthetic */ f3(ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, int i) {
        this.e = i;
        this.f = ey1Var;
        this.g = ey1Var2;
        this.h = ey1Var3;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.h;
        ey1 ey1Var2 = this.g;
        ey1 ey1Var3 = this.f;
        switch (i) {
            case 0:
                if (!xq1.e(ey1Var3)) {
                    ey1Var2.setValue(vj0.e);
                    ey1Var.setValue(Boolean.FALSE);
                }
                break;
            default:
                ey1Var3.setValue(Boolean.valueOf(!((Boolean) ey1Var3.getValue()).booleanValue()));
                ey1Var2.setValue("");
                ey1Var.setValue("");
                break;
        }
        return mf3Var;
    }
}
