package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gu2 {
    public final bj2 a;
    public final bj2 b;
    public final bj2 c;
    public final bj2 d;
    public final bj2 e;
    public final bj2 f;
    public final bj2 g;
    public final bj2 h;

    public gu2() {
        bj2 bj2Var = bu2.a;
        bj2 bj2Var2 = bu2.b;
        bj2 bj2Var3 = bu2.c;
        bj2 bj2Var4 = bu2.d;
        bj2 bj2Var5 = bu2.f;
        bj2 bj2Var6 = bu2.e;
        bj2 bj2Var7 = bu2.g;
        bj2 bj2Var8 = bu2.h;
        this.a = bj2Var;
        this.b = bj2Var2;
        this.c = bj2Var3;
        this.d = bj2Var4;
        this.e = bj2Var5;
        this.f = bj2Var6;
        this.g = bj2Var7;
        this.h = bj2Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu2)) {
            return false;
        }
        gu2 gu2Var = (gu2) obj;
        return o51.f(this.a, gu2Var.a) && o51.f(this.b, gu2Var.b) && o51.f(this.c, gu2Var.c) && o51.f(this.d, gu2Var.d) && o51.f(this.e, gu2Var.e) && o51.f(this.f, gu2Var.f) && o51.f(this.g, gu2Var.g) && o51.f(this.h, gu2Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
