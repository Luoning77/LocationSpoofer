package defpackage;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l03 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ m03 a;

    public l03(m03 m03Var) {
        this.a = m03Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            m03 m03Var = this.a;
            m03Var.w = true;
            m03Var.x = new PointF(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }
}
