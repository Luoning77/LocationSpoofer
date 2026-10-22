package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pg implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ qg e;

    public pg(qg qgVar) {
        this.e = qgVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.e.f.removeCallbacks(this);
        this.e.F();
        qg qgVar = this.e;
        synchronized (qgVar.g) {
            if (qgVar.l) {
                qgVar.l = false;
                ArrayList arrayList = qgVar.i;
                qgVar.i = qgVar.j;
                qgVar.j = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.F();
        qg qgVar = this.e;
        synchronized (qgVar.g) {
            if (qgVar.i.isEmpty()) {
                qgVar.e.removeFrameCallback(this);
                qgVar.l = false;
            }
        }
    }
}
