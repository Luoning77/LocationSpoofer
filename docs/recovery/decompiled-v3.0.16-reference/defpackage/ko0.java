package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorizationManager;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import com.vincenthzr.locationspoofer.service.FloatingJoystickService;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ko0 extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ FloatingJoystickService g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko0(FloatingJoystickService floatingJoystickService, int i) {
        super(0);
        this.f = i;
        this.g = floatingJoystickService;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.f;
        FloatingJoystickService floatingJoystickService = this.g;
        switch (i) {
            case 0:
                return o51.t(floatingJoystickService).a(xe2.a(MotionController.class), null);
            default:
                return o51.t(floatingJoystickService).a(xe2.a(RuntimeAuthorizationManager.class), null);
        }
    }
}
