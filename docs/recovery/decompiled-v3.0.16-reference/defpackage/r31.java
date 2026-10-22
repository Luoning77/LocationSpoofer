package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class r31 implements z42 {
    public final sk3 a;
    public final h23 b;

    public r31(sk3 sk3Var, h23 h23Var) {
        this.a = sk3Var;
        this.b = h23Var;
    }

    @Override // defpackage.z42
    public final float a(qa1 qa1Var) {
        sk3 sk3Var = this.a;
        h23 h23Var = this.b;
        return h23Var.U0(sk3Var.d(h23Var, qa1Var));
    }

    @Override // defpackage.z42
    public final float b(qa1 qa1Var) {
        sk3 sk3Var = this.a;
        h23 h23Var = this.b;
        return h23Var.U0(sk3Var.c(h23Var, qa1Var));
    }

    @Override // defpackage.z42
    public final float c() {
        sk3 sk3Var = this.a;
        h23 h23Var = this.b;
        return h23Var.U0(sk3Var.a(h23Var));
    }

    @Override // defpackage.z42
    public final float d() {
        sk3 sk3Var = this.a;
        h23 h23Var = this.b;
        return h23Var.U0(sk3Var.b(h23Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r31)) {
            return false;
        }
        r31 r31Var = (r31) obj;
        return o51.f(this.a, r31Var.a) && this.b.equals(r31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
