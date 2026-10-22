package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hm0 implements sk3 {
    public final sk3 a;
    public final sk3 b;

    public hm0(sk3 sk3Var, sk3 sk3Var2) {
        this.a = sk3Var;
        this.b = sk3Var2;
    }

    @Override // defpackage.sk3
    public final int a(xb0 xb0Var) {
        int iA = this.a.a(xb0Var) - this.b.a(xb0Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.sk3
    public final int b(xb0 xb0Var) {
        int iB = this.a.b(xb0Var) - this.b.b(xb0Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.sk3
    public final int c(xb0 xb0Var, qa1 qa1Var) {
        int iC = this.a.c(xb0Var, qa1Var) - this.b.c(xb0Var, qa1Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.sk3
    public final int d(xb0 xb0Var, qa1 qa1Var) {
        int iD = this.a.d(xb0Var, qa1Var) - this.b.d(xb0Var, qa1Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm0)) {
            return false;
        }
        hm0 hm0Var = (hm0) obj;
        return o51.f(hm0Var.a, this.a) && o51.f(hm0Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
