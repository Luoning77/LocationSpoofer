package defpackage;

import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class q73 {
    public static Boolean a;

    public static void a(String str) {
        Boolean bool = a;
        if (bool == null) {
            fo.n("ThreadUtils isn't correctly initialised");
        } else if (bool.booleanValue() && Looper.myLooper() != Looper.getMainLooper()) {
            throw new iv(str.concat(" interactions should happen on the UI thread."));
        }
    }

    public static ul3 b(f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        View view = (View) ov0Var.j(AndroidCompositionLocals_androidKt.f);
        ul3 ul3VarE = e(view);
        boolean zH = ov0Var.h(ul3VarE) | ov0Var.h(view);
        Object objQ = ov0Var.Q();
        if (zH || objQ == d30.a) {
            objQ = new fc3(6, ul3VarE, view);
            ov0Var.m0(objQ);
        }
        oi0.a(ul3VarE, (lu0) objQ, ov0Var);
        return ul3VarE;
    }

    public static final tc3 c(lb0 lb0Var, Object obj) {
        tz1 tz1Var;
        if (!lb0Var.e.r) {
            p21.c("visitAncestors called on an unattached node");
        }
        cv1 cv1Var = lb0Var.e.i;
        hb1 hb1VarO = xp1.O(lb0Var);
        while (hb1VarO != null) {
            if ((hb1VarO.K.f.h & 262144) != 0) {
                while (cv1Var != null) {
                    if ((cv1Var.g & 262144) != 0) {
                        cv1 cv1VarJ = cv1Var;
                        gy1 gy1Var = null;
                        while (cv1VarJ != null) {
                            if (cv1VarJ instanceof tc3) {
                                tc3 tc3Var = (tc3) cv1VarJ;
                                if (obj.equals(tc3Var.H())) {
                                    return tc3Var;
                                }
                            }
                            if ((cv1VarJ.g & 262144) != 0 && (cv1VarJ instanceof lb0)) {
                                int i = 0;
                                for (cv1 cv1Var2 = ((lb0) cv1VarJ).t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                                    if ((cv1Var2.g & 262144) != 0) {
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
        return null;
    }

    public static final pe2 d(g82 g82Var, int i, bc3 bc3Var, x83 x83Var, boolean z, int i2) {
        pe2 pe2VarC = x83Var != null ? x83Var.c(bc3Var.b.r(i)) : pe2.e;
        int iN0 = g82Var.n0(2.0f);
        float f = pe2VarC.a;
        return pe2.b(pe2VarC, z ? (i2 - f) - iN0 : f, z ? i2 - f : iN0 + f, 0.0f, 10);
    }

    public static ul3 e(View view) {
        ul3 ul3Var;
        WeakHashMap weakHashMap = ul3.w;
        synchronized (weakHashMap) {
            try {
                Object ul3Var2 = weakHashMap.get(view);
                if (ul3Var2 == null) {
                    ul3Var2 = new ul3(view);
                    weakHashMap.put(view, ul3Var2);
                }
                ul3Var = (ul3) ul3Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ul3Var;
    }

    public static final ViewParent f(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(2131230944);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void g(f30 f30Var, lu0 lu0Var) {
        ((ov0) f30Var).b(mf3.a, new iy2(lu0Var, 7));
    }

    public static final void h(f30 f30Var, pu0 pu0Var, Object obj) {
        if (((ov0) f30Var).S || !o51.f(((ov0) f30Var).Q(), obj)) {
            ov0 ov0Var = (ov0) f30Var;
            ov0Var.m0(obj);
            ov0Var.b(obj, pu0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [lu0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [cv1] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [cv1] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void i(kb0 kb0Var, Object obj, lu0 lu0Var) {
        tz1 tz1Var;
        if (!((cv1) kb0Var).e.r) {
            p21.c("visitAncestors called on an unattached node");
        }
        cv1 cv1Var = ((cv1) kb0Var).e.i;
        hb1 hb1VarO = xp1.O(kb0Var);
        while (hb1VarO != null) {
            if ((hb1VarO.K.f.h & 262144) != 0) {
                while (cv1Var != null) {
                    if ((cv1Var.g & 262144) != 0) {
                        ?? J = cv1Var;
                        ?? gy1Var = 0;
                        while (J != 0) {
                            if (J instanceof tc3) {
                                tc3 tc3Var = (tc3) J;
                                if (!(obj.equals(tc3Var.H()) ? ((Boolean) lu0Var.invoke(tc3Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((J.g & 262144) != 0 && (J instanceof lb0)) {
                                cv1 cv1Var2 = ((lb0) J).t;
                                int i = 0;
                                while (cv1Var2 != null) {
                                    if ((cv1Var2.g & 262144) != 0) {
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
                    cv1Var = cv1Var.i;
                }
            }
            hb1VarO = hb1VarO.u();
            cv1Var = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kb0, tc3] */
    /* JADX WARN: Type inference failed for: r11v0, types: [lu0] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [cv1] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [cv1] */
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
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void j(tc3 tc3Var, lu0 lu0Var) {
        tz1 tz1Var;
        cv1 cv1Var = (cv1) tc3Var;
        if (!cv1Var.e.r) {
            p21.c("visitAncestors called on an unattached node");
        }
        cv1 cv1Var2 = cv1Var.e.i;
        hb1 hb1VarO = xp1.O(tc3Var);
        while (hb1VarO != null) {
            if ((hb1VarO.K.f.h & 262144) != 0) {
                while (cv1Var2 != null) {
                    if ((cv1Var2.g & 262144) != 0) {
                        ?? J = cv1Var2;
                        ?? gy1Var = 0;
                        while (J != 0) {
                            boolean zBooleanValue = true;
                            if (J instanceof tc3) {
                                tc3 tc3Var2 = (tc3) J;
                                if (o51.f(tc3Var.H(), tc3Var2.H()) && tc3Var.getClass() == tc3Var2.getClass()) {
                                    zBooleanValue = ((Boolean) lu0Var.invoke(tc3Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((J.g & 262144) != 0 && (J instanceof lb0)) {
                                cv1 cv1Var3 = ((lb0) J).t;
                                int i = 0;
                                while (cv1Var3 != null) {
                                    if ((cv1Var3.g & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
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
                    cv1Var2 = cv1Var2.i;
                }
            }
            hb1VarO = hb1VarO.u();
            cv1Var2 = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [lu0] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [cv1] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [cv1] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static final void k(cv1 cv1Var, String str, lu0 lu0Var) {
        if (!cv1Var.e.r) {
            p21.c("visitSubtreeIf called on an unattached node");
        }
        gy1 gy1Var = new gy1(new cv1[16]);
        cv1 cv1Var2 = cv1Var.e;
        cv1 cv1Var3 = cv1Var2.j;
        if (cv1Var3 == null) {
            xp1.h(gy1Var, cv1Var2);
        } else {
            gy1Var.b(cv1Var3);
        }
        while (true) {
            int i = gy1Var.g;
            if (i == 0) {
                return;
            }
            cv1 cv1Var4 = (cv1) gy1Var.k(i - 1);
            if ((cv1Var4.h & 262144) != 0) {
                cv1 cv1Var5 = cv1Var4;
                while (true) {
                    if (cv1Var5 != null && cv1Var5.r) {
                        if ((cv1Var5.g & 262144) != 0) {
                            ?? J = cv1Var5;
                            ?? gy1Var2 = 0;
                            while (J != 0) {
                                if (J instanceof tc3) {
                                    tc3 tc3Var = (tc3) J;
                                    sc3 sc3Var = str.equals(tc3Var.H()) ? (sc3) lu0Var.invoke(tc3Var) : sc3.e;
                                    if (sc3Var != sc3.g) {
                                        if (sc3Var == sc3.f) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((J.g & 262144) != 0 && (J instanceof lb0)) {
                                    cv1 cv1Var6 = ((lb0) J).t;
                                    int i2 = 0;
                                    J = J;
                                    gy1Var2 = gy1Var2;
                                    while (cv1Var6 != null) {
                                        if ((cv1Var6.g & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                gy1Var2 = gy1Var2;
                                                J = cv1Var6;
                                            } else {
                                                if (gy1Var2 == 0) {
                                                    gy1Var2 = new gy1(new cv1[16]);
                                                }
                                                if (J != 0) {
                                                    gy1Var2.b(J);
                                                    J = 0;
                                                }
                                                gy1Var2.b(cv1Var6);
                                            }
                                        }
                                        cv1Var6 = cv1Var6.j;
                                        J = J;
                                        gy1Var2 = gy1Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                J = xp1.J(gy1Var2);
                            }
                        }
                        cv1Var5 = cv1Var5.j;
                    }
                }
            }
            xp1.h(gy1Var, cv1Var4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, tc3] */
    /* JADX WARN: Type inference failed for: r13v0, types: [lu0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [cv1] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [cv1] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void l(tc3 tc3Var, lu0 lu0Var) {
        cv1 cv1Var = (cv1) tc3Var;
        if (!cv1Var.e.r) {
            p21.c("visitSubtreeIf called on an unattached node");
        }
        gy1 gy1Var = new gy1(new cv1[16]);
        cv1 cv1Var2 = cv1Var.e;
        cv1 cv1Var3 = cv1Var2.j;
        if (cv1Var3 == null) {
            xp1.h(gy1Var, cv1Var2);
        } else {
            gy1Var.b(cv1Var3);
        }
        while (true) {
            int i = gy1Var.g;
            if (i == 0) {
                return;
            }
            cv1 cv1Var4 = (cv1) gy1Var.k(i - 1);
            if ((cv1Var4.h & 262144) != 0) {
                cv1 cv1Var5 = cv1Var4;
                while (true) {
                    if (cv1Var5 != null && cv1Var5.r) {
                        if ((cv1Var5.g & 262144) != 0) {
                            ?? J = cv1Var5;
                            ?? gy1Var2 = 0;
                            while (J != 0) {
                                if (J instanceof tc3) {
                                    tc3 tc3Var2 = (tc3) J;
                                    sc3 sc3Var = (o51.f(tc3Var.H(), tc3Var2.H()) && tc3Var.getClass() == tc3Var2.getClass()) ? (sc3) lu0Var.invoke(tc3Var2) : sc3.e;
                                    if (sc3Var != sc3.g) {
                                        if (sc3Var == sc3.f) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((J.g & 262144) != 0 && (J instanceof lb0)) {
                                    cv1 cv1Var6 = ((lb0) J).t;
                                    int i2 = 0;
                                    J = J;
                                    gy1Var2 = gy1Var2;
                                    while (cv1Var6 != null) {
                                        if ((cv1Var6.g & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                gy1Var2 = gy1Var2;
                                                J = cv1Var6;
                                            } else {
                                                if (gy1Var2 == 0) {
                                                    gy1Var2 = new gy1(new cv1[16]);
                                                }
                                                if (J != 0) {
                                                    gy1Var2.b(J);
                                                    J = 0;
                                                }
                                                gy1Var2.b(cv1Var6);
                                            }
                                        }
                                        cv1Var6 = cv1Var6.j;
                                        J = J;
                                        gy1Var2 = gy1Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                J = xp1.J(gy1Var2);
                            }
                        }
                        cv1Var5 = cv1Var5.j;
                    }
                }
            }
            xp1.h(gy1Var, cv1Var4);
        }
    }

    public static hh3 m(int i, String str) {
        return new hh3(new s31(0, 0, 0, 0), str);
    }
}
