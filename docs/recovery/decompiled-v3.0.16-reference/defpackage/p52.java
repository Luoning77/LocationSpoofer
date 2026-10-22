package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p52 implements zi {
    public final int a;
    public final int b;
    public final long c;
    public final k83 d;
    public final w82 e;
    public final sf1 f;
    public final int g;
    public final int h;
    public final d93 i;

    public p52(int i, int i2, long j, k83 k83Var, w82 w82Var, sf1 sf1Var, int i3, int i4, d93 d93Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = k83Var;
        this.e = w82Var;
        this.f = sf1Var;
        this.g = i3;
        this.h = i4;
        this.i = d93Var;
        x93[] x93VarArr = w93.b;
        if (w93.a(j, w93.c)) {
            return;
        }
        if (w93.c(j) >= 0.0f) {
            return;
        }
        q21.b("lineHeight can't be negative (" + w93.c(j) + ')');
    }

    public final p52 a(p52 p52Var) {
        return p52Var == null ? this : q52.a(this, p52Var.a, p52Var.b, p52Var.c, p52Var.d, p52Var.e, p52Var.f, p52Var.g, p52Var.h, p52Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p52)) {
            return false;
        }
        p52 p52Var = (p52) obj;
        return this.a == p52Var.a && this.b == p52Var.b && w93.a(this.c, p52Var.c) && o51.f(this.d, p52Var.d) && o51.f(this.e, p52Var.e) && o51.f(this.f, p52Var.f) && this.g == p52Var.g && this.h == p52Var.h && o51.f(this.i, p52Var.i);
    }

    public final int hashCode() {
        int iB = p91.b(this.b, Integer.hashCode(this.a) * 31, 31);
        x93[] x93VarArr = w93.b;
        int iC = p91.c(iB, 31, this.c);
        k83 k83Var = this.d;
        int iHashCode = (iC + (k83Var != null ? k83Var.hashCode() : 0)) * 31;
        w82 w82Var = this.e;
        int iHashCode2 = (iHashCode + (w82Var != null ? w82Var.hashCode() : 0)) * 31;
        sf1 sf1Var = this.f;
        int iB2 = p91.b(this.h, p91.b(this.g, (iHashCode2 + (sf1Var != null ? sf1Var.hashCode() : 0)) * 31, 31), 31);
        d93 d93Var = this.i;
        return iB2 + (d93Var != null ? d93Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) m53.a(this.a)) + ", textDirection=" + ((Object) r63.a(this.b)) + ", lineHeight=" + ((Object) w93.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) nf1.a(this.g)) + ", hyphens=" + ((Object) c01.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
