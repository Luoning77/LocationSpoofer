package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jw2 extends cv1 implements ya1 {
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;

    @Override // defpackage.ya1
    public final int F(ck1 ck1Var, zq1 zq1Var, int i) {
        long jM1 = m1(ck1Var);
        if (l50.e(jM1)) {
            return l50.g(jM1);
        }
        if (!this.w) {
            i = m50.g(i, jM1);
        }
        return m50.f(zq1Var.w(i), jM1);
    }

    @Override // defpackage.ya1
    public final int W(ck1 ck1Var, zq1 zq1Var, int i) {
        long jM1 = m1(ck1Var);
        if (l50.e(jM1)) {
            return l50.g(jM1);
        }
        if (!this.w) {
            i = m50.g(i, jM1);
        }
        return m50.f(zq1Var.u0(i), jM1);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long m1(gr1 gr1Var) {
        int iN0;
        int iN1;
        int iN2;
        int i = 0;
        if (Float.isNaN(this.u)) {
            iN0 = Integer.MAX_VALUE;
        } else {
            iN0 = gr1Var.n0(this.u);
            if (iN0 < 0) {
                iN0 = 0;
            }
        }
        if (Float.isNaN(this.v)) {
            iN1 = Integer.MAX_VALUE;
        } else {
            iN1 = gr1Var.n0(this.v);
            if (iN1 < 0) {
                iN1 = 0;
            }
        }
        if (Float.isNaN(this.s)) {
            iN2 = 0;
        } else {
            iN2 = gr1Var.n0(this.s);
            if (iN2 < 0) {
                iN2 = 0;
            }
            if (iN2 > iN0) {
                iN2 = iN0;
            }
            if (iN2 == Integer.MAX_VALUE) {
                iN2 = 0;
            }
        }
        if (!Float.isNaN(this.t)) {
            int iN3 = gr1Var.n0(this.t);
            if (iN3 < 0) {
                iN3 = 0;
            }
            if (iN3 > iN1) {
                iN3 = iN1;
            }
            if (iN3 != Integer.MAX_VALUE) {
                i = iN3;
            }
        }
        return m50.a(iN2, iN0, i, iN1);
    }

    @Override // defpackage.ya1
    public final int p0(ck1 ck1Var, zq1 zq1Var, int i) {
        long jM1 = m1(ck1Var);
        if (l50.f(jM1)) {
            return l50.h(jM1);
        }
        if (!this.w) {
            i = m50.f(i, jM1);
        }
        return m50.g(zq1Var.j0(i), jM1);
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jM1 = m1(gr1Var);
        if (this.w) {
            jA = m50.e(j, jM1);
        } else {
            if (Float.isNaN(this.s)) {
                iJ = l50.j(j);
                int iH2 = l50.h(jM1);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = l50.j(jM1);
            }
            if (Float.isNaN(this.u)) {
                iH = l50.h(j);
                int iJ2 = l50.j(jM1);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = l50.h(jM1);
            }
            if (Float.isNaN(this.t)) {
                i = l50.i(j);
                int iG2 = l50.g(jM1);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = l50.i(jM1);
            }
            if (Float.isNaN(this.v)) {
                iG = l50.g(j);
                int i2 = l50.i(jM1);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = l50.g(jM1);
            }
            jA = m50.a(iJ, iH, i, iG);
        }
        h82 h82VarS = zq1Var.s(jA);
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new gn0(h82VarS, 4));
    }

    @Override // defpackage.ya1
    public final int x(ck1 ck1Var, zq1 zq1Var, int i) {
        long jM1 = m1(ck1Var);
        if (l50.f(jM1)) {
            return l50.h(jM1);
        }
        if (!this.w) {
            i = m50.f(i, jM1);
        }
        return m50.g(zq1Var.s0(i), jM1);
    }
}
