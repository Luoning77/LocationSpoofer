package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z3 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ pu0 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ AccountBenefitsRepository i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ ey1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3(pu0 pu0Var, String str, AccountBenefitsRepository accountBenefitsRepository, ey1 ey1Var, ey1 ey1Var2, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = pu0Var;
        this.h = str;
        this.i = accountBenefitsRepository;
        this.j = ey1Var;
        this.k = ey1Var2;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new z3(this.g, this.h, this.i, this.j, this.k, q60Var, 0);
            default:
                return new z3(this.g, this.h, this.i, this.j, this.k, q60Var, 1);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((z3) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        CloudException cloudException;
        String code;
        String code2;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        String str = "network_error";
        ey1 ey1Var = this.j;
        AccountBenefitsRepository accountBenefitsRepository = this.i;
        pu0 pu0Var = this.g;
        z70 z70Var = z70.e;
        ey1 ey1Var2 = this.k;
        String str2 = this.h;
        switch (i) {
            case 0:
                int i2 = this.f;
                try {
                    try {
                        if (i2 == 0) {
                            ee0.J(obj);
                            this.f = 1;
                            if (pu0Var.invoke(str2, this) == z70Var) {
                                return z70Var;
                            }
                        } else {
                            if (i2 != 1) {
                                fo.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ee0.J(obj);
                        }
                        break;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        if (accountBenefitsRepository.current(str2)) {
                            cloudException = e2 instanceof CloudException ? (CloudException) e2 : null;
                            if (cloudException != null && (code = cloudException.getCode()) != null) {
                                str = code;
                            }
                            ey1Var.setValue(str);
                        }
                    }
                    ey1Var2.setValue(Boolean.FALSE);
                    return mf3Var;
                } catch (Throwable th) {
                    ey1Var2.setValue(Boolean.FALSE);
                    throw th;
                }
            default:
                int i3 = this.f;
                try {
                    try {
                        try {
                            if (i3 == 0) {
                                ee0.J(obj);
                                this.f = 1;
                                if (pu0Var.invoke(str2, this) == z70Var) {
                                    return z70Var;
                                }
                            } else {
                                if (i3 != 1) {
                                    fo.n("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ee0.J(obj);
                            }
                        } catch (CancellationException e3) {
                            throw e3;
                        }
                        break;
                    } catch (Exception e4) {
                        if (accountBenefitsRepository.current(str2)) {
                            cloudException = e4 instanceof CloudException ? (CloudException) e4 : null;
                            if (cloudException != null && (code2 = cloudException.getCode()) != null) {
                                str = code2;
                            }
                            ey1Var.setValue(str);
                        }
                    }
                    ey1Var2.setValue(Boolean.FALSE);
                    return mf3Var;
                } catch (Throwable th2) {
                    ey1Var2.setValue(Boolean.FALSE);
                    throw th2;
                }
        }
    }
}
