package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class yf3 extends hv1 {
    public final float a;
    public final float b;

    public yf3(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yf3)) {
            return false;
        }
        yf3 yf3Var = (yf3) obj;
        return td0.b(this.a, yf3Var.a) && td0.b(this.b, yf3Var.b);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        zf3 zf3Var = new zf3();
        zf3Var.s = this.a;
        zf3Var.t = this.b;
        return zf3Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        zf3 zf3Var = (zf3) cv1Var;
        zf3Var.s = this.a;
        zf3Var.t = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
