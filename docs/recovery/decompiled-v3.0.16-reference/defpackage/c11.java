package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c11 {
    public static final c11 g = new c11(false, 0, true, 1, 1, sh1.g);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final sh1 f;

    public c11(boolean z, int i, boolean z2, int i2, int i3, sh1 sh1Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = sh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c11)) {
            return false;
        }
        c11 c11Var = (c11) obj;
        return this.a == c11Var.a && this.b == c11Var.b && this.c == c11Var.c && this.d == c11Var.d && this.e == c11Var.e && o51.f(this.f, c11Var.f);
    }

    public final int hashCode() {
        return this.f.e.hashCode() + p91.b(this.e, p91.b(this.d, p91.e(p91.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.a);
        sb.append(", capitalization=");
        int i = this.b;
        if (i == -1) {
            str = "Unspecified";
        } else if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Characters";
        } else if (i == 2) {
            str = "Words";
        } else {
            str = i == 3 ? "Sentences" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", autoCorrect=");
        sb.append(this.c);
        sb.append(", keyboardType=");
        sb.append((Object) o91.a(this.d));
        sb.append(", imeAction=");
        sb.append((Object) b11.a(this.e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
