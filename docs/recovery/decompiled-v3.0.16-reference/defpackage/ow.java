package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ow extends ac2 {
    public static final ow c = new ow(rw.a);

    @Override // defpackage.v
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.uy, defpackage.v
    public final void f(l30 l30Var, int i, Object obj) {
        mw mwVar = (mw) obj;
        mwVar.getClass();
        char cK = l30Var.k(this.b, i);
        mwVar.b(mwVar.d() + 1);
        char[] cArr = mwVar.a;
        int i2 = mwVar.b;
        mwVar.b = i2 + 1;
        cArr[i2] = cK;
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        mw mwVar = new mw();
        mwVar.a = cArr;
        mwVar.b = cArr.length;
        mwVar.b(10);
        return mwVar;
    }

    @Override // defpackage.ac2
    public final Object j() {
        return new char[0];
    }

    @Override // defpackage.ac2
    public final void k(m30 m30Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        m30Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            m30Var.p(this.b, i2, cArr[i2]);
        }
    }
}
