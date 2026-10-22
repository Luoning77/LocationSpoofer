package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.ContributionStatus;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class oc1 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ oc1(pu0 pu0Var, l60 l60Var, qu0 qu0Var, au0 au0Var) {
        this.e = 2;
        this.g = pu0Var;
        this.h = l60Var;
        this.i = qu0Var;
        this.f = au0Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g23 g23Var;
        dv1 dv1VarD;
        Object lhVar;
        x30 x30Var;
        x30 x30Var2;
        String strO;
        dv1 dv1Var;
        int i = this.e;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        boolean z = true;
        c30 c30Var = d30.a;
        Object obj4 = this.f;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        switch (i) {
            case 0:
                wc1 wc1Var = (wc1) obj7;
                dv1 dv1Var2 = (dv1) obj6;
                pd1 pd1Var = (pd1) obj5;
                ey1 ey1Var = (ey1) obj4;
                ql2 ql2Var = (ql2) obj;
                ((Integer) obj3).getClass();
                ov0 ov0Var = (ov0) ((f30) obj2);
                Object objQ = ov0Var.Q();
                if (objQ == c30Var) {
                    objQ = new mc1(ql2Var, new mo0(ey1Var, 2));
                    ov0Var.m0(objQ);
                }
                mc1 mc1Var = (mc1) objQ;
                Object objQ2 = ov0Var.Q();
                if (objQ2 == c30Var) {
                    objQ2 = new g23(new d31(mc1Var));
                    ov0Var.m0(objQ2);
                }
                g23 g23Var2 = (g23) objQ2;
                if (wc1Var != null) {
                    ov0Var.c0(1743490539);
                    ov0Var.c0(887527095);
                    Object obj8 = pb2.a;
                    if (obj8 != null) {
                        ov0Var.c0(1345554384);
                    } else {
                        ov0Var.c0(1345603457);
                        View view = (View) ov0Var.j(AndroidCompositionLocals_androidKt.f);
                        boolean zF = ov0Var.f(view);
                        Object objQ3 = ov0Var.Q();
                        if (zF || objQ3 == c30Var) {
                            Object tag = view.getTag(2131230803);
                            nb2 mfVar = tag instanceof nb2 ? (nb2) tag : null;
                            if (mfVar == null) {
                                mfVar = new mf(view);
                                view.setTag(2131230803, mfVar);
                            }
                            objQ3 = mfVar;
                            ov0Var.m0(objQ3);
                        }
                        obj8 = (nb2) objQ3;
                    }
                    ov0Var.p(false);
                    ov0Var.p(false);
                    Object[] objArr = {wc1Var, mc1Var, g23Var2, obj8};
                    boolean zF2 = ov0Var.f(wc1Var) | ov0Var.h(mc1Var) | ov0Var.h(g23Var2) | ov0Var.h(obj8);
                    Object objQ4 = ov0Var.Q();
                    if (zF2 || objQ4 == c30Var) {
                        g23Var = g23Var2;
                        lhVar = new lh(wc1Var, mc1Var, g23Var, obj8, 7);
                        ov0Var.m0(lhVar);
                    } else {
                        lhVar = objQ4;
                        g23Var = g23Var2;
                    }
                    oi0.d(objArr, (lu0) lhVar, ov0Var);
                    ov0Var.p(false);
                } else {
                    g23Var = g23Var2;
                    ov0Var.c0(1744076749);
                    ov0Var.p(false);
                }
                int i2 = xc1.a;
                if (wc1Var != null && (dv1VarD = dv1Var2.d(new uc3(wc1Var))) != null) {
                    dv1Var2 = dv1VarD;
                }
                boolean zF3 = ov0Var.f(mc1Var) | ov0Var.f(pd1Var);
                Object objQ5 = ov0Var.Q();
                if (zF3 || objQ5 == c30Var) {
                    objQ5 = new j2(16, mc1Var, pd1Var);
                    ov0Var.m0(objQ5);
                }
                o51.d(g23Var, dv1Var2, (pu0) objQ5, ov0Var, 8);
                return mf3Var;
            case 1:
                ContributionStatus contributionStatus = (ContributionStatus) obj7;
                ey1 ey1Var2 = (ey1) obj4;
                ey1 ey1Var3 = (ey1) obj6;
                ey1 ey1Var4 = (ey1) obj5;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var;
                if (ov0Var2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    s83.b(ke0.N(2131624871, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                    s83.b(ke0.O(2131624869, new Object[]{Integer.valueOf(contributionStatus.getMonthlyCouponCap())}, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(le3.a)).l, ov0Var2, 0, 0, 131070);
                    Object objQ6 = ov0Var2.Q();
                    if (objQ6 == c30Var) {
                        objQ6 = new h2(ey1Var2, ey1Var3, 3);
                        ov0Var2.m0(objQ6);
                    }
                    n51.a((au0) objQ6, null, !xq1.p(ey1Var4) && contributionStatus.getAvailablePoints() >= 1000, null, xq1.z(ov0Var2), null, null, null, ks.v, ov0Var2, 805306374, 490);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            case 2:
                pu0 pu0Var = (pu0) obj7;
                l60 l60Var = (l60) obj6;
                qu0 qu0Var = (qu0) obj5;
                au0 au0Var = (au0) obj4;
                k60 k60Var = (k60) obj;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((ov0) f30Var2).f(k60Var) ? 4 : 2;
                }
                ov0 ov0Var3 = (ov0) f30Var2;
                if (ov0Var3.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    String str = (String) pu0Var.invoke(ov0Var3, 0);
                    if (l13.k0(str)) {
                        s21.c("Label must not be blank");
                    }
                    l60Var.getClass();
                    ks.B.d(av1.a, str, Boolean.TRUE, k60Var, qu0Var, au0Var, ov0Var3, Integer.valueOf((iIntValue2 << 9) & 7168));
                } else {
                    ov0Var3.W();
                }
                return mf3Var;
            case 3:
                ey1 ey1Var5 = (ey1) obj4;
                ul1 ul1Var = (ul1) obj7;
                lr2 lr2Var = (lr2) obj6;
                lu0 lu0Var = (lu0) obj5;
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var4 = (ov0) f30Var3;
                if (ov0Var4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dv1 dv1VarH = iw2.h(av1Var, 0.0f, 280.0f, 1);
                    boolean zF4 = ov0Var4.f(ey1Var5) | ov0Var4.h(ul1Var) | ov0Var4.h(lr2Var) | ov0Var4.f(lu0Var);
                    Object objQ7 = ov0Var4.Q();
                    if (zF4 || objQ7 == c30Var) {
                        objQ7 = new lh(ey1Var5, ul1Var, lr2Var, lu0Var);
                        ov0Var4.m0(objQ7);
                    }
                    ke0.d(dv1VarH, null, null, null, null, null, false, null, (lu0) objQ7, ov0Var4, 6, 510);
                } else {
                    ov0Var4.W();
                }
                return mf3Var;
            case 4:
                List list = (List) obj7;
                lu0 lu0Var2 = (lu0) obj6;
                lu0 lu0Var3 = (lu0) obj5;
                au0 au0Var2 = (au0) obj4;
                f30 f30Var4 = (f30) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var5 = (ov0) f30Var4;
                if (!ov0Var5.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ov0Var5.W();
                    return mf3Var;
                }
                dv1 dv1VarD2 = zm3.D(iw2.e(av1Var, 1.0f), 20.0f);
                jo joVar = new jo(16.0f, true, new fo(0));
                nr nrVar = j9.r;
                yz yzVarA = wz.a(joVar, nrVar, ov0Var5, 6);
                int iHashCode = Long.hashCode(ov0Var5.T);
                l72 l72VarL = ov0Var5.l();
                dv1 dv1VarH2 = xp1.H(ov0Var5, dv1VarD2);
                w20.b.getClass();
                x30 x30Var3 = v20.b;
                ov0Var5.g0();
                if (ov0Var5.S) {
                    ov0Var5.k(x30Var3);
                } else {
                    ov0Var5.p0();
                }
                gh ghVar = v20.e;
                q73.h(ov0Var5, ghVar, yzVarA);
                gh ghVar2 = v20.d;
                q73.h(ov0Var5, ghVar2, l72VarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                gh ghVar3 = v20.f;
                q73.h(ov0Var5, ghVar3, numValueOf);
                wa waVar = v20.g;
                q73.g(ov0Var5, waVar);
                gh ghVar4 = v20.c;
                q73.h(ov0Var5, ghVar4, dv1VarH2);
                dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                or orVar = j9.p;
                kk2 kk2VarA = jk2.a(am1.i, orVar, ov0Var5, 54);
                int iHashCode2 = Long.hashCode(ov0Var5.T);
                l72 l72VarL2 = ov0Var5.l();
                dv1 dv1VarH3 = xp1.H(ov0Var5, dv1VarE);
                ov0Var5.g0();
                if (ov0Var5.S) {
                    x30Var = x30Var3;
                    ov0Var5.k(x30Var);
                } else {
                    x30Var = x30Var3;
                    ov0Var5.p0();
                }
                q73.h(ov0Var5, ghVar, kk2VarA);
                q73.h(ov0Var5, ghVar2, l72VarL2);
                az2.s(iHashCode2, ov0Var5, ghVar3, ov0Var5, waVar);
                q73.h(ov0Var5, ghVar4, dv1VarH3);
                kk2 kk2VarA2 = jk2.a(am1.e, orVar, ov0Var5, 48);
                int iHashCode3 = Long.hashCode(ov0Var5.T);
                l72 l72VarL3 = ov0Var5.l();
                dv1 dv1VarH4 = xp1.H(ov0Var5, av1Var);
                ov0Var5.g0();
                if (ov0Var5.S) {
                    ov0Var5.k(x30Var);
                } else {
                    ov0Var5.p0();
                }
                q73.h(ov0Var5, ghVar, kk2VarA2);
                q73.h(ov0Var5, ghVar2, l72VarL3);
                az2.s(iHashCode3, ov0Var5, ghVar3, ov0Var5, waVar);
                q73.h(ov0Var5, ghVar4, dv1VarH4);
                dv1 dv1VarN = xp1.n(iw2.k(av1Var, 38.0f), cj2.a(12.0f));
                long j = bk.g;
                x30 x30Var4 = x30Var;
                dv1 dv1VarK = xp1.k(dv1VarN, hz.c(0.12f, j), o51.p0);
                er1 er1VarC = ws.c(j9.j, false);
                int iHashCode4 = Long.hashCode(ov0Var5.T);
                l72 l72VarL4 = ov0Var5.l();
                dv1 dv1VarH5 = xp1.H(ov0Var5, dv1VarK);
                ov0Var5.g0();
                if (ov0Var5.S) {
                    x30Var2 = x30Var4;
                    ov0Var5.k(x30Var2);
                } else {
                    x30Var2 = x30Var4;
                    ov0Var5.p0();
                }
                q73.h(ov0Var5, ghVar, er1VarC);
                q73.h(ov0Var5, ghVar2, l72VarL4);
                az2.s(iHashCode4, ov0Var5, ghVar3, ov0Var5, waVar);
                q73.h(ov0Var5, ghVar4, dv1VarH5);
                t01.a(ke0.C(), null, iw2.k(av1Var, 20.0f), j, ov0Var5, 3504, 0);
                az2.t(ov0Var5, true, av1Var, 12.0f, ov0Var5);
                yz yzVarA2 = wz.a(am1.g, nrVar, ov0Var5, 0);
                int iHashCode5 = Long.hashCode(ov0Var5.T);
                l72 l72VarL5 = ov0Var5.l();
                dv1 dv1VarH6 = xp1.H(ov0Var5, av1Var);
                ov0Var5.g0();
                if (ov0Var5.S) {
                    ov0Var5.k(x30Var2);
                } else {
                    ov0Var5.p0();
                }
                q73.h(ov0Var5, ghVar, yzVarA2);
                q73.h(ov0Var5, ghVar2, l72VarL5);
                az2.s(iHashCode5, ov0Var5, ghVar3, ov0Var5, waVar);
                q73.h(ov0Var5, ghVar4, dv1VarH6);
                String strN = ke0.N(2131624944, ov0Var5);
                long jC = v63.c(18);
                jr0 jr0Var = jr0.j;
                hh0 hh0Var = mz.a;
                s83.b(strN, null, ((kz) ov0Var5.j(hh0Var)).o, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
                if (list.isEmpty()) {
                    strO = az2.h(ov0Var5, 1250250573, 2131624804, ov0Var5, false);
                } else {
                    ov0Var5.c0(1250252172);
                    strO = ke0.O(2131624946, new Object[]{Integer.valueOf(list.size())}, ov0Var5);
                    ov0Var5.p(false);
                }
                s83.b(strO, null, hz.c(0.6f, ((kz) ov0Var5.j(hh0Var)).o), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262122);
                ov0Var5.p(true);
                ov0Var5.p(true);
                xq1.l(au0Var2, iw2.k(av1Var, 32.0f), false, null, null, k22.m, ov0Var5, 1572912, 60);
                ov0Var5.p(true);
                if (list.isEmpty()) {
                    ov0Var5.c0(1756214484);
                    dv1 dv1VarF = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 24.0f, 1);
                    yz yzVarA3 = wz.a(am1.h, j9.s, ov0Var5, 54);
                    int iHashCode6 = Long.hashCode(ov0Var5.T);
                    l72 l72VarL6 = ov0Var5.l();
                    dv1 dv1VarH7 = xp1.H(ov0Var5, dv1VarF);
                    ov0Var5.g0();
                    if (ov0Var5.S) {
                        ov0Var5.k(x30Var2);
                    } else {
                        ov0Var5.p0();
                    }
                    q73.h(ov0Var5, ghVar, yzVarA3);
                    q73.h(ov0Var5, ghVar2, l72VarL6);
                    az2.s(iHashCode6, ov0Var5, ghVar3, ov0Var5, waVar);
                    q73.h(ov0Var5, ghVar4, dv1VarH7);
                    t01.a(ig0.w(), null, iw2.k(av1Var, 48.0f), hz.c(0.35f, ((kz) ov0Var5.j(hh0Var)).q), ov0Var5, 432, 0);
                    gh0.h(ov0Var5, iw2.g(av1Var, 10.0f));
                    s83.b(ke0.N(2131624804, ov0Var5), null, hz.c(0.7f, ((kz) ov0Var5.j(hh0Var)).q), v63.c(15), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
                    gh0.h(ov0Var5, iw2.g(av1Var, 4.0f));
                    s83.b(ke0.N(2131624676, ov0Var5), zm3.F(av1Var, 16.0f, 0.0f, 2), hz.c(0.45f, ((kz) ov0Var5.j(hh0Var)).q), v63.c(12), null, null, 0L, null, new m53(3), 0L, 0, false, 0, 0, null, ov0Var5, 24624, 0, 261096);
                    ov0Var5.p(true);
                    ov0Var5.p(false);
                } else {
                    ov0Var5.c0(1757904263);
                    dv1 dv1VarH8 = iw2.h(iw2.e(av1Var, 1.0f), 0.0f, 320.0f, 1);
                    jo joVar2 = new jo(8.0f, true, new fo(0));
                    boolean zH = ov0Var5.h(list) | ov0Var5.f(lu0Var2) | ov0Var5.f(lu0Var3);
                    Object objQ8 = ov0Var5.Q();
                    if (zH || objQ8 == c30Var) {
                        objQ8 = new ji1(list, lu0Var2, lu0Var3, 16);
                        ov0Var5.m0(objQ8);
                    }
                    ke0.d(dv1VarH8, null, null, joVar2, null, null, false, null, (lu0) objQ8, ov0Var5, 24582, 494);
                    ov0Var5.p(false);
                }
                bj2 bj2VarA = cj2.a(14.0f);
                b52 b52Var = hu.a;
                n51.a(au0Var2, iw2.g(iw2.e(av1Var, 1.0f), 44.0f), false, bj2VarA, hu.a(hz.c(0.6f, ((kz) ov0Var5.j(hh0Var)).r), ((kz) ov0Var5.j(hh0Var)).q, 0L, 0L, ov0Var5, 12), null, null, null, k22.o, ov0Var5, 805306416, 484);
                ov0Var5.p(true);
                return mf3Var;
            default:
                st stVar = (st) obj7;
                me1 me1Var = (me1) obj6;
                f83 f83Var = (f83) obj5;
                long j2 = f83Var.b;
                e12 e12Var = (e12) obj4;
                dv1 dv1Var3 = (dv1) obj;
                ((Integer) obj3).getClass();
                ov0 ov0Var6 = (ov0) ((f30) obj2);
                ov0Var6.c0(-84507373);
                boolean zBooleanValue = ((Boolean) ov0Var6.j(z30.y)).booleanValue();
                boolean zG = ov0Var6.g(zBooleanValue);
                Object objQ9 = ov0Var6.Q();
                if (zG || objQ9 == c30Var) {
                    objQ9 = new m80(zBooleanValue);
                    ov0Var6.m0(objQ9);
                }
                m80 m80Var = (m80) objQ9;
                if ((stVar instanceof qy2) && ((qy2) stVar).a == 16) {
                    z = false;
                }
                if (((Boolean) ((ee1) ((qk3) ov0Var6.j(z30.v))).c.getValue()).booleanValue() && me1Var.b() && f93.c(j2) && z) {
                    ov0Var6.c0(-707487962);
                    dj djVar = f83Var.a;
                    f93 f93Var = new f93(j2);
                    boolean zH2 = ov0Var6.h(m80Var);
                    Object objQ10 = ov0Var6.Q();
                    if (zH2 || objQ10 == c30Var) {
                        objQ10 = new d6(m80Var, (q60) null, 22);
                        ov0Var6.m0(objQ10);
                    }
                    oi0.f(djVar, f93Var, (pu0) objQ10, ov0Var6);
                    boolean zH3 = ov0Var6.h(m80Var) | ov0Var6.h(e12Var) | ov0Var6.f(f83Var) | ov0Var6.h(me1Var) | ov0Var6.f(stVar);
                    Object objQ11 = ov0Var6.Q();
                    if (zH3 || objQ11 == c30Var) {
                        objQ11 = new e5(m80Var, e12Var, f83Var, me1Var, stVar, 6);
                        ov0Var6.m0(objQ11);
                    }
                    dv1 dv1VarW = xp1.w(dv1Var3, (lu0) objQ11);
                    ov0Var6.p(false);
                    dv1Var = dv1VarW;
                } else {
                    ov0Var6.c0(-705473241);
                    ov0Var6.p(false);
                    dv1Var = av1Var;
                }
                ov0Var6.p(false);
                return dv1Var;
        }
    }

    public /* synthetic */ oc1(ey1 ey1Var, ul1 ul1Var, lr2 lr2Var, lu0 lu0Var) {
        this.e = 3;
        this.f = ey1Var;
        this.g = ul1Var;
        this.h = lr2Var;
        this.i = lu0Var;
    }

    public /* synthetic */ oc1(ContributionStatus contributionStatus, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3) {
        this.e = 1;
        this.g = contributionStatus;
        this.f = ey1Var;
        this.h = ey1Var2;
        this.i = ey1Var3;
    }

    public /* synthetic */ oc1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.f = obj4;
    }
}
