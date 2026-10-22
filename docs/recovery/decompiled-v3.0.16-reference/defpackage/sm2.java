package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sm2 {
    public final tm2 a;
    public final ol2 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final gt2 c = new gt2(4);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public sm2(tm2 tm2Var, ol2 ol2Var) {
        this.a = tm2Var;
        this.b = ol2Var;
    }

    public final void a() {
        tm2 tm2Var = this.a;
        if (((ff1) tm2Var.getLifecycle()).d != we1.f) {
            fo.n("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                fo.n("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            tm2Var.getLifecycle().a(new or1(this, 1));
            this.e = true;
        }
    }
}
