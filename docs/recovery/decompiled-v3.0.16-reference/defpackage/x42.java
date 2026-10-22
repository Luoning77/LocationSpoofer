package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class x42 extends hv1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public x42(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            n21.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        x42 x42Var = obj instanceof x42 ? (x42) obj : null;
        return x42Var != null && td0.b(this.a, x42Var.a) && td0.b(this.b, x42Var.b) && td0.b(this.c, x42Var.c) && td0.b(this.d, x42Var.d);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        y42 y42Var = new y42();
        y42Var.s = this.a;
        y42Var.t = this.b;
        y42Var.u = this.c;
        y42Var.v = this.d;
        y42Var.w = true;
        return y42Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        y42 y42Var = (y42) cv1Var;
        y42Var.s = this.a;
        y42Var.t = this.b;
        y42Var.u = this.c;
        y42Var.v = this.d;
        y42Var.w = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + az2.c(this.d, az2.c(this.c, az2.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
