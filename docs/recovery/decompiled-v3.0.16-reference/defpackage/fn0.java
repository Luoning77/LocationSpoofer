package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fn0 extends hv1 {
    public final vc0 a;
    public final float b;

    public fn0(vc0 vc0Var, float f) {
        this.a = vc0Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn0)) {
            return false;
        }
        fn0 fn0Var = (fn0) obj;
        return this.a == fn0Var.a && this.b == fn0Var.b;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        hn0 hn0Var = new hn0();
        hn0Var.s = this.a;
        hn0Var.t = this.b;
        return hn0Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        hn0 hn0Var = (hn0) cv1Var;
        hn0Var.s = this.a;
        hn0Var.t = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
