package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sx0 extends cv1 implements u30, ya1, z02 {
    public q93 s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public q93 y;
    public he3 z;

    @Override // defpackage.kb0
    public final void W0() {
        this.y = r93.c(this.s, xp1.O(this).E);
        this.v = true;
        ld0.z(this);
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.kb0
    public final void c() {
        this.v = true;
        ld0.z(this);
    }

    @Override // defpackage.cv1
    public final void e1() {
        lq0 lq0Var = (lq0) xq1.C(this, z30.k);
        this.y = r93.c(this.s, xp1.O(this).E);
        l43 l43Var = m1().a.f;
        jr0 jr0Var = m1().a.c;
        if (jr0Var == null) {
            jr0Var = jr0.g;
        }
        hr0 hr0Var = m1().a.d;
        int i = hr0Var != null ? hr0Var.a : 0;
        ir0 ir0Var = m1().a.e;
        this.z = ((mq0) lq0Var).b(l43Var, jr0Var, i, ir0Var != null ? ir0Var.a : 65535);
        gh0.H(this, new rx0(this, 0));
        this.v = true;
    }

    @Override // defpackage.z02
    public final void f0() {
        if (this.z != null) {
            gh0.H(this, new rx0(this, 1));
        }
        this.v = true;
        ld0.z(this);
    }

    @Override // defpackage.cv1
    public final void f1() {
        this.y = null;
        this.z = null;
        this.v = false;
    }

    public final q93 m1() {
        q93 q93Var = this.y;
        if (q93Var != null) {
            return q93Var;
        }
        throw p91.h("Resolved style is not set.");
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        if (this.v) {
            q93 q93VarM1 = m1();
            lq0 lq0Var = (lq0) xq1.C(this, z30.k);
            String str = w63.a;
            int iA = (int) (w63.a(q93VarM1, gr1Var, lq0Var, str, 1) & 4294967295L);
            int iA2 = ((int) (w63.a(q93VarM1, gr1Var, lq0Var, str + '\n' + str, 2) & 4294967295L)) - iA;
            int i = this.t;
            this.w = i == 1 ? -1 : ((i - 1) * iA2) + iA;
            int i2 = this.u;
            this.x = i2 == Integer.MAX_VALUE ? -1 : ((i2 - 1) * iA2) + iA;
            this.v = false;
        }
        int i3 = this.w;
        int iV = i3 != -1 ? mh0.v(i3, l50.i(j), l50.g(j)) : l50.i(j);
        int i4 = this.x;
        h82 h82VarS = zq1Var.s(l50.a(j, 0, 0, iV, i4 != -1 ? mh0.v(i4, l50.i(j), l50.g(j)) : l50.g(j), 3));
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new gn0(h82VarS, 1));
    }
}
