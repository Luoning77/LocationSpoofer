package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.AtomicFile;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.vincenthzr.locationspoofer.data.cloud.ClientInfoCollector;
import com.vincenthzr.locationspoofer.data.cloud.EncryptedCloudSessionStore;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager;
import com.vincenthzr.locationspoofer.data.db.AppDatabase_Impl;
import com.vincenthzr.locationspoofer.data.model.GaitRecordingState;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationDelivery;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationDelivery$install$14$1;
import com.vincenthzr.locationspoofer.xposed.hooks.network.ConnectivityHookerKt;
import java.util.concurrent.Callable;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class hd implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hd(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        boolean z = true;
        q60 q60Var = null;
        boolean z2 = false;
        mf3 mf3Var = mf3.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                return (bj2) obj;
            case 1:
                ig0.z((of) obj);
                return mf3Var;
            case 2:
                return ((y53) obj).V0();
            case 3:
                return zm3.y((Object[]) obj);
            case 4:
                return (dj) obj;
            case Logger.WARN /* 5 */:
                return (pe2) obj;
            case Logger.ERROR /* 6 */:
                return ClientInfoCollector.collect$lambda$12((PackageInfo) obj);
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return ((d31) obj).c(":memory:");
            case 8:
                return ConnectivityHookerKt.hookConnectivityLayer$lambda$0((ClassLoader) obj);
            case mc0.b /* 9 */:
                return Boolean.valueOf(RuntimeAuthorizationManager.isAuthorized$default((RuntimeAuthorizationManager) ((kn2) obj).a(xe2.a(RuntimeAuthorizationManager.class), null), null, 1, null));
            case mc0.c /* 10 */:
                return ((me1) obj).d();
            case 11:
                return new r73((x32) obj, 0.0f);
            case mc0.d /* 12 */:
                ((k63) obj).close();
                return mf3Var;
            case 13:
                ((cg0) obj).r1();
                return mf3Var;
            case 14:
                return EncryptedCloudSessionStore.diagnostics_delegate$lambda$8$lambda$6((AtomicFile) obj);
            case a83.e /* 15 */:
                return FrameworkLocationDelivery$install$14$1.run$lambda$0((FrameworkLocationDelivery) obj);
            case 16:
                wt0 wt0Var = (wt0) obj;
                Context context = wt0Var.e;
                String str = wt0Var.f;
                t1 t1Var = new t1(23, z2);
                t1Var.f = null;
                vt0 vt0Var = new vt0(context, str, t1Var, wt0Var.g);
                vt0Var.setWriteAheadLoggingEnabled(wt0Var.i);
                return vt0Var;
            case 17:
                return Float.valueOf(gh0.A(((CoroutineScope) obj).getCoroutineContext()));
            case 18:
                Object systemService = ((View) ((d31) obj).f).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 19:
                z41 z41Var = (z41) obj;
                BuildersKt__Builders_commonKt.launch$default(z41Var.a, null, null, new y41(z41Var, q60Var, 2), 3, null);
                return mf3Var;
            case 20:
                AppDatabase_Impl appDatabase_Impl = ((a61) obj).a;
                if (appDatabase_Impl.inCompatibilityMode() && !appDatabase_Impl.isOpenInternal$room_runtime()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                return Integer.valueOf(((yd1) obj).h().n);
            case 22:
                return new BaseInputConnection(((ne1) obj).a, false);
            case 23:
                ((s52) obj).h(0.0f);
                return mf3Var;
            case 24:
                ((lo1) obj).e();
                return mf3Var;
            case 25:
                return new td0(gh0.E(24.0f, 16.0f, ((g73) obj).invoke()));
            case 26:
                f62 f62Var = (f62) obj;
                return f62Var.e.c(f62Var.f);
            case 27:
                ((Runnable) obj).run();
                return mf3Var;
            case 28:
                return ((Callable) obj).call();
            default:
                return Float.valueOf(((GaitRecordingState.Recording) obj).getProgress());
        }
    }
}
