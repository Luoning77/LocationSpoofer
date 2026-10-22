package defpackage;

import com.vincenthzr.locationspoofer.data.motion.MotionController;
import com.vincenthzr.locationspoofer.service.FloatingJoystickService;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class io0 implements FlowCollector {
    public final /* synthetic */ FloatingJoystickService e;

    public io0(FloatingJoystickService floatingJoystickService) {
        this.e = floatingJoystickService;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, q60 q60Var) {
        MotionController.State state = (MotionController.State) obj;
        boolean active = state.getActive();
        FloatingJoystickService floatingJoystickService = this.e;
        if (active) {
            floatingJoystickService.keepIdleWindow = false;
        }
        if (!floatingJoystickService.keepIdleWindow && !state.getKeepJoystickVisible()) {
            floatingJoystickService.stopSelf();
        }
        return mf3.a;
    }
}
