package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w6 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ ActionBarOverlayLayout f;

    public /* synthetic */ w6(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.e = i;
        this.f = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f;
        switch (i) {
            case 0:
                actionBarOverlayLayout.g();
                actionBarOverlayLayout.A = actionBarOverlayLayout.h.animate().translationY(0.0f).setListener(actionBarOverlayLayout.B);
                break;
            default:
                actionBarOverlayLayout.g();
                actionBarOverlayLayout.A = actionBarOverlayLayout.h.animate().translationY(-actionBarOverlayLayout.h.getHeight()).setListener(actionBarOverlayLayout.B);
                break;
        }
    }
}
