package defpackage;

import android.content.Context;
import android.view.View;
import org.maplibre.android.maps.renderer.MapRenderer;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class f33 extends MapRenderer {
    public final np1 a;

    public f33(Context context, np1 np1Var, String str) {
        super(context, str);
        this.a = np1Var;
        np1Var.setDetachedListener(new us1(this, 17));
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final pp1 getRenderingRefreshMode() {
        return this.a.getRenderingRefreshMode();
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final View getView() {
        return this.a;
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onStart() {
        mp1 mp1Var = this.a.g;
        synchronized (mp1Var.t) {
            mp1Var.g = false;
            mp1Var.n = true;
            mp1Var.p = false;
            mp1Var.t.notifyAll();
            while (!mp1Var.f && mp1Var.h && !mp1Var.p) {
                try {
                    mp1Var.t.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onStop() {
        mp1 mp1Var = this.a.g;
        synchronized (mp1Var.t) {
            mp1Var.g = true;
            mp1Var.t.notifyAll();
            while (!mp1Var.f && !mp1Var.h) {
                try {
                    mp1Var.t.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void queueEvent(Runnable runnable) {
        mp1 mp1Var = this.a.g;
        synchronized (mp1Var.t) {
            mp1Var.q.add(runnable);
            mp1Var.t.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void requestRender() {
        mp1 mp1Var = this.a.g;
        synchronized (mp1Var.t) {
            mp1Var.n = true;
            mp1Var.t.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void setRenderingRefreshMode(pp1 pp1Var) {
        this.a.setRenderingRefreshMode(pp1Var);
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void waitForEmpty() {
        mp1 mp1Var = this.a.g;
        synchronized (mp1Var.t) {
            while (!mp1Var.q.isEmpty()) {
                try {
                    mp1Var.t.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
