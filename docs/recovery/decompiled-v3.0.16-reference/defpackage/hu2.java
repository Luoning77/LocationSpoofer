package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class hu2 {
    public static final hh0 a = new hh0(1, new oi1(24));

    public static final au2 a(cu2 cu2Var, f30 f30Var) {
        gu2 gu2Var = (gu2) ((ov0) f30Var).j(a);
        switch (cu2Var.ordinal()) {
            case 0:
                return gu2Var.h;
            case 1:
                return gu2Var.e;
            case 2:
                return gu2Var.g;
            case 3:
                return b(gu2Var.e);
            case 4:
                return gu2Var.a;
            case Logger.WARN /* 5 */:
                return b(gu2Var.a);
            case Logger.ERROR /* 6 */:
                return cj2.a;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return gu2Var.d;
            case 8:
                bj2 bj2Var = gu2Var.d;
                ud0 ud0Var = bu2.i;
                return bj2.b(bj2Var, ud0Var, null, null, ud0Var, 6);
            case mc0.b /* 9 */:
                return gu2Var.f;
            case mc0.c /* 10 */:
                bj2 bj2Var2 = gu2Var.d;
                ud0 ud0Var2 = bu2.i;
                return bj2.b(bj2Var2, null, ud0Var2, ud0Var2, null, 9);
            case 11:
                return b(gu2Var.d);
            case mc0.d /* 12 */:
                return gu2Var.c;
            case 13:
                return o51.p0;
            case 14:
                return gu2Var.b;
            default:
                b81.d();
                return null;
        }
    }

    public static bj2 b(bj2 bj2Var) {
        ud0 ud0Var = bu2.i;
        return bj2.b(bj2Var, null, null, ud0Var, ud0Var, 3);
    }
}
