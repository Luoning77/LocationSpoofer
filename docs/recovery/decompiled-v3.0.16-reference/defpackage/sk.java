package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class sk {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static uh1 b(Configuration configuration) {
        return uh1.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(uh1 uh1Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(uh1Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, uh1 uh1Var) {
        configuration.setLocales(LocaleList.forLanguageTags(uh1Var.a.a.toLanguageTags()));
    }
}
