package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class we3 extends ac2 {
    public static final we3 c = new we3(xe3.a);

    @Override // defpackage.v
    public final int d(Object obj) {
        return ((ue3) obj).e.length;
    }

    @Override // defpackage.uy, defpackage.v
    public final void f(l30 l30Var, int i, Object obj) {
        ve3 ve3Var = (ve3) obj;
        ve3Var.getClass();
        int iO = l30Var.e(this.b, i).o();
        ve3Var.b(ve3Var.d() + 1);
        int[] iArr = ve3Var.a;
        int i2 = ve3Var.b;
        ve3Var.b = i2 + 1;
        iArr[i2] = iO;
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        int[] iArr = ((ue3) obj).e;
        ve3 ve3Var = new ve3();
        ve3Var.a = iArr;
        ve3Var.b = iArr.length;
        ve3Var.b(10);
        return ve3Var;
    }

    @Override // defpackage.ac2
    public final Object j() {
        return new ue3(new int[0]);
    }

    @Override // defpackage.ac2
    public final void k(m30 m30Var, Object obj, int i) {
        int[] iArr = ((ue3) obj).e;
        m30Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            m30Var.y(this.b, i2).q(iArr[i2]);
        }
    }
}
