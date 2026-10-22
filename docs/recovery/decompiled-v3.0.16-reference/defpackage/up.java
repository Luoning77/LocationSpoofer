package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class up extends cv1 {
    public ga3 s;
    public final /* synthetic */ vp t;

    public up(vp vpVar) {
        this.t = vpVar;
    }

    @Override // defpackage.cv1
    public final void e1() {
        vp vpVar = this.t;
        vpVar.a = this;
        if (vpVar.b != null) {
            m1();
        }
    }

    @Override // defpackage.cv1
    public final void f1() {
        vp vpVar = this.t;
        if (vpVar.a == this) {
            vpVar.a = null;
        }
        ga3 ga3Var = this.s;
        if (ga3Var != null) {
            ga3Var.b();
        }
        this.s = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m1() {
        j jVar = new j(4, this, this.t);
        hb1 hb1VarO = xp1.O(this);
        int i = hb1VarO.f;
        re2 rectManager = ((db) kb1.a(hb1VarO)).getRectManager();
        ha3 ha3Var = rectManager.c;
        ha3Var.getClass();
        gx1 gx1Var = ha3Var.a;
        ga3 ga3Var = new ga3(ha3Var, i, this, jVar);
        Object objB = gx1Var.b(i);
        if (objB == null) {
            gx1Var.h(i, ga3Var);
            objB = ga3Var;
        }
        ga3 ga3Var2 = (ga3) objB;
        if (ga3Var2 != ga3Var) {
            while (true) {
                ga3 ga3Var3 = ga3Var2.d;
                if (ga3Var3 == null) {
                    break;
                } else {
                    ga3Var2 = ga3Var3;
                }
            }
            ga3Var2.d = ga3Var;
        }
        if (xp1.O(this.e).k) {
            rectManager.b.j(i, true);
        }
        rectManager.e = true;
        rectManager.i();
        this.s = ga3Var;
    }
}
