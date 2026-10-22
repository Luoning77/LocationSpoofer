package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class i9 {
    public static final b52 a = new b52(24.0f, 24.0f, 24.0f, 24.0f);
    public static final b52 b;
    public static final b52 c;
    public static final hh0 d;

    static {
        zm3.f(7, 16.0f);
        b = zm3.f(7, 16.0f);
        c = zm3.f(7, 24.0f);
        d = new hh0(0, new p4(2));
    }

    public static final void a(final p10 p10Var, dv1 dv1Var, final pu0 pu0Var, final pu0 pu0Var2, final au2 au2Var, final long j, final long j2, final long j3, final long j4, final long j5, f30 f30Var, final int i) {
        final dv1 dv1Var2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1378716401);
        int i2 = i | 48 | (ov0Var.h(null) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(pu0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var.h(pu0Var2) ? 16384 : 8192) | (ov0Var.f(au2Var) ? 131072 : 65536) | (ov0Var.e(j) ? 1048576 : 524288) | (ov0Var.c(0.0f) ? 8388608 : 4194304) | (ov0Var.e(j2) ? 67108864 : 33554432) | (ov0Var.e(j3) ? 536870912 : 268435456);
        if (ov0Var.T(i2 & 1, ((306783379 & i2) == 306783378 && (((ov0Var.e(j5) ? ' ' : (char) 16) | (ov0Var.e(j4) ? (char) 4 : (char) 2)) & 19) == 18) ? false : true)) {
            p10 p10VarA0 = sb.a0(-652798794, new e9(pu0Var, pu0Var2, j3, j4, j5, j2, p10Var), ov0Var);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & 112) | 12582918 | ((i2 >> 9) & 57344);
            av1 av1Var = av1.a;
            e33.a(av1Var, au2Var, j, 0L, 0.0f, 0.0f, null, p10VarA0, ov0Var, i4, 104);
            dv1Var2 = av1Var;
        } else {
            ov0Var.W();
            dv1Var2 = dv1Var;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0(dv1Var2, pu0Var, pu0Var2, au2Var, j, j2, j3, j4, j5, i) { // from class: a9
                public final /* synthetic */ dv1 f;
                public final /* synthetic */ pu0 g;
                public final /* synthetic */ pu0 h;
                public final /* synthetic */ au2 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ long l;
                public final /* synthetic */ long m;
                public final /* synthetic */ long n;

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(7);
                    i9.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (f30) obj, iM0);
                    return mf3.a;
                }
            };
        }
    }

    public static final void b(p10 p10Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-917637668);
        if (ov0Var.T(i & 1, (i & 147) != 146)) {
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = new lc(8);
                ov0Var.m0(objQ);
            }
            er1 er1Var = (er1) objQ;
            int iT = ks.T(ov0Var);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, av1.a);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, er1Var);
            q73.h(ov0Var, v20.d, l72VarL);
            gh ghVar = v20.f;
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT))) {
                az2.r(iT, ov0Var, iT, ghVar);
            }
            q73.h(ov0Var, v20.c, dv1VarH);
            p10Var.invoke(ov0Var, 6);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new c9(p10Var, i, 0);
        }
    }

    public static final void c(au0 au0Var, p10 p10Var, dv1 dv1Var, pu0 pu0Var, pu0 pu0Var2, pu0 pu0Var3, au2 au2Var, long j, long j2, long j3, long j4, qc0 qc0Var, f30 f30Var, int i, int i2) {
        int i3;
        p10 p10Var2;
        pu0 pu0Var4;
        int i4;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-867616355);
        if ((i & 6) == 0) {
            i3 = (ov0Var.h(au0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            p10Var2 = p10Var;
            i3 |= ov0Var.h(p10Var2) ? 32 : 16;
        } else {
            p10Var2 = p10Var;
        }
        if ((i & 384) == 0) {
            i3 |= ov0Var.f(dv1Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            pu0Var4 = pu0Var;
            i3 |= ov0Var.h(pu0Var4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        } else {
            pu0Var4 = pu0Var;
        }
        if ((i & 24576) == 0) {
            i3 |= ov0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ov0Var.h(pu0Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ov0Var.h(pu0Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ov0Var.f(au2Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ov0Var.e(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ov0Var.e(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ov0Var.e(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ov0Var.e(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ov0Var.c(0.0f) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ov0Var.f(qc0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i5 = i4;
        if (ov0Var.T(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            d(au0Var, dv1Var, qc0Var, sb.a0(527420759, new h9(pu0Var2, pu0Var3, au2Var, j, j2, j3, j4, pu0Var4, p10Var2), ov0Var), ov0Var, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new z8(au0Var, p10Var, dv1Var, pu0Var, pu0Var2, pu0Var3, au2Var, j, j2, j3, j4, qc0Var, i, i2, 0);
        }
    }

    public static final void d(au0 au0Var, dv1 dv1Var, qc0 qc0Var, p10 p10Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(24925658);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(au0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.f(dv1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.f(qc0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.h(p10Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            ba0 ba0Var = (ba0) ov0Var.j(d);
            mn2 mn2Var = new mn2();
            mn2Var.e = au0Var;
            mn2Var.f = dv1Var;
            mn2Var.g = qc0Var;
            mn2Var.h = p10Var;
            ba0Var.a(mn2Var, ov0Var, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new b9(au0Var, dv1Var, qc0Var, p10Var, i);
        }
    }
}
