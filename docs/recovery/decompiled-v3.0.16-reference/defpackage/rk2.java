package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rk2 {
    public final String a;
    public final String b;

    public rk2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk2)) {
            return false;
        }
        rk2 rk2Var = (rk2) obj;
        return o51.f(this.a, rk2Var.a) && o51.f(this.b, rk2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return az2.l("RuntimePermitEnvelope(payload=", this.a, ", signature=", this.b, ")");
    }
}
