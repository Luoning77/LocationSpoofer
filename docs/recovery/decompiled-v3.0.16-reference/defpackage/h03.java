package defpackage;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h03 implements i03 {
    public final /* synthetic */ j03 a;

    public h03(j03 j03Var) {
        this.a = j03Var;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        j03 j03Var = this.a;
        return j03Var.b(10) && ((i03) j03Var.h).onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        j03 j03Var = this.a;
        return j03Var.b(11) && ((i03) j03Var.h).onDoubleTapEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        j03 j03Var = this.a;
        return j03Var.b(9) && ((i03) j03Var.h).onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        j03 j03Var = this.a;
        return j03Var.b(7) && ((i03) j03Var.h).onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        j03 j03Var = this.a;
        if (j03Var.b(6)) {
            ((i03) j03Var.h).onLongPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        j03 j03Var = this.a;
        return j03Var.b(0) && ((i03) j03Var.h).onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        j03 j03Var = this.a;
        if (j03Var.b(8)) {
            ((i03) j03Var.h).onShowPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        j03 j03Var = this.a;
        return j03Var.b(12) && ((i03) j03Var.h).onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j03 j03Var = this.a;
        return j03Var.b(5) && ((i03) j03Var.h).onSingleTapUp(motionEvent);
    }
}
