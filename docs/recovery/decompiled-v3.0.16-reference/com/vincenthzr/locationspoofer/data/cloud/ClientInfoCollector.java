package com.vincenthzr.locationspoofer.data.cloud;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import defpackage.au0;
import defpackage.hd;
import defpackage.l13;
import defpackage.p4;
import defpackage.wg2;
import defpackage.yo;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ClientInfoCollector {
    private final Context context;

    public ClientInfoCollector(Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String collect$lambda$12(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return null;
    }

    private final String normalized(String str, int i) {
        String string;
        if (str == null || (string = l13.D0(str).toString()) == null) {
            return null;
        }
        if (string.length() <= 0) {
            string = null;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= string.length()) {
                Set setH0 = yo.H0(new String[]{"unknown", "null", "none"});
                String lowerCase = string.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (!setH0.contains(lowerCase)) {
                    break;
                }
                break;
            }
            if (!Character.isISOControl(string.charAt(i2))) {
                i2++;
            }
            string = null;
            break;
        }
        if (string != null) {
            return l13.B0(i, string);
        }
        return null;
    }

    private final String value(au0 au0Var) {
        Object wg2Var;
        try {
            wg2Var = au0Var.invoke();
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            wg2Var = null;
        }
        return normalized((String) wg2Var, 100);
    }

    public final CloudClientInfo collect() {
        Object wg2Var;
        Object wg2Var2;
        Object packageInfo;
        Object wg2Var3;
        Object objValueOf;
        Object wg2Var4;
        int iIntValue;
        try {
            wg2Var = this.context.getPackageName();
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            wg2Var = null;
        }
        String str = (String) wg2Var;
        if (str != null) {
            try {
                packageInfo = this.context.getPackageManager().getPackageInfo(str, 0);
            } catch (Throwable th2) {
                wg2Var2 = new wg2(th2);
            }
        } else {
            packageInfo = null;
        }
        wg2Var2 = packageInfo;
        if (wg2Var2 instanceof wg2) {
            wg2Var2 = null;
        }
        PackageInfo packageInfo2 = (PackageInfo) wg2Var2;
        if (packageInfo2 != null) {
            try {
                objValueOf = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo2.getLongVersionCode() : packageInfo2.versionCode);
            } catch (Throwable th3) {
                wg2Var3 = new wg2(th3);
            }
        } else {
            objValueOf = null;
        }
        wg2Var3 = objValueOf;
        if (wg2Var3 instanceof wg2) {
            wg2Var3 = null;
        }
        Long l = (Long) wg2Var3;
        Long l2 = (l == null || l.longValue() < 0) ? null : l;
        String strValue = value(new p4(11));
        try {
            wg2Var4 = Integer.valueOf(Build.VERSION.SDK_INT);
        } catch (Throwable th4) {
            wg2Var4 = new wg2(th4);
        }
        if (wg2Var4 instanceof wg2) {
            wg2Var4 = null;
        }
        Integer num = (Integer) wg2Var4;
        return new CloudClientInfo("Android", strValue, (num == null || 1 > (iIntValue = num.intValue()) || iIntValue >= 1001) ? null : num, value(new p4(12)), value(new p4(13)), value(new p4(14)), value(new hd(packageInfo2, 6)), l2, normalized(str, 200));
    }
}
