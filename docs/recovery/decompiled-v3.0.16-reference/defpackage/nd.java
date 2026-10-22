package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class nd {
    public static final hh0 a = new hh0(1, new p4(3));
    public static final ux0 b;

    static {
        long j = hz.c;
        b = new ux0(1.0f, 1.0f, new ur(hz.c(0.12f, j), 2.0f, new lf1(new kf1(0.5f, -0.3f, -0.05f), j, 1.0f), new lf1(new kf1(0.5f, 0.8f, -0.5f), j, 0.4f), 2));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void a(defpackage.dv1 r48, defpackage.au0 r49, defpackage.lu0 r50, defpackage.fq r51, int r52, boolean r53, defpackage.p10 r54, defpackage.f30 r55, int r56) {
        /*
            Method dump skipped, instruction units count: 1975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd.a(dv1, au0, lu0, fq, int, boolean, p10, f30, int):void");
    }

    public static final float b(s03 s03Var) {
        return ((Number) s03Var.getValue()).floatValue();
    }

    public static final void c(lk2 lk2Var, au0 au0Var, dv1 dv1Var, p10 p10Var, f30 f30Var, int i) {
        int i2;
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1927183594);
        if ((i & 6) == 0) {
            i2 = (ov0Var.f(lk2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.h(au0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.f(dv1Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.h(p10Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            au0 au0Var2 = (au0) ov0Var.j(a);
            dv1 dv1VarA = lk2.a(lk2Var, iw2.c(zm3.l(xp1.n(dv1Var, cj2.a), null, null, false, new vh2(4), au0Var, 12), 1.0f), 1.0f);
            boolean zF = ov0Var.f(au0Var2);
            Object objQ = ov0Var.Q();
            if (zF || objQ == d30.a) {
                objQ = new m4(2, au0Var2);
                ov0Var.m0(objQ);
            }
            dv1 dv1VarZ = am1.z(dv1VarA, (lu0) objQ);
            int i3 = (i2 & 7168) | 432;
            yz yzVarA = wz.a(new jo(1.0f, false, new fo(1)), j9.s, ov0Var, 54);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarZ);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, yzVarA);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            p10Var.invoke(zz.a, ov0Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new b9(lk2Var, au0Var, dv1Var, p10Var, i);
        }
    }

    public static final ux0 d(ux0 ux0Var, float f, f30 f30Var, int i) {
        i52 i52Var;
        ur urVar = ux0Var.c;
        urVar.getClass();
        lf1 lf1Var = urVar.d;
        ov0 ov0Var = (ov0) f30Var;
        Context context = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
        df1 df1Var = (df1) ov0Var.j(kh1.a);
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (objQ == c30Var) {
            objQ = ke0.H(hc0.e);
            ov0Var.m0(objQ);
        }
        ey1 ey1Var = (ey1) objQ;
        Float fValueOf = Float.valueOf(0.15f);
        boolean zC = ov0Var.c(0.15f) | ov0Var.h(context) | ov0Var.h(df1Var);
        Object objQ2 = ov0Var.Q();
        if (zC || objQ2 == c30Var) {
            objQ2 = new ji1(context, df1Var, ey1Var, 7);
            ov0Var.m0(objQ2);
        }
        oi0.c(context, df1Var, fValueOf, (lu0) objQ2, ov0Var);
        boolean zF = ov0Var.f((hc0) ey1Var.getValue()) | ov0Var.f(lf1Var) | ((((i & 112) ^ 48) > 32 && ov0Var.c(f)) || (i & 48) == 32);
        Object objQ3 = ov0Var.Q();
        if (zF || objQ3 == c30Var) {
            float f2 = ((hc0) ey1Var.getValue()).c;
            float f3 = ((hc0) ey1Var.getValue()).d;
            float f4 = (f3 * f3) + (f2 * f2);
            if (f4 > 0.01f) {
                float fSqrt = 1.0f / ((float) Math.sqrt(f4));
                i52Var = new i52(Float.valueOf(f2 * fSqrt), Float.valueOf(f3 * fSqrt));
            } else {
                i52Var = new i52(Float.valueOf(0.0f), Float.valueOf(-1.0f));
            }
            float fFloatValue = ((Number) i52Var.e).floatValue();
            float fFloatValue2 = ((Number) i52Var.f).floatValue();
            double d = (((double) f) * 3.141592653589793d) / 180.0d;
            float fCos = (float) Math.cos(d);
            float fSin = (float) Math.sin(d);
            lf1 lf1Var2 = new lf1(new kf1(((fCos * fFloatValue) - (fSin * fFloatValue2)) + 0.5f, (fCos * fFloatValue2) + (fSin * fFloatValue) + 0.7f, lf1Var.a.c), lf1Var.b, lf1Var.c);
            ov0Var.m0(lf1Var2);
            objQ3 = lf1Var2;
        }
        lf1 lf1Var3 = (lf1) objQ3;
        boolean zF2 = ov0Var.f(lf1Var3);
        Object objQ4 = ov0Var.Q();
        if (zF2 || objQ4 == c30Var) {
            long j = urVar.a;
            int i2 = urVar.b;
            float f5 = urVar.c;
            lf1 lf1Var4 = urVar.e;
            boolean z = urVar.f;
            lf1Var3.getClass();
            lf1Var4.getClass();
            objQ4 = ux0.a(ux0Var, 0.0f, new ur(j, i2, f5, lf1Var3, lf1Var4, z), 3);
            ov0Var.m0(objQ4);
        }
        return (ux0) objQ4;
    }
}
