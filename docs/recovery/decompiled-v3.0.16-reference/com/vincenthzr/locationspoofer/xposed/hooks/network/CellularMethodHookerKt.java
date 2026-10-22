package com.vincenthzr.locationspoofer.xposed.hooks.network;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.au0;
import defpackage.az;
import defpackage.az2;
import defpackage.d0;
import defpackage.i43;
import defpackage.l13;
import defpackage.lu0;
import defpackage.o51;
import defpackage.xp1;
import defpackage.yo;
import defpackage.zb1;
import defpackage.zm3;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CellularMethodHookerKt {
    public static final void hookCellEnvironment(final LocationHooker locationHooker, final ClassLoader classLoader, boolean z) {
        XposedBridge xposedBridge;
        Class<?> clsFindClass;
        locationHooker.getClass();
        classLoader.getClass();
        XposedBridge.INSTANCE.logOpenCellId("Installing cell hooks classLoader=" + classLoader);
        int i = 0;
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass2 = xposedHelpers.findClass("android.telephony.TelephonyManager", classLoader);
                Class[] clsArr = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact = xposedHelpers.findMethodExact(clsFindClass2, "getAllCellInfo", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                xposedHelpers.getModule().hook(methodFindMethodExact).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt$hookCellEnvironment$$inlined$hookMethod$1
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        return CellularMethodHookerKt.hookCellEnvironment$handleCellMethod(locationHooker, classLoader, chain, methodFindMethodExact);
                    }
                }).getClass();
            } catch (Throwable unused) {
            }
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass3 = xposedHelpers2.findClass("android.telephony.TelephonyManager", classLoader);
                Class[] clsArr2 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact2 = xposedHelpers2.findMethodExact(clsFindClass3, "getCellLocation", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                xposedHelpers2.getModule().hook(methodFindMethodExact2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt$hookCellEnvironment$$inlined$hookMethod$2
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        return CellularMethodHookerKt.hookCellEnvironment$handleCellMethod(locationHooker, classLoader, chain, methodFindMethodExact2);
                    }
                }).getClass();
            } catch (Throwable unused2) {
            }
            XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass4 = xposedHelpers3.findClass("android.telephony.TelephonyManager", classLoader);
                Class[] clsArr3 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact3 = xposedHelpers3.findMethodExact(clsFindClass4, "getNeighboringCellInfo", (Class[]) Arrays.copyOf(clsArr3, clsArr3.length));
                xposedHelpers3.getModule().hook(methodFindMethodExact3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt$hookCellEnvironment$$inlined$hookMethod$3
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        return CellularMethodHookerKt.hookCellEnvironment$handleCellMethod(locationHooker, classLoader, chain, methodFindMethodExact3);
                    }
                }).getClass();
            } catch (Throwable unused3) {
            }
            XposedBridge.INSTANCE.logOpenCellId("Installed TelephonyManager getAllCellInfo/getCellLocation/getNeighboringCellInfo hooks");
        } catch (Throwable th) {
            XposedBridge.INSTANCE.logOpenCellId("Install basic TelephonyManager cell hooks failed: " + th);
        }
        for (String str : am1.G("getNetworkOperator", "getNetworkOperatorName", "getNetworkType", "getDataNetworkType", "getPhoneType", "getServiceState", "getServiceStateForSlot", "getSignalStrength")) {
            try {
                XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass5 = xposedHelpers4.findClass("android.telephony.TelephonyManager", classLoader);
                ArrayList arrayList = new ArrayList();
                d0 d0VarY = zm3.y(clsFindClass5.getDeclaredMethods());
                int i2 = 0;
                while (d0VarY.hasNext()) {
                    final Method method = (Method) d0VarY.next();
                    if (o51.f(method.getName(), str) && !Modifier.isAbstract(method.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers4.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt$hookCellEnvironment$$inlined$hookAllMethods$1
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    Method method2 = method;
                                    method2.getClass();
                                    return CellularMethodHookerKt.hookCellEnvironment$handleTelephonyMeta(locationHooker, classLoader, chain, method2);
                                }
                            });
                            hookHandleIntercept.getClass();
                            arrayList.add(hookHandleIntercept);
                            i2++;
                        } catch (Throwable th2) {
                            HookStatus.INSTANCE.error(clsFindClass5.getName() + "#" + str, th2);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass5.getName(), str, i2);
                XposedBridge.INSTANCE.logOpenCellId("Installed TelephonyManager." + str + " hook");
            } catch (Throwable th3) {
                XposedBridge.INSTANCE.logOpenCellId("Install TelephonyManager." + str + " hook failed: " + th3);
            }
        }
        try {
            XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
            Class cls = Integer.TYPE;
            cls.getClass();
            Object[] objArr = {"android.telephony.PhoneStateListener", cls};
            try {
                Class<?> clsFindClass6 = xposedHelpers5.findClass("android.telephony.TelephonyManager", classLoader);
                ArrayList arrayList2 = new ArrayList(2);
                for (int i3 = 0; i3 < 2; i3++) {
                    Object obj = objArr[i3];
                    if (obj instanceof Class) {
                        clsFindClass = (Class) obj;
                    } else {
                        if (!(obj instanceof String)) {
                            throw new IllegalArgumentException("Invalid argument type");
                        }
                        clsFindClass = XposedHelpers.INSTANCE.findClass((String) obj, clsFindClass6.getClassLoader());
                    }
                    arrayList2.add(clsFindClass);
                }
                Class[] clsArr4 = (Class[]) arrayList2.toArray(new Class[0]);
                final Method methodFindMethodExact4 = xposedHelpers5.findMethodExact(clsFindClass6, "listen", (Class[]) Arrays.copyOf(clsArr4, clsArr4.length));
                xposedHelpers5.getModule().hook(methodFindMethodExact4).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt$hookCellEnvironment$$inlined$hookMethod$4
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r15v0, types: [org.json.JSONObject] */
                    /* JADX WARN: Type inference failed for: r19v14 */
                    /* JADX WARN: Type inference failed for: r19v15 */
                    /* JADX WARN: Type inference failed for: r19v16 */
                    /* JADX WARN: Type inference failed for: r19v3, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r19v5, types: [zb1] */
                    /* JADX WARN: Type inference failed for: r19v7 */
                    /* JADX WARN: Type inference failed for: r19v8 */
                    /* JADX WARN: Type inference failed for: r19v9 */
                    public Object intercept(XposedInterface.Chain chain) {
                        i43 i43Var;
                        ?? r19;
                        XposedBridge xposedBridge2;
                        XposedBridge xposedBridge3;
                        ?? r110;
                        int iFallbackAreaCode;
                        int iFallbackCellIdentity;
                        chain.getClass();
                        final ?? config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        if (config$xposed_globalRelease == 0) {
                            XposedBridge.INSTANCE.logOpenCellIdEvery("listen:config-null", "TelephonyManager.listen skipped: config=null", 30000L);
                            List args = chain.getArgs();
                            args.getClass();
                            return chain.proceed(args.toArray(new Object[0]));
                        }
                        if (!config$xposed_globalRelease.optBoolean("active", false)) {
                            XposedBridge.INSTANCE.logOpenCellIdEvery("listen:inactive", "TelephonyManager.listen skipped: active=false", 30000L);
                            List args2 = chain.getArgs();
                            args2.getClass();
                            return chain.proceed(args2.toArray(new Object[0]));
                        }
                        Object obj2 = chain.getArgs().get(0);
                        if (obj2 == null) {
                            List args3 = chain.getArgs();
                            args3.getClass();
                            return chain.proceed(args3.toArray(new Object[0]));
                        }
                        Object obj3 = chain.getArgs().get(1);
                        obj3.getClass();
                        int iIntValue = ((Integer) obj3).intValue();
                        final double dOptDouble = config$xposed_globalRelease.optDouble("lat", 0.0d);
                        final double dOptDouble2 = config$xposed_globalRelease.optDouble("lng", 0.0d);
                        final boolean zOptBoolean = config$xposed_globalRelease.optBoolean("mock_cell", true);
                        JSONArray jSONArrayOptJSONArray = config$xposed_globalRelease.optJSONArray("cell_json");
                        int length = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0;
                        int i4 = iIntValue & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        boolean z2 = i4 != 0;
                        int i5 = iIntValue & 16;
                        boolean z3 = i5 != 0;
                        int i6 = iIntValue & 1;
                        boolean z4 = i6 != 0;
                        int i7 = iIntValue & 256;
                        boolean z5 = i7 != 0;
                        if (!z2 && !z3 && !z4 && !z5) {
                            List args4 = chain.getArgs();
                            args4.getClass();
                            return chain.proceed(args4.toArray(new Object[0]));
                        }
                        XposedBridge xposedBridge4 = XposedBridge.INSTANCE;
                        i43 i43Var2 = "cell_json";
                        String str2 = "listen:called:" + obj2.getClass().getName() + ":" + iIntValue + ":" + zOptBoolean + ":" + length;
                        String name = obj2.getClass().getName();
                        xp1.m(16);
                        String string = Integer.toString(iIntValue, 16);
                        string.getClass();
                        XposedBridge.logOpenCellIdEvery$default(xposedBridge4, str2, "TelephonyManager.listen called listener=" + name + " events=0x" + string + " mockCell=" + zOptBoolean + " cellJsonCount=" + length, 0L, 4, null);
                        final LocationHooker locationHooker2 = locationHooker;
                        final ClassLoader classLoader2 = classLoader;
                        i43Var2 = new i43(new au0() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt$hookCellEnvironment$5$fakeCells$2
                            @Override // defpackage.au0
                            public final ArrayList<Object> invoke() {
                                return zOptBoolean ? CellInfoListBuilderKt.buildFakeCellInfoList(locationHooker2, classLoader2, dOptDouble, dOptDouble2, config$xposed_globalRelease) : new ArrayList<>();
                            }
                        });
                        if (i5 == 0 || !zOptBoolean) {
                            i43Var = i43Var2;
                        } else {
                            try {
                                XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
                                Object objNewInstance = xposedHelpers6.newInstance(xposedHelpers6.findClass("android.telephony.gsm.GsmCellLocation", classLoader), new Object[0]);
                                JSONArray jSONArrayOptJSONArray2 = config$xposed_globalRelease.optJSONArray(i43Var2);
                                try {
                                    if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                                        iFallbackAreaCode = CellInfoListBuilderKt.fallbackAreaCode(locationHooker, dOptDouble, dOptDouble2);
                                        iFallbackCellIdentity = CellInfoListBuilderKt.fallbackCellIdentity(locationHooker, dOptDouble, dOptDouble2);
                                    } else {
                                        JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(0);
                                        LocationHooker locationHooker3 = locationHooker;
                                        jSONObject.getClass();
                                        iFallbackAreaCode = CellInfoListBuilderKt.cellAreaCode(locationHooker3, jSONObject, CellInfoListBuilderKt.fallbackAreaCode(locationHooker, dOptDouble, dOptDouble2));
                                        LocationHooker locationHooker4 = locationHooker;
                                        iFallbackCellIdentity = CellInfoListBuilderKt.cellIdentityCode(locationHooker4, jSONObject, CellInfoListBuilderKt.fallbackCellIdentity(locationHooker4, dOptDouble, dOptDouble2));
                                    }
                                    xposedHelpers6.callMethod(objNewInstance, "setLacAndCid", Integer.valueOf(iFallbackAreaCode), Integer.valueOf(iFallbackCellIdentity));
                                    xposedHelpers6.callMethod(obj2, "onCellLocationChanged", objNewInstance);
                                    XposedBridge.logOpenCellIdEvery$default(xposedBridge4, "listen:onCellLocationChanged:" + iFallbackAreaCode + ":" + iFallbackCellIdentity, "listen dispatched onCellLocationChanged lac=" + iFallbackAreaCode + " cid=" + iFallbackCellIdentity, 0L, 4, null);
                                    i43Var = i43Var2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r110 = i43Var2;
                                    XposedBridge xposedBridge5 = XposedBridge.INSTANCE;
                                    xposedBridge5.logOpenCellId("listen onCellLocationChanged failed: " + th);
                                    xposedBridge2 = xposedBridge5;
                                    r19 = r110;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                r110 = i43Var2;
                            }
                        }
                        xposedBridge2 = xposedBridge4;
                        r19 = i43Var;
                        if (i4 != 0) {
                            try {
                                XposedHelpers.INSTANCE.callMethod(obj2, "onCellInfoChanged", CellularMethodHookerKt.hookCellEnvironment$lambda$9$lambda$6(r19));
                                XposedBridge.logOpenCellIdEvery$default(xposedBridge2, "listen:onCellInfoChanged:" + CellularMethodHookerKt.hookCellEnvironment$lambda$9$lambda$6(r19).size(), "listen dispatched onCellInfoChanged fakeCells=" + CellularMethodHookerKt.hookCellEnvironment$lambda$9$lambda$6(r19).size(), 0L, 4, null);
                            } catch (Throwable th6) {
                                xposedBridge2 = XposedBridge.INSTANCE;
                                xposedBridge2.logOpenCellId("listen onCellInfoChanged failed: " + th6);
                            }
                        }
                        XposedBridge xposedBridge6 = xposedBridge2;
                        if (i6 != 0) {
                            try {
                                Object objBuildFakeServiceState = CellStateAndSignalBuilderKt.buildFakeServiceState(locationHooker, classLoader, config$xposed_globalRelease.optJSONArray(i43Var2));
                                if (objBuildFakeServiceState != null) {
                                    XposedHelpers.INSTANCE.callMethod(obj2, "onServiceStateChanged", objBuildFakeServiceState);
                                }
                                XposedBridge.logOpenCellIdEvery$default(xposedBridge6, "listen:onServiceStateChanged", "listen dispatched onServiceStateChanged", 0L, 4, null);
                            } catch (Throwable th7) {
                                xposedBridge6 = XposedBridge.INSTANCE;
                                xposedBridge6.logOpenCellId("listen onServiceStateChanged failed: " + th7);
                            }
                        }
                        XposedBridge xposedBridge7 = xposedBridge6;
                        if (i7 != 0) {
                            try {
                                Object objBuildFakeSignalStrength = CellStateAndSignalBuilderKt.buildFakeSignalStrength(locationHooker, classLoader, config$xposed_globalRelease);
                                if (objBuildFakeSignalStrength != null) {
                                    XposedHelpers.INSTANCE.callMethod(obj2, "onSignalStrengthsChanged", objBuildFakeSignalStrength);
                                }
                                XposedBridge.logOpenCellIdEvery$default(xposedBridge7, "listen:onSignalStrengthsChanged", "listen dispatched onSignalStrengthsChanged", 0L, 4, null);
                            } catch (Throwable th8) {
                                XposedBridge xposedBridge8 = XposedBridge.INSTANCE;
                                xposedBridge8.logOpenCellId("listen onSignalStrengthsChanged failed: " + th8);
                                xposedBridge3 = xposedBridge8;
                            }
                        }
                        xposedBridge3 = xposedBridge7;
                        int i8 = iIntValue & (-1298);
                        List args5 = chain.getArgs();
                        args5.getClass();
                        Object[] objArr2 = (Object[]) args5.toArray(new Object[0]).clone();
                        if (objArr2.length > 1) {
                            objArr2[1] = Integer.valueOf(i8);
                        }
                        String str3 = "listen:sanitized:" + iIntValue + ":" + i8;
                        xp1.m(16);
                        String string2 = Integer.toString(i8, 16);
                        string2.getClass();
                        XposedBridge.logOpenCellIdEvery$default(xposedBridge3, str3, "TelephonyManager.listen sanitized events=0x".concat(string2), 0L, 4, null);
                        return chain.proceed(objArr2);
                    }
                }).getClass();
            } catch (Throwable unused4) {
            }
            XposedBridge.INSTANCE.logOpenCellId("Installed TelephonyManager.listen hook");
        } catch (Throwable th4) {
            XposedBridge.INSTANCE.logOpenCellId("Install TelephonyManager.listen hook failed: " + th4);
        }
        try {
            XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
            Class<?> clsFindClass7 = xposedHelpers6.findClass("android.telephony.TelephonyManager", classLoader);
            ArrayList arrayList3 = new ArrayList();
            d0 d0VarY2 = zm3.y(clsFindClass7.getDeclaredMethods());
            int i4 = 0;
            while (d0VarY2.hasNext()) {
                final Method method2 = (Method) d0VarY2.next();
                if (o51.f(method2.getName(), "requestCellInfoUpdate") && !Modifier.isAbstract(method2.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers6.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt$hookCellEnvironment$$inlined$hookAllMethods$2
                            public Object intercept(XposedInterface.Chain chain) {
                                final Object obj2;
                                chain.getClass();
                                method2.getClass();
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease == null) {
                                    XposedBridge.INSTANCE.logOpenCellIdEvery("requestCellInfoUpdate:config-null", "requestCellInfoUpdate skipped: config=null", 30000L);
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                                if (!config$xposed_globalRelease.optBoolean("active", false)) {
                                    XposedBridge.INSTANCE.logOpenCellIdEvery("requestCellInfoUpdate:inactive", "requestCellInfoUpdate skipped: active=false", 30000L);
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                                Object obj3 = chain.getArgs().get(0);
                                Executor executor = obj3 instanceof Executor ? (Executor) obj3 : null;
                                if (executor == null || (obj2 = chain.getArgs().get(1)) == null) {
                                    return null;
                                }
                                XposedBridge.logOpenCellIdEvery$default(XposedBridge.INSTANCE, "requestCellInfoUpdate:called:".concat(obj2.getClass().getName()), "requestCellInfoUpdate called callback=" + obj2.getClass().getName() + " args=" + chain.getArgs().size(), 0L, 4, null);
                                final ArrayList<Object> arrayListBuildFakeCellInfoList = config$xposed_globalRelease.optBoolean("mock_cell", true) ? CellInfoListBuilderKt.buildFakeCellInfoList(locationHooker, classLoader, config$xposed_globalRelease.optDouble("lat", 0.0d), config$xposed_globalRelease.optDouble("lng", 0.0d), config$xposed_globalRelease) : new ArrayList<>();
                                executor.execute(new Runnable() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt$hookCellEnvironment$6$1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(obj2, "onCellInfo", arrayListBuildFakeCellInfoList);
                                            XposedBridge.INSTANCE.logOpenCellId("requestCellInfoUpdate dispatched onCellInfo fakeCells=" + arrayListBuildFakeCellInfoList.size());
                                        } catch (Throwable th5) {
                                            XposedBridge.INSTANCE.logOpenCellId("requestCellInfoUpdate onCellInfo failed: " + th5);
                                        }
                                    }
                                });
                                return null;
                            }
                        });
                        hookHandleIntercept2.getClass();
                        arrayList3.add(hookHandleIntercept2);
                        i4++;
                    } catch (Throwable th5) {
                        HookStatus.INSTANCE.error(clsFindClass7.getName() + "#requestCellInfoUpdate", th5);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClass7.getName(), "requestCellInfoUpdate", i4);
            XposedBridge.INSTANCE.logOpenCellId("Installed TelephonyManager.requestCellInfoUpdate hook");
        } catch (Throwable th6) {
            XposedBridge.INSTANCE.logOpenCellId("Install TelephonyManager.requestCellInfoUpdate hook failed: " + th6);
        }
        try {
            XposedHelpers xposedHelpers7 = XposedHelpers.INSTANCE;
            Class<?> clsFindClass8 = xposedHelpers7.findClass("android.telephony.TelephonyManager", classLoader);
            ArrayList arrayList4 = new ArrayList();
            d0 d0VarY3 = zm3.y(clsFindClass8.getDeclaredMethods());
            while (d0VarY3.hasNext()) {
                final Method method3 = (Method) d0VarY3.next();
                if (o51.f(method3.getName(), "registerTelephonyCallback") && !Modifier.isAbstract(method3.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers7.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt$hookCellEnvironment$$inlined$hookAllMethods$3
                            public Object intercept(XposedInterface.Chain chain) {
                                Object next;
                                chain.getClass();
                                method3.getClass();
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease == null) {
                                    XposedBridge.INSTANCE.logOpenCellIdEvery("registerTelephonyCallback:config-null", "registerTelephonyCallback skipped: config=null", 30000L);
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                                if (!config$xposed_globalRelease.optBoolean("active", false)) {
                                    XposedBridge.INSTANCE.logOpenCellIdEvery("registerTelephonyCallback:inactive", "registerTelephonyCallback skipped: active=false", 30000L);
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                                List args3 = chain.getArgs();
                                args3.getClass();
                                Iterator it = args3.iterator();
                                loop0: while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    if (next != null) {
                                        Class<?>[] interfaces = next.getClass().getInterfaces();
                                        interfaces.getClass();
                                        for (Class<?> cls2 : interfaces) {
                                            if (l13.c0(cls2.getName(), "TelephonyCallback", false)) {
                                                break loop0;
                                            }
                                        }
                                        if (LocationHooker.Companion.hasTypeByName(next.getClass(), "android.telephony.TelephonyCallback")) {
                                            break;
                                        }
                                    }
                                }
                                if (next == null) {
                                    XposedBridge xposedBridge2 = XposedBridge.INSTANCE;
                                    List args4 = chain.getArgs();
                                    args4.getClass();
                                    ArrayList arrayList5 = new ArrayList(az.Y(args4, 10));
                                    Iterator it2 = args4.iterator();
                                    while (it2.hasNext()) {
                                        Object next2 = it2.next();
                                        arrayList5.add(next2 != null ? next2.getClass().getName() : null);
                                    }
                                    xposedBridge2.logOpenCellId("registerTelephonyCallback called but callback not found args=" + arrayList5);
                                    List args5 = chain.getArgs();
                                    args5.getClass();
                                    return chain.proceed(args5.toArray(new Object[0]));
                                }
                                Class<?> cls3 = next.getClass();
                                XposedBridge xposedBridge3 = XposedBridge.INSTANCE;
                                String strConcat = "registerTelephonyCallback:called:".concat(cls3.getName());
                                String name = cls3.getName();
                                Class<?>[] interfaces2 = cls3.getInterfaces();
                                interfaces2.getClass();
                                XposedBridge.logOpenCellIdEvery$default(xposedBridge3, strConcat, "registerTelephonyCallback called callback=" + name + " interfaces=" + yo.A0(interfaces2, new lu0() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt$hookCellEnvironment$7$2
                                    @Override // defpackage.lu0
                                    public final CharSequence invoke(Class<?> cls4) {
                                        return cls4.getName();
                                    }
                                }, 31), 0L, 4, null);
                                if (CellInfoListBuilderKt.isTelephonyCallbackListener(locationHooker, classLoader, next, "CellInfoListener")) {
                                    xposedBridge3.logOpenCellIdEvery("registerTelephonyCallback:CellInfoListener:".concat(cls3.getName()), "registerTelephonyCallback installing CellInfoListener hook on ".concat(cls3.getName()), 60000L);
                                    XposedHelpers xposedHelpers8 = XposedHelpers.INSTANCE;
                                    ArrayList arrayList6 = new ArrayList();
                                    d0 d0VarY4 = zm3.y(cls3.getDeclaredMethods());
                                    int i5 = 0;
                                    while (d0VarY4.hasNext()) {
                                        final Method method4 = (Method) d0VarY4.next();
                                        if (o51.f(method4.getName(), "onCellInfoChanged") && !Modifier.isAbstract(method4.getModifiers())) {
                                            try {
                                                XposedInterface.HookBuilder hookBuilderHook = xposedHelpers8.getModule().hook(method4);
                                                final LocationHooker locationHooker2 = locationHooker;
                                                final ClassLoader classLoader2 = classLoader;
                                                XposedInterface.HookHandle hookHandleIntercept4 = hookBuilderHook.intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt$hookCellEnvironment$lambda$17$$inlined$hookAllMethods$1
                                                    public Object intercept(XposedInterface.Chain chain2) throws ClassNotFoundException {
                                                        chain2.getClass();
                                                        method4.getClass();
                                                        JSONObject config$xposed_globalRelease2 = locationHooker2.readConfig$xposed_globalRelease();
                                                        if (config$xposed_globalRelease2 == null) {
                                                            List args6 = chain2.getArgs();
                                                            args6.getClass();
                                                            return chain2.proceed(args6.toArray(new Object[0]));
                                                        }
                                                        if (!config$xposed_globalRelease2.optBoolean("active", false)) {
                                                            List args7 = chain2.getArgs();
                                                            args7.getClass();
                                                            return chain2.proceed(args7.toArray(new Object[0]));
                                                        }
                                                        ArrayList<Object> arrayListBuildFakeCellInfoList = CellInfoListBuilderKt.buildFakeCellInfoList(locationHooker2, classLoader2, config$xposed_globalRelease2.optDouble("lat", 0.0d), config$xposed_globalRelease2.optDouble("lng", 0.0d), config$xposed_globalRelease2);
                                                        List args8 = chain2.getArgs();
                                                        args8.getClass();
                                                        Object[] objArr2 = (Object[]) args8.toArray(new Object[0]).clone();
                                                        if (!(objArr2.length == 0)) {
                                                            objArr2[0] = arrayListBuildFakeCellInfoList;
                                                        }
                                                        XposedBridge.INSTANCE.logOpenCellId("TelephonyCallback.onCellInfoChanged injected fakeCells=" + arrayListBuildFakeCellInfoList.size());
                                                        return chain2.proceed(objArr2);
                                                    }
                                                });
                                                hookHandleIntercept4.getClass();
                                                arrayList6.add(hookHandleIntercept4);
                                                i5++;
                                            } catch (Throwable th7) {
                                                HookStatus.INSTANCE.error(cls3.getName().concat("#onCellInfoChanged"), th7);
                                            }
                                        }
                                    }
                                    HookStatus.INSTANCE.methodHooked(cls3.getName(), "onCellInfoChanged", i5);
                                }
                                if (CellInfoListBuilderKt.isTelephonyCallbackListener(locationHooker, classLoader, next, "ServiceStateListener")) {
                                    XposedBridge.INSTANCE.logOpenCellIdEvery("registerTelephonyCallback:ServiceStateListener:".concat(cls3.getName()), "registerTelephonyCallback installing ServiceStateListener hook on ".concat(cls3.getName()), 60000L);
                                    XposedHelpers xposedHelpers9 = XposedHelpers.INSTANCE;
                                    ArrayList arrayList7 = new ArrayList();
                                    d0 d0VarY5 = zm3.y(cls3.getDeclaredMethods());
                                    int i6 = 0;
                                    while (d0VarY5.hasNext()) {
                                        final Method method5 = (Method) d0VarY5.next();
                                        if (o51.f(method5.getName(), "onServiceStateChanged") && !Modifier.isAbstract(method5.getModifiers())) {
                                            try {
                                                XposedInterface.HookBuilder hookBuilderHook2 = xposedHelpers9.getModule().hook(method5);
                                                final LocationHooker locationHooker3 = locationHooker;
                                                final ClassLoader classLoader3 = classLoader;
                                                XposedInterface.HookHandle hookHandleIntercept5 = hookBuilderHook2.intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt$hookCellEnvironment$lambda$17$$inlined$hookAllMethods$2
                                                    public Object intercept(XposedInterface.Chain chain2) {
                                                        chain2.getClass();
                                                        method5.getClass();
                                                        JSONObject config$xposed_globalRelease2 = locationHooker3.readConfig$xposed_globalRelease();
                                                        if (config$xposed_globalRelease2 == null) {
                                                            List args6 = chain2.getArgs();
                                                            args6.getClass();
                                                            return chain2.proceed(args6.toArray(new Object[0]));
                                                        }
                                                        if (!config$xposed_globalRelease2.optBoolean("active", false)) {
                                                            List args7 = chain2.getArgs();
                                                            args7.getClass();
                                                            return chain2.proceed(args7.toArray(new Object[0]));
                                                        }
                                                        Object objBuildFakeServiceState = CellStateAndSignalBuilderKt.buildFakeServiceState(locationHooker3, classLoader3, config$xposed_globalRelease2.optJSONArray("cell_json"));
                                                        List args8 = chain2.getArgs();
                                                        args8.getClass();
                                                        Object[] objArr2 = (Object[]) args8.toArray(new Object[0]).clone();
                                                        if (objBuildFakeServiceState != null) {
                                                            if (!(objArr2.length == 0)) {
                                                                objArr2[0] = objBuildFakeServiceState;
                                                                XposedBridge.INSTANCE.logOpenCellId("TelephonyCallback.onServiceStateChanged injected fake ServiceState");
                                                            }
                                                        }
                                                        return chain2.proceed(objArr2);
                                                    }
                                                });
                                                hookHandleIntercept5.getClass();
                                                arrayList7.add(hookHandleIntercept5);
                                                i6++;
                                            } catch (Throwable th8) {
                                                HookStatus.INSTANCE.error(cls3.getName().concat("#onServiceStateChanged"), th8);
                                            }
                                        }
                                    }
                                    HookStatus.INSTANCE.methodHooked(cls3.getName(), "onServiceStateChanged", i6);
                                }
                                if (CellInfoListBuilderKt.isTelephonyCallbackListener(locationHooker, classLoader, next, "SignalStrengthsListener")) {
                                    XposedBridge.INSTANCE.logOpenCellIdEvery("registerTelephonyCallback:SignalStrengthsListener:".concat(cls3.getName()), "registerTelephonyCallback installing SignalStrengthsListener hook on ".concat(cls3.getName()), 60000L);
                                    XposedHelpers xposedHelpers10 = XposedHelpers.INSTANCE;
                                    ArrayList arrayList8 = new ArrayList();
                                    d0 d0VarY6 = zm3.y(cls3.getDeclaredMethods());
                                    int i7 = 0;
                                    while (d0VarY6.hasNext()) {
                                        final Method method6 = (Method) d0VarY6.next();
                                        if (o51.f(method6.getName(), "onSignalStrengthsChanged") && !Modifier.isAbstract(method6.getModifiers())) {
                                            try {
                                                XposedInterface.HookBuilder hookBuilderHook3 = xposedHelpers10.getModule().hook(method6);
                                                final LocationHooker locationHooker4 = locationHooker;
                                                final ClassLoader classLoader4 = classLoader;
                                                XposedInterface.HookHandle hookHandleIntercept6 = hookBuilderHook3.intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt$hookCellEnvironment$lambda$17$$inlined$hookAllMethods$3
                                                    public Object intercept(XposedInterface.Chain chain2) {
                                                        chain2.getClass();
                                                        method6.getClass();
                                                        JSONObject config$xposed_globalRelease2 = locationHooker4.readConfig$xposed_globalRelease();
                                                        if (config$xposed_globalRelease2 == null) {
                                                            List args6 = chain2.getArgs();
                                                            args6.getClass();
                                                            return chain2.proceed(args6.toArray(new Object[0]));
                                                        }
                                                        if (!config$xposed_globalRelease2.optBoolean("active", false)) {
                                                            List args7 = chain2.getArgs();
                                                            args7.getClass();
                                                            return chain2.proceed(args7.toArray(new Object[0]));
                                                        }
                                                        Object objBuildFakeSignalStrength = CellStateAndSignalBuilderKt.buildFakeSignalStrength(locationHooker4, classLoader4, config$xposed_globalRelease2);
                                                        List args8 = chain2.getArgs();
                                                        args8.getClass();
                                                        Object[] objArr2 = (Object[]) args8.toArray(new Object[0]).clone();
                                                        if (objBuildFakeSignalStrength != null) {
                                                            if (!(objArr2.length == 0)) {
                                                                objArr2[0] = objBuildFakeSignalStrength;
                                                                XposedBridge.INSTANCE.logOpenCellId("TelephonyCallback.onSignalStrengthsChanged injected fake SignalStrength");
                                                            }
                                                        }
                                                        return chain2.proceed(objArr2);
                                                    }
                                                });
                                                hookHandleIntercept6.getClass();
                                                arrayList8.add(hookHandleIntercept6);
                                                i7++;
                                            } catch (Throwable th9) {
                                                HookStatus.INSTANCE.error(cls3.getName().concat("#onSignalStrengthsChanged"), th9);
                                            }
                                        }
                                    }
                                    HookStatus.INSTANCE.methodHooked(cls3.getName(), "onSignalStrengthsChanged", i7);
                                }
                                List args6 = chain.getArgs();
                                args6.getClass();
                                return chain.proceed(args6.toArray(new Object[0]));
                            }
                        });
                        hookHandleIntercept3.getClass();
                        arrayList4.add(hookHandleIntercept3);
                        i++;
                    } catch (Throwable th7) {
                        HookStatus.INSTANCE.error(clsFindClass8.getName() + "#registerTelephonyCallback", th7);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClass8.getName(), "registerTelephonyCallback", i);
            xposedBridge = XposedBridge.INSTANCE;
            xposedBridge.logOpenCellId("Installed TelephonyManager.registerTelephonyCallback hook");
        } catch (Throwable th8) {
            XposedBridge xposedBridge2 = XposedBridge.INSTANCE;
            xposedBridge2.logOpenCellId("Install TelephonyManager.registerTelephonyCallback hook failed: " + th8);
            xposedBridge = xposedBridge2;
        }
        xposedBridge.logOpenCellId("Cell environment hooks installed");
    }

    public static /* synthetic */ void hookCellEnvironment$default(LocationHooker locationHooker, ClassLoader classLoader, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        hookCellEnvironment(locationHooker, classLoader, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object hookCellEnvironment$handleCellMethod(LocationHooker locationHooker, ClassLoader classLoader, XposedInterface.Chain chain, Executable executable) {
        int iFallbackAreaCode;
        int iFallbackCellIdentity;
        String name = executable.getName();
        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
        if (config$xposed_globalRelease == null) {
            XposedBridge.INSTANCE.logOpenCellIdEvery(az2.y(name, ":config-null"), az2.y(name, " skipped: config=null"), 30000L);
            List args = chain.getArgs();
            args.getClass();
            return chain.proceed(args.toArray(new Object[0]));
        }
        if (!config$xposed_globalRelease.optBoolean("active", false)) {
            XposedBridge.INSTANCE.logOpenCellIdEvery(az2.y(name, ":inactive"), az2.y(name, " skipped: active=false"), 30000L);
            List args2 = chain.getArgs();
            args2.getClass();
            return chain.proceed(args2.toArray(new Object[0]));
        }
        double dOptDouble = config$xposed_globalRelease.optDouble("lat", 0.0d);
        double dOptDouble2 = config$xposed_globalRelease.optDouble("lng", 0.0d);
        boolean zOptBoolean = config$xposed_globalRelease.optBoolean("mock_cell", true);
        JSONArray jSONArrayOptJSONArray = config$xposed_globalRelease.optJSONArray("cell_json");
        int length = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0;
        XposedBridge xposedBridge = XposedBridge.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" called active=true mockCell=");
        sb.append(zOptBoolean);
        sb.append(" cellJsonCount=");
        sb.append(length);
        az2.x(sb, " lat=", dOptDouble, " lng=");
        sb.append(dOptDouble2);
        XposedBridge.logOpenCellIdEvery$default(xposedBridge, name + ":called:" + zOptBoolean + ":" + length, sb.toString(), 0L, 4, null);
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1384328005) {
                if (iHashCode != 702848429) {
                    if (iHashCode == 1783566794 && name.equals("getNeighboringCellInfo")) {
                        xposedBridge.logOpenCellId("getNeighboringCellInfo returning empty list");
                        return new ArrayList();
                    }
                } else if (name.equals("getCellLocation")) {
                    try {
                        if (!config$xposed_globalRelease.optBoolean("mock_cell", true)) {
                            xposedBridge.logOpenCellId("getCellLocation returning null because mock_cell=false");
                            return null;
                        }
                        XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                        Object objNewInstance = xposedHelpers.newInstance(xposedHelpers.findClass("android.telephony.gsm.GsmCellLocation", classLoader), new Object[0]);
                        JSONArray jSONArrayOptJSONArray2 = config$xposed_globalRelease.optJSONArray("cell_json");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                            iFallbackAreaCode = CellInfoListBuilderKt.fallbackAreaCode(locationHooker, dOptDouble, dOptDouble2);
                            iFallbackCellIdentity = CellInfoListBuilderKt.fallbackCellIdentity(locationHooker, dOptDouble, dOptDouble2);
                        } else {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(0);
                            jSONObject.getClass();
                            iFallbackAreaCode = CellInfoListBuilderKt.cellAreaCode(locationHooker, jSONObject, CellInfoListBuilderKt.fallbackAreaCode(locationHooker, dOptDouble, dOptDouble2));
                            iFallbackCellIdentity = CellInfoListBuilderKt.cellIdentityCode(locationHooker, jSONObject, CellInfoListBuilderKt.fallbackCellIdentity(locationHooker, dOptDouble, dOptDouble2));
                        }
                        xposedHelpers.callMethod(objNewInstance, "setLacAndCid", Integer.valueOf(iFallbackAreaCode), Integer.valueOf(iFallbackCellIdentity));
                        xposedBridge.logOpenCellId("getCellLocation returning GsmCellLocation lac=" + iFallbackAreaCode + " cid=" + iFallbackCellIdentity);
                        return objNewInstance;
                    } catch (Throwable th) {
                        XposedBridge.INSTANCE.logOpenCellId("getCellLocation failed: " + th);
                        return null;
                    }
                }
            } else if (name.equals("getAllCellInfo")) {
                try {
                    if (!config$xposed_globalRelease.optBoolean("mock_cell", true)) {
                        xposedBridge.logOpenCellId("getAllCellInfo returning empty because mock_cell=false");
                        return new ArrayList();
                    }
                    ArrayList<Object> arrayListBuildFakeCellInfoList = CellInfoListBuilderKt.buildFakeCellInfoList(locationHooker, classLoader, dOptDouble, dOptDouble2, config$xposed_globalRelease);
                    XposedBridge.logOpenCellIdEvery$default(xposedBridge, "getAllCellInfo:return:" + arrayListBuildFakeCellInfoList.size(), "getAllCellInfo returning fakeCells=" + arrayListBuildFakeCellInfoList.size(), 0L, 4, null);
                    return arrayListBuildFakeCellInfoList;
                } catch (Throwable th2) {
                    XposedBridge.INSTANCE.logOpenCellId("getAllCellInfo build failed: " + th2);
                    return new ArrayList();
                }
            }
        }
        List args3 = chain.getArgs();
        args3.getClass();
        return chain.proceed(args3.toArray(new Object[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0148  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ba  */
    public static final Object hookCellEnvironment$handleTelephonyMeta(LocationHooker locationHooker, ClassLoader classLoader, XposedInterface.Chain chain, Executable executable) throws JSONException {
        Object objBuildFakeSignalStrength;
        String str;
        Object objBuildFakeServiceState;
        String name = executable.getName();
        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
        if (config$xposed_globalRelease == null) {
            XposedBridge.INSTANCE.logOpenCellIdEvery(az2.y(name, ":config-null"), az2.y(name, " skipped: config=null"), 30000L);
            List args = chain.getArgs();
            args.getClass();
            return chain.proceed(args.toArray(new Object[0]));
        }
        if (!config$xposed_globalRelease.optBoolean("active", false)) {
            XposedBridge.INSTANCE.logOpenCellIdEvery(az2.y(name, ":inactive"), az2.y(name, " skipped: active=false"), 30000L);
            List args2 = chain.getArgs();
            args2.getClass();
            return chain.proceed(args2.toArray(new Object[0]));
        }
        boolean zOptBoolean = config$xposed_globalRelease.optBoolean("mock_cell", true);
        JSONArray jSONArrayOptJSONArray = zOptBoolean ? config$xposed_globalRelease.optJSONArray("cell_json") : null;
        XposedBridge xposedBridge = XposedBridge.INSTANCE;
        XposedBridge.logOpenCellIdEvery$default(xposedBridge, name + ":called:" + zOptBoolean + ":" + (jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0), name + " called mockCell=" + zOptBoolean + " cellJsonCount=" + (jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0), 0L, 4, null);
        if (name != null) {
            switch (name.hashCode()) {
                case -2138205624:
                    if (name.equals("getDataNetworkType")) {
                        return Integer.valueOf(zOptBoolean ? 13 : 0);
                    }
                    break;
                case -1038595310:
                    if (name.equals("getPhoneType")) {
                        return 1;
                    }
                    break;
                case -687355905:
                    if (name.equals("getSignalStrength") && zOptBoolean && (objBuildFakeSignalStrength = CellStateAndSignalBuilderKt.buildFakeSignalStrength(locationHooker, classLoader, config$xposed_globalRelease)) != null) {
                        XposedBridge.logOpenCellIdEvery$default(xposedBridge, "getSignalStrength:return-signal-strength", "getSignalStrength returning fake SignalStrength", 0L, 4, null);
                        return objBuildFakeSignalStrength;
                    }
                    break;
                case -332211353:
                    if (name.equals("getNetworkOperatorName")) {
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(0);
                            jSONObject.getClass();
                            int iPositiveJsonInt = CellInfoListBuilderKt.positiveJsonInt(locationHooker, jSONObject, new String[]{"mnc", "net"}, 0);
                            String str2 = "中国移动";
                            if (iPositiveJsonInt != 0) {
                                if (iPositiveJsonInt == 1) {
                                    str2 = "中国联通";
                                } else if (iPositiveJsonInt != 2) {
                                    if (iPositiveJsonInt == 3 || iPositiveJsonInt == 5) {
                                        str2 = "中国电信";
                                    } else if (iPositiveJsonInt == 6) {
                                        str2 = "中国联通";
                                    } else if (iPositiveJsonInt != 7) {
                                        if (iPositiveJsonInt == 9) {
                                            str2 = "中国联通";
                                        } else if (iPositiveJsonInt == 11) {
                                            str2 = "中国电信";
                                        }
                                    }
                                }
                            }
                            XposedBridge.logOpenCellIdEvery$default(xposedBridge, "getNetworkOperatorName:return:".concat(str2), "getNetworkOperatorName returning ".concat(str2), 0L, 4, null);
                            return str2;
                        }
                        if (!zOptBoolean) {
                            return "";
                        }
                    }
                    break;
                case -170276507:
                    str = "getSimOperator";
                    name.equals(str);
                    break;
                case 1714085202:
                    if (name.equals("getNetworkType")) {
                        return Integer.valueOf(zOptBoolean ? 13 : 0);
                    }
                    break;
                case 1733340341:
                    if (name.equals("getServiceStateForSlot")) {
                        if (zOptBoolean && (objBuildFakeServiceState = CellStateAndSignalBuilderKt.buildFakeServiceState(locationHooker, classLoader, jSONArrayOptJSONArray)) != null) {
                            XposedBridge.logOpenCellIdEvery$default(xposedBridge, name.concat(":return-service-state"), name.concat(" returning fake ServiceState"), 0L, 4, null);
                            return objBuildFakeServiceState;
                        }
                    }
                    break;
                case 1975486802:
                    if (name.equals("getServiceState")) {
                        if (zOptBoolean) {
                            XposedBridge.logOpenCellIdEvery$default(xposedBridge, name.concat(":return-service-state"), name.concat(" returning fake ServiceState"), 0L, 4, null);
                            return objBuildFakeServiceState;
                        }
                    }
                    break;
                case 2004974992:
                    str = "getSimOperatorName";
                    name.equals(str);
                    break;
                case 2056891068:
                    if (name.equals("getNetworkOperator")) {
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(0);
                            jSONObject2.getClass();
                            String str3 = String.format(Locale.US, "%d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(CellInfoListBuilderKt.positiveJsonInt(locationHooker, jSONObject2, new String[]{"mcc"}, 460)), Integer.valueOf(CellInfoListBuilderKt.positiveJsonInt(locationHooker, jSONObject2, new String[]{"mnc", "net"}, 0))}, 2));
                            XposedBridge.logOpenCellIdEvery$default(xposedBridge, "getNetworkOperator:return:".concat(str3), "getNetworkOperator returning ".concat(str3), 0L, 4, null);
                            return str3;
                        }
                        if (!zOptBoolean) {
                            return "";
                        }
                    }
                    break;
            }
        }
        List args3 = chain.getArgs();
        args3.getClass();
        return chain.proceed(args3.toArray(new Object[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList<Object> hookCellEnvironment$lambda$9$lambda$6(zb1 zb1Var) {
        return (ArrayList) zb1Var.getValue();
    }
}
