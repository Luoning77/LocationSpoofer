package defpackage;

import android.view.TextureView;
import android.view.View;
import org.maplibre.android.maps.renderer.MapRenderer;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class aa3 extends MapRenderer {
    public ck3 a;
    public boolean b;
    public TextureView c;

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final pp1 getRenderingRefreshMode() {
        throw new RuntimeException("getRenderingRefreshMode is not supported for TextureViewMapRenderer. Use SurfaceViewMapRenderer to set the rendering refresh mode.");
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final View getView() {
        return this.c;
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onDestroy() {
        ck3 ck3Var = this.a;
        synchronized (ck3Var.f) {
            ck3Var.p = true;
            ck3Var.f.notifyAll();
            while (!ck3Var.q) {
                try {
                    ck3Var.f.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onStart() {
        ck3 ck3Var = this.a;
        synchronized (ck3Var.f) {
            ck3Var.n = false;
            ck3Var.f.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onStop() {
        ck3 ck3Var = this.a;
        synchronized (ck3Var.f) {
            ck3Var.n = true;
            ck3Var.f.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void queueEvent(Runnable runnable) {
        ck3 ck3Var = this.a;
        if (runnable == null) {
            ck3Var.getClass();
            fo.i("runnable must not be null");
        } else {
            synchronized (ck3Var.f) {
                ck3Var.g.add(runnable);
                ck3Var.f.notifyAll();
            }
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void requestRender() {
        ck3 ck3Var = this.a;
        synchronized (ck3Var.f) {
            ck3Var.l = true;
            ck3Var.f.notifyAll();
        }
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void setRenderingRefreshMode(pp1 pp1Var) {
        throw new RuntimeException("setRenderingRefreshMode is not supported for TextureViewMapRenderer. Use SurfaceViewMapRenderer to set the rendering refresh mode.");
    }

    @Override // org.maplibre.android.maps.renderer.MapRendererScheduler
    public final void waitForEmpty() {
        ck3 ck3Var = this.a;
        synchronized (ck3Var.f) {
            while (!ck3Var.g.isEmpty()) {
                try {
                    ck3Var.f.wait(0L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
