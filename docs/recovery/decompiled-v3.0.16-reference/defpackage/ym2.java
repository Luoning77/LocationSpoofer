package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates;
import com.vincenthzr.locationspoofer.xposed.hooks.SystemAccelHooker;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemClassLocator;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ym2 implements lu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ ym2(int i) {
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004b  */
    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        hz hzVar;
        hz hzVar2;
        int iOffsetByCodePoints;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        kj0Var = null;
        kj0 kj0Var = null;
        xt2Var = null;
        xt2 xt2Var = null;
        d93Var = null;
        d93 d93Var = null;
        boolean z = false;
        switch (i) {
            case 0:
                String str = obj != null ? (String) obj : null;
                str.getClass();
                return new zg3(str);
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                zm2 zm2Var = an2.q;
                Boolean bool = Boolean.FALSE;
                o51.f(obj2, bool);
                m53 m53Var = obj2 != null ? (m53) zm2Var.f.invoke(obj2) : null;
                m53Var.getClass();
                int i2 = m53Var.a;
                Object obj3 = list.get(1);
                zm2 zm2Var2 = an2.r;
                o51.f(obj3, bool);
                r63 r63Var = obj3 != null ? (r63) zm2Var2.f.invoke(obj3) : null;
                r63Var.getClass();
                int i3 = r63Var.a;
                Object obj4 = list.get(2);
                x93[] x93VarArr = w93.b;
                zm2 zm2Var3 = an2.v;
                o51.f(obj4, bool);
                w93 w93Var = obj4 != null ? (w93) zm2Var3.f.invoke(obj4) : null;
                w93Var.getClass();
                long j = w93Var.a;
                Object obj5 = list.get(3);
                k83 k83Var = k83.c;
                k83 k83Var2 = (o51.f(obj5, bool) || obj5 == null) ? null : (k83) ((lu0) an2.l.g).invoke(obj5);
                Object obj6 = list.get(4);
                w82 w82Var = (o51.f(obj6, bool) || obj6 == null) ? null : (w82) ((lu0) da0.R.g).invoke(obj6);
                Object obj7 = list.get(5);
                sf1 sf1Var = sf1.d;
                sf1 sf1Var2 = (o51.f(obj7, bool) || obj7 == null) ? null : (sf1) ((lu0) an2.A.g).invoke(obj7);
                Object obj8 = list.get(6);
                nf1 nf1Var = (o51.f(obj8, bool) || obj8 == null) ? null : (nf1) ((lu0) da0.T.g).invoke(obj8);
                nf1Var.getClass();
                int i4 = nf1Var.a;
                Object obj9 = list.get(7);
                zm2 zm2Var4 = an2.s;
                o51.f(obj9, bool);
                c01 c01Var = obj9 != null ? (c01) zm2Var4.f.invoke(obj9) : null;
                c01Var.getClass();
                int i5 = c01Var.a;
                Object obj10 = list.get(8);
                z92 z92Var = da0.U;
                if (!o51.f(obj10, bool) && obj10 != null) {
                    d93Var = (d93) ((lu0) z92Var.g).invoke(obj10);
                }
                return new p52(i2, i3, j, k83Var2, w82Var, sf1Var2, i4, i5, d93Var);
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                Object obj11 = list2.get(0);
                int i6 = hz.h;
                Boolean bool2 = Boolean.FALSE;
                o51.f(obj11, bool2);
                if (obj11 != null) {
                    hzVar = o51.f(obj11, Boolean.FALSE) ? new hz(hz.g) : new hz(xp1.c(((Integer) obj11).intValue()));
                } else {
                    hzVar = null;
                }
                hzVar.getClass();
                long j2 = hzVar.a;
                Object obj12 = list2.get(1);
                x93[] x93VarArr2 = w93.b;
                lu0 lu0Var = an2.v.f;
                o51.f(obj12, bool2);
                w93 w93Var2 = obj12 != null ? (w93) lu0Var.invoke(obj12) : null;
                w93Var2.getClass();
                long j3 = w93Var2.a;
                Object obj13 = list2.get(2);
                jr0 jr0Var = jr0.f;
                jr0 jr0Var2 = (o51.f(obj13, bool2) || obj13 == null) ? null : (jr0) ((lu0) an2.m.g).invoke(obj13);
                Object obj14 = list2.get(3);
                hr0 hr0Var = (o51.f(obj14, bool2) || obj14 == null) ? null : (hr0) ((lu0) an2.t.g).invoke(obj14);
                Object obj15 = list2.get(4);
                ir0 ir0Var = (o51.f(obj15, bool2) || obj15 == null) ? null : (ir0) ((lu0) an2.u.g).invoke(obj15);
                Object obj16 = list2.get(6);
                String str2 = obj16 != null ? (String) obj16 : null;
                Object obj17 = list2.get(7);
                o51.f(obj17, bool2);
                w93 w93Var3 = obj17 != null ? (w93) lu0Var.invoke(obj17) : null;
                w93Var3.getClass();
                long j4 = w93Var3.a;
                Object obj18 = list2.get(8);
                qq qqVar = (o51.f(obj18, bool2) || obj18 == null) ? null : (qq) ((lu0) an2.n.g).invoke(obj18);
                Object obj19 = list2.get(9);
                j83 j83Var = (o51.f(obj19, bool2) || obj19 == null) ? null : (j83) ((lu0) an2.k.g).invoke(obj19);
                Object obj20 = list2.get(10);
                sh1 sh1Var = sh1.g;
                sh1 sh1Var2 = (o51.f(obj20, bool2) || obj20 == null) ? null : (sh1) ((lu0) an2.y.g).invoke(obj20);
                Object obj21 = list2.get(11);
                o51.f(obj21, bool2);
                if (obj21 != null) {
                    hzVar2 = o51.f(obj21, Boolean.FALSE) ? new hz(hz.g) : new hz(xp1.c(((Integer) obj21).intValue()));
                } else {
                    hzVar2 = null;
                }
                hzVar2.getClass();
                long j5 = hzVar2.a;
                Object obj22 = list2.get(12);
                p63 p63Var = (o51.f(obj22, bool2) || obj22 == null) ? null : (p63) ((lu0) an2.j.g).invoke(obj22);
                Object obj23 = list2.get(13);
                xt2 xt2Var2 = xt2.d;
                z92 z92Var2 = an2.o;
                if (!o51.f(obj23, bool2) && obj23 != null) {
                    xt2Var = (xt2) ((lu0) z92Var2.g).invoke(obj23);
                }
                return new uy2(j2, j3, jr0Var2, hr0Var, ir0Var, (l43) null, str2, j4, qqVar, j83Var, sh1Var2, j5, p63Var, xt2Var, 49184);
            case 3:
                obj.getClass();
                List list3 = (List) obj;
                Object obj24 = list3.get(0);
                Boolean bool3 = obj24 != null ? (Boolean) obj24 : null;
                bool3.getClass();
                boolean zBooleanValue = bool3.booleanValue();
                Object obj25 = list3.get(1);
                z92 z92Var3 = da0.S;
                if (!o51.f(obj25, Boolean.FALSE) && obj25 != null) {
                    kj0Var = (kj0) ((lu0) z92Var3.g).invoke(obj25);
                }
                kj0Var.getClass();
                return new w82(kj0Var.a, zBooleanValue);
            case 4:
                obj.getClass();
                return new kj0(((Integer) obj).intValue());
            case Logger.WARN /* 5 */:
                obj.getClass();
                return new nf1(((Integer) obj).intValue());
            case Logger.ERROR /* 6 */:
                obj.getClass();
                List list4 = (List) obj;
                Object obj26 = list4.get(0);
                c93 c93Var = (o51.f(obj26, Boolean.FALSE) || obj26 == null) ? null : (c93) ((lu0) da0.V.g).invoke(obj26);
                c93Var.getClass();
                int i7 = c93Var.a;
                Object obj27 = list4.get(1);
                Boolean bool4 = obj27 != null ? (Boolean) obj27 : null;
                bool4.getClass();
                return new d93(i7, bool4.booleanValue());
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                obj.getClass();
                return new c93(((Integer) obj).intValue());
            case 8:
                return new co2(((Integer) obj).intValue());
            case mc0.b /* 9 */:
                ga2 ga2Var = (ga2) obj;
                if (ga2Var != null && ga2Var.a == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case mc0.c /* 10 */:
                x81[] x81VarArr = qs2.a;
                ((ss2) obj).a(os2.e, mf3Var);
                return mf3Var;
            case 11:
                c12 c12Var = (c12) obj;
                long j6 = c12Var.a;
                return (9223372034707292159L & j6) != 9205357640488583168L ? new vi(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (c12Var.a & 4294967295L))) : xq2.a;
            case mc0.d /* 12 */:
                vi viVar = (vi) obj;
                return new c12((((long) Float.floatToRawIntBits(viVar.a)) << 32) | (((long) Float.floatToRawIntBits(viVar.b)) & 4294967295L));
            case 13:
                return new er2(((Long) obj).longValue());
            case 14:
                return SelfHostedUpdates.Companion.hex$lambda$0(((Byte) obj).byteValue());
            case a83.e /* 15 */:
                obj.getClass();
                return Integer.valueOf(od2.e.c(2147418112) + 65536);
            case 16:
                us2 us2Var = (us2) obj;
                us2Var.getClass();
                return us2Var.iterator();
            case 17:
                return Boolean.valueOf(obj == null);
            case 18:
                return mf3Var;
            case 19:
                return mf3Var;
            case 20:
                ow0 ow0Var = (ow0) obj;
                ow0Var.getClass();
                ow0Var.B0(Math.max(Float.intBitsToFloat((int) (ow0Var.a() >> 32)), Float.intBitsToFloat((int) (ow0Var.a() & 4294967295L))) > 2048.0f ? 0 : 1);
                return mf3Var;
            case 21:
                x81[] x81VarArr2 = qs2.a;
                rs2 rs2Var = os2.m;
                x81 x81Var = qs2.a[5];
                ((ss2) obj).a(rs2Var, Boolean.TRUE);
                return mf3Var;
            case 22:
                return mf3Var;
            case 23:
                return SystemAccelHooker.install$lambda$1(((Byte) obj).byteValue());
            case 24:
                return Boolean.valueOf(SystemClassLocator.locate$lambda$0((Class) obj));
            case 25:
                String str3 = (String) obj;
                str3.getClass();
                return az2.k("cat ", az2.k("'", s13.X("/proc/1/root".concat(str3), "'", "'\"'\"'", false), "'"), " 2>/dev/null");
            case 26:
                AppInfoItem appInfoItem = (AppInfoItem) obj;
                appInfoItem.getClass();
                return az2.j("app:", appInfoItem.getPackageName());
            case 27:
                ((AppInfoItem) obj).getClass();
                return "app";
            case 28:
                m73 m73Var = (m73) obj;
                String str4 = m73Var.g.f;
                long j7 = m73Var.f;
                int i8 = f93.c;
                int i9 = (int) (j7 & 4294967295L);
                if (i9 > 0) {
                    wi0 wi0VarW = ce0.w();
                    if (wi0VarW != null) {
                        int iB = wi0VarW.b(str4, i9 - 1);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i9 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str4, i9, -1);
                        }
                    } else if (i9 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str4, i9, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new sb0(((int) (m73Var.f & 4294967295L)) - iOffsetByCodePoints, 0);
            default:
                m73 m73Var2 = (m73) obj;
                String str5 = m73Var2.g.f;
                long j8 = m73Var2.f;
                int i10 = f93.c;
                int iQ = ce0.q((int) (j8 & 4294967295L), str5);
                if (iQ != -1) {
                    return new sb0(0, iQ - ((int) (m73Var2.f & 4294967295L)));
                }
                return null;
        }
    }
}
