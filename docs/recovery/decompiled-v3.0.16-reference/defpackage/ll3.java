package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class ll3 extends jl3 {
    public static final ql3 r = ql3.c(WindowInsets.CONSUMED, null);

    public ll3(ql3 ql3Var, WindowInsets windowInsets) {
        super(ql3Var, windowInsets);
    }

    @Override // defpackage.gl3, defpackage.nl3
    public j31 g(int i) {
        return j31.c(this.c.getInsets(ol3.a(i)));
    }

    @Override // defpackage.gl3, defpackage.nl3
    public j31 h(int i) {
        return j31.c(this.c.getInsetsIgnoringVisibility(ol3.a(i)));
    }

    @Override // defpackage.gl3, defpackage.nl3
    public boolean q(int i) {
        return this.c.isVisible(ol3.a(i));
    }

    public ll3(ql3 ql3Var, ll3 ll3Var) {
        super(ql3Var, ll3Var);
    }

    @Override // defpackage.gl3, defpackage.nl3
    public final void d(View view) {
    }
}
