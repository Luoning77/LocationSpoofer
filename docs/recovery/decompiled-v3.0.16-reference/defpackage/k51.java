package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class k51 extends hv1 {
    public final i51 a;

    public k51(i51 i51Var) {
        this.a = i51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        k51 k51Var = obj instanceof k51 ? (k51) obj : null;
        return k51Var != null && this.a == k51Var.a;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        m51 m51Var = new m51(0);
        m51Var.t = this.a;
        m51Var.u = true;
        return m51Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        m51 m51Var = (m51) cv1Var;
        m51Var.t = this.a;
        m51Var.u = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }
}
