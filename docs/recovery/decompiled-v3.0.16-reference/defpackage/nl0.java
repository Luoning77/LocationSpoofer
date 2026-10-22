package defpackage;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nl0 extends ScanCallback {
    public final /* synthetic */ CopyOnWriteArrayList a;

    public nl0(CopyOnWriteArrayList copyOnWriteArrayList) {
        this.a = copyOnWriteArrayList;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onBatchScanResults(List list) {
        if (list != null) {
            this.a.addAll(list);
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i, ScanResult scanResult) {
        if (scanResult != null) {
            this.a.add(scanResult);
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanFailed(int i) {
    }
}
