package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.GaitRecordingState;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONException;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class qi1 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ul1 f;

    public /* synthetic */ qi1(ul1 ul1Var, int i) {
        this.e = i;
        this.f = ul1Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) throws JSONException {
        Object value;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ul1 ul1Var = this.f;
        switch (i) {
            case 0:
                pz2 pz2Var = (pz2) obj;
                pz2Var.getClass();
                hn1.b(ul1Var, pz2Var);
                return mf3Var;
            case 1:
                SavedLocation savedLocation = (SavedLocation) obj;
                savedLocation.getClass();
                an1.d(ul1Var, savedLocation);
                return mf3Var;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                MutableStateFlow mutableStateFlow = ul1Var.x;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, new GaitRecordingState.Recording(fFloatValue), false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -524289, -1, 134217727, null)));
                return mf3Var;
            case 3:
                ((JSONObject) obj).put("app_coordinate_systems", new JSONObject(((AppState) ul1Var.x.getValue()).getAppCoordinateSystems()));
                return mf3Var;
            case 4:
                ((JSONObject) obj).put("app_coordinate_systems", new JSONObject(((AppState) ul1Var.x.getValue()).getAppCoordinateSystems()));
                return mf3Var;
            case Logger.WARN /* 5 */:
                ((JSONObject) obj).put("app_coordinate_systems", new JSONObject(((AppState) ul1Var.x.getValue()).getAppCoordinateSystems()));
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ((JSONObject) obj).put("app_coordinate_systems", new JSONObject(((AppState) ul1Var.x.getValue()).getAppCoordinateSystems()));
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ((ed0) obj).getClass();
                return new h8(ul1Var, 12);
            case 8:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ul1Var.getClass();
                ul1Var.c.setUseGaitTemplate(zBooleanValue);
                MutableStateFlow mutableStateFlow2 = ul1Var.x;
                while (true) {
                    Object value2 = mutableStateFlow2.getValue();
                    boolean z = zBooleanValue;
                    if (mutableStateFlow2.compareAndSet(value2, AppState.copy$default((AppState) value2, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, z, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -262145, -1, 134217727, null))) {
                        return mf3Var;
                    }
                    zBooleanValue = z;
                }
                break;
            case mc0.b /* 9 */:
                int iIntValue = ((Integer) obj).intValue();
                ul1Var.getClass();
                ul1Var.c.setRealismLevel(iIntValue);
                MutableStateFlow mutableStateFlow3 = ul1Var.x;
                while (true) {
                    Object value3 = mutableStateFlow3.getValue();
                    int i2 = iIntValue;
                    if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, i2, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -8193, -1, 134217727, null))) {
                        return mf3Var;
                    }
                    iIntValue = i2;
                }
                break;
            case mc0.c /* 10 */:
                int iIntValue2 = ((Integer) obj).intValue();
                ul1Var.getClass();
                int iV = mh0.v(iIntValue2, 0, 30);
                ul1Var.c.setSpeedFluctuationPct(iV);
                MutableStateFlow mutableStateFlow4 = ul1Var.x;
                while (true) {
                    Object value4 = mutableStateFlow4.getValue();
                    int i3 = iV;
                    if (mutableStateFlow4.compareAndSet(value4, AppState.copy$default((AppState) value4, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, i3, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -32769, -1, 134217727, null))) {
                        return mf3Var;
                    }
                    iV = i3;
                }
                break;
            case 11:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ul1Var.getClass();
                ul1Var.c.setBarometerFluctuation(zBooleanValue2);
                MutableStateFlow mutableStateFlow5 = ul1Var.x;
                while (true) {
                    Object value5 = mutableStateFlow5.getValue();
                    boolean z2 = zBooleanValue2;
                    if (mutableStateFlow5.compareAndSet(value5, AppState.copy$default((AppState) value5, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, z2, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -16385, -1, 134217727, null))) {
                        BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), null, null, new sl1(ul1Var, null, 3), 3, null);
                        return mf3Var;
                    }
                    zBooleanValue2 = z2;
                }
                break;
            case mc0.d /* 12 */:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                ul1Var.getClass();
                ul1Var.c.setSystemHookGlobalMode(zBooleanValue3);
                MutableStateFlow mutableStateFlow6 = ul1Var.x;
                while (true) {
                    Object value6 = mutableStateFlow6.getValue();
                    boolean z3 = zBooleanValue3;
                    if (mutableStateFlow6.compareAndSet(value6, AppState.copy$default((AppState) value6, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, z3, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134217599, null))) {
                        hn1.h(ul1Var);
                        return mf3Var;
                    }
                    zBooleanValue3 = z3;
                }
                break;
            default:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                ul1Var.getClass();
                ul1Var.c.setForceLocationEnabled(zBooleanValue4);
                MutableStateFlow mutableStateFlow7 = ul1Var.x;
                while (true) {
                    Object value7 = mutableStateFlow7.getValue();
                    boolean z4 = zBooleanValue4;
                    if (mutableStateFlow7.compareAndSet(value7, AppState.copy$default((AppState) value7, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, z4, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134217471, null))) {
                        hn1.h(ul1Var);
                        return mf3Var;
                    }
                    zBooleanValue4 = z4;
                }
                break;
        }
    }
}
