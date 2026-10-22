package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.ab;
import defpackage.ab3;
import defpackage.bb3;
import defpackage.cb3;
import defpackage.db3;
import defpackage.e30;
import defpackage.eb3;
import defpackage.fb3;
import defpackage.g7;
import defpackage.gl;
import defpackage.gn;
import defpackage.hl;
import defpackage.jb3;
import defpackage.jd2;
import defpackage.k22;
import defpackage.kb3;
import defpackage.mk2;
import defpackage.mm;
import defpackage.ms1;
import defpackage.p23;
import defpackage.rs1;
import defpackage.t6;
import defpackage.vs1;
import defpackage.x90;
import defpackage.xj3;
import defpackage.ya3;
import defpackage.yi3;
import defpackage.za3;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class Toolbar extends ViewGroup {
    public final int A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D;
    public ColorStateList E;
    public boolean F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public final int[] J;
    public final rs1 K;
    public ArrayList L;
    public db3 M;
    public final za3 N;
    public jb3 O;
    public g7 P;
    public bb3 Q;
    public e30 R;
    public fb3 S;
    public boolean T;
    public OnBackInvokedCallback U;
    public OnBackInvokedDispatcher V;
    public boolean W;
    public final ab a0;
    public ActionMenuView e;
    public mm f;
    public mm g;
    public gl h;
    public hl i;
    public final Drawable j;
    public final CharSequence k;
    public gl l;
    public View m;
    public Context n;
    public int o;
    public int p;
    public int q;
    public final int r;
    public final int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public mk2 x;
    public int y;
    public int z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903445);
        this.A = 8388627;
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new int[2];
        this.K = new rs1(new ya3(this, 1));
        this.L = new ArrayList();
        this.N = new za3(this);
        this.a0 = new ab(this, 7);
        Context context2 = getContext();
        int[] iArr = jd2.x;
        gn gnVarY = gn.y(context2, attributeSet, iArr, 2130903445);
        yi3.i(this, context, iArr, attributeSet, (TypedArray) gnVarY.a, 2130903445);
        TypedArray typedArray = (TypedArray) gnVarY.a;
        this.p = typedArray.getResourceId(28, 0);
        this.q = typedArray.getResourceId(19, 0);
        this.A = typedArray.getInteger(0, 8388627);
        this.r = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.w = dimensionPixelOffset;
        this.v = dimensionPixelOffset;
        this.u = dimensionPixelOffset;
        this.t = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.t = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.u = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.v = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.w = dimensionPixelOffset5;
        }
        this.s = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        mk2 mk2Var = this.x;
        mk2Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            mk2Var.e = dimensionPixelSize;
            mk2Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            mk2Var.f = dimensionPixelSize2;
            mk2Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            mk2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.y = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.z = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.j = gnVarY.m(4);
        this.k = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.n = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM = gnVarY.m(16);
        if (drawableM != null) {
            setNavigationIcon(drawableM);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM2 = gnVarY.m(11);
        if (drawableM2 != null) {
            setLogo(drawableM2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(gnVarY.j(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(gnVarY.j(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        gnVarY.A();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new p23(getContext());
    }

    public static cb3 h() {
        cb3 cb3Var = new cb3(-2, -2);
        cb3Var.b = 0;
        cb3Var.a = 8388627;
        return cb3Var;
    }

    public static cb3 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof cb3;
        if (z) {
            cb3 cb3Var = (cb3) layoutParams;
            cb3 cb3Var2 = new cb3(cb3Var);
            cb3Var2.b = 0;
            cb3Var2.b = cb3Var.b;
            return cb3Var2;
        }
        if (z) {
            cb3 cb3Var3 = new cb3((cb3) layoutParams);
            cb3Var3.b = 0;
            return cb3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            cb3 cb3Var4 = new cb3(layoutParams);
            cb3Var4.b = 0;
            return cb3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        cb3 cb3Var5 = new cb3(marginLayoutParams);
        cb3Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) cb3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) cb3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) cb3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) cb3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return cb3Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        WeakHashMap weakHashMap = yi3.a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                cb3 cb3Var = (cb3) childAt.getLayoutParams();
                if (cb3Var.b == 0 && t(childAt)) {
                    int i3 = cb3Var.a;
                    WeakHashMap weakHashMap2 = yi3.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            cb3 cb3Var2 = (cb3) childAt2.getLayoutParams();
            if (cb3Var2.b == 0 && t(childAt2)) {
                int i5 = cb3Var2.a;
                WeakHashMap weakHashMap3 = yi3.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        cb3 cb3VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            cb3VarI = h();
        } else {
            cb3VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (cb3) layoutParams;
        }
        cb3VarI.b = 1;
        if (!z || this.m == null) {
            addView(view, cb3VarI);
        } else {
            view.setLayoutParams(cb3VarI);
            this.I.add(view);
        }
    }

    public final void c() {
        if (this.l == null) {
            gl glVar = new gl(getContext(), null, 2130903444);
            this.l = glVar;
            glVar.setImageDrawable(this.j);
            this.l.setContentDescription(this.k);
            cb3 cb3VarH = h();
            cb3VarH.a = (this.r & 112) | 8388611;
            cb3VarH.b = 2;
            this.l.setLayoutParams(cb3VarH);
            this.l.setOnClickListener(new t6(this, 3));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof cb3);
    }

    public final void d() {
        if (this.x == null) {
            mk2 mk2Var = new mk2();
            mk2Var.a = 0;
            mk2Var.b = 0;
            mk2Var.c = Integer.MIN_VALUE;
            mk2Var.d = Integer.MIN_VALUE;
            mk2Var.e = 0;
            mk2Var.f = 0;
            mk2Var.g = false;
            mk2Var.h = false;
            this.x = mk2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.e;
        if (actionMenuView.t == null) {
            ms1 ms1Var = (ms1) actionMenuView.getMenu();
            if (this.Q == null) {
                this.Q = new bb3(this);
            }
            this.e.setExpandedActionViewsExclusive(true);
            ms1Var.b(this.Q, this.n);
            v();
        }
    }

    public final void f() {
        if (this.e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.e = actionMenuView;
            actionMenuView.setPopupTheme(this.o);
            this.e.setOnMenuItemClickListener(this.N);
            ActionMenuView actionMenuView2 = this.e;
            e30 e30Var = this.R;
            za3 za3Var = new za3(this);
            actionMenuView2.y = e30Var;
            actionMenuView2.z = za3Var;
            cb3 cb3VarH = h();
            cb3VarH.a = (this.r & 112) | 8388613;
            this.e.setLayoutParams(cb3VarH);
            b(this.e, false);
        }
    }

    public final void g() {
        if (this.h == null) {
            this.h = new gl(getContext(), null, 2130903444);
            cb3 cb3VarH = h();
            cb3VarH.a = (this.r & 112) | 8388611;
            this.h.setLayoutParams(cb3VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        cb3 cb3Var = new cb3(context, attributeSet);
        cb3Var.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jd2.b);
        cb3Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        cb3Var.b = 0;
        return cb3Var;
    }

    public CharSequence getCollapseContentDescription() {
        gl glVar = this.l;
        if (glVar != null) {
            return glVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        gl glVar = this.l;
        if (glVar != null) {
            return glVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        mk2 mk2Var = this.x;
        if (mk2Var != null) {
            return mk2Var.g ? mk2Var.a : mk2Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.z;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        mk2 mk2Var = this.x;
        if (mk2Var != null) {
            return mk2Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        mk2 mk2Var = this.x;
        if (mk2Var != null) {
            return mk2Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        mk2 mk2Var = this.x;
        if (mk2Var != null) {
            return mk2Var.g ? mk2Var.b : mk2Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.y;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        ms1 ms1Var;
        ActionMenuView actionMenuView = this.e;
        return (actionMenuView == null || (ms1Var = actionMenuView.t) == null || !ms1Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.z, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = yi3.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = yi3.a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        hl hlVar = this.i;
        if (hlVar != null) {
            return hlVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        hl hlVar = this.i;
        if (hlVar != null) {
            return hlVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.e.getMenu();
    }

    public View getNavButtonView() {
        return this.h;
    }

    public CharSequence getNavigationContentDescription() {
        gl glVar = this.h;
        if (glVar != null) {
            return glVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        gl glVar = this.h;
        if (glVar != null) {
            return glVar.getDrawable();
        }
        return null;
    }

    public g7 getOuterActionMenuPresenter() {
        return this.P;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.e.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.n;
    }

    public int getPopupTheme() {
        return this.o;
    }

    public CharSequence getSubtitle() {
        return this.C;
    }

    public final TextView getSubtitleTextView() {
        return this.g;
    }

    public CharSequence getTitle() {
        return this.B;
    }

    public int getTitleMarginBottom() {
        return this.w;
    }

    public int getTitleMarginEnd() {
        return this.u;
    }

    public int getTitleMarginStart() {
        return this.t;
    }

    public int getTitleMarginTop() {
        return this.v;
    }

    public final TextView getTitleTextView() {
        return this.f;
    }

    public x90 getWrapper() {
        jb3 jb3Var = this.O;
        if (jb3Var != null) {
            return jb3Var;
        }
        jb3 jb3Var2 = new jb3(this, true);
        this.O = jb3Var2;
        return jb3Var2;
    }

    public final int j(View view, int i) {
        cb3 cb3Var = (cb3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = cb3Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.A & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) cb3Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) cb3Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) cb3Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        this.K.a();
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.L = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.I.contains(view);
    }

    public final boolean o() {
        g7 g7Var;
        ActionMenuView actionMenuView = this.e;
        return (actionMenuView == null || (g7Var = actionMenuView.x) == null || !g7Var.h()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.a0);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.G = false;
        }
        if (!this.G) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.G = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.G = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iP;
        int iQ;
        int iMax;
        int iMin;
        boolean zT;
        boolean zT2;
        int measuredHeight;
        mm mmVar;
        mm mmVar2;
        cb3 cb3Var;
        cb3 cb3Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iP2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        hl hlVar;
        View view;
        ActionMenuView actionMenuView;
        gl glVar;
        WeakHashMap weakHashMap = yi3.a;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.J;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (t(this.h)) {
            gl glVar2 = this.h;
            if (z3) {
                iQ = q(glVar2, i26, iMin2, iArr);
                iP = paddingLeft;
            } else {
                iP = p(glVar2, paddingLeft, iMin2, iArr);
            }
            if (t(this.l)) {
                glVar = this.l;
                if (z3) {
                    iQ = q(glVar, iQ, iMin2, iArr);
                } else {
                    iP = p(glVar, iP, iMin2, iArr);
                }
            }
            if (t(this.e)) {
                actionMenuView = this.e;
                if (z3) {
                    iP = p(actionMenuView, iP, iMin2, iArr);
                } else {
                    iQ = q(actionMenuView, iQ, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iP);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iQ));
            iMax = Math.max(iP, currentContentInsetLeft);
            iMin = Math.min(iQ, i26 - currentContentInsetRight);
            if (t(this.m)) {
                view = this.m;
                if (z3) {
                    iMin = q(view, iMin, iMin2, iArr);
                } else {
                    iMax = p(view, iMax, iMin2, iArr);
                }
            }
            if (t(this.i)) {
                hlVar = this.i;
                if (z3) {
                    iMin = q(hlVar, iMin, iMin2, iArr);
                } else {
                    iMax = p(hlVar, iMax, iMin2, iArr);
                }
            }
            zT = t(this.f);
            zT2 = t(this.g);
            if (zT) {
                cb3 cb3Var3 = (cb3) this.f.getLayoutParams();
                measuredHeight = this.f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cb3Var3).topMargin + ((ViewGroup.MarginLayoutParams) cb3Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zT2) {
                cb3 cb3Var4 = (cb3) this.g.getLayoutParams();
                measuredHeight = this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cb3Var4).topMargin + ((ViewGroup.MarginLayoutParams) cb3Var4).bottomMargin + measuredHeight;
            }
            if (zT || zT2) {
                if (zT) {
                    mmVar = this.f;
                } else {
                    mmVar = this.g;
                }
                if (zT2) {
                    mmVar2 = this.g;
                } else {
                    mmVar2 = this.f;
                }
                cb3Var = (cb3) mmVar.getLayoutParams();
                cb3Var2 = (cb3) mmVar2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zT && this.f.getMeasuredWidth() > 0) || (zT2 && this.g.getMeasuredWidth() > 0);
                i6 = this.A & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) cb3Var).topMargin + this.v;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) cb3Var).topMargin + this.v;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) cb3Var).bottomMargin;
                        i17 = this.w;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) cb3Var2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) cb3Var2).bottomMargin) - this.w) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.t;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zT) {
                        cb3 cb3Var5 = (cb3) this.f.getLayoutParams();
                        int measuredWidth2 = iMin - this.f.getMeasuredWidth();
                        int measuredHeight2 = this.f.getMeasuredHeight() + paddingTop;
                        this.f.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.u;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) cb3Var5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zT2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((cb3) this.g.getLayoutParams())).topMargin;
                        this.g.layout(iMin - this.g.getMeasuredWidth(), i28, iMin, this.g.getMeasuredHeight() + i28);
                        i13 = iMin - this.u;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.t;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zT) {
                        cb3 cb3Var6 = (cb3) this.f.getLayoutParams();
                        int measuredWidth3 = this.f.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f.getMeasuredHeight() + paddingTop;
                        this.f.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.u;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) cb3Var6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zT2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((cb3) this.g.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.g.getMeasuredWidth() + iMax;
                        this.g.layout(iMax, i30, measuredWidth4, this.g.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.u;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.H;
            a(3, arrayList);
            size = arrayList.size();
            iP2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iP2 = p((View) arrayList.get(i18), iP2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = q((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                cb3 cb3Var7 = (cb3) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) cb3Var7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) cb3Var7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iP2) {
                if (i25 > iMin) {
                    iP2 = i24 - (i25 - iMin);
                } else {
                    iP2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iP2 = p((View) arrayList.get(i23), iP2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iP = paddingLeft;
        iQ = i26;
        if (t(this.l)) {
            glVar = this.l;
            if (z3) {
                iQ = q(glVar, iQ, iMin2, iArr);
            } else {
                iP = p(glVar, iP, iMin2, iArr);
            }
        }
        if (t(this.e)) {
            actionMenuView = this.e;
            if (z3) {
                iP = p(actionMenuView, iP, iMin2, iArr);
            } else {
                iQ = q(actionMenuView, iQ, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iP);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iQ));
        iMax = Math.max(iP, currentContentInsetLeft2);
        iMin = Math.min(iQ, i26 - currentContentInsetRight2);
        if (t(this.m)) {
            view = this.m;
            if (z3) {
                iMin = q(view, iMin, iMin2, iArr);
            } else {
                iMax = p(view, iMax, iMin2, iArr);
            }
        }
        if (t(this.i)) {
            hlVar = this.i;
            if (z3) {
                iMin = q(hlVar, iMin, iMin2, iArr);
            } else {
                iMax = p(hlVar, iMax, iMin2, iArr);
            }
        }
        zT = t(this.f);
        zT2 = t(this.g);
        if (zT) {
            cb3 cb3Var8 = (cb3) this.f.getLayoutParams();
            measuredHeight = this.f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cb3Var8).topMargin + ((ViewGroup.MarginLayoutParams) cb3Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zT2) {
            cb3 cb3Var9 = (cb3) this.g.getLayoutParams();
            measuredHeight = this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cb3Var9).topMargin + ((ViewGroup.MarginLayoutParams) cb3Var9).bottomMargin + measuredHeight;
        }
        if (zT) {
            if (zT) {
                mmVar = this.f;
            } else {
                mmVar = this.g;
            }
            if (zT2) {
                mmVar2 = this.g;
            } else {
                mmVar2 = this.f;
            }
            cb3Var = (cb3) mmVar.getLayoutParams();
            cb3Var2 = (cb3) mmVar2.getLayoutParams();
            i5 = measuredHeight;
            if (zT) {
            }
            i6 = this.A & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) cb3Var).topMargin + this.v;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) cb3Var).topMargin + this.v;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) cb3Var).bottomMargin;
                    i17 = this.w;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) cb3Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) cb3Var2).bottomMargin) - this.w) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.t;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zT) {
                    cb3 cb3Var10 = (cb3) this.f.getLayoutParams();
                    int measuredWidth5 = iMin - this.f.getMeasuredWidth();
                    int measuredHeight4 = this.f.getMeasuredHeight() + paddingTop;
                    this.f.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.u;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) cb3Var10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zT2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((cb3) this.g.getLayoutParams())).topMargin;
                    this.g.layout(iMin - this.g.getMeasuredWidth(), i211, iMin, this.g.getMeasuredHeight() + i211);
                    i13 = iMin - this.u;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.t;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zT) {
                    cb3 cb3Var11 = (cb3) this.f.getLayoutParams();
                    int measuredWidth6 = this.f.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f.getMeasuredHeight() + paddingTop;
                    this.f.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.u;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) cb3Var11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zT2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((cb3) this.g.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.g.getMeasuredWidth() + iMax;
                    this.g.layout(iMax, i35, measuredWidth7, this.g.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.u;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zT) {
                mmVar = this.f;
            } else {
                mmVar = this.g;
            }
            if (zT2) {
                mmVar2 = this.g;
            } else {
                mmVar2 = this.f;
            }
            cb3Var = (cb3) mmVar.getLayoutParams();
            cb3Var2 = (cb3) mmVar2.getLayoutParams();
            i5 = measuredHeight;
            if (zT) {
            }
            i6 = this.A & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) cb3Var).topMargin + this.v;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) cb3Var).topMargin + this.v;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) cb3Var).bottomMargin;
                    i17 = this.w;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) cb3Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) cb3Var2).bottomMargin) - this.w) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.t;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zT) {
                    cb3 cb3Var12 = (cb3) this.f.getLayoutParams();
                    int measuredWidth8 = iMin - this.f.getMeasuredWidth();
                    int measuredHeight6 = this.f.getMeasuredHeight() + paddingTop;
                    this.f.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.u;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) cb3Var12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zT2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((cb3) this.g.getLayoutParams())).topMargin;
                    this.g.layout(iMin - this.g.getMeasuredWidth(), i214, iMin, this.g.getMeasuredHeight() + i214);
                    i13 = iMin - this.u;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.t;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zT) {
                    cb3 cb3Var13 = (cb3) this.f.getLayoutParams();
                    int measuredWidth9 = this.f.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f.getMeasuredHeight() + paddingTop;
                    this.f.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.u;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) cb3Var13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zT2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((cb3) this.g.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.g.getMeasuredWidth() + iMax;
                    this.g.layout(iMax, i36, measuredWidth10, this.g.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.u;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.H;
        a(3, arrayList);
        size = arrayList.size();
        iP2 = iMax;
        while (i18 < size) {
            iP2 = p((View) arrayList.get(i18), iP2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = q((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            cb3 cb3Var14 = (cb3) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) cb3Var14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) cb3Var14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iP2) {
            if (i25 > iMin) {
                iP2 = i24 - (i25 - iMin);
            } else {
                iP2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iP2 = p((View) arrayList.get(i23), iP2, iMin2, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = xj3.a(this);
        int i3 = !zA ? 1 : 0;
        int i4 = 0;
        if (t(this.h)) {
            s(this.h, i, 0, i2, this.s);
            iK = k(this.h) + this.h.getMeasuredWidth();
            iMax = Math.max(0, l(this.h) + this.h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.h.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.l)) {
            s(this.l, i, 0, i2, this.s);
            iK = k(this.l) + this.l.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.l) + this.l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.J;
        iArr[zA ? 1 : 0] = iMax4;
        if (t(this.e)) {
            s(this.e, i, iMax3, i2, this.s);
            iK2 = k(this.e) + this.e.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.e) + this.e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = Math.max(currentContentInsetEnd, iK2) + iMax3;
        iArr[i3] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.m)) {
            iMax5 = r(i, iMax5, i2, 0, this.m, iArr) + iMax5;
            iMax = Math.max(iMax, l(this.m) + this.m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.m.getMeasuredState());
        }
        int iR = iMax5;
        if (t(this.i)) {
            iR += r(i, iR, i2, 0, this.i, iArr);
            iMax = Math.max(iMax, l(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((cb3) childAt.getLayoutParams()).b == 0 && t(childAt)) {
                iR += r(i, iR, i2, 0, childAt, iArr);
                iMax = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            } else {
                iR = iR;
            }
        }
        int i6 = iR;
        int i7 = this.v + this.w;
        int i8 = this.t + this.u;
        if (t(this.f)) {
            r(i, i6 + i8, i2, i7, this.f, iArr);
            int iK3 = k(this.f) + this.f.getMeasuredWidth();
            iL = l(this.f) + this.f.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.g)) {
            iMax2 = Math.max(iMax2, r(i, i6 + i8, i2, i7 + iL, this.g, iArr));
            iL += l(this.g) + this.g.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.g.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i6 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.T) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof eb3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        eb3 eb3Var = (eb3) parcelable;
        super.onRestoreInstanceState(eb3Var.e);
        ActionMenuView actionMenuView = this.e;
        ms1 ms1Var = actionMenuView != null ? actionMenuView.t : null;
        int i = eb3Var.g;
        if (i != 0 && this.Q != null && ms1Var != null && (menuItemFindItem = ms1Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (eb3Var.h) {
            ab abVar = this.a0;
            removeCallbacks(abVar);
            post(abVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        mk2 mk2Var = this.x;
        boolean z = i == 1;
        if (z == mk2Var.g) {
            return;
        }
        mk2Var.g = z;
        if (!mk2Var.h) {
            mk2Var.a = mk2Var.e;
            mk2Var.b = mk2Var.f;
            return;
        }
        if (z) {
            int i2 = mk2Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = mk2Var.e;
            }
            mk2Var.a = i2;
            int i3 = mk2Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = mk2Var.f;
            }
            mk2Var.b = i3;
            return;
        }
        int i4 = mk2Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = mk2Var.e;
        }
        mk2Var.a = i4;
        int i5 = mk2Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = mk2Var.f;
        }
        mk2Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        vs1 vs1Var;
        eb3 eb3Var = new eb3(super.onSaveInstanceState());
        bb3 bb3Var = this.Q;
        if (bb3Var != null && (vs1Var = bb3Var.f) != null) {
            eb3Var.g = vs1Var.a;
        }
        eb3Var.h = o();
        return eb3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = false;
        }
        if (!this.F) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.F = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.F = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        cb3 cb3Var = (cb3) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cb3Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) cb3Var).rightMargin + iMax;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        cb3 cb3Var = (cb3) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cb3Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) cb3Var).leftMargin);
    }

    public final int r(int i, int i2, int i3, int i4, View view, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.W != z) {
            this.W = z;
            v();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        gl glVar = this.l;
        if (glVar != null) {
            glVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.l.setImageDrawable(drawable);
        } else {
            gl glVar = this.l;
            if (glVar != null) {
                glVar.setImageDrawable(this.j);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.T = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.z) {
            this.z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.y) {
            this.y = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        hl hlVar = this.i;
        if (drawable != null) {
            if (hlVar == null) {
                hlVar = new hl(getContext(), null, 0);
                this.i = hlVar;
            }
            if (!n(hlVar)) {
                b(this.i, true);
            }
        } else if (hlVar != null && n(hlVar)) {
            removeView(this.i);
            this.I.remove(this.i);
        }
        hl hlVar2 = this.i;
        if (hlVar2 != null) {
            hlVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.i == null) {
            this.i = new hl(getContext(), null, 0);
        }
        hl hlVar = this.i;
        if (hlVar != null) {
            hlVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        gl glVar = this.h;
        if (glVar != null) {
            glVar.setContentDescription(charSequence);
            kb3.a(this.h, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.h)) {
                b(this.h, true);
            }
        } else {
            gl glVar = this.h;
            if (glVar != null && n(glVar)) {
                removeView(this.h);
                this.I.remove(this.h);
            }
        }
        gl glVar2 = this.h;
        if (glVar2 != null) {
            glVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(db3 db3Var) {
        this.M = db3Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.o != i) {
            this.o = i;
            if (i == 0) {
                this.n = getContext();
            } else {
                this.n = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        mm mmVar = this.g;
        if (!zIsEmpty) {
            if (mmVar == null) {
                Context context = getContext();
                mm mmVar2 = new mm(context, null);
                this.g = mmVar2;
                mmVar2.setSingleLine();
                this.g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.q;
                if (i != 0) {
                    this.g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.g.setTextColor(colorStateList);
                }
            }
            if (!n(this.g)) {
                b(this.g, true);
            }
        } else if (mmVar != null && n(mmVar)) {
            removeView(this.g);
            this.I.remove(this.g);
        }
        mm mmVar3 = this.g;
        if (mmVar3 != null) {
            mmVar3.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        mm mmVar = this.g;
        if (mmVar != null) {
            mmVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        mm mmVar = this.f;
        if (!zIsEmpty) {
            if (mmVar == null) {
                Context context = getContext();
                mm mmVar2 = new mm(context, null);
                this.f = mmVar2;
                mmVar2.setSingleLine();
                this.f.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.p;
                if (i != 0) {
                    this.f.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f.setTextColor(colorStateList);
                }
            }
            if (!n(this.f)) {
                b(this.f, true);
            }
        } else if (mmVar != null && n(mmVar)) {
            removeView(this.f);
            this.I.remove(this.f);
        }
        mm mmVar3 = this.f;
        if (mmVar3 != null) {
            mmVar3.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.w = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.u = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.t = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.v = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        mm mmVar = this.f;
        if (mmVar != null) {
            mmVar.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        g7 g7Var;
        ActionMenuView actionMenuView = this.e;
        return (actionMenuView == null || (g7Var = actionMenuView.x) == null || !g7Var.l()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    public final void v() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = ab3.a(this);
            bb3 bb3Var = this.Q;
            int i = 0;
            if (bb3Var == null || bb3Var.f == null || onBackInvokedDispatcherA == null) {
                z = false;
            } else {
                WeakHashMap weakHashMap = yi3.a;
                if (isAttachedToWindow() && this.W) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z || this.V != null) {
                if (z || (onBackInvokedDispatcher = this.V) == null) {
                    return;
                }
                ab3.d(onBackInvokedDispatcher, this.U);
                this.V = null;
                return;
            }
            OnBackInvokedCallback onBackInvokedCallbackB = this.U;
            if (onBackInvokedCallbackB == null) {
                onBackInvokedCallbackB = ab3.b(new ya3(this, i));
                this.U = onBackInvokedCallbackB;
            }
            ab3.c(onBackInvokedDispatcherA, onBackInvokedCallbackB);
            this.V = onBackInvokedDispatcherA;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(k22.v(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(k22.v(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(k22.v(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
