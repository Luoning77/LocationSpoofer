package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.WifiLoadStatus;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class r93 {
    public static long a;
    public static Method b;

    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, WorkQueueKt.MASK);
        }
        Trace.beginSection(str);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return qb3.a();
        }
        try {
            Method method = b;
            if (method == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                b = method;
            }
            return ((Boolean) method.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    public static final q93 c(q93 q93Var, qa1 qa1Var) {
        long j;
        k83 k83Var;
        int i;
        int i2;
        d93 d93Var;
        uy2 uy2Var = q93Var.a;
        i83 i83Var = vy2.d;
        i83 i83Var2 = uy2Var.a;
        if (i83Var2.equals(h83.a)) {
            i83Var2 = vy2.d;
        }
        i83 i83Var3 = i83Var2;
        long j2 = uy2Var.b;
        x93[] x93VarArr = w93.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = vy2.a;
        }
        long j3 = j2;
        jr0 jr0Var = uy2Var.c;
        if (jr0Var == null) {
            jr0Var = jr0.g;
        }
        jr0 jr0Var2 = jr0Var;
        hr0 hr0Var = uy2Var.d;
        hr0 hr0Var2 = new hr0(hr0Var != null ? hr0Var.a : 0);
        ir0 ir0Var = uy2Var.e;
        ir0 ir0Var2 = new ir0(ir0Var != null ? ir0Var.a : 65535);
        l43 l43Var = uy2Var.f;
        if (l43Var == null) {
            l43Var = l43.a;
        }
        l43 l43Var2 = l43Var;
        String str = uy2Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = uy2Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = vy2.b;
        }
        long j5 = j4;
        qq qqVar = uy2Var.i;
        float f = qqVar != null ? qqVar.a : 0.0f;
        qq qqVar2 = new qq(Float.isNaN(f) ? 0.0f : f);
        j83 j83Var = uy2Var.j;
        if (j83Var == null) {
            j83Var = j83.c;
        }
        j83 j83Var2 = j83Var;
        sh1 sh1VarK = uy2Var.k;
        if (sh1VarK == null) {
            sh1 sh1Var = sh1.g;
            sh1VarK = o82.a.k();
        }
        sh1 sh1Var2 = sh1VarK;
        long j6 = uy2Var.l;
        if (j6 == 16) {
            j6 = vy2.c;
        }
        long j7 = j6;
        p63 p63Var = uy2Var.m;
        if (p63Var == null) {
            p63Var = p63.b;
        }
        p63 p63Var2 = p63Var;
        xt2 xt2Var = uy2Var.n;
        if (xt2Var == null) {
            xt2Var = xt2.d;
        }
        xt2 xt2Var2 = xt2Var;
        f92 f92Var = uy2Var.o;
        kg0 kg0Var = uy2Var.p;
        if (kg0Var == null) {
            kg0Var = en0.a;
        }
        uy2 uy2Var2 = new uy2(i83Var3, j3, jr0Var2, hr0Var2, ir0Var2, l43Var2, str2, j5, qqVar2, j83Var2, sh1Var2, j7, p63Var2, xt2Var2, f92Var, kg0Var);
        p52 p52Var = q93Var.b;
        int i3 = q52.b;
        int i4 = p52Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = p52Var.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = qa1Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        b81.d();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = p52Var.c;
            if ((j & 1095216660480L) == 0) {
                j = q52.a;
            }
            k83Var = p52Var.d;
            if (k83Var == null) {
                k83Var = k83.c;
            }
            w82 w82Var = p52Var.e;
            sf1 sf1Var = p52Var.f;
            i = p52Var.g;
            if (i == 0) {
                i = nf1.b;
            }
            i2 = p52Var.h;
            if (i2 == 0) {
                i2 = 1;
            }
            d93Var = p52Var.i;
            if (d93Var == null) {
                d93Var = d93.c;
            }
            return new q93(uy2Var2, new p52(i4, i6, j, k83Var, w82Var, sf1Var, i, i2, d93Var), q93Var.c);
        }
        int iOrdinal2 = qa1Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            b81.d();
            return null;
        }
        i6 = i5;
        j = p52Var.c;
        if ((j & 1095216660480L) == 0) {
            j = q52.a;
        }
        k83Var = p52Var.d;
        if (k83Var == null) {
            k83Var = k83.c;
        }
        w82 w82Var2 = p52Var.e;
        sf1 sf1Var2 = p52Var.f;
        i = p52Var.g;
        if (i == 0) {
            i = nf1.b;
        }
        i2 = p52Var.h;
        if (i2 == 0) {
            i2 = 1;
        }
        d93Var = p52Var.i;
        if (d93Var == null) {
            d93Var = d93.c;
        }
        return new q93(uy2Var2, new p52(i4, i6, j, k83Var, w82Var2, sf1Var2, i, i2, d93Var), q93Var.c);
    }

    public static final te3 d(String str) {
        int i;
        xp1.m(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new te3(i2);
    }

    public static final ye3 e(String str) {
        str.getClass();
        xp1.m(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, 10L);
                if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j2 = j * 10;
            long j3 = (((long) iDigit) & 4294967295L) + j2;
            if (Long.compareUnsigned(j3, j2) < 0) {
                return null;
            }
            i++;
            j = j3;
        }
        return new ye3(j);
    }

    public static final void f(ag0 ag0Var) {
        if (q1.e()) {
            nf nfVarL = ag0Var.A;
            if (nfVarL == null || ag0Var.x != 0.0f || ag0Var.y != 1.0f || ag0Var.z != 1.5f) {
                pf pfVarC = ag0Var.c("ColorControls", "\n    uniform shader child;\n    uniform float in_brightness;\n    uniform float in_contrast;\n    uniform float in_saturation;\n\n    half4 main(float2 xy) {\n        half4 src = child.eval(xy);\n        half a = src.a;\n        if (a < 0.001) return src;\n\n        half3 c = src.rgb / a;\n\n        if (in_brightness != 0.0) {\n            c = pow(c, half3(2.2));\n            if (in_brightness > 0.0) {\n                c = mix(c, half3(1.0), half(in_brightness));\n            } else {\n                c = c * half(1.0 + in_brightness);\n            }\n            c = pow(c, half3(0.45454545));\n        }\n\n        if (in_contrast != 1.0) {\n            c = (c - 0.5) * half(in_contrast) + 0.5;\n        }\n\n        if (in_saturation != 1.0) {\n            half lum = dot(c, half3(0.2126, 0.7152, 0.0722));\n            c = mix(half3(lum), c, half(in_saturation));\n        }\n\n        c = clamp(c, half3(0.0), half3(1.0));\n        return half4(c * a, a);\n    }\n");
                pfVarC.getClass();
                pfVarC.a.setFloatUniform("in_brightness", 0.0f);
                pfVarC.a.setFloatUniform("in_contrast", 1.0f);
                pfVarC.a.setFloatUniform("in_saturation", 1.5f);
                nfVarL = ld0.L(pfVarC, "child");
                ag0Var.x = 0.0f;
                ag0Var.y = 1.0f;
                ag0Var.z = 1.5f;
                ag0Var.A = nfVarL;
            }
            ag0Var.j = ld0.l(ag0Var.j, nfVarL);
        }
    }

    public static final String g(AppState appState, ov0 ov0Var) {
        appState.getClass();
        if (appState.getCanMockWifi()) {
            ov0Var.c0(1646312444);
            String strO = ke0.O(2131624443, new Object[]{Integer.valueOf(appState.getWifiApCount())}, ov0Var);
            ov0Var.p(false);
            return strO;
        }
        if (appState.getWifiLoadStatus() == WifiLoadStatus.LOADING) {
            return az2.h(ov0Var, 1646316423, 2131624445, ov0Var, false);
        }
        if (appState.getWifiLoadStatus() == WifiLoadStatus.ERROR) {
            return az2.h(ov0Var, 1646319685, 2131624444, ov0Var, false);
        }
        return (appState.getWifiLoadStatus() == WifiLoadStatus.EMPTY || appState.isSpoofingActive()) ? az2.h(ov0Var, 1646323719, 2131624446, ov0Var, false) : az2.h(ov0Var, 1646325703, 2131624447, ov0Var, false);
    }
}
