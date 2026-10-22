package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f13 extends ks implements i71 {
    public final e30 Q;
    public final t61 R;
    public final um3 S;
    public final i71[] T;
    public final a71 U;
    public boolean V;
    public String W;
    public String X;

    public f13(e30 e30Var, t61 t61Var, um3 um3Var, i71[] i71VarArr) {
        e30Var.getClass();
        this.Q = e30Var;
        this.R = t61Var;
        this.S = um3Var;
        this.T = i71VarArr;
        this.U = t61Var.a;
        int iOrdinal = um3Var.ordinal();
        if (i71VarArr != null) {
            i71 i71Var = i71VarArr[iOrdinal];
            if (i71Var == null && i71Var == this) {
                return;
            }
            i71VarArr[iOrdinal] = this;
        }
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void A(String str) {
        str.getClass();
        this.Q.j(str);
    }

    @Override // defpackage.ks
    public final void N(bt2 bt2Var, int i) {
        bt2Var.getClass();
        int iOrdinal = this.S.ordinal();
        e30 e30Var = this.Q;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!e30Var.e) {
                e30Var.f(',');
            }
            e30Var.c();
            return;
        }
        if (iOrdinal == 2) {
            if (e30Var.e) {
                this.V = true;
                e30Var.c();
                return;
            }
            if (i % 2 == 0) {
                e30Var.f(',');
                e30Var.c();
            } else {
                e30Var.f(':');
                e30Var.k();
                z = false;
            }
            this.V = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!e30Var.e) {
                e30Var.f(',');
            }
            e30Var.c();
            ym3.J(this.R, bt2Var);
            A(bt2Var.e(i));
            e30Var.f(':');
            e30Var.k();
            return;
        }
        if (i == 0) {
            this.V = true;
        }
        if (i == 1) {
            e30Var.f(',');
            e30Var.k();
            this.V = false;
        }
    }

    @Override // defpackage.ks, defpackage.m30
    public final void a(bt2 bt2Var) {
        bt2Var.getClass();
        e30 e30Var = this.Q;
        e30Var.l();
        e30Var.d();
        e30Var.f(this.S.f);
    }

    @Override // defpackage.ks, defpackage.ak0
    public final m30 b(bt2 bt2Var) {
        i71 i71Var;
        bt2Var.getClass();
        t61 t61Var = this.R;
        um3 um3VarP = v83.p(t61Var, bt2Var);
        char c = um3VarP.e;
        e30 e30Var = this.Q;
        e30Var.f(c);
        e30Var.a();
        String str = this.W;
        if (str != null) {
            String strB = this.X;
            if (strB == null) {
                strB = bt2Var.b();
            }
            e30Var.c();
            e30Var.j(str);
            e30Var.f(':');
            e30Var.k();
            A(strB);
            this.W = null;
            this.X = null;
        }
        if (this.S == um3VarP) {
            return this;
        }
        i71[] i71VarArr = this.T;
        return (i71VarArr == null || (i71Var = i71VarArr[um3VarP.ordinal()]) == null) ? new f13(e30Var, t61Var, um3VarP, i71VarArr) : i71Var;
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void c() {
        e30 e30Var = this.Q;
        e30Var.getClass();
        ((x8) e30Var.f).k("null");
    }

    @Override // defpackage.m30
    public final boolean d(bt2 bt2Var) {
        bt2Var.getClass();
        return this.U.a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    @Override // defpackage.ak0
    public final void e(y81 y81Var, Object obj) {
        String strL;
        y81Var.getClass();
        t61 t61Var = this.R;
        boolean z = y81Var instanceof p0;
        nx nxVar = t61Var.a.j;
        if (!z) {
            int iOrdinal = nxVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    mh0 mh0VarC = y81Var.getDescriptor().c();
                    if (o51.f(mh0VarC, u13.e) || o51.f(mh0VarC, u13.h)) {
                        strL = vd0.l(t61Var, y81Var.getDescriptor());
                    }
                } else if (iOrdinal != 2) {
                    b81.d();
                    return;
                }
            }
            strL = null;
        } else if (nxVar != nx.e) {
            strL = vd0.l(t61Var, y81Var.getDescriptor());
        } else {
            strL = null;
        }
        if (z) {
            p91.x(y81Var);
            obj.getClass();
            throw null;
        }
        if (strL != null) {
            vd0.j(t61Var, y81Var, y81Var, strL);
            vd0.k(y81Var.getDescriptor().c());
            String strB = y81Var.getDescriptor().b();
            this.W = strL;
            this.X = strB;
        }
        y81Var.serialize(this, obj);
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void g(double d) {
        if (this.V) {
            A(String.valueOf(d));
        } else {
            ((x8) this.Q.f).k(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw ce0.a(null, Double.valueOf(d));
        }
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void h(short s) {
        if (this.V) {
            A(String.valueOf((int) s));
        } else {
            this.Q.i(s);
        }
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void k(byte b) {
        if (this.V) {
            A(String.valueOf((int) b));
        } else {
            this.Q.e(b);
        }
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void l(boolean z) {
        if (this.V) {
            A(String.valueOf(z));
        } else {
            ((x8) this.Q.f).k(String.valueOf(z));
        }
    }

    @Override // defpackage.ks, defpackage.ak0
    public final ak0 m(bt2 bt2Var) {
        bt2Var.getClass();
        boolean zA = g13.a(bt2Var);
        um3 um3Var = this.S;
        t61 t61Var = this.R;
        e30 h30Var = this.Q;
        if (zA) {
            if (!(h30Var instanceof i30)) {
                h30Var = new i30((x8) h30Var.f, this.V);
            }
            return new f13(h30Var, t61Var, um3Var, null);
        }
        if (bt2Var.isInline() && bt2Var.equals(e71.a)) {
            if (!(h30Var instanceof h30)) {
                h30Var = new h30((x8) h30Var.f, this.V);
            }
            return new f13(h30Var, t61Var, um3Var, null);
        }
        if (this.W != null) {
            this.X = bt2Var.b();
        }
        return this;
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void q(int i) {
        if (this.V) {
            A(String.valueOf(i));
        } else {
            this.Q.g(i);
        }
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void s(float f) {
        if (this.V) {
            A(String.valueOf(f));
        } else {
            ((x8) this.Q.f).k(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw ce0.a(null, Float.valueOf(f));
        }
    }

    @Override // defpackage.ks, defpackage.m30
    public final void u(bt2 bt2Var, int i, y81 y81Var, Object obj) {
        bt2Var.getClass();
        y81Var.getClass();
        if (obj != null || this.U.e) {
            super.u(bt2Var, i, y81Var, obj);
        }
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void v(long j) {
        if (this.V) {
            A(String.valueOf(j));
        } else {
            this.Q.h(j);
        }
    }

    @Override // defpackage.ks, defpackage.ak0
    public final void x(char c) {
        A(String.valueOf(c));
    }
}
