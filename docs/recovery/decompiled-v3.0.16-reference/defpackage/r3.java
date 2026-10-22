package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import com.vincenthzr.locationspoofer.data.sync.AccountSyncManager;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class r3 extends k33 implements pu0 {
    public ey1 e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ AccountSyncManager h;
    public final /* synthetic */ AccountBenefitsRepository i;
    public final /* synthetic */ Context j;
    public final /* synthetic */ ey1 k;
    public final /* synthetic */ ey1 l;
    public final /* synthetic */ ey1 m;
    public final /* synthetic */ ey1 n;
    public final /* synthetic */ ey1 o;
    public final /* synthetic */ ey1 p;
    public final /* synthetic */ ey1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(AccountSyncManager accountSyncManager, AccountBenefitsRepository accountBenefitsRepository, Context context, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4, ey1 ey1Var5, ey1 ey1Var6, ey1 ey1Var7, q60 q60Var) {
        super(2, q60Var);
        this.h = accountSyncManager;
        this.i = accountBenefitsRepository;
        this.j = context;
        this.k = ey1Var;
        this.l = ey1Var2;
        this.m = ey1Var3;
        this.n = ey1Var4;
        this.o = ey1Var5;
        this.p = ey1Var6;
        this.q = ey1Var7;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        r3 r3Var = new r3(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, q60Var);
        r3Var.g = obj;
        return r3Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((r3) create((String) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0159, code lost:
    
        if (r0 == r10) goto L34;
     */
    @Override // defpackage.oq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
