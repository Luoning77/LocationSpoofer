package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bc0 implements xb0 {
    public final float e;
    public final float f;
    public final er0 g;

    public bc0(float f, float f2, er0 er0Var) {
        this.e = f;
        this.f = f2;
        this.g = er0Var;
    }

    @Override // defpackage.xb0
    public final float D() {
        return this.f;
    }

    @Override // defpackage.xb0
    public final long O(float f) {
        return v63.e(this.g.a(f), 4294967296L);
    }

    @Override // defpackage.xb0
    public final float e0(long j) {
        if (x93.a(w93.b(j), 4294967296L)) {
            return this.g.b(w93.c(j));
        }
        fo.n("Only Sp can convert to Px");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc0)) {
            return false;
        }
        bc0 bc0Var = (bc0) obj;
        return Float.compare(this.e, bc0Var.e) == 0 && Float.compare(this.f, bc0Var.f) == 0 && this.g.equals(bc0Var.g);
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.e;
    }

    public final int hashCode() {
        return this.g.hashCode() + az2.c(this.f, Float.hashCode(this.e) * 31, 31);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.e + ", fontScale=" + this.f + ", converter=" + this.g + ')';
    }
}
