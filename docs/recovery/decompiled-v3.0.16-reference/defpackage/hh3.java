package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hh3 implements sk3 {
    public final String a;
    public final w52 b;

    public hh3(s31 s31Var, String str) {
        this.a = str;
        this.b = ke0.H(s31Var);
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

    public final s31 e() {
        return (s31) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hh3) {
            return o51.f(e(), ((hh3) obj).e());
        }
        return false;
    }

    public final void f(s31 s31Var) {
        this.b.setValue(s31Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return az2.o(sb, e().d, ')');
    }
}
