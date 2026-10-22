package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xv implements jg0 {
    public final wv e;
    public final gn f;
    public je g;
    public je h;

    public xv() {
        ac0 ac0Var = am1.C;
        wv wvVar = new wv();
        wvVar.a = ac0Var;
        wvVar.b = qa1.e;
        wvVar.c = rj0.a;
        wvVar.d = 0L;
        this.e = wvVar;
        gn gnVar = new gn();
        gnVar.c = this;
        gnVar.a = new t1(gnVar, 7);
        this.f = gnVar;
    }

    public static je c(xv xvVar, long j, kg0 kg0Var, float f, int i) {
        je jeVarS = xvVar.s(kg0Var);
        Paint paint = (Paint) jeVarS.c;
        if (f != 1.0f) {
            j = hz.c(hz.d(j) * f, j);
        }
        long jC = xp1.c(paint.getColor());
        int i2 = hz.h;
        if (!ye3.a(jC, j)) {
            jeVarS.g(j);
        }
        if (((Shader) jeVarS.d) != null) {
            jeVarS.k(null);
        }
        if (!o51.f((rr) jeVarS.e, null)) {
            jeVarS.h(null);
        }
        if (jeVarS.b != i) {
            jeVarS.f(i);
        }
        if (paint.isFilterBitmap()) {
            return jeVarS;
        }
        jeVarS.i(1);
        return jeVarS;
    }

    @Override // defpackage.xb0
    public final float D() {
        return this.e.a.D();
    }

    @Override // defpackage.jg0
    public final void N0(long j, float f, long j2, kg0 kg0Var) {
        this.e.c.d(f, j2, c(this, j, kg0Var, 1.0f, 3));
    }

    @Override // defpackage.jg0
    public final void Q(long j, long j2, long j3, long j4, kg0 kg0Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.e.c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), c(this, j, kg0Var, 1.0f, 3));
    }

    @Override // defpackage.jg0
    public final void V(long j, long j2, long j3, float f, kg0 kg0Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.e.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), c(this, j, kg0Var, f, i));
    }

    @Override // defpackage.jg0
    public final gn X() {
        return this.f;
    }

    @Override // defpackage.jg0
    public final void Y0(long j, float f, float f2, long j2, long j3, kg0 kg0Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.e.c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, c(this, j, kg0Var, 1.0f, 3));
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.e.a.g();
    }

    @Override // defpackage.jg0
    public final qa1 getLayoutDirection() {
        return this.e.b;
    }

    public final je h(st stVar, kg0 kg0Var, float f, rr rrVar, int i, int i2) {
        je jeVarS = s(kg0Var);
        Paint paint = (Paint) jeVarS.c;
        if (stVar != null) {
            stVar.a(f, a(), jeVarS);
        } else {
            if (((Shader) jeVarS.d) != null) {
                jeVarS.k(null);
            }
            long jC = xp1.c(paint.getColor());
            long j = hz.b;
            if (!ye3.a(jC, j)) {
                jeVarS.g(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                jeVarS.e(f);
            }
        }
        if (!o51.f((rr) jeVarS.e, rrVar)) {
            jeVarS.h(rrVar);
        }
        if (jeVarS.b != i) {
            jeVarS.f(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return jeVarS;
        }
        jeVarS.i(i2);
        return jeVarS;
    }

    @Override // defpackage.jg0
    public final void l0(td tdVar, long j, long j2, long j3, float f, rr rrVar, int i) {
        this.e.c.e(tdVar, j, j2, j3, h(null, en0.a, f, rrVar, 3, i));
    }

    public final je s(kg0 kg0Var) {
        if (o51.f(kg0Var, en0.a)) {
            je jeVar = this.g;
            if (jeVar != null) {
                return jeVar;
            }
            je jeVarN = xq1.n();
            jeVarN.o(0);
            this.g = jeVarN;
            return jeVarN;
        }
        if (!(kg0Var instanceof t13)) {
            b81.d();
            return null;
        }
        je jeVarN2 = this.h;
        if (jeVarN2 == null) {
            jeVarN2 = xq1.n();
            jeVarN2.o(1);
            this.h = jeVarN2;
        }
        Paint paint = (Paint) jeVarN2.c;
        float strokeWidth = paint.getStrokeWidth();
        t13 t13Var = (t13) kg0Var;
        float f = t13Var.a;
        if (strokeWidth != f) {
            jeVarN2.n(f);
        }
        int iB = jeVarN2.b();
        int i = t13Var.c;
        if (iB != i) {
            jeVarN2.l(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = t13Var.b;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iC = jeVarN2.c();
        int i2 = t13Var.d;
        if (iC != i2) {
            jeVarN2.m(i2);
        }
        if (!o51.f(null, null)) {
            jeVarN2.j(null);
        }
        return jeVarN2;
    }

    @Override // defpackage.jg0
    public final void t0(long j, long j2, long j3, float f, int i) {
        vv vvVar = this.e.c;
        je jeVarN = this.h;
        if (jeVarN == null) {
            jeVarN = xq1.n();
            jeVarN.o(1);
            this.h = jeVarN;
        }
        Paint paint = (Paint) jeVarN.c;
        long jC = xp1.c(paint.getColor());
        int i2 = hz.h;
        if (!ye3.a(jC, j)) {
            jeVarN.g(j);
        }
        if (((Shader) jeVarN.d) != null) {
            jeVarN.k(null);
        }
        if (!o51.f((rr) jeVarN.e, null)) {
            jeVarN.h(null);
        }
        if (jeVarN.b != 3) {
            jeVarN.f(3);
        }
        if (paint.getStrokeWidth() != f) {
            jeVarN.n(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (jeVarN.b() != i) {
            jeVarN.l(i);
        }
        if (jeVarN.c() != 0) {
            jeVarN.m(0);
        }
        if (!o51.f(null, null)) {
            jeVarN.j(null);
        }
        if (!paint.isFilterBitmap()) {
            jeVarN.i(1);
        }
        vvVar.m(j2, j3, jeVarN);
    }

    @Override // defpackage.jg0
    public final void w0(re reVar, long j, kg0 kg0Var) {
        this.e.c.h(reVar, c(this, j, kg0Var, 1.0f, 3));
    }

    @Override // defpackage.jg0
    public final void y(re reVar, st stVar, float f, kg0 kg0Var, int i) {
        this.e.c.h(reVar, h(stVar, kg0Var, f, null, i, 1));
    }
}
