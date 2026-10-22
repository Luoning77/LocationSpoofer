package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class k5 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ l6 f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ k5(l6 l6Var, ey1 ey1Var, int i) {
        this.e = i;
        this.f = l6Var;
        this.g = ey1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.g;
        l6 l6Var = this.f;
        switch (i) {
            case 0:
                ey1Var.setValue(Boolean.valueOf(!((Boolean) ey1Var.getValue()).booleanValue()));
                if (((Boolean) ey1Var.getValue()).booleanValue()) {
                    l6Var.g(new h6(l6Var, (q60) null, 1));
                }
                break;
            case 1:
                ey1Var.setValue(Boolean.FALSE);
                l6Var.g(new e6(l6Var, null, 3));
                break;
            case 2:
                String str = (String) ey1Var.getValue();
                str.getClass();
                l6Var.g(new f6(l6Var, str, null, 0));
                break;
            case 3:
                ey1Var.setValue(Boolean.FALSE);
                l6Var.g(new i6(l6Var, null, 1));
                break;
            default:
                ey1Var.setValue(Boolean.valueOf(!((Boolean) ey1Var.getValue()).booleanValue()));
                if (((Boolean) ey1Var.getValue()).booleanValue()) {
                    l6Var.g(new h6(l6Var, (q60) null, 1));
                }
                break;
        }
        return mf3Var;
    }
}
