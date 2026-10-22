package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RoutePlanStage;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import com.vincenthzr.locationspoofer.data.model.SavedRoute;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hm2 implements au0 {
    public final /* synthetic */ ul1 e;
    public final /* synthetic */ SavedRoute f;
    public final /* synthetic */ xb0 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ lr2 j;
    public final /* synthetic */ au0 k;
    public final /* synthetic */ Context l;

    public hm2(ul1 ul1Var, SavedRoute savedRoute, xb0 xb0Var, float f, float f2, lr2 lr2Var, au0 au0Var, Context context) {
        this.e = ul1Var;
        this.f = savedRoute;
        this.g = xb0Var;
        this.h = f;
        this.i = f2;
        this.j = lr2Var;
        this.k = au0Var;
        this.l = context;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        Object value;
        ul1 ul1Var = this.e;
        ul1Var.getClass();
        SavedRoute savedRoute = this.f;
        savedRoute.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, savedRoute.getPoints(), RoutePlanStage.READY, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -769, 134217727, null)));
        int size = savedRoute.getPoints().size();
        lr2 lr2Var = this.j;
        if (size >= 2) {
            xb0 xb0Var = this.g;
            int iN0 = xb0Var.n0(36.0f);
            int iN1 = xb0Var.n0(80.0f);
            int iN2 = xb0Var.n0(36.0f);
            float f = this.h;
            int iA = td0.a(f, 0.0f);
            float f2 = this.i;
            int iN3 = xb0Var.n0(iA > 0 ? f + f2 + 24.0f : f2 + 160.0f);
            if (lr2Var != null) {
                List<RoutePoint> points = savedRoute.getPoints();
                ArrayList arrayList = new ArrayList(az.Y(points, 10));
                for (RoutePoint routePoint : points) {
                    arrayList.add(new i52(Double.valueOf(routePoint.getLat()), Double.valueOf(routePoint.getLng())));
                }
                lr2Var.h(arrayList, iN0, iN1, iN2, iN3);
            }
        } else {
            RoutePoint routePoint2 = (RoutePoint) zy.o0(savedRoute.getPoints());
            if (routePoint2 != null && lr2Var != null) {
                lr2Var.d(routePoint2.getLat(), routePoint2.getLng(), Float.valueOf(17.5f));
            }
        }
        this.k.invoke();
        Object[] objArr = {savedRoute.getName()};
        Context context = this.l;
        Toast.makeText(context, context.getString(2131624578, objArr), 0).show();
        return mf3.a;
    }
}
