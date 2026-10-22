package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class br implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ a93 f;

    public /* synthetic */ br(a93 a93Var, int i) {
        this.e = i;
        this.f = a93Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        w83 w83Var;
        int i = this.e;
        int i2 = 2;
        a93 a93Var = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf(a93Var != null ? ((Boolean) new br(a93Var, i2).invoke()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(a93Var != null ? ((Boolean) new br(a93Var, i2).invoke()).booleanValue() : false);
            default:
                dj djVar = a93Var.b;
                x83 x83Var = (x83) a93Var.a.getValue();
                return Boolean.valueOf(o51.f(djVar, (x83Var == null || (w83Var = x83Var.a) == null) ? null : w83Var.a));
        }
    }
}
