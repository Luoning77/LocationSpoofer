package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nv2 extends ac2 {
    public static final nv2 c = new nv2(ov2.a);

    @Override // defpackage.v
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.uy, defpackage.v
    public final void f(l30 l30Var, int i, Object obj) {
        mv2 mv2Var = (mv2) obj;
        mv2Var.getClass();
        short sP = l30Var.p(this.b, i);
        mv2Var.b(mv2Var.d() + 1);
        short[] sArr = mv2Var.a;
        int i2 = mv2Var.b;
        mv2Var.b = i2 + 1;
        sArr[i2] = sP;
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        mv2 mv2Var = new mv2();
        mv2Var.a = sArr;
        mv2Var.b = sArr.length;
        mv2Var.b(10);
        return mv2Var;
    }

    @Override // defpackage.ac2
    public final Object j() {
        return new short[0];
    }

    @Override // defpackage.ac2
    public final void k(m30 m30Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        m30Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            m30Var.f(this.b, i2, sArr[i2]);
        }
    }
}
