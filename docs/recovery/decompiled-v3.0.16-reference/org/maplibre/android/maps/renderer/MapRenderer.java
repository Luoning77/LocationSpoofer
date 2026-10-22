package org.maplibre.android.maps.renderer;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import defpackage.ip1;
import defpackage.jp1;
import defpackage.pp1;
import defpackage.se1;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class MapRenderer implements MapRendererScheduler {
    private static final String TAG = "Mbgl-MapRenderer";
    private ip1 onFpsChangedListener;
    private long timeElapsed;
    private long nativePtr = 0;
    private double expectedRenderTime = 0.0d;

    static {
        se1.a();
    }

    public MapRenderer(Context context, String str) {
        nativeInitialize(this, context.getResources().getDisplayMetrics().density, str);
    }

    public static MapRenderer create(jp1 jp1Var, Context context, Runnable runnable) {
        String str = jp1Var.G ? jp1Var.H : null;
        return jp1Var.K ? MapRendererFactory.newTextureViewMapRenderer(context, new TextureView(context), str, jp1Var.L, runnable) : MapRendererFactory.newSurfaceViewMapRenderer(context, str, jp1Var.F, runnable);
    }

    private native void nativeInitialize(MapRenderer mapRenderer, float f, String str);

    private native void nativeOnSurfaceChanged(int i, int i2);

    private native void nativeOnSurfaceCreated(Surface surface);

    private native void nativeOnSurfaceDestroyed();

    private native void nativeRender();

    private native void nativeSetSwapBehaviorFlush(boolean z);

    private void updateFps() {
        long jNanoTime = System.nanoTime();
        if (this.timeElapsed > 0) {
            throw null;
        }
        this.timeElapsed = jNanoTime;
    }

    public native void finalize();

    public abstract pp1 getRenderingRefreshMode();

    public abstract View getView();

    public native void nativeReset();

    public void onDrawFrame() {
        long jNanoTime = System.nanoTime();
        try {
            nativeRender();
        } catch (Error e) {
            Logger.e(TAG, e.getMessage());
        }
        double dNanoTime = System.nanoTime() - jNanoTime;
        double d = this.expectedRenderTime;
        if (dNanoTime < d) {
            try {
                Thread.sleep((long) ((d - dNanoTime) / 1000000.0d));
            } catch (InterruptedException e2) {
                Logger.e(TAG, e2.getMessage());
            }
        }
    }

    public void onSurfaceChanged(int i, int i2) {
        nativeOnSurfaceChanged(i, i2);
    }

    public void onSurfaceCreated(Surface surface) {
        nativeOnSurfaceCreated(surface);
    }

    public void onSurfaceDestroyed() {
        nativeOnSurfaceDestroyed();
    }

    public void queueEvent(MapRendererRunnable mapRendererRunnable) {
        queueEvent((Runnable) mapRendererRunnable);
    }

    public void setMaximumFps(int i) {
        if (i <= 0) {
            return;
        }
        this.expectedRenderTime = 1.0E9d / ((double) i);
    }

    public abstract void setRenderingRefreshMode(pp1 pp1Var);

    public void setSwapBehaviorFlush(boolean z) {
        nativeSetSwapBehaviorFlush(z);
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void setOnFpsChangedListener(ip1 ip1Var) {
    }
}
