package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hy0 implements wa1 {
    public final r73 a;
    public final int b;
    public final bc3 c;
    public final au0 d;

    public hy0(r73 r73Var, int i, bc3 bc3Var, au0 au0Var) {
        this.a = r73Var;
        this.b = i;
        this.c = bc3Var;
        this.d = au0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hy0) {
            hy0 hy0Var = (hy0) obj;
            if (this.a == hy0Var.a && this.b == hy0Var.b && this.c.equals(hy0Var.c) && o51.f(this.d, hy0Var.d)) {
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
        long j2;
        if (zq1Var.s0(l50.g(j)) < l50.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = l50.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        h82 h82VarS = zq1Var.s(j);
        int iMin = Math.min(h82VarS.e, l50.h(j2));
        return gr1Var.H0(iMin, h82VarS.f, vj0.e, new f9(this, gr1Var, h82VarS, iMin));
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
