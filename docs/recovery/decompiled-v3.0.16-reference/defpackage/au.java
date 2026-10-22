package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudDeviceSlot;
import com.vincenthzr.locationspoofer.data.cloud.MembershipBenefit;
import com.vincenthzr.locationspoofer.data.cloud.MembershipCatalog;
import com.vincenthzr.locationspoofer.data.cloud.MembershipOrder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class au implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ au(q11 q11Var, ix1 ix1Var) {
        this.e = 2;
        this.f = q11Var;
    }

    /* JADX WARN: Code duplicated, block: B:235:0x0c1d  */
    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        boolean z4;
        long j2;
        String strO;
        int i = this.e;
        int i2 = 2;
        int i3 = 14;
        av1 av1Var = av1.a;
        c30 c30Var = d30.a;
        mf3 mf3Var = mf3.a;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                return BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56((BufferedChannel) obj4, (SelectInstance) obj, obj2, obj3);
            case 1:
                t70 t70Var = (t70) obj4;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue = t70Var.z.n(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = t70Var.z.n(iIntValue2);
                }
                if (t70Var.x) {
                    long j3 = t70Var.v.b;
                    int i4 = f93.c;
                    if (iIntValue == ((int) (j3 >> 32)) && iIntValue2 == ((int) (j3 & 4294967295L))) {
                        z = false;
                    } else {
                        int iMin = Math.min(iIntValue, iIntValue2);
                        dx0 dx0Var = dx0.e;
                        if (iMin < 0 || Math.max(iIntValue, iIntValue2) > t70Var.v.a.f.length()) {
                            x73 x73Var = t70Var.A;
                            x73Var.u(false);
                            x73Var.r(dx0Var);
                            z = false;
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                z2 = true;
                                x73 x73Var2 = t70Var.A;
                                x73Var2.u(false);
                                x73Var2.r(dx0Var);
                            } else {
                                z2 = true;
                                t70Var.A.e(true);
                            }
                            t70Var.w.v.invoke(new f83(t70Var.v.a, g93.a(iIntValue, iIntValue2), (f93) null));
                            z = z2;
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                ((Integer) obj3).getClass();
                ov0 ov0Var = (ov0) ((f30) obj2);
                ov0Var.c0(-353972293);
                ((q11) obj4).getClass();
                ov0Var.c0(1257603829);
                j9 j9Var = j9.X;
                ov0Var.p(false);
                boolean zF = ov0Var.f(j9Var);
                Object objQ = ov0Var.Q();
                if (zF || objQ == c30Var) {
                    objQ = new n11();
                    ov0Var.m0(objQ);
                }
                n11 n11Var = (n11) objQ;
                ov0Var.p(false);
                return n11Var;
            case 3:
                tg tgVar = (tg) obj4;
                f30 f30Var = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var;
                if (ov0Var2.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dv1 dv1VarD = zm3.D(av1Var, 20.0f);
                    yz yzVarA = wz.a(new jo(12.0f, true, new fo(0)), j9.r, ov0Var2, 6);
                    int iHashCode = Long.hashCode(ov0Var2.T);
                    l72 l72VarL = ov0Var2.l();
                    dv1 dv1VarH = xp1.H(ov0Var2, dv1VarD);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, v20.e, yzVarA);
                    q73.h(ov0Var2, v20.d, l72VarL);
                    q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var2, v20.g);
                    q73.h(ov0Var2, v20.c, dv1VarH);
                    hh0 hh0Var = le3.a;
                    s83.b("OpenStreetMap", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(hh0Var)).g, ov0Var2, 6, 0, 131070);
                    s83.b(ke0.N(2131624678, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                    s83.b("© OpenStreetMap contributors", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(hh0Var)).l, ov0Var2, 6, 0, 131070);
                    boolean zH = ov0Var2.h(tgVar);
                    Object objQ2 = ov0Var2.Q();
                    if (zH || objQ2 == c30Var) {
                        objQ2 = new vp1(tgVar, 1);
                        ov0Var2.m0(objQ2);
                    }
                    n51.j((au0) objQ2, null, false, null, null, null, am1.t, ov0Var2, 805306368, 510);
                    ov0Var2.p(true);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            case 4:
                MembershipOrder membershipOrder = (MembershipOrder) obj4;
                f30 f30Var2 = (f30) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var3 = (ov0) f30Var2;
                if (ov0Var3.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    dv1 dv1VarD2 = zm3.D(av1Var, 16.0f);
                    kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var3, 48);
                    int iHashCode2 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL2 = ov0Var3.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var3, dv1VarD2);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var2);
                    } else {
                        ov0Var3.p0();
                    }
                    gh ghVar = v20.e;
                    q73.h(ov0Var3, ghVar, kk2VarA);
                    gh ghVar2 = v20.d;
                    q73.h(ov0Var3, ghVar2, l72VarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    gh ghVar3 = v20.f;
                    q73.h(ov0Var3, ghVar3, numValueOf);
                    wa waVar = v20.g;
                    q73.g(ov0Var3, waVar);
                    gh ghVar4 = v20.c;
                    q73.h(ov0Var3, ghVar4, dv1VarH2);
                    wb1 wb1Var = new wb1(1.0f, true);
                    yz yzVarA2 = wz.a(new jo(4.0f, true, new fo(0)), j9.r, ov0Var3, 6);
                    int iHashCode3 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL3 = ov0Var3.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var3, wb1Var);
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var2);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, ghVar, yzVarA2);
                    q73.h(ov0Var3, ghVar2, l72VarL3);
                    az2.s(iHashCode3, ov0Var3, ghVar3, ov0Var3, waVar);
                    q73.h(ov0Var3, ghVar4, dv1VarH3);
                    s83.b(membershipOrder.getTitle(), null, 0L, 0L, jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1572864, 0, 262078);
                    String strN = ke0.N(wc0.X(membershipOrder.getStatus()), ov0Var3);
                    q93 q93Var = ((je3) ov0Var3.j(le3.a)).l;
                    if (o51.f(membershipOrder.getStatus(), "PAID")) {
                        ov0Var3.c0(1676311995);
                        ov0Var3.p(false);
                        j = bk.g;
                    } else {
                        ov0Var3.c0(1676313345);
                        j = ((kz) ov0Var3.j(mz.a)).s;
                        ov0Var3.p(false);
                    }
                    s83.b(strN, null, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var, ov0Var3, 0, 0, 131066);
                    ov0Var3.p(true);
                    s83.b(wc0.T(membershipOrder.getAmountCents()), null, 0L, 0L, jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1572864, 0, 262078);
                    ov0Var3.p(true);
                } else {
                    ov0Var3.W();
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                CloudDeviceSlot cloudDeviceSlot = (CloudDeviceSlot) obj4;
                f30 f30Var3 = (f30) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var4 = (ov0) f30Var3;
                if (ov0Var4.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    dv1 dv1VarD3 = zm3.D(iw2.e(av1Var, 1.0f), 14.0f);
                    yz yzVarA3 = wz.a(new jo(5.0f, true, new fo(0)), j9.r, ov0Var4, 6);
                    int iHashCode4 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL4 = ov0Var4.l();
                    dv1 dv1VarH4 = xp1.H(ov0Var4, dv1VarD3);
                    w20.b.getClass();
                    x30 x30Var3 = v20.b;
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var3);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, v20.e, yzVarA3);
                    q73.h(ov0Var4, v20.d, l72VarL4);
                    q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode4));
                    q73.g(ov0Var4, v20.g);
                    q73.h(ov0Var4, v20.c, dv1VarH4);
                    String name = cloudDeviceSlot.getName();
                    if (name == null) {
                        ov0Var4.c0(1681801668);
                        int position = cloudDeviceSlot.getPosition();
                        if (position < 1) {
                            position = 1;
                        }
                        name = ke0.O(2131624427, new Object[]{Integer.valueOf(position)}, ov0Var4);
                        z3 = false;
                    } else {
                        z3 = false;
                        ov0Var4.c0(1681801265);
                    }
                    ov0Var4.p(z3);
                    s83.b(name, null, 0L, 0L, jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1572864, 0, 262078);
                    String strN2 = ke0.N(cloudDeviceSlot.getActive() ? 2131624415 : 2131624414, ov0Var4);
                    hh0 hh0Var2 = le3.a;
                    s83.b(strN2, null, ((kz) ov0Var4.j(mz.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(hh0Var2)).l, ov0Var4, 0, 0, 131066);
                    String strA = wc0.A(cloudDeviceSlot.getResetsAt());
                    strA.getClass();
                    s83.b(ke0.O(2131624425, new Object[]{strA}, ov0Var4), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(hh0Var2)).l, ov0Var4, 0, 0, 131070);
                    Long purchasedUntil = cloudDeviceSlot.getPurchasedUntil();
                    if (purchasedUntil == null) {
                        ov0Var4.c0(596781294);
                    } else {
                        ov0Var4.c0(596781295);
                        String strA2 = wc0.A(purchasedUntil.longValue());
                        strA2.getClass();
                        s83.b(ke0.O(2131624432, new Object[]{strA2}, ov0Var4), null, bk.g, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var4.j(hh0Var2)).l, ov0Var4, 384, 0, 131066);
                    }
                    ov0Var4.p(false);
                    ov0Var4.p(true);
                } else {
                    ov0Var4.W();
                }
                return mf3Var;
            case Logger.ERROR /* 6 */:
                s03 s03Var = (s03) obj4;
                f30 f30Var4 = (f30) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                go goVar = am1.e;
                or orVar = j9.p;
                ((zz) obj).getClass();
                ov0 ov0Var5 = (ov0) f30Var4;
                if (ov0Var5.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    List listG = am1.G(new i52("free", 2131624719), new i52("week", 2131624767), new i52("month", 2131624729), new i52("quarter", 2131624750), new i52("year", 2131624768));
                    co2 co2VarO = zm3.O(ov0Var5);
                    av1 av1Var2 = av1.a;
                    dv1 dv1VarO = iw2.o(zm3.D(zm3.P(av1Var2, co2VarO, false), 16.0f), 600.0f);
                    yz yzVarA4 = wz.a(am1.g, j9.r, ov0Var5, 0);
                    int iHashCode5 = Long.hashCode(ov0Var5.T);
                    l72 l72VarL5 = ov0Var5.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var5, dv1VarO);
                    w20.b.getClass();
                    x30 x30Var4 = v20.b;
                    ov0Var5.g0();
                    if (ov0Var5.S) {
                        ov0Var5.k(x30Var4);
                    } else {
                        ov0Var5.p0();
                    }
                    gh ghVar5 = v20.e;
                    q73.h(ov0Var5, ghVar5, yzVarA4);
                    gh ghVar6 = v20.d;
                    q73.h(ov0Var5, ghVar6, l72VarL5);
                    Integer numValueOf2 = Integer.valueOf(iHashCode5);
                    gh ghVar7 = v20.f;
                    q73.h(ov0Var5, ghVar7, numValueOf2);
                    wa waVar2 = v20.g;
                    q73.g(ov0Var5, waVar2);
                    gh ghVar8 = v20.c;
                    q73.h(ov0Var5, ghVar8, dv1VarH5);
                    dv1 dv1VarG = zm3.G(av1Var2, 0.0f, 0.0f, 0.0f, 14.0f, 7);
                    kk2 kk2VarA2 = jk2.a(goVar, orVar, ov0Var5, 48);
                    int iHashCode6 = Long.hashCode(ov0Var5.T);
                    l72 l72VarL6 = ov0Var5.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var5, dv1VarG);
                    ov0Var5.g0();
                    if (ov0Var5.S) {
                        ov0Var5.k(x30Var4);
                    } else {
                        ov0Var5.p0();
                    }
                    q73.h(ov0Var5, ghVar5, kk2VarA2);
                    q73.h(ov0Var5, ghVar6, l72VarL6);
                    az2.s(iHashCode6, ov0Var5, ghVar7, ov0Var5, waVar2);
                    q73.h(ov0Var5, ghVar8, dv1VarH6);
                    s83.b(ke0.N(2131624697, ov0Var5), iw2.o(av1Var2, 150.0f), 0L, 0L, jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1572912, 0, 262076);
                    ov0Var5.c0(673714226);
                    Iterator it = listG.iterator();
                    while (it.hasNext()) {
                        s83.b(ke0.N(((Number) ((i52) it.next()).f).intValue(), ov0Var5), iw2.o(av1Var2, 90.0f), bk.g, 0L, jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1573296, 0, 262072);
                    }
                    ov0Var5.p(false);
                    ov0Var5.p(true);
                    MembershipCatalog membershipCatalog = ((cs1) s03Var.getValue()).a;
                    List<MembershipBenefit> benefits = membershipCatalog != null ? membershipCatalog.getBenefits() : null;
                    if (benefits == null) {
                        ov0Var5.c0(-574768103);
                        ov0Var5.p(false);
                        z4 = true;
                    } else {
                        ov0Var5.c0(-574768102);
                        for (MembershipBenefit membershipBenefit : benefits) {
                            ld0.g(null, 0.0f, ((kz) ov0Var5.j(mz.a)).B, ov0Var5, 0);
                            dv1 dv1VarF = zm3.F(av1Var2, 0.0f, 16.0f, 1);
                            kk2 kk2VarA3 = jk2.a(goVar, orVar, ov0Var5, 48);
                            int iHashCode7 = Long.hashCode(ov0Var5.T);
                            l72 l72VarL7 = ov0Var5.l();
                            dv1 dv1VarH7 = xp1.H(ov0Var5, dv1VarF);
                            w20.b.getClass();
                            x30 x30Var5 = v20.b;
                            ov0Var5.g0();
                            if (ov0Var5.S) {
                                ov0Var5.k(x30Var5);
                            } else {
                                ov0Var5.p0();
                            }
                            q73.h(ov0Var5, v20.e, kk2VarA3);
                            q73.h(ov0Var5, v20.d, l72VarL7);
                            q73.h(ov0Var5, v20.f, Integer.valueOf(iHashCode7));
                            q73.g(ov0Var5, v20.g);
                            q73.h(ov0Var5, v20.c, dv1VarH7);
                            s83.b(membershipBenefit.getName(), zm3.G(iw2.o(av1Var2, 150.0f), 0.0f, 0.0f, 12.0f, 0.0f, 11), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var5.j(le3.a)).k, ov0Var5, 48, 0, 131068);
                            ov0Var5.c0(301751794);
                            Iterator it2 = listG.iterator();
                            while (it2.hasNext()) {
                                String str = (String) ((i52) it2.next()).e;
                                String free = membershipBenefit.getValues().get(str);
                                if (free == null) {
                                    free = o51.f(str, "free") ? membershipBenefit.getFree() : membershipBenefit.getMember();
                                }
                                String str2 = free;
                                dv1 dv1VarG2 = zm3.G(iw2.o(av1Var2, 90.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11);
                                q93 q93Var2 = ((je3) ov0Var5.j(le3.a)).k;
                                if (o51.f(str, "free")) {
                                    ov0Var5.c0(-247515379);
                                    j2 = ((kz) ov0Var5.j(mz.a)).s;
                                    ov0Var5.p(false);
                                } else {
                                    ov0Var5.c0(-247514681);
                                    ov0Var5.p(false);
                                    j2 = bk.g;
                                }
                                s83.b(str2, dv1VarG2, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, q93Var2, ov0Var5, 48, 0, 131064);
                            }
                            ov0Var5.p(false);
                            ov0Var5.p(true);
                        }
                        z4 = true;
                        ov0Var5.p(false);
                    }
                    ov0Var5.p(z4);
                } else {
                    ov0Var5.W();
                }
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1((MutexImpl) obj4, (SelectInstance) obj, obj2, obj3);
            case 8:
                CloudAccount cloudAccount = (CloudAccount) obj4;
                f30 f30Var5 = (f30) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var6 = (ov0) f30Var5;
                if (ov0Var6.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    Integer loginDeviceLimit = cloudAccount.getLoginDeviceLimit();
                    s83.b(ke0.O(2131623968, new Object[]{Integer.valueOf(loginDeviceLimit != null ? loginDeviceLimit.intValue() : 1)}, ov0Var6), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 0, 0, 262142);
                } else {
                    ov0Var6.W();
                }
                return mf3Var;
            case mc0.b /* 9 */:
                List list = (List) obj4;
                f30 f30Var6 = (f30) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var7 = (ov0) f30Var6;
                if (ov0Var7.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x01 x01VarB = o51.E0;
                    if (x01VarB == null) {
                        w01 w01Var = new w01("Rounded.AddLocation", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = nh3.a;
                        qy2 qy2Var = new qy2(hz.b);
                        nx0 nx0VarI = p91.i(13.0f, 7.0f);
                        nx0VarI.g(0.0f, -0.55f, -0.44f, -1.0f, -1.0f, -1.0f);
                        nx0VarI.g(-0.55f, 0.0f, -1.0f, 0.44f, -1.0f, 1.0f);
                        nx0VarI.s(2.0f);
                        nx0VarI.h(9.0f);
                        nx0VarI.g(-0.55f, 0.0f, -1.0f, 0.44f, -1.0f, 1.0f);
                        nx0VarI.g(0.0f, 0.55f, 0.44f, 1.0f, 1.0f, 1.0f);
                        nx0VarI.i(2.0f);
                        nx0VarI.s(2.0f);
                        nx0VarI.g(0.0f, 0.55f, 0.44f, 1.0f, 1.0f, 1.0f);
                        nx0VarI.g(0.55f, 0.0f, 1.0f, -0.44f, 1.0f, -1.0f);
                        nx0VarI.s(-2.0f);
                        nx0VarI.i(2.0f);
                        nx0VarI.g(0.55f, 0.0f, 1.0f, -0.44f, 1.0f, -1.0f);
                        nx0VarI.g(0.0f, -0.55f, -0.44f, -1.0f, -1.0f, -1.0f);
                        nx0VarI.i(-2.0f);
                        nx0VarI.r(7.0f);
                        nx0VarI.e();
                        nx0VarI.m(12.0f, 2.0f);
                        nx0VarI.g(4.2f, 0.0f, 8.0f, 3.22f, 8.0f, 8.2f);
                        nx0VarI.g(0.0f, 3.18f, -2.45f, 6.92f, -7.34f, 11.23f);
                        nx0VarI.g(-0.38f, 0.33f, -0.95f, 0.33f, -1.33f, 0.0f);
                        nx0VarI.f(6.45f, 17.12f, 4.0f, 13.38f, 4.0f, 10.2f);
                        nx0VarI.f(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f);
                        nx0VarI.e();
                        w01.a(w01Var, nx0VarI.a, qy2Var);
                        x01VarB = w01Var.b();
                        o51.E0 = x01VarB;
                    }
                    t01.a(x01VarB, null, iw2.k(av1Var, 18.0f), 0L, ov0Var7, 432, 8);
                    gh0.h(ov0Var7, iw2.o(av1Var, 6.0f));
                    if (list.isEmpty()) {
                        strO = az2.h(ov0Var7, -719339414, 2131624002, ov0Var7, false);
                    } else {
                        ov0Var7.c0(-719337922);
                        strO = ke0.O(2131623999, new Object[]{Integer.valueOf(list.size() + 1)}, ov0Var7);
                        ov0Var7.p(false);
                    }
                    s83.b(strO, null, 0L, v63.c(14), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 1597440, 0, 262062);
                } else {
                    ov0Var7.W();
                }
                return mf3Var;
            case mc0.c /* 10 */:
                Integer num = (Integer) obj4;
                f30 f30Var7 = (f30) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var8 = (ov0) f30Var7;
                if (ov0Var8.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    s83.b(ke0.N(num != null ? 2131624496 : 2131624493, ov0Var8), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var8, 0, 0, 262142);
                } else {
                    ov0Var8.W();
                }
                return mf3Var;
            case 11:
                ar2 ar2Var = (ar2) obj4;
                dv1 dv1Var = (dv1) obj;
                ((Integer) obj3).getClass();
                ov0 ov0Var9 = (ov0) ((f30) obj2);
                ov0Var9.c0(-1914520728);
                xb0 xb0Var = (xb0) ov0Var9.j(z30.h);
                Object objQ3 = ov0Var9.Q();
                Object obj5 = objQ3;
                if (objQ3 == c30Var) {
                    w52 w52VarH = ke0.H(new p41(0L));
                    ov0Var9.m0(w52VarH);
                    obj5 = w52VarH;
                }
                ey1 ey1Var = (ey1) obj5;
                boolean zH2 = ov0Var9.h(ar2Var);
                Object objQ4 = ov0Var9.Q();
                Object obj6 = objQ4;
                if (zH2 || objQ4 == c30Var) {
                    qi2 qi2Var = new qi2(7, ar2Var, ey1Var);
                    ov0Var9.m0(qi2Var);
                    obj6 = qi2Var;
                }
                au0 au0Var = (au0) obj6;
                boolean zF2 = ov0Var9.f(xb0Var);
                Object objQ5 = ov0Var9.Q();
                Object obj7 = objQ5;
                if (zF2 || objQ5 == c30Var) {
                    dr2 dr2Var = new dr2(xb0Var, ey1Var, false ? 1 : 0);
                    ov0Var9.m0(dr2Var);
                    obj7 = dr2Var;
                }
                vi viVar = xq2.a;
                dv1 dv1VarP = xp1.p(dv1Var, new bu(au0Var, (lu0) obj7));
                ov0Var9.p(false);
                return dv1VarP;
            case mc0.d /* 12 */:
                return SemaphoreAndMutexImpl.onCancellationRelease$lambda$2((SemaphoreAndMutexImpl) obj4, (Throwable) obj, (mf3) obj2, (y70) obj3);
            case 13:
                ex2 ex2Var = (ex2) obj4;
                gr1 gr1Var = (gr1) obj;
                h82 h82VarS = ((zq1) obj2).s(((l50) obj3).a);
                int iN0 = td0.b(Float.NaN, Float.NaN) ? ex2Var.m == x32.e ? h82VarS.e / 2 : h82VarS.f / 2 : gr1Var.n0(Float.NaN);
                int i6 = h82VarS.e;
                int i7 = h82VarS.f;
                Map mapSingletonMap = Collections.singletonMap(dx2.f, Integer.valueOf(iN0));
                mapSingletonMap.getClass();
                return gr1Var.H0(i6, i7, mapSingletonMap, new gn0(h82VarS, 5));
            case 14:
                x73 x73Var3 = (x73) obj4;
                dv1 dv1Var2 = (dv1) obj;
                ((Integer) obj3).getClass();
                ov0 ov0Var10 = (ov0) ((f30) obj2);
                ov0Var10.c0(1980580247);
                xb0 xb0Var2 = (xb0) ov0Var10.j(z30.h);
                Object objQ6 = ov0Var10.Q();
                Object obj8 = objQ6;
                if (objQ6 == c30Var) {
                    w52 w52VarH2 = ke0.H(new p41(0L));
                    ov0Var10.m0(w52VarH2);
                    obj8 = w52VarH2;
                }
                ey1 ey1Var2 = (ey1) obj8;
                boolean zH3 = ov0Var10.h(x73Var3);
                Object objQ7 = ov0Var10.Q();
                Object obj9 = objQ7;
                if (zH3 || objQ7 == c30Var) {
                    qi2 qi2Var2 = new qi2(i3, x73Var3, ey1Var2);
                    ov0Var10.m0(qi2Var2);
                    obj9 = qi2Var2;
                }
                au0 au0Var2 = (au0) obj9;
                boolean zF3 = ov0Var10.f(xb0Var2);
                Object objQ8 = ov0Var10.Q();
                Object obj10 = objQ8;
                if (zF3 || objQ8 == c30Var) {
                    dr2 dr2Var2 = new dr2(xb0Var2, ey1Var2, i2);
                    ov0Var10.m0(dr2Var2);
                    obj10 = dr2Var2;
                }
                vi viVar2 = xq2.a;
                dv1 dv1VarP2 = xp1.p(dv1Var2, new bu(au0Var2, (lu0) obj10));
                ov0Var10.p(false);
                return dv1VarP2;
            default:
                og3 og3Var = (og3) obj4;
                f30 f30Var8 = (f30) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var11 = (ov0) f30Var8;
                if (ov0Var11.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    s83.b(ke0.N(og3Var.k ? 2131625148 : 2131625147, ov0Var11), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var11, 0, 0, 262142);
                } else {
                    ov0Var11.W();
                }
                return mf3Var;
        }
    }

    public /* synthetic */ au(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }
}
