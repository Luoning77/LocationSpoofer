package org.maplibre.android.offline;

import defpackage.hg;
import defpackage.ub;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a implements OfflineManager.FileSourceCallback {
    public final /* synthetic */ OfflineManager a;
    public final /* synthetic */ OfflineManager.FileSourceCallback b;

    public a(OfflineManager offlineManager, OfflineManager.FileSourceCallback fileSourceCallback) {
        this.a = offlineManager;
        this.b = fileSourceCallback;
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onError(String str) {
        str.getClass();
        OfflineManager offlineManager = this.a;
        offlineManager.b.post(new hg(offlineManager, this.b, str, 3));
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onSuccess() {
        OfflineManager offlineManager = this.a;
        offlineManager.b.post(new ub(6, offlineManager, this.b));
    }
}
