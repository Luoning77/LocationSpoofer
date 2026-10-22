package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vq1 {
    public final Matcher a;
    public final String b;
    public uq1 c;

    public vq1(Matcher matcher, String str) {
        this.a = matcher;
        this.b = str;
    }

    public final List a() {
        uq1 uq1Var = this.c;
        if (uq1Var != null) {
            return uq1Var;
        }
        uq1 uq1Var2 = new uq1(this);
        this.c = uq1Var2;
        return uq1Var2;
    }

    public final k41 b() {
        Matcher matcher = this.a;
        return mh0.f0(matcher.start(), matcher.end());
    }

    public final vq1 c() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        String str = this.b;
        if (iEnd > str.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(str);
        matcher2.getClass();
        return dh0.o(matcher2, iEnd, str);
    }
}
