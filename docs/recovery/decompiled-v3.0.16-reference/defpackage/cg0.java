package defpackage;

import android.graphics.RuntimeShader;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cg0 extends cv1 implements ya1, hg0, aw0, z02, u30 {
    public final eu2 A;
    public final ag0 B;
    public final yf0 C;
    public final yf0 D;
    public kw0 E;
    public final w52 F;
    public final s52 G;
    public final t H;
    public final w52 I;
    public final je J;
    public final je K;
    public pe2 L;
    public fq s;
    public lu0 t;
    public lu0 u;
    public lu0 v;
    public pu0 w;
    public lu0 x;
    public int y;
    public boolean z;

    public cg0(fq fqVar, au0 au0Var, lu0 lu0Var, lu0 lu0Var2, lu0 lu0Var3, pu0 pu0Var, lu0 lu0Var4, boolean z) {
        fqVar.getClass();
        au0Var.getClass();
        lu0Var.getClass();
        this.s = fqVar;
        this.t = lu0Var;
        this.u = lu0Var2;
        this.v = lu0Var3;
        this.w = pu0Var;
        this.x = lu0Var4;
        this.y = 3;
        this.z = z;
        this.A = new eu2(au0Var);
        this.B = new ag0(this);
        this.C = new yf0(this);
        this.D = new yf0(this);
        this.F = ke0.H(Boolean.FALSE);
        this.G = new s52(0.0f);
        this.H = new t(this, 12);
        this.I = new w52(null, j9.W);
        this.J = xq1.n();
        this.K = xq1.n();
    }

    @Override // defpackage.aw0
    public final void L(xz1 xz1Var) {
        if (xz1Var.t1().r) {
            boolean zA = this.s.a();
            w52 w52Var = this.I;
            if (zA) {
                w52Var.setValue(xz1Var);
            } else if (((pa1) w52Var.getValue()) != null) {
                w52Var.setValue(null);
            }
        }
    }

    @Override // defpackage.cv1
    public final void e1() {
        wk2 wk2Var = (wk2) xq1.C(this, yk2.a);
        ag0 ag0Var = this.B;
        ag0Var.getClass();
        wk2Var.getClass();
        ag0Var.l = wk2Var;
        if (this.z) {
            this.C.a();
            gh0.H(this, new hd(this, 13));
        }
    }

    @Override // defpackage.z02
    public final void f0() {
        gh0.H(this, new hd(this, 13));
    }

    @Override // defpackage.cv1
    public final void f1() {
        p1();
        this.I.setValue(null);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        ux0 ux0Var;
        RuntimeShader runtimeShader;
        xv xvVar = jb1Var.e;
        if (!this.z) {
            jb1Var.c();
            return;
        }
        ag0 ag0Var = this.B;
        ag0Var.getClass();
        float fG = xvVar.g();
        float fD = xvVar.D();
        long jA = xvVar.a();
        qa1 layoutDirection = jb1Var.getLayoutDirection();
        boolean z = (fG == ag0Var.e && fD == ag0Var.f && cw2.a(jA, ag0Var.g) && layoutDirection == ag0Var.h) ? false : true;
        if (z) {
            ag0Var.e = fG;
            ag0Var.f = fD;
            ag0Var.g = jA;
            layoutDirection.getClass();
            ag0Var.h = layoutDirection;
        }
        if (z) {
            r1();
        }
        q1(jb1Var, this.C);
        if (((Boolean) this.F.getValue()).booleanValue()) {
            kw0 kw0VarB = this.E;
            if (kw0VarB == null) {
                kw0VarB = xp1.M(this).b();
                this.E = kw0VarB;
            }
            int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (xvVar.a() >> 32));
            if (iIntBitsToFloat < 1) {
                iIntBitsToFloat = 1;
            }
            int iIntBitsToFloat2 = (int) Float.intBitsToFloat((int) (xvVar.a() & 4294967295L));
            if (iIntBitsToFloat2 < 1) {
                iIntBitsToFloat2 = 1;
            }
            jb1Var.b0(kw0VarB, (((long) iIntBitsToFloat2) & 4294967295L) | (((long) iIntBitsToFloat) << 32), new l3(10, xp1.O(this).D, this));
            kw0VarB.f(this.G.g());
            dh0.m(jb1Var, kw0VarB);
        }
        lu0 lu0Var = this.x;
        if (lu0Var != null) {
            lu0Var.invoke(jb1Var);
        }
        if (this.y == 3) {
            jb1Var.c();
        } else {
            gn gnVar = xvVar.f;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (xvVar.a() >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xvVar.a() & 4294967295L));
            pe2 pe2Var = this.L;
            if (pe2Var == null) {
                pe2Var = new pe2(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
                this.L = pe2Var;
            } else {
                if (pe2Var.c != fIntBitsToFloat || pe2Var.d != fIntBitsToFloat2) {
                    pe2Var = null;
                }
                if (pe2Var == null) {
                    pe2Var = new pe2(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
                    this.L = pe2Var;
                }
            }
            int i = this.y;
            je jeVar = this.J;
            jeVar.f(i);
            gnVar.i().o(pe2Var, jeVar);
            jb1Var.c();
            gnVar.i().i();
        }
        lu0 lu0Var2 = this.u;
        if (lu0Var2 == null || (ux0Var = (ux0) lu0Var2.invoke(ag0Var)) == null) {
            return;
        }
        au2 au2Var = (au2) ((au0) ag0Var.F.A.c).invoke();
        wk2 wk2Var = ag0Var.l;
        ur urVar = ux0Var.c;
        float f = ux0Var.b;
        au2Var.getClass();
        je jeVar2 = this.K;
        jeVar2.getClass();
        float f2 = ux0Var.a;
        if (f2 <= 0.0f || f <= 0.0f) {
            return;
        }
        long jA2 = xvVar.a();
        int i2 = (int) (jA2 >> 32);
        if (Float.intBitsToFloat(i2) > 0.0f) {
            int i3 = (int) (jA2 & 4294967295L);
            if (Float.intBitsToFloat(i3) <= 0.0f) {
                return;
            }
            float fR = jb1Var.R(f2);
            float fB = cw2.b(jA2) / 2.0f;
            if (fR > fB) {
                fR = fB;
            }
            boolean z2 = urVar.f;
            long j = urVar.a;
            if (q1.e()) {
                long jA3 = xvVar.a();
                pf pfVarC = wk2Var.c(z2 ? "BloomStrokeDual" : "BloomStrokeSingle", z2 ? wt2.c : wt2.b);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jA3 >> 32)) * 0.5f;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jA3 & 4294967295L)) * 0.5f;
                pfVarC.getClass();
                pfVarC.a.setFloatUniform("halfView", fIntBitsToFloat3, fIntBitsToFloat4);
                pfVarC.a.setFloatUniform("halfViewFloor", (float) Math.floor(fIntBitsToFloat3), (float) Math.floor(fIntBitsToFloat4));
                long jA4 = xvVar.a();
                float fB2 = cw2.b(jA4) / 2.0f;
                bj2 bj2Var = au2Var instanceof bj2 ? (bj2) au2Var : null;
                if (bj2Var == null) {
                    pfVarC.a.setFloatUniform("cornerRadii", fB2, fB2, fB2, fB2);
                } else {
                    u70 u70Var = bj2Var.d;
                    u70 u70Var2 = bj2Var.c;
                    u70 u70Var3 = bj2Var.b;
                    u70 u70Var4 = bj2Var.a;
                    boolean z3 = jb1Var.getLayoutDirection() == qa1.e;
                    float fA = z3 ? u70Var4.a(jA4, jb1Var) : u70Var3.a(jA4, jb1Var);
                    float fA2 = z3 ? u70Var3.a(jA4, jb1Var) : u70Var4.a(jA4, jb1Var);
                    float fA3 = z3 ? u70Var2.a(jA4, jb1Var) : u70Var.a(jA4, jb1Var);
                    float fA4 = z3 ? u70Var.a(jA4, jb1Var) : u70Var2.a(jA4, jb1Var);
                    if (fA > fB2) {
                        fA = fB2;
                    }
                    if (fA2 > fB2) {
                        fA2 = fB2;
                    }
                    if (fA4 > fB2) {
                        fA4 = fB2;
                    }
                    if (fA3 > fB2) {
                        fA3 = fB2;
                    }
                    pfVarC.a.setFloatUniform("cornerRadii", fA, fA2, fA4, fA3);
                }
                pfVarC.a.setFloatUniform("strokeWidth", fR);
                float fR2 = jb1Var.R(urVar.c);
                pfVarC.a.setFloatUniform("innerBlurRadius", fR2);
                pfVarC.a.setFloatUniform("innerBlurRadiusSq", fR2 * fR2);
                pfVarC.a.setFloatUniform("highlightAlpha", f);
                pfVarC.a.setColorUniform("strokeColor", xp1.T(hz.c(1.0f, j)));
                pfVarC.a.setFloatUniform("strokeAlphaMul", hz.d(j));
                boolean z4 = !z2;
                ce0.h(pfVarC, "1", urVar.d, z4);
                ce0.h(pfVarC, "2", urVar.e, z4);
                runtimeShader = pfVarC.a;
            } else {
                xvVar = xvVar;
                i2 = i2;
                runtimeShader = null;
            }
            if (runtimeShader == null) {
                return;
            }
            jeVar2.k(runtimeShader);
            jeVar2.f(urVar.b);
            xvVar.f.i().p(0.0f, 0.0f, Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), jeVar2);
            jeVar2.k(null);
        }
    }

    public final void m1(jg0 jg0Var, yf0 yf0Var, int i, kw0 kw0Var, int i2, int i3, kw0 kw0Var2, int i4, int i5, float f, String str, String str2) {
        t20[] t20VarArr = yf0Var.i;
        int[] iArr = yf0Var.h;
        int[] iArr2 = yf0Var.g;
        String[] strArr = yf0Var.f;
        t20 t20VarL = t20VarArr[i];
        if (t20VarL == null || !o51.f(strArr[i], str) || iArr2[i] != i2 || iArr[i] != i3) {
            pf pfVarC = this.B.c(str, str2);
            pfVarC.getClass();
            pfVarC.a.setFloatUniform("maxCoord", i2 - 0.5f, i3 - 0.5f);
            t20VarL = ld0.L(pfVarC, "child");
            yf0Var.i[i] = t20VarL;
            strArr[i] = str;
            iArr2[i] = i2;
            iArr[i] = i3;
        }
        kw0Var.g(t20VarL);
        jg0Var.b0(kw0Var2, (((long) i4) << 32) | (((long) i5) & 4294967295L), new zf0(xp1.O(this).D, f, kw0Var));
        kw0Var.g(null);
    }

    public final void n1(jg0 jg0Var, kw0 kw0Var, float f, float f2, int i, float f3, float f4) {
        long j;
        this.B.getClass();
        if (f2 == 0.0f) {
            j = 0;
        } else {
            long j2 = -((int) (f2 / i));
            j = (j2 & 4294967295L) | (j2 << 32);
        }
        if (!h41.a(kw0Var.t, j)) {
            kw0Var.t = j;
            kw0Var.a.L((int) (j >> 32), (int) (4294967295L & j), kw0Var.u);
        }
        float f5 = -f3;
        float f6 = -f4;
        ((t1) jg0Var.X().a).D(f5, f6);
        try {
            gn gnVarX = jg0Var.X();
            long jR = gnVarX.r();
            gnVarX.i().l();
            try {
                ((t1) gnVarX.a).B(f, f, 0L);
                dh0.m(jg0Var, kw0Var);
                gnVarX.i().i();
                gnVarX.F(jR);
                ((t1) jg0Var.X().a).D(-f5, -f6);
            } catch (Throwable th) {
                gnVarX.i().i();
                gnVarX.F(jR);
                throw th;
            }
        } catch (Throwable th2) {
            ((t1) jg0Var.X().a).D(-f5, -f6);
            throw th2;
        }
    }

    public final void o1(jg0 jg0Var, yf0 yf0Var) {
        float fG = yf0Var.d.g();
        int i = yf0Var.e;
        if (fG == 0.0f) {
            fG = 0.0f;
        } else if (i > 1) {
            fG = (int) (fG / i);
        }
        ((t1) jg0Var.X().a).D(fG, fG);
        try {
            this.w.invoke(jg0Var, new xf0(this, i));
        } finally {
            float f = -fG;
            ((t1) jg0Var.X().a).D(f, f);
        }
    }

    public final void p1() {
        this.C.c();
        this.D.c();
        kw0 kw0Var = this.E;
        if (kw0Var != null) {
            xp1.M(this).a(kw0Var);
        }
        this.E = null;
        this.F.setValue(Boolean.FALSE);
        ag0 ag0Var = this.B;
        ag0Var.e = 1.0f;
        ag0Var.f = 1.0f;
        ag0Var.g = 9205357640488583168L;
        ag0Var.h = qa1.e;
        ag0Var.i = 0.0f;
        ag0Var.j = null;
        ag0Var.k = 1;
        ag0Var.r = Float.NaN;
        ag0Var.s = Float.NaN;
        ag0Var.t = Float.NaN;
        ag0Var.u = Float.NaN;
        ag0Var.v = -1;
        ag0Var.w = null;
        ag0Var.x = Float.NaN;
        ag0Var.y = Float.NaN;
        ag0Var.z = Float.NaN;
        ag0Var.A = null;
        ag0Var.B = -1;
        ag0Var.C = 0;
        ag0Var.D = 0;
        ag0Var.E = 0.0f;
    }

    public final void q1(jg0 jg0Var, yf0 yf0Var) {
        int i;
        kw0 kw0Var;
        int i2;
        cg0 cg0Var;
        int i3;
        long j;
        kw0 kw0Var2 = yf0Var.a;
        if (kw0Var2 == null) {
            return;
        }
        float fG = yf0Var.d.g();
        int i4 = yf0Var.c;
        float f = 2.0f * fG;
        int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (jg0Var.a() >> 32)) + f);
        int iIntBitsToFloat2 = (int) (Float.intBitsToFloat((int) (jg0Var.a() & 4294967295L)) + f);
        int i5 = 0;
        int i6 = 1;
        if (i4 <= 1) {
            yf0Var.e = 1;
            jg0Var.b0(kw0Var2, (((long) iIntBitsToFloat) << 32) | (((long) iIntBitsToFloat2) & 4294967295L), new bg0(xp1.O(this).D, this, yf0Var, i5));
            if (fG == 0.0f) {
                j = 0;
            } else {
                long j2 = -((int) fG);
                j = (j2 & 4294967295L) | (j2 << 32);
            }
            if (!h41.a(kw0Var2.t, j)) {
                kw0Var2.t = j;
                kw0Var2.a.L((int) (j >> 32), (int) (j & 4294967295L), kw0Var2.u);
            }
            dh0.m(jg0Var, kw0Var2);
            return;
        }
        int i7 = 2;
        if (i4 <= 2) {
            yf0Var.e = 2;
            int i8 = iIntBitsToFloat / 2;
            if (i8 < 1) {
                i8 = 1;
            }
            int i9 = iIntBitsToFloat2 / 2;
            if (i9 < 1) {
                i9 = 1;
            }
            jg0Var.b0(kw0Var2, (((long) i8) << 32) | (4294967295L & ((long) i9)), new bg0(xp1.O(this).D, this, yf0Var, i6));
            n1(jg0Var, kw0Var2, i4, fG, i4, this.s.c(), this.s.d());
            return;
        }
        yf0Var.e = 2;
        int i10 = iIntBitsToFloat / 2;
        int i11 = i10 < 1 ? 1 : i10;
        int i12 = iIntBitsToFloat2 / 2;
        int i13 = i12 < 1 ? 1 : i12;
        kw0 kw0VarB = yf0Var.b(0);
        jg0Var.b0(kw0VarB, (((long) i11) << 32) | (((long) i13) & 4294967295L), new bg0(xp1.O(this).D, this, yf0Var, i7));
        if (i4 == 4) {
            i = i4;
            int i14 = i11 / 2;
            if (i14 < 1) {
                kw0Var = kw0Var2;
                i2 = 1;
            } else {
                kw0Var = kw0Var2;
                i2 = i14;
            }
            int i15 = i13 / 2;
            int i16 = i15 < 1 ? 1 : i15;
            cg0Var = this;
            cg0Var.m1(jg0Var, yf0Var, 0, kw0VarB, i11, i13, kw0Var, i2, i16, 0.5f, "Downsample2x", "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.25,  0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25,  0.25), minCoord, maxCoord));\n        return color * 0.25;\n    }\n");
        } else if (i4 == 8) {
            i = i4;
            int i17 = i11 / 4;
            if (i17 < 1) {
                kw0Var = kw0Var2;
                i3 = 1;
            } else {
                kw0Var = kw0Var2;
                i3 = i17;
            }
            int i18 = i13 / 4;
            int i19 = i18 < 1 ? 1 : i18;
            cg0Var = this;
            cg0Var.m1(jg0Var, yf0Var, 0, kw0VarB, i11, i13, kw0Var, i3, i19, 0.25f, "Downsample4x", "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.75,  0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75,  0.75), minCoord, maxCoord));\n        return color * 0.25;\n    }\n");
        } else {
            if (i4 != 16) {
                throw new IllegalStateException(("Unsupported scaleFactor: " + i4 + " (must be 1/2/4/8/16)").toString());
            }
            int i20 = i11 / 4;
            int i21 = i20 < 1 ? 1 : i20;
            int i22 = i13 / 4;
            int i23 = i22 < 1 ? 1 : i22;
            kw0 kw0VarB2 = yf0Var.b(1);
            m1(jg0Var, yf0Var, 0, kw0VarB, i11, i13, kw0VarB2, i21, i23, 0.25f, "Downsample4x", "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.75,  0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75,  0.75), minCoord, maxCoord));\n        return color * 0.25;\n    }\n");
            int i24 = i21;
            int i25 = i23;
            int i26 = i24 / 2;
            if (i26 < 1) {
                i26 = 1;
            }
            int i27 = i25 / 2;
            if (i27 < 1) {
                i27 = 1;
            }
            cg0Var = this;
            kw0Var = kw0Var2;
            cg0Var.m1(jg0Var, yf0Var, 1, kw0VarB2, i24, i25, kw0Var, i26, i27, 0.5f, "Downsample2x", "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.25,  0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25,  0.25), minCoord, maxCoord));\n        return color * 0.25;\n    }\n");
            i = i4;
        }
        cg0Var.n1(jg0Var, kw0Var, i, fG, i, cg0Var.s.c(), cg0Var.s.d());
    }

    public final void r1() {
        if (this.z) {
            yf0 yf0Var = this.C;
            yf0Var.a();
            ag0 ag0Var = this.B;
            ag0Var.B = -1;
            lu0 lu0Var = this.t;
            lu0Var.getClass();
            ag0Var.i = 0.0f;
            ag0Var.j = null;
            ag0Var.k = 1;
            lu0Var.invoke(ag0Var);
            ag0Var.getClass();
            kw0 kw0Var = yf0Var.a;
            if (kw0Var != null) {
                kw0Var.g(ag0Var.j);
            }
            yf0Var.d.h(ag0Var.i);
            int i = ag0Var.k;
            if (i < 1) {
                i = 1;
            }
            yf0Var.c = i;
            int i2 = ag0Var.C;
            int i3 = ag0Var.D;
            float f = ag0Var.E;
            w52 w52Var = this.F;
            if (i2 == i3 || f <= 0.001f) {
                w52Var.setValue(Boolean.FALSE);
                return;
            }
            yf0 yf0Var2 = this.D;
            yf0Var2.a();
            ag0Var.B = i3;
            lu0 lu0Var2 = this.t;
            lu0Var2.getClass();
            ag0Var.i = 0.0f;
            ag0Var.j = null;
            ag0Var.k = 1;
            lu0Var2.invoke(ag0Var);
            ag0Var.getClass();
            kw0 kw0Var2 = yf0Var2.a;
            if (kw0Var2 != null) {
                kw0Var2.g(ag0Var.j);
            }
            yf0Var2.d.h(ag0Var.i);
            int i4 = ag0Var.k;
            yf0Var2.c = i4 >= 1 ? i4 : 1;
            ag0Var.B = -1;
            this.G.h(f);
            w52Var.setValue(Boolean.TRUE);
        }
    }

    @Override // defpackage.ya1
    public final fr1 s(gr1 gr1Var, zq1 zq1Var, long j) {
        zq1Var.getClass();
        h82 h82VarS = zq1Var.s(j);
        return gr1Var.H0(h82VarS.e, h82VarS.f, vj0.e, new j(12, this, h82VarS));
    }
}
