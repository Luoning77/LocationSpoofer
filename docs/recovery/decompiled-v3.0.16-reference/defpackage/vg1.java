package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vg1 implements View.OnTouchListener {
    public final /* synthetic */ wg1 e;

    public vg1(wg1 wg1Var) {
        this.e = wg1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        wg1 wg1Var = this.e;
        tg1 tg1Var = wg1Var.u;
        Handler handler = wg1Var.y;
        jl jlVar = wg1Var.C;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && jlVar != null && jlVar.isShowing() && x >= 0 && x < jlVar.getWidth() && y >= 0 && y < jlVar.getHeight()) {
            handler.postDelayed(tg1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(tg1Var);
        return false;
    }
}
