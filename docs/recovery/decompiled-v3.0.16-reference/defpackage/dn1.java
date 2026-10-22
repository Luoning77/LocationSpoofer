package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.db.SavedRouteEntity;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import com.vincenthzr.locationspoofer.data.model.SavedRoute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dn1 implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ ul1 f;

    public /* synthetic */ dn1(ul1 ul1Var, int i) {
        this.e = i;
        this.f = ul1Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        Object value;
        AppState appState;
        int i;
        Object value2;
        int i2 = this.e;
        mf3 mf3Var = mf3.a;
        ul1 ul1Var = this.f;
        switch (i2) {
            case 0:
                i52 i52Var = (i52) obj;
                List list = (List) i52Var.e;
                List list2 = (List) i52Var.f;
                MutableStateFlow mutableStateFlow = ul1Var.x;
                do {
                    value = mutableStateFlow.getValue();
                    appState = (AppState) value;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (((CompleteLocation) it.next()).getLocation().getCollectionRouteId() == null && (i = i + 1) < 0) {
                                am1.W();
                                throw null;
                            }
                        }
                    } else {
                        i = 0;
                    }
                } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default(appState, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, list2.size() + i, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -1, 134217725, null)));
                rm1.a(ul1Var);
                return mf3Var;
            case 1:
                i52 i52Var2 = (i52) obj;
                String str = (String) i52Var2.e;
                String str2 = (String) i52Var2.f;
                if (r13.R(str) != null && r13.R(str2) != null) {
                    ul1Var.c.setLastMapPosition(str, str2);
                }
                return mf3Var;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MutableStateFlow mutableStateFlow2 = ul1Var.x;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, AppState.copy$default((AppState) value2, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, zBooleanValue, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, zBooleanValue ? ul1Var.d.getHookedApps(ul1Var.j) : uj0.e, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -33554433, -1, 134217695, null)));
                return mf3Var;
            default:
                List<SavedRouteEntity> list3 = (List) obj;
                ArrayList arrayList = new ArrayList(az.Y(list3, 10));
                for (SavedRouteEntity savedRouteEntity : list3) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        JSONArray jSONArray = new JSONArray(savedRouteEntity.getPointsJson());
                        int length = jSONArray.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i3);
                            arrayList2.add(new RoutePoint(jSONObject.getDouble("lat"), jSONObject.getDouble("lng"), 0.0d, 4, (ca0) null));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    arrayList.add(new SavedRoute(savedRouteEntity.getName(), arrayList2));
                }
                MutableStateFlow mutableStateFlow3 = ul1Var.x;
                while (true) {
                    Object value3 = mutableStateFlow3.getValue();
                    ArrayList arrayList3 = arrayList;
                    if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, arrayList3, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -129, 134217727, null))) {
                        return mf3Var;
                    }
                    arrayList = arrayList3;
                }
                break;
        }
    }
}
