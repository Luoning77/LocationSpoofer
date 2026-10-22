package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.model.ImportExportCounts;
import com.vincenthzr.locationspoofer.data.model.ImportExportSelection;
import com.vincenthzr.locationspoofer.data.model.RootSetupTestResult;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class i11 implements qu0 {
    public final /* synthetic */ int e = 3;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ i11(RootSetupTestResult rootSetupTestResult, boolean z, ay ayVar, Context context, au0 au0Var) {
        this.h = rootSetupTestResult;
        this.f = z;
        this.g = ayVar;
        this.j = context;
        this.i = au0Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ey1 ey1Var;
        long j;
        float f;
        ey1 ey1Var2;
        long j2;
        float f2;
        int i;
        String strH;
        long j3;
        float f3;
        int i2 = this.e;
        mf3 mf3Var = mf3.a;
        lk2 lk2Var = lk2.a;
        av1 av1Var = av1.a;
        Object obj4 = this.i;
        Object obj5 = this.j;
        Object obj6 = this.g;
        boolean z = this.f;
        Object obj7 = this.h;
        switch (i2) {
            case 0:
                ImportExportCounts importExportCounts = (ImportExportCounts) obj7;
                ey1 ey1Var3 = (ey1) obj6;
                au0 au0Var = (au0) obj4;
                lu0 lu0Var = (lu0) obj5;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    dv1 dv1VarD = zm3.D(av1Var, 20.0f);
                    jo joVar = new jo(14.0f, true, new fo(0));
                    nr nrVar = j9.r;
                    yz yzVarA = wz.a(joVar, nrVar, ov0Var, 6);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1VarD);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    gh ghVar = v20.e;
                    q73.h(ov0Var, ghVar, yzVarA);
                    gh ghVar2 = v20.d;
                    q73.h(ov0Var, ghVar2, l72VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    gh ghVar3 = v20.f;
                    q73.h(ov0Var, ghVar3, numValueOf);
                    wa waVar = v20.g;
                    q73.g(ov0Var, waVar);
                    gh ghVar4 = v20.c;
                    q73.h(ov0Var, ghVar4, dv1VarH);
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
                    int iHashCode2 = Long.hashCode(ov0Var.T);
                    l72 l72VarL2 = ov0Var.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarE);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, kk2VarA);
                    q73.h(ov0Var, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH2);
                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 38.0f), cj2.a(12.0f));
                    long j4 = bk.g;
                    dv1 dv1VarK = xp1.k(dv1VarN, hz.c(0.12f, j4), o51.p0);
                    er1 er1VarC = ws.c(j9.j, false);
                    int iHashCode3 = Long.hashCode(ov0Var.T);
                    l72 l72VarL3 = ov0Var.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var, dv1VarK);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, er1VarC);
                    q73.h(ov0Var, ghVar2, l72VarL3);
                    az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH3);
                    t01.a(wc0.M(), null, iw2.k(av1Var, 20.0f), j4, ov0Var, 3504, 0);
                    az2.t(ov0Var, true, av1Var, 12.0f, ov0Var);
                    yz yzVarA2 = wz.a(am1.g, nrVar, ov0Var, 0);
                    int iHashCode4 = Long.hashCode(ov0Var.T);
                    l72 l72VarL4 = ov0Var.l();
                    dv1 dv1VarH4 = xp1.H(ov0Var, av1Var);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, yzVarA2);
                    q73.h(ov0Var, ghVar2, l72VarL4);
                    az2.s(iHashCode4, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH4);
                    String strN = ke0.N(z ? 2131624453 : 2131624557, ov0Var);
                    long jC = v63.c(18);
                    jr0 jr0Var = jr0.j;
                    hh0 hh0Var = mz.a;
                    s83.b(strN, null, ((kz) ov0Var.j(hh0Var)).q, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                    s83.b(ke0.N(z ? 2131624452 : 2131624556, ov0Var), null, hz.c(0.55f, ((kz) ov0Var.j(hh0Var)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                    ov0Var.p(true);
                    ov0Var.p(true);
                    dv1 dv1VarP = zm3.P(iw2.h(av1Var, 0.0f, 380.0f, 1), zm3.O(ov0Var), true);
                    yz yzVarA3 = wz.a(new jo(2.0f, true, new fo(0)), nrVar, ov0Var, 6);
                    int iHashCode5 = Long.hashCode(ov0Var.T);
                    l72 l72VarL5 = ov0Var.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var, dv1VarP);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, yzVarA3);
                    q73.h(ov0Var, ghVar2, l72VarL5);
                    az2.s(iHashCode5, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH5);
                    String strN2 = ke0.N(2131624088, ov0Var);
                    int locations = importExportCounts.getLocations();
                    boolean locations2 = ((ImportExportSelection) ey1Var3.getValue()).getLocations();
                    Object objQ = ov0Var.Q();
                    c30 c30Var = d30.a;
                    if (objQ == c30Var) {
                        ey1Var = ey1Var3;
                        objQ = new di0(ey1Var, 12);
                        ov0Var.m0(objQ);
                    } else {
                        ey1Var = ey1Var3;
                    }
                    hd0.k(strN2, locations, locations2, (lu0) objQ, false, ov0Var, 3072, 48);
                    String strN3 = ke0.N(2131624090, ov0Var);
                    int savedLocations = importExportCounts.getSavedLocations();
                    boolean savedLocations2 = ((ImportExportSelection) ey1Var.getValue()).getSavedLocations();
                    Object objQ2 = ov0Var.Q();
                    if (objQ2 == c30Var) {
                        objQ2 = new di0(ey1Var, 13);
                        ov0Var.m0(objQ2);
                    }
                    hd0.k(strN3, savedLocations, savedLocations2, (lu0) objQ2, false, ov0Var, 3072, 48);
                    String strN4 = ke0.N(2131624091, ov0Var);
                    int savedRoutes = importExportCounts.getSavedRoutes();
                    boolean savedRoutes2 = ((ImportExportSelection) ey1Var.getValue()).getSavedRoutes();
                    Object objQ3 = ov0Var.Q();
                    if (objQ3 == c30Var) {
                        objQ3 = new di0(ey1Var, 14);
                        ov0Var.m0(objQ3);
                    }
                    hd0.k(strN4, savedRoutes, savedRoutes2, (lu0) objQ3, false, ov0Var, 3072, 48);
                    String strN5 = ke0.N(2131624086, ov0Var);
                    int appCoordinateSystems = importExportCounts.getAppCoordinateSystems();
                    boolean appCoordinateSystems2 = ((ImportExportSelection) ey1Var.getValue()).getAppCoordinateSystems();
                    Object objQ4 = ov0Var.Q();
                    if (objQ4 == c30Var) {
                        objQ4 = new di0(ey1Var, 15);
                        ov0Var.m0(objQ4);
                    }
                    hd0.k(strN5, appCoordinateSystems, appCoordinateSystems2, (lu0) objQ4, false, ov0Var, 3072, 48);
                    String strN6 = ke0.N(2131624087, ov0Var);
                    int settings = importExportCounts.getSettings();
                    boolean settings2 = ((ImportExportSelection) ey1Var.getValue()).getSettings();
                    Object objQ5 = ov0Var.Q();
                    if (objQ5 == c30Var) {
                        objQ5 = new di0(ey1Var, 16);
                        ov0Var.m0(objQ5);
                    }
                    hd0.k(strN6, settings, settings2, (lu0) objQ5, false, ov0Var, 199680, 16);
                    ov0Var.p(true);
                    dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA2 = jk2.a(new jo(10.0f, true, new fo(0)), j9.o, ov0Var, 6);
                    int iHashCode6 = Long.hashCode(ov0Var.T);
                    l72 l72VarL6 = ov0Var.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var, dv1VarE2);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, kk2VarA2);
                    q73.h(ov0Var, ghVar2, l72VarL6);
                    az2.s(iHashCode6, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH6);
                    n51.h(au0Var, lk2.a(lk2Var, av1Var, 1.0f), false, cj2.a(12.0f), null, null, null, zm3.d, ov0Var, 805306368, 500);
                    boolean hasAny = ((ImportExportSelection) ey1Var.getValue()).getHasAny();
                    dv1 dv1VarA = lk2.a(lk2Var, av1Var, 1.2f);
                    bj2 bj2VarA = cj2.a(12.0f);
                    gu guVarA = hu.a(j4, 0L, 0L, 0L, ov0Var, 14);
                    boolean zF = ov0Var.f(lu0Var);
                    Object objQ6 = ov0Var.Q();
                    if (zF || objQ6 == c30Var) {
                        objQ6 = new y60(lu0Var, ey1Var, 2);
                        ov0Var.m0(objQ6);
                    }
                    n51.a((au0) objQ6, dv1VarA, hasAny, bj2VarA, guVarA, null, null, null, sb.a0(-1574116085, new z5(4, z), ov0Var), ov0Var, 805306368, 480);
                    ov0Var.p(true);
                    ov0Var.p(true);
                }
                break;
            case 1:
                String str = (String) obj7;
                lo1 lo1Var = (lo1) obj4;
                CompleteLocation completeLocation = (CompleteLocation) obj5;
                ey1 ey1Var4 = (ey1) obj6;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    dv1 dv1VarD2 = zm3.D(iw2.e(av1Var, 1.0f), 22.0f);
                    yz yzVarA4 = wz.a(new jo(14.0f, true, new fo(0)), j9.r, ov0Var2, 6);
                    int iHashCode7 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL7 = ov0Var2.l();
                    dv1 dv1VarH7 = xp1.H(ov0Var2, dv1VarD2);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    gh ghVar5 = v20.e;
                    q73.h(ov0Var2, ghVar5, yzVarA4);
                    gh ghVar6 = v20.d;
                    q73.h(ov0Var2, ghVar6, l72VarL7);
                    Integer numValueOf2 = Integer.valueOf(iHashCode7);
                    gh ghVar7 = v20.f;
                    q73.h(ov0Var2, ghVar7, numValueOf2);
                    wa waVar2 = v20.g;
                    q73.g(ov0Var2, waVar2);
                    gh ghVar8 = v20.c;
                    q73.h(ov0Var2, ghVar8, dv1VarH7);
                    or orVar = j9.p;
                    kk2 kk2VarA3 = jk2.a(new jo(10.0f, true, new fo(0)), orVar, ov0Var2, 54);
                    int iHashCode8 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL8 = ov0Var2.l();
                    dv1 dv1VarH8 = xp1.H(ov0Var2, av1Var);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar5, kk2VarA3);
                    q73.h(ov0Var2, ghVar6, l72VarL8);
                    az2.s(iHashCode8, ov0Var2, ghVar7, ov0Var2, waVar2);
                    q73.h(ov0Var2, ghVar8, dv1VarH8);
                    dv1 dv1VarN2 = xp1.n(iw2.k(av1Var, 40.0f), cj2.a(13.0f));
                    long jC2 = hz.c(0.12f, xp1.d(4293212469L));
                    iy0 iy0Var = o51.p0;
                    dv1 dv1VarK2 = xp1.k(dv1VarN2, jC2, iy0Var);
                    pr prVar = j9.j;
                    er1 er1VarC2 = ws.c(prVar, false);
                    int iHashCode9 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL9 = ov0Var2.l();
                    dv1 dv1VarH9 = xp1.H(ov0Var2, dv1VarK2);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar5, er1VarC2);
                    q73.h(ov0Var2, ghVar6, l72VarL9);
                    az2.s(iHashCode9, ov0Var2, ghVar7, ov0Var2, waVar2);
                    q73.h(ov0Var2, ghVar8, dv1VarH9);
                    t01.a(ji2.F(), null, iw2.k(av1Var, 22.0f), xp1.d(4293212469L), ov0Var2, 3504, 0);
                    ov0Var2.p(true);
                    String strN7 = ke0.N(2131624383, ov0Var2);
                    long jC3 = v63.c(18);
                    jr0 jr0Var2 = jr0.j;
                    hh0 hh0Var2 = mz.a;
                    s83.b(strN7, null, ((kz) ov0Var2.j(hh0Var2)).q, jC3, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
                    ov0Var2.p(true);
                    s83.b(ke0.O(2131624382, new Object[]{str}, ov0Var2), null, hz.c(0.7f, ((kz) ov0Var2.j(hh0Var2)).q), v63.b(13.5d), null, null, 0L, null, null, v63.c(20), 0, false, 0, 0, null, ov0Var2, 24576, 48, 260074);
                    dv1 dv1VarE3 = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA4 = jk2.a(new jo(10.0f, true, new fo(0)), orVar, ov0Var2, 54);
                    int iHashCode10 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL10 = ov0Var2.l();
                    dv1 dv1VarH10 = xp1.H(ov0Var2, dv1VarE3);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar5, kk2VarA4);
                    q73.h(ov0Var2, ghVar6, l72VarL10);
                    az2.s(iHashCode10, ov0Var2, ghVar7, ov0Var2, waVar2);
                    q73.h(ov0Var2, ghVar8, dv1VarH10);
                    dv1 dv1VarN3 = xp1.n(iw2.g(lk2.a(lk2Var, av1Var, 1.0f), 42.0f), cj2.a(12.0f));
                    if (z) {
                        j = hz.c;
                        f = 0.08f;
                    } else {
                        j = hz.b;
                        f = 0.05f;
                    }
                    dv1 dv1VarK3 = xp1.k(dv1VarN3, hz.c(f, j), iy0Var);
                    Object objQ7 = ov0Var2.Q();
                    c30 c30Var2 = d30.a;
                    if (objQ7 == c30Var2) {
                        ey1Var2 = ey1Var4;
                        objQ7 = new mo0(ey1Var2, 13);
                        ov0Var2.m0(objQ7);
                    } else {
                        ey1Var2 = ey1Var4;
                    }
                    dv1 dv1VarA2 = bk.a(dv1VarK3, (au0) objQ7);
                    er1 er1VarC3 = ws.c(prVar, false);
                    ey1 ey1Var5 = ey1Var2;
                    int iHashCode11 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL11 = ov0Var2.l();
                    dv1 dv1VarH11 = xp1.H(ov0Var2, dv1VarA2);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar5, er1VarC3);
                    q73.h(ov0Var2, ghVar6, l72VarL11);
                    az2.s(iHashCode11, ov0Var2, ghVar7, ov0Var2, waVar2);
                    q73.h(ov0Var2, ghVar8, dv1VarH11);
                    s83.b(ke0.N(2131624085, ov0Var2), null, hz.c(0.75f, ((kz) ov0Var2.j(hh0Var2)).q), v63.c(14), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
                    ov0Var2.p(true);
                    b52 b52Var = hu.a;
                    gu guVarA2 = hu.a(xp1.d(4293212469L), 0L, 0L, 0L, ov0Var2, 14);
                    bj2 bj2VarA2 = cj2.a(12.0f);
                    dv1 dv1VarG = iw2.g(lk2.a(lk2Var, av1Var, 1.2f), 42.0f);
                    boolean zH = ov0Var2.h(lo1Var) | ov0Var2.h(completeLocation);
                    Object objQ8 = ov0Var2.Q();
                    if (zH || objQ8 == c30Var2) {
                        objQ8 = new a6(lo1Var, completeLocation, ey1Var5, 14);
                        ov0Var2.m0(objQ8);
                    }
                    n51.a((au0) objQ8, dv1VarG, false, bj2VarA2, guVarA2, null, null, null, n51.x, ov0Var2, 805306368, 484);
                    ov0Var2.p(true);
                    ov0Var2.p(true);
                }
                break;
            case 2:
                String str2 = (String) obj7;
                String str3 = (String) obj6;
                au0 au0Var2 = (au0) obj4;
                au0 au0Var3 = (au0) obj5;
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ov0Var3.W();
                } else {
                    dv1 dv1VarD3 = zm3.D(iw2.e(av1Var, 1.0f), 20.0f);
                    yz yzVarA5 = wz.a(new jo(12.0f, true, new fo(0)), j9.r, ov0Var3, 6);
                    int iHashCode12 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL12 = ov0Var3.l();
                    dv1 dv1VarH12 = xp1.H(ov0Var3, dv1VarD3);
                    w20.b.getClass();
                    x30 x30Var3 = v20.b;
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var3);
                    } else {
                        ov0Var3.p0();
                    }
                    gh ghVar9 = v20.e;
                    q73.h(ov0Var3, ghVar9, yzVarA5);
                    gh ghVar10 = v20.d;
                    q73.h(ov0Var3, ghVar10, l72VarL12);
                    Integer numValueOf3 = Integer.valueOf(iHashCode12);
                    gh ghVar11 = v20.f;
                    q73.h(ov0Var3, ghVar11, numValueOf3);
                    wa waVar3 = v20.g;
                    q73.g(ov0Var3, waVar3);
                    gh ghVar12 = v20.c;
                    q73.h(ov0Var3, ghVar12, dv1VarH12);
                    long jC4 = v63.c(17);
                    jr0 jr0Var3 = jr0.j;
                    hh0 hh0Var3 = mz.a;
                    s83.b(str2, null, ((kz) ov0Var3.j(hh0Var3)).q, jC4, jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                    s83.b(str3, null, hz.c(0.7f, ((kz) ov0Var3.j(hh0Var3)).q), v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                    dv1 dv1VarE4 = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA5 = jk2.a(new jo(8.0f, true, new fo(0)), j9.o, ov0Var3, 6);
                    int iHashCode13 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL13 = ov0Var3.l();
                    dv1 dv1VarH13 = xp1.H(ov0Var3, dv1VarE4);
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var3);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, ghVar9, kk2VarA5);
                    q73.h(ov0Var3, ghVar10, l72VarL13);
                    az2.s(iHashCode13, ov0Var3, ghVar11, ov0Var3, waVar3);
                    q73.h(ov0Var3, ghVar12, dv1VarH13);
                    dv1 dv1VarN4 = xp1.n(iw2.g(lk2.a(lk2Var, av1Var, 1.0f), 40.0f), cj2.a(12.0f));
                    if (z) {
                        j2 = hz.c;
                        f2 = 0.08f;
                    } else {
                        j2 = hz.b;
                        f2 = 0.05f;
                    }
                    dv1 dv1VarA3 = bk.a(xp1.k(dv1VarN4, hz.c(f2, j2), o51.p0), au0Var2);
                    er1 er1VarC4 = ws.c(j9.j, false);
                    int iHashCode14 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL14 = ov0Var3.l();
                    dv1 dv1VarH14 = xp1.H(ov0Var3, dv1VarA3);
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var3);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, ghVar9, er1VarC4);
                    q73.h(ov0Var3, ghVar10, l72VarL14);
                    az2.s(iHashCode14, ov0Var3, ghVar11, ov0Var3, waVar3);
                    q73.h(ov0Var3, ghVar12, dv1VarH14);
                    s83.b(ke0.N(2131624085, ov0Var3), null, 0L, v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262126);
                    ov0Var3.p(true);
                    bj2 bj2VarA3 = cj2.a(12.0f);
                    b52 b52Var2 = hu.a;
                    n51.a(au0Var3, iw2.g(lk2.a(lk2Var, av1Var, 1.2f), 40.0f), false, bj2VarA3, hu.a(xp1.d(4293212469L), 0L, 0L, 0L, ov0Var3, 14), null, null, null, o51.a0, ov0Var3, 805306368, 484);
                    ov0Var3.p(true);
                    ov0Var3.p(true);
                }
                break;
            default:
                RootSetupTestResult rootSetupTestResult = (RootSetupTestResult) obj7;
                ay ayVar = (ay) obj6;
                Context context = (Context) obj5;
                au0 au0Var4 = (au0) obj4;
                f30 f30Var4 = (f30) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ov0Var4.W();
                } else {
                    dv1 dv1VarD4 = zm3.D(iw2.e(av1Var, 1.0f), 22.0f);
                    ho hoVar = am1.g;
                    nr nrVar2 = j9.r;
                    yz yzVarA6 = wz.a(hoVar, nrVar2, ov0Var4, 0);
                    int iHashCode15 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL15 = ov0Var4.l();
                    dv1 dv1VarH15 = xp1.H(ov0Var4, dv1VarD4);
                    w20.b.getClass();
                    x30 x30Var4 = v20.b;
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var4);
                    } else {
                        ov0Var4.p0();
                    }
                    gh ghVar13 = v20.e;
                    q73.h(ov0Var4, ghVar13, yzVarA6);
                    gh ghVar14 = v20.d;
                    q73.h(ov0Var4, ghVar14, l72VarL15);
                    Integer numValueOf4 = Integer.valueOf(iHashCode15);
                    gh ghVar15 = v20.f;
                    q73.h(ov0Var4, ghVar15, numValueOf4);
                    wa waVar4 = v20.g;
                    q73.g(ov0Var4, waVar4);
                    gh ghVar16 = v20.c;
                    q73.h(ov0Var4, ghVar16, dv1VarH15);
                    or orVar2 = j9.p;
                    kk2 kk2VarA6 = jk2.a(new jo(10.0f, true, new fo(0)), orVar2, ov0Var4, 54);
                    int iHashCode16 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL16 = ov0Var4.l();
                    dv1 dv1VarH16 = xp1.H(ov0Var4, av1Var);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var4);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar13, kk2VarA6);
                    q73.h(ov0Var4, ghVar14, l72VarL16);
                    az2.s(iHashCode16, ov0Var4, ghVar15, ov0Var4, waVar4);
                    q73.h(ov0Var4, ghVar16, dv1VarH16);
                    boolean z2 = rootSetupTestResult.getHasRoot() && rootSetupTestResult.getOverallVerified();
                    dv1 dv1VarN5 = xp1.n(iw2.k(av1Var, 40.0f), cj2.a(13.0f));
                    long jC5 = hz.c(0.12f, z2 ? bk.h : xp1.d(4293212469L));
                    iy0 iy0Var2 = o51.p0;
                    dv1 dv1VarK4 = xp1.k(dv1VarN5, jC5, iy0Var2);
                    pr prVar2 = j9.j;
                    boolean z3 = z2;
                    er1 er1VarC5 = ws.c(prVar2, false);
                    int iHashCode17 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL17 = ov0Var4.l();
                    dv1 dv1VarH17 = xp1.H(ov0Var4, dv1VarK4);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var4);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar13, er1VarC5);
                    q73.h(ov0Var4, ghVar14, l72VarL17);
                    az2.s(iHashCode17, ov0Var4, ghVar15, ov0Var4, waVar4);
                    q73.h(ov0Var4, ghVar16, dv1VarH17);
                    t01.a(z3 ? xq1.G() : k22.s(), null, iw2.k(av1Var, 22.0f), z3 ? bk.h : xp1.d(4293212469L), ov0Var4, 432, 0);
                    ov0Var4.p(true);
                    String strN8 = ke0.N(2131624897, ov0Var4);
                    long jC6 = v63.c(18);
                    jr0 jr0Var4 = jr0.j;
                    hh0 hh0Var4 = mz.a;
                    s83.b(strN8, null, ((kz) ov0Var4.j(hh0Var4)).q, jC6, jr0Var4, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597440, 0, 262058);
                    ov0Var4.p(true);
                    gh0.h(ov0Var4, iw2.g(av1Var, 16.0f));
                    dv1 dv1VarP2 = zm3.P(iw2.h(iw2.e(av1Var, 1.0f), 0.0f, 360.0f, 1), zm3.O(ov0Var4), true);
                    yz yzVarA7 = wz.a(new jo(12.0f, true, new fo(0)), nrVar2, ov0Var4, 6);
                    int iHashCode18 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL18 = ov0Var4.l();
                    dv1 dv1VarH18 = xp1.H(ov0Var4, dv1VarP2);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var4);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar13, yzVarA7);
                    q73.h(ov0Var4, ghVar14, l72VarL18);
                    az2.s(iHashCode18, ov0Var4, ghVar15, ov0Var4, waVar4);
                    q73.h(ov0Var4, ghVar16, dv1VarH18);
                    gh0.b(ke0.N(2131624895, ov0Var4), rootSetupTestResult.getHasRoot(), l13.B0(120, rootSetupTestResult.getIdOutput()), ov0Var4, 0, 0);
                    gh0.b(ke0.N(2131624893, ov0Var4), rootSetupTestResult.getFrameworkConnected(), null, ov0Var4, 0, 4);
                    gh0.b(ke0.N(2131624894, ov0Var4), rootSetupTestResult.getRemoteConfigAccessible(), ke0.N(2131624896, ov0Var4), ov0Var4, 0, 0);
                    String strN9 = ke0.N(2131624892, ov0Var4);
                    boolean configPublished = rootSetupTestResult.getConfigPublished();
                    if (rootSetupTestResult.getConfigPublished()) {
                        ov0Var4.c0(412834303);
                        i = 0;
                        ov0Var4.p(false);
                        strH = null;
                    } else {
                        i = 0;
                        strH = az2.h(ov0Var4, -1649250379, 2131624891, ov0Var4, false);
                    }
                    gh0.b(strN9, configPublished, strH, ov0Var4, 0, 0);
                    ov0Var4.p(true);
                    gh0.h(ov0Var4, iw2.g(av1Var, 16.0f));
                    dv1 dv1VarE5 = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA7 = jk2.a(new jo(10.0f, true, new fo(i)), orVar2, ov0Var4, 54);
                    int iHashCode19 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL19 = ov0Var4.l();
                    dv1 dv1VarH19 = xp1.H(ov0Var4, dv1VarE5);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var4);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar13, kk2VarA7);
                    q73.h(ov0Var4, ghVar14, l72VarL19);
                    az2.s(iHashCode19, ov0Var4, ghVar15, ov0Var4, waVar4);
                    q73.h(ov0Var4, ghVar16, dv1VarH19);
                    dv1 dv1VarN6 = xp1.n(iw2.g(lk2.a(lk2Var, av1Var, 1.0f), 42.0f), cj2.a(12.0f));
                    if (z) {
                        j3 = hz.c;
                        f3 = 0.08f;
                    } else {
                        j3 = hz.b;
                        f3 = 0.05f;
                    }
                    dv1 dv1VarK5 = xp1.k(dv1VarN6, hz.c(f3, j3), iy0Var2);
                    boolean zH2 = ov0Var4.h(rootSetupTestResult) | ov0Var4.h(ayVar) | ov0Var4.h(context);
                    Object objQ9 = ov0Var4.Q();
                    if (zH2 || objQ9 == d30.a) {
                        objQ9 = new a6(ayVar, context, rootSetupTestResult, 16);
                        ov0Var4.m0(objQ9);
                    }
                    dv1 dv1VarA4 = bk.a(dv1VarK5, (au0) objQ9);
                    er1 er1VarC6 = ws.c(prVar2, false);
                    int iHashCode20 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL20 = ov0Var4.l();
                    dv1 dv1VarH20 = xp1.H(ov0Var4, dv1VarA4);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var4);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar13, er1VarC6);
                    q73.h(ov0Var4, ghVar14, l72VarL20);
                    az2.s(iHashCode20, ov0Var4, ghVar15, ov0Var4, waVar4);
                    q73.h(ov0Var4, ghVar16, dv1VarH20);
                    s83.b(ke0.N(2131624356, ov0Var4), null, hz.c(0.75f, ((kz) ov0Var4.j(hh0Var4)).q), v63.c(13), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597440, 0, 262058);
                    ov0Var4.p(true);
                    b52 b52Var3 = hu.a;
                    n51.a(au0Var4, iw2.g(lk2.a(lk2Var, av1Var, 1.0f), 42.0f), false, cj2.a(12.0f), hu.a(bk.g, 0L, 0L, 0L, ov0Var4, 14), null, null, null, zm3.e, ov0Var4, 805306368, 484);
                    ov0Var4.p(true);
                    ov0Var4.p(true);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ i11(String str, String str2, boolean z, au0 au0Var, au0 au0Var2) {
        this.h = str;
        this.g = str2;
        this.f = z;
        this.i = au0Var;
        this.j = au0Var2;
    }

    public /* synthetic */ i11(String str, boolean z, lo1 lo1Var, CompleteLocation completeLocation, ey1 ey1Var) {
        this.h = str;
        this.f = z;
        this.i = lo1Var;
        this.j = completeLocation;
        this.g = ey1Var;
    }

    public /* synthetic */ i11(boolean z, ImportExportCounts importExportCounts, ey1 ey1Var, au0 au0Var, lu0 lu0Var) {
        this.f = z;
        this.h = importExportCounts;
        this.g = ey1Var;
        this.i = au0Var;
        this.j = lu0Var;
    }
}
