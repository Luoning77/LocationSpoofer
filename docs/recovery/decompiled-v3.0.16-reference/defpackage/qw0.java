package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qw0 implements mw0 {
    public static final AtomicBoolean A = new AtomicBoolean(true);
    public final yv b;
    public final xv c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public rr l;
    public float m;
    public boolean n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public long t;
    public long u;
    public float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public t20 z;

    public qw0(db dbVar, yv yvVar, xv xvVar) {
        this.b = yvVar;
        this.c = xvVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", dbVar);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (A.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                sf2.c(renderNodeCreate, sf2.a(renderNodeCreate));
                sf2.d(renderNodeCreate, sf2.b(renderNodeCreate));
            }
            rf2.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        c(0);
        this.j = 0;
        this.k = 3;
        this.m = 1.0f;
        this.o = 1.0f;
        this.p = 1.0f;
        long j = hz.b;
        this.t = j;
        this.u = j;
        this.v = 8.0f;
    }

    @Override // defpackage.mw0
    public final float A() {
        return this.v;
    }

    @Override // defpackage.mw0
    public final void B() {
        rf2.a(this.d);
    }

    @Override // defpackage.mw0
    public final float C() {
        return this.q;
    }

    @Override // defpackage.mw0
    public final void D(vv vvVar) {
        Canvas canvas = ha.a;
        DisplayListCanvas displayListCanvas = ((ga) vvVar).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.mw0
    public final int E() {
        return this.j;
    }

    @Override // defpackage.mw0
    public final float F() {
        return 0.0f;
    }

    @Override // defpackage.mw0
    public final void G(xb0 xb0Var, qa1 qa1Var, kw0 kw0Var, q9 q9Var) {
        Canvas canvasStart = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (this.i & 4294967295L)));
        try {
            ga gaVar = this.b.a;
            Canvas canvas = gaVar.a;
            gaVar.a = canvasStart;
            xv xvVar = this.c;
            gn gnVar = xvVar.f;
            long J = mc0.J(this.e);
            xb0 xb0VarL = gnVar.l();
            qa1 qa1VarQ = gnVar.q();
            vv vvVarI = gnVar.i();
            long jR = gnVar.r();
            kw0 kw0Var2 = (kw0) gnVar.b;
            gnVar.D(xb0Var);
            gnVar.E(qa1Var);
            gnVar.C(gaVar);
            gnVar.F(J);
            gnVar.b = kw0Var;
            gaVar.l();
            try {
                q9Var.invoke(xvVar);
                gaVar.i();
                gnVar.D(xb0VarL);
                gnVar.E(qa1VarQ);
                gnVar.C(vvVarI);
                gnVar.F(jR);
                gnVar.b = kw0Var2;
                gaVar.a = canvas;
                this.d.end(canvasStart);
            } catch (Throwable th) {
                gaVar.i();
                gn gnVar2 = xvVar.f;
                gnVar2.D(xb0VarL);
                gnVar2.E(qa1VarQ);
                gnVar2.C(vvVarI);
                gnVar2.F(jR);
                gnVar2.b = kw0Var2;
                throw th;
            }
        } catch (Throwable th2) {
            this.d.end(canvasStart);
            throw th2;
        }
    }

    @Override // defpackage.mw0
    public final rr H() {
        return this.l;
    }

    @Override // defpackage.mw0
    public final void I(int i) {
        this.j = i;
        g();
    }

    @Override // defpackage.mw0
    public final void J(t20 t20Var) {
        this.z = t20Var;
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
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (p41.b(this.e, j)) {
            return;
        }
        if (this.n) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // defpackage.mw0
    public final float M() {
        return 0.0f;
    }

    @Override // defpackage.mw0
    public final float N() {
        return this.s;
    }

    @Override // defpackage.mw0
    public final boolean O() {
        return this.d.isValid();
    }

    @Override // defpackage.mw0
    public final float P() {
        return 0.0f;
    }

    @Override // defpackage.mw0
    public final int Q() {
        return this.k;
    }

    @Override // defpackage.mw0
    public final void R(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.n = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.n = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.mw0
    public final long S() {
        return this.t;
    }

    public final void a() {
        boolean z = this.w;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.x) {
            this.x = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.y) {
            this.y = z2;
            this.d.setClipToOutline(z2);
        }
    }

    @Override // defpackage.mw0
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    public final void c(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.mw0
    public final void d(float f) {
        this.m = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.mw0
    public final float e() {
        return this.o;
    }

    @Override // defpackage.mw0
    public final void f(float f) {
        this.s = f;
        this.d.setElevation(f);
    }

    public final void g() {
        int i = this.j;
        if (i != 1 && this.k == 3 && this.l == null) {
            c(i);
        } else {
            c(1);
        }
    }

    @Override // defpackage.mw0
    public final void i() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.mw0
    public final void j(float f) {
        this.r = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.mw0
    public final void k(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.t = j;
            sf2.c(this.d, xp1.T(j));
        }
    }

    @Override // defpackage.mw0
    public final void l(float f) {
        this.o = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.mw0
    public final void m(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(k22.J(i)));
        g();
    }

    @Override // defpackage.mw0
    public final void n(boolean z) {
        this.w = z;
        a();
    }

    @Override // defpackage.mw0
    public final void o() {
        this.d.setRotation(0.0f);
    }

    @Override // defpackage.mw0
    public final void p(float f) {
        this.q = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.mw0
    public final void q(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            sf2.d(this.d, xp1.T(j));
        }
    }

    @Override // defpackage.mw0
    public final void r(float f) {
        this.p = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.mw0
    public final float s() {
        return this.m;
    }

    @Override // defpackage.mw0
    public final void t(rr rrVar) {
        this.l = rrVar;
        if (rrVar == null) {
            g();
            return;
        }
        c(1);
        RenderNode renderNode = this.d;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(rrVar.a);
        renderNode.setLayerPaint(paint);
    }

    @Override // defpackage.mw0
    public final void u(float f) {
        this.v = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.mw0
    public final float v() {
        return this.p;
    }

    @Override // defpackage.mw0
    public final float w() {
        return this.r;
    }

    @Override // defpackage.mw0
    public final t20 x() {
        return this.z;
    }

    @Override // defpackage.mw0
    public final long y() {
        return this.u;
    }

    @Override // defpackage.mw0
    public final void z(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        a();
    }
}
