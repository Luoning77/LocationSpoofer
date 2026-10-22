package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppMapType;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.MapEngine;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.repository.SettingsRepository;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nl1 implements FlowCollector {
    public final /* synthetic */ ul1 e;
    public final /* synthetic */ CoroutineScope f;

    public nl1(ul1 ul1Var, CoroutineScope coroutineScope) {
        this.e = ul1Var;
        this.f = coroutineScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        Object value;
        AppState appState;
        List<SavedLocation> savedLocations;
        String language;
        boolean zIsLanguageSet;
        Object wg2Var;
        AppMapType appMapType;
        Object wg2Var2;
        MapEngine mapEngine;
        Map<String, String> appCoordinateSystems;
        Set<String> systemHookPackages;
        boolean mockWifi;
        boolean mockCell;
        boolean mockBluetooth;
        boolean enableJitter;
        boolean restartAppsOnSpoof;
        String altitude;
        int altitudeVariationM;
        String satelliteCount;
        boolean barometerFluctuation;
        boolean fixedJoystickEnabled;
        boolean routeLateralDeviation;
        int realismLevel;
        int speedFluctuationPct;
        boolean keepLastMapPosition;
        boolean forceLocationEnabled;
        boolean useGaitTemplate;
        Integer num;
        hv0 hv0VarB;
        ul1 ul1Var = this.e;
        MutableStateFlow mutableStateFlow = ul1Var.x;
        do {
            value = mutableStateFlow.getValue();
            appState = (AppState) value;
            SettingsRepository settingsRepository = ul1Var.c;
            savedLocations = settingsRepository.getSavedLocations();
            language = settingsRepository.getLanguage();
            zIsLanguageSet = settingsRepository.isLanguageSet();
            try {
                wg2Var = AppMapType.valueOf(settingsRepository.getMapType());
            } catch (Throwable th) {
                wg2Var = new wg2(th);
            }
            Object mapType = appState.getMapType();
            if (wg2Var instanceof wg2) {
                wg2Var = mapType;
            }
            appMapType = (AppMapType) wg2Var;
            try {
                wg2Var2 = MapEngine.Companion.fromStored(settingsRepository.getMapEngine());
            } catch (Throwable th2) {
                wg2Var2 = new wg2(th2);
            }
            Object mapEngine2 = appState.getMapEngine();
            if (wg2Var2 instanceof wg2) {
                wg2Var2 = mapEngine2;
            }
            mapEngine = (MapEngine) wg2Var2;
            appCoordinateSystems = settingsRepository.getAppCoordinateSystems();
            systemHookPackages = settingsRepository.getSystemHookPackages();
            mockWifi = settingsRepository.getMockWifi();
            mockCell = settingsRepository.getMockCell();
            mockBluetooth = settingsRepository.getMockBluetooth();
            enableJitter = settingsRepository.getEnableJitter();
            restartAppsOnSpoof = settingsRepository.getRestartAppsOnSpoof();
            altitude = settingsRepository.getAltitude();
            altitudeVariationM = settingsRepository.getAltitudeVariationM();
            satelliteCount = settingsRepository.getSatelliteCount();
            barometerFluctuation = settingsRepository.getBarometerFluctuation();
            fixedJoystickEnabled = settingsRepository.getFixedJoystickEnabled();
            routeLateralDeviation = settingsRepository.getRouteLateralDeviation();
            realismLevel = settingsRepository.getRealismLevel();
            speedFluctuationPct = settingsRepository.getSpeedFluctuationPct();
            keepLastMapPosition = settingsRepository.getKeepLastMapPosition();
            forceLocationEnabled = settingsRepository.getForceLocationEnabled();
            useGaitTemplate = settingsRepository.getUseGaitTemplate();
            hv0 hv0VarB2 = wc0.B(settingsRepository.getGaitTemplate());
            num = hv0VarB2 != null ? new Integer(hv0VarB2.d) : null;
            hv0VarB = wc0.B(settingsRepository.getGaitTemplate());
        } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default(appState, appMapType, mapEngine, null, false, zIsLanguageSet, language, false, null, null, false, fixedJoystickEnabled, routeLateralDeviation, null, realismLevel, barometerFluctuation, speedFluctuationPct, num, hv0VarB != null ? hv0VarB.e : 0, useGaitTemplate, null, keepLastMapPosition, false, null, false, null, false, null, null, false, false, false, null, null, 0, savedLocations, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, appCoordinateSystems, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, systemHookPackages, false, forceLocationEnabled, null, false, null, null, null, mockWifi, mockCell, mockBluetooth, enableJitter, restartAppsOnSpoof, altitude, altitudeVariationM, satelliteCount, false, false, false, null, null, -1567796, -8388613, 130039487, null)));
        return mf3.a;
    }
}
