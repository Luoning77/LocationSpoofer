package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bb1 extends xz1 {
    public static final je b0;
    public ya1 X;
    public l50 Y;
    public za1 Z;
    public ao a0;

    static {
        je jeVarN = xq1.n();
        int i = hz.h;
        jeVarN.g(hz.e);
        jeVarN.n(1.0f);
        jeVarN.o(1);
        b0 = jeVarN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bb1(hb1 hb1Var, ya1 ya1Var) {
        super(hb1Var);
        this.X = ya1Var;
        this.Z = hb1Var.m != null ? new za1(this) : null;
        this.a0 = (((cv1) ya1Var).e.g & 512) != 0 ? new ao(this, (ju2) ya1Var) : null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    @Override // defpackage.h82
    public final void I0(long j, float f, lu0 lu0Var) {
        boolean z;
        if (this.t) {
            ek1 ek1VarR1 = r1();
            ek1VarR1.getClass();
            J1(ek1VarR1.t, f, lu0Var);
        } else {
            J1(j, f, lu0Var);
        }
        if (this.n) {
            return;
        }
        E1();
        xz1 xz1Var = this.v;
        xz1Var.getClass();
        ao aoVar = this.a0;
        if (aoVar != null) {
            this.Z.getClass();
            if (aoVar.g) {
                z = false;
            } else {
                long j2 = this.g;
                za1 za1Var = this.Z;
                if (p41.a(j2, za1Var != null ? new p41(za1Var.i1()) : null)) {
                    long j3 = xz1Var.g;
                    ek1 ek1VarR2 = xz1Var.r1();
                    if (p41.a(j3, ek1VarR2 != null ? new p41(ek1VarR2.i1()) : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            xz1Var.t = z;
        }
        xz1Var.o = this.o;
        b1().a();
        xz1Var.o = false;
        xz1Var.t = false;
    }

    @Override // defpackage.xz1
    public final void I1(vv vvVar, kw0 kw0Var) {
        xz1 xz1Var;
        xz1 xz1Var2 = this.v;
        xz1Var2.getClass();
        xz1Var2.m1(vvVar, kw0Var);
        if (!((db) kb1.a(this.s)).getShowLayoutBounds() || (xz1Var = this.v) == null) {
            return;
        }
        if (p41.b(this.g, xz1Var.g) && h41.a(xz1Var.F, 0L)) {
            return;
        }
        long j = this.g;
        vvVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, b0);
    }

    @Override // defpackage.ck1
    public final int M0(m9 m9Var) {
        za1 za1Var = this.Z;
        if (za1Var == null) {
            return hd0.m(this, m9Var);
        }
        ox1 ox1Var = za1Var.x;
        int iD = ox1Var.d(m9Var);
        if (iD >= 0) {
            return ox1Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V1(ya1 ya1Var) {
        if (!ya1Var.equals(this.X)) {
            if ((((cv1) ya1Var).e.g & 512) != 0) {
                ju2 ju2Var = (ju2) ya1Var;
                ao aoVar = this.a0;
                if (aoVar != null) {
                    aoVar.f = ju2Var;
                } else {
                    aoVar = new ao(this, ju2Var);
                }
                this.a0 = aoVar;
            } else {
                this.a0 = null;
            }
        }
        this.X = ya1Var;
    }

    @Override // defpackage.zq1
    public final int j0(int i) {
        ao aoVar = this.a0;
        if (aoVar == null) {
            ya1 ya1Var = this.X;
            xz1 xz1Var = this.v;
            xz1Var.getClass();
            return ya1Var.p0(this, xz1Var, i);
        }
        ju2 ju2Var = aoVar.f;
        xz1 xz1Var2 = this.v;
        xz1Var2.getClass();
        xz1 xz1Var3 = ju2Var.e.l;
        xz1Var3.getClass();
        ek1 ek1VarR1 = xz1Var3.r1();
        ek1VarR1.getClass();
        if (!ek1VarR1.W0()) {
            return xz1Var2.j0(i);
        }
        return ju2Var.m1(new xn(aoVar, aoVar.getLayoutDirection()), new oa0(xz1Var2, zz1.e, a02.e, 2), m50.b(0, 0, 0, i, 7)).e();
    }

    @Override // defpackage.xz1
    public final void o1() {
        if (this.Z == null) {
            this.Z = new za1(this);
        }
    }

    @Override // defpackage.xz1
    public final ek1 r1() {
        return this.Z;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    @Override // defpackage.zq1
    public final h82 s(long j) {
        fr1 fr1VarS;
        l50 l50Var;
        boolean z;
        if (this.u) {
            l50 l50Var2 = this.Y;
            if (l50Var2 == null) {
                fo.i("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            j = l50Var2.a;
        }
        K0(j);
        ao aoVar = this.a0;
        if (aoVar != null) {
            ju2 ju2Var = aoVar.f;
            za1 za1Var = aoVar.e.Z;
            za1Var.getClass();
            fr1 fr1VarB1 = za1Var.b1();
            fr1VarB1.e();
            fr1VarB1.b();
            boolean z2 = (ju2Var.u.h() && ju2Var.u.e().a() && ju2Var.u.e().b.a()) || (l50Var = this.Y) == null || j != l50Var.a;
            aoVar.g = z2;
            if (!z2) {
                xz1 xz1Var = this.v;
                xz1Var.getClass();
                xz1Var.u = true;
            }
            xz1 xz1Var2 = this.v;
            xz1Var2.getClass();
            fr1VarS = ju2Var.m1(aoVar, xz1Var2, j);
            xz1 xz1Var3 = this.v;
            xz1Var3.getClass();
            xz1Var3.u = false;
            int iE = fr1VarS.e();
            za1 za1Var2 = this.Z;
            za1Var2.getClass();
            if (iE == za1Var2.e) {
                int iB = fr1VarS.b();
                za1 za1Var3 = this.Z;
                za1Var3.getClass();
                z = iB == za1Var3.f;
            }
            if (!aoVar.g) {
                xz1 xz1Var4 = this.v;
                xz1Var4.getClass();
                long j2 = xz1Var4.g;
                xz1 xz1Var5 = this.v;
                xz1Var5.getClass();
                ek1 ek1VarR1 = xz1Var5.r1();
                if (p41.a(j2, ek1VarR1 != null ? new p41(ek1VarR1.i1()) : null) && !z) {
                    fr1VarS = new ab1(fr1VarS, this);
                }
            }
        } else {
            ya1 ya1Var = this.X;
            xz1 xz1Var6 = this.v;
            xz1Var6.getClass();
            fr1VarS = ya1Var.s(this, xz1Var6, j);
        }
        M1(fr1VarS);
        D1();
        return this;
    }

    @Override // defpackage.zq1
    public final int s0(int i) {
        ao aoVar = this.a0;
        if (aoVar == null) {
            ya1 ya1Var = this.X;
            xz1 xz1Var = this.v;
            xz1Var.getClass();
            return ya1Var.x(this, xz1Var, i);
        }
        ju2 ju2Var = aoVar.f;
        xz1 xz1Var2 = this.v;
        xz1Var2.getClass();
        xz1 xz1Var3 = ju2Var.e.l;
        xz1Var3.getClass();
        ek1 ek1VarR1 = xz1Var3.r1();
        ek1VarR1.getClass();
        if (!ek1VarR1.W0()) {
            return xz1Var2.s0(i);
        }
        return ju2Var.m1(new xn(aoVar, aoVar.getLayoutDirection()), new oa0(xz1Var2, zz1.f, a02.e, 2), m50.b(0, 0, 0, i, 7)).e();
    }

    @Override // defpackage.xz1
    public final cv1 t1() {
        return ((cv1) this.X).e;
    }

    @Override // defpackage.zq1
    public final int u0(int i) {
        ao aoVar = this.a0;
        if (aoVar == null) {
            ya1 ya1Var = this.X;
            xz1 xz1Var = this.v;
            xz1Var.getClass();
            return ya1Var.W(this, xz1Var, i);
        }
        ju2 ju2Var = aoVar.f;
        xz1 xz1Var2 = this.v;
        xz1Var2.getClass();
        xz1 xz1Var3 = ju2Var.e.l;
        xz1Var3.getClass();
        ek1 ek1VarR1 = xz1Var3.r1();
        ek1VarR1.getClass();
        if (!ek1VarR1.W0()) {
            return xz1Var2.u0(i);
        }
        return ju2Var.m1(new xn(aoVar, aoVar.getLayoutDirection()), new oa0(xz1Var2, zz1.e, a02.f, 2), m50.b(0, i, 0, 0, 13)).b();
    }

    @Override // defpackage.zq1
    public final int w(int i) {
        ao aoVar = this.a0;
        if (aoVar == null) {
            ya1 ya1Var = this.X;
            xz1 xz1Var = this.v;
            xz1Var.getClass();
            return ya1Var.F(this, xz1Var, i);
        }
        ju2 ju2Var = aoVar.f;
        xz1 xz1Var2 = this.v;
        xz1Var2.getClass();
        xz1 xz1Var3 = ju2Var.e.l;
        xz1Var3.getClass();
        ek1 ek1VarR1 = xz1Var3.r1();
        ek1VarR1.getClass();
        if (!ek1VarR1.W0()) {
            return xz1Var2.w(i);
        }
        return ju2Var.m1(new xn(aoVar, aoVar.getLayoutDirection()), new oa0(xz1Var2, zz1.f, a02.f, 2), m50.b(0, i, 0, 0, 13)).b();
    }
}
