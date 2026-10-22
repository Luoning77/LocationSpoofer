package defpackage;

import androidx.fragment.app.a;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wr0 {
    public final a a;

    public wr0(a aVar) {
        this.a = aVar;
    }

    public final void a() {
        hs0 hs0Var = this.a.g;
        if (hs0Var.u == null) {
            return;
        }
        hs0Var.B = false;
        hs0Var.C = false;
        hs0Var.H.getClass();
        Iterator it = hs0Var.c.k().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                b81.u();
                return;
            }
        }
    }
}
