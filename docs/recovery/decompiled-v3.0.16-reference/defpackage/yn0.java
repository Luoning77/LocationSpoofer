package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yn0 extends ac2 {
    public static final yn0 c = new yn0(ao0.a);

    @Override // defpackage.v
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.uy, defpackage.v
    public final void f(l30 l30Var, int i, Object obj) {
        xn0 xn0Var = (xn0) obj;
        xn0Var.getClass();
        float fL = l30Var.l(this.b, i);
        xn0Var.b(xn0Var.d() + 1);
        float[] fArr = xn0Var.a;
        int i2 = xn0Var.b;
        xn0Var.b = i2 + 1;
        fArr[i2] = fL;
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        xn0 xn0Var = new xn0();
        xn0Var.a = fArr;
        xn0Var.b = fArr.length;
        xn0Var.b(10);
        return xn0Var;
    }

    @Override // defpackage.ac2
    public final Object j() {
        return new float[0];
    }

    @Override // defpackage.ac2
    public final void k(m30 m30Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        m30Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            m30Var.z(this.b, i2, fArr[i2]);
        }
    }
}
