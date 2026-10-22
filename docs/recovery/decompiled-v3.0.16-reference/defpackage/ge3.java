package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ge3 {
    public final l43 a;
    public final jr0 b;
    public final int c;
    public final int d;
    public final Object e;

    public ge3(l43 l43Var, jr0 jr0Var, int i, int i2, Object obj) {
        this.a = l43Var;
        this.b = jr0Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge3)) {
            return false;
        }
        ge3 ge3Var = (ge3) obj;
        return o51.f(this.a, ge3Var.a) && o51.f(this.b, ge3Var.b) && this.c == ge3Var.c && this.d == ge3Var.d && o51.f(this.e, ge3Var.e);
    }

    public final int hashCode() {
        l43 l43Var = this.a;
        int iB = p91.b(this.d, p91.b(this.c, (((l43Var == null ? 0 : l43Var.hashCode()) * 31) + this.b.e) * 31, 31), 31);
        Object obj = this.e;
        return iB + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
