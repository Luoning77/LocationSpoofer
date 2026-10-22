package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import com.vincenthzr.locationspoofer.data.cloud.CloudMemberInvite;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h6 extends k33 implements lu0 {
    public final /* synthetic */ int e;
    public String f;
    public int g;
    public final /* synthetic */ l6 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(l6 l6Var, String str, q60 q60Var) {
        super(1, q60Var);
        this.e = 2;
        this.h = l6Var;
        this.f = str;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        int i = this.e;
        l6 l6Var = this.h;
        switch (i) {
            case 0:
                return new h6(l6Var, q60Var, 0);
            case 1:
                return new h6(l6Var, q60Var, 1);
            default:
                return new h6(l6Var, this.f, q60Var);
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
        }
        return ((h6) create(q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws JSONException, CloudException {
        String str;
        String str2;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        l6 l6Var = this.h;
        z70 z70Var = z70.e;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 == 0) {
                    ee0.J(obj);
                    CloudAccount account = ((CloudAccountState) l6Var.c.getValue()).getAccount();
                    String sessionId = account != null ? account.getSessionId() : null;
                    CloudRepository cloudRepository = l6Var.b;
                    this.f = sessionId;
                    this.g = 1;
                    Object objMemberInvite = cloudRepository.memberInvite(this);
                    if (objMemberInvite == z70Var) {
                        return z70Var;
                    }
                    String str3 = sessionId;
                    obj = objMemberInvite;
                    str = str3;
                } else {
                    if (i2 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = this.f;
                    ee0.J(obj);
                }
                CloudMemberInvite cloudMemberInvite = (CloudMemberInvite) obj;
                if (!((CloudAccountState) l6Var.c.getValue()).getValidated()) {
                    return mf3Var;
                }
                CloudAccount account2 = ((CloudAccountState) l6Var.c.getValue()).getAccount();
                if (!o51.f(account2 != null ? account2.getSessionId() : null, str)) {
                    return mf3Var;
                }
                l6Var.w.setValue(cloudMemberInvite);
                return mf3Var;
            case 1:
                int i3 = this.g;
                if (i3 == 0) {
                    ee0.J(obj);
                    CloudAccount account3 = ((CloudAccountState) l6Var.c.getValue()).getAccount();
                    String sessionId2 = account3 != null ? account3.getSessionId() : null;
                    CloudRepository cloudRepository2 = l6Var.b;
                    this.f = sessionId2;
                    this.g = 1;
                    Object objAccountDevices = cloudRepository2.accountDevices(this);
                    if (objAccountDevices == z70Var) {
                        return z70Var;
                    }
                    String str4 = sessionId2;
                    obj = objAccountDevices;
                    str2 = str4;
                } else {
                    if (i3 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = this.f;
                    ee0.J(obj);
                }
                List list = (List) obj;
                if (!((CloudAccountState) l6Var.c.getValue()).getValidated()) {
                    return mf3Var;
                }
                CloudAccount account4 = ((CloudAccountState) l6Var.c.getValue()).getAccount();
                if (!o51.f(account4 != null ? account4.getSessionId() : null, str2)) {
                    return mf3Var;
                }
                l6Var.s.setValue(list);
                return mf3Var;
            default:
                int i4 = this.g;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                CloudRepository cloudRepository3 = l6Var.b;
                String str5 = this.f;
                this.g = 1;
                return cloudRepository3.recoverGuest(str5, this) == z70Var ? z70Var : mf3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6(l6 l6Var, q60 q60Var, int i) {
        super(1, q60Var);
        this.e = i;
        this.h = l6Var;
    }
}
