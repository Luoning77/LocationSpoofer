package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class wg1 implements rv2 {
    public static final Method D;
    public static final Method E;
    public Rect A;
    public boolean B;
    public final jl C;
    public final Context e;
    public ListAdapter f;
    public vg0 g;
    public int j;
    public int k;
    public boolean m;
    public boolean n;
    public boolean o;
    public i80 r;
    public View s;
    public AdapterView.OnItemClickListener t;
    public final Handler y;
    public final int h = -2;
    public int i = -2;
    public final int l = 1002;
    public int p = 0;
    public final int q = Integer.MAX_VALUE;
    public final tg1 u = new tg1(this, 1);
    public final vg1 v = new vg1(this);
    public final ug1 w = new ug1(this);
    public final tg1 x = new tg1(this, 0);
    public final Rect z = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                D = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                E = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public wg1(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.e = context;
        this.y = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jd2.o, i, 0);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.m = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        jl jlVar = new jl(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, jd2.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            jlVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        jlVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : k22.v(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.C = jlVar;
        jlVar.setInputMethodMode(1);
    }

    @Override // defpackage.rv2
    public final boolean a() {
        return this.C.isShowing();
    }

    public final int b() {
        return this.j;
    }

    @Override // defpackage.rv2
    public final void c() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        vg0 vg0Var;
        vg0 vg0Var2 = this.g;
        Context context = this.e;
        jl jlVar = this.C;
        if (vg0Var2 == null) {
            vg0 vg0VarQ = q(context, !this.B);
            this.g = vg0VarQ;
            vg0VarQ.setAdapter(this.f);
            this.g.setOnItemClickListener(this.t);
            this.g.setFocusable(true);
            this.g.setFocusableInTouchMode(true);
            this.g.setOnItemSelectedListener(new qg1(this, 0));
            this.g.setOnScrollListener(this.w);
            jlVar.setContentView(this.g);
        }
        Drawable background = jlVar.getBackground();
        Rect rect = this.z;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.m) {
                this.k = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = rg1.a(jlVar, this.s, this.k, jlVar.getInputMethodMode() == 2);
        int i3 = this.h;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.i;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.g.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.g.getPaddingBottom() + this.g.getPaddingTop() + i : 0);
        }
        boolean z = jlVar.getInputMethodMode() == 2;
        jlVar.setWindowLayoutType(this.l);
        if (jlVar.isShowing()) {
            View view = this.s;
            WeakHashMap weakHashMap = yi3.a;
            if (view.isAttachedToWindow()) {
                int width = this.i;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.s.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.i;
                    if (z) {
                        jlVar.setWidth(i5 == -1 ? -1 : 0);
                        jlVar.setHeight(0);
                    } else {
                        jlVar.setWidth(i5 == -1 ? -1 : 0);
                        jlVar.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                jlVar.setOutsideTouchable(true);
                View view2 = this.s;
                int i6 = width;
                int i7 = this.j;
                int i8 = this.k;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                jlVar.update(view2, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.i;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.s.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        jlVar.setWidth(width2);
        jlVar.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = D;
            if (method != null) {
                try {
                    method.invoke(jlVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            sg1.b(jlVar, true);
        }
        jlVar.setOutsideTouchable(true);
        jlVar.setTouchInterceptor(this.v);
        if (this.o) {
            jlVar.setOverlapAnchor(this.n);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = E;
            if (method2 != null) {
                try {
                    method2.invoke(jlVar, this.A);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            sg1.a(jlVar, this.A);
        }
        jlVar.showAsDropDown(this.s, this.j, this.k, this.p);
        this.g.setSelection(-1);
        if ((!this.B || this.g.isInTouchMode()) && (vg0Var = this.g) != null) {
            vg0Var.setListSelectionHidden(true);
            vg0Var.requestLayout();
        }
        if (this.B) {
            return;
        }
        this.y.post(this.x);
    }

    public final Drawable d() {
        return this.C.getBackground();
    }

    @Override // defpackage.rv2
    public final void dismiss() {
        jl jlVar = this.C;
        jlVar.dismiss();
        jlVar.setContentView(null);
        this.g = null;
        this.y.removeCallbacks(this.u);
    }

    public final void g(Drawable drawable) {
        this.C.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.rv2
    public final vg0 h() {
        return this.g;
    }

    public final void j(int i) {
        this.k = i;
        this.m = true;
    }

    public final void l(int i) {
        this.j = i;
    }

    public final int n() {
        if (this.m) {
            return this.k;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        i80 i80Var = this.r;
        if (i80Var == null) {
            this.r = new i80(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(i80Var);
            }
        }
        this.f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.r);
        }
        vg0 vg0Var = this.g;
        if (vg0Var != null) {
            vg0Var.setAdapter(this.f);
        }
    }

    public vg0 q(Context context, boolean z) {
        return new vg0(context, z);
    }

    public final void r(int i) {
        Drawable background = this.C.getBackground();
        if (background == null) {
            this.i = i;
            return;
        }
        Rect rect = this.z;
        background.getPadding(rect);
        this.i = rect.left + rect.right + i;
    }
}
