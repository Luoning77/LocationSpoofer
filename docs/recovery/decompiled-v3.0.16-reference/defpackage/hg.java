package defpackage;

import android.hardware.SensorEvent;
import android.view.ActionMode;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.hooks.SensorStepHooker;
import com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;
import org.maplibre.android.offline.OfflineManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class hg implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ hg(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                jg jgVar = (jg) this.f;
                fg fgVar = (fg) this.g;
                gg ggVar = (gg) this.h;
                ActionMode actionModeStartActionMode = jgVar.a.startActionMode(new xo0(fgVar), 1);
                o51.f(jgVar.h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    ggVar.close();
                    return;
                }
                return;
            case 1:
                BluetoothScanDispatcherKt.deliverBleScanResults$lambda$41((LocationHooker) this.f, this.g, (ArrayList) this.h);
                return;
            case 2:
                zi0 zi0Var = (zi0) this.f;
                gh0 gh0Var = (gh0) this.g;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.h;
                try {
                    vq0 vq0VarM = am1.m(zi0Var.a);
                    if (vq0VarM == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    uq0 uq0Var = (uq0) vq0VarM.a;
                    synchronized (uq0Var.c) {
                        uq0Var.e = threadPoolExecutor;
                        break;
                    }
                    vq0VarM.a.a(new yi0(gh0Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    gh0Var.I(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 3:
                OfflineManager offlineManager = (OfflineManager) this.f;
                OfflineManager.FileSourceCallback fileSourceCallback = (OfflineManager.FileSourceCallback) this.g;
                String str = (String) this.h;
                offlineManager.a.deactivate();
                fileSourceCallback.onError(str);
                return;
            case 4:
                OfflineManager offlineManager2 = (OfflineManager) this.f;
                yr2 yr2Var = (yr2) this.g;
                String str2 = (String) this.h;
                offlineManager2.a.deactivate();
                yr2Var.b.onError(str2);
                return;
            default:
                SensorStepHooker.postSensorEvent$lambda$19((JSONObject) this.f, (SensorEvent) this.g, this.h);
                return;
        }
    }
}
