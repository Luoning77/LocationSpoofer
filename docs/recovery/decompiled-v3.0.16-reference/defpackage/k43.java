package defpackage;

import android.os.IBinder;
import com.vincenthzr.locationspoofer.xposed.hooks.SystemBluetoothServiceHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class k43 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ IBinder f;

    public /* synthetic */ k43(IBinder iBinder, int i) {
        this.e = i;
        this.f = iBinder;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        IBinder iBinder = this.f;
        switch (i) {
            case 0:
                return SystemBluetoothServiceHookerKt.restoreSystemBleReloadState$lambda$4$lambda$3$lambda$2(iBinder);
            case 1:
                return SystemLocationServiceHookerKt.restoreSystemLocationReloadState$lambda$7$lambda$6$lambda$5(iBinder);
            case 2:
                return SystemLocationServiceHookerKt.restoreSystemLocationReloadState$lambda$11$lambda$10$lambda$9(iBinder);
            case 3:
                return SystemLocationServiceHookerKt.restoreSystemLocationReloadState$lambda$14$lambda$13$lambda$12(iBinder);
            default:
                return SystemLocationServiceHookerKt.restoreSystemLocationReloadState$lambda$17$lambda$16$lambda$15(iBinder);
        }
    }
}
