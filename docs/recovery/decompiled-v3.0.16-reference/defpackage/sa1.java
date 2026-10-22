package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sa1 {
    public final int a;
    public final int b;
    public final boolean c;

    public sa1(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa1)) {
            return false;
        }
        sa1 sa1Var = (sa1) obj;
        return this.a == sa1Var.a && this.b == sa1Var.b && this.c == sa1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + p91.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
    }
}
