package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i6 extends k33 implements lu0 {
    public final /* synthetic */ int e;
    public MutableStateFlow f;
    public int g;
    public final /* synthetic */ l6 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i6(l6 l6Var, q60 q60Var, int i) {
        super(1, q60Var);
        this.e = i;
        this.h = l6Var;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        int i = this.e;
        l6 l6Var = this.h;
        switch (i) {
            case 0:
                return new i6(l6Var, q60Var, 0);
            default:
                return new i6(l6Var, q60Var, 1);
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
        }
        return ((i6) create(q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws JSONException {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        z70 z70Var = z70.e;
        l6 l6Var = this.h;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 == 0) {
                    ee0.J(obj);
                    MutableStateFlow mutableStateFlow3 = l6Var.k;
                    CloudRepository cloudRepository = l6Var.b;
                    this.f = mutableStateFlow3;
                    this.g = 1;
                    Object objCompanionDevice = cloudRepository.companionDevice(this);
                    if (objCompanionDevice == z70Var) {
                        return z70Var;
                    }
                    obj = objCompanionDevice;
                    mutableStateFlow = mutableStateFlow3;
                } else {
                    if (i2 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableStateFlow = this.f;
                    ee0.J(obj);
                }
                mutableStateFlow.setValue(obj);
                return mf3Var;
            default:
                CloudRepository cloudRepository2 = l6Var.b;
                int i3 = this.g;
                if (i3 == 0) {
                    ee0.J(obj);
                    this.g = 1;
                    if (cloudRepository2.releaseCompanion(this) != z70Var) {
                    }
                    return z70Var;
                }
                if (i3 == 1) {
                    ee0.J(obj);
                } else {
                    if (i3 != 2) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableStateFlow2 = this.f;
                    ee0.J(obj);
                }
                mutableStateFlow2.setValue(obj);
                l6Var.u.setValue("companion_released");
                return mf3Var;
                MutableStateFlow mutableStateFlow4 = l6Var.k;
                this.f = mutableStateFlow4;
                this.g = 2;
                Object objCompanionDevice2 = cloudRepository2.companionDevice(this);
                if (objCompanionDevice2 != z70Var) {
                    obj = objCompanionDevice2;
                    mutableStateFlow2 = mutableStateFlow4;
                    mutableStateFlow2.setValue(obj);
                    l6Var.u.setValue("companion_released");
                    return mf3Var;
                }
                return z70Var;
        }
    }
}
