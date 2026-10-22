package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import java.text.DateFormat;
import java.util.Date;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class h5 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ey1 f;

    public /* synthetic */ h5(ey1 ey1Var, int i) {
        this.e = i;
        this.f = ey1Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    s83.b(ke0.N(((Boolean) ey1Var.getValue()).booleanValue() ? 2131624250 : 2131624261, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                }
                break;
            case 1:
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    s83.b(ke0.N(((Boolean) ey1Var.getValue()).booleanValue() ? 2131624206 : 2131624207, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                }
                break;
            case 2:
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ov0Var3.W();
                } else {
                    dv1 dv1VarD = zm3.D(av1.a, 20.0f);
                    yz yzVarA = wz.a(new jo(12.0f, true, new fo(0)), j9.r, ov0Var3, 6);
                    int iHashCode = Long.hashCode(ov0Var3.T);
                    l72 l72VarL = ov0Var3.l();
                    dv1 dv1VarH = xp1.H(ov0Var3, dv1VarD);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, v20.e, yzVarA);
                    q73.h(ov0Var3, v20.d, l72VarL);
                    q73.h(ov0Var3, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var3, v20.g);
                    q73.h(ov0Var3, v20.c, dv1VarH);
                    CloudAccount account = ((CloudAccountState) ey1Var.getValue()).getAccount();
                    String username = account != null ? account.getUsername() : null;
                    if (username == null) {
                        username = az2.h(ov0Var3, -215593757, 2131624121, ov0Var3, false);
                    } else {
                        ov0Var3.c0(-215594594);
                        ov0Var3.p(false);
                    }
                    String str = username;
                    hh0 hh0Var = le3.a;
                    s83.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var3.j(hh0Var)).f, ov0Var3, 0, 0, 131070);
                    CloudAccount account2 = ((CloudAccountState) ey1Var.getValue()).getAccount();
                    if (account2 == null) {
                        ov0Var3.c0(1906680801);
                    } else {
                        ov0Var3.c0(1906680802);
                        s83.b(ke0.N(o51.f(account2.getPlan(), "pro") ? 2131624237 : 2131624236, ov0Var3), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262142);
                        s83.b(ke0.O(2131624119, new Object[]{account2.getId()}, ov0Var3), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var3.j(hh0Var)).l, ov0Var3, 0, 0, 131070);
                        s83.b(ke0.O(2131624167, new Object[]{account2.getPublicKeyFingerprint()}, ov0Var3), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var3.j(hh0Var)).l, ov0Var3, 0, 0, 131070);
                        if (o51.f(account2.getPlan(), "pro")) {
                            ov0Var3.c0(1956924433);
                            Long subscriptionExpiresAt = account2.getSubscriptionExpiresAt();
                            if (subscriptionExpiresAt == null) {
                                ov0Var3.c0(535115280);
                            } else {
                                ov0Var3.c0(535115281);
                                String str2 = DateFormat.getDateTimeInstance().format(new Date(subscriptionExpiresAt.longValue()));
                                str2.getClass();
                                s83.b(ke0.O(2131624181, new Object[]{str2}, ov0Var3), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262142);
                            }
                            ov0Var3.p(false);
                        } else {
                            ov0Var3.c0(525745748);
                        }
                        ov0Var3.p(false);
                    }
                    ov0Var3.p(false);
                    ov0Var3.p(true);
                }
                break;
            case 3:
                pu0 pu0Var = (pu0) obj;
                f30 f30Var4 = (f30) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                pu0Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((ov0) f30Var4).h(pu0Var) ? 4 : 2;
                }
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    ov0Var4.W();
                } else {
                    if (((String) ey1Var.getValue()).length() == 0) {
                        ov0Var4.c0(-961069549);
                        s83.b(ke0.N(2131624957, ov0Var4), null, hz.c(0.38f, ((kz) ov0Var4.j(mz.a)).q), v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262122);
                    } else {
                        ov0Var4.c0(-969175925);
                    }
                    ov0Var4.p(false);
                    pu0Var.invoke(ov0Var4, Integer.valueOf(iIntValue4 & 14));
                }
                break;
            case 4:
                pu0 pu0Var2 = (pu0) obj;
                f30 f30Var5 = (f30) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                pu0Var2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((ov0) f30Var5).h(pu0Var2) ? 4 : 2;
                }
                ov0 ov0Var5 = (ov0) f30Var5;
                if (!ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    ov0Var5.W();
                } else {
                    if (((String) ey1Var.getValue()).length() == 0) {
                        ov0Var5.c0(-1650121257);
                        s83.b(ke0.N(2131624070, ov0Var5), null, hz.c(0.35f, ((kz) ov0Var5.j(mz.a)).q), v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262122);
                    } else {
                        ov0Var5.c0(-1656723420);
                    }
                    ov0Var5.p(false);
                    pu0Var2.invoke(ov0Var5, Integer.valueOf(iIntValue5 & 14));
                }
                break;
            case Logger.WARN /* 5 */:
                pu0 pu0Var3 = (pu0) obj;
                f30 f30Var6 = (f30) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                pu0Var3.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((ov0) f30Var6).h(pu0Var3) ? 4 : 2;
                }
                ov0 ov0Var6 = (ov0) f30Var6;
                if (!ov0Var6.T(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    ov0Var6.W();
                } else {
                    if (((String) ey1Var.getValue()).length() == 0) {
                        ov0Var6.c0(-1223797427);
                        s83.b(ke0.N(2131624068, ov0Var6), null, hz.c(0.35f, ((kz) ov0Var6.j(mz.a)).q), v63.c(13), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 24576, 0, 262122);
                    } else {
                        ov0Var6.c0(-1232493733);
                    }
                    ov0Var6.p(false);
                    pu0Var3.invoke(ov0Var6, Integer.valueOf(iIntValue6 & 14));
                }
                break;
            case Logger.ERROR /* 6 */:
                pu0 pu0Var4 = (pu0) obj;
                f30 f30Var7 = (f30) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                pu0Var4.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((ov0) f30Var7).h(pu0Var4) ? 4 : 2;
                }
                ov0 ov0Var7 = (ov0) f30Var7;
                if (!ov0Var7.T(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    ov0Var7.W();
                } else {
                    if (((String) ey1Var.getValue()).length() == 0) {
                        ov0Var7.c0(442069771);
                        s83.b(ke0.N(2131624073, ov0Var7), null, hz.c(0.35f, ((kz) ov0Var7.j(mz.a)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 24576, 0, 262122);
                    } else {
                        ov0Var7.c0(428777405);
                    }
                    ov0Var7.p(false);
                    pu0Var4.invoke(ov0Var7, Integer.valueOf(iIntValue7 & 14));
                }
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                pu0 pu0Var5 = (pu0) obj;
                f30 f30Var8 = (f30) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                pu0Var5.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((ov0) f30Var8).h(pu0Var5) ? 4 : 2;
                }
                ov0 ov0Var8 = (ov0) f30Var8;
                if (!ov0Var8.T(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    ov0Var8.W();
                } else {
                    if (((String) ey1Var.getValue()).length() == 0) {
                        ov0Var8.c0(-2140567385);
                        s83.b(ke0.N(2131625174, ov0Var8), null, hz.c(0.35f, ((kz) ov0Var8.j(mz.a)).q), v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var8, 24576, 0, 262122);
                    } else {
                        ov0Var8.c0(2147280854);
                    }
                    ov0Var8.p(false);
                    pu0Var5.invoke(ov0Var8, Integer.valueOf(iIntValue8 & 14));
                }
                break;
            case 8:
                pu0 pu0Var6 = (pu0) obj;
                f30 f30Var9 = (f30) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                pu0Var6.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((ov0) f30Var9).h(pu0Var6) ? 4 : 2;
                }
                ov0 ov0Var9 = (ov0) f30Var9;
                if (!ov0Var9.T(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    ov0Var9.W();
                } else {
                    if (((String) ey1Var.getValue()).length() == 0) {
                        ov0Var9.c0(1360679313);
                        s83.b(ke0.N(2131625166, ov0Var9), null, hz.c(0.35f, ((kz) ov0Var9.j(mz.a)).q), v63.c(13), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 24576, 0, 262122);
                    } else {
                        ov0Var9.c0(1351472127);
                    }
                    ov0Var9.p(false);
                    pu0Var6.invoke(ov0Var9, Integer.valueOf(iIntValue9 & 14));
                }
                break;
            case mc0.b /* 9 */:
                f30 f30Var10 = (f30) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var10 = (ov0) f30Var10;
                if (!ov0Var10.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    ov0Var10.W();
                } else {
                    String str3 = (String) ey1Var.getValue();
                    s83.b(o51.f(str3, "zh") ? "确定" : o51.f(str3, "ar") ? "موافق" : "Confirm", null, 0L, v63.c(16), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var10, 1597440, 0, 262062);
                }
                break;
            case mc0.c /* 10 */:
                pu0 pu0Var7 = (pu0) obj;
                f30 f30Var11 = (f30) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                pu0Var7.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((ov0) f30Var11).h(pu0Var7) ? 4 : 2;
                }
                ov0 ov0Var11 = (ov0) f30Var11;
                if (!ov0Var11.T(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    ov0Var11.W();
                } else {
                    if (((String) ey1Var.getValue()).length() == 0) {
                        ov0Var11.c0(-1734188714);
                        s83.b(ke0.N(2131624964, ov0Var11), null, hz.c(0.4f, ((kz) ov0Var11.j(mz.a)).q), v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var11, 24576, 0, 262122);
                    } else {
                        ov0Var11.c0(-1742754913);
                    }
                    ov0Var11.p(false);
                    pu0Var7.invoke(ov0Var11, Integer.valueOf(iIntValue11 & 14));
                }
                break;
            case 11:
                pu0 pu0Var8 = (pu0) obj;
                f30 f30Var12 = (f30) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                pu0Var8.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= ((ov0) f30Var12).h(pu0Var8) ? 4 : 2;
                }
                ov0 ov0Var12 = (ov0) f30Var12;
                if (!ov0Var12.T(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    ov0Var12.W();
                } else {
                    if (((String) ey1Var.getValue()).length() == 0) {
                        ov0Var12.c0(2018317051);
                        s83.b(ke0.N(2131624989, ov0Var12), null, hz.c(0.38f, ((kz) ov0Var12.j(mz.a)).q), v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var12, 24576, 0, 262122);
                    } else {
                        ov0Var12.c0(1997278343);
                    }
                    ov0Var12.p(false);
                    pu0Var8.invoke(ov0Var12, Integer.valueOf(iIntValue12 & 14));
                }
                break;
            case mc0.d /* 12 */:
                pu0 pu0Var9 = (pu0) obj;
                f30 f30Var13 = (f30) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                pu0Var9.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((ov0) f30Var13).h(pu0Var9) ? 4 : 2;
                }
                ov0 ov0Var13 = (ov0) f30Var13;
                if (!ov0Var13.T(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    ov0Var13.W();
                } else {
                    if (((String) ey1Var.getValue()).length() == 0) {
                        ov0Var13.c0(2049873568);
                        s83.b(ke0.N(2131624001, ov0Var13), null, hz.c(0.38f, ((kz) ov0Var13.j(mz.a)).q), v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var13, 24576, 0, 262122);
                    } else {
                        ov0Var13.c0(2025505832);
                    }
                    ov0Var13.p(false);
                    pu0Var9.invoke(ov0Var13, Integer.valueOf(iIntValue13 & 14));
                }
                break;
            default:
                pu0 pu0Var10 = (pu0) obj;
                f30 f30Var14 = (f30) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                pu0Var10.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= ((ov0) f30Var14).h(pu0Var10) ? 4 : 2;
                }
                ov0 ov0Var14 = (ov0) f30Var14;
                if (!ov0Var14.T(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    ov0Var14.W();
                } else {
                    if (((String) ey1Var.getValue()).length() == 0) {
                        ov0Var14.c0(-2123738788);
                        s83.b(ke0.N(2131624957, ov0Var14), null, hz.c(0.38f, ((kz) ov0Var14.j(mz.a)).q), v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var14, 24576, 0, 262122);
                    } else {
                        ov0Var14.c0(-2139583012);
                    }
                    ov0Var14.p(false);
                    pu0Var10.invoke(ov0Var14, Integer.valueOf(iIntValue14 & 14));
                }
                break;
        }
        return mf3Var;
    }
}
