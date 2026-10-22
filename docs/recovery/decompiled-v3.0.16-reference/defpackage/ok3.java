package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ok3 extends l7 implements ks1 {
    public final Context g;
    public final ms1 h;
    public d31 i;
    public WeakReference j;
    public final /* synthetic */ pk3 k;

    public ok3(pk3 pk3Var, Context context, d31 d31Var) {
        this.k = pk3Var;
        this.g = context;
        this.i = d31Var;
        ms1 ms1Var = new ms1(context);
        ms1Var.l = 1;
        this.h = ms1Var;
        ms1Var.e = this;
    }

    @Override // defpackage.l7
    public final void a() {
        pk3 pk3Var = this.k;
        if (pk3Var.i != this) {
            return;
        }
        if (pk3Var.p) {
            pk3Var.j = this;
            pk3Var.k = this.i;
        } else {
            this.i.g(this);
        }
        this.i = null;
        pk3Var.p(false);
        ActionBarContextView actionBarContextView = pk3Var.f;
        if (actionBarContextView.o == null) {
            actionBarContextView.e();
        }
        pk3Var.c.setHideOnContentScrollEnabled(pk3Var.u);
        pk3Var.i = null;
    }

    @Override // defpackage.l7
    public final View b() {
        WeakReference weakReference = this.j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.l7
    public final ms1 c() {
        return this.h;
    }

    @Override // defpackage.l7
    public final MenuInflater d() {
        return new p23(this.g);
    }

    @Override // defpackage.ks1
    public final boolean e(ms1 ms1Var, MenuItem menuItem) {
        d31 d31Var = this.i;
        if (d31Var != null) {
            return ((k7) d31Var.f).d(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.l7
    public final CharSequence f() {
        return this.k.f.getSubtitle();
    }

    @Override // defpackage.l7
    public final CharSequence g() {
        return this.k.f.getTitle();
    }

    @Override // defpackage.l7
    public final void h() {
        if (this.k.i != this) {
            return;
        }
        ms1 ms1Var = this.h;
        ms1Var.w();
        try {
            this.i.f(this, ms1Var);
        } finally {
            ms1Var.v();
        }
    }

    @Override // defpackage.l7
    public final boolean i() {
        return this.k.f.w;
    }

    @Override // defpackage.ks1
    public final void j(ms1 ms1Var) {
        if (this.i == null) {
            return;
        }
        h();
        g7 g7Var = this.k.f.h;
        if (g7Var != null) {
            g7Var.l();
        }
    }

    @Override // defpackage.l7
    public final void k(View view) {
        this.k.f.setCustomView(view);
        this.j = new WeakReference(view);
    }

    @Override // defpackage.l7
    public final void l(int i) {
        m(this.k.a.getResources().getString(i));
    }

    @Override // defpackage.l7
    public final void m(CharSequence charSequence) {
        this.k.f.setSubtitle(charSequence);
    }

    @Override // defpackage.l7
    public final void n(int i) {
        o(this.k.a.getResources().getString(i));
    }

    @Override // defpackage.l7
    public final void o(CharSequence charSequence) {
        this.k.f.setTitle(charSequence);
    }

    @Override // defpackage.l7
    public final void p(boolean z) {
        this.f = z;
        this.k.f.setTitleOptional(z);
    }
}
