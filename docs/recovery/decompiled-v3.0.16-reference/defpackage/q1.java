package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.RuntimeShader;
import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.os.Bundle;
import android.text.StaticLayout;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class q1 {
    public static final pf a(String str) {
        str.getClass();
        return new pf(new RuntimeShader(str));
    }

    public static PackageInfo b(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object c(String str, Bundle bundle) {
        return bundle.getParcelable(str, r7.class);
    }

    public static String d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final boolean e() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void g(ya2 ya2Var, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = ya2Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static final void h(ya2 ya2Var, rj rjVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (rjVar == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = ya2Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(rjVar);
    }

    public static final void i(CursorAnchorInfo.Builder builder, pe2 pe2Var) {
        builder.setEditorBoundsInfo(m1.f().setEditorBounds(vd0.I(pe2Var)).setHandwritingBounds(vd0.I(pe2Var)).build());
    }

    public static final void j(CursorAnchorInfo.Builder builder, pe2 pe2Var) {
        builder.setEditorBoundsInfo(m1.f().setEditorBounds(vd0.I(pe2Var)).setHandwritingBounds(vd0.I(pe2Var)).build());
    }

    public static final void k(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }
}
