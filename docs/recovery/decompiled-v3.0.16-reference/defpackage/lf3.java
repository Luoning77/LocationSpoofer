package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lf3 implements sk3 {
    public final sk3 a;
    public final sk3 b;

    public lf3(sk3 sk3Var, sk3 sk3Var2) {
        this.a = sk3Var;
        this.b = sk3Var2;
    }

    @Override // defpackage.sk3
    public final int a(xb0 xb0Var) {
        return Math.max(this.a.a(xb0Var), this.b.a(xb0Var));
    }

    @Override // defpackage.sk3
    public final int b(xb0 xb0Var) {
        return Math.max(this.a.b(xb0Var), this.b.b(xb0Var));
    }

    @Override // defpackage.sk3
    public final int c(xb0 xb0Var, qa1 qa1Var) {
        return Math.max(this.a.c(xb0Var, qa1Var), this.b.c(xb0Var, qa1Var));
    }

    @Override // defpackage.sk3
    public final int d(xb0 xb0Var, qa1 qa1Var) {
        return Math.max(this.a.d(xb0Var, qa1Var), this.b.d(xb0Var, qa1Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf3)) {
            return false;
        }
        lf3 lf3Var = (lf3) obj;
        return o51.f(lf3Var.a, this.a) && o51.f(lf3Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
