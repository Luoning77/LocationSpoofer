package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class q31 extends l31 implements ya1 {
    public sk3 u;

    public q31(sk3 sk3Var) {
        this.u = sk3Var;
    }

    @Override // defpackage.l31
    public final sk3 m1(sk3 sk3Var) {
        return new lf3(sk3Var, this.u);
    }

    @Override // defpackage.l31
    public final void n1() {
        super.n1();
        ld0.z(this);
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        int iD = this.t.d(gr1Var, gr1Var.getLayoutDirection()) - this.s.d(gr1Var, gr1Var.getLayoutDirection());
        int iB = this.t.b(gr1Var) - this.s.b(gr1Var);
        int iC = (this.t.c(gr1Var, gr1Var.getLayoutDirection()) - this.s.c(gr1Var, gr1Var.getLayoutDirection())) + iD;
        int iA = (this.t.a(gr1Var) - this.s.a(gr1Var)) + iB;
        h82 h82VarS = zq1Var.s(m50.i(-iC, -iA, j));
        return gr1Var.H0(m50.g(h82VarS.e + iC, j), m50.f(h82VarS.f + iA, j), vj0.e, new p31(iD, iB, 0, h82VarS));
    }
}
