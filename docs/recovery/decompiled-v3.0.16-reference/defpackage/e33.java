package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class e33 {
    public static final hh0 a = new hh0(0, new oi1(26));

    public static final void a(dv1 dv1Var, au2 au2Var, long j, long j2, float f, float f2, is isVar, p10 p10Var, f30 f30Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            dv1Var = av1.a;
        }
        if ((i2 & 2) != 0) {
            au2Var = o51.p0;
        }
        if ((i2 & 4) != 0) {
            j = ((kz) ((ov0) f30Var).j(mz.a)).p;
        }
        if ((i2 & 8) != 0) {
            j2 = mz.b(j, f30Var);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            isVar = null;
        }
        ov0 ov0Var = (ov0) f30Var;
        hh0 hh0Var = a;
        float f3 = f + ((td0) ov0Var.j(hh0Var)).e;
        k22.c(new kk[]{v50.a.a(new hz(j2)), hh0Var.a(new td0(f3))}, sb.a0(421772006, new b33(dv1Var, au2Var, j, f3, isVar, f2, p10Var), ov0Var), ov0Var, 56);
    }

    public static final void b(au0 au0Var, dv1 dv1Var, boolean z, au2 au2Var, long j, long j2, float f, is isVar, ix1 ix1Var, p10 p10Var, f30 f30Var, int i, int i2) {
        boolean z2 = (i2 & 4) != 0 ? true : z;
        long jB = (i2 & 32) != 0 ? mz.b(j, f30Var) : j2;
        float f2 = (i2 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? 0.0f : f;
        is isVar2 = (i2 & 256) != 0 ? null : isVar;
        ix1 ix1Var2 = (i2 & 512) == 0 ? ix1Var : null;
        ov0 ov0Var = (ov0) f30Var;
        if (ix1Var2 == null) {
            ov0Var.c0(-1701037204);
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = new ix1();
                ov0Var.m0(objQ);
            }
            ix1Var2 = (ix1) objQ;
        } else {
            ov0Var.c0(2023337163);
        }
        ov0Var.p(false);
        ix1 ix1Var3 = ix1Var2;
        ov0 ov0Var2 = (ov0) f30Var;
        hh0 hh0Var = a;
        float f3 = ((td0) ov0Var2.j(hh0Var)).e + 0.0f;
        k22.c(new kk[]{v50.a.a(new hz(jB)), hh0Var.a(new td0(f3))}, sb.a0(849208527, new c33(dv1Var, au2Var, j, f3, isVar2, ix1Var3, z2, au0Var, f2, p10Var), ov0Var2), ov0Var2, 56);
    }

    public static final dv1 c(dv1 dv1Var, au2 au2Var, long j, is isVar, float f) {
        au2 au2Var2;
        dv1 dv1VarA;
        dv1 hsVar = av1.a;
        if (f > 0.0f) {
            long j2 = ac3.b;
            long j3 = pw0.a;
            au2Var2 = au2Var;
            dv1VarA = am1.A(hsVar, 1.0f, 1.0f, 1.0f, f, j2, au2Var2, false, j3, j3, null);
        } else {
            au2Var2 = au2Var;
            dv1VarA = hsVar;
        }
        dv1 dv1VarD = dv1Var.d(dv1VarA);
        if (isVar != null) {
            hsVar = new hs(isVar.a, isVar.b, au2Var2);
        }
        return xp1.n(xp1.k(dv1VarD.d(hsVar), j, au2Var2), au2Var2);
    }

    public static final long d(long j, float f, ov0 ov0Var) {
        kz kzVar = (kz) ov0Var.j(mz.a);
        boolean zBooleanValue = ((Boolean) ov0Var.j(mz.b)).booleanValue();
        long j2 = kzVar.p;
        int i = hz.h;
        if (ye3.a(j, j2) && zBooleanValue) {
            return td0.b(f, 0.0f) ? j2 : xp1.q(hz.c(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, kzVar.t), j2);
        }
        return j;
    }
}
