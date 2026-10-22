package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cs0 {
    public static final tv2 b = new tv2(0);
    public final /* synthetic */ gs0 a;

    public cs0(gs0 gs0Var) {
        this.a = gs0Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        tv2 tv2Var = b;
        tv2 tv2Var2 = (tv2) tv2Var.get(classLoader);
        if (tv2Var2 == null) {
            tv2Var2 = new tv2(0);
            tv2Var.put(classLoader, tv2Var2);
        }
        Class cls = (Class) tv2Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        tv2Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new iv(az2.k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new iv(az2.k("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final void a(String str) {
        try {
            if (c(this.a.u.e.getClassLoader(), str).getConstructor(null).newInstance(null) == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (IllegalAccessException e) {
            throw new iv(az2.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new iv(az2.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new iv(az2.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new iv(az2.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
