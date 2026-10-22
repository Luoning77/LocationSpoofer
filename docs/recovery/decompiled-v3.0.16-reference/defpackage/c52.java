package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c52 extends cv1 implements ya1 {
    public z42 s;

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        float fA = this.s.a(gr1Var.getLayoutDirection());
        float fD = this.s.d();
        float fB = this.s.b(gr1Var.getLayoutDirection());
        float fC = this.s.c();
        if (!((td0.a(fA, 0.0f) >= 0) & (td0.a(fD, 0.0f) >= 0) & (td0.a(fB, 0.0f) >= 0) & (td0.a(fC, 0.0f) >= 0))) {
            n21.a("Padding must be non-negative");
        }
        int iN0 = gr1Var.n0(fA);
        int iN1 = gr1Var.n0(fB) + iN0;
        int iN2 = gr1Var.n0(fD);
        int iN3 = gr1Var.n0(fC) + iN2;
        h82 h82VarS = zq1Var.s(m50.i(-iN1, -iN3, j));
        return gr1Var.H0(m50.g(h82VarS.e + iN1, j), m50.f(h82VarS.f + iN3, j), vj0.e, new p31(iN0, iN2, 2, h82VarS));
    }
}
