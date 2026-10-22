package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b52 implements z42 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public b52(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            n21.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.z42
    public final float a(qa1 qa1Var) {
        return qa1Var == qa1.e ? this.a : this.c;
    }

    @Override // defpackage.z42
    public final float b(qa1 qa1Var) {
        return qa1Var == qa1.e ? this.c : this.a;
    }

    @Override // defpackage.z42
    public final float c() {
        return this.d;
    }

    @Override // defpackage.z42
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b52)) {
            return false;
        }
        b52 b52Var = (b52) obj;
        return td0.b(this.a, b52Var.a) && td0.b(this.b, b52Var.b) && td0.b(this.c, b52Var.c) && td0.b(this.d, b52Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + az2.c(this.c, az2.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) td0.c(this.a)) + ", top=" + ((Object) td0.c(this.b)) + ", end=" + ((Object) td0.c(this.c)) + ", bottom=" + ((Object) td0.c(this.d)) + ')';
    }
}
