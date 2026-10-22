package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ph2 {
    public final long a = hz.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph2)) {
            return false;
        }
        long j = ((ph2) obj).a;
        int i = hz.h;
        return ye3.a(this.a, j);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) hz.i(this.a)) + ", rippleAlpha=null)";
    }
}
