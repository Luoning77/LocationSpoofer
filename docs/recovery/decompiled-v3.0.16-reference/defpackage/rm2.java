package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rm2 {
    public final sm2 a;
    public final qm2 b;

    public rm2(sm2 sm2Var) {
        this.a = sm2Var;
        this.b = new qm2(sm2Var);
    }

    public final void a(Bundle bundle) {
        sm2 sm2Var = this.a;
        tm2 tm2Var = sm2Var.a;
        if (!sm2Var.e) {
            sm2Var.a();
        }
        if (((ff1) tm2Var.getLifecycle()).d.compareTo(we1.h) >= 0) {
            b81.q(((ff1) tm2Var.getLifecycle()).d, "performRestore cannot be called when owner is ");
            return;
        }
        if (sm2Var.g) {
            fo.n("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleV = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleV = mc0.v("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        sm2Var.f = bundleV;
        sm2Var.g = true;
    }

    public final void b(Bundle bundle) {
        sm2 sm2Var = this.a;
        Bundle bundleJ = ks.J((i52[]) Arrays.copyOf(new i52[0], 0));
        Bundle bundle2 = sm2Var.f;
        if (bundle2 != null) {
            bundleJ.putAll(bundle2);
        }
        synchronized (sm2Var.c) {
            for (Map.Entry entry : sm2Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((pm2) entry.getValue()).a();
                str.getClass();
                bundleA.getClass();
                bundleJ.putBundle(str, bundleA);
            }
        }
        if (bundleJ.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleJ);
    }
}
