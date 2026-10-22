package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rh2 extends View {
    public static final int[] j = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] k = new int[0];
    public rf3 e;
    public Boolean f;
    public Long g;
    public w h;
    public hd i;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.h;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.g;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? j : k;
            rf3 rf3Var = this.e;
            if (rf3Var != null) {
                rf3Var.setState(iArr);
            }
        } else {
            w wVar = new w(this, 13);
            this.h = wVar;
            postDelayed(wVar, 50L);
        }
        this.g = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(rh2 rh2Var) {
        rf3 rf3Var = rh2Var.e;
        if (rf3Var != null) {
            rf3Var.setState(k);
        }
        rh2Var.h = null;
    }

    public final void b(vb2 vb2Var, boolean z, long j2, int i, long j3, hd hdVar) {
        long j4 = vb2Var.a;
        if (this.e == null || !Boolean.valueOf(z).equals(this.f)) {
            rf3 rf3Var = new rf3(z);
            setBackground(rf3Var);
            this.e = rf3Var;
            this.f = Boolean.valueOf(z);
        }
        rf3 rf3Var2 = this.e;
        rf3Var2.getClass();
        this.i = hdVar;
        e(i, j2, j3);
        if (z) {
            rf3Var2.setHotspot(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (4294967295L & j4)));
        } else {
            rf3Var2.setHotspot(rf3Var2.getBounds().centerX(), rf3Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.i = null;
        w wVar = this.h;
        if (wVar != null) {
            removeCallbacks(wVar);
            w wVar2 = this.h;
            wVar2.getClass();
            wVar2.run();
        } else {
            rf3 rf3Var = this.e;
            if (rf3Var != null) {
                rf3Var.setState(k);
            }
        }
        rf3 rf3Var2 = this.e;
        if (rf3Var2 == null) {
            return;
        }
        rf3Var2.setVisible(false, false);
        unscheduleDrawable(rf3Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i, long j2, long j3) {
        rf3 rf3Var = this.e;
        if (rf3Var == null) {
            return;
        }
        if (rf3Var.getRadius() != i) {
            rf3Var.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jC = hz.c(f, j3);
        hz hzVar = rf3Var.f;
        if (!(hzVar == null ? false : ye3.a(hzVar.a, jC))) {
            rf3Var.f = new hz(jC);
            rf3Var.setColor(ColorStateList.valueOf(xp1.T(jC)));
        }
        Rect rect = new Rect(0, 0, xq1.P(Float.intBitsToFloat((int) (j2 >> 32))), xq1.P(Float.intBitsToFloat((int) (j2 & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        rf3Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        hd hdVar = this.i;
        if (hdVar != null) {
            hdVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
