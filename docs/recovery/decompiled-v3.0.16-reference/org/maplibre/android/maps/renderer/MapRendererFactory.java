package org.maplibre.android.maps.renderer;

import android.content.Context;
import android.view.TextureView;
import defpackage.aa3;
import defpackage.bk3;
import defpackage.ck3;
import defpackage.f33;
import defpackage.np1;
import defpackage.qp1;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class MapRendererFactory {
    private MapRendererFactory() {
    }

    public static f33 newSurfaceViewMapRenderer(Context context, String str, boolean z, Runnable runnable) {
        np1 np1Var = new np1(context);
        np1Var.setZOrderMediaOverlay(z);
        return new bk3(context, np1Var, str, runnable);
    }

    public static aa3 newTextureViewMapRenderer(Context context, TextureView textureView, String str, boolean z, Runnable runnable) {
        qp1 qp1Var = new qp1(context, textureView, str, z, runnable);
        ck3 ck3Var = new ck3(textureView, qp1Var);
        qp1Var.a = ck3Var;
        ck3Var.setName("TextureViewRenderer");
        qp1Var.a.start();
        return qp1Var;
    }
}
