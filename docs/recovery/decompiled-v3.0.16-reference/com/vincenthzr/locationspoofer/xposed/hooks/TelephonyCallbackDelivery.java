package com.vincenthzr.locationspoofer.xposed.hooks;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.hooks.network.CellInfoListBuilderKt;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.az;
import defpackage.az2;
import defpackage.d0;
import defpackage.dh2;
import defpackage.eh2;
import defpackage.fz;
import defpackage.mf3;
import defpackage.o51;
import defpackage.p91;
import defpackage.s13;
import defpackage.wg2;
import defpackage.xg2;
import defpackage.zm3;
import defpackage.zy;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class TelephonyCallbackDelivery implements AutoCloseable {
    private final Set<Class<?>> callbackClasses;
    private final List<XposedInterface.HookHandle> handles;
    private volatile boolean live;
    private final ClassLoader loader;
    private final LocationHooker module;
    private final Map<Object, Boolean> registries;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Recipient {
        private final String pkg;
        private final Object registry;
        private final int uid;

        public Recipient(Object obj, int i, String str) {
            obj.getClass();
            this.registry = obj;
            this.uid = i;
            this.pkg = str;
        }

        public static /* synthetic */ Recipient copy$default(Recipient recipient, Object obj, int i, String str, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = recipient.registry;
            }
            if ((i2 & 2) != 0) {
                i = recipient.uid;
            }
            if ((i2 & 4) != 0) {
                str = recipient.pkg;
            }
            return recipient.copy(obj, i, str);
        }

        public final Object component1() {
            return this.registry;
        }

        public final int component2() {
            return this.uid;
        }

        public final String component3() {
            return this.pkg;
        }

        public final Recipient copy(Object obj, int i, String str) {
            obj.getClass();
            return new Recipient(obj, i, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Recipient)) {
                return false;
            }
            Recipient recipient = (Recipient) obj;
            return o51.f(this.registry, recipient.registry) && this.uid == recipient.uid && o51.f(this.pkg, recipient.pkg);
        }

        public final String getPkg() {
            return this.pkg;
        }

        public final Object getRegistry() {
            return this.registry;
        }

        public final int getUid() {
            return this.uid;
        }

        public int hashCode() {
            int iB = p91.b(this.uid, this.registry.hashCode() * 31, 31);
            String str = this.pkg;
            return iB + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            Object obj = this.registry;
            int i = this.uid;
            String str = this.pkg;
            StringBuilder sb = new StringBuilder("Recipient(registry=");
            sb.append(obj);
            sb.append(", uid=");
            sb.append(i);
            sb.append(", pkg=");
            return az2.p(sb, str, ")");
        }
    }

    public TelephonyCallbackDelivery(LocationHooker locationHooker, ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        this.module = locationHooker;
        this.loader = classLoader;
        this.registries = Collections.synchronizedMap(new WeakHashMap());
        this.callbackClasses = new LinkedHashSet();
        this.handles = new ArrayList();
        this.live = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void hookCallback(Class<?> cls) {
        try {
            if (this.live && this.callbackClasses.add(cls)) {
                for (final String str : am1.G("onCellInfoChanged", "onCellLocationChanged")) {
                    List<XposedInterface.HookHandle> list = this.handles;
                    XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    d0 d0VarY = zm3.y(cls.getDeclaredMethods());
                    int i = 0;
                    while (d0VarY.hasNext()) {
                        final Method method = (Method) d0VarY.next();
                        if (o51.f(method.getName(), str) && !Modifier.isAbstract(method.getModifiers())) {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.TelephonyCallbackDelivery$hookCallback$$inlined$hookAllMethods$1
                                    public Object intercept(XposedInterface.Chain chain) {
                                        XposedHelpers xposedHelpers2;
                                        Object objCallMethod;
                                        chain.getClass();
                                        Method method2 = method;
                                        method2.getClass();
                                        List args = chain.getArgs();
                                        args.getClass();
                                        Object[] array = args.toArray(new Object[0]);
                                        if (this.live) {
                                            try {
                                                TelephonyCallbackDelivery.Recipient recipient = this.recipient(chain.getThisObject());
                                                JSONObject config$xposed_globalRelease = this.module.readConfig$xposed_globalRelease();
                                                if (recipient != null && config$xposed_globalRelease != null && SystemHookUtils.INSTANCE.isTargetCaller(recipient.getRegistry(), recipient.getPkg(), config$xposed_globalRelease, Integer.valueOf(recipient.getUid()))) {
                                                    ArrayList<Object> arrayListBuildFakeCellInfoList = config$xposed_globalRelease.optBoolean("mock_cell", true) ? CellInfoListBuilderKt.buildFakeCellInfoList(this.module, this.loader, config$xposed_globalRelease.optDouble("lat"), config$xposed_globalRelease.optDouble("lng"), config$xposed_globalRelease) : new ArrayList<>();
                                                    if (o51.f(str, "onCellInfoChanged")) {
                                                        array[0] = arrayListBuildFakeCellInfoList;
                                                    } else {
                                                        Object objO0 = zy.o0(arrayListBuildFakeCellInfoList);
                                                        Object objCallMethod2 = null;
                                                        Object objCallMethod3 = objO0 != null ? XposedHelpers.INSTANCE.callMethod(objO0, "getCellIdentity", new Object[0]) : null;
                                                        Class<?> cls2 = method2.getParameterTypes()[0];
                                                        if (o51.f(cls2, Bundle.class)) {
                                                            objCallMethod2 = new Bundle();
                                                            if (objCallMethod3 != null && (objCallMethod = (xposedHelpers2 = XposedHelpers.INSTANCE).callMethod(objCallMethod3, "asCellLocation", new Object[0])) != null) {
                                                                xposedHelpers2.callMethod(objCallMethod, "fillInNotifierBundle", objCallMethod2);
                                                            }
                                                        } else if (!cls2.getName().equals("android.telephony.CellLocation")) {
                                                            objCallMethod2 = objCallMethod3;
                                                        } else if (objCallMethod3 != null) {
                                                            objCallMethod2 = XposedHelpers.INSTANCE.callMethod(objCallMethod3, "asCellLocation", new Object[0]);
                                                        }
                                                        array[0] = objCallMethod2;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                XposedBridge.INSTANCE.logOpenCellIdEvery("cell-recipient", "Cell callback transform failed: " + th, 10000L);
                                            }
                                        }
                                        return chain.proceed(array);
                                    }
                                });
                                hookHandleIntercept.getClass();
                                arrayList.add(hookHandleIntercept);
                                i++;
                            } catch (Throwable th) {
                                HookStatus.INSTANCE.error(cls.getName() + "#" + str, th);
                            }
                        }
                    }
                    HookStatus.INSTANCE.methodHooked(cls.getName(), str, i);
                    fz.b0(list, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Recipient recipient(Object obj) throws NoSuchFieldException {
        IBinder iBinderAsBinder;
        List listJ0;
        IInterface iInterface = obj instanceof IInterface ? (IInterface) obj : null;
        if (iInterface != null && (iBinderAsBinder = iInterface.asBinder()) != null) {
            Map<Object, Boolean> map = this.registries;
            map.getClass();
            synchronized (map) {
                listJ0 = zy.J0(this.registries.keySet());
            }
            for (Object obj2 : listJ0) {
                XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                obj2.getClass();
                Object objectField = xposedHelpers.getObjectField(obj2, "mRecords");
                Collection collection = objectField instanceof Collection ? (Collection) objectField : null;
                if (collection != null) {
                    synchronized (collection) {
                        try {
                            ArrayList arrayListL0 = zy.l0(collection);
                            int size = arrayListL0.size();
                            int i = 0;
                            while (i < size) {
                                Object obj3 = arrayListL0.get(i);
                                i++;
                                XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
                                Object objectField2 = xposedHelpers2.getObjectField(obj3, "callback");
                                IInterface iInterface2 = objectField2 instanceof IInterface ? (IInterface) objectField2 : null;
                                if (iInterface2 != null && o51.f(iInterface2.asBinder(), iBinderAsBinder)) {
                                    int intField = xposedHelpers2.getIntField(obj3, "callerUid");
                                    Object objectField3 = xposedHelpers2.getObjectField(obj3, "callingPackage");
                                    return new Recipient(obj2, intField, objectField3 instanceof String ? (String) objectField3 : null);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        this.live = false;
        List<XposedInterface.HookHandle> list = this.handles;
        list.getClass();
        Iterator it = new eh2(list).iterator();
        while (((ListIterator) ((dh2) it).f).hasPrevious()) {
            ((XposedInterface.HookHandle) ((ListIterator) ((dh2) it).f).previous()).unhook();
        }
        this.handles.clear();
        this.callbackClasses.clear();
        this.registries.clear();
    }

    public final void install(Class<?> cls) {
        cls.getClass();
        try {
            cls.getDeclaredField("mRecords");
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Method method : declaredMethods) {
                String name = method.getName();
                name.getClass();
                if (s13.Z(name, "listen", false)) {
                    arrayList.add(method);
                }
            }
            ArrayList arrayList2 = new ArrayList(az.Y(arrayList, 10));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                arrayList2.add(((Method) obj).getName());
            }
            for (String str : zy.h0(arrayList2)) {
                List<XposedInterface.HookHandle> list = this.handles;
                XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                str.getClass();
                ArrayList arrayList3 = new ArrayList();
                d0 d0VarY = zm3.y(cls.getDeclaredMethods());
                int i3 = 0;
                while (d0VarY.hasNext()) {
                    final Method method2 = (Method) d0VarY.next();
                    if (o51.f(method2.getName(), str) && !Modifier.isAbstract(method2.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.TelephonyCallbackDelivery$install$$inlined$hookAllMethods$1
                                public Object intercept(XposedInterface.Chain chain) {
                                    Object obj2;
                                    Object wg2Var;
                                    chain.getClass();
                                    method2.getClass();
                                    if (this.live) {
                                        Object thisObject = chain.getThisObject();
                                        if (thisObject != null) {
                                            Map map = this.registries;
                                            map.getClass();
                                            map.put(thisObject, Boolean.TRUE);
                                        }
                                        List args = chain.getArgs();
                                        args.getClass();
                                        ArrayList arrayListL0 = zy.l0(args);
                                        int size2 = arrayListL0.size();
                                        int i4 = 0;
                                        do {
                                            if (i4 >= size2) {
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = arrayListL0.get(i4);
                                            i4++;
                                        } while (!LocationHooker.Companion.hasTypeByName(obj2.getClass(), "com.android.internal.telephony.IPhoneStateListener"));
                                        if (obj2 != null) {
                                            try {
                                                this.hookCallback(obj2.getClass());
                                                wg2Var = mf3.a;
                                            } catch (Throwable th) {
                                                wg2Var = new wg2(th);
                                            }
                                            Throwable thA = xg2.a(wg2Var);
                                            if (thA != null) {
                                                HookStatus.INSTANCE.error("TelephonyRegistry/callback", thA);
                                            }
                                        }
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept.getClass();
                            arrayList3.add(hookHandleIntercept);
                            i3++;
                        } catch (Throwable th) {
                            HookStatus.INSTANCE.error(cls.getName() + "#" + str, th);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(cls.getName(), str, i3);
                fz.b0(list, arrayList3);
            }
            Method[] declaredMethods2 = cls.getDeclaredMethods();
            declaredMethods2.getClass();
            ArrayList arrayList4 = new ArrayList();
            for (Method method3 : declaredMethods2) {
                if (!Modifier.isAbstract(method3.getModifiers()) && !Modifier.isNative(method3.getModifiers())) {
                    arrayList4.add(method3);
                }
            }
            int size2 = arrayList4.size();
            while (i < size2) {
                Object obj2 = arrayList4.get(i);
                i++;
                Method method4 = (Method) obj2;
                if (!this.module.deoptimize(method4)) {
                    throw new IllegalStateException(("Cannot deoptimize " + method4.getName()).toString());
                }
            }
        } catch (Throwable th2) {
            close();
            HookStatus.INSTANCE.error("TelephonyRegistry/recipient-delivery", th2);
        }
    }
}
