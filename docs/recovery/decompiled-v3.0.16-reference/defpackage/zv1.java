package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zv1 {
    public final long a;
    public final long b;
    public final boolean c;

    public zv1(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final zv1 a(zv1 zv1Var) {
        return new zv1(c12.e(this.a, zv1Var.a), Math.max(this.b, zv1Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1)) {
            return false;
        }
        zv1 zv1Var = (zv1) obj;
        return c12.b(this.a, zv1Var.a) && this.b == zv1Var.b && this.c == zv1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + p91.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) c12.g(this.a)) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ')';
    }
}
