package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class nl3 {
    public static final ql3 b;
    public final ql3 a;

    static {
        fl3 cl3Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            cl3Var = new el3();
        } else if (i >= 30) {
            cl3Var = new dl3();
        } else {
            cl3Var = i >= 29 ? new cl3() : new bl3();
        }
        b = cl3Var.b().a.a().a.b().a.c();
    }

    public nl3(ql3 ql3Var) {
        this.a = ql3Var;
    }

    public ql3 a() {
        return this.a;
    }

    public ql3 b() {
        return this.a;
    }

    public ql3 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl3)) {
            return false;
        }
        nl3 nl3Var = (nl3) obj;
        return p() == nl3Var.p() && o() == nl3Var.o() && Objects.equals(l(), nl3Var.l()) && Objects.equals(j(), nl3Var.j()) && Objects.equals(f(), nl3Var.f());
    }

    public bd0 f() {
        return null;
    }

    public j31 g(int i) {
        return j31.e;
    }

    public j31 h(int i) {
        if ((i & 8) == 0) {
            return j31.e;
        }
        fo.i("Unable to query the maximum insets for IME");
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public j31 i() {
        return l();
    }

    public j31 j() {
        return j31.e;
    }

    public j31 k() {
        return l();
    }

    public j31 l() {
        return j31.e;
    }

    public j31 m() {
        return l();
    }

    public ql3 n(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void e(ql3 ql3Var) {
    }

    public void r(j31[] j31VarArr) {
    }

    public void s(j31 j31Var) {
    }

    public void t(ql3 ql3Var) {
    }

    public void u(j31 j31Var) {
    }

    public void v(int i) {
    }
}
