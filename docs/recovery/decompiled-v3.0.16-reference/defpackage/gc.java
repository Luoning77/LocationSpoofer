package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class gc {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(f12 f12Var, dv1 dv1Var, long j, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1776202187);
        int i3 = (ov0Var.f(f12Var) ? 4 : 2) | i | (ov0Var.f(dv1Var) ? 32 : 16) | WorkQueueKt.BUFFER_CAPACITY;
        int i4 = 0;
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            ov0Var.Y();
            if ((i & 1) == 0 || ov0Var.B()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                ov0Var.W();
                i2 = i3 & (-897);
            }
            ov0Var.q();
            int i5 = i2 & 14;
            boolean z = i5 == 4;
            Object objQ = ov0Var.Q();
            if (z || objQ == d30.a) {
                objQ = new t(f12Var, 4);
                ov0Var.m0(objQ);
            }
            ji2.s(f12Var, j9.g, sb.a0(-1653527038, new bc(i4, j, gs2.a(dv1Var, false, (lu0) objQ)), ov0Var), ov0Var, i5 | 432);
        } else {
            ov0Var.W();
        }
        long j2 = j;
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new cc(f12Var, dv1Var, j2, i, 0);
        }
    }

    public static final void b(dv1 dv1Var, f30 f30Var, int i, int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (ov0Var.f(dv1Var) ? 4 : 2) | i;
        }
        int i5 = 0;
        if (ov0Var.T(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                dv1Var = av1.a;
            }
            gh0.h(ov0Var, xp1.v(iw2.l(dv1Var, a, 25.0f), new ec(i5, ((i93) ov0Var.j(j93.a)).a)));
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new dc(dv1Var, i, i2);
        }
    }
}
