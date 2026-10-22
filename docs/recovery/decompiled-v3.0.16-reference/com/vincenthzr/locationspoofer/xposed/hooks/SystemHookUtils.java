package com.vincenthzr.locationspoofer.xposed.hooks;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.SystemClock;
import com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates;
import com.vincenthzr.locationspoofer.xposed.hooks.access.SimulationTargetPolicy;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.VendorRegistry;
import com.vincenthzr.locationspoofer.xposed.utils.SpoofedMotion;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.i43;
import defpackage.il1;
import defpackage.j41;
import defpackage.k41;
import defpackage.l13;
import defpackage.mh0;
import defpackage.oi1;
import defpackage.pt2;
import defpackage.s13;
import defpackage.yo;
import defpackage.zb1;
import defpackage.zj0;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SystemHookUtils {
    private static volatile Context cachedSystemContext;
    public static final SystemHookUtils INSTANCE = new SystemHookUtils();
    private static final Set<String> BASE_EXEMPT_PACKAGES = yo.H0(new String[]{SelfHostedUpdates.APPLICATION_ID, "android", "system_server", "system", "com.android.systemui", "com.android.phone", "com.android.server.telecom", "com.google.android.gms", "com.qualcomm.location", "com.qualcomm.atfwd", "com.android.ons", "com.android.location.fused"});
    private static final zb1 EXEMPT_PACKAGES$delegate = new i43(new oi1(29));

    private SystemHookUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set EXEMPT_PACKAGES_delegate$lambda$0() {
        return pt2.N(BASE_EXEMPT_PACKAGES, VendorRegistry.INSTANCE.getAdditionalExemptPackages());
    }

    public static /* synthetic */ boolean isTargetCaller$default(SystemHookUtils systemHookUtils, Object obj, String str, JSONObject jSONObject, Integer num, int i, Object obj2) {
        if ((i & 8) != 0) {
            num = null;
        }
        return systemHookUtils.isTargetCaller(obj, str, jSONObject, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set isTargetCaller$lambda$4(Object obj, int i) {
        return INSTANCE.resolveCallingPackages(obj, Integer.valueOf(i));
    }

    public static /* synthetic */ Set resolveCallingPackages$default(SystemHookUtils systemHookUtils, Object obj, Integer num, int i, Object obj2) {
        if ((i & 2) != 0) {
            num = null;
        }
        return systemHookUtils.resolveCallingPackages(obj, num);
    }

    public final void applyFakeLocationFields(Object obj, SpoofedMotion spoofedMotion, double d, float f) {
        obj.getClass();
        spoofedMotion.getClass();
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            xposedHelpers.callMethod(obj, "setLatitude", Double.valueOf(spoofedMotion.getLat()));
            xposedHelpers.callMethod(obj, "setLongitude", Double.valueOf(spoofedMotion.getLng()));
            xposedHelpers.callMethod(obj, "setAccuracy", Float.valueOf(f));
            xposedHelpers.callMethod(obj, "setSpeed", Float.valueOf(spoofedMotion.getSpeed()));
            xposedHelpers.callMethod(obj, "setBearing", Float.valueOf(spoofedMotion.getBearing()));
            xposedHelpers.callMethod(obj, "setAltitude", Double.valueOf(d));
            xposedHelpers.callMethod(obj, "setTime", Long.valueOf(System.currentTimeMillis()));
            xposedHelpers.callMethod(obj, "setElapsedRealtimeNanos", Long.valueOf(SystemClock.elapsedRealtimeNanos()));
            try {
                xposedHelpers.callMethod(obj, "setVerticalAccuracyMeters", Float.valueOf(1.5f));
            } catch (Throwable unused) {
            }
            try {
                XposedHelpers.INSTANCE.callMethod(obj, "setSpeedAccuracyMetersPerSecond", Float.valueOf(0.3f));
            } catch (Throwable unused2) {
            }
            try {
                XposedHelpers.INSTANCE.callMethod(obj, "setBearingAccuracyDegrees", Float.valueOf(2.0f));
            } catch (Throwable unused3) {
            }
            try {
                XposedHelpers.INSTANCE.callMethod(obj, "setMock", Boolean.FALSE);
            } catch (Throwable unused4) {
            }
            try {
                XposedHelpers.INSTANCE.callMethod(obj, "setIsFromMockProvider", Boolean.FALSE);
            } catch (Throwable unused5) {
            }
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            Object objCallMethod = xposedHelpers2.callMethod(obj, "getExtras", new Object[0]);
            Bundle bundle = objCallMethod instanceof Bundle ? (Bundle) objCallMethod : null;
            if (bundle != null) {
                bundle.remove("mockLocation");
                bundle.putInt("satellites", 20);
                bundle.putInt("satellites_in_view", 20);
                bundle.putInt("satellites_used_in_fix", 18);
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("satellites", 20);
            bundle2.putInt("satellites_in_view", 20);
            bundle2.putInt("satellites_used_in_fix", 18);
            xposedHelpers2.callMethod(obj, "setExtras", bundle2);
        } catch (Throwable unused6) {
        }
    }

    public final Object buildFakeLocation(ClassLoader classLoader, String str, SpoofedMotion spoofedMotion, double d, float f) {
        classLoader.getClass();
        str.getClass();
        spoofedMotion.getClass();
        try {
            Object objNewInstance = Class.forName("android.location.Location", false, classLoader).getConstructor(String.class).newInstance(str);
            objNewInstance.getClass();
            applyFakeLocationFields(objNewInstance, spoofedMotion, d, f);
            return objNewInstance;
        } catch (Throwable th) {
            XposedBridge.INSTANCE.log("[SysHook] buildFakeLocation failed: " + th);
            return null;
        }
    }

    public final Integer extractCallerUid(List<? extends Object> list) {
        list.getClass();
        Iterator<? extends Object> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            Object next = it.next();
            if (next != null) {
                String simpleName = next.getClass().getSimpleName();
                if (l13.c0(simpleName, "Identity", false) || l13.c0(simpleName, "Request", false) || l13.c0(simpleName, "Registration", false) || simpleName.equals("AttributionSource")) {
                    try {
                        Object objCallMethod = XposedHelpers.INSTANCE.callMethod(next, "getUid", new Object[0]);
                        Integer num = objCallMethod instanceof Integer ? (Integer) objCallMethod : null;
                        if (num != null && num.intValue() > 1000) {
                            return num;
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        int intField = XposedHelpers.INSTANCE.getIntField(next, "mUid");
                        if (intField > 1000) {
                            return Integer.valueOf(intField);
                        }
                        continue;
                    } catch (Throwable unused2) {
                        continue;
                    }
                }
            }
        }
    }

    public final String extractPackageName(List<? extends Object> list) {
        String creatorPackage;
        list.getClass();
        Iterator<? extends Object> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            Object next = it.next();
            if (next != null) {
                if ((next instanceof String) && l13.c0((CharSequence) next, ".", false)) {
                    String str = (String) next;
                    if (!s13.Z(str, "android.", false) && !s13.Z(str, "com.android.server.", false) && !next.equals("gps") && !next.equals("network") && !next.equals("passive") && !next.equals("fused")) {
                        return str;
                    }
                }
                String simpleName = next.getClass().getSimpleName();
                if (l13.c0(simpleName, "Identity", false) || l13.c0(simpleName, "Request", false) || l13.c0(simpleName, "Registration", false) || simpleName.equals("AttributionSource")) {
                    try {
                        Object objCallMethod = XposedHelpers.INSTANCE.callMethod(next, "getPackageName", new Object[0]);
                        String str2 = objCallMethod instanceof String ? (String) objCallMethod : null;
                        if (str2 != null && str2.length() != 0 && l13.c0(str2, ".", false) && !s13.Z(str2, "android.", false)) {
                            return str2;
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        Object objectField = XposedHelpers.INSTANCE.getObjectField(next, "mPackageName");
                        String str3 = objectField instanceof String ? (String) objectField : null;
                        if (str3 != null && str3.length() != 0 && l13.c0(str3, ".", false) && !s13.Z(str3, "android.", false)) {
                            return str3;
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if ((next instanceof PendingIntent) && (creatorPackage = ((PendingIntent) next).getCreatorPackage()) != null && creatorPackage.length() != 0 && l13.c0(creatorPackage, ".", false)) {
                    return creatorPackage;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String extractProvider(List<? extends Object> list) {
        String str;
        list.getClass();
        Iterator<? extends Object> it = list.iterator();
        while (true) {
            str = "gps";
            if (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    String str2 = (String) next;
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case -792039641:
                            if (lowerCase.equals("passive")) {
                                return str2;
                            }
                            break;
                        case 102570:
                            if (lowerCase.equals("gps")) {
                                return str2;
                            }
                            break;
                        case 97798435:
                            if (lowerCase.equals("fused")) {
                                return str2;
                            }
                            break;
                        case 1843485230:
                            if (lowerCase.equals("network")) {
                                return str2;
                            }
                            break;
                    }
                }
                if (next != null && (l13.c0(next.getClass().getSimpleName(), "Request", false) || l13.c0(next.getClass().getSimpleName(), "Registration", false))) {
                    try {
                        Object objCallMethod = XposedHelpers.INSTANCE.callMethod(next, "getProvider", new Object[0]);
                        String str3 = objCallMethod instanceof String ? (String) objCallMethod : null;
                        if (str3 != null && str3.length() != 0) {
                            return str3;
                        }
                    } catch (Throwable unused) {
                    }
                    Object objectField = XposedHelpers.INSTANCE.getObjectField(next, "mProvider");
                    str = objectField instanceof String ? (String) objectField : null;
                    if (str == null || str.length() == 0) {
                    }
                }
            }
        }
        return str;
    }

    public final Set<String> getEXEMPT_PACKAGES() {
        return (Set) EXEMPT_PACKAGES$delegate.getValue();
    }

    public final Context getSystemContext() {
        Context context = cachedSystemContext;
        if (context != null) {
            return context;
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getSystemContext", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            Context context2 = objInvoke instanceof Context ? (Context) objInvoke : null;
            cachedSystemContext = context2;
            return context2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean isTargetCaller(Object obj, String str, JSONObject jSONObject, Integer num) {
        jSONObject.getClass();
        int callingUid = (num == null || num.intValue() <= 1000) ? Binder.getCallingUid() : num.intValue();
        return SimulationTargetPolicy.INSTANCE.allows(callingUid, str, jSONObject, getEXEMPT_PACKAGES(), new il1(callingUid, 2, obj));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:4:0x0006, B:6:0x000c, B:12:0x001a, B:14:0x0020, B:16:0x002a, B:19:0x002e, B:22:0x0035, B:24:0x0041, B:27:0x0047, B:29:0x0051, B:32:0x0055, B:9:0x0013), top: B:37:0x0006 }] */
    public final Set<String> resolveCallingPackages(Object obj, Integer num) {
        int iIntValue;
        String[] packagesForUid;
        String[] packagesForUid2;
        zj0 zj0Var = zj0.e;
        if (num != null) {
            try {
                if (num.intValue() > 1000) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = Binder.getCallingUid();
                }
            } catch (Throwable th) {
                XposedBridge.INSTANCE.log("[SysHook] resolveCallingPackages failed: " + th);
                return zj0Var;
            }
        } else {
            iIntValue = Binder.getCallingUid();
        }
        if (iIntValue <= 1000) {
            return zj0Var;
        }
        Context systemContext = getSystemContext();
        if (systemContext != null && (packagesForUid2 = systemContext.getPackageManager().getPackagesForUid(iIntValue)) != null && packagesForUid2.length != 0) {
            return yo.H0(packagesForUid2);
        }
        if (obj != null) {
            Object objectField = XposedHelpers.INSTANCE.getObjectField(obj, "mContext");
            Context context = objectField instanceof Context ? (Context) objectField : null;
            if (context != null && (packagesForUid = context.getPackageManager().getPackagesForUid(iIntValue)) != null && packagesForUid.length != 0) {
                return yo.H0(packagesForUid);
            }
        }
        return zj0Var;
    }

    public final Set<String> resolveTargetPackages(JSONObject jSONObject) {
        jSONObject.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("system_hook_packages");
        if (jSONArrayOptJSONArray == null) {
            return zj0.e;
        }
        k41 k41VarF0 = mh0.f0(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = k41VarF0.iterator();
        while (it.hasNext()) {
            String strOptString = jSONArrayOptJSONArray.optString(((j41) it).nextInt(), null);
            if (strOptString != null) {
                arrayList.add(strOptString);
            }
        }
        return zy.N0(arrayList);
    }
}
