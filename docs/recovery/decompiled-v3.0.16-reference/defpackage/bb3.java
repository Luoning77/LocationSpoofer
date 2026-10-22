package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bb3 implements pt1 {
    public ms1 e;
    public vs1 f;
    public final /* synthetic */ Toolbar g;

    public bb3(Toolbar toolbar) {
        this.g = toolbar;
    }

    @Override // defpackage.pt1
    public final boolean d(vs1 vs1Var) {
        Toolbar toolbar = this.g;
        KeyEvent.Callback callback = toolbar.m;
        if (callback instanceof oy) {
            ((oy) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.m);
        toolbar.removeView(toolbar.l);
        toolbar.m = null;
        ArrayList arrayList = toolbar.I;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f = null;
        toolbar.requestLayout();
        vs1Var.C = false;
        vs1Var.n.p(false);
        toolbar.v();
        return true;
    }

    @Override // defpackage.pt1
    public final boolean f(vs1 vs1Var) {
        Toolbar toolbar = this.g;
        toolbar.c();
        ViewParent parent = toolbar.l.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.l);
            }
            toolbar.addView(toolbar.l);
        }
        View actionView = vs1Var.getActionView();
        toolbar.m = actionView;
        this.f = vs1Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.m);
            }
            cb3 cb3VarH = Toolbar.h();
            cb3VarH.a = (toolbar.r & 112) | 8388611;
            cb3VarH.b = 2;
            toolbar.m.setLayoutParams(cb3VarH);
            toolbar.addView(toolbar.m);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((cb3) childAt.getLayoutParams()).b != 2 && childAt != toolbar.e) {
                toolbar.removeViewAt(childCount);
                toolbar.I.add(childAt);
            }
        }
        toolbar.requestLayout();
        vs1Var.C = true;
        vs1Var.n.p(false);
        KeyEvent.Callback callback = toolbar.m;
        if (callback instanceof oy) {
            ((oy) callback).onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // defpackage.pt1
    public final void g() {
        if (this.f != null) {
            ms1 ms1Var = this.e;
            if (ms1Var != null) {
                int size = ms1Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.e.getItem(i) == this.f) {
                        return;
                    }
                }
            }
            d(this.f);
        }
    }

    @Override // defpackage.pt1
    public final void i(Context context, ms1 ms1Var) {
        vs1 vs1Var;
        ms1 ms1Var2 = this.e;
        if (ms1Var2 != null && (vs1Var = this.f) != null) {
            ms1Var2.d(vs1Var);
        }
        this.e = ms1Var;
    }

    @Override // defpackage.pt1
    public final boolean j(c23 c23Var) {
        return false;
    }

    @Override // defpackage.pt1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.pt1
    public final void b(ms1 ms1Var, boolean z) {
    }
}
