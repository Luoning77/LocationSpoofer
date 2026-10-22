package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ke0 implements kp2 {
    public static x01 e;
    public static x01 f;
    public static x01 g;
    public static x01 h;
    public static x01 i;

    public static final String A(Object obj) {
        obj.getClass();
        return m81.a(xe2.a(obj.getClass())) + '@' + obj.hashCode();
    }

    public static final x01 B() {
        x01 x01Var = h;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Shield", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(11.3f, 2.26f);
        nx0Var.l(-6.0f, 2.25f);
        nx0Var.f(4.52f, 4.81f, 4.0f, 5.55f, 4.0f, 6.39f);
        nx0Var.s(4.7f);
        nx0Var.g(0.0f, 4.83f, 3.13f, 9.37f, 7.43f, 10.75f);
        nx0Var.g(0.37f, 0.12f, 0.77f, 0.12f, 1.14f, 0.0f);
        nx0Var.g(4.3f, -1.38f, 7.43f, -5.91f, 7.43f, -10.75f);
        nx0Var.s(-4.7f);
        nx0Var.g(0.0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f);
        nx0Var.l(-6.0f, -2.25f);
        nx0Var.f(12.25f, 2.09f, 11.75f, 2.09f, 11.3f, 2.26f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        h = x01VarB;
        return x01VarB;
    }

    public static final x01 C() {
        x01 x01Var = i;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(12.0f, 17.27f);
        nx0Var.l(4.15f, 2.51f);
        nx0Var.g(0.76f, 0.46f, 1.69f, -0.22f, 1.49f, -1.08f);
        nx0Var.l(-1.1f, -4.72f);
        nx0Var.l(3.67f, -3.18f);
        nx0Var.g(0.67f, -0.58f, 0.31f, -1.68f, -0.57f, -1.75f);
        nx0Var.l(-4.83f, -0.41f);
        nx0Var.l(-1.89f, -4.46f);
        nx0Var.g(-0.34f, -0.81f, -1.5f, -0.81f, -1.84f, 0.0f);
        nx0Var.k(9.19f, 8.63f);
        nx0Var.k(4.36f, 9.04f);
        nx0Var.g(-0.88f, 0.07f, -1.24f, 1.17f, -0.57f, 1.75f);
        nx0Var.l(3.67f, 3.18f);
        nx0Var.l(-1.1f, 4.72f);
        nx0Var.g(-0.2f, 0.86f, 0.73f, 1.54f, 1.49f, 1.08f);
        nx0Var.k(12.0f, 17.27f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        i = x01VarB;
        return x01VarB;
    }

    public static final float D(ik2 ik2Var) {
        if (ik2Var != null) {
            return ik2Var.a;
        }
        return 0.0f;
    }

    public static final void F(ag0 ag0Var, float f2, float f3, final boolean z, final float f4) {
        if (q1.e() && f2 > 0.0f && f3 > 0.0f) {
            if (ag0Var.i < f3) {
                ag0Var.i = f3;
            }
            au2 au2Var = (au2) ((au0) ag0Var.F.A.c).invoke();
            float[] fArr = null;
            bj2 bj2Var = au2Var instanceof bj2 ? (bj2) au2Var : null;
            if (bj2Var != null) {
                u70 u70Var = bj2Var.d;
                u70 u70Var2 = bj2Var.c;
                u70 u70Var3 = bj2Var.b;
                u70 u70Var4 = bj2Var.a;
                long j = ag0Var.g;
                float fB = cw2.b(j) / 2.0f;
                boolean z2 = ag0Var.h == qa1.e;
                float fA = z2 ? u70Var4.a(j, ag0Var) : u70Var3.a(j, ag0Var);
                float fA2 = z2 ? u70Var3.a(j, ag0Var) : u70Var4.a(j, ag0Var);
                float fA3 = z2 ? u70Var2.a(j, ag0Var) : u70Var.a(j, ag0Var);
                float fA4 = z2 ? u70Var.a(j, ag0Var) : u70Var2.a(j, ag0Var);
                if (fA > fB) {
                    fA = fB;
                }
                if (fA2 > fB) {
                    fA2 = fB;
                }
                if (fA3 > fB) {
                    fA3 = fB;
                }
                if (fA4 <= fB) {
                    fB = fA4;
                }
                fArr = new float[]{fA, fA2, fA3, fB};
            }
            if (fArr == null) {
                return;
            }
            final boolean z3 = f4 > 0.0f;
            String str = z3 ? "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\nuniform float chromaticAberration;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n\n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n\n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(gradSdRoundedRect(centeredCoord, halfSize, gradRadius) + depthEffect * normalize(centeredCoord));\n\n    float2 refractedCoord = coord + d * grad;\n    float dispersionIntensity = chromaticAberration * ((centeredCoord.x * centeredCoord.y) / (halfSize.x * halfSize.y));\n    float2 dispersedCoord = d * grad * dispersionIntensity;\n\n    half4 color = half4(0.0);\n\n    half4 red = content.eval(refractedCoord + dispersedCoord);\n    color.r += red.r / 3.5;\n    color.a += red.a / 7.0;\n\n    half4 orange = content.eval(refractedCoord + dispersedCoord * (2.0 / 3.0));\n    color.r += orange.r / 3.5;\n    color.g += orange.g / 7.0;\n    color.a += orange.a / 7.0;\n\n    half4 yellow = content.eval(refractedCoord + dispersedCoord * (1.0 / 3.0));\n    color.r += yellow.r / 3.5;\n    color.g += yellow.g / 3.5;\n    color.a += yellow.a / 7.0;\n\n    half4 green = content.eval(refractedCoord);\n    color.g += green.g / 3.5;\n    color.a += green.a / 7.0;\n\n    half4 cyan = content.eval(refractedCoord - dispersedCoord * (1.0 / 3.0));\n    color.g += cyan.g / 3.5;\n    color.b += cyan.b / 3.0;\n    color.a += cyan.a / 7.0;\n\n    half4 blue = content.eval(refractedCoord - dispersedCoord * (2.0 / 3.0));\n    color.b += blue.b / 3.0;\n    color.a += blue.a / 7.0;\n\n    half4 purple = content.eval(refractedCoord - dispersedCoord);\n    color.r += purple.r / 7.0;\n    color.b += purple.b / 3.0;\n    color.a += purple.a / 7.0;\n\n    return color;\n}\n" : "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n\n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n\n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(gradSdRoundedRect(centeredCoord, halfSize, gradRadius) + depthEffect * normalize(centeredCoord));\n\n    float2 refractedCoord = coord + d * grad;\n    return content.eval(refractedCoord);\n}\n";
            String str2 = z3 ? "LiquidGlassLensDispersion" : "LiquidGlassLens";
            int i2 = ag0Var.k;
            float f5 = i2 >= 1 ? i2 : 1;
            final float fIntBitsToFloat = Float.intBitsToFloat((int) (ag0Var.g >> 32)) / f5;
            final float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ag0Var.g & 4294967295L)) / f5;
            final float f6 = ag0Var.i / f5;
            final float f7 = f2 / f5;
            final float f8 = f3 / f5;
            int length = fArr.length;
            final float[] fArr2 = new float[length];
            for (int i3 = 0; i3 < length; i3++) {
                fArr2[i3] = fArr[i3] / f5;
            }
            lu0 lu0Var = new lu0() { // from class: oe1
                @Override // defpackage.lu0
                public final Object invoke(Object obj) {
                    pf pfVar = (pf) obj;
                    pfVar.getClass();
                    pfVar.a.setFloatUniform("size", fIntBitsToFloat, fIntBitsToFloat2);
                    float f9 = -f6;
                    pfVar.a.setFloatUniform("offset", f9, f9);
                    pfVar.a.setFloatUniform("cornerRadii", fArr2);
                    pfVar.a.setFloatUniform("refractionHeight", f7);
                    pfVar.a.setFloatUniform("refractionAmount", -f8);
                    pfVar.a.setFloatUniform("depthEffect", z ? 1.0f : 0.0f);
                    if (z3) {
                        pfVar.a.setFloatUniform("chromaticAberration", f4);
                    }
                    return mf3.a;
                }
            };
            if (q1.e()) {
                pf pfVarC = ag0Var.c(str2, str);
                lu0Var.invoke(pfVarC);
                ag0Var.j = ld0.l(ag0Var.j, ld0.L(pfVarC, "content"));
            }
        }
    }

    public static final void G(i53 i53Var, j53 j53Var, String str) {
        k53.i.fine(j53Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + i53Var.a);
    }

    public static w52 H(Object obj) {
        return new w52(obj, u92.q);
    }

    public static final cv1 J(kb0 kb0Var, int i2) {
        cv1 cv1Var = ((cv1) kb0Var).e.j;
        if (cv1Var == null || (cv1Var.h & i2) == 0) {
            return null;
        }
        while (cv1Var != null) {
            int i3 = cv1Var.g;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i2) != 0) {
                return cv1Var;
            }
            cv1Var = cv1Var.j;
        }
        return null;
    }

    public static final ey1 L(Object obj, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        if (objQ == d30.a) {
            objQ = H(obj);
            ov0Var.m0(objQ);
        }
        ey1 ey1Var = (ey1) objQ;
        ey1Var.setValue(obj);
        return ey1Var;
    }

    public static final String M(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String N(int i2, f30 f30Var) {
        return ((Resources) ((ov0) f30Var).j(AndroidCompositionLocals_androidKt.c)).getString(i2);
    }

    public static final String O(int i2, Object[] objArr, f30 f30Var) {
        return ((Resources) ((ov0) f30Var).j(AndroidCompositionLocals_androidKt.c)).getString(i2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String P(String str) {
        str.getClass();
        int i2 = 0;
        int i3 = -1;
        if (!l13.c0(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt = lowerCase.charAt(i4);
                    if (o51.m(cCharAt, 31) <= 0 || o51.m(cCharAt, WorkQueueKt.MASK) >= 0 || l13.h0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressR = (s13.Z(str, "[", false) && str.endsWith("]")) ? r(1, str.length() - 1, str) : r(0, str.length(), str);
        if (inetAddressR == null) {
            return null;
        }
        byte[] address = inetAddressR.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressR.getHostAddress();
            }
            throw new AssertionError(p91.p("Invalid IPv6 address: '", str, '\''));
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i3 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        xt xtVar = new xt();
        while (i2 < address.length) {
            if (i2 == i3) {
                xtVar.h0(58);
                i2 += i6;
                if (i2 == 16) {
                    xtVar.h0(58);
                }
            } else {
                if (i2 > 0) {
                    xtVar.h0(58);
                }
                byte b = address[i2];
                byte[] bArr = bh3.a;
                xtVar.i0(((b & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return xtVar.y();
    }

    public static final void c(li0 li0Var, final boolean z, final au0 au0Var, final vu0 vu0Var, f30 f30Var, int i2) {
        int i3;
        String str;
        String str2;
        String str3;
        String str4;
        au0Var.getClass();
        vu0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1079337028);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.f(li0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ov0Var.h(vu0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            final boolean z2 = li0Var != null;
            Object objQ = ov0Var.Q();
            String str5 = "";
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                if (li0Var == null || (str4 = li0Var.b) == null) {
                    str4 = "";
                }
                objQ = H(str4);
                ov0Var.m0(objQ);
            }
            final ey1 ey1Var = (ey1) objQ;
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                if (li0Var == null || (str3 = li0Var.a) == null) {
                    str3 = "";
                }
                objQ2 = H(str3);
                ov0Var.m0(objQ2);
            }
            final ey1 ey1Var2 = (ey1) objQ2;
            Object objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                t52 t52Var = new t52(li0Var != null ? li0Var.d : -55);
                ov0Var.m0(t52Var);
                objQ3 = t52Var;
            }
            final t52 t52Var2 = (t52) objQ3;
            Object objQ4 = ov0Var.Q();
            if (objQ4 == c30Var) {
                t52 t52Var3 = new t52(li0Var != null ? li0Var.c : 5180);
                ov0Var.m0(t52Var3);
                objQ4 = t52Var3;
            }
            final t52 t52Var4 = (t52) objQ4;
            Object objQ5 = ov0Var.Q();
            if (objQ5 == c30Var) {
                if (li0Var == null || (str2 = li0Var.e) == null) {
                    str2 = "[WPA2-PSK-CCMP][RSN]";
                }
                objQ5 = H(str2);
                ov0Var.m0(objQ5);
            }
            final ey1 ey1Var3 = (ey1) objQ5;
            Object objQ6 = ov0Var.Q();
            if (objQ6 == c30Var) {
                if (li0Var != null && (str = li0Var.f) != null) {
                    str5 = str;
                }
                objQ6 = H(str5);
                ov0Var.m0(objQ6);
            }
            final ey1 ey1Var4 = (ey1) objQ6;
            Object objQ7 = ov0Var.Q();
            if (objQ7 == c30Var) {
                objQ7 = H(Boolean.valueOf(li0Var != null ? li0Var.g : false));
                ov0Var.m0(objQ7);
            }
            final ey1 ey1Var5 = (ey1) objQ7;
            Object objQ8 = ov0Var.Q();
            if (objQ8 == c30Var) {
                objQ8 = H(Boolean.valueOf(li0Var != null ? li0Var.h : true));
                ov0Var.m0(objQ8);
            }
            final ey1 ey1Var6 = (ey1) objQ8;
            sb.F(au0Var, new qc0(3), sb.a0(1016454043, new pu0() { // from class: gi0
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ov0 ov0Var2 = (ov0) f30Var2;
                    if (ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        dv1 dv1VarC = iw2.c(iw2.e(av1.a, 0.92f), 0.85f);
                        bj2 bj2VarA = cj2.a(24.0f);
                        aw awVarT = ym3.t(((kz) ov0Var2.j(mz.a)).p, 0L, ov0Var2, 0, 14);
                        cw cwVarU = ym3.u(62, 8.0f);
                        final boolean z3 = z;
                        final au0 au0Var2 = au0Var;
                        final boolean z4 = z2;
                        final ey1 ey1Var7 = ey1Var;
                        final ey1 ey1Var8 = ey1Var2;
                        final t52 t52Var5 = t52Var2;
                        final t52 t52Var6 = t52Var4;
                        final ey1 ey1Var9 = ey1Var3;
                        final ey1 ey1Var10 = ey1Var5;
                        final ey1 ey1Var11 = ey1Var6;
                        final vu0 vu0Var2 = vu0Var;
                        final ey1 ey1Var12 = ey1Var4;
                        sb.C(dv1VarC, bj2VarA, awVarT, cwVarU, sb.a0(-611695987, new qu0() { // from class: hi0
                            /* JADX WARN: Code duplicated, block: B:111:0x0764  */
                            /* JADX WARN: Code duplicated, block: B:112:0x0768  */
                            /* JADX WARN: Code duplicated, block: B:115:0x078e  */
                            /* JADX WARN: Code duplicated, block: B:117:0x0793  */
                            /* JADX WARN: Code duplicated, block: B:119:0x0798  */
                            /* JADX WARN: Code duplicated, block: B:121:0x07a5  */
                            @Override // defpackage.qu0
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                long j;
                                float f2;
                                long j2;
                                float f3;
                                t52 t52Var7;
                                float f4;
                                long jC;
                                long j3;
                                float f5;
                                long jC2;
                                long jC3;
                                long j4;
                                float f6;
                                long jC4;
                                c30 c30Var2;
                                x30 x30Var;
                                jr0 jr0Var;
                                long jC5;
                                f30 f30Var3 = (f30) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                u92 u92Var = am1.i;
                                or orVar = j9.p;
                                or orVar2 = j9.o;
                                pr prVar = j9.j;
                                nr nrVar = j9.r;
                                ho hoVar = am1.g;
                                ((zz) obj3).getClass();
                                ov0 ov0Var3 = (ov0) f30Var3;
                                if (ov0Var3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    dv1 dv1VarD = zm3.D(iw2.d(), 20.0f);
                                    yz yzVarA = wz.a(hoVar, nrVar, ov0Var3, 0);
                                    int iHashCode = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ = ov0Var3.z();
                                    dv1 dv1VarH = xp1.H(ov0Var3, dv1VarD);
                                    w20.b.getClass();
                                    x30 x30Var2 = v20.b;
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    gh ghVar = v20.e;
                                    q73.h(ov0Var3, ghVar, yzVarA);
                                    gh ghVar2 = v20.d;
                                    q73.h(ov0Var3, ghVar2, l72VarZ);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    gh ghVar3 = v20.f;
                                    q73.h(ov0Var3, ghVar3, numValueOf);
                                    wa waVar = v20.g;
                                    q73.g(ov0Var3, waVar);
                                    gh ghVar4 = v20.c;
                                    q73.h(ov0Var3, ghVar4, dv1VarH);
                                    av1 av1Var = av1.a;
                                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                                    kk2 kk2VarA = jk2.a(u92Var, orVar, ov0Var3, 54);
                                    int iHashCode2 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ2 = ov0Var3.z();
                                    dv1 dv1VarH2 = xp1.H(ov0Var3, dv1VarE);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, kk2VarA);
                                    q73.h(ov0Var3, ghVar2, l72VarZ2);
                                    az2.s(iHashCode2, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH2);
                                    kk2 kk2VarA2 = jk2.a(am1.e, orVar, ov0Var3, 48);
                                    int iHashCode3 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ3 = ov0Var3.z();
                                    dv1 dv1VarH3 = xp1.H(ov0Var3, av1Var);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, kk2VarA2);
                                    q73.h(ov0Var3, ghVar2, l72VarZ3);
                                    az2.s(iHashCode3, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH3);
                                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 36.0f), cj2.a(11.0f));
                                    long j5 = bk.g;
                                    dv1 dv1VarL = xp1.l(dv1VarN, hz.c(0.12f, j5));
                                    er1 er1VarC = ws.c(prVar, false);
                                    int iHashCode4 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ4 = ov0Var3.z();
                                    dv1 dv1VarH4 = xp1.H(ov0Var3, dv1VarL);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, er1VarC);
                                    q73.h(ov0Var3, ghVar2, l72VarZ4);
                                    az2.s(iHashCode4, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH4);
                                    t01.a(k93.i(), null, iw2.k(av1Var, 20.0f), j5, ov0Var3, 3504, 0);
                                    ov0Var3.r();
                                    gh0.h(ov0Var3, iw2.o(av1Var, 10.0f));
                                    s83.b(ke0.N(z4 ? 2131624408 : 2131624791, ov0Var3), null, dh0.p(ov0Var3).q, v63.b(16.5d), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                                    ov0Var3.r();
                                    dv1 dv1VarN2 = xp1.n(iw2.k(av1Var, 28.0f), cj2.a);
                                    boolean z5 = z3;
                                    dv1 dv1VarL2 = xp1.l(dv1VarN2, z5 ? hz.c(0.08f, hz.c) : hz.c(0.05f, hz.b));
                                    au0 au0Var3 = au0Var2;
                                    dv1 dv1VarA = bk.a(dv1VarL2, au0Var3);
                                    er1 er1VarC2 = ws.c(prVar, false);
                                    int iHashCode5 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ5 = ov0Var3.z();
                                    dv1 dv1VarH5 = xp1.H(ov0Var3, dv1VarA);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, er1VarC2);
                                    q73.h(ov0Var3, ghVar2, l72VarZ5);
                                    az2.s(iHashCode5, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH5);
                                    t01.a(k22.u(), ke0.N(2131624114, ov0Var3), iw2.k(av1Var, 14.0f), hz.c(0.6f, dh0.p(ov0Var3).q), ov0Var3, 384, 0);
                                    ov0Var3.r();
                                    ov0Var3.r();
                                    gh0.h(ov0Var3, iw2.g(av1Var, 12.0f));
                                    dv1 dv1VarW = zm3.W(new wb1(1.0f, true), zm3.O(ov0Var3));
                                    yz yzVarA2 = wz.a(new jo(12.0f, true, new fo(0)), nrVar, ov0Var3, 6);
                                    int iHashCode6 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ6 = ov0Var3.z();
                                    dv1 dv1VarH6 = xp1.H(ov0Var3, dv1VarW);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, yzVarA2);
                                    q73.h(ov0Var3, ghVar2, l72VarZ6);
                                    az2.s(iHashCode6, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH6);
                                    dv1 dv1VarE2 = zm3.E(ji2.w(xp1.l(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f)), z5 ? hz.c(0.04f, hz.c) : hz.c(0.03f, hz.b)), 0.8f, hz.c(z5 ? 0.12f : 0.06f, dh0.p(ov0Var3).A), cj2.a(14.0f)), 14.0f, 10.0f);
                                    yz yzVarA3 = wz.a(hoVar, nrVar, ov0Var3, 0);
                                    int iHashCode7 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ7 = ov0Var3.z();
                                    dv1 dv1VarH7 = xp1.H(ov0Var3, dv1VarE2);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, yzVarA3);
                                    q73.h(ov0Var3, ghVar2, l72VarZ7);
                                    az2.s(iHashCode7, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH7);
                                    String strN = ke0.N(2131625175, ov0Var3);
                                    long jB = v63.b(11.5d);
                                    pr prVar2 = prVar;
                                    long jC6 = hz.c(0.5f, dh0.p(ov0Var3).q);
                                    jr0 jr0Var2 = jr0.h;
                                    s83.b(strN, null, jC6, jB, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                                    gh0.h(ov0Var3, iw2.g(av1Var, 4.0f));
                                    ey1 ey1Var13 = ey1Var7;
                                    String str6 = (String) ey1Var13.getValue();
                                    q93 q93Var = new q93(dh0.p(ov0Var3).q, v63.b(14.5d), jr0.i, 0L, 0L, 0, 0L, 16777208);
                                    dv1 dv1VarE3 = iw2.e(av1Var, 1.0f);
                                    Object objQ9 = ov0Var3.Q();
                                    int i4 = 7;
                                    c30 c30Var3 = d30.a;
                                    if (objQ9 == c30Var3) {
                                        objQ9 = new di0(ey1Var13, i4);
                                        ov0Var3.m0(objQ9);
                                    }
                                    xq.a(str6, (lu0) objQ9, dv1VarE3, false, q93Var, null, null, true, 0, 0, null, null, null, null, sb.a0(-1416974228, new h5(ey1Var13, i4), ov0Var3), ov0Var3, 100663728, 196608, 32472);
                                    ov0Var3.r();
                                    dv1 dv1VarN3 = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f));
                                    if (z5) {
                                        j = hz.c;
                                        f2 = 0.04f;
                                    } else {
                                        j = hz.b;
                                        f2 = 0.03f;
                                    }
                                    dv1 dv1VarE4 = zm3.E(ji2.w(xp1.l(dv1VarN3, hz.c(f2, j)), 0.8f, hz.c(z5 ? 0.12f : 0.06f, dh0.p(ov0Var3).A), cj2.a(14.0f)), 14.0f, 10.0f);
                                    yz yzVarA4 = wz.a(hoVar, nrVar, ov0Var3, 0);
                                    int iHashCode8 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ8 = ov0Var3.z();
                                    dv1 dv1VarH8 = xp1.H(ov0Var3, dv1VarE4);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, yzVarA4);
                                    q73.h(ov0Var3, ghVar2, l72VarZ8);
                                    az2.s(iHashCode8, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH8);
                                    s83.b(ke0.N(2131625167, ov0Var3), null, hz.c(0.5f, dh0.p(ov0Var3).q), v63.b(11.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                                    gh0.h(ov0Var3, iw2.g(av1Var, 4.0f));
                                    ey1 ey1Var14 = ey1Var8;
                                    String str7 = (String) ey1Var14.getValue();
                                    q93 q93Var2 = new q93(dh0.p(ov0Var3).q, v63.c(14), jr0Var2, 0L, 0L, 0, 0L, 16777208);
                                    dv1 dv1VarE5 = iw2.e(av1Var, 1.0f);
                                    Object objQ10 = ov0Var3.Q();
                                    int i5 = 8;
                                    if (objQ10 == c30Var3) {
                                        objQ10 = new di0(ey1Var14, i5);
                                        ov0Var3.m0(objQ10);
                                    }
                                    xq.a(str7, (lu0) objQ10, dv1VarE5, false, q93Var2, null, null, true, 0, 0, null, null, null, null, sb.a0(-1680399389, new h5(ey1Var14, i5), ov0Var3), ov0Var3, 100663728, 196608, 32472);
                                    ov0Var3.r();
                                    dv1 dv1VarN4 = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f));
                                    if (z5) {
                                        j2 = hz.c;
                                        f3 = 0.04f;
                                    } else {
                                        j2 = hz.b;
                                        f3 = 0.03f;
                                    }
                                    c30 c30Var4 = c30Var3;
                                    dv1 dv1VarE6 = zm3.E(ji2.w(xp1.l(dv1VarN4, hz.c(f3, j2)), 0.8f, hz.c(z5 ? 0.12f : 0.06f, dh0.p(ov0Var3).A), cj2.a(14.0f)), 14.0f, 10.0f);
                                    yz yzVarA5 = wz.a(hoVar, nrVar, ov0Var3, 0);
                                    int iHashCode9 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ9 = ov0Var3.z();
                                    dv1 dv1VarH9 = xp1.H(ov0Var3, dv1VarE6);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, yzVarA5);
                                    q73.h(ov0Var3, ghVar2, l72VarZ9);
                                    az2.s(iHashCode9, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH9);
                                    t52 t52Var8 = t52Var5;
                                    s83.b(ke0.O(2131625172, new Object[]{Integer.valueOf(t52Var8.g())}, ov0Var3), null, hz.c(0.5f, dh0.p(ov0Var3).q), v63.b(11.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                                    ov0 ov0Var4 = ov0Var3;
                                    gh0.h(ov0Var4, iw2.g(av1Var, 6.0f));
                                    dv1 dv1VarE7 = iw2.e(av1Var, 1.0f);
                                    kk2 kk2VarA3 = jk2.a(new jo(6.0f, true, new fo(0)), orVar2, ov0Var4, 6);
                                    int iHashCode10 = Long.hashCode(ks.U(ov0Var4));
                                    l72 l72VarZ10 = ov0Var4.z();
                                    dv1 dv1VarH10 = xp1.H(ov0Var4, dv1VarE7);
                                    ov0Var4.g0();
                                    if (ov0Var4.D()) {
                                        ov0Var4.k(x30Var2);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    q73.h(ov0Var4, ghVar, kk2VarA3);
                                    q73.h(ov0Var4, ghVar2, l72VarZ10);
                                    az2.s(iHashCode10, ov0Var4, ghVar3, ov0Var4, waVar);
                                    q73.h(ov0Var4, ghVar4, dv1VarH10);
                                    ov0Var4.c0(1578520423);
                                    for (i52 i52Var : am1.G(g83.g(-40, "-40 极强"), g83.g(-55, "-55 良好"), g83.g(-70, "-70 一般"), g83.g(-85, "-85 微弱"))) {
                                        int iIntValue3 = ((Number) i52Var.e).intValue();
                                        String str8 = (String) i52Var.f;
                                        boolean z6 = t52Var8.g() == iIntValue3;
                                        dv1 dv1VarN5 = xp1.n(new wb1(1.0f, true), cj2.a(8.0f));
                                        if (z6) {
                                            jC4 = bk.g;
                                        } else {
                                            if (z5) {
                                                j4 = hz.c;
                                                f6 = 0.06f;
                                            } else {
                                                j4 = hz.b;
                                                f6 = 0.04f;
                                            }
                                            jC4 = hz.c(f6, j4);
                                        }
                                        dv1 dv1VarL3 = xp1.l(dv1VarN5, jC4);
                                        boolean zD = ov0Var4.d(iIntValue3);
                                        Object objQ11 = ov0Var4.Q();
                                        if (zD) {
                                            c30Var2 = c30Var4;
                                        } else {
                                            c30Var2 = c30Var4;
                                            if (objQ11 == c30Var2) {
                                            }
                                            dv1 dv1VarF = zm3.F(bk.a(dv1VarL3, (au0) objQ11), 0.0f, 6.0f, 1);
                                            pr prVar3 = prVar2;
                                            er1 er1VarC3 = ws.c(prVar3, false);
                                            int iHashCode11 = Long.hashCode(ks.U(ov0Var4));
                                            l72 l72VarZ11 = ov0Var4.z();
                                            dv1 dv1VarH11 = xp1.H(ov0Var4, dv1VarF);
                                            w20.b.getClass();
                                            x30Var = v20.b;
                                            ov0Var4.g0();
                                            if (ov0Var4.D()) {
                                                ov0Var4.k(x30Var);
                                            } else {
                                                ov0Var4.p0();
                                            }
                                            q73.h(ov0Var4, v20.e, er1VarC3);
                                            q73.h(ov0Var4, v20.d, l72VarZ11);
                                            q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode11));
                                            q73.g(ov0Var4, v20.g);
                                            q73.h(ov0Var4, v20.c, dv1VarH11);
                                            long jB2 = v63.b(10.5d);
                                            if (z6) {
                                                jr0Var = jr0.j;
                                            } else {
                                                jr0Var = jr0.g;
                                            }
                                            jr0 jr0Var3 = jr0Var;
                                            if (z6) {
                                                ov0Var4.c0(2073450627);
                                                ov0Var4.s();
                                                jC5 = hz.c;
                                            } else {
                                                ov0Var4.c0(2073452145);
                                                jC5 = hz.c(0.75f, ((kz) ov0Var4.j(mz.a)).q);
                                                ov0Var4.s();
                                            }
                                            ov0 ov0Var5 = ov0Var4;
                                            s83.b(str8, null, jC5, jB2, jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262058);
                                            ov0Var4 = ov0Var5;
                                            ov0Var4.r();
                                            c30Var4 = c30Var2;
                                            prVar2 = prVar3;
                                        }
                                        objQ11 = new yh0(iIntValue3, t52Var8, 2);
                                        ov0Var4.m0(objQ11);
                                        dv1 dv1VarF2 = zm3.F(bk.a(dv1VarL3, (au0) objQ11), 0.0f, 6.0f, 1);
                                        pr prVar4 = prVar2;
                                        er1 er1VarC4 = ws.c(prVar4, false);
                                        int iHashCode12 = Long.hashCode(ks.U(ov0Var4));
                                        l72 l72VarZ12 = ov0Var4.z();
                                        dv1 dv1VarH12 = xp1.H(ov0Var4, dv1VarF2);
                                        w20.b.getClass();
                                        x30Var = v20.b;
                                        ov0Var4.g0();
                                        if (ov0Var4.D()) {
                                            ov0Var4.k(x30Var);
                                        } else {
                                            ov0Var4.p0();
                                        }
                                        q73.h(ov0Var4, v20.e, er1VarC4);
                                        q73.h(ov0Var4, v20.d, l72VarZ12);
                                        q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode12));
                                        q73.g(ov0Var4, v20.g);
                                        q73.h(ov0Var4, v20.c, dv1VarH12);
                                        long jB3 = v63.b(10.5d);
                                        if (z6) {
                                            jr0Var = jr0.j;
                                        } else {
                                            jr0Var = jr0.g;
                                        }
                                        jr0 jr0Var4 = jr0Var;
                                        if (z6) {
                                            ov0Var4.c0(2073450627);
                                            ov0Var4.s();
                                            jC5 = hz.c;
                                        } else {
                                            ov0Var4.c0(2073452145);
                                            jC5 = hz.c(0.75f, ((kz) ov0Var4.j(mz.a)).q);
                                            ov0Var4.s();
                                        }
                                        ov0 ov0Var6 = ov0Var4;
                                        s83.b(str8, null, jC5, jB3, jr0Var4, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 24576, 0, 262058);
                                        ov0Var4 = ov0Var6;
                                        ov0Var4.r();
                                        c30Var4 = c30Var2;
                                        prVar2 = prVar4;
                                    }
                                    pr prVar5 = prVar2;
                                    c30 c30Var5 = c30Var4;
                                    ov0Var4.s();
                                    ov0Var4.r();
                                    ov0Var4.r();
                                    dv1 dv1VarL4 = xp1.l(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f)), z5 ? hz.c(0.04f, hz.c) : hz.c(0.03f, hz.b));
                                    hh0 hh0Var = mz.a;
                                    float f7 = 8.0f;
                                    dv1 dv1VarE8 = zm3.E(ji2.w(dv1VarL4, 0.8f, hz.c(z5 ? 0.12f : 0.06f, ((kz) ov0Var4.j(hh0Var)).A), cj2.a(14.0f)), 14.0f, 10.0f);
                                    yz yzVarA6 = wz.a(hoVar, nrVar, ov0Var4, 0);
                                    int iHashCode13 = Long.hashCode(ks.U(ov0Var4));
                                    l72 l72VarZ13 = ov0Var4.z();
                                    dv1 dv1VarH13 = xp1.H(ov0Var4, dv1VarE8);
                                    w20.b.getClass();
                                    x30 x30Var3 = v20.b;
                                    ov0Var4.g0();
                                    if (ov0Var4.D()) {
                                        ov0Var4.k(x30Var3);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    gh ghVar5 = v20.e;
                                    q73.h(ov0Var4, ghVar5, yzVarA6);
                                    gh ghVar6 = v20.d;
                                    q73.h(ov0Var4, ghVar6, l72VarZ13);
                                    Integer numValueOf2 = Integer.valueOf(iHashCode13);
                                    gh ghVar7 = v20.f;
                                    q73.h(ov0Var4, ghVar7, numValueOf2);
                                    wa waVar2 = v20.g;
                                    q73.g(ov0Var4, waVar2);
                                    gh ghVar8 = v20.c;
                                    q73.h(ov0Var4, ghVar8, dv1VarH13);
                                    ov0 ov0Var7 = ov0Var4;
                                    s83.b(ke0.N(2131625169, ov0Var4), null, hz.c(0.5f, ((kz) ov0Var4.j(hh0Var)).q), v63.b(11.5d), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 1597440, 0, 262058);
                                    ov0 ov0Var8 = ov0Var7;
                                    gh0.h(ov0Var8, iw2.g(av1Var, 6.0f));
                                    dv1 dv1VarE9 = iw2.e(av1Var, 1.0f);
                                    kk2 kk2VarA4 = jk2.a(new jo(6.0f, true, new fo(0)), orVar2, ov0Var8, 6);
                                    int iHashCode14 = Long.hashCode(ks.U(ov0Var8));
                                    l72 l72VarZ14 = ov0Var8.z();
                                    dv1 dv1VarH14 = xp1.H(ov0Var8, dv1VarE9);
                                    ov0Var8.g0();
                                    if (ov0Var8.D()) {
                                        ov0Var8.k(x30Var3);
                                    } else {
                                        ov0Var8.p0();
                                    }
                                    q73.h(ov0Var8, ghVar5, kk2VarA4);
                                    q73.h(ov0Var8, ghVar6, l72VarZ14);
                                    az2.s(iHashCode14, ov0Var8, ghVar7, ov0Var8, waVar2);
                                    q73.h(ov0Var8, ghVar8, dv1VarH14);
                                    ov0Var8.c0(754709585);
                                    Iterator it = am1.G(g83.g(2412, "2.4G (2412)"), g83.g(5180, "5G (5180)"), g83.g(5745, "5.8G (5745)")).iterator();
                                    while (true) {
                                        boolean zHasNext = it.hasNext();
                                        t52Var7 = t52Var6;
                                        if (!zHasNext) {
                                            break;
                                        }
                                        i52 i52Var2 = (i52) it.next();
                                        int iIntValue4 = ((Number) i52Var2.e).intValue();
                                        String str9 = (String) i52Var2.f;
                                        boolean z7 = t52Var7.g() == iIntValue4;
                                        dv1 dv1VarN6 = xp1.n(new wb1(1.0f, true), cj2.a(8.0f));
                                        if (z7) {
                                            jC2 = bk.g;
                                        } else {
                                            if (z5) {
                                                j3 = hz.c;
                                                f5 = 0.06f;
                                            } else {
                                                j3 = hz.b;
                                                f5 = 0.04f;
                                            }
                                            jC2 = hz.c(f5, j3);
                                        }
                                        dv1 dv1VarL5 = xp1.l(dv1VarN6, jC2);
                                        boolean zD2 = ov0Var8.d(iIntValue4);
                                        Object objQ12 = ov0Var8.Q();
                                        if (zD2 || objQ12 == c30Var5) {
                                            objQ12 = new yh0(iIntValue4, t52Var7, 3);
                                            ov0Var8.m0(objQ12);
                                        }
                                        dv1 dv1VarF3 = zm3.F(bk.a(dv1VarL5, (au0) objQ12), 0.0f, 6.0f, 1);
                                        er1 er1VarC5 = ws.c(prVar5, false);
                                        int iHashCode15 = Long.hashCode(ks.U(ov0Var8));
                                        l72 l72VarZ15 = ov0Var8.z();
                                        dv1 dv1VarH15 = xp1.H(ov0Var8, dv1VarF3);
                                        w20.b.getClass();
                                        x30 x30Var4 = v20.b;
                                        ov0Var8.g0();
                                        if (ov0Var8.D()) {
                                            ov0Var8.k(x30Var4);
                                        } else {
                                            ov0Var8.p0();
                                        }
                                        q73.h(ov0Var8, v20.e, er1VarC5);
                                        q73.h(ov0Var8, v20.d, l72VarZ15);
                                        q73.h(ov0Var8, v20.f, Integer.valueOf(iHashCode15));
                                        q73.g(ov0Var8, v20.g);
                                        q73.h(ov0Var8, v20.c, dv1VarH15);
                                        long jC7 = v63.c(11);
                                        jr0 jr0Var5 = z7 ? jr0.j : jr0.g;
                                        if (z7) {
                                            ov0Var8.c0(1249639748);
                                            ov0Var8.s();
                                            jC3 = hz.c;
                                        } else {
                                            ov0Var8.c0(1249641266);
                                            jC3 = hz.c(0.75f, ((kz) ov0Var8.j(mz.a)).q);
                                            ov0Var8.s();
                                        }
                                        ov0 ov0Var9 = ov0Var8;
                                        s83.b(str9, null, jC3, jC7, jr0Var5, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 24576, 0, 262058);
                                        ov0Var8 = ov0Var9;
                                        ov0Var8.r();
                                    }
                                    ov0Var8.s();
                                    ov0Var8.r();
                                    ov0Var8.r();
                                    dv1 dv1VarL6 = xp1.l(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f)), z5 ? hz.c(0.04f, hz.c) : hz.c(0.03f, hz.b));
                                    hh0 hh0Var2 = mz.a;
                                    dv1 dv1VarE10 = zm3.E(ji2.w(dv1VarL6, 0.8f, hz.c(z5 ? 0.12f : 0.06f, ((kz) ov0Var8.j(hh0Var2)).A), cj2.a(14.0f)), 14.0f, 10.0f);
                                    yz yzVarA7 = wz.a(hoVar, nrVar, ov0Var8, 0);
                                    int iHashCode16 = Long.hashCode(ks.U(ov0Var8));
                                    l72 l72VarZ16 = ov0Var8.z();
                                    dv1 dv1VarH16 = xp1.H(ov0Var8, dv1VarE10);
                                    w20.b.getClass();
                                    x30 x30Var5 = v20.b;
                                    ov0Var8.g0();
                                    if (ov0Var8.D()) {
                                        ov0Var8.k(x30Var5);
                                    } else {
                                        ov0Var8.p0();
                                    }
                                    gh ghVar9 = v20.e;
                                    q73.h(ov0Var8, ghVar9, yzVarA7);
                                    gh ghVar10 = v20.d;
                                    q73.h(ov0Var8, ghVar10, l72VarZ16);
                                    Integer numValueOf3 = Integer.valueOf(iHashCode16);
                                    gh ghVar11 = v20.f;
                                    q73.h(ov0Var8, ghVar11, numValueOf3);
                                    wa waVar3 = v20.g;
                                    q73.g(ov0Var8, waVar3);
                                    gh ghVar12 = v20.c;
                                    q73.h(ov0Var8, ghVar12, dv1VarH16);
                                    ov0 ov0Var10 = ov0Var8;
                                    s83.b(ke0.N(2131625168, ov0Var8), null, hz.c(0.5f, ((kz) ov0Var8.j(hh0Var2)).q), v63.b(11.5d), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var10, 1597440, 0, 262058);
                                    gh0.h(ov0Var10, iw2.g(av1Var, 4.0f));
                                    ey1 ey1Var15 = ey1Var9;
                                    String str10 = (String) ey1Var15.getValue();
                                    q93 q93Var3 = new q93(((kz) ov0Var10.j(hh0Var2)).q, v63.c(13), null, 0L, 0L, 0, 0L, 16777212);
                                    dv1 dv1VarE11 = iw2.e(av1Var, 1.0f);
                                    Object objQ13 = ov0Var10.Q();
                                    if (objQ13 == c30Var5) {
                                        objQ13 = new di0(ey1Var15, 4);
                                        ov0Var10.m0(objQ13);
                                    }
                                    xq.a(str10, (lu0) objQ13, dv1VarE11, false, q93Var3, null, null, true, 0, 0, null, null, null, null, null, ov0Var10, 100663728, 0, 65240);
                                    ov0 ov0Var11 = ov0Var10;
                                    gh0.h(ov0Var11, iw2.g(av1Var, 6.0f));
                                    kk2 kk2VarA5 = jk2.a(new jo(6.0f, true, new fo(0)), orVar2, ov0Var11, 6);
                                    int iHashCode17 = Long.hashCode(ks.U(ov0Var11));
                                    l72 l72VarZ17 = ov0Var11.z();
                                    dv1 dv1VarH17 = xp1.H(ov0Var11, av1Var);
                                    ov0Var11.g0();
                                    if (ov0Var11.D()) {
                                        ov0Var11.k(x30Var5);
                                    } else {
                                        ov0Var11.p0();
                                    }
                                    q73.h(ov0Var11, ghVar9, kk2VarA5);
                                    q73.h(ov0Var11, ghVar10, l72VarZ17);
                                    az2.s(iHashCode17, ov0Var11, ghVar11, ov0Var11, waVar3);
                                    q73.h(ov0Var11, ghVar12, dv1VarH17);
                                    ov0Var11.c0(-69101071);
                                    for (i52 i52Var3 : am1.G(g83.g("[WPA2-PSK-CCMP][RSN]", "WPA2"), g83.g("[WPA3-SAE]", "WPA3"), g83.g("[ESS]", "OPEN"))) {
                                        String str11 = (String) i52Var3.e;
                                        String str12 = (String) i52Var3.f;
                                        dv1 dv1VarL7 = xp1.l(xp1.n(av1Var, cj2.a(6.0f)), o51.f((String) ey1Var15.getValue(), str11) ? hz.c(0.15f, bk.g) : z5 ? hz.c(0.06f, hz.c) : hz.c(0.04f, hz.b));
                                        boolean zF = ov0Var11.f(str11);
                                        Object objQ14 = ov0Var11.Q();
                                        if (zF || objQ14 == c30Var5) {
                                            objQ14 = new ci0(str11, ey1Var15, 1);
                                            ov0Var11.m0(objQ14);
                                        }
                                        dv1 dv1VarA2 = bk.a(dv1VarL7, (au0) objQ14);
                                        float f8 = f7;
                                        dv1 dv1VarE12 = zm3.E(dv1VarA2, f8, 3.0f);
                                        er1 er1VarC6 = ws.c(j9.f, false);
                                        int iHashCode18 = Long.hashCode(ks.U(ov0Var11));
                                        l72 l72VarZ18 = ov0Var11.z();
                                        dv1 dv1VarH18 = xp1.H(ov0Var11, dv1VarE12);
                                        w20.b.getClass();
                                        x30 x30Var6 = v20.b;
                                        ov0Var11.g0();
                                        if (ov0Var11.D()) {
                                            ov0Var11.k(x30Var6);
                                        } else {
                                            ov0Var11.p0();
                                        }
                                        q73.h(ov0Var11, v20.e, er1VarC6);
                                        q73.h(ov0Var11, v20.d, l72VarZ18);
                                        q73.h(ov0Var11, v20.f, Integer.valueOf(iHashCode18));
                                        q73.g(ov0Var11, v20.g);
                                        q73.h(ov0Var11, v20.c, dv1VarH18);
                                        long jB4 = v63.b(10.5d);
                                        jr0 jr0Var6 = jr0.i;
                                        if (o51.f((String) ey1Var15.getValue(), str11)) {
                                            ov0Var11.c0(425828106);
                                            ov0Var11.s();
                                            jC = bk.g;
                                        } else {
                                            ov0Var11.c0(425829778);
                                            jC = hz.c(0.7f, ((kz) ov0Var11.j(mz.a)).q);
                                            ov0Var11.s();
                                        }
                                        ov0 ov0Var12 = ov0Var11;
                                        s83.b(str12, null, jC, jB4, jr0Var6, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var12, 1597440, 0, 262058);
                                        ov0Var11 = ov0Var12;
                                        ov0Var11.r();
                                        f7 = f8;
                                    }
                                    ov0Var11.s();
                                    ov0Var11.r();
                                    ov0Var11.r();
                                    dv1 dv1VarL8 = xp1.l(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f)), z5 ? hz.c(0.04f, hz.c) : hz.c(0.03f, hz.b));
                                    hh0 hh0Var3 = mz.a;
                                    dv1 dv1VarE13 = zm3.E(ji2.w(dv1VarL8, 0.8f, hz.c(z5 ? 0.12f : 0.06f, ((kz) ov0Var11.j(hh0Var3)).A), cj2.a(14.0f)), 14.0f, 6.0f);
                                    yz yzVarA8 = wz.a(hoVar, nrVar, ov0Var11, 0);
                                    int iHashCode19 = Long.hashCode(ks.U(ov0Var11));
                                    l72 l72VarZ19 = ov0Var11.z();
                                    dv1 dv1VarH19 = xp1.H(ov0Var11, dv1VarE13);
                                    w20.b.getClass();
                                    x30 x30Var7 = v20.b;
                                    ov0Var11.g0();
                                    if (ov0Var11.D()) {
                                        ov0Var11.k(x30Var7);
                                    } else {
                                        ov0Var11.p0();
                                    }
                                    gh ghVar13 = v20.e;
                                    q73.h(ov0Var11, ghVar13, yzVarA8);
                                    gh ghVar14 = v20.d;
                                    q73.h(ov0Var11, ghVar14, l72VarZ19);
                                    Integer numValueOf4 = Integer.valueOf(iHashCode19);
                                    gh ghVar15 = v20.f;
                                    q73.h(ov0Var11, ghVar15, numValueOf4);
                                    wa waVar4 = v20.g;
                                    q73.g(ov0Var11, waVar4);
                                    gh ghVar16 = v20.c;
                                    q73.h(ov0Var11, ghVar16, dv1VarH19);
                                    dv1 dv1VarF4 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 6.0f, 1);
                                    kk2 kk2VarA6 = jk2.a(u92Var, orVar, ov0Var11, 54);
                                    int iHashCode20 = Long.hashCode(ks.U(ov0Var11));
                                    l72 l72VarZ20 = ov0Var11.z();
                                    dv1 dv1VarH20 = xp1.H(ov0Var11, dv1VarF4);
                                    ov0Var11.g0();
                                    if (ov0Var11.D()) {
                                        ov0Var11.k(x30Var7);
                                    } else {
                                        ov0Var11.p0();
                                    }
                                    q73.h(ov0Var11, ghVar13, kk2VarA6);
                                    q73.h(ov0Var11, ghVar14, l72VarZ20);
                                    az2.s(iHashCode20, ov0Var11, ghVar15, ov0Var11, waVar4);
                                    q73.h(ov0Var11, ghVar16, dv1VarH20);
                                    ov0 ov0Var13 = ov0Var11;
                                    s83.b(ke0.N(2131625171, ov0Var11), null, ((kz) ov0Var11.j(hh0Var3)).q, v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var13, 24576, 0, 262122);
                                    ey1 ey1Var16 = ey1Var10;
                                    boolean zBooleanValue = ((Boolean) ey1Var16.getValue()).booleanValue();
                                    Object objQ15 = ov0Var13.Q();
                                    if (objQ15 == c30Var5) {
                                        objQ15 = new di0(ey1Var16, 5);
                                        ov0Var13.m0(objQ15);
                                    }
                                    long j6 = hz.c;
                                    b43.a(zBooleanValue, (lu0) objQ15, null, false, mc0.m(j6, bk.h, 0L, 0L, 0L, 0L, ov0Var13, 65532), ov0Var13, 48, 92);
                                    ov0Var13.r();
                                    ld0.g(null, 0.0f, hz.c(z5 ? 0.08f : 0.04f, ((kz) ov0Var13.j(hh0Var3)).A), ov0Var13, 0);
                                    dv1 dv1VarF5 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 6.0f, 1);
                                    kk2 kk2VarA7 = jk2.a(u92Var, orVar, ov0Var13, 54);
                                    int iHashCode21 = Long.hashCode(ks.U(ov0Var13));
                                    l72 l72VarZ21 = ov0Var13.z();
                                    dv1 dv1VarH21 = xp1.H(ov0Var13, dv1VarF5);
                                    ov0Var13.g0();
                                    if (ov0Var13.D()) {
                                        ov0Var13.k(x30Var7);
                                    } else {
                                        ov0Var13.p0();
                                    }
                                    q73.h(ov0Var13, ghVar13, kk2VarA7);
                                    q73.h(ov0Var13, ghVar14, l72VarZ21);
                                    az2.s(iHashCode21, ov0Var13, ghVar15, ov0Var13, waVar4);
                                    q73.h(ov0Var13, ghVar16, dv1VarH21);
                                    s83.b(ke0.N(2131624390, ov0Var13), null, ((kz) ov0Var13.j(hh0Var3)).q, v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var13, 24576, 0, 262122);
                                    ey1 ey1Var17 = ey1Var11;
                                    boolean zBooleanValue2 = ((Boolean) ey1Var17.getValue()).booleanValue();
                                    Object objQ16 = ov0Var13.Q();
                                    if (objQ16 == c30Var5) {
                                        objQ16 = new di0(ey1Var17, 6);
                                        ov0Var13.m0(objQ16);
                                    }
                                    long j7 = bk.g;
                                    long j8 = j6;
                                    b43.a(zBooleanValue2, (lu0) objQ16, null, false, mc0.m(j6, j7, 0L, 0L, 0L, 0L, ov0Var13, 65532), ov0Var13, 48, 92);
                                    ov0Var13.r();
                                    ov0Var13.r();
                                    ov0Var13.r();
                                    gh0.h(ov0Var13, iw2.g(av1Var, 14.0f));
                                    dv1 dv1VarE14 = iw2.e(av1Var, 1.0f);
                                    kk2 kk2VarA8 = jk2.a(new jo(10.0f, true, new fo(0)), orVar, ov0Var13, 54);
                                    int iHashCode22 = Long.hashCode(ks.U(ov0Var13));
                                    l72 l72VarZ22 = ov0Var13.z();
                                    dv1 dv1VarH22 = xp1.H(ov0Var13, dv1VarE14);
                                    ov0Var13.g0();
                                    if (ov0Var13.D()) {
                                        ov0Var13.k(x30Var7);
                                    } else {
                                        ov0Var13.p0();
                                    }
                                    q73.h(ov0Var13, ghVar13, kk2VarA8);
                                    q73.h(ov0Var13, ghVar14, l72VarZ22);
                                    az2.s(iHashCode22, ov0Var13, ghVar15, ov0Var13, waVar4);
                                    q73.h(ov0Var13, ghVar16, dv1VarH22);
                                    lk2 lk2Var = lk2.a;
                                    dv1 dv1VarN7 = xp1.n(iw2.g(lk2.a(lk2Var, av1Var, 1.0f), 42.0f), cj2.a(12.0f));
                                    if (z5) {
                                        f4 = 0.08f;
                                    } else {
                                        j8 = hz.b;
                                        f4 = 0.05f;
                                    }
                                    dv1 dv1VarA3 = bk.a(xp1.l(dv1VarN7, hz.c(f4, j8)), au0Var3);
                                    er1 er1VarC7 = ws.c(prVar5, false);
                                    int iHashCode23 = Long.hashCode(ks.U(ov0Var13));
                                    l72 l72VarZ23 = ov0Var13.z();
                                    dv1 dv1VarH23 = xp1.H(ov0Var13, dv1VarA3);
                                    ov0Var13.g0();
                                    if (ov0Var13.D()) {
                                        ov0Var13.k(x30Var7);
                                    } else {
                                        ov0Var13.p0();
                                    }
                                    q73.h(ov0Var13, ghVar13, er1VarC7);
                                    q73.h(ov0Var13, ghVar14, l72VarZ23);
                                    az2.s(iHashCode23, ov0Var13, ghVar15, ov0Var13, waVar4);
                                    q73.h(ov0Var13, ghVar16, dv1VarH23);
                                    s83.b(ke0.N(2131624085, ov0Var13), null, 0L, v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var13, 24576, 0, 262126);
                                    ov0Var13.r();
                                    bj2 bj2VarA2 = cj2.a(12.0f);
                                    gu guVarA = hu.a(j7, 0L, 0L, 0L, ov0Var13, 14);
                                    dv1 dv1VarG = iw2.g(lk2.a(lk2Var, av1Var, 1.3f), 42.0f);
                                    vu0 vu0Var3 = vu0Var2;
                                    boolean zF2 = ov0Var13.f(vu0Var3);
                                    Object objQ17 = ov0Var13.Q();
                                    if (zF2 || objQ17 == c30Var5) {
                                        objQ17 = new ii0(vu0Var3, ey1Var14, ey1Var13, t52Var7, t52Var8, ey1Var15, ey1Var12, ey1Var16, ey1Var17);
                                        ov0Var13.m0(objQ17);
                                    }
                                    n51.a((au0) objQ17, dv1VarG, false, bj2VarA2, guVarA, null, null, null, da0.i, ov0Var13, 805306368, 484);
                                    ov0Var13.r();
                                    ov0Var13.r();
                                } else {
                                    ov0Var3.W();
                                }
                                return mf3.a;
                            }
                        }, ov0Var2), ov0Var2, 196614, 16);
                    } else {
                        ov0Var2.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, ((i3 >> 6) & 14) | 432, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new xy(li0Var, z, au0Var, vu0Var, i2, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:83:0x015b  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void d(dv1 dv1Var, yd1 yd1Var, z42 z42Var, ko koVar, k9 k9Var, ka0 ka0Var, boolean z, o42 o42Var, lu0 lu0Var, f30 f30Var, int i2, int i3) {
        dv1 dv1Var2;
        int i4;
        yd1 yd1VarA;
        int i5;
        int i6;
        z42 b52Var;
        int i7;
        int i8;
        ko koVar2;
        int i9;
        boolean z2;
        ov0 ov0Var;
        k9 k9Var2;
        o42 o42Var2;
        dv1 dv1Var3;
        yd1 yd1Var2;
        z42 z42Var2;
        ko koVar3;
        ka0 ka0Var2;
        boolean z3;
        ee2 ee2VarT;
        dv1 dv1Var4;
        dv1 dv1Var5;
        k9 k9Var3;
        int i10;
        ka0 ka0VarP;
        o42 o42VarA;
        boolean z4;
        z42 z42Var3;
        ko koVar4;
        yd1 yd1Var3;
        int i11;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(53695811);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
            dv1Var2 = dv1Var;
        } else if ((i2 & 6) == 0) {
            dv1Var2 = dv1Var;
            i4 = (ov0Var2.f(dv1Var2) ? 4 : 2) | i2;
        } else {
            dv1Var2 = dv1Var;
            i4 = i2;
        }
        if ((i3 & 2) == 0) {
            yd1VarA = yd1Var;
            int i13 = ov0Var2.f(yd1VarA) ? 32 : 16;
            i5 = i4 | i13;
            i6 = i3 & 4;
            if (i6 != 0) {
                if ((i2 & 384) == 0) {
                    b52Var = z42Var;
                    if (ov0Var2.f(b52Var)) {
                        i7 = 256;
                    } else {
                        i7 = WorkQueueKt.BUFFER_CAPACITY;
                    }
                    i5 |= i7;
                }
                i8 = i5 | 3072;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        koVar2 = koVar;
                        int i14 = ov0Var2.f(koVar2) ? 16384 : 8192;
                        i8 |= i14;
                    } else {
                        koVar2 = koVar;
                    }
                    i8 |= i14;
                } else {
                    koVar2 = koVar;
                }
                i9 = i8 | 46858240;
                if ((805306368 & i2) == 0) {
                    if (ov0Var2.h(lu0Var)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i9 |= i11;
                }
                if ((306783379 & i9) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (ov0Var2.T(i9 & 1, z2)) {
                    ov0Var2.Y();
                    if ((i2 & 1) != 0 || ov0Var2.B()) {
                        if (i12 != 0) {
                            dv1Var4 = av1.a;
                        } else {
                            dv1Var4 = dv1Var2;
                        }
                        if ((i3 & 2) != 0) {
                            i9 &= -113;
                            yd1VarA = ae1.a(ov0Var2);
                        }
                        if (i6 != 0) {
                            b52Var = new b52(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i3 & 16) != 0) {
                            i9 &= -57345;
                            koVar2 = am1.g;
                        }
                        dv1Var5 = dv1Var4;
                        k9Var3 = j9.r;
                        i10 = i9 & (-238551041);
                        ka0VarP = ig0.p(ov0Var2);
                        o42VarA = r42.a(ov0Var2);
                        z4 = true;
                        z42Var3 = b52Var;
                        koVar4 = koVar2;
                        yd1Var3 = yd1VarA;
                    } else {
                        ov0Var2.W();
                        if ((i3 & 2) != 0) {
                            i9 &= -113;
                        }
                        if ((i3 & 16) != 0) {
                            i9 &= -57345;
                        }
                        i10 = i9 & (-238551041);
                        k9Var3 = k9Var;
                        ka0VarP = ka0Var;
                        z4 = z;
                        o42VarA = o42Var;
                        dv1Var5 = dv1Var2;
                        yd1Var3 = yd1VarA;
                        z42Var3 = b52Var;
                        koVar4 = koVar2;
                    }
                    ov0Var2.q();
                    ov0Var = ov0Var2;
                    hd0.f(dv1Var5, yd1Var3, z42Var3, true, ka0VarP, z4, o42VarA, k9Var3, koVar4, null, null, lu0Var, ov0Var, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | 806882304, ((i10 >> 12) & 14) | ((i10 >> 18) & 7168), 6400);
                    dv1Var3 = dv1Var5;
                    yd1Var2 = yd1Var3;
                    z42Var2 = z42Var3;
                    ka0Var2 = ka0VarP;
                    z3 = z4;
                    o42Var2 = o42VarA;
                    k9Var2 = k9Var3;
                    koVar3 = koVar4;
                } else {
                    ov0Var = ov0Var2;
                    ov0Var.W();
                    k9Var2 = k9Var;
                    o42Var2 = o42Var;
                    dv1Var3 = dv1Var2;
                    yd1Var2 = yd1VarA;
                    z42Var2 = b52Var;
                    koVar3 = koVar2;
                    ka0Var2 = ka0Var;
                    z3 = z;
                }
                ee2VarT = ov0Var.t();
                if (ee2VarT != null) {
                    ee2VarT.d = new mu(dv1Var3, yd1Var2, z42Var2, koVar3, k9Var2, ka0Var2, z3, o42Var2, lu0Var, i2, i3);
                }
            }
            i5 |= 384;
            b52Var = z42Var;
            i8 = i5 | 3072;
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    koVar2 = koVar;
                    if (ov0Var2.f(koVar2)) {
                    }
                    i8 |= i14;
                } else {
                    koVar2 = koVar;
                }
                i8 |= i14;
            } else {
                koVar2 = koVar;
            }
            i9 = i8 | 46858240;
            if ((805306368 & i2) == 0) {
                if (ov0Var2.h(lu0Var)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i9 |= i11;
            }
            if ((306783379 & i9) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ov0Var2.T(i9 & 1, z2)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 2) != 0) {
                        i9 &= -113;
                        yd1VarA = ae1.a(ov0Var2);
                    }
                    if (i6 != 0) {
                        b52Var = new b52(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i3 & 16) != 0) {
                        i9 &= -57345;
                        koVar2 = am1.g;
                    }
                    dv1Var5 = dv1Var4;
                    k9Var3 = j9.r;
                    i10 = i9 & (-238551041);
                    ka0VarP = ig0.p(ov0Var2);
                    o42VarA = r42.a(ov0Var2);
                    z4 = true;
                    z42Var3 = b52Var;
                    koVar4 = koVar2;
                    yd1Var3 = yd1VarA;
                } else {
                    if (i12 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 2) != 0) {
                        i9 &= -113;
                        yd1VarA = ae1.a(ov0Var2);
                    }
                    if (i6 != 0) {
                        b52Var = new b52(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i3 & 16) != 0) {
                        i9 &= -57345;
                        koVar2 = am1.g;
                    }
                    dv1Var5 = dv1Var4;
                    k9Var3 = j9.r;
                    i10 = i9 & (-238551041);
                    ka0VarP = ig0.p(ov0Var2);
                    o42VarA = r42.a(ov0Var2);
                    z4 = true;
                    z42Var3 = b52Var;
                    koVar4 = koVar2;
                    yd1Var3 = yd1VarA;
                }
                ov0Var2.q();
                ov0Var = ov0Var2;
                hd0.f(dv1Var5, yd1Var3, z42Var3, true, ka0VarP, z4, o42VarA, k9Var3, koVar4, null, null, lu0Var, ov0Var, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | 806882304, ((i10 >> 12) & 14) | ((i10 >> 18) & 7168), 6400);
                dv1Var3 = dv1Var5;
                yd1Var2 = yd1Var3;
                z42Var2 = z42Var3;
                ka0Var2 = ka0VarP;
                z3 = z4;
                o42Var2 = o42VarA;
                k9Var2 = k9Var3;
                koVar3 = koVar4;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                k9Var2 = k9Var;
                o42Var2 = o42Var;
                dv1Var3 = dv1Var2;
                yd1Var2 = yd1VarA;
                z42Var2 = b52Var;
                koVar3 = koVar2;
                ka0Var2 = ka0Var;
                z3 = z;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new mu(dv1Var3, yd1Var2, z42Var2, koVar3, k9Var2, ka0Var2, z3, o42Var2, lu0Var, i2, i3);
            }
        }
        yd1VarA = yd1Var;
        i5 = i4 | i13;
        i6 = i3 & 4;
        if (i6 != 0) {
            if ((i2 & 384) == 0) {
                b52Var = z42Var;
                if (ov0Var2.f(b52Var)) {
                    i7 = 256;
                } else {
                    i7 = WorkQueueKt.BUFFER_CAPACITY;
                }
                i5 |= i7;
            }
            i8 = i5 | 3072;
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    koVar2 = koVar;
                    if (ov0Var2.f(koVar2)) {
                    }
                    i8 |= i14;
                } else {
                    koVar2 = koVar;
                }
                i8 |= i14;
            } else {
                koVar2 = koVar;
            }
            i9 = i8 | 46858240;
            if ((805306368 & i2) == 0) {
                if (ov0Var2.h(lu0Var)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i9 |= i11;
            }
            if ((306783379 & i9) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ov0Var2.T(i9 & 1, z2)) {
                ov0Var2.Y();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 2) != 0) {
                        i9 &= -113;
                        yd1VarA = ae1.a(ov0Var2);
                    }
                    if (i6 != 0) {
                        b52Var = new b52(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i3 & 16) != 0) {
                        i9 &= -57345;
                        koVar2 = am1.g;
                    }
                    dv1Var5 = dv1Var4;
                    k9Var3 = j9.r;
                    i10 = i9 & (-238551041);
                    ka0VarP = ig0.p(ov0Var2);
                    o42VarA = r42.a(ov0Var2);
                    z4 = true;
                    z42Var3 = b52Var;
                    koVar4 = koVar2;
                    yd1Var3 = yd1VarA;
                } else {
                    if (i12 != 0) {
                        dv1Var4 = av1.a;
                    } else {
                        dv1Var4 = dv1Var2;
                    }
                    if ((i3 & 2) != 0) {
                        i9 &= -113;
                        yd1VarA = ae1.a(ov0Var2);
                    }
                    if (i6 != 0) {
                        b52Var = new b52(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i3 & 16) != 0) {
                        i9 &= -57345;
                        koVar2 = am1.g;
                    }
                    dv1Var5 = dv1Var4;
                    k9Var3 = j9.r;
                    i10 = i9 & (-238551041);
                    ka0VarP = ig0.p(ov0Var2);
                    o42VarA = r42.a(ov0Var2);
                    z4 = true;
                    z42Var3 = b52Var;
                    koVar4 = koVar2;
                    yd1Var3 = yd1VarA;
                }
                ov0Var2.q();
                ov0Var = ov0Var2;
                hd0.f(dv1Var5, yd1Var3, z42Var3, true, ka0VarP, z4, o42VarA, k9Var3, koVar4, null, null, lu0Var, ov0Var, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | 806882304, ((i10 >> 12) & 14) | ((i10 >> 18) & 7168), 6400);
                dv1Var3 = dv1Var5;
                yd1Var2 = yd1Var3;
                z42Var2 = z42Var3;
                ka0Var2 = ka0VarP;
                z3 = z4;
                o42Var2 = o42VarA;
                k9Var2 = k9Var3;
                koVar3 = koVar4;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                k9Var2 = k9Var;
                o42Var2 = o42Var;
                dv1Var3 = dv1Var2;
                yd1Var2 = yd1VarA;
                z42Var2 = b52Var;
                koVar3 = koVar2;
                ka0Var2 = ka0Var;
                z3 = z;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new mu(dv1Var3, yd1Var2, z42Var2, koVar3, k9Var2, ka0Var2, z3, o42Var2, lu0Var, i2, i3);
            }
        }
        i5 |= 384;
        b52Var = z42Var;
        i8 = i5 | 3072;
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                koVar2 = koVar;
                if (ov0Var2.f(koVar2)) {
                }
                i8 |= i14;
            } else {
                koVar2 = koVar;
            }
            i8 |= i14;
        } else {
            koVar2 = koVar;
        }
        i9 = i8 | 46858240;
        if ((805306368 & i2) == 0) {
            if (ov0Var2.h(lu0Var)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i9 |= i11;
        }
        if ((306783379 & i9) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ov0Var2.T(i9 & 1, z2)) {
            ov0Var2.Y();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    dv1Var4 = av1.a;
                } else {
                    dv1Var4 = dv1Var2;
                }
                if ((i3 & 2) != 0) {
                    i9 &= -113;
                    yd1VarA = ae1.a(ov0Var2);
                }
                if (i6 != 0) {
                    b52Var = new b52(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i3 & 16) != 0) {
                    i9 &= -57345;
                    koVar2 = am1.g;
                }
                dv1Var5 = dv1Var4;
                k9Var3 = j9.r;
                i10 = i9 & (-238551041);
                ka0VarP = ig0.p(ov0Var2);
                o42VarA = r42.a(ov0Var2);
                z4 = true;
                z42Var3 = b52Var;
                koVar4 = koVar2;
                yd1Var3 = yd1VarA;
            } else {
                if (i12 != 0) {
                    dv1Var4 = av1.a;
                } else {
                    dv1Var4 = dv1Var2;
                }
                if ((i3 & 2) != 0) {
                    i9 &= -113;
                    yd1VarA = ae1.a(ov0Var2);
                }
                if (i6 != 0) {
                    b52Var = new b52(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i3 & 16) != 0) {
                    i9 &= -57345;
                    koVar2 = am1.g;
                }
                dv1Var5 = dv1Var4;
                k9Var3 = j9.r;
                i10 = i9 & (-238551041);
                ka0VarP = ig0.p(ov0Var2);
                o42VarA = r42.a(ov0Var2);
                z4 = true;
                z42Var3 = b52Var;
                koVar4 = koVar2;
                yd1Var3 = yd1VarA;
            }
            ov0Var2.q();
            ov0Var = ov0Var2;
            hd0.f(dv1Var5, yd1Var3, z42Var3, true, ka0VarP, z4, o42VarA, k9Var3, koVar4, null, null, lu0Var, ov0Var, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | 806882304, ((i10 >> 12) & 14) | ((i10 >> 18) & 7168), 6400);
            dv1Var3 = dv1Var5;
            yd1Var2 = yd1Var3;
            z42Var2 = z42Var3;
            ka0Var2 = ka0VarP;
            z3 = z4;
            o42Var2 = o42VarA;
            k9Var2 = k9Var3;
            koVar3 = koVar4;
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
            k9Var2 = k9Var;
            o42Var2 = o42Var;
            dv1Var3 = dv1Var2;
            yd1Var2 = yd1VarA;
            z42Var2 = b52Var;
            koVar3 = koVar2;
            ka0Var2 = ka0Var;
            z3 = z;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new mu(dv1Var3, yd1Var2, z42Var2, koVar3, k9Var2, ka0Var2, z3, o42Var2, lu0Var, i2, i3);
        }
    }

    public static final void e(dv1 dv1Var, yd1 yd1Var, b52 b52Var, io ioVar, or orVar, ka0 ka0Var, boolean z, o42 o42Var, lu0 lu0Var, f30 f30Var, int i2) {
        yd1 yd1Var2;
        or orVar2;
        ka0 ka0Var2;
        boolean z2;
        o42 o42Var2;
        yd1 yd1VarA;
        o42 o42VarA;
        int i3;
        or orVar3;
        ka0 ka0Var3;
        boolean z3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1884325601);
        int i4 = i2 | 46861328 | (ov0Var.h(lu0Var) ? 536870912 : 268435456);
        if (ov0Var.T(i4 & 1, (306783379 & i4) != 306783378)) {
            ov0Var.Y();
            if ((i2 & 1) == 0 || ov0Var.B()) {
                yd1VarA = ae1.a(ov0Var);
                or orVar4 = j9.o;
                ka0 ka0VarP = ig0.p(ov0Var);
                o42VarA = r42.a(ov0Var);
                i3 = i4 & (-238551153);
                orVar3 = orVar4;
                ka0Var3 = ka0VarP;
                z3 = true;
            } else {
                ov0Var.W();
                i3 = i4 & (-238551153);
                yd1VarA = yd1Var;
                orVar3 = orVar;
                ka0Var3 = ka0Var;
                z3 = z;
                o42VarA = o42Var;
            }
            ov0Var.q();
            hd0.f(dv1Var, yd1VarA, b52Var, false, ka0Var3, z3, o42VarA, null, null, orVar3, ioVar, lu0Var, ov0Var, 1600902, 432 | ((i3 >> 18) & 7168), 1792);
            or orVar5 = orVar3;
            o42Var2 = o42VarA;
            orVar2 = orVar5;
            yd1Var2 = yd1VarA;
            ka0Var2 = ka0Var3;
            z2 = z3;
        } else {
            ov0Var.W();
            yd1Var2 = yd1Var;
            orVar2 = orVar;
            ka0Var2 = ka0Var;
            z2 = z;
            o42Var2 = o42Var;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new ac1(dv1Var, yd1Var2, b52Var, ioVar, orVar2, ka0Var2, z2, o42Var2, lu0Var, i2);
        }
    }

    public static final void h(ul1 ul1Var, AppState appState, boolean z, l6 l6Var, f30 f30Var, int i2) {
        int i3;
        CloudAccount account;
        ul1Var.getClass();
        appState.getClass();
        l6Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1568154708);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? ov0Var.f(ul1Var) : ov0Var.h(ul1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? ov0Var.f(appState) : ov0Var.h(appState) ? 32 : 16;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? ov0Var.f(l6Var) : ov0Var.h(l6Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        boolean z2 = true;
        if (ov0Var.T(i3 & 1, (i3 & 1043) != 1042)) {
            Boolean boolValueOf = Boolean.valueOf(appState.isLanguageSet());
            int i4 = i3 & 112;
            if (i4 != 32 && ((i3 & 64) == 0 || !ov0Var.h(appState))) {
                z2 = false;
            }
            Object objQ = ov0Var.Q();
            if (z2 || objQ == d30.a) {
                objQ = new wk1(appState, null);
                ov0Var.m0(objQ);
            }
            oi0.e(ov0Var, (pu0) objQ, boolValueOf);
            ey1 ey1VarS = ee0.s(l6Var.c, ov0Var);
            if (l6Var.e && (!((CloudAccountState) ey1VarS.getValue()).getValidated() || (account = ((CloudAccountState) ey1VarS.getValue()).getAccount()) == null || account.isGuest())) {
                ov0Var.c0(536869060);
                n51.g(ul1Var, appState, l6Var, ov0Var, (i3 & 14) | 8 | (AppState.$stable << 3) | i4 | 512 | ((i3 >> 3) & 896));
                ov0Var.p(false);
            } else if (appState.isLanguageSet()) {
                ov0Var.c0(536875003);
                n51.g(ul1Var, appState, l6Var, ov0Var, (i3 & 14) | 8 | (AppState.$stable << 3) | i4 | 512 | ((i3 >> 3) & 896));
                ov0Var.p(false);
            } else {
                ov0Var.c0(536871950);
                ca1.b(ul1Var, ov0Var, (i3 & 14) | 8);
                ov0Var.p(false);
            }
            ym3.h(ul1Var, appState, ov0Var, (i3 & 14) | 8 | (AppState.$stable << 3) | i4);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new xy(ul1Var, appState, z, l6Var, i2);
        }
    }

    public static final void i(String str, x01 x01Var, boolean z, boolean z2, au0 au0Var, f30 f30Var, int i2) {
        long j;
        long j2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1721506001);
        int i3 = i2 | (ov0Var.f(str) ? 4 : 2) | (ov0Var.f(x01Var) ? 32 : 16) | (ov0Var.g(z) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.g(z2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var.h(au0Var) ? 16384 : 8192);
        if (ov0Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            bj2 bj2VarA = cj2.a(16.0f);
            if (z) {
                ov0Var.c0(-804850465);
                j = dh0.p(ov0Var).c;
            } else {
                ov0Var.c0(-804848938);
                j = dh0.p(ov0Var).p;
            }
            ov0Var.p(false);
            long j3 = j;
            if (z) {
                ov0Var.c0(-804846218);
                j2 = dh0.p(ov0Var).a;
            } else {
                ov0Var.c0(-804844963);
                j2 = dh0.p(ov0Var).B;
            }
            ov0Var.p(false);
            e33.a(null, bj2VarA, j3, 0L, 0.0f, 0.0f, da0.h(1.0f, j2), sb.a0(-520031948, new zp1(z, z2, au0Var, x01Var, str), ov0Var), ov0Var, 12582912, 57);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new zp1(str, x01Var, z, z2, au0Var, i2);
        }
    }

    public static final void j(boolean z, boolean z2, au0 au0Var, lu0 lu0Var, f30 f30Var, int i2) {
        au0 au0Var2;
        au0Var.getClass();
        lu0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1458098348);
        int i3 = (ov0Var.g(z) ? 4 : 2) | i2 | (ov0Var.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(lu0Var) ? 16384 : 8192);
        if (ov0Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            au0Var2 = au0Var;
            ym3.b(N(2131624682, ov0Var), mh0.J(), au0Var2, sb.a0(-1793936489, new ym(au0Var, z, z2, lu0Var), ov0Var), ov0Var, 3456);
        } else {
            au0Var2 = au0Var;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new q6(z, z2, au0Var2, lu0Var, i2);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v1 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void k(final com.vincenthzr.locationspoofer.data.db.CompleteLocation r61, final boolean r62, final defpackage.au0 r63, final defpackage.uu0 r64, final defpackage.vu0 r65, final defpackage.lu0 r66, final defpackage.iu0 r67, final defpackage.lu0 r68, defpackage.su0 r69, final defpackage.lu0 r70, defpackage.f30 r71, final int r72) {
        /*
            Method dump skipped, instruction units count: 2550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke0.k(com.vincenthzr.locationspoofer.data.db.CompleteLocation, boolean, au0, uu0, vu0, lu0, iu0, lu0, su0, lu0, f30, int):void");
    }

    public static final void l(dv1 dv1Var, p10 p10Var, f30 f30Var, int i2) {
        int i3;
        dv1 dv1Var2;
        p10 p10Var2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(790527681);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.f(dv1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.h(p10Var) ? 32 : 16;
        }
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                w52 w52Var = new w52(null, j9.W);
                ov0Var.m0(w52Var);
                objQ = w52Var;
            }
            ey1 ey1Var = (ey1) objQ;
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                objQ2 = new mo0(ey1Var, 28);
                ov0Var.m0(objQ2);
            }
            au0 au0Var = (au0) objQ2;
            db2 db2Var = eb0.a;
            vq vqVarN = da0.n(xq1.c, ov0Var, 6);
            dv1Var2 = dv1Var;
            p10Var2 = p10Var;
            k22.c(new kk[]{i63.b.a(ym3.L(au0Var, ov0Var, 2)), i63.a.a(vqVarN)}, sb.a0(1070596993, new j3(dv1Var2, ey1Var, p10Var2, vqVarN, au0Var), ov0Var), ov0Var, 56);
        } else {
            dv1Var2 = dv1Var;
            p10Var2 = p10Var;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new kg(dv1Var2, p10Var2, i2, i4);
        }
    }

    public static final void m(dv1 dv1Var, p10 p10Var, f30 f30Var, int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(155925518);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.f(dv1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.h(p10Var) ? 32 : 16;
        }
        int i4 = 3;
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            boolean z = ov0Var.j(i63.a) != null;
            boolean z2 = ov0Var.j(i63.b) != null;
            if (z && z2) {
                ov0Var.c0(-1977187922);
                er1 er1VarC = ws.c(j9.f, true);
                int iHashCode = Long.hashCode(ov0Var.T);
                l72 l72VarL = ov0Var.l();
                dv1 dv1VarH = xp1.H(ov0Var, dv1Var);
                w20.b.getClass();
                x30 x30Var = v20.b;
                ov0Var.g0();
                if (ov0Var.S) {
                    ov0Var.k(x30Var);
                } else {
                    ov0Var.p0();
                }
                q73.h(ov0Var, v20.e, er1VarC);
                q73.h(ov0Var, v20.d, l72VarL);
                q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                q73.g(ov0Var, v20.g);
                q73.h(ov0Var, v20.c, dv1VarH);
                p10Var.invoke(ov0Var, Integer.valueOf((i3 >> 3) & 14));
                ov0Var.p(true);
                ov0Var.p(false);
            } else if (z) {
                ov0Var.c0(-1976997706);
                ym3.k(dv1Var, p10Var, ov0Var, i3 & 126);
                ov0Var.p(false);
            } else if (z2) {
                ov0Var.c0(-1976846922);
                eb0.d(dv1Var, p10Var, ov0Var, i3 & 126);
                ov0Var.p(false);
            } else {
                ov0Var.c0(-1976716505);
                l(dv1Var, p10Var, ov0Var, i3 & 126);
                ov0Var.p(false);
            }
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new kg(dv1Var, p10Var, i2, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    public static final js2 n(hb1 hb1Var, boolean z) {
        cv1 cv1Var = hb1Var.K.f;
        kb0 kb0Var = null;
        if ((cv1Var.h & 8) != 0) {
            loop0: while (cv1Var != null) {
                if ((cv1Var.g & 8) == 0) {
                    if ((cv1Var.h & 8) != 0) {
                        break;
                        break;
                    }
                    cv1Var = cv1Var.j;
                } else {
                    cv1 cv1VarJ = cv1Var;
                    gy1 gy1Var = null;
                    while (cv1VarJ != null) {
                        if (cv1VarJ instanceof hs2) {
                            kb0Var = cv1VarJ;
                            break loop0;
                        }
                        if ((cv1VarJ.g & 8) != 0 && (cv1VarJ instanceof lb0)) {
                            int i2 = 0;
                            for (cv1 cv1Var2 = ((lb0) cv1VarJ).t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                                if ((cv1Var2.g & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        cv1VarJ = cv1Var2;
                                    } else {
                                        if (gy1Var == null) {
                                            gy1Var = new gy1(new cv1[16]);
                                        }
                                        if (cv1VarJ != null) {
                                            gy1Var.b(cv1VarJ);
                                            cv1VarJ = null;
                                        }
                                        gy1Var.b(cv1Var2);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        cv1VarJ = xp1.J(gy1Var);
                    }
                    if ((cv1Var.h & 8) != 0) {
                        break;
                    }
                    cv1Var = cv1Var.j;
                }
            }
        }
        kb0Var.getClass();
        cv1 cv1Var3 = ((cv1) ((hs2) kb0Var)).e;
        es2 es2VarW = hb1Var.w();
        if (es2VarW == null) {
            es2VarW = new es2();
        }
        return new js2(cv1Var3, z, hb1Var, es2VarW);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object o(co2 co2Var, float f2, yz2 yz2Var, r60 r60Var) {
        sn2 sn2Var;
        te2 te2Var;
        if (r60Var instanceof sn2) {
            sn2Var = (sn2) r60Var;
            int i2 = sn2Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sn2Var.g = i2 - Integer.MIN_VALUE;
            } else {
                sn2Var = new sn2(r60Var);
            }
        } else {
            sn2Var = new sn2(r60Var);
        }
        Object obj = sn2Var.f;
        int i3 = sn2Var.g;
        if (i3 == 0) {
            ee0.J(obj);
            te2 te2Var2 = new te2();
            pu0 tn2Var = new tn2(f2, yz2Var, te2Var2, null);
            sn2Var.e = te2Var2;
            sn2Var.g = 1;
            Object objD = co2Var.d(jy1.e, tn2Var, sn2Var);
            Object obj2 = z70.e;
            if (objD == obj2) {
                return obj2;
            }
            te2Var = te2Var2;
        } else {
            if (i3 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            te2Var = sn2Var.e;
            ee0.J(obj);
        }
        return new Float(te2Var.e);
    }

    public static float p(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = (((((f4 * f7) + ((f3 * f6) + (f2 * f5))) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
        return f8 < 0.0f ? -f8 : f8;
    }

    public static ld2 q(long j, ov0 ov0Var) {
        long j2 = hz.g;
        kz kzVar = (kz) ov0Var.j(mz.a);
        ld2 ld2Var = kzVar.f0;
        if (ld2Var == null) {
            ld2 ld2Var2 = new ld2(mz.c(kzVar, n51.M), mz.c(kzVar, n51.N), hz.c(0.38f, mz.c(kzVar, n51.J)), hz.c(0.38f, mz.c(kzVar, n51.K)));
            kzVar.f0 = ld2Var2;
            ld2Var = ld2Var2;
        }
        long j3 = j != 16 ? j : ld2Var.a;
        long j4 = j2 != 16 ? j2 : ld2Var.b;
        long j5 = j2 != 16 ? j2 : ld2Var.c;
        if (j2 == 16) {
            j2 = ld2Var.d;
        }
        return new ld2(j3, j4, j5, j2);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[LOOP:1: B:54:0x00a0->B:57:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b2 A[EDGE_INSN: B:79:0x00b2->B:58:0x00b2 BREAK  A[LOOP:1: B:54:0x00a0->B:57:0x00ac], SYNTHETIC] */
    public static final InetAddress r(int i2, int i3, String str) {
        int i4;
        int i5;
        int iP;
        byte[] bArr = new byte[16];
        int i6 = i2;
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        while (i6 < i3) {
            if (i7 == 16) {
                return null;
            }
            int i10 = i6 + 2;
            if (i10 <= i3 && s13.Y(str, "::", i6, false)) {
                if (i8 != -1) {
                    return null;
                }
                i7 += 2;
                i8 = i7;
                if (i10 == i3) {
                    break;
                }
                i9 = i10;
                i4 = 0;
                i6 = i9;
                while (i6 < i3) {
                    iP = bh3.p(str.charAt(i6));
                    if (iP != -1) {
                        break;
                        break;
                    }
                    i4 = (i4 << 4) + iP;
                    i6++;
                }
                i5 = i6 - i9;
                return i5 == 0 ? null : null;
            }
            if (i7 != 0) {
                if (!s13.Y(str, ":", i6, false)) {
                    if (!s13.Y(str, ".", i6, false)) {
                        return null;
                    }
                    int i11 = i7 - 2;
                    int i12 = i11;
                    while (i9 < i3) {
                        if (i12 == 16) {
                            return null;
                        }
                        if (i12 != i11) {
                            if (str.charAt(i9) != '.') {
                                return null;
                            }
                            i9++;
                        }
                        int i13 = 0;
                        int i14 = i9;
                        while (i14 < i3) {
                            char cCharAt = str.charAt(i14);
                            if (o51.m(cCharAt, 48) < 0 || o51.m(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i13 == 0 && i9 != i14) || (i13 = ((i13 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i14++;
                        }
                        if (i14 - i9 == 0) {
                            return null;
                        }
                        bArr[i12] = (byte) i13;
                        i12++;
                        i9 = i14;
                    }
                    if (i12 != i7 + 2) {
                        return null;
                    }
                    i7 += 2;
                    break;
                }
                i6++;
            }
            i9 = i6;
            i4 = 0;
            i6 = i9;
            while (i6 < i3) {
                iP = bh3.p(str.charAt(i6));
                if (iP != -1) {
                    break;
                }
                i4 = (i4 << 4) + iP;
                i6++;
            }
            i5 = i6 - i9;
            if (i5 == 0 && i5 <= 4) {
                int i15 = i7 + 1;
                bArr[i7] = (byte) (255 & (i4 >>> 8));
                i7 += 2;
                bArr[i15] = (byte) (i4 & 255);
            }
        }
        if (i7 != 16) {
            if (i8 == -1) {
                return null;
            }
            int i16 = i7 - i8;
            System.arraycopy(bArr, i8, bArr, 16 - i16, i16);
            Arrays.fill(bArr, i8, (16 - i7) + i8, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final boolean s(JSONArray jSONArray) throws JSONException {
        String string;
        k41 k41VarF0 = mh0.f0(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = k41VarF0.iterator();
        while (true) {
            j41 j41Var = (j41) it;
            String str = null;
            if (!j41Var.g) {
                break;
            }
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(j41Var.nextInt());
            Object objOpt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt("syncId") : null;
            String str2 = objOpt instanceof String ? (String) objOpt : null;
            if (str2 != null && !l13.k0(str2)) {
                str = str2;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        Set setM0 = zy.M0(arrayList);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject2 != null) {
                Object objOpt2 = jSONObjectOptJSONObject2.opt("syncId");
                String str3 = objOpt2 instanceof String ? (String) objOpt2 : null;
                if (str3 == null || l13.k0(str3)) {
                    str3 = null;
                }
                if (str3 == null || !linkedHashSet.add(str3)) {
                    do {
                        string = UUID.randomUUID().toString();
                        string.getClass();
                    } while (!setM0.add(string));
                    jSONObjectOptJSONObject2.put("syncId", string);
                    linkedHashSet.add(string);
                    z = true;
                }
            }
        }
        return z;
    }

    public static final String t(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final Rect w(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        int i4 = i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i4 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i4 < i3) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i4, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i4, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i4, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i4, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i4 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i4, i3, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i4, i3, rect3);
        return rect3;
    }

    public static final x01 x() {
        x01 x01Var = e;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Extension", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(20.5f, 11.0f);
        nx0Var.h(19.0f);
        nx0Var.r(7.0f);
        nx0Var.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        nx0Var.i(-4.0f);
        nx0Var.r(3.5f);
        nx0Var.f(13.0f, 2.12f, 11.88f, 1.0f, 10.5f, 1.0f);
        nx0Var.n(8.0f, 2.12f, 8.0f, 3.5f);
        nx0Var.r(5.0f);
        nx0Var.h(4.0f);
        nx0Var.g(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        nx0Var.s(3.8f);
        nx0Var.h(3.5f);
        nx0Var.g(1.49f, 0.0f, 2.7f, 1.21f, 2.7f, 2.7f);
        nx0Var.o(-1.21f, 2.7f, -2.7f, 2.7f);
        nx0Var.h(2.0f);
        nx0Var.r(20.0f);
        nx0Var.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        nx0Var.i(3.8f);
        nx0Var.s(-1.5f);
        nx0Var.g(0.0f, -1.49f, 1.21f, -2.7f, 2.7f, -2.7f);
        nx0Var.o(2.7f, 1.21f, 2.7f, 2.7f);
        nx0Var.r(22.0f);
        nx0Var.h(17.0f);
        nx0Var.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        nx0Var.s(-4.0f);
        nx0Var.i(1.5f);
        nx0Var.g(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        nx0Var.n(21.88f, 11.0f, 20.5f, 11.0f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        e = x01VarB;
        return x01VarB;
    }

    public static final ik2 z(zq1 zq1Var) {
        Object objA = zq1Var.A();
        if (objA instanceof ik2) {
            return (ik2) objA;
        }
        return null;
    }

    public abstract boolean E(Class cls);

    public abstract int I(int i2);

    public abstract int K(int i2);

    @Override // defpackage.kp2
    public int a(int i2) {
        return K(i2);
    }

    @Override // defpackage.kp2
    public int b(int i2) {
        return I(i2);
    }

    @Override // defpackage.kp2
    public int f(int i2) {
        int I = I(i2);
        if (I == -1 || I(I) == -1) {
            return -1;
        }
        return I;
    }

    @Override // defpackage.kp2
    public int g(int i2) {
        int iK = K(i2);
        if (iK == -1 || K(iK) == -1) {
            return -1;
        }
        return iK;
    }

    public abstract Method u(Class cls, Field field);

    public abstract Constructor v(Class cls);

    public abstract String[] y(Class cls);
}
