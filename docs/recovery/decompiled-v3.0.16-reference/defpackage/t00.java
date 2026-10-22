package defpackage;

import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class t00 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ ComponentActivity f;

    public /* synthetic */ t00(ComponentActivity componentActivity, int i) {
        this.e = i;
        this.f = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        ComponentActivity componentActivity = this.f;
        switch (i) {
            case 0:
                ComponentActivity.menuHostHelper$lambda$0(componentActivity);
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!o51.f(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!o51.f(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
