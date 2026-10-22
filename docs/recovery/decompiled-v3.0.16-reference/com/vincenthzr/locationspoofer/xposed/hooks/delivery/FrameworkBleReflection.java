package com.vincenthzr.locationspoofer.xposed.hooks.delivery;

import defpackage.am1;
import defpackage.ap;
import defpackage.at2;
import defpackage.az2;
import defpackage.cm2;
import defpackage.dc3;
import defpackage.fo;
import defpackage.fz;
import defpackage.in0;
import defpackage.lu0;
import defpackage.my;
import defpackage.o51;
import defpackage.p91;
import defpackage.qn0;
import defpackage.t;
import defpackage.us2;
import defpackage.xs2;
import defpackage.ym2;
import defpackage.yo;
import defpackage.zs0;
import defpackage.zy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FrameworkBleReflection {
    public static final FrameworkBleReflection INSTANCE = new FrameworkBleReflection();

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Layout {
        private final Method add;
        private final Class<?> client;
        private final Method dead;
        private final Class<?> manager;
        private final Method matches;
        private final Method permission;
        private final Method sendBatch;
        private final Method sendIntent;

        public Layout(Class<?> cls, Method method, Method method2, Method method3, Method method4, Method method5, Class<?> cls2, Method method6) {
            cls.getClass();
            method.getClass();
            method2.getClass();
            method3.getClass();
            method4.getClass();
            method5.getClass();
            cls2.getClass();
            method6.getClass();
            this.client = cls;
            this.permission = method;
            this.matches = method2;
            this.sendBatch = method3;
            this.sendIntent = method4;
            this.dead = method5;
            this.manager = cls2;
            this.add = method6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Layout copy$default(Layout layout, Class cls, Method method, Method method2, Method method3, Method method4, Method method5, Class cls2, Method method6, int i, Object obj) {
            if ((i & 1) != 0) {
                cls = layout.client;
            }
            if ((i & 2) != 0) {
                method = layout.permission;
            }
            if ((i & 4) != 0) {
                method2 = layout.matches;
            }
            if ((i & 8) != 0) {
                method3 = layout.sendBatch;
            }
            if ((i & 16) != 0) {
                method4 = layout.sendIntent;
            }
            if ((i & 32) != 0) {
                method5 = layout.dead;
            }
            if ((i & 64) != 0) {
                cls2 = layout.manager;
            }
            if ((i & WorkQueueKt.BUFFER_CAPACITY) != 0) {
                method6 = layout.add;
            }
            Class cls3 = cls2;
            Method method7 = method6;
            Method method8 = method4;
            Method method9 = method5;
            return layout.copy(cls, method, method2, method3, method8, method9, cls3, method7);
        }

        public final Class<?> component1() {
            return this.client;
        }

        public final Method component2() {
            return this.permission;
        }

        public final Method component3() {
            return this.matches;
        }

        public final Method component4() {
            return this.sendBatch;
        }

        public final Method component5() {
            return this.sendIntent;
        }

        public final Method component6() {
            return this.dead;
        }

        public final Class<?> component7() {
            return this.manager;
        }

        public final Method component8() {
            return this.add;
        }

        public final Layout copy(Class<?> cls, Method method, Method method2, Method method3, Method method4, Method method5, Class<?> cls2, Method method6) {
            cls.getClass();
            method.getClass();
            method2.getClass();
            method3.getClass();
            method4.getClass();
            method5.getClass();
            cls2.getClass();
            method6.getClass();
            return new Layout(cls, method, method2, method3, method4, method5, cls2, method6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Layout)) {
                return false;
            }
            Layout layout = (Layout) obj;
            return o51.f(this.client, layout.client) && o51.f(this.permission, layout.permission) && o51.f(this.matches, layout.matches) && o51.f(this.sendBatch, layout.sendBatch) && o51.f(this.sendIntent, layout.sendIntent) && o51.f(this.dead, layout.dead) && o51.f(this.manager, layout.manager) && o51.f(this.add, layout.add);
        }

        public final Method getAdd() {
            return this.add;
        }

        public final Class<?> getClient() {
            return this.client;
        }

        public final Method getDead() {
            return this.dead;
        }

        public final Class<?> getManager() {
            return this.manager;
        }

        public final Method getMatches() {
            return this.matches;
        }

        public final Method getPermission() {
            return this.permission;
        }

        public final Method getSendBatch() {
            return this.sendBatch;
        }

        public final Method getSendIntent() {
            return this.sendIntent;
        }

        public int hashCode() {
            return this.add.hashCode() + ((this.manager.hashCode() + ((this.dead.hashCode() + ((this.sendIntent.hashCode() + ((this.sendBatch.hashCode() + ((this.matches.hashCode() + ((this.permission.hashCode() + (this.client.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Layout(client=" + this.client + ", permission=" + this.permission + ", matches=" + this.matches + ", sendBatch=" + this.sendBatch + ", sendIntent=" + this.sendIntent + ", dead=" + this.dead + ", manager=" + this.manager + ", add=" + this.add + ")";
        }
    }

    private FrameworkBleReflection() {
    }

    private final Method deliveryMethod(Class<?> cls, String str, lu0 lu0Var) throws NoSuchMethodException {
        Object next;
        for (Class cls2 : am1.G(ArrayList.class, List.class)) {
            Iterator it = methods(cls).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Method method = (Method) next;
                if (o51.f(method.getName(), str) && !Modifier.isStatic(method.getModifiers()) && o51.f(method.getReturnType(), Void.TYPE) && method.getParameterCount() == 3) {
                    if (o51.f(method.getParameterTypes()[o51.f(str, "sendBatchScanResults") ? (char) 2 : (char) 1], cls2) && ((Boolean) lu0Var.invoke(method)).booleanValue()) {
                        break;
                    }
                }
            }
            Method method2 = (Method) next;
            if (method2 != null) {
                method2.setAccessible(true);
                return method2;
            }
        }
        throw new NoSuchMethodException(cls.getName() + "." + str + " with List/ArrayList delivery signature");
    }

    private final us2 hierarchy(Class<?> cls) {
        return xs2.Q(new zs0(0), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class hierarchy$lambda$0(Class cls) {
        cls.getClass();
        return cls.getSuperclass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence method$lambda$5(Class cls) {
        cls.getClass();
        return cls.getName();
    }

    private final us2 methods(Class<?> cls) {
        us2 us2VarHierarchy = hierarchy(cls);
        my myVar = new my(28);
        us2VarHierarchy.getClass();
        return new qn0(us2VarHierarchy, myVar, at2.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final us2 methods$lambda$6(Class cls) {
        cls.getClass();
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        return yo.g0(declaredMethods);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean resolve$lambda$13(Class cls, Method method) {
        method.getClass();
        return o51.f(method.getParameterTypes()[1], cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean resolve$lambda$14(Method method) {
        method.getClass();
        return o51.f(method.getParameterTypes()[2], Integer.TYPE);
    }

    public final Field field(Class<?> cls, String str, String... strArr) throws NoSuchFieldException {
        String strConcat;
        cls.getClass();
        str.getClass();
        strArr.getClass();
        if (str.length() <= 0 || (str.length() > 1 && str.charAt(0) == 'm' && Character.isUpperCase(str.charAt(1)))) {
            strConcat = str;
        } else {
            strConcat = "m".concat(str.length() > 0 ? Character.toUpperCase(str.charAt(0)) + str.substring(1) : str);
        }
        List listF = am1.F(str);
        ArrayList arrayList = new ArrayList(listF.size() + strArr.length);
        arrayList.addAll(listF);
        fz.a0(arrayList, strArr);
        for (String str2 : zy.h0(zy.w0(arrayList, strConcat))) {
            Iterator it = hierarchy(cls).iterator();
            while (it.hasNext()) {
                try {
                    Field declaredField = ((Class) it.next()).getDeclaredField(str2);
                    declaredField.setAccessible(true);
                    return declaredField;
                } catch (NoSuchFieldException unused) {
                }
            }
        }
        String name = cls.getName();
        List listF2 = am1.F(str);
        ArrayList arrayList2 = new ArrayList(listF2.size() + strArr.length);
        arrayList2.addAll(listF2);
        fz.a0(arrayList2, strArr);
        throw new NoSuchFieldException(az2.k(name, ".", zy.s0(zy.h0(zy.w0(arrayList2, strConcat)), null, null, null, null, 63)));
    }

    public final Method flushMethod(Class<?> cls, us2 us2Var, Class<?> cls2) {
        qn0 qn0Var;
        cls.getClass();
        us2Var.getClass();
        cls2.getClass();
        int i = 1;
        us2 us2VarG0 = yo.g0(new us2[]{new ap(cls, 4), us2Var});
        ym2 ym2Var = new ym2(16);
        if (us2VarG0 instanceof dc3) {
            dc3 dc3Var = (dc3) us2VarG0;
            qn0Var = new qn0(dc3Var.a, dc3Var.b, ym2Var);
        } else {
            qn0Var = new qn0(us2VarG0, new cm2(i), ym2Var);
        }
        in0 in0Var = new in0(qn0Var);
        while (in0Var.hasNext()) {
            Class<?> cls3 = (Class) in0Var.next();
            try {
                Class cls4 = Integer.TYPE;
                cls4.getClass();
                return this.method(cls3, "flushPendingBatchResults", cls4, cls2);
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException(cls.getName() + "/ScanBinder.flushPendingBatchResults(int, " + cls2.getName() + ")");
    }

    public final Object getOf(Object obj, String... strArr) throws IllegalAccessException, NoSuchFieldException {
        obj.getClass();
        strArr.getClass();
        boolean z = false;
        for (String str : strArr) {
            try {
                Object obj2 = field(obj.getClass(), str, new String[0]).get(obj);
                if (obj2 != null) {
                    return obj2;
                }
                z = true;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (z) {
            return null;
        }
        throw new NoSuchFieldException(az2.k(obj.getClass().getName(), ".", yo.A0(strArr, null, 63)));
    }

    public final Method method(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        cls.getClass();
        str.getClass();
        clsArr.getClass();
        Iterator it = hierarchy(cls).iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                StringBuilder sbT = p91.t(cls.getName(), ".", str, "(", yo.A0(clsArr, new zs0(i), 31));
                sbT.append(")");
                throw new NoSuchMethodException(sbT.toString());
            }
            try {
                Method declaredMethod = ((Class) it.next()).getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    public final Layout resolve(Class<?> cls, Class<?> cls2) throws NoSuchFieldException, NoSuchMethodException {
        Class cls3;
        Object next;
        Object obj;
        cls.getClass();
        cls2.getClass();
        Iterator it = methods(cls).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            cls3 = Boolean.TYPE;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            Method method = (Method) next;
            if (o51.f(method.getName(), "hasScanResultPermission") && method.getParameterCount() == 1 && o51.f(method.getReturnType(), cls3) && !Modifier.isStatic(method.getModifiers())) {
                break;
            }
        }
        Method method2 = (Method) next;
        if (method2 == null) {
            throw new NoSuchMethodException(cls.getName().concat(".hasScanResultPermission(client)"));
        }
        method2.setAccessible(true);
        Class<?> cls4 = method2.getParameterTypes()[0];
        cls4.getClass();
        Method method3 = method(cls, "matchesFilters", cls4, cls2);
        if (!o51.f(method3.getReturnType(), cls3)) {
            fo.n("Invalid matchesFilters result");
            return null;
        }
        Method methodDeliveryMethod = deliveryMethod(cls, "sendBatchScanResults", new t(cls4, 19));
        Class<?> cls5 = methodDeliveryMethod.getParameterTypes()[0];
        Method methodDeliveryMethod2 = deliveryMethod(cls, "sendResultsByPendingIntent", new my(29));
        Method method4 = method(cls, "handleDeadScanClient", cls4);
        Class<?> type = field(cls, "mScanManager", new String[0]).getType();
        type.getClass();
        field(type, "mHandler", new String[0]);
        field(type, "mScanHelper", "mScanController");
        method(type, "getRegularScanQueue", new Class[0]);
        method(type, "getBatchScanQueue", new Class[0]);
        method(type, "flushBatchScanResults", cls4);
        Class<?> type2 = field(cls, "mScannerMap", new String[0]).getType();
        type2.getClass();
        Class cls6 = Integer.TYPE;
        cls6.getClass();
        method(type2, "getById", cls6);
        Iterator it2 = methods(type2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            Object next2 = it2.next();
            Method method5 = (Method) next2;
            if (o51.f(method5.getName(), "add")) {
                Class<?>[] parameterTypes = method5.getParameterTypes();
                parameterTypes.getClass();
                if (o51.f(parameterTypes.length == 0 ? null : parameterTypes[parameterTypes.length - 1], cls) && o51.f(method5.getReturnType(), cls5)) {
                    obj = next2;
                    break;
                }
            }
        }
        Method method6 = (Method) obj;
        if (method6 == null) {
            throw new NoSuchMethodException(az2.l(type2.getName(), ".add(..., ", cls.getName(), ") -> ", cls5.getName()));
        }
        method6.setAccessible(true);
        field(cls, "mContext", "mAdapterService");
        field(cls, "mLocationDenylistPredicate", new String[0]);
        Iterator it3 = am1.G("scannerId", "appDied", "settings", "callingPackage", "hasDisavowedLocation", "hasScanWithoutLocationPermission", "hasNetworkSettingsPermission", "hasNetworkSetupWizardPermission", "isQApp").iterator();
        while (it3.hasNext()) {
            field(cls4, (String) it3.next(), new String[0]);
        }
        for (String str : am1.G("id", "name", "callback", "info")) {
            cls5.getClass();
            field(cls5, str, new String[0]);
        }
        for (String str2 : am1.G("callingUid", "callingPackage")) {
            Class<?> cls7 = methodDeliveryMethod2.getParameterTypes()[0];
            cls7.getClass();
            field(cls7, str2, new String[0]);
        }
        return new Layout(cls4, method2, method3, methodDeliveryMethod, methodDeliveryMethod2, method4, type, method6);
    }
}
