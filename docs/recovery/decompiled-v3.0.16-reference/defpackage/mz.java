package defpackage;

import com.vincenthzr.locationspoofer.xposed.hooks.GnssSatelliteCatalog;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class mz {
    public static final hh0 a = new hh0(1, new p4(18));
    public static final hh0 b = new hh0(1, new qe0(1));

    public static final long a(kz kzVar, long j) {
        long j2 = kzVar.a;
        long j3 = kzVar.U;
        long j4 = kzVar.Q;
        long j5 = kzVar.M;
        long j6 = kzVar.q;
        int i = hz.h;
        if (ye3.a(j, j2)) {
            return kzVar.b;
        }
        if (ye3.a(j, kzVar.f)) {
            return kzVar.g;
        }
        if (ye3.a(j, kzVar.j)) {
            return kzVar.k;
        }
        if (ye3.a(j, kzVar.n)) {
            return kzVar.o;
        }
        if (ye3.a(j, kzVar.w)) {
            return kzVar.x;
        }
        if (ye3.a(j, kzVar.c)) {
            return kzVar.d;
        }
        if (ye3.a(j, kzVar.h)) {
            return kzVar.i;
        }
        if (ye3.a(j, kzVar.l)) {
            return kzVar.m;
        }
        if (ye3.a(j, kzVar.y)) {
            return kzVar.z;
        }
        if (ye3.a(j, kzVar.u)) {
            return kzVar.v;
        }
        if (!ye3.a(j, kzVar.p)) {
            if (ye3.a(j, kzVar.r)) {
                return kzVar.s;
            }
            if (!ye3.a(j, kzVar.D) && !ye3.a(j, kzVar.F) && !ye3.a(j, kzVar.G) && !ye3.a(j, kzVar.H) && !ye3.a(j, kzVar.I) && !ye3.a(j, kzVar.J) && !ye3.a(j, kzVar.E)) {
                if (ye3.a(j, kzVar.K) || ye3.a(j, kzVar.L)) {
                    return j5;
                }
                if (ye3.a(j, kzVar.O) || ye3.a(j, kzVar.P)) {
                    return j4;
                }
                return (ye3.a(j, kzVar.S) || ye3.a(j, kzVar.T)) ? j3 : hz.g;
            }
        }
        return j6;
    }

    public static final long b(long j, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.c0(89374938);
        long jA = a((kz) ov0Var.j(a), j);
        if (jA == 16) {
            jA = ((hz) ov0Var.j(v50.a)).a;
        }
        ov0Var.p(false);
        return jA;
    }

    public static final long c(kz kzVar, lz lzVar) {
        switch (lzVar.ordinal()) {
            case 0:
                return kzVar.n;
            case 1:
                return kzVar.w;
            case 2:
                return kzVar.y;
            case 3:
                return kzVar.v;
            case 4:
                return kzVar.e;
            case Logger.WARN /* 5 */:
                return kzVar.u;
            case Logger.ERROR /* 6 */:
                return kzVar.o;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return kzVar.x;
            case 8:
                return kzVar.z;
            case mc0.b /* 9 */:
                return kzVar.b;
            case mc0.c /* 10 */:
                return kzVar.d;
            case 11:
                return kzVar.M;
            case mc0.d /* 12 */:
                return kzVar.N;
            case 13:
                return kzVar.g;
            case 14:
                return kzVar.i;
            case a83.e /* 15 */:
                return kzVar.Q;
            case 16:
                return kzVar.R;
            case 17:
                return kzVar.q;
            case 18:
                return kzVar.s;
            case 19:
                return kzVar.k;
            case 20:
                return kzVar.m;
            case 21:
                return kzVar.U;
            case 22:
                return kzVar.V;
            case 23:
                return kzVar.A;
            case 24:
                return kzVar.B;
            case 25:
                return kzVar.a;
            case 26:
                return kzVar.c;
            case 27:
                return kzVar.K;
            case 28:
                return kzVar.L;
            case 29:
                return kzVar.C;
            case 30:
                return kzVar.f;
            case 31:
                return kzVar.h;
            case GnssSatelliteCatalog.MAX_SATELLITES /* 32 */:
                return kzVar.O;
            case 33:
                return kzVar.P;
            case 34:
                return kzVar.p;
            case 35:
                return kzVar.D;
            case 36:
                return kzVar.F;
            case 37:
                return kzVar.G;
            case 38:
                return kzVar.H;
            case 39:
                return kzVar.I;
            case 40:
                return kzVar.J;
            case 41:
                return kzVar.E;
            case 42:
                return kzVar.t;
            case 43:
                return kzVar.r;
            case 44:
                return kzVar.j;
            case 45:
                return kzVar.l;
            case 46:
                return kzVar.S;
            case 47:
                return kzVar.T;
            default:
                b81.d();
                return 0L;
        }
    }

    public static final long d(lz lzVar, f30 f30Var) {
        return c((kz) ((ov0) f30Var).j(a), lzVar);
    }
}
