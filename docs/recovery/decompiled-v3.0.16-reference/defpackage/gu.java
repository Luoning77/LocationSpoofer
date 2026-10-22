package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gu {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public gu(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final gu a(long j, long j2, long j3, long j4) {
        return new gu(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gu)) {
            return false;
        }
        gu guVar = (gu) obj;
        long j = guVar.a;
        int i = hz.h;
        return ye3.a(this.a, j) && ye3.a(this.b, guVar.b) && ye3.a(this.c, guVar.c) && ye3.a(this.d, guVar.d);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.d) + p91.c(p91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
