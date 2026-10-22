package com.vincenthzr.locationspoofer.xposed.diagnostics;

import android.os.Process;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemProcess;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.VendorRegistry;
import defpackage.ay0;
import defpackage.az2;
import defpackage.b81;
import defpackage.ct0;
import defpackage.cv0;
import defpackage.di3;
import defpackage.gh0;
import defpackage.i43;
import defpackage.i52;
import defpackage.jq1;
import defpackage.l13;
import defpackage.na;
import defpackage.o51;
import defpackage.p91;
import defpackage.pu0;
import defpackage.qe0;
import defpackage.s13;
import defpackage.uj0;
import defpackage.v70;
import defpackage.vj0;
import defpackage.vk0;
import defpackage.wh2;
import defpackage.yh2;
import defpackage.zb1;
import defpackage.zy;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class HookStatus {
    public static final int FORMAT_VERSION = 1;
    public static final HookStatus INSTANCE = new HookStatus();
    private static final ConcurrentHashMap<String, i52> capabilities;
    private static volatile boolean closed;
    private static volatile long configModified;
    private static volatile String configPath;
    private static final List<String> errors;
    private static final String generationId;
    private static volatile boolean hotReload;
    private static final ConcurrentHashMap<SystemComponent, Located> located;
    private static final ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> methods;
    private static final ConcurrentHashMap.KeySetView<SystemComponent, Boolean> missing;
    private static volatile Boolean nativeSensorsReady;
    private static volatile String nativeSensorsSource;
    private static volatile SystemProcess process;
    private static volatile Map<String, String> sensorRuntime;
    private static final AtomicBoolean writePending;
    private static final zb1 writerDelegate;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Located {
        private final String className;
        private final String source;
        private final long time;

        public Located(String str, String str2, long j) {
            str.getClass();
            str2.getClass();
            this.className = str;
            this.source = str2;
            this.time = j;
        }

        public static /* synthetic */ Located copy$default(Located located, String str, String str2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = located.className;
            }
            if ((i & 2) != 0) {
                str2 = located.source;
            }
            if ((i & 4) != 0) {
                j = located.time;
            }
            return located.copy(str, str2, j);
        }

        public final String component1() {
            return this.className;
        }

        public final String component2() {
            return this.source;
        }

        public final long component3() {
            return this.time;
        }

        public final Located copy(String str, String str2, long j) {
            str.getClass();
            str2.getClass();
            return new Located(str, str2, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Located)) {
                return false;
            }
            Located located = (Located) obj;
            return o51.f(this.className, located.className) && o51.f(this.source, located.source) && this.time == located.time;
        }

        public final String getClassName() {
            return this.className;
        }

        public final String getSource() {
            return this.source;
        }

        public final long getTime() {
            return this.time;
        }

        public int hashCode() {
            return Long.hashCode(this.time) + p91.d(this.className.hashCode() * 31, 31, this.source);
        }

        public String toString() {
            String str = this.className;
            String str2 = this.source;
            long j = this.time;
            StringBuilder sbT = p91.t("Located(className=", str, ", source=", str2, ", time=");
            sbT.append(j);
            sbT.append(")");
            return sbT.toString();
        }
    }

    static {
        String string = UUID.randomUUID().toString();
        string.getClass();
        generationId = string;
        located = new ConcurrentHashMap<>();
        missing = ConcurrentHashMap.newKeySet();
        methods = new ConcurrentHashMap<>();
        errors = Collections.synchronizedList(new ArrayList());
        capabilities = new ConcurrentHashMap<>();
        nativeSensorsSource = "";
        sensorRuntime = vj0.e;
        writerDelegate = new i43(new qe0(9));
        writePending = new AtomicBoolean(false);
    }

    private HookStatus() {
    }

    private final ScheduledExecutorService getWriter() {
        return (ScheduledExecutorService) writerDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer methodHooked$lambda$4(Integer num, Integer num2) {
        num.getClass();
        num2.getClass();
        return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer methodHooked$lambda$5(pu0 pu0Var, Object obj, Object obj2) {
        return (Integer) pu0Var.invoke(obj, obj2);
    }

    private final synchronized void scheduleWrite() {
        if (!closed && process != null) {
            if (writePending.compareAndSet(false, true)) {
                getWriter().schedule(new na(1), 1500L, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleWrite$lambda$7() {
        writePending.set(false);
        INSTANCE.write();
    }

    private final JSONObject toJson(SystemProcess systemProcess) throws JSONException {
        List listJ0;
        String strQ0;
        Boolean bool;
        di3 di3Var = (di3) di3.h.getValue();
        SystemHookVendor active = VendorRegistry.INSTANCE.getActive();
        JSONArray jSONArray = new JSONArray();
        vk0 entries = SystemComponent.getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (((SystemComponent) obj).getProcess() == systemProcess) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= size) {
                break;
            }
            Object obj2 = arrayList.get(i);
            i++;
            SystemComponent systemComponent = (SystemComponent) obj2;
            Located located2 = located.get(systemComponent);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", systemComponent.name());
            jSONObject.put("found", located2 != null);
            if (located2 == null && !missing.contains(systemComponent)) {
                z = false;
            }
            jSONObject.put("searched", z);
            if (located2 != null) {
                jSONObject.put("class", located2.getClassName());
                jSONObject.put("source", located2.getSource());
                ConcurrentHashMap<String, Integer> concurrentHashMap = methods.get(located2.getClassName());
                if (concurrentHashMap == null) {
                    concurrentHashMap = vj0.e;
                }
                jSONObject.put("methods", new JSONObject(new TreeMap(concurrentHashMap)));
            }
            jSONArray.put(jSONObject);
        }
        if (systemProcess == SystemProcess.SYSTEM_SERVER && (bool = nativeSensorsReady) != null) {
            boolean zBooleanValue = bool.booleanValue();
            jSONArray.put(new JSONObject().put("name", "NATIVE_SENSORS").put("found", zBooleanValue).put("searched", true).put("class", "native.SensorService.SensorEventConnection").put("source", nativeSensorsSource).put("methods", new JSONObject().put("sendEvents", zBooleanValue ? 1 : 0)));
        }
        ConcurrentHashMap<String, i52> concurrentHashMap2 = capabilities;
        concurrentHashMap2.getClass();
        for (Map.Entry entry : new TreeMap(concurrentHashMap2).entrySet()) {
            String str = (String) entry.getKey();
            i52 i52Var = (i52) entry.getValue();
            jSONArray.put(new JSONObject().put("name", str).put("found", ((Boolean) i52Var.e).booleanValue()).put("searched", true).put("class", str).put("source", i52Var.f).put("methods", new JSONObject().put("install", ((Boolean) i52Var.e).booleanValue() ? 1 : 0)));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("format", 1);
        jSONObject2.put("generation", generationId);
        jSONObject2.put("load_kind", hotReload ? "hot-reload" : "initial");
        jSONObject2.put("pid", Process.myPid());
        jSONObject2.put("process", systemProcess.name());
        jSONObject2.put("updated_at", System.currentTimeMillis());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("id", active.getId());
        jSONObject3.put("family", active.getFamily().name());
        jSONObject3.put("manual", VendorRegistry.INSTANCE.isManualOverride());
        jSONObject2.put("vendor", jSONObject3);
        String str2 = configPath;
        if (str2 != null) {
            jSONObject2.put("config", new JSONObject().put("path", str2).put("modified", configModified));
        }
        di3Var.getClass();
        List list = yh2.a;
        String strConcat = "Android ".concat(di3Var.f);
        if (yh2.a(di3Var) != wh2.f) {
            switch (yh2.a(di3Var).ordinal()) {
                case 0:
                case Logger.ERROR /* 6 */:
                    strQ0 = "";
                    break;
                case 1:
                    strQ0 = l13.q0(di3Var.b("ro.mi.os.version.name"), "OS");
                    if (l13.k0(strQ0)) {
                        strQ0 = di3Var.b("ro.miui.ui.version.name");
                    }
                    break;
                case 2:
                    String strB = di3Var.b("ro.build.version.oplusrom");
                    if (l13.k0(strB)) {
                        strB = di3Var.b("ro.build.version.opporom");
                    }
                    strQ0 = l13.q0(strB, "V");
                    break;
                case 3:
                    strQ0 = di3Var.b("ro.build.version.oneui");
                    Integer numA0 = s13.a0(strQ0);
                    if (numA0 != null) {
                        int iIntValue = numA0.intValue();
                        strQ0 = (iIntValue / 10000) + "." + ((iIntValue % 10000) / 100);
                    }
                    break;
                case 4:
                    strQ0 = di3Var.b("ro.vivo.os.version");
                    break;
                case Logger.WARN /* 5 */:
                    strQ0 = di3Var.b("ro.build.version.magic");
                    if (l13.k0(strQ0)) {
                        strQ0 = di3Var.b("ro.build.version.emui");
                    }
                    break;
                default:
                    b81.d();
                    return null;
            }
            strConcat = l13.k0(strQ0) ? az2.k(yh2.c(di3Var), " · ", strConcat) : az2.l(yh2.c(di3Var), " ", strQ0, " · ", strConcat);
        }
        jSONObject2.put("system", strConcat);
        jSONObject2.put("model", di3Var.c);
        jSONObject2.put("components", jSONArray);
        List<String> list2 = errors;
        list2.getClass();
        synchronized (list2) {
            listJ0 = zy.J0(list2);
        }
        jSONObject2.put("errors", new JSONArray((Collection) listJ0));
        if (systemProcess == SystemProcess.SYSTEM_SERVER && !sensorRuntime.isEmpty()) {
            Map<String, String> map = sensorRuntime;
            map.getClass();
            jSONObject2.put("native_sensor_runtime", new JSONObject(map));
        }
        return jSONObject2;
    }

    private final void write() {
        SystemProcess systemProcess = process;
        if (systemProcess == null) {
            return;
        }
        try {
            JSONObject json = toJson(systemProcess);
            Iterator<String> it = reportPaths(systemProcess).iterator();
            while (it.hasNext()) {
                try {
                    File file = new File(it.next());
                    File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
                    String string = json.toString();
                    string.getClass();
                    gh0.S(file2, string);
                    file2.setReadable(true, false);
                    if (file2.renameTo(file)) {
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScheduledExecutorService writerDelegate$lambda$2() {
        return Executors.newSingleThreadScheduledExecutor(new ct0(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread writerDelegate$lambda$2$lambda$1(Runnable runnable) {
        Thread thread = new Thread(runnable, "LocationSpoofer-HookStatus");
        thread.setDaemon(true);
        return thread;
    }

    public final void begin(SystemProcess systemProcess) {
        systemProcess.getClass();
        process = systemProcess;
        scheduleWrite();
    }

    public final void capability(String str, boolean z, String str2) {
        str.getClass();
        str2.getClass();
        capabilities.put(str, new i52(Boolean.valueOf(z), str2));
        scheduleWrite();
    }

    public final void classFound(SystemComponent systemComponent, Class<?> cls, String str) {
        systemComponent.getClass();
        cls.getClass();
        str.getClass();
        missing.remove(systemComponent);
        located.put(systemComponent, new Located(cls.getName(), str, System.currentTimeMillis()));
        scheduleWrite();
    }

    public final void classMissing(SystemComponent systemComponent) {
        systemComponent.getClass();
        if (!located.containsKey(systemComponent)) {
            missing.add(systemComponent);
        }
        scheduleWrite();
    }

    public final synchronized void close() {
        closed = true;
        if (writerDelegate.a()) {
            getWriter().shutdownNow();
        }
    }

    public final void configLoaded(String str, long j) {
        str.getClass();
        if (str.equals(configPath) && j == configModified) {
            return;
        }
        configPath = str;
        configModified = j;
        scheduleWrite();
    }

    public final void error(String str, Throwable th) {
        str.getClass();
        th.getClass();
        List<String> list = errors;
        list.getClass();
        synchronized (list) {
            if (list.size() < 20) {
                list.getClass();
                list.add(str + ": " + th.getClass().getSimpleName() + ": " + th.getMessage());
            }
        }
        scheduleWrite();
    }

    public final String getGenerationId() {
        return generationId;
    }

    public final void markHotReload() {
        hotReload = true;
    }

    public final void methodHooked(String str, String str2, int i) {
        ConcurrentHashMap<String, Integer> concurrentHashMapPutIfAbsent;
        str.getClass();
        str2.getClass();
        ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> concurrentHashMap = methods;
        ConcurrentHashMap<String, Integer> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        concurrentHashMap2.merge(str2, Integer.valueOf(i), new cv0(2, new v70(6, (byte) 0)));
        if (process != null) {
            scheduleWrite();
        }
    }

    public final void nativeSensorRuntime(Map<String, String> map) {
        map.getClass();
        sensorRuntime = jq1.R(map);
        scheduleWrite();
    }

    public final void nativeSensors(boolean z, String str) {
        str.getClass();
        nativeSensorsSource = str;
        nativeSensorsReady = Boolean.valueOf(z);
        scheduleWrite();
    }

    public final List<String> reportPaths(SystemProcess systemProcess) {
        systemProcess.getClass();
        LinkedHashMap linkedHashMap = ay0.a;
        String strName = systemProcess.name();
        strName.getClass();
        List<String> list = (List) ay0.a.get(strName);
        return list == null ? uj0.e : list;
    }
}
