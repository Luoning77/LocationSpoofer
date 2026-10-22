package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hb1 implements k20, u42, w20 {
    public static final xi2 W = new xi2("Undefined intrinsics block and it is required", 1);
    public static final cb1 X = new cb1();
    public static final kf Y = new kf(4);
    public boolean A;
    public er1 B;
    public d31 C;
    public xb0 D;
    public qa1 E;
    public aj3 F;
    public w30 G;
    public fb1 H;
    public fb1 I;
    public boolean J;
    public final tz1 K;
    public final lb1 L;
    public vb1 M;
    public xz1 N;
    public boolean O;
    public dv1 P;
    public dv1 Q;
    public xg R;
    public yg S;
    public boolean T;
    public int U;
    public boolean V;
    public final boolean e;
    public int f;
    public boolean g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public hb1 m;
    public int n;
    public final d31 o;
    public gy1 p;
    public boolean q;
    public hb1 r;
    public t42 s;
    public bj3 t;
    public int u;
    public boolean v;
    public boolean w;
    public es2 x;
    public boolean y;
    public final gy1 z;

    public hb1(int i, boolean z) {
        this.e = z;
        this.f = i;
        this.h = 9223372034707292159L;
        this.i = true;
        this.j = true;
        this.o = new d31(25, new gy1(new hb1[16]), new ye(this, 14));
        this.z = new gy1(new hb1[16]);
        this.A = true;
        this.B = W;
        this.D = kb1.a;
        this.E = qa1.e;
        this.F = X;
        w30.c.getClass();
        this.G = v30.b;
        fb1 fb1Var = fb1.g;
        this.H = fb1Var;
        this.I = fb1Var;
        this.K = new tz1(this);
        this.L = new lb1(this);
        this.O = true;
        this.P = av1.a;
    }

    public static void T(hb1 hb1Var, boolean z, int i) {
        hb1 hb1VarU;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (hb1Var.m == null) {
            p21.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        t42 t42Var = hb1Var.s;
        if (t42Var == null || hb1Var.v || hb1Var.e) {
            return;
        }
        ((db) t42Var).w(hb1Var, true, z, z2);
        if (z3) {
            ik1 ik1Var = hb1Var.L.q;
            ik1Var.getClass();
            lb1 lb1Var = ik1Var.j;
            hb1 hb1VarU2 = lb1Var.a.u();
            fb1 fb1Var = lb1Var.a.H;
            if (hb1VarU2 == null || fb1Var == fb1.g) {
                return;
            }
            while (hb1VarU2.H == fb1Var && (hb1VarU = hb1VarU2.u()) != null) {
                hb1VarU2 = hb1VarU;
            }
            int iOrdinal = fb1Var.ordinal();
            if (iOrdinal == 0) {
                if (hb1VarU2.m != null) {
                    T(hb1VarU2, z, 6);
                    return;
                } else {
                    V(hb1VarU2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                fo.n("Intrinsics isn't used by the parent");
            } else if (hb1VarU2.m != null) {
                hb1VarU2.R(z);
            } else {
                hb1VarU2.U(z);
            }
        }
    }

    public static void V(hb1 hb1Var, boolean z, int i) {
        t42 t42Var;
        hb1 hb1VarU;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (hb1Var.v || hb1Var.e || (t42Var = hb1Var.s) == null) {
            return;
        }
        ((db) t42Var).w(hb1Var, false, z, z2);
        if (z3) {
            lb1 lb1Var = hb1Var.L.p.j;
            hb1 hb1VarU2 = lb1Var.a.u();
            fb1 fb1Var = lb1Var.a.H;
            if (hb1VarU2 == null || fb1Var == fb1.g) {
                return;
            }
            while (hb1VarU2.H == fb1Var && (hb1VarU = hb1VarU2.u()) != null) {
                hb1VarU2 = hb1VarU;
            }
            int iOrdinal = fb1Var.ordinal();
            if (iOrdinal == 0) {
                V(hb1VarU2, z, 6);
            } else if (iOrdinal == 1) {
                hb1VarU2.U(z);
            } else {
                fo.n("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void W(hb1 hb1Var) {
        int i = gb1.a[hb1Var.L.d.ordinal()];
        lb1 lb1Var = hb1Var.L;
        if (i != 1) {
            b81.i(lb1Var.d, "Unexpected state ");
            return;
        }
        if (lb1Var.e) {
            T(hb1Var, true, 6);
            return;
        }
        if (lb1Var.f) {
            hb1Var.R(true);
        }
        if (hb1Var.q()) {
            V(hb1Var, true, 6);
        } else if (hb1Var.p()) {
            hb1Var.U(true);
        }
    }

    private final String j(hb1 hb1Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(hb1Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(e(0));
        sb.append(" Other tree: ");
        hb1 hb1Var2 = hb1Var.r;
        sb.append(hb1Var2 != null ? hb1Var2.e(0) : null);
        return sb.toString();
    }

    public final void A(int i, hb1 hb1Var) {
        if (hb1Var.r != null && hb1Var.s != null) {
            p21.c(j(hb1Var));
        }
        hb1Var.r = this;
        d31 d31Var = this.o;
        ((gy1) d31Var.f).a(i, hb1Var);
        ((ye) d31Var.g).invoke();
        N();
        if (hb1Var.e) {
            this.n++;
        }
        F();
        t42 t42Var = this.s;
        if (t42Var != null) {
            hb1Var.b(t42Var);
        }
        if (hb1Var.L.l > 0) {
            lb1 lb1Var = this.L;
            lb1Var.d(lb1Var.l + 1);
        }
        if (hb1Var.U > 0) {
            a0(this.U + 1);
        }
    }

    public final void B() {
        if (this.O) {
            tz1 tz1Var = this.K;
            xz1 xz1Var = tz1Var.c;
            xz1 xz1Var2 = tz1Var.d.w;
            this.N = null;
            while (!o51.f(xz1Var, xz1Var2)) {
                if ((xz1Var != null ? xz1Var.R : null) != null) {
                    this.N = xz1Var;
                    break;
                }
                xz1Var = xz1Var != null ? xz1Var.w : null;
            }
            this.O = false;
        }
        xz1 xz1Var3 = this.N;
        if (xz1Var3 != null && xz1Var3.R == null) {
            throw az2.e("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (xz1Var3 != null) {
            xz1Var3.A1();
            return;
        }
        hb1 hb1VarU = u();
        if (hb1VarU != null) {
            hb1VarU.B();
            return;
        }
        t42 t42Var = this.s;
        if (t42Var != null) {
            ((db) t42Var).invalidate();
        }
    }

    public final void C() {
        tz1 tz1Var = this.K;
        xz1 xz1Var = tz1Var.d;
        v21 v21Var = tz1Var.c;
        while (xz1Var != v21Var) {
            xz1Var.getClass();
            bb1 bb1Var = (bb1) xz1Var;
            s42 s42Var = bb1Var.R;
            if (s42Var != null) {
                ((nw0) s42Var).c();
            }
            xz1Var = bb1Var.v;
        }
        s42 s42Var2 = v21Var.R;
        if (s42Var2 != null) {
            ((nw0) s42Var2).c();
        }
    }

    public final void D() {
        if (this.e) {
            hb1 hb1VarU = u();
            if (hb1VarU != null) {
                hb1VarU.D();
                return;
            }
            return;
        }
        if (this.m != null) {
            T(this, false, 7);
        } else {
            V(this, false, 7);
        }
    }

    public final void E() {
        if (this.y) {
            return;
        }
        if (this.K.b.j != null || this.Q != null) {
            this.w = true;
            return;
        }
        es2 es2Var = this.x;
        this.y = true;
        we2 we2Var = new we2();
        we2Var.e = new es2();
        v42 snapshotObserver = ((db) kb1.a(this)).getSnapshotObserver();
        ta taVar = new ta(7, this, we2Var);
        snapshotObserver.getClass();
        snapshotObserver.a.c(this, ik0.w, taVar);
        this.y = false;
        this.x = (es2) we2Var.e;
        this.w = false;
        db dbVar = (db) kb1.a(this);
        dbVar.getSemanticsOwner().b(this, es2Var);
        dbVar.y();
    }

    public final void F() {
        hb1 hb1Var;
        if (this.n > 0) {
            this.q = true;
        }
        if (!this.e || (hb1Var = this.r) == null) {
            return;
        }
        hb1Var.F();
    }

    public final boolean G() {
        return this.s != null;
    }

    public final boolean H() {
        return this.L.p.w;
    }

    public final Boolean I() {
        ik1 ik1Var = this.L.q;
        if (ik1Var != null) {
            return Boolean.valueOf(ik1Var.u != gk1.g);
        }
        return null;
    }

    public final void J() {
        hb1 hb1VarU;
        if (this.H == fb1.g) {
            d();
        }
        ik1 ik1Var = this.L.q;
        ik1Var.getClass();
        boolean z = true;
        try {
            ik1Var.k = true;
            if (!ik1Var.p) {
                p21.c("replace() called on item that was not placed");
            }
            ik1Var.F = false;
            if (ik1Var.u == gk1.g) {
                z = false;
            }
            ik1Var.W0(ik1Var.s, ik1Var.t);
            if (z && !ik1Var.F && (hb1VarU = ik1Var.j.a.u()) != null) {
                hb1VarU.R(false);
            }
        } finally {
            ik1Var.k = false;
        }
    }

    public final void K(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            d31 d31Var = this.o;
            gy1 gy1Var = (gy1) d31Var.f;
            ye yeVar = (ye) d31Var.g;
            Object objK = gy1Var.k(i5);
            yeVar.invoke();
            ((gy1) d31Var.f).a(i6, (hb1) objK);
            yeVar.invoke();
        }
        N();
        F();
        D();
    }

    public final void L(hb1 hb1Var) {
        if (hb1Var.L.l > 0) {
            lb1 lb1Var = this.L;
            lb1Var.d(lb1Var.l - 1);
        }
        if (this.s != null) {
            hb1Var.g();
        }
        hb1Var.r = null;
        if (hb1Var.U > 0) {
            a0(this.U - 1);
        }
        hb1Var.K.d.w = null;
        if (hb1Var.e) {
            this.n--;
            gy1 gy1Var = (gy1) hb1Var.o.f;
            Object[] objArr = gy1Var.e;
            int i = gy1Var.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((hb1) objArr[i2]).K.d.w = null;
            }
        }
        F();
        N();
    }

    public final void M(xz1 xz1Var) {
        t42 t42Var = this.s;
        re2 rectManager = t42Var != null ? ((db) t42Var).getRectManager() : null;
        lb1 lb1Var = this.L;
        boolean z = lb1Var.d != db1.i || q() || p();
        if (this.k && rectManager != null) {
            if (xz1Var == this.K.d) {
                this.j = true;
                if (!z) {
                    rectManager.f(this);
                }
            } else {
                this.i = true;
                gy1 gy1VarY = y();
                Object[] objArr = gy1VarY.e;
                int i = gy1VarY.g;
                for (int i2 = 0; i2 < i; i2++) {
                    hb1 hb1Var = (hb1) objArr[i2];
                    hb1Var.j = true;
                    if (!z) {
                        rectManager.f(hb1Var);
                    }
                }
                if (this.k) {
                    rectManager.e = true;
                    q01 q01Var = rectManager.b;
                    int i3 = this.f & 33554431;
                    long[] jArr = (long[]) q01Var.c;
                    int i4 = q01Var.b;
                    for (int i5 = 0; i5 < jArr.length - 2 && i5 < i4; i5 += 3) {
                        int i6 = i5 + 2;
                        long j = jArr[i6];
                        if ((((int) j) & 33554431) == i3) {
                            jArr[i6] = (((j >> 63) & 1) << 60) | j;
                            break;
                        }
                    }
                }
                rectManager.i();
            }
        }
        lb1Var.p.a1();
    }

    public final void N() {
        if (!this.e) {
            this.A = true;
            return;
        }
        hb1 hb1VarU = u();
        if (hb1VarU != null) {
            hb1VarU.N();
        }
    }

    public final void O() {
        d31 d31Var = this.o;
        int i = ((gy1) d31Var.f).g;
        while (true) {
            i--;
            gy1 gy1Var = (gy1) d31Var.f;
            if (-1 >= i) {
                gy1Var.g();
                ((ye) d31Var.g).invoke();
                return;
            }
            L((hb1) gy1Var.e[i]);
        }
    }

    public final void P(int i, int i2) {
        if (i2 < 0) {
            p21.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            d31 d31Var = this.o;
            L((hb1) ((gy1) d31Var.f).e[i3]);
            Object objK = ((gy1) d31Var.f).k(i3);
            ((ye) d31Var.g).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void Q() {
        hb1 hb1VarU;
        if (this.H == fb1.g) {
            d();
        }
        dr1 dr1Var = this.L.p;
        lb1 lb1Var = dr1Var.j;
        try {
            dr1Var.k = true;
            if (!dr1Var.o) {
                p21.c("replace called on unplaced item");
            }
            boolean z = dr1Var.w;
            dr1Var.V0(dr1Var.r, dr1Var.t, dr1Var.s);
            if (z && !dr1Var.J && (hb1VarU = lb1Var.a.u()) != null) {
                hb1VarU.U(false);
            }
            dr1Var.k = false;
        } catch (Throwable th) {
            try {
                lb1Var.a.Y(th);
                throw null;
            } catch (Throwable th2) {
                dr1Var.k = false;
                throw th2;
            }
        }
    }

    public final void R(boolean z) {
        t42 t42Var;
        if (this.e || (t42Var = this.s) == null) {
            return;
        }
        ((db) t42Var).x(this, true, z);
    }

    @Override // defpackage.u42
    public final boolean S() {
        return G();
    }

    public final void U(boolean z) {
        t42 t42Var;
        if (this.e || (t42Var = this.s) == null) {
            return;
        }
        ((db) t42Var).x(this, false, z);
    }

    public final void X() {
        gy1 gy1VarY = y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            hb1 hb1Var = (hb1) objArr[i2];
            fb1 fb1Var = hb1Var.I;
            hb1Var.H = fb1Var;
            if (fb1Var != fb1.g) {
                hb1Var.X();
            }
        }
    }

    public final void Y(Throwable th) throws Throwable {
        w30 w30Var = this.G;
        hh0 hh0Var = s30.a;
        l72 l72Var = (l72) w30Var;
        l72Var.getClass();
        r30 r30Var = (r30) ji2.P(l72Var, hh0Var);
        if (r30Var == null) {
            throw th;
        }
        o51.H(th, new m5(10, r30Var, this));
        throw th;
    }

    public final void Z(xb0 xb0Var) {
        if (o51.f(this.D, xb0Var)) {
            return;
        }
        this.D = xb0Var;
        D();
        hb1 hb1VarU = u();
        if (hb1VarU != null) {
            hb1VarU.B();
        } else {
            t42 t42Var = this.s;
            if (t42Var != null) {
                ((db) t42Var).invalidate();
            }
        }
        C();
        for (cv1 cv1Var = this.K.f; cv1Var != null; cv1Var = cv1Var.j) {
            cv1Var.c();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5381. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void a(defpackage.dv1 r20) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb1.a(dv1):void");
    }

    public final void a0(int i) {
        hb1 hb1VarU;
        hb1 hb1VarU2;
        int i2 = this.U;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (hb1VarU2 = u()) != null) {
                hb1VarU2.a0(hb1VarU2.U + 1);
            }
            if (i == 0 && this.U > 0 && (hb1VarU = u()) != null) {
                hb1VarU.a0(hb1VarU.U - 1);
            }
            this.U = i;
        }
    }

    public final void b(t42 t42Var) {
        hb1 hb1Var;
        es2 es2VarW;
        if (this.s != null) {
            p21.c("Cannot attach " + this + " as it already is attached.  Tree: " + e(0));
        }
        hb1 hb1Var2 = this.r;
        if (hb1Var2 != null && !o51.f(hb1Var2.s, t42Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(t42Var);
            sb.append(") than the parent's owner(");
            hb1 hb1VarU = u();
            sb.append(hb1VarU != null ? hb1VarU.s : null);
            sb.append("). This tree: ");
            sb.append(e(0));
            sb.append(" Parent tree: ");
            hb1 hb1Var3 = this.r;
            sb.append(hb1Var3 != null ? hb1Var3.e(0) : null);
            p21.c(sb.toString());
        }
        hb1 hb1VarU2 = u();
        lb1 lb1Var = this.L;
        if (hb1VarU2 == null) {
            lb1Var.p.w = true;
            ((db) t42Var).getRectManager().f(this);
            ik1 ik1Var = lb1Var.q;
            if (ik1Var != null) {
                ik1Var.u = gk1.e;
            }
        }
        tz1 tz1Var = this.K;
        tz1Var.d.w = hb1VarU2 != null ? hb1VarU2.K.c : null;
        this.s = t42Var;
        this.u = (hb1VarU2 != null ? hb1VarU2.u : -1) + 1;
        dv1 dv1Var = this.Q;
        if (dv1Var != null) {
            a(dv1Var);
        }
        this.Q = null;
        ((db) t42Var).getLayoutNodes().h(this.f, this);
        if (this.l) {
            b0(this);
        } else {
            hb1 hb1Var4 = this.r;
            if (hb1Var4 == null || (hb1Var = hb1Var4.m) == null) {
                hb1Var = this.m;
            }
            b0(hb1Var);
            if (this.m == null && tz1Var.c(512)) {
                b0(this);
            }
        }
        if (!this.V) {
            for (cv1 cv1Var = tz1Var.f; cv1Var != null; cv1Var = cv1Var.j) {
                cv1Var.c1();
            }
        }
        gy1 gy1Var = (gy1) this.o.f;
        Object[] objArr = gy1Var.e;
        int i = gy1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((hb1) objArr[i2]).b(t42Var);
        }
        if (!this.V) {
            tz1Var.e();
        }
        D();
        if (hb1VarU2 != null) {
            hb1VarU2.D();
        }
        xg xgVar = this.R;
        if (xgVar != null) {
            xgVar.invoke(t42Var);
        }
        lb1Var.j();
        if (!this.V && tz1Var.c(8)) {
            E();
        }
        ea eaVar = ((db) t42Var).R;
        if (eaVar == null || (es2VarW = w()) == null || !es2VarW.e.b(os2.r)) {
            return;
        }
        eaVar.l.a(this.f);
        eaVar.e.r(eaVar.g, this.f, true);
    }

    public final void b0(hb1 hb1Var) {
        if (o51.f(hb1Var, this.m)) {
            return;
        }
        this.m = hb1Var;
        lb1 lb1Var = this.L;
        if (hb1Var != null) {
            if (lb1Var.q == null) {
                lb1Var.q = new ik1(lb1Var);
            }
            tz1 tz1Var = this.K;
            xz1 xz1Var = tz1Var.c.v;
            for (xz1 xz1Var2 = tz1Var.d; !o51.f(xz1Var2, xz1Var) && xz1Var2 != null; xz1Var2 = xz1Var2.v) {
                xz1Var2.o1();
            }
        } else {
            lb1Var.q = null;
            lb1Var.f = false;
            lb1Var.e = false;
        }
        D();
    }

    public final void c() {
        this.I = this.H;
        fb1 fb1Var = fb1.g;
        this.H = fb1Var;
        gy1 gy1VarY = y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            hb1 hb1Var = (hb1) objArr[i2];
            if (hb1Var.H != fb1Var) {
                hb1Var.c();
            }
        }
    }

    public final void c0(er1 er1Var) {
        if (o51.f(this.B, er1Var)) {
            return;
        }
        this.B = er1Var;
        d31 d31Var = this.C;
        if (d31Var != null) {
            ((w52) d31Var.g).setValue(er1Var);
        }
        D();
    }

    public final void d() {
        this.I = this.H;
        this.H = fb1.g;
        gy1 gy1VarY = y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            hb1 hb1Var = (hb1) objArr[i2];
            if (hb1Var.H == fb1.f) {
                hb1Var.d();
            }
        }
    }

    public final void d0(dv1 dv1Var) {
        if (this.e && this.P != av1.a) {
            p21.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.V) {
            p21.a("modifier is updated when deactivated");
        }
        if (!G()) {
            this.Q = dv1Var;
            return;
        }
        a(dv1Var);
        if (this.w) {
            E();
        }
    }

    public final String e(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        gy1 gy1VarY = y();
        Object[] objArr = gy1VarY.e;
        int i3 = gy1VarY.g;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((hb1) objArr[i4]).e(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [cv1] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [cv1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void e0(aj3 aj3Var) {
        if (o51.f(this.F, aj3Var)) {
            return;
        }
        this.F = aj3Var;
        cv1 cv1Var = this.K.f;
        if ((cv1Var.h & 16) != 0) {
            while (cv1Var != null) {
                if ((cv1Var.g & 16) != 0) {
                    ?? J = cv1Var;
                    ?? gy1Var = 0;
                    while (J != 0) {
                        if (J instanceof ba2) {
                            ((ba2) J).D0();
                        } else if ((J.g & 16) != 0 && (J instanceof lb0)) {
                            cv1 cv1Var2 = ((lb0) J).t;
                            int i = 0;
                            J = J;
                            gy1Var = gy1Var;
                            while (cv1Var2 != null) {
                                if ((cv1Var2.g & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        gy1Var = gy1Var;
                                        J = cv1Var2;
                                    } else {
                                        if (gy1Var == 0) {
                                            gy1Var = new gy1(new cv1[16]);
                                        }
                                        if (J != 0) {
                                            gy1Var.b(J);
                                            J = 0;
                                        }
                                        gy1Var.b(cv1Var2);
                                    }
                                }
                                cv1Var2 = cv1Var2.j;
                                J = J;
                                gy1Var = gy1Var;
                            }
                            if (i == 1) {
                            }
                        }
                        J = xp1.J(gy1Var);
                    }
                }
                if ((cv1Var.h & 16) == 0) {
                    return;
                } else {
                    cv1Var = cv1Var.j;
                }
            }
        }
    }

    @Override // defpackage.k20
    public final void f() {
        bj3 bj3Var = this.t;
        if (bj3Var != null) {
            bj3Var.f();
        }
        vb1 vb1Var = this.M;
        if (vb1Var != null) {
            vb1Var.f();
        }
        tz1 tz1Var = this.K;
        xz1 xz1Var = tz1Var.c.v;
        for (xz1 xz1Var2 = tz1Var.d; !o51.f(xz1Var2, xz1Var) && xz1Var2 != null; xz1Var2 = xz1Var2.v) {
            xz1Var2.F1();
        }
    }

    public final void f0() {
        if (this.n <= 0 || !this.q) {
            return;
        }
        this.q = false;
        gy1 gy1Var = this.p;
        if (gy1Var == null) {
            gy1Var = new gy1(new hb1[16]);
            this.p = gy1Var;
        }
        gy1Var.g();
        gy1 gy1Var2 = (gy1) this.o.f;
        Object[] objArr = gy1Var2.e;
        int i = gy1Var2.g;
        for (int i2 = 0; i2 < i; i2++) {
            hb1 hb1Var = (hb1) objArr[i2];
            if (hb1Var.e) {
                gy1Var.c(gy1Var.g, hb1Var.y());
            } else {
                gy1Var.b(hb1Var);
            }
        }
        lb1 lb1Var = this.L;
        lb1Var.p.D = true;
        ik1 ik1Var = lb1Var.q;
        if (ik1Var != null) {
            ik1Var.x = true;
        }
    }

    public final void g() {
        ib1 ib1Var;
        t42 t42Var = this.s;
        if (t42Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            hb1 hb1VarU = u();
            sb.append(hb1VarU != null ? hb1VarU.e(0) : null);
            p21.d(sb.toString());
            fo.d();
            return;
        }
        hb1 hb1VarU2 = u();
        lb1 lb1Var = this.L;
        if (hb1VarU2 != null) {
            hb1VarU2.B();
            hb1VarU2.D();
            dr1 dr1Var = lb1Var.p;
            fb1 fb1Var = fb1.g;
            dr1Var.p = fb1Var;
            ik1 ik1Var = lb1Var.q;
            if (ik1Var != null) {
                ik1Var.n = fb1Var;
            }
        }
        ib1 ib1Var2 = lb1Var.p.B;
        ib1Var2.b = true;
        ib1Var2.c = false;
        ib1Var2.e = false;
        ib1Var2.d = false;
        ib1Var2.f = false;
        ib1Var2.g = false;
        ib1Var2.h = null;
        ik1 ik1Var2 = lb1Var.q;
        if (ik1Var2 != null && (ib1Var = ik1Var2.v) != null) {
            ib1Var.b = true;
            ib1Var.c = false;
            ib1Var.e = false;
            ib1Var.d = false;
            ib1Var.f = false;
            ib1Var.g = false;
            ib1Var.h = null;
        }
        tz1 tz1Var = this.K;
        cv1 cv1Var = tz1Var.e;
        xz1 xz1Var = tz1Var.c.v;
        for (xz1 xz1Var2 = tz1Var.d; !o51.f(xz1Var2, xz1Var) && xz1Var2 != null; xz1Var2 = xz1Var2.v) {
            xz1Var2.L1();
            if (xz1Var2.s.H()) {
                xz1Var2.G1();
            }
        }
        yg ygVar = this.S;
        if (ygVar != null) {
            ygVar.invoke(t42Var);
        }
        for (cv1 cv1Var2 = cv1Var; cv1Var2 != null; cv1Var2 = cv1Var2.i) {
            if (cv1Var2.r) {
                cv1Var2.j1();
            }
        }
        this.v = true;
        gy1 gy1Var = (gy1) this.o.f;
        Object[] objArr = gy1Var.e;
        int i = gy1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((hb1) objArr[i2]).g();
        }
        this.v = false;
        while (cv1Var != null) {
            if (cv1Var.r) {
                cv1Var.d1();
            }
            cv1Var = cv1Var.i;
        }
        db dbVar = (db) t42Var;
        dbVar.getLayoutNodes().g(this.f);
        br1 br1Var = dbVar.d0;
        gn gnVar = br1Var.b;
        ((t1) gnVar.a).z(this);
        ((t1) gnVar.b).z(this);
        ((t1) gnVar.c).z(this);
        ((gy1) br1Var.e.f).j(this);
        dbVar.S = true;
        ea eaVar = dbVar.R;
        if (eaVar != null && eaVar.l.e(this.f)) {
            eaVar.e.r(eaVar.g, this.f, false);
        }
        dbVar.getRectManager().g(this);
        this.s = null;
        b0(null);
        this.u = 0;
        dr1 dr1Var2 = lb1Var.p;
        dr1Var2.m = Integer.MAX_VALUE;
        dr1Var2.l = Integer.MAX_VALUE;
        dr1Var2.w = false;
        ik1 ik1Var3 = lb1Var.q;
        if (ik1Var3 != null) {
            ik1Var3.m = Integer.MAX_VALUE;
            ik1Var3.l = Integer.MAX_VALUE;
            ik1Var3.u = gk1.g;
        }
        if (tz1Var.c(8)) {
            es2 es2Var = this.x;
            this.x = null;
            this.w = false;
            dbVar.getSemanticsOwner().b(this, es2Var);
            dbVar.y();
        }
    }

    @Override // defpackage.k20
    public final void h() {
        ea eaVar;
        bj3 bj3Var = this.t;
        if (bj3Var != null) {
            bj3Var.h();
        }
        vb1 vb1Var = this.M;
        if (vb1Var != null) {
            vb1Var.i(true);
        }
        this.V = true;
        cv1 cv1Var = this.K.e;
        for (cv1 cv1Var2 = cv1Var; cv1Var2 != null; cv1Var2 = cv1Var2.i) {
            if (cv1Var2.r) {
                cv1Var2.h1();
            }
        }
        for (cv1 cv1Var3 = cv1Var; cv1Var3 != null; cv1Var3 = cv1Var3.i) {
            if (cv1Var3.r) {
                cv1Var3.j1();
            }
        }
        while (cv1Var != null) {
            if (cv1Var.r) {
                cv1Var.d1();
            }
            cv1Var = cv1Var.i;
        }
        if (G()) {
            this.x = null;
            this.w = false;
        }
        t42 t42Var = this.s;
        if (t42Var == null || (eaVar = ((db) t42Var).R) == null || !eaVar.l.e(this.f)) {
            return;
        }
        eaVar.e.r(eaVar.g, this.f, false);
    }

    public final void i(vv vvVar, kw0 kw0Var) throws Throwable {
        try {
            this.K.d.m1(vvVar, kw0Var);
        } catch (Throwable th) {
            Y(th);
            throw null;
        }
    }

    public final void k() {
        if (this.m != null) {
            T(this, false, 5);
        } else {
            V(this, false, 5);
        }
        dr1 dr1Var = this.L.p;
        l50 l50Var = dr1Var.n ? new l50(dr1Var.h) : null;
        t42 t42Var = this.s;
        if (l50Var != null) {
            if (t42Var != null) {
                ((db) t42Var).s(this, l50Var.a);
            }
        } else if (t42Var != null) {
            ((db) t42Var).r(true);
        }
    }

    public final List l() {
        ik1 ik1Var = this.L.q;
        ik1Var.getClass();
        gy1 gy1Var = ik1Var.w;
        lb1 lb1Var = ik1Var.j;
        lb1Var.a.n();
        if (!ik1Var.x) {
            return gy1Var.f();
        }
        hb1 hb1Var = lb1Var.a;
        gy1 gy1VarY = hb1Var.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            hb1 hb1Var2 = (hb1) objArr[i2];
            if (gy1Var.g <= i2) {
                ik1 ik1Var2 = hb1Var2.L.q;
                ik1Var2.getClass();
                gy1Var.b(ik1Var2);
            } else {
                ik1 ik1Var3 = hb1Var2.L.q;
                ik1Var3.getClass();
                Object[] objArr2 = gy1Var.e;
                Object obj = objArr2[i2];
                objArr2[i2] = ik1Var3;
            }
        }
        gy1Var.l(((gy1) ((qx1) hb1Var.n()).f).g, gy1Var.g);
        ik1Var.x = false;
        return gy1Var.f();
    }

    public final List m() {
        return this.L.p.L0();
    }

    public final List n() {
        return y().f();
    }

    public final List o() {
        return ((gy1) this.o.f).f();
    }

    public final boolean p() {
        return this.L.p.z;
    }

    public final boolean q() {
        return this.L.p.y;
    }

    public final fb1 r() {
        return this.L.p.p;
    }

    public final fb1 s() {
        fb1 fb1Var;
        ik1 ik1Var = this.L.q;
        return (ik1Var == null || (fb1Var = ik1Var.n) == null) ? fb1.g : fb1Var;
    }

    public final d31 t() {
        d31 d31Var = this.C;
        if (d31Var != null) {
            return d31Var;
        }
        d31 d31Var2 = new d31(this, this.B);
        this.C = d31Var2;
        return d31Var2;
    }

    public final String toString() {
        return ke0.M(this) + " children: " + ((gy1) ((qx1) n()).f).g + " measurePolicy: " + this.B + " deactivated: " + this.V;
    }

    public final hb1 u() {
        hb1 hb1Var = this.r;
        while (hb1Var != null && hb1Var.e) {
            hb1Var = hb1Var.r;
        }
        return hb1Var;
    }

    public final int v() {
        return this.L.p.m;
    }

    public final es2 w() {
        if (G() && !this.V && this.K.c(8)) {
            return this.x;
        }
        return null;
    }

    public final gy1 x() {
        boolean z = this.A;
        gy1 gy1Var = this.z;
        if (z) {
            gy1Var.g();
            gy1Var.c(gy1Var.g, y());
            Arrays.sort(gy1Var.e, 0, gy1Var.g, Y);
            this.A = false;
        }
        return gy1Var;
    }

    public final gy1 y() {
        f0();
        if (this.n == 0) {
            return (gy1) this.o.f;
        }
        gy1 gy1Var = this.p;
        gy1Var.getClass();
        return gy1Var;
    }

    public final void z(long j, zx0 zx0Var, int i, boolean z) {
        tz1 tz1Var = this.K;
        xz1 xz1Var = tz1Var.d;
        ah2 ah2Var = xz1.S;
        tz1Var.d.y1(xz1.V, xz1Var.q1(j, true), zx0Var, i, z);
    }

    public hb1(int i) {
        this(gs2.a.addAndGet(1), (i & 1) == 0);
    }
}
