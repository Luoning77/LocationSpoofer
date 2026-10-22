package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.text.BreakIterator;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ce0 {
    public static x01 a = null;
    public static x01 b = null;
    public static x01 c = null;
    public static x01 d = null;
    public static x01 e = null;
    public static final float f = 0.38f;

    public static Intent A(AppCompatActivity appCompatActivity, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strB = B(appCompatActivity, componentName);
        if (strB == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strB);
        return B(appCompatActivity, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String B(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final va2 C(View view) {
        va2 va2Var = (va2) view.getTag(2131230865);
        if (va2Var != null) {
            return va2Var;
        }
        va2 va2Var2 = new va2();
        view.setTag(2131230865, va2Var2);
        return va2Var2;
    }

    public static final ek1 D(ek1 ek1Var) {
        hb1 hb1VarU = ek1Var.s.s;
        while (true) {
            hb1 hb1VarU2 = hb1VarU.u();
            if ((hb1VarU2 != null ? hb1VarU2.m : null) == null) {
                ek1 ek1VarR1 = hb1VarU.K.d.r1();
                ek1VarR1.getClass();
                return ek1VarR1;
            }
            hb1 hb1VarU3 = hb1VarU.u();
            hb1 hb1Var = hb1VarU3 != null ? hb1VarU3.m : null;
            hb1Var.getClass();
            if (hb1Var.l) {
                hb1VarU = hb1VarU.u();
                hb1VarU.getClass();
            } else {
                hb1 hb1VarU4 = hb1VarU.u();
                hb1VarU4.getClass();
                hb1VarU = hb1VarU4.m;
                hb1VarU.getClass();
            }
        }
    }

    public static final pe2 E(mn2 mn2Var) {
        return d(c12.e(((c12) ((w52) mn2Var.f).getValue()).a, ((c12) ((w52) mn2Var.g).getValue()).a), ((cw2) ((w52) mn2Var.e).getValue()).a);
    }

    public static final void F(fk fkVar, String str) {
        fkVar.m(fkVar.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final void G(ov0 ov0Var, pu0 pu0Var) {
        pu0Var.getClass();
        da0.o(2, pu0Var);
        pu0Var.invoke(ov0Var, 1);
    }

    public static final String H(Collection collection) {
        return m13.N(zy.s0(collection, ",", null, null, null, 62)).concat(m13.N(" }"));
    }

    public static final String I(Collection collection) {
        return m13.N(zy.s0(collection, ",", null, null, null, 62)).concat(m13.N("},"));
    }

    public static final CharSequence J(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final String K(String str, Number number) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return az2.p(sb, str != null ? az2.k(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static final pe2 L(nu2 nu2Var, ju2 ju2Var) {
        if (ju2Var == null) {
            return null;
        }
        List listB = nu2Var.b();
        int size = listB.size();
        for (int i = 0; i < size; i++) {
            if (o51.f(((pu2) listB.get(i)).p, ju2Var)) {
                if (ju2Var.r) {
                    return !ju2Var.t ? ju2Var.s : d(pa1.G(ju2Var.n1(), xp1.N(ju2Var), 6), mc0.J(xp1.N(ju2Var).g));
                }
                return null;
            }
        }
        return null;
    }

    public static double M(long j, long j2) {
        long j3 = (j2 * (-7046029254386353131L)) + j;
        long j4 = ((j3 >>> 30) ^ j3) * (-4658895280553007687L);
        long j5 = (j4 ^ (j4 >>> 27)) * (-7723592293110705685L);
        return (((j5 ^ (j5 >>> 31)) >>> 11) / 9.007199254740992E15d) * 2.0d * 3.141592653589793d;
    }

    public static z60 N(uj2 uj2Var, double d2, boolean z, long j) {
        tj2 tj2VarB = uj2Var.b(d2, z);
        double d3 = tj2VarB.b;
        double d4 = tj2VarB.a;
        double d5 = d2 < 0.0d ? 0.0d : d2;
        double d6 = uj2Var.c;
        double d7 = uj2Var.d ? d6 : d6 * 2.0d;
        double d8 = d5 % d7;
        if (d8 > d6) {
            d8 = d7 - d8;
        }
        double d9 = d5;
        double d10 = d8;
        double dMin = Math.min(d10, d6 - d10);
        if (dMin < 0.0d) {
            dMin = 0.0d;
        }
        double d11 = d6 / 4.0d;
        double d12 = dMin;
        double dMin2 = Math.min(12.0d, d11);
        if (dMin2 < 0.001d) {
            dMin2 = 0.001d;
        }
        double dT = mh0.t(d12 / dMin2, 0.0d, 1.0d);
        double d13 = ((((6.0d * dT) - 15.0d) * dT) + 10.0d) * dT * dT * dT;
        if (d13 == 0.0d || tj2VarB.d) {
            return new z60(d4, d3);
        }
        double d14 = d9 * 2.0d * 3.141592653589793d;
        double dSin = (Math.sin(M(j, 3L) + (d14 / 227.0d)) * 0.2d) + (Math.sin(M(j, 2L) + (d14 / 139.0d)) * 0.3d) + (Math.sin(M(j, 1L) + (d14 / 83.0d)) * 0.5d);
        double dMin3 = Math.min(5.0d, d11);
        double d15 = d10 - dMin3;
        if (d15 < 0.0d) {
            d15 = 0.0d;
        }
        tj2 tj2VarB2 = uj2Var.b(d15, true);
        double d16 = d10 + dMin3;
        if (d16 <= d6) {
            d6 = d16;
        }
        tj2 tj2VarB3 = uj2Var.b(d6, true);
        double d17 = tj2VarB2.a;
        double d18 = tj2VarB2.b;
        double d19 = tj2VarB3.a;
        double d20 = tj2VarB3.b;
        double radians = Math.toRadians(d17);
        double radians2 = Math.toRadians(d19);
        double radians3 = Math.toRadians(d20 - d18);
        return vd0.m(new z60(d4, d3), ((double) ((float) ((Math.toDegrees(Math.atan2(Math.sin(radians3) * Math.cos(radians2), (Math.sin(radians2) * Math.cos(radians)) - (Math.cos(radians3) * (Math.cos(radians2) * Math.sin(radians))))) + 360.0d) % 360.0d))) + 90.0d, dSin * 1.8d * d13);
    }

    public static tj2 O(uj2 uj2Var, double d2, boolean z, long j) {
        uj2Var.getClass();
        tj2 tj2VarB = uj2Var.b(d2, z);
        if (tj2VarB.d) {
            return tj2VarB;
        }
        z60 z60VarN = N(uj2Var, d2, z, j);
        double d3 = d2 - 0.2d;
        if (d3 < 0.0d) {
            d3 = 0.0d;
        }
        z60 z60VarN2 = N(uj2Var, d3, z, j);
        z60 z60VarN3 = N(uj2Var, d2 + 0.2d, z, j);
        return new tj2(z60VarN.a, z60VarN.b, vd0.o(z60VarN2, z60VarN3) > 0.001d ? vd0.g(z60VarN2, z60VarN3) : tj2VarB.c, tj2VarB.d);
    }

    public static final long P(s11 s11Var, x32 x32Var, r11 r11Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = s11Var.g;
        if (x32Var != null) {
            int i = r11Var.a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (x32Var == x32.f) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jD = c12.d(Q(s11Var, x32Var, r11Var), j2);
        if (z || !s11Var.i) {
            return jD;
        }
        return 0L;
    }

    public static final long Q(s11 s11Var, x32 x32Var, r11 r11Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (x32Var == null) {
            return s11Var.c;
        }
        int i = r11Var.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (s11Var.c >> 32));
        } else {
            if (i != 2) {
                return s11Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (s11Var.c & 4294967295L));
        }
        if (x32Var == x32.f) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static final ey1 R(Object obj, Object obj2, Object obj3, pu0 pu0Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (objQ == c30Var) {
            objQ = ke0.H(obj);
            ov0Var.m0(objQ);
        }
        ey1 ey1Var = (ey1) objQ;
        boolean zH = ov0Var.h(pu0Var);
        Object objQ2 = ov0Var.Q();
        if (zH || objQ2 == c30Var) {
            objQ2 = new cy2(pu0Var, ey1Var, null, 1);
            ov0Var.m0(objQ2);
        }
        oi0.f(obj2, obj3, (pu0) objQ2, ov0Var);
        return ey1Var;
    }

    public static final boolean S(zx1 zx1Var, Object obj, Object obj2) {
        Object objG = zx1Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof ay1)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            zx1Var.k(obj);
            return true;
        }
        ay1 ay1Var = (ay1) objG;
        boolean zL = ay1Var.l(obj2);
        if (zL && ay1Var.g()) {
            zx1Var.k(obj);
        }
        return zL;
    }

    public static final void T(zx1 zx1Var, Object obj) {
        boolean zG;
        long[] jArr = zx1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = zx1Var.b[i4];
                        Object obj3 = zx1Var.c[i4];
                        if (obj3 instanceof ay1) {
                            ay1 ay1Var = (ay1) obj3;
                            ay1Var.l(obj);
                            zG = ay1Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            zx1Var.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final long U(pe2 pe2Var) {
        float f2 = pe2Var.c - pe2Var.a;
        return (((long) Float.floatToRawIntBits(pe2Var.d - pe2Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final int V(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static final String W(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f3 = f2 * fPow;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        float f4 = i / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final void X(mn2 mn2Var, long j, long j2, long j3, boolean z) {
        w52 w52Var = (w52) mn2Var.f;
        w52 w52Var2 = (w52) mn2Var.h;
        w52 w52Var3 = (w52) mn2Var.e;
        w52 w52Var4 = (w52) mn2Var.g;
        if (!c12.b(((c12) w52Var4.getValue()).a, j3) || !cw2.a(((cw2) w52Var3.getValue()).a, j) || z) {
            w52Var3.setValue(new cw2(j));
            w52Var4.setValue(new c12(j3));
            if (z) {
                w52Var.setValue(new c12(c12.d(c12.d(j2, j3), c12.d(((c12) w52Var2.getValue()).a, ((c12) w52Var.getValue()).a))));
            }
        }
        w52Var2.setValue(new c12(c12.d(j2, j3)));
    }

    public static final j71 a(String str, Number number) {
        return new j71(K(str, number), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
    }

    public static final j71 b(bt2 bt2Var) {
        bt2Var.getClass();
        String str = "Value of type '" + bt2Var.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + bt2Var.c() + '\'';
        bt2Var.b();
        return new j71(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final void c(final long j, dv1 dv1Var, f30 f30Var, final int i, final int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-903262355);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
        } else {
            i3 = i | (ov0Var.f(dv1Var) ? 32 : 16);
        }
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                dv1Var = av1.a;
            }
            dv1 dv1VarK = iw2.k(dv1Var, 32.0f);
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = new ec(11, j);
                ov0Var.m0(objQ);
            }
            ji2.o(dv1VarK, (lu0) objQ, ov0Var, 0);
        } else {
            ov0Var.W();
        }
        final dv1 dv1Var2 = dv1Var;
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0(j, dv1Var2, i, i2) { // from class: tp1
                public final /* synthetic */ long e;
                public final /* synthetic */ dv1 f;
                public final /* synthetic */ int g;

                {
                    this.g = i2;
                }

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(7);
                    ce0.c(this.e, this.f, (f30) obj, iM0, this.g);
                    return mf3.a;
                }
            };
        }
    }

    public static final pe2 d(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new pe2(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void e(final List list, final ul1 ul1Var, boolean z, final au0 au0Var, f30 f30Var, int i) {
        int i2;
        boolean z2;
        int i3;
        final boolean zW;
        list.getClass();
        ul1Var.getClass();
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-159541939);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.h(ul1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i4 = 1;
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            ov0Var.Y();
            if ((i & 1) == 0 || ov0Var.B()) {
                i3 = i2 & (-897);
                zW = n51.w(ov0Var);
            } else {
                ov0Var.W();
                i3 = i2 & (-897);
                zW = z;
            }
            ov0Var.q();
            final Context context = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = ke0.H("");
                ov0Var.m0(objQ);
            }
            final ey1 ey1Var = (ey1) objQ;
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                objQ2 = new vp0();
                ov0Var.m0(objQ2);
            }
            final vp0 vp0Var = (vp0) objQ2;
            final long j = zW ? bk.c : bk.f;
            Object objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                objQ3 = new ll2(vp0Var, null, i4);
                ov0Var.m0(objQ3);
            }
            oi0.e(ov0Var, (pu0) objQ3, mf3.a);
            sb.F(au0Var, new qc0(3), sb.a0(-566813212, new pu0() { // from class: ml2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ov0 ov0Var2 = (ov0) f30Var2;
                    if (ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        dv1 dv1VarH = ji2.H(zm3.F(iw2.e(av1.a, 0.9f), 0.0f, 20.0f, 1));
                        b52 b52Var = new b52(20.0f, 20.0f, 20.0f, 20.0f);
                        final boolean z3 = zW;
                        final List list2 = list;
                        final long j2 = j;
                        final ul1 ul1Var2 = ul1Var;
                        final Context context2 = context;
                        final au0 au0Var2 = au0Var;
                        final vp0 vp0Var2 = vp0Var;
                        final ey1 ey1Var2 = ey1Var;
                        zm3.b(dv1VarH, 24.0f, b52Var, sb.a0(-2005288363, new qu0() { // from class: nl2
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r14v24 */
                            /* JADX WARN: Type inference failed for: r14v25, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r14v32 */
                            @Override // defpackage.qu0
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                long j3;
                                float f2;
                                Object e5Var;
                                Context context3;
                                au0 au0Var3;
                                ?? r14;
                                ov0 ov0Var3;
                                long j4;
                                ey1 ey1Var3;
                                f30 f30Var3 = (f30) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((zz) obj3).getClass();
                                ov0 ov0Var4 = (ov0) f30Var3;
                                if (ov0Var4.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    av1 av1Var = av1.a;
                                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                                    jo joVar = new jo(16.0f, true, new fo(0));
                                    nr nrVar = j9.r;
                                    yz yzVarA = wz.a(joVar, nrVar, ov0Var4, 6);
                                    int iHashCode = Long.hashCode(ov0Var4.T);
                                    l72 l72VarL = ov0Var4.l();
                                    dv1 dv1VarH2 = xp1.H(ov0Var4, dv1VarE);
                                    w20.b.getClass();
                                    x30 x30Var = v20.b;
                                    ov0Var4.g0();
                                    if (ov0Var4.S) {
                                        ov0Var4.k(x30Var);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    gh ghVar = v20.e;
                                    q73.h(ov0Var4, ghVar, yzVarA);
                                    gh ghVar2 = v20.d;
                                    q73.h(ov0Var4, ghVar2, l72VarL);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    gh ghVar3 = v20.f;
                                    q73.h(ov0Var4, ghVar3, numValueOf);
                                    wa waVar = v20.g;
                                    q73.g(ov0Var4, waVar);
                                    gh ghVar4 = v20.c;
                                    q73.h(ov0Var4, ghVar4, dv1VarH2);
                                    dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                                    or orVar = j9.p;
                                    go goVar = am1.e;
                                    kk2 kk2VarA = jk2.a(goVar, orVar, ov0Var4, 48);
                                    int iHashCode2 = Long.hashCode(ov0Var4.T);
                                    l72 l72VarL2 = ov0Var4.l();
                                    dv1 dv1VarH3 = xp1.H(ov0Var4, dv1VarE2);
                                    ov0Var4.g0();
                                    if (ov0Var4.S) {
                                        ov0Var4.k(x30Var);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    q73.h(ov0Var4, ghVar, kk2VarA);
                                    q73.h(ov0Var4, ghVar2, l72VarL2);
                                    az2.s(iHashCode2, ov0Var4, ghVar3, ov0Var4, waVar);
                                    q73.h(ov0Var4, ghVar4, dv1VarH3);
                                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 38.0f), cj2.a(12.0f));
                                    long j5 = bk.g;
                                    long jC = hz.c(0.12f, j5);
                                    iy0 iy0Var = o51.p0;
                                    dv1 dv1VarK = xp1.k(dv1VarN, jC, iy0Var);
                                    pr prVar = j9.j;
                                    er1 er1VarC = ws.c(prVar, false);
                                    int iHashCode3 = Long.hashCode(ov0Var4.T);
                                    l72 l72VarL3 = ov0Var4.l();
                                    dv1 dv1VarH4 = xp1.H(ov0Var4, dv1VarK);
                                    ov0Var4.g0();
                                    if (ov0Var4.S) {
                                        ov0Var4.k(x30Var);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    q73.h(ov0Var4, ghVar, er1VarC);
                                    q73.h(ov0Var4, ghVar2, l72VarL3);
                                    az2.s(iHashCode3, ov0Var4, ghVar3, ov0Var4, waVar);
                                    q73.h(ov0Var4, ghVar4, dv1VarH4);
                                    t01.a(xq1.F(), null, iw2.k(av1Var, 20.0f), j5, ov0Var4, 3504, 0);
                                    az2.t(ov0Var4, true, av1Var, 12.0f, ov0Var4);
                                    lk2 lk2Var = lk2.a;
                                    dv1 dv1VarA = lk2.a(lk2Var, av1Var, 1.0f);
                                    yz yzVarA2 = wz.a(am1.g, nrVar, ov0Var4, 0);
                                    int iHashCode4 = Long.hashCode(ov0Var4.T);
                                    l72 l72VarL4 = ov0Var4.l();
                                    dv1 dv1VarH5 = xp1.H(ov0Var4, dv1VarA);
                                    ov0Var4.g0();
                                    if (ov0Var4.S) {
                                        ov0Var4.k(x30Var);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    q73.h(ov0Var4, ghVar, yzVarA2);
                                    q73.h(ov0Var4, ghVar2, l72VarL4);
                                    az2.s(iHashCode4, ov0Var4, ghVar3, ov0Var4, waVar);
                                    q73.h(ov0Var4, ghVar4, dv1VarH5);
                                    String strN = ke0.N(2131624065, ov0Var4);
                                    long jB = v63.b(17.5d);
                                    jr0 jr0Var = jr0.j;
                                    cd2 cd2Var = mz.a;
                                    s83.b(strN, null, ((kz) ov0Var4.j(cd2Var)).q, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597440, 0, 262058);
                                    gh0.h(ov0Var4, iw2.g(av1Var, 2.0f));
                                    List list3 = list2;
                                    String strO = ke0.O(2131624976, new Object[]{Integer.valueOf(list3.size())}, ov0Var4);
                                    long jC2 = v63.c(12);
                                    long j6 = j2;
                                    s83.b(strO, null, j6, jC2, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262122);
                                    ov0Var4.p(true);
                                    ov0Var4.p(true);
                                    dv1 dv1VarN2 = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f));
                                    boolean z4 = z3;
                                    if (z4) {
                                        j3 = hz.c;
                                        f2 = 0.06f;
                                    } else {
                                        j3 = hz.b;
                                        f2 = 0.04f;
                                    }
                                    dv1 dv1VarE3 = zm3.E(xp1.k(dv1VarN2, hz.c(f2, j3), iy0Var), 14.0f, 12.0f);
                                    er1 er1VarC2 = ws.c(j9.f, false);
                                    int iHashCode5 = Long.hashCode(ov0Var4.T);
                                    l72 l72VarL5 = ov0Var4.l();
                                    dv1 dv1VarH6 = xp1.H(ov0Var4, dv1VarE3);
                                    ov0Var4.g0();
                                    if (ov0Var4.S) {
                                        ov0Var4.k(x30Var);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    q73.h(ov0Var4, ghVar, er1VarC2);
                                    q73.h(ov0Var4, ghVar2, l72VarL5);
                                    az2.s(iHashCode5, ov0Var4, ghVar3, ov0Var4, waVar);
                                    q73.h(ov0Var4, ghVar4, dv1VarH6);
                                    dv1 dv1VarE4 = iw2.e(av1Var, 1.0f);
                                    kk2 kk2VarA2 = jk2.a(goVar, orVar, ov0Var4, 48);
                                    int iHashCode6 = Long.hashCode(ov0Var4.T);
                                    l72 l72VarL6 = ov0Var4.l();
                                    dv1 dv1VarH7 = xp1.H(ov0Var4, dv1VarE4);
                                    ov0Var4.g0();
                                    if (ov0Var4.S) {
                                        ov0Var4.k(x30Var);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    q73.h(ov0Var4, ghVar, kk2VarA2);
                                    q73.h(ov0Var4, ghVar2, l72VarL6);
                                    az2.s(iHashCode6, ov0Var4, ghVar3, ov0Var4, waVar);
                                    q73.h(ov0Var4, ghVar4, dv1VarH7);
                                    ey1 ey1Var4 = ey1Var2;
                                    String str = (String) ey1Var4.getValue();
                                    long jC3 = v63.c(15);
                                    long j7 = ((kz) ov0Var4.j(cd2Var)).q;
                                    jr0 jr0Var2 = jr0.h;
                                    q93 q93Var = new q93(j7, jC3, jr0Var2, 0L, 0L, 0, 0L, 16777208);
                                    n91 n91Var = new n91(0, 7, 119);
                                    ul1 ul1Var3 = ul1Var2;
                                    boolean zH = ov0Var4.h(ul1Var3) | ov0Var4.h(list3);
                                    Context context4 = context2;
                                    boolean zH2 = zH | ov0Var4.h(context4);
                                    au0 au0Var4 = au0Var2;
                                    boolean zF = zH2 | ov0Var4.f(au0Var4);
                                    Object objQ4 = ov0Var4.Q();
                                    Object obj6 = d30.a;
                                    if (zF || objQ4 == obj6) {
                                        e5Var = new e5(ul1Var3, list3, context4, au0Var4, ey1Var4);
                                        context3 = context4;
                                        au0Var3 = au0Var4;
                                        ov0Var4.m0(e5Var);
                                    } else {
                                        context3 = context4;
                                        au0Var3 = au0Var4;
                                        e5Var = objQ4;
                                    }
                                    m91 m91Var = new m91((lu0) e5Var, null, null, 62);
                                    dv1 dv1VarP = ks.P(lk2.a(lk2Var, av1Var, 1.0f), vp0Var2);
                                    Object objQ5 = ov0Var4.Q();
                                    int i5 = 14;
                                    if (objQ5 == obj6) {
                                        objQ5 = new vu1(ey1Var4, i5);
                                        ov0Var4.m0(objQ5);
                                    }
                                    ey1 ey1Var5 = r18;
                                    xq.a(str, (lu0) objQ5, dv1VarP, false, q93Var, n91Var, m91Var, true, 0, 0, null, null, null, null, sb.a0(1281460722, new kl2(1, j6, r18), ov0Var4), ov0Var4, 102236208, 196608, 32280);
                                    ov0 ov0Var5 = ov0Var4;
                                    if (((String) ey1Var5.getValue()).length() > 0) {
                                        ov0Var5.c0(-105956323);
                                        Object objQ6 = ov0Var5.Q();
                                        if (objQ6 == obj6) {
                                            ey1Var3 = ey1Var5;
                                            objQ6 = new xj2(ey1Var3, 8);
                                            ov0Var5.m0(objQ6);
                                        } else {
                                            ey1Var3 = ey1Var5;
                                        }
                                        ey1Var5 = ey1Var3;
                                        xq1.l((au0) objQ6, iw2.k(av1Var, 24.0f), false, null, null, sb.a0(1768177902, new p80(5, j6), ov0Var5), ov0Var5, 1572918, 60);
                                        ov0Var3 = ov0Var5;
                                        r14 = 0;
                                    } else {
                                        r14 = 0;
                                        ov0Var5.c0(-113158739);
                                        ov0Var3 = ov0Var5;
                                    }
                                    ov0Var3.p(r14);
                                    ov0Var3.p(true);
                                    ov0Var3.p(true);
                                    dv1 dv1VarE5 = iw2.e(av1Var, 1.0f);
                                    kk2 kk2VarA3 = jk2.a(new jo(10.0f, true, new fo(r14)), orVar, ov0Var3, 54);
                                    int iHashCode7 = Long.hashCode(ov0Var3.T);
                                    l72 l72VarL7 = ov0Var3.l();
                                    dv1 dv1VarH8 = xp1.H(ov0Var3, dv1VarE5);
                                    ov0Var3.g0();
                                    if (ov0Var3.S) {
                                        ov0Var3.k(x30Var);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, kk2VarA3);
                                    q73.h(ov0Var3, ghVar2, l72VarL7);
                                    az2.s(iHashCode7, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH8);
                                    au0 au0Var5 = au0Var3;
                                    dv1 dv1VarA2 = bk.a(xp1.k(xp1.n(iw2.g(lk2.a(lk2Var, av1Var, 1.0f), 44.0f), cj2.a(14.0f)), z4 ? hz.c(0.08f, hz.c) : hz.c(0.05f, hz.b), iy0Var), au0Var5);
                                    er1 er1VarC3 = ws.c(prVar, false);
                                    int iHashCode8 = Long.hashCode(ov0Var3.T);
                                    l72 l72VarL8 = ov0Var3.l();
                                    dv1 dv1VarH9 = xp1.H(ov0Var3, dv1VarA2);
                                    ov0Var3.g0();
                                    if (ov0Var3.S) {
                                        ov0Var3.k(x30Var);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, er1VarC3);
                                    q73.h(ov0Var3, ghVar2, l72VarL8);
                                    az2.s(iHashCode8, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH9);
                                    ov0 ov0Var6 = ov0Var3;
                                    float f3 = 0.08f;
                                    s83.b(ke0.N(2131624085, ov0Var3), null, hz.c(0.7f, ((kz) ov0Var3.j(cd2Var)).q), v63.c(14), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 1597440, 0, 262058);
                                    ov0Var6.p(true);
                                    boolean z5 = !l13.k0((String) ey1Var5.getValue());
                                    bj2 bj2VarA = cj2.a(14.0f);
                                    b52 b52Var2 = hu.a;
                                    if (z4) {
                                        j4 = hz.c;
                                        f3 = 0.1f;
                                    } else {
                                        j4 = hz.b;
                                    }
                                    gu guVarA = hu.a(j5, 0L, hz.c(f3, j4), hz.c(0.35f, ((kz) ov0Var6.j(cd2Var)).q), ov0Var6, 2);
                                    dv1 dv1VarG = iw2.g(lk2.a(lk2Var, av1Var, 1.0f), 44.0f);
                                    Context context5 = context3;
                                    boolean zH3 = ov0Var6.h(ul1Var3) | ov0Var6.h(list3) | ov0Var6.h(context5) | ov0Var6.f(au0Var5);
                                    Object objQ7 = ov0Var6.Q();
                                    if (zH3 || objQ7 == obj6) {
                                        Object g5Var = new g5(ul1Var3, list3, context5, au0Var5, ey1Var5);
                                        ov0Var6.m0(g5Var);
                                        objQ7 = g5Var;
                                    }
                                    n51.a((au0) objQ7, dv1VarG, z5, bj2VarA, guVarA, null, null, null, xp1.h, ov0Var6, 805306368, 480);
                                    ov0Var6.p(true);
                                    ov0Var6.p(true);
                                } else {
                                    ov0Var4.W();
                                }
                                return mf3.a;
                            }
                        }, ov0Var2), ov0Var2, 25008, 8);
                    } else {
                        ov0Var2.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, ((i3 >> 9) & 14) | 432, 0);
            z2 = zW;
        } else {
            ov0Var.W();
            z2 = z;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new xy(list, ul1Var, z2, au0Var, i);
        }
    }

    public static final void f(zx1 zx1Var, Object obj, Object obj2) {
        int iF = zx1Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : zx1Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof ay1) {
                ((ay1) obj3).a(obj2);
            } else if (obj3 != obj2) {
                ay1 ay1Var = new ay1();
                ay1Var.a(obj3);
                ay1Var.a(obj2);
                obj2 = ay1Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            zx1Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        zx1Var.b[i] = obj;
        zx1Var.c[i] = obj2;
    }

    public static final void g(us1 us1Var, s11 s11Var, x32 x32Var, r11 r11Var, x8 x8Var, long j) {
        float fIntBitsToFloat;
        sx1 sx1Var = (sx1) x8Var.c;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (s11Var.c >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (s11Var.c & 4294967295L));
        if (i(s11Var)) {
            x8Var.b = 0;
            sx1Var.d();
        }
        if (!j(s11Var) && !i(s11Var)) {
            if (sx1Var.b == 3) {
                int i = x8Var.b;
                x8Var.b = i + 1;
                sx1Var.n(i, s11Var);
            } else {
                sx1Var.a(s11Var);
            }
            if (x8Var.b == 3) {
                x8Var.b = 0;
            }
            Object[] objArr = sx1Var.a;
            int i2 = sx1Var.b;
            float fIntBitsToFloat4 = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((s11) objArr[i3]).c >> 32));
            }
            int i4 = sx1Var.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = sx1Var.a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((s11) objArr2[i5]).c & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / sx1Var.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (x32Var != null) {
            int i6 = r11Var.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = x32Var == x32.f ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((gb0) us1Var.f).a(s11Var.b, c12.e(jFloatToRawIntBits, j));
    }

    public static final void h(pf pfVar, String str, lf1 lf1Var, boolean z) {
        lf1Var.getClass();
        long j = lf1Var.b;
        kf1 kf1Var = lf1Var.a;
        float f2 = kf1Var.a - 0.5f;
        float f3 = kf1Var.b - 0.7f;
        float f4 = kf1Var.c;
        float fSqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3) + (f2 * f2));
        if (fSqrt < 1.0E-6f) {
            fSqrt = 1.0E-6f;
        }
        float f5 = f2 / fSqrt;
        float f6 = f3 / fSqrt;
        pfVar.a.setFloatUniform("lightDir".concat(str), f5, f6, f4 / fSqrt);
        pfVar.a.setColorUniform("lightColor".concat(str), xp1.T(hz.c(1.0f, j)));
        pfVar.a.setFloatUniform("lightIntensity".concat(str), hz.d(j) * lf1Var.c);
        if (z) {
            float fSqrt2 = (float) Math.sqrt((f6 * f6) + (f5 * f5));
            if (fSqrt2 > 0.001f) {
                pfVar.a.setFloatUniform("axis".concat(str), f5 / fSqrt2, f6 / fSqrt2);
            } else {
                pfVar.a.setFloatUniform("axis".concat(str), 0.0f, str.equals("1") ? -1.0f : 1.0f);
            }
        }
    }

    public static final boolean i(s11 s11Var) {
        return !s11Var.h && s11Var.d;
    }

    public static final boolean j(s11 s11Var) {
        return s11Var.h && !s11Var.d;
    }

    public static zx1 k() {
        long[] jArr = hn2.a;
        return new zx1();
    }

    public static final boolean l(be0 be0Var, long j) {
        if (!be0Var.e.r) {
            return false;
        }
        v21 v21Var = xp1.O(be0Var).K.c;
        if (!v21Var.X.r) {
            return false;
        }
        long jH0 = v21Var.h0(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH0 & 4294967295L));
        long j2 = be0Var.u;
        float f2 = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    public static final boolean m(pe2 pe2Var, float f2, float f3) {
        float f4 = pe2Var.a;
        if (f2 > pe2Var.c || f4 > f2) {
            return false;
        }
        return f3 <= pe2Var.d && pe2Var.b <= f3;
    }

    public static final boolean n(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return o51.f(l13.D0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static final void o(vv vvVar, vd0 vd0Var, je jeVar) {
        if (vd0Var instanceof a42) {
            pe2 pe2Var = ((a42) vd0Var).i;
            vvVar.p(pe2Var.a, pe2Var.b, pe2Var.c, pe2Var.d, jeVar);
            return;
        }
        if (!(vd0Var instanceof b42)) {
            if (vd0Var instanceof z32) {
                vvVar.h(((z32) vd0Var).i, jeVar);
                return;
            } else {
                b81.d();
                return;
            }
        }
        b42 b42Var = (b42) vd0Var;
        aj2 aj2Var = b42Var.i;
        long j = aj2Var.h;
        re reVar = b42Var.j;
        if (reVar != null) {
            vvVar.h(reVar, jeVar);
        } else {
            vvVar.j(aj2Var.a, aj2Var.b, aj2Var.c, aj2Var.d, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), jeVar);
        }
    }

    public static void p(jg0 jg0Var, vd0 vd0Var, long j) {
        boolean z = vd0Var instanceof a42;
        en0 en0Var = en0.a;
        if (z) {
            pe2 pe2Var = ((a42) vd0Var).i;
            jg0Var.V(j, (((long) Float.floatToRawIntBits(pe2Var.a)) << 32) | (((long) Float.floatToRawIntBits(pe2Var.b)) & 4294967295L), U(pe2Var), 1.0f, en0Var, 3);
            return;
        }
        if (!(vd0Var instanceof b42)) {
            if (vd0Var instanceof z32) {
                jg0Var.w0(((z32) vd0Var).i, j, en0Var);
                return;
            } else {
                b81.d();
                return;
            }
        }
        b42 b42Var = (b42) vd0Var;
        re reVar = b42Var.j;
        if (reVar != null) {
            jg0Var.w0(reVar, j, en0Var);
            return;
        }
        aj2 aj2Var = b42Var.i;
        float f2 = aj2Var.b;
        float f3 = aj2Var.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (aj2Var.h >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        float f4 = aj2Var.c - f3;
        jg0Var.Q(j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(aj2Var.d - f2)) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), en0Var);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [gn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final int q(int i, String str) {
        ?? r5;
        ?? r6;
        int spanEnd;
        wi0 wi0VarW = w();
        Integer num = null;
        if (wi0VarW != null) {
            if (!(wi0VarW.c() == 1)) {
                fo.n("Not initialized yet");
                return 0;
            }
            ig0.l(str, "charSequence cannot be null");
            ?? r4 = wi0VarW.e.b;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r6 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                fe3[] fe3VarArr = (fe3[]) spanned.getSpans(i, i + 1, fe3.class);
                if (fe3VarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(fe3VarArr[0]);
                    r6 = str;
                } else {
                    ?? r7 = str;
                    spanEnd = ((ij0) r4.z(r7, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new ij0(i))).g;
                    r6 = r7;
                }
            } else {
                ?? r8 = str;
                spanEnd = ((ij0) r4.z(r8, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new ij0(i))).g;
                r6 = r8;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r6;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            r5 = r6;
            return num.intValue();
        }
        r5 = r6;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }

    public static final int r(int i, String str) {
        wi0 wi0VarW = w();
        Integer num = null;
        if (wi0VarW != null) {
            Integer numValueOf = Integer.valueOf(wi0VarW.b(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static yz2 s(float f2, float f3) {
        double d2 = 6.283185307179586d / ((double) f3);
        return new yz2(f2, (float) (d2 * d2), null);
    }

    public static final String t(String str, String str2, int i, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !l13.k0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !l13.k0(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static final String u(Collection collection) {
        return !collection.isEmpty() ? m13.N(zy.s0(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final x01 v() {
        x01 x01Var = a;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Outlined.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(14.06f, 9.02f);
        nx0Var.l(0.92f, 0.92f);
        nx0Var.k(5.92f, 19.0f);
        nx0Var.k(5.0f, 19.0f);
        nx0Var.s(-0.92f);
        nx0Var.l(9.06f, -9.06f);
        nx0Var.m(17.66f, 3.0f);
        nx0Var.g(-0.25f, 0.0f, -0.51f, 0.1f, -0.7f, 0.29f);
        nx0Var.l(-1.83f, 1.83f);
        nx0Var.l(3.75f, 3.75f);
        nx0Var.l(1.83f, -1.83f);
        nx0Var.g(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        nx0Var.l(-2.34f, -2.34f);
        nx0Var.g(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f);
        nx0Var.e();
        nx0Var.m(14.06f, 6.19f);
        nx0Var.k(3.0f, 17.25f);
        nx0Var.k(3.0f, 21.0f);
        nx0Var.i(3.75f);
        nx0Var.k(17.81f, 9.94f);
        nx0Var.l(-3.75f, -3.75f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        a = x01VarB;
        return x01VarB;
    }

    public static final wi0 w() {
        if (!wi0.d()) {
            return null;
        }
        wi0 wi0VarA = wi0.a();
        if (wi0VarA.c() == 1) {
            return wi0VarA;
        }
        return null;
    }

    public static final Object x(zq1 zq1Var) {
        Object objA = zq1Var.A();
        ua1 ua1Var = objA instanceof ua1 ? (ua1) objA : null;
        if (ua1Var != null) {
            return ua1Var.s;
        }
        return null;
    }

    public static final Object y(es2 es2Var, rs2 rs2Var) {
        Object objG = es2Var.e.g(rs2Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static Intent z(AppCompatActivity appCompatActivity) {
        Intent parentActivityIntent = appCompatActivity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strB = B(appCompatActivity, appCompatActivity.getComponentName());
            if (strB == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(appCompatActivity, strB);
            try {
                return B(appCompatActivity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strB + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
