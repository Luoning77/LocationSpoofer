package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uh1 {
    public static final uh1 b = new uh1(new vh1(new LocaleList(new Locale[0])));
    public final vh1 a;

    public uh1(vh1 vh1Var) {
        this.a = vh1Var;
    }

    public static uh1 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = th1.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new uh1(new vh1(new LocaleList(localeArr)));
    }

    public final boolean b() {
        return this.a.a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uh1) {
            return this.a.equals(((uh1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
