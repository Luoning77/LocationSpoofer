package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nl extends SeekBar {
    public final ol e;

    public nl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903374);
        ca3.a(this, getContext());
        ol olVar = new ol(this);
        this.e = olVar;
        olVar.x(attributeSet, 2130903374);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ol olVar = this.e;
        nl nlVar = olVar.j;
        Drawable drawable = olVar.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(nlVar.getDrawableState())) {
            nlVar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.e.H(canvas);
    }
}
