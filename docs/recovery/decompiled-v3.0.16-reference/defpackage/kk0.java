package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class kk0 {
    public static final qd3 a = new qd3(wa.G, wa.H);
    public static final yz2 b = o51.D(0.0f, 400.0f, null, 5);
    public static final yz2 c;
    public static final yz2 d;

    static {
        o51.D(0.0f, 400.0f, null, 5);
        pe2 pe2Var = zj3.a;
        c = o51.D(0.0f, 400.0f, new h41(4294967297L), 1);
        d = o51.D(0.0f, 400.0f, new p41(4294967297L), 1);
    }

    public static pk0 a(ln0 ln0Var, nr nrVar, int i) {
        pr prVar;
        nr nrVar2 = j9.t;
        if ((i & 1) != 0) {
            pe2 pe2Var = zj3.a;
            ln0Var = o51.D(0.0f, 400.0f, new p41(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            nrVar = nrVar2;
        }
        if (o51.f(nrVar, j9.r)) {
            prVar = j9.i;
        } else {
            prVar = o51.f(nrVar, nrVar2) ? j9.k : j9.j;
        }
        return b(prVar, ln0Var, new hk0(1, 0));
    }

    public static final pk0 b(l9 l9Var, ln0 ln0Var, lu0 lu0Var) {
        return new pk0(new nc3((om0) null, (lw2) null, new lw(l9Var, ln0Var, lu0Var), (hd0) null, (LinkedHashMap) null, 123));
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
    public static pk0 c(od3 od3Var, int i) {
        pr prVar;
        ln0 ln0VarD = od3Var;
        if ((i & 1) != 0) {
            pe2 pe2Var = zj3.a;
            ln0VarD = o51.D(0.0f, 400.0f, new p41(4294967297L), 1);
        }
        or orVar = j9.q;
        if (orVar.equals(j9.o)) {
            prVar = j9.g;
        } else {
            prVar = orVar.equals(orVar) ? j9.m : j9.j;
        }
        return b(prVar, ln0VarD, new hk0(1, 1));
    }

    public static pk0 d(ln0 ln0Var, int i) {
        if ((i & 1) != 0) {
            ln0Var = o51.D(0.0f, 400.0f, null, 5);
        }
        return new pk0(new nc3(new om0(ln0Var), (lw2) null, (lw) null, (hd0) null, (LinkedHashMap) null, 126));
    }

    public static lm0 e(ln0 ln0Var, int i) {
        if ((i & 1) != 0) {
            ln0Var = o51.D(0.0f, 400.0f, null, 5);
        }
        return new lm0(new nc3(new om0(ln0Var), (lw2) null, (lw) null, (hd0) null, (LinkedHashMap) null, 126));
    }

    public static lm0 f(ln0 ln0Var, nr nrVar, int i) {
        pr prVar;
        nr nrVar2 = j9.t;
        if ((i & 1) != 0) {
            pe2 pe2Var = zj3.a;
            ln0Var = o51.D(0.0f, 400.0f, new p41(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            nrVar = nrVar2;
        }
        if (o51.f(nrVar, j9.r)) {
            prVar = j9.i;
        } else {
            prVar = o51.f(nrVar, nrVar2) ? j9.k : j9.j;
        }
        return g(prVar, ln0Var, new hk0(1, 2));
    }

    public static final lm0 g(l9 l9Var, ln0 ln0Var, lu0 lu0Var) {
        return new lm0(new nc3((om0) null, (lw2) null, new lw(l9Var, ln0Var, lu0Var), (hd0) null, (LinkedHashMap) null, 123));
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
    public static lm0 h(od3 od3Var, int i) {
        pr prVar;
        ln0 ln0VarD = od3Var;
        if ((i & 1) != 0) {
            pe2 pe2Var = zj3.a;
            ln0VarD = o51.D(0.0f, 400.0f, new p41(4294967297L), 1);
        }
        or orVar = j9.q;
        if (orVar.equals(j9.o)) {
            prVar = j9.g;
        } else {
            prVar = orVar.equals(orVar) ? j9.m : j9.j;
        }
        return g(prVar, ln0VarD, new hk0(1, 3));
    }

    public static final pk0 i(lu0 lu0Var, od3 od3Var) {
        return new pk0(new nc3((om0) null, new lw2(new jk0(0, lu0Var), od3Var), (lw) null, (hd0) null, (LinkedHashMap) null, 125));
    }

    public static final lm0 j(lu0 lu0Var, od3 od3Var) {
        return new lm0(new nc3((om0) null, new lw2(new jk0(1, lu0Var), od3Var), (lw) null, (hd0) null, (LinkedHashMap) null, 125));
    }
}
