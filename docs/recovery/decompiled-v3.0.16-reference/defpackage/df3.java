package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class df3 implements Comparable {
    public final short e;

    public /* synthetic */ df3(short s) {
        this.e = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return o51.m(this.e & 65535, ((df3) obj).e & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof df3) {
            return this.e == ((df3) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.e);
    }

    public final String toString() {
        return String.valueOf(this.e & 65535);
    }
}
