package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import com.vincenthzr.locationspoofer.data.model.RouteRunMode;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class zm0 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ zm0(ul1 ul1Var, ey1 ey1Var, int i) {
        this.e = i;
        this.f = ul1Var;
        this.g = ey1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        ul1 ul1Var = this.f;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.g;
        switch (i) {
            case 0:
                di0 di0Var = new di0(ey1Var, 9);
                ul1Var.getClass();
                BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), Dispatchers.getIO(), null, new dm1(ul1Var, di0Var, null), 2, null);
                break;
            case 1:
                hn1.i(ul1Var, (String) ey1Var.getValue());
                ok.l(uh1.a((String) ey1Var.getValue()));
                break;
            case 2:
                xj2 xj2Var = new xj2(ey1Var, 3);
                ul1 ul1Var2 = this.f;
                ul1Var2.getClass();
                RoutePoint routePoint = (RoutePoint) zy.o0(((AppState) ul1Var2.x.getValue()).getRoutePoints());
                if (routePoint != null) {
                    BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var2), null, null, new m(ul1Var2, routePoint, xj2Var, null, 14), 3, null);
                }
                break;
            default:
                ey1Var.setValue(Boolean.FALSE);
                ul1Var.getClass();
                RuntimeOperationCoordinator runtimeOperationCoordinator = ul1Var.t;
                Context context = ul1Var.j;
                AppState appState = (AppState) ul1Var.x.getValue();
                if (appState.isInitializing()) {
                    Toast.makeText(context, 2131624441, 0).show();
                } else if (appState.isContinuousScanning() || appState.isStoppingCollection()) {
                    Toast.makeText(context, context.getString(2131624393), 0).show();
                } else if (appState.getRoutePoints().size() >= 2 && !runtimeOperationCoordinator.isPreparing() && (appState.getRouteRunMode() != RouteRunMode.MANUAL || on1.a(ul1Var))) {
                    runtimeOperationCoordinator.launch(new xm1(ul1Var, ul1Var.k.getAccountState().getValue(), appState, null));
                }
                break;
        }
        return mf3Var;
    }
}
