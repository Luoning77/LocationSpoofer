package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fj3 extends View {
    public static final rc0 o = new rc0(2);
    public final gg0 e;
    public final yv f;
    public final xv g;
    public boolean h;
    public Outline i;
    public boolean j;
    public xb0 k;
    public qa1 l;
    public lu0 m;
    public kw0 n;

    public fj3(gg0 gg0Var, yv yvVar, xv xvVar) {
        super(gg0Var.getContext());
        this.e = gg0Var;
        this.f = yvVar;
        this.g = xvVar;
        setOutlineProvider(o);
        this.j = true;
        this.k = am1.C;
        this.l = qa1.e;
        mw0.a.getClass();
        this.m = ik0.l;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        yv yvVar = this.f;
        ga gaVar = yvVar.a;
        Canvas canvas2 = gaVar.a;
        gaVar.a = canvas;
        xb0 xb0Var = this.k;
        qa1 qa1Var = this.l;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        kw0 kw0Var = this.n;
        lu0 lu0Var = this.m;
        xv xvVar = this.g;
        xb0 xb0VarL = xvVar.f.l();
        gn gnVar = xvVar.f;
        qa1 qa1VarQ = gnVar.q();
        vv vvVarI = gnVar.i();
        long jR = gnVar.r();
        kw0 kw0Var2 = (kw0) gnVar.b;
        gnVar.D(xb0Var);
        gnVar.E(qa1Var);
        gnVar.C(gaVar);
        gnVar.F(jFloatToRawIntBits);
        gnVar.b = kw0Var;
        gaVar.l();
        try {
            lu0Var.invoke(xvVar);
            gaVar.i();
            gnVar.D(xb0VarL);
            gnVar.E(qa1VarQ);
            gnVar.C(vvVarI);
            gnVar.F(jR);
            gnVar.b = kw0Var2;
            yvVar.a.a = canvas2;
            this.h = false;
        } catch (Throwable th) {
            gaVar.i();
            gnVar.D(xb0VarL);
            gnVar.E(qa1VarQ);
            gnVar.C(vvVarI);
            gnVar.F(jR);
            gnVar.b = kw0Var2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.j;
    }

    public final yv getCanvasHolder() {
        return this.f;
    }

    public final View getOwnerView() {
        return this.e;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.j;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.h) {
            return;
        }
        this.h = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.h = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
