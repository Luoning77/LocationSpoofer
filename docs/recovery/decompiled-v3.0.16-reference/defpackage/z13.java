package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z13 extends hv1 {
    public final yd0 a;

    public z13(yd0 yd0Var) {
        this.a = yd0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z13)) {
            return false;
        }
        z13 z13Var = (z13) obj;
        bf bfVar = sb.l0;
        return bfVar.equals(bfVar) && o51.f(this.a, z13Var.a);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new a23(sb.l0, this.a);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        a23 a23Var = (a23) cv1Var;
        bf bfVar = sb.l0;
        if (!o51.f(a23Var.t, bfVar)) {
            a23Var.t = bfVar;
            if (a23Var.u) {
                a23Var.o1();
            }
        }
        a23Var.s = this.a;
    }

    public final int hashCode() {
        int iE = p91.e(1022 * 31, 31, false);
        yd0 yd0Var = this.a;
        return iE + (yd0Var != null ? yd0Var.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + sb.l0 + ", overrideDescendants=false, touchBoundsExpansion=" + this.a + ')';
    }
}
