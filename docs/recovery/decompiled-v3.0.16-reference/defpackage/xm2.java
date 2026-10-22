package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.ThreadContextElement;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class xm2 implements pu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ xm2(int i) {
        this.e = i;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        mj mjVar;
        Object objA;
        switch (this.e) {
            case 0:
                return Integer.valueOf(((c01) obj2).a);
            case 1:
                return Integer.valueOf(((hr0) obj2).a);
            case 2:
                return Integer.valueOf(((ir0) obj2).a);
            case 3:
                w93 w93Var = (w93) obj2;
                return w93Var != null ? w93.a(w93Var.a, w93.c) : false ? Boolean.FALSE : am1.d(Float.valueOf(w93.c(w93Var.a)), an2.a(new x93(w93.b(w93Var.a)), an2.w, (pl2) obj));
            case 4:
                zf1 zf1Var = (zf1) obj2;
                return am1.d(zf1Var.a, an2.a(zf1Var.b, an2.i, (pl2) obj));
            case Logger.WARN /* 5 */:
                long j = ((x93) obj2).a;
                if (x93.a(j, 8589934592L)) {
                    return 0;
                }
                if (x93.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case Logger.ERROR /* 6 */:
                c12 c12Var = (c12) obj2;
                return c12Var != null ? c12.b(c12Var.a, 9205357640488583168L) : false ? Boolean.FALSE : am1.d(Float.valueOf(Float.intBitsToFloat((int) (c12Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (c12Var.a & 4294967295L))));
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                pl2 pl2Var = (pl2) obj;
                cj cjVar = (cj) obj2;
                Object obj3 = cjVar.a;
                if (obj3 instanceof p52) {
                    mjVar = mj.e;
                } else if (obj3 instanceof uy2) {
                    mjVar = mj.f;
                } else if (obj3 instanceof fi3) {
                    mjVar = mj.g;
                } else if (obj3 instanceof zg3) {
                    mjVar = mj.h;
                } else if (obj3 instanceof ag1) {
                    mjVar = mj.i;
                } else if (obj3 instanceof zf1) {
                    mjVar = mj.j;
                } else {
                    if (!(obj3 instanceof h13)) {
                        throw new UnsupportedOperationException();
                    }
                    mjVar = mj.k;
                }
                switch (mjVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        objA = an2.a((p52) obj3, an2.g, pl2Var);
                        break;
                    case 1:
                        obj3.getClass();
                        objA = an2.a((uy2) obj3, an2.h, pl2Var);
                        break;
                    case 2:
                        obj3.getClass();
                        objA = an2.a((fi3) obj3, an2.c, pl2Var);
                        break;
                    case 3:
                        obj3.getClass();
                        objA = an2.a((zg3) obj3, an2.d, pl2Var);
                        break;
                    case 4:
                        obj3.getClass();
                        objA = an2.a((ag1) obj3, an2.e, pl2Var);
                        break;
                    case Logger.WARN /* 5 */:
                        obj3.getClass();
                        objA = an2.a((zf1) obj3, an2.f, pl2Var);
                        break;
                    case Logger.ERROR /* 6 */:
                        obj3.getClass();
                        objA = ((h13) obj3).a;
                        break;
                    default:
                        b81.d();
                        return null;
                }
                return am1.d(mjVar, objA, Integer.valueOf(cjVar.b), Integer.valueOf(cjVar.c), cjVar.d);
            case 8:
                pl2 pl2Var2 = (pl2) obj;
                List list = ((sh1) obj2).e;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(an2.a((rh1) list.get(i), an2.z, pl2Var2));
                }
                return arrayList;
            case mc0.b /* 9 */:
                return ((rh1) obj2).a.toLanguageTag();
            case mc0.c /* 10 */:
                pl2 pl2Var3 = (pl2) obj;
                sf1 sf1Var = (sf1) obj2;
                return am1.d(an2.a(new pf1(sf1Var.a), an2.B, pl2Var3), an2.a(new rf1(sf1Var.b), an2.C, pl2Var3), an2.a(new qf1(sf1Var.c), an2.D, pl2Var3));
            case 11:
                return Float.valueOf(((pf1) obj2).a);
            case mc0.d /* 12 */:
                return Integer.valueOf(((rf1) obj2).a);
            case 13:
                return Integer.valueOf(((qf1) obj2).a);
            case 14:
                return ((fi3) obj2).a;
            case a83.e /* 15 */:
                pl2 pl2Var4 = (pl2) obj;
                p52 p52Var = (p52) obj2;
                Object objA2 = an2.a(new m53(p52Var.a), an2.q, pl2Var4);
                Object objA3 = an2.a(new r63(p52Var.b), an2.r, pl2Var4);
                Object objA4 = an2.a(new w93(p52Var.c), an2.v, pl2Var4);
                k83 k83Var = p52Var.d;
                k83 k83Var2 = k83.c;
                Object objA5 = an2.a(k83Var, an2.l, pl2Var4);
                Object objA6 = an2.a(p52Var.e, da0.R, pl2Var4);
                sf1 sf1Var2 = p52Var.f;
                sf1 sf1Var3 = sf1.d;
                return am1.d(objA2, objA3, objA4, objA5, objA6, an2.a(sf1Var2, an2.A, pl2Var4), an2.a(new nf1(p52Var.g), da0.T, pl2Var4), an2.a(new c01(p52Var.h), an2.s, pl2Var4), an2.a(p52Var.i, da0.U, pl2Var4));
            case 16:
                return ((zg3) obj2).a;
            case 17:
                pl2 pl2Var5 = (pl2) obj;
                uy2 uy2Var = (uy2) obj2;
                hz hzVar = new hz(uy2Var.a.a());
                zm2 zm2Var = an2.p;
                Object objA7 = an2.a(hzVar, zm2Var, pl2Var5);
                w93 w93Var2 = new w93(uy2Var.b);
                zm2 zm2Var2 = an2.v;
                Object objA8 = an2.a(w93Var2, zm2Var2, pl2Var5);
                jr0 jr0Var = uy2Var.c;
                jr0 jr0Var2 = jr0.f;
                Object objA9 = an2.a(jr0Var, an2.m, pl2Var5);
                Object objA10 = an2.a(uy2Var.d, an2.t, pl2Var5);
                Object objA11 = an2.a(uy2Var.e, an2.u, pl2Var5);
                String str = uy2Var.g;
                Object objA12 = an2.a(new w93(uy2Var.h), zm2Var2, pl2Var5);
                Object objA13 = an2.a(uy2Var.i, an2.n, pl2Var5);
                Object objA14 = an2.a(uy2Var.j, an2.k, pl2Var5);
                sh1 sh1Var = uy2Var.k;
                sh1 sh1Var2 = sh1.g;
                Object objA15 = an2.a(sh1Var, an2.y, pl2Var5);
                Object objA16 = an2.a(new hz(uy2Var.l), zm2Var, pl2Var5);
                Object objA17 = an2.a(uy2Var.m, an2.j, pl2Var5);
                xt2 xt2Var = uy2Var.n;
                xt2 xt2Var2 = xt2.d;
                return am1.d(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, an2.a(xt2Var, an2.o, pl2Var5));
            case 18:
                pl2 pl2Var6 = (pl2) obj;
                b93 b93Var = (b93) obj2;
                uy2 uy2Var2 = b93Var.a;
                z92 z92Var = an2.h;
                return am1.d(an2.a(uy2Var2, z92Var, pl2Var6), an2.a(b93Var.b, z92Var, pl2Var6), an2.a(b93Var.c, z92Var, pl2Var6), an2.a(b93Var.d, z92Var, pl2Var6));
            case 19:
                w82 w82Var = (w82) obj2;
                Boolean boolValueOf = Boolean.valueOf(w82Var.a);
                z92 z92Var2 = an2.a;
                return am1.d(boolValueOf, an2.a(new kj0(w82Var.b), da0.S, (pl2) obj));
            case 20:
                return Integer.valueOf(((kj0) obj2).a);
            case 21:
                return Integer.valueOf(((nf1) obj2).a);
            case 22:
                d93 d93Var = (d93) obj2;
                return am1.d(an2.a(new c93(d93Var.a), da0.V, (pl2) obj), Boolean.valueOf(d93Var.b));
            case 23:
                return Integer.valueOf(((c93) obj2).a);
            case 24:
                return Integer.valueOf(((co2) obj2).a.g());
            case 25:
                return Long.valueOf(((er2) obj2).d.get());
            case 26:
                ((kn2) obj).getClass();
                ((r52) obj2).getClass();
                return new tz2();
            case 27:
                r73 r73Var = (r73) obj2;
                return am1.G(Float.valueOf(r73Var.a.g()), Boolean.valueOf(((x32) r73Var.f.getValue()) == x32.e));
            case 28:
                return ThreadContextKt.countAll$lambda$0(obj, (w70) obj2);
            default:
                return ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (w70) obj2);
        }
    }
}
