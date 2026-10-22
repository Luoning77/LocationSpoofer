package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lj1 extends ac2 {
    public static final lj1 c = new lj1(xj1.a);

    @Override // defpackage.v
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.uy, defpackage.v
    public final void f(l30 l30Var, int i, Object obj) {
        kj1 kj1Var = (kj1) obj;
        kj1Var.getClass();
        long jZ = l30Var.z(this.b, i);
        kj1Var.b(kj1Var.d() + 1);
        long[] jArr = kj1Var.a;
        int i2 = kj1Var.b;
        kj1Var.b = i2 + 1;
        jArr[i2] = jZ;
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        kj1 kj1Var = new kj1();
        kj1Var.a = jArr;
        kj1Var.b = jArr.length;
        kj1Var.b(10);
        return kj1Var;
    }

    @Override // defpackage.ac2
    public final Object j() {
        return new long[0];
    }

    @Override // defpackage.ac2
    public final void k(m30 m30Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        m30Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            m30Var.j(this.b, i2, jArr[i2]);
        }
    }
}
