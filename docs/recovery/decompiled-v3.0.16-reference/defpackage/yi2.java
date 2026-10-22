package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yi2 {
    public final String a;
    public final int b;
    public final int c;
    public final long d;

    public yi2(String str, int i, int i2, long j) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        Pattern patternCompile = Pattern.compile("[A-Za-z][A-Za-z0-9_]*(\\.[A-Za-z][A-Za-z0-9_]*)+");
        patternCompile.getClass();
        if (!patternCompile.matcher(str).matches()) {
            fo.i("Failed requirement.");
            throw null;
        }
        if (i <= 0 || i2 < 10000 || j <= 0) {
            fo.i("Failed requirement.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi2)) {
            return false;
        }
        yi2 yi2Var = (yi2) obj;
        return this.a.equals(yi2Var.a) && this.b == yi2Var.b && this.c == yi2Var.c && this.d == yi2Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + p91.b(this.c, p91.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "RootProtectedProcess(packageName=" + this.a + ", pid=" + this.b + ", uid=" + this.c + ", startTicks=" + this.d + ")";
    }
}
