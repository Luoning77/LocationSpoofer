package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import defpackage.bb3;
import defpackage.bl3;
import defpackage.cl3;
import defpackage.dl3;
import defpackage.el3;
import defpackage.fl3;
import defpackage.fo;
import defpackage.g7;
import defpackage.j31;
import defpackage.jb3;
import defpackage.k22;
import defpackage.lz1;
import defpackage.mm0;
import defpackage.ms1;
import defpackage.mz1;
import defpackage.nl3;
import defpackage.ot1;
import defpackage.pi3;
import defpackage.pk3;
import defpackage.ql3;
import defpackage.ri3;
import defpackage.tj3;
import defpackage.v6;
import defpackage.w6;
import defpackage.x6;
import defpackage.x90;
import defpackage.y6;
import defpackage.yi3;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements lz1, mz1 {
    public static final int[] F = {2130903043, R.attr.windowContentOverlay};
    public ViewPropertyAnimator A;
    public final v6 B;
    public final w6 C;
    public final w6 D;
    public final mm0 E;
    public int e;
    public int f;
    public ContentFrameLayout g;
    public ActionBarContainer h;
    public x90 i;
    public Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public ql3 u;
    public ql3 v;
    public ql3 w;
    public ql3 x;
    public x6 y;
    public OverScroller z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        ql3 ql3Var = ql3.b;
        this.u = ql3Var;
        this.v = ql3Var;
        this.w = ql3Var;
        this.x = ql3Var;
        this.B = new v6(this, 0);
        this.C = new w6(this, 0);
        this.D = new w6(this, 1);
        h(context);
        this.E = new mm0();
    }

    public static boolean f(View view, Rect rect, boolean z) {
        boolean z2;
        y6 y6Var = (y6) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) y6Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) y6Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) y6Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) y6Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) y6Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) y6Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) y6Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) y6Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.lz1
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.lz1
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.mz1
    public final void c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(nestedScrollView, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof y6;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.j == null || this.k) {
            return;
        }
        if (this.h.getVisibility() == 0) {
            translationY = (int) (this.h.getTranslationY() + this.h.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.j.setBounds(0, translationY, getWidth(), this.j.getIntrinsicHeight() + translationY);
        this.j.draw(canvas);
    }

    @Override // defpackage.lz1
    public final void e(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(nestedScrollView, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new y6(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new y6(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        mm0 mm0Var = this.E;
        return mm0Var.b | mm0Var.a;
    }

    public CharSequence getTitle() {
        k();
        return ((jb3) this.i).a.getTitle();
    }

    public final void h(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.j = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.k = context.getApplicationInfo().targetSdkVersion < 19;
        this.z = new OverScroller(context);
    }

    @Override // defpackage.lz1
    public final boolean i(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((jb3) this.i).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((jb3) this.i).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        x90 wrapper;
        if (this.g == null) {
            this.g = (ContentFrameLayout) findViewById(2131230760);
            this.h = (ActionBarContainer) findViewById(2131230761);
            KeyEvent.Callback callbackFindViewById = findViewById(2131230759);
            if (callbackFindViewById instanceof x90) {
                wrapper = (x90) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    fo.n("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.i = wrapper;
        }
    }

    public final void l(ms1 ms1Var, ot1 ot1Var) {
        k();
        jb3 jb3Var = (jb3) this.i;
        Toolbar toolbar = jb3Var.a;
        g7 g7Var = jb3Var.m;
        if (g7Var == null) {
            g7Var = new g7(toolbar.getContext());
            jb3Var.m = g7Var;
        }
        g7Var.i = ot1Var;
        if (ms1Var == null && toolbar.e == null) {
            return;
        }
        toolbar.f();
        ms1 ms1Var2 = toolbar.e.t;
        if (ms1Var2 == ms1Var) {
            return;
        }
        if (ms1Var2 != null) {
            ms1Var2.r(toolbar.P);
            ms1Var2.r(toolbar.Q);
        }
        if (toolbar.Q == null) {
            toolbar.Q = new bb3(toolbar);
        }
        g7Var.u = true;
        Context context = toolbar.n;
        if (ms1Var != null) {
            ms1Var.b(g7Var, context);
            ms1Var.b(toolbar.Q, toolbar.n);
        } else {
            g7Var.i(context, null);
            toolbar.Q.i(toolbar.n, null);
            g7Var.g();
            toolbar.Q.g();
        }
        toolbar.e.setPopupTheme(toolbar.o);
        toolbar.e.setPresenter(g7Var);
        toolbar.P = g7Var;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        ql3 ql3VarC = ql3.c(windowInsets, this);
        nl3 nl3Var = ql3VarC.a;
        boolean zF = f(this.h, new Rect(nl3Var.l().a, nl3Var.l().b, nl3Var.l().c, nl3Var.l().d), false);
        WeakHashMap weakHashMap = yi3.a;
        Rect rect = this.r;
        ri3.b(this, ql3VarC, rect);
        ql3 ql3VarN = nl3Var.n(rect.left, rect.top, rect.right, rect.bottom);
        this.u = ql3VarN;
        boolean z = true;
        if (!this.v.equals(ql3VarN)) {
            this.v = this.u;
            zF = true;
        }
        Rect rect2 = this.s;
        if (rect2.equals(rect)) {
            z = zF;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return nl3Var.a().a.c().a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h(getContext());
        WeakHashMap weakHashMap = yi3.a;
        pi3.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                y6 y6Var = (y6) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) y6Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) y6Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        fl3 cl3Var;
        k();
        measureChildWithMargins(this.h, i, 0, i2, 0);
        y6 y6Var = (y6) this.h.getLayoutParams();
        int iMax = Math.max(0, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) y6Var).leftMargin + ((ViewGroup.MarginLayoutParams) y6Var).rightMargin);
        int iMax2 = Math.max(0, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y6Var).topMargin + ((ViewGroup.MarginLayoutParams) y6Var).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.h.getMeasuredState());
        WeakHashMap weakHashMap = yi3.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.e;
            if (this.m && this.h.getTabContainer() != null) {
                measuredHeight += this.e;
            }
        } else {
            measuredHeight = this.h.getVisibility() != 8 ? this.h.getMeasuredHeight() : 0;
        }
        Rect rect = this.r;
        Rect rect2 = this.t;
        rect2.set(rect);
        ql3 ql3Var = this.u;
        this.w = ql3Var;
        if (this.l || z) {
            j31 j31VarB = j31.b(ql3Var.a.l().a, this.w.a.l().b + measuredHeight, this.w.a.l().c, this.w.a.l().d);
            ql3 ql3Var2 = this.w;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                cl3Var = new el3(ql3Var2);
            } else if (i3 >= 30) {
                cl3Var = new dl3(ql3Var2);
            } else {
                cl3Var = i3 >= 29 ? new cl3(ql3Var2) : new bl3(ql3Var2);
            }
            cl3Var.g(j31VarB);
            this.w = cl3Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.w = ql3Var.a.n(0, measuredHeight, 0, 0);
        }
        f(this.g, rect2, true);
        if (!this.x.equals(this.w)) {
            ql3 ql3Var3 = this.w;
            this.x = ql3Var3;
            yi3.b(this.g, ql3Var3);
        }
        measureChildWithMargins(this.g, i, 0, i2, 0);
        y6 y6Var2 = (y6) this.g.getLayoutParams();
        int iMax3 = Math.max(iMax, this.g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) y6Var2).leftMargin + ((ViewGroup.MarginLayoutParams) y6Var2).rightMargin);
        int iMax4 = Math.max(iMax2, this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y6Var2).topMargin + ((ViewGroup.MarginLayoutParams) y6Var2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.n || !z) {
            return false;
        }
        this.z.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.z.getFinalY() > this.h.getHeight()) {
            g();
            this.D.run();
        } else {
            g();
            this.C.run();
        }
        this.o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.p + i2;
        this.p = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        pk3 pk3Var;
        tj3 tj3Var;
        this.E.a = i;
        this.p = getActionBarHideOffset();
        g();
        x6 x6Var = this.y;
        if (x6Var == null || (tj3Var = (pk3Var = (pk3) x6Var).s) == null) {
            return;
        }
        tj3Var.a();
        pk3Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.h.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.n || this.o) {
            return;
        }
        if (this.p <= this.h.getHeight()) {
            g();
            postDelayed(this.C, 600L);
        } else {
            g();
            postDelayed(this.D, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.q ^ i;
        this.q = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        x6 x6Var = this.y;
        if (x6Var != null) {
            pk3 pk3Var = (pk3) x6Var;
            pk3Var.o = !z2;
            if (z || !z2) {
                if (pk3Var.p) {
                    pk3Var.p = false;
                    pk3Var.s(true);
                }
            } else if (!pk3Var.p) {
                pk3Var.p = true;
                pk3Var.s(true);
            }
        }
        if ((i2 & 256) == 0 || this.y == null) {
            return;
        }
        WeakHashMap weakHashMap = yi3.a;
        pi3.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f = i;
        x6 x6Var = this.y;
        if (x6Var != null) {
            ((pk3) x6Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        g();
        this.h.setTranslationY(-Math.max(0, Math.min(i, this.h.getHeight())));
    }

    public void setActionBarVisibilityCallback(x6 x6Var) {
        this.y = x6Var;
        if (getWindowToken() != null) {
            ((pk3) this.y).n = this.f;
            int i = this.q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = yi3.a;
                pi3.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (z) {
                return;
            }
            g();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        jb3 jb3Var = (jb3) this.i;
        jb3Var.d = i != 0 ? k22.v(jb3Var.a.getContext(), i) : null;
        jb3Var.c();
    }

    public void setLogo(int i) {
        k();
        jb3 jb3Var = (jb3) this.i;
        jb3Var.e = i != 0 ? k22.v(jb3Var.a.getContext(), i) : null;
        jb3Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.l = z;
        this.k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((jb3) this.i).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        jb3 jb3Var = (jb3) this.i;
        if (jb3Var.g) {
            return;
        }
        Toolbar toolbar = jb3Var.a;
        jb3Var.h = charSequence;
        if ((jb3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (jb3Var.g) {
                yi3.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new y6(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        jb3 jb3Var = (jb3) this.i;
        jb3Var.d = drawable;
        jb3Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.lz1
    public final void d(int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }
}
