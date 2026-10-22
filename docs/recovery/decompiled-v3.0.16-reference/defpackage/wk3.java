package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wk3 extends zk3 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final qm0 f = new qm0();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, al3 al3Var) {
        tk3 tk3VarJ = j(view);
        if (tk3VarJ != null) {
            tk3VarJ.a(al3Var);
            if (tk3VarJ.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), al3Var);
            }
        }
    }

    public static void g(View view, al3 al3Var, ql3 ql3Var, boolean z) {
        tk3 tk3VarJ = j(view);
        if (tk3VarJ != null) {
            tk3VarJ.e = ql3Var;
            if (!z) {
                tk3VarJ.b();
                z = tk3VarJ.f == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), al3Var, ql3Var, z);
            }
        }
    }

    public static void h(View view, ql3 ql3Var, List list) {
        tk3 tk3VarJ = j(view);
        if (tk3VarJ != null) {
            ql3Var = tk3VarJ.c(ql3Var, list);
            if (tk3VarJ.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), ql3Var, list);
            }
        }
    }

    public static void i(View view, al3 al3Var, z92 z92Var) {
        tk3 tk3VarJ = j(view);
        if (tk3VarJ != null) {
            tk3VarJ.d(al3Var, z92Var);
            if (tk3VarJ.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), al3Var, z92Var);
            }
        }
    }

    public static tk3 j(View view) {
        Object tag = view.getTag(2131230920);
        if (tag instanceof vk3) {
            return ((vk3) tag).a;
        }
        return null;
    }
}
