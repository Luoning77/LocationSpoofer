package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k03 extends dt1 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context f;
    public final ms1 g;
    public final js1 h;
    public final boolean i;
    public final int j;
    public final int k;
    public final lt1 l;
    public PopupWindow.OnDismissListener o;
    public View p;
    public View q;
    public ot1 r;
    public ViewTreeObserver s;
    public boolean t;
    public boolean u;
    public int v;
    public boolean x;
    public final ql m = new ql(this, 3);
    public final rd n = new rd(this, 2);
    public int w = 0;

    public k03(Context context, ms1 ms1Var, View view, int i, boolean z) {
        this.f = context;
        this.g = ms1Var;
        this.i = z;
        this.h = new js1(ms1Var, LayoutInflater.from(context), z, 2131427347);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131099671));
        this.p = view;
        this.l = new lt1(context, null, i);
        ms1Var.b(this, context);
    }

    @Override // defpackage.rv2
    public final boolean a() {
        return !this.t && this.l.C.isShowing();
    }

    @Override // defpackage.pt1
    public final void b(ms1 ms1Var, boolean z) {
        if (ms1Var != this.g) {
            return;
        }
        dismiss();
        ot1 ot1Var = this.r;
        if (ot1Var != null) {
            ot1Var.b(ms1Var, z);
        }
    }

    @Override // defpackage.rv2
    public final void c() {
        View view;
        if (a()) {
            return;
        }
        if (this.t || (view = this.p) == null) {
            fo.n("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.q = view;
        lt1 lt1Var = this.l;
        jl jlVar = lt1Var.C;
        jl jlVar2 = lt1Var.C;
        jlVar.setOnDismissListener(this);
        lt1Var.t = this;
        lt1Var.B = true;
        jlVar2.setFocusable(true);
        View view2 = this.q;
        boolean z = this.s == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.s = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.m);
        }
        view2.addOnAttachStateChangeListener(this.n);
        lt1Var.s = view2;
        lt1Var.p = this.w;
        boolean z2 = this.u;
        Context context = this.f;
        js1 js1Var = this.h;
        if (!z2) {
            this.v = dt1.m(js1Var, context, this.j);
            this.u = true;
        }
        lt1Var.r(this.v);
        jlVar2.setInputMethodMode(2);
        Rect rect = this.e;
        lt1Var.A = rect != null ? new Rect(rect) : null;
        lt1Var.c();
        vg0 vg0Var = lt1Var.g;
        vg0Var.setOnKeyListener(this);
        if (this.x) {
            ms1 ms1Var = this.g;
            if (ms1Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131427346, (ViewGroup) vg0Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(ms1Var.m);
                }
                frameLayout.setEnabled(false);
                vg0Var.addHeaderView(frameLayout, null, false);
            }
        }
        lt1Var.p(js1Var);
        lt1Var.c();
    }

    @Override // defpackage.rv2
    public final void dismiss() {
        if (a()) {
            this.l.dismiss();
        }
    }

    @Override // defpackage.pt1
    public final void e(ot1 ot1Var) {
        this.r = ot1Var;
    }

    @Override // defpackage.pt1
    public final void g() {
        this.u = false;
        js1 js1Var = this.h;
        if (js1Var != null) {
            js1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.rv2
    public final vg0 h() {
        return this.l.g;
    }

    @Override // defpackage.pt1
    public final boolean j(c23 c23Var) {
        boolean z;
        if (c23Var.hasVisibleItems()) {
            gt1 gt1Var = new gt1(this.f, c23Var, this.q, this.i, this.k, 0);
            ot1 ot1Var = this.r;
            gt1Var.h = ot1Var;
            dt1 dt1Var = gt1Var.i;
            if (dt1Var != null) {
                dt1Var.e(ot1Var);
            }
            int size = c23Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = c23Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            gt1Var.g = z;
            dt1 dt1Var2 = gt1Var.i;
            if (dt1Var2 != null) {
                dt1Var2.o(z);
            }
            gt1Var.j = this.o;
            this.o = null;
            this.g.c(false);
            lt1 lt1Var = this.l;
            int width = lt1Var.j;
            int iN = lt1Var.n();
            int i2 = this.w;
            View view = this.p;
            WeakHashMap weakHashMap = yi3.a;
            if ((Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 7) == 5) {
                width += this.p.getWidth();
            }
            if (!gt1Var.b()) {
                if (gt1Var.e != null) {
                    gt1Var.d(width, iN, true, true);
                }
            }
            ot1 ot1Var2 = this.r;
            if (ot1Var2 != null) {
                ot1Var2.o(c23Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.pt1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.dt1
    public final void n(View view) {
        this.p = view;
    }

    @Override // defpackage.dt1
    public final void o(boolean z) {
        this.h.g = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.t = true;
        this.g.c(true);
        ViewTreeObserver viewTreeObserver = this.s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.s = this.q.getViewTreeObserver();
            }
            this.s.removeGlobalOnLayoutListener(this.m);
            this.s = null;
        }
        this.q.removeOnAttachStateChangeListener(this.n);
        PopupWindow.OnDismissListener onDismissListener = this.o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.w = i;
    }

    @Override // defpackage.dt1
    public final void q(int i) {
        this.l.j = i;
    }

    @Override // defpackage.dt1
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.o = onDismissListener;
    }

    @Override // defpackage.dt1
    public final void s(boolean z) {
        this.x = z;
    }

    @Override // defpackage.dt1
    public final void t(int i) {
        this.l.j(i);
    }

    @Override // defpackage.dt1
    public final void l(ms1 ms1Var) {
    }
}
