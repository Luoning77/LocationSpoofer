package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lt1 extends wg1 implements ts1 {
    public static final Method G;
    public t1 F;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                G = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.ts1
    public final void f(ms1 ms1Var, MenuItem menuItem) {
        t1 t1Var = this.F;
        if (t1Var != null) {
            t1Var.f(ms1Var, menuItem);
        }
    }

    @Override // defpackage.ts1
    public final void i(ms1 ms1Var, vs1 vs1Var) {
        t1 t1Var = this.F;
        if (t1Var != null) {
            t1Var.i(ms1Var, vs1Var);
        }
    }

    @Override // defpackage.wg1
    public final vg0 q(Context context, boolean z) {
        kt1 kt1Var = new kt1(context, z);
        kt1Var.setHoverListener(this);
        return kt1Var;
    }
}
