package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import org.maplibre.android.MapLibre;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xz0 implements vz0 {
    public static final String b;
    public static volatile k12 c;
    public static volatile cv d;
    public dv a;

    static {
        String str;
        Context applicationContext = MapLibre.getApplicationContext();
        try {
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
            str = applicationContext.getPackageName() + "/" + packageInfo.versionName + " (" + packageInfo.versionCode + ")";
        } catch (Exception e) {
            xp1.Q(e);
            str = "";
        }
        String strY = str + " MapLibre Android/13.6.1 (c7506d6) Android/" + Build.VERSION.SDK_INT + " (" + Build.SUPPORTED_ABIS[0] + ")";
        int length = strY.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = strY.codePointAt(iCharCount);
            if (iCodePointAt <= 31 || iCodePointAt >= 127) {
                xt xtVar = new xt();
                xtVar.l0(0, iCharCount, strY);
                while (iCharCount < length) {
                    int iCodePointAt2 = strY.codePointAt(iCharCount);
                    xtVar.n0((iCodePointAt2 <= 31 || iCodePointAt2 >= 127) ? 63 : iCodePointAt2);
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                strY = xtVar.y();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        b = strY;
        c = null;
        d = null;
    }

    public static synchronized k12 a() {
        try {
            if (c == null) {
                j12 j12Var = new j12();
                yc0 yc0Var = new yc0();
                yc0Var.d(20);
                j12Var.a = yc0Var;
                c = new k12(j12Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }
}
