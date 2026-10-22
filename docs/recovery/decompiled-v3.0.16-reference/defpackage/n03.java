package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n03 implements si {
    public final si a;
    public final long b;

    public n03(ln0 ln0Var, long j) {
        this.a = ln0Var;
        this.b = j;
    }

    @Override // defpackage.si
    public final rh3 a(qd3 qd3Var) {
        return new o03(this.a.a(qd3Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n03)) {
            return false;
        }
        n03 n03Var = (n03) obj;
        return n03Var.b == this.b && o51.f(n03Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
