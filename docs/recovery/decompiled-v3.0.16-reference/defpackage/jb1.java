package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jb1 implements jg0 {
    public final xv e = new xv();
    public hg0 f;

    @Override // defpackage.xb0
    public final long A0(long j) {
        return this.e.A0(j);
    }

    @Override // defpackage.xb0
    public final float D() {
        return this.e.D();
    }

    @Override // defpackage.xb0
    public final float G0(long j) {
        return this.e.G0(j);
    }

    @Override // defpackage.jg0
    public final void N0(long j, float f, long j2, kg0 kg0Var) {
        this.e.N0(j, f, j2, kg0Var);
    }

    @Override // defpackage.xb0
    public final long O(float f) {
        return this.e.O(f);
    }

    @Override // defpackage.xb0
    public final long P(long j) {
        return this.e.P(j);
    }

    @Override // defpackage.jg0
    public final void Q(long j, long j2, long j3, long j4, kg0 kg0Var) {
        this.e.Q(j, j2, j3, j4, kg0Var);
    }

    @Override // defpackage.xb0
    public final long Q0(float f) {
        return this.e.Q0(f);
    }

    @Override // defpackage.xb0
    public final float R(float f) {
        return this.e.g() * f;
    }

    @Override // defpackage.xb0
    public final float U0(int i) {
        return this.e.U0(i);
    }

    @Override // defpackage.jg0
    public final void V(long j, long j2, long j3, float f, kg0 kg0Var, int i) {
        this.e.V(j, j2, j3, f, kg0Var, i);
    }

    @Override // defpackage.jg0
    public final gn X() {
        return this.e.f;
    }

    @Override // defpackage.xb0
    public final float X0(float f) {
        return f / this.e.g();
    }

    @Override // defpackage.jg0
    public final void Y0(long j, float f, float f2, long j2, long j3, kg0 kg0Var) {
        this.e.Y0(j, f, f2, j2, j3, kg0Var);
    }

    @Override // defpackage.jg0
    public final long a() {
        return this.e.a();
    }

    @Override // defpackage.jg0
    public final void b0(kw0 kw0Var, long j, lu0 lu0Var) {
        kw0Var.e(this, getLayoutDirection(), j, new ah(this, this.f, lu0Var, 8));
    }

    public final void c() {
        xv xvVar = this.e;
        gn gnVar = xvVar.f;
        vv vvVarI = xvVar.f.i();
        kb0 kb0Var = this.f;
        if (kb0Var == null) {
            throw az2.e("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        cv1 cv1Var = (cv1) kb0Var;
        cv1 cv1VarJ = cv1Var.e.j;
        if (cv1VarJ != null && (cv1VarJ.h & 4) != 0) {
            while (true) {
                if (cv1VarJ != null) {
                    int i = cv1VarJ.g;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            cv1VarJ = cv1VarJ.j;
                        }
                    }
                }
                cv1VarJ = null;
                break;
            }
        } else {
            cv1VarJ = null;
            break;
        }
        if (cv1VarJ == null) {
            xz1 xz1VarL = xp1.L(kb0Var, 4);
            if (xz1VarL.t1() == cv1Var.e) {
                xz1VarL = xz1VarL.v;
                xz1VarL.getClass();
            }
            xz1VarL.I1(vvVarI, (kw0) gnVar.b);
            return;
        }
        gy1 gy1Var = null;
        while (cv1VarJ != null) {
            if (cv1VarJ instanceof hg0) {
                hg0 hg0Var = (hg0) cv1VarJ;
                kw0 kw0Var = (kw0) gnVar.b;
                xz1 xz1VarL2 = xp1.L(hg0Var, 4);
                long J = mc0.J(xz1VarL2.g);
                hb1 hb1Var = xz1VarL2.s;
                hb1Var.getClass();
                ((db) kb1.a(hb1Var)).getSharedDrawScope().h(vvVarI, J, xz1VarL2, hg0Var, kw0Var);
            } else if ((cv1VarJ.g & 4) != 0 && (cv1VarJ instanceof lb0)) {
                int i2 = 0;
                for (cv1 cv1Var2 = ((lb0) cv1VarJ).t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                    if ((cv1Var2.g & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            cv1VarJ = cv1Var2;
                        } else {
                            if (gy1Var == null) {
                                gy1Var = new gy1(new cv1[16]);
                            }
                            if (cv1VarJ != null) {
                                gy1Var.b(cv1VarJ);
                                cv1VarJ = null;
                            }
                            gy1Var.b(cv1Var2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            cv1VarJ = xp1.J(gy1Var);
        }
    }

    @Override // defpackage.xb0
    public final float e0(long j) {
        return this.e.e0(j);
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.e.g();
    }

    @Override // defpackage.jg0
    public final qa1 getLayoutDirection() {
        return this.e.e.b;
    }

    public final void h(vv vvVar, long j, xz1 xz1Var, hg0 hg0Var, kw0 kw0Var) {
        hg0 hg0Var2 = this.f;
        this.f = hg0Var;
        qa1 qa1Var = xz1Var.s.E;
        gn gnVar = this.e.f;
        xb0 xb0VarL = gnVar.l();
        qa1 qa1VarQ = gnVar.q();
        vv vvVarI = gnVar.i();
        long jR = gnVar.r();
        kw0 kw0Var2 = (kw0) gnVar.b;
        gnVar.D(xz1Var);
        gnVar.E(qa1Var);
        gnVar.C(vvVar);
        gnVar.F(j);
        gnVar.b = kw0Var;
        vvVar.l();
        try {
            hg0Var.j0(this);
            vvVar.i();
            gnVar.D(xb0VarL);
            gnVar.E(qa1VarQ);
            gnVar.C(vvVarI);
            gnVar.F(jR);
            gnVar.b = kw0Var2;
            this.f = hg0Var2;
        } catch (Throwable th) {
            vvVar.i();
            gnVar.D(xb0VarL);
            gnVar.E(qa1VarQ);
            gnVar.C(vvVarI);
            gnVar.F(jR);
            gnVar.b = kw0Var2;
            throw th;
        }
    }

    @Override // defpackage.jg0
    public final void l0(td tdVar, long j, long j2, long j3, float f, rr rrVar, int i) {
        this.e.l0(tdVar, j, j2, j3, f, rrVar, i);
    }

    @Override // defpackage.xb0
    public final int n0(float f) {
        return this.e.n0(f);
    }

    public final void s(st stVar, long j, long j2, float f, kg0 kg0Var, int i) {
        xv xvVar = this.e;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        xvVar.e.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), xvVar.h(stVar, kg0Var, f, null, i, 1));
    }

    @Override // defpackage.jg0
    public final void t0(long j, long j2, long j3, float f, int i) {
        this.e.t0(j, j2, j3, f, i);
    }

    @Override // defpackage.jg0
    public final long v0() {
        return this.e.v0();
    }

    public final void w(st stVar, long j, long j2, long j3, float f, kg0 kg0Var) {
        xv xvVar = this.e;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        xvVar.e.c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), xvVar.h(stVar, kg0Var, f, null, 3, 1));
    }

    @Override // defpackage.jg0
    public final void w0(re reVar, long j, kg0 kg0Var) {
        this.e.w0(reVar, j, kg0Var);
    }

    @Override // defpackage.jg0
    public final void y(re reVar, st stVar, float f, kg0 kg0Var, int i) {
        this.e.y(reVar, stVar, f, kg0Var, i);
    }
}
