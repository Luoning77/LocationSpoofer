package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lr implements k9 {
    public final float a;

    public lr(float f) {
        this.a = f;
    }

    @Override // defpackage.k9
    public final int a(int i, int i2, qa1 qa1Var) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lr) && Float.compare(this.a, ((lr) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return az2.n(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
