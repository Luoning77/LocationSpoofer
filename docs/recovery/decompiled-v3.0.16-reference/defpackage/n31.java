package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n31 extends tk3 implements Runnable, n12, View.OnAttachStateChangeListener {
    public final ul3 g;
    public boolean h;
    public boolean i;
    public ql3 j;

    public n31(ul3 ul3Var) {
        super(!ul3Var.t ? 1 : 0);
        this.g = ul3Var;
    }

    @Override // defpackage.tk3
    public final void a(al3 al3Var) {
        this.h = false;
        this.i = false;
        ql3 ql3Var = this.j;
        if (al3Var.a.b() > 0 && ql3Var != null) {
            nl3 nl3Var = ql3Var.a;
            ul3 ul3Var = this.g;
            ul3Var.s.f(g83.h(nl3Var.g(8)));
            ul3Var.r.f(g83.h(nl3Var.g(8)));
            ul3.b(ul3Var, ql3Var);
        }
        this.j = null;
    }

    @Override // defpackage.tk3
    public final void b() {
        this.h = true;
        this.i = true;
    }

    @Override // defpackage.tk3
    public final ql3 c(ql3 ql3Var, List list) {
        ul3 ul3Var = this.g;
        ul3.b(ul3Var, ql3Var);
        return ul3Var.t ? ql3.b : ql3Var;
    }

    @Override // defpackage.tk3
    public final z92 d(al3 al3Var, z92 z92Var) {
        this.h = false;
        return z92Var;
    }

    @Override // defpackage.n12
    public final ql3 g(View view, ql3 ql3Var) {
        this.j = ql3Var;
        ul3 ul3Var = this.g;
        hh3 hh3Var = ul3Var.r;
        nl3 nl3Var = ql3Var.a;
        hh3Var.f(g83.h(nl3Var.g(8)));
        if (this.h) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.i) {
            ul3Var.s.f(g83.h(nl3Var.g(8)));
            ul3.b(ul3Var, ql3Var);
        }
        return ul3Var.t ? ql3.b : ql3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h) {
            this.h = false;
            this.i = false;
            ql3 ql3Var = this.j;
            if (ql3Var != null) {
                ul3 ul3Var = this.g;
                ul3Var.s.f(g83.h(ql3Var.a.g(8)));
                ul3.b(ul3Var, ql3Var);
                this.j = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
