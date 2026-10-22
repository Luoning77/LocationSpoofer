package defpackage;

import android.content.Context;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bk3 extends f33 {
    public final /* synthetic */ Runnable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk3(Context context, np1 np1Var, String str, Runnable runnable) {
        super(context, np1Var, str);
        this.b = runnable;
        this.a.setRenderer(this);
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onSurfaceCreated(Surface surface) {
        this.b.run();
        super.onSurfaceCreated(surface);
    }
}
