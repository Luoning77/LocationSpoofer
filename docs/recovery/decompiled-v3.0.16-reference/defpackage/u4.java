package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public u4(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return this.a == u4Var.a && this.b == u4Var.b && this.c == u4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + p91.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "AccountFormValidation(passwordTooShort=" + this.a + ", passwordsDiffer=" + this.b + ", canSubmit=" + this.c + ")";
    }
}
