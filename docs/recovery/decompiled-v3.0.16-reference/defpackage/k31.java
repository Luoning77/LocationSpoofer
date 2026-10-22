package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class k31 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ l31 f;

    public /* synthetic */ k31(l31 l31Var, int i) {
        this.e = i;
        this.f = l31Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        l31 l31Var = this.f;
        tc3 tc3Var = (tc3) obj;
        switch (i) {
            case 0:
                tc3Var.getClass();
                l31 l31Var2 = (l31) tc3Var;
                sk3 sk3Var = l31Var.t;
                if (!o51.f(l31Var2.s, sk3Var)) {
                    l31Var2.s = sk3Var;
                    l31Var2.n1();
                }
                return sc3.f;
            default:
                tc3Var.getClass();
                l31Var.s = ((l31) tc3Var).t;
                return Boolean.FALSE;
        }
    }
}
