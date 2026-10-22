package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class vy1 implements qu0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ AppState g;

    public /* synthetic */ vy1(AppState appState, boolean z) {
        this.g = appState;
        this.f = z;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strH;
        boolean z;
        String strH2;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        av1 av1Var = av1.a;
        AppState appState = this.g;
        boolean z2 = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1VarE);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
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
                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 38.0f), cj2.a(11.0f));
                    long j = bk.h;
                    long jC = hz.c(0.12f, j);
                    iy0 iy0Var = o51.p0;
                    dv1 dv1VarK = xp1.k(dv1VarN, jC, iy0Var);
                    er1 er1VarC = ws.c(j9.j, false);
                    int iHashCode2 = Long.hashCode(ov0Var.T);
                    l72 l72VarL2 = ov0Var.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarK);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, er1VarC);
                    q73.h(ov0Var, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH2);
                    t01.a(vd0.x(), null, iw2.k(av1Var, 20.0f), j, ov0Var, 3504, 0);
                    ov0Var.p(true);
                    gh0.h(ov0Var, iw2.o(av1Var, 14.0f));
                    wb1 wb1Var = new wb1(1.0f, true);
                    yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
                    int iHashCode3 = Long.hashCode(ov0Var.T);
                    l72 l72VarL3 = ov0Var.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var, wb1Var);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, yzVarA);
                    q73.h(ov0Var, ghVar2, l72VarL3);
                    az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH3);
                    s83.b(ke0.N(2131624439, ov0Var), null, ((kz) ov0Var.j(mz.a)).o, v63.c(15), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                    gh0.h(ov0Var, iw2.g(av1Var, 2.0f));
                    if (appState.isContinuousScanning()) {
                        ov0Var.c0(-585890519);
                        strH = ke0.O(2131624951, new Object[]{Integer.valueOf(appState.getEnvironmentRecordCount())}, ov0Var);
                        ov0Var.p(false);
                    } else {
                        strH = az2.h(ov0Var, -585697327, 2131625161, ov0Var, false);
                    }
                    s83.b(strH, null, z2 ? bk.c : bk.f, v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                    ov0Var.p(true);
                    if (appState.isContinuousScanning()) {
                        ov0Var.c0(-1870858764);
                        dv1 dv1VarK2 = xp1.k(xp1.n(iw2.k(av1Var, 8.0f), cj2.a), j, iy0Var);
                        z = false;
                        ws.a(dv1VarK2, ov0Var, 0);
                        gh0.h(ov0Var, iw2.o(av1Var, 8.0f));
                    } else {
                        z = false;
                        ov0Var.c0(-1878459809);
                    }
                    ov0Var.p(z);
                    t01.a(sb.S(), null, iw2.k(av1Var, 18.0f), hz.c(0.7f, z2 ? bk.c : bk.f), ov0Var, 432, 0);
                    ov0Var.p(true);
                }
                break;
            default:
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA2 = jk2.a(am1.e, j9.p, ov0Var2, 48);
                    int iHashCode4 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL4 = ov0Var2.l();
                    dv1 dv1VarH4 = xp1.H(ov0Var2, dv1VarE2);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    gh ghVar5 = v20.e;
                    q73.h(ov0Var2, ghVar5, kk2VarA2);
                    gh ghVar6 = v20.d;
                    q73.h(ov0Var2, ghVar6, l72VarL4);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    gh ghVar7 = v20.f;
                    q73.h(ov0Var2, ghVar7, numValueOf2);
                    wa waVar2 = v20.g;
                    q73.g(ov0Var2, waVar2);
                    gh ghVar8 = v20.c;
                    q73.h(ov0Var2, ghVar8, dv1VarH4);
                    dv1 dv1VarN2 = xp1.n(iw2.k(av1Var, 38.0f), cj2.a(11.0f));
                    long j2 = bk.i;
                    dv1 dv1VarK3 = xp1.k(dv1VarN2, hz.c(0.12f, j2), o51.p0);
                    er1 er1VarC2 = ws.c(j9.j, false);
                    int iHashCode5 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL5 = ov0Var2.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var2, dv1VarK3);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar5, er1VarC2);
                    q73.h(ov0Var2, ghVar6, l72VarL5);
                    az2.s(iHashCode5, ov0Var2, ghVar7, ov0Var2, waVar2);
                    q73.h(ov0Var2, ghVar8, dv1VarH5);
                    t01.a(ke0.B(), null, iw2.k(av1Var, 20.0f), j2, ov0Var2, 3504, 0);
                    ov0Var2.p(true);
                    gh0.h(ov0Var2, iw2.o(av1Var, 14.0f));
                    wb1 wb1Var2 = new wb1(1.0f, true);
                    yz yzVarA2 = wz.a(am1.g, j9.r, ov0Var2, 0);
                    int iHashCode6 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL6 = ov0Var2.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var2, wb1Var2);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar5, yzVarA2);
                    q73.h(ov0Var2, ghVar6, l72VarL6);
                    az2.s(iHashCode6, ov0Var2, ghVar7, ov0Var2, waVar2);
                    q73.h(ov0Var2, ghVar8, dv1VarH6);
                    s83.b(ke0.N(2131625091, ov0Var2), null, ((kz) ov0Var2.j(mz.a)).o, v63.c(15), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
                    gh0.h(ov0Var2, iw2.g(av1Var, 2.0f));
                    if (appState.isSystemHookGlobalMode()) {
                        ov0Var2.c0(183547086);
                        strH2 = ke0.N(2131625096, ov0Var2) + "（所有应用生效）";
                        ov0Var2.p(false);
                    } else if (appState.getSystemHookPackages().isEmpty()) {
                        strH2 = az2.h(ov0Var2, 183827326, 2131625089, ov0Var2, false);
                    } else {
                        ov0Var2.c0(183704194);
                        strH2 = ke0.O(2131624973, new Object[]{Integer.valueOf(appState.getSystemHookPackages().size())}, ov0Var2);
                        ov0Var2.p(false);
                    }
                    s83.b(strH2, null, appState.isSystemHookGlobalMode() ? bk.g : z2 ? bk.c : bk.f, v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262122);
                    ov0Var2.p(true);
                    t01.a(sb.S(), null, iw2.k(av1Var, 18.0f), hz.c(0.7f, z2 ? bk.c : bk.f), ov0Var2, 432, 0);
                    ov0Var2.p(true);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ vy1(boolean z, AppState appState) {
        this.f = z;
        this.g = appState;
    }
}
