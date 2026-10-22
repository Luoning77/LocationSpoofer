package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ql3 {
    public static final ql3 b;
    public final nl3 a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = ml3.s;
        } else if (i >= 30) {
            b = ll3.r;
        } else {
            b = nl3.b;
        }
    }

    public ql3(ql3 ql3Var) {
        if (ql3Var == null) {
            this.a = new nl3(this);
            return;
        }
        nl3 nl3Var = ql3Var.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (nl3Var instanceof ml3)) {
            this.a = new ml3(this, (ml3) nl3Var);
        } else if (i >= 30 && (nl3Var instanceof ll3)) {
            this.a = new ll3(this, (ll3) nl3Var);
        } else if (i >= 29 && (nl3Var instanceof jl3)) {
            this.a = new jl3(this, (jl3) nl3Var);
        } else if (i >= 28 && (nl3Var instanceof il3)) {
            this.a = new il3(this, (il3) nl3Var);
        } else if (nl3Var instanceof hl3) {
            this.a = new hl3(this, (hl3) nl3Var);
        } else if (nl3Var instanceof gl3) {
            this.a = new gl3(this, (gl3) nl3Var);
        } else {
            this.a = new nl3(this);
        }
        nl3Var.e(this);
    }

    public static j31 a(j31 j31Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, j31Var.a - i);
        int iMax2 = Math.max(0, j31Var.b - i2);
        int iMax3 = Math.max(0, j31Var.c - i3);
        int iMax4 = Math.max(0, j31Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? j31Var : j31.b(iMax, iMax2, iMax3, iMax4);
    }

    public static ql3 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        ql3 ql3Var = new ql3(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = yi3.a;
            ql3 ql3VarA = si3.a(view);
            nl3 nl3Var = ql3Var.a;
            nl3Var.t(ql3VarA);
            nl3Var.d(view.getRootView());
            nl3Var.v(view.getWindowSystemUiVisibility());
        }
        return ql3Var;
    }

    public final WindowInsets b() {
        nl3 nl3Var = this.a;
        if (nl3Var instanceof gl3) {
            return ((gl3) nl3Var).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ql3) {
            return Objects.equals(this.a, ((ql3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        nl3 nl3Var = this.a;
        if (nl3Var == null) {
            return 0;
        }
        return nl3Var.hashCode();
    }

    public ql3(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new ml3(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new ll3(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new jl3(this, windowInsets);
        } else if (i >= 28) {
            this.a = new il3(this, windowInsets);
        } else {
            this.a = new hl3(this, windowInsets);
        }
    }
}
