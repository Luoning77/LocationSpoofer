package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sd0 {
    public final int a;
    public final int b;
    public final float c;

    public sd0(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd0)) {
            return false;
        }
        sd0 sd0Var = (sd0) obj;
        return this.a == sd0Var.a && this.b == sd0Var.b && Float.compare(this.c, sd0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + p91.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbS = p91.s("DownScaleBlend(expLo=", ", expHi=", this.a, this.b, ", blend=");
        sbS.append(this.c);
        sbS.append(")");
        return sbS.toString();
    }
}
