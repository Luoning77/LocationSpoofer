package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class la1 extends cv1 implements hg0, aw0 {
    public ja1 s;

    @Override // defpackage.aw0
    public final void L(xz1 xz1Var) {
        if (xz1Var.t1().r) {
            this.s.c.setValue(xz1Var);
        }
    }

    @Override // defpackage.cv1
    public final void f1() {
        this.s.c.setValue(null);
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        jb1Var.c();
        jb1Var.b0(this.s.a, mc0.I(jb1Var.e.a()), new bg0(xp1.O(this).D, this, jb1Var, 3));
    }
}
