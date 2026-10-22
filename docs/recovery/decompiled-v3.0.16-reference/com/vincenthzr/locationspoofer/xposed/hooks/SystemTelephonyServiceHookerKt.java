package com.vincenthzr.locationspoofer.xposed.hooks;

import android.os.Bundle;
import android.os.IBinder;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.hooks.network.CellInfoListBuilderKt;
import com.vincenthzr.locationspoofer.xposed.hooks.network.CellStateAndSignalBuilderKt;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemClassLocator;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.d0;
import defpackage.l13;
import defpackage.mf3;
import defpackage.o51;
import defpackage.ql0;
import defpackage.zm3;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SystemTelephonyServiceHookerKt {
    private static volatile boolean isTelephonyServiceHooked;

    public static final void hookSystemTelephonyRegistry(LocationHooker locationHooker, ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        Class<?> clsLocate$default = SystemClassLocator.locate$default(SystemClassLocator.INSTANCE, SystemComponent.TELEPHONY_REGISTRY, classLoader, null, null, null, false, null, null, 252, null);
        if (clsLocate$default != null && locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsLocate$default, Boolean.TRUE) == null) {
            TelephonyCallbackDelivery telephonyCallbackDelivery = new TelephonyCallbackDelivery(locationHooker, classLoader);
            locationHooker.getVendorExtraHooks$xposed_globalRelease().add(telephonyCallbackDelivery);
            telephonyCallbackDelivery.install(clsLocate$default);
        }
    }

    public static final void hookSystemTelephonyService(final LocationHooker locationHooker, final ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        if (isTelephonyServiceHooked) {
            return;
        }
        SystemClassLocator systemClassLocator = SystemClassLocator.INSTANCE;
        SystemComponent systemComponent = SystemComponent.TELEPHONY_PHONE_MANAGER;
        Class<?> clsLocate$default = SystemClassLocator.locate$default(systemClassLocator, systemComponent, classLoader, null, null, null, false, null, null, 252, null);
        if (clsLocate$default == null) {
            try {
                XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists("android.os.ServiceManager", classLoader);
                IBinder iBinder = null;
                if (clsFindClassIfExists != null) {
                    Object objCallStaticMethod = xposedHelpers.callStaticMethod(clsFindClassIfExists, "getService", "phone");
                    if (objCallStaticMethod instanceof IBinder) {
                        iBinder = (IBinder) objCallStaticMethod;
                    }
                }
                if (iBinder != null) {
                    clsLocate$default = iBinder.getClass();
                    HookStatus.INSTANCE.classFound(systemComponent, iBinder.getClass(), "ServiceManager.getService");
                    sysLog("[SysCell] Captured PhoneInterfaceManager from ServiceManager.getService(\"phone\"): " + iBinder.getClass());
                }
            } catch (Throwable unused) {
            }
        }
        if (clsLocate$default == null) {
            sysLog("[SysCell] PhoneInterfaceManager not found in this classloader");
            return;
        }
        if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsLocate$default, Boolean.TRUE) != null) {
            isTelephonyServiceHooked = true;
            return;
        }
        int i = 0;
        try {
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            ArrayList arrayList = new ArrayList();
            d0 d0VarY = zm3.y(clsLocate$default.getDeclaredMethods());
            int i2 = 0;
            while (d0VarY.hasNext()) {
                final Method method = (Method) d0VarY.next();
                if (o51.f(method.getName(), "getAllCellInfo") && !Modifier.isAbstract(method.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept = xposedHelpers2.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemTelephonyServiceHookerKt$hookSystemTelephonyService$$inlined$hookAllMethods$1
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method.getClass();
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease == null) {
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                                if (!config$xposed_globalRelease.optBoolean("active", false)) {
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                                SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                List<? extends Object> args3 = chain.getArgs();
                                args3.getClass();
                                String strExtractPackageName = systemHookUtils.extractPackageName(args3);
                                if (!SystemHookUtils.isTargetCaller$default(systemHookUtils, chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, null, 8, null)) {
                                    List args4 = chain.getArgs();
                                    args4.getClass();
                                    return chain.proceed(args4.toArray(new Object[0]));
                                }
                                if (!config$xposed_globalRelease.optBoolean("mock_cell", true)) {
                                    SystemTelephonyServiceHookerKt.sysLog("[SysCell] getAllCellInfo suppressed (mock_cell off) for ".concat(strExtractPackageName == null ? "caller" : strExtractPackageName));
                                    return new ArrayList();
                                }
                                try {
                                    ArrayList<Object> arrayListBuildFakeCellInfoList = CellInfoListBuilderKt.buildFakeCellInfoList(locationHooker, classLoader, config$xposed_globalRelease.optDouble("lat", 0.0d), config$xposed_globalRelease.optDouble("lng", 0.0d), config$xposed_globalRelease);
                                    SystemTelephonyServiceHookerKt.sysLog("[SysCell] Dispatched " + arrayListBuildFakeCellInfoList.size() + " fake CellInfo items to " + (strExtractPackageName == null ? "caller" : strExtractPackageName));
                                    return arrayListBuildFakeCellInfoList;
                                } catch (Throwable th) {
                                    SystemTelephonyServiceHookerKt.sysLog("[SysCell] buildFakeCellInfoList failed: " + th);
                                    List args5 = chain.getArgs();
                                    args5.getClass();
                                    return chain.proceed(args5.toArray(new Object[0]));
                                }
                            }
                        });
                        hookHandleIntercept.getClass();
                        arrayList.add(hookHandleIntercept);
                        i2++;
                    } catch (Throwable th) {
                        HookStatus.INSTANCE.error(clsLocate$default.getName() + "#getAllCellInfo", th);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), "getAllCellInfo", i2);
            sysLog("[SysCell] PhoneInterfaceManager.getAllCellInfo hooked");
        } catch (Throwable th2) {
            sysLog("[SysCell] hook getAllCellInfo failed: " + th2);
        }
        try {
            XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            d0 d0VarY2 = zm3.y(clsLocate$default.getDeclaredMethods());
            int i3 = 0;
            while (d0VarY2.hasNext()) {
                final Method method2 = (Method) d0VarY2.next();
                if (o51.f(method2.getName(), "getCellLocation") && !Modifier.isAbstract(method2.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers3.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemTelephonyServiceHookerKt$hookSystemTelephonyService$$inlined$hookAllMethods$2
                            /* JADX WARN: Code duplicated, block: B:60:0x0160  */
                            public Object intercept(XposedInterface.Chain chain) {
                                int i4;
                                int i5;
                                int i6;
                                int i7;
                                chain.getClass();
                                Method method3 = method2;
                                method3.getClass();
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease == null) {
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                                if (!config$xposed_globalRelease.optBoolean("active", false)) {
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                                SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                List<? extends Object> args3 = chain.getArgs();
                                args3.getClass();
                                String strExtractPackageName = systemHookUtils.extractPackageName(args3);
                                if (!SystemHookUtils.isTargetCaller$default(systemHookUtils, chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, null, 8, null)) {
                                    List args4 = chain.getArgs();
                                    args4.getClass();
                                    return chain.proceed(args4.toArray(new Object[0]));
                                }
                                boolean zOptBoolean = config$xposed_globalRelease.optBoolean("mock_cell", true);
                                double dOptDouble = config$xposed_globalRelease.optDouble("lat", 0.0d);
                                double dOptDouble2 = config$xposed_globalRelease.optDouble("lng", 0.0d);
                                if (zOptBoolean) {
                                    int i8 = (int) (dOptDouble * 100.0d);
                                    if (i8 < 1000) {
                                        i8 = 1000;
                                    }
                                    try {
                                        i4 = i8 % 65535;
                                    } catch (Throwable th3) {
                                        SystemTelephonyServiceHookerKt.sysLog("[SysCell] build fake CellLocation failed: " + th3);
                                        List args5 = chain.getArgs();
                                        args5.getClass();
                                        return chain.proceed(args5.toArray(new Object[0]));
                                    }
                                } else {
                                    i4 = -1;
                                }
                                if (zOptBoolean) {
                                    int i9 = (int) (dOptDouble2 * 1000.0d);
                                    if (i9 < 10000) {
                                        i9 = 10000;
                                    }
                                    i5 = i9 % 268435455;
                                } else {
                                    i5 = -1;
                                }
                                Class<?> returnType = method3.getReturnType();
                                if (returnType != null) {
                                    String str = "caller";
                                    if (returnType.equals(Bundle.class) || returnType.getName().equals("android.os.Bundle")) {
                                        int i10 = i4;
                                        int i11 = i5;
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("lac", i10);
                                        bundle.putInt("cid", i11);
                                        bundle.putInt("psc", -1);
                                        if (strExtractPackageName != 0) {
                                            str = strExtractPackageName;
                                        }
                                        SystemTelephonyServiceHookerKt.sysLog("[SysCell] Dispatched fake CellLocation Bundle to " + str + " (lac=" + i10 + ", cid=" + i11 + ")");
                                        return bundle;
                                    }
                                    if (l13.c0(returnType.getName(), "CellIdentity", false)) {
                                        try {
                                            XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
                                            Class<?> clsFindClassIfExists2 = xposedHelpers4.findClassIfExists("android.telephony.CellIdentityGsm", classLoader);
                                            if (clsFindClassIfExists2 == null) {
                                                clsFindClassIfExists2 = xposedHelpers4.findClassIfExists("android.telephony.CellIdentityGsm", ql0.i().getClassLoader());
                                            }
                                            Class<?> cls = clsFindClassIfExists2;
                                            if (cls != null) {
                                                Object objConstructCellIdentityByType = CellStateAndSignalBuilderKt.constructCellIdentityByType(locationHooker, "GSM", cls, 460, "460", 0, "00", i4, i5, 0);
                                                i6 = i4;
                                                i7 = i5;
                                                if (objConstructCellIdentityByType != null) {
                                                    try {
                                                        if (returnType.isInstance(objConstructCellIdentityByType)) {
                                                            SystemTelephonyServiceHookerKt.sysLog("[SysCell] Dispatched fake CellIdentity to " + (strExtractPackageName == 0 ? "caller" : strExtractPackageName) + " (lac=" + i6 + ", cid=" + i7 + ")");
                                                            return objConstructCellIdentityByType;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        SystemTelephonyServiceHookerKt.sysLog("[SysCell] construct fake CellIdentity failed: " + th);
                                                    }
                                                }
                                            } else {
                                                i6 = i4;
                                                i7 = i5;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            i6 = i4;
                                            i7 = i5;
                                        }
                                    } else {
                                        i6 = i4;
                                        i7 = i5;
                                    }
                                    if (l13.c0(returnType.getName(), "CellLocation", false)) {
                                        try {
                                            XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
                                            Object objNewInstance = xposedHelpers5.newInstance(xposedHelpers5.findClass("android.telephony.gsm.GsmCellLocation", classLoader), new Object[0]);
                                            xposedHelpers5.callMethod(objNewInstance, "setLacAndCid", Integer.valueOf(i6), Integer.valueOf(i7));
                                            if (returnType.isInstance(objNewInstance)) {
                                                if (strExtractPackageName != 0) {
                                                    str = strExtractPackageName;
                                                }
                                                SystemTelephonyServiceHookerKt.sysLog("[SysCell] Dispatched fake CellLocation object to " + str + " (lac=" + i6 + ", cid=" + i7 + ")");
                                                return objNewInstance;
                                            }
                                        } catch (Throwable th6) {
                                            SystemTelephonyServiceHookerKt.sysLog("[SysCell] construct fake CellLocation failed: " + th6);
                                        }
                                    }
                                }
                                return mf3.a;
                            }
                        });
                        hookHandleIntercept2.getClass();
                        arrayList2.add(hookHandleIntercept2);
                        i3++;
                    } catch (Throwable th3) {
                        HookStatus.INSTANCE.error(clsLocate$default.getName() + "#getCellLocation", th3);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), "getCellLocation", i3);
            sysLog("[SysCell] PhoneInterfaceManager.getCellLocation hooked");
        } catch (Throwable th4) {
            sysLog("[SysCell] hook getCellLocation failed: " + th4);
        }
        try {
            XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
            ArrayList arrayList3 = new ArrayList();
            d0 d0VarY3 = zm3.y(clsLocate$default.getDeclaredMethods());
            while (d0VarY3.hasNext()) {
                final Method method3 = (Method) d0VarY3.next();
                if (o51.f(method3.getName(), "requestCellInfoUpdate") && !Modifier.isAbstract(method3.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers4.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemTelephonyServiceHookerKt$hookSystemTelephonyService$$inlined$hookAllMethods$3
                            public Object intercept(XposedInterface.Chain chain) {
                                Object obj;
                                Method method4;
                                chain.getClass();
                                method3.getClass();
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease == null) {
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                                if (!config$xposed_globalRelease.optBoolean("active", false)) {
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                                SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                List<? extends Object> args3 = chain.getArgs();
                                args3.getClass();
                                String strExtractPackageName = systemHookUtils.extractPackageName(args3);
                                if (!SystemHookUtils.isTargetCaller$default(systemHookUtils, chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, null, 8, null)) {
                                    List args4 = chain.getArgs();
                                    args4.getClass();
                                    return chain.proceed(args4.toArray(new Object[0]));
                                }
                                boolean zOptBoolean = config$xposed_globalRelease.optBoolean("mock_cell", true);
                                double dOptDouble = config$xposed_globalRelease.optDouble("lat", 0.0d);
                                double dOptDouble2 = config$xposed_globalRelease.optDouble("lng", 0.0d);
                                try {
                                    List args5 = chain.getArgs();
                                    args5.getClass();
                                    Iterator it = args5.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        Object next = it.next();
                                        if (next == null || (!LocationHooker.Companion.hasTypeByName(next.getClass(), "android.telephony.ICellInfoCallback") && !l13.c0(next.getClass().getName(), "CellInfoCallback", false))) {
                                        }
                                        obj = next;
                                        break;
                                    }
                                    if (obj != null) {
                                        ArrayList<Object> arrayListBuildFakeCellInfoList = zOptBoolean ? CellInfoListBuilderKt.buildFakeCellInfoList(locationHooker, classLoader, dOptDouble, dOptDouble2, config$xposed_globalRelease) : new ArrayList<>();
                                        Method[] methods = obj.getClass().getMethods();
                                        methods.getClass();
                                        int length = methods.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= length) {
                                                method4 = null;
                                                break;
                                            }
                                            method4 = methods[i4];
                                            if (o51.f(method4.getName(), "onCellInfo")) {
                                                break;
                                            }
                                            i4++;
                                        }
                                        if (method4 != null) {
                                            method4.invoke(obj, arrayListBuildFakeCellInfoList);
                                            String str = strExtractPackageName == null ? "caller" : strExtractPackageName;
                                            SystemTelephonyServiceHookerKt.sysLog("[SysCell] Intercepted requestCellInfoUpdate for " + str + ", dispatched " + arrayListBuildFakeCellInfoList.size() + " fake cells directly");
                                            return null;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    SystemTelephonyServiceHookerKt.sysLog("[SysCell] intercept requestCellInfoUpdate failed: " + th5);
                                }
                                List args6 = chain.getArgs();
                                args6.getClass();
                                return chain.proceed(args6.toArray(new Object[0]));
                            }
                        });
                        hookHandleIntercept3.getClass();
                        arrayList3.add(hookHandleIntercept3);
                        i++;
                    } catch (Throwable th5) {
                        HookStatus.INSTANCE.error(clsLocate$default.getName() + "#requestCellInfoUpdate", th5);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), "requestCellInfoUpdate", i);
            sysLog("[SysCell] PhoneInterfaceManager.requestCellInfoUpdate hooked");
        } catch (Throwable th6) {
            sysLog("[SysCell] hook requestCellInfoUpdate failed: " + th6);
        }
        isTelephonyServiceHooked = true;
    }

    public static final boolean isTelephonyServiceHooked() {
        return isTelephonyServiceHooked;
    }

    public static final void setTelephonyServiceHooked(boolean z) {
        isTelephonyServiceHooked = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sysLog(String str) {
        XposedBridge.INSTANCE.log(str);
    }
}
