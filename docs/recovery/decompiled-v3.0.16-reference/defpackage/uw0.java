package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uw0 implements mw0 {
    public static final tw0 A = new tw0();
    public final gg0 b;
    public final yv c;
    public final fj3 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public rr o;
    public int p;
    public float q;
    public boolean r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public long x;
    public long y;
    public t20 z;

    public uw0(gg0 gg0Var) {
        yv yvVar = new yv();
        xv xvVar = new xv();
        this.b = gg0Var;
        this.c = yvVar;
        fj3 fj3Var = new fj3(gg0Var, yvVar, xvVar);
        this.d = fj3Var;
        this.e = gg0Var.getResources();
        this.f = new Rect();
        gg0Var.addView(fj3Var);
        fj3Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.p = 0;
        this.q = 1.0f;
        this.s = 1.0f;
        this.t = 1.0f;
        long j = hz.b;
        this.x = j;
        this.y = j;
    }

    @Override // defpackage.mw0
    public final float A() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.mw0
    public final void B() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.mw0
    public final float C() {
        return this.u;
    }

    @Override // defpackage.mw0
    public final void D(vv vvVar) {
        Rect rect;
        boolean z = this.k;
        fj3 fj3Var = this.d;
        if (z) {
            if ((this.m || fj3Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = fj3Var.getWidth();
                rect.bottom = fj3Var.getHeight();
            } else {
                rect = null;
            }
            fj3Var.setClipBounds(rect);
        }
        Canvas canvas = ha.a;
        if (((ga) vvVar).a.isHardwareAccelerated()) {
            this.b.a(vvVar, fj3Var, fj3Var.getDrawingTime());
        }
    }

    @Override // defpackage.mw0
    public final int E() {
        return this.p;
    }

    @Override // defpackage.mw0
    public final float F() {
        return 0.0f;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mw0
    public final void G(xb0 xb0Var, qa1 qa1Var, kw0 kw0Var, q9 q9Var) {
        fj3 fj3Var = this.d;
        ViewParent parent = fj3Var.getParent();
        gg0 gg0Var = this.b;
        if (parent == null) {
            gg0Var.addView(fj3Var);
        }
        fj3Var.k = xb0Var;
        fj3Var.l = qa1Var;
        fj3Var.m = q9Var;
        fj3Var.n = kw0Var;
        if (fj3Var.isAttachedToWindow()) {
            fj3Var.setVisibility(4);
            fj3Var.setVisibility(0);
            try {
                ga gaVar = this.c.a;
                tw0 tw0Var = A;
                Canvas canvas = gaVar.a;
                gaVar.a = tw0Var;
                gg0Var.a(gaVar, fj3Var, fj3Var.getDrawingTime());
                gaVar.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.mw0
    public final rr H() {
        return this.o;
    }

    @Override // defpackage.mw0
    public final void I(int i) {
        this.p = i;
        c();
    }

    @Override // defpackage.mw0
    public final void J(t20 t20Var) {
        this.z = t20Var;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(t20Var != null ? t20Var.c() : null);
        }
    }

    @Override // defpackage.mw0
    public final Matrix K() {
        return this.d.getMatrix();
    }

    @Override // defpackage.mw0
    public final void L(int i, int i2, long j) {
        boolean zB = p41.b(this.j, j);
        fj3 fj3Var = this.d;
        if (zB) {
            int i3 = this.h;
            if (i3 != i) {
                fj3Var.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                fj3Var.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || fj3Var.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            fj3Var.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.r) {
                fj3Var.setPivotX(i5 / 2.0f);
                fj3Var.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.mw0
    public final float M() {
        return 0.0f;
    }

    @Override // defpackage.mw0
    public final float N() {
        return this.w;
    }

    @Override // defpackage.mw0
    public final float P() {
        return 0.0f;
    }

    @Override // defpackage.mw0
    public final int Q() {
        return this.n;
    }

    @Override // defpackage.mw0
    public final void R(long j) {
        long j2 = 9223372034707292159L & j;
        fj3 fj3Var = this.d;
        if (j2 != 9205357640488583168L) {
            this.r = false;
            fj3Var.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            fj3Var.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                fj3Var.resetPivot();
                return;
            }
            this.r = true;
            fj3Var.setPivotX(((int) (this.j >> 32)) / 2.0f);
            fj3Var.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // defpackage.mw0
    public final long S() {
        return this.x;
    }

    public final void a(int i) {
        Paint paint = this.g;
        fj3 fj3Var = this.d;
        boolean z = true;
        if (i == 1) {
            fj3Var.setLayerType(2, paint);
        } else if (i == 2) {
            fj3Var.setLayerType(0, paint);
            z = false;
        } else {
            fj3Var.setLayerType(0, paint);
        }
        fj3Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // defpackage.mw0
    public final void b() {
        this.d.setRotationX(0.0f);
    }

    public final void c() {
        int i = this.p;
        if (i != 1 && this.n == 3 && this.o == null) {
            a(i);
        } else {
            a(1);
        }
    }

    @Override // defpackage.mw0
    public final void d(float f) {
        this.q = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.mw0
    public final float e() {
        return this.s;
    }

    @Override // defpackage.mw0
    public final void f(float f) {
        this.w = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.mw0
    public final void i() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.mw0
    public final void j(float f) {
        this.v = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.mw0
    public final void k(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.x = j;
            this.d.setOutlineAmbientShadowColor(xp1.T(j));
        }
    }

    @Override // defpackage.mw0
    public final void l(float f) {
        this.s = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.mw0
    public final void m(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(k22.J(i)));
        c();
    }

    @Override // defpackage.mw0
    public final void n(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.mw0
    public final void o() {
        this.d.setRotation(0.0f);
    }

    @Override // defpackage.mw0
    public final void p(float f) {
        this.u = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.mw0
    public final void q(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = j;
            this.d.setOutlineSpotShadowColor(xp1.T(j));
        }
    }

    @Override // defpackage.mw0
    public final void r(float f) {
        this.t = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.mw0
    public final float s() {
        return this.q;
    }

    @Override // defpackage.mw0
    public final void t(rr rrVar) {
        this.o = rrVar;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(rrVar != null ? rrVar.a : null);
        c();
    }

    @Override // defpackage.mw0
    public final void u(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.mw0
    public final float v() {
        return this.t;
    }

    @Override // defpackage.mw0
    public final float w() {
        return this.v;
    }

    @Override // defpackage.mw0
    public final t20 x() {
        return this.z;
    }

    @Override // defpackage.mw0
    public final long y() {
        return this.y;
    }

    @Override // defpackage.mw0
    public final void z(Outline outline, long j) {
        fj3 fj3Var = this.d;
        fj3Var.i = outline;
        fj3Var.invalidateOutline();
        if ((this.m || fj3Var.getClipToOutline()) && outline != null) {
            fj3Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }
}
