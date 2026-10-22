package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s92 extends hv1 {
    public final bf a;

    public s92(bf bfVar) {
        this.a = bfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s92) && this.a.equals(((s92) obj).a);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new t92(this.a, null);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        t92 t92Var = (t92) cv1Var;
        bf bfVar = t92Var.t;
        bf bfVar2 = this.a;
        if (o51.f(bfVar, bfVar2)) {
            return;
        }
        t92Var.t = bfVar2;
        if (t92Var.u) {
            t92Var.o1();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
