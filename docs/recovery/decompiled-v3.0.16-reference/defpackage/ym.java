package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ym implements qu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ym(au0 au0Var, boolean z, boolean z2, lu0 lu0Var) {
        this.h = au0Var;
        this.f = z;
        this.g = z2;
        this.i = lu0Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        long jC;
        long j;
        float f;
        x30 x30Var;
        boolean z3;
        boolean z4;
        long j2;
        float f2;
        int i = this.e;
        boolean z5 = this.f;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        int i2 = 10;
        Object obj4 = this.h;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                AppInfoItem appInfoItem = (AppInfoItem) obj4;
                String str = (String) obj5;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pr prVar = j9.f;
                ((zz) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    or orVar = j9.p;
                    kk2 kk2VarA = jk2.a(am1.e, orVar, ov0Var, 48);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1VarE);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    gh ghVar = v20.e;
                    q73.h(ov0Var, ghVar, kk2VarA);
                    gh ghVar2 = v20.d;
                    q73.h(ov0Var, ghVar2, l72VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    gh ghVar3 = v20.f;
                    q73.h(ov0Var, ghVar3, numValueOf);
                    wa waVar = v20.g;
                    q73.g(ov0Var, waVar);
                    gh ghVar4 = v20.c;
                    q73.h(ov0Var, ghVar4, dv1VarH);
                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 46.0f), cj2.a(13.0f));
                    long jC2 = z5 ? hz.c(0.05f, hz.c) : hz.c(0.03f, hz.b);
                    iy0 iy0Var = o51.p0;
                    dv1 dv1VarK = xp1.k(dv1VarN, jC2, iy0Var);
                    er1 er1VarC = ws.c(j9.j, false);
                    int iHashCode2 = Long.hashCode(ov0Var.T);
                    l72 l72VarL2 = ov0Var.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarK);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, er1VarC);
                    q73.h(ov0Var, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH2);
                    ks.C(appInfoItem.getPackageName(), iw2.k(av1Var, 38.0f), ov0Var, 48);
                    ov0Var.p(true);
                    gh0.h(ov0Var, iw2.o(av1Var, 14.0f));
                    wb1 wb1Var = new wb1(1.0f, true);
                    yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
                    int iHashCode3 = Long.hashCode(ov0Var.T);
                    l72 l72VarL3 = ov0Var.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var, wb1Var);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, yzVarA);
                    q73.h(ov0Var, ghVar2, l72VarL3);
                    az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH3);
                    kk2 kk2VarA2 = jk2.a(new jo(6.0f, true, new fo(0)), orVar, ov0Var, 54);
                    int iHashCode4 = Long.hashCode(ov0Var.T);
                    l72 l72VarL4 = ov0Var.l();
                    dv1 dv1VarH4 = xp1.H(ov0Var, av1Var);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, kk2VarA2);
                    q73.h(ov0Var, ghVar2, l72VarL4);
                    az2.s(iHashCode4, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH4);
                    String appName = appInfoItem.getAppName();
                    long jC3 = v63.c(15);
                    jr0 jr0Var = jr0.j;
                    hh0 hh0Var = mz.a;
                    s83.b(appName, null, ((kz) ov0Var.j(hh0Var)).q, jC3, jr0Var, null, 0L, null, null, 0L, 2, false, 1, 0, null, ov0Var, 1597440, 24960, 241578);
                    jr0 jr0Var2 = jr0Var;
                    if (appInfoItem.isSystem()) {
                        ov0Var.c0(1297832954);
                        dv1 dv1VarN2 = xp1.n(av1Var, cj2.a(4.0f));
                        if (z5) {
                            j = hz.c;
                            f = 0.08f;
                        } else {
                            j = hz.b;
                            f = 0.05f;
                        }
                        dv1 dv1VarE2 = zm3.E(xp1.k(dv1VarN2, hz.c(f, j), iy0Var), 5.0f, 1.0f);
                        er1 er1VarC2 = ws.c(prVar, false);
                        int iHashCode5 = Long.hashCode(ov0Var.T);
                        l72 l72VarL5 = ov0Var.l();
                        dv1 dv1VarH5 = xp1.H(ov0Var, dv1VarE2);
                        ov0Var.g0();
                        if (ov0Var.S) {
                            ov0Var.k(x30Var2);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar, er1VarC2);
                        q73.h(ov0Var, ghVar2, l72VarL5);
                        az2.s(iHashCode5, ov0Var, ghVar3, ov0Var, waVar);
                        q73.h(ov0Var, ghVar4, dv1VarH5);
                        s83.b(ke0.N(2131625098, ov0Var), null, hz.c(0.5f, ((kz) ov0Var.j(hh0Var)).q), v63.c(10), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                        z = true;
                        ov0Var.p(true);
                        z2 = false;
                    } else {
                        jr0Var2 = jr0Var2;
                        av1Var = av1Var;
                        z = true;
                        z2 = false;
                        ov0Var.c0(1280433584);
                    }
                    ov0Var.p(z2);
                    ov0Var.p(z);
                    gh0.h(ov0Var, iw2.g(av1Var, 3.0f));
                    s83.b(appInfoItem.getPackageName(), null, hz.c(0.45f, ((kz) ov0Var.j(hh0Var)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ov0Var, 24576, 24960, 241642);
                    ov0Var.p(true);
                    gh0.h(ov0Var, iw2.o(av1Var, 8.0f));
                    kk2 kk2VarA3 = jk2.a(new jo(6.0f, true, new fo(0)), orVar, ov0Var, 54);
                    int iHashCode6 = Long.hashCode(ov0Var.T);
                    l72 l72VarL6 = ov0Var.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var, av1Var);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, kk2VarA3);
                    q73.h(ov0Var, ghVar2, l72VarL6);
                    az2.s(iHashCode6, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH6);
                    dv1 dv1VarN3 = xp1.n(av1Var, cj2.a(8.0f));
                    boolean z6 = this.g;
                    dv1 dv1VarE3 = zm3.E(xp1.k(dv1VarN3, z6 ? hz.c(0.12f, bk.g) : z5 ? hz.c(0.06f, hz.c) : hz.c(0.04f, hz.b), iy0Var), 8.0f, 4.0f);
                    er1 er1VarC3 = ws.c(prVar, false);
                    int iHashCode7 = Long.hashCode(ov0Var.T);
                    l72 l72VarL7 = ov0Var.l();
                    dv1 dv1VarH7 = xp1.H(ov0Var, dv1VarE3);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, er1VarC3);
                    q73.h(ov0Var, ghVar2, l72VarL7);
                    az2.s(iHashCode7, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH7);
                    long jB = v63.b(11.5d);
                    if (z6) {
                        ov0Var.c0(1050598892);
                        ov0Var.p(false);
                        jC = bk.g;
                    } else {
                        ov0Var.c0(1050600618);
                        jC = hz.c(0.6f, ((kz) ov0Var.j(hh0Var)).q);
                        ov0Var.p(false);
                    }
                    s83.b(str, null, jC, jB, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                    ov0Var.p(true);
                    t01.a(sb.S(), null, iw2.k(av1Var, 16.0f), hz.c(0.3f, ((kz) ov0Var.j(hh0Var)).q), ov0Var, 432, 0);
                    ov0Var.p(true);
                    ov0Var.p(true);
                }
                break;
            case 1:
                au0 au0Var = (au0) obj4;
                lu0 lu0Var = (lu0) obj5;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    dv1 dv1VarA = gs2.a(iw2.e(av1Var, 1.0f), false, new ym2(i2));
                    yz yzVarA2 = wz.a(new jo(12.0f, true, new fo(0)), j9.r, ov0Var2, 6);
                    int iHashCode8 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL8 = ov0Var2.l();
                    dv1 dv1VarH8 = xp1.H(ov0Var2, dv1VarA);
                    w20.b.getClass();
                    x30 x30Var3 = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var3);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, v20.e, yzVarA2);
                    q73.h(ov0Var2, v20.d, l72VarL8);
                    q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode8));
                    q73.g(ov0Var2, v20.g);
                    q73.h(ov0Var2, v20.c, dv1VarH8);
                    String strN = ke0.N(2131624933, ov0Var2);
                    x01 x01VarX = vd0.x();
                    boolean z7 = this.f;
                    boolean z8 = !z7;
                    boolean z9 = !this.g;
                    boolean zF = ov0Var2.f(lu0Var);
                    Object objQ = ov0Var2.Q();
                    c30 c30Var = d30.a;
                    if (zF || objQ == c30Var) {
                        objQ = new hl1(7, lu0Var);
                        ov0Var2.m0(objQ);
                    }
                    ke0.i(strN, x01VarX, z8, z9, (au0) objQ, ov0Var2, 0);
                    ov0Var2.c0(-1821364420);
                    String strN2 = ke0.N(2131624683, ov0Var2);
                    x01 x01VarX2 = ld0.x();
                    boolean zF2 = ov0Var2.f(lu0Var);
                    Object objQ2 = ov0Var2.Q();
                    if (zF2 || objQ2 == c30Var) {
                        objQ2 = new hl1(8, lu0Var);
                        ov0Var2.m0(objQ2);
                    }
                    ke0.i(strN2, x01VarX2, z7, z9, (au0) objQ2, ov0Var2, 0);
                    ov0Var2.p(false);
                    ov0Var2.p(true);
                    n51.j(au0Var, null, false, null, null, null, xp1.g, ov0Var2, 805306368, 510);
                }
                break;
            case 2:
                GithubRelease githubRelease = (GithubRelease) obj4;
                au0 au0Var2 = (au0) obj5;
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ov0Var3.W();
                } else {
                    String versionName = githubRelease != null ? githubRelease.getVersionName() : null;
                    boolean z10 = this.g;
                    ym3.o(this.f, z10, z10 ? versionName : null, au0Var2, ov0Var3, 0);
                }
                break;
            default:
                lu0 lu0Var2 = (lu0) obj5;
                AppInfoItem appInfoItem2 = (AppInfoItem) obj4;
                f30 f30Var4 = (f30) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ov0Var4.W();
                } else {
                    dv1 dv1VarE4 = iw2.e(av1Var, 1.0f);
                    or orVar2 = j9.p;
                    kk2 kk2VarA4 = jk2.a(am1.e, orVar2, ov0Var4, 48);
                    int iHashCode9 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL9 = ov0Var4.l();
                    dv1 dv1VarH9 = xp1.H(ov0Var4, dv1VarE4);
                    w20.b.getClass();
                    x30 x30Var4 = v20.b;
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var4);
                    } else {
                        ov0Var4.p0();
                    }
                    gh ghVar5 = v20.e;
                    q73.h(ov0Var4, ghVar5, kk2VarA4);
                    gh ghVar6 = v20.d;
                    q73.h(ov0Var4, ghVar6, l72VarL9);
                    Integer numValueOf2 = Integer.valueOf(iHashCode9);
                    gh ghVar7 = v20.f;
                    q73.h(ov0Var4, ghVar7, numValueOf2);
                    wa waVar2 = v20.g;
                    q73.g(ov0Var4, waVar2);
                    gh ghVar8 = v20.c;
                    q73.h(ov0Var4, ghVar8, dv1VarH9);
                    dv1 dv1VarN4 = xp1.n(iw2.k(av1Var, 46.0f), cj2.a(13.0f));
                    long jC4 = z5 ? hz.c(0.05f, hz.c) : hz.c(0.03f, hz.b);
                    iy0 iy0Var2 = o51.p0;
                    dv1 dv1VarK2 = xp1.k(dv1VarN4, jC4, iy0Var2);
                    er1 er1VarC4 = ws.c(j9.j, false);
                    int iHashCode10 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL10 = ov0Var4.l();
                    dv1 dv1VarH10 = xp1.H(ov0Var4, dv1VarK2);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        x30Var = x30Var4;
                        ov0Var4.k(x30Var);
                    } else {
                        x30Var = x30Var4;
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar5, er1VarC4);
                    q73.h(ov0Var4, ghVar6, l72VarL10);
                    az2.s(iHashCode10, ov0Var4, ghVar7, ov0Var4, waVar2);
                    q73.h(ov0Var4, ghVar8, dv1VarH10);
                    ks.C(appInfoItem2.getPackageName(), iw2.k(av1Var, 38.0f), ov0Var4, 48);
                    ov0Var4.p(true);
                    gh0.h(ov0Var4, iw2.o(av1Var, 14.0f));
                    wb1 wb1Var2 = new wb1(1.0f, true);
                    yz yzVarA3 = wz.a(am1.g, j9.r, ov0Var4, 0);
                    int iHashCode11 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL11 = ov0Var4.l();
                    dv1 dv1VarH11 = xp1.H(ov0Var4, wb1Var2);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar5, yzVarA3);
                    q73.h(ov0Var4, ghVar6, l72VarL11);
                    az2.s(iHashCode11, ov0Var4, ghVar7, ov0Var4, waVar2);
                    q73.h(ov0Var4, ghVar8, dv1VarH11);
                    kk2 kk2VarA5 = jk2.a(new jo(6.0f, true, new fo(0)), orVar2, ov0Var4, 54);
                    int iHashCode12 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL12 = ov0Var4.l();
                    dv1 dv1VarH12 = xp1.H(ov0Var4, av1Var);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar5, kk2VarA5);
                    q73.h(ov0Var4, ghVar6, l72VarL12);
                    az2.s(iHashCode12, ov0Var4, ghVar7, ov0Var4, waVar2);
                    q73.h(ov0Var4, ghVar8, dv1VarH12);
                    String appName2 = appInfoItem2.getAppName();
                    long jC5 = v63.c(15);
                    jr0 jr0Var3 = jr0.j;
                    hh0 hh0Var2 = mz.a;
                    s83.b(appName2, null, ((kz) ov0Var4.j(hh0Var2)).q, jC5, jr0Var3, null, 0L, null, null, 0L, 2, false, 1, 0, null, ov0Var4, 1597440, 24960, 241578);
                    if (appInfoItem2.isSystem()) {
                        ov0Var4.c0(-831955759);
                        dv1 dv1VarN5 = xp1.n(av1Var, cj2.a(4.0f));
                        if (z5) {
                            j2 = hz.c;
                            f2 = 0.08f;
                        } else {
                            j2 = hz.b;
                            f2 = 0.05f;
                        }
                        dv1 dv1VarE5 = zm3.E(xp1.k(dv1VarN5, hz.c(f2, j2), iy0Var2), 5.0f, 1.0f);
                        er1 er1VarC5 = ws.c(j9.f, false);
                        int iHashCode13 = Long.hashCode(ov0Var4.T);
                        l72 l72VarL13 = ov0Var4.l();
                        dv1 dv1VarH13 = xp1.H(ov0Var4, dv1VarE5);
                        ov0Var4.g0();
                        if (ov0Var4.S) {
                            ov0Var4.k(x30Var);
                        } else {
                            ov0Var4.p0();
                        }
                        q73.h(ov0Var4, ghVar5, er1VarC5);
                        q73.h(ov0Var4, ghVar6, l72VarL13);
                        az2.s(iHashCode13, ov0Var4, ghVar7, ov0Var4, waVar2);
                        q73.h(ov0Var4, ghVar8, dv1VarH13);
                        s83.b(ke0.N(2131625098, ov0Var4), null, hz.c(0.5f, ((kz) ov0Var4.j(hh0Var2)).q), v63.c(10), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262122);
                        z3 = true;
                        ov0Var4.p(true);
                        z4 = false;
                    } else {
                        z3 = true;
                        z4 = false;
                        ov0Var4.c0(-858339673);
                    }
                    ov0Var4.p(z4);
                    ov0Var4.p(z3);
                    gh0.h(ov0Var4, iw2.g(av1Var, 3.0f));
                    s83.b(appInfoItem2.getPackageName(), null, hz.c(0.45f, ((kz) ov0Var4.j(hh0Var2)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ov0Var4, 24576, 24960, 241642);
                    az2.t(ov0Var4, true, av1Var, 8.0f, ov0Var4);
                    b43.a(this.g, lu0Var2, null, false, null, ov0Var4, 0, 124);
                    ov0Var4.p(true);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ ym(boolean z, AppInfoItem appInfoItem, boolean z2, String str) {
        this.f = z;
        this.h = appInfoItem;
        this.g = z2;
        this.i = str;
    }

    public /* synthetic */ ym(boolean z, boolean z2, lu0 lu0Var, AppInfoItem appInfoItem) {
        this.f = z;
        this.g = z2;
        this.i = lu0Var;
        this.h = appInfoItem;
    }

    public /* synthetic */ ym(boolean z, boolean z2, GithubRelease githubRelease, au0 au0Var) {
        this.f = z;
        this.g = z2;
        this.h = githubRelease;
        this.i = au0Var;
    }
}
