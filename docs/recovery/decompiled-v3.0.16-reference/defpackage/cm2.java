package defpackage;

import com.vincenthzr.locationspoofer.data.db.SavedRouteDao_Impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class cm2 implements lu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ cm2(int i) {
        this.e = i;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        hz hzVar;
        cj cjVar;
        int i = 0;
        uy2 uy2Var = null;
        zf1Var = null;
        zf1 zf1Var = null;
        ag1Var = null;
        ag1 ag1Var = null;
        zg3Var = null;
        zg3 zg3Var = null;
        fi3Var = null;
        fi3 fi3Var = null;
        uy2Var = null;
        uy2 uy2Var2 = null;
        p52Var = null;
        p52 p52Var = null;
        b93Var = null;
        b93 b93Var = null;
        b93Var = null;
        b93 b93Var2 = null;
        uy2Var = null;
        switch (this.e) {
            case 0:
                return SavedRouteDao_Impl.getAllSavedRoutesList$lambda$3("SELECT * FROM saved_routes ORDER BY timestamp DESC", (zk2) obj);
            case 1:
                return obj;
            case 2:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                lu0 lu0Var = (lu0) an2.h.g;
                Boolean bool = Boolean.FALSE;
                uy2 uy2Var3 = (o51.f(obj2, bool) || obj2 == null) ? null : (uy2) lu0Var.invoke(obj2);
                Object obj3 = list.get(1);
                uy2 uy2Var4 = (o51.f(obj3, bool) || obj3 == null) ? null : (uy2) lu0Var.invoke(obj3);
                Object obj4 = list.get(2);
                uy2 uy2Var5 = (o51.f(obj4, bool) || obj4 == null) ? null : (uy2) lu0Var.invoke(obj4);
                Object obj5 = list.get(3);
                if (!o51.f(obj5, bool) && obj5 != null) {
                    uy2Var = (uy2) lu0Var.invoke(obj5);
                }
                return new b93(uy2Var3, uy2Var4, uy2Var5, uy2Var);
            case 3:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (o51.f(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((lu0) an2.a.g).invoke(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new dj(list3, str);
            case 4:
                obj.getClass();
                return new p63(((Integer) obj).intValue());
            case Logger.WARN /* 5 */:
                obj.getClass();
                List list4 = (List) obj;
                return new j83(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case Logger.ERROR /* 6 */:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                x93[] x93VarArr = w93.b;
                lu0 lu0Var2 = an2.v.f;
                Boolean bool2 = Boolean.FALSE;
                o51.f(obj8, bool2);
                w93 w93Var = obj8 != null ? (w93) lu0Var2.invoke(obj8) : null;
                w93Var.getClass();
                long j = w93Var.a;
                Object obj9 = list5.get(1);
                o51.f(obj9, bool2);
                w93 w93Var2 = obj9 != null ? (w93) lu0Var2.invoke(obj9) : null;
                w93Var2.getClass();
                return new k83(j, w93Var2.a);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                obj.getClass();
                return new jr0(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                return new qq(((Float) obj).floatValue());
            case mc0.b /* 9 */:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new f93(g93.a(iIntValue, num2.intValue()));
            case mc0.c /* 10 */:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i2 = hz.h;
                Boolean bool3 = Boolean.FALSE;
                o51.f(obj12, bool3);
                if (obj12 != null) {
                    hzVar = o51.f(obj12, Boolean.FALSE) ? new hz(hz.g) : new hz(xp1.c(((Integer) obj12).intValue()));
                } else {
                    hzVar = null;
                }
                hzVar.getClass();
                long j2 = hzVar.a;
                Object obj13 = list7.get(1);
                zm2 zm2Var = an2.x;
                o51.f(obj13, bool3);
                c12 c12Var = obj13 != null ? (c12) zm2Var.f.invoke(obj13) : null;
                c12Var.getClass();
                long j3 = c12Var.a;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new xt2(j2, j3, f.floatValue());
            case 11:
                obj.getClass();
                return new m53(((Integer) obj).intValue());
            case mc0.d /* 12 */:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list8.get(1);
                z92 z92Var = an2.i;
                if (!o51.f(obj16, Boolean.FALSE) && obj16 != null) {
                    b93Var2 = (b93) ((lu0) z92Var.g).invoke(obj16);
                }
                return new ag1(str2, b93Var2);
            case 13:
                obj.getClass();
                return new r63(((Integer) obj).intValue());
            case 14:
                obj.getClass();
                return new c01(((Integer) obj).intValue());
            case a83.e /* 15 */:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                while (i < size) {
                    Object obj17 = list9.get(i);
                    cj cjVar2 = (o51.f(obj17, Boolean.FALSE) || obj17 == null) ? null : (cj) ((lu0) an2.b.g).invoke(obj17);
                    cjVar2.getClass();
                    arrayList.add(cjVar2);
                    i++;
                }
                return arrayList;
            case 16:
                obj.getClass();
                return new hr0(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                return new ir0(((Integer) obj).intValue());
            case 18:
                Boolean bool4 = Boolean.FALSE;
                if (o51.f(obj, bool4)) {
                    return new w93(w93.c);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f2 = obj18 != null ? (Float) obj18 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj19 = list10.get(1);
                zm2 zm2Var2 = an2.w;
                o51.f(obj19, bool4);
                x93 x93Var = obj19 != null ? (x93) zm2Var2.f.invoke(obj19) : null;
                x93Var.getClass();
                return new w93(v63.e(fFloatValue, x93Var.a));
            case 19:
                if (o51.f(obj, 0)) {
                    return new x93(8589934592L);
                }
                return o51.f(obj, 1) ? new x93(4294967296L) : new x93(0L);
            case 20:
                if (o51.f(obj, Boolean.FALSE)) {
                    return new c12(9205357640488583168L);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f3 = obj20 != null ? (Float) obj20 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj21 = list11.get(1);
                Float f4 = obj21 != null ? (Float) obj21 : null;
                f4.getClass();
                return new c12((((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue2)) << 32));
            case 21:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i < size2) {
                    Object obj22 = list12.get(i);
                    rh1 rh1Var = (o51.f(obj22, Boolean.FALSE) || obj22 == null) ? null : (rh1) ((lu0) an2.z.g).invoke(obj22);
                    rh1Var.getClass();
                    arrayList2.add(rh1Var);
                    i++;
                }
                return new sh1(arrayList2);
            case 22:
                obj.getClass();
                String str3 = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                if (o51.f(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new rh1(localeForLanguageTag);
            case 23:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str4 = obj23 != null ? (String) obj23 : null;
                str4.getClass();
                Object obj24 = list13.get(1);
                z92 z92Var2 = an2.i;
                if (!o51.f(obj24, Boolean.FALSE) && obj24 != null) {
                    b93Var = (b93) ((lu0) z92Var2.g).invoke(obj24);
                }
                return new zf1(str4, b93Var);
            case 24:
                obj.getClass();
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                float f5 = pf1.b;
                zm2 zm2Var3 = an2.B;
                Boolean bool5 = Boolean.FALSE;
                o51.f(obj25, bool5);
                pf1 pf1Var = obj25 != null ? (pf1) zm2Var3.f.invoke(obj25) : null;
                pf1Var.getClass();
                float f6 = pf1Var.a;
                Object obj26 = list14.get(1);
                zm2 zm2Var4 = an2.C;
                o51.f(obj26, bool5);
                rf1 rf1Var = obj26 != null ? (rf1) zm2Var4.f.invoke(obj26) : null;
                rf1Var.getClass();
                int i3 = rf1Var.a;
                Object obj27 = list14.get(2);
                zm2 zm2Var5 = an2.D;
                o51.f(obj27, bool5);
                qf1 qf1Var = obj27 != null ? (qf1) zm2Var5.f.invoke(obj27) : null;
                qf1Var.getClass();
                return new sf1(f6, i3, qf1Var.a);
            case 25:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                pf1.a(fFloatValue3);
                return new pf1(fFloatValue3);
            case 26:
                obj.getClass();
                return new rf1(((Integer) obj).intValue());
            case 27:
                obj.getClass();
                List list15 = (List) obj;
                Object obj28 = list15.get(0);
                mj mjVar = obj28 != null ? (mj) obj28 : null;
                mjVar.getClass();
                Object obj29 = list15.get(2);
                Integer num3 = obj29 != null ? (Integer) obj29 : null;
                num3.getClass();
                int iIntValue2 = num3.intValue();
                Object obj30 = list15.get(3);
                Integer num4 = obj30 != null ? (Integer) obj30 : null;
                num4.getClass();
                int iIntValue3 = num4.intValue();
                Object obj31 = list15.get(4);
                String str5 = obj31 != null ? (String) obj31 : null;
                str5.getClass();
                switch (mjVar.ordinal()) {
                    case 0:
                        Object obj32 = list15.get(1);
                        z92 z92Var3 = an2.g;
                        if (!o51.f(obj32, Boolean.FALSE) && obj32 != null) {
                            p52Var = (p52) ((lu0) z92Var3.g).invoke(obj32);
                        }
                        p52Var.getClass();
                        cjVar = new cj(iIntValue2, iIntValue3, p52Var, str5);
                        break;
                    case 1:
                        Object obj33 = list15.get(1);
                        z92 z92Var4 = an2.h;
                        if (!o51.f(obj33, Boolean.FALSE) && obj33 != null) {
                            uy2Var2 = (uy2) ((lu0) z92Var4.g).invoke(obj33);
                        }
                        uy2Var2.getClass();
                        cjVar = new cj(iIntValue2, iIntValue3, uy2Var2, str5);
                        break;
                    case 2:
                        Object obj34 = list15.get(1);
                        z92 z92Var5 = an2.c;
                        if (!o51.f(obj34, Boolean.FALSE) && obj34 != null) {
                            fi3Var = (fi3) ((lu0) z92Var5.g).invoke(obj34);
                        }
                        fi3Var.getClass();
                        cjVar = new cj(iIntValue2, iIntValue3, fi3Var, str5);
                        break;
                    case 3:
                        Object obj35 = list15.get(1);
                        z92 z92Var6 = an2.d;
                        if (!o51.f(obj35, Boolean.FALSE) && obj35 != null) {
                            zg3Var = (zg3) ((lu0) z92Var6.g).invoke(obj35);
                        }
                        zg3Var.getClass();
                        cjVar = new cj(iIntValue2, iIntValue3, zg3Var, str5);
                        break;
                    case 4:
                        Object obj36 = list15.get(1);
                        z92 z92Var7 = an2.e;
                        if (!o51.f(obj36, Boolean.FALSE) && obj36 != null) {
                            ag1Var = (ag1) ((lu0) z92Var7.g).invoke(obj36);
                        }
                        ag1Var.getClass();
                        cjVar = new cj(iIntValue2, iIntValue3, ag1Var, str5);
                        break;
                    case Logger.WARN /* 5 */:
                        Object obj37 = list15.get(1);
                        z92 z92Var8 = an2.f;
                        if (!o51.f(obj37, Boolean.FALSE) && obj37 != null) {
                            zf1Var = (zf1) ((lu0) z92Var8.g).invoke(obj37);
                        }
                        zf1Var.getClass();
                        cjVar = new cj(iIntValue2, iIntValue3, zf1Var, str5);
                        break;
                    case Logger.ERROR /* 6 */:
                        Object obj38 = list15.get(1);
                        String str6 = obj38 != null ? (String) obj38 : null;
                        str6.getClass();
                        cjVar = new cj(iIntValue2, iIntValue3, new h13(str6), str5);
                        break;
                    default:
                        b81.d();
                        return null;
                }
                return cjVar;
            case 28:
                obj.getClass();
                return new qf1(((Integer) obj).intValue());
            default:
                String str7 = obj != null ? (String) obj : null;
                str7.getClass();
                return new fi3(str7);
        }
    }
}
