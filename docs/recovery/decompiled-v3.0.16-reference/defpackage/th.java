package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class th extends aa1 implements qu0 {
    public final /* synthetic */ fy2 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ ei h;
    public final /* synthetic */ p10 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(fy2 fy2Var, Object obj, ei eiVar, p10 p10Var) {
        super(3);
        this.f = fy2Var;
        this.g = obj;
        this.h = eiVar;
        this.i = p10Var;
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
    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mi miVar = (mi) obj;
        f30 f30Var = (f30) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? ((ov0) f30Var).f(miVar) : ((ov0) f30Var).h(miVar) ? 4 : 2;
        }
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
            fy2 fy2Var = this.f;
            boolean zF = ov0Var.f(fy2Var);
            Object obj4 = this.g;
            boolean zH = zF | ov0Var.h(obj4);
            ei eiVar = this.h;
            boolean zH2 = zH | ov0Var.h(eiVar);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zH2 || objQ == c30Var) {
                objQ = new ah(fy2Var, obj4, eiVar, 1);
                ov0Var.m0(objQ);
            }
            oi0.a(miVar, (lu0) objQ, ov0Var);
            zx1 zx1Var = eiVar.c;
            miVar.getClass();
            zx1Var.m(obj4, ((ni) miVar).b);
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                objQ2 = new yh(miVar);
                ov0Var.m0(objQ2);
            }
            this.i.invoke((yh) objQ2, obj4, ov0Var, 0);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
