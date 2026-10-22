package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ts implements ss, dm3 {
    public static final ts e = new ts();
    public static final ts f = new ts();

    @Override // defpackage.ss
    public Rect c(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // defpackage.dm3
    public zl3 e(ContextWrapper contextWrapper, yb0 yb0Var) {
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f2 = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new zl3(bounds, f2);
    }
}
