package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ln2 extends hj3 {
    public kn2 b;

    @Override // defpackage.hj3
    public final void d() {
        kn2 kn2Var = this.b;
        if (kn2Var != null && !kn2Var.i) {
            t20 t20Var = (t20) kn2Var.d.c;
            String str = "Closing scope " + this.b;
            t20Var.getClass();
            t20Var.j(re1.e, str);
            ye yeVar = new ye(kn2Var, 21);
            synchronized (kn2Var) {
                yeVar.invoke();
            }
        }
        this.b = null;
    }
}
