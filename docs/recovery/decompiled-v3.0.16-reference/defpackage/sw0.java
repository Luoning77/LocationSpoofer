package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sw0 implements mw0 {
    public final yv b;
    public final xv c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public rr k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public boolean t;
    public boolean u;
    public boolean v;
    public t20 w;
    public int x;

    public sw0() {
        yv yvVar = new yv();
        xv xvVar = new xv();
        this.b = yvVar;
        this.c = xvVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        c(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.l = 1.0f;
        this.m = 1.0f;
        long j = hz.b;
        this.q = j;
        this.r = j;
        this.s = 8.0f;
        this.x = 0;
    }

    @Override // defpackage.mw0
    public final float A() {
        return this.s;
    }

    @Override // defpackage.mw0
    public final void B() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.mw0
    public final float C() {
        return this.n;
    }

    @Override // defpackage.mw0
    public final void D(vv vvVar) {
        Canvas canvas = ha.a;
        ((ga) vvVar).a.drawRenderNode(this.d);
    }

    @Override // defpackage.mw0
    public final int E() {
        return this.x;
    }

    @Override // defpackage.mw0
    public final float F() {
        return 0.0f;
    }

    @Override // defpackage.mw0
    public final void G(xb0 xb0Var, qa1 qa1Var, kw0 kw0Var, q9 q9Var) {
        xv xvVar = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        try {
            yv yvVar = this.b;
            ga gaVar = yvVar.a;
            Canvas canvas = gaVar.a;
            gaVar.a = recordingCanvasBeginRecording;
            gn gnVar = xvVar.f;
            gnVar.D(xb0Var);
            gnVar.E(qa1Var);
            gnVar.b = kw0Var;
            gnVar.F(this.e);
            gnVar.C(gaVar);
            q9Var.invoke(xvVar);
            yvVar.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.mw0
    public final rr H() {
        return this.k;
    }

    @Override // defpackage.mw0
    public final void I(int i) {
        this.x = i;
        g();
    }

    @Override // defpackage.mw0
    public final void J(t20 t20Var) {
        this.w = t20Var;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(t20Var != null ? t20Var.c() : null);
        }
    }

    @Override // defpackage.mw0
    public final Matrix K() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.mw0
    public final void L(int i, int i2, long j) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = mc0.J(j);
    }

    @Override // defpackage.mw0
    public final float M() {
        return 0.0f;
    }

    @Override // defpackage.mw0
    public final float N() {
        return this.p;
    }

    @Override // defpackage.mw0
    public final boolean O() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.mw0
    public final float P() {
        return 0.0f;
    }

    @Override // defpackage.mw0
    public final int Q() {
        return this.j;
    }

    @Override // defpackage.mw0
    public final void R(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.mw0
    public final long S() {
        return this.q;
    }

    public final void a() {
        boolean z = this.t;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.u) {
            this.u = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.v) {
            this.v = z2;
            this.d.setClipToOutline(z2);
        }
    }

    @Override // defpackage.mw0
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    public final void c(RenderNode renderNode, int i) {
        Paint paint = this.f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.mw0
    public final void d(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.mw0
    public final float e() {
        return this.l;
    }

    @Override // defpackage.mw0
    public final void f(float f) {
        this.p = f;
        this.d.setElevation(f);
    }

    public final void g() {
        int i = this.x;
        if (i != 1 && this.j == 3 && this.k == null && this.w == null) {
            c(this.d, i);
        } else {
            c(this.d, 1);
        }
    }

    @Override // defpackage.mw0
    public final void i() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.mw0
    public final void j(float f) {
        this.o = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.mw0
    public final void k(long j) {
        this.q = j;
        this.d.setAmbientShadowColor(xp1.T(j));
    }

    @Override // defpackage.mw0
    public final void l(float f) {
        this.l = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.mw0
    public final void m(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(k22.I(i));
        g();
    }

    @Override // defpackage.mw0
    public final void n(boolean z) {
        this.t = z;
        a();
    }

    @Override // defpackage.mw0
    public final void o() {
        this.d.setRotationZ(0.0f);
    }

    @Override // defpackage.mw0
    public final void p(float f) {
        this.n = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.mw0
    public final void q(long j) {
        this.r = j;
        this.d.setSpotShadowColor(xp1.T(j));
    }

    @Override // defpackage.mw0
    public final void r(float f) {
        this.m = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.mw0
    public final float s() {
        return this.i;
    }

    @Override // defpackage.mw0
    public final void t(rr rrVar) {
        this.k = rrVar;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(rrVar != null ? rrVar.a : null);
        g();
    }

    @Override // defpackage.mw0
    public final void u(float f) {
        this.s = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.mw0
    public final float v() {
        return this.m;
    }

    @Override // defpackage.mw0
    public final float w() {
        return this.o;
    }

    @Override // defpackage.mw0
    public final t20 x() {
        return this.w;
    }

    @Override // defpackage.mw0
    public final long y() {
        return this.r;
    }

    @Override // defpackage.mw0
    public final void z(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        a();
    }
}
