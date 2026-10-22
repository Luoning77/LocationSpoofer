package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tg1 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ wg1 f;

    public /* synthetic */ tg1(wg1 wg1Var, int i) {
        this.e = i;
        this.f = wg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        wg1 wg1Var = this.f;
        switch (i) {
            case 0:
                vg0 vg0Var = wg1Var.g;
                if (vg0Var != null) {
                    vg0Var.setListSelectionHidden(true);
                    vg0Var.requestLayout();
                }
                break;
            default:
                vg0 vg0Var2 = wg1Var.g;
                if (vg0Var2 != null) {
                    WeakHashMap weakHashMap = yi3.a;
                    if (vg0Var2.isAttachedToWindow() && wg1Var.g.getCount() > wg1Var.g.getChildCount() && wg1Var.g.getChildCount() <= wg1Var.q) {
                        wg1Var.C.setInputMethodMode(2);
                        wg1Var.c();
                        break;
                    }
                }
                break;
        }
    }
}
