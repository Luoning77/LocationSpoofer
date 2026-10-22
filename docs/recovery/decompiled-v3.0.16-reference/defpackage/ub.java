package defpackage;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.LongSparseArray;
import androidx.activity.ComponentActivity;
import io.github.libxposed.service.RemotePreferences;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;
import org.maplibre.android.offline.OfflineManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ub implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ub(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                vb.b((yb) obj2, (LongSparseArray) obj);
                return;
            case 1:
                in inVar = (in) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    inVar.a();
                }
            case 2:
                ((ComponentActivity) obj2).addObserverForBackInvoker((x12) obj);
                return;
            case 3:
                HandlerContext.scheduleResumeAfterDelay$lambda$1((CancellableContinuation) obj2, (HandlerContext) obj);
                return;
            case 4:
                Runnable runnable = (Runnable) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                }
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case Logger.WARN /* 5 */:
                return;
            case Logger.ERROR /* 6 */:
                ((OfflineManager) obj2).a.deactivate();
                ((OfflineManager.FileSourceCallback) obj).onSuccess();
                return;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ((OfflineManager) obj2).a.deactivate();
                ((yr2) obj).onSuccess();
                return;
            case 8:
                ((RemotePreferences.Editor) obj2).lambda$apply$0((Bundle) obj);
                return;
            case mc0.b /* 9 */:
                ((dm) obj2).k((Typeface) obj);
                return;
            case mc0.c /* 10 */:
                in inVar2 = (in) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                    inVar2.a();
                }
            default:
                qm3 qm3Var = (qm3) obj2;
                xe1 xe1Var = (xe1) obj;
                if (qm3Var.g) {
                    return;
                }
                qm3Var.h = xe1Var;
                xe1Var.a(qm3Var);
                return;
        }
    }

    private final void a() {
    }
}
