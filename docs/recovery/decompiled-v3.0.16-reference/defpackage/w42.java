package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w42 implements mx {
    public final Class e;

    public w42(Class cls) {
        cls.getClass();
        this.e = cls;
    }

    @Override // defpackage.mx
    public final Class a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w42) {
            return o51.f(this.e, ((w42) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e.toString() + " (Kotlin reflection is not available)";
    }
}
