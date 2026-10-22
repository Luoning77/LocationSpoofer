package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uf1 implements er0 {
    public final float a;

    public uf1(float f) {
        this.a = f;
    }

    @Override // defpackage.er0
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.er0
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uf1) && Float.compare(this.a, ((uf1) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return az2.n(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
