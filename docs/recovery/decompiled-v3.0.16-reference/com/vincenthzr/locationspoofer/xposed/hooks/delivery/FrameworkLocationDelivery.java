package com.vincenthzr.locationspoofer.xposed.hooks.delivery;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.SystemClock;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.hooks.BaseLocationHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.GnssSatelliteCatalog;
import com.vincenthzr.locationspoofer.xposed.hooks.LocationStartupGate;
import com.vincenthzr.locationspoofer.xposed.hooks.SystemHookUtils;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationDelivery;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemClassLocator;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent;
import com.vincenthzr.locationspoofer.xposed.utils.CallScope;
import com.vincenthzr.locationspoofer.xposed.utils.CoordinateConverterKt;
import com.vincenthzr.locationspoofer.xposed.utils.SpoofedMotion;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.au0;
import defpackage.az;
import defpackage.az2;
import defpackage.b81;
import defpackage.d0;
import defpackage.dh2;
import defpackage.eh2;
import defpackage.et0;
import defpackage.j41;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.mh0;
import defpackage.nt0;
import defpackage.o51;
import defpackage.q2;
import defpackage.se2;
import defpackage.wg2;
import defpackage.ys0;
import defpackage.zm3;
import defpackage.zy;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Timer;
import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FrameworkLocationDelivery implements SystemDeliveryAdapter {
    private Method acceptLocation;
    private Method deepCopyResult;
    private Method deliverToListeners;
    private volatile boolean enabled;
    private Method getIdentity;
    private Method getPackageName;
    private Method getUid;
    private final List<XposedInterface.HookHandle> hooks;
    private Field internalField;
    private Method isProvider;
    private final CallScope<Object> lastLocationScope;
    private final ClassLoader loader;
    private final Set<Object> managers;
    private final LocationHooker module;
    private Field nameField;
    private Field ownerField;
    private String policyKey;
    private Class<?> registrationClass;
    private final List<Method> removeMsl;
    private Method resultAsList;
    private final LocationStartupGate startupGate;
    private final CallScope<StartupRequest> startupScope;
    private Timer timer;
    private Method updateRegistrations;
    private Method wrapResult;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class StartupRequest {
        private final Object owner;
        private final List<Object> registrations;
        private final boolean singleShot;

        public StartupRequest(Object obj, boolean z) {
            obj.getClass();
            this.owner = obj;
            this.singleShot = z;
            this.registrations = new ArrayList();
        }

        public final Object getOwner() {
            return this.owner;
        }

        public final List<Object> getRegistrations() {
            return this.registrations;
        }

        public final boolean getSingleShot() {
            return this.singleShot;
        }
    }

    public FrameworkLocationDelivery(LocationHooker locationHooker, ClassLoader classLoader) {
        Object wg2Var;
        locationHooker.getClass();
        classLoader.getClass();
        this.module = locationHooker;
        this.loader = classLoader;
        this.managers = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.lastLocationScope = new CallScope<>();
        this.startupScope = new CallScope<>();
        this.startupGate = new LocationStartupGate(1000000000L);
        this.hooks = new ArrayList();
        List listG = am1.G("removeMslAltitude", "removeMslAltitudeAccuracy");
        ArrayList arrayList = new ArrayList();
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            try {
                wg2Var = Location.class.getMethod((String) it.next(), null);
            } catch (Throwable th) {
                wg2Var = new wg2(th);
            }
            Method method = (Method) (wg2Var instanceof wg2 ? null : wg2Var);
            if (method != null) {
                arrayList.add(method);
            }
        }
        this.removeMsl = arrayList;
    }

    private final Method accessible(Method method) {
        method.setAccessible(true);
        return method;
    }

    private final void applySatelliteExtras(Location location, JSONObject jSONObject) {
        int iV = mh0.v(jSONObject.optInt("satellite_count", 20), 4, 32);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        Iterable iterableF0 = mh0.f0(0, iV);
        if (!(iterableF0 instanceof Collection) || !((Collection) iterableF0).isEmpty()) {
            Iterator it = iterableF0.iterator();
            while (it.hasNext()) {
                if (GnssSatelliteCatalog.INSTANCE.signal(((j41) it).nextInt(), jCurrentTimeMillis, jSONObject.optBoolean("enable_jitter", true)).getUsedInFix() && (i = i + 1) < 0) {
                    am1.W();
                    throw null;
                }
            }
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        Bundle bundle = new Bundle(extras);
        bundle.putInt("satellites", iV);
        bundle.putInt("satellites_in_view", iV);
        bundle.putInt("satellites_visible", iV);
        bundle.putInt("satellites_used_in_fix", i);
        location.setExtras(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object close$lambda$47$lambda$46(FrameworkLocationDelivery frameworkLocationDelivery, Object obj) {
        Method method = frameworkLocationDelivery.updateRegistrations;
        if (method != null) {
            return method.invoke(obj, new nt0(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean close$lambda$47$lambda$46$lambda$45(Object obj) {
        return true;
    }

    private final Object copyResult(Object obj, JSONObject jSONObject) throws IllegalAccessException, InvocationTargetException {
        SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(this.module, "WGS-84");
        if (currentSpoofedMotion == null) {
            return null;
        }
        Method method = this.deepCopyResult;
        if (method == null) {
            o51.F("deepCopyResult");
            throw null;
        }
        Object objInvoke = method.invoke(obj, null);
        Method method2 = this.resultAsList;
        if (method2 == null) {
            o51.F("resultAsList");
            throw null;
        }
        Object objInvoke2 = method2.invoke(objInvoke, null);
        objInvoke2.getClass();
        for (Object obj2 : (List) objInvoke2) {
            obj2.getClass();
            Location location = (Location) obj2;
            SystemHookUtils.INSTANCE.applyFakeLocationFields(location, currentSpoofedMotion, jSONObject.optDouble("altitude", 25.0d), CoordinateConverterKt.getJitteredAccuracy(this.module));
            Iterator<T> it = this.removeMsl.iterator();
            while (it.hasNext()) {
                ((Method) it.next()).invoke(location, null);
            }
            applySatelliteExtras(location, jSONObject);
        }
        return objInvoke;
    }

    private final void deliver(final Object obj, final List<? extends Object> list) throws IllegalAccessException, InvocationTargetException {
        Function function = new Function() { // from class: ft0
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return FrameworkLocationDelivery.deliver$lambda$34(this.a, list, obj, obj2);
            }
        };
        Method method = this.deliverToListeners;
        if (method != null) {
            method.invoke(obj, function);
        } else {
            o51.F("deliverToListeners");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deliver$default(FrameworkLocationDelivery frameworkLocationDelivery, Object obj, List list, int i, Object obj2) throws IllegalAccessException, InvocationTargetException {
        if ((i & 2) != 0) {
            list = null;
        }
        frameworkLocationDelivery.deliver(obj, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object deliver$lambda$34(FrameworkLocationDelivery frameworkLocationDelivery, List list, Object obj, Object obj2) {
        return frameworkLocationDelivery.guarded("registration delivery", new q2(frameworkLocationDelivery, list, obj2, obj, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object deliver$lambda$34$lambda$33(FrameworkLocationDelivery frameworkLocationDelivery, List list, Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        Location locationMakeLocation;
        if (!frameworkLocationDelivery.enabled) {
            return null;
        }
        if (list != null) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (it.next() == obj) {
                    }
                }
            }
            return null;
        }
        JSONObject config$xposed_globalRelease = frameworkLocationDelivery.module.readConfig$xposed_globalRelease();
        if (config$xposed_globalRelease == null) {
            return null;
        }
        Method method = frameworkLocationDelivery.getIdentity;
        if (method == null) {
            o51.F("getIdentity");
            throw null;
        }
        Object objInvoke = method.invoke(obj, null);
        objInvoke.getClass();
        if (!frameworkLocationDelivery.isTarget(obj2, objInvoke, config$xposed_globalRelease) || (locationMakeLocation = frameworkLocationDelivery.makeLocation(obj2)) == null) {
            return null;
        }
        Method method2 = frameworkLocationDelivery.wrapResult;
        if (method2 == null) {
            o51.F("wrapResult");
            throw null;
        }
        Object objInvoke2 = method2.invoke(null, new Location[]{locationMakeLocation});
        Method method3 = frameworkLocationDelivery.acceptLocation;
        if (method3 != null) {
            return method3.invoke(obj, objInvoke2);
        }
        o51.F("acceptLocation");
        throw null;
    }

    private final void expects(Method method, Class<?> cls) {
        if (o51.f(method.getReturnType(), cls)) {
            return;
        }
        throw new IllegalStateException(("Incompatible return type: " + method + ", expected " + cls.getName()).toString());
    }

    private final Field findField(Class<?> cls, String str) throws NoSuchFieldException {
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException(az2.k(cls.getName(), ".", str));
    }

    private final Method findMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.getClass();
                return this.accessible(declaredMethod);
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException(az2.k(cls.getName(), ".", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T guarded(String str, au0 au0Var) {
        try {
            return (T) au0Var.invoke();
        } catch (Throwable th) {
            XposedBridge.INSTANCE.logOpenCellIdEvery(az2.j("FrameworkDelivery-", str), str + " failed: " + th, 10000L);
            return null;
        }
    }

    private final void hook(final Method method, final lu0 lu0Var) {
        XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
        Class<?> declaringClass = method.getDeclaringClass();
        declaringClass.getClass();
        String name = method.getName();
        name.getClass();
        ArrayList arrayList = new ArrayList();
        d0 d0VarY = zm3.y(declaringClass.getDeclaredMethods());
        int i = 0;
        while (d0VarY.hasNext()) {
            final Method method2 = (Method) d0VarY.next();
            if (o51.f(method2.getName(), name) && !Modifier.isAbstract(method2.getModifiers())) {
                try {
                    XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationDelivery$hook$$inlined$hookAllMethods$1
                        public Object intercept(XposedInterface.Chain chain) {
                            chain.getClass();
                            Method method3 = method2;
                            method3.getClass();
                            if (this.enabled && method3.equals(method)) {
                                return lu0Var.invoke(chain);
                            }
                            List args = chain.getArgs();
                            args.getClass();
                            return chain.proceed(args.toArray(new Object[0]));
                        }
                    });
                    hookHandleIntercept.getClass();
                    arrayList.add(hookHandleIntercept);
                    i++;
                } catch (Throwable th) {
                    HookStatus.INSTANCE.error(declaringClass.getName() + "#" + name, th);
                }
            }
        }
        HookStatus.INSTANCE.methodHooked(declaringClass.getName(), name, i);
        this.hooks.addAll(arrayList);
        if (arrayList.isEmpty()) {
            b81.q(method, "Unable to hook ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$12(FrameworkLocationDelivery frameworkLocationDelivery, XposedInterface.Chain chain) {
        List<Object> registrations;
        chain.getClass();
        StartupRequest current = frameworkLocationDelivery.startupScope.getCurrent();
        if (current == null || current.getOwner() != chain.getThisObject()) {
            current = null;
        }
        Object obj = chain.getArgs().get(1);
        if (obj != null) {
            if (current != null && (registrations = current.getRegistrations()) != null) {
                registrations.add(obj);
            }
            if (current != null && !current.getSingleShot()) {
                frameworkLocationDelivery.startupGate.registering(obj);
            }
        }
        List args = chain.getArgs();
        args.getClass();
        Object objProceed = chain.proceed(args.toArray(new Object[0]));
        Object thisObject = chain.getThisObject();
        if (thisObject != null) {
            frameworkLocationDelivery.managers.add(thisObject);
        }
        return objProceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$16(FrameworkLocationDelivery frameworkLocationDelivery, Method method, XposedInterface.Chain chain) {
        chain.getClass();
        Object thisObject = chain.getThisObject();
        int i = 1;
        Object obj = chain.getArgs().get(1);
        JSONObject config$xposed_globalRelease = frameworkLocationDelivery.module.readConfig$xposed_globalRelease();
        if (thisObject == null || obj == null || config$xposed_globalRelease == null || !frameworkLocationDelivery.isTarget(thisObject, obj, config$xposed_globalRelease)) {
            List args = chain.getArgs();
            args.getClass();
            return chain.proceed(args.toArray(new Object[0]));
        }
        StartupRequest startupRequest = new StartupRequest(thisObject, o51.f(method.getName(), "getCurrentLocation"));
        try {
            Object objWithValue = frameworkLocationDelivery.startupScope.withValue(startupRequest, new ys0(chain, i));
            if (!startupRequest.getSingleShot()) {
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                Iterator<T> it = startupRequest.getRegistrations().iterator();
                while (it.hasNext()) {
                    frameworkLocationDelivery.startupGate.registered(it.next(), jElapsedRealtimeNanos);
                }
            } else if (!startupRequest.getRegistrations().isEmpty()) {
                frameworkLocationDelivery.guarded("startup location", new c(frameworkLocationDelivery, thisObject, startupRequest, i));
            }
            return objWithValue;
        } catch (Throwable th) {
            List<Object> registrations = startupRequest.getRegistrations();
            LocationStartupGate locationStartupGate = frameworkLocationDelivery.startupGate;
            Iterator<T> it2 = registrations.iterator();
            while (it2.hasNext()) {
                locationStartupGate.forget(it2.next());
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$16$lambda$13(XposedInterface.Chain chain) {
        List args = chain.getArgs();
        args.getClass();
        return chain.proceed(args.toArray(new Object[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 install$lambda$16$lambda$15(FrameworkLocationDelivery frameworkLocationDelivery, Object obj, StartupRequest startupRequest) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            frameworkLocationDelivery.deliver(obj, startupRequest.getRegistrations());
            return mf3.a;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$18(FrameworkLocationDelivery frameworkLocationDelivery, XposedInterface.Chain chain) {
        chain.getClass();
        Object thisObject = chain.getThisObject();
        if (thisObject != null) {
            frameworkLocationDelivery.managers.add(thisObject);
        }
        List args = chain.getArgs();
        args.getClass();
        return chain.proceed(args.toArray(new Object[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$20(FrameworkLocationDelivery frameworkLocationDelivery, XposedInterface.Chain chain) {
        chain.getClass();
        Object thisObject = chain.getThisObject();
        JSONObject config$xposed_globalRelease = frameworkLocationDelivery.module.readConfig$xposed_globalRelease();
        Object obj = chain.getArgs().get(1);
        boolean z = (thisObject == null || obj == null || config$xposed_globalRelease == null || !frameworkLocationDelivery.isTarget(thisObject, obj, config$xposed_globalRelease)) ? false : true;
        CallScope<Object> callScope = frameworkLocationDelivery.lastLocationScope;
        if (!z) {
            thisObject = null;
        }
        return callScope.withValue(thisObject, new ys0(chain, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$20$lambda$19(XposedInterface.Chain chain) {
        List args = chain.getArgs();
        args.getClass();
        return chain.proceed(args.toArray(new Object[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$22(FrameworkLocationDelivery frameworkLocationDelivery, XposedInterface.Chain chain) {
        Location location;
        chain.getClass();
        Object thisObject = chain.getThisObject();
        if (thisObject != null && frameworkLocationDelivery.lastLocationScope.getCurrent() == thisObject && (location = (Location) frameworkLocationDelivery.guarded("last location", new et0(frameworkLocationDelivery, thisObject, 2))) != null) {
            return location;
        }
        List args = chain.getArgs();
        args.getClass();
        return chain.proceed(args.toArray(new Object[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$24(FrameworkLocationDelivery frameworkLocationDelivery, XposedInterface.Chain chain) {
        chain.getClass();
        Object thisObject = chain.getThisObject();
        Object obj = chain.getArgs().get(0);
        se2 se2Var = new se2();
        Object objGuarded = (thisObject == null || obj == null) ? null : frameworkLocationDelivery.guarded("location delivery", new q2(frameworkLocationDelivery, thisObject, se2Var, obj, 8));
        if (se2Var.e) {
            return null;
        }
        List args = chain.getArgs();
        args.getClass();
        Object[] array = args.toArray(new Object[0]);
        if (objGuarded != null) {
            array[0] = objGuarded;
        }
        return chain.proceed(array);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$24$lambda$23(FrameworkLocationDelivery frameworkLocationDelivery, Object obj, se2 se2Var, Object obj2) throws IllegalAccessException, InvocationTargetException {
        Field field = frameworkLocationDelivery.ownerField;
        if (field == null) {
            o51.F("ownerField");
            throw null;
        }
        Object obj3 = field.get(obj);
        JSONObject config$xposed_globalRelease = frameworkLocationDelivery.module.readConfig$xposed_globalRelease();
        Method method = frameworkLocationDelivery.getIdentity;
        if (method == null) {
            o51.F("getIdentity");
            throw null;
        }
        Object objInvoke = method.invoke(obj, null);
        if (config$xposed_globalRelease != null) {
            obj3.getClass();
            objInvoke.getClass();
            if (frameworkLocationDelivery.isTarget(obj3, objInvoke, config$xposed_globalRelease)) {
                if (!frameworkLocationDelivery.startupGate.shouldWait(obj, SystemClock.elapsedRealtimeNanos())) {
                    return frameworkLocationDelivery.copyResult(obj2, config$xposed_globalRelease);
                }
                se2Var.e = true;
                return null;
            }
        }
        frameworkLocationDelivery.startupGate.forget(obj);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$6(FrameworkLocationDelivery frameworkLocationDelivery, XposedInterface.Chain chain) throws IllegalAccessException, InvocationTargetException {
        chain.getClass();
        List args = chain.getArgs();
        args.getClass();
        Object[] array = args.toArray(new Object[0]);
        Object thisObject = chain.getThisObject();
        thisObject.getClass();
        JSONObject config$xposed_globalRelease = frameworkLocationDelivery.module.readConfig$xposed_globalRelease();
        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("force_location_enabled", false)) {
            Field field = frameworkLocationDelivery.ownerField;
            if (field == null) {
                o51.F("ownerField");
                throw null;
            }
            Object obj = field.get(thisObject);
            obj.getClass();
            Method method = frameworkLocationDelivery.getIdentity;
            if (method == null) {
                o51.F("getIdentity");
                throw null;
            }
            Object objInvoke = method.invoke(thisObject, null);
            objInvoke.getClass();
            if (frameworkLocationDelivery.isTarget(obj, objInvoke, config$xposed_globalRelease)) {
                array[2] = Boolean.TRUE;
            }
        }
        return chain.proceed(array);
    }

    private final boolean isTarget(Object obj, Object obj2, JSONObject jSONObject) {
        Boolean bool = (Boolean) guarded("caller identity", new q2(jSONObject, this, obj2, obj, 6));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isTarget$lambda$35(JSONObject jSONObject, FrameworkLocationDelivery frameworkLocationDelivery, Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        if (!jSONObject.optBoolean("active", false)) {
            return false;
        }
        Method method = frameworkLocationDelivery.getUid;
        if (method == null) {
            o51.F("getUid");
            throw null;
        }
        Object objInvoke = method.invoke(obj, null);
        objInvoke.getClass();
        Integer num = (Integer) objInvoke;
        Method method2 = frameworkLocationDelivery.getPackageName;
        if (method2 == null) {
            o51.F("getPackageName");
            throw null;
        }
        Object objInvoke2 = method2.invoke(obj, null);
        objInvoke2.getClass();
        if (!SystemHookUtils.INSTANCE.isTargetCaller(obj2, (String) objInvoke2, jSONObject, num)) {
            return false;
        }
        Field field = frameworkLocationDelivery.internalField;
        if (field == null) {
            o51.F("internalField");
            throw null;
        }
        Object obj3 = field.get(obj2);
        if (obj3 == null) {
            return false;
        }
        Method method3 = frameworkLocationDelivery.isProvider;
        if (method3 != null) {
            return !o51.f(method3.invoke(obj3, null, obj), Boolean.TRUE);
        }
        o51.F("isProvider");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Location makeLocation(Object obj) throws IllegalAccessException {
        SpoofedMotion currentSpoofedMotion;
        JSONObject config$xposed_globalRelease = this.module.readConfig$xposed_globalRelease();
        if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false) || (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(this.module, "WGS-84")) == null) {
            return null;
        }
        Field field = this.nameField;
        if (field == null) {
            o51.F("nameField");
            throw null;
        }
        Object obj2 = field.get(obj);
        obj2.getClass();
        Object objBuildFakeLocation = SystemHookUtils.INSTANCE.buildFakeLocation(this.loader, (String) obj2, currentSpoofedMotion, config$xposed_globalRelease.optDouble("altitude", 25.0d), CoordinateConverterKt.getJitteredAccuracy(this.module));
        Location location = objBuildFakeLocation instanceof Location ? (Location) objBuildFakeLocation : null;
        if (location == null) {
            return null;
        }
        applySatelliteExtras(location, config$xposed_globalRelease);
        return location;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tick() {
        List listJ0;
        JSONObject config$xposed_globalRelease = this.module.readConfig$xposed_globalRelease();
        Set<Object> set = this.managers;
        set.getClass();
        synchronized (set) {
            Set<Object> set2 = this.managers;
            set2.getClass();
            listJ0 = zy.J0(set2);
        }
        int i = 0;
        String strS0 = zy.s0(am1.G(config$xposed_globalRelease != null ? Boolean.valueOf(config$xposed_globalRelease.optBoolean("active")) : null, config$xposed_globalRelease != null ? Boolean.valueOf(config$xposed_globalRelease.optBoolean("force_location_enabled", false)) : null, config$xposed_globalRelease != null ? Boolean.valueOf(config$xposed_globalRelease.optBoolean("system_hook_global_mode")) : null, config$xposed_globalRelease != null ? config$xposed_globalRelease.optJSONArray("system_hook_packages") : null), "|", null, null, null, 62);
        if (!strS0.equals(this.policyKey)) {
            Iterator it = listJ0.iterator();
            while (it.hasNext()) {
                guarded("activation refresh", new et0(this, it.next(), 3));
            }
            this.policyKey = strS0;
        }
        if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) {
            this.startupGate.clear();
            return;
        }
        Iterator it2 = listJ0.iterator();
        while (it2.hasNext()) {
            guarded("provider heartbeat", new et0(this, it2.next(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object tick$lambda$30$lambda$29(FrameworkLocationDelivery frameworkLocationDelivery, Object obj) {
        Method method = frameworkLocationDelivery.updateRegistrations;
        if (method != null) {
            return method.invoke(obj, new nt0(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean tick$lambda$30$lambda$29$lambda$28(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 tick$lambda$31(FrameworkLocationDelivery frameworkLocationDelivery, Object obj) throws IllegalAccessException, InvocationTargetException {
        obj.getClass();
        deliver$default(frameworkLocationDelivery, obj, null, 2, null);
        return mf3.a;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        List listJ0;
        this.enabled = false;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        this.timer = null;
        this.startupGate.clear();
        List<XposedInterface.HookHandle> list = this.hooks;
        list.getClass();
        Iterator it = new eh2(list).iterator();
        while (true) {
            dh2 dh2Var = (dh2) it;
            if (!((ListIterator) dh2Var.f).hasPrevious()) {
                break;
            } else {
                ((XposedInterface.HookHandle) ((ListIterator) dh2Var.f).previous()).unhook();
            }
        }
        this.hooks.clear();
        Set<Object> set = this.managers;
        set.getClass();
        synchronized (set) {
            Set<Object> set2 = this.managers;
            set2.getClass();
            listJ0 = zy.J0(set2);
        }
        Iterator it2 = listJ0.iterator();
        while (it2.hasNext()) {
            guarded("restore activation", new et0(this, it2.next(), 1));
        }
        this.managers.clear();
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.delivery.SystemDeliveryAdapter
    public boolean install() {
        Class<?> cls = Void.TYPE;
        Class<?> cls2 = Boolean.TYPE;
        Class<?> cls3 = Integer.TYPE;
        try {
            Class<?> clsLocate$default = SystemClassLocator.locate$default(SystemClassLocator.INSTANCE, SystemComponent.LOCATION_PROVIDER_MANAGER, this.loader, null, null, null, false, null, null, 252, null);
            if (clsLocate$default == null) {
                throw new IllegalStateException("Location provider manager unavailable");
            }
            String name = clsLocate$default.getName();
            Class<?> cls4 = Class.forName(name.concat("$Registration"), false, this.loader);
            cls4.getClass();
            this.registrationClass = cls4;
            Class<?> cls5 = Class.forName(name.concat("$LocationRegistration"), false, this.loader);
            Class<?> cls6 = Class.forName(name.concat("$GetCurrentLocationListenerRegistration"), false, this.loader);
            Class<?> cls7 = Class.forName("android.location.util.identity.CallerIdentity", false, this.loader);
            Class<?> cls8 = Class.forName("android.location.LocationResult", false, this.loader);
            Class<?> cls9 = Class.forName("android.location.LastLocationRequest", false, this.loader);
            Class<?> cls10 = this.registrationClass;
            if (cls10 == null) {
                o51.F("registrationClass");
                throw null;
            }
            Method declaredMethod = cls10.getDeclaredMethod("getIdentity", null);
            declaredMethod.getClass();
            this.getIdentity = accessible(declaredMethod);
            Method method = cls7.getMethod("getUid", null);
            method.getClass();
            this.getUid = accessible(method);
            Method method2 = cls7.getMethod("getPackageName", null);
            method2.getClass();
            this.getPackageName = accessible(method2);
            Class<?> cls11 = this.registrationClass;
            if (cls11 == null) {
                o51.F("registrationClass");
                throw null;
            }
            Method declaredMethod2 = cls11.getDeclaredMethod("acceptLocationChange", cls8);
            declaredMethod2.getClass();
            this.acceptLocation = accessible(declaredMethod2);
            this.deliverToListeners = findMethod(clsLocate$default, "deliverToListeners", Function.class);
            this.updateRegistrations = findMethod(clsLocate$default, "updateRegistrations", Predicate.class);
            Method method3 = cls8.getMethod("wrap", Location[].class);
            method3.getClass();
            this.wrapResult = accessible(method3);
            Method method4 = cls8.getMethod("deepCopy", null);
            method4.getClass();
            this.deepCopyResult = accessible(method4);
            Method method5 = cls8.getMethod("asList", null);
            method5.getClass();
            this.resultAsList = accessible(method5);
            this.nameField = findField(clsLocate$default, "mName");
            this.internalField = findField(clsLocate$default, "mLocationManagerInternal");
            Class<?> cls12 = this.registrationClass;
            if (cls12 == null) {
                o51.F("registrationClass");
                throw null;
            }
            this.ownerField = findField(cls12, "this$0");
            Field field = this.internalField;
            if (field == null) {
                o51.F("internalField");
                throw null;
            }
            Method method6 = field.getType().getMethod("isProvider", String.class, cls7);
            method6.getClass();
            this.isProvider = accessible(method6);
            Class<?> cls13 = this.registrationClass;
            if (cls13 == null) {
                o51.F("registrationClass");
                throw null;
            }
            Method declaredMethod3 = clsLocate$default.getDeclaredMethod("onRegistrationAdded", Object.class, cls13);
            Class<?> cls14 = Class.forName("android.location.LocationRequest", false, this.loader);
            List<Method> listG = am1.G(clsLocate$default.getDeclaredMethod("registerLocationRequest", cls14, cls7, cls3, Class.forName("android.location.ILocationListener", false, this.loader)), clsLocate$default.getDeclaredMethod("registerLocationRequest", cls14, cls7, cls3, PendingIntent.class), clsLocate$default.getDeclaredMethod("getCurrentLocation", cls14, cls7, cls3, Class.forName("android.location.ILocationCallback", false, this.loader)));
            Method declaredMethod4 = clsLocate$default.getDeclaredMethod("onReportLocation", cls8);
            Method declaredMethod5 = clsLocate$default.getDeclaredMethod("getLastLocation", cls9, cls7, cls3);
            Method declaredMethod6 = clsLocate$default.getDeclaredMethod("getLastLocationUnsafe", cls3, cls3, cls2, Long.TYPE);
            List listG2 = am1.G(cls5, cls6);
            ArrayList arrayList = new ArrayList(az.Y(listG2, 10));
            for (Iterator it = listG2.iterator(); it.hasNext(); it = it) {
                arrayList.add(((Class) it.next()).getDeclaredMethod("acceptLocationChange", cls8));
            }
            Method declaredMethod7 = clsLocate$default.getDeclaredMethod("isActive", cls2, cls7);
            Class<?> cls15 = this.registrationClass;
            if (cls15 == null) {
                o51.F("registrationClass");
                throw null;
            }
            Method declaredMethod8 = clsLocate$default.getDeclaredMethod("isActive", cls15);
            Method declaredMethod9 = cls5.getDeclaredMethod("onProviderEnabledChanged", String.class, cls3, cls2);
            ArrayList arrayList2 = arrayList;
            Class<?> cls16 = Class.forName("com.android.internal.listeners.ListenerExecutor$ListenerOperation", false, this.loader);
            Method method7 = this.getIdentity;
            if (method7 == null) {
                o51.F("getIdentity");
                throw null;
            }
            expects(method7, cls7);
            Method method8 = this.getUid;
            if (method8 == null) {
                o51.F("getUid");
                throw null;
            }
            cls3.getClass();
            expects(method8, cls3);
            Method method9 = this.getPackageName;
            if (method9 == null) {
                o51.F("getPackageName");
                throw null;
            }
            expects(method9, String.class);
            Method method10 = this.acceptLocation;
            if (method10 == null) {
                o51.F("acceptLocation");
                throw null;
            }
            cls16.getClass();
            expects(method10, cls16);
            Method method11 = this.deliverToListeners;
            if (method11 == null) {
                o51.F("deliverToListeners");
                throw null;
            }
            cls.getClass();
            expects(method11, cls);
            Method method12 = this.updateRegistrations;
            if (method12 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            expects(method12, cls);
            Method method13 = this.wrapResult;
            if (method13 == null) {
                o51.F("wrapResult");
                throw null;
            }
            expects(method13, cls8);
            Method method14 = this.deepCopyResult;
            if (method14 == null) {
                o51.F("deepCopyResult");
                throw null;
            }
            expects(method14, cls8);
            Method method15 = this.resultAsList;
            if (method15 == null) {
                o51.F("resultAsList");
                throw null;
            }
            expects(method15, List.class);
            Method method16 = this.isProvider;
            if (method16 == null) {
                o51.F("isProvider");
                throw null;
            }
            cls2.getClass();
            expects(method16, cls2);
            declaredMethod3.getClass();
            expects(declaredMethod3, cls);
            declaredMethod4.getClass();
            expects(declaredMethod4, cls);
            declaredMethod5.getClass();
            expects(declaredMethod5, Location.class);
            declaredMethod6.getClass();
            expects(declaredMethod6, Location.class);
            declaredMethod7.getClass();
            expects(declaredMethod7, cls2);
            declaredMethod8.getClass();
            expects(declaredMethod8, cls2);
            declaredMethod9.getClass();
            expects(declaredMethod9, cls);
            for (Method method17 : zy.D0(listG, 2)) {
                method17.getClass();
                expects(method17, cls);
            }
            Object objT0 = zy.t0(listG);
            objT0.getClass();
            Class<?> cls17 = Class.forName("android.os.ICancellationSignal", false, this.loader);
            cls17.getClass();
            expects((Method) objT0, cls17);
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                ArrayList arrayList3 = arrayList2;
                Object obj = arrayList3.get(i);
                i++;
                Method method18 = (Method) obj;
                method18.getClass();
                expects(method18, cls16);
                arrayList2 = arrayList3;
            }
            ArrayList arrayList4 = arrayList2;
            Field field2 = this.nameField;
            if (field2 == null) {
                o51.F("nameField");
                throw null;
            }
            if (o51.f(field2.getType(), String.class)) {
                Field field3 = this.ownerField;
                if (field3 == null) {
                    o51.F("ownerField");
                    throw null;
                }
                if (o51.f(field3.getType(), clsLocate$default)) {
                    hook(declaredMethod9, new lu0() { // from class: gt0
                        @Override // defpackage.lu0
                        public final Object invoke(Object obj2) {
                            return FrameworkLocationDelivery.install$lambda$6(this.e, (XposedInterface.Chain) obj2);
                        }
                    });
                    if (!this.module.deoptimize(declaredMethod7)) {
                        throw new IllegalStateException("Unable to deoptimize provider activation");
                    }
                    if (!this.module.deoptimize(declaredMethod8)) {
                        throw new IllegalStateException("Unable to deoptimize registration activation");
                    }
                    hook(declaredMethod3, new lu0() { // from class: ht0
                        @Override // defpackage.lu0
                        public final Object invoke(Object obj2) {
                            return FrameworkLocationDelivery.install$lambda$12(this.e, (XposedInterface.Chain) obj2);
                        }
                    });
                    for (final Method method19 : listG) {
                        method19.getClass();
                        hook(method19, new lu0() { // from class: it0
                            @Override // defpackage.lu0
                            public final Object invoke(Object obj2) {
                                return FrameworkLocationDelivery.install$lambda$16(this.e, method19, (XposedInterface.Chain) obj2);
                            }
                        });
                    }
                    hook(declaredMethod4, new lu0() { // from class: jt0
                        @Override // defpackage.lu0
                        public final Object invoke(Object obj2) {
                            return FrameworkLocationDelivery.install$lambda$18(this.e, (XposedInterface.Chain) obj2);
                        }
                    });
                    hook(declaredMethod5, new lu0() { // from class: kt0
                        @Override // defpackage.lu0
                        public final Object invoke(Object obj2) {
                            return FrameworkLocationDelivery.install$lambda$20(this.e, (XposedInterface.Chain) obj2);
                        }
                    });
                    hook(declaredMethod6, new lu0() { // from class: lt0
                        @Override // defpackage.lu0
                        public final Object invoke(Object obj2) {
                            return FrameworkLocationDelivery.install$lambda$22(this.e, (XposedInterface.Chain) obj2);
                        }
                    });
                    int size2 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList4.get(i2);
                        i2++;
                        Method method20 = (Method) obj2;
                        method20.getClass();
                        hook(method20, new lu0() { // from class: mt0
                            @Override // defpackage.lu0
                            public final Object invoke(Object obj3) {
                                return FrameworkLocationDelivery.install$lambda$24(this.e, (XposedInterface.Chain) obj3);
                            }
                        });
                    }
                    if (!this.module.deoptimize(declaredMethod5)) {
                        throw new IllegalStateException("Unable to deoptimize getLastLocation");
                    }
                    this.enabled = true;
                    Timer timer = new Timer("LocationSpoofer-FrameworkDelivery", true);
                    timer.schedule(new FrameworkLocationDelivery$install$14$1(this), 1000L, 1000L);
                    this.timer = timer;
                    return true;
                }
            }
            throw new IllegalStateException("Incompatible provider fields");
        } catch (Throwable th) {
            HookStatus.INSTANCE.error("FrameworkDelivery location delivery", th);
            close();
            XposedBridge.INSTANCE.log("[FrameworkDelivery] Adapter disabled: incompatible framework or hook failure: " + th);
            return false;
        }
    }
}
