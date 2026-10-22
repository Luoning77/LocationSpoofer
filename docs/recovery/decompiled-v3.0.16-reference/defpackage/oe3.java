package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oe3 implements Comparable {
    public final byte e;

    public /* synthetic */ oe3(byte b) {
        this.e = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return o51.m(this.e & 255, ((oe3) obj).e & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oe3) {
            return this.e == ((oe3) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.e);
    }

    public final String toString() {
        return String.valueOf(this.e & 255);
    }
}
