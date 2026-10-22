package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class js2 {
    public final cv1 a;
    public final boolean b;
    public final hb1 c;
    public final es2 d;
    public js2 e;
    public final int f;

    public js2(cv1 cv1Var, boolean z, hb1 hb1Var, es2 es2Var) {
        this.a = cv1Var;
        this.b = z;
        this.c = hb1Var;
        this.d = es2Var;
        this.f = hb1Var.f;
    }

    public static /* synthetic */ List j(int i, js2 js2Var) {
        return js2Var.i((i & 1) != 0 ? !js2Var.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [cv1] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [cv1] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final pe2 a(xz1 xz1Var) {
        ?? J;
        js2 js2VarL = l();
        if (js2VarL == null) {
            return pe2.e;
        }
        cv1 cv1Var = js2VarL.c.K.f;
        if ((cv1Var.h & 8) == 0) {
            J = 0;
            break;
        }
        loop0: while (true) {
            if (cv1Var != null) {
                if ((cv1Var.g & 8) != 0) {
                    J = cv1Var;
                    ?? gy1Var = 0;
                    while (J != 0) {
                        if (J instanceof hs2) {
                            if (((hs2) J).A()) {
                                break loop0;
                            }
                        } else if ((J.g & 8) != 0 && (J instanceof lb0)) {
                            cv1 cv1Var2 = ((lb0) J).t;
                            int i = 0;
                            while (cv1Var2 != null) {
                                if ((cv1Var2.g & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        J = J;
                                        gy1Var = gy1Var;
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
                                } else {
                                    J = J;
                                    gy1Var = gy1Var;
                                }
                                cv1Var2 = cv1Var2.j;
                                J = J;
                                gy1Var = gy1Var;
                            }
                            if (i == 1) {
                                J = J;
                                gy1Var = gy1Var;
                            } else {
                                J = J;
                                gy1Var = gy1Var;
                            }
                        }
                        J = xp1.J(gy1Var);
                    }
                }
                if ((cv1Var.h & 8) != 0) {
                    cv1Var = cv1Var.j;
                }
            }
            J = 0;
            break;
        }
        hs2 hs2Var = (hs2) J;
        xz1 xz1VarL = hs2Var != null ? xp1.L(hs2Var, 8) : null;
        return xz1VarL == null ? js2VarL.a(xz1Var) : xz1VarL.d0(xz1Var, true);
    }

    public final js2 b(vh2 vh2Var, lu0 lu0Var) {
        es2 es2Var = new es2();
        es2Var.g = false;
        es2Var.h = false;
        lu0Var.invoke(es2Var);
        js2 js2Var = new js2(new is2(lu0Var), false, new hb1(this.f + (vh2Var != null ? 1000000000 : 2000000000), true), es2Var);
        js2Var.e = this;
        return js2Var;
    }

    public final void c(hb1 hb1Var, ArrayList arrayList) {
        gy1 gy1VarX = hb1Var.x();
        Object[] objArr = gy1VarX.e;
        int i = gy1VarX.g;
        for (int i2 = 0; i2 < i; i2++) {
            hb1 hb1Var2 = (hb1) objArr[i2];
            if (hb1Var2.G() && !hb1Var2.V) {
                if (hb1Var2.K.c(8)) {
                    arrayList.add(ke0.n(hb1Var2, this.b));
                } else {
                    c(hb1Var2, arrayList);
                }
            }
        }
    }

    public final xz1 d() {
        if (!n()) {
            hs2 hs2VarF = f();
            return hs2VarF != null ? xp1.L(hs2VarF, 8) : this.c.K.c;
        }
        js2 js2VarL = l();
        if (js2VarL != null) {
            return js2VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            js2 js2Var = (js2) arrayList.get(size2);
            if (js2Var.o()) {
                arrayList2.add(js2Var);
            } else if (!js2Var.d.h) {
                js2Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [cv1] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [cv1] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final hs2 f() {
        ?? J;
        boolean z;
        ?? r0;
        boolean z2 = this.d.g;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        hb1 hb1Var = this.c;
        if (!z2) {
            cv1 cv1Var = hb1Var.K.f;
            if ((cv1Var.h & 8) != 0) {
                loop3: while (cv1Var != null) {
                    if ((cv1Var.g & 8) != 0) {
                        J = cv1Var;
                        ?? gy1Var = 0;
                        while (true) {
                            if (J != 0) {
                                if (J instanceof hs2) {
                                    if (((hs2) J).A()) {
                                        r4 = J;
                                    }
                                } else if ((J.g & 8) != 0 && (J instanceof lb0)) {
                                    cv1 cv1Var2 = ((lb0) J).t;
                                    int i = 0;
                                    while (cv1Var2 != null) {
                                        if ((cv1Var2.g & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                J = J;
                                                gy1Var = gy1Var;
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
                                        } else {
                                            J = J;
                                            gy1Var = gy1Var;
                                        }
                                        cv1Var2 = cv1Var2.j;
                                        J = J;
                                        gy1Var = gy1Var;
                                    }
                                    if (i == 1) {
                                        J = J;
                                        gy1Var = gy1Var;
                                    } else {
                                        J = J;
                                        gy1Var = gy1Var;
                                    }
                                }
                                J = xp1.J(gy1Var);
                            }
                        }
                    }
                    if ((cv1Var.h & 8) == 0) {
                        break;
                    }
                    cv1Var = cv1Var.j;
                }
            }
        } else {
            cv1 cv1Var3 = hb1Var.K.f;
            if ((cv1Var3.h & 8) != 0) {
                J = 0;
                while (cv1Var3 != null) {
                    if ((cv1Var3.g & 8) != 0) {
                        cv1 cv1VarJ = cv1Var3;
                        gy1 gy1Var2 = null;
                        while (cv1VarJ != null) {
                            if (cv1VarJ instanceof hs2) {
                                hs2 hs2Var = (hs2) cv1VarJ;
                                if (hs2Var.A()) {
                                    if (hs2Var.M0()) {
                                        r0 = J;
                                        r0 = J;
                                        return hs2Var;
                                    }
                                    if (J == 0) {
                                        r0 = hs2Var;
                                    }
                                }
                                r0 = J;
                                z = false;
                                J = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                J = J;
                                if ((cv1VarJ.g & 8) != 0 && (cv1VarJ instanceof lb0)) {
                                    int i2 = 0;
                                    for (cv1 cv1Var4 = ((lb0) cv1VarJ).t; cv1Var4 != null; cv1Var4 = cv1Var4.j) {
                                        if ((cv1Var4.g & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cv1VarJ = cv1Var4;
                                            } else {
                                                if (gy1Var2 == null) {
                                                    gy1Var2 = new gy1(new cv1[16]);
                                                }
                                                if (cv1VarJ != null) {
                                                    gy1Var2.b(cv1VarJ);
                                                    cv1VarJ = null;
                                                }
                                                gy1Var2.b(cv1Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                J = J;
                            }
                            cv1VarJ = xp1.J(gy1Var2);
                        }
                    }
                    if ((cv1Var3.h & 8) == 0) {
                        break;
                    }
                    cv1Var3 = cv1Var3.j;
                    J = J;
                }
                r4 = J;
            }
        }
        return (hs2) r4;
    }

    public final pe2 g() {
        xz1 xz1VarD = d();
        if (xz1VarD != null) {
            if (!xz1VarD.t1().r) {
                xz1VarD = null;
            }
            if (xz1VarD != null) {
                return wc0.F(xz1VarD).d0(xz1VarD, true);
            }
        }
        return pe2.e;
    }

    public final pe2 h() {
        xz1 xz1VarD = d();
        if (xz1VarD != null) {
            if (!xz1VarD.t1().r) {
                xz1VarD = null;
            }
            if (xz1VarD != null) {
                return wc0.x(xz1VarD, true);
            }
        }
        return pe2.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.h) {
            return uj0.e;
        }
        ArrayList arrayList = new ArrayList();
        if (!o()) {
            return r(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final es2 k() {
        boolean zO = o();
        es2 es2Var = this.d;
        if (!zO) {
            return es2Var;
        }
        es2 es2VarB = es2Var.b();
        q(new ArrayList(), es2VarB);
        return es2VarB;
    }

    public final js2 l() {
        hb1 hb1VarU;
        js2 js2Var = this.e;
        if (js2Var != null) {
            return js2Var;
        }
        hb1 hb1Var = this.c;
        boolean z = this.b;
        if (!z) {
            hb1VarU = null;
            break;
        }
        hb1VarU = hb1Var.u();
        while (true) {
            if (hb1VarU == null) {
                hb1VarU = null;
                break;
            }
            es2 es2VarW = hb1VarU.w();
            if (es2VarW != null && es2VarW.g) {
                break;
            }
            hb1VarU = hb1VarU.u();
        }
        if (hb1VarU == null) {
            for (hb1 hb1VarU2 = hb1Var.u(); hb1VarU2 != null; hb1VarU2 = hb1VarU2.u()) {
                if (hb1VarU2.K.c(8)) {
                    hb1VarU = hb1VarU2;
                }
            }
            hb1VarU = null;
        }
        if (hb1VarU == null) {
            return null;
        }
        return ke0.n(hb1VarU, z);
    }

    public final pe2 m() {
        kb0 kb0VarF = f();
        if (kb0VarF == null) {
            return this.c.K.c.P1();
        }
        cv1 cv1Var = ((cv1) kb0VarF).e;
        Object objG = this.d.e.g(ds2.b);
        if (objG == null) {
            objG = null;
        }
        return ee0.u(cv1Var, objG != null, true);
    }

    public final boolean n() {
        return this.e != null;
    }

    public final boolean o() {
        return this.b && this.d.g;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean p() {
        if (n() || !j(4, this).isEmpty()) {
            return false;
        }
        hb1 hb1VarU = this.c.u();
        while (hb1VarU != null) {
            es2 es2VarW = hb1VarU.w();
            if (es2VarW != null && es2VarW.g) {
                if (hb1VarU == null) {
                    return true;
                }
                return false;
            }
            hb1VarU = hb1VarU.u();
        }
        hb1VarU = null;
        if (hb1VarU == null) {
            return true;
        }
        return false;
    }

    public final void q(ArrayList arrayList, es2 es2Var) {
        if (this.d.h) {
            return;
        }
        r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            js2 js2Var = (js2) arrayList.get(size2);
            if (!js2Var.o()) {
                es2Var.d(js2Var.d);
                js2Var.q(arrayList, es2Var);
            }
        }
    }

    public final List r(ArrayList arrayList, boolean z) {
        if (n()) {
            return uj0.e;
        }
        c(this.c, arrayList);
        if (z) {
            es2 es2Var = this.d;
            zx1 zx1Var = es2Var.e;
            Object objG = zx1Var.g(os2.z);
            if (objG == null) {
                objG = null;
            }
            vh2 vh2Var = (vh2) objG;
            if (vh2Var != null && es2Var.g && !arrayList.isEmpty()) {
                arrayList.add(b(vh2Var, new q9(vh2Var, 21)));
            }
            rs2 rs2Var = os2.a;
            if (zx1Var.c(rs2Var) && !arrayList.isEmpty() && es2Var.g) {
                Object objG2 = zx1Var.g(rs2Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) zy.o0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new q9(str, 22)));
                }
            }
        }
        return arrayList;
    }
}
