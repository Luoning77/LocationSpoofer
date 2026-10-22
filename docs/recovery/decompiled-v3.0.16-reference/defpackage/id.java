package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class id implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ t52 f;

    public /* synthetic */ id(t52 t52Var, int i) {
        this.e = i;
        this.f = t52Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int iG;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        t52 t52Var = this.f;
        switch (i) {
            case 0:
                hh0 hh0Var = nd.a;
                iG = t52Var.g();
                break;
            case 1:
                t52Var.h(js.Location.ordinal());
                return mf3Var;
            case 2:
                iG = t52Var.g();
                break;
            case 3:
                t52Var.h(js.Route.ordinal());
                return mf3Var;
            case 4:
                t52Var.h(t52Var.g() + 1);
                return mf3Var;
            default:
                t52Var.h(t52Var.g() + 1);
                return mf3Var;
        }
        return Integer.valueOf(iG);
    }
}
