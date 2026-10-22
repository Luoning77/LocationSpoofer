package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class um2 implements mj3 {
    public final Application a;
    public final lj3 b;
    public final Bundle c;
    public final xe1 d;
    public final qm2 e;

    public um2(Application application, tm2 tm2Var, Bundle bundle) {
        lj3 lj3Var;
        this.e = tm2Var.getSavedStateRegistry();
        this.d = tm2Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            lj3Var = lj3.c;
            if (lj3Var == null) {
                lj3Var = new lj3(application);
                lj3.c = lj3Var;
            }
        } else {
            lj3Var = new lj3(null);
        }
        this.b = lj3Var;
    }

    @Override // defpackage.mj3
    public final hj3 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        fo.i("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.mj3
    public final hj3 b(Class cls, dx1 dx1Var) {
        gt2 gt2Var = xp1.O;
        LinkedHashMap linkedHashMap = dx1Var.a;
        String str = (String) linkedHashMap.get(gt2Var);
        if (str == null) {
            fo.n("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(k22.x) == null || linkedHashMap.get(k22.y) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            fo.n("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(lj3.d);
        boolean zIsAssignableFrom = fh.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? vm2.a(cls, vm2.b) : vm2.a(cls, vm2.a);
        if (constructorA == null) {
            return this.b.b(cls, dx1Var);
        }
        return (!zIsAssignableFrom || application == null) ? vm2.b(cls, constructorA, k22.p(dx1Var)) : vm2.b(cls, constructorA, application, k22.p(dx1Var));
    }

    @Override // defpackage.mj3
    public final hj3 c(ox oxVar, dx1 dx1Var) {
        return b(ig0.r(oxVar), dx1Var);
    }

    public final hj3 d(Class cls, String str) {
        xe1 xe1Var = this.d;
        if (xe1Var == null) {
            b81.s("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = fh.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? vm2.a(cls, vm2.b) : vm2.a(cls, vm2.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            nj3 nj3Var = nj3.a;
            if (nj3Var == null) {
                nj3Var = new nj3();
                nj3.a = nj3Var;
            }
            return nj3Var.a(cls);
        }
        qm2 qm2Var = this.e;
        qm2Var.getClass();
        jm2 jm2VarA = mh0.A(qm2Var.a(str), this.c);
        km2 km2Var = new km2(str, jm2VarA);
        km2Var.c0(qm2Var, xe1Var);
        we1 we1Var = ((ff1) xe1Var).d;
        if (we1Var == we1.f || we1Var.compareTo(we1.h) >= 0) {
            qm2Var.d();
        } else {
            xe1Var.a(new ta0(1, xe1Var, qm2Var));
        }
        hj3 hj3VarB = (!zIsAssignableFrom || application == null) ? vm2.b(cls, constructorA, jm2VarA) : vm2.b(cls, constructorA, application, jm2VarA);
        hj3VarB.a("androidx.lifecycle.savedstate.vm.tag", km2Var);
        return hj3VarB;
    }
}
