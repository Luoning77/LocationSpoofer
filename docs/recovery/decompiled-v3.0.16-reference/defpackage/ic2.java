package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ic2 {
    public final int a;

    public ic2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ic2) {
            return this.a == ((ic2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
