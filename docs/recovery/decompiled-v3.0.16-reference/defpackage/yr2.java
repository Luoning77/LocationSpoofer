package defpackage;

import org.maplibre.android.offline.OfflineManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yr2 implements OfflineManager.FileSourceCallback {
    public final /* synthetic */ OfflineManager a;
    public final /* synthetic */ zr2 b;

    public yr2(OfflineManager offlineManager, zr2 zr2Var) {
        this.a = offlineManager;
        this.b = zr2Var;
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onError(String str) {
        str.getClass();
        this.b.onError(str);
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onSuccess() {
        this.a.a(this.b);
    }
}
