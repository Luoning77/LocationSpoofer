package com.vincenthzr.locationspoofer.xposed.hooks;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.utils.RouteEngine;
import com.vincenthzr.locationspoofer.xposed.utils.SystemSensorPolicy;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import defpackage.am1;
import defpackage.az;
import defpackage.fo;
import defpackage.fz;
import defpackage.hv0;
import defpackage.i52;
import defpackage.j41;
import defpackage.ji2;
import defpackage.jq1;
import defpackage.k41;
import defpackage.mf3;
import defpackage.mh0;
import defpackage.o51;
import defpackage.pt2;
import defpackage.uj0;
import defpackage.wc0;
import defpackage.wg2;
import defpackage.xg2;
import defpackage.ym2;
import defpackage.yo;
import defpackage.zj0;
import defpackage.zy;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SystemAccelHooker implements AutoCloseable {
    private int[] allowed;
    private Class<?> api;
    private List<SystemSensorPolicy.SensorDescriptor> catalog;
    private Method configure;
    private Method configureSteps;
    private float[] defaultTemplate;
    private double defaultTemplateSpeed;
    private Method diagnostics;
    private Method disable;
    private final SystemAccelHooker$heartbeat$1 heartbeat;
    private boolean heartbeatRegistered;
    private HandlerThread heartbeatThread;
    private String libraryHash;
    private final LocationHooker module;
    private String policy;
    private volatile boolean ready;
    private long refreshAt;
    private long runtimeLogAt;
    private long runtimePublishAt;
    private String runtimePublishedStage;
    private String runtimeStage;
    private String seededPolicy;
    private int[] seededUids;
    private SensorManager sensorManager;
    private float[] template;
    private String templateSource;
    private Method uids;

    /* JADX WARN: Type inference failed for: r3v3, types: [com.vincenthzr.locationspoofer.xposed.hooks.SystemAccelHooker$heartbeat$1] */
    public SystemAccelHooker(LocationHooker locationHooker, Class<?> cls) {
        locationHooker.getClass();
        this.module = locationHooker;
        this.api = cls;
        this.policy = "";
        this.seededPolicy = "";
        this.seededUids = new int[0];
        this.allowed = new int[0];
        this.templateSource = "";
        this.defaultTemplateSpeed = Double.NaN;
        this.runtimeStage = "not-started";
        this.runtimePublishedStage = "";
        this.libraryHash = "";
        this.catalog = uj0.e;
        this.heartbeat = new SensorEventListener() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemAccelHooker$heartbeat$1
            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                sensorEvent.getClass();
            }

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence install$lambda$1(byte b) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
    }

    private final boolean prepareSensorManager() throws NoSuchFieldException {
        if (this.sensorManager != null) {
            return true;
        }
        Context systemContext = SystemHookUtils.INSTANCE.getSystemContext();
        Object systemService = systemContext != null ? systemContext.getSystemService("sensor") : null;
        SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        if (sensorManager == null) {
            return false;
        }
        Field declaredField = Sensor.class.getDeclaredField("mHandle");
        declaredField.setAccessible(true);
        SystemSensorPolicy systemSensorPolicy = SystemSensorPolicy.INSTANCE;
        List<Sensor> sensorList = sensorManager.getSensorList(-1);
        sensorList.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : sensorList) {
            if (yo.H0(new Integer[]{19, 18}).contains(Integer.valueOf(((Sensor) obj).getType()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(az.Y(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Sensor sensor = (Sensor) obj2;
            arrayList2.add(new SystemSensorPolicy.SensorDescriptor(declaredField.getInt(sensor), sensor.getType(), sensor.isWakeUpSensor()));
        }
        List<SystemSensorPolicy.SensorDescriptor> listStepCatalog = systemSensorPolicy.stepCatalog(arrayList2);
        this.catalog = listStepCatalog;
        ArrayList arrayList3 = new ArrayList();
        for (SystemSensorPolicy.SensorDescriptor sensorDescriptor : listStepCatalog) {
            fz.b0(arrayList3, am1.G(Integer.valueOf(sensorDescriptor.getHandle()), Integer.valueOf(sensorDescriptor.getType())));
        }
        int[] iArrI0 = zy.I0(arrayList3);
        Method method = this.configureSteps;
        if (method != null ? o51.f(method.invoke(null, iArrI0), Boolean.TRUE) : false) {
            this.sensorManager = sensorManager;
            return true;
        }
        fo.n("Native step catalog unavailable");
        return false;
    }

    private final void reportRuntime(String str, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Object wg2Var;
        this.runtimeStage = str;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z || !o51.f(this.runtimePublishedStage, str) || (o51.f(str, "running") && jElapsedRealtime >= this.runtimePublishAt)) {
            boolean zF = o51.f(this.runtimePublishedStage, str);
            this.runtimePublishedStage = str;
            this.runtimePublishAt = 5000 + jElapsedRealtime;
            i52 i52Var = new i52("adapter_revision", "20261013-c15-inline2");
            String str2 = this.libraryHash;
            i52 i52Var2 = new i52("library_sha256", str2);
            i52 i52Var3 = new i52("dispatch_path", o51.f(str2, SystemSensorPolicy.COLOROS15_SHA256) ? "inline-and-cache" : "standalone");
            i52 i52Var4 = new i52("stage", this.runtimeStage);
            i52 i52Var5 = new i52("heartbeat_registered", String.valueOf(this.heartbeatRegistered));
            i52 i52Var6 = new i52("target_uid_count", String.valueOf(this.allowed.length));
            List<SystemSensorPolicy.SensorDescriptor> list = this.catalog;
            int i5 = 0;
            if (list == null || !list.isEmpty()) {
                i = 0;
                for (SystemSensorPolicy.SensorDescriptor sensorDescriptor : list) {
                    if (sensorDescriptor.getType() == 19 && !sensorDescriptor.getWakeUp() && (i = i + 1) < 0) {
                        am1.W();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            i52 i52Var7 = new i52("counter_non_wakeup", String.valueOf(i));
            List<SystemSensorPolicy.SensorDescriptor> list2 = this.catalog;
            if (list2 == null || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    SystemSensorPolicy.SensorDescriptor sensorDescriptor2 = (SystemSensorPolicy.SensorDescriptor) it.next();
                    Iterator it2 = it;
                    long j = jElapsedRealtime;
                    if (sensorDescriptor2.getType() == 19 && sensorDescriptor2.getWakeUp() && (i2 = i2 + 1) < 0) {
                        am1.W();
                        throw null;
                    }
                    it = it2;
                    jElapsedRealtime = j;
                }
            } else {
                i2 = 0;
            }
            long j2 = jElapsedRealtime;
            i52 i52Var8 = new i52("counter_wakeup", String.valueOf(i2));
            List<SystemSensorPolicy.SensorDescriptor> list3 = this.catalog;
            if (list3 == null || !list3.isEmpty()) {
                Iterator it3 = list3.iterator();
                i3 = 0;
                while (it3.hasNext()) {
                    SystemSensorPolicy.SensorDescriptor sensorDescriptor3 = (SystemSensorPolicy.SensorDescriptor) it3.next();
                    Iterator it4 = it3;
                    if (sensorDescriptor3.getType() == 18 && !sensorDescriptor3.getWakeUp() && (i3 = i3 + 1) < 0) {
                        am1.W();
                        throw null;
                    }
                    it3 = it4;
                }
            } else {
                i3 = 0;
            }
            i52 i52Var9 = new i52("detector_non_wakeup", String.valueOf(i3));
            List<SystemSensorPolicy.SensorDescriptor> list4 = this.catalog;
            if (list4 == null || !list4.isEmpty()) {
                Iterator it5 = list4.iterator();
                i4 = 0;
                while (it5.hasNext()) {
                    SystemSensorPolicy.SensorDescriptor sensorDescriptor4 = (SystemSensorPolicy.SensorDescriptor) it5.next();
                    Iterator it6 = it5;
                    i52 i52Var10 = i52Var8;
                    if (sensorDescriptor4.getType() == 18 && sensorDescriptor4.getWakeUp() && (i4 = i4 + 1) < 0) {
                        am1.W();
                        throw null;
                    }
                    it5 = it6;
                    i52Var8 = i52Var10;
                }
            } else {
                i4 = 0;
            }
            i52[] i52VarArr = {i52Var, i52Var2, i52Var3, i52Var4, i52Var5, i52Var6, i52Var7, i52Var8, i52Var9, new i52("detector_wakeup", String.valueOf(i4)), new i52("sample_boottime_ms", String.valueOf(j2))};
            LinkedHashMap linkedHashMap = new LinkedHashMap(jq1.M(11));
            jq1.P(linkedHashMap, i52VarArr);
            try {
                Method method = this.diagnostics;
                Object objInvoke = method != null ? method.invoke(null, null) : null;
                long[] jArr = objInvoke instanceof long[] ? (long[]) objInvoke : null;
                List listG = am1.G("app_batches", "target_batches", "without_scratch_batches", "rewritten_accel_events", "submitted_counter_events", "submitted_detector_events", "submitted_batches", "send_errors", "fallbacks", "last_result", "last_target_boottime_ms", "target_accel_events", "inline_batches", "inline_completed_batches", "inline_queue_writes", "inline_queue_errors", "last_inline_queue_result");
                if (jArr == null || jArr.length != listG.size()) {
                    linkedHashMap.put("delivery_statistics", "unavailable-restart-required");
                } else {
                    for (Object obj : listG) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            am1.X();
                            throw null;
                        }
                        linkedHashMap.put((String) obj, String.valueOf(jArr[i5]));
                        i5 = i6;
                    }
                }
                wg2Var = mf3.a;
            } catch (Throwable th) {
                wg2Var = new wg2(th);
            }
            Throwable thA = xg2.a(wg2Var);
            if (thA != null) {
                linkedHashMap.put("delivery_statistics", "read-failed:".concat(thA.getClass().getSimpleName()));
            }
            try {
                HookStatus.INSTANCE.nativeSensorRuntime(linkedHashMap);
            } catch (Throwable unused) {
            }
            if (z || !zF || (o51.f(str, "running") && j2 >= this.runtimeLogAt)) {
                this.runtimeLogAt = j2 + 30000;
                try {
                    XposedBridge.INSTANCE.log("[Sensors] Runtime " + new JSONObject(linkedHashMap));
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public static /* synthetic */ void reportRuntime$default(SystemAccelHooker systemAccelHooker, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        systemAccelHooker.reportRuntime(str, z);
    }

    private final void startHeartbeat() {
        if (this.heartbeatRegistered) {
            return;
        }
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager == null) {
            fo.n("Required value was null.");
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        if (defaultSensor == null) {
            fo.n("Required value was null.");
            return;
        }
        HandlerThread handlerThread = this.heartbeatThread;
        if (handlerThread == null) {
            handlerThread = new HandlerThread("LocationSpoofer_SensorHeartbeat");
            handlerThread.start();
            this.heartbeatThread = handlerThread;
        }
        if (!sensorManager.registerListener(this.heartbeat, defaultSensor, 66667, 0, new Handler(handlerThread.getLooper()))) {
            fo.n("Global sensor heartbeat registration failed");
            return;
        }
        this.heartbeatRegistered = true;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        if (defaultSensor2 != null) {
            sensorManager.registerListener(this.heartbeat, defaultSensor2, 66667, 0, new Handler(handlerThread.getLooper()));
        }
    }

    private final void stopHeartbeat() {
        if (this.heartbeatRegistered) {
            try {
                SensorManager sensorManager = this.sensorManager;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this.heartbeat);
                }
            } catch (Throwable unused) {
            }
        }
        this.heartbeatRegistered = false;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.ready = false;
        stopHeartbeat();
        HandlerThread handlerThread = this.heartbeatThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.heartbeatThread = null;
        try {
            Method method = this.disable;
            if (method != null) {
                method.invoke(null, null);
            }
        } catch (Throwable unused) {
        }
        reportRuntime("closed", true);
    }

    public final boolean getReady() {
        return this.ready;
    }

    public final void install() {
        Object wg2Var;
        HookStatus.INSTANCE.nativeSensors(false, "unsupported-process");
        if (!Process.is64Bit()) {
            reportRuntime("unsupported-process", true);
            return;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            FileInputStream fileInputStream = new FileInputStream(new File("/system/lib64/libsensorservice.so"));
            try {
                byte[] bArr = new byte[65536];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i < 0) {
                        break;
                    } else {
                        messageDigest.update(bArr, 0, i);
                    }
                    this.ready = false;
                    HookStatus hookStatus = HookStatus.INSTANCE;
                    hookStatus.nativeSensors(false, "initialization-failed");
                    hookStatus.error("globalSensorAdapter", th);
                    reportRuntime("initialization-failed", true);
                }
                fileInputStream.close();
                byte[] bArrDigest = messageDigest.digest();
                bArrDigest.getClass();
                String strZ0 = yo.z0(bArrDigest, new ym2(23));
                this.libraryHash = strZ0;
                SystemSensorPolicy.Profile profile = SystemSensorPolicy.INSTANCE.profile(Process.is64Bit(), strZ0);
                if (profile == null) {
                    HookStatus.INSTANCE.nativeSensors(false, "unrecognized-library-sha256:" + strZ0);
                    Log.i("LS-SystemAccel", "Unsupported sensor library profile; app sensor hooks remain available");
                    reportRuntime("unrecognized-library", true);
                    return;
                }
                Class cls = this.api;
                if (cls == null) {
                    System.loadLibrary("shadowhook");
                    System.loadLibrary("location_accel");
                    cls = SystemAccelNative.class;
                    this.api = cls;
                }
                Class cls2 = cls;
                this.configureSteps = cls2.getDeclaredMethod("configureStepSensors", int[].class);
                try {
                    wg2Var = cls2.getDeclaredMethod("diagnostics", null);
                } catch (Throwable th) {
                    wg2Var = new wg2(th);
                }
                if (wg2Var instanceof wg2) {
                    wg2Var = null;
                }
                this.diagnostics = (Method) wg2Var;
                Class cls3 = Boolean.TYPE;
                Class cls4 = Double.TYPE;
                Class cls5 = Long.TYPE;
                this.configure = cls2.getDeclaredMethod("configureSensors", cls3, int[].class, cls4, cls4, cls4, cls5, cls5, cls5, Integer.TYPE, float[].class, cls3, cls4);
                this.uids = cls2.getDeclaredMethod("uids", null);
                this.disable = cls2.getDeclaredMethod("disable", null);
                this.ready = o51.f(cls2.getDeclaredMethod("install", String.class).invoke(null, strZ0), Boolean.TRUE);
                HookStatus.INSTANCE.nativeSensors(this.ready, profile.getId() + "-" + profile.getValidation() + "-sha256:" + strZ0);
                boolean z = this.ready;
                StringBuilder sb = new StringBuilder();
                sb.append("Global sensor adapter ready=");
                sb.append(z);
                Log.i("LS-SystemAccel", sb.toString());
                reportRuntime(this.ready ? "installed-idle" : "native-install-failed", true);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ji2.z(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            this.ready = false;
            HookStatus hookStatus2 = HookStatus.INSTANCE;
            hookStatus2.nativeSensors(false, "initialization-failed");
            hookStatus2.error("globalSensorAdapter", th4);
            reportRuntime("initialization-failed", true);
        }
    }

    public final Class<?> saveApi() {
        return this.api;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0246  */
    /* JADX WARN: Code duplicated, block: B:115:0x0252  */
    /* JADX WARN: Code duplicated, block: B:116:0x0254  */
    public final void update(JSONObject jSONObject) {
        Object wg2Var;
        Object objH0;
        int[] iArrI0;
        Object wg2Var2;
        Object obj;
        float[] fArrCopyOf;
        zj0 zj0Var = zj0.e;
        if (this.ready) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.optBoolean("active", false) && (jSONObject.optBoolean("enable_step_simulation", true) || jSONObject.optBoolean("barometer_fluctuation", false))) {
                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        long jNativeSensorRemainingMillis$xposed_globalRelease = this.module.nativeSensorRemainingMillis$xposed_globalRelease(jSONObject);
                        if (jNativeSensorRemainingMillis$xposed_globalRelease <= 0) {
                            stopHeartbeat();
                            Method method = this.disable;
                            if (method != null) {
                                method.invoke(null, null);
                            }
                            reportRuntime$default(this, "permission-expired", false, 2, null);
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String str = jSONObject.optBoolean("system_hook_global_mode") + "|" + jSONObject.optJSONArray("system_hook_packages") + "|" + jSONObject.optLong("start_timestamp");
                        if (jElapsedRealtimeNanos >= this.refreshAt || !str.equals(this.policy)) {
                            Context systemContext = SystemHookUtils.INSTANCE.getSystemContext();
                            PackageManager packageManager = systemContext != null ? systemContext.getPackageManager() : null;
                            if (packageManager != null && !o51.f(this.seededPolicy, str)) {
                                if (jSONObject.optBoolean("system_hook_global_mode")) {
                                    List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
                                    installedApplications.getClass();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Object obj2 : installedApplications) {
                                        Integer numValueOf = Integer.valueOf(((ApplicationInfo) obj2).uid);
                                        Object arrayList = linkedHashMap.get(numValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            linkedHashMap.put(numValueOf, arrayList);
                                        }
                                        ((List) arrayList).add(obj2);
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    Iterator it = linkedHashMap.entrySet().iterator();
                                    while (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        int iIntValue = ((Number) entry.getKey()).intValue();
                                        List list = (List) entry.getValue();
                                        SystemSensorPolicy systemSensorPolicy = SystemSensorPolicy.INSTANCE;
                                        Iterator it2 = it;
                                        ArrayList arrayList2 = new ArrayList(az.Y(list, 10));
                                        Iterator it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            arrayList2.add(((ApplicationInfo) it3.next()).packageName);
                                        }
                                        if (systemSensorPolicy.isTarget(iIntValue, zy.N0(arrayList2), SystemHookUtils.INSTANCE.getEXEMPT_PACKAGES(), jSONObject)) {
                                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                                        }
                                        it = it2;
                                    }
                                    iArrI0 = zy.I0(linkedHashMap2.keySet());
                                } else {
                                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("system_hook_packages");
                                    k41 k41VarF0 = mh0.f0(0, jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0);
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it4 = k41VarF0.iterator();
                                    while (((j41) it4).g) {
                                        int iNextInt = ((j41) it4).nextInt();
                                        try {
                                            jSONArrayOptJSONArray.getClass();
                                            wg2Var2 = Integer.valueOf(packageManager.getApplicationInfo(jSONArrayOptJSONArray.getString(iNextInt), 0).uid);
                                        } catch (Throwable th) {
                                            wg2Var2 = new wg2(th);
                                        }
                                        if (wg2Var2 instanceof wg2) {
                                            wg2Var2 = null;
                                        }
                                        Integer num = (Integer) wg2Var2;
                                        if (num != null) {
                                            arrayList3.add(num);
                                        }
                                    }
                                    List listH0 = zy.h0(arrayList3);
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it5 = listH0.iterator();
                                    while (it5.hasNext()) {
                                        Object next = it5.next();
                                        int iIntValue2 = ((Number) next).intValue();
                                        SystemSensorPolicy systemSensorPolicy2 = SystemSensorPolicy.INSTANCE;
                                        String[] packagesForUid = packageManager.getPackagesForUid(iIntValue2);
                                        Set<String> setH0 = packagesForUid != null ? yo.H0(packagesForUid) : null;
                                        if (setH0 == null) {
                                            setH0 = zj0Var;
                                        }
                                        Iterator it6 = it5;
                                        if (systemSensorPolicy2.isTarget(iIntValue2, setH0, SystemHookUtils.INSTANCE.getEXEMPT_PACKAGES(), jSONObject)) {
                                            arrayList4.add(next);
                                        }
                                        it5 = it6;
                                    }
                                    iArrI0 = zy.I0(arrayList4);
                                }
                                this.seededUids = iArrI0;
                                this.seededPolicy = str;
                            }
                            Method method2 = this.uids;
                            Object objInvoke = method2 != null ? method2.invoke(null, null) : null;
                            int[] iArr = objInvoke instanceof int[] ? (int[]) objInvoke : null;
                            if (iArr == null) {
                                iArr = new int[0];
                            }
                            Set setG0 = yo.G0(iArr);
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj3 : setG0) {
                                int iIntValue3 = ((Number) obj3).intValue();
                                if (packageManager != null) {
                                    try {
                                        String[] packagesForUid2 = packageManager.getPackagesForUid(iIntValue3);
                                        objH0 = packagesForUid2 != null ? yo.H0(packagesForUid2) : null;
                                        if (objH0 == null) {
                                            wg2Var = zj0Var;
                                        } else {
                                            wg2Var = objH0;
                                        }
                                    } catch (Throwable th2) {
                                        setG0 = setG0;
                                        wg2Var = new wg2(th2);
                                    }
                                } else if (objH0 == null) {
                                    wg2Var = zj0Var;
                                } else {
                                    wg2Var = objH0;
                                }
                                if (wg2Var instanceof wg2) {
                                    wg2Var = zj0Var;
                                }
                                zj0 zj0Var2 = zj0Var;
                                if (SystemSensorPolicy.INSTANCE.isTarget(iIntValue3, (Set) wg2Var, SystemHookUtils.INSTANCE.getEXEMPT_PACKAGES(), jSONObject)) {
                                    arrayList5.add(obj3);
                                }
                                setG0 = setG0;
                                zj0Var = zj0Var2;
                            }
                            this.allowed = zy.I0(pt2.N(pt2.M(yo.G0(this.seededUids), setG0), arrayList5));
                            this.policy = str;
                            this.refreshAt = jElapsedRealtimeNanos + 500000000;
                        }
                        String strOptString = jSONObject.optString("gait_template", "");
                        if (!o51.f(strOptString, this.templateSource)) {
                            hv0 hv0VarB = wc0.B(strOptString);
                            if (hv0VarB != null) {
                                float[] fArr = hv0VarB.a;
                                float[] fArr2 = hv0VarB.b;
                                fArr.getClass();
                                fArr2.getClass();
                                int length = fArr.length;
                                int length2 = fArr2.length;
                                float[] fArrCopyOf2 = Arrays.copyOf(fArr, length + length2);
                                System.arraycopy(fArr2, 0, fArrCopyOf2, length, length2);
                                float[] fArr3 = hv0VarB.c;
                                fArr3.getClass();
                                int length3 = fArrCopyOf2.length;
                                int length4 = fArr3.length;
                                fArrCopyOf = Arrays.copyOf(fArrCopyOf2, length3 + length4);
                                System.arraycopy(fArr3, 0, fArrCopyOf, length3, length4);
                            } else {
                                fArrCopyOf = null;
                            }
                            this.template = fArrCopyOf;
                            strOptString.getClass();
                            this.templateSource = strOptString;
                        }
                        RouteEngine routeEngine = RouteEngine.INSTANCE;
                        double speed = routeEngine.calculateCurrentPosition(jSONObject, jCurrentTimeMillis).getSpeed();
                        boolean z = jSONObject.optBoolean("enable_step_simulation", true) && Math.abs(speed) <= Double.MAX_VALUE && speed > 0.1d;
                        float[] fArr4 = this.template;
                        if (fArr4 == null) {
                            if (z) {
                                double dRint = Math.rint(speed * 10.0d) / 10.0d;
                                if (dRint != this.defaultTemplateSpeed) {
                                    this.defaultTemplate = SystemGaitWaveform.INSTANCE.create(dRint);
                                    this.defaultTemplateSpeed = dRint;
                                }
                                fArr4 = this.defaultTemplate;
                            } else {
                                fArr4 = null;
                            }
                        }
                        if (z && !prepareSensorManager()) {
                            Method method3 = this.disable;
                            if (method3 != null) {
                                obj = null;
                                method3.invoke(null, null);
                            } else {
                                obj = null;
                            }
                            reportRuntime$default(this, "waiting-for-sensor-manager", false, 2, obj);
                            return;
                        }
                        if (z) {
                            startHeartbeat();
                        } else {
                            stopHeartbeat();
                        }
                        boolean zOptBoolean = jSONObject.optBoolean("barometer_fluctuation", false);
                        Method method4 = this.configure;
                        if (method4 != null) {
                            float[] fArr5 = fArr4;
                            Boolean boolValueOf = Boolean.valueOf(z);
                            int[] iArr2 = this.allowed;
                            Double dValueOf = Double.valueOf(SensorStepHooker.INSTANCE.calculateCurrentStepsFloat$xposed_globalRelease(jSONObject, jCurrentTimeMillis));
                            Double dValueOf2 = Double.valueOf(SystemSensorPolicy.INSTANCE.cadence(jSONObject, jCurrentTimeMillis));
                            Double dValueOf3 = Double.valueOf(speed);
                            Long lValueOf = Long.valueOf(jElapsedRealtimeNanos);
                            Long lValueOf2 = Long.valueOf(((jElapsedRealtimeNanos / 1000000) + jNativeSensorRemainingMillis$xposed_globalRelease) * 1000000);
                            Long lValueOf3 = Long.valueOf(jSONObject.optLong("start_timestamp"));
                            Integer numValueOf2 = Integer.valueOf(jSONObject.optInt("realism_level", 0));
                            Boolean boolValueOf2 = Boolean.valueOf(zOptBoolean);
                            double dPow = 1013.25d;
                            if (zOptBoolean) {
                                double dRealisticAltitude = routeEngine.realisticAltitude(jSONObject, jCurrentTimeMillis);
                                Double dValueOf4 = Double.valueOf(dRealisticAltitude);
                                if (Math.abs(dRealisticAltitude) > 9218868437227405311) {
                                    dValueOf4 = null;
                                }
                                dPow = 1013.25d * Math.pow(1.0d - ((dValueOf4 != null ? mh0.t(dValueOf4.doubleValue(), -500.0d, 10000.0d) : 0.0d) / 44330.0d), 5.2550001983762575d);
                            }
                            method4.invoke(null, boolValueOf, iArr2, dValueOf, dValueOf2, dValueOf3, lValueOf, lValueOf2, lValueOf3, numValueOf2, fArr5, boolValueOf2, Double.valueOf(dPow));
                        }
                        reportRuntime$default(this, z ? this.allowed.length == 0 ? "no-target-uids" : "running" : "no-motion", false, 2, null);
                        return;
                    }
                } catch (Throwable th3) {
                    stopHeartbeat();
                    try {
                        Method method5 = this.disable;
                        if (method5 != null) {
                            method5.invoke(null, null);
                        }
                    } catch (Throwable unused) {
                    }
                    this.ready = false;
                    HookStatus hookStatus = HookStatus.INSTANCE;
                    hookStatus.nativeSensors(false, "controller-failed");
                    hookStatus.error("globalSensorUpdate", th3);
                    reportRuntime("controller-failed", true);
                    return;
                }
            }
            stopHeartbeat();
            Method method6 = this.disable;
            if (method6 != null) {
                method6.invoke(null, null);
            }
            this.allowed = new int[0];
            this.refreshAt = 0L;
            reportRuntime$default(this, "inactive", false, 2, null);
        }
    }
}
