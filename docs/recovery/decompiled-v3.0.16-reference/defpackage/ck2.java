package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RoutePlanStage;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ck2 extends k33 implements pu0 {
    public final /* synthetic */ lr2 e;
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;
    public final /* synthetic */ AppState h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ ey1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck2(lr2 lr2Var, List list, List list2, AppState appState, Context context, ey1 ey1Var, ey1 ey1Var2, q60 q60Var) {
        super(2, q60Var);
        this.e = lr2Var;
        this.f = list;
        this.g = list2;
        this.h = appState;
        this.i = context;
        this.j = ey1Var;
        this.k = ey1Var2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new ck2(this.e, this.f, this.g, this.h, this.i, this.j, this.k, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ck2 ck2Var = (ck2) create((CoroutineScope) obj, (q60) obj2);
        mf3 mf3Var = mf3.a;
        ck2Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws Throwable {
        AppState appState;
        Throwable th;
        Object next;
        Throwable th2;
        ee0.J(obj);
        mf3 mf3Var = mf3.a;
        lr2 lr2Var = this.e;
        if (lr2Var != null) {
            lr2Var.f();
            Iterator it = ((List) this.j.getValue()).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                appState = this.h;
                th = null;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                long id = ((CompleteCollectionRoute) next).getRoute().getId();
                Long selectedCollectionRouteId = appState.getSelectedCollectionRouteId();
                if (selectedCollectionRouteId != null && id == selectedCollectionRouteId.longValue()) {
                    break;
                }
            }
            CompleteCollectionRoute completeCollectionRoute = (CompleteCollectionRoute) next;
            if (completeCollectionRoute != null) {
                o51.p(lr2Var, completeCollectionRoute.getRoute(), 80);
            }
            ey1 ey1Var = this.k;
            ey1Var.setValue(null);
            List list = this.f;
            ArrayList arrayList = new ArrayList(az.Y(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((CompleteLocation) it2.next()).getLocation());
            }
            ld0.r(lr2Var, arrayList, null, null);
            List<RoutePoint> list2 = this.g;
            if (list2.size() >= 2) {
                ArrayList arrayList2 = new ArrayList(az.Y(list2, 10));
                for (RoutePoint routePoint : list2) {
                    arrayList2.add(new i52(new Double(routePoint.getLat()), new Double(routePoint.getLng())));
                }
                lr2Var.c(arrayList2, Color.parseColor("#FF388BFD"), 8.0f);
            }
            Iterator it3 = list2.iterator();
            int i = 0;
            while (true) {
                boolean zHasNext2 = it3.hasNext();
                Context context = this.i;
                if (!zHasNext2) {
                    if (!appState.isSpoofingActive()) {
                        break;
                    }
                    Double dR = r13.R(appState.getLatitudeInput());
                    Double dR2 = r13.R(appState.getLongitudeInput());
                    if (dR != null && dR2 != null) {
                        double dDoubleValue = dR.doubleValue();
                        double dDoubleValue2 = dR2.doubleValue();
                        String string = context.getString(2131624360);
                        string.getClass();
                        ey1Var.setValue(lr2Var.b(dDoubleValue, dDoubleValue2, string, tq1.g));
                        break;
                    }
                    break;
                    break;
                }
                Object next2 = it3.next();
                int i2 = i + 1;
                if (i < 0) {
                    Throwable th3 = th;
                    am1.X();
                    throw th3;
                }
                RoutePoint routePoint2 = (RoutePoint) next2;
                tq1 tq1Var = tq1.h;
                tq1 tq1Var2 = tq1.f;
                tq1 tq1Var3 = i == 0 ? tq1.e : (i != list2.size() - 1 || list2.size() <= 1) ? tq1Var : tq1Var2;
                if (appState.getUseRealRoute()) {
                    th2 = th;
                    if (appState.getRoutePlanStage() != RoutePlanStage.RUNNING || tq1Var3 != tq1Var) {
                    }
                    th = th2;
                    i = i2;
                } else {
                    th2 = th;
                }
                String string2 = context.getString(2131624913);
                string2.getClass();
                String string3 = context.getString(2131624900);
                string3.getClass();
                int iOrdinal = tq1Var3.ordinal();
                if (iOrdinal != 0) {
                    string2 = iOrdinal != 1 ? String.valueOf(i2) : string3;
                }
                lr2Var.b(routePoint2.getLat(), routePoint2.getLng(), (tq1Var3 == tq1Var2 && appState.getUseRealRoute() && appState.getRoutePlanStage() == RoutePlanStage.RUNNING) ? string3 : string2, tq1Var3);
                th = th2;
                i = i2;
            }
        }
        return mf3Var;
    }
}
