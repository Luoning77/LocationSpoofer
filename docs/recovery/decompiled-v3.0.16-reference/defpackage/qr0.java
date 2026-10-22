package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qr0 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ rr0 f;

    public /* synthetic */ qr0(rr0 rr0Var, int i) {
        this.e = i;
        this.f = rr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        rr0 rr0Var = this.f;
        switch (i) {
            case 0:
                ViewParent parent = rr0Var.h.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                rr0Var.a();
                View view = rr0Var.h;
                if (view.isEnabled() && !view.isLongClickable() && rr0Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    rr0Var.k = true;
                    break;
                }
                break;
        }
    }
}
