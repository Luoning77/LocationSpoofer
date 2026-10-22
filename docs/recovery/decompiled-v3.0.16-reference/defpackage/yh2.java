package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class yh2 {
    public static final List a = am1.G("ro.mi.os.version.name", "ro.mi.os.version.code", "ro.miui.ui.version.name", "ro.miui.ui.version.code", "ro.build.version.oplusrom", "ro.build.version.opporom", "ro.oplus.image.my_product.type", "ro.build.version.oneui", "ro.build.version.sem", "ro.vivo.os.version", "ro.vivo.product.series", "ro.build.version.emui", "ro.build.version.magic", "ro.flyme.published", "persist.sys.flyme.pushsdk");
    public static final Set b = yo.H0(new String[]{"xiaomi", "redmi", "poco"});
    public static final Set c = yo.H0(new String[]{"oppo", "oneplus", "realme"});
    public static final Set d = yo.H0(new String[]{"vivo", "iqoo"});
    public static final Set e = yo.H0(new String[]{"huawei", "honor"});

    public static wh2 a(di3 di3Var) {
        String str = di3Var.a;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = di3Var.b.toLowerCase(locale);
        lowerCase2.getClass();
        Set setH0 = yo.H0(new String[]{lowerCase, lowerCase2});
        if (di3Var.a("ro.mi.os.version.name") || di3Var.a("ro.miui.ui.version.name") || b(setH0, b)) {
            return wh2.g;
        }
        if (di3Var.a("ro.build.version.oplusrom") || di3Var.a("ro.build.version.opporom") || b(setH0, c)) {
            return wh2.h;
        }
        if (di3Var.a("ro.build.version.oneui") || b(setH0, mc0.H("samsung"))) {
            return wh2.i;
        }
        if (di3Var.a("ro.vivo.os.version") || b(setH0, d)) {
            return wh2.j;
        }
        if (di3Var.a("ro.build.version.magic") || di3Var.a("ro.build.version.emui") || b(setH0, e)) {
            return wh2.k;
        }
        return (di3Var.a("ro.flyme.published") || b(setH0, mc0.H("meizu"))) ? wh2.l : wh2.f;
    }

    public static final boolean b(Set set, Set set2) {
        Set set3 = set;
        if ((set3 instanceof Collection) && set3.isEmpty()) {
            return false;
        }
        Iterator it = set3.iterator();
        while (it.hasNext()) {
            if (set2.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String c(di3 di3Var) {
        wh2 wh2VarA = a(di3Var);
        return (xh2.a[wh2VarA.ordinal()] == 1 && !di3Var.a("ro.mi.os.version.name") && di3Var.a("ro.miui.ui.version.name")) ? "MIUI" : wh2VarA.e;
    }
}
