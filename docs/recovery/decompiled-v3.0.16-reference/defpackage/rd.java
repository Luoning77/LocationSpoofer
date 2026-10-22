package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rd implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rd(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.e) {
            case 0:
                sd sdVar = (sd) this.f;
                Context context = view.getContext();
                if (!sdVar.d) {
                    context.getApplicationContext().registerComponentCallbacks(sdVar.e);
                    sdVar.d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                sd sdVar = (sd) obj;
                Context context = view.getContext();
                if (sdVar.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(sdVar.e);
                    sdVar.d = false;
                }
                break;
            case 1:
                iw iwVar = (iw) obj;
                ViewTreeObserver viewTreeObserver = iwVar.B;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        iwVar.B = view.getViewTreeObserver();
                    }
                    iwVar.B.removeGlobalOnLayoutListener(iwVar.m);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                k03 k03Var = (k03) obj;
                ViewTreeObserver viewTreeObserver2 = k03Var.s;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        k03Var.s = view.getViewTreeObserver();
                    }
                    k03Var.s.removeGlobalOnLayoutListener(k03Var.m);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                y yVar = (y) obj;
                for (Object obj2 : xs2.Q(dj3.e, yVar.getParent())) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(2131230842);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                yVar.e();
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
