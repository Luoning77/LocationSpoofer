package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudArchive;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p3 implements qu0 {
    public final /* synthetic */ CloudArchive e;
    public final /* synthetic */ String f;
    public final /* synthetic */ CoroutineScope g;
    public final /* synthetic */ AccountBenefitsRepository h;
    public final /* synthetic */ ey1 i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ ey1 k;
    public final /* synthetic */ ey1 l;
    public final /* synthetic */ ey1 m;
    public final /* synthetic */ ey1 n;
    public final /* synthetic */ ey1 o;

    public p3(CloudArchive cloudArchive, String str, CoroutineScope coroutineScope, AccountBenefitsRepository accountBenefitsRepository, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4, ey1 ey1Var5, ey1 ey1Var6, ey1 ey1Var7) {
        this.e = cloudArchive;
        this.f = str;
        this.g = coroutineScope;
        this.h = accountBenefitsRepository;
        this.i = ey1Var;
        this.j = ey1Var2;
        this.k = ey1Var3;
        this.l = ey1Var4;
        this.m = ey1Var5;
        this.n = ey1Var6;
        this.o = ey1Var7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean, int] */
    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        gh ghVar;
        x30 x30Var;
        gh ghVar2;
        gh ghVar3;
        Object obj4;
        CloudArchive cloudArchive;
        ey1 ey1Var;
        ?? r7;
        ov0 ov0Var;
        ey1 ey1Var2;
        f30 f30Var = (f30) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((zz) obj).getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        if (ov0Var2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            dv1 dv1VarD = zm3.D(iw2.e(av1.a, 1.0f), 12.0f);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var2, 48);
            int iHashCode = Long.hashCode(ov0Var2.T);
            l72 l72VarL = ov0Var2.l();
            dv1 dv1VarH = xp1.H(ov0Var2, dv1VarD);
            w20.b.getClass();
            x30 x30Var2 = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var2);
            } else {
                ov0Var2.p0();
            }
            gh ghVar4 = v20.e;
            q73.h(ov0Var2, ghVar4, kk2VarA);
            gh ghVar5 = v20.d;
            q73.h(ov0Var2, ghVar5, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar6 = v20.f;
            q73.h(ov0Var2, ghVar6, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var2, waVar);
            gh ghVar7 = v20.c;
            q73.h(ov0Var2, ghVar7, dv1VarH);
            ey1 ey1Var3 = this.i;
            boolean zF = o51.f((String) ey1Var3.getValue(), "trash");
            Object obj5 = d30.a;
            CloudArchive cloudArchive2 = this.e;
            ey1 ey1Var4 = this.k;
            if (zF) {
                ov0Var2.c0(-1424870593);
                ey1 ey1Var5 = this.j;
                boolean zContains = ((Set) ey1Var5.getValue()).contains(cloudArchive2.getId());
                boolean zH = ov0Var2.h(cloudArchive2);
                Object objQ = ov0Var2.Q();
                if (zH || objQ == obj5) {
                    objQ = new l3(0, cloudArchive2, ey1Var5);
                    ov0Var2.m0(objQ);
                }
                lu0 lu0Var = (lu0) objQ;
                boolean z = !xq1.e(ey1Var4);
                ghVar2 = ghVar4;
                x30Var = x30Var2;
                ey1Var = ey1Var4;
                obj4 = obj5;
                cloudArchive = cloudArchive2;
                ghVar3 = ghVar7;
                ghVar = ghVar6;
                uw uwVarQ = da0.q(bk.g, 0L, 0L, 0L, 0L, ov0Var2, 62);
                ov0 ov0Var3 = ov0Var2;
                ym3.f(zContains, lu0Var, null, z, uwVarQ, ov0Var3, 0, 36);
                r7 = 0;
                ov0Var = ov0Var3;
            } else {
                ghVar = ghVar6;
                x30Var = x30Var2;
                ghVar2 = ghVar4;
                ghVar3 = ghVar7;
                obj4 = obj5;
                cloudArchive = cloudArchive2;
                ey1Var = ey1Var4;
                r7 = 0;
                ov0Var2.c0(-1228010367);
                ov0Var = ov0Var2;
            }
            ov0Var.p(r7);
            wb1 wb1Var = new wb1(1.0f, true);
            yz yzVarA = wz.a(am1.g, j9.r, ov0Var, r7);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, wb1Var);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar2, yzVarA);
            q73.h(ov0Var, ghVar5, l72VarL2);
            az2.s(iHashCode2, ov0Var, ghVar, ov0Var, waVar);
            q73.h(ov0Var, ghVar3, dv1VarH2);
            String strV = xq1.v(cloudArchive.getCreatedAt());
            strV.getClass();
            cd2 cd2Var = le3.a;
            ov0 ov0Var4 = ov0Var;
            s83.b(strV, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(cd2Var)).i, ov0Var4, 0, 0, 131070);
            s83.b(ke0.O(2131624049, new Object[]{l13.C0(8, cloudArchive.getDeviceId())}, ov0Var4), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(cd2Var)).l, ov0Var4, 0, 0, 131070);
            Set<Map.Entry<String, Integer>> setEntrySet = cloudArchive.getCounts().entrySet();
            Object objQ2 = ov0Var4.Q();
            if (objQ2 == obj4) {
                objQ2 = m3.f;
                ov0Var4.m0(objQ2);
            }
            s83.b(zy.s0(setEntrySet, " · ", null, null, (lu0) objQ2, 30), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(cd2Var)).l, ov0Var4, 0, 0, 131070);
            String strV2 = xq1.v(cloudArchive.getExpiresAt());
            strV2.getClass();
            s83.b(ke0.O(2131624051, new Object[]{strV2}, ov0Var4), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(cd2Var)).l, ov0Var4, 0, 0, 131070);
            ov0Var4.p(true);
            String str = this.f;
            boolean zF2 = ov0Var4.f(str);
            CoroutineScope coroutineScope = this.g;
            boolean zH2 = zF2 | ov0Var4.h(coroutineScope);
            AccountBenefitsRepository accountBenefitsRepository = this.h;
            CloudArchive cloudArchive3 = cloudArchive;
            boolean zH3 = zH2 | ov0Var4.h(accountBenefitsRepository) | ov0Var4.h(cloudArchive3);
            Object objQ3 = ov0Var4.Q();
            if (zH3 || objQ3 == obj4) {
                ey1Var2 = ey1Var;
                Object o3Var = new o3(accountBenefitsRepository, cloudArchive3, ey1Var3, this.l, this.m, this.n, str, coroutineScope, ey1Var2, this.o);
                ov0Var4.m0(o3Var);
                objQ3 = o3Var;
            } else {
                ey1Var2 = ey1Var;
            }
            boolean z2 = !xq1.e(ey1Var2);
            b52 b52Var = hu.a;
            n51.j((au0) objQ3, null, z2, null, hu.f(bk.g, ov0Var4), null, ks.j, ov0Var4, 805306368, 490);
            ov0Var4.p(true);
        } else {
            ov0Var2.W();
        }
        return mf3.a;
    }
}
