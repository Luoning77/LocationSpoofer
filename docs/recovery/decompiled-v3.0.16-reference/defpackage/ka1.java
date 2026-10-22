package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ka1 extends hv1 {
    public final ja1 a;

    public ka1(ja1 ja1Var) {
        ja1Var.getClass();
        this.a = ja1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka1)) {
            return false;
        }
        return o51.f(this.a, ((ka1) obj).a);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        ja1 ja1Var = this.a;
        ja1Var.getClass();
        la1 la1Var = new la1();
        la1Var.s = ja1Var;
        return la1Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        la1 la1Var = (la1) cv1Var;
        la1Var.getClass();
        ja1 ja1Var = la1Var.s;
        ja1 ja1Var2 = this.a;
        if (ja1Var != ja1Var2) {
            ja1Var.c.setValue(null);
            ja1Var2.getClass();
            la1Var.s = ja1Var2;
        }
        ig0.z(la1Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
