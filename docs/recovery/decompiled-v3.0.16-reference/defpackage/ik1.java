package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ik1 extends h82 implements zq1, r9, tv1 {
    public Object B;
    public boolean F;
    public final lb1 j;
    public boolean k;
    public boolean o;
    public boolean p;
    public boolean q;
    public l50 r;
    public lu0 t;
    public boolean y;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public fb1 n = fb1.g;
    public long s = 0;
    public gk1 u = gk1.g;
    public final ib1 v = new ib1(this, 1);
    public final gy1 w = new gy1(new ik1[16]);
    public boolean x = true;
    public final hk1 z = new hk1(this, 0);
    public boolean A = true;
    public long C = m50.b(0, 0, 0, 0, 15);
    public final hk1 D = new hk1(this, 2);
    public final hk1 E = new hk1(this, 1);

    public ik1(lb1 lb1Var) {
        this.j = lb1Var;
        this.B = lb1Var.p.v;
    }

    @Override // defpackage.h82, defpackage.zq1
    public final Object A() {
        return this.B;
    }

    @Override // defpackage.r9
    public final void C(q9 q9Var) {
        gy1 gy1VarY = this.j.a.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ik1 ik1Var = ((hb1) objArr[i2]).L.q;
            ik1Var.getClass();
            q9Var.invoke(ik1Var);
        }
    }

    @Override // defpackage.tv1
    public final void E(boolean z) {
        ek1 ek1VarR1;
        lb1 lb1Var = this.j;
        ek1 ek1VarR2 = lb1Var.a().r1();
        if (Boolean.valueOf(z).equals(ek1VarR2 != null ? Boolean.valueOf(ek1VarR2.m) : null) || (ek1VarR1 = lb1Var.a().r1()) == null) {
            return;
        }
        ek1VarR1.m = z;
    }

    @Override // defpackage.r9
    public final v21 F() {
        return this.j.a.K.c;
    }

    @Override // defpackage.r9
    public final r9 H() {
        lb1 lb1Var;
        hb1 hb1VarU = this.j.a.u();
        if (hb1VarU == null || (lb1Var = hb1VarU.L) == null) {
            return null;
        }
        return lb1Var.q;
    }

    @Override // defpackage.r9
    public final void I() {
        this.y = true;
        ib1 ib1Var = this.v;
        ib1Var.h();
        lb1 lb1Var = this.j;
        boolean z = lb1Var.f;
        hb1 hb1Var = lb1Var.a;
        if (z) {
            gy1 gy1VarY = hb1Var.y();
            Object[] objArr = gy1VarY.e;
            int i = gy1VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                hb1 hb1Var2 = (hb1) objArr[i2];
                lb1 lb1Var2 = hb1Var2.L;
                if (lb1Var2.e && hb1Var2.s() == fb1.e) {
                    ik1 ik1Var = lb1Var2.q;
                    ik1Var.getClass();
                    ik1 ik1Var2 = lb1Var2.q;
                    l50 l50Var = ik1Var2 != null ? ik1Var2.r : null;
                    l50Var.getClass();
                    if (ik1Var.a1(l50Var.a)) {
                        hb1.T(hb1Var, false, 7);
                    }
                }
            }
        }
        u21 u21Var = F().Y;
        u21Var.getClass();
        if (lb1Var.g || (!this.o && !u21Var.o && lb1Var.f)) {
            lb1Var.f = false;
            db1 db1Var = lb1Var.d;
            lb1Var.d = db1.h;
            lb1Var.i(false);
            v42 snapshotObserver = ((db) kb1.a(hb1Var)).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a.c(hb1Var, ik0.t, this.z);
            lb1Var.d = db1Var;
            if (lb1Var.m && u21Var.o) {
                requestLayout();
            }
            lb1Var.g = false;
        }
        if (ib1Var.d) {
            ib1Var.e = true;
        }
        if (ib1Var.b && ib1Var.e()) {
            ib1Var.g();
        }
        this.y = false;
    }

    @Override // defpackage.h82
    public final void I0(long j, float f, lu0 lu0Var) throws Throwable {
        W0(j, lu0Var);
    }

    public final boolean L0() {
        lb1 lb1Var = this.j;
        return vd0.B(lb1Var.a) || lb1Var.c;
    }

    public final void M0(boolean z) {
        if (z && L0()) {
            return;
        }
        if (z || L0()) {
            this.u = gk1.g;
            gy1 gy1VarY = this.j.a.y();
            Object[] objArr = gy1VarY.e;
            int i = gy1VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                ik1 ik1Var = ((hb1) objArr[i2]).L.q;
                ik1Var.getClass();
                ik1Var.M0(true);
            }
        }
    }

    public final void R0() {
        gk1 gk1Var = this.u;
        lb1 lb1Var = this.j;
        boolean z = lb1Var.c;
        hb1 hb1Var = lb1Var.a;
        gk1 gk1Var2 = gk1.e;
        if (z) {
            this.u = gk1.f;
        } else {
            this.u = gk1Var2;
        }
        if (gk1Var != gk1Var2 && lb1Var.e) {
            hb1.T(hb1Var, true, 6);
        }
        gy1 gy1VarY = hb1Var.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            hb1 hb1Var2 = (hb1) objArr[i2];
            ik1 ik1Var = hb1Var2.L.q;
            if (ik1Var == null) {
                fo.i("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (ik1Var.m != Integer.MAX_VALUE) {
                ik1Var.R0();
                hb1.W(hb1Var2);
            }
        }
    }

    public final void S0() {
        lb1 lb1Var = this.j;
        if (lb1Var.o > 0) {
            gy1 gy1VarY = lb1Var.a.y();
            Object[] objArr = gy1VarY.e;
            int i = gy1VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                hb1 hb1Var = (hb1) objArr[i2];
                lb1 lb1Var2 = hb1Var.L;
                if ((lb1Var2.m || lb1Var2.n) && !lb1Var2.f) {
                    hb1Var.R(false);
                }
                ik1 ik1Var = lb1Var2.q;
                if (ik1Var != null) {
                    ik1Var.S0();
                }
            }
        }
    }

    public final void T0() {
        fb1 fb1Var;
        lb1 lb1Var = this.j;
        hb1.T(lb1Var.a, false, 7);
        hb1 hb1Var = lb1Var.a;
        hb1 hb1VarU = hb1Var.u();
        if (hb1VarU == null || hb1Var.H != fb1.g) {
            return;
        }
        int iOrdinal = hb1VarU.L.d.ordinal();
        if (iOrdinal != 0) {
            fb1Var = iOrdinal != 2 ? hb1VarU.H : fb1.f;
        } else {
            fb1Var = fb1.e;
        }
        hb1Var.H = fb1Var;
    }

    public final void V0() {
        db1 db1Var;
        this.F = true;
        lb1 lb1Var = this.j;
        hb1 hb1VarU = lb1Var.a.u();
        gk1 gk1Var = this.u;
        if ((gk1Var != gk1.e && !lb1Var.c) || (gk1Var != gk1.f && lb1Var.c)) {
            R0();
            if (this.k && hb1VarU != null) {
                hb1VarU.R(false);
            }
        }
        if (hb1VarU != null) {
            lb1 lb1Var2 = hb1VarU.L;
            if (!this.k && ((db1Var = lb1Var2.d) == db1.g || db1Var == db1.h)) {
                if (this.m != Integer.MAX_VALUE) {
                    p21.c("Place was called on a node which was placed already");
                }
                int i = lb1Var2.h;
                this.m = i;
                lb1Var2.h = i + 1;
            }
        } else {
            this.m = 0;
        }
        I();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001e, B:14:0x0022, B:15:0x0027, B:17:0x0036, B:19:0x003a, B:22:0x0040, B:21:0x003e, B:23:0x0043, B:25:0x004d, B:30:0x0057, B:32:0x0088, B:31:0x006f), top: B:36:0x0007 }] */
    public final void W0(long j, lu0 lu0Var) throws Throwable {
        lb1 lb1Var = this.j;
        hb1 hb1Var = lb1Var.a;
        hb1 hb1Var2 = lb1Var.a;
        try {
            hb1 hb1VarU = hb1Var.u();
            db1 db1Var = hb1VarU != null ? hb1VarU.L.d : null;
            db1 db1Var2 = db1.h;
            if (db1Var == db1Var2) {
                lb1Var.c = false;
            }
            if (hb1Var2.V) {
                p21.a("place is called on a deactivated node");
            }
            lb1Var.d = db1Var2;
            boolean z = true;
            this.p = true;
            this.F = false;
            if (!h41.a(j, this.s)) {
                if (lb1Var.n || lb1Var.m) {
                    lb1Var.f = true;
                }
                S0();
            }
            t42 t42VarA = kb1.a(hb1Var2);
            this.s = j;
            if (lb1Var.f) {
                lb1Var.h(false);
                this.v.g = false;
                v42 snapshotObserver = ((db) t42VarA).getSnapshotObserver();
                hk1 hk1Var = this.E;
                snapshotObserver.getClass();
                snapshotObserver.a.c(hb1Var2, ik0.s, hk1Var);
            } else {
                if (this.u == gk1.g) {
                    z = false;
                }
                if (z) {
                    ek1 ek1VarR1 = lb1Var.a().r1();
                    ek1VarR1.getClass();
                    ek1VarR1.k1(h41.c(j, ek1VarR1.i));
                    V0();
                } else {
                    lb1Var.h(false);
                    this.v.g = false;
                    v42 snapshotObserver2 = ((db) t42VarA).getSnapshotObserver();
                    hk1 hk1Var2 = this.E;
                    snapshotObserver2.getClass();
                    snapshotObserver2.a.c(hb1Var2, ik0.s, hk1Var2);
                }
            }
            this.t = lu0Var;
            lb1Var.d = db1.i;
        } catch (Throwable th) {
            hb1Var.Y(th);
            throw null;
        }
    }

    public final boolean a1(long j) throws Throwable {
        lb1 lb1Var = this.j;
        hb1 hb1Var = lb1Var.a;
        hb1 hb1Var2 = lb1Var.a;
        try {
            if (hb1Var.V) {
                p21.a("measure is called on a deactivated node");
            }
            hb1 hb1VarU = hb1Var2.u();
            hb1Var2.J = hb1Var2.J || (hb1VarU != null && hb1VarU.J);
            if (!hb1Var2.L.e) {
                l50 l50Var = this.r;
                if (l50Var == null ? false : l50.b(l50Var.a, j)) {
                    t42 t42Var = hb1Var2.s;
                    if (t42Var != null) {
                        ((db) t42Var).h(hb1Var2, true);
                    }
                    hb1Var2.X();
                    return false;
                }
            }
            this.r = new l50(j);
            K0(j);
            this.v.f = false;
            gy1 gy1VarY = hb1Var2.y();
            Object[] objArr = gy1VarY.e;
            int i = gy1VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                ik1 ik1Var = ((hb1) objArr[i2]).L.q;
                ik1Var.getClass();
                ik1Var.v.c = false;
            }
            long j2 = this.q ? this.g : -9223372034707292160L;
            this.q = true;
            ek1 ek1VarR1 = lb1Var.a().r1();
            if (ek1VarR1 == null) {
                p21.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            lb1Var.c(j);
            J0((((long) ek1VarR1.e) << 32) | (((long) ek1VarR1.f) & 4294967295L));
            return (((int) (j2 >> 32)) == ek1VarR1.e && ((int) (j2 & 4294967295L)) == ek1VarR1.f) ? false : true;
        } catch (Throwable th) {
            hb1Var.Y(th);
            throw null;
        }
    }

    @Override // defpackage.r9
    public final ib1 c() {
        return this.v;
    }

    @Override // defpackage.zq1
    public final int j0(int i) {
        T0();
        ek1 ek1VarR1 = this.j.a().r1();
        ek1VarR1.getClass();
        return ek1VarR1.j0(i);
    }

    @Override // defpackage.r9
    public final int p0() {
        return this.m;
    }

    @Override // defpackage.r9
    public final void r0() {
        hb1.T(this.j.a, false, 7);
    }

    @Override // defpackage.r9
    public final void requestLayout() {
        this.j.a.R(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Override // defpackage.zq1
    public final h82 s(long j) {
        fb1 fb1Var;
        lb1 lb1Var = this.j;
        hb1 hb1Var = lb1Var.a;
        hb1 hb1Var2 = lb1Var.a;
        hb1 hb1VarU = hb1Var.u();
        if ((hb1VarU != null ? hb1VarU.L.d : null) == db1.f) {
            lb1Var.b = false;
        } else {
            hb1 hb1VarU2 = hb1Var2.u();
            if ((hb1VarU2 != null ? hb1VarU2.L.d : null) == db1.h) {
                lb1Var.b = false;
            }
        }
        hb1 hb1VarU3 = hb1Var2.u();
        fb1 fb1Var2 = fb1.g;
        if (hb1VarU3 != null) {
            lb1 lb1Var2 = hb1VarU3.L;
            if (this.n != fb1Var2 && !hb1Var2.J) {
                p21.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = lb1Var2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fb1Var = fb1.e;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    b81.i(lb1Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                fb1Var = fb1.f;
            }
            this.n = fb1Var;
        } else {
            this.n = fb1Var2;
        }
        if (hb1Var2.H == fb1Var2) {
            hb1Var2.c();
        }
        a1(j);
        return this;
    }

    @Override // defpackage.zq1
    public final int s0(int i) {
        T0();
        ek1 ek1VarR1 = this.j.a().r1();
        ek1VarR1.getClass();
        return ek1VarR1.s0(i);
    }

    @Override // defpackage.zq1
    public final int u0(int i) {
        T0();
        ek1 ek1VarR1 = this.j.a().r1();
        ek1VarR1.getClass();
        return ek1VarR1.u0(i);
    }

    @Override // defpackage.zq1
    public final int w(int i) {
        T0();
        ek1 ek1VarR1 = this.j.a().r1();
        ek1VarR1.getClass();
        return ek1VarR1.w(i);
    }

    @Override // defpackage.h82
    public final int x0(m9 m9Var) {
        lb1 lb1Var = this.j;
        hb1 hb1VarU = lb1Var.a.u();
        db1 db1Var = hb1VarU != null ? hb1VarU.L.d : null;
        db1 db1Var2 = db1.f;
        ib1 ib1Var = this.v;
        if (db1Var == db1Var2) {
            ib1Var.c = true;
        } else {
            hb1 hb1VarU2 = lb1Var.a.u();
            if ((hb1VarU2 != null ? hb1VarU2.L.d : null) == db1.h) {
                ib1Var.d = true;
            }
        }
        this.o = true;
        ek1 ek1VarR1 = lb1Var.a().r1();
        ek1VarR1.getClass();
        int iX0 = ek1VarR1.x0(m9Var);
        this.o = false;
        return iX0;
    }
}
