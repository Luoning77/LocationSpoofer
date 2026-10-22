package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.ContributionStatus;
import com.vincenthzr.locationspoofer.data.cloud.RewardDevice;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class b3 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ b3(ey1 ey1Var, ey1 ey1Var2, ul1 ul1Var, lr2 lr2Var, lu0 lu0Var) {
        this.e = 2;
        this.g = ey1Var;
        this.h = ey1Var2;
        this.f = ul1Var;
        this.i = lr2Var;
        this.j = lu0Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        List<RewardDevice> devices;
        boolean z2;
        GithubRelease githubRelease;
        c30 c30Var;
        int i = this.e;
        av1 av1Var = av1.a;
        c30 c30Var2 = d30.a;
        mf3 mf3Var = mf3.a;
        Object obj4 = this.h;
        Object obj5 = this.j;
        Object obj6 = this.g;
        Object obj7 = this.i;
        Object obj8 = this.f;
        switch (i) {
            case 0:
                ContributionStatus contributionStatus = (ContributionStatus) obj8;
                ey1 ey1Var = (ey1) obj6;
                ey1 ey1Var2 = (ey1) obj4;
                ey1 ey1Var3 = (ey1) obj7;
                ey1 ey1Var4 = (ey1) obj5;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    Object objQ = ov0Var.Q();
                    if (objQ == c30Var2) {
                        objQ = new h2(ey1Var, ey1Var2, 2);
                        ov0Var.m0(objQ);
                    }
                    au0 au0Var = (au0) objQ;
                    if (xq1.p(ey1Var3) || contributionStatus.getAvailablePoints() < 100 || ((devices = contributionStatus.getDevices()) != null && devices.isEmpty())) {
                        z = false;
                    } else {
                        Iterator<T> it = devices.iterator();
                        while (it.hasNext()) {
                            if (o51.f(((RewardDevice) it.next()).getId(), (String) ey1Var4.getValue())) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    n51.a(au0Var, null, z, null, xq1.z(ov0Var), null, null, null, ks.u, ov0Var, 805306374, 490);
                }
                break;
            case 1:
                String str = (String) obj8;
                au0 au0Var2 = (au0) obj6;
                String str2 = (String) obj4;
                au0 au0Var3 = (au0) obj7;
                String str3 = (String) obj5;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    s83.b(str, null, ((kz) ov0Var2.j(mz.a)).s, 0L, null, null, 0L, null, new m53(3), 0L, 0, false, 0, 0, ((je3) ov0Var2.j(le3.a)).k, ov0Var2, 0, 0, 130042);
                    n51.a(au0Var2, iw2.h(iw2.e(av1Var, 1.0f), 52.0f, 0.0f, 2), false, cj2.a(14.0f), null, null, null, null, sb.a0(1609169350, new w2(str3, 2), ov0Var2), ov0Var2, 805306416, 500);
                    if (str2 != null) {
                        ov0Var2.c0(-1565405264);
                        n51.j(au0Var3, iw2.e(av1Var, 1.0f), false, null, null, null, sb.a0(636468062, new w2(str2, 3), ov0Var2), ov0Var2, 805306416, 508);
                        z2 = false;
                    } else {
                        z2 = false;
                        ov0Var2.c0(-1284221268);
                    }
                    ov0Var2.p(z2);
                }
                break;
            case 2:
                ey1 ey1Var5 = (ey1) obj6;
                ey1 ey1Var6 = (ey1) obj4;
                ul1 ul1Var = (ul1) obj8;
                lr2 lr2Var = (lr2) obj7;
                lu0 lu0Var = (lu0) obj5;
                f30 f30Var3 = (f30) obj2;
                ((Integer) obj3).getClass();
                ((mi) obj).getClass();
                bj2 bj2VarA = cj2.a(16.0f);
                ov0 ov0Var3 = (ov0) f30Var3;
                aw awVarT = ym3.t(((kz) ov0Var3.j(mz.a)).p, 0L, f30Var3, 0, 14);
                cw cwVarU = ym3.u(62, 6.0f);
                dv1 dv1VarE = zm3.E(iw2.e(av1Var, 1.0f), 14.0f, 8.0f);
                Object objQ2 = ov0Var3.Q();
                if (objQ2 == c30Var2) {
                    objQ2 = new di0(ey1Var5, 22);
                    ov0Var3.m0(objQ2);
                }
                sb.C(k22.G(dv1VarE, (lu0) objQ2), bj2VarA, awVarT, cwVarU, sb.a0(773857797, new oc1(ey1Var6, ul1Var, lr2Var, lu0Var), ov0Var3), ov0Var3, 196614, 16);
                break;
            case 3:
                GithubRelease githubRelease2 = (GithubRelease) obj8;
                String str4 = (String) obj6;
                lu0 lu0Var2 = (lu0) obj4;
                au0 au0Var4 = (au0) obj7;
                au0 au0Var5 = (au0) obj5;
                f30 f30Var4 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ov0Var4.W();
                } else {
                    dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                    yz yzVarA = wz.a(new jo(14.0f, true, new fo(0)), j9.r, ov0Var4, 6);
                    int iHashCode = Long.hashCode(ov0Var4.T);
                    l72 l72VarL = ov0Var4.l();
                    dv1 dv1VarH = xp1.H(ov0Var4, dv1VarE2);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var);
                    } else {
                        ov0Var4.p0();
                    }
                    gh ghVar = v20.e;
                    q73.h(ov0Var4, ghVar, yzVarA);
                    gh ghVar2 = v20.d;
                    q73.h(ov0Var4, ghVar2, l72VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    gh ghVar3 = v20.f;
                    q73.h(ov0Var4, ghVar3, numValueOf);
                    wa waVar = v20.g;
                    q73.g(ov0Var4, waVar);
                    gh ghVar4 = v20.c;
                    q73.h(ov0Var4, ghVar4, dv1VarH);
                    dv1 dv1VarE3 = iw2.e(av1Var, 1.0f);
                    or orVar = j9.p;
                    u92 u92Var = am1.i;
                    kk2 kk2VarA = jk2.a(u92Var, orVar, ov0Var4, 54);
                    int iHashCode2 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL2 = ov0Var4.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var4, dv1VarE3);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar, kk2VarA);
                    q73.h(ov0Var4, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var4, ghVar3, ov0Var4, waVar);
                    q73.h(ov0Var4, ghVar4, dv1VarH2);
                    kk2 kk2VarA2 = jk2.a(new jo(8.0f, true, new fo(0)), orVar, ov0Var4, 54);
                    int iHashCode3 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL3 = ov0Var4.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var4, av1Var);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar, kk2VarA2);
                    q73.h(ov0Var4, ghVar2, l72VarL3);
                    az2.s(iHashCode3, ov0Var4, ghVar3, ov0Var4, waVar);
                    q73.h(ov0Var4, ghVar4, dv1VarH3);
                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 9.0f), cj2.a);
                    long jD = xp1.d(4293212469L);
                    iy0 iy0Var = o51.p0;
                    ws.a(xp1.k(dv1VarN, jD, iy0Var), ov0Var4, 0);
                    String strN = ke0.N(2131624788, ov0Var4);
                    long jC = v63.c(18);
                    jr0 jr0Var = jr0.j;
                    hh0 hh0Var = mz.a;
                    s83.b(strN, null, ((kz) ov0Var4.j(hh0Var)).q, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597440, 0, 262058);
                    ov0Var4.p(true);
                    kk2 kk2VarA3 = jk2.a(new jo(6.0f, true, new fo(0)), j9.o, ov0Var4, 6);
                    int iHashCode4 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL4 = ov0Var4.l();
                    dv1 dv1VarH4 = xp1.H(ov0Var4, av1Var);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar, kk2VarA3);
                    q73.h(ov0Var4, ghVar2, l72VarL4);
                    az2.s(iHashCode4, ov0Var4, ghVar3, ov0Var4, waVar);
                    q73.h(ov0Var4, ghVar4, dv1VarH4);
                    ks.H(null, ov0Var4, 0);
                    dv1 dv1VarN2 = xp1.n(av1Var, cj2.a(8.0f));
                    long j = bk.g;
                    dv1 dv1VarE4 = zm3.E(xp1.k(dv1VarN2, hz.c(0.12f, j), iy0Var), 8.0f, 4.0f);
                    pr prVar = j9.f;
                    er1 er1VarC = ws.c(prVar, false);
                    int iHashCode5 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL5 = ov0Var4.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var4, dv1VarE4);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar, er1VarC);
                    q73.h(ov0Var4, ghVar2, l72VarL5);
                    az2.s(iHashCode5, ov0Var4, ghVar3, ov0Var4, waVar);
                    q73.h(ov0Var4, ghVar4, dv1VarH5);
                    s83.b("v" + str4, null, j, v63.b(12.5d), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597824, 0, 262058);
                    ov0Var4.p(true);
                    ov0Var4.p(true);
                    ov0Var4.p(true);
                    ld0.g(null, 0.0f, hz.c(0.06f, ((kz) ov0Var4.j(hh0Var)).q), ov0Var4, 0);
                    if (l13.k0(githubRelease2.getBody())) {
                        githubRelease = githubRelease2;
                        c30Var = c30Var2;
                        ov0Var4.c0(-1549795415);
                        s83.b(ke0.N(2131624790, ov0Var4), null, hz.c(0.7f, ((kz) ov0Var4.j(hh0Var)).q), v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262122);
                        ov0Var4 = ov0Var4;
                        ov0Var4.p(false);
                    } else {
                        ov0Var4.c0(-1550221324);
                        dv1 dv1VarH6 = iw2.h(av1Var, 0.0f, 260.0f, 1);
                        er1 er1VarC2 = ws.c(prVar, false);
                        int iHashCode6 = Long.hashCode(ov0Var4.T);
                        l72 l72VarL6 = ov0Var4.l();
                        dv1 dv1VarH7 = xp1.H(ov0Var4, dv1VarH6);
                        ov0Var4.g0();
                        if (ov0Var4.S) {
                            ov0Var4.k(x30Var);
                        } else {
                            ov0Var4.p0();
                        }
                        q73.h(ov0Var4, ghVar, er1VarC2);
                        q73.h(ov0Var4, ghVar2, l72VarL6);
                        az2.s(iHashCode6, ov0Var4, ghVar3, ov0Var4, waVar);
                        q73.h(ov0Var4, ghVar4, dv1VarH7);
                        jo joVar = new jo(4.0f, true, new fo(0));
                        githubRelease = githubRelease2;
                        boolean zH = ov0Var4.h(githubRelease);
                        Object objQ3 = ov0Var4.Q();
                        c30Var = c30Var2;
                        if (zH || objQ3 == c30Var) {
                            objQ3 = new ge2(githubRelease, 15);
                            ov0Var4.m0(objQ3);
                        }
                        ke0.d(null, null, null, joVar, null, null, false, null, (lu0) objQ3, ov0Var4, 24576, 495);
                        ov0Var4.p(true);
                        ov0Var4.p(false);
                    }
                    ov0 ov0Var5 = ov0Var4;
                    ld0.g(null, 0.0f, hz.c(0.06f, ((kz) ov0Var4.j(hh0Var)).q), ov0Var5, 0);
                    dv1 dv1VarE5 = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA4 = jk2.a(u92Var, orVar, ov0Var5, 54);
                    c30 c30Var3 = c30Var;
                    int iHashCode7 = Long.hashCode(ov0Var5.T);
                    l72 l72VarL7 = ov0Var5.l();
                    dv1 dv1VarH8 = xp1.H(ov0Var5, dv1VarE5);
                    ov0Var5.g0();
                    if (ov0Var5.S) {
                        ov0Var5.k(x30Var);
                    } else {
                        ov0Var5.p0();
                    }
                    q73.h(ov0Var5, ghVar, kk2VarA4);
                    q73.h(ov0Var5, ghVar2, l72VarL7);
                    az2.s(iHashCode7, ov0Var5, ghVar3, ov0Var5, waVar);
                    q73.h(ov0Var5, ghVar4, dv1VarH8);
                    String strN2 = ke0.N(2131624549, ov0Var5);
                    long jB = v63.b(12.5d);
                    long jC2 = hz.c(0.45f, ((kz) ov0Var5.j(hh0Var)).q);
                    boolean zF = ov0Var5.f(lu0Var2) | ov0Var5.h(githubRelease) | ov0Var5.f(au0Var4);
                    Object objQ4 = ov0Var5.Q();
                    if (zF || objQ4 == c30Var3) {
                        objQ4 = new a6(lu0Var2, githubRelease, au0Var4, 17);
                        ov0Var5.m0(objQ4);
                    }
                    s83.b(strN2, bk.a(av1Var, (au0) objQ4), jC2, jB, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262120);
                    kk2 kk2VarA5 = jk2.a(new jo(8.0f, true, new fo(0)), orVar, ov0Var5, 54);
                    int iHashCode8 = Long.hashCode(ov0Var5.T);
                    l72 l72VarL8 = ov0Var5.l();
                    dv1 dv1VarH9 = xp1.H(ov0Var5, av1Var);
                    ov0Var5.g0();
                    if (ov0Var5.S) {
                        ov0Var5.k(x30Var);
                    } else {
                        ov0Var5.p0();
                    }
                    q73.h(ov0Var5, ghVar, kk2VarA5);
                    q73.h(ov0Var5, ghVar2, l72VarL8);
                    az2.s(iHashCode8, ov0Var5, ghVar3, ov0Var5, waVar);
                    q73.h(ov0Var5, ghVar4, dv1VarH9);
                    n51.j(au0Var4, null, false, cj2.a(10.0f), null, null, ks.H, ov0Var5, 805306368, 502);
                    boolean zF2 = ov0Var5.f(au0Var4) | ov0Var5.f(au0Var5);
                    Object objQ5 = ov0Var5.Q();
                    if (zF2 || objQ5 == c30Var3) {
                        objQ5 = new qi2(11, au0Var4, au0Var5);
                        ov0Var5.m0(objQ5);
                    }
                    n51.a((au0) objQ5, null, false, cj2.a(10.0f), hu.a(j, 0L, 0L, 0L, ov0Var5, 14), null, null, new b52(16.0f, 8.0f, 16.0f, 8.0f), ks.I, ov0Var5, 817889280, 358);
                    ov0Var5.p(true);
                    ov0Var5.p(true);
                    ov0Var5.p(true);
                }
                break;
            default:
                GithubRelease githubRelease3 = (GithubRelease) obj8;
                List list = (List) obj7;
                ey1 ey1Var7 = (ey1) obj6;
                xg3 xg3Var = (xg3) obj5;
                ey1 ey1Var8 = (ey1) obj4;
                f30 f30Var5 = (f30) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var6 = (ov0) f30Var5;
                if (!ov0Var6.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ov0Var6.W();
                } else {
                    long j2 = ((og3) ey1Var8.getValue()).h;
                    boolean z3 = ((og3) ey1Var8.getValue()).g == 2 || ((og3) ey1Var8.getValue()).k;
                    boolean zF3 = ov0Var6.f(ey1Var7);
                    Object objQ6 = ov0Var6.Q();
                    if (zF3 || objQ6 == c30Var2) {
                        objQ6 = new vu1(ey1Var7, 21);
                        ov0Var6.m0(objQ6);
                    }
                    lu0 lu0Var3 = (lu0) objQ6;
                    boolean zH2 = ov0Var6.h(xg3Var);
                    Object objQ7 = ov0Var6.Q();
                    if (zH2 || objQ7 == c30Var2) {
                        objQ7 = new jg3(xg3Var, 1);
                        ov0Var6.m0(objQ7);
                    }
                    h73.h(githubRelease3, list, j2, z3, lu0Var3, (pu0) objQ7, ov0Var6, 0);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ b3(GithubRelease githubRelease, List list, ey1 ey1Var, xg3 xg3Var, ey1 ey1Var2) {
        this.e = 4;
        this.f = githubRelease;
        this.i = list;
        this.g = ey1Var;
        this.j = xg3Var;
        this.h = ey1Var2;
    }

    public /* synthetic */ b3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
    }
}
