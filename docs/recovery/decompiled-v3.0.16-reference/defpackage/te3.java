package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class te3 implements Comparable {
    public final int e;

    public /* synthetic */ te3(int i) {
        this.e = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return o51.m(this.e ^ Integer.MIN_VALUE, ((te3) obj).e ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof te3) {
            return this.e == ((te3) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final String toString() {
        return String.valueOf(((long) this.e) & 4294967295L);
    }
}
