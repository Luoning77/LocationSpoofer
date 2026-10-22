package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zv {
    public final long a;
    public final long b;

    public zv(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv)) {
            return false;
        }
        zv zvVar = (zv) obj;
        long j = zvVar.a;
        int i = hz.h;
        return ye3.a(this.a, j) && ye3.a(this.b, zvVar.b);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return az2.l("CardColors(color=", hz.i(this.a), ", contentColor=", hz.i(this.b), ")");
    }
}
