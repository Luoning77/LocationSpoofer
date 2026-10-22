package defpackage;

import android.os.Build;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class na implements Runnable {
    public final /* synthetic */ int e;

    public /* synthetic */ na(dm dmVar, int i) {
        this.e = 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                sx1 sx1Var = db.U0;
                synchronized (sx1Var) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        Object[] objArr = sx1Var.a;
                        int i2 = sx1Var.b;
                        int i3 = 0;
                        if (i < 30) {
                            while (i3 < i2) {
                                db dbVar = (db) objArr[i3];
                                boolean showLayoutBounds = dbVar.getShowLayoutBounds();
                                Class cls = db.R0;
                                dbVar.setShowLayoutBounds(ji2.G());
                                if (showLayoutBounds != dbVar.getShowLayoutBounds()) {
                                    dbVar.post(new la(dbVar, 2));
                                }
                                i3++;
                            }
                        } else {
                            while (i3 < i2) {
                                db dbVar2 = (db) objArr[i3];
                                dbVar2.post(new la(dbVar2, 3));
                                i3++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                HookStatus.scheduleWrite$lambda$7();
                return;
            default:
                return;
        }
    }

    public /* synthetic */ na(int i) {
        this.e = i;
    }

    private final void a() {
    }
}
