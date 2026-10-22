package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ui extends yi {
    public float a;

    public ui(float f) {
        this.a = f;
    }

    @Override // defpackage.yi
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.yi
    public final int b() {
        return 1;
    }

    @Override // defpackage.yi
    public final yi c() {
        return new ui(0.0f);
    }

    @Override // defpackage.yi
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.yi
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ui) && ((ui) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
