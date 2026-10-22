package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sx {
    public static final sx c = new sx();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, rx rxVar, ve1 ve1Var, Class cls) {
        ve1 ve1Var2 = (ve1) map.get(rxVar);
        if (ve1Var2 == null || ve1Var == ve1Var2) {
            if (ve1Var2 == null) {
                map.put(rxVar, ve1Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + rxVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + ve1Var2 + ", new value " + ve1Var);
    }

    public final qx a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            qx qxVarA = (qx) map2.get(superclass);
            if (qxVarA == null) {
                qxVarA = a(superclass, null);
            }
            map.putAll(qxVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            qx qxVarA2 = (qx) map2.get(cls2);
            if (qxVarA2 == null) {
                qxVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : qxVarA2.b.entrySet()) {
                b(map, (rx) entry.getKey(), (ve1) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            c22 c22Var = (c22) method.getAnnotation(c22.class);
            if (c22Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!df1.class.isAssignableFrom(parameterTypes[0])) {
                        fo.i("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                ve1 ve1VarValue = c22Var.value();
                if (parameterTypes.length > 1) {
                    if (!ve1.class.isAssignableFrom(parameterTypes[1])) {
                        fo.i("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (ve1VarValue != ve1.ON_ANY) {
                        fo.i("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    fo.i("cannot have more than 2 params");
                    return null;
                }
                b(map, new rx(i, method), ve1VarValue, cls);
                z = true;
            }
        }
        qx qxVar = new qx(map);
        map2.put(cls, qxVar);
        this.b.put(cls, Boolean.valueOf(z));
        return qxVar;
    }
}
