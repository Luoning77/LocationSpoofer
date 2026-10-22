package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class jf {
    public static final hh0 a = new hh0(0, c8.p);
    public static final hh0 b = new hh0(0, c8.o);

    /* JADX WARN: Code duplicated, block: B:102:0x0225  */
    /* JADX WARN: Code duplicated, block: B:103:0x0229  */
    /* JADX WARN: Code duplicated, block: B:105:0x024f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0259  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0110  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x011a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x014f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0151  */
    /* JADX WARN: Code duplicated, block: B:70:0x0157  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:77:0x0175  */
    /* JADX WARN: Code duplicated, block: B:80:0x0195  */
    /* JADX WARN: Code duplicated, block: B:81:0x0197  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ff  */
    public static final void a(cb2 cb2Var, au0 au0Var, db2 db2Var, p10 p10Var, f30 f30Var, int i, int i2) {
        int i3;
        au0 au0Var2;
        db2 db2Var2;
        boolean z;
        au0 au0Var3;
        ee2 ee2VarT;
        au0 au0Var4;
        View view;
        xb0 xb0Var;
        String str;
        qa1 qa1Var;
        mv0 mv0VarY;
        ey1 ey1VarL;
        Object objQ;
        c30 c30Var;
        Object obj;
        UUID uuid;
        boolean zBooleanValue;
        Object objQ2;
        int i4;
        String str2;
        boolean z2;
        ya2 ya2Var;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean zF;
        Object objQ3;
        boolean z5;
        boolean z6;
        boolean zF2;
        Object objQ4;
        boolean z7;
        boolean z8;
        Object obj2;
        boolean zH;
        Object obj3;
        boolean zH2;
        int i7;
        Object obj4;
        boolean zH3;
        Object obj5;
        x30 x30Var;
        int i8;
        int i9;
        cb2 cb2Var2 = cb2Var;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1772091631);
        if ((i & 6) == 0) {
            i3 = (ov0Var.f(cb2Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                au0Var2 = au0Var;
                i3 |= ov0Var.h(au0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                db2Var2 = db2Var;
                if (ov0Var.f(db2Var2)) {
                    i9 = 256;
                } else {
                    i9 = WorkQueueKt.BUFFER_CAPACITY;
                }
                i3 |= i9;
            } else {
                db2Var2 = db2Var;
            }
            if ((i & 3072) == 0) {
                if (ov0Var.h(p10Var)) {
                    i8 = 2048;
                } else {
                    i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i8;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (ov0Var.T(i3 & 1, z)) {
                if (i10 != 0) {
                    au0Var4 = null;
                } else {
                    au0Var4 = au0Var2;
                }
                view = (View) ov0Var.j(AndroidCompositionLocals_androidKt.f);
                xb0Var = (xb0) ov0Var.j(z30.h);
                str = (String) ov0Var.j(a);
                qa1Var = (qa1) ov0Var.j(z30.n);
                mv0VarY = ks.Y(ov0Var);
                ey1VarL = ke0.L(p10Var, ov0Var);
                Object[] objArr = new Object[0];
                objQ = ov0Var.Q();
                c30Var = d30.a;
                obj = objQ;
                if (objQ == c30Var) {
                    c8 c8Var = c8.q;
                    ov0Var.m0(c8Var);
                    obj = c8Var;
                }
                uuid = (UUID) wc0.c0(objArr, (au0) obj, ov0Var, 48);
                zBooleanValue = ((Boolean) ov0Var.j(b)).booleanValue();
                objQ2 = ov0Var.Q();
                if (objQ2 == c30Var) {
                    str2 = str;
                    i4 = i3;
                    z2 = true;
                    ya2 ya2Var2 = new ya2(au0Var4, db2Var2, str2, view, xb0Var, cb2Var2, uuid, zBooleanValue);
                    cb2Var2 = cb2Var2;
                    ya2Var2.n(mv0VarY, new p10(new hf(ya2Var2, ey1VarL, true ? 1 : 0), true, -297523940));
                    ov0Var.m0(ya2Var2);
                    objQ2 = ya2Var2;
                } else {
                    i4 = i3;
                    str2 = str;
                    z2 = true;
                }
                ya2Var = (ya2) objQ2;
                boolean zH4 = ov0Var.h(ya2Var);
                i5 = i4 & 112;
                if (i5 == 32) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                boolean z9 = zH4 | z3;
                i6 = i4 & 896;
                if (i6 == 256) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                zF = z9 | z4 | ov0Var.f(str2) | ov0Var.d(qa1Var.ordinal());
                objQ3 = ov0Var.Q();
                if (zF || objQ3 == c30Var) {
                    objQ3 = new i8(ya2Var, au0Var4, db2Var, str2, qa1Var);
                    ov0Var.m0(objQ3);
                }
                oi0.a(ya2Var, (lu0) objQ3, ov0Var);
                boolean zH5 = ov0Var.h(ya2Var);
                if (i5 == 32) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                boolean z10 = zH5 | z5;
                if (i6 == 256) {
                    z6 = z2;
                } else {
                    z6 = false;
                }
                zF2 = z10 | z6 | ov0Var.f(str2) | ov0Var.d(qa1Var.ordinal());
                objQ4 = ov0Var.Q();
                if (zF2 || objQ4 == c30Var) {
                    objQ4 = new cf(ya2Var, au0Var4, db2Var, str2, qa1Var);
                    ov0Var.m0(objQ4);
                }
                oi0.i((au0) objQ4, ov0Var);
                boolean zH6 = ov0Var.h(ya2Var);
                if ((i4 & 14) == 4) {
                    z7 = z2;
                } else {
                    z7 = false;
                }
                z8 = zH6 | z7;
                Object objQ5 = ov0Var.Q();
                obj2 = objQ5;
                if (z8 == 0 || objQ5 == c30Var) {
                    ze zeVar = new ze(2, ya2Var, cb2Var2);
                    ov0Var.m0(zeVar);
                    obj2 = zeVar;
                }
                oi0.a(cb2Var2, (lu0) obj2, ov0Var);
                zH = ov0Var.h(ya2Var);
                Object objQ6 = ov0Var.Q();
                obj3 = objQ6;
                if (zH || objQ6 == c30Var) {
                    k kVar = new k(ya2Var, (q60) null, 7);
                    ov0Var.m0(kVar);
                    obj3 = kVar;
                }
                oi0.e(ov0Var, (pu0) obj3, ya2Var);
                zH2 = ov0Var.h(ya2Var);
                Object objQ7 = ov0Var.Q();
                if (!zH2 || objQ7 == c30Var) {
                    i7 = 0;
                    ef efVar = new ef(ya2Var, 0);
                    ov0Var.m0(efVar);
                    obj4 = efVar;
                } else {
                    i7 = 0;
                    obj4 = objQ7;
                }
                dv1 dv1VarG = k22.G(av1.a, (lu0) obj4);
                zH3 = ov0Var.h(ya2Var) | ov0Var.d(qa1Var.ordinal());
                Object objQ8 = ov0Var.Q();
                obj5 = objQ8;
                if (zH3 || objQ8 == c30Var) {
                    ff ffVar = new ff(i7, ya2Var, qa1Var);
                    ov0Var.m0(ffVar);
                    obj5 = ffVar;
                }
                er1 er1Var = (er1) obj5;
                int iHashCode = Long.hashCode(ov0Var.T);
                l72 l72VarL = ov0Var.l();
                dv1 dv1VarH = xp1.H(ov0Var, dv1VarG);
                w20.b.getClass();
                x30Var = v20.b;
                ov0Var.g0();
                if (ov0Var.S) {
                    ov0Var.k(x30Var);
                } else {
                    ov0Var.p0();
                }
                q73.h(ov0Var, v20.e, er1Var);
                q73.h(ov0Var, v20.d, l72VarL);
                q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                q73.g(ov0Var, v20.g);
                q73.h(ov0Var, v20.c, dv1VarH);
                ov0Var.p(z2);
                au0Var3 = au0Var4;
            } else {
                ov0Var.W();
                au0Var3 = au0Var2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new gf(cb2Var2, au0Var3, db2Var, p10Var, i, i2);
            }
        }
        i3 |= 48;
        au0Var2 = au0Var;
        if ((i & 384) == 0) {
            db2Var2 = db2Var;
            if (ov0Var.f(db2Var2)) {
                i9 = 256;
            } else {
                i9 = WorkQueueKt.BUFFER_CAPACITY;
            }
            i3 |= i9;
        } else {
            db2Var2 = db2Var;
        }
        if ((i & 3072) == 0) {
            if (ov0Var.h(p10Var)) {
                i8 = 2048;
            } else {
                i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 |= i8;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (ov0Var.T(i3 & 1, z)) {
            if (i10 != 0) {
                au0Var4 = null;
            } else {
                au0Var4 = au0Var2;
            }
            view = (View) ov0Var.j(AndroidCompositionLocals_androidKt.f);
            xb0Var = (xb0) ov0Var.j(z30.h);
            str = (String) ov0Var.j(a);
            qa1Var = (qa1) ov0Var.j(z30.n);
            mv0VarY = ks.Y(ov0Var);
            ey1VarL = ke0.L(p10Var, ov0Var);
            Object[] objArr2 = new Object[0];
            objQ = ov0Var.Q();
            c30Var = d30.a;
            obj = objQ;
            if (objQ == c30Var) {
                c8 c8Var2 = c8.q;
                ov0Var.m0(c8Var2);
                obj = c8Var2;
            }
            uuid = (UUID) wc0.c0(objArr2, (au0) obj, ov0Var, 48);
            zBooleanValue = ((Boolean) ov0Var.j(b)).booleanValue();
            objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                str2 = str;
                i4 = i3;
                z2 = true;
                ya2 ya2Var3 = new ya2(au0Var4, db2Var2, str2, view, xb0Var, cb2Var2, uuid, zBooleanValue);
                cb2Var2 = cb2Var2;
                ya2Var3.n(mv0VarY, new p10(new hf(ya2Var3, ey1VarL, true ? 1 : 0), true, -297523940));
                ov0Var.m0(ya2Var3);
                objQ2 = ya2Var3;
            } else {
                i4 = i3;
                str2 = str;
                z2 = true;
            }
            ya2Var = (ya2) objQ2;
            boolean zH7 = ov0Var.h(ya2Var);
            i5 = i4 & 112;
            if (i5 == 32) {
                z3 = z2;
            } else {
                z3 = false;
            }
            boolean z11 = zH7 | z3;
            i6 = i4 & 896;
            if (i6 == 256) {
                z4 = z2;
            } else {
                z4 = false;
            }
            zF = z11 | z4 | ov0Var.f(str2) | ov0Var.d(qa1Var.ordinal());
            objQ3 = ov0Var.Q();
            if (zF) {
                objQ3 = new i8(ya2Var, au0Var4, db2Var, str2, qa1Var);
                ov0Var.m0(objQ3);
            } else {
                objQ3 = new i8(ya2Var, au0Var4, db2Var, str2, qa1Var);
                ov0Var.m0(objQ3);
            }
            oi0.a(ya2Var, (lu0) objQ3, ov0Var);
            boolean zH8 = ov0Var.h(ya2Var);
            if (i5 == 32) {
                z5 = z2;
            } else {
                z5 = false;
            }
            boolean z12 = zH8 | z5;
            if (i6 == 256) {
                z6 = z2;
            } else {
                z6 = false;
            }
            zF2 = z12 | z6 | ov0Var.f(str2) | ov0Var.d(qa1Var.ordinal());
            objQ4 = ov0Var.Q();
            if (zF2) {
                objQ4 = new cf(ya2Var, au0Var4, db2Var, str2, qa1Var);
                ov0Var.m0(objQ4);
            } else {
                objQ4 = new cf(ya2Var, au0Var4, db2Var, str2, qa1Var);
                ov0Var.m0(objQ4);
            }
            oi0.i((au0) objQ4, ov0Var);
            boolean zH9 = ov0Var.h(ya2Var);
            if ((i4 & 14) == 4) {
                z7 = z2;
            } else {
                z7 = false;
            }
            z8 = zH9 | z7;
            Object objQ9 = ov0Var.Q();
            obj2 = objQ9;
            if (z8 == 0) {
                ze zeVar2 = new ze(2, ya2Var, cb2Var2);
                ov0Var.m0(zeVar2);
                obj2 = zeVar2;
            } else {
                ze zeVar3 = new ze(2, ya2Var, cb2Var2);
                ov0Var.m0(zeVar3);
                obj2 = zeVar3;
            }
            oi0.a(cb2Var2, (lu0) obj2, ov0Var);
            zH = ov0Var.h(ya2Var);
            Object objQ10 = ov0Var.Q();
            obj3 = objQ10;
            if (zH) {
                k kVar2 = new k(ya2Var, (q60) null, 7);
                ov0Var.m0(kVar2);
                obj3 = kVar2;
            } else {
                k kVar3 = new k(ya2Var, (q60) null, 7);
                ov0Var.m0(kVar3);
                obj3 = kVar3;
            }
            oi0.e(ov0Var, (pu0) obj3, ya2Var);
            zH2 = ov0Var.h(ya2Var);
            Object objQ11 = ov0Var.Q();
            if (zH2) {
                i7 = 0;
                ef efVar2 = new ef(ya2Var, 0);
                ov0Var.m0(efVar2);
                obj4 = efVar2;
            } else {
                i7 = 0;
                ef efVar3 = new ef(ya2Var, 0);
                ov0Var.m0(efVar3);
                obj4 = efVar3;
            }
            dv1 dv1VarG2 = k22.G(av1.a, (lu0) obj4);
            zH3 = ov0Var.h(ya2Var) | ov0Var.d(qa1Var.ordinal());
            Object objQ12 = ov0Var.Q();
            obj5 = objQ12;
            if (zH3) {
                ff ffVar2 = new ff(i7, ya2Var, qa1Var);
                ov0Var.m0(ffVar2);
                obj5 = ffVar2;
            } else {
                ff ffVar3 = new ff(i7, ya2Var, qa1Var);
                ov0Var.m0(ffVar3);
                obj5 = ffVar3;
            }
            er1 er1Var2 = (er1) obj5;
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarG2);
            w20.b.getClass();
            x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, er1Var2);
            q73.h(ov0Var, v20.d, l72VarL2);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode2));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH2);
            ov0Var.p(z2);
            au0Var3 = au0Var4;
        } else {
            ov0Var.W();
            au0Var3 = au0Var2;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new gf(cb2Var2, au0Var3, db2Var, p10Var, i, i2);
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
