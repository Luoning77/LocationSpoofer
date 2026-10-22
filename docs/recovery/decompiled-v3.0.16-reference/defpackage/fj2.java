package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RoutePlanStage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class fj2 implements pu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ AppState f;
    public final /* synthetic */ au0 g;
    public final /* synthetic */ au0 h;
    public final /* synthetic */ au0 i;
    public final /* synthetic */ au0 j;
    public final /* synthetic */ au0 k;
    public final /* synthetic */ au0 l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ xu0 p;

    public /* synthetic */ fj2(dv1 dv1Var, RoutePlanStage routePlanStage, List list, AppState appState, au0 au0Var, au0 au0Var2, au0 au0Var3, au0 au0Var4, au0 au0Var5, au0 au0Var6, qu0 qu0Var, int i) {
        this.m = dv1Var;
        this.n = routePlanStage;
        this.o = list;
        this.f = appState;
        this.g = au0Var;
        this.h = au0Var2;
        this.i = au0Var3;
        this.j = au0Var4;
        this.k = au0Var5;
        this.l = au0Var6;
        this.p = qu0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        go goVar;
        c30 c30Var;
        boolean z;
        AppState appState;
        or orVar;
        boolean z2;
        go goVar2;
        or orVar2;
        gh ghVar;
        wa waVar;
        gh ghVar2;
        boolean z3;
        int i;
        int i2 = this.e;
        mf3 mf3Var = mf3.a;
        xu0 xu0Var = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.m;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                mc0.f((dv1) obj5, (RoutePlanStage) obj4, (List) obj3, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (qu0) xu0Var, (f30) obj, wc0.m0(12582913));
                break;
            default:
                lu0 lu0Var = (lu0) obj5;
                lu0 lu0Var2 = (lu0) obj4;
                lu0 lu0Var3 = (lu0) obj3;
                au0 au0Var = (au0) xu0Var;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go goVar3 = am1.e;
                or orVar3 = j9.p;
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    av1 av1Var = av1.a;
                    dv1 dv1VarH = iw2.h(iw2.e(zm3.D(av1Var, 20.0f), 1.0f), 0.0f, 620.0f, 1);
                    ho hoVar = am1.g;
                    nr nrVar = j9.r;
                    yz yzVarA = wz.a(hoVar, nrVar, ov0Var, 0);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarH);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    gh ghVar3 = v20.e;
                    q73.h(ov0Var, ghVar3, yzVarA);
                    gh ghVar4 = v20.d;
                    q73.h(ov0Var, ghVar4, l72VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    gh ghVar5 = v20.f;
                    q73.h(ov0Var, ghVar5, numValueOf);
                    wa waVar2 = v20.g;
                    q73.g(ov0Var, waVar2);
                    gh ghVar6 = v20.c;
                    q73.h(ov0Var, ghVar6, dv1VarH2);
                    s83.b(ke0.N(2131625040, ov0Var), null, dh0.p(ov0Var).o, v63.c(18), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                    gh0.h(ov0Var, iw2.g(av1Var, 8.0f));
                    dv1 dv1VarP = zm3.P(iw2.e(av1Var, 1.0f).d(new wb1(1.0f, false)), zm3.O(ov0Var), true);
                    yz yzVarA2 = wz.a(hoVar, nrVar, ov0Var, 0);
                    int iHashCode2 = Long.hashCode(ov0Var.T);
                    l72 l72VarL2 = ov0Var.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var, dv1VarP);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar3, yzVarA2);
                    q73.h(ov0Var, ghVar4, l72VarL2);
                    az2.s(iHashCode2, ov0Var, ghVar5, ov0Var, waVar2);
                    q73.h(ov0Var, ghVar6, dv1VarH3);
                    s83.b(ke0.N(2131625039, ov0Var), null, hz.c(0.7f, dh0.p(ov0Var).o), v63.c(13), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                    gh0.h(ov0Var, iw2.g(av1Var, 16.0f));
                    AppState appState2 = this.f;
                    boolean z4 = appState2.getCanMockWifi() || appState2.getCloudWifiConfigured();
                    boolean z5 = appState2.getCanMockCell() || appState2.getCloudCellsConfigured();
                    boolean canMockBluetooth = appState2.getCanMockBluetooth();
                    c30 c30Var2 = d30.a;
                    if (z4) {
                        ov0Var.c0(1853339924);
                        dv1 dv1VarF = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 4.0f, 1);
                        kk2 kk2VarA = jk2.a(goVar3, orVar3, ov0Var, 48);
                        int iHashCode3 = Long.hashCode(ov0Var.T);
                        l72 l72VarL3 = ov0Var.l();
                        dv1 dv1VarH4 = xp1.H(ov0Var, dv1VarF);
                        ov0Var.g0();
                        goVar = goVar3;
                        if (ov0Var.S) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar3, kk2VarA);
                        q73.h(ov0Var, ghVar4, l72VarL3);
                        az2.s(iHashCode3, ov0Var, ghVar5, ov0Var, waVar2);
                        q73.h(ov0Var, ghVar6, dv1VarH4);
                        x01 x01VarB = l93.a;
                        if (x01VarB == null) {
                            w01 w01Var = new w01("Outlined.Wifi", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i3 = nh3.a;
                            qy2 qy2Var = new qy2(hz.b);
                            nx0 nx0Var = new nx0(3);
                            nx0Var.m(1.0f, 9.0f);
                            nx0Var.l(2.0f, 2.0f);
                            nx0Var.g(4.97f, -4.97f, 13.03f, -4.97f, 18.0f, 0.0f);
                            nx0Var.l(2.0f, -2.0f);
                            nx0Var.f(16.93f, 2.93f, 7.08f, 2.93f, 1.0f, 9.0f);
                            nx0Var.e();
                            nx0Var.m(9.0f, 17.0f);
                            nx0Var.l(3.0f, 3.0f);
                            nx0Var.l(3.0f, -3.0f);
                            nx0Var.g(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
                            nx0Var.e();
                            nx0Var.m(5.0f, 13.0f);
                            nx0Var.l(2.0f, 2.0f);
                            nx0Var.g(2.76f, -2.76f, 7.24f, -2.76f, 10.0f, 0.0f);
                            nx0Var.l(2.0f, -2.0f);
                            nx0Var.f(15.14f, 9.14f, 8.87f, 9.14f, 5.0f, 13.0f);
                            nx0Var.e();
                            w01.a(w01Var, nx0Var.a, qy2Var);
                            x01VarB = w01Var.b();
                            l93.a = x01VarB;
                        }
                        t01.a(x01VarB, null, iw2.k(av1Var, 20.0f), bk.g, ov0Var, 3504, 0);
                        gh0.h(ov0Var, iw2.o(av1Var, 12.0f));
                        wb1 wb1Var = new wb1(1.0f, true);
                        yz yzVarA3 = wz.a(hoVar, nrVar, ov0Var, 0);
                        int iHashCode4 = Long.hashCode(ov0Var.T);
                        l72 l72VarL4 = ov0Var.l();
                        dv1 dv1VarH5 = xp1.H(ov0Var, wb1Var);
                        ov0Var.g0();
                        if (ov0Var.S) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar3, yzVarA3);
                        q73.h(ov0Var, ghVar4, l72VarL4);
                        az2.s(iHashCode4, ov0Var, ghVar5, ov0Var, waVar2);
                        q73.h(ov0Var, ghVar6, dv1VarH5);
                        s83.b(ke0.N(2131624442, ov0Var), null, dh0.p(ov0Var).o, v63.c(15), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                        s83.b(r93.g(appState2, ov0Var), null, hz.c(0.65f, dh0.p(ov0Var).o), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                        ov0Var.p(true);
                        boolean mockWifi = appState2.getMockWifi();
                        au0 au0Var2 = this.g;
                        boolean zF = ov0Var.f(au0Var2);
                        Object objQ = ov0Var.Q();
                        if (zF) {
                            c30Var = c30Var2;
                        } else {
                            c30Var = c30Var2;
                            if (objQ == c30Var) {
                            }
                            b43.a(mockWifi, (lu0) objQ, null, false, null, ov0Var, 0, 124);
                            ov0Var.p(true);
                            z = false;
                        }
                        objQ = new m4(15, au0Var2);
                        ov0Var.m0(objQ);
                        b43.a(mockWifi, (lu0) objQ, null, false, null, ov0Var, 0, 124);
                        ov0Var.p(true);
                        z = false;
                    } else {
                        goVar = goVar3;
                        c30Var = c30Var2;
                        z = false;
                        ov0Var.c0(1849935969);
                    }
                    ov0Var.p(z);
                    if (z5) {
                        ov0Var.c0(1854812083);
                        dv1 dv1VarF2 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 4.0f, 1);
                        kk2 kk2VarA2 = jk2.a(goVar, orVar3, ov0Var, 48);
                        orVar = orVar3;
                        int iHashCode5 = Long.hashCode(ov0Var.T);
                        l72 l72VarL5 = ov0Var.l();
                        dv1 dv1VarH6 = xp1.H(ov0Var, dv1VarF2);
                        ov0Var.g0();
                        appState = appState2;
                        if (ov0Var.S) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar3, kk2VarA2);
                        q73.h(ov0Var, ghVar4, l72VarL5);
                        az2.s(iHashCode5, ov0Var, ghVar5, ov0Var, waVar2);
                        q73.h(ov0Var, ghVar6, dv1VarH6);
                        x01 x01VarB2 = n51.S;
                        if (x01VarB2 == null) {
                            w01 w01Var2 = new w01("Outlined.CellTower", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i4 = nh3.a;
                            long j = hz.b;
                            qy2 qy2Var2 = new qy2(j);
                            ArrayList arrayList = new ArrayList(32);
                            arrayList.add(new q62(7.3f, 14.7f));
                            arrayList.add(new x62(1.2f, -1.2f));
                            arrayList.add(new v62(-1.0f, -1.0f, -1.5f, -2.3f, -1.5f, -3.5f));
                            arrayList.add(new v62(0.0f, -1.3f, 0.5f, -2.6f, 1.5f, -3.5f));
                            arrayList.add(new p62(7.3f, 5.3f));
                            arrayList.add(new v62(-1.3f, 1.3f, -2.0f, 3.0f, -2.0f, 4.7f));
                            arrayList.add(new s62(6.0f, 13.4f, 7.3f, 14.7f));
                            m62 m62Var = m62.c;
                            arrayList.add(m62Var);
                            w01.a(w01Var2, arrayList, qy2Var2);
                            qy2 qy2Var3 = new qy2(j);
                            ArrayList arrayList2 = new ArrayList(32);
                            arrayList2.add(new q62(19.1f, 2.9f));
                            arrayList2.add(new x62(-1.2f, 1.2f));
                            arrayList2.add(new v62(1.6f, 1.6f, 2.4f, 3.8f, 2.4f, 5.9f));
                            arrayList2.add(new v62(0.0f, 2.1f, -0.8f, 4.3f, -2.4f, 5.9f));
                            arrayList2.add(new x62(1.2f, 1.2f));
                            arrayList2.add(new v62(2.0f, -2.0f, 2.9f, -4.5f, 2.9f, -7.1f));
                            arrayList2.add(new n62(22.0f, 7.4f, 21.0f, 4.9f, 19.1f, 2.9f));
                            arrayList2.add(m62Var);
                            w01.a(w01Var2, arrayList2, qy2Var3);
                            qy2 qy2Var4 = new qy2(j);
                            ArrayList arrayList3 = new ArrayList(32);
                            arrayList3.add(new q62(6.1f, 4.1f));
                            arrayList3.add(new p62(4.9f, 2.9f));
                            arrayList3.add(new n62(3.0f, 4.9f, 2.0f, 7.4f, 2.0f, 10.0f));
                            arrayList3.add(new v62(0.0f, 2.6f, 1.0f, 5.1f, 2.9f, 7.1f));
                            arrayList3.add(new x62(1.2f, -1.2f));
                            arrayList3.add(new v62(-1.6f, -1.6f, -2.4f, -3.8f, -2.4f, -5.9f));
                            arrayList3.add(new n62(3.7f, 7.9f, 4.5f, 5.7f, 6.1f, 4.1f));
                            arrayList3.add(m62Var);
                            w01.a(w01Var2, arrayList3, qy2Var4);
                            qy2 qy2Var5 = new qy2(j);
                            ArrayList arrayList4 = new ArrayList(32);
                            arrayList4.add(new q62(16.7f, 14.7f));
                            arrayList4.add(new v62(1.3f, -1.3f, 2.0f, -3.0f, 2.0f, -4.7f));
                            arrayList4.add(new v62(-0.1f, -1.7f, -0.7f, -3.4f, -2.0f, -4.7f));
                            arrayList4.add(new x62(-1.2f, 1.2f));
                            arrayList4.add(new v62(1.0f, 1.0f, 1.5f, 2.3f, 1.5f, 3.5f));
                            arrayList4.add(new v62(0.0f, 1.3f, -0.5f, 2.6f, -1.5f, 3.5f));
                            arrayList4.add(new p62(16.7f, 14.7f));
                            arrayList4.add(m62Var);
                            w01.a(w01Var2, arrayList4, qy2Var5);
                            qy2 qy2Var6 = new qy2(j);
                            nx0 nx0VarI = p91.i(14.5f, 10.0f);
                            nx0VarI.g(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
                            nx0VarI.n(9.5f, 8.62f, 9.5f, 10.0f);
                            nx0VarI.g(0.0f, 0.76f, 0.34f, 1.42f, 0.87f, 1.88f);
                            nx0VarI.k(7.0f, 22.0f);
                            nx0VarI.i(2.0f);
                            nx0VarI.l(0.67f, -2.0f);
                            nx0VarI.i(4.67f);
                            nx0VarI.k(15.0f, 22.0f);
                            nx0VarI.i(2.0f);
                            nx0VarI.l(-3.37f, -10.12f);
                            nx0VarI.f(14.16f, 11.42f, 14.5f, 10.76f, 14.5f, 10.0f);
                            nx0VarI.e();
                            nx0VarI.m(10.33f, 18.0f);
                            nx0VarI.k(12.0f, 13.0f);
                            nx0VarI.l(1.67f, 5.0f);
                            nx0VarI.h(10.33f);
                            nx0VarI.e();
                            w01.a(w01Var2, nx0VarI.a, qy2Var6);
                            x01VarB2 = w01Var2.b();
                            n51.S = x01VarB2;
                        }
                        t01.a(x01VarB2, null, iw2.k(av1Var, 20.0f), bk.i, ov0Var, 3504, 0);
                        ov0Var = ov0Var;
                        s83.b(az2.i(av1Var, 12.0f, ov0Var, 2131624772, ov0Var), new wb1(1.0f, true), dh0.p(ov0Var).o, v63.c(15), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262120);
                        boolean mockCell = appState.getMockCell();
                        au0 au0Var3 = this.h;
                        boolean zF2 = ov0Var.f(au0Var3);
                        Object objQ2 = ov0Var.Q();
                        if (zF2 || objQ2 == c30Var) {
                            objQ2 = new m4(16, au0Var3);
                            ov0Var.m0(objQ2);
                        }
                        b43.a(mockCell, (lu0) objQ2, null, false, null, ov0Var, 0, 124);
                        ov0Var.p(true);
                        z2 = false;
                    } else {
                        waVar2 = waVar2;
                        ghVar5 = ghVar5;
                        ghVar6 = ghVar6;
                        appState = appState2;
                        orVar = orVar3;
                        z2 = false;
                        ov0Var.c0(1849935969);
                    }
                    ov0Var.p(z2);
                    if (canMockBluetooth) {
                        ov0Var.c0(1855954340);
                        dv1 dv1VarF3 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 4.0f, 1);
                        goVar2 = goVar;
                        orVar2 = orVar;
                        kk2 kk2VarA3 = jk2.a(goVar2, orVar2, ov0Var, 48);
                        int iHashCode6 = Long.hashCode(ov0Var.T);
                        l72 l72VarL6 = ov0Var.l();
                        dv1 dv1VarH7 = xp1.H(ov0Var, dv1VarF3);
                        ov0Var.g0();
                        if (ov0Var.S) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar3, kk2VarA3);
                        q73.h(ov0Var, ghVar4, l72VarL6);
                        waVar = waVar2;
                        ghVar2 = ghVar5;
                        az2.s(iHashCode6, ov0Var, ghVar2, ov0Var, waVar);
                        ghVar = ghVar6;
                        q73.h(ov0Var, ghVar, dv1VarH7);
                        x01 x01VarB3 = xp1.Q;
                        if (x01VarB3 == null) {
                            w01 w01Var3 = new w01("Outlined.Bluetooth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i5 = nh3.a;
                            qy2 qy2Var7 = new qy2(hz.b);
                            nx0 nx0Var2 = new nx0(3);
                            nx0Var2.m(17.71f, 7.71f);
                            nx0Var2.k(12.0f, 2.0f);
                            nx0Var2.i(-1.0f);
                            nx0Var2.s(7.59f);
                            nx0Var2.k(6.41f, 5.0f);
                            nx0Var2.k(5.0f, 6.41f);
                            nx0Var2.k(10.59f, 12.0f);
                            nx0Var2.k(5.0f, 17.59f);
                            nx0Var2.k(6.41f, 19.0f);
                            nx0Var2.k(11.0f, 14.41f);
                            nx0Var2.k(11.0f, 22.0f);
                            nx0Var2.i(1.0f);
                            nx0Var2.l(5.71f, -5.71f);
                            nx0Var2.l(-4.3f, -4.29f);
                            nx0Var2.l(4.3f, -4.29f);
                            nx0Var2.e();
                            nx0Var2.m(13.0f, 5.83f);
                            nx0Var2.l(1.88f, 1.88f);
                            nx0Var2.k(13.0f, 9.59f);
                            nx0Var2.k(13.0f, 5.83f);
                            nx0Var2.e();
                            nx0Var2.m(14.88f, 16.29f);
                            nx0Var2.k(13.0f, 18.17f);
                            nx0Var2.s(-3.76f);
                            nx0Var2.l(1.88f, 1.88f);
                            nx0Var2.e();
                            w01.a(w01Var3, nx0Var2.a, qy2Var7);
                            x01VarB3 = w01Var3.b();
                            xp1.Q = x01VarB3;
                        }
                        t01.a(x01VarB3, null, iw2.k(av1Var, 20.0f), bk.h, ov0Var, 3504, 0);
                        s83.b(az2.i(av1Var, 12.0f, ov0Var, 2131624771, ov0Var), new wb1(1.0f, true), dh0.p(ov0Var).o, v63.c(15), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262120);
                        boolean mockBluetooth = appState.getMockBluetooth();
                        au0 au0Var4 = this.i;
                        boolean zF3 = ov0Var.f(au0Var4);
                        Object objQ3 = ov0Var.Q();
                        if (zF3 || objQ3 == c30Var) {
                            objQ3 = new m4(17, au0Var4);
                            ov0Var.m0(objQ3);
                        }
                        b43.a(mockBluetooth, (lu0) objQ3, null, false, null, ov0Var, 0, 124);
                        i = 1;
                        ov0Var.p(true);
                        z3 = false;
                    } else {
                        goVar2 = goVar;
                        orVar2 = orVar;
                        ghVar = ghVar6;
                        waVar = waVar2;
                        ghVar2 = ghVar5;
                        z3 = false;
                        i = 1;
                        ov0Var.c0(1849935969);
                    }
                    ov0Var.p(z3);
                    dv1 dv1VarF4 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 4.0f, i);
                    kk2 kk2VarA4 = jk2.a(goVar2, orVar2, ov0Var, 48);
                    int iHashCode7 = Long.hashCode(ov0Var.T);
                    l72 l72VarL7 = ov0Var.l();
                    dv1 dv1VarH8 = xp1.H(ov0Var, dv1VarF4);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar3, kk2VarA4);
                    q73.h(ov0Var, ghVar4, l72VarL7);
                    az2.s(iHashCode7, ov0Var, ghVar2, ov0Var, waVar);
                    q73.h(ov0Var, ghVar, dv1VarH8);
                    x01 x01VarB4 = ig0.a;
                    if (x01VarB4 == null) {
                        w01 w01Var4 = new w01("Outlined.GraphicEq", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = nh3.a;
                        qy2 qy2Var8 = new qy2(hz.b);
                        nx0 nx0Var3 = new nx0(3);
                        nx0Var3.m(7.0f, 18.0f);
                        nx0Var3.i(2.0f);
                        nx0Var3.k(9.0f, 6.0f);
                        nx0Var3.k(7.0f, 6.0f);
                        nx0Var3.s(12.0f);
                        nx0Var3.e();
                        nx0Var3.m(11.0f, 22.0f);
                        nx0Var3.i(2.0f);
                        nx0Var3.k(13.0f, 2.0f);
                        nx0Var3.i(-2.0f);
                        nx0Var3.s(20.0f);
                        nx0Var3.e();
                        nx0Var3.m(3.0f, 14.0f);
                        nx0Var3.i(2.0f);
                        nx0Var3.s(-4.0f);
                        nx0Var3.k(3.0f, 10.0f);
                        nx0Var3.s(4.0f);
                        nx0Var3.e();
                        nx0Var3.m(15.0f, 18.0f);
                        nx0Var3.i(2.0f);
                        nx0Var3.k(17.0f, 6.0f);
                        nx0Var3.i(-2.0f);
                        nx0Var3.s(12.0f);
                        nx0Var3.e();
                        nx0Var3.m(19.0f, 10.0f);
                        nx0Var3.s(4.0f);
                        nx0Var3.i(2.0f);
                        nx0Var3.s(-4.0f);
                        nx0Var3.i(-2.0f);
                        nx0Var3.e();
                        w01.a(w01Var4, nx0Var3.a, qy2Var8);
                        x01VarB4 = w01Var4.b();
                        ig0.a = x01VarB4;
                    }
                    long j2 = bk.g;
                    t01.a(x01VarB4, null, iw2.k(av1Var, 20.0f), j2, ov0Var, 3504, 0);
                    String strI = az2.i(av1Var, 12.0f, ov0Var, 2131624409, ov0Var);
                    lk2 lk2Var = lk2.a;
                    s83.b(strI, lk2.a(lk2Var, av1Var, 1.0f), dh0.p(ov0Var).o, v63.c(15), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262120);
                    boolean enableJitter = appState.getEnableJitter();
                    au0 au0Var5 = this.j;
                    boolean zF4 = ov0Var.f(au0Var5);
                    Object objQ4 = ov0Var.Q();
                    if (zF4 || objQ4 == c30Var) {
                        objQ4 = new m4(18, au0Var5);
                        ov0Var.m0(objQ4);
                    }
                    b43.a(enableJitter, (lu0) objQ4, null, false, null, ov0Var, 0, 124);
                    ov0Var.p(true);
                    c30 c30Var3 = c30Var;
                    dv1 dv1VarF5 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 4.0f, 1);
                    kk2 kk2VarA5 = jk2.a(goVar2, orVar2, ov0Var, 48);
                    int iHashCode8 = Long.hashCode(ov0Var.T);
                    l72 l72VarL8 = ov0Var.l();
                    dv1 dv1VarH9 = xp1.H(ov0Var, dv1VarF5);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar3, kk2VarA5);
                    q73.h(ov0Var, ghVar4, l72VarL8);
                    az2.s(iHashCode8, ov0Var, ghVar2, ov0Var, waVar);
                    q73.h(ov0Var, ghVar, dv1VarH9);
                    x01 x01VarB5 = ce0.e;
                    if (x01VarB5 == null) {
                        w01 w01Var5 = new w01("Outlined.RestartAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i7 = nh3.a;
                        qy2 qy2Var9 = new qy2(hz.b);
                        nx0 nx0VarI2 = p91.i(6.0f, 13.0f);
                        nx0VarI2.g(0.0f, -1.65f, 0.67f, -3.15f, 1.76f, -4.24f);
                        nx0VarI2.k(6.34f, 7.34f);
                        nx0VarI2.f(4.9f, 8.79f, 4.0f, 10.79f, 4.0f, 13.0f);
                        nx0VarI2.g(0.0f, 4.08f, 3.05f, 7.44f, 7.0f, 7.93f);
                        nx0VarI2.s(-2.02f);
                        nx0VarI2.f(8.17f, 18.43f, 6.0f, 15.97f, 6.0f, 13.0f);
                        nx0VarI2.e();
                        nx0VarI2.m(20.0f, 13.0f);
                        nx0VarI2.g(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
                        nx0VarI2.g(-0.06f, 0.0f, -0.12f, 0.01f, -0.18f, 0.01f);
                        nx0VarI2.l(1.09f, -1.09f);
                        nx0VarI2.k(11.5f, 2.5f);
                        nx0VarI2.k(8.0f, 6.0f);
                        nx0VarI2.l(3.5f, 3.5f);
                        nx0VarI2.l(1.41f, -1.41f);
                        nx0VarI2.l(-1.08f, -1.08f);
                        nx0VarI2.f(11.89f, 7.01f, 11.95f, 7.0f, 12.0f, 7.0f);
                        nx0VarI2.g(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
                        nx0VarI2.g(0.0f, 2.97f, -2.17f, 5.43f, -5.0f, 5.91f);
                        nx0VarI2.s(2.02f);
                        nx0VarI2.f(16.95f, 20.44f, 20.0f, 17.08f, 20.0f, 13.0f);
                        nx0VarI2.e();
                        w01.a(w01Var5, nx0VarI2.a, qy2Var9);
                        x01VarB5 = w01Var5.b();
                        ce0.e = x01VarB5;
                    }
                    t01.a(x01VarB5, null, iw2.k(av1Var, 20.0f), j2, ov0Var, 3504, 0);
                    s83.b(az2.i(av1Var, 12.0f, ov0Var, 2131624856, ov0Var), lk2.a(lk2Var, av1Var, 1.0f), dh0.p(ov0Var).o, v63.c(15), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262120);
                    boolean restartAppsOnSpoof = appState.getRestartAppsOnSpoof();
                    au0 au0Var6 = this.k;
                    boolean zF5 = ov0Var.f(au0Var6);
                    Object objQ5 = ov0Var.Q();
                    if (zF5 || objQ5 == c30Var3) {
                        objQ5 = new m4(19, au0Var6);
                        ov0Var.m0(objQ5);
                    }
                    b43.a(restartAppsOnSpoof, (lu0) objQ5, null, false, null, ov0Var, 0, 124);
                    ov0Var.p(true);
                    gh0.h(ov0Var, iw2.g(av1Var, 8.0f));
                    gh ghVar7 = ghVar;
                    wa waVar3 = waVar;
                    xp1.a(appState.getAltitudeInput(), appState.getAltitudeVariationM(), lu0Var, lu0Var2, null, ov0Var, 0);
                    gh0.h(ov0Var, iw2.g(av1Var, 8.0f));
                    ov0 ov0Var2 = ov0Var;
                    ee0.i(appState.getSatelliteCountInput(), lu0Var3, iw2.e(av1Var, 1.0f), false, null, sb.H, null, null, null, null, false, null, new n91(3, 0, 123), null, true, 0, 0, null, j9.k(0L, 0L, 0L, 0L, 0L, 0L, 0L, j2, 0L, 0L, j2, 0L, ov0Var, 2139092991), ov0Var2, 1573248, 12779520, 4030392);
                    ov0Var2.p(true);
                    gh0.h(ov0Var2, iw2.g(av1Var, 16.0f));
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA6 = jk2.a(am1.f, j9.o, ov0Var2, 6);
                    int iHashCode9 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL9 = ov0Var2.l();
                    dv1 dv1VarH10 = xp1.H(ov0Var2, dv1VarE);
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, ghVar3, kk2VarA6);
                    q73.h(ov0Var2, ghVar4, l72VarL9);
                    az2.s(iHashCode9, ov0Var2, ghVar2, ov0Var2, waVar3);
                    q73.h(ov0Var2, ghVar7, dv1VarH10);
                    n51.j(this.l, null, false, null, null, null, sb.I, ov0Var2, 805306368, 510);
                    gh0.h(ov0Var2, iw2.o(av1Var, 8.0f));
                    n51.a(au0Var, null, false, cj2.a(8.0f), hu.a(j2, 0L, 0L, 0L, ov0Var2, 14), null, null, null, sb.J, ov0Var2, 805306368, 486);
                    ov0Var2.p(true);
                    ov0Var2.p(true);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ fj2(AppState appState, lu0 lu0Var, lu0 lu0Var2, lu0 lu0Var3, au0 au0Var, au0 au0Var2, au0 au0Var3, au0 au0Var4, au0 au0Var5, au0 au0Var6, au0 au0Var7) {
        this.f = appState;
        this.m = lu0Var;
        this.n = lu0Var2;
        this.o = lu0Var3;
        this.g = au0Var;
        this.h = au0Var2;
        this.i = au0Var3;
        this.j = au0Var4;
        this.k = au0Var5;
        this.l = au0Var6;
        this.p = au0Var7;
    }
}
