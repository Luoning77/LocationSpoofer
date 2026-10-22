package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.RuntimeAuthorization;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import com.vincenthzr.locationspoofer.service.FloatingJoystickService;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jo0 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ FloatingJoystickService g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jo0(FloatingJoystickService floatingJoystickService, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = floatingJoystickService;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        FloatingJoystickService floatingJoystickService = this.g;
        switch (i) {
            case 0:
                return new jo0(floatingJoystickService, q60Var, 0);
            default:
                return new jo0(floatingJoystickService, q60Var, 1);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        z70 z70Var = z70.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                ((jo0) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
            default:
                ((jo0) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
                break;
        }
        return z70Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        z70 z70Var = z70.e;
        FloatingJoystickService floatingJoystickService = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ee0.J(obj);
                    }
                    return null;
                }
                ee0.J(obj);
                StateFlow<MotionController.State> state = floatingJoystickService.getMotionController().getState();
                io0 io0Var = new io0(floatingJoystickService);
                this.f = 1;
                if (state.collect(io0Var, this) == z70Var) {
                    return z70Var;
                }
                fo.d();
                return null;
            default:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ee0.J(obj);
                    }
                    return null;
                }
                ee0.J(obj);
                StateFlow<RuntimeAuthorization> authorization = floatingJoystickService.getRuntimeAuthorization().getAuthorization();
                wd wdVar = new wd(floatingJoystickService, 2);
                this.f = 1;
                if (authorization.collect(wdVar, this) == z70Var) {
                    return z70Var;
                }
                fo.d();
                return null;
        }
    }
}
