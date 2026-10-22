package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fy implements gy {
    public final float e;
    public final float f;

    public fy(float f, float f2) {
        this.e = f;
        this.f = f2;
    }

    @Override // defpackage.gy
    public final Comparable a() {
        return Float.valueOf(this.e);
    }

    @Override // defpackage.gy
    public final Comparable b() {
        return Float.valueOf(this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fy)) {
            return false;
        }
        if (isEmpty() && ((fy) obj).isEmpty()) {
            return true;
        }
        fy fyVar = (fy) obj;
        return this.e == fyVar.e && this.f == fyVar.f;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.f) + (Float.hashCode(this.e) * 31);
    }

    @Override // defpackage.gy
    public final boolean isEmpty() {
        return this.e > this.f;
    }

    public final String toString() {
        return this.e + ".." + this.f;
    }
}
