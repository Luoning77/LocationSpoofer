package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ro2 extends hv1 {
    public final co2 a;
    public final boolean b;

    public ro2(co2 co2Var, boolean z) {
        this.a = co2Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ro2)) {
            return false;
        }
        ro2 ro2Var = (ro2) obj;
        return o51.f(this.a, ro2Var.a) && this.b == ro2Var.b;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        yn2 yn2Var = new yn2();
        yn2Var.s = this.a;
        yn2Var.t = this.b;
        return yn2Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        yn2 yn2Var = (yn2) cv1Var;
        yn2Var.s = this.a;
        yn2Var.t = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + p91.e(this.a.hashCode() * 31, 31, false);
    }
}
