package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q20 implements ScrollCaptureCallback {
    public final js2 a;
    public final l41 b;
    public final qn2 c;
    public final db d;
    public final CoroutineScope e;
    public final ey0 f;

    public q20(js2 js2Var, l41 l41Var, CoroutineScope coroutineScope, qn2 qn2Var, db dbVar) {
        this.a = js2Var;
        this.b = l41Var;
        this.c = qn2Var;
        this.d = dbVar;
        this.e = CoroutineScopeKt.plus(coroutineScope, xc0.f);
        this.f = new ey0(l41Var.b(), new p20(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ScrollCaptureSession scrollCaptureSession, l41 l41Var, r60 r60Var) {
        o20 o20Var;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionL;
        int i3;
        l41 l41Var2;
        int i4;
        int iV;
        int iV2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (r60Var instanceof o20) {
            o20Var = (o20) r60Var;
            int i7 = o20Var.k;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                o20Var.k = i7 - Integer.MIN_VALUE;
            } else {
                o20Var = new o20(this, r60Var);
            }
        } else {
            o20Var = new o20(this, r60Var);
        }
        Object obj = o20Var.i;
        int i8 = o20Var.k;
        ey0 ey0Var = this.f;
        z70 z70Var = z70.e;
        if (i8 == 0) {
            ee0.J(obj);
            i = l41Var.b;
            i2 = l41Var.d;
            o20Var.e = scrollCaptureSession;
            o20Var.f = l41Var;
            o20Var.g = i;
            o20Var.h = i2;
            o20Var.k = 1;
            int i9 = ey0Var.a;
            if (i > i2) {
                fo.f(p91.n("Expected min=", i, i2, " ≤ max="));
                return null;
            }
            int i10 = i2 - i;
            if (i10 > i9) {
                fo.f(p91.n("Expected range (", i10, i9, ") to be ≤ viewportSize="));
                return null;
            }
            float f = i;
            float f2 = ey0Var.b;
            Object obj2 = mf3.a;
            if (f < f2 || i2 > i9 + f2) {
                Object objB = ey0Var.b((((i10 / 2) + i) - (i9 / 2)) - f2, o20Var);
                if (objB != z70Var) {
                    objB = obj2;
                }
                if (objB == z70Var) {
                    obj2 = objB;
                }
            }
            if (obj2 != z70Var) {
            }
            return z70Var;
        }
        if (i8 == 1) {
            int i11 = o20Var.h;
            int i12 = o20Var.g;
            l41 l41Var3 = o20Var.f;
            ScrollCaptureSession scrollCaptureSessionL2 = ob.l(o20Var.e);
            ee0.J(obj);
            i = i12;
            l41Var = l41Var3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSessionL2;
        } else {
            if (i8 != 2) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = o20Var.h;
            i4 = o20Var.g;
            l41Var2 = o20Var.f;
            scrollCaptureSessionL = ob.l(o20Var.e);
            ee0.J(obj);
        }
        iV = mh0.v(i4 - xq1.P(ey0Var.b), 0, ey0Var.a);
        iV2 = mh0.v(i3 - xq1.P(ey0Var.b), 0, ey0Var.a);
        i5 = l41Var2.a;
        i6 = l41Var2.c;
        if (iV == iV2) {
            return l41.e;
        }
        canvasLockHardwareCanvas = scrollCaptureSessionL.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iV);
            l41 l41Var4 = this.b;
            canvasLockHardwareCanvas.translate(-l41Var4.a, -l41Var4.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iP = xq1.P(ey0Var.b);
            return new l41(i5, iV + iP, i6, iV2 + iP);
        } finally {
            scrollCaptureSessionL.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        wa waVar = wa.z;
        o20Var.e = scrollCaptureSession;
        o20Var.f = l41Var;
        o20Var.g = i;
        o20Var.h = i2;
        o20Var.k = 2;
        if (mh0.K(o20Var.getContext()).a(waVar, o20Var) != z70Var) {
            scrollCaptureSessionL = scrollCaptureSession;
            i3 = i2;
            l41Var2 = l41Var;
            i4 = i;
            iV = mh0.v(i4 - xq1.P(ey0Var.b), 0, ey0Var.a);
            iV2 = mh0.v(i3 - xq1.P(ey0Var.b), 0, ey0Var.a);
            i5 = l41Var2.a;
            i6 = l41Var2.c;
            if (iV == iV2) {
                return l41.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionL.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iV);
            l41 l41Var5 = this.b;
            canvasLockHardwareCanvas.translate(-l41Var5.a, -l41Var5.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iP2 = xq1.P(ey0Var.b);
            return new l41(i5, iV + iP2, i6, iV2 + iP2);
        }
        return z70Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        BuildersKt__Builders_commonKt.launch$default(this.e, NonCancellable.INSTANCE, null, new k(this, runnable, null, 11), 2, null);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new t3(this, scrollCaptureSession, rect, consumer, null, 4), 3, null);
        jobLaunch$default.invokeOnCompletion(new q9(cancellationSignal, 11));
        cancellationSignal.setOnCancelListener(new r20(jobLaunch$default, 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(vd0.H(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        this.c.a.setValue(Boolean.TRUE);
        runnable.run();
    }
}
