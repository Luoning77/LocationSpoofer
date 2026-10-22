package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jf2 extends dh0 {
    public final dh0 g;
    public final int h;

    public jf2(dh0 dh0Var, int i) {
        this.g = dh0Var;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jf2)) {
            return false;
        }
        jf2 jf2Var = (jf2) obj;
        return jf2Var.g.equals(this.g) && jf2Var.h == this.h;
    }

    public final int hashCode() {
        return this.g.hashCode() + (this.h * 31);
    }
}
