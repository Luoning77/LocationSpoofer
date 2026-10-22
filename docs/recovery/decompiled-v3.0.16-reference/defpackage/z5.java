package defpackage;

import java.io.IOException;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class z5 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ z5(int i, boolean z) {
        this.e = i;
        this.f = z;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3 = this.e;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        boolean z = this.f;
        switch (i3) {
            case 0:
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    dv1 dv1VarD = zm3.D(iw2.e(av1Var, 1.0f), 16.0f);
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
                    x01 x01VarC = ke0.C();
                    long j = bk.g;
                    t01.a(x01VarC, null, null, j, ov0Var, 3120, 4);
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
                    s83.b(ke0.N(z ? 2131624756 : 2131624699, ov0Var), null, j, 0L, jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1573248, 0, 262074);
                    s83.b(ke0.N(2131624722, ov0Var), null, ((kz) ov0Var.j(mz.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).l, ov0Var, 0, 0, 131066);
                    ov0Var.p(true);
                    ov0Var.p(true);
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
                    s83.b(ke0.N(z ? 2131624693 : 2131624720, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                }
                break;
            case 2:
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ov0Var3.W();
                } else {
                    s83.b(ke0.N(z ? 2131624288 : 2131624936, ov0Var3), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262142);
                }
                break;
            case 3:
                f30 f30Var4 = (f30) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ov0Var4.W();
                } else {
                    s83.b(ke0.N(z ? 2131624288 : 2131624936, ov0Var4), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 0, 0, 262142);
                }
                break;
            case 4:
                f30 f30Var5 = (f30) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var5 = (ov0) f30Var5;
                if (!ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ov0Var5.W();
                } else {
                    s83.b(ke0.N(z ? 2131624449 : 2131624550, ov0Var5), null, 0L, v63.c(14), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 1597440, 0, 262062);
                }
                break;
            case Logger.WARN /* 5 */:
                f30 f30Var6 = (f30) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var6 = (ov0) f30Var6;
                if (!ov0Var6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    ov0Var6.W();
                } else {
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA2 = jk2.a(am1.e, j9.p, ov0Var6, 48);
                    int iHashCode3 = Long.hashCode(ov0Var6.T);
                    l72 l72VarL3 = ov0Var6.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var6, dv1VarE);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var6.g0();
                    if (ov0Var6.S) {
                        ov0Var6.k(x30Var2);
                    } else {
                        ov0Var6.p0();
                    }
                    gh ghVar5 = v20.e;
                    q73.h(ov0Var6, ghVar5, kk2VarA2);
                    gh ghVar6 = v20.d;
                    q73.h(ov0Var6, ghVar6, l72VarL3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    gh ghVar7 = v20.f;
                    q73.h(ov0Var6, ghVar7, numValueOf2);
                    wa waVar2 = v20.g;
                    q73.g(ov0Var6, waVar2);
                    gh ghVar8 = v20.c;
                    q73.h(ov0Var6, ghVar8, dv1VarH3);
                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 38.0f), cj2.a(11.0f));
                    long j2 = bk.i;
                    dv1 dv1VarK = xp1.k(dv1VarN, hz.c(0.12f, j2), o51.p0);
                    er1 er1VarC = ws.c(j9.j, false);
                    int iHashCode4 = Long.hashCode(ov0Var6.T);
                    l72 l72VarL4 = ov0Var6.l();
                    dv1 dv1VarH4 = xp1.H(ov0Var6, dv1VarK);
                    ov0Var6.g0();
                    if (ov0Var6.S) {
                        ov0Var6.k(x30Var2);
                    } else {
                        ov0Var6.p0();
                    }
                    q73.h(ov0Var6, ghVar5, er1VarC);
                    q73.h(ov0Var6, ghVar6, l72VarL4);
                    az2.s(iHashCode4, ov0Var6, ghVar7, ov0Var6, waVar2);
                    q73.h(ov0Var6, ghVar8, dv1VarH4);
                    x01 x01VarB = ke0.f;
                    if (x01VarB == null) {
                        w01 w01Var = new w01("Rounded.FolderShared", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = nh3.a;
                        qy2 qy2Var = new qy2(hz.b);
                        nx0 nx0Var = new nx0(3);
                        nx0Var.m(20.0f, 6.0f);
                        nx0Var.i(-8.0f);
                        nx0Var.l(-1.41f, -1.41f);
                        nx0Var.f(10.21f, 4.21f, 9.7f, 4.0f, 9.17f, 4.0f);
                        nx0Var.k(4.0f, 4.0f);
                        nx0Var.g(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        nx0Var.k(2.0f, 18.0f);
                        nx0Var.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        nx0Var.i(16.0f);
                        nx0Var.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        nx0Var.k(22.0f, 8.0f);
                        nx0Var.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        nx0Var.e();
                        nx0Var.m(15.0f, 9.0f);
                        nx0Var.g(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
                        nx0Var.o(-0.9f, 2.0f, -2.0f, 2.0f);
                        nx0Var.o(-2.0f, -0.9f, -2.0f, -2.0f);
                        nx0Var.o(0.9f, -2.0f, 2.0f, -2.0f);
                        nx0Var.e();
                        nx0Var.m(19.0f, 17.0f);
                        nx0Var.i(-8.0f);
                        nx0Var.s(-1.0f);
                        nx0Var.g(0.0f, -1.33f, 2.67f, -2.0f, 4.0f, -2.0f);
                        nx0Var.o(4.0f, 0.67f, 4.0f, 2.0f);
                        nx0Var.s(1.0f);
                        nx0Var.e();
                        w01.a(w01Var, nx0Var.a, qy2Var);
                        x01VarB = w01Var.b();
                        ke0.f = x01VarB;
                    }
                    t01.a(x01VarB, null, iw2.k(av1Var, 20.0f), j2, ov0Var6, 3504, 0);
                    ov0Var6.p(true);
                    gh0.h(ov0Var6, iw2.o(av1Var, 14.0f));
                    wb1 wb1Var2 = new wb1(1.0f, true);
                    yz yzVarA2 = wz.a(am1.g, j9.r, ov0Var6, 0);
                    int iHashCode5 = Long.hashCode(ov0Var6.T);
                    l72 l72VarL5 = ov0Var6.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var6, wb1Var2);
                    ov0Var6.g0();
                    if (ov0Var6.S) {
                        ov0Var6.k(x30Var2);
                    } else {
                        ov0Var6.p0();
                    }
                    q73.h(ov0Var6, ghVar5, yzVarA2);
                    q73.h(ov0Var6, ghVar6, l72VarL5);
                    az2.s(iHashCode5, ov0Var6, ghVar7, ov0Var6, waVar2);
                    q73.h(ov0Var6, ghVar8, dv1VarH5);
                    s83.b(ke0.N(2131625117, ov0Var6), null, ((kz) ov0Var6.j(mz.a)).o, v63.c(15), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 1597440, 0, 262058);
                    gh0.h(ov0Var6, iw2.g(av1Var, 2.0f));
                    s83.b(ke0.N(2131624667, ov0Var6), null, z != 0 ? bk.c : bk.f, v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 24576, 0, 262122);
                    ov0Var6.p(true);
                    t01.a(sb.S(), null, iw2.k(av1Var, 18.0f), hz.c(0.7f, z ? bk.c : bk.f), ov0Var6, 432, 0);
                    ov0Var6.p(true);
                }
                break;
            case Logger.ERROR /* 6 */:
                f30 f30Var7 = (f30) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var7 = (ov0) f30Var7;
                if (!ov0Var7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    ov0Var7.W();
                } else {
                    dv1 dv1VarF = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 8.0f, 1);
                    yz yzVarA3 = wz.a(new jo(6.0f, true, new fo(0)), j9.r, ov0Var7, 6);
                    int iHashCode6 = Long.hashCode(ov0Var7.T);
                    l72 l72VarL6 = ov0Var7.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var7, dv1VarF);
                    w20.b.getClass();
                    x30 x30Var3 = v20.b;
                    ov0Var7.g0();
                    if (ov0Var7.S) {
                        ov0Var7.k(x30Var3);
                    } else {
                        ov0Var7.p0();
                    }
                    q73.h(ov0Var7, v20.e, yzVarA3);
                    q73.h(ov0Var7, v20.d, l72VarL6);
                    q73.h(ov0Var7, v20.f, Integer.valueOf(iHashCode6));
                    q73.g(ov0Var7, v20.g);
                    q73.h(ov0Var7, v20.c, dv1VarH6);
                    String strN = ke0.N(2131624028, ov0Var7);
                    hh0 hh0Var = le3.a;
                    s83.b(strN, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var7.j(hh0Var)).h, ov0Var7, 0, 0, 131070);
                    s83.b(ke0.O(2131624696, new Object[]{"3.0.16"}, ov0Var7), null, ((kz) ov0Var7.j(mz.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var7.j(hh0Var)).l, ov0Var7, 0, 0, 131066);
                    ee0.b(z, ov0Var7, 0);
                    ov0Var7.p(true);
                }
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                f30 f30Var8 = (f30) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var8 = (ov0) f30Var8;
                if (!ov0Var8.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    ov0Var8.W();
                } else {
                    s83.b(ke0.N(z ? 2131624394 : 2131625130, ov0Var8), null, 0L, v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var8, 24576, 0, 262126);
                }
                break;
            default:
                f30 f30Var9 = (f30) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var9 = (ov0) f30Var9;
                if (!ov0Var9.T(1 & iIntValue9, (iIntValue9 & 17) != 16)) {
                    ov0Var9.W();
                } else {
                    if (z) {
                        i = -1143524221;
                        i2 = 2131624104;
                    } else {
                        i = -1143522935;
                        i2 = 2131625160;
                    }
                    s83.b(az2.h(ov0Var9, i, i2, ov0Var9, false), zm3.E(av1Var, 4.0f, 4.0f), ((kz) ov0Var9.j(mz.a)).o, v63.c(15), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 1597488, 0, 262056);
                }
                break;
        }
        return mf3Var;
    }
}
