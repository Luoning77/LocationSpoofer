package defpackage;

import com.vincenthzr.locationspoofer.service.FloatingJoystickService;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class eo0 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ FloatingJoystickService f;
    public final /* synthetic */ x20 g;

    public /* synthetic */ eo0(FloatingJoystickService floatingJoystickService, x20 x20Var, int i) {
        this.e = i;
        this.f = floatingJoystickService;
        this.g = x20Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        x20 x20Var = this.g;
        FloatingJoystickService floatingJoystickService = this.f;
        f30 f30Var = (f30) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23$lambda$22(floatingJoystickService, x20Var, f30Var, iIntValue);
            default:
                return FloatingJoystickService.showFloatingWindow$lambda$24$lambda$23(floatingJoystickService, x20Var, f30Var, iIntValue);
        }
    }
}
