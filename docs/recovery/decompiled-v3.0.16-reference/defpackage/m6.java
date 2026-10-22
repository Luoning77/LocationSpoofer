package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.GaitRecordingState;
import com.vincenthzr.locationspoofer.data.model.RoutePlanStage;
import com.vincenthzr.locationspoofer.data.model.RouteRunMode;
import com.vincenthzr.locationspoofer.data.repository.SettingsRepository;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class m6 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ul1 f;

    public /* synthetic */ m6(ul1 ul1Var, int i) {
        this.e = i;
        this.f = ul1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        AppState appStateCopy$default;
        int i = this.e;
        q60 q60Var = null;
        int i2 = 0;
        mf3 mf3Var = mf3.a;
        ul1 ul1Var = this.f;
        switch (i) {
            case 0:
                ul1Var.getClass();
                ul1Var.b.requestRuntimeStop(ul1Var.j);
                return mf3Var;
            case 1:
                am1.U(ul1Var, false);
                return mf3Var;
            case 2:
                am1.U(ul1Var, true);
                return mf3Var;
            case 3:
                ul1Var.getClass();
                ul1Var.E = null;
                MutableStateFlow mutableStateFlow = ul1Var.x;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 33554431, null)));
                rm1.a(ul1Var);
                return mf3Var;
            case 4:
                on1.j(ul1Var);
                return mf3Var;
            case Logger.WARN /* 5 */:
                ul1Var.getClass();
                ul1Var.b.requestRuntimeStop(ul1Var.j);
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ul1Var.c.setSpoofingActive(false);
                Job job = ul1Var.r;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                ul1Var.i.onStopped();
                MutableStateFlow mutableStateFlow2 = ul1Var.x;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, AppState.copy$default((AppState) value2, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.IDLE, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1610612737, -524801, 134217727, null)));
                return ul1Var.t.stop(new in1(ul1Var, q60Var, i2));
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ul1Var.getClass();
                MutableStateFlow mutableStateFlow3 = ul1Var.x;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -4194305, -1, 134217727, null)));
                return mf3Var;
            case 8:
                ul1Var.getClass();
                MutableStateFlow mutableStateFlow4 = ul1Var.x;
                do {
                    value4 = mutableStateFlow4.getValue();
                } while (!mutableStateFlow4.compareAndSet(value4, AppState.copy$default((AppState) value4, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -16777217, -1, 134217727, null)));
                return mf3Var;
            case mc0.b /* 9 */:
                vm1.a(ul1Var);
                return mf3Var;
            case mc0.c /* 10 */:
                vm1.c(ul1Var);
                return mf3Var;
            case 11:
                ul1Var.getClass();
                MutableStateFlow mutableStateFlow5 = ul1Var.x;
                do {
                    value5 = mutableStateFlow5.getValue();
                } while (!mutableStateFlow5.compareAndSet(value5, AppState.copy$default((AppState) value5, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, GaitRecordingState.Idle.INSTANCE, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -524289, -1, 134217727, null)));
                return mf3Var;
            case mc0.d /* 12 */:
                vm1.c(ul1Var);
                return mf3Var;
            case 13:
                ul1Var.getClass();
                SettingsRepository settingsRepository = ul1Var.c;
                settingsRepository.setGaitTemplate("");
                settingsRepository.setUseGaitTemplate(false);
                MutableStateFlow mutableStateFlow6 = ul1Var.x;
                do {
                    value6 = mutableStateFlow6.getValue();
                } while (!mutableStateFlow6.compareAndSet(value6, AppState.copy$default((AppState) value6, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -458753, -1, 134217727, null)));
                return mf3Var;
            case 14:
                ul1Var.getClass();
                ul1Var.b.requestRuntimeStop(ul1Var.j);
                MutableStateFlow mutableStateFlow7 = ul1Var.x;
                do {
                    value7 = mutableStateFlow7.getValue();
                } while (!mutableStateFlow7.compareAndSet(value7, AppState.copy$default((AppState) value7, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, uj0.e, RoutePlanStage.IDLE, RouteRunMode.LOOP, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1793, 134217727, null)));
                return mf3Var;
            case a83.e /* 15 */:
                ul1Var.getClass();
                MutableStateFlow mutableStateFlow8 = ul1Var.x;
                if (((AppState) mutableStateFlow8.getValue()).getRoutePoints().size() >= 2) {
                    do {
                        value8 = mutableStateFlow8.getValue();
                    } while (!mutableStateFlow8.compareAndSet(value8, AppState.copy$default((AppState) value8, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.READY, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -513, 134217727, null)));
                }
                return mf3Var;
            case 16:
                an1.f(ul1Var);
                return mf3Var;
            case 17:
                ul1Var.getClass();
                MutableStateFlow mutableStateFlow9 = ul1Var.x;
                do {
                    value9 = mutableStateFlow9.getValue();
                    appStateCopy$default = (AppState) value9;
                    if (!appStateCopy$default.getRoutePoints().isEmpty()) {
                        appStateCopy$default = AppState.copy$default(appStateCopy$default, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, zy.j0(appStateCopy$default.getRoutePoints()), null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -257, 134217727, null);
                    }
                } while (!mutableStateFlow9.compareAndSet(value9, appStateCopy$default));
                return mf3Var;
            case 18:
                an1.f(ul1Var);
                return mf3Var;
            case 19:
                ul1Var.getClass();
                MutableStateFlow mutableStateFlow10 = ul1Var.x;
                List<AppInfoItem> installedAppsForSystemHook = ((AppState) mutableStateFlow10.getValue()).getInstalledAppsForSystemHook();
                ArrayList arrayList = new ArrayList();
                for (Object obj : installedAppsForSystemHook) {
                    if (!((AppInfoItem) obj).isSystem()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(az.Y(arrayList, 10));
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    arrayList2.add(((AppInfoItem) obj2).getPackageName());
                }
                LinkedHashSet linkedHashSetN = pt2.N(((AppState) mutableStateFlow10.getValue()).getSystemHookPackages(), zy.N0(arrayList2));
                ul1Var.c.setSystemHookPackages(linkedHashSetN);
                while (true) {
                    Object value10 = mutableStateFlow10.getValue();
                    LinkedHashSet linkedHashSet = linkedHashSetN;
                    if (mutableStateFlow10.compareAndSet(value10, AppState.copy$default((AppState) value10, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, linkedHashSet, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134217663, null))) {
                        if (((AppState) mutableStateFlow10.getValue()).isSpoofingActive()) {
                            BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), null, null, new sl1(ul1Var, q60Var, 12), 3, null);
                        }
                        return mf3Var;
                    }
                    linkedHashSetN = linkedHashSet;
                }
                break;
            default:
                ul1Var.getClass();
                SettingsRepository settingsRepository2 = ul1Var.c;
                zj0 zj0Var = zj0.e;
                settingsRepository2.setSystemHookPackages(zj0Var);
                MutableStateFlow mutableStateFlow11 = ul1Var.x;
                while (true) {
                    Object value11 = mutableStateFlow11.getValue();
                    zj0 zj0Var2 = zj0Var;
                    if (mutableStateFlow11.compareAndSet(value11, AppState.copy$default((AppState) value11, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, zj0Var2, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134217663, null))) {
                        if (((AppState) mutableStateFlow11.getValue()).isSpoofingActive()) {
                            BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), null, null, new sl1(ul1Var, q60Var, 5), 3, null);
                        }
                        return mf3Var;
                    }
                    zj0Var = zj0Var2;
                }
                break;
        }
    }
}
