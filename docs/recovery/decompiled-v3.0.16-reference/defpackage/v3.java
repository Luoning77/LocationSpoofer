package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudArchive;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v3 implements ru0 {
    public final /* synthetic */ List e;
    public final /* synthetic */ long f;
    public final /* synthetic */ String g;
    public final /* synthetic */ CoroutineScope h;
    public final /* synthetic */ AccountBenefitsRepository i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ ey1 k;
    public final /* synthetic */ ey1 l;
    public final /* synthetic */ ey1 m;
    public final /* synthetic */ ey1 n;
    public final /* synthetic */ ey1 o;
    public final /* synthetic */ ey1 p;

    public v3(List list, long j, String str, CoroutineScope coroutineScope, AccountBenefitsRepository accountBenefitsRepository, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4, ey1 ey1Var5, ey1 ey1Var6, ey1 ey1Var7) {
        this.e = list;
        this.f = j;
        this.g = str;
        this.h = coroutineScope;
        this.i = accountBenefitsRepository;
        this.j = ey1Var;
        this.k = ey1Var2;
        this.l = ey1Var3;
        this.m = ey1Var4;
        this.n = ey1Var5;
        this.o = ey1Var6;
        this.p = ey1Var7;
    }

    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        bc1 bc1Var = (bc1) obj;
        int iIntValue = ((Number) obj2).intValue();
        f30 f30Var = (f30) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((ov0) f30Var).f(bc1Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((ov0) f30Var).d(iIntValue) ? 32 : 16;
        }
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (i & 147) != 146)) {
            CloudArchive cloudArchive = (CloudArchive) this.e.get(iIntValue);
            ov0Var.c0(-1217466781);
            sb.C(null, null, ym3.t(this.f, 0L, ov0Var, 0, 14), null, sb.a0(-82377635, new p3(cloudArchive, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p), ov0Var), ov0Var, 196608, 27);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
