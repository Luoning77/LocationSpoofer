package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountDevice;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import com.vincenthzr.locationspoofer.data.model.RootSetupTestResult;
import com.vincenthzr.locationspoofer.data.model.SavedRoute;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class gh0 {
    public static td a = null;
    public static ga b = null;
    public static xv c = null;
    public static boolean d = false;
    public static Method e = null;
    public static boolean f = false;
    public static Field g;
    public static x01 h;

    public static final float A(y70 y70Var) {
        lv1 lv1Var = (lv1) y70Var.get(j9.V);
        float fA = lv1Var != null ? lv1Var.A() : 1.0f;
        if (fA >= 0.0f) {
            return fA;
        }
        jb2.b("negative scale factor");
        return fA;
    }

    public static final x01 B() {
        x01 x01Var = h;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.SearchOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        long j = hz.b;
        qy2 qy2Var = new qy2(j);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(15.5f, 14.0f);
        nx0Var.i(-0.79f);
        nx0Var.l(-0.28f, -0.27f);
        nx0Var.g(1.2f, -1.4f, 1.82f, -3.31f, 1.48f, -5.34f);
        nx0Var.g(-0.47f, -2.78f, -2.79f, -4.99f, -5.58f, -5.34f);
        nx0Var.f(6.54f, 2.58f, 3.3f, 5.38f, 3.03f, 9.0f);
        nx0Var.i(2.02f);
        nx0Var.g(0.24f, -2.12f, 1.92f, -3.8f, 4.06f, -3.98f);
        nx0Var.f(11.65f, 4.8f, 14.0f, 6.95f, 14.0f, 9.5f);
        nx0Var.g(0.0f, 2.49f, -2.01f, 4.5f, -4.5f, 4.5f);
        nx0Var.g(-0.17f, 0.0f, -0.33f, -0.03f, -0.5f, -0.05f);
        nx0Var.l(0.0f, 2.02f);
        nx0Var.g(0.0f, 0.0f, 0.0f, 0.0f, 0.01f, 0.01f);
        nx0Var.g(1.8f, 0.13f, 3.47f, -0.47f, 4.72f, -1.55f);
        nx0Var.k(14.0f, 14.71f);
        nx0Var.s(0.79f);
        nx0Var.l(4.25f, 4.25f);
        nx0Var.g(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0.0f);
        nx0Var.l(0.0f, 0.0f);
        nx0Var.g(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
        nx0Var.k(15.5f, 14.0f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        qy2 qy2Var2 = new qy2(j);
        nx0 nx0Var2 = new nx0(3);
        nx0Var2.m(6.12f, 11.17f);
        nx0Var2.k(4.0f, 13.29f);
        nx0Var2.l(-2.12f, -2.12f);
        nx0Var2.g(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        nx0Var2.l(0.0f, 0.0f);
        nx0Var2.g(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        nx0Var2.k(3.29f, 14.0f);
        nx0Var2.l(-2.12f, 2.12f);
        nx0Var2.g(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        nx0Var2.l(0.0f, 0.0f);
        nx0Var2.g(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        nx0Var2.k(4.0f, 14.71f);
        nx0Var2.l(2.12f, 2.12f);
        nx0Var2.g(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        nx0Var2.l(0.0f, 0.0f);
        nx0Var2.g(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        nx0Var2.k(4.71f, 14.0f);
        nx0Var2.l(2.12f, -2.12f);
        nx0Var2.g(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        nx0Var2.l(0.0f, 0.0f);
        nx0Var2.f(6.63f, 10.98f, 6.32f, 10.98f, 6.12f, 11.17f);
        nx0Var2.e();
        w01.a(w01Var, nx0Var2.a, qy2Var2);
        x01 x01VarB = w01Var.b();
        h = x01VarB;
        return x01VarB;
    }

    public static final int C(bt2 bt2Var, bt2[] bt2VarArr) {
        bt2VarArr.getClass();
        int iHashCode = (bt2Var.b().hashCode() * 31) + Arrays.hashCode(bt2VarArr);
        d0 d0Var = new d0(bt2Var);
        int iHashCode2 = 1;
        int i = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!d0Var.hasNext()) {
                break;
            }
            int i2 = i * 31;
            String strB = ((bt2) d0Var.next()).b();
            if (strB != null) {
                iHashCode3 = strB.hashCode();
            }
            i = i2 + iHashCode3;
        }
        d0 d0Var2 = new d0(bt2Var);
        while (d0Var2.hasNext()) {
            int i3 = iHashCode2 * 31;
            mh0 mh0VarC = ((bt2) d0Var2.next()).c();
            iHashCode2 = i3 + (mh0VarC != null ? mh0VarC.hashCode() : 0);
        }
        return (((iHashCode * 31) + i) * 31) + iHashCode2;
    }

    public static boolean D(Context context) {
        boolean zBooleanValue;
        SharedPreferences sharedPreferences = context.getSharedPreferences("installation_state", 0);
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("app_settings", 0);
        Boolean boolValueOf = sharedPreferences.contains("language_setup_complete") ? Boolean.valueOf(sharedPreferences.getBoolean("language_setup_complete", false)) : null;
        if (boolValueOf != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            Map<String, ?> all = sharedPreferences2.getAll();
            all.getClass();
            zBooleanValue = !all.isEmpty();
        }
        if (boolValueOf == null && !sharedPreferences.edit().putBoolean("language_setup_complete", zBooleanValue).commit()) {
            fo.n("Check failed.");
            return false;
        }
        if (!zBooleanValue || sharedPreferences2.getBoolean("is_language_set", false) || sharedPreferences2.edit().putBoolean("is_language_set", true).commit()) {
            return zBooleanValue;
        }
        fo.n("Check failed.");
        return false;
    }

    public static final float E(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final int F(float f2, int i, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f2)));
    }

    public static float G(float f2, float[] fArr, float[] fArr2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float fAbs = Math.abs(f2);
        float fSignum = Math.signum(f2);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f7 = fArr[fArr.length - 1];
            float f8 = fArr2[fArr.length - 1];
            if (f7 == 0.0f) {
                return 0.0f;
            }
            return (f8 / f7) * f2;
        }
        if (i2 == -1) {
            float f9 = fArr[0];
            f5 = fArr2[0];
            f6 = f9;
            f4 = 0.0f;
            f3 = 0.0f;
        } else {
            float f10 = fArr[i2];
            float f11 = fArr[i];
            f3 = fArr2[i2];
            f4 = f10;
            f5 = fArr2[i];
            f6 = f11;
        }
        return (((f5 - f3) * Math.max(0.0f, Math.min(1.0f, f4 == f6 ? 0.0f : (fAbs - f4) / (f6 - f4)))) + f3) * fSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void H(cv1 cv1Var, au0 au0Var) {
        a12 a12Var = cv1Var.k;
        if (a12Var == null) {
            a12Var = new a12((z02) cv1Var);
            cv1Var.k = a12Var;
        }
        v42 snapshotObserver = ((db) xp1.P(cv1Var)).getSnapshotObserver();
        snapshotObserver.a.c(a12Var, ik0.p, au0Var);
    }

    public static final boolean K(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final long L(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static String M(File file) {
        Charset charset = sw.a;
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strF = l93.f(inputStreamReader);
            inputStreamReader.close();
            return strF;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ji2.z(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static final void N(zj1 zj1Var, boolean z, lu0 lu0Var) {
        zj1 zj1Var2 = new zj1(ii2.MAX_BIND_PARAMETER_CNT);
        int iJ = zj1Var.j();
        int i = 0;
        int i2 = 0;
        while (i < iJ) {
            if (z) {
                zj1Var2.g(zj1Var.f(i), zj1Var.k(i));
            } else {
                zj1Var2.g(zj1Var.f(i), null);
            }
            i++;
            i2++;
            if (i2 == 999) {
                lu0Var.invoke(zj1Var2);
                if (!z) {
                    int iJ2 = zj1Var2.j();
                    for (int i3 = 0; i3 < iJ2; i3++) {
                        zj1Var.g(zj1Var2.f(i3), zj1Var2.k(i3));
                    }
                }
                zj1Var2.a();
                i2 = 0;
            }
        }
        if (i2 > 0) {
            lu0Var.invoke(zj1Var2);
            if (z) {
                return;
            }
            int iJ3 = zj1Var2.j();
            for (int i4 = 0; i4 < iJ3; i4++) {
                zj1Var.g(zj1Var2.f(i4), zj1Var2.k(i4));
            }
        }
    }

    public static final long O(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final Object P(pu0 pu0Var) {
        Thread.interrupted();
        return BuildersKt__BuildersKt.runBlocking$default(null, new l80(pu0Var, (q60) null, 15), 1, null);
    }

    public static final String Q(bt2 bt2Var) {
        return zy.s0(mh0.f0(0, bt2Var.d()), ", ", bt2Var.b() + '(', ")", new t(bt2Var, 28), 24);
    }

    public static final void R(ri riVar, ti tiVar) {
        tiVar.f.setValue(riVar.e.getValue());
        yi yiVar = tiVar.g;
        yi yiVar2 = riVar.f;
        int iB = yiVar.b();
        for (int i = 0; i < iB; i++) {
            yiVar.e(i, yiVar2.a(i));
        }
        tiVar.i = riVar.h;
        tiVar.h = riVar.g;
        tiVar.j = ((Boolean) riVar.i.getValue()).booleanValue();
    }

    public static void S(File file, String str) throws IOException {
        Charset charset = sw.a;
        str.getClass();
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            T(fileOutputStream, str, charset);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ji2.z(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final void T(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        str.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        charsetEncoderOnUnmappableCharacter.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        byteBufferAllocate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            cArrArray.getClass();
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                fo.n("Check failed.");
                return;
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }

    public static final void a(l6 l6Var, f30 f30Var, int i) {
        int i2;
        int i3;
        int i4;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1741871095);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(l6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (ov0Var.T(i2 & 1, (i2 & 3) != 2)) {
            ey1 ey1VarS = ee0.s(l6Var.f, ov0Var);
            ey1 ey1VarS2 = ee0.s(l6Var.g, ov0Var);
            ey1 ey1VarS3 = ee0.s(l6Var.c, ov0Var);
            String str = (String) ey1VarS.getValue();
            c30 c30Var = d30.a;
            if (str != null) {
                ov0Var.c0(287207563);
                String strN = ke0.N(2131623992, ov0Var);
                String strN2 = ke0.N(o51.f((String) ey1VarS.getValue(), "device_login_required") ? 2131623972 : 2131623985, ov0Var);
                String strN3 = ke0.N(2131624261, ov0Var);
                x01 x01VarB = mc0.a;
                if (x01VarB == null) {
                    w01 w01Var = new w01("Rounded.Devices", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i5 = nh3.a;
                    qy2 qy2Var = new qy2(hz.b);
                    nx0 nx0VarI = p91.i(4.0f, 7.0f);
                    nx0VarI.g(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                    nx0VarI.i(16.0f);
                    nx0VarI.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                    nx0VarI.o(-0.45f, -1.0f, -1.0f, -1.0f);
                    nx0VarI.k(4.0f, 4.0f);
                    nx0VarI.g(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    nx0VarI.s(11.0f);
                    nx0VarI.i(-0.5f);
                    nx0VarI.g(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
                    nx0VarI.n(0.67f, 20.0f, 1.5f, 20.0f);
                    nx0VarI.k(14.0f, 20.0f);
                    nx0VarI.s(-3.0f);
                    nx0VarI.k(4.0f, 17.0f);
                    nx0VarI.k(4.0f, 7.0f);
                    nx0VarI.e();
                    nx0VarI.m(23.0f, 8.0f);
                    nx0VarI.i(-6.0f);
                    nx0VarI.g(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                    nx0VarI.s(10.0f);
                    nx0VarI.g(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                    nx0VarI.i(6.0f);
                    nx0VarI.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                    nx0VarI.k(24.0f, 9.0f);
                    nx0VarI.g(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                    nx0VarI.e();
                    nx0VarI.m(22.0f, 17.0f);
                    nx0VarI.i(-4.0f);
                    nx0VarI.s(-7.0f);
                    nx0VarI.i(4.0f);
                    nx0VarI.s(7.0f);
                    nx0VarI.e();
                    w01.a(w01Var, nx0VarI.a, qy2Var);
                    x01VarB = w01Var.b();
                    mc0.a = x01VarB;
                }
                x01 x01Var = x01VarB;
                boolean zH = ov0Var.h(l6Var);
                Object objQ = ov0Var.Q();
                if (zH || objQ == c30Var) {
                    w12 w12Var = new w12(0, l6Var, l6.class, "dismissSignOutNotice", "dismissSignOutNotice()V", 0, 2);
                    ov0Var.m0(w12Var);
                    objQ = w12Var;
                }
                i3 = 1;
                ym3.c(strN, strN2, x01Var, strN3, (au0) ((o81) objQ), null, null, ov0Var, 0, 96);
                ov0Var = ov0Var;
                ov0Var.p(false);
            } else {
                i3 = 1;
                boolean z = false;
                if (((Boolean) ey1VarS2.getValue()).booleanValue() && ((CloudAccountState) ey1VarS3.getValue()).getValidated()) {
                    ov0Var.c0(287603123);
                    String strN4 = ke0.N(2131623981, ov0Var);
                    CloudAccount account = ((CloudAccountState) ey1VarS3.getValue()).getAccount();
                    String strN5 = ke0.N((account == null || !account.getSoftwareMembershipRequired()) ? 2131623982 : 2131623976, ov0Var);
                    String strN6 = ke0.N(2131623964, ov0Var);
                    x01 x01VarG = xq1.G();
                    boolean zH2 = ov0Var.h(l6Var);
                    Object objQ2 = ov0Var.Q();
                    if (zH2 || objQ2 == c30Var) {
                        i4 = 1;
                        w12 w12Var2 = new w12(0, l6Var, l6.class, "dismissRegistrationNotice", "dismissRegistrationNotice()V", 0, 3);
                        ov0Var.m0(w12Var2);
                        objQ2 = w12Var2;
                    } else {
                        i4 = 1;
                    }
                    z = false;
                    i3 = i4;
                    ym3.c(strN4, strN5, x01VarG, strN6, (au0) ((o81) objQ2), null, null, ov0Var, 0, 96);
                    ov0Var = ov0Var;
                } else {
                    ov0Var.c0(278529547);
                }
                ov0Var.p(z);
            }
        } else {
            i3 = 1;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new e4(l6Var, i, i3);
        }
    }

    public static final void b(String str, boolean z, String str2, f30 f30Var, int i, int i2) {
        String str3;
        int i3;
        String str4;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1792869013);
        int i4 = i | (ov0Var.f(str) ? 4 : 2) | (ov0Var.g(z) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i4 | (ov0Var.f(str3) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        }
        if (ov0Var.T(i3 & 1, (i3 & 147) != 146)) {
            String str5 = i5 != 0 ? null : str3;
            av1 av1Var = av1.a;
            dv1 dv1VarE = iw2.e(av1Var, 1.0f);
            kk2 kk2VarA = jk2.a(am1.e, j9.o, ov0Var, 48);
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
            q73.h(ov0Var, ghVar, kk2VarA);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            t01.a(z ? xq1.G() : k22.s(), null, zm3.G(iw2.k(av1Var, 16.0f), 0.0f, 1.0f, 0.0f, 0.0f, 13), z ? bk.h : xp1.d(4293212469L), ov0Var, 432, 0);
            h(ov0Var, iw2.o(av1Var, 8.0f));
            wb1 wb1Var = new wb1(1.0f, true);
            yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, wb1Var);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA);
            q73.h(ov0Var, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH2);
            long jB = v63.b(12.5d);
            jr0 jr0Var = jr0.h;
            hh0 hh0Var = mz.a;
            int i6 = i3;
            s83.b(str, null, ((kz) ov0Var.j(hh0Var)).q, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, (i3 & 14) | 1597440, 0, 262058);
            ov0Var = ov0Var;
            if (str5 == null || l13.k0(str5)) {
                str4 = str5;
                ov0Var.c0(555285235);
            } else {
                ov0Var.c0(557477152);
                str4 = str5;
                s83.b(str4, null, hz.c(0.5f, ((kz) ov0Var.j(hh0Var)).q), v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, ((i6 >> 6) & 14) | 24576, 0, 262122);
                ov0Var = ov0Var;
            }
            ov0Var.p(false);
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            ov0Var.W();
            str4 = str3;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new yf(str, z, str4, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:144:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:147:0x0703  */
    /* JADX WARN: Code duplicated, block: B:148:0x0707  */
    /* JADX WARN: Code duplicated, block: B:151:0x0718  */
    /* JADX WARN: Code duplicated, block: B:153:0x071e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0725  */
    /* JADX WARN: Code duplicated, block: B:157:0x0739  */
    /* JADX WARN: Code duplicated, block: B:160:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:161:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:164:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:165:0x0803  */
    /* JADX WARN: Code duplicated, block: B:168:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:170:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:171:0x0903  */
    /* JADX WARN: Code duplicated, block: B:174:0x096a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0977  */
    /* JADX WARN: Code duplicated, block: B:179:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:180:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:182:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:187:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0a52  */
    /* JADX WARN: Code duplicated, block: B:197:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:199:0x0a90  */
    /* JADX WARN: Code duplicated, block: B:200:0x0aad  */
    /* JADX WARN: Code duplicated, block: B:203:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:204:0x0acb  */
    /* JADX WARN: Code duplicated, block: B:207:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:210:0x0b85  */
    /* JADX WARN: Code duplicated, block: B:213:0x0b8a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0b8e  */
    /* JADX WARN: Code duplicated, block: B:218:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:220:0x0bc7  */
    /* JADX WARN: Code duplicated, block: B:223:0x0c36 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:226:0x0c3d  */
    /* JADX WARN: Code duplicated, block: B:229:0x0c6c  */
    /* JADX WARN: Code duplicated, block: B:230:0x0c70  */
    /* JADX WARN: Instruction removed from duplicated block: B:207:0x0af3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(List list, String str, boolean z, final lu0 lu0Var, au0 au0Var, final lu0 lu0Var2, final lu0 lu0Var3, f30 f30Var, int i) {
        hh0 hh0Var;
        long j;
        long jC;
        jr0 jr0Var;
        long jC2;
        long jC3;
        long jC4;
        c30 c30Var;
        boolean z2;
        pr prVar;
        c30 c30Var2;
        x30 x30Var;
        gh ghVar;
        gh ghVar2;
        gh ghVar3;
        wa waVar;
        gh ghVar4;
        boolean z3;
        x01 x01VarR;
        float f2;
        long jC5;
        int i2;
        int i3;
        int i4;
        jr0 jr0Var2;
        ov0 ov0Var;
        pr prVar2;
        int i5;
        ki0 ki0Var;
        pr prVar3;
        String upperCase;
        int iHashCode;
        gh ghVar5;
        gh ghVar6;
        int i6;
        String string;
        final ki0 ki0Var2;
        boolean zF;
        Object objQ;
        c30 c30Var3;
        final int i7;
        boolean zF2;
        Object objQ2;
        final int i8;
        pr prVar4 = j9.j;
        pr prVar5 = j9.f;
        go goVar = am1.e;
        or orVar = j9.p;
        nr nrVar = j9.r;
        list.getClass();
        lu0Var.getClass();
        au0Var.getClass();
        lu0Var2.getClass();
        lu0Var3.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-619981052);
        int i9 = i | (ov0Var2.h(list) ? 4 : 2) | (ov0Var2.f(str) ? 32 : 16) | (ov0Var2.g(z) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(lu0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var2.T(i9 & 1, (599187 & i9) != 599186)) {
            av1 av1Var = av1.a;
            dv1 dv1VarL = xp1.l(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(16.0f)), z ? hz.c(0.04f, hz.c) : hz.c(0.03f, hz.b));
            hh0 hh0Var2 = mz.a;
            dv1 dv1VarD = zm3.D(ji2.w(dv1VarL, 0.8f, hz.c(z ? 0.12f : 0.06f, ((kz) ov0Var2.j(hh0Var2)).A), cj2.a(16.0f)), 14.0f);
            yz yzVarA = wz.a(new jo(10.0f, true, new fo(0)), nrVar, ov0Var2, 6);
            int iHashCode2 = Long.hashCode(ks.U(ov0Var2));
            l72 l72VarZ = ov0Var2.z();
            dv1 dv1VarH = xp1.H(ov0Var2, dv1VarD);
            w20.b.getClass();
            x30 x30Var2 = v20.b;
            ov0Var2.g0();
            if (ov0Var2.D()) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            gh ghVar7 = v20.e;
            q73.h(ov0Var2, ghVar7, yzVarA);
            gh ghVar8 = v20.d;
            q73.h(ov0Var2, ghVar8, l72VarZ);
            Integer numValueOf = Integer.valueOf(iHashCode2);
            gh ghVar9 = v20.f;
            q73.h(ov0Var2, ghVar9, numValueOf);
            wa waVar2 = v20.g;
            q73.g(ov0Var2, waVar2);
            gh ghVar10 = v20.c;
            q73.h(ov0Var2, ghVar10, dv1VarH);
            dv1 dv1VarE = iw2.e(av1Var, 1.0f);
            kk2 kk2VarA = jk2.a(am1.i, orVar, ov0Var2, 54);
            int iHashCode3 = Long.hashCode(ks.U(ov0Var2));
            l72 l72VarZ2 = ov0Var2.z();
            dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarE);
            ov0Var2.g0();
            if (ov0Var2.D()) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar7, kk2VarA);
            q73.h(ov0Var2, ghVar8, l72VarZ2);
            az2.s(iHashCode3, ov0Var2, ghVar9, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar10, dv1VarH2);
            kk2 kk2VarA2 = jk2.a(goVar, orVar, ov0Var2, 48);
            int iHashCode4 = Long.hashCode(ks.U(ov0Var2));
            l72 l72VarZ3 = ov0Var2.z();
            dv1 dv1VarH3 = xp1.H(ov0Var2, av1Var);
            ov0Var2.g0();
            if (ov0Var2.D()) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar7, kk2VarA2);
            q73.h(ov0Var2, ghVar8, l72VarZ3);
            az2.s(iHashCode4, ov0Var2, ghVar9, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar10, dv1VarH3);
            x01 x01VarR2 = ks.R();
            long j2 = bk.i;
            t01.a(x01VarR2, null, iw2.k(av1Var, 18.0f), j2, ov0Var2, 3504, 0);
            s83.b(az2.i(av1Var, 8.0f, ov0Var2, 2131624666, ov0Var2), null, ((kz) ov0Var2.j(hh0Var2)).q, v63.b(14.5d), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
            ov0Var2.r();
            dv1 dv1VarE2 = zm3.E(bk.a(xp1.l(xp1.n(av1Var, cj2.a(8.0f)), hz.c(0.12f, j2)), au0Var), 10.0f, 5.0f);
            er1 er1VarC = ws.c(prVar5, false);
            int iHashCode5 = Long.hashCode(ks.U(ov0Var2));
            l72 l72VarZ4 = ov0Var2.z();
            dv1 dv1VarH4 = xp1.H(ov0Var2, dv1VarE2);
            ov0Var2.g0();
            if (ov0Var2.D()) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar7, er1VarC);
            q73.h(ov0Var2, ghVar8, l72VarZ4);
            az2.s(iHashCode5, ov0Var2, ghVar9, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar10, dv1VarH4);
            kk2 kk2VarA3 = jk2.a(goVar, orVar, ov0Var2, 48);
            int iHashCode6 = Long.hashCode(ks.U(ov0Var2));
            l72 l72VarZ5 = ov0Var2.z();
            dv1 dv1VarH5 = xp1.H(ov0Var2, av1Var);
            ov0Var2.g0();
            if (ov0Var2.D()) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar7, kk2VarA3);
            q73.h(ov0Var2, ghVar8, l72VarZ5);
            az2.s(iHashCode6, ov0Var2, ghVar9, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar10, dv1VarH5);
            pr prVar6 = prVar5;
            t01.a(n51.t(), null, iw2.k(av1Var, 14.0f), j2, ov0Var2, 3504, 0);
            String strI = az2.i(av1Var, 3.0f, ov0Var2, 2131623998, ov0Var2);
            long jC6 = v63.c(12);
            jr0 jr0Var3 = jr0.i;
            s83.b(strI, null, j2, jC6, jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597824, 0, 262058);
            ov0Var2.r();
            ov0Var2.r();
            ov0Var2.r();
            s83.b(ke0.N(2131624389, ov0Var2), null, hz.c(0.48f, ((kz) ov0Var2.j(hh0Var2)).q), v63.b(11.5d), null, null, 0L, null, null, v63.c(16), 0, false, 0, 0, null, ov0Var2, 24576, 48, 260074);
            boolean z4 = str == null;
            dv1 dv1VarW = ji2.w(xp1.l(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(10.0f)), z4 ? hz.c(0.08f, j2) : hz.f), 0.8f, z4 ? hz.c(0.35f, j2) : hz.f, cj2.a(10.0f));
            int i10 = i9 & 7168;
            boolean z5 = i10 == 2048;
            Object objQ3 = ov0Var2.Q();
            c30 c30Var4 = d30.a;
            if (z5 || objQ3 == c30Var4) {
                objQ3 = new hl1(5, lu0Var);
                ov0Var2.m0(objQ3);
            }
            dv1 dv1VarE3 = zm3.E(bk.a(dv1VarW, (au0) objQ3), 10.0f, 8.0f);
            kk2 kk2VarA4 = jk2.a(goVar, orVar, ov0Var2, 48);
            int iHashCode7 = Long.hashCode(ks.U(ov0Var2));
            l72 l72VarZ6 = ov0Var2.z();
            dv1 dv1VarH6 = xp1.H(ov0Var2, dv1VarE3);
            ov0Var2.g0();
            if (ov0Var2.D()) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar7, kk2VarA4);
            q73.h(ov0Var2, ghVar8, l72VarZ6);
            az2.s(iHashCode7, ov0Var2, ghVar9, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar10, dv1VarH6);
            x01 x01VarB = z4 ? ee0.B() : dh0.r();
            if (z4) {
                ov0Var2.c0(-1826736737);
                ov0Var2.s();
                j = j2;
                jC = j;
                hh0Var = hh0Var2;
            } else {
                ov0Var2.c0(-1826734965);
                hh0Var = hh0Var2;
                j = j2;
                jC = hz.c(0.4f, ((kz) ov0Var2.j(hh0Var)).q);
                ov0Var2.s();
            }
            hh0 hh0Var3 = hh0Var;
            or orVar2 = orVar;
            go goVar2 = goVar;
            c30 c30Var5 = c30Var4;
            int i11 = i10;
            t01.a(x01VarB, null, iw2.k(av1Var, 17.0f), jC, ov0Var2, 432, 0);
            String strI2 = az2.i(av1Var, 8.0f, ov0Var2, 2131624797, ov0Var2);
            long jC7 = v63.c(13);
            if (!z4) {
                jr0Var = jr0.g;
            }
            if (z4) {
                jr0Var = jr0Var3;
                ov0Var2.c0(-1826721633);
                ov0Var2.s();
                jC2 = j;
            } else {
                jr0Var = jr0Var3;
                ov0Var2.c0(-1826719861);
                jC2 = hz.c(0.8f, ((kz) ov0Var2.j(hh0Var3)).q);
                ov0Var2.s();
            }
            s83.b(strI2, null, jC2, jC7, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262058);
            ov0Var2 = ov0Var2;
            ov0Var2.r();
            if (list.isEmpty()) {
                ov0Var2.c0(-520585759);
                dv1 dv1VarF = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 12.0f, 1);
                er1 er1VarC2 = ws.c(prVar4, false);
                int iHashCode8 = Long.hashCode(ks.U(ov0Var2));
                l72 l72VarZ7 = ov0Var2.z();
                dv1 dv1VarH7 = xp1.H(ov0Var2, dv1VarF);
                ov0Var2.g0();
                if (ov0Var2.D()) {
                    ov0Var2.k(x30Var2);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar7, er1VarC2);
                q73.h(ov0Var2, ghVar8, l72VarZ7);
                az2.s(iHashCode8, ov0Var2, ghVar9, ov0Var2, waVar2);
                q73.h(ov0Var2, ghVar10, dv1VarH7);
                s83.b(ke0.N(2131624794, ov0Var2), null, hz.c(0.4f, ((kz) ov0Var2.j(hh0Var3)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262122);
                ov0Var2 = ov0Var2;
                ov0Var2.r();
                ov0Var2.s();
            } else {
                pr prVar7 = prVar4;
                float f3 = 0.4f;
                ov0Var2.c0(-519890181);
                nr nrVar2 = nrVar;
                yz yzVarA2 = wz.a(new jo(8.0f, true, new fo(0)), nrVar2, ov0Var2, 6);
                int iHashCode9 = Long.hashCode(ks.U(ov0Var2));
                l72 l72VarZ8 = ov0Var2.z();
                float f4 = 12.0f;
                dv1 dv1VarH8 = xp1.H(ov0Var2, av1Var);
                ov0Var2.g0();
                if (ov0Var2.D()) {
                    ov0Var2.k(x30Var2);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar7, yzVarA2);
                q73.h(ov0Var2, ghVar8, l72VarZ8);
                az2.s(iHashCode9, ov0Var2, ghVar9, ov0Var2, waVar2);
                q73.h(ov0Var2, ghVar10, dv1VarH8);
                ov0Var2.c0(1755680435);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final ki0 ki0Var3 = (ki0) it.next();
                    boolean z6 = str != null && s13.T(str, ki0Var3.a);
                    dv1 dv1VarN = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(f4));
                    if (z6) {
                        jC3 = hz.c(0.09f, bk.i);
                    } else {
                        jC3 = z ? hz.c(0.03f, hz.c) : hz.c(0.02f, hz.b);
                    }
                    dv1 dv1VarL2 = xp1.l(dv1VarN, jC3);
                    if (z6) {
                        ov0Var2.c0(-343232882);
                        ov0Var2.s();
                        jC4 = hz.c(f3, bk.i);
                    } else {
                        ov0Var2.c0(-343229978);
                        jC4 = hz.c(z ? 0.08f : 0.04f, ((kz) ov0Var2.j(mz.a)).A);
                        ov0Var2.s();
                    }
                    dv1 dv1VarW2 = ji2.w(dv1VarL2, 0.8f, jC4, cj2.a(f4));
                    int i12 = i11;
                    boolean zF3 = (i12 == 2048) | ov0Var2.f(ki0Var3);
                    Object objQ4 = ov0Var2.Q();
                    if (zF3) {
                        c30Var = c30Var5;
                    } else {
                        c30Var = c30Var5;
                        if (objQ4 != c30Var) {
                            z2 = false;
                        }
                        dv1 dv1VarE4 = zm3.E(bk.a(dv1VarW2, (au0) objQ4), 10.0f, 9.0f);
                        prVar = prVar6;
                        er1 er1VarC3 = ws.c(prVar, z2);
                        int iHashCode10 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ9 = ov0Var2.z();
                        dv1 dv1VarH9 = xp1.H(ov0Var2, dv1VarE4);
                        w20.b.getClass();
                        c30Var2 = c30Var;
                        x30Var = v20.b;
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        ghVar = v20.e;
                        q73.h(ov0Var2, ghVar, er1VarC3);
                        ghVar2 = v20.d;
                        q73.h(ov0Var2, ghVar2, l72VarZ9);
                        Integer numValueOf2 = Integer.valueOf(iHashCode10);
                        ghVar3 = v20.f;
                        q73.h(ov0Var2, ghVar3, numValueOf2);
                        waVar = v20.g;
                        q73.g(ov0Var2, waVar);
                        Iterator it2 = it;
                        ghVar4 = v20.c;
                        q73.h(ov0Var2, ghVar4, dv1VarH9);
                        dv1 dv1VarE5 = iw2.e(av1Var, 1.0f);
                        z3 = z6;
                        pr prVar8 = prVar7;
                        or orVar3 = orVar2;
                        go goVar3 = goVar2;
                        kk2 kk2VarA5 = jk2.a(goVar3, orVar3, ov0Var2, 48);
                        int iHashCode11 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ10 = ov0Var2.z();
                        dv1 dv1VarH10 = xp1.H(ov0Var2, dv1VarE5);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, kk2VarA5);
                        q73.h(ov0Var2, ghVar2, l72VarZ10);
                        az2.s(iHashCode11, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH10);
                        if (z3) {
                            x01VarR = ee0.B();
                        } else {
                            x01VarR = dh0.r();
                        }
                        x01 x01Var = x01VarR;
                        if (z3) {
                            ov0Var2.c0(1309320722);
                            ov0Var2.s();
                            jC5 = bk.i;
                            f2 = 0.4f;
                        } else {
                            ov0Var2.c0(1309322526);
                            f2 = 0.4f;
                            jC5 = hz.c(0.4f, ((kz) ov0Var2.j(mz.a)).q);
                            ov0Var2.s();
                        }
                        float f5 = f2;
                        float f6 = f4;
                        i11 = i12;
                        nr nrVar3 = nrVar2;
                        t01.a(x01Var, null, iw2.k(av1Var, 17.0f), jC5, ov0Var2, 432, 0);
                        h(ov0Var2, iw2.o(av1Var, 8.0f));
                        wb1 wb1Var = new wb1(1.0f, true);
                        yz yzVarA3 = wz.a(am1.g, nrVar3, ov0Var2, 0);
                        int iHashCode12 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ11 = ov0Var2.z();
                        dv1 dv1VarH11 = xp1.H(ov0Var2, wb1Var);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, yzVarA3);
                        q73.h(ov0Var2, ghVar2, l72VarZ11);
                        az2.s(iHashCode12, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH11);
                        kk2 kk2VarA6 = jk2.a(new jo(6.0f, true, new fo(0)), orVar3, ov0Var2, 54);
                        int iHashCode13 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ12 = ov0Var2.z();
                        dv1 dv1VarH12 = xp1.H(ov0Var2, av1Var);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, kk2VarA6);
                        q73.h(ov0Var2, ghVar2, l72VarZ12);
                        az2.s(iHashCode13, ov0Var2, ghVar3, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar4, dv1VarH12);
                        String str2 = ki0Var3.b;
                        i2 = ki0Var3.i;
                        i3 = ki0Var3.h;
                        i4 = ki0Var3.o;
                        Locale locale = Locale.ROOT;
                        String upperCase2 = str2.toUpperCase(locale);
                        upperCase2.getClass();
                        String str3 = upperCase2 + " • MCC:" + ki0Var3.c + " MNC:" + ki0Var3.d;
                        long jB = v63.b(13.5d);
                        jr0Var2 = jr0.j;
                        hh0 hh0Var4 = mz.a;
                        ov0 ov0Var3 = ov0Var2;
                        s83.b(str3, null, ((kz) ov0Var2.j(hh0Var4)).q, jB, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                        ov0Var = ov0Var3;
                        if (z3) {
                            ov0Var.c0(-1372270124);
                            dv1 dv1VarN2 = xp1.n(av1Var, cj2.a(4.0f));
                            long j3 = bk.g;
                            dv1 dv1VarE6 = zm3.E(xp1.l(dv1VarN2, hz.c(0.15f, j3)), 5.0f, 1.0f);
                            er1 er1VarC4 = ws.c(prVar, false);
                            int iHashCode14 = Long.hashCode(ks.U(ov0Var));
                            l72 l72VarZ13 = ov0Var.z();
                            dv1 dv1VarH13 = xp1.H(ov0Var, dv1VarE6);
                            ov0Var.g0();
                            if (ov0Var.D()) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar, er1VarC4);
                            q73.h(ov0Var, ghVar2, l72VarZ13);
                            az2.s(iHashCode14, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH13);
                            jr0Var2 = jr0Var2;
                            i5 = -1380938654;
                            prVar2 = prVar;
                            s83.b(ke0.N(2131624388, ov0Var), null, j3, v63.b(9.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
                            ov0Var = ov0Var;
                            ov0Var.r();
                        } else {
                            prVar2 = prVar;
                            i5 = -1380938654;
                            ov0Var.c0(-1380938654);
                        }
                        ov0Var.s();
                        ki0Var = ki0Var3;
                        if (ki0Var.p) {
                            ov0Var.c0(-1371306768);
                            dv1 dv1VarN3 = xp1.n(av1Var, cj2.a(4.0f));
                            long j4 = bk.i;
                            dv1 dv1VarE7 = zm3.E(xp1.l(dv1VarN3, hz.c(0.15f, j4)), 5.0f, 1.0f);
                            pr prVar9 = prVar2;
                            er1 er1VarC5 = ws.c(prVar9, false);
                            int iHashCode15 = Long.hashCode(ks.U(ov0Var));
                            l72 l72VarZ14 = ov0Var.z();
                            dv1 dv1VarH14 = xp1.H(ov0Var, dv1VarE7);
                            ov0Var.g0();
                            if (ov0Var.D()) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar, er1VarC5);
                            q73.h(ov0Var, ghVar2, l72VarZ14);
                            az2.s(iHashCode15, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH14);
                            ov0 ov0Var4 = ov0Var;
                            prVar3 = prVar9;
                            s83.b(ke0.N(2131624851, ov0Var), null, j4, v63.b(9.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597824, 0, 262058);
                            ov0Var = ov0Var4;
                            ov0Var.r();
                            ov0Var.s();
                            ki0Var = ki0Var;
                        } else {
                            prVar3 = prVar2;
                            ov0Var.c0(i5);
                            ov0Var.s();
                        }
                        ov0Var.r();
                        h(ov0Var, iw2.g(av1Var, 3.0f));
                        upperCase = ki0Var.b.toUpperCase(locale);
                        upperCase.getClass();
                        iHashCode = upperCase.hashCode();
                        if (iHashCode != 2500) {
                            ghVar5 = ghVar4;
                            ghVar6 = ghVar3;
                            if (iHashCode != 70881) {
                                i6 = i4;
                                if (!upperCase.equals("GSM")) {
                                    StringBuilder sbS = p91.s("LAC: ", "  •  CID: ", i3, i2, "  •  ");
                                    sbS.append(i6);
                                    sbS.append(" dBm");
                                    string = sbS.toString();
                                }
                            } else if (iHashCode == 75709) {
                                i6 = i4;
                                if (upperCase.equals("LTE")) {
                                    int i13 = ki0Var.e;
                                    int i14 = ki0Var.f;
                                    int i15 = ki0Var.g;
                                    StringBuilder sbS2 = p91.s("TAC: ", "  •  CI: ", i13, i14, "  •  PCI: ");
                                    sbS2.append(i15);
                                    sbS2.append("  •  ");
                                    sbS2.append(i6);
                                    sbS2.append(" dBm");
                                    string = sbS2.toString();
                                }
                            } else if (iHashCode == 82410124 && upperCase.equals("WCDMA")) {
                                int i16 = ki0Var.j;
                                StringBuilder sbS3 = p91.s("LAC: ", "  •  CID: ", i3, i2, "  •  PSC: ");
                                sbS3.append(i16);
                                sbS3.append("  •  ");
                                sbS3.append(i4);
                                sbS3.append(" dBm");
                                string = sbS3.toString();
                            } else {
                                i6 = i4;
                            }
                            ov0 ov0Var5 = ov0Var;
                            ki0Var2 = ki0Var;
                            s83.b(string, null, hz.c(0.55f, ((kz) ov0Var.j(hh0Var4)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262122);
                            ov0Var2 = ov0Var5;
                            ov0Var2.r();
                            dv1 dv1VarK = iw2.k(av1Var, 28.0f);
                            bj2 bj2Var = cj2.a;
                            dv1 dv1VarL3 = xp1.l(xp1.n(dv1VarK, bj2Var), hz.c(0.06f, ((kz) ov0Var2.j(hh0Var4)).q));
                            zF = ov0Var2.f(ki0Var2);
                            objQ = ov0Var2.Q();
                            if (zF) {
                                c30Var3 = c30Var2;
                            } else {
                                c30Var3 = c30Var2;
                                if (objQ == c30Var3) {
                                    i7 = 1;
                                }
                                dv1 dv1VarA = bk.a(dv1VarL3, (au0) objQ);
                                er1 er1VarC6 = ws.c(prVar8, false);
                                int iHashCode16 = Long.hashCode(ks.U(ov0Var2));
                                l72 l72VarZ15 = ov0Var2.z();
                                dv1 dv1VarH15 = xp1.H(ov0Var2, dv1VarA);
                                ov0Var2.g0();
                                if (ov0Var2.D()) {
                                    ov0Var2.k(x30Var);
                                } else {
                                    ov0Var2.p0();
                                }
                                q73.h(ov0Var2, ghVar, er1VarC6);
                                q73.h(ov0Var2, ghVar2, l72VarZ15);
                                gh ghVar11 = ghVar6;
                                az2.s(iHashCode16, ov0Var2, ghVar11, ov0Var2, waVar);
                                q73.h(ov0Var2, ghVar5, dv1VarH15);
                                c30 c30Var6 = c30Var3;
                                gh ghVar12 = ghVar5;
                                t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.i, ov0Var2, 3504, 0);
                                ov0Var2.r();
                                h(ov0Var2, iw2.o(av1Var, 6.0f));
                                dv1 dv1VarL4 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var), hz.c(0.08f, xp1.d(4293212469L)));
                                zF2 = ov0Var2.f(ki0Var2);
                                objQ2 = ov0Var2.Q();
                                if (!zF2 || objQ2 == c30Var6) {
                                    i8 = 2;
                                    objQ2 = new au0() { // from class: tn1
                                        @Override // defpackage.au0
                                        public final Object invoke() {
                                            int i17 = i8;
                                            mf3 mf3Var = mf3.a;
                                            ki0 ki0Var4 = ki0Var2;
                                            lu0 lu0Var4 = lu0Var3;
                                            switch (i17) {
                                                case 0:
                                                    lu0Var4.invoke(ki0Var4.a);
                                                    break;
                                                case 1:
                                                    lu0Var4.invoke(ki0Var4);
                                                    break;
                                                default:
                                                    lu0Var4.invoke(ki0Var4.a);
                                                    break;
                                            }
                                            return mf3Var;
                                        }
                                    };
                                    ov0Var2.m0(objQ2);
                                } else {
                                    i8 = 2;
                                }
                                dv1 dv1VarA2 = bk.a(dv1VarL4, (au0) objQ2);
                                er1 er1VarC7 = ws.c(prVar8, false);
                                int iHashCode17 = Long.hashCode(ks.U(ov0Var2));
                                l72 l72VarZ16 = ov0Var2.z();
                                dv1 dv1VarH16 = xp1.H(ov0Var2, dv1VarA2);
                                ov0Var2.g0();
                                if (ov0Var2.D()) {
                                    ov0Var2.k(x30Var);
                                } else {
                                    ov0Var2.p0();
                                }
                                q73.h(ov0Var2, ghVar, er1VarC7);
                                q73.h(ov0Var2, ghVar2, l72VarZ16);
                                az2.s(iHashCode17, ov0Var2, ghVar11, ov0Var2, waVar);
                                q73.h(ov0Var2, ghVar12, dv1VarH16);
                                t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                                ov0Var2.r();
                                ov0Var2.r();
                                ov0Var2.r();
                                prVar7 = prVar8;
                                c30Var5 = c30Var6;
                                it = it2;
                                nrVar2 = nrVar3;
                                f4 = f6;
                                f3 = f5;
                                goVar2 = goVar3;
                                prVar6 = prVar3;
                                orVar2 = orVar3;
                            }
                            i7 = 1;
                            objQ = new au0() { // from class: tn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i17 = i7;
                                    mf3 mf3Var = mf3.a;
                                    ki0 ki0Var4 = ki0Var2;
                                    lu0 lu0Var4 = lu0Var2;
                                    switch (i17) {
                                        case 0:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ki0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ);
                            dv1 dv1VarA3 = bk.a(dv1VarL3, (au0) objQ);
                            er1 er1VarC8 = ws.c(prVar8, false);
                            int iHashCode18 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ17 = ov0Var2.z();
                            dv1 dv1VarH17 = xp1.H(ov0Var2, dv1VarA3);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC8);
                            q73.h(ov0Var2, ghVar2, l72VarZ17);
                            gh ghVar13 = ghVar6;
                            az2.s(iHashCode18, ov0Var2, ghVar13, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar5, dv1VarH17);
                            c30 c30Var7 = c30Var3;
                            gh ghVar14 = ghVar5;
                            t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.i, ov0Var2, 3504, 0);
                            ov0Var2.r();
                            h(ov0Var2, iw2.o(av1Var, 6.0f));
                            dv1 dv1VarL5 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var), hz.c(0.08f, xp1.d(4293212469L)));
                            zF2 = ov0Var2.f(ki0Var2);
                            objQ2 = ov0Var2.Q();
                            if (zF2) {
                                i8 = 2;
                                objQ2 = new au0() { // from class: tn1
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        int i17 = i8;
                                        mf3 mf3Var = mf3.a;
                                        ki0 ki0Var4 = ki0Var2;
                                        lu0 lu0Var4 = lu0Var3;
                                        switch (i17) {
                                            case 0:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                            case 1:
                                                lu0Var4.invoke(ki0Var4);
                                                break;
                                            default:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var2.m0(objQ2);
                            } else {
                                i8 = 2;
                                objQ2 = new au0() { // from class: tn1
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        int i17 = i8;
                                        mf3 mf3Var = mf3.a;
                                        ki0 ki0Var4 = ki0Var2;
                                        lu0 lu0Var4 = lu0Var3;
                                        switch (i17) {
                                            case 0:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                            case 1:
                                                lu0Var4.invoke(ki0Var4);
                                                break;
                                            default:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var2.m0(objQ2);
                            }
                            dv1 dv1VarA4 = bk.a(dv1VarL5, (au0) objQ2);
                            er1 er1VarC9 = ws.c(prVar8, false);
                            int iHashCode19 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ18 = ov0Var2.z();
                            dv1 dv1VarH18 = xp1.H(ov0Var2, dv1VarA4);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC9);
                            q73.h(ov0Var2, ghVar2, l72VarZ18);
                            az2.s(iHashCode19, ov0Var2, ghVar13, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar14, dv1VarH18);
                            t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                            ov0Var2.r();
                            ov0Var2.r();
                            ov0Var2.r();
                            prVar7 = prVar8;
                            c30Var5 = c30Var7;
                            it = it2;
                            nrVar2 = nrVar3;
                            f4 = f6;
                            f3 = f5;
                            goVar2 = goVar3;
                            prVar6 = prVar3;
                            orVar2 = orVar3;
                        } else {
                            ghVar5 = ghVar4;
                            ghVar6 = ghVar3;
                            i6 = i4;
                            if (!upperCase.equals("NR")) {
                                string = "TAC: " + ki0Var.e + "  •  NCI: " + ki0Var.k + "  •  PCI: " + ki0Var.g + "  •  " + i6 + " dBm";
                            }
                            ov0 ov0Var6 = ov0Var;
                            ki0Var2 = ki0Var;
                            s83.b(string, null, hz.c(0.55f, ((kz) ov0Var.j(hh0Var4)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 24576, 0, 262122);
                            ov0Var2 = ov0Var6;
                            ov0Var2.r();
                            dv1 dv1VarK2 = iw2.k(av1Var, 28.0f);
                            bj2 bj2Var2 = cj2.a;
                            dv1 dv1VarL6 = xp1.l(xp1.n(dv1VarK2, bj2Var2), hz.c(0.06f, ((kz) ov0Var2.j(hh0Var4)).q));
                            zF = ov0Var2.f(ki0Var2);
                            objQ = ov0Var2.Q();
                            if (zF) {
                                c30Var3 = c30Var2;
                                if (objQ == c30Var3) {
                                    i7 = 1;
                                }
                                dv1 dv1VarA5 = bk.a(dv1VarL6, (au0) objQ);
                                er1 er1VarC10 = ws.c(prVar8, false);
                                int iHashCode110 = Long.hashCode(ks.U(ov0Var2));
                                l72 l72VarZ19 = ov0Var2.z();
                                dv1 dv1VarH19 = xp1.H(ov0Var2, dv1VarA5);
                                ov0Var2.g0();
                                if (ov0Var2.D()) {
                                    ov0Var2.k(x30Var);
                                } else {
                                    ov0Var2.p0();
                                }
                                q73.h(ov0Var2, ghVar, er1VarC10);
                                q73.h(ov0Var2, ghVar2, l72VarZ19);
                                gh ghVar15 = ghVar6;
                                az2.s(iHashCode110, ov0Var2, ghVar15, ov0Var2, waVar);
                                q73.h(ov0Var2, ghVar5, dv1VarH19);
                                c30 c30Var8 = c30Var3;
                                gh ghVar16 = ghVar5;
                                t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.i, ov0Var2, 3504, 0);
                                ov0Var2.r();
                                h(ov0Var2, iw2.o(av1Var, 6.0f));
                                dv1 dv1VarL7 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var2), hz.c(0.08f, xp1.d(4293212469L)));
                                zF2 = ov0Var2.f(ki0Var2);
                                objQ2 = ov0Var2.Q();
                                if (zF2) {
                                    i8 = 2;
                                    objQ2 = new au0() { // from class: tn1
                                        @Override // defpackage.au0
                                        public final Object invoke() {
                                            int i17 = i8;
                                            mf3 mf3Var = mf3.a;
                                            ki0 ki0Var4 = ki0Var2;
                                            lu0 lu0Var4 = lu0Var3;
                                            switch (i17) {
                                                case 0:
                                                    lu0Var4.invoke(ki0Var4.a);
                                                    break;
                                                case 1:
                                                    lu0Var4.invoke(ki0Var4);
                                                    break;
                                                default:
                                                    lu0Var4.invoke(ki0Var4.a);
                                                    break;
                                            }
                                            return mf3Var;
                                        }
                                    };
                                    ov0Var2.m0(objQ2);
                                } else {
                                    i8 = 2;
                                    objQ2 = new au0() { // from class: tn1
                                        @Override // defpackage.au0
                                        public final Object invoke() {
                                            int i17 = i8;
                                            mf3 mf3Var = mf3.a;
                                            ki0 ki0Var4 = ki0Var2;
                                            lu0 lu0Var4 = lu0Var3;
                                            switch (i17) {
                                                case 0:
                                                    lu0Var4.invoke(ki0Var4.a);
                                                    break;
                                                case 1:
                                                    lu0Var4.invoke(ki0Var4);
                                                    break;
                                                default:
                                                    lu0Var4.invoke(ki0Var4.a);
                                                    break;
                                            }
                                            return mf3Var;
                                        }
                                    };
                                    ov0Var2.m0(objQ2);
                                }
                                dv1 dv1VarA6 = bk.a(dv1VarL7, (au0) objQ2);
                                er1 er1VarC11 = ws.c(prVar8, false);
                                int iHashCode111 = Long.hashCode(ks.U(ov0Var2));
                                l72 l72VarZ110 = ov0Var2.z();
                                dv1 dv1VarH110 = xp1.H(ov0Var2, dv1VarA6);
                                ov0Var2.g0();
                                if (ov0Var2.D()) {
                                    ov0Var2.k(x30Var);
                                } else {
                                    ov0Var2.p0();
                                }
                                q73.h(ov0Var2, ghVar, er1VarC11);
                                q73.h(ov0Var2, ghVar2, l72VarZ110);
                                az2.s(iHashCode111, ov0Var2, ghVar15, ov0Var2, waVar);
                                q73.h(ov0Var2, ghVar16, dv1VarH110);
                                t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                                ov0Var2.r();
                                ov0Var2.r();
                                ov0Var2.r();
                                prVar7 = prVar8;
                                c30Var5 = c30Var8;
                                it = it2;
                                nrVar2 = nrVar3;
                                f4 = f6;
                                f3 = f5;
                                goVar2 = goVar3;
                                prVar6 = prVar3;
                                orVar2 = orVar3;
                            } else {
                                c30Var3 = c30Var2;
                            }
                            i7 = 1;
                            objQ = new au0() { // from class: tn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i17 = i7;
                                    mf3 mf3Var = mf3.a;
                                    ki0 ki0Var4 = ki0Var2;
                                    lu0 lu0Var4 = lu0Var2;
                                    switch (i17) {
                                        case 0:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ki0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ);
                            dv1 dv1VarA7 = bk.a(dv1VarL6, (au0) objQ);
                            er1 er1VarC12 = ws.c(prVar8, false);
                            int iHashCode112 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ111 = ov0Var2.z();
                            dv1 dv1VarH111 = xp1.H(ov0Var2, dv1VarA7);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC12);
                            q73.h(ov0Var2, ghVar2, l72VarZ111);
                            gh ghVar17 = ghVar6;
                            az2.s(iHashCode112, ov0Var2, ghVar17, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar5, dv1VarH111);
                            c30 c30Var9 = c30Var3;
                            gh ghVar18 = ghVar5;
                            t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.i, ov0Var2, 3504, 0);
                            ov0Var2.r();
                            h(ov0Var2, iw2.o(av1Var, 6.0f));
                            dv1 dv1VarL8 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var2), hz.c(0.08f, xp1.d(4293212469L)));
                            zF2 = ov0Var2.f(ki0Var2);
                            objQ2 = ov0Var2.Q();
                            if (zF2) {
                                i8 = 2;
                                objQ2 = new au0() { // from class: tn1
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        int i17 = i8;
                                        mf3 mf3Var = mf3.a;
                                        ki0 ki0Var4 = ki0Var2;
                                        lu0 lu0Var4 = lu0Var3;
                                        switch (i17) {
                                            case 0:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                            case 1:
                                                lu0Var4.invoke(ki0Var4);
                                                break;
                                            default:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var2.m0(objQ2);
                            } else {
                                i8 = 2;
                                objQ2 = new au0() { // from class: tn1
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        int i17 = i8;
                                        mf3 mf3Var = mf3.a;
                                        ki0 ki0Var4 = ki0Var2;
                                        lu0 lu0Var4 = lu0Var3;
                                        switch (i17) {
                                            case 0:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                            case 1:
                                                lu0Var4.invoke(ki0Var4);
                                                break;
                                            default:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var2.m0(objQ2);
                            }
                            dv1 dv1VarA8 = bk.a(dv1VarL8, (au0) objQ2);
                            er1 er1VarC13 = ws.c(prVar8, false);
                            int iHashCode113 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ112 = ov0Var2.z();
                            dv1 dv1VarH112 = xp1.H(ov0Var2, dv1VarA8);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC13);
                            q73.h(ov0Var2, ghVar2, l72VarZ112);
                            az2.s(iHashCode113, ov0Var2, ghVar17, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar18, dv1VarH112);
                            t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                            ov0Var2.r();
                            ov0Var2.r();
                            ov0Var2.r();
                            prVar7 = prVar8;
                            c30Var5 = c30Var9;
                            it = it2;
                            nrVar2 = nrVar3;
                            f4 = f6;
                            f3 = f5;
                            goVar2 = goVar3;
                            prVar6 = prVar3;
                            orVar2 = orVar3;
                        }
                        string = "Key: " + ki0Var.a + "  •  " + i6 + " dBm";
                        ov0 ov0Var7 = ov0Var;
                        ki0Var2 = ki0Var;
                        s83.b(string, null, hz.c(0.55f, ((kz) ov0Var.j(hh0Var4)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 24576, 0, 262122);
                        ov0Var2 = ov0Var7;
                        ov0Var2.r();
                        dv1 dv1VarK3 = iw2.k(av1Var, 28.0f);
                        bj2 bj2Var3 = cj2.a;
                        dv1 dv1VarL9 = xp1.l(xp1.n(dv1VarK3, bj2Var3), hz.c(0.06f, ((kz) ov0Var2.j(hh0Var4)).q));
                        zF = ov0Var2.f(ki0Var2);
                        objQ = ov0Var2.Q();
                        if (zF) {
                            c30Var3 = c30Var2;
                            if (objQ == c30Var3) {
                                i7 = 1;
                            }
                            dv1 dv1VarA9 = bk.a(dv1VarL9, (au0) objQ);
                            er1 er1VarC14 = ws.c(prVar8, false);
                            int iHashCode114 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ113 = ov0Var2.z();
                            dv1 dv1VarH113 = xp1.H(ov0Var2, dv1VarA9);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC14);
                            q73.h(ov0Var2, ghVar2, l72VarZ113);
                            gh ghVar19 = ghVar6;
                            az2.s(iHashCode114, ov0Var2, ghVar19, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar5, dv1VarH113);
                            c30 c30Var10 = c30Var3;
                            gh ghVar110 = ghVar5;
                            t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.i, ov0Var2, 3504, 0);
                            ov0Var2.r();
                            h(ov0Var2, iw2.o(av1Var, 6.0f));
                            dv1 dv1VarL10 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var3), hz.c(0.08f, xp1.d(4293212469L)));
                            zF2 = ov0Var2.f(ki0Var2);
                            objQ2 = ov0Var2.Q();
                            if (zF2) {
                                i8 = 2;
                                objQ2 = new au0() { // from class: tn1
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        int i17 = i8;
                                        mf3 mf3Var = mf3.a;
                                        ki0 ki0Var4 = ki0Var2;
                                        lu0 lu0Var4 = lu0Var3;
                                        switch (i17) {
                                            case 0:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                            case 1:
                                                lu0Var4.invoke(ki0Var4);
                                                break;
                                            default:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var2.m0(objQ2);
                            } else {
                                i8 = 2;
                                objQ2 = new au0() { // from class: tn1
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        int i17 = i8;
                                        mf3 mf3Var = mf3.a;
                                        ki0 ki0Var4 = ki0Var2;
                                        lu0 lu0Var4 = lu0Var3;
                                        switch (i17) {
                                            case 0:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                            case 1:
                                                lu0Var4.invoke(ki0Var4);
                                                break;
                                            default:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var2.m0(objQ2);
                            }
                            dv1 dv1VarA10 = bk.a(dv1VarL10, (au0) objQ2);
                            er1 er1VarC15 = ws.c(prVar8, false);
                            int iHashCode115 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ114 = ov0Var2.z();
                            dv1 dv1VarH114 = xp1.H(ov0Var2, dv1VarA10);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC15);
                            q73.h(ov0Var2, ghVar2, l72VarZ114);
                            az2.s(iHashCode115, ov0Var2, ghVar19, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar110, dv1VarH114);
                            t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                            ov0Var2.r();
                            ov0Var2.r();
                            ov0Var2.r();
                            prVar7 = prVar8;
                            c30Var5 = c30Var10;
                            it = it2;
                            nrVar2 = nrVar3;
                            f4 = f6;
                            f3 = f5;
                            goVar2 = goVar3;
                            prVar6 = prVar3;
                            orVar2 = orVar3;
                        } else {
                            c30Var3 = c30Var2;
                        }
                        i7 = 1;
                        objQ = new au0() { // from class: tn1
                            @Override // defpackage.au0
                            public final Object invoke() {
                                int i17 = i7;
                                mf3 mf3Var = mf3.a;
                                ki0 ki0Var4 = ki0Var2;
                                lu0 lu0Var4 = lu0Var2;
                                switch (i17) {
                                    case 0:
                                        lu0Var4.invoke(ki0Var4.a);
                                        break;
                                    case 1:
                                        lu0Var4.invoke(ki0Var4);
                                        break;
                                    default:
                                        lu0Var4.invoke(ki0Var4.a);
                                        break;
                                }
                                return mf3Var;
                            }
                        };
                        ov0Var2.m0(objQ);
                        dv1 dv1VarA11 = bk.a(dv1VarL9, (au0) objQ);
                        er1 er1VarC16 = ws.c(prVar8, false);
                        int iHashCode116 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ115 = ov0Var2.z();
                        dv1 dv1VarH115 = xp1.H(ov0Var2, dv1VarA11);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC16);
                        q73.h(ov0Var2, ghVar2, l72VarZ115);
                        gh ghVar111 = ghVar6;
                        az2.s(iHashCode116, ov0Var2, ghVar111, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar5, dv1VarH115);
                        c30 c30Var11 = c30Var3;
                        gh ghVar112 = ghVar5;
                        t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.i, ov0Var2, 3504, 0);
                        ov0Var2.r();
                        h(ov0Var2, iw2.o(av1Var, 6.0f));
                        dv1 dv1VarL11 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var3), hz.c(0.08f, xp1.d(4293212469L)));
                        zF2 = ov0Var2.f(ki0Var2);
                        objQ2 = ov0Var2.Q();
                        if (zF2) {
                            i8 = 2;
                            objQ2 = new au0() { // from class: tn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i17 = i8;
                                    mf3 mf3Var = mf3.a;
                                    ki0 ki0Var4 = ki0Var2;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i17) {
                                        case 0:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ki0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        } else {
                            i8 = 2;
                            objQ2 = new au0() { // from class: tn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i17 = i8;
                                    mf3 mf3Var = mf3.a;
                                    ki0 ki0Var4 = ki0Var2;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i17) {
                                        case 0:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ki0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        }
                        dv1 dv1VarA12 = bk.a(dv1VarL11, (au0) objQ2);
                        er1 er1VarC17 = ws.c(prVar8, false);
                        int iHashCode117 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ116 = ov0Var2.z();
                        dv1 dv1VarH116 = xp1.H(ov0Var2, dv1VarA12);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC17);
                        q73.h(ov0Var2, ghVar2, l72VarZ116);
                        az2.s(iHashCode117, ov0Var2, ghVar111, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar112, dv1VarH116);
                        t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                        ov0Var2.r();
                        ov0Var2.r();
                        ov0Var2.r();
                        prVar7 = prVar8;
                        c30Var5 = c30Var11;
                        it = it2;
                        nrVar2 = nrVar3;
                        f4 = f6;
                        f3 = f5;
                        goVar2 = goVar3;
                        prVar6 = prVar3;
                        orVar2 = orVar3;
                    }
                    z2 = false;
                    final Object[] objArr = 0 == true ? 1 : 0;
                    objQ4 = new au0() { // from class: tn1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            int i17 = objArr;
                            mf3 mf3Var = mf3.a;
                            ki0 ki0Var4 = ki0Var3;
                            lu0 lu0Var4 = lu0Var;
                            switch (i17) {
                                case 0:
                                    lu0Var4.invoke(ki0Var4.a);
                                    break;
                                case 1:
                                    lu0Var4.invoke(ki0Var4);
                                    break;
                                default:
                                    lu0Var4.invoke(ki0Var4.a);
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                    ov0Var2.m0(objQ4);
                    dv1 dv1VarE8 = zm3.E(bk.a(dv1VarW2, (au0) objQ4), 10.0f, 9.0f);
                    prVar = prVar6;
                    er1 er1VarC18 = ws.c(prVar, z2);
                    int iHashCode118 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ20 = ov0Var2.z();
                    dv1 dv1VarH20 = xp1.H(ov0Var2, dv1VarE8);
                    w20.b.getClass();
                    c30Var2 = c30Var;
                    x30Var = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    ghVar = v20.e;
                    q73.h(ov0Var2, ghVar, er1VarC18);
                    ghVar2 = v20.d;
                    q73.h(ov0Var2, ghVar2, l72VarZ20);
                    Integer numValueOf3 = Integer.valueOf(iHashCode118);
                    ghVar3 = v20.f;
                    q73.h(ov0Var2, ghVar3, numValueOf3);
                    waVar = v20.g;
                    q73.g(ov0Var2, waVar);
                    Iterator it3 = it;
                    ghVar4 = v20.c;
                    q73.h(ov0Var2, ghVar4, dv1VarH20);
                    dv1 dv1VarE9 = iw2.e(av1Var, 1.0f);
                    z3 = z6;
                    pr prVar10 = prVar7;
                    or orVar4 = orVar2;
                    go goVar4 = goVar2;
                    kk2 kk2VarA7 = jk2.a(goVar4, orVar4, ov0Var2, 48);
                    int iHashCode119 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ117 = ov0Var2.z();
                    dv1 dv1VarH117 = xp1.H(ov0Var2, dv1VarE9);
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, kk2VarA7);
                    q73.h(ov0Var2, ghVar2, l72VarZ117);
                    az2.s(iHashCode119, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH117);
                    if (z3) {
                        x01VarR = ee0.B();
                    } else {
                        x01VarR = dh0.r();
                    }
                    x01 x01Var2 = x01VarR;
                    if (z3) {
                        ov0Var2.c0(1309320722);
                        ov0Var2.s();
                        jC5 = bk.i;
                        f2 = 0.4f;
                    } else {
                        ov0Var2.c0(1309322526);
                        f2 = 0.4f;
                        jC5 = hz.c(0.4f, ((kz) ov0Var2.j(mz.a)).q);
                        ov0Var2.s();
                    }
                    float f7 = f2;
                    float f8 = f4;
                    i11 = i12;
                    nr nrVar4 = nrVar2;
                    t01.a(x01Var2, null, iw2.k(av1Var, 17.0f), jC5, ov0Var2, 432, 0);
                    h(ov0Var2, iw2.o(av1Var, 8.0f));
                    wb1 wb1Var2 = new wb1(1.0f, true);
                    yz yzVarA4 = wz.a(am1.g, nrVar4, ov0Var2, 0);
                    int iHashCode120 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ118 = ov0Var2.z();
                    dv1 dv1VarH118 = xp1.H(ov0Var2, wb1Var2);
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, yzVarA4);
                    q73.h(ov0Var2, ghVar2, l72VarZ118);
                    az2.s(iHashCode120, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH118);
                    kk2 kk2VarA8 = jk2.a(new jo(6.0f, true, new fo(0)), orVar4, ov0Var2, 54);
                    int iHashCode121 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ119 = ov0Var2.z();
                    dv1 dv1VarH119 = xp1.H(ov0Var2, av1Var);
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, kk2VarA8);
                    q73.h(ov0Var2, ghVar2, l72VarZ119);
                    az2.s(iHashCode121, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH119);
                    String str4 = ki0Var3.b;
                    i2 = ki0Var3.i;
                    i3 = ki0Var3.h;
                    i4 = ki0Var3.o;
                    Locale locale2 = Locale.ROOT;
                    String upperCase3 = str4.toUpperCase(locale2);
                    upperCase3.getClass();
                    String str5 = upperCase3 + " • MCC:" + ki0Var3.c + " MNC:" + ki0Var3.d;
                    long jB2 = v63.b(13.5d);
                    jr0Var2 = jr0.j;
                    hh0 hh0Var5 = mz.a;
                    ov0 ov0Var8 = ov0Var2;
                    s83.b(str5, null, ((kz) ov0Var2.j(hh0Var5)).q, jB2, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var8, 1597440, 0, 262058);
                    ov0Var = ov0Var8;
                    if (z3) {
                        ov0Var.c0(-1372270124);
                        dv1 dv1VarN4 = xp1.n(av1Var, cj2.a(4.0f));
                        long j5 = bk.g;
                        dv1 dv1VarE10 = zm3.E(xp1.l(dv1VarN4, hz.c(0.15f, j5)), 5.0f, 1.0f);
                        er1 er1VarC19 = ws.c(prVar, false);
                        int iHashCode122 = Long.hashCode(ks.U(ov0Var));
                        l72 l72VarZ120 = ov0Var.z();
                        dv1 dv1VarH120 = xp1.H(ov0Var, dv1VarE10);
                        ov0Var.g0();
                        if (ov0Var.D()) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar, er1VarC19);
                        q73.h(ov0Var, ghVar2, l72VarZ120);
                        az2.s(iHashCode122, ov0Var, ghVar3, ov0Var, waVar);
                        q73.h(ov0Var, ghVar4, dv1VarH120);
                        jr0Var2 = jr0Var2;
                        i5 = -1380938654;
                        prVar2 = prVar;
                        s83.b(ke0.N(2131624388, ov0Var), null, j5, v63.b(9.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
                        ov0Var = ov0Var;
                        ov0Var.r();
                    } else {
                        prVar2 = prVar;
                        i5 = -1380938654;
                        ov0Var.c0(-1380938654);
                    }
                    ov0Var.s();
                    ki0Var = ki0Var3;
                    if (ki0Var.p) {
                        ov0Var.c0(-1371306768);
                        dv1 dv1VarN5 = xp1.n(av1Var, cj2.a(4.0f));
                        long j6 = bk.i;
                        dv1 dv1VarE11 = zm3.E(xp1.l(dv1VarN5, hz.c(0.15f, j6)), 5.0f, 1.0f);
                        pr prVar11 = prVar2;
                        er1 er1VarC20 = ws.c(prVar11, false);
                        int iHashCode123 = Long.hashCode(ks.U(ov0Var));
                        l72 l72VarZ121 = ov0Var.z();
                        dv1 dv1VarH121 = xp1.H(ov0Var, dv1VarE11);
                        ov0Var.g0();
                        if (ov0Var.D()) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar, er1VarC20);
                        q73.h(ov0Var, ghVar2, l72VarZ121);
                        az2.s(iHashCode123, ov0Var, ghVar3, ov0Var, waVar);
                        q73.h(ov0Var, ghVar4, dv1VarH121);
                        ov0 ov0Var9 = ov0Var;
                        prVar3 = prVar11;
                        s83.b(ke0.N(2131624851, ov0Var), null, j6, v63.b(9.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 1597824, 0, 262058);
                        ov0Var = ov0Var9;
                        ov0Var.r();
                        ov0Var.s();
                        ki0Var = ki0Var;
                    } else {
                        prVar3 = prVar2;
                        ov0Var.c0(i5);
                        ov0Var.s();
                    }
                    ov0Var.r();
                    h(ov0Var, iw2.g(av1Var, 3.0f));
                    upperCase = ki0Var.b.toUpperCase(locale2);
                    upperCase.getClass();
                    iHashCode = upperCase.hashCode();
                    if (iHashCode != 2500) {
                        ghVar5 = ghVar4;
                        ghVar6 = ghVar3;
                        if (iHashCode != 70881) {
                            i6 = i4;
                            if (!upperCase.equals("GSM")) {
                                StringBuilder sbS4 = p91.s("LAC: ", "  •  CID: ", i3, i2, "  •  ");
                                sbS4.append(i6);
                                sbS4.append(" dBm");
                                string = sbS4.toString();
                            }
                        } else if (iHashCode == 75709) {
                            if (iHashCode == 82410124) {
                                int i17 = ki0Var.j;
                                StringBuilder sbS5 = p91.s("LAC: ", "  •  CID: ", i3, i2, "  •  PSC: ");
                                sbS5.append(i17);
                                sbS5.append("  •  ");
                                sbS5.append(i4);
                                sbS5.append(" dBm");
                                string = sbS5.toString();
                            }
                            i6 = i4;
                        } else {
                            i6 = i4;
                            if (upperCase.equals("LTE")) {
                                int i18 = ki0Var.e;
                                int i19 = ki0Var.f;
                                int i110 = ki0Var.g;
                                StringBuilder sbS6 = p91.s("TAC: ", "  •  CI: ", i18, i19, "  •  PCI: ");
                                sbS6.append(i110);
                                sbS6.append("  •  ");
                                sbS6.append(i6);
                                sbS6.append(" dBm");
                                string = sbS6.toString();
                            }
                        }
                        ov0 ov0Var10 = ov0Var;
                        ki0Var2 = ki0Var;
                        s83.b(string, null, hz.c(0.55f, ((kz) ov0Var.j(hh0Var5)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var10, 24576, 0, 262122);
                        ov0Var2 = ov0Var10;
                        ov0Var2.r();
                        dv1 dv1VarK4 = iw2.k(av1Var, 28.0f);
                        bj2 bj2Var4 = cj2.a;
                        dv1 dv1VarL12 = xp1.l(xp1.n(dv1VarK4, bj2Var4), hz.c(0.06f, ((kz) ov0Var2.j(hh0Var5)).q));
                        zF = ov0Var2.f(ki0Var2);
                        objQ = ov0Var2.Q();
                        if (zF) {
                            c30Var3 = c30Var2;
                            if (objQ == c30Var3) {
                                i7 = 1;
                            }
                            dv1 dv1VarA13 = bk.a(dv1VarL12, (au0) objQ);
                            er1 er1VarC110 = ws.c(prVar10, false);
                            int iHashCode1110 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ1110 = ov0Var2.z();
                            dv1 dv1VarH1110 = xp1.H(ov0Var2, dv1VarA13);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC110);
                            q73.h(ov0Var2, ghVar2, l72VarZ1110);
                            gh ghVar113 = ghVar6;
                            az2.s(iHashCode1110, ov0Var2, ghVar113, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar5, dv1VarH1110);
                            c30 c30Var12 = c30Var3;
                            gh ghVar114 = ghVar5;
                            t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.i, ov0Var2, 3504, 0);
                            ov0Var2.r();
                            h(ov0Var2, iw2.o(av1Var, 6.0f));
                            dv1 dv1VarL13 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var4), hz.c(0.08f, xp1.d(4293212469L)));
                            zF2 = ov0Var2.f(ki0Var2);
                            objQ2 = ov0Var2.Q();
                            if (zF2) {
                                i8 = 2;
                                objQ2 = new au0() { // from class: tn1
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        int i111 = i8;
                                        mf3 mf3Var = mf3.a;
                                        ki0 ki0Var4 = ki0Var2;
                                        lu0 lu0Var4 = lu0Var3;
                                        switch (i111) {
                                            case 0:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                            case 1:
                                                lu0Var4.invoke(ki0Var4);
                                                break;
                                            default:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var2.m0(objQ2);
                            } else {
                                i8 = 2;
                                objQ2 = new au0() { // from class: tn1
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        int i111 = i8;
                                        mf3 mf3Var = mf3.a;
                                        ki0 ki0Var4 = ki0Var2;
                                        lu0 lu0Var4 = lu0Var3;
                                        switch (i111) {
                                            case 0:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                            case 1:
                                                lu0Var4.invoke(ki0Var4);
                                                break;
                                            default:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var2.m0(objQ2);
                            }
                            dv1 dv1VarA14 = bk.a(dv1VarL13, (au0) objQ2);
                            er1 er1VarC111 = ws.c(prVar10, false);
                            int iHashCode1111 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ1111 = ov0Var2.z();
                            dv1 dv1VarH1111 = xp1.H(ov0Var2, dv1VarA14);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC111);
                            q73.h(ov0Var2, ghVar2, l72VarZ1111);
                            az2.s(iHashCode1111, ov0Var2, ghVar113, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar114, dv1VarH1111);
                            t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                            ov0Var2.r();
                            ov0Var2.r();
                            ov0Var2.r();
                            prVar7 = prVar10;
                            c30Var5 = c30Var12;
                            it = it3;
                            nrVar2 = nrVar4;
                            f4 = f8;
                            f3 = f7;
                            goVar2 = goVar4;
                            prVar6 = prVar3;
                            orVar2 = orVar4;
                        } else {
                            c30Var3 = c30Var2;
                        }
                        i7 = 1;
                        objQ = new au0() { // from class: tn1
                            @Override // defpackage.au0
                            public final Object invoke() {
                                int i111 = i7;
                                mf3 mf3Var = mf3.a;
                                ki0 ki0Var4 = ki0Var2;
                                lu0 lu0Var4 = lu0Var2;
                                switch (i111) {
                                    case 0:
                                        lu0Var4.invoke(ki0Var4.a);
                                        break;
                                    case 1:
                                        lu0Var4.invoke(ki0Var4);
                                        break;
                                    default:
                                        lu0Var4.invoke(ki0Var4.a);
                                        break;
                                }
                                return mf3Var;
                            }
                        };
                        ov0Var2.m0(objQ);
                        dv1 dv1VarA15 = bk.a(dv1VarL12, (au0) objQ);
                        er1 er1VarC112 = ws.c(prVar10, false);
                        int iHashCode1112 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ1112 = ov0Var2.z();
                        dv1 dv1VarH1112 = xp1.H(ov0Var2, dv1VarA15);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC112);
                        q73.h(ov0Var2, ghVar2, l72VarZ1112);
                        gh ghVar115 = ghVar6;
                        az2.s(iHashCode1112, ov0Var2, ghVar115, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar5, dv1VarH1112);
                        c30 c30Var13 = c30Var3;
                        gh ghVar116 = ghVar5;
                        t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.i, ov0Var2, 3504, 0);
                        ov0Var2.r();
                        h(ov0Var2, iw2.o(av1Var, 6.0f));
                        dv1 dv1VarL14 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var4), hz.c(0.08f, xp1.d(4293212469L)));
                        zF2 = ov0Var2.f(ki0Var2);
                        objQ2 = ov0Var2.Q();
                        if (zF2) {
                            i8 = 2;
                            objQ2 = new au0() { // from class: tn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i111 = i8;
                                    mf3 mf3Var = mf3.a;
                                    ki0 ki0Var4 = ki0Var2;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i111) {
                                        case 0:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ki0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        } else {
                            i8 = 2;
                            objQ2 = new au0() { // from class: tn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i111 = i8;
                                    mf3 mf3Var = mf3.a;
                                    ki0 ki0Var4 = ki0Var2;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i111) {
                                        case 0:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ki0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        }
                        dv1 dv1VarA16 = bk.a(dv1VarL14, (au0) objQ2);
                        er1 er1VarC113 = ws.c(prVar10, false);
                        int iHashCode1113 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ1113 = ov0Var2.z();
                        dv1 dv1VarH1113 = xp1.H(ov0Var2, dv1VarA16);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC113);
                        q73.h(ov0Var2, ghVar2, l72VarZ1113);
                        az2.s(iHashCode1113, ov0Var2, ghVar115, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar116, dv1VarH1113);
                        t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                        ov0Var2.r();
                        ov0Var2.r();
                        ov0Var2.r();
                        prVar7 = prVar10;
                        c30Var5 = c30Var13;
                        it = it3;
                        nrVar2 = nrVar4;
                        f4 = f8;
                        f3 = f7;
                        goVar2 = goVar4;
                        prVar6 = prVar3;
                        orVar2 = orVar4;
                    } else {
                        ghVar5 = ghVar4;
                        ghVar6 = ghVar3;
                        i6 = i4;
                        if (!upperCase.equals("NR")) {
                            string = "TAC: " + ki0Var.e + "  •  NCI: " + ki0Var.k + "  •  PCI: " + ki0Var.g + "  •  " + i6 + " dBm";
                        }
                        ov0 ov0Var11 = ov0Var;
                        ki0Var2 = ki0Var;
                        s83.b(string, null, hz.c(0.55f, ((kz) ov0Var.j(hh0Var5)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var11, 24576, 0, 262122);
                        ov0Var2 = ov0Var11;
                        ov0Var2.r();
                        dv1 dv1VarK5 = iw2.k(av1Var, 28.0f);
                        bj2 bj2Var5 = cj2.a;
                        dv1 dv1VarL15 = xp1.l(xp1.n(dv1VarK5, bj2Var5), hz.c(0.06f, ((kz) ov0Var2.j(hh0Var5)).q));
                        zF = ov0Var2.f(ki0Var2);
                        objQ = ov0Var2.Q();
                        if (zF) {
                            c30Var3 = c30Var2;
                            if (objQ == c30Var3) {
                                i7 = 1;
                            }
                            dv1 dv1VarA17 = bk.a(dv1VarL15, (au0) objQ);
                            er1 er1VarC114 = ws.c(prVar10, false);
                            int iHashCode1114 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ1114 = ov0Var2.z();
                            dv1 dv1VarH1114 = xp1.H(ov0Var2, dv1VarA17);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC114);
                            q73.h(ov0Var2, ghVar2, l72VarZ1114);
                            gh ghVar117 = ghVar6;
                            az2.s(iHashCode1114, ov0Var2, ghVar117, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar5, dv1VarH1114);
                            c30 c30Var14 = c30Var3;
                            gh ghVar118 = ghVar5;
                            t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.i, ov0Var2, 3504, 0);
                            ov0Var2.r();
                            h(ov0Var2, iw2.o(av1Var, 6.0f));
                            dv1 dv1VarL16 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var5), hz.c(0.08f, xp1.d(4293212469L)));
                            zF2 = ov0Var2.f(ki0Var2);
                            objQ2 = ov0Var2.Q();
                            if (zF2) {
                                i8 = 2;
                                objQ2 = new au0() { // from class: tn1
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        int i111 = i8;
                                        mf3 mf3Var = mf3.a;
                                        ki0 ki0Var4 = ki0Var2;
                                        lu0 lu0Var4 = lu0Var3;
                                        switch (i111) {
                                            case 0:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                            case 1:
                                                lu0Var4.invoke(ki0Var4);
                                                break;
                                            default:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var2.m0(objQ2);
                            } else {
                                i8 = 2;
                                objQ2 = new au0() { // from class: tn1
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        int i111 = i8;
                                        mf3 mf3Var = mf3.a;
                                        ki0 ki0Var4 = ki0Var2;
                                        lu0 lu0Var4 = lu0Var3;
                                        switch (i111) {
                                            case 0:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                            case 1:
                                                lu0Var4.invoke(ki0Var4);
                                                break;
                                            default:
                                                lu0Var4.invoke(ki0Var4.a);
                                                break;
                                        }
                                        return mf3Var;
                                    }
                                };
                                ov0Var2.m0(objQ2);
                            }
                            dv1 dv1VarA18 = bk.a(dv1VarL16, (au0) objQ2);
                            er1 er1VarC115 = ws.c(prVar10, false);
                            int iHashCode1115 = Long.hashCode(ks.U(ov0Var2));
                            l72 l72VarZ1115 = ov0Var2.z();
                            dv1 dv1VarH1115 = xp1.H(ov0Var2, dv1VarA18);
                            ov0Var2.g0();
                            if (ov0Var2.D()) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, ghVar, er1VarC115);
                            q73.h(ov0Var2, ghVar2, l72VarZ1115);
                            az2.s(iHashCode1115, ov0Var2, ghVar117, ov0Var2, waVar);
                            q73.h(ov0Var2, ghVar118, dv1VarH1115);
                            t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                            ov0Var2.r();
                            ov0Var2.r();
                            ov0Var2.r();
                            prVar7 = prVar10;
                            c30Var5 = c30Var14;
                            it = it3;
                            nrVar2 = nrVar4;
                            f4 = f8;
                            f3 = f7;
                            goVar2 = goVar4;
                            prVar6 = prVar3;
                            orVar2 = orVar4;
                        } else {
                            c30Var3 = c30Var2;
                        }
                        i7 = 1;
                        objQ = new au0() { // from class: tn1
                            @Override // defpackage.au0
                            public final Object invoke() {
                                int i111 = i7;
                                mf3 mf3Var = mf3.a;
                                ki0 ki0Var4 = ki0Var2;
                                lu0 lu0Var4 = lu0Var2;
                                switch (i111) {
                                    case 0:
                                        lu0Var4.invoke(ki0Var4.a);
                                        break;
                                    case 1:
                                        lu0Var4.invoke(ki0Var4);
                                        break;
                                    default:
                                        lu0Var4.invoke(ki0Var4.a);
                                        break;
                                }
                                return mf3Var;
                            }
                        };
                        ov0Var2.m0(objQ);
                        dv1 dv1VarA19 = bk.a(dv1VarL15, (au0) objQ);
                        er1 er1VarC116 = ws.c(prVar10, false);
                        int iHashCode1116 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ1116 = ov0Var2.z();
                        dv1 dv1VarH1116 = xp1.H(ov0Var2, dv1VarA19);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC116);
                        q73.h(ov0Var2, ghVar2, l72VarZ1116);
                        gh ghVar119 = ghVar6;
                        az2.s(iHashCode1116, ov0Var2, ghVar119, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar5, dv1VarH1116);
                        c30 c30Var15 = c30Var3;
                        gh ghVar1110 = ghVar5;
                        t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.i, ov0Var2, 3504, 0);
                        ov0Var2.r();
                        h(ov0Var2, iw2.o(av1Var, 6.0f));
                        dv1 dv1VarL17 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var5), hz.c(0.08f, xp1.d(4293212469L)));
                        zF2 = ov0Var2.f(ki0Var2);
                        objQ2 = ov0Var2.Q();
                        if (zF2) {
                            i8 = 2;
                            objQ2 = new au0() { // from class: tn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i111 = i8;
                                    mf3 mf3Var = mf3.a;
                                    ki0 ki0Var4 = ki0Var2;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i111) {
                                        case 0:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ki0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        } else {
                            i8 = 2;
                            objQ2 = new au0() { // from class: tn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i111 = i8;
                                    mf3 mf3Var = mf3.a;
                                    ki0 ki0Var4 = ki0Var2;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i111) {
                                        case 0:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ki0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        }
                        dv1 dv1VarA110 = bk.a(dv1VarL17, (au0) objQ2);
                        er1 er1VarC117 = ws.c(prVar10, false);
                        int iHashCode1117 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ1117 = ov0Var2.z();
                        dv1 dv1VarH1117 = xp1.H(ov0Var2, dv1VarA110);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC117);
                        q73.h(ov0Var2, ghVar2, l72VarZ1117);
                        az2.s(iHashCode1117, ov0Var2, ghVar119, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar1110, dv1VarH1117);
                        t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                        ov0Var2.r();
                        ov0Var2.r();
                        ov0Var2.r();
                        prVar7 = prVar10;
                        c30Var5 = c30Var15;
                        it = it3;
                        nrVar2 = nrVar4;
                        f4 = f8;
                        f3 = f7;
                        goVar2 = goVar4;
                        prVar6 = prVar3;
                        orVar2 = orVar4;
                    }
                    string = "Key: " + ki0Var.a + "  •  " + i6 + " dBm";
                    ov0 ov0Var12 = ov0Var;
                    ki0Var2 = ki0Var;
                    s83.b(string, null, hz.c(0.55f, ((kz) ov0Var.j(hh0Var5)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var12, 24576, 0, 262122);
                    ov0Var2 = ov0Var12;
                    ov0Var2.r();
                    dv1 dv1VarK6 = iw2.k(av1Var, 28.0f);
                    bj2 bj2Var6 = cj2.a;
                    dv1 dv1VarL18 = xp1.l(xp1.n(dv1VarK6, bj2Var6), hz.c(0.06f, ((kz) ov0Var2.j(hh0Var5)).q));
                    zF = ov0Var2.f(ki0Var2);
                    objQ = ov0Var2.Q();
                    if (zF) {
                        c30Var3 = c30Var2;
                        if (objQ == c30Var3) {
                            i7 = 1;
                        }
                        dv1 dv1VarA111 = bk.a(dv1VarL18, (au0) objQ);
                        er1 er1VarC118 = ws.c(prVar10, false);
                        int iHashCode1118 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ1118 = ov0Var2.z();
                        dv1 dv1VarH1118 = xp1.H(ov0Var2, dv1VarA111);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC118);
                        q73.h(ov0Var2, ghVar2, l72VarZ1118);
                        gh ghVar1111 = ghVar6;
                        az2.s(iHashCode1118, ov0Var2, ghVar1111, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar5, dv1VarH1118);
                        c30 c30Var16 = c30Var3;
                        gh ghVar1112 = ghVar5;
                        t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.i, ov0Var2, 3504, 0);
                        ov0Var2.r();
                        h(ov0Var2, iw2.o(av1Var, 6.0f));
                        dv1 dv1VarL19 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var6), hz.c(0.08f, xp1.d(4293212469L)));
                        zF2 = ov0Var2.f(ki0Var2);
                        objQ2 = ov0Var2.Q();
                        if (zF2) {
                            i8 = 2;
                            objQ2 = new au0() { // from class: tn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i111 = i8;
                                    mf3 mf3Var = mf3.a;
                                    ki0 ki0Var4 = ki0Var2;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i111) {
                                        case 0:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ki0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        } else {
                            i8 = 2;
                            objQ2 = new au0() { // from class: tn1
                                @Override // defpackage.au0
                                public final Object invoke() {
                                    int i111 = i8;
                                    mf3 mf3Var = mf3.a;
                                    ki0 ki0Var4 = ki0Var2;
                                    lu0 lu0Var4 = lu0Var3;
                                    switch (i111) {
                                        case 0:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                        case 1:
                                            lu0Var4.invoke(ki0Var4);
                                            break;
                                        default:
                                            lu0Var4.invoke(ki0Var4.a);
                                            break;
                                    }
                                    return mf3Var;
                                }
                            };
                            ov0Var2.m0(objQ2);
                        }
                        dv1 dv1VarA112 = bk.a(dv1VarL19, (au0) objQ2);
                        er1 er1VarC119 = ws.c(prVar10, false);
                        int iHashCode1119 = Long.hashCode(ks.U(ov0Var2));
                        l72 l72VarZ1119 = ov0Var2.z();
                        dv1 dv1VarH1119 = xp1.H(ov0Var2, dv1VarA112);
                        ov0Var2.g0();
                        if (ov0Var2.D()) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, er1VarC119);
                        q73.h(ov0Var2, ghVar2, l72VarZ1119);
                        az2.s(iHashCode1119, ov0Var2, ghVar1111, ov0Var2, waVar);
                        q73.h(ov0Var2, ghVar1112, dv1VarH1119);
                        t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                        ov0Var2.r();
                        ov0Var2.r();
                        ov0Var2.r();
                        prVar7 = prVar10;
                        c30Var5 = c30Var16;
                        it = it3;
                        nrVar2 = nrVar4;
                        f4 = f8;
                        f3 = f7;
                        goVar2 = goVar4;
                        prVar6 = prVar3;
                        orVar2 = orVar4;
                    } else {
                        c30Var3 = c30Var2;
                    }
                    i7 = 1;
                    objQ = new au0() { // from class: tn1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            int i111 = i7;
                            mf3 mf3Var = mf3.a;
                            ki0 ki0Var4 = ki0Var2;
                            lu0 lu0Var4 = lu0Var2;
                            switch (i111) {
                                case 0:
                                    lu0Var4.invoke(ki0Var4.a);
                                    break;
                                case 1:
                                    lu0Var4.invoke(ki0Var4);
                                    break;
                                default:
                                    lu0Var4.invoke(ki0Var4.a);
                                    break;
                            }
                            return mf3Var;
                        }
                    };
                    ov0Var2.m0(objQ);
                    dv1 dv1VarA113 = bk.a(dv1VarL18, (au0) objQ);
                    er1 er1VarC1110 = ws.c(prVar10, false);
                    int iHashCode11110 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ11110 = ov0Var2.z();
                    dv1 dv1VarH11110 = xp1.H(ov0Var2, dv1VarA113);
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, er1VarC1110);
                    q73.h(ov0Var2, ghVar2, l72VarZ11110);
                    gh ghVar1113 = ghVar6;
                    az2.s(iHashCode11110, ov0Var2, ghVar1113, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar5, dv1VarH11110);
                    c30 c30Var17 = c30Var3;
                    gh ghVar1114 = ghVar5;
                    t01.a(vd0.w(), null, iw2.k(av1Var, 13.0f), bk.i, ov0Var2, 3504, 0);
                    ov0Var2.r();
                    h(ov0Var2, iw2.o(av1Var, 6.0f));
                    dv1 dv1VarL110 = xp1.l(xp1.n(iw2.k(av1Var, 28.0f), bj2Var6), hz.c(0.08f, xp1.d(4293212469L)));
                    zF2 = ov0Var2.f(ki0Var2);
                    objQ2 = ov0Var2.Q();
                    if (zF2) {
                        i8 = 2;
                        objQ2 = new au0() { // from class: tn1
                            @Override // defpackage.au0
                            public final Object invoke() {
                                int i111 = i8;
                                mf3 mf3Var = mf3.a;
                                ki0 ki0Var4 = ki0Var2;
                                lu0 lu0Var4 = lu0Var3;
                                switch (i111) {
                                    case 0:
                                        lu0Var4.invoke(ki0Var4.a);
                                        break;
                                    case 1:
                                        lu0Var4.invoke(ki0Var4);
                                        break;
                                    default:
                                        lu0Var4.invoke(ki0Var4.a);
                                        break;
                                }
                                return mf3Var;
                            }
                        };
                        ov0Var2.m0(objQ2);
                    } else {
                        i8 = 2;
                        objQ2 = new au0() { // from class: tn1
                            @Override // defpackage.au0
                            public final Object invoke() {
                                int i111 = i8;
                                mf3 mf3Var = mf3.a;
                                ki0 ki0Var4 = ki0Var2;
                                lu0 lu0Var4 = lu0Var3;
                                switch (i111) {
                                    case 0:
                                        lu0Var4.invoke(ki0Var4.a);
                                        break;
                                    case 1:
                                        lu0Var4.invoke(ki0Var4);
                                        break;
                                    default:
                                        lu0Var4.invoke(ki0Var4.a);
                                        break;
                                }
                                return mf3Var;
                            }
                        };
                        ov0Var2.m0(objQ2);
                    }
                    dv1 dv1VarA114 = bk.a(dv1VarL110, (au0) objQ2);
                    er1 er1VarC1111 = ws.c(prVar10, false);
                    int iHashCode11111 = Long.hashCode(ks.U(ov0Var2));
                    l72 l72VarZ11111 = ov0Var2.z();
                    dv1 dv1VarH11111 = xp1.H(ov0Var2, dv1VarA114);
                    ov0Var2.g0();
                    if (ov0Var2.D()) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, er1VarC1111);
                    q73.h(ov0Var2, ghVar2, l72VarZ11111);
                    az2.s(iHashCode11111, ov0Var2, ghVar1113, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar1114, dv1VarH11111);
                    t01.a(ji2.F(), null, iw2.k(av1Var, 14.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                    ov0Var2.r();
                    ov0Var2.r();
                    ov0Var2.r();
                    prVar7 = prVar10;
                    c30Var5 = c30Var17;
                    it = it3;
                    nrVar2 = nrVar4;
                    f4 = f8;
                    f3 = f7;
                    goVar2 = goVar4;
                    prVar6 = prVar3;
                    orVar2 = orVar4;
                }
                ov0Var2.s();
                ov0Var2.r();
                ov0Var2.s();
            }
            ov0Var2.r();
        } else {
            ov0Var2.W();
        }
        ee2 ee2VarT = ov0Var2.t();
        if (ee2VarT != null) {
            ee2VarT.e(new sn1(list, str, z, lu0Var, au0Var, lu0Var2, lu0Var3, i, 1));
        }
    }

    public static final void d(final int i, final l6 l6Var, f30 f30Var, final au0 au0Var, final au0 au0Var2) {
        int i2;
        ee2 ee2VarT;
        pu0 pu0Var;
        int i3;
        boolean z;
        c30 c30Var;
        ey1 ey1Var;
        ey1 ey1Var2;
        ey1 ey1Var3;
        ey1 ey1Var4;
        final ey1 ey1Var5;
        ey1 ey1Var6;
        Object w12Var;
        final l6 l6Var2;
        au0Var.getClass();
        au0Var2.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-26163283);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(l6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.h(au0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(au0Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        int i4 = i2;
        final int i5 = 0;
        final int i6 = 1;
        if (ov0Var.T(i4 & 1, (i4 & 147) != 146)) {
            ey1 ey1VarS = ee0.s(l6Var.c, ov0Var);
            ey1 ey1VarS2 = ee0.s(l6Var.p, ov0Var);
            ey1 ey1VarS3 = ee0.s(l6Var.r, ov0Var);
            final ey1 ey1VarS4 = ee0.s(l6Var.t, ov0Var);
            boolean z2 = ((Boolean) ey1VarS2.getValue()).booleanValue() || ((CloudAccountState) ey1VarS.getValue()).getChecking() || ((CloudAccountState) ey1VarS.getValue()).getInitializing();
            CloudAccount account = ((CloudAccountState) ey1VarS.getValue()).getAccount();
            CloudAccount cloudAccount = (account == null || !((CloudAccountState) ey1VarS.getValue()).getValidated() || account.isGuest()) ? null : account;
            if (cloudAccount == null) {
                ov0Var.c0(-2040747471);
                o51.a(l6Var, au0Var, ov0Var, i4 & 126, 0);
                ov0Var.p(false);
                ee2VarT = ov0Var.t();
                if (ee2VarT == null) {
                    return;
                }
                final int i7 = 1;
                pu0Var = new pu0() { // from class: g62
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        int i8 = i7;
                        mf3 mf3Var = mf3.a;
                        int i9 = i;
                        au0 au0Var3 = au0Var2;
                        au0 au0Var4 = au0Var;
                        l6 l6Var3 = l6Var;
                        f30 f30Var2 = (f30) obj;
                        ((Integer) obj2).getClass();
                        switch (i8) {
                            case 0:
                                gh0.d(wc0.m0(i9 | 1), l6Var3, f30Var2, au0Var4, au0Var3);
                                break;
                            default:
                                gh0.d(wc0.m0(i9 | 1), l6Var3, f30Var2, au0Var4, au0Var3);
                                break;
                        }
                        return mf3Var;
                    }
                };
            } else {
                ov0Var.c0(-2042344715);
                ov0Var.p(false);
                Object objQ = ov0Var.Q();
                c30 c30Var2 = d30.a;
                if (objQ == c30Var2) {
                    objQ = ke0.H("");
                    ov0Var.m0(objQ);
                }
                ey1 ey1Var7 = (ey1) objQ;
                Object objQ2 = ov0Var.Q();
                if (objQ2 == c30Var2) {
                    objQ2 = ke0.H("");
                    ov0Var.m0(objQ2);
                }
                ey1 ey1Var8 = (ey1) objQ2;
                Object objQ3 = ov0Var.Q();
                if (objQ3 == c30Var2) {
                    objQ3 = ke0.H(Boolean.FALSE);
                    ov0Var.m0(objQ3);
                }
                ey1 ey1Var9 = (ey1) objQ3;
                Object objQ4 = ov0Var.Q();
                if (objQ4 == c30Var2) {
                    objQ4 = ke0.H(null);
                    ov0Var.m0(objQ4);
                }
                ey1 ey1Var10 = (ey1) objQ4;
                Object objQ5 = ov0Var.Q();
                if (objQ5 == c30Var2) {
                    objQ5 = ke0.H(Boolean.FALSE);
                    ov0Var.m0(objQ5);
                }
                ey1 ey1Var11 = (ey1) objQ5;
                String failureCode = (String) ey1VarS3.getValue();
                if (failureCode == null) {
                    failureCode = ((CloudAccountState) ey1VarS.getValue()).getFailureCode();
                }
                final String str = failureCode;
                if (z2 || !zy.g0(yo.H0(new String[]{"hardware_confirmation_required", "hardware_conflict"}), str)) {
                    i3 = i4;
                    z = false;
                    c30Var = c30Var2;
                    ov0Var.c0(-2042344715);
                } else {
                    ov0Var.c0(-2040228562);
                    boolean zH = ov0Var.h(l6Var);
                    Object objQ6 = ov0Var.Q();
                    if (zH || objQ6 == c30Var2) {
                        w12Var = new w12(0, l6Var, l6.class, "dismissAccountEntryError", "dismissAccountEntryError()V", 0, 4);
                        l6Var2 = l6Var;
                        ov0Var.m0(w12Var);
                    } else {
                        w12Var = objQ6;
                        l6Var2 = l6Var;
                    }
                    i3 = i4;
                    c30Var = c30Var2;
                    xq1.a((au0) ((o81) w12Var), sb.a0(-1171169353, new pu0() { // from class: h62
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = i5;
                            mf3 mf3Var = mf3.a;
                            c30 c30Var3 = d30.a;
                            l6 l6Var3 = l6Var2;
                            switch (i8) {
                                case 0:
                                    f30 f30Var2 = (f30) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    ov0 ov0Var2 = (ov0) f30Var2;
                                    if (!ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        ov0Var2.W();
                                    } else {
                                        boolean zH2 = ov0Var2.h(l6Var3);
                                        Object objQ7 = ov0Var2.Q();
                                        if (zH2 || objQ7 == c30Var3) {
                                            objQ7 = new r5(l6Var3, 1);
                                            ov0Var2.m0(objQ7);
                                        }
                                        n51.j((au0) objQ7, null, false, null, null, null, da0.j, ov0Var2, 805306368, 510);
                                    }
                                    break;
                                default:
                                    f30 f30Var3 = (f30) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    ov0 ov0Var3 = (ov0) f30Var3;
                                    if (!ov0Var3.T(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        ov0Var3.W();
                                    } else {
                                        boolean zH3 = ov0Var3.h(l6Var3);
                                        Object objQ8 = ov0Var3.Q();
                                        if (zH3 || objQ8 == c30Var3) {
                                            objQ8 = new r5(l6Var3, 2);
                                            ov0Var3.m0(objQ8);
                                        }
                                        n51.j((au0) objQ8, null, false, null, null, null, da0.k, ov0Var3, 805306368, 510);
                                    }
                                    break;
                            }
                            return mf3Var;
                        }
                    }, ov0Var), null, sb.a0(1775664373, new pu0() { // from class: h62
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = i6;
                            mf3 mf3Var = mf3.a;
                            c30 c30Var3 = d30.a;
                            l6 l6Var3 = l6Var2;
                            switch (i8) {
                                case 0:
                                    f30 f30Var2 = (f30) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    ov0 ov0Var2 = (ov0) f30Var2;
                                    if (!ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        ov0Var2.W();
                                    } else {
                                        boolean zH2 = ov0Var2.h(l6Var3);
                                        Object objQ7 = ov0Var2.Q();
                                        if (zH2 || objQ7 == c30Var3) {
                                            objQ7 = new r5(l6Var3, 1);
                                            ov0Var2.m0(objQ7);
                                        }
                                        n51.j((au0) objQ7, null, false, null, null, null, da0.j, ov0Var2, 805306368, 510);
                                    }
                                    break;
                                default:
                                    f30 f30Var3 = (f30) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    ov0 ov0Var3 = (ov0) f30Var3;
                                    if (!ov0Var3.T(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        ov0Var3.W();
                                    } else {
                                        boolean zH3 = ov0Var3.h(l6Var3);
                                        Object objQ8 = ov0Var3.Q();
                                        if (zH3 || objQ8 == c30Var3) {
                                            objQ8 = new r5(l6Var3, 2);
                                            ov0Var3.m0(objQ8);
                                        }
                                        n51.j((au0) objQ8, null, false, null, null, null, da0.k, ov0Var3, 805306368, 510);
                                    }
                                    break;
                            }
                            return mf3Var;
                        }
                    }, ov0Var), da0.l, da0.m, null, 0L, 0L, 0L, 0L, null, ov0Var, 1772592, 16276);
                    ov0Var = ov0Var;
                    z = false;
                }
                ov0Var.p(z);
                String sessionId = cloudAccount.getSessionId();
                boolean zH2 = ov0Var.h(l6Var);
                Object objQ7 = ov0Var.Q();
                c30 c30Var3 = c30Var;
                if (zH2 || objQ7 == c30Var3) {
                    ey1Var = ey1Var7;
                    ey1Var2 = ey1Var9;
                    ey1Var3 = ey1Var10;
                    ey1Var4 = ey1Var11;
                    a4 a4Var = new a4(l6Var, ey1Var, ey1Var8, ey1Var2, ey1Var3, ey1Var4, (q60) null);
                    ey1Var5 = ey1Var8;
                    ov0Var.m0(a4Var);
                    objQ7 = a4Var;
                } else {
                    ey1Var = ey1Var7;
                    ey1Var5 = ey1Var8;
                    ey1Var2 = ey1Var9;
                    ey1Var3 = ey1Var10;
                    ey1Var4 = ey1Var11;
                }
                oi0.e(ov0Var, (pu0) objQ7, sessionId);
                xq1.g(z, au0Var, ov0Var, i3 & 112, 1);
                final ey1 ey1Var12 = ey1Var;
                final ey1 ey1Var13 = ey1Var3;
                final ey1 ey1Var14 = ey1Var4;
                final boolean z3 = z2;
                final CloudAccount cloudAccount2 = cloudAccount;
                final ey1 ey1Var15 = ey1Var2;
                wc0.n(null, sb.a0(-161648271, new u2(8, au0Var), ov0Var), null, null, null, 0, 0L, 0L, null, sb.a0(1872909820, new qu0() { // from class: i62
                    @Override // defpackage.qu0
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        l6 l6Var3;
                        c30 c30Var4;
                        boolean z4;
                        z42 z42Var = (z42) obj;
                        f30 f30Var2 = (f30) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        z42Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((ov0) f30Var2).f(z42Var) ? 4 : 2;
                        }
                        ov0 ov0Var2 = (ov0) f30Var2;
                        if (ov0Var2.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                            dv1 dv1VarD = zm3.D(zm3.P(zm3.C(iw2.c, z42Var), zm3.O(ov0Var2), true), 20.0f);
                            yz yzVarA = wz.a(new jo(16.0f, true, new fo(0)), j9.r, ov0Var2, 6);
                            int iHashCode = Long.hashCode(ov0Var2.T);
                            l72 l72VarL = ov0Var2.l();
                            dv1 dv1VarH = xp1.H(ov0Var2, dv1VarD);
                            w20.b.getClass();
                            x30 x30Var = v20.b;
                            ov0Var2.g0();
                            if (ov0Var2.S) {
                                ov0Var2.k(x30Var);
                            } else {
                                ov0Var2.p0();
                            }
                            q73.h(ov0Var2, v20.e, yzVarA);
                            q73.h(ov0Var2, v20.d, l72VarL);
                            q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode));
                            q73.g(ov0Var2, v20.g);
                            q73.h(ov0Var2, v20.c, dv1VarH);
                            av1 av1Var = av1.a;
                            boolean z5 = z3;
                            if (z5) {
                                ov0Var2.c0(-2071460938);
                                vc2.c(iw2.e(av1Var, 1.0f), 0L, 0L, 0, 0.0f, ov0Var2, 6, 30);
                                ov0Var2 = ov0Var2;
                            } else {
                                ov0Var2.c0(205891708);
                            }
                            ov0Var2.p(false);
                            String str2 = str;
                            if (str2 == null || yo.H0(new String[]{"login_required", "companion_login_required", "device_signed_out", "device_login_required", "session_replaced"}).contains(str2)) {
                                ov0Var2.c0(205891708);
                            } else {
                                ov0Var2.c0(-2071453857);
                                ov0 ov0Var3 = ov0Var2;
                                s83.b(ke0.N(gh0.j(str2), ov0Var2), null, ((kz) ov0Var2.j(mz.a)).w, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262138);
                                ov0Var2 = ov0Var3;
                            }
                            ov0Var2.p(false);
                            dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                            CloudAccount cloudAccount3 = cloudAccount2;
                            sb.C(dv1VarE, null, null, null, sb.a0(54087444, new bu(7, cloudAccount3, au0Var2), ov0Var2), ov0Var2, 196614, 30);
                            boolean softwareMembershipRequired = cloudAccount3.getSoftwareMembershipRequired();
                            l6 l6Var4 = l6Var;
                            c30 c30Var5 = d30.a;
                            if (softwareMembershipRequired) {
                                ov0Var2.c0(211002213);
                                ov0 ov0Var4 = ov0Var2;
                                l6Var3 = l6Var4;
                                c30Var4 = c30Var5;
                                s83.b(ke0.N(2131623976, ov0Var2), null, ((kz) ov0Var2.j(mz.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 0, 0, 262138);
                                boolean zH3 = ov0Var4.h(l6Var3);
                                Object objQ8 = ov0Var4.Q();
                                if (zH3 || objQ8 == c30Var4) {
                                    objQ8 = new w12(0, l6Var3, l6.class, "retryHardwareIdentity", "retryHardwareIdentity()V", 0, 6);
                                    ov0Var4.m0(objQ8);
                                }
                                n51.j((au0) ((o81) objQ8), null, !z5, null, null, null, da0.q, ov0Var4, 805306368, 506);
                                ov0Var2 = ov0Var4;
                            } else {
                                l6Var3 = l6Var4;
                                c30Var4 = c30Var5;
                                ov0Var2.c0(205891708);
                            }
                            ov0Var2.p(false);
                            boolean z6 = !z5;
                            dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                            boolean zH4 = ov0Var2.h(l6Var3);
                            Object objQ9 = ov0Var2.Q();
                            ey1 ey1Var16 = ey1Var15;
                            if (zH4 || objQ9 == c30Var4) {
                                objQ9 = new k5(l6Var3, ey1Var16, 4);
                                ov0Var2.m0(objQ9);
                            }
                            ov0 ov0Var5 = ov0Var2;
                            n51.h((au0) objQ9, dv1VarE2, z6, null, null, null, null, sb.a0(1514310420, new au(cloudAccount3, 8), ov0Var2), ov0Var5, 805306416, 504);
                            ov0 ov0Var6 = ov0Var5;
                            if (((Boolean) ey1Var16.getValue()).booleanValue()) {
                                ov0Var6.c0(211611580);
                                s03 s03Var = ey1VarS4;
                                Integer numValueOf = Integer.valueOf(((List) s03Var.getValue()).size());
                                Integer loginDeviceLimit = cloudAccount3.getLoginDeviceLimit();
                                s83.b(ke0.O(2131623967, new Object[]{numValueOf, Integer.valueOf(loginDeviceLimit != null ? loginDeviceLimit.intValue() : 1)}, ov0Var6), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 0, 0, 262142);
                                boolean zH5 = ov0Var6.h(l6Var3);
                                Object objQ10 = ov0Var6.Q();
                                if (zH5 || objQ10 == c30Var4) {
                                    objQ10 = new w12(0, l6Var3, l6.class, "loadDevices", "loadDevices()V", 0, 7);
                                    ov0Var6.m0(objQ10);
                                }
                                n51.j((au0) ((o81) objQ10), null, z6, null, null, null, da0.r, ov0Var6, 805306368, 506);
                                ov0Var6 = ov0Var6;
                                Iterator it = ((List) s03Var.getValue()).iterator();
                                while (it.hasNext()) {
                                    sb.C(iw2.e(av1Var, 1.0f), null, null, null, sb.a0(-592294185, new gl1(2, (CloudAccountDevice) it.next(), ey1Var13, z5), ov0Var6), ov0Var6, 196614, 30);
                                }
                            } else {
                                ov0Var6.c0(205891708);
                            }
                            ov0Var6.p(false);
                            Object objQ11 = ov0Var6.Q();
                            ey1 ey1Var17 = ey1Var14;
                            ey1 ey1Var18 = ey1Var12;
                            ey1 ey1Var19 = ey1Var5;
                            if (objQ11 == c30Var4) {
                                objQ11 = new f3(ey1Var17, ey1Var18, ey1Var19, 1);
                                ov0Var6.m0(objQ11);
                            }
                            ov0 ov0Var7 = ov0Var6;
                            n51.j((au0) objQ11, null, z6, null, null, null, da0.t, ov0Var7, 805306374, 506);
                            ov0 ov0Var8 = ov0Var7;
                            if (((Boolean) ey1Var17.getValue()).booleanValue()) {
                                ov0Var8.c0(212970031);
                                String str3 = (String) ey1Var18.getValue();
                                j62 j62Var = new j62();
                                dv1 dv1VarE3 = iw2.e(av1Var, 1.0f);
                                Object objQ12 = ov0Var8.Q();
                                if (objQ12 == c30Var4) {
                                    objQ12 = new vu1(ey1Var18, 5);
                                    ov0Var8.m0(objQ12);
                                }
                                ee0.i(str3, (lu0) objQ12, dv1VarE3, z6, null, da0.u, null, null, null, null, false, j62Var, null, null, false, 0, 0, null, null, ov0Var8, 1573296, 0, 8372144);
                                String str4 = (String) ey1Var19.getValue();
                                j62 j62Var2 = new j62();
                                dv1 dv1VarE4 = iw2.e(av1Var, 1.0f);
                                Object objQ13 = ov0Var8.Q();
                                if (objQ13 == c30Var4) {
                                    objQ13 = new vu1(ey1Var19, 6);
                                    ov0Var8.m0(objQ13);
                                }
                                ee0.i(str4, (lu0) objQ13, dv1VarE4, z6, null, da0.v, null, null, null, null, false, j62Var2, null, null, false, 0, 0, null, null, ov0Var8, 1573296, 0, 8372144);
                                z4 = z6;
                                boolean zH6 = ov0Var8.h(l6Var3);
                                Object objQ14 = ov0Var8.Q();
                                if (zH6 || objQ14 == c30Var4) {
                                    objQ14 = new a5(l6Var3, ey1Var18, ey1Var19, 3);
                                    ov0Var8.m0(objQ14);
                                }
                                n51.a((au0) objQ14, null, !z5 && ((String) ey1Var18.getValue()).length() > 0 && ((String) ey1Var19.getValue()).length() >= 12, null, null, null, null, null, da0.w, ov0Var8, 805306368, 506);
                                ov0Var8 = ov0Var8;
                            } else {
                                z4 = z6;
                                ov0Var8.c0(205891708);
                            }
                            ov0Var8.p(false);
                            boolean zH7 = ov0Var8.h(l6Var3);
                            Object objQ15 = ov0Var8.Q();
                            if (zH7 || objQ15 == c30Var4) {
                                objQ15 = new w12(0, l6Var3, l6.class, "signOut", "signOut()V", 0, 5);
                                ov0Var8.m0(objQ15);
                            }
                            ov0 ov0Var9 = ov0Var8;
                            n51.a((au0) ((o81) objQ15), iw2.e(av1Var, 1.0f), z4, null, null, null, null, null, da0.x, ov0Var9, 805306416, 504);
                            ov0Var9.p(true);
                        } else {
                            ov0Var2.W();
                        }
                        return mf3.a;
                    }
                }, ov0Var), ov0Var, 805306416, 509);
                CloudAccountDevice cloudAccountDevice = (CloudAccountDevice) ey1Var13.getValue();
                if (cloudAccountDevice == null) {
                    ov0Var.c0(-2034421953);
                } else {
                    ov0Var.c0(-2034421952);
                    Object objQ8 = ov0Var.Q();
                    if (objQ8 == c30Var3) {
                        ey1Var6 = ey1Var13;
                        objQ8 = new mo0(ey1Var6, 27);
                        ov0Var.m0(objQ8);
                    } else {
                        ey1Var6 = ey1Var13;
                    }
                    ov0 ov0Var2 = ov0Var;
                    xq1.a((au0) objQ8, sb.a0(1789503956, new f5(l6Var, cloudAccountDevice, ey1Var6), ov0Var), null, sb.a0(673535830, new i3(ey1Var6, 18), ov0Var), da0.A, sb.a0(-1000416359, new x4(cloudAccountDevice, 1), ov0Var), null, 0L, 0L, 0L, 0L, null, ov0Var2, 1772598, 16276);
                    ov0Var = ov0Var2;
                    z = false;
                }
                ov0Var.p(z);
            }
            ee2VarT.d = pu0Var;
        }
        ov0Var.W();
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final int i8 = 0;
            pu0Var = new pu0() { // from class: g62
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = i8;
                    mf3 mf3Var = mf3.a;
                    int i10 = i;
                    au0 au0Var3 = au0Var2;
                    au0 au0Var4 = au0Var;
                    l6 l6Var3 = l6Var;
                    f30 f30Var2 = (f30) obj;
                    ((Integer) obj2).getClass();
                    switch (i9) {
                        case 0:
                            gh0.d(wc0.m0(i10 | 1), l6Var3, f30Var2, au0Var4, au0Var3);
                            break;
                        default:
                            gh0.d(wc0.m0(i10 | 1), l6Var3, f30Var2, au0Var4, au0Var3);
                            break;
                    }
                    return mf3Var;
                }
            };
            ee2VarT.d = pu0Var;
        }
    }

    public static final void e(List list, boolean z, au0 au0Var, au0 au0Var2, f30 f30Var, int i) {
        int i2;
        au0Var.getClass();
        au0Var2.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1253521342);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.h(au0Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            sb.F(au0Var, new qc0(3), sb.a0(-584826151, new p2(list, au0Var, z, au0Var2), ov0Var), ov0Var, ((i2 >> 6) & 14) | 432, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new xy(list, z, au0Var, au0Var2, i, 5);
        }
    }

    public static final void f(RootSetupTestResult rootSetupTestResult, boolean z, au0 au0Var, f30 f30Var, int i) {
        int i2;
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(992170185);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(rootSetupTestResult) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            sb.F(au0Var, new qc0(3), sb.a0(1660865376, new w4(rootSetupTestResult, z, (ay) ov0Var.j(z30.e), (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b), au0Var), ov0Var), ov0Var, ((i2 >> 6) & 14) | 432, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new yf(rootSetupTestResult, z, au0Var, i, 1);
        }
    }

    public static final void g(final AppState appState, final ul1 ul1Var, final lr2 lr2Var, final float f2, final float f3, final au0 au0Var, f30 f30Var, final int i) {
        int i2;
        final float f4;
        final float f5;
        au0 au0Var2;
        ov0 ov0Var;
        appState.getClass();
        ul1Var.getClass();
        au0Var.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-931112276);
        if ((i & 6) == 0) {
            i2 = (ov0Var2.h(appState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var2.h(ul1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ov0Var2.f(lr2Var) : ov0Var2.h(lr2Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            f4 = f2;
            i2 |= ov0Var2.c(f4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        } else {
            f4 = f2;
        }
        if ((i & 24576) == 0) {
            f5 = f3;
            i2 |= ov0Var2.c(f5) ? 16384 : 8192;
        } else {
            f5 = f3;
        }
        if ((196608 & i) == 0) {
            au0Var2 = au0Var;
            i2 |= ov0Var2.h(au0Var2) ? 131072 : 65536;
        } else {
            au0Var2 = au0Var;
        }
        int i3 = i2;
        if (ov0Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            final Context context = (Context) ov0Var2.j(AndroidCompositionLocals_androidKt.b);
            final xb0 xb0Var = (xb0) ov0Var2.j(z30.h);
            final au0 au0Var3 = au0Var2;
            ov0Var = ov0Var2;
            sb.F(au0Var, new qc0(3), sb.a0(-1183246283, new pu0() { // from class: dm2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ov0 ov0Var3 = (ov0) f30Var2;
                    if (ov0Var3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        bj2 bj2VarA = cj2.a(24.0f);
                        aw awVarT = ym3.t(((kz) ov0Var3.j(mz.a)).p, 0L, ov0Var3, 0, 14);
                        dv1 dv1VarF = zm3.F(iw2.e(av1.a, 0.92f), 0.0f, 20.0f, 1);
                        cw cwVarU = ym3.u(62, 10.0f);
                        final AppState appState2 = appState;
                        final ul1 ul1Var2 = ul1Var;
                        final xb0 xb0Var2 = xb0Var;
                        final float f6 = f4;
                        final float f7 = f5;
                        final lr2 lr2Var2 = lr2Var;
                        final au0 au0Var4 = au0Var3;
                        final Context context2 = context;
                        sb.C(dv1VarF, bj2VarA, awVarT, cwVarU, sb.a0(1392849795, new qu0() { // from class: fm2
                            @Override // defpackage.qu0
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                String strO;
                                final au0 au0Var5;
                                ov0 ov0Var4;
                                f30 f30Var3 = (f30) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((zz) obj3).getClass();
                                ov0 ov0Var5 = (ov0) f30Var3;
                                if (ov0Var5.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    av1 av1Var = av1.a;
                                    dv1 dv1VarD = zm3.D(iw2.e(av1Var, 1.0f), 20.0f);
                                    jo joVar = new jo(16.0f, true, new fo(0));
                                    nr nrVar = j9.r;
                                    yz yzVarA = wz.a(joVar, nrVar, ov0Var5, 6);
                                    int iHashCode = Long.hashCode(ov0Var5.T);
                                    l72 l72VarL = ov0Var5.l();
                                    dv1 dv1VarH = xp1.H(ov0Var5, dv1VarD);
                                    w20.b.getClass();
                                    x30 x30Var = v20.b;
                                    ov0Var5.g0();
                                    if (ov0Var5.S) {
                                        ov0Var5.k(x30Var);
                                    } else {
                                        ov0Var5.p0();
                                    }
                                    gh ghVar = v20.e;
                                    q73.h(ov0Var5, ghVar, yzVarA);
                                    gh ghVar2 = v20.d;
                                    q73.h(ov0Var5, ghVar2, l72VarL);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    gh ghVar3 = v20.f;
                                    q73.h(ov0Var5, ghVar3, numValueOf);
                                    wa waVar = v20.g;
                                    q73.g(ov0Var5, waVar);
                                    gh ghVar4 = v20.c;
                                    q73.h(ov0Var5, ghVar4, dv1VarH);
                                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                                    or orVar = j9.p;
                                    kk2 kk2VarA = jk2.a(am1.i, orVar, ov0Var5, 54);
                                    int iHashCode2 = Long.hashCode(ov0Var5.T);
                                    l72 l72VarL2 = ov0Var5.l();
                                    dv1 dv1VarH2 = xp1.H(ov0Var5, dv1VarE);
                                    ov0Var5.g0();
                                    if (ov0Var5.S) {
                                        ov0Var5.k(x30Var);
                                    } else {
                                        ov0Var5.p0();
                                    }
                                    q73.h(ov0Var5, ghVar, kk2VarA);
                                    q73.h(ov0Var5, ghVar2, l72VarL2);
                                    az2.s(iHashCode2, ov0Var5, ghVar3, ov0Var5, waVar);
                                    q73.h(ov0Var5, ghVar4, dv1VarH2);
                                    kk2 kk2VarA2 = jk2.a(am1.e, orVar, ov0Var5, 48);
                                    int iHashCode3 = Long.hashCode(ov0Var5.T);
                                    l72 l72VarL3 = ov0Var5.l();
                                    dv1 dv1VarH3 = xp1.H(ov0Var5, av1Var);
                                    ov0Var5.g0();
                                    if (ov0Var5.S) {
                                        ov0Var5.k(x30Var);
                                    } else {
                                        ov0Var5.p0();
                                    }
                                    q73.h(ov0Var5, ghVar, kk2VarA2);
                                    q73.h(ov0Var5, ghVar2, l72VarL3);
                                    az2.s(iHashCode3, ov0Var5, ghVar3, ov0Var5, waVar);
                                    q73.h(ov0Var5, ghVar4, dv1VarH3);
                                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 38.0f), cj2.a(12.0f));
                                    long j = bk.g;
                                    dv1 dv1VarK = xp1.k(dv1VarN, hz.c(0.12f, j), o51.p0);
                                    er1 er1VarC = ws.c(j9.j, false);
                                    int iHashCode4 = Long.hashCode(ov0Var5.T);
                                    l72 l72VarL4 = ov0Var5.l();
                                    dv1 dv1VarH4 = xp1.H(ov0Var5, dv1VarK);
                                    ov0Var5.g0();
                                    if (ov0Var5.S) {
                                        ov0Var5.k(x30Var);
                                    } else {
                                        ov0Var5.p0();
                                    }
                                    q73.h(ov0Var5, ghVar, er1VarC);
                                    q73.h(ov0Var5, ghVar2, l72VarL4);
                                    az2.s(iHashCode4, ov0Var5, ghVar3, ov0Var5, waVar);
                                    q73.h(ov0Var5, ghVar4, dv1VarH4);
                                    t01.a(k22.r(), null, iw2.k(av1Var, 20.0f), j, ov0Var5, 3504, 0);
                                    az2.t(ov0Var5, true, av1Var, 12.0f, ov0Var5);
                                    yz yzVarA2 = wz.a(am1.g, nrVar, ov0Var5, 0);
                                    int iHashCode5 = Long.hashCode(ov0Var5.T);
                                    l72 l72VarL5 = ov0Var5.l();
                                    dv1 dv1VarH5 = xp1.H(ov0Var5, av1Var);
                                    ov0Var5.g0();
                                    if (ov0Var5.S) {
                                        ov0Var5.k(x30Var);
                                    } else {
                                        ov0Var5.p0();
                                    }
                                    q73.h(ov0Var5, ghVar, yzVarA2);
                                    q73.h(ov0Var5, ghVar2, l72VarL5);
                                    az2.s(iHashCode5, ov0Var5, ghVar3, ov0Var5, waVar);
                                    q73.h(ov0Var5, ghVar4, dv1VarH5);
                                    String strN = ke0.N(2131624903, ov0Var5);
                                    long jC = v63.c(18);
                                    jr0 jr0Var = jr0.j;
                                    hh0 hh0Var = mz.a;
                                    s83.b(strN, null, ((kz) ov0Var5.j(hh0Var)).q, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
                                    final AppState appState3 = appState2;
                                    if (appState3.getSavedRoutes().isEmpty()) {
                                        strO = az2.h(ov0Var5, -239633129, 2131624806, ov0Var5, false);
                                    } else {
                                        ov0Var5.c0(-239631628);
                                        strO = ke0.O(2131625121, new Object[]{Integer.valueOf(appState3.getSavedRoutes().size())}, ov0Var5);
                                        ov0Var5.p(false);
                                    }
                                    s83.b(strO, null, hz.c(0.6f, ((kz) ov0Var5.j(hh0Var)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262122);
                                    ov0Var5.p(true);
                                    ov0Var5.p(true);
                                    dv1 dv1VarK2 = iw2.k(av1Var, 32.0f);
                                    p10 p10Var = ji2.j;
                                    au0 au0Var6 = au0Var4;
                                    xq1.l(au0Var6, dv1VarK2, false, null, null, p10Var, ov0Var5, 1572912, 60);
                                    ov0Var5.p(true);
                                    if (appState3.getSavedRoutes().isEmpty()) {
                                        ov0Var5.c0(1652699974);
                                        dv1 dv1VarF2 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 24.0f, 1);
                                        yz yzVarA3 = wz.a(am1.h, j9.s, ov0Var5, 54);
                                        int iHashCode6 = Long.hashCode(ov0Var5.T);
                                        l72 l72VarL6 = ov0Var5.l();
                                        dv1 dv1VarH6 = xp1.H(ov0Var5, dv1VarF2);
                                        ov0Var5.g0();
                                        if (ov0Var5.S) {
                                            ov0Var5.k(x30Var);
                                        } else {
                                            ov0Var5.p0();
                                        }
                                        q73.h(ov0Var5, ghVar, yzVarA3);
                                        q73.h(ov0Var5, ghVar2, l72VarL6);
                                        az2.s(iHashCode6, ov0Var5, ghVar3, ov0Var5, waVar);
                                        q73.h(ov0Var5, ghVar4, dv1VarH6);
                                        t01.a(ld0.w(), null, iw2.k(av1Var, 48.0f), hz.c(0.35f, ((kz) ov0Var5.j(hh0Var)).q), ov0Var5, 432, 0);
                                        gh0.h(ov0Var5, iw2.g(av1Var, 10.0f));
                                        au0Var5 = au0Var6;
                                        s83.b(ke0.N(2131624806, ov0Var5), null, hz.c(0.7f, ((kz) ov0Var5.j(hh0Var)).q), v63.c(15), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
                                        gh0.h(ov0Var5, iw2.g(av1Var, 4.0f));
                                        s83.b(ke0.N(2131624000, ov0Var5), null, hz.c(0.45f, ((kz) ov0Var5.j(hh0Var)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262122);
                                        ov0Var4 = ov0Var5;
                                        ov0Var4.p(true);
                                        ov0Var4.p(false);
                                    } else {
                                        au0Var5 = au0Var6;
                                        ov0Var5.c0(1654230940);
                                        dv1 dv1VarH7 = iw2.h(iw2.e(av1Var, 1.0f), 0.0f, 320.0f, 1);
                                        jo joVar2 = new jo(8.0f, true, new fo(0));
                                        boolean zH = ov0Var5.h(appState3);
                                        final ul1 ul1Var3 = ul1Var2;
                                        boolean zH2 = zH | ov0Var5.h(ul1Var3);
                                        final xb0 xb0Var3 = xb0Var2;
                                        boolean zF = zH2 | ov0Var5.f(xb0Var3);
                                        final float f8 = f6;
                                        boolean zC = zF | ov0Var5.c(f8);
                                        final float f9 = f7;
                                        boolean zC2 = zC | ov0Var5.c(f9);
                                        final lr2 lr2Var3 = lr2Var2;
                                        boolean zH3 = zC2 | ov0Var5.h(lr2Var3) | ov0Var5.f(au0Var5);
                                        final Context context3 = context2;
                                        boolean zH4 = zH3 | ov0Var5.h(context3);
                                        Object objQ = ov0Var5.Q();
                                        if (zH4 || objQ == d30.a) {
                                            lu0 lu0Var = new lu0() { // from class: gm2
                                                @Override // defpackage.lu0
                                                public final Object invoke(Object obj6) {
                                                    kd1 kd1Var = (kd1) obj6;
                                                    kd1Var.getClass();
                                                    List<SavedRoute> savedRoutes = appState3.getSavedRoutes();
                                                    kd1Var.c(savedRoutes.size(), null, new u3(savedRoutes, 13), new p10(new im2(savedRoutes, ul1Var3, xb0Var3, f8, f9, lr2Var3, au0Var5, context3), true, 802480018));
                                                    return mf3.a;
                                                }
                                            };
                                            ov0Var5.m0(lu0Var);
                                            objQ = lu0Var;
                                        }
                                        ke0.d(dv1VarH7, null, null, joVar2, null, null, false, null, (lu0) objQ, ov0Var5, 24582, 494);
                                        ov0Var4 = ov0Var5;
                                        ov0Var4.p(false);
                                    }
                                    bj2 bj2VarA2 = cj2.a(14.0f);
                                    b52 b52Var = hu.a;
                                    ov0 ov0Var6 = ov0Var4;
                                    n51.a(au0Var5, iw2.g(iw2.e(av1Var, 1.0f), 44.0f), false, bj2VarA2, hu.a(hz.c(0.6f, ((kz) ov0Var4.j(hh0Var)).r), ((kz) ov0Var4.j(hh0Var)).q, 0L, 0L, ov0Var6, 12), null, null, null, ji2.l, ov0Var6, 805306416, 484);
                                    ov0Var6.p(true);
                                } else {
                                    ov0Var5.W();
                                }
                                return mf3.a;
                            }
                        }, ov0Var3), ov0Var3, 196614, 16);
                    } else {
                        ov0Var3.W();
                    }
                    return mf3.a;
                }
            }, ov0Var2), ov0Var, ((i3 >> 15) & 14) | 432, 0);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: em2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gh0.g(appState, ul1Var, lr2Var, f2, f3, au0Var, (f30) obj, wc0.m0(i | 1));
                    return mf3.a;
                }
            };
        }
    }

    public static final void h(f30 f30Var, dv1 dv1Var) {
        lc lcVar = lc.j;
        ov0 ov0Var = (ov0) f30Var;
        int iHashCode = Long.hashCode(ov0Var.T);
        dv1 dv1VarH = xp1.H(f30Var, dv1Var);
        l72 l72VarL = ov0Var.l();
        w20.b.getClass();
        x30 x30Var = v20.b;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.g0();
        if (ov0Var2.S) {
            ov0Var2.k(x30Var);
        } else {
            ov0Var2.p0();
        }
        q73.h(f30Var, v20.e, lcVar);
        q73.h(f30Var, v20.d, l72VarL);
        q73.g(f30Var, v20.g);
        q73.h(f30Var, v20.c, dv1VarH);
        q73.h(f30Var, v20.f, Integer.valueOf(iHashCode));
        ov0Var2.p(true);
    }

    public static final void i(GithubRelease githubRelease, au0 au0Var, au0 au0Var2, lu0 lu0Var, f30 f30Var, int i) {
        au0Var.getClass();
        au0Var2.getClass();
        lu0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1712564956);
        int i2 = i | (ov0Var.h(githubRelease) ? 4 : 2) | (ov0Var.h(au0Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(lu0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zF = ov0Var.f(githubRelease.getVersionName());
            Object objQ = ov0Var.Q();
            if (zF || objQ == d30.a) {
                objQ = l13.q0(l13.q0(l13.D0(githubRelease.getVersionName()).toString(), "v"), "V");
                ov0Var.m0(objQ);
            }
            sb.F(au0Var, null, sb.a0(-2114864581, new j3(githubRelease, (String) objQ, lu0Var, au0Var, au0Var2, 4), ov0Var), ov0Var, 390, 2);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new lr1(githubRelease, au0Var, au0Var2, lu0Var, i);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int j(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -2005545810:
                if (str.equals("device_already_bound")) {
                    return 2131623975;
                }
                break;
            case -696607671:
                if (str.equals("hardware_conflict")) {
                    return 2131624506;
                }
                break;
            case -99941038:
                if (str.equals("hardware_confirmation_required")) {
                    return 2131624506;
                }
                break;
            case 16868759:
                if (str.equals("device_mismatch")) {
                    return 2131623975;
                }
                break;
            case 340179968:
                if (str.equals("companion_in_use")) {
                    return 2131623963;
                }
                break;
            case 656573547:
                if (str.equals("device_key_changed")) {
                    return 2131623975;
                }
                break;
            case 680342597:
                if (str.equals("account_already_bound")) {
                    return 2131623975;
                }
                break;
            case 1079803990:
                if (str.equals("client_upgrade_required")) {
                    return 2131623994;
                }
                break;
            case 1354599573:
                if (str.equals("device_switch_pending")) {
                    return 2131623989;
                }
                break;
            case 2040370449:
                if (str.equals("device_binding_mismatch")) {
                    return 2131623975;
                }
                break;
        }
        return ji2.A(str);
    }

    public static final void k(v53 v53Var, final Context context, final boolean z, final CharSequence charSequence, final long j) {
        if (f93.c(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) da0.P.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        v53Var.a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            v53Var.a.a(new e63(new ic2(i), resolveInfo.loadLabel(packageManager).toString(), 0, new lu0() { // from class: jc2
                @Override // defpackage.lu0
                public final Object invoke(Object obj) {
                    da0.Q.b(context, resolveInfo, Boolean.valueOf(z), charSequence, new f93(j));
                    ((k63) obj).close();
                    return mf3.a;
                }
            }));
        }
        v53Var.a();
    }

    /* JADX WARN: Code duplicated, block: B:73:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x019c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static final Object l(ti tiVar, oi oiVar, long j, final lu0 lu0Var, r60 r60Var) {
        j33 j33Var;
        final we2 we2Var;
        final ti tiVar2;
        ti tiVar3;
        we2 we2Var2;
        Object objA;
        lu0 lu0Var2;
        ri riVar;
        ri riVar2;
        Object objA2;
        final oi oiVar2 = oiVar;
        j9 j9Var = j9.Q;
        if (r60Var instanceof j33) {
            j33Var = (j33) r60Var;
            int i = j33Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                j33Var.j = i - Integer.MIN_VALUE;
            } else {
                j33Var = new j33(r60Var);
            }
        } else {
            j33Var = new j33(r60Var);
        }
        j33 j33Var2 = j33Var;
        Object obj = j33Var2.i;
        int i2 = j33Var2.j;
        int i3 = 7;
        int i4 = 0;
        z70 z70Var = z70.e;
        if (i2 == 0) {
            ee0.J(obj);
            final Object objB = oiVar2.b(0L);
            final yi yiVarF = oiVar2.f(0L);
            we2Var = new we2();
            if (j == Long.MIN_VALUE) {
                try {
                    final float fA = A(j33Var2.getContext());
                    tiVar2 = tiVar;
                    try {
                        lu0 lu0Var3 = new lu0() { // from class: g33
                            @Override // defpackage.lu0
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                oi oiVar3 = oiVar2;
                                qd3 qd3VarD = oiVar3.d();
                                Object objE = oiVar3.e();
                                ti tiVar4 = tiVar2;
                                ri riVar3 = new ri(objB, qd3VarD, yiVarF, jLongValue, objE, jLongValue, new h33(1, tiVar4));
                                gh0.v(riVar3, jLongValue, fA, oiVar3, tiVar4, lu0Var);
                                we2Var.e = riVar3;
                                return mf3.a;
                            }
                        };
                        we2Var2 = we2Var;
                        try {
                            j33Var2.e = tiVar2;
                            j33Var2.f = oiVar2;
                            j33Var2.g = lu0Var;
                            j33Var2.h = we2Var2;
                            j33Var2.j = 1;
                            if (!oiVar2.a()) {
                                objA = mh0.K(j33Var2.getContext()).a(new am0(i3, lu0Var3), j33Var2);
                            } else {
                                if (j33Var2.getContext().get(j9Var) != null) {
                                    throw new ClassCastException();
                                }
                                objA = mh0.K(j33Var2.getContext()).a(lu0Var3, j33Var2);
                            }
                            if (objA != z70Var) {
                                tiVar3 = tiVar2;
                                lu0Var2 = lu0Var;
                                we2Var = we2Var2;
                            }
                            return z70Var;
                        } catch (CancellationException e2) {
                            e = e2;
                            tiVar3 = tiVar2;
                            we2Var = we2Var2;
                            riVar = (ri) we2Var.e;
                            if (riVar != null) {
                                riVar.i.setValue(Boolean.FALSE);
                            }
                            riVar2 = (ri) we2Var.e;
                            if (riVar2 != null && riVar2.g == tiVar3.h) {
                                tiVar3.j = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        tiVar3 = tiVar2;
                        riVar = (ri) we2Var.e;
                        if (riVar != null) {
                            riVar.i.setValue(Boolean.FALSE);
                        }
                        riVar2 = (ri) we2Var.e;
                        if (riVar2 != null) {
                            tiVar3.j = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e4) {
                    e = e4;
                    tiVar2 = tiVar;
                }
            } else {
                we2Var2 = we2Var;
                try {
                    ri riVar3 = new ri(objB, oiVar2.d(), yiVarF, j, oiVar2.e(), j, new h33(i4, tiVar));
                    v(riVar3, j, A(j33Var2.getContext()), oiVar2, tiVar, lu0Var);
                    we2Var2.e = riVar3;
                    tiVar3 = tiVar;
                    oiVar2 = oiVar;
                    lu0Var2 = lu0Var;
                    we2Var = we2Var2;
                } catch (CancellationException e5) {
                    e = e5;
                    tiVar3 = tiVar;
                    we2Var = we2Var2;
                    riVar = (ri) we2Var.e;
                    if (riVar != null) {
                        riVar.i.setValue(Boolean.FALSE);
                    }
                    riVar2 = (ri) we2Var.e;
                    if (riVar2 != null) {
                        tiVar3.j = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            we2Var = j33Var2.h;
            lu0Var2 = j33Var2.g;
            oiVar2 = j33Var2.f;
            tiVar3 = j33Var2.e;
            try {
                ee0.J(obj);
            } catch (CancellationException e6) {
                e = e6;
                riVar = (ri) we2Var.e;
                if (riVar != null) {
                    riVar.i.setValue(Boolean.FALSE);
                }
                riVar2 = (ri) we2Var.e;
                if (riVar2 != null) {
                    tiVar3.j = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = we2Var.e;
            obj2.getClass();
            if (!((Boolean) ((ri) obj2).i.getValue()).booleanValue()) {
                return mf3.a;
            }
            final float fA2 = A(j33Var2.getContext());
            final we2 we2Var3 = we2Var;
            final lu0 lu0Var4 = lu0Var2;
            final oi oiVar3 = oiVar2;
            final ti tiVar4 = tiVar3;
            try {
                lu0 lu0Var5 = new lu0() { // from class: i33
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = we2Var3.e;
                        obj4.getClass();
                        gh0.v((ri) obj4, jLongValue, fA2, oiVar3, tiVar4, lu0Var4);
                        return mf3.a;
                    }
                };
                we2Var = we2Var3;
                oiVar2 = oiVar3;
                tiVar3 = tiVar4;
                lu0Var2 = lu0Var4;
                j33Var2.e = tiVar3;
                j33Var2.f = oiVar2;
                j33Var2.g = lu0Var2;
                j33Var2.h = we2Var;
                j33Var2.j = 2;
                if (!oiVar2.a()) {
                    objA2 = mh0.K(j33Var2.getContext()).a(new am0(i3, lu0Var5), j33Var2);
                } else {
                    if (j33Var2.getContext().get(j9Var) != null) {
                        throw new ClassCastException();
                    }
                    objA2 = mh0.K(j33Var2.getContext()).a(lu0Var5, j33Var2);
                }
            } catch (CancellationException e7) {
                e = e7;
                we2Var = we2Var3;
                tiVar3 = tiVar4;
                riVar = (ri) we2Var.e;
                if (riVar != null) {
                    riVar.i.setValue(Boolean.FALSE);
                }
                riVar2 = (ri) we2Var.e;
                if (riVar2 != null) {
                    tiVar3.j = false;
                }
                throw e;
            }
        } while (objA2 != z70Var);
        return z70Var;
    }

    public static Object m(float f2, si siVar, pu0 pu0Var, k33 k33Var, int i) {
        if ((i & 8) != 0) {
            siVar = o51.D(0.0f, 0.0f, null, 7);
        }
        si siVar2 = siVar;
        qd3 qd3Var = o51.v0;
        Float f3 = new Float(0.0f);
        Float f4 = new Float(f2);
        Float f5 = new Float(0.0f);
        lu0 lu0Var = qd3Var.a;
        yi yiVarC = (yi) lu0Var.invoke(f5);
        if (yiVarC == null) {
            yiVarC = ((yi) lu0Var.invoke(f3)).c();
        }
        yi yiVar = yiVarC;
        Object objL = l(new ti(qd3Var, f3, yiVar, 56), new h53(siVar2, qd3Var, f3, f4, yiVar), Long.MIN_VALUE, new ge2(pu0Var, 16), k33Var);
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        if (objL != z70Var) {
            objL = mf3Var;
        }
        return objL == z70Var ? objL : mf3Var;
    }

    public static final Object n(ti tiVar, Float f2, si siVar, boolean z, lu0 lu0Var, r60 r60Var) {
        Object objL = l(tiVar, new h53(siVar, tiVar.e, tiVar.f.getValue(), f2, tiVar.g), z ? tiVar.h : Long.MIN_VALUE, lu0Var, r60Var);
        return objL == z70.e ? objL : mf3.a;
    }

    public static /* synthetic */ Object o(ti tiVar, Float f2, yz2 yz2Var, boolean z, lu0 lu0Var, r60 r60Var, int i) {
        if ((i & 2) != 0) {
            yz2Var = o51.D(0.0f, 0.0f, null, 7);
        }
        yz2 yz2Var2 = yz2Var;
        if ((i & 8) != 0) {
            lu0Var = new ym2(22);
        }
        return n(tiVar, f2, yz2Var2, z, lu0Var, r60Var);
    }

    public static final int p(float f2) {
        return Math.round((float) Math.ceil(f2));
    }

    public static final void q(int i, int i2) {
        if (i < 0 || i >= i2) {
            fo.p(p91.n("index: ", i, i2, ", size: "));
        }
    }

    public static final void r(int i, int i2) {
        if (i < 0 || i > i2) {
            fo.p(p91.n("index: ", i, i2, ", size: "));
        }
    }

    public static final void s(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            b81.n(p91.s("fromIndex: ", ", toIndex: ", i, i2, ", size: "), i3);
        } else {
            if (i <= i2) {
                return;
            }
            fo.i(p91.n("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    public static final long t(long j, fh0 fh0Var) {
        long j2;
        int iOrdinal = fh0Var.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                fo.o(fh0Var, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    public static boolean u(f91 f91Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (f91Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return f91Var.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!d) {
                            try {
                                e = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            d = true;
                        }
                        Method method = e;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (yi3.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        g = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f = true;
                }
                Field field = g;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (yi3.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && yi3.c(view, keyEvent)) || f91Var.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final void v(ri riVar, long j, float f2, oi oiVar, ti tiVar, lu0 lu0Var) {
        long jC = f2 == 0.0f ? oiVar.c() : (long) ((j - riVar.c) / f2);
        riVar.g = j;
        riVar.e.setValue(oiVar.b(jC));
        riVar.f = oiVar.f(jC);
        if (oiVar.g(jC)) {
            riVar.h = riVar.g;
            riVar.i.setValue(Boolean.FALSE);
        }
        R(riVar, tiVar);
        lu0Var.invoke(riVar);
    }

    public static final float w(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / 3)) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final int x(int i, ld1 ld1Var, Object obj) {
        int iE;
        return (obj == null || ld1Var.c() == 0 || (i < ld1Var.c() && obj.equals(ld1Var.d(i))) || (iE = ld1Var.d.e(obj)) == -1) ? i : iE;
    }

    public static final void y(List list, LinkedHashSet linkedHashSet) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iv1 iv1Var = (iv1) it.next();
            linkedHashSet.add(iv1Var);
            y(iv1Var.e, linkedHashSet);
        }
    }

    public static final long z(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public abstract void I(Throwable th);

    public abstract void J(mn2 mn2Var);
}
