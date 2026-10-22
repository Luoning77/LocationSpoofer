package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pn1 implements cb2 {
    public final t1 e;
    public p41 f;
    public qa1 g;
    public p41 h;
    public h41 i;

    public pn1(t1 t1Var) {
        this.e = t1Var;
    }

    @Override // defpackage.cb2
    public final long c(l41 l41Var, long j, qa1 qa1Var, long j2) {
        h41 h41Var = this.i;
        if (h41Var != null) {
            p41 p41Var = this.f;
            if ((p41Var == null ? false : p41.b(p41Var.a, j)) && this.g == qa1Var) {
                p41 p41Var2 = this.h;
                if (p41Var2 != null ? p41.b(p41Var2.a, j2) : false) {
                    return h41Var.a;
                }
            }
        }
        long jC = this.e.c(l41Var, j, qa1Var, j2);
        this.f = new p41(j);
        this.g = qa1Var;
        this.h = new p41(j2);
        this.i = new h41(jC);
        return jC;
    }
}
