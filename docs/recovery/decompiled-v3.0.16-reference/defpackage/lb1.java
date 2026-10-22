package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lb1 {
    public final hb1 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public ik1 q;
    public db1 d = db1.i;
    public final dr1 p = new dr1(this);

    public lb1(hb1 hb1Var) {
        this.a = hb1Var;
    }

    public final xz1 a() {
        return this.a.K.d;
    }

    public final void b() {
        db1 db1Var = this.a.L.d;
        db1 db1Var2 = db1.g;
        db1 db1Var3 = db1.h;
        if (db1Var == db1Var2 || db1Var == db1Var3) {
            if (this.p.E) {
                g(true);
            } else {
                f(true);
            }
        }
        if (db1Var == db1Var3) {
            ik1 ik1Var = this.q;
            if (ik1Var == null || !ik1Var.y) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        ik1 ik1Var = this.q;
        if (ik1Var != null) {
            lb1 lb1Var = ik1Var.j;
            lb1Var.d = db1.f;
            hb1 hb1Var = lb1Var.a;
            lb1Var.e = false;
            ik1Var.C = j;
            v42 snapshotObserver = ((db) kb1.a(hb1Var)).getSnapshotObserver();
            hk1 hk1Var = ik1Var.D;
            snapshotObserver.getClass();
            snapshotObserver.a.c(hb1Var, ik0.u, hk1Var);
            lb1Var.f = true;
            lb1Var.g = true;
            boolean zB = vd0.B(hb1Var);
            dr1 dr1Var = lb1Var.p;
            if (zB) {
                dr1Var.z = true;
                dr1Var.A = true;
            } else {
                dr1Var.y = true;
            }
            lb1Var.d = db1.i;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            hb1 hb1VarU = this.a.u();
            lb1 lb1Var = hb1VarU != null ? hb1VarU.L : null;
            if (lb1Var != null) {
                int i3 = lb1Var.l;
                if (i == 0) {
                    lb1Var.d(i3 - 1);
                } else {
                    lb1Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            hb1 hb1VarU = this.a.u();
            lb1 lb1Var = hb1VarU != null ? hb1VarU.L : null;
            if (lb1Var != null) {
                int i3 = lb1Var.o;
                if (i == 0) {
                    lb1Var.e(i3 - 1);
                } else {
                    lb1Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        dr1 dr1Var = this.p;
        lb1 lb1Var = dr1Var.j;
        Object obj = dr1Var.v;
        hb1 hb1Var = this.a;
        if ((obj != null || lb1Var.a().A() != null) && dr1Var.u) {
            dr1Var.u = false;
            dr1Var.v = lb1Var.a().A();
            hb1 hb1VarU = hb1Var.u();
            if (hb1VarU != null) {
                hb1.V(hb1VarU, false, 7);
            }
        }
        ik1 ik1Var = this.q;
        if (ik1Var != null) {
            lb1 lb1Var2 = ik1Var.j;
            if (ik1Var.B == null) {
                ek1 ek1VarR1 = lb1Var2.a().r1();
                ek1VarR1.getClass();
                if (ek1VarR1.s.A() == null) {
                    return;
                }
            }
            if (ik1Var.A) {
                ik1Var.A = false;
                ek1 ek1VarR2 = lb1Var2.a().r1();
                ek1VarR2.getClass();
                ik1Var.B = ek1VarR2.s.A();
                if (vd0.B(hb1Var)) {
                    hb1 hb1VarU2 = hb1Var.u();
                    if (hb1VarU2 != null) {
                        hb1.V(hb1VarU2, false, 7);
                        return;
                    }
                    return;
                }
                hb1 hb1VarU3 = hb1Var.u();
                if (hb1VarU3 != null) {
                    hb1.T(hb1VarU3, false, 7);
                }
            }
        }
    }
}
