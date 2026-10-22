package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class et1 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ gt1 e;

    public et1(gt1 gt1Var) {
        this.e = gt1Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.e.c();
    }
}
