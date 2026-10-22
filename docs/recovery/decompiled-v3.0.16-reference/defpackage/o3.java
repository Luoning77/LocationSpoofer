package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudArchive;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o3 implements au0 {
    public final /* synthetic */ AccountBenefitsRepository e;
    public final /* synthetic */ CloudArchive f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ ey1 h;
    public final /* synthetic */ ey1 i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ String k;
    public final /* synthetic */ CoroutineScope l;
    public final /* synthetic */ ey1 m;
    public final /* synthetic */ ey1 n;

    public o3(AccountBenefitsRepository accountBenefitsRepository, CloudArchive cloudArchive, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4, String str, CoroutineScope coroutineScope, ey1 ey1Var5, ey1 ey1Var6) {
        this.e = accountBenefitsRepository;
        this.f = cloudArchive;
        this.g = ey1Var;
        this.h = ey1Var2;
        this.i = ey1Var3;
        this.j = ey1Var4;
        this.k = str;
        this.l = coroutineScope;
        this.m = ey1Var5;
        this.n = ey1Var6;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        AccountBenefitsRepository accountBenefitsRepository = this.e;
        xq1.f(this.k, this.l, this.m, this.n, accountBenefitsRepository, new n3(accountBenefitsRepository, this.f, this.g, this.h, this.i, this.j, null, 0));
        return mf3.a;
    }
}
