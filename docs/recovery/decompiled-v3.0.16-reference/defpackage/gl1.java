package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountDevice;
import com.vincenthzr.locationspoofer.data.model.AppState;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class gl1 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ gl1(lu0 lu0Var, t52 t52Var, boolean z) {
        this.e = 0;
        this.g = lu0Var;
        this.h = t52Var;
        this.f = z;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x03da  */
    /* JADX WARN: Code duplicated, block: B:70:0x03de  */
    /* JADX WARN: Code duplicated, block: B:73:0x0400  */
    /* JADX WARN: Code duplicated, block: B:75:0x040e  */
    /* JADX WARN: Code duplicated, block: B:78:0x042a  */
    /* JADX WARN: Code duplicated, block: B:80:0x042f  */
    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        c30 c30Var;
        x30 x30Var;
        long j;
        jr0 jr0Var;
        int i = this.e;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        c30 c30Var2 = d30.a;
        Object obj4 = this.h;
        final boolean z2 = this.f;
        Object obj5 = this.g;
        float f = 0.0f;
        switch (i) {
            case 0:
                boolean z3 = true;
                lu0 lu0Var = (lu0) obj5;
                t52 t52Var = (t52) obj4;
                lk2 lk2Var = (lk2) obj;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                lk2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ov0) f30Var).f(lk2Var) ? 4 : 2;
                }
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    js[] jsVarArrValues = js.values();
                    int length = jsVarArrValues.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < length) {
                        final js jsVar = jsVarArrValues[i3];
                        int i4 = i2 + 1;
                        final boolean z4 = t52Var.g() == i2 ? z3 : false;
                        lk2 lk2Var2 = lk2Var;
                        dv1 dv1VarB = iw2.b(76.0f, 0.0f, 2);
                        boolean zF = ov0Var.f(lu0Var) | ov0Var.d(i2);
                        Object objQ = ov0Var.Q();
                        if (zF || objQ == c30Var2) {
                            objQ = new il1(i2, 0, lu0Var);
                            ov0Var.m0(objQ);
                        }
                        nd.c(lk2Var2, (au0) objQ, dv1VarB, sb.a0(412678274, new qu0() { // from class: kl1
                            @Override // defpackage.qu0
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                int i5;
                                int i6;
                                long jC;
                                long jC2;
                                f30 f30Var2 = (f30) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                ((zz) obj6).getClass();
                                ov0 ov0Var2 = (ov0) f30Var2;
                                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    js jsVar2 = jsVar;
                                    int iOrdinal = jsVar2.ordinal();
                                    if (iOrdinal == 0) {
                                        i5 = -1161331810;
                                        i6 = 2131625106;
                                    } else if (iOrdinal == 1) {
                                        i5 = -1161329925;
                                        i6 = 2131625107;
                                    } else if (iOrdinal == 2) {
                                        i5 = -1161328034;
                                        i6 = 2131625104;
                                    } else {
                                        if (iOrdinal != 3) {
                                            ov0Var2.c0(-1161332802);
                                            ov0Var2.p(false);
                                            b81.d();
                                            return null;
                                        }
                                        i5 = -1161326054;
                                        i6 = 2131625105;
                                    }
                                    String strH = az2.h(ov0Var2, i5, i6, ov0Var2, false);
                                    x01 x01Var = jsVar2.e;
                                    boolean z5 = z4;
                                    boolean z6 = z2;
                                    if (z5) {
                                        ov0Var2.c0(1446839756);
                                        ov0Var2.p(false);
                                        jC = bk.g;
                                    } else {
                                        ov0Var2.c0(1446841538);
                                        jC = hz.c(z6 ? 0.65f : 0.7f, ((kz) ov0Var2.j(mz.a)).q);
                                        ov0Var2.p(false);
                                    }
                                    t01.a(x01Var, strH, iw2.k(av1.a, 22.0f), jC, ov0Var2, 384, 0);
                                    q93 q93Var = ((je3) ov0Var2.j(le3.a)).o;
                                    jr0 jr0Var2 = z5 ? jr0.j : jr0.g;
                                    if (z5) {
                                        ov0Var2.c0(1446860428);
                                        ov0Var2.p(false);
                                        jC2 = bk.g;
                                    } else {
                                        ov0Var2.c0(1446862210);
                                        jC2 = hz.c(z6 ? 0.65f : 0.7f, ((kz) ov0Var2.j(mz.a)).q);
                                        ov0Var2.p(false);
                                    }
                                    s83.b(strH, null, jC2, 0L, jr0Var2, null, 0L, null, null, 0L, 0, false, 1, 0, q93Var, ov0Var2, 0, 24576, 114618);
                                } else {
                                    ov0Var2.W();
                                }
                                return mf3.a;
                            }
                        }, ov0Var), ov0Var, (iIntValue & 14) | 3456);
                        i3++;
                        i2 = i4;
                        lk2Var = lk2Var2;
                        z3 = true;
                    }
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            case 1:
                au0 au0Var = (au0) obj5;
                au0 au0Var2 = (au0) obj4;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                    return mf3Var;
                }
                dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var2, 48);
                int iHashCode = Long.hashCode(ov0Var2.T);
                l72 l72VarL = ov0Var2.l();
                dv1 dv1VarH = xp1.H(ov0Var2, dv1VarE);
                w20.b.getClass();
                x30 x30Var2 = v20.b;
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var2);
                } else {
                    ov0Var2.p0();
                }
                gh ghVar = v20.e;
                q73.h(ov0Var2, ghVar, kk2VarA);
                gh ghVar2 = v20.d;
                q73.h(ov0Var2, ghVar2, l72VarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                gh ghVar3 = v20.f;
                q73.h(ov0Var2, ghVar3, numValueOf);
                wa waVar = v20.g;
                q73.g(ov0Var2, waVar);
                gh ghVar4 = v20.c;
                q73.h(ov0Var2, ghVar4, dv1VarH);
                dv1 dv1VarN = xp1.n(iw2.k(av1Var, 38.0f), cj2.a(11.0f));
                long j2 = bk.g;
                dv1 dv1VarK = xp1.k(dv1VarN, hz.c(0.12f, j2), o51.p0);
                er1 er1VarC = ws.c(j9.j, false);
                int iHashCode2 = Long.hashCode(ov0Var2.T);
                l72 l72VarL2 = ov0Var2.l();
                dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarK);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var2);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar, er1VarC);
                q73.h(ov0Var2, ghVar2, l72VarL2);
                az2.s(iHashCode2, ov0Var2, ghVar3, ov0Var2, waVar);
                q73.h(ov0Var2, ghVar4, dv1VarH2);
                t01.a(wc0.M(), null, iw2.k(av1Var, 20.0f), j2, ov0Var2, 3504, 0);
                ov0Var2.p(true);
                gh0.h(ov0Var2, iw2.o(av1Var, 14.0f));
                wb1 wb1Var = new wb1(1.0f, true);
                yz yzVarA = wz.a(am1.g, j9.r, ov0Var2, 0);
                int iHashCode3 = Long.hashCode(ov0Var2.T);
                l72 l72VarL3 = ov0Var2.l();
                dv1 dv1VarH3 = xp1.H(ov0Var2, wb1Var);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var2);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar, yzVarA);
                q73.h(ov0Var2, ghVar2, l72VarL3);
                az2.s(iHashCode3, ov0Var2, ghVar3, ov0Var2, waVar);
                q73.h(ov0Var2, ghVar4, dv1VarH3);
                s83.b(ke0.N(2131624437, ov0Var2), null, ((kz) ov0Var2.j(mz.a)).o, v63.c(15), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
                gh0.h(ov0Var2, iw2.g(av1Var, 2.0f));
                s83.b(ke0.N(2131624438, ov0Var2), null, z2 ? bk.c : bk.f, v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262122);
                ov0Var2.p(true);
                kk2 kk2VarA2 = jk2.a(new jo(6.0f, true, new fo(0)), j9.o, ov0Var2, 6);
                int iHashCode4 = Long.hashCode(ov0Var2.T);
                l72 l72VarL4 = ov0Var2.l();
                dv1 dv1VarH4 = xp1.H(ov0Var2, av1Var);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var2);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar, kk2VarA2);
                q73.h(ov0Var2, ghVar2, l72VarL4);
                az2.s(iHashCode4, ov0Var2, ghVar3, ov0Var2, waVar);
                q73.h(ov0Var2, ghVar4, dv1VarH4);
                n51.j(au0Var, null, false, null, null, new b52(10.0f, 4.0f, 10.0f, 4.0f), ji2.h, ov0Var2, 817889280, 382);
                n51.j(au0Var2, null, false, null, null, new b52(10.0f, 4.0f, 10.0f, 4.0f), ji2.i, ov0Var2, 817889280, 382);
                ov0Var2.p(true);
                ov0Var2.p(true);
                return mf3Var;
            case 2:
                CloudAccountDevice cloudAccountDevice = (CloudAccountDevice) obj5;
                ey1 ey1Var = (ey1) obj4;
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dv1 dv1VarD = zm3.D(av1Var, 16.0f);
                    yz yzVarA2 = wz.a(new jo(8.0f, true, new fo(0)), j9.r, ov0Var3, 6);
                    int iHashCode5 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL5 = ov0Var3.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var3, dv1VarD);
                    w20.b.getClass();
                    x30 x30Var3 = v20.b;
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var3);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, v20.e, yzVarA2);
                    q73.h(ov0Var3, v20.d, l72VarL5);
                    q73.h(ov0Var3, v20.f, Integer.valueOf(iHashCode5));
                    q73.g(ov0Var3, v20.g);
                    q73.h(ov0Var3, v20.c, dv1VarH5);
                    s83.b(cloudAccountDevice.getName(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var3.j(le3.a)).h, ov0Var3, 0, 0, 131070);
                    if (cloudAccountDevice.getCurrent()) {
                        ov0Var3.c0(2056768520);
                        s83.b(ke0.N(2131624162, ov0Var3), null, ((kz) ov0Var3.j(mz.a)).a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262138);
                    } else {
                        ov0Var3.c0(-670894091);
                    }
                    ov0Var3.p(false);
                    String appVersion = cloudAccountDevice.getAppVersion();
                    if (appVersion == null) {
                        ov0Var3.c0(-664552236);
                    } else {
                        ov0Var3.c0(-664552235);
                        s83.b(ke0.O(2131623966, new Object[]{appVersion}, ov0Var3), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262142);
                    }
                    ov0Var3.p(false);
                    String str = DateFormat.getDateTimeInstance().format(new Date(cloudAccountDevice.getBoundAt()));
                    str.getClass();
                    s83.b(ke0.O(2131623965, new Object[]{str}, ov0Var3), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262142);
                    Long lastSeenAt = cloudAccountDevice.getLastSeenAt();
                    if (lastSeenAt == null) {
                        ov0Var3.c0(-664304081);
                    } else {
                        ov0Var3.c0(-664304080);
                        String str2 = DateFormat.getDateTimeInstance().format(new Date(lastSeenAt.longValue()));
                        str2.getClass();
                        s83.b(ke0.O(2131624215, new Object[]{str2}, ov0Var3), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262142);
                    }
                    ov0Var3.p(false);
                    boolean zH = ov0Var3.h(cloudAccountDevice);
                    Object objQ2 = ov0Var3.Q();
                    if (zH || objQ2 == c30Var2) {
                        z = true;
                        objQ2 = new p5(cloudAccountDevice, ey1Var, 1);
                        ov0Var3.m0(objQ2);
                    } else {
                        z = true;
                    }
                    n51.j((au0) objQ2, null, !z2, null, null, null, da0.s, ov0Var3, 805306368, 506);
                    ov0Var3.p(z);
                } else {
                    ov0Var3.W();
                }
                return mf3Var;
            case 3:
                AppState appState = (AppState) obj4;
                lu0 lu0Var2 = (lu0) obj5;
                f30 f30Var4 = (f30) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x01 x01VarB = ig0.e;
                    if (x01VarB == null) {
                        w01 w01Var = new w01("Rounded.Shuffle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = nh3.a;
                        qy2 qy2Var = new qy2(hz.b);
                        nx0 nx0Var = new nx0(3);
                        nx0Var.m(10.59f, 9.17f);
                        nx0Var.k(6.12f, 4.7f);
                        nx0Var.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        nx0Var.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        nx0Var.l(4.46f, 4.46f);
                        nx0Var.l(1.42f, -1.4f);
                        nx0Var.e();
                        nx0Var.m(15.35f, 4.85f);
                        nx0Var.l(1.19f, 1.19f);
                        nx0Var.k(4.7f, 17.88f);
                        nx0Var.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        nx0Var.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        nx0Var.k(17.96f, 7.46f);
                        nx0Var.l(1.19f, 1.19f);
                        nx0Var.g(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.36f);
                        nx0Var.k(20.0f, 4.5f);
                        nx0Var.g(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
                        nx0Var.i(-3.79f);
                        nx0Var.g(-0.45f, 0.0f, -0.67f, 0.54f, -0.36f, 0.85f);
                        nx0Var.e();
                        nx0Var.m(14.83f, 13.41f);
                        nx0Var.l(-1.41f, 1.41f);
                        nx0Var.l(3.13f, 3.13f);
                        nx0Var.l(-1.2f, 1.2f);
                        nx0Var.g(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f);
                        nx0Var.i(3.79f);
                        nx0Var.g(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
                        nx0Var.s(-3.79f);
                        nx0Var.g(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
                        nx0Var.l(-1.19f, 1.19f);
                        nx0Var.l(-3.13f, -3.14f);
                        nx0Var.e();
                        w01.a(w01Var, nx0Var.a, qy2Var);
                        x01VarB = w01Var.b();
                        ig0.e = x01VarB;
                    }
                    sj2.b(x01VarB, bk.g, ke0.N(2131624847, ov0Var4), ke0.N(2131624842, ov0Var4), ov0Var4, 48);
                    gh0.h(ov0Var4, iw2.g(av1Var, 14.0f));
                    List<i52> listG = am1.G(new i52(qv1.OFF, ke0.N(2131624846, ov0Var4)), new i52(qv1.LOW, ke0.N(2131624844, ov0Var4)), new i52(qv1.MEDIUM, ke0.N(2131624845, ov0Var4)), new i52(qv1.HIGH, ke0.N(2131624843, ov0Var4)));
                    dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA3 = jk2.a(new jo(8.0f, true, new fo(0)), j9.o, ov0Var4, 6);
                    int iHashCode6 = Long.hashCode(ov0Var4.T);
                    l72 l72VarL6 = ov0Var4.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var4, dv1VarE2);
                    w20.b.getClass();
                    x30 x30Var4 = v20.b;
                    ov0Var4.g0();
                    if (ov0Var4.S) {
                        ov0Var4.k(x30Var4);
                    } else {
                        ov0Var4.p0();
                    }
                    q73.h(ov0Var4, v20.e, kk2VarA3);
                    q73.h(ov0Var4, v20.d, l72VarL6);
                    q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode6));
                    q73.g(ov0Var4, v20.g);
                    q73.h(ov0Var4, v20.c, dv1VarH6);
                    ov0Var4.c0(-1328307953);
                    for (i52 i52Var : listG) {
                        qv1 qv1Var = (qv1) i52Var.e;
                        String str3 = (String) i52Var.f;
                        boolean z5 = appState.getRealismLevel() == qv1Var.e;
                        dv1 dv1VarK2 = xp1.k(xp1.n(new wb1(1.0f, true), cj2.a(10.0f)), z5 ? bk.g : z2 ? hz.c(0.05f, hz.c) : hz.c(0.04f, hz.b), o51.p0);
                        boolean zF2 = ov0Var4.f(lu0Var2) | ov0Var4.d(qv1Var.ordinal());
                        Object objQ3 = ov0Var4.Q();
                        if (zF2) {
                            c30Var = c30Var2;
                        } else {
                            c30Var = c30Var2;
                            if (objQ3 == c30Var) {
                            }
                            dv1 dv1VarF = zm3.F(bk.a(dv1VarK2, (au0) objQ3), f, 9.0f, 1);
                            er1 er1VarC2 = ws.c(j9.j, false);
                            int iHashCode7 = Long.hashCode(ov0Var4.T);
                            l72 l72VarL7 = ov0Var4.l();
                            dv1 dv1VarH7 = xp1.H(ov0Var4, dv1VarF);
                            w20.b.getClass();
                            x30Var = v20.b;
                            ov0Var4.g0();
                            if (ov0Var4.S) {
                                ov0Var4.k(x30Var);
                            } else {
                                ov0Var4.p0();
                            }
                            q73.h(ov0Var4, v20.e, er1VarC2);
                            q73.h(ov0Var4, v20.d, l72VarL7);
                            q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode7));
                            q73.g(ov0Var4, v20.g);
                            q73.h(ov0Var4, v20.c, dv1VarH7);
                            if (z5) {
                                ov0Var4.c0(-1980675479);
                                ov0Var4.p(false);
                                j = hz.c;
                            } else {
                                ov0Var4.c0(-1980674291);
                                j = ((kz) ov0Var4.j(mz.a)).q;
                                ov0Var4.p(false);
                            }
                            long j3 = j;
                            long jB = v63.b(12.5d);
                            if (z5) {
                                jr0Var = jr0.j;
                            } else {
                                jr0Var = jr0.g;
                            }
                            s83.b(str3, null, j3, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262058);
                            ov0Var4.p(true);
                            c30Var2 = c30Var;
                            f = 0.0f;
                        }
                        objQ3 = new qi2(5, lu0Var2, qv1Var);
                        ov0Var4.m0(objQ3);
                        dv1 dv1VarF2 = zm3.F(bk.a(dv1VarK2, (au0) objQ3), f, 9.0f, 1);
                        er1 er1VarC3 = ws.c(j9.j, false);
                        int iHashCode8 = Long.hashCode(ov0Var4.T);
                        l72 l72VarL8 = ov0Var4.l();
                        dv1 dv1VarH8 = xp1.H(ov0Var4, dv1VarF2);
                        w20.b.getClass();
                        x30Var = v20.b;
                        ov0Var4.g0();
                        if (ov0Var4.S) {
                            ov0Var4.k(x30Var);
                        } else {
                            ov0Var4.p0();
                        }
                        q73.h(ov0Var4, v20.e, er1VarC3);
                        q73.h(ov0Var4, v20.d, l72VarL8);
                        q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode8));
                        q73.g(ov0Var4, v20.g);
                        q73.h(ov0Var4, v20.c, dv1VarH8);
                        if (z5) {
                            ov0Var4.c0(-1980675479);
                            ov0Var4.p(false);
                            j = hz.c;
                        } else {
                            ov0Var4.c0(-1980674291);
                            j = ((kz) ov0Var4.j(mz.a)).q;
                            ov0Var4.p(false);
                        }
                        long j4 = j;
                        long jB2 = v63.b(12.5d);
                        if (z5) {
                            jr0Var = jr0.j;
                        } else {
                            jr0Var = jr0.g;
                        }
                        s83.b(str3, null, j4, jB2, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262058);
                        ov0Var4.p(true);
                        c30Var2 = c30Var;
                        f = 0.0f;
                    }
                    ov0Var4.p(false);
                    ov0Var4.p(true);
                } else {
                    ov0Var4.W();
                }
                return mf3Var;
            default:
                r73 r73Var = (r73) obj5;
                w52 w52Var = r73Var.f;
                ix1 ix1Var = (ix1) obj4;
                ((Integer) obj3).getClass();
                ov0 ov0Var5 = (ov0) ((f30) obj2);
                ov0Var5.c0(-2137546592);
                boolean z6 = ((x32) w52Var.getValue()) == x32.e || !(ov0Var5.j(z30.n) == qa1.f);
                boolean zF3 = ov0Var5.f(r73Var);
                Object objQ4 = ov0Var5.Q();
                if (zF3 || objQ4 == c30Var2) {
                    objQ4 = new ge2(r73Var, 21);
                    ov0Var5.m0(objQ4);
                }
                ey1 ey1VarL = ke0.L((lu0) objQ4, ov0Var5);
                Object objQ5 = ov0Var5.Q();
                if (objQ5 == c30Var2) {
                    va0 va0Var = new va0(new vu1(ey1VarL, 15));
                    ov0Var5.m0(va0Var);
                    objQ5 = va0Var;
                }
                qo2 qo2Var = (qo2) objQ5;
                boolean zF4 = ov0Var5.f(qo2Var) | ov0Var5.f(r73Var);
                Object objQ6 = ov0Var5.Q();
                if (zF4 || objQ6 == c30Var2) {
                    objQ6 = new p73(qo2Var, r73Var);
                    ov0Var5.m0(objQ6);
                }
                dv1 dv1VarA = jo2.a((p73) objQ6, (x32) w52Var.getValue(), z2 && r73Var.b.g() != 0.0f, z6, ix1Var);
                ov0Var5.p(false);
                return dv1VarA;
        }
    }

    public /* synthetic */ gl1(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.g = obj;
        this.f = z;
        this.h = obj2;
    }

    public /* synthetic */ gl1(AppState appState, boolean z, lu0 lu0Var) {
        this.e = 3;
        this.h = appState;
        this.f = z;
        this.g = lu0Var;
    }

    public /* synthetic */ gl1(boolean z, au0 au0Var, au0 au0Var2) {
        this.e = 1;
        this.f = z;
        this.g = au0Var;
        this.h = au0Var2;
    }
}
