package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y42 extends cv1 implements ya1 {
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        int iN0 = gr1Var.n0(this.u) + gr1Var.n0(this.s);
        int iN1 = gr1Var.n0(this.v) + gr1Var.n0(this.t);
        h82 h82VarS = zq1Var.s(m50.i(-iN0, -iN1, j));
        return gr1Var.H0(m50.g(h82VarS.e + iN0, j), m50.f(h82VarS.f + iN1, j), vj0.e, new jl1(9, this, h82VarS));
    }
}
