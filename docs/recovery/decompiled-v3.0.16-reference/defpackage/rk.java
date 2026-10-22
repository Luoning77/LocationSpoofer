package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rk extends h73 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj3
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zk zkVar = ((pk) obj).f;
                zkVar.z.setAlpha(1.0f);
                zkVar.C.d(null);
                zkVar.C = null;
                break;
            case 1:
                zk zkVar2 = (zk) obj;
                zkVar2.z.setAlpha(1.0f);
                zkVar2.C.d(null);
                zkVar2.C = null;
                break;
            case 2:
                zk zkVar3 = (zk) ((d31) obj).g;
                zkVar3.z.setVisibility(8);
                PopupWindow popupWindow = zkVar3.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (zkVar3.z.getParent() instanceof View) {
                    View view = (View) zkVar3.z.getParent();
                    WeakHashMap weakHashMap = yi3.a;
                    pi3.c(view);
                }
                zkVar3.z.e();
                zkVar3.C.d(null);
                zkVar3.C = null;
                ViewGroup viewGroup = zkVar3.E;
                WeakHashMap weakHashMap2 = yi3.a;
                pi3.c(viewGroup);
                break;
            default:
                r00 r00Var = (r00) obj;
                r00Var.setLayerType(0, null);
                r00Var.setVisibility(4);
                r00Var.b();
                break;
        }
    }

    @Override // defpackage.h73, defpackage.uj3
    public void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((pk) obj).f.z.setVisibility(0);
                break;
            case 1:
                zk zkVar = (zk) obj;
                zkVar.z.setVisibility(0);
                if (zkVar.z.getParent() instanceof View) {
                    View view = (View) zkVar.z.getParent();
                    WeakHashMap weakHashMap = yi3.a;
                    pi3.c(view);
                }
                break;
        }
    }
}
