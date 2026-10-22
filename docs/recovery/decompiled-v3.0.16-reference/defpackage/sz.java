package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sz implements i83 {
    public final long a;

    public sz(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        q21.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.i83
    public final long a() {
        return this.a;
    }

    @Override // defpackage.i83
    public final st b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz)) {
            return false;
        }
        long j = ((sz) obj).a;
        int i = hz.h;
        return ye3.a(this.a, j);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.a);
    }

    @Override // defpackage.i83
    public final float s() {
        return hz.d(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) hz.i(this.a)) + ')';
    }
}
