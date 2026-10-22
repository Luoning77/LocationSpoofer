package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class wq2 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ s03 f;

    public /* synthetic */ wq2(s03 s03Var, int i) {
        this.e = i;
        this.f = s03Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        s03 s03Var = this.f;
        switch (i) {
            case 0:
                c12 c12Var = (c12) s03Var.getValue();
                long j = c12Var.a;
                return c12Var;
            case 1:
                vi viVar = xq2.a;
                c12 c12Var2 = (c12) s03Var.getValue();
                long j2 = c12Var2.a;
                return c12Var2;
            case 2:
                return Boolean.valueOf(((Number) s03Var.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) s03Var.getValue()).floatValue() > 0.0f);
        }
    }
}
