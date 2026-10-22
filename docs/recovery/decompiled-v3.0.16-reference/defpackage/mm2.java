package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mm2 implements pm2 {
    public final qm2 a;
    public boolean b;
    public Bundle c;
    public final i43 d;

    public mm2(qm2 qm2Var, ComponentActivity componentActivity) {
        qm2Var.getClass();
        this.a = qm2Var;
        this.d = new i43(new ol2(componentActivity, 2));
    }

    @Override // defpackage.pm2
    public final Bundle a() {
        Bundle bundleJ = ks.J((i52[]) Arrays.copyOf(new i52[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleJ.putAll(bundle);
        }
        for (Map.Entry entry : ((nm2) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((v00) ((jm2) entry.getValue()).a.e).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleJ.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleJ;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleJ = ks.J((i52[]) Arrays.copyOf(new i52[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleJ.putAll(bundle);
        }
        if (bundleA != null) {
            bundleJ.putAll(bundleA);
        }
        this.c = bundleJ;
        this.b = true;
    }
}
