package defpackage;

import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkLocationDelivery;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class et0 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ FrameworkLocationDelivery f;
    public final /* synthetic */ Object g;

    public /* synthetic */ et0(FrameworkLocationDelivery frameworkLocationDelivery, Object obj, int i) {
        this.e = i;
        this.f = frameworkLocationDelivery;
        this.g = obj;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        Object obj = this.g;
        FrameworkLocationDelivery frameworkLocationDelivery = this.f;
        switch (i) {
            case 0:
                return FrameworkLocationDelivery.tick$lambda$31(frameworkLocationDelivery, obj);
            case 1:
                return FrameworkLocationDelivery.close$lambda$47$lambda$46(frameworkLocationDelivery, obj);
            case 2:
                return frameworkLocationDelivery.makeLocation(obj);
            default:
                return FrameworkLocationDelivery.tick$lambda$30$lambda$29(frameworkLocationDelivery, obj);
        }
    }
}
