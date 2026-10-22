package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class j51 extends cv1 implements ya1 {
    public final /* synthetic */ int s;

    public int F(ck1 ck1Var, zq1 zq1Var, int i) {
        switch (this.s) {
            case 0:
                break;
        }
        return zq1Var.w(i);
    }

    public int W(ck1 ck1Var, zq1 zq1Var, int i) {
        switch (this.s) {
            case 0:
                break;
        }
        return zq1Var.u0(i);
    }

    public abstract long m1(zq1 zq1Var, long j);

    public abstract boolean n1();

    @Override // defpackage.ya1
    public int p0(ck1 ck1Var, zq1 zq1Var, int i) {
        switch (this.s) {
            case 0:
                break;
        }
        return zq1Var.j0(i);
    }

    public fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        long jM1 = m1(zq1Var, j);
        if (n1()) {
            jM1 = m50.e(j, jM1);
        }
        h82 h82VarS = zq1Var.s(jM1);
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new gn0(h82VarS, 2));
    }

    @Override // defpackage.ya1
    public int x(ck1 ck1Var, zq1 zq1Var, int i) {
        switch (this.s) {
            case 0:
                break;
        }
        return zq1Var.s0(i);
    }
}
