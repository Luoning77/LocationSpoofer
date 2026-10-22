package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class v83 {
    public static x01 a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        defpackage.fo.n("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        defpackage.fo.n("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(defpackage.pe2 r18, defpackage.pe2 r19, defpackage.pe2 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = b(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = b(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            defpackage.fo.n(r4)
            return r12
        L94:
            defpackage.fo.n(r4)
            return r12
        L98:
            return r18
        L99:
            defpackage.fo.n(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v83.a(pe2, pe2, pe2, int):boolean");
    }

    public static final boolean b(int i, pe2 pe2Var, pe2 pe2Var2) {
        if (i == 3 || i == 4) {
            return pe2Var.d > pe2Var2.b && pe2Var.b < pe2Var2.d;
        }
        if (i == 5 || i == 6) {
            return pe2Var.c > pe2Var2.a && pe2Var.a < pe2Var2.c;
        }
        fo.n("This function should only be used for 2-D focus search");
        return false;
    }

    public static final bt2 c(bt2 bt2Var, gt2 gt2Var) {
        bt2Var.getClass();
        gt2Var.getClass();
        if (!o51.f(bt2Var.c(), et2.e)) {
            return bt2Var.isInline() ? c(bt2Var.i(0), gt2Var) : bt2Var;
        }
        sb.R(bt2Var);
        return bt2Var;
    }

    public static final void d(dq0 dq0Var, gy1 gy1Var) {
        if (!dq0Var.e.r) {
            p21.c("visitChildren called on an unattached node");
        }
        gy1 gy1Var2 = new gy1(new cv1[16]);
        cv1 cv1Var = dq0Var.e;
        cv1 cv1Var2 = cv1Var.j;
        if (cv1Var2 == null) {
            xp1.h(gy1Var2, cv1Var);
        } else {
            gy1Var2.b(cv1Var2);
        }
        while (true) {
            int i = gy1Var2.g;
            if (i == 0) {
                return;
            }
            cv1 cv1VarJ = (cv1) gy1Var2.k(i - 1);
            if ((cv1VarJ.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                xp1.h(gy1Var2, cv1VarJ);
            } else {
                while (cv1VarJ != null) {
                    if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        gy1 gy1Var3 = null;
                        while (cv1VarJ != null) {
                            if (cv1VarJ instanceof dq0) {
                                dq0 dq0Var2 = (dq0) cv1VarJ;
                                if (dq0Var2.r && !xp1.O(dq0Var2).V) {
                                    if (dq0Var2.o1().a) {
                                        gy1Var.b(dq0Var2);
                                    } else {
                                        d(dq0Var2, gy1Var);
                                    }
                                }
                            } else if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                int i2 = 0;
                                for (cv1 cv1Var3 = ((lb0) cv1VarJ).t; cv1Var3 != null; cv1Var3 = cv1Var3.j) {
                                    if ((cv1Var3.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cv1VarJ = cv1Var3;
                                        } else {
                                            if (gy1Var3 == null) {
                                                gy1Var3 = new gy1(new cv1[16]);
                                            }
                                            if (cv1VarJ != null) {
                                                gy1Var3.b(cv1VarJ);
                                                cv1VarJ = null;
                                            }
                                            gy1Var3.b(cv1Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cv1VarJ = xp1.J(gy1Var3);
                        }
                        break;
                    }
                    cv1VarJ = cv1VarJ.j;
                }
            }
        }
    }

    public static final void e(vw0 vw0Var, mh3 mh3Var) {
        ArrayList arrayList = mh3Var.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oh3 oh3Var = (oh3) arrayList.get(i);
            if (oh3Var instanceof qh3) {
                k62 k62Var = new k62();
                qh3 qh3Var = (qh3) oh3Var;
                k62Var.d = qh3Var.f;
                k62Var.n = true;
                k62Var.c();
                k62Var.s.a.setFillType(qh3Var.g == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                k62Var.c();
                k62Var.c();
                k62Var.b = qh3Var.h;
                k62Var.c();
                k62Var.c = qh3Var.i;
                k62Var.c();
                k62Var.g = qh3Var.j;
                k62Var.c();
                k62Var.e = qh3Var.k;
                k62Var.c();
                k62Var.f = qh3Var.l;
                k62Var.o = true;
                k62Var.c();
                k62Var.h = qh3Var.m;
                k62Var.o = true;
                k62Var.c();
                k62Var.i = qh3Var.n;
                k62Var.o = true;
                k62Var.c();
                k62Var.j = qh3Var.o;
                k62Var.o = true;
                k62Var.c();
                k62Var.k = qh3Var.p;
                k62Var.p = true;
                k62Var.c();
                k62Var.l = qh3Var.q;
                k62Var.p = true;
                k62Var.c();
                k62Var.m = qh3Var.r;
                k62Var.p = true;
                k62Var.c();
                vw0Var.e(i, k62Var);
            } else if (oh3Var instanceof mh3) {
                vw0 vw0Var2 = new vw0();
                mh3 mh3Var2 = (mh3) oh3Var;
                vw0Var2.k = mh3Var2.e;
                vw0Var2.c();
                vw0Var2.l = mh3Var2.f;
                vw0Var2.s = true;
                vw0Var2.c();
                vw0Var2.o = mh3Var2.i;
                vw0Var2.s = true;
                vw0Var2.c();
                vw0Var2.p = mh3Var2.j;
                vw0Var2.s = true;
                vw0Var2.c();
                vw0Var2.q = mh3Var2.k;
                vw0Var2.s = true;
                vw0Var2.c();
                vw0Var2.r = mh3Var2.l;
                vw0Var2.s = true;
                vw0Var2.c();
                vw0Var2.m = mh3Var2.g;
                vw0Var2.s = true;
                vw0Var2.c();
                vw0Var2.n = mh3Var2.h;
                vw0Var2.s = true;
                vw0Var2.c();
                vw0Var2.f = mh3Var2.m;
                vw0Var2.g = true;
                vw0Var2.c();
                e(vw0Var2, mh3Var2);
                vw0Var.e(i, vw0Var2);
            }
        }
    }

    public static final dq0 f(gy1 gy1Var, pe2 pe2Var, int i) {
        pe2 pe2VarI;
        dq0 dq0Var = null;
        if (i == 3) {
            pe2VarI = pe2Var.i((pe2Var.c - pe2Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            pe2VarI = pe2Var.i(-((pe2Var.c - pe2Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            pe2VarI = pe2Var.i(0.0f, (pe2Var.d - pe2Var.b) + 1.0f);
        } else {
            if (i != 6) {
                fo.n("This function should only be used for 2-D focus search");
                return null;
            }
            pe2VarI = pe2Var.i(0.0f, -((pe2Var.d - pe2Var.b) + 1.0f));
        }
        Object[] objArr = gy1Var.e;
        int i2 = gy1Var.g;
        for (int i3 = 0; i3 < i2; i3++) {
            dq0 dq0Var2 = (dq0) objArr[i3];
            if (vd0.A(dq0Var2)) {
                pe2 pe2VarS = vd0.s(dq0Var2);
                if (k(pe2VarS, pe2VarI, pe2Var, i)) {
                    dq0Var = dq0Var2;
                    pe2VarI = pe2VarS;
                }
            }
        }
        return dq0Var;
    }

    public static final boolean g(dq0 dq0Var, int i, lu0 lu0Var) {
        pe2 pe2Var;
        gy1 gy1Var = new gy1(new dq0[16]);
        d(dq0Var, gy1Var);
        int i2 = gy1Var.g;
        if (i2 <= 1) {
            dq0 dq0Var2 = (dq0) (i2 == 0 ? null : gy1Var.e[0]);
            if (dq0Var2 != null) {
                return ((Boolean) lu0Var.invoke(dq0Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                pe2 pe2VarS = vd0.s(dq0Var);
                float f = pe2VarS.a;
                float f2 = pe2VarS.b;
                pe2Var = new pe2(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    fo.n("This function should only be used for 2-D focus search");
                    return false;
                }
                pe2 pe2VarS2 = vd0.s(dq0Var);
                float f3 = pe2VarS2.c;
                float f4 = pe2VarS2.d;
                pe2Var = new pe2(f3, f4, f3, f4);
            }
            dq0 dq0VarF = f(gy1Var, pe2Var, i);
            if (dq0VarF != null) {
                return ((Boolean) lu0Var.invoke(dq0VarF)).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static sa3 h(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return sa3.h;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return sa3.g;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return sa3.f;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return sa3.i;
            }
        } else if (str.equals("SSLv3")) {
            return sa3.j;
        }
        fo.i("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static final boolean i(int i, ah ahVar, dq0 dq0Var, pe2 pe2Var) {
        if (o(i, ahVar, dq0Var, pe2Var)) {
            return true;
        }
        Boolean bool = (Boolean) ks.Z(dq0Var, i, new g22(((rp0) ((db) xp1.P(dq0Var)).getFocusOwner()).g(), dq0Var, pe2Var, i, ahVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final float j(x83 x83Var, int i) {
        if (i < 0) {
            return 0.0f;
        }
        w83 w83Var = x83Var.a;
        sw1 sw1Var = x83Var.b;
        if (w83Var.a.f.length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(sw1Var.d(i), Math.min(sw1Var.b - 1, sw1Var.f - 1));
        if (i > sw1Var.c(iMin, false)) {
            return 0.0f;
        }
        sw1Var.l(iMin);
        ArrayList arrayList = sw1Var.h;
        l52 l52Var = (l52) arrayList.get(hd0.u(arrayList, iMin));
        le leVar = l52Var.a;
        int i2 = iMin - l52Var.d;
        t83 t83Var = leVar.d;
        return t83Var.e(i2) - t83Var.h(i2);
    }

    public static final boolean k(pe2 pe2Var, pe2 pe2Var2, pe2 pe2Var3, int i) {
        if (!l(i, pe2Var, pe2Var3)) {
            return false;
        }
        if (l(i, pe2Var2, pe2Var3) && !a(pe2Var3, pe2Var, pe2Var2, i)) {
            return !a(pe2Var3, pe2Var2, pe2Var, i) && m(i, pe2Var3, pe2Var) < m(i, pe2Var3, pe2Var2);
        }
        return true;
    }

    public static final boolean l(int i, pe2 pe2Var, pe2 pe2Var2) {
        if (i == 3) {
            float f = pe2Var2.c;
            float f2 = pe2Var2.a;
            float f3 = pe2Var.c;
            return (f > f3 || f2 >= f3) && f2 > pe2Var.a;
        }
        if (i == 4) {
            float f4 = pe2Var2.a;
            float f5 = pe2Var2.c;
            float f6 = pe2Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < pe2Var.c;
        }
        if (i == 5) {
            float f7 = pe2Var2.d;
            float f8 = pe2Var2.b;
            float f9 = pe2Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > pe2Var.b;
        }
        if (i != 6) {
            fo.n("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = pe2Var2.b;
        float f11 = pe2Var2.d;
        float f12 = pe2Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < pe2Var.d;
    }

    public static final long m(int i, pe2 pe2Var, pe2 pe2Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = pe2Var.a;
            f2 = pe2Var2.c;
        } else if (i == 4) {
            f = pe2Var2.a;
            f2 = pe2Var.c;
        } else if (i == 5) {
            f = pe2Var.b;
            f2 = pe2Var2.d;
        } else {
            if (i != 6) {
                fo.n("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = pe2Var2.b;
            f2 = pe2Var.d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = pe2Var.b;
            f3 = ((pe2Var.d - f7) / 2.0f) + f7;
            f4 = pe2Var2.b;
            f5 = pe2Var2.d;
        } else {
            if (i != 5 && i != 6) {
                fo.n("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = pe2Var.a;
            f3 = ((pe2Var.c - f8) / 2.0f) + f8;
            f4 = pe2Var2.a;
            f5 = pe2Var2.c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static final ph3 n(x01 x01Var, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        xb0 xb0Var = (xb0) ov0Var.j(z30.h);
        boolean zE = ov0Var.e((((long) Float.floatToRawIntBits(xb0Var.g())) & 4294967295L) | (((long) Float.floatToRawIntBits(x01Var.j)) << 32));
        Object objQ = ov0Var.Q();
        if (zE || objQ == d30.a) {
            vw0 vw0Var = new vw0();
            e(vw0Var, x01Var.f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(xb0Var.R(x01Var.b))) << 32) | (((long) Float.floatToRawIntBits(xb0Var.R(x01Var.c))) & 4294967295L);
            float fIntBitsToFloat = x01Var.d;
            float fIntBitsToFloat2 = x01Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            ph3 ph3Var = new ph3(vw0Var);
            String str = x01Var.a;
            long j = x01Var.g;
            rr rrVar = j != 16 ? new rr(x01Var.h, j) : null;
            boolean z = x01Var.i;
            ph3Var.e.setValue(new cw2(jFloatToRawIntBits));
            ph3Var.f.setValue(Boolean.valueOf(z));
            jh3 jh3Var = ph3Var.g;
            jh3Var.g.setValue(rrVar);
            jh3Var.i.setValue(new cw2(jFloatToRawIntBits2));
            jh3Var.c = str;
            ov0Var.m0(ph3Var);
            objQ = ph3Var;
        }
        return (ph3) objQ;
    }

    public static final boolean o(int i, ah ahVar, dq0 dq0Var, pe2 pe2Var) {
        dq0 dq0VarF;
        gy1 gy1Var = new gy1(new dq0[16]);
        if (!dq0Var.e.r) {
            p21.c("visitChildren called on an unattached node");
        }
        gy1 gy1Var2 = new gy1(new cv1[16]);
        cv1 cv1Var = dq0Var.e;
        cv1 cv1Var2 = cv1Var.j;
        if (cv1Var2 == null) {
            xp1.h(gy1Var2, cv1Var);
        } else {
            gy1Var2.b(cv1Var2);
        }
        while (true) {
            int i2 = gy1Var2.g;
            if (i2 == 0) {
                break;
            }
            cv1 cv1VarJ = (cv1) gy1Var2.k(i2 - 1);
            if ((cv1VarJ.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                xp1.h(gy1Var2, cv1VarJ);
            } else {
                while (cv1VarJ != null) {
                    if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        gy1 gy1Var3 = null;
                        while (cv1VarJ != null) {
                            if (cv1VarJ instanceof dq0) {
                                dq0 dq0Var2 = (dq0) cv1VarJ;
                                if (dq0Var2.r) {
                                    gy1Var.b(dq0Var2);
                                }
                            } else if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                int i3 = 0;
                                for (cv1 cv1Var3 = ((lb0) cv1VarJ).t; cv1Var3 != null; cv1Var3 = cv1Var3.j) {
                                    if ((cv1Var3.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cv1VarJ = cv1Var3;
                                        } else {
                                            if (gy1Var3 == null) {
                                                gy1Var3 = new gy1(new cv1[16]);
                                            }
                                            if (cv1VarJ != null) {
                                                gy1Var3.b(cv1VarJ);
                                                cv1VarJ = null;
                                            }
                                            gy1Var3.b(cv1Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            cv1VarJ = xp1.J(gy1Var3);
                        }
                        break;
                    }
                    cv1VarJ = cv1VarJ.j;
                }
            }
        }
        while (gy1Var.g != 0 && (dq0VarF = f(gy1Var, pe2Var, i)) != null) {
            if (dq0VarF.o1().a) {
                return ((Boolean) ahVar.invoke(dq0VarF)).booleanValue();
            }
            if (i(i, ahVar, dq0VarF, pe2Var)) {
                return true;
            }
            gy1Var.j(dq0VarF);
        }
        return false;
    }

    public static final um3 p(t61 t61Var, bt2 bt2Var) {
        bt2Var.getClass();
        mh0 mh0VarC = bt2Var.c();
        if (mh0VarC instanceof ja2) {
            return um3.POLY_OBJ;
        }
        if (o51.f(mh0VarC, u13.f)) {
            return um3.LIST;
        }
        if (!o51.f(mh0VarC, u13.g)) {
            return um3.OBJ;
        }
        bt2 bt2VarC = c(bt2Var.i(0), t61Var.b);
        mh0 mh0VarC2 = bt2VarC.c();
        if ((mh0VarC2 instanceof bc2) || o51.f(mh0VarC2, ft2.e)) {
            return um3.MAP;
        }
        throw ce0.b(bt2VarC);
    }

    public static final Boolean q(int i, ah ahVar, dq0 dq0Var, pe2 pe2Var) {
        int iOrdinal = dq0Var.r1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                dq0 dq0VarU = vd0.u(dq0Var);
                if (dq0VarU == null) {
                    fo.n("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = dq0VarU.r1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolQ = q(i, ahVar, dq0VarU, pe2Var);
                        if (!o51.f(boolQ, Boolean.FALSE)) {
                            return boolQ;
                        }
                        if (pe2Var == null) {
                            if (dq0VarU.r1() != zp0.f) {
                                fo.n("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            dq0 dq0VarP = vd0.p(dq0VarU);
                            if (dq0VarP == null) {
                                fo.n("ActiveParent must have a focusedChild");
                                return null;
                            }
                            pe2Var = vd0.s(dq0VarP);
                        }
                        return Boolean.valueOf(i(i, ahVar, dq0Var, pe2Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            b81.d();
                            return null;
                        }
                        fo.n("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (pe2Var == null) {
                    pe2Var = vd0.s(dq0VarU);
                }
                return Boolean.valueOf(i(i, ahVar, dq0Var, pe2Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    b81.d();
                    return null;
                }
                if (dq0Var.o1().a) {
                    return (Boolean) ahVar.invoke(dq0Var);
                }
                return pe2Var == null ? Boolean.valueOf(g(dq0Var, i, ahVar)) : Boolean.valueOf(o(i, ahVar, dq0Var, pe2Var));
            }
        }
        return Boolean.valueOf(g(dq0Var, i, ahVar));
    }
}
