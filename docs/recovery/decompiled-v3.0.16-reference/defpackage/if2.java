package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class if2 implements Serializable {
    public final Pattern e;

    public if2(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.e = patternCompile;
    }

    public final vq1 a(String str) {
        Matcher matcher = this.e.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new vq1(matcher, str);
        }
        return null;
    }

    public final boolean b(CharSequence charSequence) {
        charSequence.getClass();
        return this.e.matcher(charSequence).matches();
    }

    public final String toString() {
        String string = this.e.toString();
        string.getClass();
        return string;
    }
}
