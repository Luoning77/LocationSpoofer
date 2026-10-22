package defpackage;

import android.view.MenuItem;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fb3 implements db3, ks1 {
    public final /* synthetic */ gb3 e;

    public /* synthetic */ fb3(gb3 gb3Var) {
        this.e = gb3Var;
    }

    @Override // defpackage.ks1
    public boolean e(ms1 ms1Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.ks1
    public void j(ms1 ms1Var) {
        gb3 gb3Var = this.e;
        boolean zO = gb3Var.a.a.o();
        Window.Callback callback = gb3Var.b;
        if (zO) {
            callback.onPanelClosed(108, ms1Var);
        } else if (callback.onPreparePanel(0, null, ms1Var)) {
            callback.onMenuOpened(108, ms1Var);
        }
    }
}
