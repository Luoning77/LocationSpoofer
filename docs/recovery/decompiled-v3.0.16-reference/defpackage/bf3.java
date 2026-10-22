package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bf3 extends ac2 {
    public static final bf3 c = new bf3(cf3.a);

    @Override // defpackage.v
    public final int d(Object obj) {
        return ((ze3) obj).e.length;
    }

    @Override // defpackage.uy, defpackage.v
    public final void f(l30 l30Var, int i, Object obj) {
        af3 af3Var = (af3) obj;
        af3Var.getClass();
        long jD = l30Var.e(this.b, i).d();
        af3Var.b(af3Var.d() + 1);
        long[] jArr = af3Var.a;
        int i2 = af3Var.b;
        af3Var.b = i2 + 1;
        jArr[i2] = jD;
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        long[] jArr = ((ze3) obj).e;
        af3 af3Var = new af3();
        af3Var.a = jArr;
        af3Var.b = jArr.length;
        af3Var.b(10);
        return af3Var;
    }

    @Override // defpackage.ac2
    public final Object j() {
        return new ze3(new long[0]);
    }

    @Override // defpackage.ac2
    public final void k(m30 m30Var, Object obj, int i) {
        long[] jArr = ((ze3) obj).e;
        m30Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            m30Var.y(this.b, i2).v(jArr[i2]);
        }
    }
}
