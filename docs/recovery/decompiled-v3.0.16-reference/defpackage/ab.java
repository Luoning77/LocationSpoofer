package defpackage;

import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.Toolbar;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ab implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ab(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        i53 i53VarB;
        long jNanoTime;
        switch (this.e) {
            case 0:
                db dbVar = (db) this.f;
                dbVar.removeCallbacks(this);
                MotionEvent motionEvent = dbVar.A0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i = 2;
                }
                dbVar.H(motionEvent, i, dbVar.B0, false);
                return;
            case 1:
                yg1 yg1Var = (yg1) this.f;
                vg0 vg0Var = yg1Var.g;
                lp lpVar = yg1Var.e;
                if (yg1Var.r) {
                    if (yg1Var.p) {
                        yg1Var.p = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        lpVar.e = jCurrentAnimationTimeMillis;
                        lpVar.g = -1L;
                        lpVar.f = jCurrentAnimationTimeMillis;
                        lpVar.h = 0.5f;
                    }
                    if ((lpVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > lpVar.g + ((long) lpVar.i)) || !yg1Var.e()) {
                        yg1Var.r = false;
                        return;
                    }
                    if (yg1Var.q) {
                        yg1Var.q = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        vg0Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (lpVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = lpVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - lpVar.f;
                    lpVar.f = jCurrentAnimationTimeMillis2;
                    yg1Var.t.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * lpVar.d));
                    WeakHashMap weakHashMap = yi3.a;
                    vg0Var.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                vg0 vg0Var2 = (vg0) this.f;
                vg0Var2.p = null;
                vg0Var2.drawableStateChanged();
                return;
            case 3:
                String str = (String) this.f;
                try {
                    File file = new File(str);
                    if (file.exists()) {
                        if (file.delete()) {
                            Logger.d("Mbgl-FileUtils", "File deleted to save space: ".concat(str));
                        } else {
                            Logger.e("Mbgl-FileUtils", "Failed to delete file: ".concat(str));
                        }
                    }
                    return;
                } catch (Exception e) {
                    Logger.e("Mbgl-FileUtils", "Failed to delete file: ", e);
                    return;
                }
            case 4:
                ((gs0) this.f).h(true);
                return;
            case Logger.WARN /* 5 */:
                ((dp1) this.f).a();
                return;
            case Logger.ERROR /* 6 */:
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ((Toolbar) this.f).u();
                return;
            default:
                gb3 gb3Var = (gb3) this.f;
                Window.Callback callback = gb3Var.b;
                Menu menuP = gb3Var.p();
                ms1 ms1Var = menuP instanceof ms1 ? (ms1) menuP : null;
                if (ms1Var != null) {
                    ms1Var.w();
                }
                try {
                    menuP.clear();
                    if (!callback.onCreatePanelMenu(0, menuP) || !callback.onPreparePanel(0, null, menuP)) {
                        menuP.clear();
                    }
                    if (ms1Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (ms1Var != null) {
                        ms1Var.v();
                    }
                }
                break;
        }
        while (true) {
            k53 k53Var = (k53) this.f;
            synchronized (k53Var) {
                i53VarB = k53Var.b();
            }
            if (i53VarB == null) {
                return;
            }
            j53 j53Var = i53VarB.c;
            j53Var.getClass();
            k53 k53Var2 = (k53) this.f;
            boolean zIsLoggable = k53.i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = System.nanoTime();
                ke0.G(i53VarB, j53Var, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                k53Var2.e(i53VarB);
                if (zIsLoggable) {
                    ke0.G(i53VarB, j53Var, "finished run in ".concat(ke0.t(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) k53Var2.a.f).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        ke0.G(i53VarB, j53Var, "failed a run in ".concat(ke0.t(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    }
}
