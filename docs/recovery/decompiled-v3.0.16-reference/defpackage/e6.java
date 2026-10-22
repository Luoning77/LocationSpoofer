package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudCompanionDevice;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class e6 extends k33 implements lu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ l6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6(l6 l6Var, q60 q60Var, int i) {
        super(1, q60Var);
        this.e = i;
        this.g = l6Var;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        int i = this.e;
        l6 l6Var = this.g;
        switch (i) {
            case 0:
                return new e6(l6Var, q60Var, 0);
            case 1:
                return new e6(l6Var, q60Var, 1);
            case 2:
                return new e6(l6Var, q60Var, 2);
            case 3:
                return new e6(l6Var, q60Var, 3);
            case 4:
                return new e6(l6Var, q60Var, 4);
            case Logger.WARN /* 5 */:
                return new e6(l6Var, q60Var, 5);
            default:
                return new e6(l6Var, q60Var, 6);
        }
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        q60 q60Var = (q60) obj;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case Logger.WARN /* 5 */:
                break;
        }
        return ((e6) create(q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        l6 l6Var = this.g;
        z70 z70Var = z70.e;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ee0.J(obj);
                    CloudRepository cloudRepository = l6Var.b;
                    this.f = 1;
                    return cloudRepository.ensureAccount(this) == z70Var ? z70Var : mf3Var;
                }
                if (i2 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ee0.J(obj);
                    CloudRepository cloudRepository2 = l6Var.b;
                    this.f = 1;
                    return cloudRepository2.retryHardwareIdentity(true, this) == z70Var ? z70Var : mf3Var;
                }
                if (i3 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ee0.J(obj);
                    CloudRepository cloudRepository3 = l6Var.b;
                    this.f = 1;
                    return cloudRepository3.refreshAccount(this) == z70Var ? z70Var : mf3Var;
                }
                if (i4 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                MutableStateFlow mutableStateFlow = l6Var.k;
                int i5 = this.f;
                if (i5 == 0) {
                    ee0.J(obj);
                    CloudCompanionDevice cloudCompanionDevice = (CloudCompanionDevice) mutableStateFlow.getValue();
                    if (cloudCompanionDevice == null) {
                        return mf3Var;
                    }
                    CloudRepository cloudRepository4 = l6Var.b;
                    this.f = 1;
                    if (cloudRepository4.removeCompanion(cloudCompanionDevice, this) == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i5 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                mutableStateFlow.setValue(null);
                l6Var.u.setValue("companion_removed");
                return mf3Var;
            case 4:
                int i6 = this.f;
                if (i6 == 0) {
                    ee0.J(obj);
                    CloudRepository cloudRepository5 = l6Var.b;
                    this.f = 1;
                    return CloudRepository.retryHardwareIdentity$default(cloudRepository5, false, this, 1, null) == z70Var ? z70Var : mf3Var;
                }
                if (i6 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Logger.WARN /* 5 */:
                int i7 = this.f;
                if (i7 == 0) {
                    ee0.J(obj);
                    CloudRepository cloudRepository6 = l6Var.b;
                    this.f = 1;
                    return cloudRepository6.retryPasswordDevice(this) == z70Var ? z70Var : mf3Var;
                }
                if (i7 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i8 = this.f;
                if (i8 == 0) {
                    ee0.J(obj);
                    CloudRepository cloudRepository7 = l6Var.b;
                    this.f = 1;
                    return cloudRepository7.signOut(this) == z70Var ? z70Var : mf3Var;
                }
                if (i8 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
