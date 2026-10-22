package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c23 extends ms1 implements SubMenu {
    public final vs1 A;
    public final ms1 z;

    public c23(Context context, ms1 ms1Var, vs1 vs1Var) {
        super(context);
        this.z = ms1Var;
        this.A = vs1Var;
    }

    @Override // defpackage.ms1
    public final boolean d(vs1 vs1Var) {
        return this.z.d(vs1Var);
    }

    @Override // defpackage.ms1
    public final boolean e(ms1 ms1Var, MenuItem menuItem) {
        return super.e(ms1Var, menuItem) || this.z.e(ms1Var, menuItem);
    }

    @Override // defpackage.ms1
    public final boolean f(vs1 vs1Var) {
        return this.z.f(vs1Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.ms1
    public final String j() {
        int i = this.A.a;
        if (i == 0) {
            return null;
        }
        return p91.l(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.ms1
    public final ms1 k() {
        return this.z.k();
    }

    @Override // defpackage.ms1
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.ms1
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.ms1
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.ms1, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.ms1, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
