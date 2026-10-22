package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dr1 extends h82 implements zq1, r9, tv1 {
    public boolean A;
    public boolean E;
    public float I;
    public boolean J;
    public lu0 K;
    public float M;
    public boolean O;
    public final lb1 j;
    public boolean k;
    public boolean n;
    public boolean o;
    public boolean q;
    public lu0 s;
    public float t;
    public Object v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public fb1 p = fb1.g;
    public long r = 0;
    public boolean u = true;
    public final ib1 B = new ib1(this, 0);
    public final gy1 C = new gy1(new dr1[16]);
    public boolean D = true;
    public long F = m50.b(0, 0, 0, 0, 15);
    public final cr1 G = new cr1(this, 1);
    public final cr1 H = new cr1(this, 0);
    public long L = 0;
    public final cr1 N = new cr1(this, 2);

    public dr1(lb1 lb1Var) {
        this.j = lb1Var;
    }

    @Override // defpackage.h82, defpackage.zq1
    public final Object A() {
        return this.v;
    }

    @Override // defpackage.r9
    public final void C(q9 q9Var) {
        gy1 gy1VarY = this.j.a.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            q9Var.invoke(((hb1) objArr[i2]).L.p);
        }
    }

    @Override // defpackage.h82
    public final int D0() {
        return this.j.a().D0();
    }

    @Override // defpackage.tv1
    public final void E(boolean z) {
        lb1 lb1Var = this.j;
        if (z != lb1Var.a().m) {
            lb1Var.a().m = z;
            this.O = true;
        }
    }

    @Override // defpackage.h82
    public final int E0() {
        return this.j.a().E0();
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
        return lb1Var.p;
    }

    @Override // defpackage.r9
    public final void I() {
        boolean zW0;
        this.E = true;
        ib1 ib1Var = this.B;
        ib1Var.h();
        boolean z = this.z;
        lb1 lb1Var = this.j;
        if (z) {
            gy1 gy1VarY = lb1Var.a.y();
            Object[] objArr = gy1VarY.e;
            int i = gy1VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                hb1 hb1Var = (hb1) objArr[i2];
                boolean zQ = hb1Var.q();
                lb1 lb1Var2 = hb1Var.L;
                if (zQ && hb1Var.r() == fb1.e) {
                    dr1 dr1Var = lb1Var2.p;
                    l50 l50Var = dr1Var.n ? new l50(dr1Var.h) : null;
                    if (l50Var != null) {
                        if (hb1Var.H == fb1.g) {
                            hb1Var.c();
                        }
                        zW0 = lb1Var2.p.W0(l50Var.a);
                    } else {
                        zW0 = false;
                    }
                    if (zW0) {
                        hb1.V(lb1Var.a, false, 7);
                    }
                }
            }
        }
        if (this.A || (!this.q && !F().o && this.z)) {
            this.z = false;
            db1 db1Var = lb1Var.d;
            lb1Var.d = db1.g;
            lb1Var.g(false);
            hb1 hb1Var2 = lb1Var.a;
            v42 snapshotObserver = ((db) kb1.a(hb1Var2)).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a.c(hb1Var2, ik0.q, this.H);
            lb1Var.d = db1Var;
            this.A = false;
        }
        if (ib1Var.d) {
            ib1Var.e = true;
        }
        if (ib1Var.b && ib1Var.e()) {
            ib1Var.g();
        }
        this.E = false;
    }

    @Override // defpackage.h82
    public final void I0(long j, float f, lu0 lu0Var) throws Throwable {
        lb1 lb1Var = this.j;
        hb1 hb1Var = lb1Var.a;
        hb1 hb1Var2 = lb1Var.a;
        try {
            this.x = true;
            if (!h41.a(j, this.r) || lu0Var != this.s || this.O) {
                if (lb1Var.k || lb1Var.j || this.O) {
                    this.z = true;
                    this.O = false;
                }
            }
            ik1 ik1Var = lb1Var.q;
            if (ik1Var != null) {
                lb1 lb1Var2 = ik1Var.j;
                if (ik1Var.u == gk1.g && !vd0.B(lb1Var2.a)) {
                    lb1Var2.c = true;
                }
            }
            ik1 ik1Var2 = lb1Var.q;
            if (ik1Var2 != null && ik1Var2.L0()) {
                xz1 xz1Var = lb1Var.a().w;
                g82 placementScope = xz1Var != null ? xz1Var.p : ((db) kb1.a(hb1Var2)).getPlacementScope();
                ik1 ik1Var3 = lb1Var.q;
                ik1Var3.getClass();
                hb1 hb1VarU = hb1Var2.u();
                if (hb1VarU != null) {
                    hb1VarU.L.h = 0;
                }
                ik1Var3.m = Integer.MAX_VALUE;
                g82.z(placementScope, ik1Var3, (int) (j >> 32), (int) (4294967295L & j));
            }
            ik1 ik1Var4 = lb1Var.q;
            if (ik1Var4 != null && !ik1Var4.p) {
                p21.c("Error: Placement happened before lookahead.");
            }
            V0(j, f, lu0Var);
        } catch (Throwable th) {
            hb1Var.Y(th);
            throw null;
        }
    }

    public final List L0() {
        lb1 lb1Var = this.j;
        lb1Var.a.f0();
        boolean z = this.D;
        gy1 gy1Var = this.C;
        if (!z) {
            return gy1Var.f();
        }
        hb1 hb1Var = lb1Var.a;
        gy1 gy1VarY = hb1Var.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            hb1 hb1Var2 = (hb1) objArr[i2];
            if (gy1Var.g <= i2) {
                gy1Var.b(hb1Var2.L.p);
            } else {
                dr1 dr1Var = hb1Var2.L.p;
                Object[] objArr2 = gy1Var.e;
                Object obj = objArr2[i2];
                objArr2[i2] = dr1Var;
            }
        }
        gy1Var.l(((gy1) ((qx1) hb1Var.n()).f).g, gy1Var.g);
        this.D = false;
        return gy1Var.f();
    }

    public final void M0() {
        boolean z = this.w;
        this.w = true;
        lb1 lb1Var = this.j;
        hb1 hb1Var = lb1Var.a;
        tz1 tz1Var = hb1Var.K;
        if (!z) {
            tz1Var.c.E1();
            ((db) kb1.a(hb1Var)).getRectManager().f(lb1Var.a);
            if (hb1Var.q()) {
                hb1.V(hb1Var, true, 6);
            } else if (hb1Var.L.e) {
                hb1.T(hb1Var, true, 6);
            }
        }
        xz1 xz1Var = tz1Var.c.v;
        for (xz1 xz1Var2 = tz1Var.d; !o51.f(xz1Var2, xz1Var) && xz1Var2 != null; xz1Var2 = xz1Var2.v) {
            if (xz1Var2.Q) {
                xz1Var2.A1();
            }
        }
        gy1 gy1VarY = hb1Var.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            hb1 hb1Var2 = (hb1) objArr[i2];
            if (hb1Var2.v() != Integer.MAX_VALUE) {
                hb1Var2.L.p.M0();
                hb1.W(hb1Var2);
            }
        }
    }

    public final void R0() {
        if (this.w) {
            this.w = false;
            lb1 lb1Var = this.j;
            hb1 hb1Var = lb1Var.a;
            hb1 hb1Var2 = lb1Var.a;
            ((db) kb1.a(hb1Var)).getRectManager().g(hb1Var2);
            tz1 tz1Var = hb1Var2.K;
            xz1 xz1Var = tz1Var.c.v;
            for (xz1 xz1Var2 = tz1Var.d; !o51.f(xz1Var2, xz1Var) && xz1Var2 != null; xz1Var2 = xz1Var2.v) {
                xz1Var2.G1();
                xz1Var2.L1();
            }
            gy1 gy1VarY = hb1Var2.y();
            Object[] objArr = gy1VarY.e;
            int i = gy1VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((hb1) objArr[i2]).L.p.R0();
            }
        }
    }

    public final void S0() {
        fb1 fb1Var;
        lb1 lb1Var = this.j;
        hb1.V(lb1Var.a, false, 7);
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

    public final void T0() {
        this.J = true;
        lb1 lb1Var = this.j;
        hb1 hb1VarU = lb1Var.a.u();
        float f = F().G;
        hb1 hb1Var = lb1Var.a;
        tz1 tz1Var = hb1Var.K;
        xz1 xz1Var = tz1Var.d;
        v21 v21Var = tz1Var.c;
        while (xz1Var != v21Var) {
            xz1Var.getClass();
            bb1 bb1Var = (bb1) xz1Var;
            f += bb1Var.G;
            xz1Var = bb1Var.v;
        }
        if (f != this.I) {
            this.I = f;
            if (hb1VarU != null) {
                hb1VarU.N();
            }
            if (hb1VarU != null) {
                hb1VarU.B();
            }
        }
        if (!F().o) {
            boolean z = this.w;
            if (!z || this.B.d()) {
                M0();
            }
            if (z) {
                hb1Var.K.c.E1();
            } else {
                if (hb1VarU != null) {
                    hb1VarU.B();
                }
                if (this.k && hb1VarU != null) {
                    hb1VarU.U(false);
                }
            }
        }
        if (hb1VarU != null) {
            lb1 lb1Var2 = hb1VarU.L;
            if (!this.k && lb1Var2.d == db1.g) {
                if (this.m != Integer.MAX_VALUE) {
                    p21.c("Place was called on a node which was placed already");
                }
                int i = lb1Var2.i;
                this.m = i;
                lb1Var2.i = i + 1;
            }
        } else {
            this.m = 0;
        }
        I();
    }

    public final void V0(long j, float f, lu0 lu0Var) {
        lb1 lb1Var = this.j;
        hb1 hb1Var = lb1Var.a;
        hb1 hb1Var2 = lb1Var.a;
        if (hb1Var.V) {
            p21.a("place is called on a deactivated node");
        }
        lb1Var.d = db1.g;
        this.r = j;
        this.t = f;
        this.s = lu0Var;
        this.J = false;
        t42 t42VarA = kb1.a(hb1Var2);
        if (this.z || !this.w) {
            this.B.g = false;
            lb1Var.f(false);
            this.K = lu0Var;
            this.L = j;
            this.M = f;
            v42 snapshotObserver = ((db) t42VarA).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a.c(hb1Var2, ik0.r, this.N);
        } else {
            xz1 xz1VarA = lb1Var.a();
            xz1VarA.J1(h41.c(j, xz1VarA.i), f, lu0Var);
            T0();
        }
        lb1Var.d = db1.i;
        if (lb1Var.a().o && (lb1Var.k || lb1Var.j)) {
            requestLayout();
        }
        this.o = true;
    }

    public final boolean W0(long j) throws Throwable {
        lb1 lb1Var = this.j;
        hb1 hb1Var = lb1Var.a;
        hb1 hb1Var2 = lb1Var.a;
        try {
            if (hb1Var.V) {
                p21.a("measure is called on a deactivated node");
            }
            t42 t42VarA = kb1.a(hb1Var2);
            hb1 hb1VarU = hb1Var2.u();
            boolean z = true;
            hb1Var2.J = hb1Var2.J || (hb1VarU != null && hb1VarU.J);
            if (!hb1Var2.q() && l50.b(this.h, j)) {
                ((db) t42VarA).h(hb1Var2, false);
                hb1Var2.X();
                return false;
            }
            this.B.f = false;
            gy1 gy1VarY = hb1Var2.y();
            Object[] objArr = gy1VarY.e;
            int i = gy1VarY.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((hb1) objArr[i2]).L.p.B.c = false;
            }
            this.n = true;
            long j2 = lb1Var.a().g;
            K0(j);
            db1 db1Var = lb1Var.d;
            db1 db1Var2 = db1.i;
            if (db1Var != db1Var2) {
                p21.c("layout state is not idle before measure starts");
            }
            this.F = j;
            db1 db1Var3 = db1.e;
            lb1Var.d = db1Var3;
            this.y = false;
            v42 snapshotObserver = ((db) kb1.a(hb1Var2)).getSnapshotObserver();
            cr1 cr1Var = this.G;
            snapshotObserver.getClass();
            snapshotObserver.a.c(hb1Var2, ik0.v, cr1Var);
            if (lb1Var.d == db1Var3) {
                this.z = true;
                this.A = true;
                lb1Var.d = db1Var2;
            }
            if (p41.b(lb1Var.a().g, j2) && lb1Var.a().e == this.e && lb1Var.a().f == this.f) {
                z = false;
            }
            J0((((long) lb1Var.a().f) & 4294967295L) | (((long) lb1Var.a().e) << 32));
            return z;
        } catch (Throwable th) {
            hb1Var.Y(th);
            throw null;
        }
    }

    public final void a1() {
        lb1 lb1Var = this.j;
        hb1 hb1Var = lb1Var.a;
        hb1 hb1Var2 = lb1Var.a;
        if (!hb1Var.H() || lb1Var.l <= 0) {
            return;
        }
        lb1 lb1Var2 = hb1Var2.L;
        if ((lb1Var2.j || lb1Var2.k) && !lb1Var2.p.z) {
            hb1Var2.U(false);
        }
        gy1 gy1VarY = hb1Var2.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((hb1) objArr[i2]).L.p.a1();
        }
    }

    @Override // defpackage.r9
    public final ib1 c() {
        return this.B;
    }

    @Override // defpackage.zq1
    public final int j0(int i) {
        lb1 lb1Var = this.j;
        if (!vd0.B(lb1Var.a)) {
            S0();
            return lb1Var.a().j0(i);
        }
        ik1 ik1Var = lb1Var.q;
        ik1Var.getClass();
        return ik1Var.j0(i);
    }

    @Override // defpackage.r9
    public final int p0() {
        return this.m;
    }

    @Override // defpackage.r9
    public final void r0() {
        hb1.V(this.j.a, false, 7);
    }

    @Override // defpackage.r9
    public final void requestLayout() {
        this.j.a.U(false);
    }

    @Override // defpackage.zq1
    public final h82 s(long j) throws Throwable {
        fb1 fb1Var;
        lb1 lb1Var = this.j;
        hb1 hb1Var = lb1Var.a;
        hb1 hb1Var2 = lb1Var.a;
        fb1 fb1Var2 = hb1Var.H;
        fb1 fb1Var3 = fb1.g;
        if (fb1Var2 == fb1Var3) {
            hb1Var.c();
        }
        if (vd0.B(hb1Var2)) {
            ik1 ik1Var = lb1Var.q;
            ik1Var.getClass();
            ik1Var.n = fb1Var3;
            ik1Var.s(j);
        }
        hb1 hb1VarU = hb1Var2.u();
        if (hb1VarU != null) {
            lb1 lb1Var2 = hb1VarU.L;
            if (this.p != fb1Var3 && !hb1Var2.J) {
                p21.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = lb1Var2.d.ordinal();
            if (iOrdinal == 0) {
                fb1Var = fb1.e;
            } else {
                if (iOrdinal != 2) {
                    b81.i(lb1Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                fb1Var = fb1.f;
            }
            this.p = fb1Var;
        } else {
            this.p = fb1Var3;
        }
        W0(j);
        return this;
    }

    @Override // defpackage.zq1
    public final int s0(int i) {
        lb1 lb1Var = this.j;
        if (!vd0.B(lb1Var.a)) {
            S0();
            return lb1Var.a().s0(i);
        }
        ik1 ik1Var = lb1Var.q;
        ik1Var.getClass();
        return ik1Var.s0(i);
    }

    @Override // defpackage.zq1
    public final int u0(int i) {
        lb1 lb1Var = this.j;
        if (!vd0.B(lb1Var.a)) {
            S0();
            return lb1Var.a().u0(i);
        }
        ik1 ik1Var = lb1Var.q;
        ik1Var.getClass();
        return ik1Var.u0(i);
    }

    @Override // defpackage.zq1
    public final int w(int i) {
        lb1 lb1Var = this.j;
        if (!vd0.B(lb1Var.a)) {
            S0();
            return lb1Var.a().w(i);
        }
        ik1 ik1Var = lb1Var.q;
        ik1Var.getClass();
        return ik1Var.w(i);
    }

    @Override // defpackage.h82
    public final int x0(m9 m9Var) {
        lb1 lb1Var = this.j;
        hb1 hb1VarU = lb1Var.a.u();
        db1 db1Var = hb1VarU != null ? hb1VarU.L.d : null;
        db1 db1Var2 = db1.e;
        ib1 ib1Var = this.B;
        if (db1Var == db1Var2) {
            ib1Var.c = true;
        } else {
            hb1 hb1VarU2 = lb1Var.a.u();
            if ((hb1VarU2 != null ? hb1VarU2.L.d : null) == db1.g) {
                ib1Var.d = true;
            }
        }
        this.q = true;
        int iX0 = lb1Var.a().x0(m9Var);
        this.q = false;
        return iX0;
    }
}
