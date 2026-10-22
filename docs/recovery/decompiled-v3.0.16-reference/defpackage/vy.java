package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class vy implements au0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ lr2 f;
    public final /* synthetic */ ul1 g;
    public final /* synthetic */ AppState h;

    public /* synthetic */ vy(lr2 lr2Var, ul1 ul1Var, AppState appState) {
        this.f = lr2Var;
        this.g = ul1Var;
        this.h = appState;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    @Override // defpackage.au0
    public final Object invoke() {
        Double dR;
        RoutePoint routePoint;
        Object value;
        AppState appState;
        bs2 bs2VarE;
        bs2 bs2VarE2;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Double dR2 = null;
        AppState appState2 = this.h;
        ul1 ul1Var = this.g;
        lr2 lr2Var = this.f;
        switch (i) {
            case 0:
                if (lr2Var == null) {
                    dR = r13.R(appState2.getLatitudeInput());
                } else {
                    bs2 bs2VarE3 = lr2Var.e();
                    dR = bs2VarE3 != null ? Double.valueOf(bs2VarE3.a) : null;
                    if (dR == null) {
                        dR = r13.R(appState2.getLatitudeInput());
                    }
                }
                if (lr2Var == null) {
                    dR2 = r13.R(appState2.getLongitudeInput());
                } else {
                    bs2 bs2VarE4 = lr2Var.e();
                    dR2 = bs2VarE4 != null ? Double.valueOf(bs2VarE4.b) : null;
                    if (dR2 == null) {
                        dR2 = r13.R(appState2.getLongitudeInput());
                    }
                }
                if (dR != null && dR2 != null) {
                    double dDoubleValue = dR.doubleValue();
                    double dDoubleValue2 = dR2.doubleValue();
                    ul1Var.getClass();
                    MutableStateFlow mutableStateFlow = ul1Var.x;
                    if (!((AppState) mutableStateFlow.getValue()).isContinuousScanning() && !((AppState) mutableStateFlow.getValue()).isStoppingCollection() && ((routePoint = (RoutePoint) zy.u0(((AppState) mutableStateFlow.getValue()).getCollectionRoutePoints())) == null || vd0.o(new z60(routePoint.getLat(), routePoint.getLng()), new z60(dDoubleValue, dDoubleValue2)) >= 2.0d)) {
                        do {
                            value = mutableStateFlow.getValue();
                            appState = (AppState) value;
                        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default(appState, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, zy.w0(appState.getCollectionRoutePoints(), new RoutePoint(dDoubleValue, dDoubleValue2, 0.0d, 4, (ca0) null)), null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1073741825, 134217727, null)));
                    }
                }
                break;
            default:
                Double dValueOf = (lr2Var == null || (bs2VarE2 = lr2Var.e()) == null) ? null : Double.valueOf(bs2VarE2.a);
                if (lr2Var != null && (bs2VarE = lr2Var.e()) != null) {
                    dR2 = Double.valueOf(bs2VarE.b);
                }
                if (dValueOf == null || dR2 == null) {
                    Double dR3 = r13.R(appState2.getLatitudeInput());
                    Double dR4 = r13.R(appState2.getLongitudeInput());
                    if (dR3 != null && dR4 != null) {
                        an1.a(ul1Var, dR3.doubleValue(), dR4.doubleValue());
                    }
                } else {
                    an1.a(ul1Var, dValueOf.doubleValue(), dR2.doubleValue());
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ vy(lr2 lr2Var, AppState appState, ul1 ul1Var) {
        this.f = lr2Var;
        this.h = appState;
        this.g = ul1Var;
    }
}
