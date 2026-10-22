package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class gi3 {
    public final to a;
    public final to b;
    public final to c;

    public gi3(to toVar, to toVar2, to toVar3) {
        this.a = toVar;
        this.b = toVar2;
        this.c = toVar3;
    }

    public abstract hi3 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        to toVar = this.c;
        Class cls2 = (Class) toVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        toVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        to toVar = this.a;
        Method method = (Method) toVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, gi3.class.getClassLoader()).getDeclaredMethod("read", gi3.class);
        toVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        to toVar = this.b;
        Method method = (Method) toVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, gi3.class);
        toVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((hi3) this).e.readParcelable(hi3.class.getClassLoader());
    }

    public final ii3 g() {
        String string = ((hi3) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (ii3) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(ii3 ii3Var) {
        if (ii3Var == null) {
            ((hi3) this).e.writeString(null);
            return;
        }
        try {
            ((hi3) this).e.writeString(b(ii3Var.getClass()).getName());
            hi3 hi3VarA = a();
            try {
                d(ii3Var.getClass()).invoke(null, ii3Var, hi3VarA);
                Parcel parcel = hi3VarA.e;
                int i = hi3VarA.i;
                if (i >= 0) {
                    int i2 = hi3VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(ii3Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
