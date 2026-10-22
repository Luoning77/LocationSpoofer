package com.vincenthzr.locationspoofer.data.motion;

import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import com.vincenthzr.locationspoofer.data.motion.ConfigMotionSink;
import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import com.vincenthzr.locationspoofer.data.state.SpoofingState;
import com.vincenthzr.locationspoofer.utils.ConfigManager;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.q60;
import defpackage.z70;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ConfigMotionSink implements MotionController.MotionSink {
    private final ConfigManager configManager;
    private final LocationRepository locationRepository;

    public ConfigMotionSink(LocationRepository locationRepository, ConfigManager configManager) {
        locationRepository.getClass();
        configManager.getClass();
        this.locationRepository = locationRepository;
        this.configManager = configManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 writeManual$lambda$0(ConfigMotionSink configMotionSink, double d, double d2, float f, double d3, long j, JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        configMotionSink.configManager.putPosition(jSONObject, d, d2);
        jSONObject.put("is_route_mode", false);
        jSONObject.put("sim_mode", "JOYSTICK");
        jSONObject.put("sim_bearing", f);
        jSONObject.put("speed_m_s", d3);
        jSONObject.put("start_timestamp", j);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 writeRoute$lambda$3(ConfigMotionSink configMotionSink, double d, double d2, JSONArray jSONArray, MotionController.SpeedPreset speedPreset, float f, long j, double d3, boolean z, JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        configMotionSink.configManager.putPosition(jSONObject, d, d2);
        jSONObject.put("is_route_mode", true);
        jSONObject.put("route_points", jSONArray);
        jSONObject.put("sim_mode", speedPreset.getName());
        jSONObject.put("sim_bearing", f);
        jSONObject.put("speed_m_s", speedPreset.getSpeedMs());
        jSONObject.put("start_timestamp", j);
        jSONObject.put("route_distance_offset", d3);
        SpoofingState spoofingState = SpoofingState.INSTANCE;
        jSONObject.put("route_lateral_deviation", spoofingState.getRouteLateralDeviation());
        jSONObject.put("route_lateral_seed", spoofingState.getRouteLateralSeed());
        jSONObject.put("stop_at_destination", z);
        return mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.motion.MotionController.MotionSink
    public Object saveRoute(String str, List<RoutePoint> list, q60 q60Var) {
        Object objInsertSavedRoute = this.locationRepository.insertSavedRoute(str, list, q60Var);
        return objInsertSavedRoute == z70.e ? objInsertSavedRoute : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.motion.MotionController.MotionSink
    public Object writeManual(final double d, final double d2, final float f, final double d3, final long j, q60 q60Var) {
        Object objPatchConfig = this.locationRepository.patchConfig(new lu0() { // from class: k40
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                return ConfigMotionSink.writeManual$lambda$0(this.e, d, d2, f, d3, j, (JSONObject) obj);
            }
        }, q60Var);
        return objPatchConfig == z70.e ? objPatchConfig : mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.data.motion.MotionController.MotionSink
    public Object writeRoute(final double d, final double d2, final float f, final MotionController.SpeedPreset speedPreset, List<RoutePoint> list, final long j, final double d3, final boolean z, q60 q60Var) {
        final JSONArray jSONArray = new JSONArray();
        for (RoutePoint routePoint : list) {
            jSONArray.put(new JSONObject().put("lat", routePoint.getLat()).put("lng", routePoint.getLng()));
        }
        Object objPatchConfig = this.locationRepository.patchConfig(new lu0() { // from class: l40
            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                return ConfigMotionSink.writeRoute$lambda$3(this.e, d, d2, jSONArray, speedPreset, f, j, d3, z, (JSONObject) obj);
            }
        }, q60Var);
        return objPatchConfig == z70.e ? objPatchConfig : mf3.a;
    }
}
