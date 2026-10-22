package defpackage;

import android.view.KeyEvent;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ta extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ta(int i, Object obj, Object obj2) {
        super(0);
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [cv1] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [cv1] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [gy1] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [gy1] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v18 */
    @Override // defpackage.au0
    public final Object invoke() {
        js2 js2Var;
        hb1 hb1Var;
        pe2 pe2Var;
        int i = this.f;
        mf3 mf3Var = mf3.a;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            case 1:
                jb jbVar = (jb) obj;
                zn2 zn2Var = (zn2) obj2;
                on2 on2Var = zn2Var.i;
                on2 on2Var2 = zn2Var.j;
                Float f = zn2Var.g;
                Float f2 = zn2Var.h;
                float fFloatValue = (on2Var == null || f == null) ? 0.0f : ((Number) on2Var.a.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (on2Var2 == null || f2 == null) ? 0.0f : ((Number) on2Var2.a.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iV = jbVar.v(zn2Var.e);
                    ls2 ls2Var = (ls2) jbVar.n().b(jbVar.o);
                    if (ls2Var != null) {
                        try {
                            r1 r1Var = jbVar.q;
                            if (r1Var != null) {
                                r1Var.a.setBoundsInScreen(jbVar.f(ls2Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    ls2 ls2Var2 = (ls2) jbVar.n().b(jbVar.p);
                    if (ls2Var2 != null) {
                        try {
                            r1 r1Var2 = jbVar.r;
                            if (r1Var2 != null) {
                                r1Var2.a.setBoundsInScreen(jbVar.f(ls2Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    jbVar.h.invalidate();
                    ls2 ls2Var3 = (ls2) jbVar.n().b(iV);
                    if (ls2Var3 != null && (js2Var = ls2Var3.a) != null && (hb1Var = js2Var.c) != null) {
                        if (on2Var != null) {
                            jbVar.t.h(iV, on2Var);
                        }
                        if (on2Var2 != null) {
                            jbVar.u.h(iV, on2Var2);
                        }
                        jbVar.r(hb1Var);
                    }
                }
                if (on2Var != null) {
                    zn2Var.g = (Float) on2Var.a.invoke();
                }
                if (on2Var2 != null) {
                    zn2Var.h = (Float) on2Var2.a.invoke();
                }
                return mf3Var;
            case 2:
                au0 au0Var = (au0) obj2;
                if (au0Var != null && (pe2Var = (pe2) au0Var.invoke()) != null) {
                    return pe2Var;
                }
                xz1 xz1Var = (xz1) obj;
                if (!xz1Var.t1().r) {
                    xz1Var = null;
                }
                if (xz1Var != null) {
                    return ce0.d(0L, mc0.J(xz1Var.g));
                }
                return null;
            case 3:
                ((wu) obj2).v.invoke((xu) obj);
                return mf3Var;
            case 4:
                ((we2) obj2).e = xq1.C((bq0) obj, f82.a);
                return mf3Var;
            case Logger.WARN /* 5 */:
                ((we2) obj2).e = ((dq0) obj).o1();
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ((wx0) obj2).d((cv1) obj);
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                tz1 tz1Var = ((hb1) obj2).K;
                we2 we2Var = (we2) obj;
                if ((tz1Var.f.h & 8) != 0) {
                    for (cv1 cv1Var = tz1Var.e; cv1Var != null; cv1Var = cv1Var.i) {
                        if ((cv1Var.g & 8) != 0) {
                            ?? J = cv1Var;
                            ?? gy1Var = 0;
                            while (J != 0) {
                                if (J instanceof hs2) {
                                    hs2 hs2Var = (hs2) J;
                                    if (hs2Var.L0()) {
                                        es2 es2Var = new es2();
                                        we2Var.e = es2Var;
                                        es2Var.h = true;
                                    }
                                    if (hs2Var.M0()) {
                                        ((es2) we2Var.e).g = true;
                                    }
                                    hs2Var.J0((ss2) we2Var.e);
                                } else if ((J.g & 8) != 0 && (J instanceof lb0)) {
                                    cv1 cv1Var2 = ((lb0) J).t;
                                    int i2 = 0;
                                    while (cv1Var2 != null) {
                                        if ((cv1Var2.g & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
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
                }
                return mf3Var;
            default:
                ah2 ah2Var = xz1.S;
                ((lu0) obj2).invoke(ah2Var);
                xz1 xz1Var2 = (xz1) obj;
                boolean zF = o51.f(xz1Var2.J, ah2Var.p);
                boolean z = xz1Var2.K;
                boolean z2 = ah2Var.q;
                boolean z3 = z != z2;
                if (!zF || z3) {
                    xz1Var2.J = ah2Var.p;
                    xz1Var2.K = z2;
                    if (xz1Var2.L && (z3 || (z2 && !zF))) {
                        xz1Var2.s.E();
                    }
                }
                xz1Var2.L = true;
                ah2Var.x = ah2Var.p.a(ah2Var.s, ah2Var.u, ah2Var.t);
                return mf3Var;
        }
    }
}
