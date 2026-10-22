package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class hw2 extends hv1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public hw2(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw2)) {
            return false;
        }
        hw2 hw2Var = (hw2) obj;
        return td0.b(this.a, hw2Var.a) && td0.b(this.b, hw2Var.b) && td0.b(this.c, hw2Var.c) && td0.b(this.d, hw2Var.d) && this.e == hw2Var.e;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        jw2 jw2Var = new jw2();
        jw2Var.s = this.a;
        jw2Var.t = this.b;
        jw2Var.u = this.c;
        jw2Var.v = this.d;
        jw2Var.w = this.e;
        return jw2Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        jw2 jw2Var = (jw2) cv1Var;
        jw2Var.s = this.a;
        jw2Var.t = this.b;
        jw2Var.u = this.c;
        jw2Var.v = this.d;
        jw2Var.w = this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + az2.c(this.d, az2.c(this.c, az2.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public hw2(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
