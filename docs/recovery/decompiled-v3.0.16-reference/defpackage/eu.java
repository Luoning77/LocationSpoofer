package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class eu {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            p1.a(30);
        }
        if (i >= 30) {
            p1.a(31);
        }
        if (i >= 30) {
            p1.a(33);
        }
        if (i >= 30) {
            p1.a(1000000);
        }
    }

    public static final boolean a() {
        Integer num = 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i >= 32) {
            String str = Build.VERSION.CODENAME;
            str.getClass();
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                String upperCase = str.toUpperCase(locale);
                upperCase.getClass();
                Integer num2 = upperCase.equals("BAKLAVA") ? num : null;
                String upperCase2 = "Tiramisu".toUpperCase(locale);
                upperCase2.getClass();
                num = upperCase2.equals("BAKLAVA") ? 0 : null;
                if (num2 == null || num == null) {
                    if (num2 == null && num == null) {
                        String upperCase3 = str.toUpperCase(locale);
                        upperCase3.getClass();
                        String upperCase4 = "Tiramisu".toUpperCase(locale);
                        upperCase4.getClass();
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    } else if (num2 != null) {
                        return true;
                    }
                } else if (num2.intValue() >= num.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
