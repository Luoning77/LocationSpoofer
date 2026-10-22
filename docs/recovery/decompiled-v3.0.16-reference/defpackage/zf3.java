package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zf3 extends cv1 implements ya1 {
    public float s;
    public float t;

    @Override // defpackage.ya1
    public final int F(ck1 ck1Var, zq1 zq1Var, int i) {
        int iW = zq1Var.w(i);
        int iN0 = !Float.isNaN(this.t) ? ck1Var.n0(this.t) : 0;
        return iW < iN0 ? iN0 : iW;
    }

    @Override // defpackage.ya1
    public final int W(ck1 ck1Var, zq1 zq1Var, int i) {
        int iU0 = zq1Var.u0(i);
        int iN0 = !Float.isNaN(this.t) ? ck1Var.n0(this.t) : 0;
        return iU0 < iN0 ? iN0 : iU0;
    }

    @Override // defpackage.ya1
    public final int p0(ck1 ck1Var, zq1 zq1Var, int i) {
        int iJ0 = zq1Var.j0(i);
        int iN0 = !Float.isNaN(this.s) ? ck1Var.n0(this.s) : 0;
        return iJ0 < iN0 ? iN0 : iJ0;
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.s) || l50.j(j) != 0) {
            iJ = l50.j(j);
        } else {
            int iN0 = gr1Var.n0(this.s);
            iJ = l50.h(j);
            if (iN0 < 0) {
                iN0 = 0;
            }
            if (iN0 <= iJ) {
                iJ = iN0;
            }
        }
        int iH = l50.h(j);
        if (Float.isNaN(this.t) || l50.i(j) != 0) {
            i = l50.i(j);
        } else {
            int iN1 = gr1Var.n0(this.t);
            i = l50.g(j);
            int i2 = iN1 >= 0 ? iN1 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        h82 h82VarS = zq1Var.s(m50.a(iJ, iH, i, l50.g(j)));
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new gn0(h82VarS, 10));
    }

    @Override // defpackage.ya1
    public final int x(ck1 ck1Var, zq1 zq1Var, int i) {
        int iS0 = zq1Var.s0(i);
        int iN0 = !Float.isNaN(this.s) ? ck1Var.n0(this.s) : 0;
        return iS0 < iN0 ? iN0 : iS0;
    }
}
