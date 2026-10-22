package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.EnvironmentAvailabilityKt;
import com.vincenthzr.locationspoofer.data.model.RoutePlanStage;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import com.vincenthzr.locationspoofer.data.model.RouteRunMode;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.model.SimMode;
import com.vincenthzr.locationspoofer.data.model.WifiLoadStatus;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import com.vincenthzr.locationspoofer.data.repository.SettingsRepository;
import com.vincenthzr.locationspoofer.data.state.SpoofingState;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONException;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class an1 {
    public static final void a(ul1 ul1Var, double d, double d2) {
        Object value;
        AppState appState;
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        do {
            value = mutableStateFlow.getValue();
            appState = (AppState) value;
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default(appState, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, zy.w0(appState.getRoutePoints(), new RoutePoint(d, d2, 0.0d, 4, (ca0) null)), null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -257, 134217727, null)));
    }

    public static final void b(ul1 ul1Var, double d, double d2) {
        Object value;
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        if (((AppState) mutableStateFlow.getValue()).isSpoofingActive() || ul1Var.i.getState().getValue().getActive()) {
            return;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, String.format("%.6f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)), String.format("%.6f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)), false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, new i52(Double.valueOf(d), Double.valueOf(d2)), false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -469762049, -1048577, 134217727, null)));
        rm1.a(ul1Var);
    }

    public static final void c(ul1 ul1Var, SavedLocation savedLocation) {
        Object value;
        Locale locale;
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        do {
            value = mutableStateFlow.getValue();
            locale = Locale.US;
        } while (!mutableStateFlow.compareAndSet(value, EnvironmentAvailabilityKt.withEnvironmentData(AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, String.format(locale, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(savedLocation.getLng())}, 1)), String.format(locale, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(savedLocation.getLat())}, 1)), false, false, false, WifiLoadStatus.IDLE, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, 1946157055, -2, 134217727, null), savedLocation.getWifiJson(), savedLocation.getCellJson(), savedLocation.getBluetoothJson())));
    }

    public static final void d(ul1 ul1Var, SavedLocation savedLocation) {
        Object value;
        ul1Var.getClass();
        SettingsRepository settingsRepository = ul1Var.c;
        settingsRepository.removeSavedLocation(savedLocation);
        MutableStateFlow mutableStateFlow = ul1Var.x;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, settingsRepository.getSavedLocations(), null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -5, 134217727, null)));
    }

    public static final String e(CompleteLocation completeLocation) {
        double lat = completeLocation.getLocation().getLat();
        double lng = completeLocation.getLocation().getLng();
        if (l13.k0(completeLocation.getLocation().getPlaceName())) {
            return !l13.k0(completeLocation.getLocation().getRemark()) ? completeLocation.getLocation().getRemark() : String.format(Locale.US, "(%.5f, %.5f)", Arrays.copyOf(new Object[]{Double.valueOf(lat), Double.valueOf(lng)}, 2));
        }
        return completeLocation.getLocation().getPlaceName();
    }

    public static final void f(ul1 ul1Var) {
        Object value;
        ul1Var.getClass();
        MutableStateFlow mutableStateFlow = ul1Var.x;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, uj0.e, RoutePlanStage.SELECTING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1, -769, 134217726, null)));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:104:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:105:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:108:0x0529  */
    /* JADX WARN: Code duplicated, block: B:114:0x0621 A[LOOP:0: B:110:0x0541->B:114:0x0621, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0615 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0259  */
    /* JADX WARN: Code duplicated, block: B:51:0x0283  */
    /* JADX WARN: Code duplicated, block: B:53:0x028c  */
    /* JADX WARN: Code duplicated, block: B:57:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x0306  */
    /* JADX WARN: Code duplicated, block: B:70:0x0313  */
    /* JADX WARN: Code duplicated, block: B:75:0x0346  */
    /* JADX WARN: Code duplicated, block: B:81:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:82:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:84:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:85:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:89:0x048e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:92:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:93:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:97:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:99:0x04d0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object g(ul1 ul1Var, List list, AppState appState, r60 r60Var) throws JSONException, CloudException {
        ym1 ym1Var;
        CloudAccountState value;
        ul1 ul1Var2;
        int i;
        int i2;
        double d;
        List list2;
        AppState appState2;
        RoutePoint routePoint;
        double lat;
        double lng;
        double d2;
        int i3;
        RoutePoint routePoint2;
        CloudAccountState cloudAccountState;
        ul1 ul1Var3;
        RoutePoint routePoint3;
        List list3;
        double d3;
        List list4;
        double lat2;
        double lng2;
        List list5;
        int i4;
        ul1 ul1Var4;
        RoutePoint routePoint4;
        double d4;
        CloudAccountState cloudAccountState2;
        List list6;
        int i5;
        int i6;
        ul1 ul1Var5;
        MutableStateFlow mutableStateFlow;
        String str;
        String str2;
        String str3;
        Object value2;
        long jCurrentTimeMillis;
        LocationRepository locationRepository;
        Context context;
        double lat3;
        double lng3;
        String strName;
        boolean z;
        Map<String, String> appCoordinateSystems;
        String collectedWifiJson;
        String collectedCellJson;
        String collectedBluetoothJson;
        boolean mockWifi;
        boolean mockCell;
        boolean mockBluetooth;
        boolean enableJitter;
        boolean stopAtDestination;
        boolean enableStepSimulation;
        int stepCadenceSpm;
        boolean zIsAutoCadence;
        Double d5;
        boolean z2;
        double d6;
        List list7;
        boolean z3;
        long j;
        List list8;
        ul1 ul1Var6;
        AppState appState3;
        double speedMs;
        Double dValueOf;
        double speedMs2;
        ul1 ul1Var7;
        boolean z4;
        MutableStateFlow mutableStateFlow2;
        int i7;
        Object value3;
        MutableStateFlow mutableStateFlow3;
        ul1 ul1Var8 = ul1Var;
        if (r60Var instanceof ym1) {
            ym1Var = (ym1) r60Var;
            int i8 = ym1Var.o;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                ym1Var.o = i8 - Integer.MIN_VALUE;
            } else {
                ym1Var = new ym1(r60Var);
            }
        } else {
            ym1Var = new ym1(r60Var);
        }
        ym1 ym1Var2 = ym1Var;
        Object objH = ym1Var2.n;
        int i9 = ym1Var2.o;
        String str4 = null;
        Object obj = z70.e;
        switch (i9) {
            case 0:
                ee0.J(objH);
                RoutePoint routePoint5 = (RoutePoint) zy.n0(list);
                MutableStateFlow mutableStateFlow4 = ul1Var8.x;
                while (true) {
                    Object value4 = mutableStateFlow4.getValue();
                    Locale locale = Locale.US;
                    if (mutableStateFlow4.compareAndSet(value4, AppState.copy$default((AppState) value4, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, String.format(locale, "%.6f", Arrays.copyOf(new Object[]{new Double(routePoint5.getLng())}, 1)), String.format(locale, "%.6f", Arrays.copyOf(new Object[]{new Double(routePoint5.getLat())}, 1)), false, false, false, null, null, 0, null, null, null, null, 0.0f, null, list, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -201326593, -257, 134217727, null))) {
                        int i10 = appState.getRouteRunMode() == RouteRunMode.LOOP ? 1 : 0;
                        AppState appState4 = (AppState) ul1Var8.x.getValue();
                        double customSpeedMs = appState4.getRouteSimMode() == SimMode.CUSTOM ? appState4.getCustomSpeedMs() : appState4.getRouteSimMode().getSpeedMs();
                        value = ul1Var8.k.getAccountState().getValue();
                        if (appState.getMockWifi() && appState.getCloudWifiConfigured()) {
                            CloudAccount account = value.getAccount();
                            if (o51.f(account != null ? account.getPlan() : str4, "pro")) {
                                double lat4 = routePoint5.getLat();
                                double lng4 = routePoint5.getLng();
                                ym1Var2.e = list;
                                ym1Var2.f = appState;
                                ym1Var2.g = routePoint5;
                                ym1Var2.h = ul1Var8;
                                ym1Var2.i = value;
                                ym1Var2.j = i10;
                                ym1Var2.l = customSpeedMs;
                                ym1Var2.k = 0;
                                ym1Var2.o = 1;
                                objH = rm1.h(ul1Var8, lat4, lng4, ym1Var2);
                                if (objH != obj) {
                                    ul1Var2 = ul1Var;
                                    i = i10;
                                    i2 = 0;
                                    d = customSpeedMs;
                                    list2 = list;
                                    appState2 = appState;
                                    routePoint = routePoint5;
                                    if (!((Boolean) objH).booleanValue()) {
                                        if (appState2.getMockCell()) {
                                        }
                                        ul1Var3 = ul1Var2;
                                        routePoint3 = routePoint;
                                        list3 = list2;
                                        d3 = d;
                                        on1.c(ul1Var3, value);
                                        double lat5 = routePoint3.getLat();
                                        double lng5 = routePoint3.getLng();
                                        ym1Var2.e = list3;
                                        ym1Var2.f = null;
                                        ym1Var2.g = routePoint3;
                                        ym1Var2.h = ul1Var3;
                                        ym1Var2.i = null;
                                        ym1Var2.j = i;
                                        ym1Var2.l = d3;
                                        ym1Var2.k = i2;
                                        ym1Var2.o = 5;
                                        objH = am1.o(ul1Var3, lat5, lng5);
                                        if (objH != obj) {
                                            int i11 = i;
                                            i5 = i2;
                                            i6 = i11;
                                            ul1Var5 = ul1Var3;
                                            RoutePoint routePoint6 = routePoint3;
                                            md3 md3VarD = ig0.D(ul1Var5, (List) objH, routePoint6.getLat(), routePoint6.getLng());
                                            mutableStateFlow = ul1Var5.x;
                                            str = (String) md3VarD.e;
                                            str2 = (String) md3VarD.f;
                                            str3 = (String) md3VarD.g;
                                            do {
                                                value2 = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.compareAndSet(value2, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value2, str, str2, str3)));
                                            jCurrentTimeMillis = System.currentTimeMillis();
                                            SpoofingState spoofingState = SpoofingState.INSTANCE;
                                            spoofingState.setStartTimestamp(jCurrentTimeMillis);
                                            spoofingState.setLatitude(routePoint6.getLat());
                                            spoofingState.setLongitude(routePoint6.getLng());
                                            spoofingState.setSimBearing(0.0f);
                                            locationRepository = ul1Var5.b;
                                            context = ul1Var5.j;
                                            lat3 = routePoint6.getLat();
                                            lng3 = routePoint6.getLng();
                                            if (i6 != 0) {
                                                strName = ((AppState) mutableStateFlow.getValue()).getRouteSimMode().name();
                                            } else {
                                                strName = "STILL";
                                            }
                                            if (i6 != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            appCoordinateSystems = ((AppState) mutableStateFlow.getValue()).getAppCoordinateSystems();
                                            collectedWifiJson = ((AppState) mutableStateFlow.getValue()).getCollectedWifiJson();
                                            collectedCellJson = ((AppState) mutableStateFlow.getValue()).getCollectedCellJson();
                                            collectedBluetoothJson = ((AppState) mutableStateFlow.getValue()).getCollectedBluetoothJson();
                                            mockWifi = ((AppState) mutableStateFlow.getValue()).getMockWifi();
                                            mockCell = ((AppState) mutableStateFlow.getValue()).getMockCell();
                                            mockBluetooth = ((AppState) mutableStateFlow.getValue()).getMockBluetooth();
                                            enableJitter = ((AppState) mutableStateFlow.getValue()).getEnableJitter();
                                            stopAtDestination = ((AppState) mutableStateFlow.getValue()).getStopAtDestination();
                                            enableStepSimulation = ((AppState) mutableStateFlow.getValue()).getEnableStepSimulation();
                                            stepCadenceSpm = ((AppState) mutableStateFlow.getValue()).getStepCadenceSpm();
                                            zIsAutoCadence = ((AppState) mutableStateFlow.getValue()).isAutoCadence();
                                            ym1Var2.e = list3;
                                            ym1Var2.f = null;
                                            ym1Var2.g = null;
                                            ym1Var2.h = ul1Var5;
                                            ym1Var2.i = null;
                                            ym1Var2.j = i6;
                                            ym1Var2.l = d3;
                                            ym1Var2.k = i5;
                                            ym1Var2.m = jCurrentTimeMillis;
                                            ym1Var2.o = 6;
                                            d5 = null;
                                            z2 = true;
                                            d6 = d3;
                                            list7 = list3;
                                            z3 = false;
                                            if (locationRepository.startSpoofing(context, lat3, lng3, strName, 0.0f, jCurrentTimeMillis, list7, z, appCoordinateSystems, collectedWifiJson, collectedCellJson, collectedBluetoothJson, mockWifi, mockCell, mockBluetooth, enableJitter, d6, stopAtDestination, enableStepSimulation, stepCadenceSpm, zIsAutoCadence, ym1Var2) == obj) {
                                                return obj;
                                            }
                                            j = jCurrentTimeMillis;
                                            list8 = list7;
                                            ul1Var6 = ul1Var5;
                                            MutableStateFlow mutableStateFlow5 = ul1Var6.x;
                                            String strName2 = ((AppState) mutableStateFlow5.getValue()).getRouteSimMode().name();
                                            appState3 = (AppState) ul1Var6.x.getValue();
                                            if (appState3.getRouteSimMode() == SimMode.CUSTOM) {
                                                speedMs = appState3.getCustomSpeedMs();
                                            } else {
                                                speedMs = appState3.getRouteSimMode().getSpeedMs();
                                            }
                                            dValueOf = Double.valueOf(speedMs);
                                            if (speedMs <= 0.0d) {
                                                dValueOf = d5;
                                            }
                                            if (dValueOf != null) {
                                                speedMs2 = dValueOf.doubleValue();
                                            } else {
                                                speedMs2 = SimMode.WALKING.getSpeedMs();
                                            }
                                            MotionController.SpeedPreset speedPreset = new MotionController.SpeedPreset(strName2, (float) speedMs2);
                                            ul1Var7 = ul1Var6;
                                            MotionController motionController = ul1Var7.i;
                                            boolean stopAtDestination2 = ((AppState) mutableStateFlow5.getValue()).getStopAtDestination();
                                            if (i6 == 0) {
                                                z4 = z2;
                                            } else {
                                                z4 = z3;
                                            }
                                            mutableStateFlow2 = mutableStateFlow5;
                                            i7 = i6;
                                            motionController.onRouteStarted(list8, speedPreset, stopAtDestination2, j, (96 & 16) != 0 ? false : z4, (96 & 32) != 0 ? SpoofingState.INSTANCE.getRouteLateralDeviation() : false, (96 & 64) != 0 ? SpoofingState.INSTANCE.getRouteLateralSeed() : 0L, (96 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? true : ((AppState) mutableStateFlow5.getValue()).getEnableStepSimulation(), (96 & 256) != 0 ? 165 : ((AppState) mutableStateFlow5.getValue()).getStepCadenceSpm(), (96 & 512) != 0 ? true : ((AppState) mutableStateFlow5.getValue()).isAutoCadence());
                                            if (i7 == 0) {
                                                LocationRepository.setFloatingJoystickVisible$default(ul1Var7.b, ul1Var7.j, true, false, 4, null);
                                            }
                                            ul1Var7.b.requireRuntimeAuthorized();
                                            while (true) {
                                                value3 = mutableStateFlow2.getValue();
                                                mutableStateFlow3 = mutableStateFlow2;
                                                if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, true, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.RUNNING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1073741825, -513, 134217727, null))) {
                                                    on1.b(ul1Var7, (AppState) mutableStateFlow3.getValue());
                                                    return mf3.a;
                                                }
                                                mutableStateFlow2 = mutableStateFlow3;
                                            }
                                        }
                                    } else {
                                        lat = routePoint.getLat();
                                        lng = routePoint.getLng();
                                        ym1Var2.e = list2;
                                        ym1Var2.f = appState2;
                                        ym1Var2.g = routePoint;
                                        ym1Var2.h = ul1Var2;
                                        ym1Var2.i = value;
                                        ym1Var2.j = i;
                                        ym1Var2.l = d;
                                        ym1Var2.k = i2;
                                        ym1Var2.o = 2;
                                        d2 = d;
                                        if (rm1.e(ul1Var2, lat, lng, ym1Var2) != obj) {
                                            i3 = i;
                                            routePoint2 = routePoint;
                                            cloudAccountState = value;
                                            i = i3;
                                            value = cloudAccountState;
                                            routePoint = routePoint2;
                                            d = d2;
                                            if (appState2.getMockCell() || !appState2.getCloudCellsConfigured()) {
                                                ul1Var3 = ul1Var2;
                                                routePoint3 = routePoint;
                                                list3 = list2;
                                                d3 = d;
                                                on1.c(ul1Var3, value);
                                                double lat6 = routePoint3.getLat();
                                                double lng6 = routePoint3.getLng();
                                                ym1Var2.e = list3;
                                                ym1Var2.f = null;
                                                ym1Var2.g = routePoint3;
                                                ym1Var2.h = ul1Var3;
                                                ym1Var2.i = null;
                                                ym1Var2.j = i;
                                                ym1Var2.l = d3;
                                                ym1Var2.k = i2;
                                                ym1Var2.o = 5;
                                                objH = am1.o(ul1Var3, lat6, lng6);
                                                if (objH != obj) {
                                                    int i12 = i;
                                                    i5 = i2;
                                                    i6 = i12;
                                                    ul1Var5 = ul1Var3;
                                                    RoutePoint routePoint7 = routePoint3;
                                                    md3 md3VarD2 = ig0.D(ul1Var5, (List) objH, routePoint7.getLat(), routePoint7.getLng());
                                                    mutableStateFlow = ul1Var5.x;
                                                    str = (String) md3VarD2.e;
                                                    str2 = (String) md3VarD2.f;
                                                    str3 = (String) md3VarD2.g;
                                                    do {
                                                        value2 = mutableStateFlow.getValue();
                                                    } while (!mutableStateFlow.compareAndSet(value2, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value2, str, str2, str3)));
                                                    jCurrentTimeMillis = System.currentTimeMillis();
                                                    SpoofingState spoofingState2 = SpoofingState.INSTANCE;
                                                    spoofingState2.setStartTimestamp(jCurrentTimeMillis);
                                                    spoofingState2.setLatitude(routePoint7.getLat());
                                                    spoofingState2.setLongitude(routePoint7.getLng());
                                                    spoofingState2.setSimBearing(0.0f);
                                                    locationRepository = ul1Var5.b;
                                                    context = ul1Var5.j;
                                                    lat3 = routePoint7.getLat();
                                                    lng3 = routePoint7.getLng();
                                                    if (i6 != 0) {
                                                        strName = ((AppState) mutableStateFlow.getValue()).getRouteSimMode().name();
                                                    } else {
                                                        strName = "STILL";
                                                    }
                                                    if (i6 != 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    appCoordinateSystems = ((AppState) mutableStateFlow.getValue()).getAppCoordinateSystems();
                                                    collectedWifiJson = ((AppState) mutableStateFlow.getValue()).getCollectedWifiJson();
                                                    collectedCellJson = ((AppState) mutableStateFlow.getValue()).getCollectedCellJson();
                                                    collectedBluetoothJson = ((AppState) mutableStateFlow.getValue()).getCollectedBluetoothJson();
                                                    mockWifi = ((AppState) mutableStateFlow.getValue()).getMockWifi();
                                                    mockCell = ((AppState) mutableStateFlow.getValue()).getMockCell();
                                                    mockBluetooth = ((AppState) mutableStateFlow.getValue()).getMockBluetooth();
                                                    enableJitter = ((AppState) mutableStateFlow.getValue()).getEnableJitter();
                                                    stopAtDestination = ((AppState) mutableStateFlow.getValue()).getStopAtDestination();
                                                    enableStepSimulation = ((AppState) mutableStateFlow.getValue()).getEnableStepSimulation();
                                                    stepCadenceSpm = ((AppState) mutableStateFlow.getValue()).getStepCadenceSpm();
                                                    zIsAutoCadence = ((AppState) mutableStateFlow.getValue()).isAutoCadence();
                                                    ym1Var2.e = list3;
                                                    ym1Var2.f = null;
                                                    ym1Var2.g = null;
                                                    ym1Var2.h = ul1Var5;
                                                    ym1Var2.i = null;
                                                    ym1Var2.j = i6;
                                                    ym1Var2.l = d3;
                                                    ym1Var2.k = i5;
                                                    ym1Var2.m = jCurrentTimeMillis;
                                                    ym1Var2.o = 6;
                                                    d5 = null;
                                                    z2 = true;
                                                    d6 = d3;
                                                    list7 = list3;
                                                    z3 = false;
                                                    if (locationRepository.startSpoofing(context, lat3, lng3, strName, 0.0f, jCurrentTimeMillis, list7, z, appCoordinateSystems, collectedWifiJson, collectedCellJson, collectedBluetoothJson, mockWifi, mockCell, mockBluetooth, enableJitter, d6, stopAtDestination, enableStepSimulation, stepCadenceSpm, zIsAutoCadence, ym1Var2) == obj) {
                                                        return obj;
                                                    }
                                                    j = jCurrentTimeMillis;
                                                    list8 = list7;
                                                    ul1Var6 = ul1Var5;
                                                    MutableStateFlow mutableStateFlow6 = ul1Var6.x;
                                                    String strName3 = ((AppState) mutableStateFlow6.getValue()).getRouteSimMode().name();
                                                    appState3 = (AppState) ul1Var6.x.getValue();
                                                    if (appState3.getRouteSimMode() == SimMode.CUSTOM) {
                                                        speedMs = appState3.getCustomSpeedMs();
                                                    } else {
                                                        speedMs = appState3.getRouteSimMode().getSpeedMs();
                                                    }
                                                    dValueOf = Double.valueOf(speedMs);
                                                    if (speedMs <= 0.0d) {
                                                        dValueOf = d5;
                                                    }
                                                    if (dValueOf != null) {
                                                        speedMs2 = dValueOf.doubleValue();
                                                    } else {
                                                        speedMs2 = SimMode.WALKING.getSpeedMs();
                                                    }
                                                    MotionController.SpeedPreset speedPreset2 = new MotionController.SpeedPreset(strName3, (float) speedMs2);
                                                    ul1Var7 = ul1Var6;
                                                    MotionController motionController2 = ul1Var7.i;
                                                    boolean stopAtDestination3 = ((AppState) mutableStateFlow6.getValue()).getStopAtDestination();
                                                    if (i6 == 0) {
                                                        z4 = z2;
                                                    } else {
                                                        z4 = z3;
                                                    }
                                                    mutableStateFlow2 = mutableStateFlow6;
                                                    i7 = i6;
                                                    motionController2.onRouteStarted(list8, speedPreset2, stopAtDestination3, j, (96 & 16) != 0 ? false : z4, (96 & 32) != 0 ? SpoofingState.INSTANCE.getRouteLateralDeviation() : false, (96 & 64) != 0 ? SpoofingState.INSTANCE.getRouteLateralSeed() : 0L, (96 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? true : ((AppState) mutableStateFlow6.getValue()).getEnableStepSimulation(), (96 & 256) != 0 ? 165 : ((AppState) mutableStateFlow6.getValue()).getStepCadenceSpm(), (96 & 512) != 0 ? true : ((AppState) mutableStateFlow6.getValue()).isAutoCadence());
                                                    if (i7 == 0) {
                                                        LocationRepository.setFloatingJoystickVisible$default(ul1Var7.b, ul1Var7.j, true, false, 4, null);
                                                    }
                                                    ul1Var7.b.requireRuntimeAuthorized();
                                                    while (true) {
                                                        value3 = mutableStateFlow2.getValue();
                                                        mutableStateFlow3 = mutableStateFlow2;
                                                        if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, true, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.RUNNING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1073741825, -513, 134217727, null))) {
                                                            on1.b(ul1Var7, (AppState) mutableStateFlow3.getValue());
                                                            return mf3.a;
                                                        }
                                                        mutableStateFlow2 = mutableStateFlow3;
                                                    }
                                                }
                                            } else {
                                                double lat7 = routePoint.getLat();
                                                double lng7 = routePoint.getLng();
                                                ym1Var2.e = list2;
                                                ym1Var2.f = null;
                                                ym1Var2.g = routePoint;
                                                ym1Var2.h = ul1Var2;
                                                ym1Var2.i = value;
                                                ym1Var2.j = i;
                                                ym1Var2.l = d;
                                                ym1Var2.k = i2;
                                                ym1Var2.o = 3;
                                                double d7 = d;
                                                objH = rm1.g(ul1Var2, lat7, lng7, ym1Var2);
                                                if (objH != obj) {
                                                    list4 = list2;
                                                    d3 = d7;
                                                    if (((Boolean) objH).booleanValue()) {
                                                        list3 = list4;
                                                        ul1Var3 = ul1Var2;
                                                        routePoint3 = routePoint;
                                                        on1.c(ul1Var3, value);
                                                        double lat8 = routePoint3.getLat();
                                                        double lng8 = routePoint3.getLng();
                                                        ym1Var2.e = list3;
                                                        ym1Var2.f = null;
                                                        ym1Var2.g = routePoint3;
                                                        ym1Var2.h = ul1Var3;
                                                        ym1Var2.i = null;
                                                        ym1Var2.j = i;
                                                        ym1Var2.l = d3;
                                                        ym1Var2.k = i2;
                                                        ym1Var2.o = 5;
                                                        objH = am1.o(ul1Var3, lat8, lng8);
                                                        if (objH != obj) {
                                                            int i13 = i;
                                                            i5 = i2;
                                                            i6 = i13;
                                                            ul1Var5 = ul1Var3;
                                                            RoutePoint routePoint8 = routePoint3;
                                                            md3 md3VarD3 = ig0.D(ul1Var5, (List) objH, routePoint8.getLat(), routePoint8.getLng());
                                                            mutableStateFlow = ul1Var5.x;
                                                            str = (String) md3VarD3.e;
                                                            str2 = (String) md3VarD3.f;
                                                            str3 = (String) md3VarD3.g;
                                                            do {
                                                                value2 = mutableStateFlow.getValue();
                                                            } while (!mutableStateFlow.compareAndSet(value2, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value2, str, str2, str3)));
                                                            jCurrentTimeMillis = System.currentTimeMillis();
                                                            SpoofingState spoofingState3 = SpoofingState.INSTANCE;
                                                            spoofingState3.setStartTimestamp(jCurrentTimeMillis);
                                                            spoofingState3.setLatitude(routePoint8.getLat());
                                                            spoofingState3.setLongitude(routePoint8.getLng());
                                                            spoofingState3.setSimBearing(0.0f);
                                                            locationRepository = ul1Var5.b;
                                                            context = ul1Var5.j;
                                                            lat3 = routePoint8.getLat();
                                                            lng3 = routePoint8.getLng();
                                                            if (i6 != 0) {
                                                                strName = ((AppState) mutableStateFlow.getValue()).getRouteSimMode().name();
                                                            } else {
                                                                strName = "STILL";
                                                            }
                                                            if (i6 != 0) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            appCoordinateSystems = ((AppState) mutableStateFlow.getValue()).getAppCoordinateSystems();
                                                            collectedWifiJson = ((AppState) mutableStateFlow.getValue()).getCollectedWifiJson();
                                                            collectedCellJson = ((AppState) mutableStateFlow.getValue()).getCollectedCellJson();
                                                            collectedBluetoothJson = ((AppState) mutableStateFlow.getValue()).getCollectedBluetoothJson();
                                                            mockWifi = ((AppState) mutableStateFlow.getValue()).getMockWifi();
                                                            mockCell = ((AppState) mutableStateFlow.getValue()).getMockCell();
                                                            mockBluetooth = ((AppState) mutableStateFlow.getValue()).getMockBluetooth();
                                                            enableJitter = ((AppState) mutableStateFlow.getValue()).getEnableJitter();
                                                            stopAtDestination = ((AppState) mutableStateFlow.getValue()).getStopAtDestination();
                                                            enableStepSimulation = ((AppState) mutableStateFlow.getValue()).getEnableStepSimulation();
                                                            stepCadenceSpm = ((AppState) mutableStateFlow.getValue()).getStepCadenceSpm();
                                                            zIsAutoCadence = ((AppState) mutableStateFlow.getValue()).isAutoCadence();
                                                            ym1Var2.e = list3;
                                                            ym1Var2.f = null;
                                                            ym1Var2.g = null;
                                                            ym1Var2.h = ul1Var5;
                                                            ym1Var2.i = null;
                                                            ym1Var2.j = i6;
                                                            ym1Var2.l = d3;
                                                            ym1Var2.k = i5;
                                                            ym1Var2.m = jCurrentTimeMillis;
                                                            ym1Var2.o = 6;
                                                            d5 = null;
                                                            z2 = true;
                                                            d6 = d3;
                                                            list7 = list3;
                                                            z3 = false;
                                                            if (locationRepository.startSpoofing(context, lat3, lng3, strName, 0.0f, jCurrentTimeMillis, list7, z, appCoordinateSystems, collectedWifiJson, collectedCellJson, collectedBluetoothJson, mockWifi, mockCell, mockBluetooth, enableJitter, d6, stopAtDestination, enableStepSimulation, stepCadenceSpm, zIsAutoCadence, ym1Var2) == obj) {
                                                                return obj;
                                                            }
                                                            j = jCurrentTimeMillis;
                                                            list8 = list7;
                                                            ul1Var6 = ul1Var5;
                                                            MutableStateFlow mutableStateFlow7 = ul1Var6.x;
                                                            String strName4 = ((AppState) mutableStateFlow7.getValue()).getRouteSimMode().name();
                                                            appState3 = (AppState) ul1Var6.x.getValue();
                                                            if (appState3.getRouteSimMode() == SimMode.CUSTOM) {
                                                                speedMs = appState3.getCustomSpeedMs();
                                                            } else {
                                                                speedMs = appState3.getRouteSimMode().getSpeedMs();
                                                            }
                                                            dValueOf = Double.valueOf(speedMs);
                                                            if (speedMs <= 0.0d) {
                                                                dValueOf = d5;
                                                            }
                                                            if (dValueOf != null) {
                                                                speedMs2 = dValueOf.doubleValue();
                                                            } else {
                                                                speedMs2 = SimMode.WALKING.getSpeedMs();
                                                            }
                                                            MotionController.SpeedPreset speedPreset3 = new MotionController.SpeedPreset(strName4, (float) speedMs2);
                                                            ul1Var7 = ul1Var6;
                                                            MotionController motionController3 = ul1Var7.i;
                                                            boolean stopAtDestination4 = ((AppState) mutableStateFlow7.getValue()).getStopAtDestination();
                                                            if (i6 == 0) {
                                                                z4 = z2;
                                                            } else {
                                                                z4 = z3;
                                                            }
                                                            mutableStateFlow2 = mutableStateFlow7;
                                                            i7 = i6;
                                                            motionController3.onRouteStarted(list8, speedPreset3, stopAtDestination4, j, (96 & 16) != 0 ? false : z4, (96 & 32) != 0 ? SpoofingState.INSTANCE.getRouteLateralDeviation() : false, (96 & 64) != 0 ? SpoofingState.INSTANCE.getRouteLateralSeed() : 0L, (96 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? true : ((AppState) mutableStateFlow7.getValue()).getEnableStepSimulation(), (96 & 256) != 0 ? 165 : ((AppState) mutableStateFlow7.getValue()).getStepCadenceSpm(), (96 & 512) != 0 ? true : ((AppState) mutableStateFlow7.getValue()).isAutoCadence());
                                                            if (i7 == 0) {
                                                                LocationRepository.setFloatingJoystickVisible$default(ul1Var7.b, ul1Var7.j, true, false, 4, null);
                                                            }
                                                            ul1Var7.b.requireRuntimeAuthorized();
                                                            while (true) {
                                                                value3 = mutableStateFlow2.getValue();
                                                                mutableStateFlow3 = mutableStateFlow2;
                                                                if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, true, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.RUNNING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1073741825, -513, 134217727, null))) {
                                                                    on1.b(ul1Var7, (AppState) mutableStateFlow3.getValue());
                                                                    return mf3.a;
                                                                }
                                                                mutableStateFlow2 = mutableStateFlow3;
                                                            }
                                                        }
                                                    } else {
                                                        lat2 = routePoint.getLat();
                                                        lng2 = routePoint.getLng();
                                                        ym1Var2.e = list4;
                                                        ym1Var2.f = null;
                                                        ym1Var2.g = routePoint;
                                                        ym1Var2.h = ul1Var2;
                                                        ym1Var2.i = value;
                                                        ym1Var2.j = i;
                                                        ym1Var2.l = d3;
                                                        ym1Var2.k = i2;
                                                        ym1Var2.o = 4;
                                                        list5 = list4;
                                                        if (rm1.c(ul1Var2, lat2, lng2, ym1Var2) != obj) {
                                                            i4 = i;
                                                            ul1Var4 = ul1Var2;
                                                            routePoint4 = routePoint;
                                                            d4 = d3;
                                                            cloudAccountState2 = value;
                                                            list6 = list5;
                                                            value = cloudAccountState2;
                                                            ul1Var3 = ul1Var4;
                                                            routePoint3 = routePoint4;
                                                            list3 = list6;
                                                            d3 = d4;
                                                            i = i4;
                                                            on1.c(ul1Var3, value);
                                                            double lat9 = routePoint3.getLat();
                                                            double lng9 = routePoint3.getLng();
                                                            ym1Var2.e = list3;
                                                            ym1Var2.f = null;
                                                            ym1Var2.g = routePoint3;
                                                            ym1Var2.h = ul1Var3;
                                                            ym1Var2.i = null;
                                                            ym1Var2.j = i;
                                                            ym1Var2.l = d3;
                                                            ym1Var2.k = i2;
                                                            ym1Var2.o = 5;
                                                            objH = am1.o(ul1Var3, lat9, lng9);
                                                            if (objH != obj) {
                                                                int i14 = i;
                                                                i5 = i2;
                                                                i6 = i14;
                                                                ul1Var5 = ul1Var3;
                                                                RoutePoint routePoint9 = routePoint3;
                                                                md3 md3VarD4 = ig0.D(ul1Var5, (List) objH, routePoint9.getLat(), routePoint9.getLng());
                                                                mutableStateFlow = ul1Var5.x;
                                                                str = (String) md3VarD4.e;
                                                                str2 = (String) md3VarD4.f;
                                                                str3 = (String) md3VarD4.g;
                                                                do {
                                                                    value2 = mutableStateFlow.getValue();
                                                                } while (!mutableStateFlow.compareAndSet(value2, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value2, str, str2, str3)));
                                                                jCurrentTimeMillis = System.currentTimeMillis();
                                                                SpoofingState spoofingState4 = SpoofingState.INSTANCE;
                                                                spoofingState4.setStartTimestamp(jCurrentTimeMillis);
                                                                spoofingState4.setLatitude(routePoint9.getLat());
                                                                spoofingState4.setLongitude(routePoint9.getLng());
                                                                spoofingState4.setSimBearing(0.0f);
                                                                locationRepository = ul1Var5.b;
                                                                context = ul1Var5.j;
                                                                lat3 = routePoint9.getLat();
                                                                lng3 = routePoint9.getLng();
                                                                if (i6 != 0) {
                                                                    strName = ((AppState) mutableStateFlow.getValue()).getRouteSimMode().name();
                                                                } else {
                                                                    strName = "STILL";
                                                                }
                                                                if (i6 != 0) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                appCoordinateSystems = ((AppState) mutableStateFlow.getValue()).getAppCoordinateSystems();
                                                                collectedWifiJson = ((AppState) mutableStateFlow.getValue()).getCollectedWifiJson();
                                                                collectedCellJson = ((AppState) mutableStateFlow.getValue()).getCollectedCellJson();
                                                                collectedBluetoothJson = ((AppState) mutableStateFlow.getValue()).getCollectedBluetoothJson();
                                                                mockWifi = ((AppState) mutableStateFlow.getValue()).getMockWifi();
                                                                mockCell = ((AppState) mutableStateFlow.getValue()).getMockCell();
                                                                mockBluetooth = ((AppState) mutableStateFlow.getValue()).getMockBluetooth();
                                                                enableJitter = ((AppState) mutableStateFlow.getValue()).getEnableJitter();
                                                                stopAtDestination = ((AppState) mutableStateFlow.getValue()).getStopAtDestination();
                                                                enableStepSimulation = ((AppState) mutableStateFlow.getValue()).getEnableStepSimulation();
                                                                stepCadenceSpm = ((AppState) mutableStateFlow.getValue()).getStepCadenceSpm();
                                                                zIsAutoCadence = ((AppState) mutableStateFlow.getValue()).isAutoCadence();
                                                                ym1Var2.e = list3;
                                                                ym1Var2.f = null;
                                                                ym1Var2.g = null;
                                                                ym1Var2.h = ul1Var5;
                                                                ym1Var2.i = null;
                                                                ym1Var2.j = i6;
                                                                ym1Var2.l = d3;
                                                                ym1Var2.k = i5;
                                                                ym1Var2.m = jCurrentTimeMillis;
                                                                ym1Var2.o = 6;
                                                                d5 = null;
                                                                z2 = true;
                                                                d6 = d3;
                                                                list7 = list3;
                                                                z3 = false;
                                                                if (locationRepository.startSpoofing(context, lat3, lng3, strName, 0.0f, jCurrentTimeMillis, list7, z, appCoordinateSystems, collectedWifiJson, collectedCellJson, collectedBluetoothJson, mockWifi, mockCell, mockBluetooth, enableJitter, d6, stopAtDestination, enableStepSimulation, stepCadenceSpm, zIsAutoCadence, ym1Var2) == obj) {
                                                                    return obj;
                                                                }
                                                                j = jCurrentTimeMillis;
                                                                list8 = list7;
                                                                ul1Var6 = ul1Var5;
                                                                MutableStateFlow mutableStateFlow8 = ul1Var6.x;
                                                                String strName5 = ((AppState) mutableStateFlow8.getValue()).getRouteSimMode().name();
                                                                appState3 = (AppState) ul1Var6.x.getValue();
                                                                if (appState3.getRouteSimMode() == SimMode.CUSTOM) {
                                                                    speedMs = appState3.getCustomSpeedMs();
                                                                } else {
                                                                    speedMs = appState3.getRouteSimMode().getSpeedMs();
                                                                }
                                                                dValueOf = Double.valueOf(speedMs);
                                                                if (speedMs <= 0.0d) {
                                                                    dValueOf = d5;
                                                                }
                                                                if (dValueOf != null) {
                                                                    speedMs2 = dValueOf.doubleValue();
                                                                } else {
                                                                    speedMs2 = SimMode.WALKING.getSpeedMs();
                                                                }
                                                                MotionController.SpeedPreset speedPreset4 = new MotionController.SpeedPreset(strName5, (float) speedMs2);
                                                                ul1Var7 = ul1Var6;
                                                                MotionController motionController4 = ul1Var7.i;
                                                                boolean stopAtDestination5 = ((AppState) mutableStateFlow8.getValue()).getStopAtDestination();
                                                                if (i6 == 0) {
                                                                    z4 = z2;
                                                                } else {
                                                                    z4 = z3;
                                                                }
                                                                mutableStateFlow2 = mutableStateFlow8;
                                                                i7 = i6;
                                                                motionController4.onRouteStarted(list8, speedPreset4, stopAtDestination5, j, (96 & 16) != 0 ? false : z4, (96 & 32) != 0 ? SpoofingState.INSTANCE.getRouteLateralDeviation() : false, (96 & 64) != 0 ? SpoofingState.INSTANCE.getRouteLateralSeed() : 0L, (96 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? true : ((AppState) mutableStateFlow8.getValue()).getEnableStepSimulation(), (96 & 256) != 0 ? 165 : ((AppState) mutableStateFlow8.getValue()).getStepCadenceSpm(), (96 & 512) != 0 ? true : ((AppState) mutableStateFlow8.getValue()).isAutoCadence());
                                                                if (i7 == 0) {
                                                                    LocationRepository.setFloatingJoystickVisible$default(ul1Var7.b, ul1Var7.j, true, false, 4, null);
                                                                }
                                                                ul1Var7.b.requireRuntimeAuthorized();
                                                                while (true) {
                                                                    value3 = mutableStateFlow2.getValue();
                                                                    mutableStateFlow3 = mutableStateFlow2;
                                                                    if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, true, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.RUNNING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1073741825, -513, 134217727, null))) {
                                                                        on1.b(ul1Var7, (AppState) mutableStateFlow3.getValue());
                                                                        return mf3.a;
                                                                    }
                                                                    mutableStateFlow2 = mutableStateFlow3;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return obj;
                        }
                        ul1Var2 = ul1Var;
                        i = i10;
                        i2 = 0;
                        d = customSpeedMs;
                        list2 = list;
                        appState2 = appState;
                        routePoint = routePoint5;
                        if (appState2.getMockCell()) {
                        }
                        ul1Var3 = ul1Var2;
                        routePoint3 = routePoint;
                        list3 = list2;
                        d3 = d;
                        on1.c(ul1Var3, value);
                        double lat10 = routePoint3.getLat();
                        double lng10 = routePoint3.getLng();
                        ym1Var2.e = list3;
                        ym1Var2.f = null;
                        ym1Var2.g = routePoint3;
                        ym1Var2.h = ul1Var3;
                        ym1Var2.i = null;
                        ym1Var2.j = i;
                        ym1Var2.l = d3;
                        ym1Var2.k = i2;
                        ym1Var2.o = 5;
                        objH = am1.o(ul1Var3, lat10, lng10);
                        if (objH != obj) {
                            int i15 = i;
                            i5 = i2;
                            i6 = i15;
                            ul1Var5 = ul1Var3;
                            RoutePoint routePoint10 = routePoint3;
                            md3 md3VarD5 = ig0.D(ul1Var5, (List) objH, routePoint10.getLat(), routePoint10.getLng());
                            mutableStateFlow = ul1Var5.x;
                            str = (String) md3VarD5.e;
                            str2 = (String) md3VarD5.f;
                            str3 = (String) md3VarD5.g;
                            do {
                                value2 = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.compareAndSet(value2, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value2, str, str2, str3)));
                            jCurrentTimeMillis = System.currentTimeMillis();
                            SpoofingState spoofingState5 = SpoofingState.INSTANCE;
                            spoofingState5.setStartTimestamp(jCurrentTimeMillis);
                            spoofingState5.setLatitude(routePoint10.getLat());
                            spoofingState5.setLongitude(routePoint10.getLng());
                            spoofingState5.setSimBearing(0.0f);
                            locationRepository = ul1Var5.b;
                            context = ul1Var5.j;
                            lat3 = routePoint10.getLat();
                            lng3 = routePoint10.getLng();
                            if (i6 != 0) {
                                strName = ((AppState) mutableStateFlow.getValue()).getRouteSimMode().name();
                            } else {
                                strName = "STILL";
                            }
                            if (i6 != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            appCoordinateSystems = ((AppState) mutableStateFlow.getValue()).getAppCoordinateSystems();
                            collectedWifiJson = ((AppState) mutableStateFlow.getValue()).getCollectedWifiJson();
                            collectedCellJson = ((AppState) mutableStateFlow.getValue()).getCollectedCellJson();
                            collectedBluetoothJson = ((AppState) mutableStateFlow.getValue()).getCollectedBluetoothJson();
                            mockWifi = ((AppState) mutableStateFlow.getValue()).getMockWifi();
                            mockCell = ((AppState) mutableStateFlow.getValue()).getMockCell();
                            mockBluetooth = ((AppState) mutableStateFlow.getValue()).getMockBluetooth();
                            enableJitter = ((AppState) mutableStateFlow.getValue()).getEnableJitter();
                            stopAtDestination = ((AppState) mutableStateFlow.getValue()).getStopAtDestination();
                            enableStepSimulation = ((AppState) mutableStateFlow.getValue()).getEnableStepSimulation();
                            stepCadenceSpm = ((AppState) mutableStateFlow.getValue()).getStepCadenceSpm();
                            zIsAutoCadence = ((AppState) mutableStateFlow.getValue()).isAutoCadence();
                            ym1Var2.e = list3;
                            ym1Var2.f = null;
                            ym1Var2.g = null;
                            ym1Var2.h = ul1Var5;
                            ym1Var2.i = null;
                            ym1Var2.j = i6;
                            ym1Var2.l = d3;
                            ym1Var2.k = i5;
                            ym1Var2.m = jCurrentTimeMillis;
                            ym1Var2.o = 6;
                            d5 = null;
                            z2 = true;
                            d6 = d3;
                            list7 = list3;
                            z3 = false;
                            if (locationRepository.startSpoofing(context, lat3, lng3, strName, 0.0f, jCurrentTimeMillis, list7, z, appCoordinateSystems, collectedWifiJson, collectedCellJson, collectedBluetoothJson, mockWifi, mockCell, mockBluetooth, enableJitter, d6, stopAtDestination, enableStepSimulation, stepCadenceSpm, zIsAutoCadence, ym1Var2) == obj) {
                                return obj;
                            }
                            j = jCurrentTimeMillis;
                            list8 = list7;
                            ul1Var6 = ul1Var5;
                            MutableStateFlow mutableStateFlow9 = ul1Var6.x;
                            String strName6 = ((AppState) mutableStateFlow9.getValue()).getRouteSimMode().name();
                            appState3 = (AppState) ul1Var6.x.getValue();
                            if (appState3.getRouteSimMode() == SimMode.CUSTOM) {
                                speedMs = appState3.getCustomSpeedMs();
                            } else {
                                speedMs = appState3.getRouteSimMode().getSpeedMs();
                            }
                            dValueOf = Double.valueOf(speedMs);
                            if (speedMs <= 0.0d) {
                                dValueOf = d5;
                            }
                            if (dValueOf != null) {
                                speedMs2 = dValueOf.doubleValue();
                            } else {
                                speedMs2 = SimMode.WALKING.getSpeedMs();
                            }
                            MotionController.SpeedPreset speedPreset5 = new MotionController.SpeedPreset(strName6, (float) speedMs2);
                            ul1Var7 = ul1Var6;
                            MotionController motionController5 = ul1Var7.i;
                            boolean stopAtDestination6 = ((AppState) mutableStateFlow9.getValue()).getStopAtDestination();
                            if (i6 == 0) {
                                z4 = z2;
                            } else {
                                z4 = z3;
                            }
                            mutableStateFlow2 = mutableStateFlow9;
                            i7 = i6;
                            motionController5.onRouteStarted(list8, speedPreset5, stopAtDestination6, j, (96 & 16) != 0 ? false : z4, (96 & 32) != 0 ? SpoofingState.INSTANCE.getRouteLateralDeviation() : false, (96 & 64) != 0 ? SpoofingState.INSTANCE.getRouteLateralSeed() : 0L, (96 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? true : ((AppState) mutableStateFlow9.getValue()).getEnableStepSimulation(), (96 & 256) != 0 ? 165 : ((AppState) mutableStateFlow9.getValue()).getStepCadenceSpm(), (96 & 512) != 0 ? true : ((AppState) mutableStateFlow9.getValue()).isAutoCadence());
                            if (i7 == 0) {
                                LocationRepository.setFloatingJoystickVisible$default(ul1Var7.b, ul1Var7.j, true, false, 4, null);
                            }
                            ul1Var7.b.requireRuntimeAuthorized();
                            while (true) {
                                value3 = mutableStateFlow2.getValue();
                                mutableStateFlow3 = mutableStateFlow2;
                                if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, true, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.RUNNING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1073741825, -513, 134217727, null))) {
                                    on1.b(ul1Var7, (AppState) mutableStateFlow3.getValue());
                                    return mf3.a;
                                }
                                mutableStateFlow2 = mutableStateFlow3;
                            }
                        }
                        return obj;
                    }
                    ul1Var8 = ul1Var;
                    str4 = str4;
                }
                break;
            case 1:
                i2 = ym1Var2.k;
                double d8 = ym1Var2.l;
                int i16 = ym1Var2.j;
                CloudAccountState cloudAccountState3 = ym1Var2.i;
                ul1 ul1Var9 = ym1Var2.h;
                RoutePoint routePoint11 = ym1Var2.g;
                appState2 = ym1Var2.f;
                list2 = ym1Var2.e;
                ee0.J(objH);
                value = cloudAccountState3;
                routePoint = routePoint11;
                i = i16;
                d = d8;
                ul1Var2 = ul1Var9;
                if (!((Boolean) objH).booleanValue()) {
                    if (appState2.getMockCell()) {
                    }
                    ul1Var3 = ul1Var2;
                    routePoint3 = routePoint;
                    list3 = list2;
                    d3 = d;
                    on1.c(ul1Var3, value);
                    double lat11 = routePoint3.getLat();
                    double lng11 = routePoint3.getLng();
                    ym1Var2.e = list3;
                    ym1Var2.f = null;
                    ym1Var2.g = routePoint3;
                    ym1Var2.h = ul1Var3;
                    ym1Var2.i = null;
                    ym1Var2.j = i;
                    ym1Var2.l = d3;
                    ym1Var2.k = i2;
                    ym1Var2.o = 5;
                    objH = am1.o(ul1Var3, lat11, lng11);
                    if (objH != obj) {
                        int i17 = i;
                        i5 = i2;
                        i6 = i17;
                        ul1Var5 = ul1Var3;
                        RoutePoint routePoint12 = routePoint3;
                        md3 md3VarD6 = ig0.D(ul1Var5, (List) objH, routePoint12.getLat(), routePoint12.getLng());
                        mutableStateFlow = ul1Var5.x;
                        str = (String) md3VarD6.e;
                        str2 = (String) md3VarD6.f;
                        str3 = (String) md3VarD6.g;
                        do {
                            value2 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value2, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value2, str, str2, str3)));
                        jCurrentTimeMillis = System.currentTimeMillis();
                        SpoofingState spoofingState6 = SpoofingState.INSTANCE;
                        spoofingState6.setStartTimestamp(jCurrentTimeMillis);
                        spoofingState6.setLatitude(routePoint12.getLat());
                        spoofingState6.setLongitude(routePoint12.getLng());
                        spoofingState6.setSimBearing(0.0f);
                        locationRepository = ul1Var5.b;
                        context = ul1Var5.j;
                        lat3 = routePoint12.getLat();
                        lng3 = routePoint12.getLng();
                        if (i6 != 0) {
                            strName = ((AppState) mutableStateFlow.getValue()).getRouteSimMode().name();
                        } else {
                            strName = "STILL";
                        }
                        if (i6 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        appCoordinateSystems = ((AppState) mutableStateFlow.getValue()).getAppCoordinateSystems();
                        collectedWifiJson = ((AppState) mutableStateFlow.getValue()).getCollectedWifiJson();
                        collectedCellJson = ((AppState) mutableStateFlow.getValue()).getCollectedCellJson();
                        collectedBluetoothJson = ((AppState) mutableStateFlow.getValue()).getCollectedBluetoothJson();
                        mockWifi = ((AppState) mutableStateFlow.getValue()).getMockWifi();
                        mockCell = ((AppState) mutableStateFlow.getValue()).getMockCell();
                        mockBluetooth = ((AppState) mutableStateFlow.getValue()).getMockBluetooth();
                        enableJitter = ((AppState) mutableStateFlow.getValue()).getEnableJitter();
                        stopAtDestination = ((AppState) mutableStateFlow.getValue()).getStopAtDestination();
                        enableStepSimulation = ((AppState) mutableStateFlow.getValue()).getEnableStepSimulation();
                        stepCadenceSpm = ((AppState) mutableStateFlow.getValue()).getStepCadenceSpm();
                        zIsAutoCadence = ((AppState) mutableStateFlow.getValue()).isAutoCadence();
                        ym1Var2.e = list3;
                        ym1Var2.f = null;
                        ym1Var2.g = null;
                        ym1Var2.h = ul1Var5;
                        ym1Var2.i = null;
                        ym1Var2.j = i6;
                        ym1Var2.l = d3;
                        ym1Var2.k = i5;
                        ym1Var2.m = jCurrentTimeMillis;
                        ym1Var2.o = 6;
                        d5 = null;
                        z2 = true;
                        d6 = d3;
                        list7 = list3;
                        z3 = false;
                        if (locationRepository.startSpoofing(context, lat3, lng3, strName, 0.0f, jCurrentTimeMillis, list7, z, appCoordinateSystems, collectedWifiJson, collectedCellJson, collectedBluetoothJson, mockWifi, mockCell, mockBluetooth, enableJitter, d6, stopAtDestination, enableStepSimulation, stepCadenceSpm, zIsAutoCadence, ym1Var2) == obj) {
                            return obj;
                        }
                        j = jCurrentTimeMillis;
                        list8 = list7;
                        ul1Var6 = ul1Var5;
                        MutableStateFlow mutableStateFlow10 = ul1Var6.x;
                        String strName7 = ((AppState) mutableStateFlow10.getValue()).getRouteSimMode().name();
                        appState3 = (AppState) ul1Var6.x.getValue();
                        if (appState3.getRouteSimMode() == SimMode.CUSTOM) {
                            speedMs = appState3.getCustomSpeedMs();
                        } else {
                            speedMs = appState3.getRouteSimMode().getSpeedMs();
                        }
                        dValueOf = Double.valueOf(speedMs);
                        if (speedMs <= 0.0d) {
                            dValueOf = d5;
                        }
                        if (dValueOf != null) {
                            speedMs2 = dValueOf.doubleValue();
                        } else {
                            speedMs2 = SimMode.WALKING.getSpeedMs();
                        }
                        MotionController.SpeedPreset speedPreset6 = new MotionController.SpeedPreset(strName7, (float) speedMs2);
                        ul1Var7 = ul1Var6;
                        MotionController motionController6 = ul1Var7.i;
                        boolean stopAtDestination7 = ((AppState) mutableStateFlow10.getValue()).getStopAtDestination();
                        if (i6 == 0) {
                            z4 = z2;
                        } else {
                            z4 = z3;
                        }
                        mutableStateFlow2 = mutableStateFlow10;
                        i7 = i6;
                        motionController6.onRouteStarted(list8, speedPreset6, stopAtDestination7, j, (96 & 16) != 0 ? false : z4, (96 & 32) != 0 ? SpoofingState.INSTANCE.getRouteLateralDeviation() : false, (96 & 64) != 0 ? SpoofingState.INSTANCE.getRouteLateralSeed() : 0L, (96 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? true : ((AppState) mutableStateFlow10.getValue()).getEnableStepSimulation(), (96 & 256) != 0 ? 165 : ((AppState) mutableStateFlow10.getValue()).getStepCadenceSpm(), (96 & 512) != 0 ? true : ((AppState) mutableStateFlow10.getValue()).isAutoCadence());
                        if (i7 == 0) {
                            LocationRepository.setFloatingJoystickVisible$default(ul1Var7.b, ul1Var7.j, true, false, 4, null);
                        }
                        ul1Var7.b.requireRuntimeAuthorized();
                        while (true) {
                            value3 = mutableStateFlow2.getValue();
                            mutableStateFlow3 = mutableStateFlow2;
                            if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, true, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.RUNNING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1073741825, -513, 134217727, null))) {
                                on1.b(ul1Var7, (AppState) mutableStateFlow3.getValue());
                                return mf3.a;
                            }
                            mutableStateFlow2 = mutableStateFlow3;
                        }
                    }
                    break;
                } else {
                    lat = routePoint.getLat();
                    lng = routePoint.getLng();
                    ym1Var2.e = list2;
                    ym1Var2.f = appState2;
                    ym1Var2.g = routePoint;
                    ym1Var2.h = ul1Var2;
                    ym1Var2.i = value;
                    ym1Var2.j = i;
                    ym1Var2.l = d;
                    ym1Var2.k = i2;
                    ym1Var2.o = 2;
                    d2 = d;
                    if (rm1.e(ul1Var2, lat, lng, ym1Var2) != obj) {
                        i3 = i;
                        routePoint2 = routePoint;
                        cloudAccountState = value;
                        i = i3;
                        value = cloudAccountState;
                        routePoint = routePoint2;
                        d = d2;
                        if (appState2.getMockCell()) {
                        }
                        ul1Var3 = ul1Var2;
                        routePoint3 = routePoint;
                        list3 = list2;
                        d3 = d;
                        on1.c(ul1Var3, value);
                        double lat12 = routePoint3.getLat();
                        double lng12 = routePoint3.getLng();
                        ym1Var2.e = list3;
                        ym1Var2.f = null;
                        ym1Var2.g = routePoint3;
                        ym1Var2.h = ul1Var3;
                        ym1Var2.i = null;
                        ym1Var2.j = i;
                        ym1Var2.l = d3;
                        ym1Var2.k = i2;
                        ym1Var2.o = 5;
                        objH = am1.o(ul1Var3, lat12, lng12);
                        if (objH != obj) {
                            int i18 = i;
                            i5 = i2;
                            i6 = i18;
                            ul1Var5 = ul1Var3;
                            RoutePoint routePoint13 = routePoint3;
                            md3 md3VarD7 = ig0.D(ul1Var5, (List) objH, routePoint13.getLat(), routePoint13.getLng());
                            mutableStateFlow = ul1Var5.x;
                            str = (String) md3VarD7.e;
                            str2 = (String) md3VarD7.f;
                            str3 = (String) md3VarD7.g;
                            do {
                                value2 = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.compareAndSet(value2, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value2, str, str2, str3)));
                            jCurrentTimeMillis = System.currentTimeMillis();
                            SpoofingState spoofingState7 = SpoofingState.INSTANCE;
                            spoofingState7.setStartTimestamp(jCurrentTimeMillis);
                            spoofingState7.setLatitude(routePoint13.getLat());
                            spoofingState7.setLongitude(routePoint13.getLng());
                            spoofingState7.setSimBearing(0.0f);
                            locationRepository = ul1Var5.b;
                            context = ul1Var5.j;
                            lat3 = routePoint13.getLat();
                            lng3 = routePoint13.getLng();
                            if (i6 != 0) {
                                strName = ((AppState) mutableStateFlow.getValue()).getRouteSimMode().name();
                            } else {
                                strName = "STILL";
                            }
                            if (i6 != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            appCoordinateSystems = ((AppState) mutableStateFlow.getValue()).getAppCoordinateSystems();
                            collectedWifiJson = ((AppState) mutableStateFlow.getValue()).getCollectedWifiJson();
                            collectedCellJson = ((AppState) mutableStateFlow.getValue()).getCollectedCellJson();
                            collectedBluetoothJson = ((AppState) mutableStateFlow.getValue()).getCollectedBluetoothJson();
                            mockWifi = ((AppState) mutableStateFlow.getValue()).getMockWifi();
                            mockCell = ((AppState) mutableStateFlow.getValue()).getMockCell();
                            mockBluetooth = ((AppState) mutableStateFlow.getValue()).getMockBluetooth();
                            enableJitter = ((AppState) mutableStateFlow.getValue()).getEnableJitter();
                            stopAtDestination = ((AppState) mutableStateFlow.getValue()).getStopAtDestination();
                            enableStepSimulation = ((AppState) mutableStateFlow.getValue()).getEnableStepSimulation();
                            stepCadenceSpm = ((AppState) mutableStateFlow.getValue()).getStepCadenceSpm();
                            zIsAutoCadence = ((AppState) mutableStateFlow.getValue()).isAutoCadence();
                            ym1Var2.e = list3;
                            ym1Var2.f = null;
                            ym1Var2.g = null;
                            ym1Var2.h = ul1Var5;
                            ym1Var2.i = null;
                            ym1Var2.j = i6;
                            ym1Var2.l = d3;
                            ym1Var2.k = i5;
                            ym1Var2.m = jCurrentTimeMillis;
                            ym1Var2.o = 6;
                            d5 = null;
                            z2 = true;
                            d6 = d3;
                            list7 = list3;
                            z3 = false;
                            if (locationRepository.startSpoofing(context, lat3, lng3, strName, 0.0f, jCurrentTimeMillis, list7, z, appCoordinateSystems, collectedWifiJson, collectedCellJson, collectedBluetoothJson, mockWifi, mockCell, mockBluetooth, enableJitter, d6, stopAtDestination, enableStepSimulation, stepCadenceSpm, zIsAutoCadence, ym1Var2) == obj) {
                                return obj;
                            }
                            j = jCurrentTimeMillis;
                            list8 = list7;
                            ul1Var6 = ul1Var5;
                            MutableStateFlow mutableStateFlow11 = ul1Var6.x;
                            String strName8 = ((AppState) mutableStateFlow11.getValue()).getRouteSimMode().name();
                            appState3 = (AppState) ul1Var6.x.getValue();
                            if (appState3.getRouteSimMode() == SimMode.CUSTOM) {
                                speedMs = appState3.getCustomSpeedMs();
                            } else {
                                speedMs = appState3.getRouteSimMode().getSpeedMs();
                            }
                            dValueOf = Double.valueOf(speedMs);
                            if (speedMs <= 0.0d) {
                                dValueOf = d5;
                            }
                            if (dValueOf != null) {
                                speedMs2 = dValueOf.doubleValue();
                            } else {
                                speedMs2 = SimMode.WALKING.getSpeedMs();
                            }
                            MotionController.SpeedPreset speedPreset7 = new MotionController.SpeedPreset(strName8, (float) speedMs2);
                            ul1Var7 = ul1Var6;
                            MotionController motionController7 = ul1Var7.i;
                            boolean stopAtDestination8 = ((AppState) mutableStateFlow11.getValue()).getStopAtDestination();
                            if (i6 == 0) {
                                z4 = z2;
                            } else {
                                z4 = z3;
                            }
                            mutableStateFlow2 = mutableStateFlow11;
                            i7 = i6;
                            motionController7.onRouteStarted(list8, speedPreset7, stopAtDestination8, j, (96 & 16) != 0 ? false : z4, (96 & 32) != 0 ? SpoofingState.INSTANCE.getRouteLateralDeviation() : false, (96 & 64) != 0 ? SpoofingState.INSTANCE.getRouteLateralSeed() : 0L, (96 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? true : ((AppState) mutableStateFlow11.getValue()).getEnableStepSimulation(), (96 & 256) != 0 ? 165 : ((AppState) mutableStateFlow11.getValue()).getStepCadenceSpm(), (96 & 512) != 0 ? true : ((AppState) mutableStateFlow11.getValue()).isAutoCadence());
                            if (i7 == 0) {
                                LocationRepository.setFloatingJoystickVisible$default(ul1Var7.b, ul1Var7.j, true, false, 4, null);
                            }
                            ul1Var7.b.requireRuntimeAuthorized();
                            while (true) {
                                value3 = mutableStateFlow2.getValue();
                                mutableStateFlow3 = mutableStateFlow2;
                                if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, true, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.RUNNING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1073741825, -513, 134217727, null))) {
                                    on1.b(ul1Var7, (AppState) mutableStateFlow3.getValue());
                                    return mf3.a;
                                }
                                mutableStateFlow2 = mutableStateFlow3;
                            }
                        }
                    }
                    break;
                }
                return obj;
            case 2:
                i2 = ym1Var2.k;
                double d9 = ym1Var2.l;
                i3 = ym1Var2.j;
                cloudAccountState = ym1Var2.i;
                ul1 ul1Var10 = ym1Var2.h;
                routePoint2 = ym1Var2.g;
                appState2 = ym1Var2.f;
                list2 = ym1Var2.e;
                ee0.J(objH);
                d2 = d9;
                ul1Var2 = ul1Var10;
                i = i3;
                value = cloudAccountState;
                routePoint = routePoint2;
                d = d2;
                if (appState2.getMockCell()) {
                    break;
                }
                ul1Var3 = ul1Var2;
                routePoint3 = routePoint;
                list3 = list2;
                d3 = d;
                on1.c(ul1Var3, value);
                double lat13 = routePoint3.getLat();
                double lng13 = routePoint3.getLng();
                ym1Var2.e = list3;
                ym1Var2.f = null;
                ym1Var2.g = routePoint3;
                ym1Var2.h = ul1Var3;
                ym1Var2.i = null;
                ym1Var2.j = i;
                ym1Var2.l = d3;
                ym1Var2.k = i2;
                ym1Var2.o = 5;
                objH = am1.o(ul1Var3, lat13, lng13);
                if (objH != obj) {
                    int i19 = i;
                    i5 = i2;
                    i6 = i19;
                    ul1Var5 = ul1Var3;
                    RoutePoint routePoint14 = routePoint3;
                    md3 md3VarD8 = ig0.D(ul1Var5, (List) objH, routePoint14.getLat(), routePoint14.getLng());
                    mutableStateFlow = ul1Var5.x;
                    str = (String) md3VarD8.e;
                    str2 = (String) md3VarD8.f;
                    str3 = (String) md3VarD8.g;
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value2, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value2, str, str2, str3)));
                    jCurrentTimeMillis = System.currentTimeMillis();
                    SpoofingState spoofingState8 = SpoofingState.INSTANCE;
                    spoofingState8.setStartTimestamp(jCurrentTimeMillis);
                    spoofingState8.setLatitude(routePoint14.getLat());
                    spoofingState8.setLongitude(routePoint14.getLng());
                    spoofingState8.setSimBearing(0.0f);
                    locationRepository = ul1Var5.b;
                    context = ul1Var5.j;
                    lat3 = routePoint14.getLat();
                    lng3 = routePoint14.getLng();
                    if (i6 != 0) {
                        strName = ((AppState) mutableStateFlow.getValue()).getRouteSimMode().name();
                    } else {
                        strName = "STILL";
                    }
                    if (i6 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    appCoordinateSystems = ((AppState) mutableStateFlow.getValue()).getAppCoordinateSystems();
                    collectedWifiJson = ((AppState) mutableStateFlow.getValue()).getCollectedWifiJson();
                    collectedCellJson = ((AppState) mutableStateFlow.getValue()).getCollectedCellJson();
                    collectedBluetoothJson = ((AppState) mutableStateFlow.getValue()).getCollectedBluetoothJson();
                    mockWifi = ((AppState) mutableStateFlow.getValue()).getMockWifi();
                    mockCell = ((AppState) mutableStateFlow.getValue()).getMockCell();
                    mockBluetooth = ((AppState) mutableStateFlow.getValue()).getMockBluetooth();
                    enableJitter = ((AppState) mutableStateFlow.getValue()).getEnableJitter();
                    stopAtDestination = ((AppState) mutableStateFlow.getValue()).getStopAtDestination();
                    enableStepSimulation = ((AppState) mutableStateFlow.getValue()).getEnableStepSimulation();
                    stepCadenceSpm = ((AppState) mutableStateFlow.getValue()).getStepCadenceSpm();
                    zIsAutoCadence = ((AppState) mutableStateFlow.getValue()).isAutoCadence();
                    ym1Var2.e = list3;
                    ym1Var2.f = null;
                    ym1Var2.g = null;
                    ym1Var2.h = ul1Var5;
                    ym1Var2.i = null;
                    ym1Var2.j = i6;
                    ym1Var2.l = d3;
                    ym1Var2.k = i5;
                    ym1Var2.m = jCurrentTimeMillis;
                    ym1Var2.o = 6;
                    d5 = null;
                    z2 = true;
                    d6 = d3;
                    list7 = list3;
                    z3 = false;
                    if (locationRepository.startSpoofing(context, lat3, lng3, strName, 0.0f, jCurrentTimeMillis, list7, z, appCoordinateSystems, collectedWifiJson, collectedCellJson, collectedBluetoothJson, mockWifi, mockCell, mockBluetooth, enableJitter, d6, stopAtDestination, enableStepSimulation, stepCadenceSpm, zIsAutoCadence, ym1Var2) == obj) {
                        return obj;
                    }
                    j = jCurrentTimeMillis;
                    list8 = list7;
                    ul1Var6 = ul1Var5;
                    MutableStateFlow mutableStateFlow12 = ul1Var6.x;
                    String strName9 = ((AppState) mutableStateFlow12.getValue()).getRouteSimMode().name();
                    appState3 = (AppState) ul1Var6.x.getValue();
                    if (appState3.getRouteSimMode() == SimMode.CUSTOM) {
                        speedMs = appState3.getCustomSpeedMs();
                    } else {
                        speedMs = appState3.getRouteSimMode().getSpeedMs();
                    }
                    dValueOf = Double.valueOf(speedMs);
                    if (speedMs <= 0.0d) {
                        dValueOf = d5;
                    }
                    if (dValueOf != null) {
                        speedMs2 = dValueOf.doubleValue();
                    } else {
                        speedMs2 = SimMode.WALKING.getSpeedMs();
                    }
                    MotionController.SpeedPreset speedPreset8 = new MotionController.SpeedPreset(strName9, (float) speedMs2);
                    ul1Var7 = ul1Var6;
                    MotionController motionController8 = ul1Var7.i;
                    boolean stopAtDestination9 = ((AppState) mutableStateFlow12.getValue()).getStopAtDestination();
                    if (i6 == 0) {
                        z4 = z2;
                    } else {
                        z4 = z3;
                    }
                    mutableStateFlow2 = mutableStateFlow12;
                    i7 = i6;
                    motionController8.onRouteStarted(list8, speedPreset8, stopAtDestination9, j, (96 & 16) != 0 ? false : z4, (96 & 32) != 0 ? SpoofingState.INSTANCE.getRouteLateralDeviation() : false, (96 & 64) != 0 ? SpoofingState.INSTANCE.getRouteLateralSeed() : 0L, (96 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? true : ((AppState) mutableStateFlow12.getValue()).getEnableStepSimulation(), (96 & 256) != 0 ? 165 : ((AppState) mutableStateFlow12.getValue()).getStepCadenceSpm(), (96 & 512) != 0 ? true : ((AppState) mutableStateFlow12.getValue()).isAutoCadence());
                    if (i7 == 0) {
                        LocationRepository.setFloatingJoystickVisible$default(ul1Var7.b, ul1Var7.j, true, false, 4, null);
                    }
                    ul1Var7.b.requireRuntimeAuthorized();
                    while (true) {
                        value3 = mutableStateFlow2.getValue();
                        mutableStateFlow3 = mutableStateFlow2;
                        if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, true, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.RUNNING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1073741825, -513, 134217727, null))) {
                            on1.b(ul1Var7, (AppState) mutableStateFlow3.getValue());
                            return mf3.a;
                        }
                        mutableStateFlow2 = mutableStateFlow3;
                    }
                }
                return obj;
            case 3:
                i2 = ym1Var2.k;
                double d10 = ym1Var2.l;
                int i20 = ym1Var2.j;
                CloudAccountState cloudAccountState4 = ym1Var2.i;
                ul1 ul1Var11 = ym1Var2.h;
                RoutePoint routePoint15 = ym1Var2.g;
                List list9 = ym1Var2.e;
                ee0.J(objH);
                i = i20;
                list4 = list9;
                d3 = d10;
                value = cloudAccountState4;
                ul1Var2 = ul1Var11;
                routePoint = routePoint15;
                if (((Boolean) objH).booleanValue()) {
                    lat2 = routePoint.getLat();
                    lng2 = routePoint.getLng();
                    ym1Var2.e = list4;
                    ym1Var2.f = null;
                    ym1Var2.g = routePoint;
                    ym1Var2.h = ul1Var2;
                    ym1Var2.i = value;
                    ym1Var2.j = i;
                    ym1Var2.l = d3;
                    ym1Var2.k = i2;
                    ym1Var2.o = 4;
                    list5 = list4;
                    if (rm1.c(ul1Var2, lat2, lng2, ym1Var2) != obj) {
                        i4 = i;
                        ul1Var4 = ul1Var2;
                        routePoint4 = routePoint;
                        d4 = d3;
                        cloudAccountState2 = value;
                        list6 = list5;
                        value = cloudAccountState2;
                        ul1Var3 = ul1Var4;
                        routePoint3 = routePoint4;
                        list3 = list6;
                        d3 = d4;
                        i = i4;
                        on1.c(ul1Var3, value);
                        double lat14 = routePoint3.getLat();
                        double lng14 = routePoint3.getLng();
                        ym1Var2.e = list3;
                        ym1Var2.f = null;
                        ym1Var2.g = routePoint3;
                        ym1Var2.h = ul1Var3;
                        ym1Var2.i = null;
                        ym1Var2.j = i;
                        ym1Var2.l = d3;
                        ym1Var2.k = i2;
                        ym1Var2.o = 5;
                        objH = am1.o(ul1Var3, lat14, lng14);
                        if (objH != obj) {
                            int i110 = i;
                            i5 = i2;
                            i6 = i110;
                            ul1Var5 = ul1Var3;
                            RoutePoint routePoint16 = routePoint3;
                            md3 md3VarD9 = ig0.D(ul1Var5, (List) objH, routePoint16.getLat(), routePoint16.getLng());
                            mutableStateFlow = ul1Var5.x;
                            str = (String) md3VarD9.e;
                            str2 = (String) md3VarD9.f;
                            str3 = (String) md3VarD9.g;
                            do {
                                value2 = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.compareAndSet(value2, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value2, str, str2, str3)));
                            jCurrentTimeMillis = System.currentTimeMillis();
                            SpoofingState spoofingState9 = SpoofingState.INSTANCE;
                            spoofingState9.setStartTimestamp(jCurrentTimeMillis);
                            spoofingState9.setLatitude(routePoint16.getLat());
                            spoofingState9.setLongitude(routePoint16.getLng());
                            spoofingState9.setSimBearing(0.0f);
                            locationRepository = ul1Var5.b;
                            context = ul1Var5.j;
                            lat3 = routePoint16.getLat();
                            lng3 = routePoint16.getLng();
                            if (i6 != 0) {
                                strName = ((AppState) mutableStateFlow.getValue()).getRouteSimMode().name();
                            } else {
                                strName = "STILL";
                            }
                            if (i6 != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            appCoordinateSystems = ((AppState) mutableStateFlow.getValue()).getAppCoordinateSystems();
                            collectedWifiJson = ((AppState) mutableStateFlow.getValue()).getCollectedWifiJson();
                            collectedCellJson = ((AppState) mutableStateFlow.getValue()).getCollectedCellJson();
                            collectedBluetoothJson = ((AppState) mutableStateFlow.getValue()).getCollectedBluetoothJson();
                            mockWifi = ((AppState) mutableStateFlow.getValue()).getMockWifi();
                            mockCell = ((AppState) mutableStateFlow.getValue()).getMockCell();
                            mockBluetooth = ((AppState) mutableStateFlow.getValue()).getMockBluetooth();
                            enableJitter = ((AppState) mutableStateFlow.getValue()).getEnableJitter();
                            stopAtDestination = ((AppState) mutableStateFlow.getValue()).getStopAtDestination();
                            enableStepSimulation = ((AppState) mutableStateFlow.getValue()).getEnableStepSimulation();
                            stepCadenceSpm = ((AppState) mutableStateFlow.getValue()).getStepCadenceSpm();
                            zIsAutoCadence = ((AppState) mutableStateFlow.getValue()).isAutoCadence();
                            ym1Var2.e = list3;
                            ym1Var2.f = null;
                            ym1Var2.g = null;
                            ym1Var2.h = ul1Var5;
                            ym1Var2.i = null;
                            ym1Var2.j = i6;
                            ym1Var2.l = d3;
                            ym1Var2.k = i5;
                            ym1Var2.m = jCurrentTimeMillis;
                            ym1Var2.o = 6;
                            d5 = null;
                            z2 = true;
                            d6 = d3;
                            list7 = list3;
                            z3 = false;
                            if (locationRepository.startSpoofing(context, lat3, lng3, strName, 0.0f, jCurrentTimeMillis, list7, z, appCoordinateSystems, collectedWifiJson, collectedCellJson, collectedBluetoothJson, mockWifi, mockCell, mockBluetooth, enableJitter, d6, stopAtDestination, enableStepSimulation, stepCadenceSpm, zIsAutoCadence, ym1Var2) == obj) {
                                return obj;
                            }
                            j = jCurrentTimeMillis;
                            list8 = list7;
                            ul1Var6 = ul1Var5;
                            MutableStateFlow mutableStateFlow13 = ul1Var6.x;
                            String strName10 = ((AppState) mutableStateFlow13.getValue()).getRouteSimMode().name();
                            appState3 = (AppState) ul1Var6.x.getValue();
                            if (appState3.getRouteSimMode() == SimMode.CUSTOM) {
                                speedMs = appState3.getCustomSpeedMs();
                            } else {
                                speedMs = appState3.getRouteSimMode().getSpeedMs();
                            }
                            dValueOf = Double.valueOf(speedMs);
                            if (speedMs <= 0.0d) {
                                dValueOf = d5;
                            }
                            if (dValueOf != null) {
                                speedMs2 = dValueOf.doubleValue();
                            } else {
                                speedMs2 = SimMode.WALKING.getSpeedMs();
                            }
                            MotionController.SpeedPreset speedPreset9 = new MotionController.SpeedPreset(strName10, (float) speedMs2);
                            ul1Var7 = ul1Var6;
                            MotionController motionController9 = ul1Var7.i;
                            boolean stopAtDestination10 = ((AppState) mutableStateFlow13.getValue()).getStopAtDestination();
                            if (i6 == 0) {
                                z4 = z2;
                            } else {
                                z4 = z3;
                            }
                            mutableStateFlow2 = mutableStateFlow13;
                            i7 = i6;
                            motionController9.onRouteStarted(list8, speedPreset9, stopAtDestination10, j, (96 & 16) != 0 ? false : z4, (96 & 32) != 0 ? SpoofingState.INSTANCE.getRouteLateralDeviation() : false, (96 & 64) != 0 ? SpoofingState.INSTANCE.getRouteLateralSeed() : 0L, (96 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? true : ((AppState) mutableStateFlow13.getValue()).getEnableStepSimulation(), (96 & 256) != 0 ? 165 : ((AppState) mutableStateFlow13.getValue()).getStepCadenceSpm(), (96 & 512) != 0 ? true : ((AppState) mutableStateFlow13.getValue()).isAutoCadence());
                            if (i7 == 0) {
                                LocationRepository.setFloatingJoystickVisible$default(ul1Var7.b, ul1Var7.j, true, false, 4, null);
                            }
                            ul1Var7.b.requireRuntimeAuthorized();
                            while (true) {
                                value3 = mutableStateFlow2.getValue();
                                mutableStateFlow3 = mutableStateFlow2;
                                if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, true, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.RUNNING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1073741825, -513, 134217727, null))) {
                                    on1.b(ul1Var7, (AppState) mutableStateFlow3.getValue());
                                    return mf3.a;
                                }
                                mutableStateFlow2 = mutableStateFlow3;
                            }
                        }
                    }
                } else {
                    list3 = list4;
                    ul1Var3 = ul1Var2;
                    routePoint3 = routePoint;
                    on1.c(ul1Var3, value);
                    double lat15 = routePoint3.getLat();
                    double lng15 = routePoint3.getLng();
                    ym1Var2.e = list3;
                    ym1Var2.f = null;
                    ym1Var2.g = routePoint3;
                    ym1Var2.h = ul1Var3;
                    ym1Var2.i = null;
                    ym1Var2.j = i;
                    ym1Var2.l = d3;
                    ym1Var2.k = i2;
                    ym1Var2.o = 5;
                    objH = am1.o(ul1Var3, lat15, lng15);
                    if (objH != obj) {
                        int i111 = i;
                        i5 = i2;
                        i6 = i111;
                        ul1Var5 = ul1Var3;
                        RoutePoint routePoint17 = routePoint3;
                        md3 md3VarD10 = ig0.D(ul1Var5, (List) objH, routePoint17.getLat(), routePoint17.getLng());
                        mutableStateFlow = ul1Var5.x;
                        str = (String) md3VarD10.e;
                        str2 = (String) md3VarD10.f;
                        str3 = (String) md3VarD10.g;
                        do {
                            value2 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value2, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value2, str, str2, str3)));
                        jCurrentTimeMillis = System.currentTimeMillis();
                        SpoofingState spoofingState10 = SpoofingState.INSTANCE;
                        spoofingState10.setStartTimestamp(jCurrentTimeMillis);
                        spoofingState10.setLatitude(routePoint17.getLat());
                        spoofingState10.setLongitude(routePoint17.getLng());
                        spoofingState10.setSimBearing(0.0f);
                        locationRepository = ul1Var5.b;
                        context = ul1Var5.j;
                        lat3 = routePoint17.getLat();
                        lng3 = routePoint17.getLng();
                        if (i6 != 0) {
                            strName = ((AppState) mutableStateFlow.getValue()).getRouteSimMode().name();
                        } else {
                            strName = "STILL";
                        }
                        if (i6 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        appCoordinateSystems = ((AppState) mutableStateFlow.getValue()).getAppCoordinateSystems();
                        collectedWifiJson = ((AppState) mutableStateFlow.getValue()).getCollectedWifiJson();
                        collectedCellJson = ((AppState) mutableStateFlow.getValue()).getCollectedCellJson();
                        collectedBluetoothJson = ((AppState) mutableStateFlow.getValue()).getCollectedBluetoothJson();
                        mockWifi = ((AppState) mutableStateFlow.getValue()).getMockWifi();
                        mockCell = ((AppState) mutableStateFlow.getValue()).getMockCell();
                        mockBluetooth = ((AppState) mutableStateFlow.getValue()).getMockBluetooth();
                        enableJitter = ((AppState) mutableStateFlow.getValue()).getEnableJitter();
                        stopAtDestination = ((AppState) mutableStateFlow.getValue()).getStopAtDestination();
                        enableStepSimulation = ((AppState) mutableStateFlow.getValue()).getEnableStepSimulation();
                        stepCadenceSpm = ((AppState) mutableStateFlow.getValue()).getStepCadenceSpm();
                        zIsAutoCadence = ((AppState) mutableStateFlow.getValue()).isAutoCadence();
                        ym1Var2.e = list3;
                        ym1Var2.f = null;
                        ym1Var2.g = null;
                        ym1Var2.h = ul1Var5;
                        ym1Var2.i = null;
                        ym1Var2.j = i6;
                        ym1Var2.l = d3;
                        ym1Var2.k = i5;
                        ym1Var2.m = jCurrentTimeMillis;
                        ym1Var2.o = 6;
                        d5 = null;
                        z2 = true;
                        d6 = d3;
                        list7 = list3;
                        z3 = false;
                        if (locationRepository.startSpoofing(context, lat3, lng3, strName, 0.0f, jCurrentTimeMillis, list7, z, appCoordinateSystems, collectedWifiJson, collectedCellJson, collectedBluetoothJson, mockWifi, mockCell, mockBluetooth, enableJitter, d6, stopAtDestination, enableStepSimulation, stepCadenceSpm, zIsAutoCadence, ym1Var2) == obj) {
                            return obj;
                        }
                        j = jCurrentTimeMillis;
                        list8 = list7;
                        ul1Var6 = ul1Var5;
                        MutableStateFlow mutableStateFlow14 = ul1Var6.x;
                        String strName11 = ((AppState) mutableStateFlow14.getValue()).getRouteSimMode().name();
                        appState3 = (AppState) ul1Var6.x.getValue();
                        if (appState3.getRouteSimMode() == SimMode.CUSTOM) {
                            speedMs = appState3.getCustomSpeedMs();
                        } else {
                            speedMs = appState3.getRouteSimMode().getSpeedMs();
                        }
                        dValueOf = Double.valueOf(speedMs);
                        if (speedMs <= 0.0d) {
                            dValueOf = d5;
                        }
                        if (dValueOf != null) {
                            speedMs2 = dValueOf.doubleValue();
                        } else {
                            speedMs2 = SimMode.WALKING.getSpeedMs();
                        }
                        MotionController.SpeedPreset speedPreset10 = new MotionController.SpeedPreset(strName11, (float) speedMs2);
                        ul1Var7 = ul1Var6;
                        MotionController motionController10 = ul1Var7.i;
                        boolean stopAtDestination11 = ((AppState) mutableStateFlow14.getValue()).getStopAtDestination();
                        if (i6 == 0) {
                            z4 = z2;
                        } else {
                            z4 = z3;
                        }
                        mutableStateFlow2 = mutableStateFlow14;
                        i7 = i6;
                        motionController10.onRouteStarted(list8, speedPreset10, stopAtDestination11, j, (96 & 16) != 0 ? false : z4, (96 & 32) != 0 ? SpoofingState.INSTANCE.getRouteLateralDeviation() : false, (96 & 64) != 0 ? SpoofingState.INSTANCE.getRouteLateralSeed() : 0L, (96 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? true : ((AppState) mutableStateFlow14.getValue()).getEnableStepSimulation(), (96 & 256) != 0 ? 165 : ((AppState) mutableStateFlow14.getValue()).getStepCadenceSpm(), (96 & 512) != 0 ? true : ((AppState) mutableStateFlow14.getValue()).isAutoCadence());
                        if (i7 == 0) {
                            LocationRepository.setFloatingJoystickVisible$default(ul1Var7.b, ul1Var7.j, true, false, 4, null);
                        }
                        ul1Var7.b.requireRuntimeAuthorized();
                        while (true) {
                            value3 = mutableStateFlow2.getValue();
                            mutableStateFlow3 = mutableStateFlow2;
                            if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, true, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.RUNNING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1073741825, -513, 134217727, null))) {
                                on1.b(ul1Var7, (AppState) mutableStateFlow3.getValue());
                                return mf3.a;
                            }
                            mutableStateFlow2 = mutableStateFlow3;
                        }
                    }
                }
                return obj;
            case 4:
                i2 = ym1Var2.k;
                d4 = ym1Var2.l;
                i4 = ym1Var2.j;
                cloudAccountState2 = ym1Var2.i;
                ul1Var4 = ym1Var2.h;
                routePoint4 = ym1Var2.g;
                list6 = ym1Var2.e;
                ee0.J(objH);
                value = cloudAccountState2;
                ul1Var3 = ul1Var4;
                routePoint3 = routePoint4;
                list3 = list6;
                d3 = d4;
                i = i4;
                on1.c(ul1Var3, value);
                double lat16 = routePoint3.getLat();
                double lng16 = routePoint3.getLng();
                ym1Var2.e = list3;
                ym1Var2.f = null;
                ym1Var2.g = routePoint3;
                ym1Var2.h = ul1Var3;
                ym1Var2.i = null;
                ym1Var2.j = i;
                ym1Var2.l = d3;
                ym1Var2.k = i2;
                ym1Var2.o = 5;
                objH = am1.o(ul1Var3, lat16, lng16);
                if (objH != obj) {
                    int i112 = i;
                    i5 = i2;
                    i6 = i112;
                    ul1Var5 = ul1Var3;
                    RoutePoint routePoint18 = routePoint3;
                    md3 md3VarD11 = ig0.D(ul1Var5, (List) objH, routePoint18.getLat(), routePoint18.getLng());
                    mutableStateFlow = ul1Var5.x;
                    str = (String) md3VarD11.e;
                    str2 = (String) md3VarD11.f;
                    str3 = (String) md3VarD11.g;
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value2, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value2, str, str2, str3)));
                    jCurrentTimeMillis = System.currentTimeMillis();
                    SpoofingState spoofingState11 = SpoofingState.INSTANCE;
                    spoofingState11.setStartTimestamp(jCurrentTimeMillis);
                    spoofingState11.setLatitude(routePoint18.getLat());
                    spoofingState11.setLongitude(routePoint18.getLng());
                    spoofingState11.setSimBearing(0.0f);
                    locationRepository = ul1Var5.b;
                    context = ul1Var5.j;
                    lat3 = routePoint18.getLat();
                    lng3 = routePoint18.getLng();
                    if (i6 != 0) {
                        strName = ((AppState) mutableStateFlow.getValue()).getRouteSimMode().name();
                    } else {
                        strName = "STILL";
                    }
                    if (i6 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    appCoordinateSystems = ((AppState) mutableStateFlow.getValue()).getAppCoordinateSystems();
                    collectedWifiJson = ((AppState) mutableStateFlow.getValue()).getCollectedWifiJson();
                    collectedCellJson = ((AppState) mutableStateFlow.getValue()).getCollectedCellJson();
                    collectedBluetoothJson = ((AppState) mutableStateFlow.getValue()).getCollectedBluetoothJson();
                    mockWifi = ((AppState) mutableStateFlow.getValue()).getMockWifi();
                    mockCell = ((AppState) mutableStateFlow.getValue()).getMockCell();
                    mockBluetooth = ((AppState) mutableStateFlow.getValue()).getMockBluetooth();
                    enableJitter = ((AppState) mutableStateFlow.getValue()).getEnableJitter();
                    stopAtDestination = ((AppState) mutableStateFlow.getValue()).getStopAtDestination();
                    enableStepSimulation = ((AppState) mutableStateFlow.getValue()).getEnableStepSimulation();
                    stepCadenceSpm = ((AppState) mutableStateFlow.getValue()).getStepCadenceSpm();
                    zIsAutoCadence = ((AppState) mutableStateFlow.getValue()).isAutoCadence();
                    ym1Var2.e = list3;
                    ym1Var2.f = null;
                    ym1Var2.g = null;
                    ym1Var2.h = ul1Var5;
                    ym1Var2.i = null;
                    ym1Var2.j = i6;
                    ym1Var2.l = d3;
                    ym1Var2.k = i5;
                    ym1Var2.m = jCurrentTimeMillis;
                    ym1Var2.o = 6;
                    d5 = null;
                    z2 = true;
                    d6 = d3;
                    list7 = list3;
                    z3 = false;
                    if (locationRepository.startSpoofing(context, lat3, lng3, strName, 0.0f, jCurrentTimeMillis, list7, z, appCoordinateSystems, collectedWifiJson, collectedCellJson, collectedBluetoothJson, mockWifi, mockCell, mockBluetooth, enableJitter, d6, stopAtDestination, enableStepSimulation, stepCadenceSpm, zIsAutoCadence, ym1Var2) == obj) {
                        return obj;
                    }
                    j = jCurrentTimeMillis;
                    list8 = list7;
                    ul1Var6 = ul1Var5;
                    MutableStateFlow mutableStateFlow15 = ul1Var6.x;
                    String strName12 = ((AppState) mutableStateFlow15.getValue()).getRouteSimMode().name();
                    appState3 = (AppState) ul1Var6.x.getValue();
                    if (appState3.getRouteSimMode() == SimMode.CUSTOM) {
                        speedMs = appState3.getCustomSpeedMs();
                    } else {
                        speedMs = appState3.getRouteSimMode().getSpeedMs();
                    }
                    dValueOf = Double.valueOf(speedMs);
                    if (speedMs <= 0.0d) {
                        dValueOf = d5;
                    }
                    if (dValueOf != null) {
                        speedMs2 = dValueOf.doubleValue();
                    } else {
                        speedMs2 = SimMode.WALKING.getSpeedMs();
                    }
                    MotionController.SpeedPreset speedPreset11 = new MotionController.SpeedPreset(strName12, (float) speedMs2);
                    ul1Var7 = ul1Var6;
                    MotionController motionController11 = ul1Var7.i;
                    boolean stopAtDestination12 = ((AppState) mutableStateFlow15.getValue()).getStopAtDestination();
                    if (i6 == 0) {
                        z4 = z2;
                    } else {
                        z4 = z3;
                    }
                    mutableStateFlow2 = mutableStateFlow15;
                    i7 = i6;
                    motionController11.onRouteStarted(list8, speedPreset11, stopAtDestination12, j, (96 & 16) != 0 ? false : z4, (96 & 32) != 0 ? SpoofingState.INSTANCE.getRouteLateralDeviation() : false, (96 & 64) != 0 ? SpoofingState.INSTANCE.getRouteLateralSeed() : 0L, (96 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? true : ((AppState) mutableStateFlow15.getValue()).getEnableStepSimulation(), (96 & 256) != 0 ? 165 : ((AppState) mutableStateFlow15.getValue()).getStepCadenceSpm(), (96 & 512) != 0 ? true : ((AppState) mutableStateFlow15.getValue()).isAutoCadence());
                    if (i7 == 0) {
                        LocationRepository.setFloatingJoystickVisible$default(ul1Var7.b, ul1Var7.j, true, false, 4, null);
                    }
                    ul1Var7.b.requireRuntimeAuthorized();
                    while (true) {
                        value3 = mutableStateFlow2.getValue();
                        mutableStateFlow3 = mutableStateFlow2;
                        if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, true, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.RUNNING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1073741825, -513, 134217727, null))) {
                            on1.b(ul1Var7, (AppState) mutableStateFlow3.getValue());
                            return mf3.a;
                        }
                        mutableStateFlow2 = mutableStateFlow3;
                    }
                }
                return obj;
            case Logger.WARN /* 5 */:
                int i21 = ym1Var2.k;
                double d11 = ym1Var2.l;
                int i22 = ym1Var2.j;
                ul1Var3 = ym1Var2.h;
                routePoint3 = ym1Var2.g;
                list3 = ym1Var2.e;
                ee0.J(objH);
                d3 = d11;
                i5 = i21;
                i6 = i22;
                ul1Var5 = ul1Var3;
                RoutePoint routePoint19 = routePoint3;
                md3 md3VarD12 = ig0.D(ul1Var5, (List) objH, routePoint19.getLat(), routePoint19.getLng());
                mutableStateFlow = ul1Var5.x;
                str = (String) md3VarD12.e;
                str2 = (String) md3VarD12.f;
                str3 = (String) md3VarD12.g;
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, EnvironmentAvailabilityKt.withEnvironmentData((AppState) value2, str, str2, str3)));
                jCurrentTimeMillis = System.currentTimeMillis();
                SpoofingState spoofingState12 = SpoofingState.INSTANCE;
                spoofingState12.setStartTimestamp(jCurrentTimeMillis);
                spoofingState12.setLatitude(routePoint19.getLat());
                spoofingState12.setLongitude(routePoint19.getLng());
                spoofingState12.setSimBearing(0.0f);
                locationRepository = ul1Var5.b;
                context = ul1Var5.j;
                lat3 = routePoint19.getLat();
                lng3 = routePoint19.getLng();
                if (i6 != 0) {
                    strName = ((AppState) mutableStateFlow.getValue()).getRouteSimMode().name();
                } else {
                    strName = "STILL";
                }
                if (i6 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                appCoordinateSystems = ((AppState) mutableStateFlow.getValue()).getAppCoordinateSystems();
                collectedWifiJson = ((AppState) mutableStateFlow.getValue()).getCollectedWifiJson();
                collectedCellJson = ((AppState) mutableStateFlow.getValue()).getCollectedCellJson();
                collectedBluetoothJson = ((AppState) mutableStateFlow.getValue()).getCollectedBluetoothJson();
                mockWifi = ((AppState) mutableStateFlow.getValue()).getMockWifi();
                mockCell = ((AppState) mutableStateFlow.getValue()).getMockCell();
                mockBluetooth = ((AppState) mutableStateFlow.getValue()).getMockBluetooth();
                enableJitter = ((AppState) mutableStateFlow.getValue()).getEnableJitter();
                stopAtDestination = ((AppState) mutableStateFlow.getValue()).getStopAtDestination();
                enableStepSimulation = ((AppState) mutableStateFlow.getValue()).getEnableStepSimulation();
                stepCadenceSpm = ((AppState) mutableStateFlow.getValue()).getStepCadenceSpm();
                zIsAutoCadence = ((AppState) mutableStateFlow.getValue()).isAutoCadence();
                ym1Var2.e = list3;
                ym1Var2.f = null;
                ym1Var2.g = null;
                ym1Var2.h = ul1Var5;
                ym1Var2.i = null;
                ym1Var2.j = i6;
                ym1Var2.l = d3;
                ym1Var2.k = i5;
                ym1Var2.m = jCurrentTimeMillis;
                ym1Var2.o = 6;
                d5 = null;
                z2 = true;
                d6 = d3;
                list7 = list3;
                z3 = false;
                if (locationRepository.startSpoofing(context, lat3, lng3, strName, 0.0f, jCurrentTimeMillis, list7, z, appCoordinateSystems, collectedWifiJson, collectedCellJson, collectedBluetoothJson, mockWifi, mockCell, mockBluetooth, enableJitter, d6, stopAtDestination, enableStepSimulation, stepCadenceSpm, zIsAutoCadence, ym1Var2) == obj) {
                    return obj;
                }
                j = jCurrentTimeMillis;
                list8 = list7;
                ul1Var6 = ul1Var5;
                MutableStateFlow mutableStateFlow16 = ul1Var6.x;
                String strName13 = ((AppState) mutableStateFlow16.getValue()).getRouteSimMode().name();
                appState3 = (AppState) ul1Var6.x.getValue();
                if (appState3.getRouteSimMode() == SimMode.CUSTOM) {
                    speedMs = appState3.getCustomSpeedMs();
                } else {
                    speedMs = appState3.getRouteSimMode().getSpeedMs();
                }
                dValueOf = Double.valueOf(speedMs);
                if (speedMs <= 0.0d) {
                    dValueOf = d5;
                }
                if (dValueOf != null) {
                    speedMs2 = dValueOf.doubleValue();
                } else {
                    speedMs2 = SimMode.WALKING.getSpeedMs();
                }
                MotionController.SpeedPreset speedPreset12 = new MotionController.SpeedPreset(strName13, (float) speedMs2);
                ul1Var7 = ul1Var6;
                MotionController motionController12 = ul1Var7.i;
                boolean stopAtDestination13 = ((AppState) mutableStateFlow16.getValue()).getStopAtDestination();
                if (i6 == 0) {
                    z4 = z2;
                } else {
                    z4 = z3;
                }
                mutableStateFlow2 = mutableStateFlow16;
                i7 = i6;
                motionController12.onRouteStarted(list8, speedPreset12, stopAtDestination13, j, (96 & 16) != 0 ? false : z4, (96 & 32) != 0 ? SpoofingState.INSTANCE.getRouteLateralDeviation() : false, (96 & 64) != 0 ? SpoofingState.INSTANCE.getRouteLateralSeed() : 0L, (96 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? true : ((AppState) mutableStateFlow16.getValue()).getEnableStepSimulation(), (96 & 256) != 0 ? 165 : ((AppState) mutableStateFlow16.getValue()).getStepCadenceSpm(), (96 & 512) != 0 ? true : ((AppState) mutableStateFlow16.getValue()).isAutoCadence());
                if (i7 == 0) {
                    LocationRepository.setFloatingJoystickVisible$default(ul1Var7.b, ul1Var7.j, true, false, 4, null);
                }
                ul1Var7.b.requireRuntimeAuthorized();
                while (true) {
                    value3 = mutableStateFlow2.getValue();
                    mutableStateFlow3 = mutableStateFlow2;
                    if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, true, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.RUNNING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1073741825, -513, 134217727, null))) {
                        on1.b(ul1Var7, (AppState) mutableStateFlow3.getValue());
                        return mf3.a;
                    }
                    mutableStateFlow2 = mutableStateFlow3;
                }
                break;
            case Logger.ERROR /* 6 */:
                long j2 = ym1Var2.m;
                i6 = ym1Var2.j;
                ul1 ul1Var12 = ym1Var2.h;
                List list10 = ym1Var2.e;
                ee0.J(objH);
                list8 = list10;
                j = j2;
                ul1Var6 = ul1Var12;
                z3 = false;
                z2 = true;
                d5 = null;
                MutableStateFlow mutableStateFlow17 = ul1Var6.x;
                String strName14 = ((AppState) mutableStateFlow17.getValue()).getRouteSimMode().name();
                appState3 = (AppState) ul1Var6.x.getValue();
                if (appState3.getRouteSimMode() == SimMode.CUSTOM) {
                    speedMs = appState3.getCustomSpeedMs();
                } else {
                    speedMs = appState3.getRouteSimMode().getSpeedMs();
                }
                dValueOf = Double.valueOf(speedMs);
                if (speedMs <= 0.0d) {
                    dValueOf = d5;
                }
                if (dValueOf != null) {
                    speedMs2 = dValueOf.doubleValue();
                } else {
                    speedMs2 = SimMode.WALKING.getSpeedMs();
                }
                MotionController.SpeedPreset speedPreset13 = new MotionController.SpeedPreset(strName14, (float) speedMs2);
                ul1Var7 = ul1Var6;
                MotionController motionController13 = ul1Var7.i;
                boolean stopAtDestination14 = ((AppState) mutableStateFlow17.getValue()).getStopAtDestination();
                if (i6 == 0) {
                    z4 = z2;
                } else {
                    z4 = z3;
                }
                mutableStateFlow2 = mutableStateFlow17;
                i7 = i6;
                motionController13.onRouteStarted(list8, speedPreset13, stopAtDestination14, j, (96 & 16) != 0 ? false : z4, (96 & 32) != 0 ? SpoofingState.INSTANCE.getRouteLateralDeviation() : false, (96 & 64) != 0 ? SpoofingState.INSTANCE.getRouteLateralSeed() : 0L, (96 & WorkQueueKt.BUFFER_CAPACITY) != 0 ? true : ((AppState) mutableStateFlow17.getValue()).getEnableStepSimulation(), (96 & 256) != 0 ? 165 : ((AppState) mutableStateFlow17.getValue()).getStepCadenceSpm(), (96 & 512) != 0 ? true : ((AppState) mutableStateFlow17.getValue()).isAutoCadence());
                if (i7 == 0) {
                    LocationRepository.setFloatingJoystickVisible$default(ul1Var7.b, ul1Var7.j, true, false, 4, null);
                }
                ul1Var7.b.requireRuntimeAuthorized();
                while (true) {
                    value3 = mutableStateFlow2.getValue();
                    mutableStateFlow3 = mutableStateFlow2;
                    if (mutableStateFlow3.compareAndSet(value3, AppState.copy$default((AppState) value3, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, true, null, null, 0, null, null, null, null, 0.0f, null, null, RoutePlanStage.RUNNING, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -1073741825, -513, 134217727, null))) {
                        on1.b(ul1Var7, (AppState) mutableStateFlow3.getValue());
                        return mf3.a;
                    }
                    mutableStateFlow2 = mutableStateFlow3;
                }
                break;
            default:
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
