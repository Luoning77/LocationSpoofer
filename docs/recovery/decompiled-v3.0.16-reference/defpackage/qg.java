package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qg extends CoroutineDispatcher {
    public static final i43 o = new i43(c8.r);
    public static final og p = new og(0);
    public final Choreographer e;
    public final Handler f;
    public boolean k;
    public boolean l;
    public final sg n;
    public final Object g = new Object();
    public final mo h = new mo();
    public ArrayList i = new ArrayList();
    public ArrayList j = new ArrayList();
    public final pg m = new pg(this);

    public qg(Choreographer choreographer, Handler handler) {
        this.e = choreographer;
        this.f = handler;
        this.n = new sg(choreographer, this);
    }

    public final void F() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.g) {
                mo moVar = this.h;
                runnable = (Runnable) (moVar.isEmpty() ? null : moVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.g) {
                    mo moVar2 = this.h;
                    runnable = (Runnable) (moVar2.isEmpty() ? null : moVar2.removeFirst());
                }
            }
            synchronized (this.g) {
                if (this.h.isEmpty()) {
                    z = false;
                    this.k = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo90dispatch(y70 y70Var, Runnable runnable) {
        synchronized (this.g) {
            this.h.addLast(runnable);
            if (!this.k) {
                this.k = true;
                this.f.post(this.m);
                if (!this.l) {
                    this.l = true;
                    this.e.postFrameCallback(this.m);
                }
            }
        }
    }
}
