package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hq2 implements mf2 {
    public final long e;
    public final er2 f;
    public final long g;
    public d31 h;
    public bx1 i;
    public final dv1 j;

    public hq2(long j, er2 er2Var, long j2) {
        d31 d31Var = d31.i;
        this.e = j;
        this.f = er2Var;
        this.g = j2;
        this.h = d31Var;
        gq2 gq2Var = new gq2(this, 2);
        iq2 iq2Var = new iq2(gq2Var, er2Var, j);
        jq2 jq2Var = new jq2(gq2Var, er2Var, j);
        dv1 dv1VarB = m33.b(av1.a, jq2Var, iq2Var, new p70(1, jq2Var, iq2Var));
        v92.a.getClass();
        this.j = mc0.C(dv1VarB, ji2.s);
    }

    @Override // defpackage.mf2
    public final void a() {
        gq2 gq2Var = new gq2(this, 0);
        gq2 gq2Var2 = new gq2(this, 1);
        long j = this.e;
        bx1 bx1Var = new bx1(j, gq2Var, gq2Var2);
        er2 er2Var = this.f;
        lx1 lx1Var = er2Var.c;
        if (j == 0) {
            s21.a("The selectable contains an invalid id: " + j);
        }
        if (lx1Var.b(j)) {
            s21.a("Another selectable with the id: " + bx1Var + ".selectableId has already subscribed.");
        }
        lx1Var.h(j, bx1Var);
        er2Var.b.add(bx1Var);
        er2Var.a = false;
        this.i = bx1Var;
    }

    @Override // defpackage.mf2
    public final void b() {
        bx1 bx1Var = this.i;
        if (bx1Var != null) {
            this.f.d(bx1Var);
            this.i = null;
        }
    }

    @Override // defpackage.mf2
    public final void c() {
        bx1 bx1Var = this.i;
        if (bx1Var != null) {
            this.f.d(bx1Var);
            this.i = null;
        }
    }

    public final void d(x83 x83Var) {
        dq2 dq2Var;
        x83 x83Var2 = (x83) this.h.g;
        if (x83Var2 != null && !o51.f(x83Var2.a.a, x83Var.a.a) && (dq2Var = this.f.i) != null) {
            dq2Var.invoke(Long.valueOf(this.e));
        }
        this.h = d31.o(this.h, null, x83Var, 1);
    }
}
