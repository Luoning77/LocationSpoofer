package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pg1 implements pt1, AdapterView.OnItemClickListener {
    public Context e;
    public LayoutInflater f;
    public ms1 g;
    public ExpandedMenuView h;
    public ot1 i;
    public og1 j;

    public pg1(ContextWrapper contextWrapper) {
        this.e = contextWrapper;
        this.f = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.pt1
    public final void b(ms1 ms1Var, boolean z) {
        ot1 ot1Var = this.i;
        if (ot1Var != null) {
            ot1Var.b(ms1Var, z);
        }
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

    @Override // defpackage.pt1
    public final void g() {
        og1 og1Var = this.j;
        if (og1Var != null) {
            og1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.pt1
    public final void i(Context context, ms1 ms1Var) {
        if (this.e != null) {
            this.e = context;
            if (this.f == null) {
                this.f = LayoutInflater.from(context);
            }
        }
        this.g = ms1Var;
        og1 og1Var = this.j;
        if (og1Var != null) {
            og1Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.pt1
    public final boolean j(c23 c23Var) {
        boolean zHasVisibleItems = c23Var.hasVisibleItems();
        Context context = c23Var.a;
        if (!zHasVisibleItems) {
            return false;
        }
        os1 os1Var = new os1();
        os1Var.e = c23Var;
        x8 x8Var = new x8(context);
        t8 t8Var = (t8) x8Var.c;
        pg1 pg1Var = new pg1(t8Var.a);
        os1Var.g = pg1Var;
        pg1Var.i = os1Var;
        c23Var.b(pg1Var, context);
        pg1 pg1Var2 = os1Var.g;
        og1 og1Var = pg1Var2.j;
        if (og1Var == null) {
            og1Var = new og1(pg1Var2);
            pg1Var2.j = og1Var;
        }
        t8Var.g = og1Var;
        t8Var.h = os1Var;
        View view = c23Var.o;
        if (view != null) {
            t8Var.e = view;
        } else {
            t8Var.c = c23Var.n;
            t8Var.d = c23Var.m;
        }
        t8Var.f = os1Var;
        y8 y8VarC = x8Var.c();
        os1Var.f = y8VarC;
        y8VarC.setOnDismissListener(os1Var);
        WindowManager.LayoutParams attributes = os1Var.f.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        os1Var.f.show();
        ot1 ot1Var = this.i;
        if (ot1Var == null) {
            return true;
        }
        ot1Var.o(c23Var);
        return true;
    }

    @Override // defpackage.pt1
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.g.q(this.j.getItem(i), this, 0);
    }
}
