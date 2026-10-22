package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class gt1 {
    public final Context a;
    public final ms1 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public ot1 h;
    public dt1 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final et1 k = new et1(this);

    public gt1(Context context, ms1 ms1Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = ms1Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final dt1 a() {
        dt1 k03Var = this.i;
        if (k03Var == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            ft1.a(defaultDisplay, point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131099670);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                k03Var = new iw(context2, this.e, this.d, this.c);
            } else {
                k03Var = new k03(context2, this.b, this.e, this.d, this.c);
            }
            k03Var.l(this.b);
            k03Var.r(this.k);
            k03Var.n(this.e);
            k03Var.e(this.h);
            k03Var.o(this.g);
            k03Var.p(this.f);
            this.i = k03Var;
        }
        return k03Var;
    }

    public final boolean b() {
        dt1 dt1Var = this.i;
        return dt1Var != null && dt1Var.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        dt1 dt1VarA = a();
        dt1VarA.s(z2);
        if (z) {
            int i3 = this.f;
            View view = this.e;
            WeakHashMap weakHashMap = yi3.a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            dt1VarA.q(i);
            dt1VarA.t(i2);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            dt1VarA.e = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        dt1VarA.c();
    }
}
