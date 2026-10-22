package defpackage;

import android.content.ContextWrapper;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x20 extends y {
    public final w52 n;
    public boolean o;

    public x20(ContextWrapper contextWrapper) {
        super(contextWrapper);
        this.n = ke0.H(null);
    }

    @Override // defpackage.y
    public final void a(int i, f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(420213850);
        int i2 = (ov0Var.h(this) ? 4 : 2) | i;
        if (ov0Var.T(i2 & 1, (i2 & 3) != 2)) {
            pu0 pu0Var = (pu0) this.n.getValue();
            if (pu0Var == null) {
                ov0Var.c0(-1238823553);
            } else {
                ov0Var.c0(98585282);
                pu0Var.invoke(ov0Var, 0);
            }
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new x(this, i, 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return x20.class.getName();
    }

    @Override // defpackage.y
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.o;
    }

    public final void setContent(pu0 pu0Var) {
        this.o = true;
        this.n.setValue(pu0Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
