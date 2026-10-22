package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class br1 {
    public final hb1 a;
    public boolean c;
    public boolean d;
    public l50 h;
    public final gn b = new gn(3);
    public final d31 e = new d31(27);
    public final gy1 f = new gy1(new hb1[16]);
    public final gy1 g = new gy1(new ar1[16]);

    public br1(hb1 hb1Var) {
        this.a = hb1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean b(hb1 hb1Var, l50 l50Var) throws Throwable {
        boolean zA1;
        hb1 hb1Var2 = hb1Var.m;
        lb1 lb1Var = hb1Var.L;
        if (hb1Var2 == null) {
            return false;
        }
        if (l50Var == null) {
            ik1 ik1Var = lb1Var.q;
            l50 l50Var2 = ik1Var != null ? ik1Var.r : null;
            if (l50Var2 == null || hb1Var2 == null) {
                zA1 = false;
            } else {
                ik1Var.getClass();
                zA1 = ik1Var.a1(l50Var2.a);
            }
        } else if (hb1Var2 != null) {
            ik1 ik1Var2 = lb1Var.q;
            ik1Var2.getClass();
            zA1 = ik1Var2.a1(l50Var.a);
        } else {
            zA1 = false;
        }
        hb1 hb1VarU = hb1Var.u();
        if (zA1 && hb1VarU != null) {
            if (hb1VarU.m == null) {
                hb1.V(hb1VarU, false, 3);
                return zA1;
            }
            if (hb1Var.s() == fb1.e) {
                hb1.T(hb1VarU, false, 3);
                return zA1;
            }
            if (hb1Var.s() == fb1.f) {
                hb1VarU.R(false);
            }
        }
        return zA1;
    }

    public static boolean c(hb1 hb1Var, l50 l50Var) throws Throwable {
        boolean zW0;
        fb1 fb1Var = fb1.g;
        if (l50Var != null) {
            if (hb1Var.H == fb1Var) {
                hb1Var.c();
            }
            zW0 = hb1Var.L.p.W0(l50Var.a);
        } else {
            dr1 dr1Var = hb1Var.L.p;
            l50 l50Var2 = dr1Var.n ? new l50(dr1Var.h) : null;
            if (l50Var2 != null) {
                if (hb1Var.H == fb1Var) {
                    hb1Var.c();
                }
                zW0 = hb1Var.L.p.W0(l50Var2.a);
            } else {
                hb1Var.getClass();
                zW0 = false;
            }
        }
        hb1 hb1VarU = hb1Var.u();
        if (zW0 && hb1VarU != null) {
            if (hb1Var.r() == fb1.e) {
                hb1.V(hb1VarU, false, 3);
                return zW0;
            }
            if (hb1Var.r() == fb1.f) {
                hb1VarU.U(false);
            }
        }
        return zW0;
    }

    public static boolean h(hb1 hb1Var) {
        ik1 ik1Var;
        ib1 ib1Var;
        if (hb1Var.L.e) {
            return (hb1Var.s() == fb1.g && ((ik1Var = hb1Var.L.q) == null || (ib1Var = ik1Var.v) == null || !ib1Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(hb1 hb1Var) {
        if (!hb1Var.q()) {
            return false;
        }
        do {
            if (hb1Var.r() == fb1.g && !hb1Var.L.p.B.e()) {
                hb1 hb1VarU = hb1Var.u();
                if ((hb1VarU != null ? hb1VarU.L.d : null) != db1.e) {
                    return false;
                }
            }
            hb1Var = hb1Var.u();
            if (hb1Var == null) {
                return false;
            }
        } while (!hb1Var.H());
        return true;
    }

    public static boolean j(hb1 hb1Var) {
        ik1 ik1Var;
        ib1 ib1Var;
        lb1 lb1Var = hb1Var.L;
        return hb1Var.H() || lb1Var.p.x || i(hb1Var) || o51.f(hb1Var.I(), Boolean.TRUE) || h(hb1Var) || lb1Var.p.B.e() || !((ik1Var = lb1Var.q) == null || (ib1Var = ik1Var.v) == null || !ib1Var.e());
    }

    public final void a(boolean z) {
        d31 d31Var = this.e;
        gy1 gy1Var = (gy1) d31Var.f;
        if (z) {
            hb1 hb1Var = this.a;
            if (hb1Var.U > 0) {
                gy1Var.g();
                gy1Var.b(hb1Var);
                hb1Var.T = true;
            }
        }
        if (gy1Var.g != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                d31Var.p();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void d() {
        gy1 gy1Var = this.g;
        int i = gy1Var.g;
        if (i != 0) {
            Object[] objArr = gy1Var.e;
            for (int i2 = 0; i2 < i; i2++) {
                ar1 ar1Var = (ar1) objArr[i2];
                if (ar1Var.a.G()) {
                    boolean z = ar1Var.b;
                    hb1 hb1Var = ar1Var.a;
                    boolean z2 = ar1Var.c;
                    if (z) {
                        hb1.T(hb1Var, z2, 2);
                    } else {
                        hb1.V(hb1Var, z2, 2);
                    }
                }
            }
            gy1Var.g();
        }
    }

    public final void e(hb1 hb1Var) {
        gy1 gy1VarY = hb1Var.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            hb1 hb1Var2 = (hb1) objArr[i2];
            if (o51.f(hb1Var2.I(), Boolean.TRUE) && !hb1Var2.V) {
                if (this.b.b(hb1Var2)) {
                    hb1Var2.J();
                }
                e(hb1Var2);
            }
        }
    }

    public final void f(hb1 hb1Var, boolean z) {
        if (!this.c) {
            p21.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? hb1Var.L.e : hb1Var.q()) {
            p21.a("node not yet measured");
        }
        g(hb1Var, z);
    }

    public final void g(hb1 hb1Var, boolean z) throws Throwable {
        ik1 ik1Var;
        ib1 ib1Var;
        gy1 gy1VarY = hb1Var.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            hb1 hb1Var2 = (hb1) objArr[i2];
            fb1 fb1Var = fb1.e;
            if ((!z && (hb1Var2.r() == fb1Var || hb1Var2.L.p.B.e())) || (z && (hb1Var2.s() == fb1Var || ((ik1Var = hb1Var2.L.q) != null && (ib1Var = ik1Var.v) != null && ib1Var.e())))) {
                boolean zB = vd0.B(hb1Var2);
                lb1 lb1Var = hb1Var2.L;
                if (zB && !z) {
                    if (lb1Var.e && this.b.b(hb1Var2)) {
                        o(hb1Var2, true);
                    } else {
                        f(hb1Var2, true);
                    }
                }
                if (z ? lb1Var.e : hb1Var2.q()) {
                    o(hb1Var2, z);
                }
                if (!(z ? lb1Var.e : hb1Var2.q())) {
                    g(hb1Var2, z);
                }
            }
        }
        if (z ? hb1Var.L.e : hb1Var.q()) {
            o(hb1Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [cv1] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [cv1] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [gy1] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [gy1] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final boolean k(sa saVar) {
        boolean z;
        ?? J;
        boolean z2;
        hb1 hb1Var;
        boolean z3;
        boolean zO;
        gn gnVar = this.b;
        t1 t1Var = (t1) gnVar.a;
        hb1 hb1Var2 = this.a;
        if (!hb1Var2.G()) {
            p21.a("performMeasureAndLayout called with unattached root");
        }
        if (!hb1Var2.H()) {
            p21.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            p21.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (this.h != null) {
            this.c = true;
            this.d = true;
            try {
                if (gnVar.v()) {
                    z = false;
                    while (true) {
                        t1 t1Var2 = (t1) gnVar.c;
                        ry2 ry2Var = (ry2) t1Var2.f;
                        t1 t1Var3 = (t1) gnVar.b;
                        ry2 ry2Var2 = (ry2) t1Var3.f;
                        if (!((ry2) t1Var.f).isEmpty()) {
                            hb1Var = (hb1) ((ry2) t1Var.f).first();
                            t1Var.z(hb1Var);
                            z3 = hb1Var.m != null;
                            z2 = false;
                        } else if (!ry2Var2.isEmpty()) {
                            hb1Var = (hb1) ry2Var2.first();
                            t1Var3.z(hb1Var);
                            z3 = hb1Var.m != null;
                            z2 = true;
                        } else {
                            if (ry2Var.isEmpty()) {
                                break;
                            }
                            hb1 hb1Var3 = (hb1) ry2Var.first();
                            t1Var2.z(hb1Var3);
                            z2 = true;
                            hb1Var = hb1Var3;
                            z3 = false;
                        }
                        if (z2) {
                            zO = n(hb1Var, z3);
                        } else {
                            zO = o(hb1Var, z3);
                            if (hb1Var.L.f) {
                                gnVar.a(hb1Var, w51.f);
                            }
                            if (hb1Var.p()) {
                                gnVar.a(hb1Var, w51.h);
                            }
                        }
                        if (hb1Var == hb1Var2 && zO) {
                            z = true;
                        }
                    }
                    if (saVar != null) {
                        saVar.invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.c = false;
                    this.d = false;
                    throw th2;
                }
            }
        } else {
            z = false;
        }
        gy1 gy1Var = this.f;
        Object[] objArr = gy1Var.e;
        int i2 = gy1Var.g;
        int i3 = 0;
        while (i3 < i2) {
            tz1 tz1Var = ((hb1) objArr[i3]).K;
            v21 v21Var = tz1Var.c;
            boolean zG = yz1.g(4194304);
            cv1 cv1Var = v21Var.X;
            if (zG || (cv1Var = cv1Var.i) != null) {
                ah2 ah2Var = xz1.S;
                cv1 cv1VarV1 = v21Var.v1(zG);
                while (cv1VarV1 != null && (cv1VarV1.h & 4194304) != 0) {
                    if ((cv1VarV1.g & 4194304) != 0) {
                        ?? r12 = cv1VarV1;
                        ?? gy1Var2 = 0;
                        while (r12 != 0) {
                            if (r12 instanceof na1) {
                                ((na1) r12).G(tz1Var.c);
                            } else {
                                if ((r12.g & 4194304) != 0 && (r12 instanceof lb0)) {
                                    cv1 cv1Var2 = ((lb0) r12).t;
                                    int i4 = i;
                                    while (cv1Var2 != null) {
                                        if ((cv1Var2.g & 4194304) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                J = r12;
                                                gy1Var2 = gy1Var2;
                                                gy1Var2 = gy1Var2;
                                                J = cv1Var2;
                                            } else {
                                                if (gy1Var2 == 0) {
                                                    gy1Var2 = new gy1(new cv1[16]);
                                                }
                                                if (J != 0) {
                                                    gy1Var2.b(J);
                                                    J = 0;
                                                }
                                                gy1Var2.b(cv1Var2);
                                            }
                                        } else {
                                            J = r12;
                                            gy1Var2 = gy1Var2;
                                        }
                                        cv1Var2 = cv1Var2.j;
                                        J = J;
                                        gy1Var2 = gy1Var2;
                                    }
                                    if (i4 == 1) {
                                        J = r12;
                                        gy1Var2 = gy1Var2;
                                    }
                                }
                                i = 0;
                                r12 = J;
                                gy1Var2 = gy1Var2;
                            }
                            J = r12;
                            gy1Var2 = gy1Var2;
                            J = xp1.J(gy1Var2);
                            i = 0;
                            r12 = J;
                            gy1Var2 = gy1Var2;
                        }
                    }
                    if (cv1VarV1 == cv1Var) {
                        break;
                    }
                    cv1VarV1 = cv1VarV1.j;
                    i = 0;
                }
            }
            i3++;
            i = 0;
        }
        gy1Var.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [cv1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [cv1] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void l(hb1 hb1Var, long j) {
        boolean z = hb1Var.V;
        lb1 lb1Var = hb1Var.L;
        if (z) {
            return;
        }
        hb1 hb1Var2 = this.a;
        if (hb1Var == hb1Var2) {
            p21.a("measureAndLayout called on root");
        }
        if (!hb1Var2.G()) {
            p21.a("performMeasureAndLayout called with unattached root");
        }
        if (!hb1Var2.H()) {
            p21.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            p21.a("performMeasureAndLayout called during measure layout");
        }
        if (this.h != null) {
            this.c = true;
            this.d = false;
            try {
                gn gnVar = this.b;
                ((t1) gnVar.a).z(hb1Var);
                ((t1) gnVar.b).z(hb1Var);
                ((t1) gnVar.c).z(hb1Var);
                if (b(hb1Var, new l50(j)) || lb1Var.f) {
                    if (o51.f(hb1Var.I(), Boolean.TRUE)) {
                        hb1Var.J();
                    }
                }
                e(hb1Var);
                if (hb1Var.H == fb1.g) {
                    hb1Var.c();
                }
                boolean zW0 = lb1Var.p.W0(j);
                hb1 hb1VarU = hb1Var.u();
                if (zW0 && hb1VarU != null) {
                    if (hb1Var.r() == fb1.e) {
                        hb1.V(hb1VarU, false, 3);
                    } else if (hb1Var.r() == fb1.f) {
                        hb1VarU.U(false);
                    }
                }
                if (hb1Var.p() && hb1Var.H()) {
                    hb1Var.Q();
                    d31 d31Var = this.e;
                    if (hb1Var.U > 0) {
                        ((gy1) d31Var.f).b(hb1Var);
                        hb1Var.T = true;
                    }
                }
                d();
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.c = false;
                    this.d = false;
                    throw th2;
                }
            }
        }
        gy1 gy1Var = this.f;
        Object[] objArr = gy1Var.e;
        int i = gy1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            tz1 tz1Var = ((hb1) objArr[i2]).K;
            v21 v21Var = tz1Var.c;
            boolean zG = yz1.g(4194304);
            cv1 cv1Var = v21Var.X;
            if (zG || (cv1Var = cv1Var.i) != null) {
                ah2 ah2Var = xz1.S;
                for (cv1 cv1VarV1 = v21Var.v1(zG); cv1VarV1 != null && (cv1VarV1.h & 4194304) != 0; cv1VarV1 = cv1VarV1.j) {
                    if ((cv1VarV1.g & 4194304) != 0) {
                        ?? J = cv1VarV1;
                        ?? gy1Var2 = 0;
                        while (J != 0) {
                            if (J instanceof na1) {
                                ((na1) J).G(tz1Var.c);
                            } else if ((J.g & 4194304) != 0 && (J instanceof lb0)) {
                                cv1 cv1Var2 = ((lb0) J).t;
                                int i3 = 0;
                                while (cv1Var2 != null) {
                                    if ((cv1Var2.g & 4194304) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            J = J;
                                            gy1Var2 = gy1Var2;
                                            gy1Var2 = gy1Var2;
                                            J = cv1Var2;
                                        } else {
                                            if (gy1Var2 == 0) {
                                                gy1Var2 = new gy1(new cv1[16]);
                                            }
                                            if (J != 0) {
                                                gy1Var2.b(J);
                                                J = 0;
                                            }
                                            gy1Var2.b(cv1Var2);
                                        }
                                    } else {
                                        J = J;
                                        gy1Var2 = gy1Var2;
                                    }
                                    cv1Var2 = cv1Var2.j;
                                    J = J;
                                    gy1Var2 = gy1Var2;
                                }
                                if (i3 == 1) {
                                    J = J;
                                    gy1Var2 = gy1Var2;
                                } else {
                                    J = J;
                                    gy1Var2 = gy1Var2;
                                }
                            }
                            J = xp1.J(gy1Var2);
                        }
                    }
                    if (cv1VarV1 == cv1Var) {
                        break;
                    }
                }
            }
        }
        gy1Var.g();
    }

    public final void m() {
        gn gnVar = this.b;
        if (gnVar.v()) {
            hb1 hb1Var = this.a;
            if (!hb1Var.G()) {
                p21.a("performMeasureAndLayout called with unattached root");
            }
            if (!hb1Var.H()) {
                p21.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                p21.a("performMeasureAndLayout called during measure layout");
            }
            if (this.h != null) {
                this.c = true;
                this.d = false;
                try {
                    if ((((ry2) ((t1) gnVar.c).f).isEmpty() || ((ry2) ((t1) gnVar.a).f).isEmpty()) ? false : true) {
                        if (hb1Var.m != null) {
                            q(hb1Var, true);
                        } else {
                            p(hb1Var);
                        }
                    }
                    q(hb1Var, false);
                    this.c = false;
                    this.d = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.c = false;
                        this.d = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public final boolean n(hb1 hb1Var, boolean z) {
        l50 l50Var;
        hb1 hb1VarU;
        boolean z2 = hb1Var.V;
        lb1 lb1Var = hb1Var.L;
        boolean zB = false;
        if (!z2 && j(hb1Var)) {
            hb1 hb1Var2 = this.a;
            if (hb1Var == hb1Var2) {
                l50Var = this.h;
                l50Var.getClass();
            } else {
                l50Var = null;
            }
            if (z) {
                zB = lb1Var.e ? b(hb1Var, l50Var) : false;
                if ((zB || lb1Var.f) && o51.f(hb1Var.I(), Boolean.TRUE)) {
                    hb1Var.J();
                }
            } else {
                boolean zC = hb1Var.q() ? c(hb1Var, l50Var) : false;
                if (hb1Var.p() && (hb1Var == hb1Var2 || ((hb1VarU = hb1Var.u()) != null && hb1VarU.H() && lb1Var.p.x))) {
                    if (hb1Var == hb1Var2) {
                        if (hb1Var.H == fb1.g) {
                            hb1Var.d();
                        }
                        hb1 hb1VarU2 = hb1Var.u();
                        g82.B(hb1VarU2 != null ? hb1VarU2.K.c.p : ((db) kb1.a(hb1Var)).getPlacementScope(), lb1Var.p, 0, 0);
                    } else {
                        hb1Var.Q();
                    }
                    if (hb1Var.U > 0) {
                        ((gy1) this.e.f).b(hb1Var);
                        hb1Var.T = true;
                    }
                }
                zB = zC;
            }
            d();
        }
        return zB;
    }

    public final boolean o(hb1 hb1Var, boolean z) throws Throwable {
        l50 l50Var;
        boolean zC = false;
        if (!hb1Var.V && j(hb1Var)) {
            if (hb1Var == this.a) {
                l50Var = this.h;
                l50Var.getClass();
            } else {
                l50Var = null;
            }
            if (z) {
                if (hb1Var.L.e) {
                    zC = b(hb1Var, l50Var);
                }
            } else if (hb1Var.q()) {
                zC = c(hb1Var, l50Var);
            }
            d();
        }
        return zC;
    }

    public final void p(hb1 hb1Var) throws Throwable {
        gy1 gy1VarY = hb1Var.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            hb1 hb1Var2 = (hb1) objArr[i2];
            if (hb1Var2.r() == fb1.e || hb1Var2.L.p.B.e()) {
                if (vd0.B(hb1Var2)) {
                    q(hb1Var2, true);
                } else {
                    p(hb1Var2);
                }
            }
        }
    }

    public final void q(hb1 hb1Var, boolean z) throws Throwable {
        l50 l50Var;
        if (hb1Var.V) {
            return;
        }
        if (hb1Var == this.a) {
            l50Var = this.h;
            l50Var.getClass();
        } else {
            l50Var = null;
        }
        if (z) {
            b(hb1Var, l50Var);
        } else {
            c(hb1Var, l50Var);
        }
    }

    public final boolean r(hb1 hb1Var, boolean z) {
        int iOrdinal = hb1Var.L.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.g.b(new ar1(hb1Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    b81.d();
                    return false;
                }
                if (!hb1Var.q() || z) {
                    hb1Var.L.p.y = true;
                    if (!hb1Var.V && (hb1Var.H() || i(hb1Var))) {
                        hb1 hb1VarU = hb1Var.u();
                        if (hb1VarU == null || !hb1VarU.q()) {
                            this.b.a(hb1Var, w51.g);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void s(long j) {
        l50 l50Var = this.h;
        if (l50Var == null ? false : l50.b(l50Var.a, j)) {
            return;
        }
        if (this.c) {
            p21.a("updateRootConstraints called while measuring");
        }
        this.h = new l50(j);
        hb1 hb1Var = this.a;
        hb1 hb1Var2 = hb1Var.m;
        lb1 lb1Var = hb1Var.L;
        if (hb1Var2 != null) {
            lb1Var.e = true;
        }
        lb1Var.p.y = true;
        this.b.a(hb1Var, hb1Var2 != null ? w51.e : w51.g);
    }
}
