package com.vincenthzr.locationspoofer.xposed.hooks.delivery;

import android.location.Criteria;
import android.location.LocationManager;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.hooks.SystemHookUtils;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemClassLocator;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.d0;
import defpackage.dh2;
import defpackage.eh2;
import defpackage.fz;
import defpackage.mf3;
import defpackage.o51;
import defpackage.we2;
import defpackage.wg2;
import defpackage.xg2;
import defpackage.zm3;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FrameworkLocationAvailability implements SystemDeliveryAdapter {
    private final List<XposedInterface.HookHandle> handles;
    private Method invalidate;
    private volatile boolean live;
    private final ClassLoader loader;
    private final LocationHooker module;
    private final ThreadLocal<Boolean> query;
    private Timer timer;

    public FrameworkLocationAvailability(LocationHooker locationHooker, ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        this.module = locationHooker;
        this.loader = classLoader;
        this.handles = new ArrayList();
        this.query = new ThreadLocal<>();
        this.live = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean enabled(Object obj, Integer num, String str) {
        JSONObject config$xposed_globalRelease = this.module.readConfig$xposed_globalRelease();
        return config$xposed_globalRelease != null && this.live && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("force_location_enabled", false) && SystemHookUtils.INSTANCE.isTargetCaller(obj, str, config$xposed_globalRelease, num);
    }

    public static /* synthetic */ boolean enabled$default(FrameworkLocationAvailability frameworkLocationAvailability, Object obj, Integer num, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return frameworkLocationAvailability.enabled(obj, num, str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        Object wg2Var;
        this.live = false;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        this.timer = null;
        List<XposedInterface.HookHandle> list = this.handles;
        list.getClass();
        Iterator it = new eh2(list).iterator();
        while (true) {
            dh2 dh2Var = (dh2) it;
            if (!((ListIterator) dh2Var.f).hasPrevious()) {
                break;
            }
            try {
                ((XposedInterface.HookHandle) ((ListIterator) dh2Var.f).previous()).unhook();
                wg2Var = mf3.a;
            } catch (Throwable th) {
                wg2Var = new wg2(th);
            }
            Throwable thA = xg2.a(wg2Var);
            if (thA != null) {
                HookStatus.INSTANCE.error("FrameworkDelivery unhook", thA);
            }
        }
        this.handles.clear();
        this.query.remove();
        try {
            Method method = this.invalidate;
            if (method != null) {
                method.invoke(null, null);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.delivery.SystemDeliveryAdapter
    public boolean install() {
        Class clsLocate$default;
        Class cls;
        Class cls2 = Boolean.TYPE;
        try {
            SystemClassLocator systemClassLocator = SystemClassLocator.INSTANCE;
            Class<?> clsLocate$default2 = SystemClassLocator.locate$default(systemClassLocator, SystemComponent.LOCATION_MANAGER_SERVICE, this.loader, null, null, null, false, null, null, 252, null);
            if (clsLocate$default2 == null || (clsLocate$default = SystemClassLocator.locate$default(systemClassLocator, SystemComponent.LOCATION_PROVIDER_MANAGER, this.loader, null, null, null, false, null, null, 252, null)) == null) {
                return false;
            }
            final Method methodFindMethodExact = XposedHelpers.INSTANCE.findMethodExact(clsLocate$default2, "getLocationProviderManager", String.class);
            Class<?> cls3 = Class.forName("android.location.util.identity.CallerIdentity", false, this.loader);
            Class cls4 = Integer.TYPE;
            Iterator it = am1.G(clsLocate$default2.getDeclaredMethod("isLocationEnabledForUser", cls4), clsLocate$default2.getDeclaredMethod("isProviderEnabledForUser", String.class, cls4), clsLocate$default.getDeclaredMethod("isEnabled", cls4), clsLocate$default.getDeclaredMethod("isActive", cls2, cls3)).iterator();
            while (it.hasNext()) {
                if (!o51.f(((Method) it.next()).getReturnType(), cls2)) {
                    throw new IllegalStateException("Incompatible availability result");
                }
            }
            final Method declaredMethod = LocationManager.class.getDeclaredMethod("invalidateLocalLocationEnabledCaches", null);
            declaredMethod.setAccessible(true);
            this.invalidate = declaredMethod;
            Iterator it2 = am1.G("isLocationEnabledForUser", "isProviderEnabledForUser").iterator();
            while (it2.hasNext()) {
                final String str = (String) it2.next();
                XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                ArrayList arrayList = new ArrayList();
                d0 d0VarY = zm3.y(clsLocate$default2.getDeclaredMethods());
                int i = 0;
                while (d0VarY.hasNext()) {
                    final Method method = (Method) d0VarY.next();
                    it2 = it2;
                    if (!o51.f(method.getName(), str) || Modifier.isAbstract(method.getModifiers())) {
                        cls = clsLocate$default;
                        clsLocate$default = cls;
                        methodFindMethodExact = methodFindMethodExact;
                    } else {
                        try {
                            cls = clsLocate$default;
                            try {
                                XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationAvailability$install$$inlined$hookAllMethods$1
                                    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
                                    
                                        if (r8.invoke(r0, defpackage.zy.o0(r9)) == null) goto L14;
                                     */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public java.lang.Object intercept(io.github.libxposed.api.XposedInterface.Chain r9) {
                                        /*
                                            r8 = this;
                                            r9.getClass()
                                            java.lang.reflect.Method r0 = r1
                                            r0.getClass()
                                            java.util.List r1 = r9.getArgs()
                                            r1.getClass()
                                            r2 = 0
                                            java.lang.Object[] r2 = new java.lang.Object[r2]
                                            java.lang.Object[] r1 = r1.toArray(r2)
                                            java.lang.Object r1 = r9.proceed(r1)
                                            java.lang.Class r0 = r0.getReturnType()
                                            java.lang.Class r2 = java.lang.Boolean.TYPE
                                            boolean r0 = defpackage.o51.f(r0, r2)
                                            if (r0 == 0) goto L60
                                            com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationAvailability r2 = r2
                                            java.lang.Object r3 = r9.getThisObject()
                                            r6 = 6
                                            r7 = 0
                                            r4 = 0
                                            r5 = 0
                                            boolean r0 = com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationAvailability.enabled$default(r2, r3, r4, r5, r6, r7)
                                            if (r0 != 0) goto L37
                                            goto L60
                                        L37:
                                            java.lang.String r0 = r3
                                            java.lang.String r2 = "isProviderEnabledForUser"
                                            boolean r0 = defpackage.o51.f(r0, r2)
                                            if (r0 == 0) goto L5d
                                            java.lang.reflect.Method r8 = r4
                                            java.lang.Object r0 = r9.getThisObject()
                                            java.util.List r9 = r9.getArgs()
                                            r9.getClass()
                                            java.lang.Object r9 = defpackage.zy.o0(r9)
                                            java.lang.Object[] r9 = new java.lang.Object[]{r9}
                                            java.lang.Object r8 = r8.invoke(r0, r9)
                                            if (r8 != 0) goto L5d
                                            goto L60
                                        L5d:
                                            java.lang.Boolean r8 = java.lang.Boolean.TRUE
                                            return r8
                                        L60:
                                            return r1
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationAvailability$install$$inlined$hookAllMethods$1.intercept(io.github.libxposed.api.XposedInterface$Chain):java.lang.Object");
                                    }
                                });
                                hookHandleIntercept.getClass();
                                arrayList.add(hookHandleIntercept);
                                i++;
                                clsLocate$default = cls;
                            } catch (Throwable th) {
                                th = th;
                                HookStatus.INSTANCE.error(clsLocate$default2.getName() + "#" + str, th);
                                clsLocate$default = cls;
                                methodFindMethodExact = methodFindMethodExact;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cls = clsLocate$default;
                        }
                    }
                }
                Iterator it3 = it2;
                Class cls5 = clsLocate$default;
                Method method2 = methodFindMethodExact;
                HookStatus.INSTANCE.methodHooked(clsLocate$default2.getName(), str, i);
                fz.b0(this.handles, arrayList);
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException(("Availability hook unavailable: " + str).toString());
                }
                it2 = it3;
                clsLocate$default = cls5;
                methodFindMethodExact = method2;
            }
            Class cls6 = clsLocate$default;
            List<XposedInterface.HookHandle> list = this.handles;
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            d0 d0VarY2 = zm3.y(clsLocate$default2.getDeclaredMethods());
            int i2 = 0;
            while (d0VarY2.hasNext()) {
                final Method method3 = (Method) d0VarY2.next();
                if (!o51.f(method3.getName(), "getProviders") || Modifier.isAbstract(method3.getModifiers())) {
                    xposedHelpers2 = xposedHelpers2;
                } else {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers2.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationAvailability$install$$inlined$hookAllMethods$2
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method3.getClass();
                                Boolean bool = (Boolean) this.query.get();
                                this.query.set(Boolean.valueOf(FrameworkLocationAvailability.enabled$default(this, chain.getThisObject(), null, null, 6, null)));
                                try {
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                } finally {
                                    ThreadLocal threadLocal = this.query;
                                    if (bool == null) {
                                        threadLocal.remove();
                                    }
                                    threadLocal.set(bool);
                                }
                            }
                        });
                        hookHandleIntercept2.getClass();
                        arrayList2.add(hookHandleIntercept2);
                        i2++;
                    } catch (Throwable th3) {
                        HookStatus.INSTANCE.error(clsLocate$default2.getName() + "#getProviders", th3);
                        xposedHelpers2 = xposedHelpers2;
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsLocate$default2.getName(), "getProviders", i2);
            fz.b0(list, arrayList2);
            List<XposedInterface.HookHandle> list2 = this.handles;
            XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
            ArrayList arrayList3 = new ArrayList();
            d0 d0VarY3 = zm3.y(cls6.getDeclaredMethods());
            int i3 = 0;
            while (d0VarY3.hasNext()) {
                final Method method4 = (Method) d0VarY3.next();
                if (!o51.f(method4.getName(), "isEnabled") || Modifier.isAbstract(method4.getModifiers())) {
                    xposedHelpers3 = xposedHelpers3;
                } else {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers3.getModule().hook(method4).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationAvailability$install$$inlined$hookAllMethods$3
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                Method method5 = method4;
                                method5.getClass();
                                List args = chain.getArgs();
                                args.getClass();
                                Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                if (this.live) {
                                    Object obj = this.query.get();
                                    Boolean bool = Boolean.TRUE;
                                    if (o51.f(obj, bool) && o51.f(method5.getReturnType(), Boolean.TYPE)) {
                                        return bool;
                                    }
                                }
                                return objProceed;
                            }
                        });
                        hookHandleIntercept3.getClass();
                        arrayList3.add(hookHandleIntercept3);
                        i3++;
                    } catch (Throwable th4) {
                        HookStatus.INSTANCE.error(cls6.getName() + "#isEnabled", th4);
                        xposedHelpers3 = xposedHelpers3;
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(cls6.getName(), "isEnabled", i3);
            fz.b0(list2, arrayList3);
            List<XposedInterface.HookHandle> list3 = this.handles;
            XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
            ArrayList arrayList4 = new ArrayList();
            d0 d0VarY4 = zm3.y(cls6.getDeclaredMethods());
            int i4 = 0;
            while (d0VarY4.hasNext()) {
                final Method method5 = (Method) d0VarY4.next();
                if (o51.f(method5.getName(), "isActive") && !Modifier.isAbstract(method5.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept4 = xposedHelpers4.getModule().hook(method5).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationAvailability$install$$inlined$hookAllMethods$4
                            /* JADX WARN: Code duplicated, block: B:27:0x0078  */
                            public Object intercept(XposedInterface.Chain chain) {
                                Object next;
                                boolean z;
                                Object wg2Var;
                                chain.getClass();
                                Method method6 = method5;
                                method6.getClass();
                                List args = chain.getArgs();
                                args.getClass();
                                Iterator it4 = args.iterator();
                                loop0: while (true) {
                                    if (!it4.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it4.next();
                                    if (next != null) {
                                        Method[] methods = next.getClass().getMethods();
                                        methods.getClass();
                                        for (Method method7 : methods) {
                                            if (o51.f(method7.getName(), "getUid") && method7.getParameterCount() == 0) {
                                                break loop0;
                                            }
                                        }
                                    }
                                }
                                FrameworkLocationAvailability frameworkLocationAvailability = this;
                                if (next != null) {
                                    try {
                                        Object thisObject = chain.getThisObject();
                                        XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
                                        Object objCallMethod = xposedHelpers5.callMethod(next, "getUid", new Object[0]);
                                        objCallMethod.getClass();
                                        Integer num = (Integer) objCallMethod;
                                        Object objCallMethod2 = xposedHelpers5.callMethod(next, "getPackageName", new Object[0]);
                                        if (frameworkLocationAvailability.enabled(thisObject, num, objCallMethod2 instanceof String ? (String) objCallMethod2 : null)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        wg2Var = Boolean.valueOf(z);
                                    } catch (Throwable th5) {
                                        wg2Var = new wg2(th5);
                                    }
                                } else {
                                    z = false;
                                    wg2Var = Boolean.valueOf(z);
                                }
                                Object obj = Boolean.FALSE;
                                if (wg2Var instanceof wg2) {
                                    wg2Var = obj;
                                }
                                Boolean bool = (Boolean) wg2Var;
                                boolean zBooleanValue = bool.booleanValue();
                                List args2 = chain.getArgs();
                                args2.getClass();
                                Object[] array = args2.toArray(new Object[0]);
                                if (zBooleanValue) {
                                    if (Arrays.equals(method6.getParameterTypes(), new Class[]{Boolean.TYPE, next != null ? next.getClass() : null})) {
                                        array[0] = Boolean.TRUE;
                                    }
                                }
                                Boolean bool2 = (Boolean) this.query.get();
                                this.query.set(bool);
                                try {
                                    return chain.proceed(array);
                                } finally {
                                    ThreadLocal threadLocal = this.query;
                                    if (bool2 == null) {
                                        threadLocal.remove();
                                    } else {
                                        threadLocal.set(bool2);
                                    }
                                }
                            }
                        });
                        hookHandleIntercept4.getClass();
                        arrayList4.add(hookHandleIntercept4);
                        i4++;
                    } catch (Throwable th5) {
                        HookStatus.INSTANCE.error(cls6.getName() + "#isActive", th5);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(cls6.getName(), "isActive", i4);
            fz.b0(list3, arrayList4);
            for (String str2 : am1.G("getProviders", "getBestProvider")) {
                LocationHooker locationHooker = this.module;
                XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
                cls2.getClass();
                locationHooker.deoptimize(xposedHelpers5.findMethodExact(clsLocate$default2, str2, Criteria.class, cls2));
            }
            final we2 we2Var = new we2();
            Timer timer = new Timer("LocationSpoofer-FrameworkDeliveryAvailability", true);
            timer.schedule(new TimerTask() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationAvailability$install$6$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Object wg2Var;
                    if (this.this$0.live) {
                        FrameworkLocationAvailability frameworkLocationAvailability = this.this$0;
                        we2 we2Var2 = we2Var;
                        Method method6 = declaredMethod;
                        try {
                            JSONObject config$xposed_globalRelease = frameworkLocationAvailability.module.readConfig$xposed_globalRelease();
                            String str3 = (config$xposed_globalRelease != null ? Boolean.valueOf(config$xposed_globalRelease.optBoolean("active", false)) : null) + "|" + (config$xposed_globalRelease != null ? Boolean.valueOf(config$xposed_globalRelease.optBoolean("force_location_enabled", false)) : null) + "|" + (config$xposed_globalRelease != null ? Boolean.valueOf(config$xposed_globalRelease.optBoolean("system_hook_global_mode", false)) : null) + "|" + (config$xposed_globalRelease != null ? config$xposed_globalRelease.optJSONArray("system_hook_packages") : null);
                            if (!str3.equals(we2Var2.e)) {
                                method6.invoke(null, null);
                                we2Var2.e = str3;
                            }
                            wg2Var = mf3.a;
                        } catch (Throwable th6) {
                            wg2Var = new wg2(th6);
                        }
                        Throwable thA = xg2.a(wg2Var);
                        if (thA != null) {
                            HookStatus.INSTANCE.error("FrameworkDelivery availability cache", thA);
                        }
                    }
                }
            }, 0L, 1000L);
            this.timer = timer;
            return true;
        } catch (Throwable th6) {
            HookStatus.INSTANCE.error("FrameworkDelivery availability", th6);
            close();
            return false;
        }
    }
}
