package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class vm2 {
    public static final List a = am1.G(Application.class, jm2.class);
    public static final List b = am1.F(jm2.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        d0 d0VarY = zm3.y(cls.getConstructors());
        while (d0VarY.hasNext()) {
            Constructor constructor = (Constructor) d0VarY.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listF0 = yo.F0(parameterTypes);
            if (list.equals(listF0)) {
                return constructor;
            }
            if (list.size() == listF0.size() && listF0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final hj3 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (hj3) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            b81.m("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
