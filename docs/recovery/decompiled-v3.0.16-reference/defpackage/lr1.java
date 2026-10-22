package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.MembershipCatalog;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class lr1 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ lr1(GithubRelease githubRelease, au0 au0Var, au0 au0Var2, lu0 lu0Var, int i) {
        this.e = 8;
        this.h = githubRelease;
        this.f = au0Var;
        this.g = au0Var2;
        this.i = lu0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        long jC;
        float f;
        is isVarH;
        long jC2;
        float f2;
        is isVarH2;
        int i = this.e;
        av1 av1Var = av1.a;
        c30 c30Var = d30.a;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.i;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                au0 au0Var = (au0) obj5;
                is1 is1Var = (is1) obj6;
                au0 au0Var2 = (au0) obj4;
                s03 s03Var = (s03) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    fn0 fn0Var = iw2.c;
                    hh0 hh0Var = mz.a;
                    dv1 dv1VarK = xp1.k(fn0Var, ((kz) ov0Var.j(hh0Var)).n, o51.p0);
                    ho hoVar = am1.g;
                    nr nrVar = j9.r;
                    yz yzVarA = wz.a(hoVar, nrVar, ov0Var, 0);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1VarK);
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
                    wc0.c(ke0.N(2131624697, ov0Var), au0Var, ov0Var, 0);
                    dv1 dv1VarJ = ji2.J(zm3.D(zm3.P(fn0Var, zm3.O(ov0Var), true), 16.0f));
                    yz yzVarA2 = wz.a(new jo(16.0f, true, new fo(0)), nrVar, ov0Var, 6);
                    int iHashCode2 = Long.hashCode(ov0Var.T);
                    l72 l72VarL2 = ov0Var.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarJ);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, yzVarA2);
                    q73.h(ov0Var, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH2);
                    s83.b(ke0.N(2131624705, ov0Var), null, ((kz) ov0Var.j(hh0Var)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262138);
                    sb.C(iw2.e(av1Var, 1.0f), null, null, null, sb.a0(903343035, new au(s03Var, 6), ov0Var), ov0Var, 196614, 30);
                    MembershipCatalog membershipCatalog = ((cs1) s03Var.getValue()).a;
                    if (membershipCatalog == null) {
                        ov0Var.c0(628790243);
                    } else {
                        ov0Var.c0(628790244);
                        s83.b(membershipCatalog.getQuotaNote(), null, ((kz) ov0Var.j(hh0Var)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).l, ov0Var, 0, 0, 131066);
                    }
                    ov0Var.p(false);
                    if (((cs1) s03Var.getValue()).d) {
                        ov0Var.c0(1959950789);
                        vc2.a(new by0(j9.s), bk.g, 0.0f, 0L, 0, 0.0f, ov0Var, 48, 60);
                        z = false;
                    } else {
                        z = false;
                        ov0Var.c0(601520629);
                    }
                    ov0Var.p(z);
                    if (((cs1) s03Var.getValue()).e != null) {
                        ov0Var.c0(1959954817);
                        boolean zH = ov0Var.h(is1Var);
                        Object objQ = ov0Var.Q();
                        if (zH || objQ == c30Var) {
                            objQ = new t4(0, is1Var, is1.class, "load", "load()V", 0, 27);
                            ov0Var.m0(objQ);
                        }
                        n51.j((au0) ((o81) objQ), null, false, null, null, null, xq1.w, ov0Var, 805306368, 510);
                        z2 = false;
                    } else {
                        z2 = false;
                        ov0Var.c0(601520629);
                    }
                    ov0Var.p(z2);
                    n51.a(au0Var2, iw2.h(iw2.e(av1Var, 1.0f), 50.0f, 0.0f, 2), false, null, null, null, null, null, xq1.x, ov0Var, 805306416, 508);
                    ov0Var.p(true);
                    ov0Var.p(true);
                }
                break;
            case 1:
                l6 l6Var = (l6) obj5;
                ay ayVar = (ay) obj4;
                Context context = (Context) obj6;
                ey1 ey1Var = (ey1) obj3;
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    boolean zH2 = ov0Var2.h(l6Var) | ov0Var2.h(ayVar) | ov0Var2.h(context);
                    Object objQ2 = ov0Var2.Q();
                    if (zH2 || objQ2 == c30Var) {
                        q2 q2Var = new q2(l6Var, ey1Var, ayVar, context, 2);
                        ov0Var2.m0(q2Var);
                        objQ2 = q2Var;
                    }
                    n51.j((au0) objQ2, null, false, null, null, null, o51.L, ov0Var2, 805306368, 510);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ym3.a((ul1) obj6, (AppState) obj3, (au0) obj5, (au0) obj4, (f30) obj, wc0.m0(385));
                break;
            case 3:
                dv1 dv1Var = (dv1) obj5;
                ey1 ey1Var2 = (ey1) obj4;
                p10 p10Var = (p10) obj6;
                vq vqVar = (vq) obj3;
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ov0Var3.W();
                } else {
                    Object objQ3 = ov0Var3.Q();
                    if (objQ3 == c30Var) {
                        objQ3 = new f4(ey1Var2, 12);
                        ov0Var3.m0(objQ3);
                    }
                    dv1 dv1VarG = k22.G(dv1Var, (lu0) objQ3);
                    er1 er1VarC = ws.c(j9.f, true);
                    int iHashCode3 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL3 = ov0Var3.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var3, dv1VarG);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var2);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, v20.e, er1VarC);
                    q73.h(ov0Var3, v20.d, l72VarL3);
                    q73.h(ov0Var3, v20.f, Integer.valueOf(iHashCode3));
                    q73.g(ov0Var3, v20.g);
                    q73.h(ov0Var3, v20.c, dv1VarH3);
                    p10Var.invoke(ov0Var3, 0);
                    Object objQ4 = ov0Var3.Q();
                    if (objQ4 == c30Var) {
                        objQ4 = new s2(ey1Var2, 19);
                        ov0Var3.m0(objQ4);
                    }
                    vqVar.b((au0) objQ4, ov0Var3, 6);
                    ov0Var3.p(true);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                sb.D((ul1) obj5, (AppState) obj4, (lr2) obj6, (dv1) obj3, (f30) obj, wc0.m0(1));
                break;
            case Logger.WARN /* 5 */:
                ((Integer) obj2).getClass();
                wo0.b((MotionController.State) obj4, (j52) obj6, (dv1) obj3, (au0) obj5, (f30) obj, wc0.m0(3073));
                break;
            case Logger.ERROR /* 6 */:
                ((Integer) obj2).getClass();
                mh0.c((au0) obj5, (dv1) obj4, (wc1) obj6, (pd1) obj3, (f30) obj, wc0.m0(1));
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                final AppState appState = (AppState) obj5;
                lu0 lu0Var = (lu0) obj4;
                lu0 lu0Var2 = (lu0) obj6;
                lu0 lu0Var3 = (lu0) obj3;
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ov0Var4.W();
                } else {
                    dv1 dv1VarE = zm3.E(iw2.e(av1Var, 1.0f), 14.0f, 10.0f);
                    jo joVar = new jo(8.0f, true, new fo(0));
                    nr nrVar2 = j9.r;
                    yz yzVarA3 = wz.a(joVar, nrVar2, ov0Var4, 6);
                    int iHashCode4 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL4 = ov0Var4.l();
                    dv1 dv1VarH4 = xp1.H(ov0Var4, dv1VarE);
                    w20.b.getClass();
                    x30 x30Var3 = v20.b;
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var3);
                    } else {
                        ov0Var4.p0();
                    }
                    gh ghVar5 = v20.e;
                    q73.h(ov0Var4, ghVar5, yzVarA3);
                    gh ghVar6 = v20.d;
                    q73.h(ov0Var4, ghVar6, l72VarL4);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    gh ghVar7 = v20.f;
                    q73.h(ov0Var4, ghVar7, numValueOf2);
                    wa waVar2 = v20.g;
                    q73.g(ov0Var4, waVar2);
                    gh ghVar8 = v20.c;
                    q73.h(ov0Var4, ghVar8, dv1VarH4);
                    dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                    or orVar = j9.p;
                    u92 u92Var = am1.i;
                    kk2 kk2VarA = jk2.a(u92Var, orVar, ov0Var4, 54);
                    int iHashCode5 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL5 = ov0Var4.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var4, dv1VarE2);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var3);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar5, kk2VarA);
                    q73.h(ov0Var4, ghVar6, l72VarL5);
                    az2.s(iHashCode5, ov0Var4, ghVar7, ov0Var4, waVar2);
                    q73.h(ov0Var4, ghVar8, dv1VarH5);
                    lk2 lk2Var = lk2.a;
                    dv1 dv1VarA = lk2.a(lk2Var, av1Var, 1.0f);
                    ho hoVar2 = am1.g;
                    yz yzVarA4 = wz.a(hoVar2, nrVar2, ov0Var4, 0);
                    int iHashCode6 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL6 = ov0Var4.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var4, dv1VarA);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var3);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar5, yzVarA4);
                    q73.h(ov0Var4, ghVar6, l72VarL6);
                    az2.s(iHashCode6, ov0Var4, ghVar7, ov0Var4, waVar2);
                    q73.h(ov0Var4, ghVar8, dv1VarH6);
                    String strN = ke0.N(2131625053, ov0Var4);
                    long jC3 = v63.c(14);
                    jr0 jr0Var = jr0.j;
                    hh0 hh0Var2 = mz.a;
                    s83.b(strN, null, ((kz) ov0Var4.j(hh0Var2)).q, jC3, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597440, 0, 262058);
                    s83.b(ke0.N(2131625054, ov0Var4), null, hz.c(0.55f, ((kz) ov0Var4.j(hh0Var2)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262122);
                    ov0Var4.p(true);
                    boolean enableStepSimulation = appState.getEnableStepSimulation();
                    long j2 = hz.c;
                    long j3 = bk.g;
                    b43.a(enableStepSimulation, lu0Var, null, false, mc0.m(j2, j3, 0L, 0L, 0L, 0L, ov0Var4, 65532), ov0Var4, 0, 92);
                    ov0 ov0Var5 = ov0Var4;
                    ov0Var5.p(true);
                    if (appState.getEnableStepSimulation()) {
                        ov0Var5.c0(705600930);
                        s83.b(ke0.N(2131624914, ov0Var5), null, j3, v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24960, 0, 262122);
                        dv1 dv1VarE3 = iw2.e(av1Var, 1.0f);
                        jo joVar2 = new jo(8.0f, true, new fo(0));
                        or orVar2 = j9.o;
                        kk2 kk2VarA2 = jk2.a(joVar2, orVar2, ov0Var5, 6);
                        int iHashCode7 = Long.hashCode(ov0Var5.T);
                        l72 l72VarL7 = ov0Var5.l();
                        dv1 dv1VarH7 = xp1.H(ov0Var5, dv1VarE3);
                        ov0Var5.g0();
                        if (ov0Var5.S) {
                            ov0Var5.k(x30Var3);
                        } else {
                            ov0Var5.p0();
                        }
                        q73.h(ov0Var5, ghVar5, kk2VarA2);
                        q73.h(ov0Var5, ghVar6, l72VarL7);
                        az2.s(iHashCode7, ov0Var5, ghVar7, ov0Var5, waVar2);
                        q73.h(ov0Var5, ghVar8, dv1VarH7);
                        bj2 bj2VarA = cj2.a(10.0f);
                        if (appState.isAutoCadence()) {
                            ov0Var5.c0(-1845064553);
                            ov0Var5.p(false);
                            j = j3;
                            jC = hz.c(0.15f, j);
                        } else {
                            j = j3;
                            ov0Var5.c0(-1845062356);
                            jC = hz.c(0.5f, ((kz) ov0Var5.j(hh0Var2)).r);
                            ov0Var5.p(false);
                        }
                        if (appState.isAutoCadence()) {
                            f = 1.0f;
                            isVarH = da0.h(1.0f, j);
                        } else {
                            f = 1.0f;
                            isVarH = null;
                        }
                        dv1 dv1VarA2 = lk2.a(lk2Var, av1Var, f);
                        boolean zF = ov0Var5.f(lu0Var2);
                        Object objQ5 = ov0Var5.Q();
                        if (zF || objQ5 == c30Var) {
                            objQ5 = new hl1(9, lu0Var2);
                            ov0Var5.m0(objQ5);
                        }
                        final int i2 = 0;
                        e33.a(zm3.m(dv1VarA2, false, null, (au0) objQ5, 15), bj2VarA, jC, 0L, 0.0f, 0.0f, isVarH, sb.a0(254962015, new pu0() { // from class: lj2
                            @Override // defpackage.pu0
                            public final Object invoke(Object obj7, Object obj8) {
                                long j4;
                                long j5;
                                int i3 = i2;
                                mf3 mf3Var2 = mf3.a;
                                av1 av1Var2 = av1.a;
                                AppState appState2 = appState;
                                switch (i3) {
                                    case 0:
                                        f30 f30Var5 = (f30) obj7;
                                        int iIntValue5 = ((Integer) obj8).intValue();
                                        ov0 ov0Var6 = (ov0) f30Var5;
                                        if (!ov0Var6.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                            ov0Var6.W();
                                        } else {
                                            String strN2 = ke0.N(2131625017, ov0Var6);
                                            long jC4 = v63.c(12);
                                            jr0 jr0Var2 = appState2.isAutoCadence() ? jr0.j : jr0.g;
                                            if (appState2.isAutoCadence()) {
                                                ov0Var6.c0(205373545);
                                                ov0Var6.p(false);
                                                j4 = bk.g;
                                            } else {
                                                ov0Var6.c0(205374888);
                                                j4 = ((kz) ov0Var6.j(mz.a)).q;
                                                ov0Var6.p(false);
                                            }
                                            s83.b(strN2, zm3.F(av1Var2, 0.0f, 6.0f, 1), j4, jC4, jr0Var2, null, 0L, null, new m53(3), 0L, 0, false, 0, 0, null, ov0Var6, 24624, 0, 261032);
                                        }
                                        break;
                                    default:
                                        f30 f30Var6 = (f30) obj7;
                                        int iIntValue6 = ((Integer) obj8).intValue();
                                        ov0 ov0Var7 = (ov0) f30Var6;
                                        if (!ov0Var7.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                            ov0Var7.W();
                                        } else {
                                            String strN3 = ke0.N(2131624368, ov0Var7);
                                            long jC5 = v63.c(12);
                                            jr0 jr0Var3 = !appState2.isAutoCadence() ? jr0.j : jr0.g;
                                            if (appState2.isAutoCadence()) {
                                                ov0Var7.c0(-377834081);
                                                j5 = ((kz) ov0Var7.j(mz.a)).q;
                                                ov0Var7.p(false);
                                            } else {
                                                ov0Var7.c0(-377835424);
                                                ov0Var7.p(false);
                                                j5 = bk.g;
                                            }
                                            s83.b(strN3, zm3.F(av1Var2, 0.0f, 6.0f, 1), j5, jC5, jr0Var3, null, 0L, null, new m53(3), 0L, 0, false, 0, 0, null, ov0Var7, 24624, 0, 261032);
                                        }
                                        break;
                                }
                                return mf3Var2;
                            }
                        }, ov0Var5), ov0Var5, 12582912, 56);
                        bj2 bj2VarA2 = cj2.a(10.0f);
                        if (appState.isAutoCadence()) {
                            ov0Var5.c0(-1845012084);
                            jC2 = hz.c(0.5f, ((kz) ov0Var5.j(hh0Var2)).r);
                            ov0Var5.p(false);
                        } else {
                            ov0Var5.c0(-1845014281);
                            ov0Var5.p(false);
                            jC2 = hz.c(0.15f, j);
                        }
                        long j4 = jC2;
                        if (appState.isAutoCadence()) {
                            f2 = 1.0f;
                            isVarH2 = null;
                        } else {
                            f2 = 1.0f;
                            isVarH2 = da0.h(1.0f, j);
                        }
                        dv1 dv1VarA3 = lk2.a(lk2Var, av1Var, f2);
                        boolean zF2 = ov0Var5.f(lu0Var2);
                        Object objQ6 = ov0Var5.Q();
                        if (zF2 || objQ6 == c30Var) {
                            objQ6 = new hl1(10, lu0Var2);
                            ov0Var5.m0(objQ6);
                        }
                        final int i3 = 1;
                        e33.a(zm3.m(dv1VarA3, false, null, (au0) objQ6, 15), bj2VarA2, j4, 0L, 0.0f, 0.0f, isVarH2, sb.a0(-938939626, new pu0() { // from class: lj2
                            @Override // defpackage.pu0
                            public final Object invoke(Object obj7, Object obj8) {
                                long j5;
                                long j6;
                                int i4 = i3;
                                mf3 mf3Var2 = mf3.a;
                                av1 av1Var2 = av1.a;
                                AppState appState2 = appState;
                                switch (i4) {
                                    case 0:
                                        f30 f30Var5 = (f30) obj7;
                                        int iIntValue5 = ((Integer) obj8).intValue();
                                        ov0 ov0Var6 = (ov0) f30Var5;
                                        if (!ov0Var6.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                            ov0Var6.W();
                                        } else {
                                            String strN2 = ke0.N(2131625017, ov0Var6);
                                            long jC4 = v63.c(12);
                                            jr0 jr0Var2 = appState2.isAutoCadence() ? jr0.j : jr0.g;
                                            if (appState2.isAutoCadence()) {
                                                ov0Var6.c0(205373545);
                                                ov0Var6.p(false);
                                                j5 = bk.g;
                                            } else {
                                                ov0Var6.c0(205374888);
                                                j5 = ((kz) ov0Var6.j(mz.a)).q;
                                                ov0Var6.p(false);
                                            }
                                            s83.b(strN2, zm3.F(av1Var2, 0.0f, 6.0f, 1), j5, jC4, jr0Var2, null, 0L, null, new m53(3), 0L, 0, false, 0, 0, null, ov0Var6, 24624, 0, 261032);
                                        }
                                        break;
                                    default:
                                        f30 f30Var6 = (f30) obj7;
                                        int iIntValue6 = ((Integer) obj8).intValue();
                                        ov0 ov0Var7 = (ov0) f30Var6;
                                        if (!ov0Var7.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                            ov0Var7.W();
                                        } else {
                                            String strN3 = ke0.N(2131624368, ov0Var7);
                                            long jC5 = v63.c(12);
                                            jr0 jr0Var3 = !appState2.isAutoCadence() ? jr0.j : jr0.g;
                                            if (appState2.isAutoCadence()) {
                                                ov0Var7.c0(-377834081);
                                                j6 = ((kz) ov0Var7.j(mz.a)).q;
                                                ov0Var7.p(false);
                                            } else {
                                                ov0Var7.c0(-377835424);
                                                ov0Var7.p(false);
                                                j6 = bk.g;
                                            }
                                            s83.b(strN3, zm3.F(av1Var2, 0.0f, 6.0f, 1), j6, jC5, jr0Var3, null, 0L, null, new m53(3), 0L, 0, false, 0, 0, null, ov0Var7, 24624, 0, 261032);
                                        }
                                        break;
                                }
                                return mf3Var2;
                            }
                        }, ov0Var5), ov0Var5, 12582912, 56);
                        ov0Var5.p(true);
                        if (appState.isAutoCadence()) {
                            ov0Var5.c0(712169396);
                            s83.b(ke0.N(2131625018, ov0Var5), zm3.F(av1Var, 2.0f, 0.0f, 2), hz.c(0.85f, j), v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 25008, 0, 262120);
                            z3 = false;
                            ov0Var5.p(false);
                        } else {
                            ov0Var5.c0(709230751);
                            boolean zD = ov0Var5.d(appState.getStepCadenceSpm());
                            Object objQ7 = ov0Var5.Q();
                            if (zD || objQ7 == c30Var) {
                                objQ7 = new s52(appState.getStepCadenceSpm());
                                ov0Var5.m0(objQ7);
                            }
                            s52 s52Var = (s52) objQ7;
                            dv1 dv1VarE4 = zm3.E(iw2.e(av1Var, 1.0f), 2.0f, 2.0f);
                            yz yzVarA5 = wz.a(hoVar2, nrVar2, ov0Var5, 0);
                            int iHashCode8 = Long.hashCode(ov0Var5.T);
                            l72 l72VarL8 = ov0Var5.l();
                            dv1 dv1VarH8 = xp1.H(ov0Var5, dv1VarE4);
                            ov0Var5.g0();
                            if (ov0Var5.S) {
                                ov0Var5.k(x30Var3);
                            } else {
                                ov0Var5.p0();
                            }
                            q73.h(ov0Var5, ghVar5, yzVarA5);
                            q73.h(ov0Var5, ghVar6, l72VarL8);
                            az2.s(iHashCode8, ov0Var5, ghVar7, ov0Var5, waVar2);
                            q73.h(ov0Var5, ghVar8, dv1VarH8);
                            dv1 dv1VarE5 = iw2.e(av1Var, 1.0f);
                            kk2 kk2VarA3 = jk2.a(u92Var, orVar2, ov0Var5, 6);
                            int iHashCode9 = Long.hashCode(ov0Var5.T);
                            l72 l72VarL9 = ov0Var5.l();
                            dv1 dv1VarH9 = xp1.H(ov0Var5, dv1VarE5);
                            ov0Var5.g0();
                            long j5 = j;
                            if (ov0Var5.S) {
                                ov0Var5.k(x30Var3);
                            } else {
                                ov0Var5.p0();
                            }
                            q73.h(ov0Var5, ghVar5, kk2VarA3);
                            q73.h(ov0Var5, ghVar6, l72VarL9);
                            az2.s(iHashCode9, ov0Var5, ghVar7, ov0Var5, waVar2);
                            q73.h(ov0Var5, ghVar8, dv1VarH9);
                            s83.b(ke0.N(2131624987, ov0Var5), null, hz.c(0.6f, ((kz) ov0Var5.j(hh0Var2)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262122);
                            s83.b(((int) s52Var.g()) + " 步/分 (约 " + String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) s52Var.g()) / 60.0d)}, 1)) + " 步/秒)", null, j5, v63.c(12), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597824, 0, 262058);
                            ov0Var5.p(true);
                            float fG = s52Var.g();
                            boolean zF3 = ov0Var5.f(s52Var) | ov0Var5.f(lu0Var3);
                            Object objQ8 = ov0Var5.Q();
                            if (zF3 || objQ8 == c30Var) {
                                objQ8 = new u9(lu0Var3, s52Var, 1);
                                ov0Var5.m0(objQ8);
                            }
                            fy fyVar = new fy(60.0f, 240.0f);
                            sw2 sw2Var = sw2.a;
                            dx2.a(fG, (lu0) objQ8, null, false, fyVar, 179, null, sw2.d(j5, j5, ((kz) ov0Var5.j(hh0Var2)).r, ov0Var5, 1012), null, ov0Var5, 196608, 332);
                            ov0Var5 = ov0Var5;
                            ov0Var5.p(true);
                            z3 = false;
                            ov0Var5.p(false);
                        }
                    } else {
                        z3 = false;
                        ov0Var5.c0(686031901);
                    }
                    ov0Var5.p(z3);
                    ov0Var5.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                gh0.i((GithubRelease) obj6, (au0) obj5, (au0) obj4, (lu0) obj3, (f30) obj, wc0.m0(49));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ lr1(ul1 ul1Var, AppState appState, au0 au0Var, au0 au0Var2, int i) {
        this.e = 2;
        this.h = ul1Var;
        this.i = appState;
        this.f = au0Var;
        this.g = au0Var2;
    }

    public /* synthetic */ lr1(au0 au0Var, is1 is1Var, au0 au0Var2, ey1 ey1Var) {
        this.e = 0;
        this.f = au0Var;
        this.h = is1Var;
        this.g = au0Var2;
        this.i = ey1Var;
    }

    public /* synthetic */ lr1(MotionController.State state, j52 j52Var, dv1 dv1Var, au0 au0Var, int i) {
        this.e = 5;
        this.g = state;
        this.h = j52Var;
        this.i = dv1Var;
        this.f = au0Var;
    }

    public /* synthetic */ lr1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    public /* synthetic */ lr1(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.e = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }
}
