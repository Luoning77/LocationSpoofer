package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class n5 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ au0 g;

    public /* synthetic */ n5(boolean z, au0 au0Var, int i) {
        this.e = i;
        this.f = z;
        this.g = au0Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        au0 au0Var = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                if (!z) {
                    au0Var.invoke();
                }
                break;
            case 1:
                if (!z) {
                    au0Var.invoke();
                }
                break;
            default:
                if (z) {
                    au0Var.invoke();
                }
                break;
        }
        return mf3Var;
    }
}
