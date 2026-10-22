package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ya3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Toolbar f;

    public /* synthetic */ ya3(Toolbar toolbar, int i) {
        this.e = i;
        this.f = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Toolbar toolbar = this.f;
        switch (i) {
            case 0:
                bb3 bb3Var = toolbar.Q;
                vs1 vs1Var = bb3Var == null ? null : bb3Var.f;
                if (vs1Var != null) {
                    vs1Var.collapseActionView();
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
