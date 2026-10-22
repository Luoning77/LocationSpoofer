package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class n60 {
    public static final k60 a;

    static {
        hh0 hh0Var = jf.a;
        long j = hz.c;
        long j2 = hz.b;
        a = new k60(j, j2, j2, hz.c(0.38f, j2), hz.c(0.38f, j2));
    }

    public static final void a(k60 k60Var, dv1 dv1Var, p10 p10Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-527864079);
        if ((i & 6) == 0) {
            i2 = (ov0Var.f(k60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.f(dv1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(p10Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            or orVar = m60.a;
            dv1 dv1VarP = zm3.P(zm3.F(da0.J(xp1.k(hd0.O(dv1Var, 3.0f, cj2.a(4.0f), 0L, 0L, 28), k60Var.a, o51.p0), i51.f), 0.0f, m60.d, 1), zm3.O(ov0Var), true);
            int i3 = (i2 << 3) & 7168;
            yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarP);
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
            ee2VarT.d = new rf(k60Var, dv1Var, p10Var, i, 4);
        }
    }

    public static final void b(dv1 dv1Var, k60 k60Var, lu0 lu0Var, f30 f30Var, int i, int i2) {
        int i3;
        int i4;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (ov0Var.f(dv1Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (ov0Var.f(k60Var) ? 32 : 16);
        }
        int i7 = i4 | (ov0Var.h(lu0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        int i8 = 1;
        if (ov0Var.T(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                dv1Var = av1.a;
            }
            if (i6 != 0) {
                k60Var = a;
            }
            a(k60Var, dv1Var, sb.a0(-250345048, new bu(i8, lu0Var, k60Var), ov0Var), ov0Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            ov0Var.W();
        }
        dv1 dv1Var2 = dv1Var;
        k60 k60Var2 = k60Var;
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new rf(dv1Var2, k60Var2, lu0Var, i, i2);
        }
    }

    public static final void c(String str, boolean z, k60 k60Var, dv1 dv1Var, qu0 qu0Var, au0 au0Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-2001167027);
        if ((i & 6) == 0) {
            i2 = (ov0Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.f(k60Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.f(dv1Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= ov0Var.h(qu0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ov0Var.h(au0Var) ? 131072 : 65536;
        }
        if (ov0Var.T(i2 & 1, (74899 & i2) != 74898)) {
            or orVar = m60.a;
            float f = m60.c;
            jo joVar = new jo(f, true, new fo(0));
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objQ = ov0Var.Q();
            if (z2 || objQ == d30.a) {
                objQ = new n5(z, au0Var, 2);
                ov0Var.m0(objQ);
            }
            dv1 dv1VarF = zm3.F(iw2.m(iw2.e(zm3.m(dv1Var, z, str, (au0) objQ, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            kk2 kk2VarA = jk2.a(joVar, orVar, ov0Var, 54);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarF);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var, ghVar, kk2VarA);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            if (qu0Var == null) {
                ov0Var.c0(-1597947094);
                ov0Var.p(false);
            } else {
                ov0Var.c0(-1597947093);
                float f2 = m60.e;
                dv1 dv1VarJ = iw2.j(av1.a, f2, 0.0f, f2, f2, 2);
                er1 er1VarC = ws.c(j9.f, false);
                int iHashCode2 = Long.hashCode(ov0Var.T);
                l72 l72VarL2 = ov0Var.l();
                dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarJ);
                ov0Var.g0();
                if (ov0Var.S) {
                    ov0Var.k(x30Var);
                } else {
                    ov0Var.p0();
                }
                q73.h(ov0Var, ghVar, er1VarC);
                q73.h(ov0Var, ghVar2, l72VarL2);
                az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
                q73.h(ov0Var, ghVar4, dv1VarH2);
                qu0Var.invoke(new hz(z ? k60Var.c : k60Var.e), ov0Var, 0);
                ov0Var.p(true);
                ov0Var.p(false);
            }
            long j = z ? k60Var.b : k60Var.d;
            ym3.e(str, new wb1(1.0f, true), new q93(j, m60.h, m60.i, m60.k, 0L, m60.b, m60.j, 16613240), 0, false, 1, 0, ov0Var, (i2 & 14) | 1572864, 952);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new bd(str, z, k60Var, dv1Var, qu0Var, au0Var, i);
        }
    }
}
