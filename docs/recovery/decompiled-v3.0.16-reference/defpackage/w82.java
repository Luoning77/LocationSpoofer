package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w82 {
    public static final w82 c = new w82(0, false);
    public final boolean a;
    public final int b;

    public w82() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w82)) {
            return false;
        }
        w82 w82Var = (w82) obj;
        return this.a == w82Var.a && this.b == w82Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) kj0.a(this.b)) + ')';
    }

    public w82(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
