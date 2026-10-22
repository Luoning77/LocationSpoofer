package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class fh2 implements pd0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ jh2 f;

    public /* synthetic */ fh2(jh2 jh2Var, int i) {
        this.e = i;
        this.f = jh2Var;
    }

    @Override // defpackage.pd0
    public final double c(double d) {
        int i = this.e;
        jh2 jh2Var = this.f;
        switch (i) {
            case 0:
                return mh0.t(jh2Var.k.c(d), jh2Var.e, jh2Var.f);
            default:
                return jh2Var.n.c(mh0.t(d, jh2Var.e, jh2Var.f));
        }
    }
}
