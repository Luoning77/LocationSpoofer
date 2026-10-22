package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ik3 implements mt1 {
    public final lr a;

    public ik3(lr lrVar) {
        this.a = lrVar;
    }

    @Override // defpackage.mt1
    public final int a(l41 l41Var, long j, int i, qa1 qa1Var) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (qa1Var == qa1.e ? 0.0f : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return mh0.v(this.a.a(i, i2, qa1Var), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ik3) && this.a.equals(((ik3) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
