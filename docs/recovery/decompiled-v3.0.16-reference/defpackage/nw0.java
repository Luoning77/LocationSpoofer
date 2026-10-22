package defpackage;

import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nw0 implements s42 {
    public kw0 e;
    public final iw0 f;
    public final db g;
    public pu0 h;
    public au0 i;
    public boolean k;
    public float[] m;
    public boolean n;
    public int r;
    public vd0 t;
    public boolean u;
    public boolean v;
    public boolean x;
    public long j = 9223372034707292159L;
    public final float[] l = yq1.a();
    public xb0 o = ym3.i();
    public qa1 p = qa1.e;
    public final xv q = new xv();
    public long s = ac3.b;
    public boolean w = true;
    public final q9 y = new q9(this, 16);

    public nw0(kw0 kw0Var, iw0 iw0Var, db dbVar, pu0 pu0Var, au0 au0Var) {
        this.e = kw0Var;
        this.f = iw0Var;
        this.g = dbVar;
        this.h = pu0Var;
        this.i = au0Var;
    }

    public final float[] a() {
        float[] fArrA = this.m;
        if (fArrA == null) {
            fArrA = yq1.a();
            this.m = fArrA;
        }
        if (this.v) {
            this.v = false;
            float[] fArrB = b();
            if (this.w) {
                return fArrB;
            }
            if (!ld0.A(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.u;
        float[] fArr = this.l;
        if (z) {
            kw0 kw0Var = this.e;
            long jZ = kw0Var.v;
            mw0 mw0Var = kw0Var.a;
            if ((9223372034707292159L & jZ) == 9205357640488583168L) {
                jZ = gh0.z(mc0.J(this.j));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jZ >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jZ & 4294967295L));
            float fC = mw0Var.C();
            float fW = mw0Var.w();
            float F = mw0Var.F();
            float fM = mw0Var.M();
            float fP = mw0Var.P();
            float fE = mw0Var.e();
            float fV = mw0Var.v();
            double d = ((double) F) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fW * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fW * fSin);
            double d2 = ((double) fM) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fC * fCos2);
            float f10 = (f3 * fCos2) + ((-fC) * fSin2);
            double d3 = ((double) fP) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fE;
            float f16 = f14 * fE;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fE;
            float f18 = f12 * fV;
            float f19 = fCos * fCos3 * fV;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fV;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.u = false;
            this.w = mh0.M(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.n || this.k) {
            return;
        }
        this.g.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zL = db.l();
        db dbVar = this.g;
        if (zL) {
            dbVar.L(-4.0f);
        }
        kw0 kw0Var = this.e;
        if (!h41.a(kw0Var.t, j)) {
            kw0Var.t = j;
            kw0Var.a.L((int) (j >> 32), (int) (j & 4294967295L), kw0Var.u);
        }
        ViewParent parent = dbVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(dbVar, dbVar);
        }
    }

    public final void e(long j) {
        if (p41.b(j, this.j)) {
            return;
        }
        if (db.l()) {
            this.g.L(-4.0f);
        }
        this.j = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.n) {
            this.n = z;
            db dbVar = this.g;
            sx1 sx1Var = dbVar.I;
            boolean z2 = dbVar.K;
            if (!z) {
                if (z2) {
                    return;
                }
                sx1Var.j(this);
                sx1 sx1Var2 = dbVar.J;
                if (sx1Var2 != null) {
                    sx1Var2.j(this);
                    return;
                }
                return;
            }
            if (!z2) {
                sx1Var.a(this);
                return;
            }
            sx1 sx1Var3 = dbVar.J;
            if (sx1Var3 == null) {
                sx1Var3 = new sx1();
                dbVar.J = sx1Var3;
            }
            sx1Var3.a(this);
        }
    }

    public final void g() {
        db.l();
        if (this.n) {
            if (!ac3.a(this.s, ac3.b) && !p41.b(this.e.u, this.j)) {
                kw0 kw0Var = this.e;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.s >> 32)) * ((int) (this.j >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.s & 4294967295L)) * ((int) (this.j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!c12.b(kw0Var.v, jFloatToRawIntBits)) {
                    kw0Var.v = jFloatToRawIntBits;
                    kw0Var.a.R(jFloatToRawIntBits);
                }
            }
            this.e.e(this.o, this.p, this.j, this.y);
            f(false);
        }
    }
}
