package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class vf2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, ve1 ve1Var) {
        ve1Var.getClass();
        if (activity instanceof df1) {
            xe1 lifecycle = ((df1) activity).getLifecycle();
            if (lifecycle instanceof ff1) {
                ((ff1) lifecycle).e(ve1Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            xf2.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new xf2.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new xf2(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
