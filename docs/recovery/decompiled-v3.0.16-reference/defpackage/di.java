package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class di extends j51 {
    public hc3 t;
    public ey1 u;
    public ei v;
    public long w;

    @Override // defpackage.cv1
    public final void g1() {
        this.w = -9223372034707292160L;
    }

    @Override // defpackage.j51, defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        long j2;
        h82 h82VarS = zq1Var.s(j);
        if (gr1Var.J()) {
            j2 = (((long) h82VarS.e) << 32) | (((long) h82VarS.f) & 4294967295L);
        } else {
            hc3 hc3Var = this.t;
            int i = h82VarS.e;
            if (hc3Var == null) {
                j2 = (((long) i) << 32) | (((long) h82VarS.f) & 4294967295L);
                this.w = j2;
            } else {
                long j3 = (((long) h82VarS.f) & 4294967295L) | (((long) i) << 32);
                gc3 gc3VarA = hc3Var.a(new ci(this, j3, 0), new ci(this, j3, 1));
                this.v.getClass();
                j2 = ((p41) gc3VarA.getValue()).a;
                this.w = ((p41) gc3VarA.getValue()).a;
            }
        }
        return gr1Var.H0((int) (j2 >> 32), (int) (4294967295L & j2), vj0.e, new bi(this, h82VarS, j2));
    }
}
