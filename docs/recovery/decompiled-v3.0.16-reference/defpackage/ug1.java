package defpackage;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ug1 implements AbsListView.OnScrollListener {
    public final /* synthetic */ wg1 a;

    public ug1(wg1 wg1Var) {
        this.a = wg1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        wg1 wg1Var = this.a;
        tg1 tg1Var = wg1Var.u;
        jl jlVar = wg1Var.C;
        if (i != 1 || jlVar.getInputMethodMode() == 2 || jlVar.getContentView() == null) {
            return;
        }
        wg1Var.y.removeCallbacks(tg1Var);
        tg1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
