package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c7 extends gt1 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ g7 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(g7 g7Var, Context context, c23 c23Var, View view) {
        super(context, c23Var, view, false, 2130903072, 0);
        this.m = g7Var;
        if ((c23Var.A.x & 32) != 32) {
            View view2 = g7Var.m;
            this.e = view2 == null ? (View) g7Var.l : view2;
        }
        t1 t1Var = g7Var.A;
        this.h = t1Var;
        dt1 dt1Var = this.i;
        if (dt1Var != null) {
            dt1Var.e(t1Var);
        }
    }

    @Override // defpackage.gt1
    public final void c() {
        int i = this.l;
        g7 g7Var = this.m;
        switch (i) {
            case 0:
                g7Var.x = null;
                super.c();
                break;
            default:
                ms1 ms1Var = g7Var.g;
                if (ms1Var != null) {
                    ms1Var.c(true);
                }
                g7Var.w = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(g7 g7Var, Context context, ms1 ms1Var, View view) {
        super(context, ms1Var, view, true, 2130903072, 0);
        this.m = g7Var;
        this.f = 8388613;
        t1 t1Var = g7Var.A;
        this.h = t1Var;
        dt1 dt1Var = this.i;
        if (dt1Var != null) {
            dt1Var.e(t1Var);
        }
    }
}
