package defpackage;

import kotlinx.coroutines.CancellableContinuationImpl;
import org.maplibre.android.offline.OfflineManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zr2 implements OfflineManager.FileSourceCallback {
    public final /* synthetic */ CancellableContinuationImpl a;

    public zr2(CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = cancellableContinuationImpl;
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onError(String str) {
        str.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = this.a;
        if (cancellableContinuationImpl.isActive()) {
            cancellableContinuationImpl.resumeWith(Boolean.FALSE);
        }
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onSuccess() {
        CancellableContinuationImpl cancellableContinuationImpl = this.a;
        if (cancellableContinuationImpl.isActive()) {
            cancellableContinuationImpl.resumeWith(Boolean.TRUE);
        }
    }
}
