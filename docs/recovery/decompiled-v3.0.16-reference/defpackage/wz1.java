package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wz1 extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ xz1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz1(xz1 xz1Var, int i) {
        super(0);
        this.f = i;
        this.g = xz1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        xz1 xz1Var = this.g;
        switch (i) {
            case 0:
                vv vvVar = xz1Var.N;
                vvVar.getClass();
                xz1Var.n1(vvVar, xz1Var.M);
                break;
            default:
                xz1 xz1Var2 = xz1Var.w;
                if (xz1Var2 != null) {
                    xz1Var2.A1();
                }
                break;
        }
        return mf3Var;
    }
}
