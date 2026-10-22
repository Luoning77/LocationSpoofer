package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class uh0 extends th0 {
    @Override // defpackage.sh0
    public void b(j43 j43Var, j43 j43Var2, Window window, View view, boolean z, boolean z2) {
        h73 sl3Var;
        j43Var.getClass();
        j43Var2.getClass();
        window.getClass();
        view.getClass();
        v63.f(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            sl3Var = new tl3(window);
        } else {
            sl3Var = i >= 30 ? new sl3(window) : new rl3(window);
        }
        sl3Var.p(!z);
        sl3Var.o(!z2);
    }
}
