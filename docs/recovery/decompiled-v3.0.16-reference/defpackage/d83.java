package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d83 extends cv1 implements u30, ya1 {
    public final q93 s;
    public he3 t;
    public eu2 u;

    public d83(q93 q93Var) {
        this.s = q93Var;
    }

    @Override // defpackage.kb0
    public final void W0() {
        eu2 eu2Var = this.u;
        if (eu2Var != null) {
            eu2.a(eu2Var, xp1.O(this).E, null, null, 30);
        }
        ld0.z(this);
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.kb0
    public final void c() {
        eu2 eu2Var = this.u;
        if (eu2Var != null) {
            eu2.a(eu2Var, null, xp1.O(this).D, null, 29);
        }
        ld0.z(this);
    }

    @Override // defpackage.cv1
    public final void e1() {
        q93 q93VarC = r93.c(this.s, xp1.O(this).E);
        lq0 lq0Var = (lq0) xq1.C(this, z30.k);
        m1(q93VarC, lq0Var);
        qa1 qa1Var = xp1.O(this).E;
        xb0 xb0Var = xp1.O(this).D;
        he3 he3Var = this.t;
        if (he3Var == null) {
            throw p91.h("Font resolution state is not set.");
        }
        this.u = new eu2(qa1Var, xb0Var, lq0Var, q93VarC, he3Var.e);
    }

    @Override // defpackage.cv1
    public final void f1() {
        this.t = null;
        this.u = null;
    }

    public final void m1(q93 q93Var, lq0 lq0Var) {
        uy2 uy2Var = q93Var.a;
        l43 l43Var = uy2Var.f;
        jr0 jr0Var = uy2Var.c;
        if (jr0Var == null) {
            jr0Var = jr0.g;
        }
        hr0 hr0Var = uy2Var.d;
        int i = hr0Var != null ? hr0Var.a : 0;
        ir0 ir0Var = uy2Var.e;
        this.t = ((mq0) lq0Var).b(l43Var, jr0Var, i, ir0Var != null ? ir0Var.a : 65535);
        ld0.z(this);
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        eu2 eu2Var = this.u;
        if (eu2Var == null) {
            throw p91.h("Min size state is not set.");
        }
        w52 w52Var = (w52) eu2Var.g;
        he3 he3Var = this.t;
        if (he3Var == null) {
            throw p91.h("Font resolution state is not set.");
        }
        Object obj = he3Var.e;
        if (!o51.f(obj, eu2Var.f)) {
            eu2Var.f = obj;
            w52Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) w52Var.getValue()).booleanValue()) {
            eu2Var.b = w63.a((q93) eu2Var.e, (xb0) eu2Var.c, (lq0) eu2Var.d, w63.a, 1);
            w52Var.setValue(Boolean.FALSE);
        }
        long j2 = eu2Var.b;
        h82 h82VarS = zq1Var.s(m50.e(j, m50.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new gn0(h82VarS, 8));
    }
}
