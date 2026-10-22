package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h00 implements ei0 {
    public final dj a;
    public final int b;

    public h00(String str, int i) {
        this(new dj(str), i);
    }

    @Override // defpackage.ei0
    public final void a(mi0 mi0Var) {
        int i = mi0Var.d;
        dj djVar = this.a;
        if (i != -1) {
            mi0Var.d(i, mi0Var.e, djVar.f);
        } else {
            mi0Var.d(mi0Var.b, mi0Var.c, djVar.f);
        }
        int i2 = mi0Var.b;
        int i3 = mi0Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iV = mh0.v(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - djVar.f.length(), 0, mi0Var.a.c());
        mi0Var.f(iV, iV);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h00)) {
            return false;
        }
        h00 h00Var = (h00) obj;
        return o51.f(this.a.f, h00Var.a.f) && this.b == h00Var.b;
    }

    public final int hashCode() {
        return (this.a.f.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.f);
        sb.append("', newCursorPosition=");
        return az2.o(sb, this.b, ')');
    }

    public h00(dj djVar, int i) {
        this.a = djVar;
        this.b = i;
    }
}
