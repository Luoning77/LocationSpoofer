package defpackage;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zo2 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ SearchView f;

    public /* synthetic */ zo2(SearchView searchView, int i) {
        this.e = i;
        this.f = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        SearchView searchView = this.f;
        switch (i) {
            case 0:
                searchView.r();
                break;
            default:
                j80 j80Var = searchView.S;
                if (j80Var instanceof l23) {
                    j80Var.b(null);
                }
                break;
        }
    }
}
