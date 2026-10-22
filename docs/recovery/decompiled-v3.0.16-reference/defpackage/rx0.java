package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class rx0 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ sx0 f;

    public /* synthetic */ rx0(sx0 sx0Var, int i) {
        this.e = i;
        this.f = sx0Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        sx0 sx0Var = this.f;
        switch (i) {
            case 0:
                if (sx0Var.z != null) {
                    return mf3Var;
                }
                throw p91.h("Font resolution state is not set.");
            default:
                if (sx0Var.z != null) {
                    return mf3Var;
                }
                throw p91.h("Font resolution state is not set.");
        }
    }
}
