package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k83 {
    public static final k83 c = new k83(v63.c(0), v63.c(0));
    public final long a;
    public final long b;

    public k83(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k83)) {
            return false;
        }
        k83 k83Var = (k83) obj;
        return w93.a(this.a, k83Var.a) && w93.a(this.b, k83Var.b);
    }

    public final int hashCode() {
        x93[] x93VarArr = w93.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) w93.d(this.a)) + ", restLine=" + ((Object) w93.d(this.b)) + ')';
    }
}
