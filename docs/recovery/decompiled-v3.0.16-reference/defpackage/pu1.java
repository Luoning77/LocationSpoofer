package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pu1 extends cv1 implements u30, ya1 {
    public final mu1 s;
    public xb0 t;
    public qk3 u;

    public pu1(mu1 mu1Var) {
        this.s = mu1Var;
    }

    @Override // defpackage.cv1
    public final void e1() {
        m1();
        int i = 0;
        nu1 nu1Var = new nu1(this, i);
        mu1 mu1Var = this.s;
        mu1Var.n = nu1Var;
        mu1Var.o = new ou1(this, i);
        mu1Var.p = new ou1(this, 1);
        mu1Var.e = new ou1(this, 2);
    }

    @Override // defpackage.cv1
    public final void f1() {
        l42 l42Var;
        mu1 mu1Var = this.s;
        mu1Var.n = null;
        mu1Var.o = null;
        mu1Var.p = null;
        mu1Var.e = null;
        mu1Var.g(0.0f);
        mu1Var.h(0.0f);
        mu1Var.f = 0.0f;
        mu1Var.g = 0.0f;
        ou1 ou1Var = mu1Var.p;
        if (ou1Var == null || (l42Var = (l42) ou1Var.invoke()) == null) {
            return;
        }
        w52 w52Var = l42Var.a;
        if (((Boolean) w52Var.getValue()).booleanValue()) {
            w52Var.setValue(Boolean.FALSE);
        }
    }

    public final void m1() {
        xb0 xb0Var = (xb0) xq1.C(this, z30.h);
        qk3 qk3Var = (qk3) xq1.C(this, z30.v);
        if (o51.f(xb0Var, this.t) && o51.f(qk3Var, this.u)) {
            return;
        }
        this.t = xb0Var;
        this.u = qk3Var;
        ee1 ee1Var = (ee1) qk3Var;
        float fR = xb0Var.R(xd0.a(ee1Var.a()));
        mu1 mu1Var = this.s;
        mu1Var.h = fR;
        mu1Var.i = xb0Var.R(xd0.b(ee1Var.a()));
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        zq1Var.getClass();
        m1();
        h82 h82VarS = zq1Var.s(j);
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new jl1(4, h82VarS, this));
    }
}
