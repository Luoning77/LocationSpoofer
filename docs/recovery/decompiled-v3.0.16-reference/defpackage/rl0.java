package defpackage;

import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import android.telephony.TelephonyManager$CellInfoCallback;
import java.util.List;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rl0 extends TelephonyManager$CellInfoCallback {
    public final /* synthetic */ CancellableContinuationImpl a;
    public final /* synthetic */ TelephonyManager b;

    public rl0(CancellableContinuationImpl cancellableContinuationImpl, TelephonyManager telephonyManager) {
        this.a = cancellableContinuationImpl;
        this.b = telephonyManager;
    }

    public final void onCellInfo(List list) {
        list.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = this.a;
        if (cancellableContinuationImpl.isActive()) {
            cancellableContinuationImpl.resumeWith(list);
        }
    }

    public final void onError(int i, Throwable th) {
        CancellableContinuationImpl cancellableContinuationImpl = this.a;
        if (cancellableContinuationImpl.isActive()) {
            List<CellInfo> allCellInfo = this.b.getAllCellInfo();
            if (allCellInfo == null) {
                allCellInfo = uj0.e;
            }
            cancellableContinuationImpl.resumeWith(allCellInfo);
        }
    }
}
