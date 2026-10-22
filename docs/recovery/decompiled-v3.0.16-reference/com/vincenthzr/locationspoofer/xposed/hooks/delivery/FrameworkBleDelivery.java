package com.vincenthzr.locationspoofer.xposed.hooks.delivery;

import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkBleDelivery;
import com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanRecordBuilderKt;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemClassLocator;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent;
import com.vincenthzr.locationspoofer.xposed.utils.CallScope;
import defpackage.am1;
import defpackage.au0;
import defpackage.az;
import defpackage.az2;
import defpackage.b81;
import defpackage.c5;
import defpackage.fo;
import defpackage.i52;
import defpackage.j41;
import defpackage.ji1;
import defpackage.jq1;
import defpackage.k41;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.mh0;
import defpackage.o51;
import defpackage.ob;
import defpackage.os0;
import defpackage.qs0;
import defpackage.t;
import defpackage.uj0;
import defpackage.we2;
import defpackage.wg2;
import defpackage.xg2;
import defpackage.xs2;
import defpackage.yo;
import defpackage.ys0;
import defpackage.zy;
import io.github.libxposed.api.XposedInterface;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FrameworkBleDelivery extends FrameworkHookSupport implements SystemDeliveryAdapter {
    private final Set<Class<?>> callbackClasses;
    private final Map<Object, Registration> callbacks;
    private Method dead;
    private final CallScope<Boolean> explicitFlush;
    private final Map<Object, Boolean> flushRequests;
    private Method matches;
    private final Map<Object, Owner> owners;
    private Method permission;
    private volatile boolean ready;
    private Class<?> scannerInterface;
    private Method sendBatch;
    private Method sendIntent;
    private final CallScope<Boolean> synthetic;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Owner {
        private final AtomicBoolean queued = new AtomicBoolean();
        private final WeakHashMap<Object, BleDeliveryState<ScanResult>> scans = new WeakHashMap<>();

        public final AtomicBoolean getQueued() {
            return this.queued;
        }

        public final WeakHashMap<Object, BleDeliveryState<ScanResult>> getScans() {
            return this.scans;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Registration {
        private final WeakReference<Object> app;
        private final WeakReference<Object> helper;
        private final FrameworkCaller who;

        public Registration(FrameworkCaller frameworkCaller, WeakReference<Object> weakReference, WeakReference<Object> weakReference2) {
            frameworkCaller.getClass();
            weakReference.getClass();
            weakReference2.getClass();
            this.who = frameworkCaller;
            this.helper = weakReference;
            this.app = weakReference2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Registration copy$default(Registration registration, FrameworkCaller frameworkCaller, WeakReference weakReference, WeakReference weakReference2, int i, Object obj) {
            if ((i & 1) != 0) {
                frameworkCaller = registration.who;
            }
            if ((i & 2) != 0) {
                weakReference = registration.helper;
            }
            if ((i & 4) != 0) {
                weakReference2 = registration.app;
            }
            return registration.copy(frameworkCaller, weakReference, weakReference2);
        }

        public final FrameworkCaller component1() {
            return this.who;
        }

        public final WeakReference<Object> component2() {
            return this.helper;
        }

        public final WeakReference<Object> component3() {
            return this.app;
        }

        public final Registration copy(FrameworkCaller frameworkCaller, WeakReference<Object> weakReference, WeakReference<Object> weakReference2) {
            frameworkCaller.getClass();
            weakReference.getClass();
            weakReference2.getClass();
            return new Registration(frameworkCaller, weakReference, weakReference2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Registration)) {
                return false;
            }
            Registration registration = (Registration) obj;
            return o51.f(this.who, registration.who) && o51.f(this.helper, registration.helper) && o51.f(this.app, registration.app);
        }

        public final WeakReference<Object> getApp() {
            return this.app;
        }

        public final WeakReference<Object> getHelper() {
            return this.helper;
        }

        public final FrameworkCaller getWho() {
            return this.who;
        }

        public int hashCode() {
            return this.app.hashCode() + ((this.helper.hashCode() + (this.who.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "Registration(who=" + this.who + ", helper=" + this.helper + ", app=" + this.app + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkBleDelivery(LocationHooker locationHooker, ClassLoader classLoader) {
        super(locationHooker, classLoader, "BLE");
        locationHooker.getClass();
        classLoader.getClass();
        this.callbacks = Collections.synchronizedMap(new WeakHashMap());
        this.callbackClasses = Collections.synchronizedSet(new LinkedHashSet());
        this.owners = Collections.synchronizedMap(new WeakHashMap());
        this.synthetic = new CallScope<>();
        this.explicitFlush = new CallScope<>();
        this.flushRequests = Collections.synchronizedMap(new WeakHashMap());
    }

    private final Object getOf(Object obj, String... strArr) {
        return FrameworkBleReflection.INSTANCE.getOf(obj, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    private final void hookCallback(Class<?> cls) {
        if (this.callbackClasses.add(cls)) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Method method : declaredMethods) {
                if (yo.H0(new String[]{"onScanResult", "onBatchScanResults", "onFoundOrLost"}).contains(method.getName())) {
                    arrayList.add(method);
                }
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Method method2 = (Method) obj;
                method2.getClass();
                hook(method2, new lu0() { // from class: ps0
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj2) {
                        return FrameworkBleDelivery.hookCallback$lambda$43$lambda$42(this.e, (XposedInterface.Chain) obj2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0047  */
    public static final Object hookCallback$lambda$43$lambda$42(FrameworkBleDelivery frameworkBleDelivery, XposedInterface.Chain chain) {
        boolean zF;
        chain.getClass();
        Registration registration = frameworkBleDelivery.callbacks.get(chain.getThisObject());
        JSONObject config$xposed_globalRelease = frameworkBleDelivery.getModule().readConfig$xposed_globalRelease();
        int i = 0;
        if (frameworkBleDelivery.ready) {
            Boolean current = frameworkBleDelivery.synthetic.getCurrent();
            Boolean bool = Boolean.TRUE;
            if (o51.f(current, bool) || registration == null || config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                zF = false;
            } else {
                zF = o51.f(frameworkBleDelivery.guard("filter", new c(registration, frameworkBleDelivery, config$xposed_globalRelease, i)), bool);
            }
        } else {
            zF = false;
        }
        if (zF) {
            return null;
        }
        List args = chain.getArgs();
        args.getClass();
        return chain.proceed(args.toArray(new Object[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hookCallback$lambda$43$lambda$42$lambda$41(Registration registration, FrameworkBleDelivery frameworkBleDelivery, JSONObject jSONObject) {
        Object obj;
        Object obj2;
        Object obj3 = registration.getHelper().get();
        if (obj3 == null || (obj = registration.getApp().get()) == null || (obj2 = frameworkBleDelivery.get(obj3, "mScannerMap")) == null) {
            return false;
        }
        Class<?> cls = obj2.getClass();
        Class cls2 = Integer.TYPE;
        cls2.getClass();
        return frameworkBleDelivery.method(cls, "getById", cls2).invoke(obj2, frameworkBleDelivery.get(obj, "id")) == obj && frameworkBleDelivery.target(registration.getWho(), jSONObject, obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 install$lambda$27(final FrameworkBleDelivery frameworkBleDelivery) {
        Method method;
        we2 we2Var = new we2();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<?> clsLocate$default = SystemClassLocator.locate$default(SystemClassLocator.INSTANCE, SystemComponent.BLUETOOTH_SCAN_SERVICE, frameworkBleDelivery.getLoader(), null, null, null, false, null, new ji1(frameworkBleDelivery, we2Var, linkedHashMap, 10), 124, null);
        if (clsLocate$default == null) {
            fo.o(linkedHashMap, "BLE delivery layout unavailable: ");
            return null;
        }
        Object obj = we2Var.e;
        if (obj == null) {
            fo.n("Required value was null.");
            return null;
        }
        FrameworkBleReflection.Layout layout = (FrameworkBleReflection.Layout) obj;
        Class<?> client = layout.getClient();
        frameworkBleDelivery.scannerInterface = frameworkBleDelivery.type("android.bluetooth.le.IScannerCallback");
        frameworkBleDelivery.permission = layout.getPermission();
        frameworkBleDelivery.matches = layout.getMatches();
        frameworkBleDelivery.sendBatch = layout.getSendBatch();
        frameworkBleDelivery.sendIntent = layout.getSendIntent();
        frameworkBleDelivery.dead = layout.getDead();
        Class<?> manager = layout.getManager();
        Method methodFlushMethod = FrameworkBleReflection.INSTANCE.flushMethod(clsLocate$default, xs2.S(yo.g0(new String[]{"com.android.bluetooth.le_scan.ScanBinder", clsLocate$default.getName().concat("$BluetoothScanBinder")}), new t(frameworkBleDelivery, 18)), ob.q());
        Class<?> type = frameworkBleDelivery.field(manager, "mHandler").getType();
        try {
            type.getClass();
            method = frameworkBleDelivery.method(type, "handleFlushBatchResults", client);
        } catch (NoSuchMethodException unused) {
            method = frameworkBleDelivery.method(frameworkBleDelivery.type(manager.getName().concat("$ClientHandler")), "handleFlushBatchResults", client);
        }
        frameworkBleDelivery.hook(layout.getAdd(), new lu0() { // from class: rs0
            @Override // defpackage.lu0
            public final Object invoke(Object obj2) {
                return FrameworkBleDelivery.install$lambda$27$lambda$7(this.e, (XposedInterface.Chain) obj2);
            }
        });
        Method[] declaredMethods = clsLocate$default.getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Method method2 : declaredMethods) {
            if (yo.H0(new String[]{"startScan", "registerPiAndStartScan", "continuePiStartScan"}).contains(method2.getName())) {
                arrayList.add(method2);
            }
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            Method method3 = (Method) obj2;
            method3.getClass();
            frameworkBleDelivery.hook(method3, new lu0() { // from class: ss0
                @Override // defpackage.lu0
                public final Object invoke(Object obj3) {
                    return FrameworkBleDelivery.install$lambda$27$lambda$11$lambda$10(this.e, (XposedInterface.Chain) obj3);
                }
            });
        }
        Method method4 = frameworkBleDelivery.sendIntent;
        if (method4 == null) {
            o51.F("sendIntent");
            throw null;
        }
        frameworkBleDelivery.hook(method4, new lu0() { // from class: ts0
            @Override // defpackage.lu0
            public final Object invoke(Object obj3) {
                return FrameworkBleDelivery.install$lambda$27$lambda$12(this.e, (XposedInterface.Chain) obj3);
            }
        });
        frameworkBleDelivery.hook(methodFlushMethod, new lu0() { // from class: us0
            @Override // defpackage.lu0
            public final Object invoke(Object obj3) {
                return FrameworkBleDelivery.install$lambda$27$lambda$14(this.e, (XposedInterface.Chain) obj3);
            }
        });
        frameworkBleDelivery.hook(frameworkBleDelivery.method(manager, "flushBatchScanResults", client), new lu0() { // from class: vs0
            @Override // defpackage.lu0
            public final Object invoke(Object obj3) {
                return FrameworkBleDelivery.install$lambda$27$lambda$15(this.e, (XposedInterface.Chain) obj3);
            }
        });
        frameworkBleDelivery.hook(method, new lu0() { // from class: ws0
            @Override // defpackage.lu0
            public final Object invoke(Object obj3) {
                return FrameworkBleDelivery.install$lambda$27$lambda$17(this.e, (XposedInterface.Chain) obj3);
            }
        });
        Method[] declaredMethods2 = clsLocate$default.getDeclaredMethods();
        declaredMethods2.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Method method5 : declaredMethods2) {
            if (yo.H0(new String[]{"registerScanner", "registerAndStartScan", "flushPendingBatchResults", "onScanResultInternal", "onBatchScanReportsInternal", "sendBatchScanResults", "sendResultByPendingIntent", "onTrackAdvFoundLost"}).contains(method5.getName())) {
                arrayList2.add(method5);
            }
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj3 = arrayList2.get(i);
            i++;
            Method method6 = (Method) obj3;
            if (!frameworkBleDelivery.getModule().deoptimize(method6)) {
                b81.g(az2.j("Cannot deoptimize BLE delivery ", method6.getName()));
                return null;
            }
        }
        frameworkBleDelivery.every(1000L, new qs0(frameworkBleDelivery, 1));
        frameworkBleDelivery.ready = true;
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$27$lambda$11$lambda$10(FrameworkBleDelivery frameworkBleDelivery, XposedInterface.Chain chain) {
        chain.getClass();
        List args = chain.getArgs();
        args.getClass();
        Object objProceed = chain.proceed(args.toArray(new Object[0]));
        Object thisObject = chain.getThisObject();
        if (thisObject != null) {
            frameworkBleDelivery.owner(thisObject);
        }
        return objProceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$27$lambda$12(FrameworkBleDelivery frameworkBleDelivery, XposedInterface.Chain chain) {
        chain.getClass();
        Object obj = chain.getArgs().get(0);
        obj.getClass();
        Object obj2 = frameworkBleDelivery.get(obj, "callingUid");
        obj2.getClass();
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = frameworkBleDelivery.get(obj, "callingPackage");
        FrameworkCaller frameworkCaller = new FrameworkCaller(iIntValue, obj3 instanceof String ? (String) obj3 : null);
        JSONObject config$xposed_globalRelease = frameworkBleDelivery.getModule().readConfig$xposed_globalRelease();
        if (frameworkBleDelivery.ready && !o51.f(frameworkBleDelivery.synthetic.getCurrent(), Boolean.TRUE) && config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("mock_bluetooth", true) && frameworkBleDelivery.target(frameworkCaller, config$xposed_globalRelease, chain.getThisObject())) {
            return null;
        }
        List args = chain.getArgs();
        args.getClass();
        return chain.proceed(args.toArray(new Object[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$27$lambda$14(FrameworkBleDelivery frameworkBleDelivery, XposedInterface.Chain chain) {
        chain.getClass();
        Object obj = chain.getArgs().get(1);
        obj.getClass();
        AttributionSource attributionSourceE = ob.e(obj);
        return frameworkBleDelivery.explicitFlush.withValue(Boolean.valueOf(attributionSourceE.getUid() >= 10000 && attributionSourceE.getUid() == Binder.getCallingUid()), new ys0(chain, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$27$lambda$14$lambda$13(XposedInterface.Chain chain) {
        List args = chain.getArgs();
        args.getClass();
        return chain.proceed(args.toArray(new Object[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$27$lambda$15(FrameworkBleDelivery frameworkBleDelivery, XposedInterface.Chain chain) {
        chain.getClass();
        Boolean current = frameworkBleDelivery.explicitFlush.getCurrent();
        Boolean bool = Boolean.TRUE;
        if (o51.f(current, bool)) {
            Map<Object, Boolean> map = frameworkBleDelivery.flushRequests;
            map.getClass();
            Object obj = chain.getArgs().get(0);
            obj.getClass();
            map.put(obj, bool);
        }
        List args = chain.getArgs();
        args.getClass();
        return chain.proceed(args.toArray(new Object[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$27$lambda$17(FrameworkBleDelivery frameworkBleDelivery, XposedInterface.Chain chain) {
        chain.getClass();
        boolean zF = o51.f(frameworkBleDelivery.flushRequests.remove(chain.getArgs().get(0)), Boolean.TRUE);
        List args = chain.getArgs();
        args.getClass();
        Object objProceed = chain.proceed(args.toArray(new Object[0]));
        frameworkBleDelivery.guard("flush", new c5(frameworkBleDelivery, chain, zF));
        return objProceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 install$lambda$27$lambda$17$lambda$16(FrameworkBleDelivery frameworkBleDelivery, XposedInterface.Chain chain, boolean z) {
        Object thisObject = chain.getThisObject();
        thisObject.getClass();
        Object obj = frameworkBleDelivery.get(thisObject, "this$0");
        obj.getClass();
        Object of = frameworkBleDelivery.getOf(obj, "mScanHelper", "mScanController");
        of.getClass();
        Owner owner = frameworkBleDelivery.owner(of);
        Object obj2 = chain.getArgs().get(0);
        obj2.getClass();
        Object obj3 = frameworkBleDelivery.get(obj2, "scannerId");
        obj3.getClass();
        frameworkBleDelivery.tick(of, owner, (Integer) obj3, z);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 install$lambda$27$lambda$26(FrameworkBleDelivery frameworkBleDelivery) {
        ArrayList arrayList;
        Map<Object, Owner> map = frameworkBleDelivery.owners;
        map.getClass();
        synchronized (map) {
            Set<Map.Entry<Object, Owner>> setEntrySet = frameworkBleDelivery.owners.entrySet();
            arrayList = new ArrayList(az.Y(setEntrySet, 10));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new i52(entry.getKey(), entry.getValue()));
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i52 i52Var = (i52) obj;
            frameworkBleDelivery.guard("schedule", new a(frameworkBleDelivery, i52Var.e, (Owner) i52Var.f, 1));
        }
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 install$lambda$27$lambda$26$lambda$25(final FrameworkBleDelivery frameworkBleDelivery, final Object obj, final Owner owner) {
        obj.getClass();
        Object obj2 = frameworkBleDelivery.get(obj, "mScanManager");
        mf3 mf3Var = mf3.a;
        if (obj2 != null) {
            Object obj3 = frameworkBleDelivery.get(obj2, "mHandler");
            Handler handler = obj3 instanceof Handler ? (Handler) obj3 : null;
            if (handler != null && owner.getQueued().compareAndSet(false, true) && !handler.post(new Runnable() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.delivery.d
                @Override // java.lang.Runnable
                public final void run() {
                    FrameworkBleDelivery.install$lambda$27$lambda$26$lambda$25$lambda$24(this.e, owner, obj);
                }
            })) {
                owner.getQueued().set(false);
            }
        }
        return mf3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void install$lambda$27$lambda$26$lambda$25$lambda$24(FrameworkBleDelivery frameworkBleDelivery, Owner owner, Object obj) {
        boolean z = false;
        Object[] objArr = 0;
        try {
            if (frameworkBleDelivery.getLive() && frameworkBleDelivery.ready) {
                frameworkBleDelivery.guard("delivery", new a(frameworkBleDelivery, obj, owner, objArr == true ? 1 : 0));
            }
        } finally {
            owner.getQueued().set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 install$lambda$27$lambda$26$lambda$25$lambda$24$lambda$23(FrameworkBleDelivery frameworkBleDelivery, Object obj, Owner owner) {
        obj.getClass();
        owner.getClass();
        tick$default(frameworkBleDelivery, obj, owner, null, false, 12, null);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean install$lambda$27$lambda$3(FrameworkBleDelivery frameworkBleDelivery, we2 we2Var, LinkedHashMap linkedHashMap, Class cls) {
        Object wg2Var;
        cls.getClass();
        try {
            wg2Var = FrameworkBleReflection.INSTANCE.resolve(cls, ScanResult.class);
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        boolean z = wg2Var instanceof wg2;
        boolean z2 = !z;
        if (!z) {
            we2Var.e = (FrameworkBleReflection.Layout) wg2Var;
        }
        Throwable thA = xg2.a(wg2Var);
        if (thA != null) {
            linkedHashMap.put(cls.getName(), thA.getClass().getSimpleName() + ": " + thA.getMessage());
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class install$lambda$27$lambda$5(FrameworkBleDelivery frameworkBleDelivery, String str) {
        Object wg2Var;
        str.getClass();
        try {
            wg2Var = frameworkBleDelivery.type(str);
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            wg2Var = null;
        }
        return (Class) wg2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object install$lambda$27$lambda$7(FrameworkBleDelivery frameworkBleDelivery, XposedInterface.Chain chain) {
        chain.getClass();
        int callingUid = Binder.getCallingUid();
        List args = chain.getArgs();
        args.getClass();
        Object objProceed = chain.proceed(args.toArray(new Object[0]));
        if (objProceed != null) {
            frameworkBleDelivery.guard("register", new os0(chain, frameworkBleDelivery, objProceed, callingUid));
        }
        return objProceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 install$lambda$27$lambda$7$lambda$6(XposedInterface.Chain chain, FrameworkBleDelivery frameworkBleDelivery, Object obj, int i) {
        List args = chain.getArgs();
        args.getClass();
        Object objT0 = zy.t0(args);
        objT0.getClass();
        frameworkBleDelivery.owner(objT0);
        Object obj2 = frameworkBleDelivery.get(obj, "callback");
        if (obj2 != null) {
            Map<Object, Registration> map = frameworkBleDelivery.callbacks;
            map.getClass();
            Object obj3 = frameworkBleDelivery.get(obj, "name");
            map.put(obj2, new Registration(new FrameworkCaller(i, obj3 instanceof String ? (String) obj3 : null), new WeakReference(objT0), new WeakReference(obj)));
            frameworkBleDelivery.hookCallback(obj2.getClass());
        }
        return mf3.a;
    }

    private final Owner owner(Object obj) {
        Owner owner;
        Map<Object, Owner> map = this.owners;
        map.getClass();
        synchronized (map) {
            try {
                Map<Object, Owner> map2 = this.owners;
                map2.getClass();
                Owner owner2 = map2.get(obj);
                if (owner2 == null) {
                    owner2 = new Owner();
                    map2.put(obj, owner2);
                }
                owner = owner2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return owner;
    }

    private final boolean permitted(Object obj, Object obj2, FrameworkCaller frameworkCaller) throws IllegalAccessException, InvocationTargetException {
        String strPermissionToOp;
        Method method = this.permission;
        if (method == null) {
            o51.F("permission");
            throw null;
        }
        Object objInvoke = method.invoke(obj, obj2);
        Boolean bool = Boolean.TRUE;
        if (!o51.f(objInvoke, bool)) {
            return false;
        }
        Object of = getOf(obj, "mContext", "mAdapterService");
        of.getClass();
        Context context = (Context) of;
        String pkg = frameworkCaller.getPkg();
        if (pkg == null) {
            return false;
        }
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
        if (context.checkPermission("android.permission.BLUETOOTH_SCAN", -1, frameworkCaller.getUid()) != 0 || (strPermissionToOp = AppOpsManager.permissionToOp("android.permission.BLUETOOTH_SCAN")) == null || appOpsManager.noteOpNoThrow(strPermissionToOp, frameworkCaller.getUid(), pkg) != 0) {
            return false;
        }
        if (o51.f(get(obj2, "hasDisavowedLocation"), bool) || o51.f(get(obj2, "hasScanWithoutLocationPermission"), bool) || o51.f(get(obj2, "hasNetworkSettingsPermission"), bool) || o51.f(get(obj2, "hasNetworkSetupWizardPermission"), bool)) {
            return true;
        }
        boolean zF = o51.f(get(obj2, "isQApp"), bool);
        return context.checkPermission(zF ? "android.permission.ACCESS_FINE_LOCATION" : "android.permission.ACCESS_COARSE_LOCATION", -1, frameworkCaller.getUid()) == 0 && appOpsManager.noteOpNoThrow(zF ? "android:fine_location" : "android:coarse_location", frameworkCaller.getUid(), pkg) == 0;
    }

    private final List<ScanResult> results(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (!jSONObject.optBoolean("mock_bluetooth", true) || (jSONArrayOptJSONArray = jSONObject.optJSONArray("bluetooth_json")) == null) {
            return uj0.e;
        }
        Method method = method(type("android.bluetooth.le.ScanRecord"), "parseFromBytes", byte[].class);
        int length = jSONArrayOptJSONArray.length();
        if (length > 200) {
            length = 200;
        }
        int i = 0;
        k41 k41VarF0 = mh0.f0(0, length);
        ArrayList arrayList = new ArrayList();
        Iterator it = k41VarF0.iterator();
        while (true) {
            j41 j41Var = (j41) it;
            if (!j41Var.g) {
                break;
            }
            ScanResult scanResult = (ScanResult) guard("fixture", new os0(jSONArrayOptJSONArray, j41Var.nextInt(), this, method));
            if (scanResult != null) {
                arrayList.add(scanResult);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (hashSet.add(((ScanResult) obj).getDevice().getAddress())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanResult results$lambda$45$lambda$44(JSONArray jSONArray, int i, FrameworkBleDelivery frameworkBleDelivery, Method method) {
        Object objCreateBluetoothDevice;
        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        String strOptString = jSONObjectOptJSONObject.optString("address");
        strOptString.getClass();
        String strNormalizeMacAddress = BluetoothScanRecordBuilderKt.normalizeMacAddress(strOptString);
        if (!BluetoothAdapter.checkBluetoothAddress(strNormalizeMacAddress) || (objCreateBluetoothDevice = BluetoothScanRecordBuilderKt.createBluetoothDevice(frameworkBleDelivery.getLoader(), strNormalizeMacAddress)) == null) {
            return null;
        }
        String strOptString2 = jSONObjectOptJSONObject.optString("name");
        strOptString2.getClass();
        String strOptString3 = jSONObjectOptJSONObject.optString("scanRecordHex", jSONObjectOptJSONObject.optString("rawBytes"));
        strOptString3.getClass();
        Object objCreateScanResult = BluetoothScanRecordBuilderKt.createScanResult(frameworkBleDelivery.getLoader(), objCreateBluetoothDevice, method.invoke(null, BluetoothScanRecordBuilderKt.buildScanRecordBytes(strOptString2, strOptString3, strNormalizeMacAddress)), mh0.v(jSONObjectOptJSONObject.optInt("rssi", -65), -127, 20), SystemClock.elapsedRealtimeNanos());
        if (objCreateScanResult instanceof ScanResult) {
            return (ScanResult) objCreateScanResult;
        }
        return null;
    }

    private final void tick(final Object obj, final Owner owner, final Integer num, final boolean z) {
        final Object obj2;
        if (this.ready && getLive()) {
            final JSONObject config$xposed_globalRelease = getModule().readConfig$xposed_globalRelease();
            if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active") || !config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                owner.getScans().clear();
                return;
            }
            Object obj3 = get(obj, "mScanManager");
            if (obj3 == null || (obj2 = get(obj, "mScannerMap")) == null) {
                return;
            }
            Object objCall = call(obj3, "getRegularScanQueue");
            objCall.getClass();
            ArrayList arrayListL0 = zy.l0((Collection) objCall);
            Object objCall2 = call(obj3, "getBatchScanQueue");
            objCall2.getClass();
            final ArrayList arrayListL1 = zy.l0((Collection) objCall2);
            final ArrayList arrayListX0 = zy.x0(arrayListL0, arrayListL1);
            owner.getScans().keySet().retainAll(zy.N0(arrayListX0));
            final List<ScanResult> listResults = results(config$xposed_globalRelease);
            int size = arrayListX0.size();
            for (int i = 0; i < size; i++) {
                final Object obj4 = arrayListX0.get(i);
                guard("scan", new au0() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.delivery.b
                    @Override // defpackage.au0
                    public final Object invoke() {
                        return FrameworkBleDelivery.tick$lambda$39(this.e, obj4, num, arrayListL1, owner, obj2, config$xposed_globalRelease, obj, arrayListX0, listResults, z);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void tick$default(FrameworkBleDelivery frameworkBleDelivery, Object obj, Owner owner, Integer num, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        frameworkBleDelivery.tick(obj, owner, num, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    public static final mf3 tick$lambda$39(final FrameworkBleDelivery frameworkBleDelivery, final Object obj, Integer num, List list, Owner owner, Object obj2, JSONObject jSONObject, final Object obj3, List list2, List list3, final boolean z) throws Throwable {
        final List list4;
        FrameworkCaller frameworkCaller;
        mf3 mf3Var;
        FrameworkCaller who;
        Object obj4 = frameworkBleDelivery.get(obj, "scannerId");
        obj4.getClass();
        Integer num2 = (Integer) obj4;
        int iIntValue = num2.intValue();
        mf3 mf3Var2 = mf3.a;
        if (num != null) {
            if (iIntValue == num.intValue()) {
                list4 = list;
                if (list4.contains(obj)) {
                }
            }
            return mf3Var2;
        }
        list4 = list;
        if (o51.f(frameworkBleDelivery.get(obj, "appDied"), Boolean.TRUE)) {
            owner.getScans().remove(obj);
            return mf3Var2;
        }
        Class<?> cls = obj2.getClass();
        Class cls2 = Integer.TYPE;
        cls2.getClass();
        final Object objInvoke = frameworkBleDelivery.method(cls, "getById", cls2).invoke(obj2, num2);
        if (objInvoke != null) {
            final Object obj5 = frameworkBleDelivery.get(objInvoke, "callback");
            final Object obj6 = frameworkBleDelivery.get(objInvoke, "info");
            Throwable th = null;
            if (obj5 != null) {
                Registration registration = frameworkBleDelivery.callbacks.get(obj5);
                if (registration == null || (who = registration.getWho()) == null) {
                    frameworkCaller = null;
                } else {
                    Object obj7 = frameworkBleDelivery.get(obj, "callingPackage");
                    String pkg = obj7 instanceof String ? (String) obj7 : null;
                    if (pkg == null) {
                        pkg = who.getPkg();
                    }
                    frameworkCaller = FrameworkCaller.copy$default(who, 0, pkg, 1, null);
                }
            } else if (obj6 != null) {
                Object obj8 = frameworkBleDelivery.get(obj6, "callingUid");
                obj8.getClass();
                int iIntValue2 = ((Integer) obj8).intValue();
                Object obj9 = frameworkBleDelivery.get(obj6, "callingPackage");
                frameworkCaller = new FrameworkCaller(iIntValue2, obj9 instanceof String ? (String) obj9 : null);
            } else {
                frameworkCaller = null;
            }
            if (frameworkCaller == null || !frameworkBleDelivery.target(frameworkCaller, jSONObject, obj3) || !frameworkBleDelivery.permitted(obj3, obj, frameworkCaller)) {
                owner.getScans().remove(obj);
                return mf3Var2;
            }
            Object obj10 = frameworkBleDelivery.get(obj, "settings");
            obj10.getClass();
            final ScanSettings scanSettings = (ScanSettings) obj10;
            if (scanSettings.getScanMode() == -1) {
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        Object obj11 = frameworkBleDelivery.get(it.next(), "settings");
                        obj11.getClass();
                        if (((ScanSettings) obj11).getScanMode() != -1) {
                        }
                    }
                }
            }
            Object obj12 = frameworkBleDelivery.get(obj3, "mLocationDenylistPredicate");
            obj12.getClass();
            Predicate predicate = (Predicate) obj12;
            final ArrayList arrayList = new ArrayList();
            for (Object obj13 : list3) {
                ScanResult scanResult = (ScanResult) obj13;
                Method method = frameworkBleDelivery.matches;
                Throwable th2 = th;
                if (method == null) {
                    o51.F("matches");
                    throw th2;
                }
                Object objInvoke2 = method.invoke(obj3, obj, scanResult);
                Boolean bool = Boolean.TRUE;
                if (o51.f(objInvoke2, bool) && (!o51.f(frameworkBleDelivery.get(obj, "hasDisavowedLocation"), bool) || !predicate.test(scanResult))) {
                    arrayList.add(obj13);
                }
                th = th2;
            }
            Throwable th3 = th;
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            WeakHashMap<Object, BleDeliveryState<ScanResult>> scans = owner.getScans();
            BleDeliveryState<ScanResult> bleDeliveryState = scans.get(obj);
            if (bleDeliveryState == null) {
                bleDeliveryState = new BleDeliveryState<>(jElapsedRealtime);
                scans.put(obj, bleDeliveryState);
            }
            final BleDeliveryState<ScanResult> bleDeliveryState2 = bleDeliveryState;
            try {
                mf3Var = mf3Var2;
                try {
                    frameworkBleDelivery.synthetic.withValue(Boolean.TRUE, new au0() { // from class: xs0
                        @Override // defpackage.au0
                        public final Object invoke() {
                            return FrameworkBleDelivery.tick$lambda$39$lambda$38(list4, obj, bleDeliveryState2, jElapsedRealtime, scanSettings, z, arrayList, frameworkBleDelivery, obj3, objInvoke, obj5, obj6);
                        }
                    });
                    return mf3Var;
                } catch (InvocationTargetException e) {
                    e = e;
                    Throwable targetException = e.getTargetException();
                    if (!(targetException instanceof RemoteException) && !(targetException instanceof PendingIntent.CanceledException)) {
                        throw targetException;
                    }
                    Method method2 = frameworkBleDelivery.dead;
                    if (method2 == null) {
                        o51.F("dead");
                        throw th3;
                    }
                    method2.invoke(obj3, obj);
                    owner.getScans().remove(obj);
                    return mf3Var;
                }
            } catch (InvocationTargetException e2) {
                e = e2;
                mf3Var = mf3Var2;
            }
        }
        return mf3Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 tick$lambda$39$lambda$38(List list, Object obj, BleDeliveryState bleDeliveryState, long j, ScanSettings scanSettings, boolean z, List list2, FrameworkBleDelivery frameworkBleDelivery, Object obj2, Object obj3, Object obj4, Object obj5) throws IllegalAccessException, InvocationTargetException {
        if (list.contains(obj)) {
            if (bleDeliveryState.batchDue(j, scanSettings.getReportDelayMillis(), z) && !list2.isEmpty()) {
                Method method = frameworkBleDelivery.sendBatch;
                if (method == null) {
                    o51.F("sendBatch");
                    throw null;
                }
                method.invoke(obj2, obj3, obj, new ArrayList(list2));
            }
        } else if (scanSettings.getCallbackType() != 1 && scanSettings.getCallbackType() != 8) {
            int iM = jq1.M(az.Y(list2, 10));
            if (iM < 16) {
                iM = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM);
            for (Object obj6 : list2) {
                String address = ((ScanResult) obj6).getDevice().getAddress();
                address.getClass();
                linkedHashMap.put(address, obj6);
            }
            BleDeliveryState.Changes changesTrack$default = BleDeliveryState.track$default(bleDeliveryState, linkedHashMap, j, 0L, 4, null);
            for (i52 i52Var : am1.G(new i52(Boolean.TRUE, changesTrack$default.getFound()), new i52(Boolean.FALSE, changesTrack$default.getLost()))) {
                Boolean bool = (Boolean) i52Var.e;
                boolean zBooleanValue = bool.booleanValue();
                List<ScanResult> list3 = (List) i52Var.f;
                int i = zBooleanValue ? 2 : 4;
                if ((scanSettings.getCallbackType() & i) != 0) {
                    if (obj4 != null) {
                        for (ScanResult scanResult : list3) {
                            Class<?> cls = frameworkBleDelivery.scannerInterface;
                            if (cls == null) {
                                o51.F("scannerInterface");
                                throw null;
                            }
                            cls.getMethod("onFoundOrLost", Boolean.TYPE, ScanResult.class).invoke(obj4, bool, scanResult);
                        }
                    } else if (obj5 != null && !list3.isEmpty()) {
                        Method method2 = frameworkBleDelivery.sendIntent;
                        if (method2 == null) {
                            o51.F("sendIntent");
                            throw null;
                        }
                        method2.invoke(obj2, obj5, new ArrayList(list3), Integer.valueOf(i));
                    }
                }
            }
        } else if (obj4 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ScanResult scanResult2 = (ScanResult) it.next();
                Class<?> cls2 = frameworkBleDelivery.scannerInterface;
                if (cls2 == null) {
                    o51.F("scannerInterface");
                    throw null;
                }
                cls2.getMethod("onScanResult", ScanResult.class).invoke(obj4, scanResult2);
            }
        } else if (obj5 != null && !list2.isEmpty()) {
            Method method3 = frameworkBleDelivery.sendIntent;
            if (method3 == null) {
                o51.F("sendIntent");
                throw null;
            }
            method3.invoke(obj2, obj5, new ArrayList(list2), 1);
        }
        return mf3.a;
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkHookSupport, java.lang.AutoCloseable
    public void close() {
        this.ready = false;
        super.close();
        this.owners.clear();
        this.callbacks.clear();
        this.callbackClasses.clear();
        this.flushRequests.clear();
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkHookSupport
    public Field field(Class<?> cls, String str) {
        cls.getClass();
        str.getClass();
        return FrameworkBleReflection.INSTANCE.field(cls, str, new String[0]);
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.delivery.SystemDeliveryAdapter
    public boolean install() {
        return section("BleDelivery", new qs0(this, 0));
    }
}
