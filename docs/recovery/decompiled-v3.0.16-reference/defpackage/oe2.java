package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oe2 implements bf1 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ oe2(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.bf1
    public final void U(df1 df1Var, ve1 ve1Var) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                tm2 tm2Var = (tm2) obj;
                if (ve1Var != ve1.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                df1Var.getLifecycle().b(this);
                Bundle bundleA = tm2Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    fo.n("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, oe2.class.getClassLoader()).asSubclass(om2.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(tm2Var instanceof pj3)) {
                                    b81.q(tm2Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                oj3 viewModelStore = ((pj3) tm2Var).getViewModelStore();
                                qm2 savedStateRegistry = tm2Var.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                for (String str3 : new HashSet(linkedHashMap.keySet())) {
                                    str3.getClass();
                                    hj3 hj3Var = (hj3) linkedHashMap.get(str3);
                                    if (hj3Var != null) {
                                        ee0.q(hj3Var, savedStateRegistry, tm2Var.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(az2.j("Failed to instantiate ", str2), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(az2.k("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                componentActivity.ensureViewModelStore();
                componentActivity.getLifecycle().b(this);
                return;
            case 2:
                new HashMap();
                tv0[] tv0VarArr = (tv0[]) obj;
                if (tv0VarArr.length > 0) {
                    tv0 tv0Var = tv0VarArr[0];
                    throw null;
                }
                if (tv0VarArr.length <= 0) {
                    return;
                }
                tv0 tv0Var2 = tv0VarArr[0];
                throw null;
            default:
                if (ve1Var != ve1.ON_CREATE) {
                    b81.q(ve1Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    df1Var.getLifecycle().b(this);
                    ((mm2) obj).b();
                    return;
                }
        }
    }
}
