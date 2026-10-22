package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pv0 implements q30 {
    public final n30 e;

    public pv0(n30 n30Var) {
        this.e = n30Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pv0) {
            return this.e.equals(((pv0) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() * 31;
    }
}
