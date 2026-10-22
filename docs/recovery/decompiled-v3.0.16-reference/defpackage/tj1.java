package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class tj1 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ s63 f;

    public /* synthetic */ tj1(s63 s63Var, int i) {
        this.e = i;
        this.f = s63Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        s63 s63Var = this.f;
        switch (i) {
            case 0:
                s63Var.a(((c12) obj).a, u92.l);
                break;
            case 1:
                x92 x92Var = (x92) obj;
                s63Var.e(mh0.T(x92Var, false));
                x92Var.a();
                break;
            default:
                x92 x92Var2 = (x92) obj;
                s63Var.e(mh0.T(x92Var2, false));
                x92Var2.a();
                break;
        }
        return mf3Var;
    }
}
