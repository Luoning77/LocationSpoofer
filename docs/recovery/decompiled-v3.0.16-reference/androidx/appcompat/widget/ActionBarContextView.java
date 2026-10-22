package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.c7;
import defpackage.f;
import defpackage.fo;
import defpackage.g7;
import defpackage.jd2;
import defpackage.k22;
import defpackage.l7;
import defpackage.ms1;
import defpackage.sj3;
import defpackage.st1;
import defpackage.t6;
import defpackage.xj3;
import defpackage.yi3;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final f e;
    public final Context f;
    public ActionMenuView g;
    public g7 h;
    public int i;
    public sj3 j;
    public boolean k;
    public boolean l;
    public CharSequence m;
    public CharSequence n;
    public View o;
    public View p;
    public View q;
    public LinearLayout r;
    public TextView s;
    public TextView t;
    public final int u;
    public final int v;
    public boolean w;
    public final int x;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, 2130903068);
        this.e = new f(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(2130903042, typedValue, true) || typedValue.resourceId == 0) {
            this.f = context;
        } else {
            this.f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jd2.d, 2130903068, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : k22.v(context, resourceId);
        WeakHashMap weakHashMap = yi3.a;
        setBackground(drawable);
        this.u = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.v = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.i = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.x = typedArrayObtainStyledAttributes.getResourceId(2, 2131427333);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(l7 l7Var) {
        View view = this.o;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.x, (ViewGroup) this, false);
            this.o = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.o);
        }
        View viewFindViewById = this.o.findViewById(2131230774);
        this.p = viewFindViewById;
        viewFindViewById.setOnClickListener(new t6(l7Var, i));
        ms1 ms1VarC = l7Var.c();
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.c();
            c7 c7Var = g7Var.x;
            if (c7Var != null && c7Var.b()) {
                c7Var.i.dismiss();
            }
        }
        g7 g7Var2 = new g7(getContext());
        this.h = g7Var2;
        g7Var2.p = true;
        g7Var2.q = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        ms1VarC.b(this.h, this.f);
        g7 g7Var3 = this.h;
        st1 st1Var = g7Var3.l;
        if (st1Var == null) {
            st1 st1Var2 = (st1) g7Var3.h.inflate(g7Var3.j, (ViewGroup) this, false);
            g7Var3.l = st1Var2;
            st1Var2.b(g7Var3.g);
            g7Var3.g();
        }
        st1 st1Var3 = g7Var3.l;
        if (st1Var != st1Var3) {
            ((ActionMenuView) st1Var3).setPresenter(g7Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) st1Var3;
        this.g = actionMenuView;
        WeakHashMap weakHashMap = yi3.a;
        actionMenuView.setBackground(null);
        addView(this.g, layoutParams);
    }

    public final void d() {
        if (this.r == null) {
            LayoutInflater.from(getContext()).inflate(2131427328, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.r = linearLayout;
            this.s = (TextView) linearLayout.findViewById(2131230765);
            this.t = (TextView) this.r.findViewById(2131230764);
            int i = this.u;
            if (i != 0) {
                this.s.setTextAppearance(getContext(), i);
            }
            int i2 = this.v;
            if (i2 != 0) {
                this.t.setTextAppearance(getContext(), i2);
            }
        }
        this.s.setText(this.m);
        this.t.setText(this.n);
        boolean zIsEmpty = TextUtils.isEmpty(this.m);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.n);
        this.t.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.r.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.r.getParent() == null) {
            addView(this.r);
        }
    }

    public final void e() {
        removeAllViews();
        this.q = null;
        this.g = null;
        this.h = null;
        View view = this.p;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.j != null ? this.e.b : getVisibility();
    }

    public int getContentHeight() {
        return this.i;
    }

    public CharSequence getSubtitle() {
        return this.n;
    }

    public CharSequence getTitle() {
        return this.m;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            sj3 sj3Var = this.j;
            if (sj3Var != null) {
                sj3Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final sj3 i(int i, long j) {
        sj3 sj3Var = this.j;
        if (sj3Var != null) {
            sj3Var.b();
        }
        f fVar = this.e;
        if (i != 0) {
            sj3 sj3VarA = yi3.a(this);
            sj3VarA.a(0.0f);
            sj3VarA.c(j);
            ((ActionBarContextView) fVar.c).j = sj3VarA;
            fVar.b = i;
            sj3VarA.d(fVar);
            return sj3VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        sj3 sj3VarA2 = yi3.a(this);
        sj3VarA2.a(1.0f);
        sj3VarA2.c(j);
        ((ActionBarContextView) fVar.c).j = sj3VarA2;
        fVar.b = i;
        sj3VarA2.d(fVar);
        return sj3VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, jd2.a, 2130903045, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        g7 g7Var = this.h;
        if (g7Var != null) {
            Configuration configuration2 = g7Var.f.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            g7Var.t = i;
            ms1 ms1Var = g7Var.g;
            if (ms1Var != null) {
                ms1Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g7 g7Var = this.h;
        if (g7Var != null) {
            g7Var.c();
            c7 c7Var = this.h.x;
            if (c7Var == null || !c7Var.b()) {
                return;
            }
            c7Var.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.l = false;
        }
        if (!this.l) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.l = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.l = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zA = xj3.a(this);
        int paddingRight = zA ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.o;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            int i5 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = zA ? paddingRight - i5 : paddingRight + i5;
            int iG = g(this.o, i7, paddingTop, paddingTop2, zA) + i7;
            paddingRight = zA ? iG - i6 : iG + i6;
        }
        LinearLayout linearLayout = this.r;
        if (linearLayout != null && this.q == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.r, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view2 = this.q;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.g;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zA);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            fo.n(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            fo.n(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.i;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.o;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.g;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.g, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.r;
        if (linearLayout != null && this.q == null) {
            if (this.w) {
                this.r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.r.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.r.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.q;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.i > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.k = false;
        }
        if (!this.k) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.k = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.k = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.i = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.q;
        if (view2 != null) {
            removeView(view2);
        }
        this.q = view;
        if (view != null && (linearLayout = this.r) != null) {
            removeView(linearLayout);
            this.r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.n = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.m = charSequence;
        d();
        yi3.k(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.w) {
            requestLayout();
        }
        this.w = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
