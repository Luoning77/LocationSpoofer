package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yn2 extends cv1 implements ya1, hs2 {
    public co2 s;
    public boolean t;

    @Override // defpackage.ya1
    public final int F(ck1 ck1Var, zq1 zq1Var, int i) {
        if (!this.t) {
            i = Integer.MAX_VALUE;
        }
        return zq1Var.w(i);
    }

    @Override // defpackage.hs2
    public final void J0(ss2 ss2Var) {
        qs2.f(ss2Var);
        final int i = 0;
        final int i2 = 1;
        on2 on2Var = new on2(new au0(this) { // from class: xn2
            public final /* synthetic */ yn2 f;

            {
                this.f = this;
            }

            @Override // defpackage.au0
            public final Object invoke() {
                int iG;
                int i3 = i;
                yn2 yn2Var = this.f;
                switch (i3) {
                    case 0:
                        iG = yn2Var.s.a.g();
                        break;
                    default:
                        iG = yn2Var.s.e.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        }, new au0(this) { // from class: xn2
            public final /* synthetic */ yn2 f;

            {
                this.f = this;
            }

            @Override // defpackage.au0
            public final Object invoke() {
                int iG;
                int i3 = i2;
                yn2 yn2Var = this.f;
                switch (i3) {
                    case 0:
                        iG = yn2Var.s.a.g();
                        break;
                    default:
                        iG = yn2Var.s.e.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        });
        if (this.t) {
            rs2 rs2Var = os2.w;
            x81 x81Var = qs2.a[13];
            ss2Var.a(rs2Var, on2Var);
        } else {
            rs2 rs2Var2 = os2.v;
            x81 x81Var2 = qs2.a[12];
            ss2Var.a(rs2Var2, on2Var);
        }
    }

    @Override // defpackage.ya1
    public final int W(ck1 ck1Var, zq1 zq1Var, int i) {
        if (!this.t) {
            i = Integer.MAX_VALUE;
        }
        return zq1Var.u0(i);
    }

    @Override // defpackage.ya1
    public final int p0(ck1 ck1Var, zq1 zq1Var, int i) {
        if (this.t) {
            i = Integer.MAX_VALUE;
        }
        return zq1Var.j0(i);
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        ji2.y(j, this.t ? x32.e : x32.f);
        h82 h82VarS = zq1Var.s(l50.a(j, 0, this.t ? l50.h(j) : Integer.MAX_VALUE, 0, this.t ? Integer.MAX_VALUE : l50.g(j), 5));
        int i = h82VarS.e;
        int iH = l50.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = h82VarS.f;
        int iG = l50.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = h82VarS.f - i2;
        int i4 = h82VarS.e - i;
        if (!this.t) {
            i3 = i4;
        }
        co2 co2Var = this.s;
        t52 t52Var = co2Var.e;
        t52 t52Var2 = co2Var.a;
        t52Var.h(i3);
        nx2 nx2VarK = wc0.K();
        lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
        nx2 nx2VarS = wc0.S(nx2VarK);
        try {
            if (t52Var2.g() > i3) {
                t52Var2.h(i3);
            }
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            this.s.b.h(this.t ? i2 : i);
            this.s.c.h(this.t ? h82VarS.f : h82VarS.e);
            return gr1Var.H0(i, i2, vj0.e, new de2(i3, 1, this, h82VarS));
        } catch (Throwable th) {
            wc0.g0(nx2VarK, nx2VarS, lu0VarE);
            throw th;
        }
    }

    @Override // defpackage.ya1
    public final int x(ck1 ck1Var, zq1 zq1Var, int i) {
        if (this.t) {
            i = Integer.MAX_VALUE;
        }
        return zq1Var.s0(i);
    }
}
