package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class od0 extends ac2 {
    public static final od0 c = new od0(qd0.a);

    @Override // defpackage.v
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.uy, defpackage.v
    public final void f(l30 l30Var, int i, Object obj) {
        nd0 nd0Var = (nd0) obj;
        nd0Var.getClass();
        double dS = l30Var.s(this.b, i);
        nd0Var.b(nd0Var.d() + 1);
        double[] dArr = nd0Var.a;
        int i2 = nd0Var.b;
        nd0Var.b = i2 + 1;
        dArr[i2] = dS;
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        nd0 nd0Var = new nd0();
        nd0Var.a = dArr;
        nd0Var.b = dArr.length;
        nd0Var.b(10);
        return nd0Var;
    }

    @Override // defpackage.ac2
    public final Object j() {
        return new double[0];
    }

    @Override // defpackage.ac2
    public final void k(m30 m30Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        m30Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            m30Var.t(this.b, i2, dArr[i2]);
        }
    }
}
