package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class iw2 {
    public static final fn0 a;
    public static final fn0 b;
    public static final fn0 c;
    public static final mm3 d;
    public static final mm3 e;
    public static final mm3 f;
    public static final mm3 g;
    public static final mm3 h;
    public static final mm3 i;

    static {
        vc0 vc0Var = vc0.f;
        a = new fn0(vc0Var, 1.0f);
        vc0 vc0Var2 = vc0.e;
        b = new fn0(vc0Var2, 1.0f);
        vc0 vc0Var3 = vc0.g;
        c = new fn0(vc0Var3, 1.0f);
        nr nrVar = j9.s;
        int i2 = 8;
        d = new mm3(vc0Var, new iy2(nrVar, i2), nrVar);
        nr nrVar2 = j9.r;
        e = new mm3(vc0Var, new iy2(nrVar2, i2), nrVar2);
        or orVar = j9.p;
        int i3 = 9;
        f = new mm3(vc0Var2, new iy2(orVar, i3), orVar);
        or orVar2 = j9.o;
        g = new mm3(vc0Var2, new iy2(orVar2, i3), orVar2);
        pr prVar = j9.j;
        int i4 = 10;
        h = new mm3(vc0Var3, new iy2(prVar, i4), prVar);
        pr prVar2 = j9.f;
        i = new mm3(vc0Var3, new iy2(prVar2, i4), prVar2);
    }

    public static final dv1 a(dv1 dv1Var, float f2, float f3) {
        return dv1Var.d(new yf3(f2, f3));
    }

    public static dv1 b(float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(av1.a, f2, f3);
    }

    public static final dv1 c(dv1 dv1Var, float f2) {
        return dv1Var.d(f2 == 1.0f ? b : new fn0(vc0.e, f2));
    }

    public static dv1 d() {
        return c;
    }

    public static final dv1 e(dv1 dv1Var, float f2) {
        return dv1Var.d(f2 == 1.0f ? a : new fn0(vc0.f, f2));
    }

    public static final dv1 g(dv1 dv1Var, float f2) {
        return dv1Var.d(new hw2(0.0f, f2, 0.0f, f2, 5));
    }

    public static dv1 h(dv1 dv1Var, float f2, float f3, int i2) {
        return dv1Var.d(new hw2(0.0f, (i2 & 1) != 0 ? Float.NaN : f2, 0.0f, (i2 & 2) != 0 ? Float.NaN : f3, 5));
    }

    public static final dv1 i(dv1 dv1Var, float f2) {
        return dv1Var.d(new hw2(f2, f2, f2, f2, false));
    }

    public static dv1 j(dv1 dv1Var, float f2, float f3, float f4, float f5, int i2) {
        return dv1Var.d(new hw2(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final dv1 k(dv1 dv1Var, float f2) {
        return dv1Var.d(new hw2(f2, f2, f2, f2, true));
    }

    public static final dv1 l(dv1 dv1Var, float f2, float f3) {
        return dv1Var.d(new hw2(f2, f3, f2, f3, true));
    }

    public static final dv1 m(dv1 dv1Var, float f2, float f3, float f4, float f5) {
        return dv1Var.d(new hw2(f2, f3, f4, f5, true));
    }

    public static dv1 n(dv1 dv1Var, float f2, float f3, int i2) {
        return m(dv1Var, f2, (i2 & 2) != 0 ? Float.NaN : 48.0f, f3, Float.NaN);
    }

    public static final dv1 o(dv1 dv1Var, float f2) {
        return dv1Var.d(new hw2(f2, 0.0f, f2, 0.0f, 10));
    }

    public static dv1 p(int i2, float f2) {
        return new hw2((i2 & 1) != 0 ? Float.NaN : 48.0f, 0.0f, (i2 & 2) != 0 ? Float.NaN : f2, 0.0f, 10);
    }

    public static dv1 q(dv1 dv1Var) {
        mm3 mm3Var;
        or orVar = j9.p;
        if (o51.f(orVar, orVar)) {
            mm3Var = f;
        } else if (o51.f(orVar, j9.o)) {
            mm3Var = g;
        } else {
            mm3Var = new mm3(vc0.e, new iy2(orVar, 9), orVar);
        }
        return dv1Var.d(mm3Var);
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
    public static dv1 r(dv1 dv1Var) {
        mm3 mm3Var;
        pr prVar = j9.j;
        if (prVar.equals(prVar)) {
            mm3Var = h;
        } else if (prVar.equals(j9.f)) {
            mm3Var = i;
        } else {
            mm3Var = new mm3(vc0.g, new iy2(prVar, 10), prVar);
        }
        return dv1Var.d(mm3Var);
    }

    public static dv1 s(dv1 dv1Var) {
        mm3 mm3Var;
        nr nrVar = j9.s;
        if (o51.f(nrVar, nrVar)) {
            mm3Var = d;
        } else if (o51.f(nrVar, j9.r)) {
            mm3Var = e;
        } else {
            mm3Var = new mm3(vc0.f, new iy2(nrVar, 8), nrVar);
        }
        return dv1Var.d(mm3Var);
    }
}
