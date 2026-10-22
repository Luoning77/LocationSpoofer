package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class t01 {
    public static final dv1 a = iw2.k(av1.a, ji2.x);

    public static final void a(final x01 x01Var, String str, dv1 dv1Var, long j, f30 f30Var, final int i, final int i2) {
        int i3;
        String str2;
        final long j2;
        final dv1 dv1Var2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-126890956);
        if ((i & 6) == 0) {
            i3 = (ov0Var.f(x01Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ov0Var.f(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= ov0Var.f(dv1Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && ov0Var.e(j)) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            ov0Var.Y();
            if ((i & 1) == 0 || ov0Var.B()) {
                if (i4 != 0) {
                    dv1Var = av1.a;
                }
                if ((i2 & 8) != 0) {
                    j = ((hz) ov0Var.j(v50.a)).a;
                    i3 &= -7169;
                }
            } else {
                ov0Var.W();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            dv1 dv1Var3 = dv1Var;
            long j3 = j;
            ov0Var.q();
            str2 = str;
            b(v83.n(x01Var, ov0Var), str2, dv1Var3, j3, ov0Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
            dv1Var2 = dv1Var3;
            j2 = j3;
        } else {
            str2 = str;
            ov0Var.W();
            j2 = j;
            dv1Var2 = dv1Var;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final String str3 = str2;
            ee2VarT.d = new pu0() { // from class: r01
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t01.a(x01Var, str3, dv1Var2, j2, (f30) obj, wc0.m0(i | 1), i2);
                    return mf3.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0116  */
    public static final void b(final f52 f52Var, final String str, final dv1 dv1Var, final long j, f30 f30Var, final int i) {
        int i2;
        dv1 dv1VarA;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-2142239481);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(f52Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.f(dv1Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.e(j) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            ov0Var.Y();
            if ((i & 1) != 0 && !ov0Var.B()) {
                ov0Var.W();
            }
            ov0Var.q();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && ov0Var.e(j)) || (i2 & 3072) == 2048;
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (z || objQ == c30Var) {
                objQ = ye3.a(j, hz.g) ? null : new rr(5, j);
                ov0Var.m0(objQ);
            }
            rr rrVar = (rr) objQ;
            dv1 dv1Var2 = av1.a;
            if (str != null) {
                ov0Var.c0(-536990979);
                boolean z2 = (i2 & 112) == 32;
                Object objQ2 = ov0Var.Q();
                if (z2 || objQ2 == c30Var) {
                    objQ2 = new z90(str, i3);
                    ov0Var.m0(objQ2);
                }
                dv1VarA = gs2.a(dv1Var2, false, (lu0) objQ2);
                ov0Var.p(false);
            } else {
                ov0Var.c0(-536832197);
                ov0Var.p(false);
                dv1VarA = dv1Var2;
            }
            if (cw2.a(f52Var.d(), 9205357640488583168L)) {
                dv1Var2 = a;
            } else {
                long jD = f52Var.d();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jD >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jD & 4294967295L)))) {
                    dv1Var2 = a;
                }
            }
            ws.a(sb.Y(dv1Var.d(dv1Var2), f52Var, null, f60.a, rrVar, 22).d(dv1VarA), ov0Var, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: s01
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t01.b(f52Var, str, dv1Var, j, (f30) obj, wc0.m0(i | 1));
                    return mf3.a;
                }
            };
        }
    }
}
