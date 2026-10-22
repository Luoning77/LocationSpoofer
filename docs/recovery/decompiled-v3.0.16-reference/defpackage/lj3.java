package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lj3 extends nj3 {
    public static lj3 c;
    public static final gt2 d = new gt2(11);
    public final Application b;

    public lj3(Application application) {
        this.b = application;
    }

    @Override // defpackage.nj3, defpackage.mj3
    public final hj3 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        b81.s("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.nj3, defpackage.mj3
    public final hj3 b(Class cls, dx1 dx1Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) dx1Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!fh.class.isAssignableFrom(cls)) {
            return dh0.l(cls);
        }
        fo.i("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final hj3 d(Class cls, Application application) {
        if (!fh.class.isAssignableFrom(cls)) {
            return dh0.l(cls);
        }
        try {
            hj3 hj3Var = (hj3) cls.getConstructor(Application.class).newInstance(application);
            hj3Var.getClass();
            return hj3Var;
        } catch (IllegalAccessException e) {
            b81.m("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            b81.m("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            b81.m("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            b81.m("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
