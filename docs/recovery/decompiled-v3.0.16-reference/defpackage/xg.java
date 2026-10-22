package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xg extends aa1 implements lu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ bj3 g;
    public final /* synthetic */ hb1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg(bj3 bj3Var, hb1 hb1Var, int i) {
        super(1);
        this.f = i;
        this.g = bj3Var;
        this.h = hb1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsB;
        int i = this.f;
        mf3 mf3Var = mf3.a;
        hb1 hb1Var = this.h;
        bj3 bj3Var = this.g;
        switch (i) {
            case 0:
                t42 t42Var = (t42) obj;
                db dbVar = t42Var instanceof db ? (db) t42Var : null;
                if (dbVar != null) {
                    dbVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(bj3Var, hb1Var);
                    dbVar.getAndroidViewsHandler$ui().addView(bj3Var);
                    dbVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(hb1Var, bj3Var);
                    bj3Var.setImportantForAccessibility(1);
                    yi3.j(bj3Var, new ra(dbVar, hb1Var, dbVar));
                }
                if (bj3Var.getView().getParent() != bj3Var) {
                    bj3Var.addView(bj3Var.getView());
                }
                break;
            case 1:
                xp1.D(bj3Var, hb1Var);
                break;
            default:
                xp1.D(bj3Var, hb1Var);
                ((db) bj3Var.g).L = true;
                int[] iArr = bj3Var.r;
                int i2 = iArr[0];
                int i3 = iArr[1];
                bj3Var.getView().getLocationOnScreen(iArr);
                long j = bj3Var.s;
                long jF0 = ((pa1) obj).f0();
                bj3Var.s = jF0;
                ql3 ql3Var = bj3Var.t;
                if (ql3Var != null && ((i2 != iArr[0] || i3 != iArr[1] || !p41.b(j, jF0)) && (windowInsetsB = bj3Var.l(ql3Var).b()) != null)) {
                    bj3Var.getView().dispatchApplyWindowInsets(windowInsetsB);
                }
                break;
        }
        return mf3Var;
    }
}
