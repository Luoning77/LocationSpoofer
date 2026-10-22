package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b31 extends cv1 implements hg0 {
    public bj2 s;
    public au0 t;
    public kw0 u;
    public final je v = xq1.n();
    public final re w = ue.a();
    public float x = Float.NaN;

    public b31(bj2 bj2Var, au0 au0Var) {
        this.s = bj2Var;
        this.t = au0Var;
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.cv1
    public final void e1() {
        kw0 kw0VarB = xp1.M(this).b();
        mw0 mw0Var = kw0VarB.a;
        if (mw0Var.E() != 1) {
            mw0Var.I(1);
        }
        this.u = kw0VarB;
    }

    @Override // defpackage.cv1
    public final void f1() {
        kw0 kw0Var = this.u;
        if (kw0Var != null) {
            xp1.M(this).a(kw0Var);
            this.u = null;
        }
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        xv xvVar = jb1Var.e;
        jb1Var.c();
        x21 x21Var = (x21) this.t.invoke();
        if (x21Var == null) {
            return;
        }
        long j = x21Var.b;
        kw0 kw0Var = this.u;
        if (kw0Var == null) {
            return;
        }
        float fR = jb1Var.R(x21Var.a);
        final float fR2 = jb1Var.R(Float.intBitsToFloat((int) (j >> 32)));
        final float fR3 = jb1Var.R(Float.intBitsToFloat((int) (j & 4294967295L)));
        final vd0 vd0VarA = this.s.a(xvVar.a(), jb1Var.getLayoutDirection(), jb1Var);
        re reVar = this.w;
        reVar.g();
        if (vd0VarA instanceof a42) {
            re.b(reVar, ((a42) vd0VarA).i);
        } else if (vd0VarA instanceof b42) {
            re.c(reVar, ((b42) vd0VarA).i);
        } else {
            if (!(vd0VarA instanceof z32)) {
                b81.d();
                return;
            }
            re.a(reVar, ((z32) vd0VarA).i);
        }
        this.v.g(x21Var.c);
        kw0Var.f(x21Var.d);
        mw0 mw0Var = kw0Var.a;
        if (mw0Var.Q() != 3) {
            mw0Var.m(3);
        }
        if (this.x != fR) {
            kw0Var.g(fR > 0.0f ? new xr(fR, fR) : null);
            this.x = fR;
        }
        jg0.C0(jb1Var, kw0Var, new lu0() { // from class: a31
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                jg0 jg0Var = (jg0) obj;
                jg0Var.getClass();
                vv vvVarI = jg0Var.X().i();
                vvVarI.l();
                b31 b31Var = this.e;
                vvVarI.s(b31Var.w);
                je jeVar = b31Var.v;
                vd0 vd0Var = vd0VarA;
                ce0.o(vvVarI, vd0Var, jeVar);
                float f = fR2;
                float f2 = fR3;
                vvVarI.g(f, f2);
                ce0.o(vvVarI, vd0Var, z21.a);
                vvVarI.g(-f, -f2);
                vvVarI.i();
                return mf3.a;
            }
        });
        vv vvVarI = xvVar.f.i();
        vvVarI.l();
        vvVarI.s(reVar);
        dh0.m(jb1Var, kw0Var);
        vvVarI.i();
    }

    @Override // defpackage.hg0
    public final void S0() {
    }
}
