package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class gl3 extends nl3 {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public j31[] d;
    public j31 e;
    public ql3 f;
    public j31 g;
    public int h;

    public gl3(ql3 ql3Var, gl3 gl3Var) {
        this(ql3Var, new WindowInsets(gl3Var.c));
    }

    private static void B() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    public static boolean C(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private j31 w(int i2, boolean z) {
        j31 j31VarA = j31.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                j31VarA = j31.a(j31VarA, x(i3, z));
            }
        }
        return j31VarA;
    }

    private j31 y() {
        ql3 ql3Var = this.f;
        return ql3Var != null ? ql3Var.a.j() : j31.e;
    }

    private j31 z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            b81.s("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!i) {
            B();
        }
        Method method = j;
        if (method != null && k != null && l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(objInvoke));
                if (rect != null) {
                    return j31.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    public boolean A(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !x(i2, false).equals(j31.e);
    }

    @Override // defpackage.nl3
    public void d(View view) {
        j31 j31VarZ = z(view);
        if (j31VarZ == null) {
            j31VarZ = j31.e;
        }
        s(j31VarZ);
    }

    @Override // defpackage.nl3
    public void e(ql3 ql3Var) {
        ql3Var.a.t(this.f);
        j31 j31Var = this.g;
        nl3 nl3Var = ql3Var.a;
        nl3Var.s(j31Var);
        nl3Var.v(this.h);
    }

    @Override // defpackage.nl3
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        gl3 gl3Var = (gl3) obj;
        return Objects.equals(this.g, gl3Var.g) && C(this.h, gl3Var.h);
    }

    @Override // defpackage.nl3
    public j31 g(int i2) {
        return w(i2, false);
    }

    @Override // defpackage.nl3
    public j31 h(int i2) {
        return w(i2, true);
    }

    @Override // defpackage.nl3
    public final j31 l() {
        j31 j31Var = this.e;
        if (j31Var != null) {
            return j31Var;
        }
        WindowInsets windowInsets = this.c;
        j31 j31VarB = j31.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = j31VarB;
        return j31VarB;
    }

    @Override // defpackage.nl3
    public ql3 n(int i2, int i3, int i4, int i5) {
        fl3 cl3Var;
        ql3 ql3VarC = ql3.c(this.c, null);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            cl3Var = new el3(ql3VarC);
        } else if (i6 >= 30) {
            cl3Var = new dl3(ql3VarC);
        } else {
            cl3Var = i6 >= 29 ? new cl3(ql3VarC) : new bl3(ql3VarC);
        }
        cl3Var.g(ql3.a(l(), i2, i3, i4, i5));
        cl3Var.e(ql3.a(j(), i2, i3, i4, i5));
        return cl3Var.b();
    }

    @Override // defpackage.nl3
    public boolean p() {
        return this.c.isRound();
    }

    @Override // defpackage.nl3
    public boolean q(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !A(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.nl3
    public void r(j31[] j31VarArr) {
        this.d = j31VarArr;
    }

    @Override // defpackage.nl3
    public void s(j31 j31Var) {
        this.g = j31Var;
    }

    @Override // defpackage.nl3
    public void t(ql3 ql3Var) {
        this.f = ql3Var;
    }

    @Override // defpackage.nl3
    public void v(int i2) {
        this.h = i2;
    }

    public j31 x(int i2, boolean z) {
        j31 j31VarJ;
        int i3;
        j31 j31Var = j31.e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    j31[] j31VarArr = this.d;
                    j31VarJ = j31VarArr != null ? j31VarArr[x63.d(8)] : null;
                    if (j31VarJ != null) {
                        return j31VarJ;
                    }
                    j31 j31VarL = l();
                    j31 j31VarY = y();
                    int i4 = j31VarL.d;
                    if (i4 > j31VarY.d) {
                        return j31.b(0, 0, 0, i4);
                    }
                    j31 j31Var2 = this.g;
                    if (j31Var2 != null && !j31Var2.equals(j31Var) && (i3 = this.g.d) > j31VarY.d) {
                        return j31.b(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return k();
                    }
                    if (i2 == 32) {
                        return i();
                    }
                    if (i2 == 64) {
                        return m();
                    }
                    if (i2 == 128) {
                        ql3 ql3Var = this.f;
                        bd0 bd0VarF = ql3Var != null ? ql3Var.a.f() : f();
                        if (bd0VarF != null) {
                            int i5 = Build.VERSION.SDK_INT;
                            return j31.b(i5 >= 28 ? ad0.g(bd0VarF.a) : 0, i5 >= 28 ? ad0.i(bd0VarF.a) : 0, i5 >= 28 ? ad0.h(bd0VarF.a) : 0, i5 >= 28 ? ad0.f(bd0VarF.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    j31 j31VarY2 = y();
                    j31 j31VarJ2 = j();
                    return j31.b(Math.max(j31VarY2.a, j31VarJ2.a), 0, Math.max(j31VarY2.c, j31VarJ2.c), Math.max(j31VarY2.d, j31VarJ2.d));
                }
                if ((this.h & 2) == 0) {
                    j31 j31VarL2 = l();
                    ql3 ql3Var2 = this.f;
                    j31VarJ = ql3Var2 != null ? ql3Var2.a.j() : null;
                    int iMin = j31VarL2.d;
                    if (j31VarJ != null) {
                        iMin = Math.min(iMin, j31VarJ.d);
                    }
                    return j31.b(j31VarL2.a, 0, j31VarL2.c, iMin);
                }
            }
        } else {
            if (z) {
                return j31.b(0, Math.max(y().b, l().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return j31.b(0, l().b, 0, 0);
            }
        }
        return j31Var;
    }

    public gl3(ql3 ql3Var, WindowInsets windowInsets) {
        super(ql3Var);
        this.e = null;
        this.c = windowInsets;
    }
}
