package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class en implements ru0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public en(List list, boolean z, lu0 lu0Var, lu0 lu0Var2) {
        this.e = 1;
        this.f = list;
        this.g = z;
        this.h = lu0Var;
        this.i = lu0Var2;
    }

    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        String strH;
        long jC;
        long jC2;
        int i5 = this.e;
        mf3 mf3Var = mf3.a;
        c30 c30Var = d30.a;
        Object obj5 = this.h;
        Object obj6 = this.f;
        Object obj7 = this.i;
        switch (i5) {
            case 0:
                bc1 bc1Var = (bc1) obj;
                int iIntValue = ((Number) obj2).intValue();
                f30 f30Var = (f30) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (((ov0) f30Var).f(bc1Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= ((ov0) f30Var).d(iIntValue) ? 32 : 16;
                }
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(i & 1, (i & 147) != 146)) {
                    AppInfoItem appInfoItem = (AppInfoItem) ((List) obj6).get(iIntValue);
                    ov0Var.c0(93983797);
                    String str = ((AppState) obj5).getAppCoordinateSystems().get(appInfoItem.getPackageName());
                    boolean zH = ov0Var.h(appInfoItem);
                    Object objQ = ov0Var.Q();
                    if (zH || objQ == c30Var) {
                        objQ = new bn(1, appInfoItem, (ey1) obj7);
                        ov0Var.m0(objQ);
                    }
                    ks.D(appInfoItem, str, this.g, (au0) objQ, ov0Var, 0);
                    ov0Var.p(false);
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            case 1:
                bc1 bc1Var2 = (bc1) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                f30 f30Var2 = (f30) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                lu0 lu0Var = (lu0) obj7;
                lu0 lu0Var2 = (lu0) obj5;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (((ov0) f30Var2).f(bc1Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= ((ov0) f30Var2).d(iIntValue3) ? 32 : 16;
                }
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(i2 & 1, (i2 & 147) != 146)) {
                    SavedLocation savedLocation = (SavedLocation) ((List) obj6).get(iIntValue3);
                    ov0Var2.c0(-570166758);
                    boolean zF = ov0Var2.f(lu0Var2) | ov0Var2.h(savedLocation);
                    Object objQ2 = ov0Var2.Q();
                    if (zF || objQ2 == c30Var) {
                        objQ2 = new zl2(lu0Var2, savedLocation, 0);
                        ov0Var2.m0(objQ2);
                    }
                    au0 au0Var = (au0) objQ2;
                    boolean zF2 = ov0Var2.f(lu0Var) | ov0Var2.h(savedLocation);
                    Object objQ3 = ov0Var2.Q();
                    if (zF2 || objQ3 == c30Var) {
                        objQ3 = new zl2(lu0Var, savedLocation, 1);
                        ov0Var2.m0(objQ3);
                    }
                    ig0.d(savedLocation, this.g, au0Var, (au0) objQ3, ov0Var2, 0);
                    ov0Var2.p(false);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            case 2:
                bc1 bc1Var3 = (bc1) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                f30 f30Var3 = (f30) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                ul1 ul1Var = (ul1) obj7;
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (((ov0) f30Var3).f(bc1Var3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= ((ov0) f30Var3).d(iIntValue5) ? 32 : 16;
                }
                ov0 ov0Var3 = (ov0) f30Var3;
                if (ov0Var3.T(i3 & 1, (i3 & 147) != 146)) {
                    AppInfoItem appInfoItem2 = (AppInfoItem) ((List) obj6).get(iIntValue5);
                    ov0Var3.c0(1926263608);
                    boolean zContains = ((AppState) obj5).getSystemHookPackages().contains(appInfoItem2.getPackageName());
                    boolean zH2 = ov0Var3.h(ul1Var) | ov0Var3.h(appInfoItem2);
                    Object objQ4 = ov0Var3.Q();
                    if (zH2 || objQ4 == c30Var) {
                        objQ4 = new l3(20, ul1Var, appInfoItem2);
                        ov0Var3.m0(objQ4);
                    }
                    xq1.s(appInfoItem2, zContains, this.g, (lu0) objQ4, ov0Var3, 0);
                    ov0Var3.p(false);
                } else {
                    ov0Var3.W();
                }
                return mf3Var;
            default:
                bc1 bc1Var4 = (bc1) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                f30 f30Var4 = (f30) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                ey1 ey1Var = (ey1) obj7;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (((ov0) f30Var4).f(bc1Var4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= ((ov0) f30Var4).d(iIntValue7) ? 32 : 16;
                }
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(i4 & 1, (i4 & 147) != 146)) {
                    ov0Var4.W();
                    return mf3Var;
                }
                o43 o43Var = (o43) ((Object[]) obj6)[iIntValue7];
                ov0Var4.c0(-1612013900);
                boolean z = ((o43) ey1Var.getValue()) == o43Var;
                int size = ((AppState) obj5).getSystemHookPackages().size();
                int iOrdinal = o43Var.ordinal();
                if (iOrdinal == 0) {
                    strH = az2.h(ov0Var4, 1663739566, 2131625102, ov0Var4, false);
                } else if (iOrdinal == 1) {
                    ov0Var4.c0(1663741419);
                    strH = ke0.O(2131624973, new Object[]{Integer.valueOf(size)}, ov0Var4);
                    ov0Var4.p(false);
                } else if (iOrdinal == 2) {
                    strH = az2.h(ov0Var4, 1663744148, 2131625109, ov0Var4, false);
                } else {
                    if (iOrdinal != 3) {
                        ov0Var4.c0(1663738769);
                        ov0Var4.p(false);
                        b81.d();
                        return null;
                    }
                    strH = az2.h(ov0Var4, 1663746230, 2131625108, ov0Var4, false);
                }
                String str2 = strH;
                dv1 dv1VarN = xp1.n(av1.a, cj2.a(10.0f));
                if (z) {
                    jC = bk.g;
                } else {
                    jC = this.g ? hz.c(0.06f, hz.c) : hz.c(0.04f, hz.b);
                }
                dv1 dv1VarK = xp1.k(dv1VarN, jC, o51.p0);
                boolean zF3 = ov0Var4.f(ey1Var) | ov0Var4.d(o43Var.ordinal());
                Object objQ5 = ov0Var4.Q();
                if (zF3 || objQ5 == c30Var) {
                    objQ5 = new bn(6, o43Var, ey1Var);
                    ov0Var4.m0(objQ5);
                }
                dv1 dv1VarE = zm3.E(bk.a(dv1VarK, (au0) objQ5), 12.0f, 6.0f);
                er1 er1VarC = ws.c(j9.f, false);
                int iHashCode = Long.hashCode(ov0Var4.T);
                l72 l72VarL = ov0Var4.l();
                dv1 dv1VarH = xp1.H(ov0Var4, dv1VarE);
                w20.b.getClass();
                x30 x30Var = v20.b;
                ov0Var4.g0();
                if (ov0Var4.S) {
                    ov0Var4.k(x30Var);
                } else {
                    ov0Var4.p0();
                }
                q73.h(ov0Var4, v20.e, er1VarC);
                q73.h(ov0Var4, v20.d, l72VarL);
                q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode));
                q73.g(ov0Var4, v20.g);
                q73.h(ov0Var4, v20.c, dv1VarH);
                long jB = v63.b(12.5d);
                jr0 jr0Var = z ? jr0.j : jr0.g;
                if (z) {
                    ov0Var4.c0(399606006);
                    ov0Var4.p(false);
                    jC2 = hz.c;
                } else {
                    ov0Var4.c0(399607609);
                    jC2 = hz.c(0.7f, ((kz) ov0Var4.j(mz.a)).q);
                    ov0Var4.p(false);
                }
                s83.b(str2, null, jC2, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262058);
                ov0Var4.p(true);
                ov0Var4.p(false);
                return mf3Var;
        }
    }

    public /* synthetic */ en(Object obj, AppState appState, boolean z, Object obj2, int i) {
        this.e = i;
        this.f = obj;
        this.h = appState;
        this.g = z;
        this.i = obj2;
    }
}
