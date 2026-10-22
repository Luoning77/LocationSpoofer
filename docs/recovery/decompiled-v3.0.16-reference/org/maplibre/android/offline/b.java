package org.maplibre.android.offline;

import defpackage.hg;
import defpackage.ub;
import defpackage.yr2;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b implements OfflineManager.FileSourceCallback {
    public final /* synthetic */ OfflineManager a;
    public final /* synthetic */ yr2 b;

    public b(OfflineManager offlineManager, yr2 yr2Var) {
        this.a = offlineManager;
        this.b = yr2Var;
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onError(String str) {
        str.getClass();
        OfflineManager offlineManager = this.a;
        offlineManager.a.activate();
        offlineManager.b.post(new hg(offlineManager, this.b, str, 4));
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onSuccess() {
        OfflineManager offlineManager = this.a;
        offlineManager.b.post(new ub(7, offlineManager, this.b));
    }
}
