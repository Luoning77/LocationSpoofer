package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v21 extends xz1 {
    public static final je Z;
    public final v43 X;
    public u21 Y;

    static {
        je jeVarN = xq1.n();
        int i = hz.h;
        jeVarN.g(hz.d);
        jeVarN.n(1.0f);
        jeVarN.o(1);
        Z = jeVarN;
    }

    public v21(hb1 hb1Var) {
        super(hb1Var);
        v43 v43Var = new v43();
        v43Var.h = 0;
        this.X = v43Var;
        v43Var.l = this;
        this.Y = hb1Var.m != null ? new u21(this) : null;
    }

    @Override // defpackage.h82
    public final void I0(long j, float f, lu0 lu0Var) {
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
        this.s.L.p.T0();
    }

    @Override // defpackage.xz1
    public final void I1(vv vvVar, kw0 kw0Var) throws Throwable {
        hb1 hb1Var = this.s;
        t42 t42VarA = kb1.a(hb1Var);
        gy1 gy1VarX = hb1Var.x();
        Object[] objArr = gy1VarX.e;
        int i = gy1VarX.g;
        for (int i2 = 0; i2 < i; i2++) {
            hb1 hb1Var2 = (hb1) objArr[i2];
            if (hb1Var2.H()) {
                hb1Var2.i(vvVar, kw0Var);
            }
        }
        if (((db) t42VarA).getShowLayoutBounds()) {
            long j = this.g;
            vvVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, Z);
        }
    }

    @Override // defpackage.ck1
    public final int M0(m9 m9Var) {
        u21 u21Var = this.Y;
        if (u21Var != null) {
            return u21Var.M0(m9Var);
        }
        dr1 dr1Var = this.s.L.p;
        ib1 ib1Var = dr1Var.B;
        if (!dr1Var.q) {
            if (dr1Var.j.d == db1.e) {
                ib1Var.f = true;
                if (ib1Var.b) {
                    dr1Var.z = true;
                    dr1Var.A = true;
                }
            } else {
                ib1Var.g = true;
            }
        }
        v21 v21VarF = dr1Var.F();
        boolean z = v21VarF.o;
        v21VarF.o = true;
        dr1Var.I();
        v21VarF.o = z;
        Integer num = (Integer) ib1Var.i.get(m9Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.zq1
    public final int j0(int i) {
        d31 d31VarT = this.s.t();
        er1 er1VarV = d31VarT.v();
        hb1 hb1Var = (hb1) d31VarT.f;
        return er1VarV.j(hb1Var.K.d, hb1Var.m(), i);
    }

    @Override // defpackage.xz1
    public final void o1() {
        if (this.Y == null) {
            this.Y = new u21(this);
        }
    }

    @Override // defpackage.xz1
    public final ek1 r1() {
        return this.Y;
    }

    @Override // defpackage.zq1
    public final h82 s(long j) {
        if (this.u) {
            u21 u21Var = this.Y;
            u21Var.getClass();
            j = u21Var.h;
        }
        K0(j);
        hb1 hb1Var = this.s;
        gy1 gy1VarY = hb1Var.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((hb1) objArr[i2]).L.p.p = fb1.g;
        }
        M1(hb1Var.B.g(this, hb1Var.m(), j));
        D1();
        return this;
    }

    @Override // defpackage.zq1
    public final int s0(int i) {
        d31 d31VarT = this.s.t();
        er1 er1VarV = d31VarT.v();
        hb1 hb1Var = (hb1) d31VarT.f;
        return er1VarV.d(hb1Var.K.d, hb1Var.m(), i);
    }

    @Override // defpackage.xz1
    public final cv1 t1() {
        return this.X;
    }

    @Override // defpackage.zq1
    public final int u0(int i) {
        d31 d31VarT = this.s.t();
        er1 er1VarV = d31VarT.v();
        hb1 hb1Var = (hb1) d31VarT.f;
        return er1VarV.h(hb1Var.K.d, hb1Var.m(), i);
    }

    @Override // defpackage.zq1
    public final int w(int i) {
        d31 d31VarT = this.s.t();
        er1 er1VarV = d31VarT.v();
        hb1 hb1Var = (hb1) d31VarT.f;
        return er1VarV.b(hb1Var.K.d, hb1Var.m(), i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xz1
    public final void z1(vz1 vz1Var, long j, zx0 zx0Var, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        hb1 hb1Var;
        long jA;
        hb1 hb1Var2 = this.s;
        boolean z3 = false;
        if (vz1Var.h(hb1Var2)) {
            if (!U1(j)) {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(l1(j, s1())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = zx0Var.g;
                    gy1 gy1VarX = hb1Var2.x();
                    objArr = gy1VarX.e;
                    i3 = gy1VarX.g - 1;
                    while (i3 >= 0) {
                        hb1Var = (hb1) objArr[i3];
                        if (hb1Var.H()) {
                            vz1Var.d(hb1Var, j, zx0Var, i2, z2);
                            jA = zx0Var.a();
                            if (hd0.x(jA) >= 0.0f && hd0.J(jA) && !hd0.I(jA) && !vz1Var.e(zx0Var, hb1Var)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    zx0Var.g = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = zx0Var.g;
                gy1 gy1VarX2 = hb1Var2.x();
                objArr = gy1VarX2.e;
                i3 = gy1VarX2.g - 1;
                while (i3 >= 0) {
                    hb1Var = (hb1) objArr[i3];
                    if (hb1Var.H()) {
                        vz1Var.d(hb1Var, j, zx0Var, i2, z2);
                        jA = zx0Var.a();
                        if (hd0.x(jA) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                zx0Var.g = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = zx0Var.g;
            gy1 gy1VarX3 = hb1Var2.x();
            objArr = gy1VarX3.e;
            i3 = gy1VarX3.g - 1;
            while (i3 >= 0) {
                hb1Var = (hb1) objArr[i3];
                if (hb1Var.H()) {
                    vz1Var.d(hb1Var, j, zx0Var, i2, z2);
                    jA = zx0Var.a();
                    if (hd0.x(jA) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            zx0Var.g = i6;
        }
    }
}
