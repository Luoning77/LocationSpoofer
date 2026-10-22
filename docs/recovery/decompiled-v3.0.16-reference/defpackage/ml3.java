package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ml3 extends ll3 {
    public static final ql3 s = ql3.c(WindowInsets.CONSUMED, null);

    public ml3(ql3 ql3Var, WindowInsets windowInsets) {
        super(ql3Var, windowInsets);
    }

    @Override // defpackage.ll3, defpackage.gl3, defpackage.nl3
    public j31 g(int i) {
        return j31.c(this.c.getInsets(pl3.a(i)));
    }

    @Override // defpackage.ll3, defpackage.gl3, defpackage.nl3
    public j31 h(int i) {
        return j31.c(this.c.getInsetsIgnoringVisibility(pl3.a(i)));
    }

    @Override // defpackage.ll3, defpackage.gl3, defpackage.nl3
    public boolean q(int i) {
        return this.c.isVisible(pl3.a(i));
    }

    public ml3(ql3 ql3Var, ml3 ml3Var) {
        super(ql3Var, ml3Var);
    }
}
