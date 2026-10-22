package defpackage;

import com.vincenthzr.locationspoofer.data.repository.LocationRepository;
import com.vincenthzr.locationspoofer.data.repository.SettingsRepository;
import com.vincenthzr.locationspoofer.service.SpoofingControlReceiver;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ez2 extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ SpoofingControlReceiver g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez2(SpoofingControlReceiver spoofingControlReceiver, int i) {
        super(0);
        this.f = i;
        this.g = spoofingControlReceiver;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.f;
        SpoofingControlReceiver spoofingControlReceiver = this.g;
        switch (i) {
            case 0:
                return ((kn2) ((mn2) spoofingControlReceiver.a().a).h).a(xe2.a(LocationRepository.class), null);
            default:
                return ((kn2) ((mn2) spoofingControlReceiver.a().a).h).a(xe2.a(SettingsRepository.class), null);
        }
    }
}
