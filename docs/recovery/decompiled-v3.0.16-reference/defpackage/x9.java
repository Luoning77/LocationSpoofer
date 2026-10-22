package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x9 implements nt1 {
    public final or a;
    public final or b;
    public final int c;

    public x9(or orVar, or orVar2, int i) {
        this.a = orVar;
        this.b = orVar2;
        this.c = i;
    }

    @Override // defpackage.nt1
    public final int a(l41 l41Var, long j, int i) {
        int iA = this.b.a(0, l41Var.b());
        return l41Var.b + iA + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9)) {
            return false;
        }
        x9 x9Var = (x9) obj;
        return this.a.equals(x9Var.a) && this.b.equals(x9Var.b) && this.c == x9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + az2.c(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return az2.o(sb, this.c, ')');
    }
}
