package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class za3 implements j7, ks1 {
    public final /* synthetic */ Toolbar e;

    public /* synthetic */ za3(Toolbar toolbar) {
        this.e = toolbar;
    }

    @Override // defpackage.ks1
    public boolean e(ms1 ms1Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.ks1
    public void j(ms1 ms1Var) {
        Toolbar toolbar = this.e;
        g7 g7Var = toolbar.e.x;
        if (g7Var == null || !g7Var.h()) {
            toolbar.K.c();
        }
        fb3 fb3Var = toolbar.S;
        if (fb3Var != null) {
            fb3Var.j(ms1Var);
        }
    }
}
