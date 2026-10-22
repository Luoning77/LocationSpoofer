package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gw implements Runnable {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public gw(t1 t1Var, hw hwVar, vs1 vs1Var, ms1 ms1Var) {
        this.i = t1Var;
        this.f = hwVar;
        this.g = vs1Var;
        this.h = ms1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                iw iwVar = (iw) ((t1) obj).f;
                vs1 vs1Var = (vs1) obj3;
                hw hwVar = (hw) obj4;
                if (hwVar != null) {
                    iwVar.D = true;
                    hwVar.b.c(false);
                    iwVar.D = false;
                }
                if (vs1Var.isEnabled() && vs1Var.hasSubMenu()) {
                    ((ms1) obj2).q(vs1Var, null, 4);
                    break;
                }
                break;
            default:
                wk3.i((View) obj4, (al3) obj3, (z92) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public gw(View view, al3 al3Var, z92 z92Var, ValueAnimator valueAnimator) {
        this.f = view;
        this.g = al3Var;
        this.h = z92Var;
        this.i = valueAnimator;
    }
}
