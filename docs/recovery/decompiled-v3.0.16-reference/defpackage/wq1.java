package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class wq1 {
    public static final hh0 a;

    static {
        ig0.B(new oi1(6));
        a = new hh0(1, new oi1(7));
    }

    public static final void a(kz kzVar, uv1 uv1Var, gu2 gu2Var, je3 je3Var, p10 p10Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(904511636);
        if ((i & 6) == 0) {
            i2 = (ov0Var.f(kzVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.f(uv1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.f(gu2Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.f(je3Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= ov0Var.h(p10Var) ? 16384 : 8192;
        }
        int i3 = 1;
        if (ov0Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            ov0Var.Y();
            if ((i & 1) != 0 && !ov0Var.B()) {
                ov0Var.W();
            }
            ov0Var.q();
            uh2 uh2VarA = sh2.a(false, 0.0f, 7);
            long j = kzVar.a;
            boolean zE = ov0Var.e(j);
            Object objQ = ov0Var.Q();
            if (zE || objQ == d30.a) {
                objQ = new i93(j, hz.c(0.4f, j));
                ov0Var.m0(objQ);
            }
            k22.c(new kk[]{mz.a.a(kzVar), a.a(uv1Var), m11.a.a(uh2VarA), hu2.a.a(gu2Var), j93.a.a((i93) objQ), le3.a.a(je3Var)}, sb.a0(-1750539308, new pu(i3, je3Var, p10Var), ov0Var), ov0Var, 56);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new v9(kzVar, uv1Var, gu2Var, je3Var, p10Var, i, 2);
        }
    }

    public static final void b(kz kzVar, gu2 gu2Var, je3 je3Var, p10 p10Var, f30 f30Var, int i, int i2) {
        int i3;
        kz kzVar2;
        gu2 gu2Var2;
        je3 je3Var2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-449719819);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && ov0Var.f(kzVar)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        if ((i & 384) == 0) {
            i3 |= WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i3 |= ov0Var.h(p10Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            ov0Var.Y();
            if ((i & 1) == 0 || ov0Var.B()) {
                if ((i2 & 1) != 0) {
                    kzVar = (kz) ov0Var.j(mz.a);
                    i3 &= -15;
                }
                gu2Var = (gu2) ov0Var.j(hu2.a);
                je3Var = (je3) ov0Var.j(le3.a);
            } else {
                ov0Var.W();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            }
            int i4 = i3 & (-1009);
            kz kzVar3 = kzVar;
            gu2 gu2Var3 = gu2Var;
            je3 je3Var3 = je3Var;
            ov0Var.q();
            a(kzVar3, (uv1) ov0Var.j(a), gu2Var3, je3Var3, p10Var, ov0Var, (i4 & 14) | ((i4 << 3) & 57344));
            kzVar2 = kzVar3;
            gu2Var2 = gu2Var3;
            je3Var2 = je3Var3;
        } else {
            ov0Var.W();
            kzVar2 = kzVar;
            gu2Var2 = gu2Var;
            je3Var2 = je3Var;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new wo1(kzVar2, gu2Var2, je3Var2, p10Var, i, i2, 1);
        }
    }
}
