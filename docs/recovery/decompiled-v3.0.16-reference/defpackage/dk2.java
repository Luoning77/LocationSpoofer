package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RoutePlanStage;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dk2 extends k33 implements pu0 {
    public final /* synthetic */ AppState e;
    public final /* synthetic */ List f;
    public final /* synthetic */ xb0 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ lr2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk2(AppState appState, List list, xb0 xb0Var, float f, float f2, lr2 lr2Var, q60 q60Var) {
        super(2, q60Var);
        this.e = appState;
        this.f = list;
        this.g = xb0Var;
        this.h = f;
        this.i = f2;
        this.j = lr2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new dk2(this.e, this.f, this.g, this.h, this.i, this.j, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        dk2 dk2Var = (dk2) create((CoroutineScope) obj, (q60) obj2);
        mf3 mf3Var = mf3.a;
        dk2Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ee0.J(obj);
        AppState appState = this.e;
        RoutePlanStage routePlanStage = appState.getRoutePlanStage();
        RoutePlanStage routePlanStage2 = RoutePlanStage.RUNNING;
        mf3 mf3Var = mf3.a;
        if (routePlanStage == routePlanStage2 || (appState.getRoutePlanStage() == RoutePlanStage.READY && appState.getSelectedCollectionRouteId() != null)) {
            List<RoutePoint> list = this.f;
            if (list.size() >= 2) {
                xb0 xb0Var = this.g;
                int iN0 = xb0Var.n0(36.0f);
                int iN1 = xb0Var.n0(80.0f);
                int iN2 = xb0Var.n0(36.0f);
                float f = this.h;
                int iA = td0.a(f, 0.0f);
                float f2 = this.i;
                int iN3 = xb0Var.n0(iA > 0 ? f + f2 + 24.0f : f2 + 160.0f);
                lr2 lr2Var = this.j;
                if (lr2Var != null) {
                    ArrayList arrayList = new ArrayList(az.Y(list, 10));
                    for (RoutePoint routePoint : list) {
                        arrayList.add(new i52(new Double(routePoint.getLat()), new Double(routePoint.getLng())));
                    }
                    lr2Var.h(arrayList, iN0, iN1, iN2, iN3);
                }
            }
        }
        return mf3Var;
    }
}
