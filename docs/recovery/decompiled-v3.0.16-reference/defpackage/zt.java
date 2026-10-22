package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoSource;
import com.vincenthzr.locationspoofer.data.cloud.MembershipPlan;
import com.vincenthzr.locationspoofer.data.cloud.RewardCoupon;
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import com.vincenthzr.locationspoofer.data.model.SearchMode;
import java.util.List;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.selects.SelectInstance;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class zt implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ zt(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:122:0x0319  */
    /* JADX WARN: Code duplicated, block: B:140:0x0357  */
    /* JADX WARN: Code duplicated, block: B:148:0x0371  */
    /* JADX WARN: Code duplicated, block: B:159:0x0397  */
    /* JADX WARN: Code duplicated, block: B:160:0x039b  */
    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        boolean z2;
        int i2 = this.e;
        int i3 = 18;
        c30 c30Var = d30.a;
        int i4 = 6;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        Object obj4 = this.f;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (i2) {
            case 0:
                return BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(this.f, (BufferedChannel) obj6, (SelectInstance) obj5, (Throwable) obj, obj2, (y70) obj3);
            case 1:
                au0 au0Var = (au0) obj4;
                au0 au0Var2 = (au0) obj6;
                CompleteCollectionRoute completeCollectionRoute = (CompleteCollectionRoute) obj5;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dv1 dv1VarD = zm3.D(av1Var, 14.0f);
                    kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
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
                    x01 x01VarB = vd0.g;
                    if (x01VarB == null) {
                        w01 w01Var = new w01("Outlined.Route", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = nh3.a;
                        qy2 qy2Var = new qy2(hz.b);
                        nx0 nx0Var = new nx0(3);
                        nx0Var.m(19.0f, 15.18f);
                        nx0Var.r(7.0f);
                        nx0Var.g(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
                        nx0Var.o(-4.0f, 1.79f, -4.0f, 4.0f);
                        nx0Var.s(10.0f);
                        nx0Var.g(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
                        nx0Var.o(-2.0f, -0.9f, -2.0f, -2.0f);
                        nx0Var.r(8.82f);
                        nx0Var.f(8.16f, 8.4f, 9.0f, 7.3f, 9.0f, 6.0f);
                        nx0Var.g(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                        nx0Var.n(3.0f, 4.34f, 3.0f, 6.0f);
                        nx0Var.g(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
                        nx0Var.r(17.0f);
                        nx0Var.g(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
                        nx0Var.o(4.0f, -1.79f, 4.0f, -4.0f);
                        nx0Var.r(7.0f);
                        nx0Var.g(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
                        nx0Var.o(2.0f, 0.9f, 2.0f, 2.0f);
                        nx0Var.s(8.18f);
                        nx0Var.g(-1.16f, 0.41f, -2.0f, 1.51f, -2.0f, 2.82f);
                        nx0Var.g(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                        nx0Var.o(3.0f, -1.34f, 3.0f, -3.0f);
                        nx0Var.f(21.0f, 16.7f, 20.16f, 15.6f, 19.0f, 15.18f);
                        nx0Var.e();
                        nx0Var.m(6.0f, 7.0f);
                        nx0Var.f(5.45f, 7.0f, 5.0f, 6.55f, 5.0f, 6.0f);
                        nx0Var.o(0.45f, -1.0f, 1.0f, -1.0f);
                        nx0Var.o(1.0f, 0.45f, 1.0f, 1.0f);
                        nx0Var.n(6.55f, 7.0f, 6.0f, 7.0f);
                        nx0Var.e();
                        nx0Var.m(18.0f, 19.0f);
                        nx0Var.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        nx0Var.o(0.45f, -1.0f, 1.0f, -1.0f);
                        nx0Var.o(1.0f, 0.45f, 1.0f, 1.0f);
                        nx0Var.n(18.55f, 19.0f, 18.0f, 19.0f);
                        nx0Var.e();
                        w01.a(w01Var, nx0Var.a, qy2Var);
                        x01VarB = w01Var.b();
                        vd0.g = x01VarB;
                    }
                    t01.a(x01VarB, null, iw2.k(av1Var, 26.0f), bk.g, ov0Var, 3504, 0);
                    gh0.h(ov0Var, iw2.o(av1Var, 12.0f));
                    wb1 wb1Var = new wb1(1.0f, true);
                    yz yzVarA = wz.a(new jo(4.0f, true, new fo(0)), j9.r, ov0Var, 6);
                    int iHashCode2 = Long.hashCode(ov0Var.T);
                    l72 l72VarL2 = ov0Var.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var, wb1Var);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, yzVarA);
                    q73.h(ov0Var, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH2);
                    ov0Var.c0(-1139028697);
                    String name = completeCollectionRoute.getRoute().getName();
                    if (l13.k0(name)) {
                        name = ke0.N(2131624311, ov0Var);
                    }
                    ov0Var.p(false);
                    s83.b(name, null, 0L, 0L, jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1572864, 0, 262078);
                    if (l13.k0(completeCollectionRoute.getRoute().getRemark())) {
                        z = false;
                        ov0Var.c0(-951478440);
                    } else {
                        ov0Var.c0(-1139024051);
                        s83.b(completeCollectionRoute.getRoute().getRemark(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).l, ov0Var, 0, 0, 131070);
                        z = false;
                    }
                    ov0Var.p(z);
                    s83.b(ke0.O(2131624309, new Object[]{Integer.valueOf(completeCollectionRoute.getSamples().size()), Integer.valueOf((int) completeCollectionRoute.getRoute().getHalfWidthM())}, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).l, ov0Var, 0, 0, 131070);
                    ov0Var.p(true);
                    if (au0Var == null) {
                        ov0Var.c0(-1426452016);
                    } else {
                        ov0Var.c0(-1426452015);
                        xq1.l(au0Var, null, false, null, null, zm3.b, ov0Var, 1572864, 62);
                    }
                    boolean z3 = false;
                    ov0Var.p(false);
                    if (au0Var2 == null) {
                        ov0Var.c0(-1426336820);
                    } else {
                        ov0Var.c0(-1426336819);
                        xq1.l(au0Var2, null, false, null, null, zm3.c, ov0Var, 1572864, 62);
                        z3 = false;
                    }
                    ov0Var.p(z3);
                    ov0Var.p(true);
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            case 2:
                Context context = (Context) obj4;
                no1 no1Var = (no1) obj6;
                ey1 ey1Var = (ey1) obj5;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    s83.b(ke0.N(2131624374, ov0Var2), null, ((kz) ov0Var2.j(mz.a)).q, v63.c(13), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
                    gh0.h(ov0Var2, iw2.g(av1Var, 10.0f));
                    boolean zH = ov0Var2.h(context) | ov0Var2.h(no1Var);
                    Object objQ = ov0Var2.Q();
                    if (zH || objQ == c30Var) {
                        objQ = new a6(context, no1Var, ey1Var, i4);
                        ov0Var2.m0(objQ);
                    }
                    dv1 dv1VarG = iw2.g(iw2.e(av1Var, 1.0f), 44.0f);
                    bj2 bj2VarA = cj2.a(12.0f);
                    b52 b52Var = hu.a;
                    n51.a((au0) objQ, dv1VarG, false, bj2VarA, hu.a(bk.i, 0L, 0L, 0L, ov0Var2, 14), null, null, null, xp1.e, ov0Var2, 805306416, 484);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            case 3:
                MembershipPlan membershipPlan = (MembershipPlan) obj4;
                RewardCoupon rewardCoupon = (RewardCoupon) obj6;
                ey1 ey1Var2 = (ey1) obj5;
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ov0Var3.W();
                } else if (((cs1) ey1Var2.getValue()).d) {
                    ov0Var3.c0(790391136);
                    vc2.a(iw2.k(av1Var, 20.0f), ((kz) ov0Var3.j(mz.a)).b, 2.0f, 0L, 0, 0.0f, ov0Var3, 390, 56);
                    ov0Var3.p(false);
                } else {
                    ov0Var3.c0(790395525);
                    s83.b(ke0.O(2131624703, new Object[]{wc0.T((membershipPlan != null ? membershipPlan.getPriceCents() : 0) - (rewardCoupon != null ? rewardCoupon.getAmountCents() : 0))}, ov0Var3), null, 0L, 0L, jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1572864, 0, 262078);
                    ov0Var3.p(false);
                }
                return mf3Var;
            case 4:
                String str = (String) obj4;
                is1 is1Var = (is1) obj6;
                ey1 ey1Var3 = (ey1) obj5;
                f30 f30Var4 = (f30) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    dv1 dv1VarD2 = zm3.D(av1Var, 16.0f);
                    yz yzVarA2 = wz.a(am1.g, j9.r, ov0Var4, 0);
                    int iHashCode3 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL3 = ov0Var4.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var4, dv1VarD2);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var2);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, v20.e, yzVarA2);
                    q73.h(ov0Var4, v20.d, l72VarL3);
                    q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode3));
                    q73.g(ov0Var4, v20.g);
                    q73.h(ov0Var4, v20.c, dv1VarH3);
                    switch (str) {
                        case "invalid_payment_response":
                            i = 2131624763;
                            break;
                        case "membership_pending_order":
                            i = 2131624755;
                            break;
                        case "membership_unavailable":
                            i = 2131624762;
                            break;
                        case "rate_limited":
                            i = 2131624726;
                            break;
                        case "payment_rejected":
                            i = 2131624718;
                            break;
                        case "invalid_session":
                        case "login_required":
                        case "membership_registered_account_required":
                            i = 2131624727;
                            break;
                        case "software_slot_maximum":
                            i = 2131624428;
                            break;
                        case "membership_price_changed":
                            i = 2131624741;
                            break;
                        case "slot_not_found":
                            i = 2131624431;
                            break;
                        case "quota_tier_changed":
                            i = 2131624433;
                            break;
                        case "device_login_required":
                            i = 2131624419;
                            break;
                        case "payment_qr_unavailable":
                            i = 2131624763;
                            break;
                        case "service_busy":
                            i = 2131624726;
                            break;
                        case "membership_coupon_minimum":
                            i = 2131624708;
                            break;
                        case "quota_slot_unavailable":
                            i = 2131624431;
                            break;
                        case "payment_create_unknown":
                            i = 2131624763;
                            break;
                        case "membership_order_limit":
                            i = 2131624726;
                            break;
                        case "membership_account_limit":
                            i = 2131624692;
                            break;
                        case "quota_slot_required":
                            i = 2131624431;
                            break;
                        case "membership_duration_limit":
                            i = 2131624716;
                            break;
                        case "device_switch_pending":
                            i = 2131623989;
                            break;
                        case "membership_coupon_unavailable":
                            i = 2131624710;
                            break;
                        case "membership_sold_out":
                            i = 2131624759;
                            break;
                        default:
                            i = 2131624730;
                            break;
                    }
                    s83.b(ke0.N(i, ov0Var4), null, ((kz) ov0Var4.j(mz.a)).z, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 0, 0, 262138);
                    boolean zH2 = ov0Var4.h(is1Var);
                    Object objQ2 = ov0Var4.Q();
                    if (zH2 || objQ2 == c30Var) {
                        objQ2 = new t4(0, is1Var, is1.class, "load", "load()V", 0, 28);
                        ov0Var4.m0(objQ2);
                    }
                    n51.j((au0) ((o81) objQ2), null, !((cs1) ey1Var3.getValue()).d, null, null, null, xq1.l, ov0Var4, 805306368, 506);
                    ov0Var4.p(true);
                } else {
                    ov0Var4.W();
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                String str2 = (String) obj4;
                CloudGeoSource cloudGeoSource = (CloudGeoSource) obj6;
                SearchMode searchMode = (SearchMode) obj5;
                pu0 pu0Var = (pu0) obj;
                f30 f30Var5 = (f30) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                pu0Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((ov0) f30Var5).h(pu0Var) ? 4 : 2;
                }
                ov0 ov0Var5 = (ov0) f30Var5;
                if (!ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    ov0Var5.W();
                    return mf3Var;
                }
                kk2 kk2VarA2 = jk2.a(am1.e, j9.p, ov0Var5, 48);
                int iHashCode4 = Long.hashCode(ov0Var5.T);
                l72 l72VarL4 = ov0Var5.l();
                dv1 dv1VarH4 = xp1.H(ov0Var5, av1Var);
                w20.b.getClass();
                x30 x30Var3 = v20.b;
                ov0Var5.g0();
                if (ov0Var5.S) {
                    ov0Var5.k(x30Var3);
                } else {
                    ov0Var5.p0();
                }
                gh ghVar5 = v20.e;
                q73.h(ov0Var5, ghVar5, kk2VarA2);
                gh ghVar6 = v20.d;
                q73.h(ov0Var5, ghVar6, l72VarL4);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                gh ghVar7 = v20.f;
                q73.h(ov0Var5, ghVar7, numValueOf2);
                wa waVar2 = v20.g;
                q73.g(ov0Var5, waVar2);
                gh ghVar8 = v20.c;
                q73.h(ov0Var5, ghVar8, dv1VarH4);
                wb1 wb1Var2 = new wb1(1.0f, true);
                er1 er1VarC = ws.c(j9.f, false);
                int iHashCode5 = Long.hashCode(ov0Var5.T);
                l72 l72VarL5 = ov0Var5.l();
                dv1 dv1VarH5 = xp1.H(ov0Var5, wb1Var2);
                ov0Var5.g0();
                int i6 = iIntValue5;
                if (ov0Var5.S) {
                    ov0Var5.k(x30Var3);
                } else {
                    ov0Var5.p0();
                }
                q73.h(ov0Var5, ghVar5, er1VarC);
                q73.h(ov0Var5, ghVar6, l72VarL5);
                az2.s(iHashCode5, ov0Var5, ghVar7, ov0Var5, waVar2);
                q73.h(ov0Var5, ghVar8, dv1VarH5);
                if (str2.length() == 0) {
                    ov0Var5.c0(1192768240);
                    s83.b(ke0.N((cloudGeoSource == CloudGeoSource.NOMINATIM && searchMode == SearchMode.NETWORK) ? 2131624227 : 2131624963, ov0Var5), null, hz.c(0.4f, ((kz) ov0Var5.j(mz.a)).q), v63.c(15), jr0.g, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262058);
                    z2 = false;
                } else {
                    z2 = false;
                    ov0Var5.c0(1186430476);
                }
                ov0Var5.p(z2);
                pu0Var.invoke(ov0Var5, Integer.valueOf(i6 & 14));
                ov0Var5.p(true);
                ov0Var5.p(true);
                return mf3Var;
            default:
                List<GithubRelease> list = (List) obj4;
                lu0 lu0Var = (lu0) obj6;
                ey1 ey1Var4 = (ey1) obj5;
                f30 f30Var6 = (f30) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var6 = (ov0) f30Var6;
                if (ov0Var6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    for (GithubRelease githubRelease : list) {
                        p10 p10VarA0 = sb.a0(-447624132, new iy2(githubRelease, i4), ov0Var6);
                        boolean zF = ov0Var6.f(lu0Var) | ov0Var6.h(githubRelease);
                        Object objQ3 = ov0Var6.Q();
                        if (zF || objQ3 == c30Var) {
                            objQ3 = new a6(lu0Var, githubRelease, ey1Var4, i3);
                            ov0Var6.m0(objQ3);
                        }
                        he.b(p10VarA0, (au0) objQ3, null, false, null, null, ov0Var6, 6);
                    }
                } else {
                    ov0Var6.W();
                }
                return mf3Var;
        }
    }
}
