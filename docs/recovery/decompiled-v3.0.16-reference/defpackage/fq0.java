package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fq0 extends cv1 implements up0 {
    @Override // defpackage.up0
    public final void r0(sp0 sp0Var) {
        View viewL = wc0.L(this);
        sp0Var.d(this.e.r && wc0.L(this).hasFocusable());
        View viewFindFocus = viewL.findFocus();
        if (viewFindFocus != null) {
            sp0Var.e(lp0.a(viewFindFocus, viewL));
        }
    }
}
