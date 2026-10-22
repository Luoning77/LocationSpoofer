package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.c7;
import defpackage.e30;
import defpackage.f7;
import defpackage.g7;
import defpackage.h7;
import defpackage.i7;
import defpackage.j7;
import defpackage.ks1;
import defpackage.ls1;
import defpackage.ms1;
import defpackage.ot1;
import defpackage.st1;
import defpackage.t1;
import defpackage.u92;
import defpackage.vs1;
import defpackage.wf1;
import defpackage.xf1;
import defpackage.xj3;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class ActionMenuView extends xf1 implements ls1, st1 {
    public boolean A;
    public int B;
    public final int C;
    public final int D;
    public j7 E;
    public ms1 t;
    public Context u;
    public int v;
    public boolean w;
    public g7 x;
    public e30 y;
    public ks1 z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.C = (int) (56.0f * f);
        this.D = (int) (f * 4.0f);
        this.u = context;
        this.v = 0;
    }

    public static i7 i() {
        i7 i7Var = new i7(-2, -2);
        i7Var.a = false;
        ((LinearLayout.LayoutParams) i7Var).gravity = 16;
        return i7Var;
    }

    public static i7 j(ViewGroup.LayoutParams layoutParams) {
        i7 i7Var;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof i7) {
            i7 i7Var2 = (i7) layoutParams;
            i7Var = new i7(i7Var2);
            i7Var.a = i7Var2.a;
        } else {
            i7Var = new i7(layoutParams);
        }
        if (((LinearLayout.LayoutParams) i7Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) i7Var).gravity = 16;
        }
        return i7Var;
    }

    @Override // defpackage.ls1
    public final boolean a(vs1 vs1Var) {
        return this.t.q(vs1Var, null, 0);
    }

    @Override // defpackage.st1
    public final void b(ms1 ms1Var) {
        this.t = ms1Var;
    }

    @Override // defpackage.xf1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof i7;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.xf1
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ wf1 generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.xf1
    /* JADX INFO: renamed from: f */
    public final wf1 generateLayoutParams(AttributeSet attributeSet) {
        return new i7(getContext(), attributeSet);
    }

    @Override // defpackage.xf1
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ wf1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // defpackage.xf1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.xf1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new i7(getContext(), attributeSet);
    }

    public Menu getMenu() {
        ms1 ms1Var = this.t;
        if (ms1Var != null) {
            return ms1Var;
        }
        Context context = getContext();
        ms1 ms1Var2 = new ms1(context);
        this.t = ms1Var2;
        ms1Var2.e = new t1(this, 2);
        g7 g7Var = new g7(context);
        this.x = g7Var;
        g7Var.p = true;
        g7Var.q = true;
        ot1 u92Var = this.y;
        if (u92Var == null) {
            u92Var = new u92(17);
        }
        g7Var.i = u92Var;
        this.t.b(g7Var, this.u);
        g7 g7Var2 = this.x;
        g7Var2.l = this;
        ms1 ms1Var3 = g7Var2.g;
        this.t = ms1Var3;
        return ms1Var3;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        g7 g7Var = this.x;
        f7 f7Var = g7Var.m;
        if (f7Var != null) {
            return f7Var.getDrawable();
        }
        if (g7Var.o) {
            return g7Var.n;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof h7)) {
            zB = ((h7) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof h7)) ? zB : ((h7) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g7 g7Var = this.x;
        if (g7Var != null) {
            g7Var.g();
            if (this.x.h()) {
                this.x.c();
                this.x.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g7 g7Var = this.x;
        if (g7Var != null) {
            g7Var.c();
            c7 c7Var = g7Var.x;
            if (c7Var == null || !c7Var.b()) {
                return;
            }
            c7Var.i.dismiss();
        }
    }

    @Override // defpackage.xf1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.A) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zA = xj3.a(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                i7 i7Var = (i7) childAt.getLayoutParams();
                if (i7Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) i7Var).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) i7Var).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) i7Var).leftMargin) + ((LinearLayout.LayoutParams) i7Var).rightMargin;
                    k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                i7 i7Var2 = (i7) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !i7Var2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) i7Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) i7Var2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            i7 i7Var3 = (i7) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !i7Var3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) i7Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) i7Var3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.xf1, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        ms1 ms1Var;
        boolean z = this.A;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.A = z2;
        if (z != z2) {
            this.B = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.A && (ms1Var = this.t) != null && size != this.B) {
            this.B = size;
            ms1Var.p(true);
        }
        int childCount = getChildCount();
        if (!this.A || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                i7 i7Var = (i7) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) i7Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) i7Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.C;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.D;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                i7 i7Var2 = (i7) childAt.getLayoutParams();
                i7Var2.f = false;
                i7Var2.c = 0;
                i7Var2.b = 0;
                i7Var2.d = false;
                ((LinearLayout.LayoutParams) i7Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) i7Var2).rightMargin = 0;
                i7Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = i7Var2.a ? 1 : i10;
                i7 i7Var3 = (i7) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                i7Var3.d = !i7Var3.a && z6;
                i7Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (i7Var2.d) {
                    i15++;
                }
                if (i7Var2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                i7 i7Var4 = (i7) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (i7Var4.d) {
                    int i28 = i7Var4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                i7 i7Var5 = (i7) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && i7Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    i7Var5.b += r11;
                    i7Var5.f = r11;
                    i23--;
                } else if (i7Var5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((i7) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((i7) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    i7 i7Var6 = (i7) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        i7Var6.c = i32;
                        i7Var6.f = true;
                        if (i33 == 0 && !i7Var6.e) {
                            ((LinearLayout.LayoutParams) i7Var6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (i7Var6.a) {
                        i7Var6.c = i32;
                        i7Var6.f = true;
                        ((LinearLayout.LayoutParams) i7Var6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) i7Var6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) i7Var6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                i7 i7Var7 = (i7) childAt4.getLayoutParams();
                if (i7Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((i7Var7.b * i22) + i7Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.x.u = z;
    }

    public void setOnMenuItemClickListener(j7 j7Var) {
        this.E = j7Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        g7 g7Var = this.x;
        f7 f7Var = g7Var.m;
        if (f7Var != null) {
            f7Var.setImageDrawable(drawable);
        } else {
            g7Var.o = true;
            g7Var.n = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.w = z;
    }

    public void setPopupTheme(int i) {
        if (this.v != i) {
            this.v = i;
            if (i == 0) {
                this.u = getContext();
            } else {
                this.u = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(g7 g7Var) {
        this.x = g7Var;
        g7Var.l = this;
        this.t = g7Var.g;
    }

    @Override // defpackage.xf1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
