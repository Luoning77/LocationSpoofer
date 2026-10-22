package defpackage;

import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkBleDelivery;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class qs0 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ FrameworkBleDelivery f;

    public /* synthetic */ qs0(FrameworkBleDelivery frameworkBleDelivery, int i) {
        this.e = i;
        this.f = frameworkBleDelivery;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        FrameworkBleDelivery frameworkBleDelivery = this.f;
        switch (i) {
            case 0:
                return FrameworkBleDelivery.install$lambda$27(frameworkBleDelivery);
            default:
                return FrameworkBleDelivery.install$lambda$27$lambda$26(frameworkBleDelivery);
        }
    }
}
