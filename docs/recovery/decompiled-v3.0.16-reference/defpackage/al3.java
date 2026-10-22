package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class al3 {
    public zk3 a;

    public al3(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new yk3(n1.j(i, interpolator, j));
        } else {
            this.a = new wk3(i, interpolator, j);
        }
    }

    public static void a(View view, tk3 tk3Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(tk3Var != null ? new xk3(tk3Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = wk3.e;
        View.OnApplyWindowInsetsListener vk3Var = tk3Var != null ? new vk3(view, tk3Var) : null;
        view.setTag(2131230920, vk3Var);
        if (view.getTag(2131230910) == null && view.getTag(2131230911) == null) {
            view.setOnApplyWindowInsetsListener(vk3Var);
        }
    }
}
