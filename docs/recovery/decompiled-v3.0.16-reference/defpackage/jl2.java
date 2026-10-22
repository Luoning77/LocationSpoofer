package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.sync.AccountSyncManager;
import com.vincenthzr.locationspoofer.data.sync.SyncSelection;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class jl2 implements qu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ jl2(long j, CloudAccountState cloudAccountState, boolean z, SyncSelection syncSelection, CloudAccount cloudAccount, AccountSyncManager accountSyncManager, s03 s03Var) {
        this.f = j;
        this.h = cloudAccountState;
        this.g = z;
        this.i = syncSelection;
        this.j = cloudAccount;
        this.k = accountSyncManager;
        this.l = s03Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v34 */
    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        float f;
        ey1 ey1Var;
        ?? r15;
        ov0 ov0Var;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        Object obj7 = this.i;
        Object obj8 = this.h;
        switch (i) {
            case 0:
                String str = (String) obj8;
                lu0 lu0Var = (lu0) obj7;
                vp0 vp0Var = (vp0) obj6;
                ey1 ey1Var2 = (ey1) obj5;
                au0 au0Var = (au0) obj4;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var;
                if (!ov0Var2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    av1 av1Var = av1.a;
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    jo joVar = new jo(16.0f, true, new fo(0));
                    nr nrVar = j9.r;
                    yz yzVarA = wz.a(joVar, nrVar, ov0Var2, 6);
                    int iHashCode = Long.hashCode(ov0Var2.T);
                    l72 l72VarL = ov0Var2.l();
                    dv1 dv1VarH = xp1.H(ov0Var2, dv1VarE);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    gh ghVar = v20.e;
                    q73.h(ov0Var2, ghVar, yzVarA);
                    gh ghVar2 = v20.d;
                    q73.h(ov0Var2, ghVar2, l72VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    gh ghVar3 = v20.f;
                    q73.h(ov0Var2, ghVar3, numValueOf);
                    wa waVar = v20.g;
                    q73.g(ov0Var2, waVar);
                    gh ghVar4 = v20.c;
                    q73.h(ov0Var2, ghVar4, dv1VarH);
                    dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                    or orVar = j9.p;
                    go goVar = am1.e;
                    kk2 kk2VarA = jk2.a(goVar, orVar, ov0Var2, 48);
                    int iHashCode2 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL2 = ov0Var2.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarE2);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, kk2VarA);
                    q73.h(ov0Var2, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH2);
                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 38.0f), cj2.a(12.0f));
                    long j2 = bk.i;
                    long jC = hz.c(0.14f, j2);
                    iy0 iy0Var = o51.p0;
                    dv1 dv1VarK = xp1.k(dv1VarN, jC, iy0Var);
                    pr prVar = j9.j;
                    er1 er1VarC = ws.c(prVar, false);
                    int iHashCode3 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL3 = ov0Var2.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var2, dv1VarK);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, er1VarC);
                    q73.h(ov0Var2, ghVar2, l72VarL3);
                    az2.s(iHashCode3, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH3);
                    t01.a(ke0.C(), null, iw2.k(av1Var, 20.0f), j2, ov0Var2, 3504, 0);
                    az2.t(ov0Var2, true, av1Var, 12.0f, ov0Var2);
                    lk2 lk2Var = lk2.a;
                    dv1 dv1VarA = lk2.a(lk2Var, av1Var, 1.0f);
                    yz yzVarA2 = wz.a(am1.g, nrVar, ov0Var2, 0);
                    int iHashCode4 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL4 = ov0Var2.l();
                    dv1 dv1VarH4 = xp1.H(ov0Var2, dv1VarA);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, yzVarA2);
                    q73.h(ov0Var2, ghVar2, l72VarL4);
                    az2.s(iHashCode4, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH4);
                    long jB = v63.b(17.5d);
                    jr0 jr0Var = jr0.j;
                    cd2 cd2Var = mz.a;
                    s83.b(str, null, ((kz) ov0Var2.j(cd2Var)).q, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
                    gh0.h(ov0Var2, iw2.g(av1Var, 2.0f));
                    String strN = ke0.N(2131624777, ov0Var2);
                    long jC2 = v63.c(12);
                    long j3 = this.f;
                    s83.b(strN, null, j3, jC2, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262122);
                    ov0Var2.p(true);
                    ov0Var2.p(true);
                    dv1 dv1VarN2 = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f));
                    boolean z = this.g;
                    if (z) {
                        j = hz.c;
                        f = 0.06f;
                    } else {
                        j = hz.b;
                        f = 0.04f;
                    }
                    dv1 dv1VarE3 = zm3.E(xp1.k(dv1VarN2, hz.c(f, j), iy0Var), 14.0f, 12.0f);
                    er1 er1VarC2 = ws.c(j9.f, false);
                    int iHashCode5 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL5 = ov0Var2.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var2, dv1VarE3);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, er1VarC2);
                    q73.h(ov0Var2, ghVar2, l72VarL5);
                    az2.s(iHashCode5, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH5);
                    dv1 dv1VarE4 = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA2 = jk2.a(goVar, orVar, ov0Var2, 48);
                    int iHashCode6 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL6 = ov0Var2.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var2, dv1VarE4);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar, kk2VarA2);
                    q73.h(ov0Var2, ghVar2, l72VarL6);
                    az2.s(iHashCode6, ov0Var2, ghVar3, ov0Var2, waVar);
                    q73.h(ov0Var2, ghVar4, dv1VarH6);
                    String str2 = (String) ey1Var2.getValue();
                    long jC3 = v63.c(15);
                    long j4 = ((kz) ov0Var2.j(cd2Var)).q;
                    jr0 jr0Var2 = jr0.h;
                    q93 q93Var = new q93(j4, jC3, jr0Var2, 0L, 0L, 0, 0L, 16777208);
                    n91 n91Var = new n91(0, 7, 119);
                    boolean zF = ov0Var2.f(lu0Var);
                    Object objQ = ov0Var2.Q();
                    Object obj9 = d30.a;
                    if (zF || objQ == obj9) {
                        ey1Var = ey1Var2;
                        objQ = new jl1(13, lu0Var, ey1Var);
                        ov0Var2.m0(objQ);
                    } else {
                        ey1Var = ey1Var2;
                    }
                    m91 m91Var = new m91((lu0) objQ, null, null, 62);
                    dv1 dv1VarP = ks.P(lk2.a(lk2Var, av1Var, 1.0f), vp0Var);
                    Object objQ2 = ov0Var2.Q();
                    if (objQ2 == obj9) {
                        objQ2 = new vu1(ey1Var, 13);
                        ov0Var2.m0(objQ2);
                    }
                    ey1 ey1Var3 = ey1Var;
                    xq.a(str2, (lu0) objQ2, dv1VarP, false, q93Var, n91Var, m91Var, true, 0, 0, null, null, null, null, sb.a0(-1730129736, new kl2(0, j3, ey1Var), ov0Var2), ov0Var2, 102236208, 196608, 32280);
                    ov0 ov0Var3 = ov0Var2;
                    if (((String) ey1Var3.getValue()).length() > 0) {
                        ov0Var3.c0(-1600902878);
                        Object objQ3 = ov0Var3.Q();
                        if (objQ3 == obj9) {
                            objQ3 = new xj2(ey1Var3, 7);
                            ov0Var3.m0(objQ3);
                        }
                        xq1.l((au0) objQ3, iw2.k(av1Var, 24.0f), false, null, null, sb.a0(-1778515652, new p80(4, j3), ov0Var3), ov0Var3, 1572918, 60);
                        ov0Var = ov0Var3;
                        r15 = 0;
                    } else {
                        r15 = 0;
                        ov0Var3.c0(-1607296659);
                        ov0Var = ov0Var3;
                    }
                    ov0Var.p(r15);
                    ov0Var.p(true);
                    ov0Var.p(true);
                    dv1 dv1VarE5 = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA3 = jk2.a(new jo(10.0f, true, new fo(r15)), orVar, ov0Var, 54);
                    int iHashCode7 = Long.hashCode(ov0Var.T);
                    l72 l72VarL7 = ov0Var.l();
                    dv1 dv1VarH7 = xp1.H(ov0Var, dv1VarE5);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, kk2VarA3);
                    q73.h(ov0Var, ghVar2, l72VarL7);
                    az2.s(iHashCode7, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH7);
                    dv1 dv1VarA2 = bk.a(xp1.k(xp1.n(iw2.g(lk2.a(lk2Var, av1Var, 1.0f), 44.0f), cj2.a(r11)), z ? hz.c(0.08f, hz.c) : hz.c(0.05f, hz.b), iy0Var), au0Var);
                    er1 er1VarC3 = ws.c(prVar, false);
                    int iHashCode8 = Long.hashCode(ov0Var.T);
                    l72 l72VarL8 = ov0Var.l();
                    dv1 dv1VarH8 = xp1.H(ov0Var, dv1VarA2);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, er1VarC3);
                    q73.h(ov0Var, ghVar2, l72VarL8);
                    az2.s(iHashCode8, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH8);
                    ov0 ov0Var4 = ov0Var;
                    s83.b(ke0.N(2131624085, ov0Var), null, hz.c(0.7f, ((kz) ov0Var.j(cd2Var)).q), v63.c(14), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597440, 0, 262058);
                    ov0Var4.p(true);
                    boolean z2 = !l13.k0((String) r0.getValue());
                    bj2 bj2VarA = cj2.a(14.0f);
                    b52 b52Var = hu.a;
                    gu guVarA = hu.a(bk.g, 0L, z ? hz.c(0.1f, hz.c) : hz.c(0.08f, hz.b), hz.c(0.35f, ((kz) ov0Var4.j(cd2Var)).q), ov0Var4, 2);
                    dv1 dv1VarG = iw2.g(lk2.a(lk2Var, av1Var, 1.0f), 44.0f);
                    boolean zF2 = ov0Var4.f(lu0Var);
                    Object objQ4 = ov0Var4.Q();
                    if (zF2 || objQ4 == obj9) {
                        objQ4 = new y60(lu0Var, ey1Var3, 4);
                        ov0Var4.m0(objQ4);
                    }
                    n51.a((au0) objQ4, dv1VarG, z2, bj2VarA, guVarA, null, null, null, am1.w, ov0Var4, 805306368, 480);
                    ov0Var4.p(true);
                    ov0Var4.p(true);
                }
                break;
            default:
                CloudAccountState cloudAccountState = (CloudAccountState) obj8;
                SyncSelection syncSelection = (SyncSelection) obj7;
                CloudAccount cloudAccount = (CloudAccount) obj6;
                AccountSyncManager accountSyncManager = (AccountSyncManager) obj5;
                s03 s03Var = (s03) obj4;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var5 = (ov0) f30Var2;
                if (!ov0Var5.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var5.W();
                } else {
                    sb.C(null, null, ym3.t(this.f, 0L, ov0Var5, 0, 14), null, sb.a0(-307319231, new x60(cloudAccountState, this.g, syncSelection, cloudAccount, accountSyncManager, s03Var), ov0Var5), ov0Var5, 196608, 27);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ jl2(boolean z, String str, long j, lu0 lu0Var, vp0 vp0Var, ey1 ey1Var, au0 au0Var) {
        this.g = z;
        this.h = str;
        this.f = j;
        this.i = lu0Var;
        this.j = vp0Var;
        this.k = ey1Var;
        this.l = au0Var;
    }
}
