package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qm2 {
    public final sm2 a;
    public ck b;

    public qm2(sm2 sm2Var) {
        this.a = sm2Var;
    }

    public final Bundle a(String str) {
        sm2 sm2Var = this.a;
        if (!sm2Var.g) {
            fo.n("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = sm2Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleV = bundle.containsKey(str) ? mc0.v(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            sm2Var.f = null;
        }
        return bundleV;
    }

    public final pm2 b(String str) {
        pm2 pm2Var;
        sm2 sm2Var = this.a;
        synchronized (sm2Var.c) {
            Iterator it = sm2Var.d.entrySet().iterator();
            do {
                pm2Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                pm2 pm2Var2 = (pm2) entry.getValue();
                if (o51.f(str2, str)) {
                    pm2Var = pm2Var2;
                }
            } while (pm2Var == null);
        }
        return pm2Var;
    }

    public final void c(String str, pm2 pm2Var) {
        sm2 sm2Var = this.a;
        synchronized (sm2Var.c) {
            if (sm2Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            sm2Var.d.put(str, pm2Var);
        }
    }

    public final void d() {
        if (!this.a.h) {
            fo.n("Can not perform this action after onSaveInstanceState");
            return;
        }
        ck ckVar = this.b;
        if (ckVar == null) {
            ckVar = new ck(this);
        }
        this.b = ckVar;
        try {
            le1.class.getDeclaredConstructor(null);
            ck ckVar2 = this.b;
            if (ckVar2 != null) {
                ((LinkedHashSet) ckVar2.b).add(le1.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + le1.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
