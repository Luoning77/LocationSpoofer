package defpackage;

import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.model.SavedRoute;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pu implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public pu(qu0 qu0Var, e73 e73Var) {
        this.e = 5;
        this.g = qu0Var;
        this.f = e73Var;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0461  */
    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.e;
        c30 c30Var = d30.a;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.f;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Number) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    dv1 dv1VarC = zm3.C(iw2.a(av1Var, hu.c, hu.d), (z42) obj3);
                    qu0 qu0Var = (qu0) obj4;
                    kk2 kk2VarA = jk2.a(am1.h, j9.p, ov0Var, 54);
                    int iT = ks.T(ov0Var);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1VarC);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, v20.e, kk2VarA);
                    q73.h(ov0Var, v20.d, l72VarL);
                    gh ghVar = v20.f;
                    if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT))) {
                        az2.r(iT, ov0Var, iT, ghVar);
                    }
                    q73.h(ov0Var, v20.c, dv1VarH);
                    qu0Var.invoke(lk2.a, ov0Var, 6);
                    ov0Var.p(true);
                }
                break;
            case 1:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    s83.a(((je3) obj3).j, (p10) obj4, ov0Var2, 0);
                }
                break;
            case 2:
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ov0Var3.W();
                } else {
                    dv1 dv1VarE = zm3.E(iw2.e(av1Var, 1.0f), 14.0f, 12.0f);
                    lu0 lu0Var = (lu0) obj3;
                    SavedLocation savedLocation = (SavedLocation) obj4;
                    kk2 kk2VarA2 = jk2.a(am1.e, j9.p, ov0Var3, 48);
                    int iHashCode = Long.hashCode(ov0Var3.T);
                    l72 l72VarL2 = ov0Var3.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var3, dv1VarE);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var2);
                    } else {
                        ov0Var3.p0();
                    }
                    gh ghVar2 = v20.e;
                    q73.h(ov0Var3, ghVar2, kk2VarA2);
                    gh ghVar3 = v20.d;
                    q73.h(ov0Var3, ghVar3, l72VarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    gh ghVar4 = v20.f;
                    q73.h(ov0Var3, ghVar4, numValueOf);
                    wa waVar = v20.g;
                    q73.g(ov0Var3, waVar);
                    gh ghVar5 = v20.c;
                    q73.h(ov0Var3, ghVar5, dv1VarH2);
                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 36.0f), cj2.a(11.0f));
                    long j = bk.g;
                    dv1 dv1VarK = xp1.k(dv1VarN, hz.c(0.12f, j), o51.p0);
                    er1 er1VarC = ws.c(j9.j, false);
                    int iHashCode2 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL3 = ov0Var3.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var3, dv1VarK);
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var2);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, ghVar2, er1VarC);
                    q73.h(ov0Var3, ghVar3, l72VarL3);
                    az2.s(iHashCode2, ov0Var3, ghVar4, ov0Var3, waVar);
                    q73.h(ov0Var3, ghVar5, dv1VarH3);
                    t01.a(ee0.z(), null, iw2.k(av1Var, 19.0f), j, ov0Var3, 3504, 0);
                    ov0Var3.p(true);
                    gh0.h(ov0Var3, iw2.o(av1Var, 12.0f));
                    wb1 wb1Var = new wb1(1.0f, true);
                    yz yzVarA = wz.a(am1.g, j9.r, ov0Var3, 0);
                    int iHashCode3 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL4 = ov0Var3.l();
                    dv1 dv1VarH4 = xp1.H(ov0Var3, wb1Var);
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var2);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, ghVar2, yzVarA);
                    q73.h(ov0Var3, ghVar3, l72VarL4);
                    az2.s(iHashCode3, ov0Var3, ghVar4, ov0Var3, waVar);
                    q73.h(ov0Var3, ghVar5, dv1VarH4);
                    Locale locale = Locale.US;
                    String strK = az2.k(String.format(locale, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(savedLocation.getLat())}, 1)), ", ", String.format(locale, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(savedLocation.getLng())}, 1)));
                    Object objQ = ov0Var3.Q();
                    if (objQ == c30Var) {
                        objQ = m3.h;
                        ov0Var3.m0(objQ);
                    }
                    lu0 lu0Var2 = (lu0) objQ;
                    if (o51.f(lu0Var2.invoke(savedLocation.getName()), lu0Var2.invoke(strK))) {
                        z = true;
                    } else {
                        if (o51.f(lu0Var2.invoke(savedLocation.getName()), lu0Var2.invoke(String.format(locale, "%.5f", Arrays.copyOf(new Object[]{Double.valueOf(savedLocation.getLat())}, 1)) + ", " + String.format(locale, "%.5f", Arrays.copyOf(new Object[]{Double.valueOf(savedLocation.getLng())}, 1))))) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    String name = z ? strK : savedLocation.getName();
                    jr0 jr0Var = jr0.j;
                    long jB = v63.b(14.5d);
                    hh0 hh0Var = mz.a;
                    s83.b(name, null, ((kz) ov0Var3.j(hh0Var)).q, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                    if (z) {
                        z2 = false;
                        ov0Var3.c0(-1303071434);
                    } else {
                        ov0Var3.c0(-1293267219);
                        gh0.h(ov0Var3, iw2.g(av1Var, 2.0f));
                        s83.b(strK, null, hz.c(0.55f, ((kz) ov0Var3.j(hh0Var)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                        z2 = false;
                    }
                    ov0Var3.p(z2);
                    ov0Var3.p(true);
                    boolean zF = ov0Var3.f(lu0Var) | ov0Var3.h(savedLocation);
                    Object objQ2 = ov0Var3.Q();
                    if (zF || objQ2 == c30Var) {
                        objQ2 = new zl2(lu0Var, savedLocation, 3);
                        ov0Var3.m0(objQ2);
                    }
                    xq1.l((au0) objQ2, iw2.k(av1Var, 36.0f), false, null, null, k22.n, ov0Var3, 1572912, 60);
                    ov0Var3.p(true);
                }
                break;
            case 3:
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ov0Var4.W();
                } else {
                    dv1 dv1VarE2 = zm3.E(iw2.e(av1Var, 1.0f), 14.0f, 12.0f);
                    ul1 ul1Var = (ul1) obj3;
                    SavedRoute savedRoute = (SavedRoute) obj4;
                    kk2 kk2VarA3 = jk2.a(am1.e, j9.p, ov0Var4, 48);
                    int iHashCode4 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL5 = ov0Var4.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var4, dv1VarE2);
                    w20.b.getClass();
                    x30 x30Var3 = v20.b;
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var3);
                    } else {
                        ov0Var4.p0();
                    }
                    gh ghVar6 = v20.e;
                    q73.h(ov0Var4, ghVar6, kk2VarA3);
                    gh ghVar7 = v20.d;
                    q73.h(ov0Var4, ghVar7, l72VarL5);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    gh ghVar8 = v20.f;
                    q73.h(ov0Var4, ghVar8, numValueOf2);
                    wa waVar2 = v20.g;
                    q73.g(ov0Var4, waVar2);
                    gh ghVar9 = v20.c;
                    q73.h(ov0Var4, ghVar9, dv1VarH5);
                    dv1 dv1VarN2 = xp1.n(iw2.k(av1Var, 36.0f), cj2.a(11.0f));
                    long j2 = bk.g;
                    dv1 dv1VarK2 = xp1.k(dv1VarN2, hz.c(0.12f, j2), o51.p0);
                    er1 er1VarC2 = ws.c(j9.j, false);
                    int iHashCode5 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL6 = ov0Var4.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var4, dv1VarK2);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var3);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar6, er1VarC2);
                    q73.h(ov0Var4, ghVar7, l72VarL6);
                    az2.s(iHashCode5, ov0Var4, ghVar8, ov0Var4, waVar2);
                    q73.h(ov0Var4, ghVar9, dv1VarH6);
                    t01.a(ld0.w(), null, iw2.k(av1Var, 19.0f), j2, ov0Var4, 3504, 0);
                    ov0Var4.p(true);
                    gh0.h(ov0Var4, iw2.o(av1Var, 12.0f));
                    wb1 wb1Var2 = new wb1(1.0f, true);
                    yz yzVarA2 = wz.a(am1.g, j9.r, ov0Var4, 0);
                    int iHashCode6 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL7 = ov0Var4.l();
                    dv1 dv1VarH7 = xp1.H(ov0Var4, wb1Var2);
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var3);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, ghVar6, yzVarA2);
                    q73.h(ov0Var4, ghVar7, l72VarL7);
                    az2.s(iHashCode6, ov0Var4, ghVar8, ov0Var4, waVar2);
                    q73.h(ov0Var4, ghVar9, dv1VarH7);
                    String name2 = savedRoute.getName();
                    jr0 jr0Var2 = jr0.j;
                    long jB2 = v63.b(14.5d);
                    hh0 hh0Var2 = mz.a;
                    s83.b(name2, null, ((kz) ov0Var4.j(hh0Var2)).q, jB2, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 1597440, 0, 262058);
                    gh0.h(ov0Var4, iw2.g(av1Var, 2.0f));
                    s83.b(ke0.O(2131624906, new Object[]{Integer.valueOf(savedRoute.getPoints().size())}, ov0Var4), null, hz.c(0.55f, ((kz) ov0Var4.j(hh0Var2)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262122);
                    ov0Var4.p(true);
                    boolean zH = ov0Var4.h(ul1Var) | ov0Var4.h(savedRoute);
                    Object objQ3 = ov0Var4.Q();
                    if (zH || objQ3 == c30Var) {
                        objQ3 = new bn(5, ul1Var, savedRoute);
                        ov0Var4.m0(objQ3);
                    }
                    xq1.l((au0) objQ3, iw2.k(av1Var, 36.0f), false, null, null, ji2.k, ov0Var4, 1572912, 60);
                    ov0Var4.p(true);
                }
                break;
            case 4:
                f30 f30Var5 = (f30) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ov0 ov0Var5 = (ov0) f30Var5;
                if (!ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ov0Var5.W();
                } else {
                    p10 p10Var = (p10) obj3;
                    en2 en2Var = (en2) obj4;
                    er1 er1VarC3 = ws.c(j9.f, false);
                    int iT2 = ks.T(ov0Var5);
                    l72 l72VarL8 = ov0Var5.l();
                    dv1 dv1VarH8 = xp1.H(ov0Var5, av1Var);
                    w20.b.getClass();
                    x30 x30Var4 = v20.b;
                    ov0Var5.g0();
                    if (ov0Var5.S) {
                        ov0Var5.k(x30Var4);
                    } else {
                        ov0Var5.p0();
                    }
                    q73.h(ov0Var5, v20.e, er1VarC3);
                    q73.h(ov0Var5, v20.d, l72VarL8);
                    gh ghVar10 = v20.f;
                    if (ov0Var5.S || !o51.f(ov0Var5.Q(), Integer.valueOf(iT2))) {
                        az2.r(iT2, ov0Var5, iT2, ghVar10);
                    }
                    q73.h(ov0Var5, v20.c, dv1VarH8);
                    p10Var.invoke(en2Var, ov0Var5, 6);
                    ov0Var5.p(true);
                }
                break;
            default:
                f30 f30Var6 = (f30) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                ov0 ov0Var6 = (ov0) f30Var6;
                if (!ov0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ov0Var6.W();
                } else {
                    ((qu0) obj4).invoke((e73) obj3, ov0Var6, 6);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ pu(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
