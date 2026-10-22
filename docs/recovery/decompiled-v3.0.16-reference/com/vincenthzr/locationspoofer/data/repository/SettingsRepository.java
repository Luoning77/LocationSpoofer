package com.vincenthzr.locationspoofer.data.repository;

import com.vincenthzr.locationspoofer.data.cloud.CloudGeoSource;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.model.SavedRoute;
import defpackage.fo;
import defpackage.fz;
import defpackage.ge2;
import defpackage.gh0;
import defpackage.i52;
import defpackage.jl1;
import defpackage.l13;
import defpackage.mf3;
import defpackage.rt2;
import defpackage.tt2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SettingsRepository {
    private final tt2 settingsManager;

    public SettingsRepository(tt2 tt2Var) {
        tt2Var.getClass();
        this.settingsManager = tt2Var;
    }

    public final void addSavedLocation(SavedLocation savedLocation) {
        savedLocation.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        ArrayList arrayList = new ArrayList(tt2Var.b());
        fz.c0(arrayList, new jl1(20, tt2Var, savedLocation));
        arrayList.add(savedLocation);
        tt2Var.f(arrayList);
    }

    public final void addSavedRoute(SavedRoute savedRoute) {
        savedRoute.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        ArrayList arrayList = new ArrayList(tt2Var.c());
        arrayList.add(savedRoute);
        tt2Var.g(arrayList);
    }

    public final String getAltitude() {
        String string = this.settingsManager.b.getString("altitude", "0.0");
        return string == null ? "0.0" : string;
    }

    public final int getAltitudeVariationM() {
        return this.settingsManager.b.getInt("altitude_variation_m", 10);
    }

    public final Map<String, String> getAppCoordinateSystems() {
        return this.settingsManager.a();
    }

    public final boolean getBarometerFluctuation() {
        return this.settingsManager.b.getBoolean("barometer_fluctuation", false);
    }

    public final boolean getDebugDumpSystemServices() {
        return this.settingsManager.b.getBoolean("debug_dump_system_services", false);
    }

    public final boolean getEnableJitter() {
        return this.settingsManager.b.getBoolean("enable_jitter", true);
    }

    public final boolean getFixedJoystickEnabled() {
        return this.settingsManager.b.getBoolean("fixed_joystick_enabled", false);
    }

    public final boolean getForceLocationEnabled() {
        return this.settingsManager.b.getBoolean("force_location_enabled", false);
    }

    public final String getGaitTemplate() {
        String string = this.settingsManager.b.getString("gait_template", "");
        return string == null ? "" : string;
    }

    public final CloudGeoSource getGeoSearchSource() {
        this.settingsManager.getClass();
        return CloudGeoSource.FOLLOW_MAP;
    }

    public final String getIgnoredVersion() {
        String string = this.settingsManager.b.getString("ignored_version", "");
        return string == null ? "" : string;
    }

    public final boolean getKeepLastMapPosition() {
        return this.settingsManager.b.getBoolean("keep_last_map_position", true);
    }

    public final String getLanguage() {
        String string = this.settingsManager.b.getString("language", "");
        return string == null ? "" : string;
    }

    public final i52 getLastMapPosition() {
        String string = this.settingsManager.b.getString("last_map_lat", "");
        if (string == null) {
            string = "";
        }
        String string2 = this.settingsManager.b.getString("last_map_lng", "");
        String str = string2 != null ? string2 : "";
        if (l13.k0(string) || l13.k0(str)) {
            return null;
        }
        return new i52(string, str);
    }

    public final String getLastSpoofedLat() {
        String string = this.settingsManager.b.getString("last_spoofed_lat", "0");
        return string == null ? "0" : string;
    }

    public final String getLastSpoofedLng() {
        String string = this.settingsManager.b.getString("last_spoofed_lng", "0");
        return string == null ? "0" : string;
    }

    public final String getMapEngine() {
        this.settingsManager.getClass();
        return "SELF_HOSTED";
    }

    public final String getMapType() {
        this.settingsManager.getClass();
        return "NORMAL";
    }

    public final boolean getMockBluetooth() {
        return this.settingsManager.b.getBoolean("mock_bluetooth", true);
    }

    public final boolean getMockCell() {
        return this.settingsManager.b.getBoolean("mock_cell", true);
    }

    public final boolean getMockWifi() {
        return this.settingsManager.b.getBoolean("mock_wifi", true);
    }

    public final int getRealismLevel() {
        return this.settingsManager.b.getInt("realism_level", 2);
    }

    public final boolean getRestartAppsOnSpoof() {
        return this.settingsManager.b.getBoolean("restart_apps_on_spoof", true);
    }

    public final String getRootSolution() {
        String string = this.settingsManager.b.getString("root_solution", "AUTO");
        return string == null ? "AUTO" : string;
    }

    public final boolean getRouteLateralDeviation() {
        return this.settingsManager.b.getBoolean("route_lateral_deviation", false);
    }

    public final String getSatelliteCount() {
        String string = this.settingsManager.b.getString("satellite_count", "10");
        return string == null ? "10" : string;
    }

    public final List<SavedLocation> getSavedLocations() {
        return this.settingsManager.b();
    }

    public final List<SavedRoute> getSavedRoutes() {
        return this.settingsManager.c();
    }

    public final int getSpeedFluctuationPct() {
        return this.settingsManager.b.getInt("speed_fluctuation_pct", 10);
    }

    public final Set<String> getSystemHookPackages() {
        return this.settingsManager.e();
    }

    public final boolean getUseGaitTemplate() {
        return this.settingsManager.b.getBoolean("use_gait_template", false);
    }

    public final String getVendorOverride() {
        String string = this.settingsManager.b.getString("vendor_override", DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        return string == null ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : string;
    }

    public final boolean isLanguageSet() {
        return gh0.D(this.settingsManager.a);
    }

    public final boolean isSpoofingActive() {
        return this.settingsManager.b.getBoolean("is_spoofing_active", false);
    }

    public final boolean isSystemHookGlobalMode() {
        return this.settingsManager.b.getBoolean("is_system_hook_global_mode", true);
    }

    public final Flow<mf3> observeChanges() {
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        return FlowKt.callbackFlow(new rt2(tt2Var, null, 0));
    }

    public final void removeSavedLocation(SavedLocation savedLocation) {
        savedLocation.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        ArrayList arrayList = new ArrayList(tt2Var.b());
        fz.c0(arrayList, new ge2(savedLocation, 10));
        tt2Var.f(arrayList);
    }

    public final void removeSavedRoute(SavedRoute savedRoute) {
        savedRoute.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        ArrayList arrayList = new ArrayList(tt2Var.c());
        fz.c0(arrayList, new ge2(savedRoute, 11));
        tt2Var.g(arrayList);
    }

    public final void setAltitude(String str) {
        str.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        tt2Var.b.edit().putString("altitude", str).apply();
    }

    public final void setAltitudeVariationM(int i) {
        this.settingsManager.b.edit().putInt("altitude_variation_m", i).apply();
    }

    public final void setAppCoordinateSystems(Map<String, String> map) {
        map.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        tt2Var.b.edit().putString("app_coordinate_systems", jSONObject.toString()).apply();
    }

    public final void setBarometerFluctuation(boolean z) {
        this.settingsManager.b.edit().putBoolean("barometer_fluctuation", z).apply();
    }

    public final void setDebugDumpSystemServices(boolean z) {
        this.settingsManager.b.edit().putBoolean("debug_dump_system_services", z).apply();
    }

    public final void setEnableJitter(boolean z) {
        this.settingsManager.b.edit().putBoolean("enable_jitter", z).apply();
    }

    public final void setFixedJoystickEnabled(boolean z) {
        this.settingsManager.b.edit().putBoolean("fixed_joystick_enabled", z).apply();
    }

    public final void setForceLocationEnabled(boolean z) {
        this.settingsManager.b.edit().putBoolean("force_location_enabled", z).apply();
    }

    public final void setGaitTemplate(String str) {
        str.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        tt2Var.b.edit().putString("gait_template", str).apply();
    }

    public final void setGeoSearchSource(CloudGeoSource cloudGeoSource) {
        cloudGeoSource.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        tt2Var.b.edit().putString("geo_search_source", "FOLLOW_MAP").apply();
    }

    public final void setIgnoredVersion(String str) {
        str.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        tt2Var.b.edit().putString("ignored_version", str).apply();
    }

    public final void setKeepLastMapPosition(boolean z) {
        this.settingsManager.b.edit().putBoolean("keep_last_map_position", z).apply();
    }

    public final void setLanguage(String str) {
        str.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        tt2Var.b.edit().putString("language", str).apply();
    }

    public final void setLanguageSet(boolean z) {
        tt2 tt2Var = this.settingsManager;
        if (!z) {
            tt2Var.getClass();
        } else if (tt2Var.a.getSharedPreferences("installation_state", 0).edit().putBoolean("language_setup_complete", true).commit()) {
            tt2Var.b.edit().putBoolean("is_language_set", true).apply();
        } else {
            fo.n("Check failed.");
        }
    }

    public final void setLastMapPosition(String str, String str2) {
        str.getClass();
        str2.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        tt2Var.b.edit().putString("last_map_lat", str).apply();
        tt2 tt2Var2 = this.settingsManager;
        tt2Var2.getClass();
        tt2Var2.b.edit().putString("last_map_lng", str2).apply();
    }

    public final void setLastSpoofedLat(String str) {
        str.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        tt2Var.b.edit().putString("last_spoofed_lat", str).apply();
    }

    public final void setLastSpoofedLng(String str) {
        str.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        tt2Var.b.edit().putString("last_spoofed_lng", str).apply();
    }

    public final void setMapEngine(String str) {
        str.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        tt2Var.b.edit().putString("map_engine", "SELF_HOSTED").apply();
    }

    public final void setMapType(String str) {
        str.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        tt2Var.b.edit().putString("map_type", "NORMAL").apply();
    }

    public final void setMockBluetooth(boolean z) {
        this.settingsManager.b.edit().putBoolean("mock_bluetooth", z).apply();
    }

    public final void setMockCell(boolean z) {
        this.settingsManager.b.edit().putBoolean("mock_cell", z).apply();
    }

    public final void setMockWifi(boolean z) {
        this.settingsManager.b.edit().putBoolean("mock_wifi", z).apply();
    }

    public final void setRealismLevel(int i) {
        this.settingsManager.b.edit().putInt("realism_level", i).apply();
    }

    public final void setRestartAppsOnSpoof(boolean z) {
        this.settingsManager.b.edit().putBoolean("restart_apps_on_spoof", z).apply();
    }

    public final void setRootSolution(String str) {
        str.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        tt2Var.b.edit().putString("root_solution", str).apply();
    }

    public final void setRouteLateralDeviation(boolean z) {
        this.settingsManager.b.edit().putBoolean("route_lateral_deviation", z).apply();
    }

    public final void setSatelliteCount(String str) {
        str.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        tt2Var.b.edit().putString("satellite_count", str).apply();
    }

    public final void setSavedLocations(List<SavedLocation> list) {
        list.getClass();
        this.settingsManager.f(list);
    }

    public final void setSpeedFluctuationPct(int i) {
        this.settingsManager.b.edit().putInt("speed_fluctuation_pct", i).apply();
    }

    public final void setSpoofingActive(boolean z) {
        this.settingsManager.b.edit().putBoolean("is_spoofing_active", z).apply();
    }

    public final void setSystemHookGlobalMode(boolean z) {
        this.settingsManager.b.edit().putBoolean("is_system_hook_global_mode", z).apply();
    }

    public final void setSystemHookPackages(Set<String> set) {
        set.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        tt2Var.b.edit().putString("system_hook_packages", jSONArray.toString()).apply();
    }

    public final void setUseGaitTemplate(boolean z) {
        this.settingsManager.b.edit().putBoolean("use_gait_template", z).apply();
    }

    public final void setVendorOverride(String str) {
        str.getClass();
        tt2 tt2Var = this.settingsManager;
        tt2Var.getClass();
        tt2Var.b.edit().putString("vendor_override", str).apply();
    }
}
