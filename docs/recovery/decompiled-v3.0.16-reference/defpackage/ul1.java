package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoSource;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeOperationCoordinator;
import com.vincenthzr.locationspoofer.data.db.EnvironmentDao;
import com.vincenthzr.locationspoofer.data.model.AppMapType;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.MapEngine;
import com.vincenthzr.locationspoofer.data.model.RootSolution;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import com.vincenthzr.locationspoofer.data.repository.SettingsRepository;
import com.vincenthzr.locationspoofer.data.repository.WifiRepository;
import com.vincenthzr.locationspoofer.data.sharing.RadioSharingManager;
import com.vincenthzr.locationspoofer.data.state.SpoofingState;
import com.vincenthzr.locationspoofer.data.sync.AccountSyncManager;
import com.vincenthzr.locationspoofer.utils.LSPosedManager;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ul1 extends hj3 {
    public final StateFlow A;
    public Job B;
    public Job C;
    public long D;
    public Long E;
    public final Mutex F;
    public Long G;
    public double H;
    public double I;
    public final LocationRepository b;
    public final SettingsRepository c;
    public final LSPosedManager d;
    public final ul0 e;
    public final EnvironmentDao f;
    public final WifiRepository g;
    public final j22 h;
    public final MotionController i;
    public final Context j;
    public final CloudGeoRepository k;
    public final RadioSharingManager l;
    public final AccountSyncManager m;
    public long n;
    public Job o;
    public Job p;
    public Job q;
    public Job r;
    public Job s;
    public final RuntimeOperationCoordinator t = new RuntimeOperationCoordinator(am1.y(this));
    public final String u = p91.l(System.identityHashCode(this), "main-viewmodel-");
    public final StateFlow v;
    public final StateFlow w;
    public final MutableStateFlow x;
    public final StateFlow y;
    public final MutableStateFlow z;

    public ul1(LocationRepository locationRepository, SettingsRepository settingsRepository, LSPosedManager lSPosedManager, ul0 ul0Var, EnvironmentDao environmentDao, WifiRepository wifiRepository, j22 j22Var, MotionController motionController, Context context, CloudGeoRepository cloudGeoRepository, RadioSharingManager radioSharingManager, AccountSyncManager accountSyncManager) {
        AppMapType appMapTypeValueOf;
        MapEngine mapEngineFromStored;
        RootSolution rootSolutionValueOf;
        q60 q60Var;
        Object next;
        Object value;
        AppState appStateA;
        boolean zBooleanValue;
        SpoofingState spoofingState;
        Object value2;
        this.b = locationRepository;
        this.c = settingsRepository;
        this.d = lSPosedManager;
        this.e = ul0Var;
        this.f = environmentDao;
        this.g = wifiRepository;
        this.h = j22Var;
        this.i = motionController;
        this.j = context;
        this.k = cloudGeoRepository;
        this.l = radioSharingManager;
        this.m = accountSyncManager;
        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(environmentDao.observeCollectionRoutes());
        ey eyVarY = am1.y(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharingStarted eagerly = companion.getEagerly();
        uj0 uj0Var = uj0.e;
        this.v = FlowKt.stateIn(flowDistinctUntilChanged, eyVarY, eagerly, uj0Var);
        this.w = FlowKt.stateIn(FlowKt.distinctUntilChanged(environmentDao.observeAllCompleteLocations()), am1.y(this), companion.getEagerly(), uj0Var);
        try {
            appMapTypeValueOf = AppMapType.valueOf(settingsRepository.getMapType());
        } catch (Exception unused) {
            appMapTypeValueOf = AppMapType.NORMAL;
        }
        AppMapType appMapType = appMapTypeValueOf;
        try {
            mapEngineFromStored = MapEngine.Companion.fromStored(this.c.getMapEngine());
        } catch (Exception unused2) {
            mapEngineFromStored = MapEngine.SELF_HOSTED;
        }
        MapEngine mapEngine = mapEngineFromStored;
        try {
            rootSolutionValueOf = RootSolution.valueOf(this.c.getRootSolution());
        } catch (Exception unused3) {
            rootSolutionValueOf = RootSolution.AUTO;
        }
        RootSolution rootSolution = rootSolutionValueOf;
        CloudGeoSource geoSearchSource = this.c.getGeoSearchSource();
        String vendorOverride = this.c.getVendorOverride();
        ei3.f.getClass();
        Iterator it = ei3.i.iterator();
        do {
            q60Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ei3) next).e.equals(vendorOverride));
        ei3 ei3Var = (ei3) next;
        ei3 ei3Var2 = ei3Var == null ? ei3.g : ei3Var;
        boolean debugDumpSystemServices = this.c.getDebugDumpSystemServices();
        boolean fixedJoystickEnabled = this.c.getFixedJoystickEnabled();
        boolean routeLateralDeviation = this.c.getRouteLateralDeviation();
        int realismLevel = this.c.getRealismLevel();
        boolean barometerFluctuation = this.c.getBarometerFluctuation();
        int speedFluctuationPct = this.c.getSpeedFluctuationPct();
        hv0 hv0VarB = wc0.B(this.c.getGaitTemplate());
        Integer numValueOf = hv0VarB != null ? Integer.valueOf(hv0VarB.d) : null;
        hv0 hv0VarB2 = wc0.B(this.c.getGaitTemplate());
        int i = 0;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new AppState(appMapType, mapEngine, geoSearchSource, false, this.c.isLanguageSet(), this.c.getLanguage(), false, rootSolution, ei3Var2, debugDumpSystemServices, fixedJoystickEnabled, routeLateralDeviation, null, realismLevel, barometerFluctuation, speedFluctuationPct, numValueOf, hv0VarB2 != null ? hv0VarB2.e : 0, this.c.getUseGaitTemplate(), null, this.c.getKeepLastMapPosition(), false, null, false, null, false, null, null, false, false, false, null, null, 0, this.c.getSavedLocations(), null, null, null, 0.0f, uj0Var, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, this.c.getAppCoordinateSystems(), false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, this.c.getSystemHookPackages(), this.c.isSystemHookGlobalMode(), this.c.getForceLocationEnabled(), null, false, null, null, null, this.c.getMockWifi(), this.c.getMockCell(), this.c.getMockBluetooth(), this.c.getEnableJitter(), this.c.getRestartAppsOnSpoof(), this.c.getAltitude(), this.c.getAltitudeVariationM(), this.c.getSatelliteCount(), false, false, false, null, null, -1568696, -8388741, 130039359, null));
        this.x = MutableStateFlow;
        this.y = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new uz2(false, false, false, false, false, "", uj0Var, false, "", 0L));
        this.z = MutableStateFlow2;
        this.A = FlowKt.asStateFlow(MutableStateFlow2);
        this.b.registerRuntimeStopSignal(this.u, new m6(this, 6));
        MotionController motionController2 = this.i;
        LocationRepository locationRepository2 = this.b;
        BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new sl1(this, q60Var, 6), 3, null);
        SettingsRepository settingsRepository2 = this.c;
        i52 lastMapPosition = settingsRepository2.getKeepLastMapPosition() ? settingsRepository2.getLastMapPosition() : null;
        if (lastMapPosition != null) {
            do {
                value2 = MutableStateFlow.getValue();
            } while (!MutableStateFlow.compareAndSet(value2, AppState.copy$default((AppState) value2, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, (String) lastMapPosition.f, (String) lastMapPosition.e, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -201326593, -1, 134217727, null)));
        }
        we2 we2Var = new we2();
        boolean z = locationRepository2.getHasLiveSimulation() && motionController2.getState().getValue().getActive();
        if (z) {
            do {
                value = MutableStateFlow.getValue();
                AppState appState = (AppState) value;
                appStateA = nk2.a(appState, motionController2.getState().getValue());
                Boolean cachedRootAccess = locationRepository2.getCachedRootAccess();
                zBooleanValue = cachedRootAccess != null ? cachedRootAccess.booleanValue() : appState.getHasRootAccess();
                spoofingState = SpoofingState.INSTANCE;
            } while (!MutableStateFlow.compareAndSet(value, AppState.copy$default(appStateA, null, null, null, false, false, null, zBooleanValue, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, null, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, spoofingState.getWifiJson(), spoofingState.getCellJson(), spoofingState.getBluetoothJson(), false, false, false, false, false, null, 0, null, false, false, false, null, null, -73, -1, 134203391, null)));
        }
        BuildersKt__Builders_commonKt.launch$default(am1.y(this), Dispatchers.getIO(), null, new bn1(this, z ? null : this.t.launch(new g6(we2Var, this, q60Var, 5)), we2Var, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new sl1(this, q60Var, 4), 3, null);
        BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new sl1(this, q60Var, 7), 3, null);
        BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new sl1(this, q60Var, 8), 3, null);
        BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new sl1(this, q60Var, 9), 3, null);
        BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new sl1(this, q60Var, 10), 3, null);
        BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new ol1(this, q60Var, i), 3, null);
        BuildersKt__Builders_commonKt.launch$default(am1.y(this), null, null, new sl1(this, q60Var, i), 3, null);
        this.F = MutexKt.Mutex$default(false, 1, null);
    }

    @Override // defpackage.hj3
    public final void d() {
        this.b.unregisterRuntimeStopHandler(this.u);
    }
}
