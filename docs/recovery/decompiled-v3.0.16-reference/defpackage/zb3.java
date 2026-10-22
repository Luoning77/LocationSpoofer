package defpackage;

import org.maplibre.android.maps.n;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zb3 implements eq1 {
    public final /* synthetic */ n a;

    public zb3(n nVar) {
        this.a = nVar;
    }

    @Override // defpackage.eq1
    public final void b(boolean z) {
        if (z) {
            n nVar = this.a;
            nVar.e.b();
            nVar.b.e.c.remove(this);
        }
    }
}
