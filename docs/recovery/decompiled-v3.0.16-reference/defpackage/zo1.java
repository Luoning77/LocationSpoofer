package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zo1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PointF a;
    public final /* synthetic */ dp1 b;

    public zo1(dp1 dp1Var, PointF pointF) {
        this.b = dp1Var;
        this.a = pointF;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.a.g(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a);
    }
}
