package defpackage;

import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.CollectionRouteMatcher;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import com.vincenthzr.locationspoofer.data.state.SpoofingState;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wm1 implements FlowCollector {
    public final /* synthetic */ ul1 e;

    public wm1(ul1 ul1Var) {
        this.e = ul1Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        float f;
        CollectionRouteRecord route;
        Object value;
        MotionController.State state = (MotionController.State) obj;
        ul1 ul1Var = this.e;
        MutableStateFlow mutableStateFlow = ul1Var.x;
        if (state.getActive()) {
            if (state.getMode() == MotionController.Mode.ROUTE || state.getMode() == MotionController.Mode.MANUAL) {
                double lat = state.getLat();
                double lng = state.getLng();
                float bearing = state.getBearing();
                while (true) {
                    Object value2 = mutableStateFlow.getValue();
                    f = bearing;
                    if (mutableStateFlow.compareAndSet(value2, AppState.copy$default((AppState) value2, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, String.format("%.6f", Arrays.copyOf(new Object[]{Double.valueOf(lng)}, 1)), String.format("%.6f", Arrays.copyOf(new Object[]{Double.valueOf(lat)}, 1)), false, false, false, null, null, 0, null, null, null, null, bearing, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -469762049, -65, 134217727, null))) {
                        break;
                    }
                    bearing = f;
                }
                SpoofingState spoofingState = SpoofingState.INSTANCE;
                spoofingState.setLatitude(lat);
                spoofingState.setLongitude(lng);
                spoofingState.setSimBearing(f);
                double radians = Math.toRadians(lat - ul1Var.H);
                double radians2 = Math.toRadians(lng - ul1Var.I);
                double dSin = Math.sin(radians / 2.0d);
                double dCos = Math.cos(Math.toRadians(lat)) * Math.cos(Math.toRadians(ul1Var.H));
                double dSin2 = Math.sin(radians2 / 2.0d);
                double d = (dSin2 * dSin2 * dCos) + (dSin * dSin);
                double dAtan2 = Math.atan2(Math.sqrt(d), Math.sqrt(1.0d - d)) * 1.2756274E7d;
                CompleteCollectionRoute completeCollectionRouteRouteAt = CollectionRouteMatcher.INSTANCE.routeAt((List) ul1Var.v.getValue(), new z60(lat, lng), ((AppState) mutableStateFlow.getValue()).getSelectedCollectionRouteId());
                Long lValueOf = (completeCollectionRouteRouteAt == null || (route = completeCollectionRouteRouteAt.getRoute()) == null) ? null : Long.valueOf(route.getId());
                if (dAtan2 > 20.0d || !o51.f(lValueOf, ul1Var.G)) {
                    ul1Var.G = lValueOf;
                    ul1Var.H = lat;
                    ul1Var.I = lng;
                    Job job = ul1Var.r;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    ul1Var.r = BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var), null, null, new lm1(ul1Var, lat, lng, null), 3, null);
                }
            }
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, nk2.a((AppState) value, state)));
        }
        return mf3.a;
    }
}
