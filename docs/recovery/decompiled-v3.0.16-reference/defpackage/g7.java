package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g7 implements pt1 {
    public final Context e;
    public Context f;
    public ms1 g;
    public final LayoutInflater h;
    public ot1 i;
    public st1 l;
    public f7 m;
    public Drawable n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public c7 w;
    public c7 x;
    public e7 y;
    public d7 z;
    public final int j = 2131427331;
    public final int k = 2131427330;
    public final SparseBooleanArray v = new SparseBooleanArray();
    public final t1 A = new t1(this, 1);

    public g7(Context context) {
        this.e = context;
        this.h = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(vs1 vs1Var, View view, ViewGroup viewGroup) {
        View actionView = vs1Var.getActionView();
        if (actionView == null || vs1Var.e()) {
            rt1 rt1Var = view instanceof rt1 ? (rt1) view : (rt1) this.h.inflate(this.k, viewGroup, false);
            rt1Var.a(vs1Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) rt1Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.l);
            d7 d7Var = this.z;
            if (d7Var == null) {
                d7Var = new d7(this);
                this.z = d7Var;
            }
            actionMenuItemView.setPopupCallback(d7Var);
            actionView = (View) rt1Var;
        }
        actionView.setVisibility(vs1Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof i7)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.pt1
    public final void b(ms1 ms1Var, boolean z) {
        c();
        c7 c7Var = this.x;
        if (c7Var != null && c7Var.b()) {
            c7Var.i.dismiss();
        }
        ot1 ot1Var = this.i;
        if (ot1Var != null) {
            ot1Var.b(ms1Var, z);
        }
    }

    public final boolean c() {
        Object obj;
        e7 e7Var = this.y;
        if (e7Var != null && (obj = this.l) != null) {
            ((View) obj).removeCallbacks(e7Var);
            this.y = null;
            return true;
        }
        c7 c7Var = this.w;
        if (c7Var == null) {
            return false;
        }
        if (c7Var.b()) {
            c7Var.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.pt1
    public final boolean d(vs1 vs1Var) {
        return false;
    }

    @Override // defpackage.pt1
    public final void e(ot1 ot1Var) {
        throw null;
    }

    @Override // defpackage.pt1
    public final boolean f(vs1 vs1Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pt1
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.l;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            ms1 ms1Var = this.g;
            if (ms1Var != null) {
                ms1Var.i();
                ArrayList arrayListL = this.g.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    vs1 vs1Var = (vs1) arrayListL.get(i2);
                    if ((vs1Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        vs1 itemData = childAt instanceof rt1 ? ((rt1) childAt).getItemData() : null;
                        View viewA = a(vs1Var, childAt, viewGroup);
                        if (vs1Var != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.l).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.m) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.l).requestLayout();
        ms1 ms1Var2 = this.g;
        if (ms1Var2 != null) {
            ms1Var2.i();
            ArrayList arrayList2 = ms1Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ws1 ws1Var = ((vs1) arrayList2.get(i3)).A;
            }
        }
        ms1 ms1Var3 = this.g;
        if (ms1Var3 != null) {
            ms1Var3.i();
            arrayList = ms1Var3.j;
        }
        if (this.p && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((vs1) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        f7 f7Var = this.m;
        if (z) {
            if (f7Var == null) {
                f7Var = new f7(this, this.e);
                this.m = f7Var;
            }
            ViewGroup viewGroup3 = (ViewGroup) f7Var.getParent();
            if (viewGroup3 != this.l) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.m);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.l;
                f7 f7Var2 = this.m;
                actionMenuView.getClass();
                i7 i7VarI = ActionMenuView.i();
                i7VarI.a = true;
                actionMenuView.addView(f7Var2, i7VarI);
            }
        } else if (f7Var != null) {
            Object parent = f7Var.getParent();
            Object obj = this.l;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.m);
            }
        }
        ((ActionMenuView) this.l).setOverflowReserved(this.p);
    }

    public final boolean h() {
        c7 c7Var = this.w;
        return c7Var != null && c7Var.b();
    }

    @Override // defpackage.pt1
    public final void i(Context context, ms1 ms1Var) {
        this.f = context;
        LayoutInflater.from(context);
        this.g = ms1Var;
        Resources resources = context.getResources();
        if (!this.q) {
            this.p = true;
        }
        int i = 2;
        this.r = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.t = i;
        int measuredWidth = this.r;
        if (this.p) {
            if (this.m == null) {
                f7 f7Var = new f7(this, this.e);
                this.m = f7Var;
                if (this.o) {
                    f7Var.setImageDrawable(this.n);
                    this.n = null;
                    this.o = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.m.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.m.getMeasuredWidth();
        } else {
            this.m = null;
        }
        this.s = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pt1
    public final boolean j(c23 c23Var) {
        boolean z;
        if (c23Var.hasVisibleItems()) {
            c23 c23Var2 = c23Var;
            while (true) {
                ms1 ms1Var = c23Var2.z;
                if (ms1Var == this.g) {
                    break;
                }
                c23Var2 = (c23) ms1Var;
            }
            vs1 vs1Var = c23Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.l;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof rt1) && ((rt1) childAt).getItemData() == vs1Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                int size = c23Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = c23Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                c7 c7Var = new c7(this, this.f, c23Var, view);
                this.x = c7Var;
                c7Var.g = z;
                dt1 dt1Var = c7Var.i;
                if (dt1Var != null) {
                    dt1Var.o(z);
                }
                c7 c7Var2 = this.x;
                if (!c7Var2.b()) {
                    if (c7Var2.e == null) {
                        fo.n("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    c7Var2.d(0, 0, false, false);
                }
                ot1 ot1Var = this.i;
                if (ot1Var != null) {
                    ot1Var.o(c23Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pt1
    public final boolean k() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        g7 g7Var = this;
        ms1 ms1Var = g7Var.g;
        if (ms1Var != null) {
            arrayListL = ms1Var.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = g7Var.t;
        int i3 = g7Var.s;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) g7Var.l;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            vs1 vs1Var = (vs1) arrayListL.get(i4);
            int i7 = vs1Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (g7Var.u && vs1Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (g7Var.p && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = g7Var.v;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            vs1 vs1Var2 = (vs1) arrayListL.get(i9);
            int i11 = vs1Var2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = vs1Var2.b;
            if (z3) {
                View viewA = g7Var.a(vs1Var2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                vs1Var2.f(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = g7Var.a(vs1Var2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            vs1 vs1Var3 = (vs1) arrayListL.get(i13);
                            if (vs1Var3.b == i12) {
                                if ((vs1Var3.x & 32) == 32) {
                                    i8++;
                                }
                                vs1Var3.f(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    vs1Var2.f(z5);
                } else {
                    vs1Var2.f(false);
                }
                i9++;
                i = 2;
                g7Var = this;
                z = true;
            }
            i9++;
            i = 2;
            g7Var = this;
            z = true;
        }
        return z;
    }

    public final boolean l() {
        ms1 ms1Var;
        if (!this.p || h() || (ms1Var = this.g) == null || this.l == null || this.y != null) {
            return false;
        }
        ms1Var.i();
        if (ms1Var.j.isEmpty()) {
            return false;
        }
        e7 e7Var = new e7(this, new c7(this, this.f, this.g, this.m));
        this.y = e7Var;
        ((View) this.l).post(e7Var);
        return true;
    }
}
