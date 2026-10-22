package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bc3 {
    public final dj a;
    public final e12 b;

    public bc3(dj djVar, e12 e12Var) {
        this.a = djVar;
        this.b = e12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc3)) {
            return false;
        }
        bc3 bc3Var = (bc3) obj;
        return o51.f(this.a, bc3Var.a) && this.b.equals(bc3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
