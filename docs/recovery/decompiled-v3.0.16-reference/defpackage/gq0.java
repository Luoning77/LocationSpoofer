package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import java.util.Comparator;
import java.util.Map;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gq0 implements Comparator {
    public static final gq0 b = new gq0(0);
    public static final gq0 c = new gq0(1);
    public static final gq0 d = new gq0(2);
    public static final gq0 e = new gq0(3);
    public static final gq0 f = new gq0(4);
    public final /* synthetic */ int a;

    public /* synthetic */ gq0(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                dq0 dq0Var = (dq0) obj;
                dq0 dq0Var2 = (dq0) obj2;
                if (vd0.A(dq0Var) && vd0.A(dq0Var2)) {
                    hb1 hb1VarO = xp1.O(dq0Var);
                    hb1 hb1VarO2 = xp1.O(dq0Var2);
                    if (!o51.f(hb1VarO, hb1VarO2)) {
                        Object[] objArr = new hb1[16];
                        int i = 0;
                        while (hb1VarO != null) {
                            int i2 = i + 1;
                            if (objArr.length < i2) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                            }
                            objArr[0] = hb1VarO;
                            i++;
                            hb1VarO = hb1VarO.u();
                        }
                        Object[] objArr3 = new hb1[16];
                        int i3 = 0;
                        while (hb1VarO2 != null) {
                            int i4 = i3 + 1;
                            if (objArr3.length < i4) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i3 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                            }
                            objArr3[0] = hb1VarO2;
                            i3++;
                            hb1VarO2 = hb1VarO2.u();
                        }
                        int iMin = Math.min(i - 1, i3 - 1);
                        if (iMin >= 0) {
                            int i5 = 0;
                            while (o51.f(objArr[i5], objArr3[i5])) {
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                            return o51.m(((hb1) objArr[i5]).v(), ((hb1) objArr3[i5]).v());
                        }
                        fo.n("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (vd0.A(dq0Var)) {
                        return -1;
                    }
                    if (vd0.A(dq0Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                pe2 pe2VarH = ((js2) obj).h();
                pe2 pe2VarH2 = ((js2) obj2).h();
                int iCompare = Float.compare(pe2VarH.a, pe2VarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(pe2VarH.b, pe2VarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(pe2VarH.d, pe2VarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(pe2VarH.c, pe2VarH2.c);
            case 2:
                hb1 hb1Var = (hb1) obj;
                hb1 hb1Var2 = (hb1) obj2;
                int iM = o51.m(hb1Var2.u, hb1Var.u);
                return iM != 0 ? iM : o51.m(hb1Var.hashCode(), hb1Var2.hashCode());
            case 3:
                pe2 pe2VarH3 = ((js2) obj).h();
                pe2 pe2VarH4 = ((js2) obj2).h();
                int iCompare4 = Float.compare(pe2VarH4.c, pe2VarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(pe2VarH3.b, pe2VarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(pe2VarH3.d, pe2VarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(pe2VarH4.a, pe2VarH3.a);
            case 4:
                i52 i52Var = (i52) obj;
                i52 i52Var2 = (i52) obj2;
                int iCompare7 = Float.compare(((pe2) i52Var.e).b, ((pe2) i52Var2.e).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((pe2) i52Var.e).d, ((pe2) i52Var2.e).d);
            case Logger.WARN /* 5 */:
                return Integer.valueOf(((cj) obj).b).compareTo(Integer.valueOf(((cj) obj2).b));
            case Logger.ERROR /* 6 */:
                return Integer.valueOf(((cj) obj).b).compareTo(Integer.valueOf(((cj) obj2).b));
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int iMin2 = Math.min(str.length(), str2.length());
                for (int i6 = 4; i6 < iMin2; i6++) {
                    char cCharAt = str.charAt(i6);
                    char cCharAt2 = str2.charAt(i6);
                    if (cCharAt != cCharAt2) {
                        if (o51.m(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                        return -1;
                    }
                }
                int length3 = str.length();
                int length4 = str2.length();
                if (length3 == length4) {
                    return 0;
                }
                if (length3 >= length4) {
                    return 1;
                }
                return -1;
            case 8:
                hb1 hb1Var3 = (hb1) obj;
                hb1 hb1Var4 = (hb1) obj2;
                int iM2 = o51.m(hb1Var3.u, hb1Var4.u);
                return iM2 != 0 ? iM2 : o51.m(hb1Var3.hashCode(), hb1Var4.hashCode());
            case mc0.b /* 9 */:
                return Long.valueOf(((y0) obj).a).compareTo(Long.valueOf(((y0) obj2).a));
            case mc0.c /* 10 */:
                return ym3.v(((AppInfoItem) obj).getAppName(), ((AppInfoItem) obj2).getAppName());
            case 11:
                return ym3.v(((AppInfoItem) obj).getAppName(), ((AppInfoItem) obj2).getAppName());
            case mc0.d /* 12 */:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 13:
                return Integer.valueOf(((tl1) obj2).b).compareTo(Integer.valueOf(((tl1) obj).b));
            case 14:
                return ym3.v(((AppInfoItem) obj).getAppName(), ((AppInfoItem) obj2).getAppName());
            case a83.e /* 15 */:
                return ym3.v((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 16:
                return ym3.v((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 17:
                pu2 pu2Var = (pu2) obj;
                pu2 pu2Var2 = (pu2) obj2;
                return Float.valueOf((pu2Var.f.g() == 0.0f && pu2Var.o == null) ? -1.0f : pu2Var.f.g()).compareTo(Float.valueOf((pu2Var2.f.g() == 0.0f && pu2Var2.o == null) ? -1.0f : pu2Var2.f.g()));
            case 18:
                return ym3.v(((r43) obj).a, ((r43) obj2).a);
            default:
                return ym3.v(((t43) obj).a, ((t43) obj2).a);
        }
    }
}
