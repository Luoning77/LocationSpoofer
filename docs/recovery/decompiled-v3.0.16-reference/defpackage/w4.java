package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountDevice;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.MembershipOrder;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.db.LocationRecord;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.ImportExportCounts;
import com.vincenthzr.locationspoofer.data.model.RootSetupTestResult;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class w4 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ w4(MembershipOrder membershipOrder, boolean z, au0 au0Var, au0 au0Var2, au0 au0Var3, int i) {
        this.e = 13;
        this.i = membershipOrder;
        this.f = z;
        this.j = au0Var;
        this.g = au0Var2;
        this.h = au0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x088e  */
    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.e;
        c30 c30Var = d30.a;
        boolean z4 = this.f;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.j;
        Object obj6 = this.i;
        switch (i) {
            case 0:
                l6 l6Var = (l6) obj6;
                CloudAccountDevice cloudAccountDevice = (CloudAccountDevice) obj5;
                ey1 ey1Var = (ey1) obj4;
                ey1 ey1Var2 = (ey1) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    boolean zH = ov0Var.h(l6Var) | ov0Var.h(cloudAccountDevice);
                    Object objQ = ov0Var.Q();
                    if (zH || objQ == c30Var) {
                        z = false;
                        objQ = new b5(l6Var, cloudAccountDevice, ey1Var, 0);
                        ov0Var.m0(objQ);
                    } else {
                        z = false;
                    }
                    au0 au0Var = (au0) objQ;
                    if (z4) {
                        z2 = z;
                    } else {
                        CloudAccount account = ((CloudAccountState) ey1Var2.getValue()).getAccount();
                        if (o51.f(account != null ? account.getDeviceRole() : null, "primary") || o51.f(cloudAccountDevice.getDeviceRole(), "software")) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                    }
                    n51.j(au0Var, null, z2, null, null, null, o51.P, ov0Var, 805306368, 506);
                }
                break;
            case 1:
                pu0 pu0Var = (pu0) obj6;
                ey1 ey1Var3 = (ey1) obj4;
                ey1 ey1Var4 = (ey1) obj3;
                ey1 ey1Var5 = (ey1) obj5;
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    boolean zF = ov0Var2.f(pu0Var);
                    Object objQ2 = ov0Var2.Q();
                    if (zF || objQ2 == c30Var) {
                        objQ2 = new q5(pu0Var, ey1Var3, ey1Var4, 0);
                        ov0Var2.m0(objQ2);
                    }
                    n51.j((au0) objQ2, null, !z4 && ((String) ey1Var3.getValue()).length() > 0 && ((String) ey1Var4.getValue()).length() >= 12 && o51.f((String) ey1Var4.getValue(), (String) ey1Var5.getValue()), null, null, null, o51.S, ov0Var2, 805306368, 506);
                }
                break;
            case 2:
                String str = (String) obj6;
                ey1 ey1Var6 = (ey1) obj4;
                ey1 ey1Var7 = (ey1) obj3;
                ey1 ey1Var8 = (ey1) obj5;
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ov0Var3.W();
                } else {
                    dv1 dv1VarP = zm3.P(av1Var, zm3.O(ov0Var3), true);
                    yz yzVarA = wz.a(new jo(12.0f, true, new fo(0)), j9.r, ov0Var3, 6);
                    int iHashCode = Long.hashCode(ov0Var3.T);
                    l72 l72VarL = ov0Var3.l();
                    dv1 dv1VarH = xp1.H(ov0Var3, dv1VarP);
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
                    s83.b(ke0.N(2131624125, ov0Var3), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262142);
                    if (str == null) {
                        ov0Var3.c0(1290368062);
                    } else {
                        ov0Var3.c0(1290368063);
                        s83.b(ke0.N(ji2.A(str), ov0Var3), null, ((kz) ov0Var3.j(mz.a)).w, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262138);
                    }
                    ov0Var3.p(false);
                    String str2 = (String) ey1Var6.getValue();
                    boolean z5 = !z4;
                    j62 j62Var = new j62();
                    n91 n91Var = new n91(7, 0, 123);
                    Object objQ3 = ov0Var3.Q();
                    if (objQ3 == c30Var) {
                        objQ3 = new f4(ey1Var6, 6);
                        ov0Var3.m0(objQ3);
                    }
                    ee0.i(str2, (lu0) objQ3, null, z5, null, o51.V, null, null, null, null, false, j62Var, n91Var, null, true, 0, 0, null, null, ov0Var3, 1572912, 12779520, 8208308);
                    String str3 = (String) ey1Var7.getValue();
                    j62 j62Var2 = new j62();
                    n91 n91Var2 = new n91(7, 0, 123);
                    Object objQ4 = ov0Var3.Q();
                    if (objQ4 == c30Var) {
                        objQ4 = new f4(ey1Var7, 7);
                        ov0Var3.m0(objQ4);
                    }
                    ee0.i(str3, (lu0) objQ4, null, z5, null, o51.W, null, null, null, o51.X, false, j62Var2, n91Var2, null, true, 0, 0, null, null, ov0Var3, 1572912, 12779904, 8204212);
                    String str4 = (String) ey1Var8.getValue();
                    boolean z6 = ((String) ey1Var8.getValue()).length() > 0 && !o51.f((String) ey1Var8.getValue(), (String) ey1Var7.getValue());
                    j62 j62Var3 = new j62();
                    n91 n91Var3 = new n91(7, 0, 123);
                    Object objQ5 = ov0Var3.Q();
                    if (objQ5 == c30Var) {
                        objQ5 = new f4(ey1Var8, 8);
                        ov0Var3.m0(objQ5);
                    }
                    ee0.i(str4, (lu0) objQ5, null, z5, null, o51.Y, null, null, null, null, z6, j62Var3, n91Var3, null, true, 0, 0, null, null, ov0Var3, 1572912, 12779520, 8200116);
                    ov0Var3.p(true);
                }
                break;
            case 3:
                ul1 ul1Var = (ul1) obj6;
                LocationRecord locationRecord = (LocationRecord) obj5;
                ey1 ey1Var9 = (ey1) obj4;
                ey1 ey1Var10 = (ey1) obj3;
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ov0Var4.W();
                } else {
                    boolean z7 = !z4;
                    boolean zH2 = ov0Var4.h(ul1Var) | ov0Var4.h(locationRecord) | ov0Var4.f(ey1Var9) | ov0Var4.f(ey1Var10);
                    Object objQ6 = ov0Var4.Q();
                    if (zH2 || objQ6 == c30Var) {
                        q2 q2Var = new q2((Object) ul1Var, (Object) locationRecord, ey1Var9, ey1Var10, 4);
                        ov0Var4.m0(q2Var);
                        objQ6 = q2Var;
                    }
                    n51.a((au0) objQ6, null, z7, null, null, null, null, null, sb.a0(1673966802, new z5(2, z4), ov0Var4), ov0Var4, 805306368, 506);
                }
                break;
            case 4:
                AppState appState = (AppState) obj6;
                LocationRecord locationRecord2 = (LocationRecord) obj5;
                ey1 ey1Var11 = (ey1) obj4;
                ey1 ey1Var12 = (ey1) obj3;
                f30 f30Var5 = (f30) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ov0 ov0Var5 = (ov0) f30Var5;
                if (!ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ov0Var5.W();
                } else {
                    dv1 dv1VarP2 = zm3.P(iw2.h(av1Var, 0.0f, 360.0f, 1), zm3.O(ov0Var5), true);
                    yz yzVarA2 = wz.a(new jo(12.0f, true, new fo(0)), j9.r, ov0Var5, 6);
                    int iHashCode2 = Long.hashCode(ov0Var5.T);
                    l72 l72VarL2 = ov0Var5.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var5, dv1VarP2);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var5.g0();
                    if (ov0Var5.S) {
                        ov0Var5.k(x30Var2);
                    } else {
                        ov0Var5.p0();
                    }
                    q73.h(ov0Var5, v20.e, yzVarA2);
                    q73.h(ov0Var5, v20.d, l72VarL2);
                    q73.h(ov0Var5, v20.f, Integer.valueOf(iHashCode2));
                    q73.g(ov0Var5, v20.g);
                    q73.h(ov0Var5, v20.c, dv1VarH2);
                    s83.b(ke0.N(2131624285, ov0Var5), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 0, 0, 262142);
                    if (appState.getPendingCollectionLocations().size() > 1) {
                        ov0Var5.c0(-1654496164);
                        s83.b(ke0.O(2131624286, new Object[]{Integer.valueOf(appState.getPendingCollectionLocations().size())}, ov0Var5), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 0, 0, 262142);
                        z3 = false;
                    } else {
                        z3 = false;
                        ov0Var5.c0(-1656721499);
                    }
                    ov0Var5.p(z3);
                    s83.b(String.format(Locale.US, "%.6f, %.6f", Arrays.copyOf(new Object[]{Double.valueOf(locationRecord2.getLat()), Double.valueOf(locationRecord2.getLng())}, 2)), null, ((kz) ov0Var5.j(mz.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var5.j(le3.a)).l, ov0Var5, 0, 0, 131066);
                    String str5 = (String) ey1Var11.getValue();
                    boolean z8 = !z4;
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    boolean zF2 = ov0Var5.f(ey1Var11);
                    Object objQ7 = ov0Var5.Q();
                    if (zF2 || objQ7 == c30Var) {
                        objQ7 = new f4(ey1Var11, 15);
                        ov0Var5.m0(objQ7);
                    }
                    ee0.i(str5, (lu0) objQ7, dv1VarE, z8, null, ji2.c, ji2.d, null, null, null, false, null, null, null, true, 0, 0, null, null, ov0Var5, 14156160, 12582912, 8257328);
                    String str6 = (String) ey1Var12.getValue();
                    dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                    boolean zF3 = ov0Var5.f(ey1Var12);
                    Object objQ8 = ov0Var5.Q();
                    if (zF3 || objQ8 == c30Var) {
                        objQ8 = new f4(ey1Var12, 16);
                        ov0Var5.m0(objQ8);
                    }
                    ee0.i(str6, (lu0) objQ8, dv1VarE2, z8, null, ji2.e, ji2.f, null, null, null, false, null, null, null, false, 3, 2, null, null, ov0Var5, 14156160, 905969664, 7601968);
                    ov0Var5.p(true);
                }
                break;
            case Logger.WARN /* 5 */:
                ((Integer) obj2).getClass();
                am1.b((ul1) obj6, (AppState) obj5, this.f, (au0) obj4, (au0) obj3, (f30) obj, wc0.m0(1));
                break;
            case Logger.ERROR /* 6 */:
                ((Integer) obj2).getClass();
                xp1.f((AppInfoItem) obj6, (String) obj5, this.f, (au0) obj4, (lu0) obj3, (f30) obj, wc0.m0(3073));
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ((Integer) obj2).getClass();
                sb.E((String) obj6, (String) obj5, this.f, (au0) obj4, (pu0) obj3, (f30) obj, wc0.m0(1));
                break;
            case 8:
                ImportExportCounts importExportCounts = (ImportExportCounts) obj6;
                ey1 ey1Var13 = (ey1) obj4;
                au0 au0Var2 = (au0) obj5;
                lu0 lu0Var = (lu0) obj3;
                f30 f30Var6 = (f30) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ov0 ov0Var6 = (ov0) f30Var6;
                if (!ov0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ov0Var6.W();
                } else {
                    sb.C(zm3.F(iw2.e(av1Var, 1.0f), 8.0f, 0.0f, 2), cj2.a(22.0f), ym3.t(((kz) ov0Var6.j(mz.a)).p, 0L, ov0Var6, 0, 14), ym3.u(62, 8.0f), sb.a0(-1296924180, new i11(this.f, importExportCounts, ey1Var13, au0Var2, lu0Var), ov0Var6), ov0Var6, 196614, 16);
                }
                break;
            case mc0.b /* 9 */:
                ((Integer) obj2).getClass();
                mc0.c((CompleteLocation) obj6, (String) obj5, this.f, (au0) obj4, (au0) obj3, (f30) obj, wc0.m0(1));
                break;
            case mc0.c /* 10 */:
                String str7 = (String) obj6;
                lo1 lo1Var = (lo1) obj5;
                CompleteLocation completeLocation = (CompleteLocation) obj3;
                ey1 ey1Var14 = (ey1) obj4;
                f30 f30Var7 = (f30) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ov0 ov0Var7 = (ov0) f30Var7;
                if (!ov0Var7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ov0Var7.W();
                } else {
                    sb.C(iw2.q(iw2.e(av1Var, 0.88f)), cj2.a(24.0f), ym3.t(((kz) ov0Var7.j(mz.a)).p, 0L, ov0Var7, 0, 14), ym3.u(62, 8.0f), sb.a0(418522150, new i11(str7, this.f, lo1Var, completeLocation, ey1Var14), ov0Var7), ov0Var7, 196614, 16);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                mh0.d((ul1) obj6, (AppState) obj5, this.f, (au0) obj4, (lo1) obj3, (f30) obj, wc0.m0(1));
                break;
            case mc0.d /* 12 */:
                String str8 = (String) obj6;
                String str9 = (String) obj5;
                au0 au0Var3 = (au0) obj4;
                au0 au0Var4 = (au0) obj3;
                f30 f30Var8 = (f30) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ov0 ov0Var8 = (ov0) f30Var8;
                if (!ov0Var8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ov0Var8.W();
                } else {
                    sb.C(iw2.q(iw2.e(av1Var, 0.85f)), cj2.a(20.0f), ym3.t(((kz) ov0Var8.j(mz.a)).p, 0L, ov0Var8, 0, 14), ym3.u(62, 8.0f), sb.a0(-1413823909, new i11(str8, str9, this.f, au0Var3, au0Var4), ov0Var8), ov0Var8, 196614, 16);
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                wc0.h((MembershipOrder) obj6, this.f, (au0) obj5, (au0) obj4, (au0) obj3, (f30) obj, wc0.m0(1));
                break;
            default:
                RootSetupTestResult rootSetupTestResult = (RootSetupTestResult) obj6;
                ay ayVar = (ay) obj5;
                Context context = (Context) obj4;
                au0 au0Var5 = (au0) obj3;
                f30 f30Var9 = (f30) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ov0 ov0Var9 = (ov0) f30Var9;
                if (!ov0Var9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ov0Var9.W();
                } else {
                    sb.C(iw2.q(iw2.e(av1Var, 0.9f)), cj2.a(24.0f), ym3.t(((kz) ov0Var9.j(mz.a)).p, 0L, ov0Var9, 0, 14), ym3.u(62, 8.0f), sb.a0(-1067668526, new i11(rootSetupTestResult, this.f, ayVar, context, au0Var5), ov0Var9), ov0Var9, 196614, 16);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ w4(RootSetupTestResult rootSetupTestResult, boolean z, ay ayVar, Context context, au0 au0Var) {
        this.e = 14;
        this.i = rootSetupTestResult;
        this.f = z;
        this.j = ayVar;
        this.g = context;
        this.h = au0Var;
    }

    public /* synthetic */ w4(Object obj, Object obj2, boolean z, au0 au0Var, Object obj3, int i, int i2) {
        this.e = i2;
        this.i = obj;
        this.j = obj2;
        this.f = z;
        this.g = au0Var;
        this.h = obj3;
    }

    public /* synthetic */ w4(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i) {
        this.e = i;
        this.i = obj;
        this.j = obj2;
        this.f = z;
        this.g = obj3;
        this.h = obj4;
    }

    public /* synthetic */ w4(Object obj, boolean z, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, int i) {
        this.e = i;
        this.i = obj;
        this.f = z;
        this.g = ey1Var;
        this.h = ey1Var2;
        this.j = ey1Var3;
    }

    public /* synthetic */ w4(String str, boolean z, lo1 lo1Var, CompleteLocation completeLocation, ey1 ey1Var) {
        this.e = 10;
        this.i = str;
        this.f = z;
        this.j = lo1Var;
        this.h = completeLocation;
        this.g = ey1Var;
    }

    public /* synthetic */ w4(boolean z, ul1 ul1Var, LocationRecord locationRecord, ey1 ey1Var, ey1 ey1Var2) {
        this.e = 3;
        this.f = z;
        this.i = ul1Var;
        this.j = locationRecord;
        this.g = ey1Var;
        this.h = ey1Var2;
    }

    public /* synthetic */ w4(boolean z, ImportExportCounts importExportCounts, ey1 ey1Var, au0 au0Var, lu0 lu0Var) {
        this.e = 8;
        this.f = z;
        this.i = importExportCounts;
        this.g = ey1Var;
        this.j = au0Var;
        this.h = lu0Var;
    }
}
