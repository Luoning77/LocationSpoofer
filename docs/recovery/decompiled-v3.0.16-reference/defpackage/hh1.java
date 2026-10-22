package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.model.CollectionRouteGeometryKt;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hh1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ hh1(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ((lu0) obj3).invoke((CompleteLocation) obj2);
                ((au0) obj).invoke();
                break;
            case 1:
                CompleteCollectionRoute completeCollectionRoute = (CompleteCollectionRoute) obj2;
                am1.R((ul1) obj3, completeCollectionRoute.getRoute().getId());
                lr2 lr2Var = (lr2) ((ey1) obj).getValue();
                if (lr2Var != null) {
                    CollectionRouteRecord route = completeCollectionRoute.getRoute();
                    route.getClass();
                    lr2Var.f();
                    o51.p(lr2Var, route, 80);
                    List<z60> listGeometry = CollectionRouteGeometryKt.geometry(route);
                    ArrayList arrayList = new ArrayList(az.Y(listGeometry, 10));
                    for (z60 z60Var : listGeometry) {
                        arrayList.add(new i52(Double.valueOf(z60Var.a), Double.valueOf(z60Var.b)));
                    }
                    lr2Var.h(arrayList, 80, 120, 80, 120);
                }
                break;
            case 2:
                CompleteLocation completeLocation = (CompleteLocation) obj2;
                rm1.i((ul1) obj3, completeLocation.getLocation().getId());
                lr2 lr2Var2 = (lr2) ((ey1) obj).getValue();
                if (lr2Var2 != null) {
                    lr2Var2.d(completeLocation.getLocation().getLat(), completeLocation.getLocation().getLng(), Float.valueOf(17.0f));
                }
                break;
            default:
                ul1 ul1Var = (ul1) obj3;
                long id = ((CompleteLocation) obj2).getLocation().getId();
                w3 w3Var = new w3((Context) obj, 2);
                ul1Var.getClass();
                BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), null, null, new zm1(ul1Var, w3Var, id, null), 3, null);
                break;
        }
        return mf3Var;
    }
}
