package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z20 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ a30 e;

    public z20(a30 a30Var) {
        this.e = a30Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.e.d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        a30 a30Var = this.e;
        a30Var.f.a.clear();
        ig2 ig2Var = a30Var.g;
        synchronized (ig2Var) {
            ig2Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        a30 a30Var = this.e;
        a30Var.f.a.clear();
        ig2 ig2Var = a30Var.g;
        synchronized (ig2Var) {
            ig2Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.e.s.c.setValue(Boolean.valueOf(z));
    }
}
