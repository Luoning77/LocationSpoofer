package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kh implements sk3 {
    public final int a;
    public final String b;
    public final w52 c = ke0.H(j31.e);
    public final w52 d = ke0.H(Boolean.TRUE);

    public kh(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.sk3
    public final int a(xb0 xb0Var) {
        return e().d;
    }

    @Override // defpackage.sk3
    public final int b(xb0 xb0Var) {
        return e().b;
    }

    @Override // defpackage.sk3
    public final int c(xb0 xb0Var, qa1 qa1Var) {
        return e().c;
    }

    @Override // defpackage.sk3
    public final int d(xb0 xb0Var, qa1 qa1Var) {
        return e().a;
    }

    public final j31 e() {
        return (j31) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kh) {
            return this.a == ((kh) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(ql3 ql3Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(ql3Var.a.g(i2));
            f(ql3Var.a.q(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return az2.o(sb, e().d, ')');
    }
}
