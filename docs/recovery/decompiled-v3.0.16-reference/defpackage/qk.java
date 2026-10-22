package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qk implements n12, w50, ot1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ zk f;

    public /* synthetic */ qk(zk zkVar, int i) {
        this.e = i;
        this.f = zkVar;
    }

    @Override // defpackage.ot1
    public void b(ms1 ms1Var, boolean z) {
        yk ykVar;
        int i = this.e;
        zk zkVar = this.f;
        switch (i) {
            case 2:
                zkVar.w(ms1Var);
                break;
            default:
                ms1 ms1VarK = ms1Var.k();
                int i2 = 0;
                boolean z2 = ms1VarK != ms1Var;
                if (z2) {
                    ms1Var = ms1VarK;
                }
                yk[] ykVarArr = zkVar.P;
                int length = ykVarArr != null ? ykVarArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        ykVar = null;
                    } else {
                        ykVar = ykVarArr[i2];
                        if (ykVar == null || ykVar.h != ms1Var) {
                            i2++;
                        }
                    }
                }
                if (ykVar != null) {
                    if (!z2) {
                        zkVar.x(ykVar, z);
                    } else {
                        zkVar.v(ykVar.a, ykVar, ms1VarK);
                        zkVar.x(ykVar, true);
                    }
                }
                break;
        }
    }

    @Override // defpackage.n12
    public ql3 g(View view, ql3 ql3Var) {
        boolean z;
        ql3 ql3VarB;
        fl3 cl3Var;
        boolean z2;
        nl3 nl3Var = ql3Var.a;
        int i = nl3Var.l().b;
        zk zkVar = this.f;
        Context context = zkVar.o;
        int i2 = nl3Var.l().b;
        ActionBarContextView actionBarContextView = zkVar.z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zkVar.z.getLayoutParams();
            if (zkVar.z.isShown()) {
                if (zkVar.g0 == null) {
                    zkVar.g0 = new Rect();
                    zkVar.h0 = new Rect();
                }
                Rect rect = zkVar.g0;
                Rect rect2 = zkVar.h0;
                rect.set(nl3Var.l().a, nl3Var.l().b, nl3Var.l().c, nl3Var.l().d);
                ViewGroup viewGroup = zkVar.E;
                Method method = xj3.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup2 = zkVar.E;
                WeakHashMap weakHashMap = yi3.a;
                ql3 ql3VarA = si3.a(viewGroup2);
                int i6 = ql3VarA == null ? 0 : ql3VarA.a.l().a;
                int i7 = ql3VarA == null ? 0 : ql3VarA.a.l().c;
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || zkVar.G != null) {
                    View view2 = zkVar.G;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i8 = marginLayoutParams2.height;
                        int i9 = marginLayoutParams.topMargin;
                        if (i8 != i9 || marginLayoutParams2.leftMargin != i6 || marginLayoutParams2.rightMargin != i7) {
                            marginLayoutParams2.height = i9;
                            marginLayoutParams2.leftMargin = i6;
                            marginLayoutParams2.rightMargin = i7;
                            zkVar.G.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    zkVar.G = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i6;
                    layoutParams.rightMargin = i7;
                    zkVar.E.addView(zkVar.G, -1, layoutParams);
                }
                View view4 = zkVar.G;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = zkVar.G;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(2131034118) : context.getColor(2131034117));
                }
                if (!zkVar.L && z) {
                    i2 = 0;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            if (z2) {
                zkVar.z.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = zkVar.G;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (i != i2) {
            int i10 = nl3Var.l().a;
            int i11 = nl3Var.l().c;
            int i12 = nl3Var.l().d;
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 34) {
                cl3Var = new el3(ql3Var);
            } else if (i13 >= 30) {
                cl3Var = new dl3(ql3Var);
            } else {
                cl3Var = i13 >= 29 ? new cl3(ql3Var) : new bl3(ql3Var);
            }
            cl3Var.g(j31.b(i10, i2, i11, i12));
            ql3VarB = cl3Var.b();
        } else {
            ql3VarB = ql3Var;
        }
        WeakHashMap weakHashMap2 = yi3.a;
        WindowInsets windowInsetsB = ql3VarB.b();
        if (windowInsetsB == null) {
            return ql3VarB;
        }
        WindowInsets windowInsetsB2 = pi3.b(view, windowInsetsB);
        return !windowInsetsB2.equals(windowInsetsB) ? ql3.c(windowInsetsB2, view) : ql3VarB;
    }

    @Override // defpackage.ot1
    public boolean o(ms1 ms1Var) {
        Window.Callback callback;
        int i = this.e;
        zk zkVar = this.f;
        switch (i) {
            case 2:
                Window.Callback callback2 = zkVar.p.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, ms1Var);
                }
                break;
            default:
                if (ms1Var == ms1Var.k() && zkVar.J && (callback = zkVar.p.getCallback()) != null && !zkVar.U) {
                    callback.onMenuOpened(108, ms1Var);
                }
                break;
        }
        return true;
    }
}
