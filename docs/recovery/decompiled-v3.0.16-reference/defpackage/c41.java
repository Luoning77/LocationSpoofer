package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c41 extends ac2 {
    public static final c41 c = new c41(n41.a);

    @Override // defpackage.v
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.uy, defpackage.v
    public final void f(l30 l30Var, int i, Object obj) {
        b41 b41Var = (b41) obj;
        b41Var.getClass();
        int iV = l30Var.v(this.b, i);
        b41Var.b(b41Var.d() + 1);
        int[] iArr = b41Var.a;
        int i2 = b41Var.b;
        b41Var.b = i2 + 1;
        iArr[i2] = iV;
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        b41 b41Var = new b41();
        b41Var.a = iArr;
        b41Var.b = iArr.length;
        b41Var.b(10);
        return b41Var;
    }

    @Override // defpackage.ac2
    public final Object j() {
        return new int[0];
    }

    @Override // defpackage.ac2
    public final void k(m30 m30Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        m30Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            m30Var.i(i2, iArr[i2], this.b);
        }
    }
}
