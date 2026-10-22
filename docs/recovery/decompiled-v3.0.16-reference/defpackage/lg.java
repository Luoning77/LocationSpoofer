package defpackage;

import android.os.SystemClock;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorization;
import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class lg implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lg(int i, long j, Object obj) {
        this.e = i;
        this.g = obj;
        this.f = j;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        long j = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ut2) ((st) obj)).b(j);
            case 1:
                return Long.valueOf(super/*java.io.FilterInputStream*/.skip(j));
            default:
                RuntimeAuthorizationManager runtimeAuthorizationManager = (RuntimeAuthorizationManager) obj;
                RuntimeAuthorization value = runtimeAuthorizationManager.getAuthorization().getValue();
                if (value == null || value.getRunGeneration() != j || !RuntimeAuthorizationManager.isAuthorized$default(runtimeAuthorizationManager, null, 1, null)) {
                    return null;
                }
                long jW = mh0.w(value.getClaims().e - System.currentTimeMillis(), 0L, 120000L);
                if (jW <= 0) {
                    return null;
                }
                return Long.valueOf(SystemClock.elapsedRealtime() + jW);
        }
    }
}
