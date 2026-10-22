package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bf implements v92 {
    public final int b;

    public bf(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!bf.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((bf) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return az2.o(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
