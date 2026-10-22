package com.vincenthzr.locationspoofer.xposed.utils;

import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import defpackage.az2;
import defpackage.d0;
import defpackage.o51;
import defpackage.pu0;
import defpackage.zm3;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class XposedHelpers {
    public static final XposedHelpers INSTANCE = new XposedHelpers();
    private static final ConcurrentHashMap<String, Field> fieldCache = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Method> methodCache = new ConcurrentHashMap<>();
    public static XposedModule module;

    private XposedHelpers() {
    }

    private final Field findFieldInternal(Class<?> cls, String str) {
        String strK = az2.k(cls.getName(), "#", str);
        ConcurrentHashMap<String, Field> concurrentHashMap = fieldCache;
        if (concurrentHashMap.containsKey(strK)) {
            return concurrentHashMap.get(strK);
        }
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                fieldCache.put(strK, declaredField);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        fieldCache.put(strK, null);
        return null;
    }

    public final Object callMethod(Object obj, String str, Object... objArr) throws NoSuchMethodException {
        obj.getClass();
        str.getClass();
        objArr.getClass();
        String str2 = obj.getClass().getName() + "#" + str + "#" + objArr.length;
        Method method = methodCache.get(str2);
        if (method != null) {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            d0 d0VarY = zm3.y(superclass.getDeclaredMethods());
            while (d0VarY.hasNext()) {
                Method method2 = (Method) d0VarY.next();
                if (o51.f(method2.getName(), str) && method2.getParameterCount() == objArr.length) {
                    method2.setAccessible(true);
                    methodCache.put(str2, method2);
                    return method2.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                }
            }
        }
        throw new NoSuchMethodException(str);
    }

    public final Object callStaticMethod(Class<?> cls, String str, Object... objArr) throws NoSuchMethodException {
        cls.getClass();
        str.getClass();
        objArr.getClass();
        String str2 = cls.getName() + "#" + str + "#" + objArr.length + "#static";
        Method method = methodCache.get(str2);
        if (method != null) {
            return method.invoke(null, Arrays.copyOf(objArr, objArr.length));
        }
        while (cls != null) {
            d0 d0VarY = zm3.y(cls.getDeclaredMethods());
            while (d0VarY.hasNext()) {
                Method method2 = (Method) d0VarY.next();
                if (o51.f(method2.getName(), str) && method2.getParameterCount() == objArr.length && Modifier.isStatic(method2.getModifiers())) {
                    method2.setAccessible(true);
                    methodCache.put(str2, method2);
                    return method2.invoke(null, Arrays.copyOf(objArr, objArr.length));
                }
            }
            cls = cls.getSuperclass();
        }
        throw new NoSuchMethodException(str);
    }

    public final Class<?> findClass(String str, ClassLoader classLoader) throws ClassNotFoundException {
        str.getClass();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        cls.getClass();
        return cls;
    }

    public final Class<?> findClassIfExists(String str, ClassLoader classLoader) {
        str.getClass();
        try {
            return findClass(str, classLoader);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Method findMethodExact(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        cls.getClass();
        str.getClass();
        clsArr.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException(str);
    }

    public final int getIntField(Object obj, String str) throws NoSuchFieldException {
        obj.getClass();
        str.getClass();
        Field fieldFindFieldInternal = findFieldInternal(obj.getClass(), str);
        if (fieldFindFieldInternal != null) {
            return fieldFindFieldInternal.getInt(obj);
        }
        throw new NoSuchFieldException(str);
    }

    public final XposedModule getModule() {
        XposedModule xposedModule = module;
        if (xposedModule != null) {
            return xposedModule;
        }
        o51.F("module");
        throw null;
    }

    public final Object getObjectField(Object obj, String str) throws NoSuchFieldException {
        obj.getClass();
        str.getClass();
        Field fieldFindFieldInternal = findFieldInternal(obj.getClass(), str);
        if (fieldFindFieldInternal != null) {
            return fieldFindFieldInternal.get(obj);
        }
        throw new NoSuchFieldException(str);
    }

    public final Object getStaticObjectField(Class<?> cls, String str) throws NoSuchFieldException {
        cls.getClass();
        str.getClass();
        Field fieldFindFieldInternal = findFieldInternal(cls, str);
        if (fieldFindFieldInternal != null) {
            return fieldFindFieldInternal.get(null);
        }
        throw new NoSuchFieldException(str);
    }

    public final void hookAllConstructors(Class<?> cls, final pu0 pu0Var) {
        cls.getClass();
        pu0Var.getClass();
        d0 d0VarY = zm3.y(cls.getDeclaredConstructors());
        while (d0VarY.hasNext()) {
            final Constructor constructor = (Constructor) d0VarY.next();
            try {
                getModule().hook(constructor).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers.hookAllConstructors.1
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        pu0 pu0Var2 = pu0Var;
                        Constructor<?> constructor2 = constructor;
                        constructor2.getClass();
                        return pu0Var2.invoke(chain, constructor2);
                    }
                }).getClass();
            } catch (Throwable unused) {
            }
        }
    }

    public final List<XposedInterface.HookHandle> hookAllMethods(Class<?> cls, String str, final pu0 pu0Var) {
        cls.getClass();
        str.getClass();
        pu0Var.getClass();
        ArrayList arrayList = new ArrayList();
        d0 d0VarY = zm3.y(cls.getDeclaredMethods());
        int i = 0;
        while (d0VarY.hasNext()) {
            final Method method = (Method) d0VarY.next();
            if (o51.f(method.getName(), str) && !Modifier.isAbstract(method.getModifiers())) {
                try {
                    XposedInterface.HookHandle hookHandleIntercept = getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers$hookAllMethods$handle$1
                        public Object intercept(XposedInterface.Chain chain) {
                            chain.getClass();
                            pu0 pu0Var2 = pu0Var;
                            Method method2 = method;
                            method2.getClass();
                            return pu0Var2.invoke(chain, method2);
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
        return arrayList;
    }

    public final void hookMethod(String str, ClassLoader classLoader, String str2, Object[] objArr, final pu0 pu0Var) {
        Class<?> clsFindClass;
        str.getClass();
        str2.getClass();
        objArr.getClass();
        pu0Var.getClass();
        try {
            Class<?> clsFindClass2 = findClass(str, classLoader);
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                if (obj instanceof Class) {
                    clsFindClass = (Class) obj;
                } else {
                    if (!(obj instanceof String)) {
                        throw new IllegalArgumentException("Invalid argument type");
                    }
                    clsFindClass = INSTANCE.findClass((String) obj, clsFindClass2.getClassLoader());
                }
                arrayList.add(clsFindClass);
            }
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            final Method methodFindMethodExact = findMethodExact(clsFindClass2, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            getModule().hook(methodFindMethodExact).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers.hookMethod.1
                public Object intercept(XposedInterface.Chain chain) {
                    chain.getClass();
                    return pu0Var.invoke(chain, methodFindMethodExact);
                }
            }).getClass();
        } catch (Throwable unused) {
        }
    }

    public final boolean isModuleInitialized() {
        return module != null;
    }

    public final Object newInstance(Class<?> cls, Object... objArr) {
        cls.getClass();
        objArr.getClass();
        d0 d0VarY = zm3.y(cls.getDeclaredConstructors());
        while (d0VarY.hasNext()) {
            Constructor constructor = (Constructor) d0VarY.next();
            if (constructor.getParameterCount() == objArr.length) {
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
                objNewInstance.getClass();
                return objNewInstance;
            }
        }
        throw new NoSuchMethodException(az2.k("Constructor for ", cls.getName(), " not found"));
    }

    public final void setBooleanField(Object obj, String str, boolean z) throws IllegalAccessException, NoSuchFieldException {
        obj.getClass();
        str.getClass();
        Field fieldFindFieldInternal = findFieldInternal(obj.getClass(), str);
        if (fieldFindFieldInternal == null) {
            throw new NoSuchFieldException(str);
        }
        fieldFindFieldInternal.setBoolean(obj, z);
    }

    public final void setDoubleField(Object obj, String str, double d) throws IllegalAccessException, NoSuchFieldException {
        obj.getClass();
        str.getClass();
        Field fieldFindFieldInternal = findFieldInternal(obj.getClass(), str);
        if (fieldFindFieldInternal == null) {
            throw new NoSuchFieldException(str);
        }
        fieldFindFieldInternal.setDouble(obj, d);
    }

    public final void setIntField(Object obj, String str, int i) {
        obj.getClass();
        str.getClass();
        Field fieldFindFieldInternal = findFieldInternal(obj.getClass(), str);
        if (fieldFindFieldInternal == null) {
            throw new NoSuchFieldException(str);
        }
        fieldFindFieldInternal.setInt(obj, i);
    }

    public final void setLongField(Object obj, String str, long j) throws IllegalAccessException, NoSuchFieldException {
        obj.getClass();
        str.getClass();
        Field fieldFindFieldInternal = findFieldInternal(obj.getClass(), str);
        if (fieldFindFieldInternal == null) {
            throw new NoSuchFieldException(str);
        }
        fieldFindFieldInternal.setLong(obj, j);
    }

    public final void setModule(XposedModule xposedModule) {
        xposedModule.getClass();
        module = xposedModule;
    }

    public final void setObjectField(Object obj, String str, Object obj2) {
        obj.getClass();
        str.getClass();
        Field fieldFindFieldInternal = findFieldInternal(obj.getClass(), str);
        if (fieldFindFieldInternal == null) {
            throw new NoSuchFieldException(str);
        }
        fieldFindFieldInternal.set(obj, obj2);
    }
}
