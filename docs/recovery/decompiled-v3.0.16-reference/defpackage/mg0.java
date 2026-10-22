package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class mg0 extends hv1 {
    public final lu0 a;

    public mg0(lu0 lu0Var) {
        this.a = lu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mg0) {
            return this.a == ((mg0) obj).a;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new wu(new xu(), this.a);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        wu wuVar = (wu) cv1Var;
        wuVar.v = this.a;
        wuVar.m1();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
