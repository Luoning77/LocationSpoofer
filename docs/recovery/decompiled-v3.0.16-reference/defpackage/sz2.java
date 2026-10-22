package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager;
import com.vincenthzr.locationspoofer.service.SpoofingService;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sz2 extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ SpoofingService g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sz2(SpoofingService spoofingService, int i) {
        super(0);
        this.f = i;
        this.g = spoofingService;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.f;
        SpoofingService spoofingService = this.g;
        switch (i) {
            case 0:
                return o51.t(spoofingService).a(xe2.a(RuntimeAuthorizationManager.class), null);
            default:
                return o51.t(spoofingService).a(xe2.a(oi2.class), null);
        }
    }
}
