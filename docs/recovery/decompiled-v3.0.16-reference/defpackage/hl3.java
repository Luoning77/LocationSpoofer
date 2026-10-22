package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class hl3 extends gl3 {
    public j31 n;

    public hl3(ql3 ql3Var, hl3 hl3Var) {
        super(ql3Var, hl3Var);
        this.n = null;
        this.n = hl3Var.n;
    }

    @Override // defpackage.nl3
    public ql3 b() {
        return ql3.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.nl3
    public ql3 c() {
        return ql3.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.nl3
    public final j31 j() {
        j31 j31Var = this.n;
        if (j31Var != null) {
            return j31Var;
        }
        WindowInsets windowInsets = this.c;
        j31 j31VarB = j31.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.n = j31VarB;
        return j31VarB;
    }

    @Override // defpackage.nl3
    public boolean o() {
        return this.c.isConsumed();
    }

    @Override // defpackage.nl3
    public void u(j31 j31Var) {
        this.n = j31Var;
    }

    public hl3(ql3 ql3Var, WindowInsets windowInsets) {
        super(ql3Var, windowInsets);
        this.n = null;
    }
}
