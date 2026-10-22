package defpackage;

import org.maplibre.android.maps.g;
import org.maplibre.android.maps.k;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dq1 implements hq1 {
    public int a;
    public final /* synthetic */ k b;

    public dq1(k kVar) {
        this.b = kVar;
        kVar.e.i.add(this);
    }

    @Override // defpackage.hq1
    public final void c() {
        k kVar = this.b;
        g gVar = kVar.i;
        if (gVar == null || gVar.i() == null || !kVar.i.i().f) {
            return;
        }
        int i = this.a + 1;
        this.a = i;
        if (i == 3) {
            kVar.setForeground(null);
            kVar.e.i.remove(this);
        }
    }
}
