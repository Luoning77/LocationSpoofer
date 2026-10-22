package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RoutePlanStage;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import com.vincenthzr.locationspoofer.data.model.RouteRunMode;
import com.vincenthzr.locationspoofer.data.model.SimMode;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class nk2 {
    public static final AppState a(AppState appState, MotionController.State state) {
        Object next;
        List<RoutePoint> routePoints;
        RouteRunMode routeRunMode;
        appState.getClass();
        state.getClass();
        if (!state.getActive()) {
            return appState;
        }
        MotionController.RouteSession route = state.getRoute();
        Iterator<E> it = SimMode.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!o51.f(((SimMode) next).name(), state.getPreset().getName()));
        SimMode routeSimMode = (SimMode) next;
        if (routeSimMode == null) {
            routeSimMode = appState.getRouteSimMode();
        }
        Locale locale = Locale.US;
        String str = String.format(locale, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(state.getLat())}, 1));
        String str2 = String.format(locale, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(state.getLng())}, 1));
        float bearing = state.getBearing();
        if (route == null || (routePoints = route.getPoints()) == null) {
            routePoints = appState.getRoutePoints();
        }
        List<RoutePoint> list = routePoints;
        RoutePlanStage routePlanStage = route != null ? RoutePlanStage.RUNNING : appState.getRoutePlanStage();
        if (route != null) {
            routeRunMode = route.getStartedManually() ? RouteRunMode.MANUAL : RouteRunMode.LOOP;
        } else {
            routeRunMode = appState.getRouteRunMode();
        }
        return AppState.copy$default(appState, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, str2, str, false, false, true, null, null, 0, null, null, null, null, bearing, null, list, routePlanStage, routeRunMode, routeSimMode, routeSimMode == SimMode.CUSTOM ? state.getPreset().getSpeedMs() : appState.getCustomSpeedMs(), route != null ? route.getEnableStepSimulation() : appState.getEnableStepSimulation(), route != null ? route.getStepCadenceSpm() : appState.getStepCadenceSpm(), route != null ? route.isAutoCadence() : appState.isAutoCadence(), false, null, route != null ? route.getStopAtDestination() : appState.getStopAtDestination(), false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1275068417, -327489, 134217727, null);
    }
}
