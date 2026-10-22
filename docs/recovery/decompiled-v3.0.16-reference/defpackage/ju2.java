package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ju2 extends cv1 implements hg0, fv1, z02, u30, ya1 {
    public pe2 s;
    public boolean t;
    public pu2 u;
    public kw0 v;
    public final wv2 w;

    public ju2(pu2 pu2Var) {
        this.u = pu2Var;
        this.v = (kw0) pu2Var.q.getValue();
        k91 k91Var = lu2.a;
        wv2 wv2Var = new wv2();
        wv2Var.g.setValue(pu2Var);
        this.w = wv2Var;
    }

    @Override // defpackage.fv1
    public final ig0 B() {
        return this.w;
    }

    @Override // defpackage.cv1
    public final void e1() {
        gh0.H(this, this.u.e().i);
        p1();
        this.u.e.setValue(Boolean.TRUE);
    }

    @Override // defpackage.z02
    public final void f0() {
        this.u.e().e();
        gh0.H(this, this.u.e().i);
    }

    @Override // defpackage.cv1
    public final void f1() {
        pa1 pa1Var = this.u.e().b.i;
        if (pa1Var != null) {
            this.s = (pa1Var.U() && this.t) ? ce0.d(c12.d(xp1.N(this).h0(0L), pa1Var.h0(0L)), mc0.J(xp1.N(this).g)) : null;
        }
        o1(null);
        pu2 pu2Var = this.u;
        pu2Var.o = null;
        pu2Var.p = null;
        pu2Var.e.setValue(Boolean.FALSE);
        this.t = false;
    }

    @Override // defpackage.cv1
    public final void g1() {
        this.s = null;
        kw0 kw0Var = this.v;
        if (kw0Var != null) {
            xp1.M(this).a(kw0Var);
        }
        o1(xp1.M(this).b());
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        nu2 nu2VarE = this.u.e();
        pe2 pe2VarC = nu2VarE.c.a().c();
        pu2 pu2Var = this.u;
        re reVar = null;
        if (pu2Var.g() && pe2VarC != null) {
            xu2 xu2Var = (xu2) this.u.l.getValue();
            uu2 uu2Var = (uu2) this.u.m.getValue();
            jb1Var.getLayoutDirection();
            xb0 xb0Var = xp1.O(this).D;
            xu2Var.getClass();
            pu2 pu2Var2 = (pu2) uu2Var.c.getValue();
            if (pu2Var2 == null) {
                fo.i("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                return;
            }
            pu2 pu2Var3 = pu2Var2.o;
            uu2 uu2Var2 = pu2Var3 != null ? (uu2) pu2Var3.m.getValue() : null;
            if (uu2Var2 != null) {
                pu2 pu2Var4 = (pu2) uu2Var2.c.getValue();
                if (pu2Var4 == null) {
                    fo.i("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                    return;
                }
                reVar = pu2Var4.n;
            }
        }
        pu2Var.n = reVar;
        kw0 kw0Var = (kw0) this.u.q.getValue();
        if (kw0Var != null) {
            jg0.C0(jb1Var, kw0Var, new q9(jb1Var, pe2VarC, nu2VarE));
            pu2 pu2Var5 = this.u;
            if (!pu2Var5.e().c.a().d() || (!pu2Var5.g() && pu2Var5.f())) {
                dh0.m(jb1Var, kw0Var);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Error: Layer is null when accessed for shared bounds/element : ");
        sb.append((Object) nu2VarE.a);
        boolean zB = this.u.d().b();
        boolean z = this.r;
        sb.append(",target: ");
        sb.append(zB);
        sb.append(", is attached: ");
        sb.append(z);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final fr1 m1(yn ynVar, zq1 zq1Var, long j) {
        long jF0;
        pe2 pe2VarC = this.u.d().c();
        if (pe2VarC == null) {
            dv2 dv2Var = this.u.e().c;
            dv2Var.c();
            pe2VarC = dv2Var.a().f(dv2Var.a);
        }
        if (pe2VarC != null) {
            long jE = mc0.E(pe2VarC.d());
            int i = (int) (jE >> 32);
            int i2 = (int) (jE & 4294967295L);
            if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
                StringBuilder sb = new StringBuilder("Error: Infinite width/height is invalid. animated bounds: ");
                sb.append(this.u.d().c());
                b81.o(sb, ", current bounds: ", this.u.e().c.a().c());
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (!((i2 >= 0) & (i >= 0))) {
                r21.a("width and height must be >= 0");
            }
            j = m50.h(i, i, i2, i2);
        }
        h82 h82VarS = zq1Var.s(j);
        if (this.u.e().c.a().d()) {
            tu2 tu2Var = (tu2) this.u.j.getValue();
            jF0 = this.u.e().b.e.c(xp1.N(this)).f0();
            int i3 = h82VarS.e;
            int i4 = h82VarS.f;
            tu2Var.getClass();
        } else {
            jF0 = (((long) h82VarS.e) << 32) | (((long) h82VarS.f) & 4294967295L);
        }
        return ynVar.H0((int) (jF0 >> 32), (int) (jF0 & 4294967295L), vj0.e, new iu2(this, h82VarS));
    }

    public final pa1 n1() {
        pa1 pa1Var = this.u.e().b.i;
        if (pa1Var != null) {
            return pa1Var;
        }
        fo.i("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    public final void o1(kw0 kw0Var) {
        if (kw0Var == null) {
            kw0 kw0Var2 = this.v;
            if (kw0Var2 != null) {
                xp1.M(this).a(kw0Var2);
            }
        } else {
            this.u.q.setValue(kw0Var);
        }
        this.v = kw0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [cv1] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [cv1] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [gy1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [gy1] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public final void p1() {
        Object objQ;
        tz1 tz1Var;
        k91 k91Var = lu2.a;
        pu2 pu2Var = this.u;
        wj0 wj0Var = wj0.g;
        wv2 wv2Var = this.w;
        if (wv2Var == wj0Var) {
            p21.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!wv2Var.m(k91Var)) {
            p21.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + k91Var + " was not found.");
        }
        wv2Var.getClass();
        wv2Var.g.setValue(pu2Var);
        pu2 pu2Var2 = this.u;
        if (!this.e.r) {
            p21.a("ModifierLocal accessed from an unattached node");
        }
        if (!this.e.r) {
            p21.c("visitAncestors called on an unattached node");
        }
        cv1 cv1Var = this.e.i;
        hb1 hb1VarO = xp1.O(this);
        loop0: while (true) {
            objQ = null;
            if (hb1VarO == null) {
                break;
            }
            if ((hb1VarO.K.f.h & 32) != 0) {
                while (cv1Var != null) {
                    if ((cv1Var.g & 32) != 0) {
                        ?? J = cv1Var;
                        ?? gy1Var = 0;
                        while (J != 0) {
                            if (J instanceof fv1) {
                                fv1 fv1Var = (fv1) J;
                                if (fv1Var.B().m(k91Var)) {
                                    objQ = fv1Var.B().q(k91Var);
                                    break loop0;
                                }
                            } else if ((J.g & 32) != 0 && (J instanceof lb0)) {
                                cv1 cv1Var2 = ((lb0) J).t;
                                int i = 0;
                                J = J;
                                gy1Var = gy1Var;
                                while (cv1Var2 != null) {
                                    if ((cv1Var2.g & 32) != 0) {
                                        i++;
                                        if (i == 1) {
                                            gy1Var = gy1Var;
                                            J = cv1Var2;
                                        } else {
                                            if (gy1Var == 0) {
                                                gy1Var = new gy1(new cv1[16]);
                                            }
                                            if (J != 0) {
                                                gy1Var.b(J);
                                                J = 0;
                                            }
                                            gy1Var.b(cv1Var2);
                                        }
                                    }
                                    cv1Var2 = cv1Var2.j;
                                    J = J;
                                    gy1Var = gy1Var;
                                }
                                if (i == 1) {
                                }
                            }
                            J = xp1.J(gy1Var);
                        }
                    }
                    cv1Var = cv1Var.i;
                }
            }
            hb1VarO = hb1VarO.u();
            cv1Var = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
        }
        pu2Var2.o = (pu2) objQ;
        o1(xp1.M(this).b());
        this.t = false;
        this.u.p = this;
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        h82 h82VarS = zq1Var.s(j);
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new iu2(h82VarS, this));
    }
}
