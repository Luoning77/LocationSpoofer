package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gb3 extends r6 {
    public final jb3 a;
    public final Window.Callback b;
    public final fb3 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ab h = new ab(this, 8);

    public gb3(Toolbar toolbar, CharSequence charSequence, vk vkVar) {
        fb3 fb3Var = new fb3(this);
        jb3 jb3Var = new jb3(toolbar, false);
        this.a = jb3Var;
        vkVar.getClass();
        this.b = vkVar;
        jb3Var.k = vkVar;
        toolbar.setOnMenuItemClickListener(fb3Var);
        boolean z = jb3Var.g;
        if (!z) {
            jb3Var.h = charSequence;
            if ((jb3Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (z) {
                    yi3.k(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.c = new fb3(this);
    }

    @Override // defpackage.r6
    public final boolean a() {
        g7 g7Var;
        ActionMenuView actionMenuView = this.a.a.e;
        return (actionMenuView == null || (g7Var = actionMenuView.x) == null || !g7Var.c()) ? false : true;
    }

    @Override // defpackage.r6
    public final boolean b() {
        vs1 vs1Var;
        bb3 bb3Var = this.a.a.Q;
        if (bb3Var == null || (vs1Var = bb3Var.f) == null) {
            return false;
        }
        if (bb3Var == null) {
            vs1Var = null;
        }
        if (vs1Var == null) {
            return true;
        }
        vs1Var.collapseActionView();
        return true;
    }

    @Override // defpackage.r6
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        b81.u();
    }

    @Override // defpackage.r6
    public final int d() {
        return this.a.b;
    }

    @Override // defpackage.r6
    public final Context e() {
        return this.a.a.getContext();
    }

    @Override // defpackage.r6
    public final boolean f() {
        jb3 jb3Var = this.a;
        Toolbar toolbar = jb3Var.a;
        ab abVar = this.h;
        toolbar.removeCallbacks(abVar);
        Toolbar toolbar2 = jb3Var.a;
        WeakHashMap weakHashMap = yi3.a;
        toolbar2.postOnAnimation(abVar);
        return true;
    }

    @Override // defpackage.r6
    public final void h() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // defpackage.r6
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu menuP = p();
        if (menuP == null) {
            return false;
        }
        menuP.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuP.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.r6
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // defpackage.r6
    public final boolean k() {
        return this.a.a.u();
    }

    @Override // defpackage.r6
    public final void n(CharSequence charSequence) {
        jb3 jb3Var = this.a;
        if (jb3Var.g) {
            return;
        }
        Toolbar toolbar = jb3Var.a;
        jb3Var.h = charSequence;
        if ((jb3Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (jb3Var.g) {
                yi3.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu p() {
        boolean z = this.e;
        jb3 jb3Var = this.a;
        if (!z) {
            e30 e30Var = new e30(this);
            fb3 fb3Var = new fb3(this);
            Toolbar toolbar = jb3Var.a;
            toolbar.R = e30Var;
            toolbar.S = fb3Var;
            ActionMenuView actionMenuView = toolbar.e;
            if (actionMenuView != null) {
                actionMenuView.y = e30Var;
                actionMenuView.z = fb3Var;
            }
            this.e = true;
        }
        return jb3Var.a.getMenu();
    }

    @Override // defpackage.r6
    public final void g() {
    }

    @Override // defpackage.r6
    public final void l(boolean z) {
    }

    @Override // defpackage.r6
    public final void m(boolean z) {
    }
}
