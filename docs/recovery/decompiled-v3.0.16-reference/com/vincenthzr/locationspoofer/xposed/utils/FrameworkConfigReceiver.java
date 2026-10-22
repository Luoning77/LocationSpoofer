package com.vincenthzr.locationspoofer.xposed.utils;

import android.content.SharedPreferences;
import defpackage.au0;
import defpackage.az2;
import defpackage.bt0;
import defpackage.ca0;
import defpackage.ct0;
import defpackage.dt0;
import defpackage.lt2;
import defpackage.lu0;
import defpackage.mc0;
import defpackage.o51;
import defpackage.pk2;
import defpackage.rk2;
import defpackage.vk2;
import defpackage.zj0;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FrameworkConfigReceiver implements AutoCloseable {
    private volatile boolean closed;
    private final ScheduledExecutorService executor;
    private final au0 getPreferences;
    private long highestSequence;
    private long lastErrorAt;
    private String lastSnapshot;
    private final SharedPreferences.OnSharedPreferenceChangeListener listener;
    private pk2 loadedBinding;
    private Set<String> loadedCapabilities;
    private JSONObject loadedConfig;
    private final lu0 onConfig;
    private final lu0 onError;
    private final vk2 permitVerifier;
    private String pinnedDevice;
    private SharedPreferences preferences;
    private final lu0 readFile;

    public FrameworkConfigReceiver(au0 au0Var, lu0 lu0Var, lu0 lu0Var2, lu0 lu0Var3, vk2 vk2Var) {
        au0Var.getClass();
        lu0Var.getClass();
        lu0Var2.getClass();
        lu0Var3.getClass();
        vk2Var.getClass();
        this.getPreferences = au0Var;
        this.readFile = lu0Var;
        this.onConfig = lu0Var2;
        this.onError = lu0Var3;
        this.permitVerifier = vk2Var;
        int i = 0;
        this.executor = Executors.newSingleThreadScheduledExecutor(new ct0(i));
        this.loadedCapabilities = zj0.e;
        this.listener = new dt0(this, i);
    }

    private final pk2 binding(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("userId");
        String strM = az2.m(string, jSONObject, "deviceId");
        String string2 = jSONObject.getString("publicKeyFingerprint");
        return new pk2(string, strM, string2, az2.m(string2, jSONObject, "sessionId"));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    private final Set<String> capabilities(JSONObject jSONObject) {
        lt2 lt2Var = new lt2();
        lt2Var.add("spoof");
        if (jSONObject.optBoolean("is_route_mode", false)) {
            lt2Var.add("route");
        } else {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("route_points");
            if ((jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0) >= 2) {
                lt2Var.add("route");
            }
        }
        if (jSONObject.optBoolean("mock_wifi", false) || jSONObject.optBoolean("mock_cell", false) || jSONObject.optBoolean("mock_bluetooth", false)) {
            lt2Var.add("environment");
        }
        return mc0.l(lt2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread executor$lambda$1(Runnable runnable) {
        Thread thread = new Thread(runnable, "LocationSpoofer-ConfigReceiver");
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listener$lambda$4(FrameworkConfigReceiver frameworkConfigReceiver, SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 284874180) {
                if (iHashCode != 1621091289 || !str.equals("runtime_binding_declaration")) {
                    return;
                }
            } else if (!str.equals("snapshot")) {
                return;
            }
        }
        if (frameworkConfigReceiver.closed) {
            return;
        }
        try {
            frameworkConfigReceiver.executor.execute(new bt0(frameworkConfigReceiver, 0));
        } catch (Throwable unused) {
        }
    }

    private final rk2 permit(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("payload");
        return new rk2(string, az2.m(string, jSONObject, "signature"));
    }

    public final synchronized boolean canUse(JSONObject jSONObject) {
        jSONObject.getClass();
        return !this.closed && jSONObject == this.loadedConfig && this.permitVerifier.f(this.loadedBinding, this.loadedCapabilities);
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.executor.shutdownNow();
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences != null) {
            try {
                sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.listener);
            } catch (Throwable unused) {
            }
        }
        this.preferences = null;
        this.permitVerifier.d();
        this.loadedConfig = null;
    }

    public final synchronized void refresh$xposed_globalRelease() {
        try {
            if (this.closed) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.preferences;
                if (sharedPreferences == null) {
                    Object objInvoke = this.getPreferences.invoke();
                    SharedPreferences sharedPreferences2 = (SharedPreferences) objInvoke;
                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this.listener);
                    this.preferences = sharedPreferences2;
                    sharedPreferences = (SharedPreferences) objInvoke;
                }
                String string = sharedPreferences.getString("snapshot", null);
                if (string == null) {
                    return;
                }
                if (string.equals(this.lastSnapshot)) {
                    return;
                }
                FrameworkConfigSnapshot frameworkConfigSnapshotDecode = FrameworkConfigSnapshot.Companion.decode(string, this.readFile);
                if (!frameworkConfigSnapshotDecode.getConfig().optBoolean("active", false)) {
                    this.permitVerifier.d();
                    this.loadedBinding = null;
                    this.loadedCapabilities = zj0.e;
                } else {
                    if (frameworkConfigSnapshotDecode.getSequence() <= this.highestSequence) {
                        throw new IllegalArgumentException("旧活动配置不能重新运行");
                    }
                    JSONObject jSONObject = frameworkConfigSnapshotDecode.getConfig().getJSONObject("runtime_permit");
                    jSONObject.getClass();
                    rk2 rk2VarPermit = permit(jSONObject);
                    JSONObject jSONObject2 = frameworkConfigSnapshotDecode.getConfig().getJSONObject("runtime_binding");
                    jSONObject2.getClass();
                    pk2 pk2VarBinding = binding(jSONObject2);
                    String string2 = sharedPreferences.getString("runtime_binding_declaration", null);
                    if (string2 == null) {
                        throw new IllegalStateException("缺少框架设备绑定声明");
                    }
                    rk2 rk2VarPermit2 = permit(new JSONObject(string2));
                    if (!o51.f(rk2VarPermit2, rk2VarPermit)) {
                        throw new IllegalArgumentException("运行许可与框架绑定声明不一致");
                    }
                    String str = this.permitVerifier.b(rk2VarPermit2).b.b;
                    String str2 = this.pinnedDevice;
                    if (str2 != null && !str2.equals(str)) {
                        throw new IllegalArgumentException("同一注入进程不能替换稳定设备绑定");
                    }
                    Set<String> setCapabilities = capabilities(frameworkConfigSnapshotDecode.getConfig());
                    this.permitVerifier.a(rk2VarPermit, pk2VarBinding, setCapabilities);
                    this.pinnedDevice = str;
                    this.loadedBinding = pk2VarBinding;
                    this.loadedCapabilities = setCapabilities;
                }
                if (this.closed) {
                    return;
                }
                this.highestSequence = Math.max(this.highestSequence, frameworkConfigSnapshotDecode.getSequence());
                this.loadedConfig = frameworkConfigSnapshotDecode.getConfig();
                this.onConfig.invoke(frameworkConfigSnapshotDecode);
                this.lastSnapshot = string;
            } catch (Exception e) {
                SharedPreferences sharedPreferences3 = this.preferences;
                if (sharedPreferences3 != null) {
                    try {
                        sharedPreferences3.unregisterOnSharedPreferenceChangeListener(this.listener);
                    } catch (Throwable unused) {
                    }
                }
                this.preferences = null;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.lastErrorAt >= 60000) {
                    this.lastErrorAt = jCurrentTimeMillis;
                    try {
                        this.onError.invoke(e);
                    } catch (Throwable unused2) {
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long remainingValidityMillis(JSONObject jSONObject) {
        jSONObject.getClass();
        return (this.closed || jSONObject != this.loadedConfig) ? 0L : this.permitVerifier.h(this.loadedBinding, this.loadedCapabilities);
    }

    public final void start() {
        refresh$xposed_globalRelease();
        this.executor.scheduleWithFixedDelay(new bt0(this, 1), 1L, 1L, TimeUnit.SECONDS);
    }

    public /* synthetic */ FrameworkConfigReceiver(au0 au0Var, lu0 lu0Var, lu0 lu0Var2, lu0 lu0Var3, vk2 vk2Var, int i, ca0 ca0Var) {
        this(au0Var, lu0Var, lu0Var2, lu0Var3, (i & 16) != 0 ? new vk2(7, null) : vk2Var);
    }
}
