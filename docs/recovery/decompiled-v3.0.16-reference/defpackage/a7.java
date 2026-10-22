package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a7 extends rr0 {
    public final /* synthetic */ int n = 0;
    public final /* synthetic */ View o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.o = actionMenuItemView;
    }

    @Override // defpackage.rr0
    public final rv2 b() {
        c7 c7Var;
        int i = this.n;
        View view = this.o;
        switch (i) {
            case 0:
                b7 b7Var = ((ActionMenuItemView) view).q;
                if (b7Var == null || (c7Var = ((d7) b7Var).a.x) == null) {
                    return null;
                }
                return c7Var.a();
            default:
                c7 c7Var2 = ((f7) view).h.w;
                if (c7Var2 == null) {
                    return null;
                }
                return c7Var2.a();
        }
    }

    @Override // defpackage.rr0
    public final boolean c() {
        rv2 rv2VarB;
        int i = this.n;
        View view = this.o;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                ls1 ls1Var = actionMenuItemView.o;
                return ls1Var != null && ls1Var.a(actionMenuItemView.l) && (rv2VarB = b()) != null && rv2VarB.a();
            default:
                ((f7) view).h.l();
                return true;
        }
    }

    @Override // defpackage.rr0
    public boolean d() {
        switch (this.n) {
            case 1:
                g7 g7Var = ((f7) this.o).h;
                if (g7Var.y != null) {
                    return false;
                }
                g7Var.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(f7 f7Var, f7 f7Var2) {
        super(f7Var2);
        this.o = f7Var;
    }
}
