package defpackage;

import com.vincenthzr.locationspoofer.xposed.utils.FrameworkConfigReceiver;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class bt0 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ FrameworkConfigReceiver f;

    public /* synthetic */ bt0(FrameworkConfigReceiver frameworkConfigReceiver, int i) {
        this.e = i;
        this.f = frameworkConfigReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        FrameworkConfigReceiver frameworkConfigReceiver = this.f;
        switch (i) {
            case 0:
                frameworkConfigReceiver.refresh$xposed_globalRelease();
                break;
            default:
                frameworkConfigReceiver.refresh$xposed_globalRelease();
                break;
        }
    }
}
