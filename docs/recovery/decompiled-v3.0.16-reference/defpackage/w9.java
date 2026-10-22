package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w9 implements mt1 {
    public final nr a;
    public final nr b;
    public final int c;

    public w9(nr nrVar, nr nrVar2, int i) {
        this.a = nrVar;
        this.b = nrVar2;
        this.c = i;
    }

    @Override // defpackage.mt1
    public final int a(l41 l41Var, long j, int i, qa1 qa1Var) {
        int iA = this.b.a(0, l41Var.d(), qa1Var);
        int i2 = -this.a.a(0, i, qa1Var);
        qa1 qa1Var2 = qa1.e;
        int i3 = this.c;
        if (qa1Var != qa1Var2) {
            i3 = -i3;
        }
        return l41Var.a + iA + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9)) {
            return false;
        }
        w9 w9Var = (w9) obj;
        return this.a.equals(w9Var.a) && this.b.equals(w9Var.b) && this.c == w9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + az2.c(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return az2.o(sb, this.c, ')');
    }
}
