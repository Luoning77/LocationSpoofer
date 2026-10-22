package defpackage;

import java.util.Iterator;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ap1 {
    public final /* synthetic */ dp1 a;

    public ap1(dp1 dp1Var) {
        this.a = dp1Var;
    }

    public final void a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            Logger.e("MapGestureDetector", "Could not call onMove with parameters " + f + "," + f2);
            return;
        }
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        dp1 dp1Var = this.a;
        dp1Var.e.c(1);
        if (!dp1Var.c.o) {
            f = 0.0f;
        }
        dp1Var.a.e(-f, -f2, 0L);
        Iterator it = dp1Var.i.iterator();
        if (it.hasNext()) {
            throw az2.g(it);
        }
    }
}
