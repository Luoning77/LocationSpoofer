package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class la implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ db f;

    public /* synthetic */ la(db dbVar, int i) {
        this.e = i;
        this.f = dbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        db dbVar = this.f;
        switch (i) {
            case 0:
                mo moVar = dbVar.m;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!moVar.isEmpty()) {
                    try {
                        ((au0) moVar.removeLast()).invoke();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            case 1:
                dbVar.I0 = false;
                MotionEvent motionEvent = dbVar.A0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    dbVar.G(motionEvent);
                    return;
                } else {
                    fo.n("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                db.j(dbVar.getRoot());
                return;
            default:
                db.j(dbVar.getRoot());
                return;
        }
    }
}
