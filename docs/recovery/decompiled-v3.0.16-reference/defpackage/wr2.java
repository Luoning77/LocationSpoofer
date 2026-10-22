package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import org.maplibre.android.maps.k;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wr2 implements ComponentCallbacks2 {
    public final /* synthetic */ se2 e;
    public final /* synthetic */ k f;

    public wr2(se2 se2Var, k kVar) {
        this.e = se2Var;
        this.f = kVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        if (this.e.e) {
            return;
        }
        this.f.e();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 10) {
            onLowMemory();
        }
    }
}
