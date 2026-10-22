package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f03 extends l7 implements ks1 {
    public Context g;
    public ActionBarContextView h;
    public d31 i;
    public WeakReference j;
    public boolean k;
    public ms1 l;

    @Override // defpackage.l7
    public final void a() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.i.g(this);
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
        return this.l;
    }

    @Override // defpackage.l7
    public final MenuInflater d() {
        return new p23(this.h.getContext());
    }

    @Override // defpackage.ks1
    public final boolean e(ms1 ms1Var, MenuItem menuItem) {
        return ((k7) this.i.f).d(this, menuItem);
    }

    @Override // defpackage.l7
    public final CharSequence f() {
        return this.h.getSubtitle();
    }

    @Override // defpackage.l7
    public final CharSequence g() {
        return this.h.getTitle();
    }

    @Override // defpackage.l7
    public final void h() {
        this.i.f(this, this.l);
    }

    @Override // defpackage.l7
    public final boolean i() {
        return this.h.w;
    }

    @Override // defpackage.ks1
    public final void j(ms1 ms1Var) {
        h();
        g7 g7Var = this.h.h;
        if (g7Var != null) {
            g7Var.l();
        }
    }

    @Override // defpackage.l7
    public final void k(View view) {
        this.h.setCustomView(view);
        this.j = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.l7
    public final void l(int i) {
        m(this.g.getString(i));
    }

    @Override // defpackage.l7
    public final void m(CharSequence charSequence) {
        this.h.setSubtitle(charSequence);
    }

    @Override // defpackage.l7
    public final void n(int i) {
        o(this.g.getString(i));
    }

    @Override // defpackage.l7
    public final void o(CharSequence charSequence) {
        this.h.setTitle(charSequence);
    }

    @Override // defpackage.l7
    public final void p(boolean z) {
        this.f = z;
        this.h.setTitleOptional(z);
    }
}
