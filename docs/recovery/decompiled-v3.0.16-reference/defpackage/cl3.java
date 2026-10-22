package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class cl3 extends fl3 {
    public final WindowInsets.Builder c;

    public cl3(ql3 ql3Var) {
        super(ql3Var);
        WindowInsets windowInsetsB = ql3Var.b();
        this.c = windowInsetsB != null ? za2.e(windowInsetsB) : za2.d();
    }

    @Override // defpackage.fl3
    public ql3 b() {
        a();
        ql3 ql3VarC = ql3.c(this.c.build(), null);
        ql3VarC.a.r(this.b);
        return ql3VarC;
    }

    @Override // defpackage.fl3
    public void d(j31 j31Var) {
        this.c.setMandatorySystemGestureInsets(j31Var.d());
    }

    @Override // defpackage.fl3
    public void e(j31 j31Var) {
        this.c.setStableInsets(j31Var.d());
    }

    @Override // defpackage.fl3
    public void f(j31 j31Var) {
        this.c.setSystemGestureInsets(j31Var.d());
    }

    @Override // defpackage.fl3
    public void g(j31 j31Var) {
        this.c.setSystemWindowInsets(j31Var.d());
    }

    @Override // defpackage.fl3
    public void h(j31 j31Var) {
        this.c.setTappableElementInsets(j31Var.d());
    }

    public cl3() {
        this.c = za2.d();
    }
}
