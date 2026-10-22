package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j72 implements u70 {
    public final float a;

    public j72(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            s21.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.u70
    public final float a(long j, xb0 xb0Var) {
        return (this.a / 100.0f) * cw2.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j72) && Float.compare(this.a, ((j72) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
