package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gf3 extends ac2 {
    public static final gf3 c = new gf3(hf3.a);

    @Override // defpackage.v
    public final int d(Object obj) {
        return ((ef3) obj).e.length;
    }

    @Override // defpackage.uy, defpackage.v
    public final void f(l30 l30Var, int i, Object obj) {
        ff3 ff3Var = (ff3) obj;
        ff3Var.getClass();
        short sW = l30Var.e(this.b, i).w();
        ff3Var.b(ff3Var.d() + 1);
        short[] sArr = ff3Var.a;
        int i2 = ff3Var.b;
        ff3Var.b = i2 + 1;
        sArr[i2] = sW;
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        short[] sArr = ((ef3) obj).e;
        ff3 ff3Var = new ff3();
        ff3Var.a = sArr;
        ff3Var.b = sArr.length;
        ff3Var.b(10);
        return ff3Var;
    }

    @Override // defpackage.ac2
    public final Object j() {
        return new ef3(new short[0]);
    }

    @Override // defpackage.ac2
    public final void k(m30 m30Var, Object obj, int i) {
        short[] sArr = ((ef3) obj).e;
        m30Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            m30Var.y(this.b, i2).h(sArr[i2]);
        }
    }
}
