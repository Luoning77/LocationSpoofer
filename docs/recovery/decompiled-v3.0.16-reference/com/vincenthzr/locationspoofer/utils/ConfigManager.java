package com.vincenthzr.locationspoofer.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.SystemClock;
import android.util.Log;
import com.vincenthzr.locationspoofer.data.cloud.CloudAddress;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoSource;
import com.vincenthzr.locationspoofer.data.cloud.CloudPlaceDetails;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import com.vincenthzr.locationspoofer.data.state.SpoofingState;
import defpackage.at0;
import defpackage.bh2;
import defpackage.ch2;
import defpackage.d31;
import defpackage.d6;
import defpackage.e40;
import defpackage.ee0;
import defpackage.fo;
import defpackage.g6;
import defpackage.h40;
import defpackage.i40;
import defpackage.j40;
import defpackage.k;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.ot0;
import defpackage.p00;
import defpackage.q60;
import defpackage.t3;
import defpackage.tt2;
import defpackage.vl0;
import defpackage.vm3;
import defpackage.wg2;
import defpackage.wi2;
import defpackage.xq1;
import defpackage.yd;
import defpackage.z60;
import defpackage.z70;
import io.github.libxposed.service.XposedService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ConfigManager {
    private final MutableSharedFlow<mf3> _writeFailures;
    private final CloudGeoRepository cloudGeo;
    private final Context context;
    private Job geocodeJob;
    private final ch2 geocodeState;
    private volatile JSONObject lastJson;
    private long nextCleanupAttemptAt;
    private final ot0 publication;
    private final at0 publisher;
    private final wi2 rootManager;
    private final RuntimeAuthorizationManager runtimeAuthorization;
    private final CoroutineScope scope;
    private final tt2 settingsManager;
    private final SharedPreferences transportPrefs;
    private final SharedFlow<mf3> writeFailures;
    private final Mutex writeMutex;

    public ConfigManager(Context context, wi2 wi2Var, RuntimeAuthorizationManager runtimeAuthorizationManager, CloudGeoRepository cloudGeoRepository) {
        Object wg2Var;
        JSONObject jSONObject;
        context.getClass();
        wi2Var.getClass();
        runtimeAuthorizationManager.getClass();
        cloudGeoRepository.getClass();
        this.context = context;
        this.rootManager = wi2Var;
        this.runtimeAuthorization = runtimeAuthorizationManager;
        this.cloudGeo = cloudGeoRepository;
        this.settingsManager = new tt2(context);
        this.geocodeState = new ch2(new e40(0));
        q60 q60Var = null;
        MutableSharedFlow<mf3> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, null);
        this._writeFailures = mutableSharedFlowMutableSharedFlow$default;
        this.writeFailures = mutableSharedFlowMutableSharedFlow$default;
        this.writeMutex = MutexKt.Mutex$default(false, 1, null);
        SharedPreferences sharedPreferences = context.getSharedPreferences("framework_config_state", 0);
        this.transportPrefs = sharedPreferences;
        at0 at0Var = new at0();
        at0Var.a = true;
        this.publisher = at0Var;
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        String string = sharedPreferences.getString("desired_config", null);
        if (string != null) {
            try {
                JSONObject jSONObjectPut = new JSONObject(string).put("active", false);
                jSONObjectPut.remove("runtime_permit");
                jSONObjectPut.remove("runtime_binding");
                wg2Var = jSONObjectPut;
            } catch (Throwable th) {
                wg2Var = new wg2(th);
            }
            jSONObject = (JSONObject) (wg2Var instanceof wg2 ? null : wg2Var);
        } else {
            jSONObject = null;
        }
        this.lastJson = jSONObject;
        ot0 ot0Var = new ot0();
        if (this.lastJson != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (ot0Var.a == null) {
                ot0Var.a = Long.valueOf(jElapsedRealtime);
            }
        }
        this.publication = ot0Var;
        this.runtimeAuthorization.registerStopHandler("config-publisher", new g6(this, null));
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new k(this, q60Var, 12), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new d6(this, q60Var, 2), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new t3(this, q60Var, 5), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String geoEngine(double d, double d2) {
        this.settingsManager.getClass();
        CloudGeoSource cloudGeoSource = CloudGeoSource.FOLLOW_MAP;
        this.settingsManager.getClass();
        return cloudGeoSource.engine("SELF_HOSTED", 0.8293d <= d && d <= 55.8271d && 72.004d <= d2 && d2 <= 137.8347d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double geocodeState$lambda$0(double d, double d2, double d3, double d4) {
        float[] fArr = new float[1];
        Location.distanceBetween(d, d2, d3, d4, fArr);
        return fArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyPublicationFailureIfDue() {
        ot0 ot0Var = this.publication;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = ot0Var.a;
        if (l != null) {
            long jLongValue = l.longValue();
            if (ot0Var.b || jElapsedRealtime - jLongValue < 10000) {
                return;
            }
            ot0Var.b = true;
            this._writeFailures.tryEmit(mf3.a);
            this.cloudGeo.reportFrameworkPublicationFailure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean publishLocked(JSONObject jSONObject, XposedService xposedService) {
        try {
            this.runtimeAuthorization.attach(jSONObject);
            SharedPreferences remotePreferences = xposedService.getRemotePreferences("locationspoofer_config");
            remotePreferences.getClass();
            at0 at0Var = this.publisher;
            String string = jSONObject.toString();
            string.getClass();
            at0Var.a(string, new d31(10, remotePreferences, xposedService));
            ot0 ot0Var = this.publication;
            q60 q60Var = null;
            ot0Var.a = null;
            ot0Var.b = false;
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = 1;
            if (!this.transportPrefs.getBoolean("legacy_files_removed", false) && jCurrentTimeMillis >= this.nextCleanupAttemptAt) {
                this.nextCleanupAttemptAt = jCurrentTimeMillis + 60000;
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new p00(this, q60Var, i), 3, null);
            }
            return true;
        } catch (Exception e) {
            Log.e("LocationSpoofer", "Framework config publication failed", e);
            ot0 ot0Var2 = this.publication;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (ot0Var2.a == null) {
                ot0Var2.a = Long.valueOf(jElapsedRealtime);
            }
            notifyPublicationFailureIfDue();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void putCachedAddress(JSONObject jSONObject, double d, double d2) throws JSONException {
        CloudAddress cloudAddress;
        CloudPlaceDetails details;
        Map<String, String> addressParts;
        ch2 ch2Var = this.geocodeState;
        bh2 bh2Var = ch2Var.d;
        if (bh2Var == null || (cloudAddress = ch2Var.g) == null || !ch2Var.a(bh2Var.b, bh2Var.c, d, d2)) {
            cloudAddress = null;
        }
        String province = cloudAddress != null ? cloudAddress.getProvince() : null;
        if (province == null) {
            province = "";
        }
        jSONObject.put("province", province);
        String city = cloudAddress != null ? cloudAddress.getCity() : null;
        if (city == null) {
            city = "";
        }
        jSONObject.put("city", city);
        String district = cloudAddress != null ? cloudAddress.getDistrict() : null;
        if (district == null) {
            district = "";
        }
        jSONObject.put("district", district);
        String road = cloudAddress != null ? cloudAddress.getRoad() : null;
        if (road == null) {
            road = "";
        }
        jSONObject.put("street", road);
        String str = (cloudAddress == null || (details = cloudAddress.getDetails()) == null || (addressParts = details.getAddressParts()) == null) ? null : addressParts.get("house_number");
        if (str == null) {
            str = "";
        }
        jSONObject.put("streetNum", str);
        String address = cloudAddress != null ? cloudAddress.getAddress() : null;
        if (address == null) {
            address = "";
        }
        jSONObject.put("address", address);
        String country = cloudAddress != null ? cloudAddress.getCountry() : null;
        if (country == null) {
            country = "";
        }
        jSONObject.put("country", country);
        jSONObject.put("poiName", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void putPersistentSettings(JSONObject jSONObject) throws JSONException {
        Object string;
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.settingsManager.e().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        jSONObject.put("system_hook_packages", jSONArray);
        jSONObject.put("system_hook_global_mode", this.settingsManager.b.getBoolean("is_system_hook_global_mode", true));
        SharedPreferences sharedPreferences = this.settingsManager.b;
        Object obj = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        Object string2 = sharedPreferences.getString("vendor_override", DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        if (string2 != null) {
            obj = string2;
        }
        jSONObject.put("vendor_override", obj);
        jSONObject.put("force_location_enabled", this.settingsManager.b.getBoolean("force_location_enabled", false));
        jSONObject.put("debug_dump_system_services", this.settingsManager.b.getBoolean("debug_dump_system_services", false));
        SpoofingState spoofingState = SpoofingState.INSTANCE;
        int realismLevel = spoofingState.getRealismLevel();
        Integer numValueOf = Integer.valueOf(realismLevel);
        if (realismLevel < 0) {
            numValueOf = null;
        }
        jSONObject.put("realism_level", numValueOf != null ? numValueOf.intValue() : this.settingsManager.b.getInt("realism_level", 2));
        int speedFluctuationPct = spoofingState.getSpeedFluctuationPct();
        Integer numValueOf2 = speedFluctuationPct >= 0 ? Integer.valueOf(speedFluctuationPct) : null;
        jSONObject.put("speed_fluctuation_pct", numValueOf2 != null ? numValueOf2.intValue() : this.settingsManager.b.getInt("speed_fluctuation_pct", 10));
        Object obj2 = "";
        if (this.settingsManager.b.getBoolean("use_gait_template", false) && (string = this.settingsManager.b.getString("gait_template", "")) != null) {
            obj2 = string;
        }
        jSONObject.put("gait_template", obj2);
        jSONObject.put("altitude_variation_m", this.settingsManager.b.getInt("altitude_variation_m", 10));
        jSONObject.put("barometer_fluctuation", this.settingsManager.b.getBoolean("barometer_fluctuation", false));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0057  */
    private final void refreshGeocodeIfMoved(double d, double d2) {
        bh2 bh2Var;
        Job job;
        if (RuntimeAuthorizationManager.isAuthorized$default(this.runtimeAuthorization, null, 1, null)) {
            String strGeoEngine = geoEngine(d, d2);
            ch2 ch2Var = this.geocodeState;
            long j = ch2Var.b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            strGeoEngine.getClass();
            String str = ch2Var.h;
            if (str != null && !str.equals(strGeoEngine)) {
                ch2Var.b++;
                ch2Var.d = null;
                ch2Var.e = null;
                ch2Var.f = null;
                ch2Var.g = null;
            }
            ch2Var.h = strGeoEngine;
            ch2Var.e = Double.valueOf(d);
            ch2Var.f = Double.valueOf(d2);
            bh2 bh2Var2 = ch2Var.d;
            if (bh2Var2 == null || !ch2Var.a(bh2Var2.b, bh2Var2.c, d, d2)) {
                ch2Var.b++;
                ch2Var.d = null;
                ch2Var.g = null;
                Long l = ch2Var.c;
                if (l == null || jElapsedRealtime - l.longValue() >= 30000) {
                    ch2Var.c = Long.valueOf(jElapsedRealtime);
                    bh2 bh2Var3 = new bh2(d, d2, ch2Var.b);
                    ch2Var.d = bh2Var3;
                    bh2Var = bh2Var3;
                } else {
                    bh2Var = null;
                }
            } else {
                bh2Var = null;
            }
            if (this.geocodeState.b != j && (job = this.geocodeJob) != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            if (bh2Var == null) {
                return;
            }
            this.geocodeJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new h40(this, d, d2, strGeoEngine, bh2Var, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopGeocode() {
        ch2 ch2Var = this.geocodeState;
        ch2Var.b++;
        ch2Var.d = null;
        ch2Var.e = null;
        ch2Var.f = null;
        ch2Var.g = null;
        Job job = this.geocodeJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.geocodeJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object write(JSONObject jSONObject, q60 q60Var) {
        j40 j40Var;
        Mutex mutex;
        if (q60Var instanceof j40) {
            j40Var = (j40) q60Var;
            int i = j40Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                j40Var.i = i - Integer.MIN_VALUE;
            } else {
                j40Var = new j40(this, q60Var);
            }
        } else {
            j40Var = new j40(this, q60Var);
        }
        Object obj = j40Var.g;
        int i2 = j40Var.i;
        if (i2 == 0) {
            ee0.J(obj);
            mutex = this.writeMutex;
            j40Var.e = jSONObject;
            j40Var.f = mutex;
            j40Var.i = 1;
            Object objLock = mutex.lock(null, j40Var);
            z70 z70Var = z70.e;
            if (objLock == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Mutex mutex2 = j40Var.f;
            JSONObject jSONObject2 = j40Var.e;
            ee0.J(obj);
            mutex = mutex2;
            jSONObject = jSONObject2;
        }
        try {
            return Boolean.valueOf(writeLocked(jSONObject));
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean writeLocked(JSONObject jSONObject) throws Throwable {
        ConfigManager configManager;
        JSONObject jSONObject2;
        vl0 vl0Var = vl0.a;
        vl0.d(jSONObject);
        synchronized (this) {
            try {
                try {
                    if (jSONObject.optBoolean("active", false)) {
                        configManager = this;
                        jSONObject2 = jSONObject;
                        configManager.putCachedAddress(jSONObject2, jSONObject.optDouble("lat"), jSONObject.optDouble("lng"));
                    } else {
                        configManager = this;
                        jSONObject2 = jSONObject;
                        configManager.stopGeocode();
                    }
                    configManager.runtimeAuthorization.attach(jSONObject2);
                    if (!configManager.transportPrefs.edit().putString("desired_config", jSONObject2.toString()).commit()) {
                        configManager._writeFailures.tryEmit(mf3.a);
                        return false;
                    }
                    configManager.lastJson = jSONObject2;
                    ot0 ot0Var = configManager.publication;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (ot0Var.a == null) {
                        ot0Var.a = Long.valueOf(jElapsedRealtime);
                    }
                    vm3 vm3Var = vm3.a;
                    XposedService xposedService = (XposedService) vm3.d.getValue();
                    if (xposedService != null) {
                        return configManager.publishLocked(jSONObject2, xposedService);
                    }
                    Log.w("LocationSpoofer", "Framework disconnected; latest configuration queued");
                    configManager.notifyPublicationFailureIfDue();
                    return false;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                configManager = this;
            }
        }
    }

    public final SharedFlow<mf3> getWriteFailures() {
        return this.writeFailures;
    }

    public final Object patchConfig(lu0 lu0Var, q60 q60Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new yd(this, lu0Var, (q60) null), q60Var);
    }

    public final void putEnvironment(JSONObject jSONObject, String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject2;
        jSONObject.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        try {
            jSONObject2 = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject2 = new JSONObject();
            jSONObject2.put("isConnected", false);
            jSONObject2.put("connectedWifi", JSONObject.NULL);
            jSONObject2.put("nearbyWifi", new JSONArray());
        }
        jSONObject.put("wifi_json", jSONObject2);
        jSONObject.put("cell_json", new JSONArray(str2));
        jSONObject.put("bluetooth_json", new JSONArray(str3));
    }

    public final synchronized void putPosition(JSONObject jSONObject, double d, double d2) {
        jSONObject.getClass();
        refreshGeocodeIfMoved(d, d2);
        putCachedAddress(jSONObject, d, d2);
        z60 z60VarE = xq1.E(d, d2);
        double dSin = (Math.sin(d * 52.35987755982988d) * 2.0E-5d) + Math.sqrt((d * d) + (d2 * d2));
        double dCos = (Math.cos(52.35987755982988d * d2) * 3.0E-6d) + Math.atan2(d, d2);
        double dCos2 = (Math.cos(dCos) * dSin) + 0.0065d;
        double dSin2 = (Math.sin(dCos) * dSin) + 0.006d;
        jSONObject.put("wgs84_lat", z60VarE.a);
        jSONObject.put("wgs84_lng", z60VarE.b);
        jSONObject.put("bd09_lat", dSin2);
        jSONObject.put("bd09_lng", dCos2);
        jSONObject.put("lat", d);
        jSONObject.put("lng", d2);
    }

    public final Object saveConfig(double d, double d2, boolean z, String str, float f, long j, List<RoutePoint> list, boolean z2, String str2, Map<String, String> map, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6, double d3, int i, double d4, boolean z7, boolean z8, int i2, boolean z9, q60 q60Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new i40(z, this, list, d, d2, str, f, d4, j, z2, z7, str2, str3, str4, z3, z4, z5, z6, d3, i, z8, i2, z9, map, null), q60Var);
    }
}
