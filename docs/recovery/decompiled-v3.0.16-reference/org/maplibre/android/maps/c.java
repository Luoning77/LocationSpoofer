package org.maplibre.android.maps;

import android.animation.ValueAnimator;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PointF a;
    public final /* synthetic */ d b;

    public c(d dVar, PointF pointF) {
        this.b = dVar;
        this.a = pointF;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        n nVar = this.b.f.a;
        double dM = ((NativeMapView) nVar.a).m() + ((double) ((Float) valueAnimator.getAnimatedValue()).floatValue());
        PointF pointF = this.a;
        ((NativeMapView) nVar.a).I(dM, pointF.x, pointF.y, 0L);
    }
}
