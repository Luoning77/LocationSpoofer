package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qp1 extends aa3 {
    public final /* synthetic */ Runnable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp1(Context context, TextureView textureView, String str, boolean z, Runnable runnable) {
        super(context, str);
        this.d = runnable;
        this.c = textureView;
        this.b = z;
    }

    @Override // org.maplibre.android.maps.renderer.MapRenderer
    public final void onSurfaceCreated(Surface surface) {
        this.d.run();
        super.onSurfaceCreated(surface);
    }
}
