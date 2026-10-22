package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ec3 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ mc3 f;

    public /* synthetic */ ec3(mc3 mc3Var, int i) {
        this.e = i;
        this.f = mc3Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mc3 mc3Var = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf((o51.f(mc3Var.d.getValue(), mc3Var.c()) && mc3Var.g.g() == Long.MIN_VALUE && !((Boolean) mc3Var.h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(mc3Var.b());
        }
    }
}
