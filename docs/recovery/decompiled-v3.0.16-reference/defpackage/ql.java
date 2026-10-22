package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ql implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ql(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                bm bmVar = (bm) obj;
                if (!bmVar.getInternalPopup().a()) {
                    bmVar.j.m(sl.b(bmVar), sl.a(bmVar));
                }
                ViewTreeObserver viewTreeObserver = bmVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    rl.a(viewTreeObserver, this);
                }
                break;
            case 1:
                yl ylVar = (yl) obj;
                bm bmVar2 = ylVar.J;
                WeakHashMap weakHashMap = yi3.a;
                if (bmVar2.isAttachedToWindow() && bmVar2.getGlobalVisibleRect(ylVar.H)) {
                    ylVar.s();
                    ylVar.c();
                } else {
                    ylVar.dismiss();
                }
                break;
            case 2:
                iw iwVar = (iw) obj;
                ArrayList arrayList = iwVar.l;
                if (iwVar.a() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((hw) arrayList.get(0)).a.B) {
                        View view = iwVar.s;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((hw) obj2).a.c();
                            }
                        } else {
                            iwVar.dismiss();
                        }
                    }
                    break;
                }
                break;
            default:
                k03 k03Var = (k03) obj;
                lt1 lt1Var = k03Var.l;
                if (k03Var.a() && !lt1Var.B) {
                    View view2 = k03Var.q;
                    if (view2 != null && view2.isShown()) {
                        lt1Var.c();
                    } else {
                        k03Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
