package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kt extends k33 implements pu0 {
    public final /* synthetic */ int e = 2;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(ul1 ul1Var, LinkedHashSet linkedHashSet, we2 we2Var, List list, CollectionRouteRecord collectionRouteRecord, q60 q60Var) {
        super(2, q60Var);
        this.f = ul1Var;
        this.g = linkedHashSet;
        this.h = we2Var;
        this.i = list;
        this.j = collectionRouteRecord;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                kt ktVar = new kt((lt) obj5, (xz1) obj4, (ta) obj3, (a6) obj2, q60Var);
                ktVar.f = obj;
                return ktVar;
            case 1:
                return new kt((ul1) this.f, (LinkedHashSet) obj5, (we2) obj4, (List) obj3, (CollectionRouteRecord) obj2, q60Var);
            default:
                return new kt((AppState) this.f, (List) obj5, (ey1) obj4, (Context) obj3, (ey1) obj2, q60Var);
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
                return ((kt) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
            case 1:
                ((kt) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return mf3Var;
            default:
                ((kt) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                return mf3Var;
        }
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        Object value;
        double d;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj2 = this.j;
        Object obj3 = this.g;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ee0.J(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f;
                lt ltVar = (lt) obj3;
                q60 q60Var = null;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new m(ltVar, (xz1) obj5, (ta) obj4, q60Var, 4), 3, null);
                return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new k(ltVar, (a6) obj2, q60Var, 10), 3, null);
            case 1:
                ee0.J(obj);
                ul1 ul1Var = (ul1) this.f;
                boolean zIsStoppingCollection = ((AppState) ul1Var.x.getValue()).isStoppingCollection();
                ul1Var.B = null;
                MutableStateFlow mutableStateFlow = ul1Var.x;
                we2 we2Var = (we2) obj5;
                List list = (List) obj4;
                CollectionRouteRecord collectionRouteRecord = (CollectionRouteRecord) obj2;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, we2Var.e == null ? list : uj0.e, false, false, false, null, collectionRouteRecord, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, 2030043135, 134217727, null)));
                if (zIsStoppingCollection && ((LinkedHashSet) obj3).isEmpty()) {
                    Toast.makeText(ul1Var.j, 2131624293, 1).show();
                }
                return mf3Var;
            default:
                AppState appState = (AppState) this.f;
                ee0.J(obj);
                lr2 lr2Var = (lr2) ((ey1) obj5).getValue();
                if (lr2Var == null) {
                    return mf3Var;
                }
                Double dR = r13.R(appState.getLatitudeInput());
                double dDoubleValue = dR != null ? dR.doubleValue() : 39.9042d;
                Double dR2 = r13.R(appState.getLongitudeInput());
                double dDoubleValue2 = dR2 != null ? dR2.doubleValue() : 116.4074d;
                lr2Var.f();
                i52 deviceLocation = appState.getDeviceLocation();
                if (deviceLocation != null) {
                    double dDoubleValue3 = ((Number) deviceLocation.e).doubleValue();
                    double dDoubleValue4 = ((Number) deviceLocation.f).doubleValue();
                    String string = ((Context) obj4).getString(2131624284);
                    string.getClass();
                    d = dDoubleValue2;
                    lr2Var.b(dDoubleValue3, dDoubleValue4, string, tq1.i);
                } else {
                    d = dDoubleValue2;
                }
                ld0.r(lr2Var, (List) obj3, new Double(dDoubleValue), new Double(d));
                Iterator it = zy.D0((List) ((ey1) obj2).getValue(), 10).iterator();
                while (it.hasNext()) {
                    o51.p(lr2Var, ((CompleteCollectionRoute) it.next()).getRoute(), 12);
                }
                if (appState.getCollectionRoutePoints().size() >= 2) {
                    s61 s61Var = t61.d;
                    List<RoutePoint> collectionRoutePoints = appState.getCollectionRoutePoints();
                    gt2 gt2Var = s61Var.b;
                    o51.p(lr2Var, new CollectionRouteRecord(0L, (String) null, (String) null, s61Var.b(new oo(RoutePoint.Companion.serializer()), collectionRoutePoints), 0.0d, 0L, (String) null, 119, (ca0) null), 60);
                    return mf3Var;
                }
                RoutePoint routePoint = (RoutePoint) zy.o0(appState.getCollectionRoutePoints());
                if (routePoint == null) {
                    return mf3Var;
                }
                lr2Var.b(routePoint.getLat(), routePoint.getLng(), "", tq1.e);
                return mf3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(lt ltVar, xz1 xz1Var, ta taVar, a6 a6Var, q60 q60Var) {
        super(2, q60Var);
        this.g = ltVar;
        this.h = xz1Var;
        this.i = taVar;
        this.j = a6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(AppState appState, List list, ey1 ey1Var, Context context, ey1 ey1Var2, q60 q60Var) {
        super(2, q60Var);
        this.f = appState;
        this.g = list;
        this.h = ey1Var;
        this.i = context;
        this.j = ey1Var2;
    }
}
