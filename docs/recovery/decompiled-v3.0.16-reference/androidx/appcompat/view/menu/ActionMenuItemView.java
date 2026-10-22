package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.a7;
import defpackage.b7;
import defpackage.h7;
import defpackage.jd2;
import defpackage.kb3;
import defpackage.ls1;
import defpackage.mm;
import defpackage.ms1;
import defpackage.rt1;
import defpackage.vs1;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class ActionMenuItemView extends mm implements rt1, View.OnClickListener, h7 {
    public vs1 l;
    public CharSequence m;
    public Drawable n;
    public ls1 o;
    public a7 p;
    public b7 q;
    public boolean r;
    public boolean s;
    public final int t;
    public int u;
    public final int v;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.r = f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jd2.c, 0, 0);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.v = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.u = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.rt1
    public final void a(vs1 vs1Var) {
        this.l = vs1Var;
        setIcon(vs1Var.getIcon());
        setTitle(vs1Var.getTitleCondensed());
        setId(vs1Var.a);
        setVisibility(vs1Var.isVisible() ? 0 : 8);
        setEnabled(vs1Var.isEnabled());
        if (vs1Var.hasSubMenu() && this.p == null) {
            this.p = new a7(this);
        }
    }

    @Override // defpackage.h7
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.h7
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.l.getIcon() == null;
    }

    public final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.m);
        if (this.n != null && ((this.l.y & 4) != 4 || (!this.r && !this.s))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.m : null);
        CharSequence charSequence = this.l.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.l.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.l.r;
        if (TextUtils.isEmpty(charSequence2)) {
            kb3.a(this, z3 ? null : this.l.e);
        } else {
            kb3.a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.rt1
    public vs1 getItemData() {
        return this.l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ls1 ls1Var = this.o;
        if (ls1Var != null) {
            ls1Var.a(this.l);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r = f();
        g();
    }

    @Override // defpackage.mm, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.u) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.t;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.n == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.n.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a7 a7Var;
        if (this.l.hasSubMenu() && (a7Var = this.p) != null && a7Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.s != z) {
            this.s = z;
            vs1 vs1Var = this.l;
            if (vs1Var != null) {
                ms1 ms1Var = vs1Var.n;
                ms1Var.k = true;
                ms1Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.n = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.v;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(ls1 ls1Var) {
        this.o = ls1Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.u = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b7 b7Var) {
        this.q = b7Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.m = charSequence;
        g();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
