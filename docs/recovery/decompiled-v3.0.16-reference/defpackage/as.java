package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class as extends ac2 {
    public static final as c = new as(bs.a);

    @Override // defpackage.v
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.uy, defpackage.v
    public final void f(l30 l30Var, int i, Object obj) {
        zr zrVar = (zr) obj;
        zrVar.getClass();
        boolean zQ = l30Var.q(this.b, i);
        zrVar.b(zrVar.d() + 1);
        boolean[] zArr = zrVar.a;
        int i2 = zrVar.b;
        zrVar.b = i2 + 1;
        zArr[i2] = zQ;
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        zr zrVar = new zr();
        zrVar.a = zArr;
        zrVar.b = zArr.length;
        zrVar.b(10);
        return zrVar;
    }

    @Override // defpackage.ac2
    public final Object j() {
        return new boolean[0];
    }

    @Override // defpackage.ac2
    public final void k(m30 m30Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        m30Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            m30Var.o(this.b, i2, zArr[i2]);
        }
    }
}
