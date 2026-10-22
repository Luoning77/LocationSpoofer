package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ie1 implements j92 {
    public ge1 a;

    @Override // defpackage.j92
    public final void d() {
        ny2 ny2Var;
        ge1 ge1Var = this.a;
        if (ge1Var == null || (ny2Var = (ny2) xq1.C(ge1Var, z30.r)) == null) {
            return;
        }
        ((nb0) ny2Var).b();
    }

    @Override // defpackage.j92
    public final void e() {
        ny2 ny2Var;
        ge1 ge1Var = this.a;
        if (ge1Var == null || (ny2Var = (ny2) xq1.C(ge1Var, z30.r)) == null) {
            return;
        }
        ((nb0) ny2Var).a();
    }

    public final void i(ge1 ge1Var) {
        if (this.a != ge1Var) {
            s21.c("Expected textInputModifierNode to be " + ge1Var + " but was " + this.a);
        }
        this.a = null;
    }
}
