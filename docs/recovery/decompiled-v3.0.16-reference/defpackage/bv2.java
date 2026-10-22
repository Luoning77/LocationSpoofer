package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bv2 extends cv1 implements ya1, z02, hg0, u30 {
    public wu2 s;

    @Override // defpackage.cv1
    public final void e1() {
        gh0.H(this, this.s.h);
        this.s.getClass();
    }

    @Override // defpackage.z02
    public final void f0() {
        this.s.e();
        gh0.H(this, this.s.h);
    }

    @Override // defpackage.cv1
    public final void f1() {
        this.s.getClass();
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        pe2 pe2VarC;
        jb1Var.c();
        wu2 wu2Var = this.s;
        gn gnVar = jb1Var.e.f;
        fy2 fy2Var = wu2Var.k;
        if (fy2Var.size() > 1) {
            ez.Z(fy2Var, new gq0(17));
        }
        int size = fy2Var.size();
        for (int i = 0; i < size; i++) {
            pu2 pu2Var = (pu2) fy2Var.get(i);
            kw0 kw0Var = (kw0) pu2Var.q.getValue();
            if (kw0Var != null && (pe2VarC = pu2Var.e().c.a().c()) != null && pu2Var.g()) {
                long jE = pe2VarC.e();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
                re reVar = pu2Var.n;
                if (reVar != null) {
                    long jR = gnVar.r();
                    gnVar.i().l();
                    try {
                        ((gn) ((t1) gnVar.a).f).i().s(reVar);
                        ((t1) gnVar.a).D(fIntBitsToFloat, fIntBitsToFloat2);
                        try {
                            dh0.m(jb1Var, kw0Var);
                            ((t1) gnVar.a).D(-fIntBitsToFloat, -fIntBitsToFloat2);
                            p91.v(gnVar, jR);
                        } catch (Throwable th) {
                            ((t1) gnVar.a).D(-fIntBitsToFloat, -fIntBitsToFloat2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        p91.v(gnVar, jR);
                        throw th2;
                    }
                } else {
                    ((t1) gnVar.a).D(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        dh0.m(jb1Var, kw0Var);
                        ((t1) gnVar.a).D(-fIntBitsToFloat, -fIntBitsToFloat2);
                    } catch (Throwable th3) {
                        ((t1) gnVar.a).D(-fIntBitsToFloat, -fIntBitsToFloat2);
                        throw th3;
                    }
                }
            }
        }
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        h82 h82VarS = zq1Var.s(j);
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new ah(gr1Var, this, h82VarS, 9));
    }
}
