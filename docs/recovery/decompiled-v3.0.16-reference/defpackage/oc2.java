package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oc2 {
    public static final oc2 d = new oc2(0.0f, new fy(0.0f, 0.0f), 0);
    public final float a;
    public final fy b;
    public final int c;

    public oc2(float f, fy fyVar, int i) {
        this.a = f;
        this.b = fyVar;
        this.c = i;
        if (Float.isNaN(f)) {
            fo.i("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2)) {
            return false;
        }
        oc2 oc2Var = (oc2) obj;
        return this.a == oc2Var.a && o51.f(this.b, oc2Var.b) && this.c == oc2Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return az2.o(sb, this.c, ')');
    }
}
