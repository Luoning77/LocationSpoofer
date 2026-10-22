package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class aw {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public aw(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof aw)) {
            return false;
        }
        aw awVar = (aw) obj;
        long j = awVar.a;
        int i = hz.h;
        return ye3.a(this.a, j) && ye3.a(this.b, awVar.b) && ye3.a(this.c, awVar.c) && ye3.a(this.d, awVar.d);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.d) + p91.c(p91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
