package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ri3 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131230920);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static ql3 b(View view, ql3 ql3Var, Rect rect) {
        WindowInsets windowInsetsB = ql3Var.b();
        if (windowInsetsB != null) {
            return ql3.c(view.computeSystemWindowInsets(windowInsetsB, rect), view);
        }
        rect.setEmpty();
        return ql3Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static void e(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void f(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void g(View view, float f) {
        view.setElevation(f);
    }

    public static void h(View view, n12 n12Var) {
        qi3 qi3Var = n12Var != null ? new qi3(view, n12Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131230911, qi3Var);
        }
        if (view.getTag(2131230910) != null) {
            return;
        }
        if (qi3Var != null) {
            view.setOnApplyWindowInsetsListener(qi3Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131230920));
        }
    }

    public static void i(View view) {
        view.stopNestedScroll();
    }
}
