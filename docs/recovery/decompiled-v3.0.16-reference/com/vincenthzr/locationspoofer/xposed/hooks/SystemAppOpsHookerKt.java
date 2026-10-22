package com.vincenthzr.locationspoofer.xposed.hooks;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemClassLocator;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.d0;
import defpackage.o51;
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
public final class SystemAppOpsHookerKt {
    public static final void hookSystemAppOpsService(final LocationHooker locationHooker, ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        Class<?> clsLocate$default = SystemClassLocator.locate$default(SystemClassLocator.INSTANCE, SystemComponent.APPOPS_SERVICE, classLoader, null, null, null, false, null, null, 252, null);
        int i = 0;
        if (clsLocate$default != null && locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsLocate$default, Boolean.TRUE) == null) {
            String[] strArr = {"checkOperation", "noteOperation", "checkAudioOperation"};
            for (int i2 = 0; i2 < 3; i2++) {
                String str = strArr[i2];
                try {
                    XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    d0 d0VarY = zm3.y(clsLocate$default.getDeclaredMethods());
                    int i3 = 0;
                    while (d0VarY.hasNext()) {
                        final Method method = (Method) d0VarY.next();
                        if (o51.f(method.getName(), str) && !Modifier.isAbstract(method.getModifiers())) {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemAppOpsHookerKt$hookSystemAppOpsService$$inlined$hookAllMethods$1
                                    public Object intercept(XposedInterface.Chain chain) {
                                        Object next;
                                        chain.getClass();
                                        method.getClass();
                                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                            List args = chain.getArgs();
                                            args.getClass();
                                            Iterator it = args.iterator();
                                            do {
                                                if (!it.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it.next();
                                            } while (!(next instanceof Integer));
                                            Integer num = next instanceof Integer ? (Integer) next : null;
                                            if (num != null && num.intValue() == 58) {
                                                SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                                List<? extends Object> args2 = chain.getArgs();
                                                args2.getClass();
                                                if (SystemHookUtils.isTargetCaller$default(systemHookUtils, chain.getThisObject(), systemHookUtils.extractPackageName(args2), config$xposed_globalRelease, null, 8, null)) {
                                                    return 1;
                                                }
                                            }
                                        }
                                        List args3 = chain.getArgs();
                                        args3.getClass();
                                        return chain.proceed(args3.toArray(new Object[0]));
                                    }
                                });
                                hookHandleIntercept.getClass();
                                arrayList.add(hookHandleIntercept);
                                i3++;
                            } catch (Throwable th) {
                                HookStatus.INSTANCE.error(clsLocate$default.getName() + "#" + str, th);
                            }
                        }
                    }
                    HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), str, i3);
                } catch (Throwable unused) {
                }
            }
            sysLog("[SysHook] AppOpsService OP_MOCK_LOCATION hooked");
        }
        try {
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            Class<?> clsFindClassIfExists = xposedHelpers2.findClassIfExists("android.provider.Settings$Secure", classLoader);
            if (clsFindClassIfExists != null) {
                ArrayList arrayList2 = new ArrayList();
                d0 d0VarY2 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                while (d0VarY2.hasNext()) {
                    final Method method2 = (Method) d0VarY2.next();
                    if (o51.f(method2.getName(), "getString") && !Modifier.isAbstract(method2.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers2.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemAppOpsHookerKt$hookSystemAppOpsService$$inlined$hookAllMethods$2
                                public Object intercept(XposedInterface.Chain chain) {
                                    Object next;
                                    chain.getClass();
                                    method2.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        List args = chain.getArgs();
                                        args.getClass();
                                        Iterator it = args.iterator();
                                        do {
                                            if (!it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                        } while (!(next instanceof String));
                                        String str2 = next instanceof String ? (String) next : null;
                                        if (o51.f(str2, "mock_location") || o51.f(str2, "allow_mock_location")) {
                                            return "0";
                                        }
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept2.getClass();
                            arrayList2.add(hookHandleIntercept2);
                            i++;
                        } catch (Throwable th2) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getString", th2);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getString", i);
            }
        } catch (Throwable unused2) {
        }
    }

    private static final void sysLog(String str) {
        XposedBridge.INSTANCE.log(str);
    }
}
