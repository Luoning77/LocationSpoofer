package defpackage;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gw2 extends j51 {
    public si t;
    public long u;
    public long v;
    public boolean w;
    public final w52 x;

    public gw2(si siVar) {
        super(1);
        this.t = siVar;
        this.u = -9223372034707292160L;
        this.v = m50.b(0, 0, 0, 0, 15);
        this.x = ke0.H(null);
    }

    @Override // defpackage.cv1
    public final void e1() {
        this.u = -9223372034707292160L;
        this.w = false;
    }

    @Override // defpackage.cv1
    public final void g1() {
        this.x.setValue(null);
    }

    @Override // defpackage.j51, defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        h82 h82VarS;
        ew2 ew2Var;
        long jD;
        ew2 ew2Var2;
        if (gr1Var.J()) {
            this.v = j;
            this.w = true;
            h82VarS = zq1Var.s(j);
        } else {
            h82VarS = zq1Var.s(this.w ? this.v : j);
        }
        h82 h82Var = h82VarS;
        char c = ' ';
        long j2 = (((long) h82Var.f) & 4294967295L) | (((long) h82Var.e) << 32);
        if (gr1Var.J()) {
            this.u = j2;
            c = ' ';
            jD = j2;
            j2 = jD;
        } else {
            long j3 = !p41.b(this.u, -9223372034707292160L) ? this.u : j2;
            w52 w52Var = this.x;
            ew2 ew2Var3 = (ew2) w52Var.getValue();
            if (ew2Var3 != null) {
                oh ohVar = ew2Var3.a;
                boolean z = (p41.b(j3, ((p41) ohVar.d()).a) || ((Boolean) ohVar.d.getValue()).booleanValue()) ? false : true;
                if (!p41.b(j3, ((p41) ohVar.e.getValue()).a) || z) {
                    ew2Var3.b = ((p41) ohVar.d()).a;
                    ew2Var2 = ew2Var3;
                    BuildersKt__Builders_commonKt.launch$default(a1(), null, null, new tf0(ew2Var2, j3, this, null, 4), 3, null);
                } else {
                    ew2Var2 = ew2Var3;
                }
                ew2Var = ew2Var2;
            } else {
                long j4 = j3;
                ew2Var = new ew2(new oh(new p41(j4), o51.C0, new p41(4294967297L), 8), j4);
            }
            w52Var.setValue(ew2Var);
            jD = m50.d(j, ((p41) ew2Var.a.d()).a);
        }
        int i = (int) (jD >> c);
        int i2 = (int) (jD & 4294967295L);
        return gr1Var.H0(i, i2, vj0.e, new fw2(this, j2, i, i2, gr1Var, h82Var));
    }
}
