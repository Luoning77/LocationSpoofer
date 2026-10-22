package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class us extends hv1 {
    public final l9 a;

    public us(l9 l9Var) {
        this.a = l9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        us usVar = obj instanceof us ? (us) obj : null;
        return usVar != null && o51.f(this.a, usVar.a);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        vs vsVar = new vs();
        vsVar.s = this.a;
        return vsVar;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((vs) cv1Var).s = this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }
}
