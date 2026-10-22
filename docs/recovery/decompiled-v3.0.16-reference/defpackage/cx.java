package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cx extends hv1 {
    public final v1 a;

    public cx(v1 v1Var) {
        this.a = v1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cx) {
            return this.a == ((cx) obj).a;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        bx bxVar = new bx();
        bxVar.s = this.a;
        return bxVar;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        bx bxVar = (bx) cv1Var;
        bxVar.s = this.a;
        ee0.C(bxVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
