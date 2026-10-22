package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class li3 implements wa1 {
    public final r73 a;
    public final int b;
    public final bc3 c;
    public final au0 d;

    public li3(r73 r73Var, int i, bc3 bc3Var, au0 au0Var) {
        this.a = r73Var;
        this.b = i;
        this.c = bc3Var;
        this.d = au0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof li3) {
            li3 li3Var = (li3) obj;
            if (this.a == li3Var.a && this.b == li3Var.b && this.c.equals(li3Var.c) && o51.f(this.d, li3Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + p91.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    @Override // defpackage.wa1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        h82 h82VarS = zq1Var.s(l50.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(h82VarS.f, l50.g(j));
        return gr1Var.H0(h82VarS.e, iMin, vj0.e, new de2(this, h82VarS, iMin));
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
