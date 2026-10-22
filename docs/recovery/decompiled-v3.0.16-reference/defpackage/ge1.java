package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ge1 extends cv1 implements u30, aw0 {
    public ie1 s;
    public me1 t;
    public x73 u;
    public final w52 v = ke0.H(null);

    public ge1(ie1 ie1Var, me1 me1Var, x73 x73Var) {
        this.s = ie1Var;
        this.t = me1Var;
        this.u = x73Var;
    }

    @Override // defpackage.aw0
    public final void L(xz1 xz1Var) {
        this.v.setValue(xz1Var);
    }

    @Override // defpackage.cv1
    public final void e1() {
        ie1 ie1Var = this.s;
        if (ie1Var.a != null) {
            s21.c("Expected textInputModifierNode to be null");
        }
        ie1Var.a = this;
    }

    @Override // defpackage.cv1
    public final void f1() {
        this.s.i(this);
    }
}
