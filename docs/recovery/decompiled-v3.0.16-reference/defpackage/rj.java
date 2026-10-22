package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class rj implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ au0 b;

    public /* synthetic */ rj(int i, au0 au0Var) {
        this.a = i;
        this.b = au0Var;
    }

    public final void onBackInvoked() {
        int i = this.a;
        au0 au0Var = this.b;
        switch (i) {
            case 0:
                if (au0Var != null) {
                    au0Var.invoke();
                }
                break;
            default:
                au0Var.invoke();
                break;
        }
    }
}
