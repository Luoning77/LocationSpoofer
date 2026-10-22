package defpackage;

import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.DoubleUnaryOperator;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class mh0 {
    public static x01 b = null;
    public static final float c = 32.0f;
    public static x01 d;
    public final /* synthetic */ int a = 24;

    public static jm2 A(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            jm2 jm2Var = new jm2();
            new LinkedHashMap();
            jm2Var.a = new xp(vj0.e);
            return jm2Var;
        }
        ClassLoader classLoader = jm2.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        so1 so1Var = new so1(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            so1Var.put(str, bundle.get(str));
        }
        so1 so1VarB = so1Var.b();
        jm2 jm2Var2 = new jm2();
        new LinkedHashMap();
        jm2Var2.a = new xp(so1VarB);
        return jm2Var2;
    }

    public static final void B(re reVar, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d3 * dSin) + (d2 * dCos)) / d11;
        double d14 = ((d3 * dCos) + ((-d2) * dSin)) / d7;
        double d15 = ((d5 * dSin) + (d4 * dCos)) / d11;
        double d16 = ((d5 * dCos) + ((-d4) * dSin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            B(reVar, d2, d3, d4, d5, d11 * dSqrt, d7 * dSqrt, d8, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d17 * dSqrt2;
        double d24 = dSqrt2 * d18;
        if (z == z2) {
            d9 = d19 - d24;
            d10 = d20 + d23;
        } else {
            d9 = d19 + d24;
            d10 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d14 - d10, d13 - d9);
        double dAtan3 = Math.atan2(d16 - d10, d15 - d9) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d25 = d9 * d11;
        double d26 = d10 * d7;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d12);
        double dSin2 = Math.sin(d12);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d11;
        double d30 = d29 * dCos2;
        double d31 = d7 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d7 * dCos2;
        double d35 = (dCos3 * d34) + (dSin3 * d33);
        double d36 = dAtan3 / ((double) iCeil);
        double d37 = dAtan2;
        double d38 = d32;
        int i = 0;
        double d39 = d35;
        double d40 = d3;
        while (i < iCeil) {
            double d41 = d37 + d36;
            double dSin4 = Math.sin(d41);
            double dCos4 = Math.cos(d41);
            int i2 = iCeil;
            double d42 = (((d11 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d43 = (d34 * dSin4) + (d11 * dSin2 * dCos4) + d28;
            double d44 = (d30 * dSin4) - (d31 * dCos4);
            double d45 = (dCos4 * d34) + (dSin4 * d33);
            double d46 = d41 - d37;
            double dTan = Math.tan(d46 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            reVar.a.cubicTo((float) ((d38 * dSqrt3) + d2), (float) ((d39 * dSqrt3) + d40), (float) (d42 - (dSqrt3 * d44)), (float) (d43 - (dSqrt3 * d45)), (float) d42, (float) d43);
            d36 = d36;
            dSin2 = dSin2;
            d27 = d27;
            d2 = d42;
            i++;
            d33 = d33;
            d37 = d41;
            d39 = d45;
            d38 = d44;
            iCeil = i2;
            d40 = d43;
            d11 = d6;
        }
    }

    public static final void C(jg0 jg0Var, long j, float f, float f2) {
        float f3 = f / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jg0Var.a() >> 32)) - f3) - f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L)) / 2.0f;
        jg0.Y(jg0Var, j, f3, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), null, 120);
    }

    public static final void D(String str, zk2 zk2Var) throws Exception {
        zk2Var.getClass();
        bl2 bl2VarA0 = zk2Var.a0(str);
        try {
            bl2VarA0.R();
            am1.j(bl2VarA0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    public static final boolean E(dq0 dq0Var, ah ahVar) {
        int iOrdinal = dq0Var.r1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                dq0 dq0VarU = vd0.u(dq0Var);
                if (dq0VarU != null) {
                    return E(dq0VarU, ahVar) || F(dq0Var, dq0VarU, 1, ahVar);
                }
                fo.n("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return dq0Var.o1().a ? ((Boolean) ahVar.invoke(dq0Var)).booleanValue() : S(dq0Var, ahVar);
                }
                b81.d();
                return false;
            }
        }
        return S(dq0Var, ahVar);
    }

    public static final boolean F(dq0 dq0Var, dq0 dq0Var2, int i, ah ahVar) {
        if (Y(dq0Var, dq0Var2, i, ahVar)) {
            return true;
        }
        Boolean bool = (Boolean) ks.Z(dq0Var, i, new g22(((rp0) ((db) xp1.P(dq0Var)).getFocusOwner()).g(), dq0Var, dq0Var2, i, ahVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static np2 G(kz kzVar) {
        np2 np2Var = kzVar.a0;
        if (np2Var != null) {
            return np2Var;
        }
        long j = hz.f;
        np2 np2Var2 = new np2(j, mz.c(kzVar, zm3.x), mz.c(kzVar, zm3.B), mz.c(kzVar, zm3.F), j, hz.c(zm3.l, mz.c(kzVar, zm3.k)), hz.c(zm3.z, mz.c(kzVar, zm3.y)), hz.c(zm3.D, mz.c(kzVar, zm3.C)), mz.c(kzVar, zm3.r), hz.c(zm3.o, mz.c(kzVar, zm3.n)), mz.c(kzVar, zm3.w), mz.c(kzVar, zm3.A), mz.c(kzVar, zm3.E));
        kzVar.a0 = np2Var2;
        return np2Var2;
    }

    public static Set H() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final long I(KeyEvent keyEvent) {
        return hd0.e(keyEvent.getKeyCode());
    }

    public static final x01 J() {
        x01 x01Var = d;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Layers", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(12.6f, 18.06f);
        nx0VarI.g(-0.36f, 0.28f, -0.87f, 0.28f, -1.23f, 0.0f);
        nx0VarI.l(-6.15f, -4.78f);
        nx0VarI.g(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0.0f);
        nx0VarI.g(-0.51f, 0.4f, -0.51f, 1.17f, 0.0f, 1.57f);
        nx0VarI.l(6.76f, 5.26f);
        nx0VarI.g(0.72f, 0.56f, 1.73f, 0.56f, 2.46f, 0.0f);
        nx0VarI.l(6.76f, -5.26f);
        nx0VarI.g(0.51f, -0.4f, 0.51f, -1.17f, 0.0f, -1.57f);
        nx0VarI.l(-0.01f, -0.01f);
        nx0VarI.g(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0.0f);
        nx0VarI.l(-6.15f, 4.79f);
        nx0VarI.e();
        nx0VarI.m(13.23f, 15.04f);
        nx0VarI.l(6.76f, -5.26f);
        nx0VarI.g(0.51f, -0.4f, 0.51f, -1.18f, 0.0f, -1.58f);
        nx0VarI.l(-6.76f, -5.26f);
        nx0VarI.g(-0.72f, -0.56f, -1.73f, -0.56f, -2.46f, 0.0f);
        nx0VarI.k(4.01f, 8.21f);
        nx0VarI.g(-0.51f, 0.4f, -0.51f, 1.18f, 0.0f, 1.58f);
        nx0VarI.l(6.76f, 5.26f);
        nx0VarI.g(0.72f, 0.56f, 1.74f, 0.56f, 2.46f, -0.01f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        d = x01VarB;
        return x01VarB;
    }

    public static final sg K(y70 y70Var) {
        sg sgVar = (sg) y70Var.get(j9.U);
        if (sgVar != null) {
            return sgVar;
        }
        fo.n("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final int L(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final boolean M(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final boolean N(x92 x92Var, long j, long j2) {
        int i = x92Var.i == 1 ? 1 : 0;
        long j3 = x92Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final boolean O(aj2 aj2Var) {
        long j = aj2Var.e;
        return (j >>> 32) == (4294967295L & j) && j == aj2Var.f && j == aj2Var.g && j == aj2Var.h;
    }

    public static final z92 P(pu0 pu0Var, lu0 lu0Var) {
        qo0 qo0Var = new qo0(1, pu0Var);
        lu0Var.getClass();
        da0.o(1, lu0Var);
        return new z92(2, qo0Var, lu0Var);
    }

    public static final long Q(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : hz.c(hz.d(j) * f, j);
    }

    public static final boolean R(dq0 dq0Var, ah ahVar) {
        Object[] objArr = new dq0[16];
        if (!dq0Var.e.r) {
            p21.c("visitChildren called on an unattached node");
        }
        gy1 gy1Var = new gy1(new cv1[16]);
        cv1 cv1Var = dq0Var.e;
        cv1 cv1Var2 = cv1Var.j;
        if (cv1Var2 == null) {
            xp1.h(gy1Var, cv1Var);
        } else {
            gy1Var.b(cv1Var2);
        }
        int i = 0;
        while (true) {
            int i2 = gy1Var.g;
            if (i2 == 0) {
                break;
            }
            cv1 cv1VarJ = (cv1) gy1Var.k(i2 - 1);
            if ((cv1VarJ.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                xp1.h(gy1Var, cv1VarJ);
            } else {
                while (cv1VarJ != null) {
                    if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        gy1 gy1Var2 = null;
                        while (cv1VarJ != null) {
                            if (cv1VarJ instanceof dq0) {
                                dq0 dq0Var2 = (dq0) cv1VarJ;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = dq0Var2;
                                i = i3;
                            } else if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                int i4 = 0;
                                for (cv1 cv1Var3 = ((lb0) cv1VarJ).t; cv1Var3 != null; cv1Var3 = cv1Var3.j) {
                                    if ((cv1Var3.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            cv1VarJ = cv1Var3;
                                        } else {
                                            if (gy1Var2 == null) {
                                                gy1Var2 = new gy1(new cv1[16]);
                                            }
                                            if (cv1VarJ != null) {
                                                gy1Var2.b(cv1VarJ);
                                                cv1VarJ = null;
                                            }
                                            gy1Var2.b(cv1Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            cv1VarJ = xp1.J(gy1Var2);
                        }
                        break;
                    }
                    cv1VarJ = cv1VarJ.j;
                }
            }
        }
        Arrays.sort(objArr, 0, i, gq0.b);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                dq0 dq0Var3 = (dq0) objArr[i5];
                if (vd0.A(dq0Var3) && m(dq0Var3, ahVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean S(dq0 dq0Var, ah ahVar) {
        Object[] objArr = new dq0[16];
        if (!dq0Var.e.r) {
            p21.c("visitChildren called on an unattached node");
        }
        gy1 gy1Var = new gy1(new cv1[16]);
        cv1 cv1Var = dq0Var.e;
        cv1 cv1Var2 = cv1Var.j;
        if (cv1Var2 == null) {
            xp1.h(gy1Var, cv1Var);
        } else {
            gy1Var.b(cv1Var2);
        }
        int i = 0;
        while (true) {
            int i2 = gy1Var.g;
            if (i2 == 0) {
                break;
            }
            cv1 cv1VarJ = (cv1) gy1Var.k(i2 - 1);
            if ((cv1VarJ.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                xp1.h(gy1Var, cv1VarJ);
            } else {
                while (cv1VarJ != null) {
                    if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        gy1 gy1Var2 = null;
                        while (cv1VarJ != null) {
                            if (cv1VarJ instanceof dq0) {
                                dq0 dq0Var2 = (dq0) cv1VarJ;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = dq0Var2;
                                i = i3;
                            } else if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                int i4 = 0;
                                for (cv1 cv1Var3 = ((lb0) cv1VarJ).t; cv1Var3 != null; cv1Var3 = cv1Var3.j) {
                                    if ((cv1Var3.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            cv1VarJ = cv1Var3;
                                        } else {
                                            if (gy1Var2 == null) {
                                                gy1Var2 = new gy1(new cv1[16]);
                                            }
                                            if (cv1VarJ != null) {
                                                gy1Var2.b(cv1VarJ);
                                                cv1VarJ = null;
                                            }
                                            gy1Var2.b(cv1Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            cv1VarJ = xp1.J(gy1Var2);
                        }
                        break;
                    }
                    cv1VarJ = cv1VarJ.j;
                }
            }
        }
        Arrays.sort(objArr, 0, i, gq0.b);
        for (int i5 = 0; i5 < i; i5++) {
            dq0 dq0Var3 = (dq0) objArr[i5];
            if (vd0.A(dq0Var3) && E(dq0Var3, ahVar)) {
                return true;
            }
        }
        return false;
    }

    public static final long T(x92 x92Var, boolean z) {
        long jD = c12.d(x92Var.c, x92Var.g);
        if (z || !x92Var.b()) {
            return jD;
        }
        return 0L;
    }

    public static int U(k41 k41Var) {
        o0 o0Var = od2.e;
        try {
            o0 o0Var2 = od2.e;
            if (k41Var.isEmpty()) {
                fo.q(k41Var, "Cannot get random in empty range: ");
                return 0;
            }
            int i = k41Var.f;
            int i2 = k41Var.e;
            if (i < Integer.MAX_VALUE) {
                return od2.e.d(i2, i + 1);
            }
            if (i2 <= Integer.MIN_VALUE) {
                return od2.e.b();
            }
            return od2.e.d(i2 - 1, i) + 1;
        } catch (IllegalArgumentException e) {
            b81.y(e.getMessage());
            return 0;
        }
    }

    public static final void V(to toVar, lu0 lu0Var) {
        to toVar2 = new to(ii2.MAX_BIND_PARAMETER_CNT);
        int i = toVar.g;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            toVar2.put(toVar.e(i2), null);
            i2++;
            i3++;
            if (i3 == 999) {
                lu0Var.invoke(toVar2);
                toVar.putAll(toVar2);
                toVar2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            lu0Var.invoke(toVar2);
            toVar.putAll(toVar2);
        }
    }

    public static final float W(long j, float f, xb0 xb0Var) {
        float fC;
        long jB = w93.b(j);
        if (x93.a(jB, 4294967296L)) {
            if (xb0Var.D() <= 1.05d) {
                return xb0Var.G0(j);
            }
            fC = w93.c(j) / w93.c(xb0Var.Q0(f));
        } else {
            if (!x93.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = w93.c(j);
        }
        return fC * f;
    }

    public static final l41 X(pe2 pe2Var) {
        return new l41(Math.round(pe2Var.a), Math.round(pe2Var.b), Math.round(pe2Var.c), Math.round(pe2Var.d));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:129:0x019a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138 A[ADDED_TO_REGION, LOOP:6: B:92:0x0138->B:120:0x0185, LOOP_START, PHI: r13
      0x0138: PHI (r13v12 cv1) = (r13v7 cv1), (r13v13 cv1) binds: [B:91:0x0136, B:120:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    /* JADX WARN: Code duplicated, block: B:97:0x0144  */
    public static final boolean Y(dq0 dq0Var, dq0 dq0Var2, int i, ah ahVar) {
        cv1 cv1Var;
        cv1 cv1Var2;
        hb1 hb1VarO;
        tz1 tz1Var;
        cv1 cv1VarJ;
        gy1 gy1Var;
        if (dq0Var.r1() != zp0.f) {
            fo.n("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new dq0[16];
        if (!dq0Var.e.r) {
            p21.c("visitChildren called on an unattached node");
        }
        gy1 gy1Var2 = new gy1(new cv1[16]);
        cv1 cv1Var3 = dq0Var.e;
        cv1 cv1Var4 = cv1Var3.j;
        if (cv1Var4 == null) {
            xp1.h(gy1Var2, cv1Var3);
        } else {
            gy1Var2.b(cv1Var4);
        }
        int i2 = 0;
        while (true) {
            int i3 = gy1Var2.g;
            cv1Var = null;
            if (i3 == 0) {
                break;
            }
            cv1 cv1VarJ2 = (cv1) gy1Var2.k(i3 - 1);
            if ((cv1VarJ2.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                xp1.h(gy1Var2, cv1VarJ2);
            } else {
                while (cv1VarJ2 != null) {
                    if ((cv1VarJ2.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        gy1 gy1Var3 = null;
                        while (cv1VarJ2 != null) {
                            if (cv1VarJ2 instanceof dq0) {
                                dq0 dq0Var3 = (dq0) cv1VarJ2;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = dq0Var3;
                                i2 = i4;
                            } else if ((cv1VarJ2.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ2 instanceof lb0)) {
                                int i5 = 0;
                                for (cv1 cv1Var5 = ((lb0) cv1VarJ2).t; cv1Var5 != null; cv1Var5 = cv1Var5.j) {
                                    if ((cv1Var5.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            cv1VarJ2 = cv1Var5;
                                        } else {
                                            if (gy1Var3 == null) {
                                                gy1Var3 = new gy1(new cv1[16]);
                                            }
                                            if (cv1VarJ2 != null) {
                                                gy1Var3.b(cv1VarJ2);
                                                cv1VarJ2 = null;
                                            }
                                            gy1Var3.b(cv1Var5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            cv1VarJ2 = xp1.J(gy1Var3);
                        }
                        break;
                    }
                    cv1VarJ2 = cv1VarJ2.j;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, gq0.b);
        if (i != 1) {
            if (i != 2) {
                fo.n("This function should only be used for 1-D focus search");
                return false;
            }
            k41 k41VarF0 = f0(0, i2);
            int i6 = k41VarF0.e;
            int i7 = k41VarF0.f;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        dq0 dq0Var4 = (dq0) objArr[i7];
                        if (vd0.A(dq0Var4) && m(dq0Var4, ahVar)) {
                            return true;
                        }
                    }
                    if (o51.f(objArr[i7], dq0Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!dq0Var.e.r) {
                    p21.c("visitAncestors called on an unattached node");
                }
                cv1Var2 = dq0Var.e.i;
                hb1VarO = xp1.O(dq0Var);
                loop5: while (hb1VarO != null) {
                    if ((hb1VarO.K.f.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        while (cv1Var2 != null) {
                            if ((cv1Var2.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                cv1VarJ = cv1Var2;
                                gy1Var = null;
                                while (cv1VarJ != null) {
                                    if (cv1VarJ instanceof dq0) {
                                        cv1Var = cv1VarJ;
                                        break loop5;
                                    }
                                    if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                                    }
                                    cv1VarJ = xp1.J(gy1Var);
                                }
                            }
                            cv1Var2 = cv1Var2.i;
                        }
                    }
                    hb1VarO = hb1VarO.u();
                    if (hb1VarO != null) {
                    }
                }
                if (cv1Var != null) {
                    return ((Boolean) ahVar.invoke(dq0Var)).booleanValue();
                }
            }
            return false;
        }
        k41 k41VarF1 = f0(0, i2);
        int i8 = k41VarF1.e;
        int i9 = k41VarF1.f;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    dq0 dq0Var5 = (dq0) objArr[i8];
                    if (vd0.A(dq0Var5) && E(dq0Var5, ahVar)) {
                        return true;
                    }
                }
                if (o51.f(objArr[i8], dq0Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && dq0Var.o1().a) {
            if (!dq0Var.e.r) {
                p21.c("visitAncestors called on an unattached node");
            }
            cv1Var2 = dq0Var.e.i;
            hb1VarO = xp1.O(dq0Var);
            loop5: while (hb1VarO != null) {
                if ((hb1VarO.K.f.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    while (cv1Var2 != null) {
                        if ((cv1Var2.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            cv1VarJ = cv1Var2;
                            gy1Var = null;
                            while (cv1VarJ != null) {
                                if (cv1VarJ instanceof dq0) {
                                    cv1Var = cv1VarJ;
                                    break loop5;
                                }
                                if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0 && (cv1VarJ instanceof lb0)) {
                                    int i10 = 0;
                                    for (cv1 cv1Var6 = ((lb0) cv1VarJ).t; cv1Var6 != null; cv1Var6 = cv1Var6.j) {
                                        if ((cv1Var6.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cv1VarJ = cv1Var6;
                                            } else {
                                                if (gy1Var == null) {
                                                    gy1Var = new gy1(new cv1[16]);
                                                }
                                                if (cv1VarJ != null) {
                                                    gy1Var.b(cv1VarJ);
                                                    cv1VarJ = null;
                                                }
                                                gy1Var.b(cv1Var6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cv1VarJ = xp1.J(gy1Var);
                            }
                        }
                        cv1Var2 = cv1Var2.i;
                    }
                }
                hb1VarO = hb1VarO.u();
                cv1Var2 = (hb1VarO != null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
            }
            if (cv1Var != null) {
                return ((Boolean) ahVar.invoke(dq0Var)).booleanValue();
            }
        }
        return false;
    }

    public static final void Z(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(xp1.T(j)), i, i2, 33);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x019c  */
    public static td a(int i, int i2, int i3) {
        ColorSpace rgb;
        String str;
        float[] fArrA;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] fArr;
        final int i4;
        ColorSpace.Rgb rgb2;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        jh2 jh2Var = qz.e;
        n51.x(i3);
        Bitmap.Config configX = n51.x(i3);
        if (o51.f(jh2Var, jh2Var)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (o51.f(jh2Var, qz.q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (o51.f(jh2Var, qz.r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (o51.f(jh2Var, qz.o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (o51.f(jh2Var, qz.j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (o51.f(jh2Var, qz.i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (o51.f(jh2Var, qz.t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (o51.f(jh2Var, qz.s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (o51.f(jh2Var, qz.k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (o51.f(jh2Var, qz.l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (o51.f(jh2Var, qz.g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (o51.f(jh2Var, qz.h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (o51.f(jh2Var, qz.f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (o51.f(jh2Var, qz.m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (o51.f(jh2Var, qz.p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!o51.f(jh2Var, qz.n)) {
                if (Build.VERSION.SDK_INT >= 34) {
                    if (o51.f(jh2Var, qz.v)) {
                        colorSpace2 = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
                    } else {
                        colorSpace2 = o51.f(jh2Var, qz.w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    }
                    if (colorSpace2 != null) {
                        colorSpace = colorSpace2;
                    } else if (jh2Var != null) {
                        str = jh2Var.a;
                        fArrA = jh2Var.d.a();
                        yb3 yb3Var = jh2Var.g;
                        if (yb3Var != null) {
                        }
                        fArr = jh2Var.i;
                        i4 = 0;
                        if (transferParameters != null) {
                            rgb2 = new ColorSpace.Rgb(str, jh2Var.h, fArrA, transferParameters);
                            if (!Float.isNaN(fArr[0])) {
                                rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                            }
                        } else {
                            float[] fArr2 = jh2Var.h;
                            final ih2 ih2Var = jh2Var.l;
                            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: pz
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d2) {
                                    int i5 = i4;
                                    lu0 lu0Var = ih2Var;
                                    switch (i5) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) lu0Var.invoke(Double.valueOf(d2))).doubleValue();
                                }
                            };
                            final ih2 ih2Var2 = jh2Var.o;
                            final int i5 = 1;
                            rgb2 = new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: pz
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d2) {
                                    int i6 = i5;
                                    lu0 lu0Var = ih2Var2;
                                    switch (i6) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) lu0Var.invoke(Double.valueOf(d2))).doubleValue();
                                }
                            }, jh2Var.e, jh2Var.f);
                        }
                        colorSpace = rgb2;
                    } else {
                        rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                } else if (jh2Var != null) {
                    str = jh2Var.a;
                    fArrA = jh2Var.d.a();
                    yb3 yb3Var2 = jh2Var.g;
                    transferParameters = yb3Var2 != null ? new ColorSpace.Rgb.TransferParameters(yb3Var2.b, yb3Var2.c, yb3Var2.d, yb3Var2.e, yb3Var2.f, yb3Var2.g, yb3Var2.a) : null;
                    fArr = jh2Var.i;
                    i4 = 0;
                    if (transferParameters != null) {
                        rgb2 = new ColorSpace.Rgb(str, jh2Var.h, fArrA, transferParameters);
                        if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb2.getTransform(), fArr)) {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr3 = jh2Var.h;
                        final lu0 ih2Var3 = jh2Var.l;
                        DoubleUnaryOperator doubleUnaryOperator2 = new DoubleUnaryOperator() { // from class: pz
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d2) {
                                int i6 = i4;
                                lu0 lu0Var = ih2Var3;
                                switch (i6) {
                                    case 0:
                                        break;
                                }
                                return ((Number) lu0Var.invoke(Double.valueOf(d2))).doubleValue();
                            }
                        };
                        final lu0 ih2Var4 = jh2Var.o;
                        final int i6 = 1;
                        rgb2 = new ColorSpace.Rgb(str, fArr3, fArrA, doubleUnaryOperator2, new DoubleUnaryOperator() { // from class: pz
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d2) {
                                int i7 = i6;
                                lu0 lu0Var = ih2Var4;
                                switch (i7) {
                                    case 0:
                                        break;
                                }
                                return ((Number) lu0Var.invoke(Double.valueOf(d2))).doubleValue();
                            }
                        }, jh2Var.e, jh2Var.f);
                    }
                    colorSpace = rgb2;
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new td(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configX, true, colorSpace));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace = rgb;
        return new td(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configX, true, colorSpace));
    }

    public static final void a0(Spannable spannable, long j, xb0 xb0Var, int i, int i2) {
        long jB = w93.b(j);
        if (x93.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(xq1.P(xb0Var.G0(j)), false), i, i2, 33);
        } else if (x93.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(w93.c(j)), i, i2, 33);
        }
    }

    public static final l41 b(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new l41(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static final void b0(Spannable spannable, sh1 sh1Var, int i, int i2) {
        if (sh1Var != null) {
            ArrayList arrayList = new ArrayList(az.Y(sh1Var, 10));
            Iterator it = sh1Var.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((rh1) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final void c(au0 au0Var, dv1 dv1Var, wc1 wc1Var, pd1 pd1Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1055276397);
        int i2 = (ov0Var.h(au0Var) ? 4 : 2) | i | (ov0Var.f(dv1Var) ? 32 : 16) | (ov0Var.f(wc1Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.f(pd1Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            vd0.b(sb.a0(-933153643, new oc1(wc1Var, dv1Var, pd1Var, ke0.L(au0Var, ov0Var), 0), ov0Var), ov0Var, 6);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new lr1(au0Var, dv1Var, wc1Var, pd1Var, i, 6);
        }
    }

    public static i41 c0(k41 k41Var, int i) {
        k41Var.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = k41Var.e;
        int i3 = k41Var.f;
        if (k41Var.g <= 0) {
            i = -i;
        }
        return new i41(i2, i3, i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v10 java.util.List
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void d(final defpackage.ul1 r63, com.vincenthzr.locationspoofer.data.model.AppState r64, boolean r65, defpackage.au0 r66, defpackage.lo1 r67, defpackage.f30 r68, int r69) {
        /*
            Method dump skipped, instruction units count: 3590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh0.d(ul1, com.vincenthzr.locationspoofer.data.model.AppState, boolean, au0, lo1, f30, int):void");
    }

    public static final void d0(int i, String str) {
        throw new SQLException(p91.l(i, "Error code: ") + ", message: ".concat(str));
    }

    public static final aj2 e(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new aj2(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final void e0(List list, re reVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        re reVar2 = reVar;
        Path path = reVar2.a;
        Path.FillType fillType = path.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        reVar2.h();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path.setFillType(fillType2);
        e72 e72Var = list2.isEmpty() ? m62.c : (e72) list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i < size) {
            e72 e72Var2 = (e72) list2.get(i);
            if (e72Var2 instanceof m62) {
                path.close();
                path = path;
                size = size;
                f11 = f11;
                i = i;
                e72Var2 = e72Var2;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (e72Var2 instanceof y62) {
                    y62 y62Var = (y62) e72Var2;
                    float f18 = y62Var.c;
                    f14 += f18;
                    float f19 = y62Var.d;
                    f15 += f19;
                    path.rMoveTo(f18, f19);
                    path = path;
                    f16 = f14;
                    f17 = f15;
                } else if (e72Var2 instanceof q62) {
                    q62 q62Var = (q62) e72Var2;
                    float f20 = q62Var.c;
                    float f21 = q62Var.d;
                    path.moveTo(f20, f21);
                    f15 = f21;
                    f17 = f15;
                    f14 = f20;
                    f16 = f14;
                } else if (e72Var2 instanceof x62) {
                    x62 x62Var = (x62) e72Var2;
                    float f22 = x62Var.d;
                    float f23 = x62Var.c;
                    path.rLineTo(f23, f22);
                    f14 += f23;
                    f15 += f22;
                } else if (e72Var2 instanceof p62) {
                    p62 p62Var = (p62) e72Var2;
                    float f24 = p62Var.d;
                    float f25 = p62Var.c;
                    reVar2.e(f25, f24);
                    f14 = f25;
                    f15 = f24;
                } else if (e72Var2 instanceof w62) {
                    float f26 = ((w62) e72Var2).c;
                    path.rLineTo(f26, f11);
                    f14 += f26;
                } else if (e72Var2 instanceof o62) {
                    float f27 = ((o62) e72Var2).c;
                    reVar2.e(f27, f15);
                    f14 = f27;
                } else if (e72Var2 instanceof c72) {
                    float f28 = ((c72) e72Var2).c;
                    path.rLineTo(f11, f28);
                    f15 += f28;
                } else if (e72Var2 instanceof d72) {
                    float f29 = ((d72) e72Var2).c;
                    reVar2.e(f14, f29);
                    f15 = f29;
                } else {
                    if (e72Var2 instanceof v62) {
                        v62 v62Var = (v62) e72Var2;
                        path.rCubicTo(v62Var.c, v62Var.d, v62Var.e, v62Var.f, v62Var.g, v62Var.h);
                        f3 = v62Var.e + f14;
                        f4 = v62Var.f + f15;
                        f14 += v62Var.g;
                        f10 = v62Var.h;
                    } else {
                        if (e72Var2 instanceof n62) {
                            n62 n62Var = (n62) e72Var2;
                            path.cubicTo(n62Var.c, n62Var.d, n62Var.e, n62Var.f, n62Var.g, n62Var.h);
                            f3 = n62Var.e;
                            f5 = n62Var.f;
                            f6 = n62Var.g;
                            f7 = n62Var.h;
                        } else if (e72Var2 instanceof a72) {
                            if (e72Var.a) {
                                f8 = f14 - f12;
                                f9 = f15 - f13;
                            } else {
                                f8 = f11;
                                f9 = f8;
                            }
                            a72 a72Var = (a72) e72Var2;
                            path.rCubicTo(f8, f9, a72Var.c, a72Var.d, a72Var.e, a72Var.f);
                            f3 = a72Var.c + f14;
                            f4 = a72Var.d + f15;
                            f14 += a72Var.e;
                            f10 = a72Var.f;
                        } else if (e72Var2 instanceof s62) {
                            if (e72Var.a) {
                                f14 = (f14 * 2.0f) - f12;
                                f15 = (2.0f * f15) - f13;
                            }
                            s62 s62Var = (s62) e72Var2;
                            path.cubicTo(f14, f15, s62Var.c, s62Var.d, s62Var.e, s62Var.f);
                            f3 = s62Var.c;
                            f5 = s62Var.d;
                            f6 = s62Var.e;
                            f7 = s62Var.f;
                        } else if (e72Var2 instanceof z62) {
                            z62 z62Var = (z62) e72Var2;
                            float f30 = z62Var.f;
                            float f31 = z62Var.e;
                            float f32 = z62Var.d;
                            float f33 = z62Var.c;
                            path.rQuadTo(f33, f32, f31, f30);
                            float f34 = f33 + f14;
                            float f35 = f32 + f15;
                            f14 += f31;
                            f15 += f30;
                            f12 = f34;
                            f13 = f35;
                        } else if (e72Var2 instanceof r62) {
                            r62 r62Var = (r62) e72Var2;
                            float f36 = r62Var.f;
                            float f37 = r62Var.e;
                            float f38 = r62Var.d;
                            f3 = r62Var.c;
                            path.quadTo(f3, f38, f37, f36);
                            f15 = f36;
                            f14 = f37;
                            f13 = f38;
                            f12 = f3;
                        } else if (e72Var2 instanceof b72) {
                            if (e72Var.b) {
                                f = f14 - f12;
                                f2 = f15 - f13;
                            } else {
                                f = f11;
                                f2 = f;
                            }
                            b72 b72Var = (b72) e72Var2;
                            float f39 = b72Var.d;
                            float f40 = b72Var.c;
                            path.rQuadTo(f, f2, f40, f39);
                            f3 = f + f14;
                            f4 = f2 + f15;
                            f14 += f40;
                            f15 += f39;
                            f13 = f4;
                            f12 = f3;
                        } else if (e72Var2 instanceof t62) {
                            if (e72Var.b) {
                                f14 = (f14 * 2.0f) - f12;
                                f15 = (2.0f * f15) - f13;
                            }
                            t62 t62Var = (t62) e72Var2;
                            float f41 = t62Var.d;
                            float f42 = t62Var.c;
                            path.quadTo(f14, f15, f42, f41);
                            path = path;
                            size = size;
                            f11 = f11;
                            i = i;
                            f13 = f15;
                            e72Var2 = e72Var2;
                            f15 = f41;
                            f12 = f14;
                            f14 = f42;
                        } else if (e72Var2 instanceof u62) {
                            u62 u62Var = (u62) e72Var2;
                            float f43 = u62Var.h + f14;
                            float f44 = u62Var.i + f15;
                            size = size;
                            f11 = 0.0f;
                            path = path;
                            i = i;
                            B(reVar, f14, f15, f43, f44, u62Var.c, u62Var.d, u62Var.e, u62Var.f, u62Var.g);
                            f12 = f43;
                            f14 = f12;
                            f13 = f44;
                            f15 = f13;
                            e72Var2 = e72Var2;
                        } else {
                            path = path;
                            size = size;
                            f11 = f11;
                            i = i;
                            if (!(e72Var2 instanceof l62)) {
                                b81.d();
                                return;
                            }
                            l62 l62Var = (l62) e72Var2;
                            float f45 = l62Var.i;
                            float f46 = l62Var.h;
                            e72Var2 = e72Var2;
                            B(reVar, f14, f15, f46, f45, l62Var.c, l62Var.d, l62Var.e, l62Var.f, l62Var.g);
                            f13 = f45;
                            f15 = f13;
                            f12 = f46;
                            f14 = f12;
                        }
                        path = path;
                        f14 = f6;
                        f15 = f7;
                        f13 = f5;
                        f12 = f3;
                    }
                    f15 += f10;
                    f13 = f4;
                    f12 = f3;
                }
                e72Var2 = e72Var2;
            }
            i++;
            list2 = list;
            reVar2 = reVar;
            size = size;
            path = path;
            e72Var = e72Var2;
            f11 = f11;
        }
    }

    public static final void f(x01 x01Var, String str, long j, boolean z, f30 f30Var, int i) {
        str.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1168992681);
        int i2 = i | (ov0Var.f(x01Var) ? 4 : 2) | (ov0Var.f(str) ? 32 : 16) | (ov0Var.g(z) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            bj2 bj2VarA = cj2.a(6.0f);
            av1 av1Var = av1.a;
            dv1 dv1VarE = zm3.E(xp1.k(xp1.n(av1Var, bj2VarA), hz.c(z ? 0.12f : 0.08f, j), o51.p0), 7.0f, 2.5f);
            er1 er1VarC = ws.c(j9.f, false);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarE);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, av1Var);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, kk2VarA);
            q73.h(ov0Var, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH2);
            t01.a(x01Var, null, iw2.k(av1Var, 12.0f), j, ov0Var, (i2 & 14) | 3504, 0);
            gh0.h(ov0Var, iw2.o(av1Var, 3.5f));
            s83.b(str, null, j, v63.c(11), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, ((i2 >> 3) & 14) | 1597824, 0, 262058);
            ov0Var = ov0Var;
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new wf(x01Var, str, j, z, i);
        }
    }

    public static k41 f0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new k41(i, i2 - 1, 1);
        }
        k41 k41Var = k41.h;
        return k41.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final CompleteLocation completeLocation, final boolean z, final boolean z2, au0 au0Var, final au0 au0Var2, final au0 au0Var3, final au0 au0Var4, f30 f30Var, final int i) {
        au0 au0Var5;
        boolean z3;
        x30 x30Var;
        au0Var.getClass();
        au0Var2.getClass();
        au0Var3.getClass();
        au0Var4.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(389578834);
        int i2 = i | (ov0Var.h(completeLocation) ? 4 : 2) | (ov0Var.g(z) ? 32 : 16) | (ov0Var.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var.h(au0Var2) ? 16384 : 8192) | (ov0Var.h(au0Var3) ? 131072 : 65536) | (ov0Var.h(au0Var4) ? 1048576 : 524288);
        if (ov0Var.T(i2 & 1, (599187 & i2) != 599186)) {
            xb0 xb0Var = (xb0) ov0Var.j(z30.h);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = oi0.j(ov0Var);
                ov0Var.m0(objQ);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objQ;
            final float fR = xb0Var.R(204.0f);
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                objQ2 = k22.a(0.0f, 0.01f);
                ov0Var.m0(objQ2);
            }
            final oh ohVar = (oh) objQ2;
            Object objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                objQ3 = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
                ov0Var.m0(objQ3);
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objQ3;
            boolean zE = ov0Var.e(completeLocation.getLocation().getTimestamp());
            Object objQ4 = ov0Var.Q();
            if (zE || objQ4 == c30Var) {
                objQ4 = simpleDateFormat.format(new Date(completeLocation.getLocation().getTimestamp()));
                ov0Var.m0(objQ4);
            }
            final String str = (String) objQ4;
            final int size = completeLocation.getWifis().size() + (completeLocation.getConnectedWifi() != null ? 1 : 0);
            final int size2 = completeLocation.getCells().size();
            final int size3 = completeLocation.getBluetooths().size();
            boolean zK0 = l13.k0(completeLocation.getLocation().getPlaceName());
            boolean zK1 = l13.k0(completeLocation.getLocation().getRemark());
            String strN = ke0.N(2131624351, ov0Var);
            if (!zK0) {
                strN = completeLocation.getLocation().getPlaceName();
            } else if (!zK1) {
                strN = completeLocation.getLocation().getRemark();
            }
            final String str2 = strN;
            final String remark = (zK0 || zK1) ? null : completeLocation.getLocation().getRemark();
            av1 av1Var = av1.a;
            dv1 dv1VarZ = da0.z(iw2.e(av1Var, 1.0f));
            pr prVar = j9.f;
            er1 er1VarC = ws.c(prVar, false);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarZ);
            w20.b.getClass();
            x30 x30Var2 = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var2);
            } else {
                ov0Var.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            pr prVar2 = j9.k;
            dv1 dv1VarF = zm3.F(iw2.c(k22.k(av1Var, prVar2), 1.0f), 0.0f, 2.0f, 1);
            kk2 kk2VarA = jk2.a(new jo(8.0f, true, new fo(0)), j9.p, ov0Var, 54);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarF);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var2);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, kk2VarA);
            q73.h(ov0Var, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH2);
            dv1 dv1VarN = xp1.n(iw2.c(iw2.o(av1Var, 60.0f), 1.0f), cj2.a(16.0f));
            long j = bk.i;
            iy0 iy0Var = o51.p0;
            dv1 dv1VarK = xp1.k(dv1VarN, j, iy0Var);
            boolean zH = ((i2 & 3670016) == 1048576) | ov0Var.h(coroutineScope) | ov0Var.h(ohVar);
            Object objQ5 = ov0Var.Q();
            if (zH || objQ5 == c30Var) {
                z3 = false;
                objQ5 = new r33(coroutineScope, au0Var4, ohVar, 0 == true ? 1 : 0);
                ov0Var.m0(objQ5);
            } else {
                z3 = false;
            }
            dv1 dv1VarA = bk.a(dv1VarK, (au0) objQ5);
            pr prVar3 = j9.j;
            er1 er1VarC2 = ws.c(prVar3, z3);
            int iHashCode3 = Long.hashCode(ov0Var.T);
            l72 l72VarL3 = ov0Var.l();
            dv1 dv1VarH3 = xp1.H(ov0Var, dv1VarA);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var2);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC2);
            q73.h(ov0Var, ghVar2, l72VarL3);
            az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH3);
            nr nrVar = j9.s;
            yz yzVarA = wz.a(new jo(3.0f, true, new fo(0)), nrVar, ov0Var, 54);
            int iHashCode4 = Long.hashCode(ov0Var.T);
            l72 l72VarL4 = ov0Var.l();
            dv1 dv1VarH4 = xp1.H(ov0Var, av1Var);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var2);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA);
            q73.h(ov0Var, ghVar2, l72VarL4);
            az2.s(iHashCode4, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH4);
            x01 x01VarC = z2 ? ke0.C() : ig0.w();
            String strN2 = ke0.N(z2 ? 2131624854 : 2131624003, ov0Var);
            long j2 = hz.c;
            t01.a(x01VarC, strN2, iw2.k(av1Var, 19.0f), j2, ov0Var, 3456, 0);
            String strN3 = ke0.N(z2 ? 2131624854 : 2131624003, ov0Var);
            long jB = v63.b(11.5d);
            jr0 jr0Var = jr0.j;
            s83.b(strN3, null, j2, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
            ov0Var.p(true);
            ov0Var.p(true);
            dv1 dv1VarK2 = xp1.k(xp1.n(iw2.c(iw2.o(av1Var, 60.0f), 1.0f), cj2.a(16.0f)), bk.g, iy0Var);
            boolean zH2 = ov0Var.h(coroutineScope) | ov0Var.h(ohVar) | ((i2 & 57344) == 16384);
            Object objQ6 = ov0Var.Q();
            if (zH2 || objQ6 == c30Var) {
                objQ6 = new r33(coroutineScope, au0Var2, ohVar, 1);
                ov0Var.m0(objQ6);
            }
            dv1 dv1VarA2 = bk.a(dv1VarK2, (au0) objQ6);
            er1 er1VarC3 = ws.c(prVar3, false);
            int iHashCode5 = Long.hashCode(ov0Var.T);
            l72 l72VarL5 = ov0Var.l();
            dv1 dv1VarH5 = xp1.H(ov0Var, dv1VarA2);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var2);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC3);
            q73.h(ov0Var, ghVar2, l72VarL5);
            az2.s(iHashCode5, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH5);
            yz yzVarA2 = wz.a(new jo(3.0f, true, new fo(0)), nrVar, ov0Var, 54);
            int iHashCode6 = Long.hashCode(ov0Var.T);
            l72 l72VarL6 = ov0Var.l();
            dv1 dv1VarH6 = xp1.H(ov0Var, av1Var);
            ov0Var.g0();
            if (ov0Var.S) {
                x30Var = x30Var2;
                ov0Var.k(x30Var);
            } else {
                x30Var = x30Var2;
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA2);
            q73.h(ov0Var, ghVar2, l72VarL6);
            az2.s(iHashCode6, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH6);
            x30 x30Var3 = x30Var;
            t01.a(vd0.w(), ke0.N(2131624402, ov0Var), iw2.k(av1Var, 19.0f), j2, ov0Var, 3456, 0);
            s83.b(ke0.N(2131624402, ov0Var), null, j2, v63.b(11.5d), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
            ov0Var.p(true);
            ov0Var.p(true);
            dv1 dv1VarK3 = xp1.k(xp1.n(iw2.c(iw2.o(av1Var, 60.0f), 1.0f), cj2.a(16.0f)), xp1.d(4293212469L), iy0Var);
            boolean zH3 = ov0Var.h(coroutineScope) | ov0Var.h(ohVar) | ((i2 & 458752) == 131072);
            Object objQ7 = ov0Var.Q();
            if (zH3 || objQ7 == c30Var) {
                objQ7 = new r33(coroutineScope, au0Var3, ohVar, 2);
                ov0Var.m0(objQ7);
            }
            dv1 dv1VarA3 = bk.a(dv1VarK3, (au0) objQ7);
            er1 er1VarC4 = ws.c(prVar3, false);
            int iHashCode7 = Long.hashCode(ov0Var.T);
            l72 l72VarL7 = ov0Var.l();
            dv1 dv1VarH7 = xp1.H(ov0Var, dv1VarA3);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var3);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC4);
            q73.h(ov0Var, ghVar2, l72VarL7);
            az2.s(iHashCode7, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH7);
            yz yzVarA3 = wz.a(new jo(3.0f, true, new fo(0)), nrVar, ov0Var, 54);
            int iHashCode8 = Long.hashCode(ov0Var.T);
            l72 l72VarL8 = ov0Var.l();
            dv1 dv1VarH8 = xp1.H(ov0Var, av1Var);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var3);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA3);
            q73.h(ov0Var, ghVar2, l72VarL8);
            az2.s(iHashCode8, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH8);
            t01.a(ji2.F(), ke0.N(2131624379, ov0Var), iw2.k(av1Var, 20.0f), j2, ov0Var, 3456, 0);
            s83.b(ke0.N(2131624379, ov0Var), null, j2, v63.b(11.5d), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
            ov0Var.p(true);
            ov0Var.p(true);
            ov0Var.p(true);
            boolean zH4 = ov0Var.h(ohVar);
            Object objQ8 = ov0Var.Q();
            if (zH4 || objQ8 == c30Var) {
                objQ8 = new ge2(ohVar, 17);
                ov0Var.m0(objQ8);
            }
            dv1 dv1VarE = iw2.e(xq1.K(av1Var, (lu0) objQ8), 1.0f);
            er1 er1VarC5 = ws.c(prVar, false);
            int iHashCode9 = Long.hashCode(ov0Var.T);
            l72 l72VarL9 = ov0Var.l();
            dv1 dv1VarH9 = xp1.H(ov0Var, dv1VarE);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var3);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC5);
            q73.h(ov0Var, ghVar2, l72VarL9);
            az2.s(iHashCode9, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH9);
            dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
            boolean zH5 = ov0Var.h(ohVar) | ov0Var.h(coroutineScope) | ((i2 & 7168) == 2048);
            Object objQ9 = ov0Var.Q();
            if (zH5 || objQ9 == c30Var) {
                au0Var5 = au0Var;
                objQ9 = new r33(ohVar, coroutineScope, au0Var5);
                ov0Var.m0(objQ9);
            } else {
                au0Var5 = au0Var;
            }
            zm3.b(bk.a(dv1VarE2, (au0) objQ9), 16.0f, new b52(14.0f, 14.0f, 14.0f, 14.0f), sb.a0(1058167247, new qu0() { // from class: s33
                @Override // defpackage.qu0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    gh ghVar5;
                    boolean z4;
                    f30 f30Var2 = (f30) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((zz) obj).getClass();
                    ov0 ov0Var2 = (ov0) f30Var2;
                    if (ov0Var2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        av1 av1Var2 = av1.a;
                        dv1 dv1VarE3 = iw2.e(av1Var2, 1.0f);
                        or orVar = j9.p;
                        kk2 kk2VarA2 = jk2.a(am1.e, orVar, ov0Var2, 48);
                        int iHashCode10 = Long.hashCode(ov0Var2.T);
                        l72 l72VarL10 = ov0Var2.l();
                        dv1 dv1VarH10 = xp1.H(ov0Var2, dv1VarE3);
                        w20.b.getClass();
                        x30 x30Var4 = v20.b;
                        ov0Var2.g0();
                        if (ov0Var2.S) {
                            ov0Var2.k(x30Var4);
                        } else {
                            ov0Var2.p0();
                        }
                        gh ghVar6 = v20.e;
                        q73.h(ov0Var2, ghVar6, kk2VarA2);
                        gh ghVar7 = v20.d;
                        q73.h(ov0Var2, ghVar7, l72VarL10);
                        Integer numValueOf2 = Integer.valueOf(iHashCode10);
                        gh ghVar8 = v20.f;
                        q73.h(ov0Var2, ghVar8, numValueOf2);
                        wa waVar2 = v20.g;
                        q73.g(ov0Var2, waVar2);
                        gh ghVar9 = v20.c;
                        q73.h(ov0Var2, ghVar9, dv1VarH10);
                        if (1.0f <= 0.0d) {
                            n21.a("invalid weight; must be greater than zero");
                        }
                        wb1 wb1Var = new wb1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                        yz yzVarA4 = wz.a(new jo(6.0f, true, new fo(0)), j9.r, ov0Var2, 6);
                        int iHashCode11 = Long.hashCode(ov0Var2.T);
                        l72 l72VarL11 = ov0Var2.l();
                        dv1 dv1VarH11 = xp1.H(ov0Var2, wb1Var);
                        ov0Var2.g0();
                        if (ov0Var2.S) {
                            ov0Var2.k(x30Var4);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar6, yzVarA4);
                        q73.h(ov0Var2, ghVar7, l72VarL11);
                        az2.s(iHashCode11, ov0Var2, ghVar8, ov0Var2, waVar2);
                        q73.h(ov0Var2, ghVar9, dv1VarH11);
                        dv1 dv1VarE4 = iw2.e(av1Var2, 1.0f);
                        kk2 kk2VarA3 = jk2.a(am1.i, orVar, ov0Var2, 54);
                        int iHashCode12 = Long.hashCode(ov0Var2.T);
                        l72 l72VarL12 = ov0Var2.l();
                        dv1 dv1VarH12 = xp1.H(ov0Var2, dv1VarE4);
                        ov0Var2.g0();
                        if (ov0Var2.S) {
                            ov0Var2.k(x30Var4);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar6, kk2VarA3);
                        q73.h(ov0Var2, ghVar7, l72VarL12);
                        az2.s(iHashCode12, ov0Var2, ghVar8, ov0Var2, waVar2);
                        q73.h(ov0Var2, ghVar9, dv1VarH12);
                        long jB2 = v63.b(15.5d);
                        jr0 jr0Var2 = jr0.j;
                        hh0 hh0Var = mz.a;
                        long j3 = ((kz) ov0Var2.j(hh0Var)).q;
                        if (1.0f <= 0.0d) {
                            n21.a("invalid weight; must be greater than zero");
                        }
                        s83.b(str2, new wb1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), j3, jB2, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262056);
                        String str3 = str;
                        str3.getClass();
                        s83.b(str3, null, hz.c(0.45f, ((kz) ov0Var2.j(hh0Var)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262122);
                        ov0 ov0Var3 = ov0Var2;
                        ov0Var3.p(true);
                        String str4 = remark;
                        if (str4 != null) {
                            ov0Var3.c0(-1644036285);
                            kk2 kk2VarA4 = jk2.a(new jo(4.0f, true, new fo(0)), orVar, ov0Var3, 54);
                            int iHashCode13 = Long.hashCode(ov0Var3.T);
                            l72 l72VarL13 = ov0Var3.l();
                            dv1 dv1VarH13 = xp1.H(ov0Var3, av1Var2);
                            ov0Var3.g0();
                            if (ov0Var3.S) {
                                ov0Var3.k(x30Var4);
                            } else {
                                ov0Var3.p0();
                            }
                            q73.h(ov0Var3, ghVar6, kk2VarA4);
                            q73.h(ov0Var3, ghVar7, l72VarL13);
                            az2.s(iHashCode13, ov0Var3, ghVar8, ov0Var3, waVar2);
                            q73.h(ov0Var3, ghVar9, dv1VarH13);
                            ghVar5 = ghVar9;
                            t01.a(zm3.t(), null, iw2.k(av1Var2, 13.0f), bk.g, ov0Var3, 3504, 0);
                            s83.b(str4, null, hz.c(0.7f, ((kz) ov0Var3.j(hh0Var)).q), v63.b(12.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                            ov0Var3 = ov0Var3;
                            ov0Var3.p(true);
                            z4 = false;
                        } else {
                            ghVar5 = ghVar9;
                            z4 = false;
                            ov0Var3.c0(-1654824967);
                        }
                        ov0Var3.p(z4);
                        Locale locale = Locale.US;
                        CompleteLocation completeLocation2 = completeLocation;
                        ov0 ov0Var4 = ov0Var3;
                        s83.b(az2.k(String.format(locale, "%.5f", Arrays.copyOf(new Object[]{Double.valueOf(completeLocation2.getLocation().getLat())}, 1)), ", ", String.format(locale, "%.5f", Arrays.copyOf(new Object[]{Double.valueOf(completeLocation2.getLocation().getLng())}, 1))), null, hz.c(0.55f, ((kz) ov0Var3.j(hh0Var)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262122);
                        kk2 kk2VarA5 = jk2.a(new jo(8.0f, true, new fo(0)), orVar, ov0Var4, 54);
                        int iHashCode14 = Long.hashCode(ov0Var4.T);
                        l72 l72VarL14 = ov0Var4.l();
                        dv1 dv1VarH14 = xp1.H(ov0Var4, av1Var2);
                        ov0Var4.g0();
                        if (ov0Var4.S) {
                            ov0Var4.k(x30Var4);
                        } else {
                            ov0Var4.p0();
                        }
                        q73.h(ov0Var4, ghVar6, kk2VarA5);
                        q73.h(ov0Var4, ghVar7, l72VarL14);
                        az2.s(iHashCode14, ov0Var4, ghVar8, ov0Var4, waVar2);
                        q73.h(ov0Var4, ghVar5, dv1VarH14);
                        x01 x01VarI = k93.i();
                        String strValueOf = String.valueOf(size);
                        long j4 = bk.g;
                        boolean z5 = z;
                        mh0.f(x01VarI, strValueOf, j4, z5, ov0Var4, 384);
                        mh0.f(ks.R(), String.valueOf(size2), bk.i, z5, ov0Var4, 384);
                        mh0.f(am1.v(), String.valueOf(size3), bk.h, z5, ov0Var4, 384);
                        ov0Var4.p(true);
                        ov0Var4.p(true);
                        float fU = mh0.u((1.0f - (Math.abs(((Number) ohVar.d()).floatValue()) / fR)) * 0.4f, 0.0f, 0.4f);
                        x01 x01VarB = zm3.K;
                        if (x01VarB == null) {
                            w01 w01Var = new w01("Rounded.ChevronLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i3 = nh3.a;
                            qy2 qy2Var = new qy2(hz.b);
                            nx0 nx0VarI = p91.i(14.71f, 6.71f);
                            nx0VarI.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                            nx0VarI.k(8.71f, 11.3f);
                            nx0VarI.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                            nx0VarI.l(4.59f, 4.59f);
                            nx0VarI.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                            nx0VarI.g(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                            nx0VarI.k(10.83f, 12.0f);
                            nx0VarI.l(3.88f, -3.88f);
                            nx0VarI.g(0.39f, -0.39f, 0.38f, -1.03f, 0.0f, -1.41f);
                            nx0VarI.e();
                            w01.a(w01Var, nx0VarI.a, qy2Var);
                            x01VarB = w01Var.b();
                            zm3.K = x01VarB;
                        }
                        t01.a(x01VarB, ke0.N(2131625016, ov0Var4), iw2.k(zm3.G(av1Var2, 6.0f, 0.0f, 0.0f, 0.0f, 14), 18.0f), hz.c(fU, ((kz) ov0Var4.j(hh0Var)).q), ov0Var4, 384, 0);
                        ov0Var4.p(true);
                    } else {
                        ov0Var2.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, 25008, 8);
            ov0Var = ov0Var;
            dv1 dv1VarC = iw2.c(iw2.e(k22.k(av1Var, prVar2), 0.35f), 1.0f);
            boolean zH6 = ov0Var.h(coroutineScope) | ov0Var.h(ohVar) | ov0Var.c(fR);
            Object objQ10 = ov0Var.Q();
            if (zH6 || objQ10 == c30Var) {
                objQ10 = new u33(coroutineScope, ohVar, fR);
                ov0Var.m0(objQ10);
            }
            ws.a(m33.a(dv1VarC, mf3.a, (PointerInputEventHandler) objQ10), ov0Var, 0);
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            au0Var5 = au0Var;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final au0 au0Var6 = au0Var5;
            ee2VarT.d = new pu0(z, z2, au0Var6, au0Var2, au0Var3, au0Var4, i) { // from class: t33
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ au0 h;
                public final /* synthetic */ au0 i;
                public final /* synthetic */ au0 j;
                public final /* synthetic */ au0 k;

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(1);
                    mh0.g(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (f30) obj, iM0);
                    return mf3.a;
                }
            };
        }
    }

    public static final wp2 g0(final uq2 uq2Var, final qp2 qp2Var, wp2 wp2Var) {
        final int i = uq2Var.a() ? qp2Var.c : qp2Var.d;
        int iF = uq2Var.a() ? uq2Var.f() : uq2Var.i();
        int i2 = qp2Var.b;
        x83 x83Var = qp2Var.f;
        int i3 = qp2Var.e;
        if (iF != i2) {
            return qp2Var.a(i);
        }
        il1 il1Var = new il1(i, 1, qp2Var);
        ce1 ce1Var = ce1.g;
        final zb1 zb1VarA = ig0.A(ce1Var, il1Var);
        final int i4 = uq2Var.a() ? qp2Var.d : qp2Var.c;
        zb1 zb1VarA2 = ig0.A(ce1Var, new au0() { // from class: zp2
            @Override // defpackage.au0
            public final Object invoke() {
                int iIntValue = ((Number) zb1VarA.getValue()).intValue();
                uq2 uq2Var2 = uq2Var;
                boolean zA = uq2Var2.a();
                boolean z = uq2Var2.k() == e80.e;
                qp2 qp2Var2 = qp2Var;
                x83 x83Var2 = qp2Var2.f;
                int i5 = i;
                long j = x83Var2.j(i5);
                x83 x83Var3 = qp2Var2.f;
                sw1 sw1Var = x83Var3.b;
                int i6 = f93.c;
                int iG = (int) (j >> 32);
                int i7 = sw1Var.f;
                if (sw1Var.d(iG) != iIntValue) {
                    iG = iIntValue >= i7 ? x83Var3.g(i7 - 1) : x83Var3.g(iIntValue);
                }
                int iC = (int) (j & 4294967295L);
                if (sw1Var.d(iC) != iIntValue) {
                    iC = iIntValue >= i7 ? sw1Var.c(i7 - 1, false) : sw1Var.c(iIntValue, false);
                }
                int i8 = i4;
                if (iG == i8) {
                    return qp2Var2.a(iC);
                }
                if (iC == i8) {
                    return qp2Var2.a(iG);
                }
                if (!(zA ^ z) ? i5 >= iG : i5 > iC) {
                    iG = iC;
                }
                return qp2Var2.a(iG);
            }
        });
        if (qp2Var.a != wp2Var.c) {
            return (wp2) zb1VarA2.getValue();
        }
        if (i == i3) {
            return wp2Var;
        }
        if (((Number) zb1VarA.getValue()).intValue() != x83Var.b.d(i3)) {
            return (wp2) zb1VarA2.getValue();
        }
        int i5 = wp2Var.b;
        long j = x83Var.j(i5);
        boolean zA = uq2Var.a();
        if (i3 != -1) {
            if (i != i3) {
                if (((zA ? 1 : 0) ^ (qp2Var.b() != e80.e ? 0 : 1)) == 0) {
                }
            }
            return qp2Var.a(i);
        }
        int i6 = f93.c;
        return (i5 == ((int) (j >> 32)) || i5 == ((int) (j & 4294967295L))) ? (wp2) zb1VarA2.getValue() : qp2Var.a(i);
    }

    public static final xp2 h(uq2 uq2Var, u92 u92Var) {
        boolean z = uq2Var.k() == e80.e;
        return new xp2(j(uq2Var.e(), z, true, uq2Var.f(), u92Var), j(uq2Var.j(), z, false, uq2Var.i(), u92Var), z);
    }

    public static final boolean i(p33 p33Var) {
        List list = p33Var.i.w.a;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((x92) list.get(i)).d) {
                z = true;
                break;
            }
        }
        return !z;
    }

    public static final wp2 j(qp2 qp2Var, boolean z, boolean z2, int i, u92 u92Var) {
        long jA;
        long j;
        int i2 = z2 ? qp2Var.c : qp2Var.d;
        if (i != qp2Var.b) {
            return qp2Var.a(i2);
        }
        switch (u92Var.e) {
            case 4:
                String str = qp2Var.f.a.a.f;
                jA = g93.a(vd0.r(str, i2), vd0.q(str, i2));
                break;
            default:
                jA = qp2Var.f.j(i2);
                break;
        }
        if (z ^ z2) {
            int i3 = f93.c;
            j = jA >> 32;
        } else {
            int i4 = f93.c;
            j = 4294967295L & jA;
        }
        return qp2Var.a((int) j);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[LOOP:0: B:20:0x0054->B:24:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x003c A[EDGE_INSN: B:28:0x003c->B:16:0x003c BREAK  A[LOOP:0: B:20:0x0054->B:24:0x0061], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object k(defpackage.p33 r6, defpackage.q92 r7, defpackage.oq r8) {
        /*
            boolean r0 = r8 instanceof defpackage.mr0
            if (r0 == 0) goto L13
            r0 = r8
            mr0 r0 = (defpackage.mr0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            mr0 r0 = new mr0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.g
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            q92 r6 = r0.f
            p33 r7 = r0.e
            defpackage.ee0.J(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4b
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fo.n(r6)
            r6 = 0
            return r6
        L33:
            defpackage.ee0.J(r8)
            boolean r8 = i(r6)
            if (r8 != 0) goto L64
        L3c:
            r0.e = r6
            r0.f = r7
            r0.h = r2
            java.lang.Object r8 = r6.c(r7, r0)
            z70 r1 = defpackage.z70.e
            if (r8 != r1) goto L4b
            return r1
        L4b:
            p92 r8 = (defpackage.p92) r8
            java.util.List r8 = r8.a
            int r1 = r8.size()
            r3 = 0
        L54:
            if (r3 >= r1) goto L64
            java.lang.Object r4 = r8.get(r3)
            x92 r4 = (defpackage.x92) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L61
            goto L3c
        L61:
            int r3 = r3 + 1
            goto L54
        L64:
            mf3 r6 = defpackage.mf3.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh0.k(p33, q92, oq):java.lang.Object");
    }

    public static final Object l(ca2 ca2Var, pu0 pu0Var, q60 q60Var) {
        Object objM1 = ((q33) ca2Var).m1(new nr0(q60Var.getContext(), pu0Var, null, 0), q60Var);
        return objM1 == z70.e ? objM1 : mf3.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    public static final boolean m(dq0 dq0Var, ah ahVar) {
        int iOrdinal = dq0Var.r1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                dq0 dq0VarU = vd0.u(dq0Var);
                if (dq0VarU == null) {
                    fo.n("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = dq0VarU.r1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (m(dq0VarU, ahVar) || F(dq0Var, dq0VarU, 2, ahVar) || (dq0VarU.o1().a && ((Boolean) ahVar.invoke(dq0VarU)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            b81.d();
                            return false;
                        }
                        fo.n("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return F(dq0Var, dq0VarU, 2, ahVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    b81.d();
                    return false;
                }
                if (!R(dq0Var, ahVar)) {
                    if (!(dq0Var.o1().a ? ((Boolean) ahVar.invoke(dq0Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return R(dq0Var, ahVar);
    }

    public static final wp2 n(wp2 wp2Var, qp2 qp2Var, int i) {
        return new wp2(qp2Var.f.a(i), i, wp2Var.c);
    }

    public static final boolean o(x92 x92Var) {
        return (x92Var.b() || x92Var.h || !x92Var.d) ? false : true;
    }

    public static final boolean p(x92 x92Var) {
        return !x92Var.h && x92Var.d;
    }

    public static final boolean q(x92 x92Var) {
        return (x92Var.b() || !x92Var.h || x92Var.d) ? false : true;
    }

    public static final boolean r(x92 x92Var) {
        return x92Var.h && !x92Var.d;
    }

    public static final void s(int i, int i2) {
        String strM;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                strM = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                strM = p91.m(i, "size ", " must be greater than zero.");
            }
            fo.f(strM);
        }
    }

    public static double t(double d2, double d3, double d4) {
        if (d3 <= d4) {
            if (d2 < d3) {
                return d3;
            }
            return d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float u(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int v(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long w(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static Comparable x(Float f, fy fyVar) {
        fyVar.getClass();
        if (fyVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fyVar + '.');
        }
        if (!fyVar.c(f, fyVar.a()) || fyVar.c(fyVar.a(), f)) {
            return (!fyVar.c(fyVar.b(), f) || fyVar.c(f, fyVar.b())) ? f : fyVar.b();
        }
        return fyVar.a();
    }

    public static StaticLayout y(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            q21.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            q21.a("invalid end value");
        }
        if (i3 < 0) {
            q21.a("invalid maxLines value");
        }
        if (i < 0) {
            q21.a("invalid width value");
        }
        if (i4 < 0) {
            q21.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            q1.k(builderObtain, i7, i8);
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static Handler z(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ad0.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 24:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 24:
                String strC = xe2.a(getClass()).c();
                strC.getClass();
                return strC;
            default:
                return super.toString();
        }
    }
}
