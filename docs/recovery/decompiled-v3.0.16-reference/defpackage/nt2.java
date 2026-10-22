package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nt2 implements ei0 {
    public final dj a;
    public final int b;

    public nt2(String str, int i) {
        this.a = new dj(str);
        this.b = i;
    }

    @Override // defpackage.ei0
    public final void a(mi0 mi0Var) {
        String str = this.a.f;
        int i = mi0Var.d;
        if (i != -1) {
            mi0Var.d(i, mi0Var.e, str);
            if (str.length() > 0) {
                mi0Var.e(i, str.length() + i);
            }
        } else {
            int i2 = mi0Var.b;
            mi0Var.d(i2, mi0Var.c, str);
            if (str.length() > 0) {
                mi0Var.e(i2, str.length() + i2);
            }
        }
        int i3 = mi0Var.b;
        int i4 = mi0Var.c;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.b;
        int iV = mh0.v(i6 > 0 ? (i5 + i6) - 1 : (i5 + i6) - str.length(), 0, mi0Var.a.c());
        mi0Var.f(iV, iV);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt2)) {
            return false;
        }
        nt2 nt2Var = (nt2) obj;
        return o51.f(this.a.f, nt2Var.a.f) && this.b == nt2Var.b;
    }

    public final int hashCode() {
        return (this.a.f.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.f);
        sb.append("', newCursorPosition=");
        return az2.o(sb, this.b, ')');
    }
}
