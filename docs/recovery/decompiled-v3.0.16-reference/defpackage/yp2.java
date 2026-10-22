package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class yp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ yp2(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    public final xp2 a(uq2 uq2Var) {
        wp2 wp2VarG0;
        wp2 wp2VarG1;
        boolean z;
        int i = this.a;
        e80 e80Var = e80.e;
        boolean z2 = false;
        switch (i) {
            case 0:
                return new xp2(uq2Var.e().a(uq2Var.e().c), uq2Var.j().a(uq2Var.j().d), uq2Var.k() == e80Var);
            case 1:
                return mh0.h(uq2Var, u92.k);
            case 2:
                return mh0.h(uq2Var, u92.j);
            default:
                xp2 xp2VarC = uq2Var.c();
                if (xp2VarC == null) {
                    return mh0.h(uq2Var, u92.k);
                }
                wp2 wp2Var = xp2VarC.b;
                wp2 wp2Var2 = xp2VarC.a;
                if (uq2Var.a()) {
                    wp2VarG1 = mh0.g0(uq2Var, uq2Var.e(), wp2Var2);
                    wp2VarG0 = wp2Var;
                    wp2Var = wp2Var2;
                    wp2Var2 = wp2VarG1;
                } else {
                    wp2VarG0 = mh0.g0(uq2Var, uq2Var.j(), wp2Var);
                    wp2VarG1 = wp2VarG0;
                }
                if (o51.f(wp2VarG1, wp2Var)) {
                    return xp2VarC;
                }
                xp2 xp2Var = new xp2(wp2Var2, wp2VarG0, uq2Var.k() == e80Var || (uq2Var.k() == e80.g && wp2Var2.b > wp2VarG0.b));
                wp2 wp2Var3 = xp2Var.a;
                long j = wp2Var3.c;
                wp2 wp2Var4 = xp2Var.b;
                if (j != wp2Var4.c) {
                    boolean z3 = xp2Var.c;
                    if ((z3 ? wp2Var3 : wp2Var4).b == 0) {
                        if (uq2Var.d().f.a.a.f.length() != (z3 ? wp2Var4 : wp2Var3).b) {
                            z = false;
                        } else {
                            se2 se2Var = new se2();
                            se2Var.e = true;
                            uq2Var.l(new ge2(se2Var, 9));
                            z = se2Var.e;
                        }
                    } else {
                        z = false;
                    }
                } else if (wp2Var3.b == wp2Var4.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String str = uq2Var.b().f.a.a.f;
                    if (uq2Var.m() <= 1 && uq2Var.c() != null && str.length() != 0) {
                        qp2 qp2VarB = uq2Var.b();
                        String str2 = qp2VarB.f.a.a.f;
                        int i2 = qp2VarB.c;
                        int length = str2.length();
                        if (i2 == 0) {
                            int iQ = ce0.q(0, str2);
                            return uq2Var.a() ? xp2.a(xp2Var, mh0.n(wp2Var3, qp2VarB, iQ), null, true, 2) : xp2.a(xp2Var, null, mh0.n(wp2Var4, qp2VarB, iQ), false, 1);
                        }
                        if (i2 == length) {
                            int iR = ce0.r(length, str2);
                            return uq2Var.a() ? xp2.a(xp2Var, mh0.n(wp2Var3, qp2VarB, iR), null, false, 2) : xp2.a(xp2Var, null, mh0.n(wp2Var4, qp2VarB, iR), true, 1);
                        }
                        xp2 xp2VarC2 = uq2Var.c();
                        if (xp2VarC2 != null && xp2VarC2.c) {
                            z2 = true;
                        }
                        int iR2 = uq2Var.a() ^ z2 ? ce0.r(i2, str2) : ce0.q(i2, str2);
                        return uq2Var.a() ? xp2.a(xp2Var, mh0.n(wp2Var3, qp2VarB, iR2), null, z2, 2) : xp2.a(xp2Var, null, mh0.n(wp2Var4, qp2VarB, iR2), z2, 1);
                    }
                }
                return xp2Var;
        }
    }
}
