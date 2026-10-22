package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class et extends hv1 {
    public final gt a;

    public et(gt gtVar) {
        this.a = gtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof et) {
            return o51.f(this.a, ((et) obj).a);
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        ht htVar = new ht();
        htVar.s = this.a;
        return htVar;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ht htVar = (ht) cv1Var;
        gt gtVar = htVar.s;
        if (gtVar != null) {
            gtVar.a.j(htVar);
        }
        gt gtVar2 = this.a;
        if (gtVar2 != null) {
            gtVar2.a.b(htVar);
        }
        htVar.s = gtVar2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
