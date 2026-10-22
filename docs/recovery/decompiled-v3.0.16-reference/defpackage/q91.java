package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q91 {
    public final Float a;
    public jh0 b;

    public q91(Float f, jh0 jh0Var) {
        this.a = f;
        this.b = jh0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q91)) {
            return false;
        }
        q91 q91Var = (q91) obj;
        return q91Var.a.equals(this.a) && o51.f(q91Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + p91.b(0, this.a.hashCode() * 31, 31);
    }
}
