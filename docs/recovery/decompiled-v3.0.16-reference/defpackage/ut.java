package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ut implements i83 {
    public final ut2 a;
    public final float b;

    public ut(ut2 ut2Var, float f) {
        this.a = ut2Var;
        this.b = f;
    }

    @Override // defpackage.i83
    public final long a() {
        int i = hz.h;
        return hz.g;
    }

    @Override // defpackage.i83
    public final st b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut)) {
            return false;
        }
        ut utVar = (ut) obj;
        return this.a.equals(utVar.a) && Float.compare(this.b, utVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.i83
    public final float s() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return az2.n(sb, this.b, ')');
    }
}
