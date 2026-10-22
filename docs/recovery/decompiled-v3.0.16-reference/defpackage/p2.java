package defpackage;

import com.vincenthzr.locationspoofer.MainActivity;
import com.vincenthzr.locationspoofer.data.cloud.MembershipPlan;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import com.vincenthzr.locationspoofer.data.model.ImportExportCounts;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class p2 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ p2(xg3 xg3Var, ul1 ul1Var, boolean z, au0 au0Var, int i) {
        this.e = 14;
        this.g = xg3Var;
        this.i = ul1Var;
        this.f = z;
        this.h = au0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        float fIntBitsToFloat;
        AppState appState;
        av1 av1Var;
        boolean z;
        lr2 lr2Var;
        boolean z2;
        int i;
        long j;
        int i2 = this.e;
        c30 c30Var = d30.a;
        av1 av1Var2 = av1.a;
        boolean z3 = this.f;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.h;
        Object obj4 = this.i;
        Object obj5 = this.g;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                xq1.h((String) obj5, this.f, (au0) obj3, (p10) obj4, (f30) obj, wc0.m0(3073));
                return mf3Var;
            case 1:
                ((Integer) obj2).getClass();
                ji2.t(this.f, (String) obj5, (au0) obj3, (pu0) obj4, (f30) obj, wc0.m0(385));
                return mf3Var;
            case 2:
                j90 j90Var = (j90) obj5;
                s52 s52Var = (s52) obj3;
                s03 s03Var = (s03) obj4;
                cw2 cw2Var = (cw2) obj;
                if (z3) {
                    fIntBitsToFloat = nd.b(s03Var) + (s52Var.g() * (j90Var.b() + 0.5f));
                } else {
                    fIntBitsToFloat = (Float.intBitsToFloat((int) (cw2Var.a >> 32)) - (s52Var.g() * (j90Var.b() + 0.5f))) + nd.b(s03Var);
                }
                return new c12((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cw2Var.a & 4294967295L)) / 2.0f)) & 4294967295L));
            case 3:
                ((Integer) obj2).getClass();
                ks.D((AppInfoItem) obj4, (String) obj5, this.f, (au0) obj3, (f30) obj, wc0.m0(1));
                return mf3Var;
            case 4:
                AppState appState2 = (AppState) obj5;
                ul1 ul1Var = (ul1) obj3;
                lr2 lr2Var2 = (lr2) obj4;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                or orVar = j9.o;
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                    return mf3Var;
                }
                dv1 dv1VarD = zm3.D(av1Var2, 14.0f);
                yz yzVarA = wz.a(new jo(8.0f, true, new fo(0)), j9.r, ov0Var, 6);
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
                if (z3) {
                    appState = appState2;
                    av1Var = av1Var2;
                    z = false;
                    lr2Var = lr2Var2;
                    ov0Var.c0(-1217684911);
                } else {
                    ov0Var.c0(-1216604282);
                    kk2 kk2VarA = jk2.a(new jo(8.0f, true, new fo(0)), orVar, ov0Var, 6);
                    int iHashCode2 = Long.hashCode(ov0Var.T);
                    l72 l72VarL2 = ov0Var.l();
                    av1Var = av1Var2;
                    appState = appState2;
                    dv1 dv1VarH2 = xp1.H(ov0Var, av1Var);
                    ov0Var.g0();
                    lr2Var = lr2Var2;
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, kk2VarA);
                    q73.h(ov0Var, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH2);
                    int i3 = 1;
                    boolean z4 = !appState.isRouteCollection();
                    boolean zH = ov0Var.h(ul1Var);
                    Object objQ = ov0Var.Q();
                    if (zH || objQ == c30Var) {
                        objQ = new m6(ul1Var, i3);
                        ov0Var.m0(objQ);
                    }
                    p10 p10Var = da0.c;
                    lk2 lk2Var = lk2.a;
                    ix.b(z4, (au0) objQ, p10Var, lk2.a(lk2Var, av1Var, 1.0f), false, null, null, null, null, ov0Var, 384, 4080);
                    boolean zIsRouteCollection = appState.isRouteCollection();
                    boolean zH2 = ov0Var.h(ul1Var);
                    Object objQ2 = ov0Var.Q();
                    if (zH2 || objQ2 == c30Var) {
                        objQ2 = new m6(ul1Var, 2);
                        ov0Var.m0(objQ2);
                    }
                    ix.b(zIsRouteCollection, (au0) objQ2, da0.d, lk2.a(lk2Var, av1Var, 1.0f), false, null, null, null, null, ov0Var, 384, 4080);
                    ov0Var.p(true);
                    z = false;
                }
                ov0Var.p(z);
                if (appState.isRouteCollection()) {
                    ov0Var.c0(-1215934868);
                    String strN = ke0.N(appState.isDrawingCollectionRoute() ? 2131624303 : 2131624297, ov0Var);
                    hh0 hh0Var = le3.a;
                    s83.b(strN, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(hh0Var)).l, ov0Var, 0, 0, 131070);
                    if (appState.isDrawingCollectionRoute()) {
                        ov0Var.c0(-1215710490);
                        s83.b(ke0.O(2131624976, new Object[]{Integer.valueOf(appState.getCollectionRoutePoints().size())}, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(hh0Var)).l, ov0Var, 0, 0, 131070);
                        kk2 kk2VarA2 = jk2.a(new jo(6.0f, true, new fo(0)), orVar, ov0Var, 6);
                        int iHashCode3 = Long.hashCode(ov0Var.T);
                        l72 l72VarL3 = ov0Var.l();
                        dv1 dv1VarH3 = xp1.H(ov0Var, av1Var);
                        ov0Var.g0();
                        if (ov0Var.S) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar, kk2VarA2);
                        q73.h(ov0Var, ghVar2, l72VarL3);
                        az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
                        q73.h(ov0Var, ghVar4, dv1VarH3);
                        boolean z5 = !appState.getCollectionRoutePoints().isEmpty();
                        boolean zH3 = ov0Var.h(ul1Var);
                        Object objQ3 = ov0Var.Q();
                        if (zH3 || objQ3 == c30Var) {
                            t4 t4Var = new t4(0, ul1Var, am1.class, "undoCollectionRoutePoint", "undoCollectionRoutePoint(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 12);
                            ov0Var.m0(t4Var);
                            objQ3 = t4Var;
                        }
                        n51.j((au0) ((o81) objQ3), null, z5, null, null, null, da0.e, ov0Var, 805306368, 506);
                        wb1 wb1Var = new wb1(1.0f, true);
                        lr2 lr2Var3 = lr2Var;
                        AppState appState3 = appState;
                        boolean zH4 = ov0Var.h(lr2Var3) | ov0Var.h(appState3) | ov0Var.h(ul1Var);
                        Object objQ4 = ov0Var.Q();
                        if (zH4 || objQ4 == c30Var) {
                            objQ4 = new vy(lr2Var3, appState3, ul1Var);
                            ov0Var.m0(objQ4);
                        }
                        n51.a((au0) objQ4, wb1Var, false, null, null, null, null, null, da0.f, ov0Var, 805306368, 508);
                        boolean z6 = appState3.getCollectionRoutePoints().size() >= 2;
                        boolean zH5 = ov0Var.h(ul1Var);
                        Object objQ5 = ov0Var.Q();
                        if (zH5 || objQ5 == c30Var) {
                            t4 t4Var2 = new t4(0, ul1Var, am1.class, "finishCollectionRouteDrawing", "finishCollectionRouteDrawing(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 13);
                            ov0Var.m0(t4Var2);
                            objQ5 = t4Var2;
                        }
                        n51.j((au0) ((o81) objQ5), null, z6, null, null, null, da0.g, ov0Var, 805306368, 506);
                        ov0Var.p(true);
                        z2 = false;
                        ov0Var.p(false);
                        appState = appState3;
                    } else {
                        AppState appState4 = appState;
                        if (z3) {
                            appState = appState4;
                            z2 = false;
                            i = -1217684911;
                            ov0Var.c0(-1217684911);
                            ov0Var.p(false);
                        } else {
                            ov0Var.c0(-1214497646);
                            u92 u92Var = am1.i;
                            dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                            kk2 kk2VarA3 = jk2.a(u92Var, orVar, ov0Var, 6);
                            int iHashCode4 = Long.hashCode(ov0Var.T);
                            l72 l72VarL4 = ov0Var.l();
                            dv1 dv1VarH4 = xp1.H(ov0Var, dv1VarE);
                            ov0Var.g0();
                            appState = appState4;
                            if (ov0Var.S) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar, kk2VarA3);
                            q73.h(ov0Var, ghVar2, l72VarL4);
                            az2.s(iHashCode4, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH4);
                            s83.b(ke0.O(2131624976, new Object[]{Integer.valueOf(appState.getCollectionRoutePoints().size())}, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(hh0Var)).l, ov0Var, 0, 0, 131070);
                            boolean zH6 = ov0Var.h(ul1Var);
                            Object objQ6 = ov0Var.Q();
                            if (zH6 || objQ6 == c30Var) {
                                t4 t4Var3 = new t4(0, ul1Var, am1.class, "drawCollectionRoute", "drawCollectionRoute(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 14);
                                ov0Var.m0(t4Var3);
                                objQ6 = t4Var3;
                            }
                            n51.j((au0) ((o81) objQ6), null, false, null, null, new b52(0.0f, 0.0f, 0.0f, 0.0f), da0.h, ov0Var, 817889280, 382);
                            ov0Var.p(true);
                            z2 = false;
                            ov0Var.p(false);
                        }
                    }
                    i = -1217684911;
                } else {
                    z2 = false;
                    i = -1217684911;
                    ov0Var.c0(-1217684911);
                }
                ov0Var.p(z2);
                if (appState.isRouteCollection() && appState.isDrawingCollectionRoute()) {
                    ov0Var.c0(i);
                } else {
                    ov0Var.c0(-1213859666);
                    boolean z7 = !appState.isStoppingCollection();
                    boolean zH7 = ov0Var.h(ul1Var);
                    Object objQ7 = ov0Var.Q();
                    if (zH7 || objQ7 == c30Var) {
                        t4 t4Var4 = new t4(0, ul1Var, on1.class, "toggleContinuousScanning", "toggleContinuousScanning(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 15);
                        ov0Var.m0(t4Var4);
                        objQ7 = t4Var4;
                    }
                    o81 o81Var = (o81) objQ7;
                    dv1 dv1VarG = iw2.g(iw2.e(av1Var, 1.0f), 48.0f);
                    b52 b52Var = hu.a;
                    if (appState.isContinuousScanning()) {
                        ov0Var.c0(-593335562);
                        j = ((kz) ov0Var.j(mz.a)).w;
                        ov0Var.p(false);
                    } else {
                        ov0Var.c0(-593335204);
                        ov0Var.p(false);
                        j = bk.h;
                    }
                    n51.a((au0) o81Var, dv1VarG, z7, null, hu.a(j, 0L, 0L, 0L, ov0Var, 14), null, null, null, sb.a0(1535776660, new n6(appState, 1), ov0Var), ov0Var, 805306416, 488);
                    z2 = false;
                }
                ov0Var.p(z2);
                ov0Var.p(true);
                return mf3Var;
            case Logger.WARN /* 5 */:
                pu0 pu0Var = (pu0) obj5;
                ey1 ey1Var = (ey1) obj3;
                ey1 ey1Var2 = (ey1) obj4;
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean z8 = (l13.k0((String) ey1Var.getValue()) || z3) ? false : true;
                    boolean zF = ov0Var2.f(pu0Var) | ov0Var2.f(ey1Var) | ov0Var2.f(ey1Var2);
                    Object objQ8 = ov0Var2.Q();
                    if (zF || objQ8 == c30Var) {
                        objQ8 = new q5(pu0Var, ey1Var, ey1Var2, 1);
                        ov0Var2.m0(objQ8);
                    }
                    n51.a((au0) objQ8, null, z8, null, null, null, null, null, sb.a0(-1818282187, new z5(3, z3), ov0Var2), ov0Var2, 805306368, 506);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ((Integer) obj2).getClass();
                hd0.d(this.f, (ImportExportCounts) obj5, (lu0) obj4, (au0) obj3, (f30) obj, wc0.m0(3079));
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return MainActivity.onCreate$lambda$10$lambda$9$lambda$8((kz) obj5, this.f, (MainActivity) obj3, (s03) obj4, (f30) obj, ((Integer) obj2).intValue());
            case 8:
                ((Integer) obj2).getClass();
                wc0.j((MembershipPlan) obj5, this.f, (au0) obj3, (dv1) obj4, (f30) obj, wc0.m0(1));
                return mf3Var;
            case mc0.b /* 9 */:
                List list = (List) obj5;
                au0 au0Var = (au0) obj3;
                au0 au0Var2 = (au0) obj4;
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sb.C(iw2.q(iw2.e(av1Var2, 0.88f)), cj2.a(24.0f), ym3.t(((kz) ov0Var3.j(mz.a)).p, 0L, ov0Var3, 0, 14), ym3.u(62, 8.0f), sb.a0(981607243, new j5(list, au0Var, z3, au0Var2), ov0Var3), ov0Var3, 196614, 16);
                } else {
                    ov0Var3.W();
                }
                return mf3Var;
            case mc0.c /* 10 */:
                lu0 lu0Var = (lu0) obj3;
                String str = (String) obj5;
                String str2 = (String) obj4;
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dv1 dv1VarE2 = zm3.E(iw2.e(av1Var2, 1.0f), 14.0f, 10.0f);
                    kk2 kk2VarA4 = jk2.a(am1.i, j9.p, ov0Var4, 54);
                    int iHashCode5 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL5 = ov0Var4.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var4, dv1VarE2);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var2);
                    } else {
                        ov0Var4.p0();
                    }
                    gh ghVar5 = v20.e;
                    q73.h(ov0Var4, ghVar5, kk2VarA4);
                    gh ghVar6 = v20.d;
                    q73.h(ov0Var4, ghVar6, l72VarL5);
                    Integer numValueOf2 = Integer.valueOf(iHashCode5);
                    gh ghVar7 = v20.f;
                    q73.h(ov0Var4, ghVar7, numValueOf2);
                    wa waVar2 = v20.g;
                    q73.g(ov0Var4, waVar2);
                    gh ghVar8 = v20.c;
                    q73.h(ov0Var4, ghVar8, dv1VarH5);
                    wb1 wb1Var2 = new wb1(1.0f, true);
                    yz yzVarA2 = wz.a(am1.g, j9.r, ov0Var4, 0);
                    int iHashCode6 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL6 = ov0Var4.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var4, wb1Var2);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var2);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar5, yzVarA2);
                    q73.h(ov0Var4, ghVar6, l72VarL6);
                    az2.s(iHashCode6, ov0Var4, ghVar7, ov0Var4, waVar2);
                    q73.h(ov0Var4, ghVar8, dv1VarH6);
                    long jC = v63.c(14);
                    jr0 jr0Var = jr0.j;
                    hh0 hh0Var2 = mz.a;
                    s83.b(str, null, ((kz) ov0Var4.j(hh0Var2)).q, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597440, 0, 262058);
                    if (str2 != null) {
                        ov0Var4.c0(-801431724);
                        s83.b(str2, null, hz.c(0.55f, ((kz) ov0Var4.j(hh0Var2)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262122);
                    } else {
                        ov0Var4.c0(-839324419);
                    }
                    ov0Var4.p(false);
                    ov0Var4.p(true);
                    b43.a(this.f, lu0Var, null, false, mc0.m(hz.c, bk.g, 0L, 0L, 0L, 0L, ov0Var4, 65532), ov0Var4, 0, 92);
                    ov0Var4.p(true);
                } else {
                    ov0Var4.W();
                }
                return mf3Var;
            case 11:
                ((Integer) obj2).getClass();
                vd0.c((String) obj5, this.f, (lu0) obj4, (au0) obj3, (f30) obj, wc0.m0(1));
                return mf3Var;
            case mc0.d /* 12 */:
                ((Integer) obj2).getClass();
                ig0.d((SavedLocation) obj5, this.f, (au0) obj3, (au0) obj4, (f30) obj, wc0.m0(1));
                return mf3Var;
            case 13:
                ((Integer) obj2).getClass();
                n51.i((GithubRelease) obj5, this.f, (og3) obj4, (au0) obj3, (f30) obj, wc0.m0(3457));
                return mf3Var;
            default:
                ((Integer) obj2).getClass();
                n51.k((xg3) obj5, (ul1) obj4, this.f, (au0) obj3, (f30) obj, wc0.m0(1));
                return mf3Var;
        }
    }

    public /* synthetic */ p2(kz kzVar, boolean z, MainActivity mainActivity, ey1 ey1Var) {
        this.e = 7;
        this.g = kzVar;
        this.f = z;
        this.h = mainActivity;
        this.i = ey1Var;
    }

    public /* synthetic */ p2(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.e = i;
        this.f = z;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public /* synthetic */ p2(AppInfoItem appInfoItem, String str, boolean z, au0 au0Var, int i) {
        this.e = 3;
        this.i = appInfoItem;
        this.g = str;
        this.f = z;
        this.h = au0Var;
    }

    public /* synthetic */ p2(Object obj, boolean z, au0 au0Var, Object obj2, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.f = z;
        this.h = au0Var;
        this.i = obj2;
    }

    public /* synthetic */ p2(Object obj, boolean z, Object obj2, au0 au0Var, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.f = z;
        this.i = obj2;
        this.h = au0Var;
    }

    public /* synthetic */ p2(List list, au0 au0Var, boolean z, au0 au0Var2) {
        this.e = 9;
        this.g = list;
        this.h = au0Var;
        this.f = z;
        this.i = au0Var2;
    }

    public /* synthetic */ p2(boolean z, lu0 lu0Var, String str, String str2) {
        this.e = 10;
        this.f = z;
        this.h = lu0Var;
        this.g = str;
        this.i = str2;
    }

    public /* synthetic */ p2(boolean z, ImportExportCounts importExportCounts, lu0 lu0Var, au0 au0Var, int i) {
        this.e = 6;
        this.f = z;
        this.g = importExportCounts;
        this.i = lu0Var;
        this.h = au0Var;
    }

    public /* synthetic */ p2(boolean z, String str, au0 au0Var, pu0 pu0Var, int i) {
        this.e = 1;
        this.f = z;
        this.g = str;
        this.h = au0Var;
        this.i = pu0Var;
    }
}
