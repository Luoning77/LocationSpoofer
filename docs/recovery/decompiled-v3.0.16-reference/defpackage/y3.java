package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import com.vincenthzr.locationspoofer.data.cloud.ArchivePage;
import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y3 extends k33 implements pu0 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ AccountBenefitsRepository g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ey1 i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ ey1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(AccountBenefitsRepository accountBenefitsRepository, int i, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, q60 q60Var) {
        super(2, q60Var);
        this.g = accountBenefitsRepository;
        this.h = i;
        this.i = ey1Var;
        this.j = ey1Var2;
        this.k = ey1Var3;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        y3 y3Var = new y3(this.g, this.h, this.i, this.j, this.k, q60Var);
        y3Var.f = obj;
        return y3Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((y3) create((String) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws JSONException, CloudException {
        String str = (String) this.f;
        int i = this.e;
        AccountBenefitsRepository accountBenefitsRepository = this.g;
        if (i == 0) {
            ee0.J(obj);
            String str2 = (String) this.i.getValue();
            this.f = str;
            this.e = 1;
            obj = accountBenefitsRepository.archives(str, str2, this.h, this);
            z70 z70Var = z70.e;
            if (obj == z70Var) {
                return z70Var;
            }
        } else {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        ArchivePage archivePage = (ArchivePage) obj;
        if (accountBenefitsRepository.current(str)) {
            this.j.setValue(archivePage);
            this.k.setValue(zj0.e);
        }
        return mf3.a;
    }
}
