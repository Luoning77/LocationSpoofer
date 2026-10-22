package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s12 implements OnBackAnimationCallback {
    public final /* synthetic */ lu0 a;
    public final /* synthetic */ lu0 b;
    public final /* synthetic */ au0 c;
    public final /* synthetic */ au0 d;

    public s12(lu0 lu0Var, lu0 lu0Var2, au0 au0Var, au0 au0Var2) {
        this.a = lu0Var;
        this.b = lu0Var2;
        this.c = au0Var;
        this.d = au0Var2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new yp(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new yp(backEvent));
    }
}
