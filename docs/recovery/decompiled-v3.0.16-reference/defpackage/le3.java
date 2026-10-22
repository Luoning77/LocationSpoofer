package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class le3 {
    public static final hh0 a = new hh0(1, new h63(8));

    public static final q93 a(ke3 ke3Var, f30 f30Var) {
        je3 je3Var = (je3) ((ov0) f30Var).j(a);
        switch (ke3Var.ordinal()) {
            case 0:
                return je3Var.j;
            case 1:
                return je3Var.k;
            case 2:
                return je3Var.l;
            case 3:
                return je3Var.a;
            case 4:
                return je3Var.b;
            case Logger.WARN /* 5 */:
                return je3Var.c;
            case Logger.ERROR /* 6 */:
                return je3Var.d;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return je3Var.e;
            case 8:
                return je3Var.f;
            case mc0.b /* 9 */:
                return je3Var.m;
            case mc0.c /* 10 */:
                return je3Var.n;
            case 11:
                return je3Var.o;
            case mc0.d /* 12 */:
                return je3Var.g;
            case 13:
                return je3Var.h;
            case 14:
                return je3Var.i;
            case a83.e /* 15 */:
                return je3Var.y;
            case 16:
                return je3Var.z;
            case 17:
                return je3Var.A;
            case 18:
                return je3Var.p;
            case 19:
                return je3Var.q;
            case 20:
                return je3Var.r;
            case 21:
                return je3Var.s;
            case 22:
                return je3Var.t;
            case 23:
                return je3Var.u;
            case 24:
                return je3Var.B;
            case 25:
                return je3Var.C;
            case 26:
                return je3Var.D;
            case 27:
                return je3Var.v;
            case 28:
                return je3Var.w;
            case 29:
                return je3Var.x;
            default:
                b81.d();
                return null;
        }
    }
}
