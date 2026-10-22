package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class re3 extends ac2 {
    public static final re3 c = new re3(se3.a);

    @Override // defpackage.v
    public final int d(Object obj) {
        return ((pe3) obj).e.length;
    }

    @Override // defpackage.uy, defpackage.v
    public final void f(l30 l30Var, int i, Object obj) {
        qe3 qe3Var = (qe3) obj;
        qe3Var.getClass();
        byte bR = l30Var.e(this.b, i).r();
        qe3Var.b(qe3Var.d() + 1);
        byte[] bArr = qe3Var.a;
        int i2 = qe3Var.b;
        qe3Var.b = i2 + 1;
        bArr[i2] = bR;
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        byte[] bArr = ((pe3) obj).e;
        qe3 qe3Var = new qe3();
        qe3Var.a = bArr;
        qe3Var.b = bArr.length;
        qe3Var.b(10);
        return qe3Var;
    }

    @Override // defpackage.ac2
    public final Object j() {
        return new pe3(new byte[0]);
    }

    @Override // defpackage.ac2
    public final void k(m30 m30Var, Object obj, int i) {
        byte[] bArr = ((pe3) obj).e;
        m30Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            m30Var.y(this.b, i2).k(bArr[i2]);
        }
    }
}
