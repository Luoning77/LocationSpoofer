package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nk3 extends h73 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pk3 b;

    public /* synthetic */ nk3(pk3 pk3Var, int i) {
        this.a = i;
        this.b = pk3Var;
    }

    @Override // defpackage.uj3
    public final void a() {
        View view;
        int i = this.a;
        pk3 pk3Var = this.b;
        switch (i) {
            case 0:
                if (pk3Var.o && (view = pk3Var.g) != null) {
                    view.setTranslationY(0.0f);
                    pk3Var.d.setTranslationY(0.0f);
                }
                pk3Var.d.setVisibility(8);
                pk3Var.d.setTransitioning(false);
                pk3Var.s = null;
                d31 d31Var = pk3Var.k;
                if (d31Var != null) {
                    d31Var.g(pk3Var.j);
                    pk3Var.j = null;
                    pk3Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = pk3Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = yi3.a;
                    pi3.c(actionBarOverlayLayout);
                }
                break;
            default:
                pk3Var.s = null;
                pk3Var.d.requestLayout();
                break;
        }
    }
}
