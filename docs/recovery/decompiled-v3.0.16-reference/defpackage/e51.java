package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class e51 extends hv1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e51 ? (e51) obj : null) != null;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        f51 f51Var = new f51(0);
        f51Var.t = i51.e;
        f51Var.u = true;
        return f51Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        f51 f51Var = (f51) cv1Var;
        f51Var.t = i51.e;
        f51Var.u = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (i51.e.hashCode() * 31);
    }
}
