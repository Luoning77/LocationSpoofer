package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class su extends ac2 {
    public static final su c = new su(tu.a);

    @Override // defpackage.v
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.uy, defpackage.v
    public final void f(l30 l30Var, int i, Object obj) {
        ru ruVar = (ru) obj;
        ruVar.getClass();
        byte bM = l30Var.m(this.b, i);
        ruVar.b(ruVar.d() + 1);
        byte[] bArr = ruVar.a;
        int i2 = ruVar.b;
        ruVar.b = i2 + 1;
        bArr[i2] = bM;
    }

    @Override // defpackage.v
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        ru ruVar = new ru();
        ruVar.a = bArr;
        ruVar.b = bArr.length;
        ruVar.b(10);
        return ruVar;
    }

    @Override // defpackage.ac2
    public final Object j() {
        return new byte[0];
    }

    @Override // defpackage.ac2
    public final void k(m30 m30Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        m30Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            m30Var.w(this.b, i2, bArr[i2]);
        }
    }
}
