package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.vincenthzr.locationspoofer.data.db.AppDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ci2 {
    public final Context b;
    public co e;
    public co f;
    public boolean l;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final nk1 g = new nk1(1);
    public final LinkedHashSet h = new LinkedHashSet();
    public final LinkedHashSet i = new LinkedHashSet();
    public final ArrayList j = new ArrayList();
    public boolean k = true;
    public final ox a = xe2.a(AppDatabase.class);

    public ci2(Context context) {
        this.b = context;
    }

    public final void a(xt1... xt1VarArr) {
        for (xt1 xt1Var : xt1VarArr) {
            Integer numValueOf = Integer.valueOf(xt1Var.startVersion);
            LinkedHashSet linkedHashSet = this.i;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(xt1Var.endVersion));
        }
        for (xt1 xt1Var2 : (xt1[]) Arrays.copyOf(xt1VarArr, xt1VarArr.length)) {
            this.g.a(xt1Var2);
        }
    }

    public final ii2 b() {
        String name;
        String str;
        co coVar = this.e;
        if (coVar == null && this.f == null) {
            co coVar2 = eo.i;
            this.f = coVar2;
            this.e = coVar2;
        } else if (coVar != null && this.f == null) {
            this.f = coVar;
        } else if (coVar == null) {
            this.e = this.f;
        }
        LinkedHashSet linkedHashSet = this.i;
        boolean zIsEmpty = linkedHashSet.isEmpty();
        LinkedHashSet linkedHashSet2 = this.h;
        if (!zIsEmpty) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    fo.f(p91.l(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        c30 c30Var = new c30(25);
        Context context = this.b;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        ei2 ei2Var = (activityManager == null || activityManager.isLowRamDevice()) ? ei2.e : ei2.f;
        co coVar3 = this.e;
        if (coVar3 == null) {
            fo.i("Required value was null.");
            return null;
        }
        co coVar4 = this.f;
        if (coVar4 == null) {
            fo.i("Required value was null.");
            return null;
        }
        p90 p90Var = new p90(context, "environment_database", c30Var, this.g, this.c, false, ei2Var, coVar3, coVar4, null, this.k, this.l, linkedHashSet2, null, null, null, this.d, this.j, false, null, null);
        Class clsR = ig0.r(this.a);
        Package r0 = clsR.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = clsR.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            if (name.length() == 0) {
                str = strConcat;
            } else {
                str = name + '.' + strConcat;
            }
            Class<?> cls = Class.forName(str, true, clsR.getClassLoader());
            cls.getClass();
            ii2 ii2Var = (ii2) cls.getDeclaredConstructor(null).newInstance(null);
            ii2Var.init(p90Var);
            return ii2Var;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + clsR.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + clsR.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + clsR.getCanonicalName(), e3);
        }
    }
}
