package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class em0 {
    public final xd2 a;
    public final zl0 b;
    public final gm0 c;
    public final fm0 d;
    public boolean e;
    public boolean f;
    public final ae2 g;

    public em0(xd2 xd2Var, zl0 zl0Var, gm0 gm0Var, fm0 fm0Var) {
        zl0Var.getClass();
        gm0Var.getClass();
        this.a = xd2Var;
        this.b = zl0Var;
        this.c = gm0Var;
        this.d = fm0Var;
        this.g = fm0Var.h();
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
    public final IOException a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            e(iOException);
        }
        zl0 zl0Var = this.b;
        xd2 xd2Var = this.a;
        if (z2) {
            if (iOException != null) {
                zl0Var.requestFailed(xd2Var, iOException);
            } else {
                zl0Var.requestBodyEnd(xd2Var, j);
            }
        }
        if (z) {
            if (iOException != null) {
                zl0Var.responseFailed(xd2Var, iOException);
            } else {
                zl0Var.responseBodyEnd(xd2Var, j);
            }
        }
        return xd2Var.e(this, z2, z, iOException);
    }

    public final cm0 b(yf2 yf2Var, boolean z) {
        yf2Var.getClass();
        this.e = z;
        cg2 cg2Var = yf2Var.d;
        cg2Var.getClass();
        long jContentLength = cg2Var.contentLength();
        this.b.requestBodyStart(this.a);
        return new cm0(this, this.d.e(yf2Var, jContentLength), jContentLength);
    }

    public final ce2 c(qg2 qg2Var) throws IOException {
        fm0 fm0Var = this.d;
        try {
            String strA = qg2.A(qg2Var, "Content-Type");
            long jF = fm0Var.f(qg2Var);
            return new ce2(strA, jF, new td2(new dm0(this, fm0Var.b(qg2Var), jF)), 0);
        } catch (IOException e) {
            this.b.responseFailed(this.a, e);
            e(e);
            throw e;
        }
    }

    public final pg2 d(boolean z) throws IOException {
        try {
            pg2 pg2VarG = this.d.g(z);
            if (pg2VarG == null) {
                return pg2VarG;
            }
            pg2VarG.m = this;
            return pg2VarG;
        } catch (IOException e) {
            this.b.responseFailed(this.a, e);
            e(e);
            throw e;
        }
    }

    public final void e(IOException iOException) {
        this.f = true;
        this.c.b(iOException);
        ae2 ae2VarH = this.d.h();
        xd2 xd2Var = this.a;
        synchronized (ae2VarH) {
            try {
                if (!(iOException instanceof d13)) {
                    if (!(ae2VarH.g != null) || (iOException instanceof t40)) {
                        ae2VarH.j = true;
                        if (ae2VarH.m == 0) {
                            ae2.d(xd2Var.e, ae2VarH.b, iOException);
                            ae2VarH.l++;
                        }
                    }
                } else if (((d13) iOException).e == 8) {
                    int i = ae2VarH.n + 1;
                    ae2VarH.n = i;
                    if (i > 1) {
                        ae2VarH.j = true;
                        ae2VarH.l++;
                    }
                } else if (((d13) iOException).e != 9 || !xd2Var.s) {
                    ae2VarH.j = true;
                    ae2VarH.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
