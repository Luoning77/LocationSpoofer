package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wx0 {
    public final pa1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final sx1 f = new sx1();
    public final b02 g = new b02();
    public final lx1 h = new lx1(10);

    public wx0(pa1 pa1Var) {
        this.a = pa1Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    public final void a(long j, List list, boolean z) {
        lx1 lx1Var;
        long[] jArr;
        qz1 qz1Var;
        Object objE;
        Object obj;
        int size = list.size();
        b02 b02Var = this.g;
        b02 b02Var2 = b02Var;
        boolean z2 = true;
        int i = 0;
        while (true) {
            lx1Var = this.h;
            if (i >= size) {
                break;
            }
            cv1 cv1Var = (cv1) list.get(i);
            if (cv1Var.r) {
                cv1Var.q = new ta(6, this, cv1Var);
                if (z2) {
                    gy1 gy1Var = b02Var2.a;
                    Object[] objArr = gy1Var.e;
                    int i2 = gy1Var.g;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (((qz1) obj).c.equals(cv1Var)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    qz1Var = (qz1) obj;
                    if (qz1Var != null) {
                        qz1Var.i = true;
                        qz1Var.d.a(j);
                        if (z) {
                            Object objE2 = lx1Var.e(j);
                            if (objE2 == null) {
                                objE2 = new sx1();
                                lx1Var.h(j, objE2);
                            }
                            ((sx1) objE2).a(qz1Var);
                        }
                    } else {
                        z2 = false;
                        qz1Var = new qz1(cv1Var);
                        qz1Var.d.a(j);
                        if (z) {
                            objE = lx1Var.e(j);
                            if (objE == null) {
                                objE = new sx1();
                                lx1Var.h(j, objE);
                            }
                            ((sx1) objE).a(qz1Var);
                        }
                        b02Var2.a.b(qz1Var);
                    }
                } else {
                    qz1Var = new qz1(cv1Var);
                    qz1Var.d.a(j);
                    if (z) {
                        objE = lx1Var.e(j);
                        if (objE == null) {
                            objE = new sx1();
                            lx1Var.h(j, objE);
                        }
                        ((sx1) objE).a(qz1Var);
                    }
                    b02Var2.a.b(qz1Var);
                }
                b02Var2 = qz1Var;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = lx1Var.b;
            Object[] objArr2 = lx1Var.c;
            long[] jArr3 = lx1Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                sx1 sx1Var = (sx1) objArr2[i8];
                                gy1 gy1Var2 = b02Var.a;
                                Object[] objArr3 = gy1Var2.e;
                                int i9 = gy1Var2.g;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((qz1) objArr3[i10]).f(j3, sx1Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                }
            }
        }
        lx1Var.a();
    }

    public final boolean b(c51 c51Var, boolean z) {
        b02 b02Var = this.g;
        gy1 gy1Var = b02Var.a;
        if (!b02Var.a((zj1) c51Var.f, this.a, c51Var, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = gy1Var.e;
        int i = gy1Var.g;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((qz1) objArr[i2]).e(c51Var, z) || z3;
        }
        Object[] objArr2 = gy1Var.e;
        int i3 = gy1Var.g;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((qz1) objArr2[i4]).d(c51Var) || z4;
        }
        b02Var.b(c51Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            sx1 sx1Var = this.f;
            int i5 = sx1Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((cv1) sx1Var.f(i6));
            }
            sx1Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            b02Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        b02 b02Var = this.g;
        gy1 gy1Var = b02Var.a;
        Object[] objArr = gy1Var.e;
        int i = gy1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((qz1) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            b02Var.a.g();
        }
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
    public final void d(cv1 cv1Var) {
        if (this.b) {
            this.e = true;
            this.f.a(cv1Var);
            return;
        }
        b02 b02Var = this.g;
        sx1 sx1Var = b02Var.b;
        sx1Var.d();
        sx1Var.a(b02Var);
        while (sx1Var.i()) {
            b02 b02Var2 = (b02) sx1Var.k(sx1Var.b - 1);
            int i = 0;
            while (true) {
                gy1 gy1Var = b02Var2.a;
                if (i < gy1Var.g) {
                    qz1 qz1Var = (qz1) gy1Var.e[i];
                    if (qz1Var.c.equals(cv1Var)) {
                        b02Var2.a.j(qz1Var);
                        qz1Var.c();
                    } else {
                        sx1Var.a(qz1Var);
                        i++;
                    }
                }
            }
        }
    }
}
