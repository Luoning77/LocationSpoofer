package defpackage;

import android.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ws1 implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public us1 b;

    public ws1(zs1 zs1Var, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        us1 us1Var = this.b;
        if (us1Var != null) {
            ms1 ms1Var = ((vs1) us1Var.f).n;
            ms1Var.h = true;
            ms1Var.p(true);
        }
    }
}
