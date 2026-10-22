package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ac0 implements xb0 {
    public final float e;
    public final float f;

    public ac0(float f, float f2) {
        this.e = f;
        this.f = f2;
    }

    @Override // defpackage.xb0
    public final float D() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac0)) {
            return false;
        }
        ac0 ac0Var = (ac0) obj;
        return Float.compare(this.e, ac0Var.e) == 0 && Float.compare(this.f, ac0Var.f) == 0;
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.e;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + (Float.hashCode(this.e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.e);
        sb.append(", fontScale=");
        return az2.n(sb, this.f, ')');
    }
}
