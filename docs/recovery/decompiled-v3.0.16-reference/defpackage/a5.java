package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class a5 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ l6 f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ ey1 h;

    public /* synthetic */ a5(l6 l6Var, ey1 ey1Var, ey1 ey1Var2, int i) {
        this.e = i;
        this.f = l6Var;
        this.g = ey1Var;
        this.h = ey1Var2;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        l6 l6Var = this.f;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.h;
        ey1 ey1Var2 = this.g;
        switch (i) {
            case 0:
                String string = l13.D0((String) ey1Var2.getValue()).toString();
                ey1Var2.setValue("");
                ey1Var.setValue(Boolean.FALSE);
                string.getClass();
                l6Var.g(new h6(l6Var, string, (q60) null));
                break;
            case 1:
                ey1Var2.setValue(Boolean.FALSE);
                l6Var.g(new g6(l6Var, (Object) new f4(ey1Var, 9), (q60) null, 2));
                break;
            case 2:
                ey1Var.setValue((String) ey1Var2.getValue());
                String str = (String) ey1Var2.getValue();
                str.getClass();
                l6Var.g(new f6(l6Var, str, null, 1));
                break;
            default:
                String str2 = (String) ey1Var2.getValue();
                String str3 = (String) ey1Var.getValue();
                str2.getClass();
                str3.getClass();
                l6 l6Var2 = this.f;
                l6Var2.g(new g6(l6Var2, str2, str3, null, 0));
                break;
        }
        return mf3Var;
    }
}
