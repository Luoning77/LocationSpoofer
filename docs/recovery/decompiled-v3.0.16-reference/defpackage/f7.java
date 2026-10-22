package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f7 extends hl implements h7 {
    public final /* synthetic */ g7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(g7 g7Var, Context context) {
        super(context, null, 2130903071);
        this.h = g7Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        kb3.a(this, getContentDescription());
        setOnTouchListener(new a7(this, this));
    }

    @Override // defpackage.h7
    public final boolean b() {
        return false;
    }

    @Override // defpackage.h7
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.h.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
