package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.jd2;
import defpackage.s6;
import defpackage.xo2;
import defpackage.yi3;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean e;
    public View f;
    public View g;
    public Drawable h;
    public Drawable i;
    public Drawable j;
    public final boolean k;
    public boolean l;
    public final int m;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s6 s6Var = new s6(this);
        WeakHashMap weakHashMap = yi3.a;
        setBackground(s6Var);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jd2.a);
        boolean z = false;
        this.h = typedArrayObtainStyledAttributes.getDrawable(0);
        this.i = typedArrayObtainStyledAttributes.getDrawable(2);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == 2131230897) {
            this.k = true;
            this.j = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.k ? !(this.h != null || this.i != null) : this.j == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.h;
        if (drawable != null && drawable.isStateful()) {
            this.h.setState(getDrawableState());
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null && drawable2.isStateful()) {
            this.i.setState(getDrawableState());
        }
        Drawable drawable3 = this.j;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.j.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.j;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f = findViewById(2131230759);
        this.g = findViewById(2131230767);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.e || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.k) {
            Drawable drawable = this.j;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.h == null) {
                z2 = false;
            } else if (this.f.getVisibility() == 0) {
                this.h.setBounds(this.f.getLeft(), this.f.getTop(), this.f.getRight(), this.f.getBottom());
            } else {
                View view = this.g;
                if (view == null || view.getVisibility() != 0) {
                    this.h.setBounds(0, 0, 0, 0);
                } else {
                    this.h.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
                }
            }
            this.l = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.m) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.h);
        }
        this.h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f;
            if (view != null) {
                this.h.setBounds(view.getLeft(), this.f.getTop(), this.f.getRight(), this.f.getBottom());
            }
        }
        boolean z = false;
        if (!this.k ? !(this.h != null || this.i != null) : this.j == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.j;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.j);
        }
        this.j = drawable;
        boolean z = this.k;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.j) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.h != null || this.i != null) : this.j == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.i);
        }
        this.i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.l && this.i != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.k ? !(this.h != null || this.i != null) : this.j == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.e = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.j;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.h;
        boolean z = this.k;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.i && this.l) {
            return true;
        }
        return (drawable == this.j && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(xo2 xo2Var) {
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
