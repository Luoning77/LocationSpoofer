package defpackage;

import android.os.Trace;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dq0 extends cv1 implements u30, na1, z02, fv1, kb0 {
    public final boolean s;
    public final pu0 t;
    public boolean u;
    public boolean v;
    public final int w;

    public dq0(int i, pu0 pu0Var, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        pu0Var = (i2 & 4) != 0 ? null : pu0Var;
        this.s = z;
        this.t = pu0Var;
        this.w = i;
    }

    public static boolean u1(dq0 dq0Var) {
        return dq0Var.t1(7);
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.z02
    public final void f0() {
        s1();
    }

    @Override // defpackage.cv1
    public final void f1() {
        int iOrdinal = r1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                op0 focusOwner = ((db) xp1.P(this)).getFocusOwner();
                dq0 dq0VarP = vd0.p(this);
                if (dq0VarP == null || !dq0VarP.s) {
                    return;
                }
                rp0 rp0Var = (rp0) focusOwner;
                rp0Var.a.C();
                rp0Var.d.a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                b81.d();
                return;
            }
        }
        rp0 rp0Var2 = (rp0) ((db) xp1.P(this)).getFocusOwner();
        rp0Var2.c(8, true, false);
        if (this.s) {
            rp0Var2.a.C();
        }
        rp0Var2.d.a();
    }

    @Override // defpackage.cv1
    public final void g1() {
        if (r1().b()) {
            ((rp0) ((db) xp1.P(this)).getFocusOwner()).c(8, true, true);
        }
    }

    public final boolean m1(int i) {
        int iOrdinal = ld0.H(this, i).ordinal();
        if (iOrdinal == 0) {
            return ld0.I(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        b81.d();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [cv1] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [cv1] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [gy1] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [gy1] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void n1(zp0 zp0Var, zp0 zp0Var2) {
        tz1 tz1Var;
        pu0 pu0Var;
        rp0 rp0Var = (rp0) ((db) xp1.P(this)).getFocusOwner();
        dq0 dq0VarG = rp0Var.g();
        if (!zp0Var.equals(zp0Var2) && (pu0Var = this.t) != null) {
            pu0Var.invoke(zp0Var, zp0Var2);
        }
        cv1 cv1Var = this.e;
        if (!cv1Var.r) {
            p21.c("visitAncestors called on an unattached node");
        }
        cv1 cv1Var2 = this.e;
        hb1 hb1VarO = xp1.O(this);
        while (hb1VarO != null) {
            if ((hb1VarO.K.f.h & 5120) != 0) {
                while (cv1Var2 != null) {
                    int i = cv1Var2.g;
                    if ((i & 5120) != 0) {
                        if (cv1Var2 != cv1Var && (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? J = cv1Var2;
                            ?? gy1Var = 0;
                            while (J != 0) {
                                if (J instanceof fp0) {
                                    fp0 fp0Var = (fp0) J;
                                    if (dq0VarG == rp0Var.g()) {
                                        fp0Var.u0(zp0Var2);
                                    }
                                } else if ((J.g & 4096) != 0 && (J instanceof lb0)) {
                                    cv1 cv1Var3 = ((lb0) J).t;
                                    int i2 = 0;
                                    J = J;
                                    gy1Var = gy1Var;
                                    while (cv1Var3 != null) {
                                        if ((cv1Var3.g & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                gy1Var = gy1Var;
                                                J = cv1Var3;
                                            } else {
                                                if (gy1Var == 0) {
                                                    gy1Var = new gy1(new cv1[16]);
                                                }
                                                if (J != 0) {
                                                    gy1Var.b(J);
                                                    J = 0;
                                                }
                                                gy1Var.b(cv1Var3);
                                            }
                                        }
                                        cv1Var3 = cv1Var3.j;
                                        J = J;
                                        gy1Var = gy1Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                J = xp1.J(gy1Var);
                            }
                        }
                    }
                    cv1Var2 = cv1Var2.i;
                }
            }
            hb1VarO = hb1VarO.u();
            cv1Var2 = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [cv1] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [cv1] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [gy1] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [gy1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final tp0 o1() {
        boolean z;
        tz1 tz1Var;
        tp0 tp0Var = new tp0();
        tp0Var.a = true;
        vp0 vp0Var = vp0.b;
        tp0Var.b = vp0Var;
        tp0Var.c = vp0Var;
        tp0Var.d = vp0Var;
        tp0Var.e = vp0Var;
        tp0Var.f = vp0Var;
        tp0Var.g = vp0Var;
        tp0Var.h = vp0Var;
        tp0Var.i = vp0Var;
        tp0Var.j = ik0.i;
        tp0Var.k = ik0.j;
        tp0Var.l = j9.L;
        int i = this.w;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((f31) ((h31) ((g31) xq1.C(this, z30.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                fo.n("Unknown Focusability");
                return null;
            }
            z = false;
        }
        tp0Var.a = z;
        cv1 cv1Var = this.e;
        if (!cv1Var.r) {
            p21.c("visitAncestors called on an unattached node");
        }
        cv1 cv1Var2 = this.e;
        hb1 hb1VarO = xp1.O(this);
        loop0: while (hb1VarO != null) {
            if ((hb1VarO.K.f.h & 3072) != 0) {
                while (cv1Var2 != null) {
                    int i2 = cv1Var2.g;
                    if ((i2 & 3072) != 0) {
                        if (cv1Var2 != cv1Var && (i2 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? gy1Var = 0;
                            ?? J = cv1Var2;
                            while (J != 0) {
                                if (J instanceof up0) {
                                    ((up0) J).r0(tp0Var);
                                } else if ((J.g & 2048) != 0 && (J instanceof lb0)) {
                                    cv1 cv1Var3 = ((lb0) J).t;
                                    int i3 = 0;
                                    while (cv1Var3 != null) {
                                        if ((cv1Var3.g & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                J = J;
                                                gy1Var = gy1Var;
                                                gy1Var = gy1Var;
                                                J = cv1Var3;
                                            } else {
                                                if (gy1Var == 0) {
                                                    gy1Var = new gy1(new cv1[16]);
                                                }
                                                if (J != 0) {
                                                    gy1Var.b(J);
                                                    J = 0;
                                                }
                                                gy1Var.b(cv1Var3);
                                            }
                                        } else {
                                            J = J;
                                            gy1Var = gy1Var;
                                        }
                                        cv1Var3 = cv1Var3.j;
                                        J = J;
                                        gy1Var = gy1Var;
                                    }
                                    if (i3 == 1) {
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
                    cv1Var2 = cv1Var2.i;
                }
            }
            hb1VarO = hb1VarO.u();
            cv1Var2 = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
        }
        return tp0Var;
    }

    public final pe2 p1(pa1 pa1Var) {
        pe2 pe2Var = o1().l;
        if (pe2Var != j9.L) {
            return pa1Var == null ? pe2Var : pe2Var.j(pa1.G(pa1Var, xp1.N(this), 6));
        }
        return pa1Var != null ? pa1Var.d0(xp1.N(this), false) : ce0.d(0L, mc0.J(xp1.N(this).g));
    }

    public final gc1 q1() {
        tz1 tz1Var;
        Object obj;
        if (!this.e.r) {
            p21.c("visitAncestors called on an unattached node");
        }
        cv1 cv1Var = this.e.i;
        hb1 hb1VarO = xp1.O(this);
        loop0: while (hb1VarO != null) {
            if ((hb1VarO.K.f.h & 8388640) != 0) {
                while (cv1Var != null) {
                    int i = cv1Var.g;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(cv1Var instanceof gc1)) {
                                if (cv1Var instanceof lb0) {
                                    cv1Var = null;
                                    for (cv1 cv1Var2 = ((lb0) cv1Var).t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                                        if (cv1Var2 instanceof gc1) {
                                            cv1Var = cv1Var2;
                                        }
                                    }
                                } else {
                                    cv1Var = null;
                                }
                            }
                            gc1 gc1Var = (gc1) cv1Var;
                            if (gc1Var != null) {
                                return gc1Var;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (cv1Var instanceof fv1) {
                                obj = cv1Var;
                            } else if (cv1Var instanceof lb0) {
                                obj = null;
                                for (cv1 cv1Var3 = ((lb0) cv1Var).t; cv1Var3 != null; cv1Var3 = cv1Var3.j) {
                                    if (cv1Var3 instanceof fv1) {
                                        obj = cv1Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            fv1 fv1Var = (fv1) obj;
                            if (fv1Var != null) {
                                ig0 ig0VarB = fv1Var.B();
                                k91 k91Var = kr.a;
                                if (ig0VarB.m(k91Var)) {
                                    return (gc1) fv1Var.B().q(k91Var);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    cv1Var = cv1Var.i;
                }
            }
            hb1VarO = hb1VarO.u();
            cv1Var = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
        }
        return null;
    }

    public final zp0 r1() {
        dq0 dq0VarG;
        tz1 tz1Var;
        boolean z = this.r;
        zp0 zp0Var = zp0.g;
        if (!z || (dq0VarG = ((rp0) ((db) xp1.P(this)).getFocusOwner()).g()) == null) {
            return zp0Var;
        }
        if (this == dq0VarG) {
            return zp0.e;
        }
        if (dq0VarG.r) {
            if (!dq0VarG.e.r) {
                p21.c("visitAncestors called on an unattached node");
            }
            cv1 cv1Var = dq0VarG.e.i;
            hb1 hb1VarO = xp1.O(dq0VarG);
            while (hb1VarO != null) {
                if ((hb1VarO.K.f.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    while (cv1Var != null) {
                        if ((cv1Var.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            cv1 cv1VarJ = cv1Var;
                            gy1 gy1Var = null;
                            while (cv1VarJ != null) {
                                if (cv1VarJ instanceof dq0) {
                                    if (this == ((dq0) cv1VarJ)) {
                                        return zp0.f;
                                    }
                                } else if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                    int i = 0;
                                    for (cv1 cv1Var2 = ((lb0) cv1VarJ).t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                                        if ((cv1Var2.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cv1VarJ = cv1Var2;
                                            } else {
                                                if (gy1Var == null) {
                                                    gy1Var = new gy1(new cv1[16]);
                                                }
                                                if (cv1VarJ != null) {
                                                    gy1Var.b(cv1VarJ);
                                                    cv1VarJ = null;
                                                }
                                                gy1Var.b(cv1Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cv1VarJ = xp1.J(gy1Var);
                            }
                        }
                        cv1Var = cv1Var.i;
                    }
                }
                hb1VarO = hb1VarO.u();
                cv1Var = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
            }
        }
        return zp0Var;
    }

    public final void s1() {
        int iOrdinal = r1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                b81.d();
                return;
            }
        }
        we2 we2Var = new we2();
        gh0.H(this, new ta(5, we2Var, this));
        Object obj = we2Var.e;
        if (obj == null) {
            o51.F("focusProperties");
            throw null;
        }
        if (((sp0) obj).c()) {
            return;
        }
        ((rp0) ((db) xp1.P(this)).getFocusOwner()).c(8, true, true);
    }

    public final boolean t1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return o1().a ? m1(i) : v83.g(this, i, new za(i, 4));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.na1
    public final void G(pa1 pa1Var) {
    }
}
