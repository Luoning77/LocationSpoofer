package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class r5 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ l6 f;

    public /* synthetic */ r5(l6 l6Var, int i) {
        this.e = i;
        this.f = l6Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        l6 l6Var = this.f;
        switch (i) {
            case 0:
                l6Var.g(new j6(l6Var, false, null));
                break;
            case 1:
                l6Var.e();
                l6Var.g(new e6(l6Var, null, 4));
                break;
            default:
                l6Var.e();
                l6Var.g(new e6(l6Var, null, 1));
                break;
        }
        return mf3Var;
    }
}
