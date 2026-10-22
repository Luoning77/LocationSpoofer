package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class iw extends dt1 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public ot1 A;
    public ViewTreeObserver B;
    public PopupWindow.OnDismissListener C;
    public boolean D;
    public final Context f;
    public final int g;
    public final int h;
    public final boolean i;
    public final Handler j;
    public View r;
    public View s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public boolean z;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ql m = new ql(this, 2);
    public final rd n = new rd(this, 1);
    public final t1 o = new t1(this, 8);
    public int p = 0;
    public int q = 0;
    public boolean y = false;

    public iw(Context context, View view, int i, boolean z) {
        this.f = context;
        this.r = view;
        this.h = i;
        this.i = z;
        WeakHashMap weakHashMap = yi3.a;
        this.t = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131099671));
        this.j = new Handler();
    }

    @Override // defpackage.rv2
    public final boolean a() {
        ArrayList arrayList = this.l;
        return arrayList.size() > 0 && ((hw) arrayList.get(0)).a.C.isShowing();
    }

    @Override // defpackage.pt1
    public final void b(ms1 ms1Var, boolean z) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ms1Var == ((hw) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((hw) arrayList.get(i2)).b.c(false);
        }
        hw hwVar = (hw) arrayList.remove(i);
        ms1 ms1Var2 = hwVar.b;
        lt1 lt1Var = hwVar.a;
        jl jlVar = lt1Var.C;
        ms1Var2.r(this);
        if (this.D) {
            ht1.b(jlVar, null);
            jlVar.setAnimationStyle(0);
        }
        lt1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.t = ((hw) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.r;
            WeakHashMap weakHashMap = yi3.a;
            this.t = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((hw) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        ot1 ot1Var = this.A;
        if (ot1Var != null) {
            ot1Var.b(ms1Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.B.removeGlobalOnLayoutListener(this.m);
            }
            this.B = null;
        }
        this.s.removeOnAttachStateChangeListener(this.n);
        this.C.onDismiss();
    }

    @Override // defpackage.rv2
    public final void c() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((ms1) obj);
        }
        arrayList.clear();
        View view = this.r;
        this.s = view;
        if (view != null) {
            boolean z = this.B == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.B = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.m);
            }
            this.s.addOnAttachStateChangeListener(this.n);
        }
    }

    @Override // defpackage.rv2
    public final void dismiss() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        if (size > 0) {
            hw[] hwVarArr = (hw[]) arrayList.toArray(new hw[size]);
            for (int i = size - 1; i >= 0; i--) {
                hw hwVar = hwVarArr[i];
                if (hwVar.a.C.isShowing()) {
                    hwVar.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.pt1
    public final void e(ot1 ot1Var) {
        this.A = ot1Var;
    }

    @Override // defpackage.pt1
    public final void g() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((hw) obj).a.g.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((js1) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.rv2
    public final vg0 h() {
        ArrayList arrayList = this.l;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((hw) arrayList.get(arrayList.size() - 1)).a.g;
    }

    @Override // defpackage.pt1
    public final boolean j(c23 c23Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hw hwVar = (hw) obj;
            if (c23Var == hwVar.b) {
                hwVar.a.g.requestFocus();
                return true;
            }
        }
        if (!c23Var.hasVisibleItems()) {
            return false;
        }
        l(c23Var);
        ot1 ot1Var = this.A;
        if (ot1Var != null) {
            ot1Var.o(c23Var);
        }
        return true;
    }

    @Override // defpackage.pt1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.dt1
    public final void l(ms1 ms1Var) {
        ms1Var.b(this, this.f);
        if (a()) {
            u(ms1Var);
        } else {
            this.k.add(ms1Var);
        }
    }

    @Override // defpackage.dt1
    public final void n(View view) {
        if (this.r != view) {
            this.r = view;
            int i = this.p;
            WeakHashMap weakHashMap = yi3.a;
            this.q = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // defpackage.dt1
    public final void o(boolean z) {
        this.y = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        hw hwVar;
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                hwVar = null;
                break;
            }
            hwVar = (hw) arrayList.get(i);
            if (!hwVar.a.C.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (hwVar != null) {
            hwVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.dt1
    public final void p(int i) {
        if (this.p != i) {
            this.p = i;
            View view = this.r;
            WeakHashMap weakHashMap = yi3.a;
            this.q = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // defpackage.dt1
    public final void q(int i) {
        this.u = true;
        this.w = i;
    }

    @Override // defpackage.dt1
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.C = onDismissListener;
    }

    @Override // defpackage.dt1
    public final void s(boolean z) {
        this.z = z;
    }

    @Override // defpackage.dt1
    public final void t(int i) {
        this.v = true;
        this.x = i;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0167  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u(ms1 ms1Var) {
        boolean z;
        char c;
        View childAt;
        hw hwVar;
        int i;
        int i2;
        MenuItem item;
        js1 js1Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        js1 js1Var2 = new js1(ms1Var, layoutInflaterFrom, this.i, 2131427339);
        if (!a() && this.y) {
            js1Var2.g = true;
        } else if (a()) {
            int size = ms1Var.f.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = ms1Var.getItem(i3);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i3++;
            }
            js1Var2.g = z;
        }
        int iM = dt1.m(js1Var2, context, this.g);
        lt1 lt1Var = new lt1(context, null, this.h);
        lt1Var.F = this.o;
        lt1Var.t = this;
        jl jlVar = lt1Var.C;
        jlVar.setOnDismissListener(this);
        lt1Var.s = this.r;
        lt1Var.p = this.q;
        lt1Var.B = true;
        jlVar.setFocusable(true);
        jlVar.setInputMethodMode(2);
        lt1Var.p(js1Var2);
        lt1Var.r(iM);
        lt1Var.p = this.q;
        ArrayList arrayList = this.l;
        if (arrayList.size() > 0) {
            hwVar = (hw) arrayList.get(arrayList.size() - 1);
            ms1 ms1Var2 = hwVar.b;
            int size2 = ms1Var2.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    item = null;
                    break;
                }
                item = ms1Var2.getItem(i4);
                if (item.hasSubMenu() && ms1Var == item.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (item == null) {
                childAt = null;
                c = 0;
            } else {
                vg0 vg0Var = hwVar.a.g;
                ListAdapter adapter = vg0Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    js1Var = (js1) headerViewListAdapter.getWrappedAdapter();
                } else {
                    js1Var = (js1) adapter;
                    headersCount = 0;
                }
                int count = js1Var.getCount();
                int i5 = 0;
                c = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (item == js1Var.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                childAt = (i5 != -1 && (firstVisiblePosition = (i5 + headersCount) - vg0Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < vg0Var.getChildCount()) ? vg0Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c = 0;
            childAt = null;
            hwVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = lt1.G;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c] = Boolean.FALSE;
                        method.invoke(jlVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                it1.a(jlVar, c);
            }
            ht1.a(jlVar, null);
            vg0 vg0Var2 = ((hw) arrayList.get(arrayList.size() - 1)).a.g;
            int[] iArr = new int[2];
            vg0Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.s.getWindowVisibleDisplayFrame(rect);
            if (this.t == 1) {
                if (vg0Var2.getWidth() + iArr[0] + iM > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z2 = i == 1;
            this.t = i;
            lt1Var.s = childAt;
            if ((this.q & 5) != 5) {
                i2 = 0;
                iM = z2 ? childAt.getWidth() : 0 - iM;
            } else if (z2) {
                i2 = 0;
            } else {
                i2 = 0;
                iM = 0 - childAt.getWidth();
            }
            lt1Var.j = iM;
            lt1Var.o = true;
            lt1Var.n = true;
            lt1Var.j(i2);
        } else {
            if (this.u) {
                lt1Var.j = this.w;
            }
            if (this.v) {
                lt1Var.j(this.x);
            }
            Rect rect2 = this.e;
            lt1Var.A = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new hw(lt1Var, ms1Var, this.t));
        lt1Var.c();
        vg0 vg0Var3 = lt1Var.g;
        vg0Var3.setOnKeyListener(this);
        if (hwVar == null && this.z && ms1Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(2131427346, (ViewGroup) vg0Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(ms1Var.m);
            vg0Var3.addHeaderView(frameLayout, null, false);
            lt1Var.c();
        }
    }
}
