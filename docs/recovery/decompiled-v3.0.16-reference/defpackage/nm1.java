package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.EnvironmentAvailabilityKt;
import com.vincenthzr.locationspoofer.data.model.WifiLoadStatus;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nm1 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ double g;
    public final /* synthetic */ double h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nm1(ul1 ul1Var, double d, double d2, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.f = ul1Var;
        this.g = d;
        this.h = d2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new nm1(this.f, this.g, this.h, q60Var, 0);
            case 1:
                return new nm1(this.f, this.g, this.h, q60Var, 1);
            case 2:
                return new nm1(this.f, this.g, this.h, q60Var, 2);
            default:
                return new nm1(this.f, this.g, this.h, q60Var, 3);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                ((nm1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case 1:
                ((nm1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            case 2:
                ((nm1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            default:
                ((nm1) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
        }
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Object value;
        AppState appStateCopy$default;
        Object value2;
        AppState appStateCopy$default2;
        Object value3;
        AppState appStateCopy$default3;
        Object value4;
        AppState appStateCopy$default4;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        double d = this.h;
        double d2 = this.g;
        ul1 ul1Var = this.f;
        switch (i) {
            case 0:
                ee0.J(obj);
                MutableStateFlow mutableStateFlow = ul1Var.x;
                do {
                    value = mutableStateFlow.getValue();
                    appStateCopy$default = (AppState) value;
                    if (EnvironmentAvailabilityKt.isEnvironmentPoint(appStateCopy$default, d2, d)) {
                        appStateCopy$default = AppState.copy$default(appStateCopy$default, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, WifiLoadStatus.LOADING, new i52(new Double(d2), new Double(d)), 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, Integer.MAX_VALUE, -2, 134217727, null);
                    }
                } while (!mutableStateFlow.compareAndSet(value, appStateCopy$default));
                break;
            case 1:
                ee0.J(obj);
                MutableStateFlow mutableStateFlow2 = ul1Var.x;
                do {
                    value2 = mutableStateFlow2.getValue();
                    appStateCopy$default2 = (AppState) value2;
                    if (EnvironmentAvailabilityKt.isEnvironmentPoint(appStateCopy$default2, d2, d)) {
                        appStateCopy$default2 = AppState.copy$default(EnvironmentAvailabilityKt.withEnvironmentData(appStateCopy$default2, "{}", appStateCopy$default2.getCollectedCellJson(), appStateCopy$default2.getCollectedBluetoothJson()), null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, WifiLoadStatus.EMPTY, new i52(new Double(d2), new Double(d)), 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, Integer.MAX_VALUE, -2, 134217727, null);
                    }
                } while (!mutableStateFlow2.compareAndSet(value2, appStateCopy$default2));
                break;
            case 2:
                ee0.J(obj);
                MutableStateFlow mutableStateFlow3 = ul1Var.x;
                do {
                    value3 = mutableStateFlow3.getValue();
                    appStateCopy$default3 = (AppState) value3;
                    if (EnvironmentAvailabilityKt.isEnvironmentPoint(appStateCopy$default3, d2, d) && appStateCopy$default3.getWifiLoadStatus() == WifiLoadStatus.LOADING) {
                        appStateCopy$default3 = AppState.copy$default(appStateCopy$default3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, WifiLoadStatus.IDLE, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, Integer.MAX_VALUE, -2, 134217727, null);
                    }
                } while (!mutableStateFlow3.compareAndSet(value3, appStateCopy$default3));
                break;
            default:
                ee0.J(obj);
                MutableStateFlow mutableStateFlow4 = ul1Var.x;
                do {
                    value4 = mutableStateFlow4.getValue();
                    appStateCopy$default4 = (AppState) value4;
                    if (EnvironmentAvailabilityKt.isEnvironmentPoint(appStateCopy$default4, d2, d)) {
                        appStateCopy$default4 = AppState.copy$default(EnvironmentAvailabilityKt.withEnvironmentData(appStateCopy$default4, "{}", appStateCopy$default4.getCollectedCellJson(), appStateCopy$default4.getCollectedBluetoothJson()), null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, WifiLoadStatus.ERROR, new i52(new Double(d2), new Double(d)), 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, Integer.MAX_VALUE, -2, 134217727, null);
                    }
                } while (!mutableStateFlow4.compareAndSet(value4, appStateCopy$default4));
                break;
        }
        return mf3Var;
    }
}
