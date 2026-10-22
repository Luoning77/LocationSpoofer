package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudCompanionPreview;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f6 extends k33 implements lu0 {
    public final /* synthetic */ int e;
    public MutableStateFlow f;
    public int g;
    public final /* synthetic */ l6 h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(l6 l6Var, String str, q60 q60Var, int i) {
        super(1, q60Var);
        this.e = i;
        this.h = l6Var;
        this.i = str;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        int i = this.e;
        String str = this.i;
        l6 l6Var = this.h;
        switch (i) {
            case 0:
                return new f6(l6Var, str, q60Var, 0);
            default:
                return new f6(l6Var, str, q60Var, 1);
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
        return ((f6) create(q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws JSONException {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        String str = this.i;
        l6 l6Var = this.h;
        z70 z70Var = z70.e;
        switch (i) {
            case 0:
                CloudRepository cloudRepository = l6Var.b;
                MutableStateFlow mutableStateFlow3 = l6Var.m;
                int i2 = this.g;
                if (i2 == 0) {
                    ee0.J(obj);
                    CloudCompanionPreview cloudCompanionPreview = (CloudCompanionPreview) mutableStateFlow3.getValue();
                    if (cloudCompanionPreview == null) {
                        return mf3Var;
                    }
                    this.g = 1;
                    if (cloudRepository.approveCompanion(str, cloudCompanionPreview, this) != z70Var) {
                    }
                    return z70Var;
                }
                if (i2 == 1) {
                    ee0.J(obj);
                } else {
                    if (i2 != 2) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableStateFlow = this.f;
                    ee0.J(obj);
                }
                mutableStateFlow.setValue(obj);
                l6Var.u.setValue("companion_bound");
                return mf3Var;
                mutableStateFlow3.setValue(null);
                MutableStateFlow mutableStateFlow4 = l6Var.k;
                this.f = mutableStateFlow4;
                this.g = 2;
                Object objCompanionDevice = cloudRepository.companionDevice(this);
                if (objCompanionDevice != z70Var) {
                    obj = objCompanionDevice;
                    mutableStateFlow = mutableStateFlow4;
                    mutableStateFlow.setValue(obj);
                    l6Var.u.setValue("companion_bound");
                    return mf3Var;
                }
                return z70Var;
            default:
                int i3 = this.g;
                if (i3 == 0) {
                    ee0.J(obj);
                    MutableStateFlow mutableStateFlow5 = l6Var.m;
                    CloudRepository cloudRepository2 = l6Var.b;
                    this.f = mutableStateFlow5;
                    this.g = 1;
                    Object objPreviewCompanion = cloudRepository2.previewCompanion(str, this);
                    if (objPreviewCompanion == z70Var) {
                        return z70Var;
                    }
                    obj = objPreviewCompanion;
                    mutableStateFlow2 = mutableStateFlow5;
                } else {
                    if (i3 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableStateFlow2 = this.f;
                    ee0.J(obj);
                }
                mutableStateFlow2.setValue(obj);
                return mf3Var;
        }
    }
}
