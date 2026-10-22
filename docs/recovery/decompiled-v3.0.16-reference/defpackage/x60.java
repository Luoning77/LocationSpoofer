package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.sync.AccountSyncManager;
import com.vincenthzr.locationspoofer.data.sync.AccountSyncState;
import com.vincenthzr.locationspoofer.data.sync.SyncSelection;
import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class x60 implements qu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ x60(CloudAccountState cloudAccountState, au0 au0Var, boolean z, au0 au0Var2, au0 au0Var3, au0 au0Var4) {
        this.h = cloudAccountState;
        this.f = au0Var;
        this.g = z;
        this.i = au0Var2;
        this.j = au0Var3;
        this.k = au0Var4;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:137:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:139:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:141:0x060d  */
    /* JADX WARN: Code duplicated, block: B:143:0x061f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0625  */
    /* JADX WARN: Code duplicated, block: B:148:0x0643  */
    /* JADX WARN: Code duplicated, block: B:151:0x0648  */
    /* JADX WARN: Code duplicated, block: B:152:0x064b  */
    /* JADX WARN: Code duplicated, block: B:156:0x068a  */
    /* JADX WARN: Code duplicated, block: B:157:0x068e  */
    /* JADX WARN: Code duplicated, block: B:160:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:161:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:164:0x0719  */
    /* JADX WARN: Code duplicated, block: B:165:0x071d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0756  */
    /* JADX WARN: Code duplicated, block: B:169:0x075a  */
    /* JADX WARN: Code duplicated, block: B:172:0x0777  */
    /* JADX WARN: Code duplicated, block: B:173:0x0789  */
    /* JADX WARN: Code duplicated, block: B:176:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:178:0x0813  */
    /* JADX WARN: Code duplicated, block: B:180:0x0819  */
    /* JADX WARN: Code duplicated, block: B:183:0x0861  */
    /* JADX WARN: Code duplicated, block: B:186:0x0887  */
    /* JADX WARN: Code duplicated, block: B:188:0x089e  */
    /* JADX WARN: Code duplicated, block: B:191:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:193:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:196:0x0907  */
    /* JADX WARN: Code duplicated, block: B:197:0x0909  */
    /* JADX WARN: Code duplicated, block: B:199:0x090d  */
    /* JADX WARN: Code duplicated, block: B:201:0x0920  */
    /* JADX WARN: Code duplicated, block: B:204:0x095e  */
    /* JADX WARN: Code duplicated, block: B:205:0x0962  */
    /* JADX WARN: Code duplicated, block: B:208:0x0975  */
    /* JADX WARN: Code duplicated, block: B:210:0x0998  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0213  */
    /* JADX WARN: Code duplicated, block: B:66:0x0235 A[ADDED_TO_REGION] */
    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        float f;
        long jC;
        float f2;
        float f3;
        long jC2;
        boolean zF;
        Object objQ;
        c30 c30Var;
        ey1 ey1Var;
        pr prVar;
        x30 x30Var;
        gh ghVar;
        gh ghVar2;
        gh ghVar3;
        wa waVar;
        gh ghVar4;
        iy0 iy0Var;
        av1 av1Var;
        long j2;
        iy0 iy0Var2;
        boolean z;
        boolean z2;
        gh ghVar5;
        long jC3;
        long j3;
        float f4;
        long jC4;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        String strO;
        int i3;
        long j4;
        boolean zH;
        Object objQ2;
        int i4 = this.e;
        c30 c30Var2 = d30.a;
        av1 av1Var2 = av1.a;
        boolean z5 = this.g;
        mf3 mf3Var = mf3.a;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.f;
        boolean z6 = false;
        switch (i4) {
            case 0:
                iy0 iy0Var3 = o51.p0;
                au0 au0Var = (au0) obj8;
                AppInfoItem appInfoItem = (AppInfoItem) obj7;
                List list = (List) obj6;
                ey1 ey1Var2 = (ey1) obj5;
                lu0 lu0Var = (lu0) obj4;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ho hoVar = am1.g;
                go goVar = am1.e;
                nr nrVar = j9.r;
                pr prVar2 = j9.j;
                or orVar = j9.p;
                ((zz) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    dv1 dv1VarE = iw2.e(av1Var2, 1.0f);
                    yz yzVarA = wz.a(new jo(16.0f, true, new fo(0)), nrVar, ov0Var, 6);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1VarE);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    gh ghVar6 = v20.e;
                    q73.h(ov0Var, ghVar6, yzVarA);
                    gh ghVar7 = v20.d;
                    q73.h(ov0Var, ghVar7, l72VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    ey1 ey1Var3 = ey1Var2;
                    gh ghVar8 = v20.f;
                    q73.h(ov0Var, ghVar8, numValueOf);
                    wa waVar2 = v20.g;
                    q73.g(ov0Var, waVar2);
                    c30 c30Var3 = c30Var2;
                    gh ghVar9 = v20.c;
                    q73.h(ov0Var, ghVar9, dv1VarH);
                    dv1 dv1VarE2 = iw2.e(av1Var2, 1.0f);
                    kk2 kk2VarA = jk2.a(goVar, orVar, ov0Var, 48);
                    int iHashCode2 = Long.hashCode(ov0Var.T);
                    l72 l72VarL2 = ov0Var.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarE2);
                    ov0Var.g0();
                    or orVar2 = orVar;
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar6, kk2VarA);
                    q73.h(ov0Var, ghVar7, l72VarL2);
                    az2.s(iHashCode2, ov0Var, ghVar8, ov0Var, waVar2);
                    q73.h(ov0Var, ghVar9, dv1VarH2);
                    dv1 dv1VarK = xp1.k(xp1.n(iw2.k(av1Var2, 42.0f), cj2.a(12.0f)), z5 ? hz.c(0.05f, hz.c) : hz.c(0.03f, hz.b), iy0Var3);
                    er1 er1VarC = ws.c(prVar2, false);
                    go goVar2 = goVar;
                    int iHashCode3 = Long.hashCode(ov0Var.T);
                    l72 l72VarL3 = ov0Var.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var, dv1VarK);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar6, er1VarC);
                    q73.h(ov0Var, ghVar7, l72VarL3);
                    az2.s(iHashCode3, ov0Var, ghVar8, ov0Var, waVar2);
                    q73.h(ov0Var, ghVar9, dv1VarH3);
                    ks.C(appInfoItem.getPackageName(), iw2.k(av1Var2, 34.0f), ov0Var, 48);
                    ov0Var.p(true);
                    gh0.h(ov0Var, iw2.o(av1Var2, 12.0f));
                    wb1 wb1Var = new wb1(1.0f, true);
                    ho hoVar2 = hoVar;
                    yz yzVarA2 = wz.a(hoVar2, nrVar, ov0Var, 0);
                    int iHashCode4 = Long.hashCode(ov0Var.T);
                    l72 l72VarL4 = ov0Var.l();
                    dv1 dv1VarH4 = xp1.H(ov0Var, wb1Var);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar6, yzVarA2);
                    q73.h(ov0Var, ghVar7, l72VarL4);
                    az2.s(iHashCode4, ov0Var, ghVar8, ov0Var, waVar2);
                    q73.h(ov0Var, ghVar9, dv1VarH4);
                    String appName = appInfoItem.getAppName();
                    long jB = v63.b(16.5d);
                    jr0 jr0Var = jr0.j;
                    hh0 hh0Var = mz.a;
                    s83.b(appName, null, ((kz) ov0Var.j(hh0Var)).q, jB, jr0Var, null, 0L, null, null, 0L, 2, false, 1, 0, null, ov0Var, 1597440, 24960, 241578);
                    gh0.h(ov0Var, iw2.g(av1Var2, 2.0f));
                    s83.b(ke0.N(2131624967, ov0Var), null, hz.c(0.5f, ((kz) ov0Var.j(hh0Var)).q), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                    ov0Var.p(true);
                    dv1 dv1VarA = bk.a(xp1.k(xp1.n(iw2.k(av1Var2, 30.0f), cj2.a), z5 ? hz.c(0.08f, hz.c) : hz.c(0.05f, hz.b), iy0Var3), au0Var);
                    er1 er1VarC2 = ws.c(prVar2, false);
                    int iHashCode5 = Long.hashCode(ov0Var.T);
                    l72 l72VarL5 = ov0Var.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var, dv1VarA);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar6, er1VarC2);
                    q73.h(ov0Var, ghVar7, l72VarL5);
                    az2.s(iHashCode5, ov0Var, ghVar8, ov0Var, waVar2);
                    q73.h(ov0Var, ghVar9, dv1VarH5);
                    x01 x01VarU = k22.u();
                    String strN = ke0.N(2131624114, ov0Var);
                    long jC5 = hz.c(0.6f, ((kz) ov0Var.j(hh0Var)).q);
                    av1 av1Var3 = av1Var2;
                    t01.a(x01VarU, strN, iw2.k(av1Var3, 15.0f), jC5, ov0Var, 384, 0);
                    ov0Var.p(true);
                    ov0Var.p(true);
                    nr nrVar2 = nrVar;
                    yz yzVarA3 = wz.a(new jo(8.0f, true, new fo(0)), nrVar2, ov0Var, 6);
                    int iHashCode6 = Long.hashCode(ov0Var.T);
                    l72 l72VarL6 = ov0Var.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var, av1Var3);
                    ov0Var.g0();
                    pr prVar3 = prVar2;
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar6, yzVarA3);
                    q73.h(ov0Var, ghVar7, l72VarL6);
                    az2.s(iHashCode6, ov0Var, ghVar8, ov0Var, waVar2);
                    q73.h(ov0Var, ghVar9, dv1VarH6);
                    ov0Var.c0(-1997352060);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        w60 w60Var = (w60) it.next();
                        boolean zEquals = w60Var.a.equals((String) ey1Var3.getValue());
                        dv1 dv1VarN = xp1.n(iw2.e(av1Var3, 1.0f), cj2.a(14.0f));
                        if (zEquals) {
                            jC = hz.c(z5 ? 0.14f : 0.09f, bk.g);
                        } else {
                            if (z5) {
                                jC = hz.c(0.04f, hz.c);
                            } else {
                                jC = hz.c(0.03f, hz.b);
                            }
                            dv1 dv1VarK2 = xp1.k(dv1VarN, jC, iy0Var3);
                            if (zEquals) {
                                f2 = 1.5f;
                            } else {
                                f2 = 0.8f;
                            }
                            if (zEquals) {
                                ov0Var.c0(818422537);
                                ov0Var.p(false);
                                jC2 = bk.g;
                            } else {
                                ov0Var.c0(818424247);
                                long j5 = ((kz) ov0Var.j(mz.a)).A;
                                if (z5) {
                                    f3 = 0.1f;
                                } else {
                                    f3 = 0.05f;
                                }
                                jC2 = hz.c(f3, j5);
                                ov0Var.p(false);
                            }
                            dv1 dv1VarW = ji2.w(dv1VarK2, f2, jC2, cj2.a(14.0f));
                            zF = ov0Var.f(w60Var);
                            objQ = ov0Var.Q();
                            if (zF) {
                                c30Var = c30Var3;
                            } else {
                                c30Var = c30Var3;
                                if (objQ == c30Var) {
                                    ey1Var = ey1Var3;
                                }
                                dv1 dv1VarE3 = zm3.E(bk.a(dv1VarW, (au0) objQ), 14.0f, 12.0f);
                                prVar = j9.f;
                                er1 er1VarC3 = ws.c(prVar, false);
                                int iHashCode7 = Long.hashCode(ov0Var.T);
                                l72 l72VarL7 = ov0Var.l();
                                dv1 dv1VarH7 = xp1.H(ov0Var, dv1VarE3);
                                w20.b.getClass();
                                x30Var = v20.b;
                                ov0Var.g0();
                                Iterator it2 = it;
                                if (ov0Var.S) {
                                    ov0Var.k(x30Var);
                                } else {
                                    ov0Var.p0();
                                }
                                ghVar = v20.e;
                                q73.h(ov0Var, ghVar, er1VarC3);
                                ghVar2 = v20.d;
                                q73.h(ov0Var, ghVar2, l72VarL7);
                                Integer numValueOf2 = Integer.valueOf(iHashCode7);
                                ghVar3 = v20.f;
                                q73.h(ov0Var, ghVar3, numValueOf2);
                                waVar = v20.g;
                                q73.g(ov0Var, waVar);
                                ghVar4 = v20.c;
                                q73.h(ov0Var, ghVar4, dv1VarH7);
                                ey1 ey1Var4 = ey1Var;
                                dv1 dv1VarE4 = iw2.e(av1Var3, 1.0f);
                                go goVar3 = goVar2;
                                c30 c30Var4 = c30Var;
                                or orVar3 = orVar2;
                                iy0Var = iy0Var3;
                                kk2 kk2VarA2 = jk2.a(goVar3, orVar3, ov0Var, 48);
                                nr nrVar3 = nrVar2;
                                int iHashCode8 = Long.hashCode(ov0Var.T);
                                l72 l72VarL8 = ov0Var.l();
                                dv1 dv1VarH8 = xp1.H(ov0Var, dv1VarE4);
                                ov0Var.g0();
                                if (ov0Var.S) {
                                    ov0Var.k(x30Var);
                                } else {
                                    ov0Var.p0();
                                }
                                q73.h(ov0Var, ghVar, kk2VarA2);
                                q73.h(ov0Var, ghVar2, l72VarL8);
                                az2.s(iHashCode8, ov0Var, ghVar3, ov0Var, waVar);
                                q73.h(ov0Var, ghVar4, dv1VarH8);
                                wb1 wb1Var2 = new wb1(1.0f, true);
                                yz yzVarA4 = wz.a(hoVar2, nrVar3, ov0Var, 0);
                                av1Var = av1Var3;
                                int iHashCode9 = Long.hashCode(ov0Var.T);
                                l72 l72VarL9 = ov0Var.l();
                                dv1 dv1VarH9 = xp1.H(ov0Var, wb1Var2);
                                ov0Var.g0();
                                if (ov0Var.S) {
                                    ov0Var.k(x30Var);
                                } else {
                                    ov0Var.p0();
                                }
                                q73.h(ov0Var, ghVar, yzVarA4);
                                q73.h(ov0Var, ghVar2, l72VarL9);
                                az2.s(iHashCode9, ov0Var, ghVar3, ov0Var, waVar);
                                q73.h(ov0Var, ghVar4, dv1VarH9);
                                kk2 kk2VarA3 = jk2.a(new jo(6.0f, true, new fo(0)), orVar3, ov0Var, 54);
                                int iHashCode10 = Long.hashCode(ov0Var.T);
                                l72 l72VarL10 = ov0Var.l();
                                dv1 dv1VarH10 = xp1.H(ov0Var, av1Var);
                                ov0Var.g0();
                                if (ov0Var.S) {
                                    ov0Var.k(x30Var);
                                } else {
                                    ov0Var.p0();
                                }
                                q73.h(ov0Var, ghVar, kk2VarA3);
                                q73.h(ov0Var, ghVar2, l72VarL10);
                                az2.s(iHashCode10, ov0Var, ghVar3, ov0Var, waVar);
                                q73.h(ov0Var, ghVar4, dv1VarH10);
                                String str = w60Var.b;
                                long jB2 = v63.b(14.5d);
                                jr0 jr0Var2 = jr0.j;
                                if (zEquals) {
                                    ov0Var.c0(-932796275);
                                    ov0Var.p(false);
                                    j2 = bk.g;
                                } else {
                                    ov0Var.c0(-932794932);
                                    long j6 = ((kz) ov0Var.j(mz.a)).q;
                                    ov0Var.p(false);
                                    j2 = j6;
                                }
                                s83.b(str, null, j2, jB2, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                                if (w60Var.c != null) {
                                    ov0Var.c0(1148271898);
                                    dv1 dv1VarN2 = xp1.n(av1Var, cj2.a(4.0f));
                                    long j7 = bk.g;
                                    iy0Var2 = iy0Var;
                                    dv1 dv1VarE5 = zm3.E(xp1.k(dv1VarN2, hz.c(0.12f, j7), iy0Var2), 5.0f, 1.0f);
                                    er1 er1VarC4 = ws.c(prVar, false);
                                    int iHashCode11 = Long.hashCode(ov0Var.T);
                                    l72 l72VarL11 = ov0Var.l();
                                    dv1 dv1VarH11 = xp1.H(ov0Var, dv1VarE5);
                                    ov0Var.g0();
                                    if (ov0Var.S) {
                                        ov0Var.k(x30Var);
                                    } else {
                                        ov0Var.p0();
                                    }
                                    ghVar5 = ghVar;
                                    q73.h(ov0Var, ghVar5, er1VarC4);
                                    q73.h(ov0Var, ghVar2, l72VarL11);
                                    az2.s(iHashCode11, ov0Var, ghVar3, ov0Var, waVar);
                                    q73.h(ov0Var, ghVar4, dv1VarH11);
                                    s83.b(w60Var.c, null, j7, v63.c(10), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
                                    z2 = true;
                                    ov0Var.p(true);
                                    z = false;
                                } else {
                                    iy0Var2 = iy0Var;
                                    z = false;
                                    z2 = true;
                                    ghVar5 = ghVar;
                                    ov0Var.c0(1140346655);
                                }
                                ov0Var.p(z);
                                ov0Var.p(z2);
                                gh0.h(ov0Var, iw2.g(av1Var, 4.0f));
                                String str2 = w60Var.d;
                                long jB3 = v63.b(11.5d);
                                if (zEquals) {
                                    ov0Var.c0(-1893372463);
                                    ov0Var.p(z);
                                    jC3 = hz.c(0.8f, bk.g);
                                } else {
                                    ov0Var.c0(-1893370457);
                                    jC3 = hz.c(0.5f, ((kz) ov0Var.j(mz.a)).q);
                                    ov0Var.p(false);
                                }
                                s83.b(str2, null, jC3, jB3, null, null, 0L, null, null, v63.c(16), 0, false, 0, 0, null, ov0Var, 24576, 48, 260074);
                                az2.t(ov0Var, true, av1Var, 10.0f, ov0Var);
                                dv1 dv1VarK3 = iw2.k(av1Var, 20.0f);
                                bj2 bj2Var = cj2.a;
                                dv1 dv1VarN3 = xp1.n(dv1VarK3, bj2Var);
                                if (zEquals) {
                                    j3 = bk.g;
                                } else {
                                    j3 = hz.f;
                                }
                                dv1 dv1VarK4 = xp1.k(dv1VarN3, j3, iy0Var2);
                                if (zEquals) {
                                    f4 = 0.0f;
                                } else {
                                    f4 = 1.5f;
                                }
                                if (zEquals) {
                                    ov0Var.c0(1934874740);
                                    z3 = false;
                                    ov0Var.p(false);
                                    jC4 = hz.f;
                                } else {
                                    ov0Var.c0(1934876537);
                                    jC4 = hz.c(0.3f, ((kz) ov0Var.j(mz.a)).q);
                                    z3 = false;
                                    ov0Var.p(false);
                                }
                                iy0 iy0Var4 = iy0Var2;
                                dv1 dv1VarW2 = ji2.w(dv1VarK4, f4, jC4, bj2Var);
                                pr prVar4 = prVar3;
                                er1 er1VarC5 = ws.c(prVar4, z3);
                                int iHashCode12 = Long.hashCode(ov0Var.T);
                                l72 l72VarL12 = ov0Var.l();
                                dv1 dv1VarH12 = xp1.H(ov0Var, dv1VarW2);
                                ov0Var.g0();
                                if (ov0Var.S) {
                                    ov0Var.k(x30Var);
                                } else {
                                    ov0Var.p0();
                                }
                                q73.h(ov0Var, ghVar5, er1VarC5);
                                q73.h(ov0Var, ghVar2, l72VarL12);
                                az2.s(iHashCode12, ov0Var, ghVar3, ov0Var, waVar);
                                q73.h(ov0Var, ghVar4, dv1VarH12);
                                if (zEquals) {
                                    ov0Var.c0(-1912759808);
                                    t01.a(k22.t(), null, iw2.k(av1Var, 13.0f), hz.c, ov0Var, 3504, 0);
                                    z4 = false;
                                } else {
                                    z4 = false;
                                    ov0Var.c0(-1923276589);
                                }
                                ov0Var.p(z4);
                                ov0Var.p(true);
                                ov0Var.p(true);
                                ov0Var.p(true);
                                av1Var3 = av1Var;
                                prVar3 = prVar4;
                                iy0Var3 = iy0Var4;
                                it = it2;
                                ey1Var3 = ey1Var4;
                                c30Var3 = c30Var4;
                                hoVar2 = hoVar2;
                                goVar2 = goVar3;
                                orVar2 = orVar3;
                                nrVar2 = nrVar3;
                            }
                            ey1Var = ey1Var3;
                            objQ = new m5(11, w60Var, ey1Var);
                            ov0Var.m0(objQ);
                            dv1 dv1VarE6 = zm3.E(bk.a(dv1VarW, (au0) objQ), 14.0f, 12.0f);
                            prVar = j9.f;
                            er1 er1VarC6 = ws.c(prVar, false);
                            int iHashCode13 = Long.hashCode(ov0Var.T);
                            l72 l72VarL13 = ov0Var.l();
                            dv1 dv1VarH13 = xp1.H(ov0Var, dv1VarE6);
                            w20.b.getClass();
                            x30Var = v20.b;
                            ov0Var.g0();
                            Iterator it3 = it;
                            if (ov0Var.S) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            ghVar = v20.e;
                            q73.h(ov0Var, ghVar, er1VarC6);
                            ghVar2 = v20.d;
                            q73.h(ov0Var, ghVar2, l72VarL13);
                            Integer numValueOf3 = Integer.valueOf(iHashCode13);
                            ghVar3 = v20.f;
                            q73.h(ov0Var, ghVar3, numValueOf3);
                            waVar = v20.g;
                            q73.g(ov0Var, waVar);
                            ghVar4 = v20.c;
                            q73.h(ov0Var, ghVar4, dv1VarH13);
                            ey1 ey1Var5 = ey1Var;
                            dv1 dv1VarE7 = iw2.e(av1Var3, 1.0f);
                            go goVar4 = goVar2;
                            c30 c30Var5 = c30Var;
                            or orVar4 = orVar2;
                            iy0Var = iy0Var3;
                            kk2 kk2VarA4 = jk2.a(goVar4, orVar4, ov0Var, 48);
                            nr nrVar4 = nrVar2;
                            int iHashCode14 = Long.hashCode(ov0Var.T);
                            l72 l72VarL14 = ov0Var.l();
                            dv1 dv1VarH14 = xp1.H(ov0Var, dv1VarE7);
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar, kk2VarA4);
                            q73.h(ov0Var, ghVar2, l72VarL14);
                            az2.s(iHashCode14, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH14);
                            wb1 wb1Var3 = new wb1(1.0f, true);
                            yz yzVarA5 = wz.a(hoVar2, nrVar4, ov0Var, 0);
                            av1Var = av1Var3;
                            int iHashCode15 = Long.hashCode(ov0Var.T);
                            l72 l72VarL15 = ov0Var.l();
                            dv1 dv1VarH15 = xp1.H(ov0Var, wb1Var3);
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar, yzVarA5);
                            q73.h(ov0Var, ghVar2, l72VarL15);
                            az2.s(iHashCode15, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH15);
                            kk2 kk2VarA5 = jk2.a(new jo(6.0f, true, new fo(0)), orVar4, ov0Var, 54);
                            int iHashCode16 = Long.hashCode(ov0Var.T);
                            l72 l72VarL16 = ov0Var.l();
                            dv1 dv1VarH16 = xp1.H(ov0Var, av1Var);
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar, kk2VarA5);
                            q73.h(ov0Var, ghVar2, l72VarL16);
                            az2.s(iHashCode16, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH16);
                            String str3 = w60Var.b;
                            long jB4 = v63.b(14.5d);
                            jr0 jr0Var3 = jr0.j;
                            if (zEquals) {
                                ov0Var.c0(-932796275);
                                ov0Var.p(false);
                                j2 = bk.g;
                            } else {
                                ov0Var.c0(-932794932);
                                long j8 = ((kz) ov0Var.j(mz.a)).q;
                                ov0Var.p(false);
                                j2 = j8;
                            }
                            s83.b(str3, null, j2, jB4, jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                            if (w60Var.c != null) {
                                ov0Var.c0(1148271898);
                                dv1 dv1VarN4 = xp1.n(av1Var, cj2.a(4.0f));
                                long j9 = bk.g;
                                iy0Var2 = iy0Var;
                                dv1 dv1VarE8 = zm3.E(xp1.k(dv1VarN4, hz.c(0.12f, j9), iy0Var2), 5.0f, 1.0f);
                                er1 er1VarC7 = ws.c(prVar, false);
                                int iHashCode17 = Long.hashCode(ov0Var.T);
                                l72 l72VarL17 = ov0Var.l();
                                dv1 dv1VarH17 = xp1.H(ov0Var, dv1VarE8);
                                ov0Var.g0();
                                if (ov0Var.S) {
                                    ov0Var.k(x30Var);
                                } else {
                                    ov0Var.p0();
                                }
                                ghVar5 = ghVar;
                                q73.h(ov0Var, ghVar5, er1VarC7);
                                q73.h(ov0Var, ghVar2, l72VarL17);
                                az2.s(iHashCode17, ov0Var, ghVar3, ov0Var, waVar);
                                q73.h(ov0Var, ghVar4, dv1VarH17);
                                s83.b(w60Var.c, null, j9, v63.c(10), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
                                z2 = true;
                                ov0Var.p(true);
                                z = false;
                            } else {
                                iy0Var2 = iy0Var;
                                z = false;
                                z2 = true;
                                ghVar5 = ghVar;
                                ov0Var.c0(1140346655);
                            }
                            ov0Var.p(z);
                            ov0Var.p(z2);
                            gh0.h(ov0Var, iw2.g(av1Var, 4.0f));
                            String str4 = w60Var.d;
                            long jB5 = v63.b(11.5d);
                            if (zEquals) {
                                ov0Var.c0(-1893372463);
                                ov0Var.p(z);
                                jC3 = hz.c(0.8f, bk.g);
                            } else {
                                ov0Var.c0(-1893370457);
                                jC3 = hz.c(0.5f, ((kz) ov0Var.j(mz.a)).q);
                                ov0Var.p(false);
                            }
                            s83.b(str4, null, jC3, jB5, null, null, 0L, null, null, v63.c(16), 0, false, 0, 0, null, ov0Var, 24576, 48, 260074);
                            az2.t(ov0Var, true, av1Var, 10.0f, ov0Var);
                            dv1 dv1VarK5 = iw2.k(av1Var, 20.0f);
                            bj2 bj2Var2 = cj2.a;
                            dv1 dv1VarN5 = xp1.n(dv1VarK5, bj2Var2);
                            if (zEquals) {
                                j3 = bk.g;
                            } else {
                                j3 = hz.f;
                            }
                            dv1 dv1VarK6 = xp1.k(dv1VarN5, j3, iy0Var2);
                            if (zEquals) {
                                f4 = 0.0f;
                            } else {
                                f4 = 1.5f;
                            }
                            if (zEquals) {
                                ov0Var.c0(1934874740);
                                z3 = false;
                                ov0Var.p(false);
                                jC4 = hz.f;
                            } else {
                                ov0Var.c0(1934876537);
                                jC4 = hz.c(0.3f, ((kz) ov0Var.j(mz.a)).q);
                                z3 = false;
                                ov0Var.p(false);
                            }
                            iy0 iy0Var5 = iy0Var2;
                            dv1 dv1VarW3 = ji2.w(dv1VarK6, f4, jC4, bj2Var2);
                            pr prVar5 = prVar3;
                            er1 er1VarC8 = ws.c(prVar5, z3);
                            int iHashCode18 = Long.hashCode(ov0Var.T);
                            l72 l72VarL18 = ov0Var.l();
                            dv1 dv1VarH18 = xp1.H(ov0Var, dv1VarW3);
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar5, er1VarC8);
                            q73.h(ov0Var, ghVar2, l72VarL18);
                            az2.s(iHashCode18, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH18);
                            if (zEquals) {
                                ov0Var.c0(-1912759808);
                                t01.a(k22.t(), null, iw2.k(av1Var, 13.0f), hz.c, ov0Var, 3504, 0);
                                z4 = false;
                            } else {
                                z4 = false;
                                ov0Var.c0(-1923276589);
                            }
                            ov0Var.p(z4);
                            ov0Var.p(true);
                            ov0Var.p(true);
                            ov0Var.p(true);
                            av1Var3 = av1Var;
                            prVar3 = prVar5;
                            iy0Var3 = iy0Var5;
                            it = it3;
                            ey1Var3 = ey1Var5;
                            c30Var3 = c30Var5;
                            hoVar2 = hoVar2;
                            goVar2 = goVar4;
                            orVar2 = orVar4;
                            nrVar2 = nrVar4;
                        }
                        dv1 dv1VarK7 = xp1.k(dv1VarN, jC, iy0Var3);
                        if (zEquals) {
                            f2 = 1.5f;
                        } else {
                            f2 = 0.8f;
                        }
                        if (zEquals) {
                            ov0Var.c0(818422537);
                            ov0Var.p(false);
                            jC2 = bk.g;
                        } else {
                            ov0Var.c0(818424247);
                            long j10 = ((kz) ov0Var.j(mz.a)).A;
                            if (z5) {
                                f3 = 0.1f;
                            } else {
                                f3 = 0.05f;
                            }
                            jC2 = hz.c(f3, j10);
                            ov0Var.p(false);
                        }
                        dv1 dv1VarW4 = ji2.w(dv1VarK7, f2, jC2, cj2.a(14.0f));
                        zF = ov0Var.f(w60Var);
                        objQ = ov0Var.Q();
                        if (zF) {
                            c30Var = c30Var3;
                            if (objQ == c30Var) {
                                ey1Var = ey1Var3;
                            }
                            dv1 dv1VarE9 = zm3.E(bk.a(dv1VarW4, (au0) objQ), 14.0f, 12.0f);
                            prVar = j9.f;
                            er1 er1VarC9 = ws.c(prVar, false);
                            int iHashCode19 = Long.hashCode(ov0Var.T);
                            l72 l72VarL19 = ov0Var.l();
                            dv1 dv1VarH19 = xp1.H(ov0Var, dv1VarE9);
                            w20.b.getClass();
                            x30Var = v20.b;
                            ov0Var.g0();
                            Iterator it4 = it;
                            if (ov0Var.S) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            ghVar = v20.e;
                            q73.h(ov0Var, ghVar, er1VarC9);
                            ghVar2 = v20.d;
                            q73.h(ov0Var, ghVar2, l72VarL19);
                            Integer numValueOf4 = Integer.valueOf(iHashCode19);
                            ghVar3 = v20.f;
                            q73.h(ov0Var, ghVar3, numValueOf4);
                            waVar = v20.g;
                            q73.g(ov0Var, waVar);
                            ghVar4 = v20.c;
                            q73.h(ov0Var, ghVar4, dv1VarH19);
                            ey1 ey1Var6 = ey1Var;
                            dv1 dv1VarE10 = iw2.e(av1Var3, 1.0f);
                            go goVar5 = goVar2;
                            c30 c30Var6 = c30Var;
                            or orVar5 = orVar2;
                            iy0Var = iy0Var3;
                            kk2 kk2VarA6 = jk2.a(goVar5, orVar5, ov0Var, 48);
                            nr nrVar5 = nrVar2;
                            int iHashCode110 = Long.hashCode(ov0Var.T);
                            l72 l72VarL110 = ov0Var.l();
                            dv1 dv1VarH110 = xp1.H(ov0Var, dv1VarE10);
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar, kk2VarA6);
                            q73.h(ov0Var, ghVar2, l72VarL110);
                            az2.s(iHashCode110, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH110);
                            wb1 wb1Var4 = new wb1(1.0f, true);
                            yz yzVarA6 = wz.a(hoVar2, nrVar5, ov0Var, 0);
                            av1Var = av1Var3;
                            int iHashCode111 = Long.hashCode(ov0Var.T);
                            l72 l72VarL111 = ov0Var.l();
                            dv1 dv1VarH111 = xp1.H(ov0Var, wb1Var4);
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar, yzVarA6);
                            q73.h(ov0Var, ghVar2, l72VarL111);
                            az2.s(iHashCode111, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH111);
                            kk2 kk2VarA7 = jk2.a(new jo(6.0f, true, new fo(0)), orVar5, ov0Var, 54);
                            int iHashCode112 = Long.hashCode(ov0Var.T);
                            l72 l72VarL112 = ov0Var.l();
                            dv1 dv1VarH112 = xp1.H(ov0Var, av1Var);
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar, kk2VarA7);
                            q73.h(ov0Var, ghVar2, l72VarL112);
                            az2.s(iHashCode112, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH112);
                            String str5 = w60Var.b;
                            long jB6 = v63.b(14.5d);
                            jr0 jr0Var4 = jr0.j;
                            if (zEquals) {
                                ov0Var.c0(-932796275);
                                ov0Var.p(false);
                                j2 = bk.g;
                            } else {
                                ov0Var.c0(-932794932);
                                long j11 = ((kz) ov0Var.j(mz.a)).q;
                                ov0Var.p(false);
                                j2 = j11;
                            }
                            s83.b(str5, null, j2, jB6, jr0Var4, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                            if (w60Var.c != null) {
                                ov0Var.c0(1148271898);
                                dv1 dv1VarN6 = xp1.n(av1Var, cj2.a(4.0f));
                                long j12 = bk.g;
                                iy0Var2 = iy0Var;
                                dv1 dv1VarE11 = zm3.E(xp1.k(dv1VarN6, hz.c(0.12f, j12), iy0Var2), 5.0f, 1.0f);
                                er1 er1VarC10 = ws.c(prVar, false);
                                int iHashCode113 = Long.hashCode(ov0Var.T);
                                l72 l72VarL113 = ov0Var.l();
                                dv1 dv1VarH113 = xp1.H(ov0Var, dv1VarE11);
                                ov0Var.g0();
                                if (ov0Var.S) {
                                    ov0Var.k(x30Var);
                                } else {
                                    ov0Var.p0();
                                }
                                ghVar5 = ghVar;
                                q73.h(ov0Var, ghVar5, er1VarC10);
                                q73.h(ov0Var, ghVar2, l72VarL113);
                                az2.s(iHashCode113, ov0Var, ghVar3, ov0Var, waVar);
                                q73.h(ov0Var, ghVar4, dv1VarH113);
                                s83.b(w60Var.c, null, j12, v63.c(10), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
                                z2 = true;
                                ov0Var.p(true);
                                z = false;
                            } else {
                                iy0Var2 = iy0Var;
                                z = false;
                                z2 = true;
                                ghVar5 = ghVar;
                                ov0Var.c0(1140346655);
                            }
                            ov0Var.p(z);
                            ov0Var.p(z2);
                            gh0.h(ov0Var, iw2.g(av1Var, 4.0f));
                            String str6 = w60Var.d;
                            long jB7 = v63.b(11.5d);
                            if (zEquals) {
                                ov0Var.c0(-1893372463);
                                ov0Var.p(z);
                                jC3 = hz.c(0.8f, bk.g);
                            } else {
                                ov0Var.c0(-1893370457);
                                jC3 = hz.c(0.5f, ((kz) ov0Var.j(mz.a)).q);
                                ov0Var.p(false);
                            }
                            s83.b(str6, null, jC3, jB7, null, null, 0L, null, null, v63.c(16), 0, false, 0, 0, null, ov0Var, 24576, 48, 260074);
                            az2.t(ov0Var, true, av1Var, 10.0f, ov0Var);
                            dv1 dv1VarK8 = iw2.k(av1Var, 20.0f);
                            bj2 bj2Var3 = cj2.a;
                            dv1 dv1VarN7 = xp1.n(dv1VarK8, bj2Var3);
                            if (zEquals) {
                                j3 = bk.g;
                            } else {
                                j3 = hz.f;
                            }
                            dv1 dv1VarK9 = xp1.k(dv1VarN7, j3, iy0Var2);
                            if (zEquals) {
                                f4 = 0.0f;
                            } else {
                                f4 = 1.5f;
                            }
                            if (zEquals) {
                                ov0Var.c0(1934874740);
                                z3 = false;
                                ov0Var.p(false);
                                jC4 = hz.f;
                            } else {
                                ov0Var.c0(1934876537);
                                jC4 = hz.c(0.3f, ((kz) ov0Var.j(mz.a)).q);
                                z3 = false;
                                ov0Var.p(false);
                            }
                            iy0 iy0Var6 = iy0Var2;
                            dv1 dv1VarW5 = ji2.w(dv1VarK9, f4, jC4, bj2Var3);
                            pr prVar6 = prVar3;
                            er1 er1VarC11 = ws.c(prVar6, z3);
                            int iHashCode114 = Long.hashCode(ov0Var.T);
                            l72 l72VarL114 = ov0Var.l();
                            dv1 dv1VarH114 = xp1.H(ov0Var, dv1VarW5);
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar5, er1VarC11);
                            q73.h(ov0Var, ghVar2, l72VarL114);
                            az2.s(iHashCode114, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH114);
                            if (zEquals) {
                                ov0Var.c0(-1912759808);
                                t01.a(k22.t(), null, iw2.k(av1Var, 13.0f), hz.c, ov0Var, 3504, 0);
                                z4 = false;
                            } else {
                                z4 = false;
                                ov0Var.c0(-1923276589);
                            }
                            ov0Var.p(z4);
                            ov0Var.p(true);
                            ov0Var.p(true);
                            ov0Var.p(true);
                            av1Var3 = av1Var;
                            prVar3 = prVar6;
                            iy0Var3 = iy0Var6;
                            it = it4;
                            ey1Var3 = ey1Var6;
                            c30Var3 = c30Var6;
                            hoVar2 = hoVar2;
                            goVar2 = goVar5;
                            orVar2 = orVar5;
                            nrVar2 = nrVar5;
                        } else {
                            c30Var = c30Var3;
                        }
                        ey1Var = ey1Var3;
                        objQ = new m5(11, w60Var, ey1Var);
                        ov0Var.m0(objQ);
                        dv1 dv1VarE12 = zm3.E(bk.a(dv1VarW4, (au0) objQ), 14.0f, 12.0f);
                        prVar = j9.f;
                        er1 er1VarC12 = ws.c(prVar, false);
                        int iHashCode115 = Long.hashCode(ov0Var.T);
                        l72 l72VarL115 = ov0Var.l();
                        dv1 dv1VarH115 = xp1.H(ov0Var, dv1VarE12);
                        w20.b.getClass();
                        x30Var = v20.b;
                        ov0Var.g0();
                        Iterator it5 = it;
                        if (ov0Var.S) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        ghVar = v20.e;
                        q73.h(ov0Var, ghVar, er1VarC12);
                        ghVar2 = v20.d;
                        q73.h(ov0Var, ghVar2, l72VarL115);
                        Integer numValueOf5 = Integer.valueOf(iHashCode115);
                        ghVar3 = v20.f;
                        q73.h(ov0Var, ghVar3, numValueOf5);
                        waVar = v20.g;
                        q73.g(ov0Var, waVar);
                        ghVar4 = v20.c;
                        q73.h(ov0Var, ghVar4, dv1VarH115);
                        ey1 ey1Var7 = ey1Var;
                        dv1 dv1VarE13 = iw2.e(av1Var3, 1.0f);
                        go goVar6 = goVar2;
                        c30 c30Var7 = c30Var;
                        or orVar6 = orVar2;
                        iy0Var = iy0Var3;
                        kk2 kk2VarA8 = jk2.a(goVar6, orVar6, ov0Var, 48);
                        nr nrVar6 = nrVar2;
                        int iHashCode116 = Long.hashCode(ov0Var.T);
                        l72 l72VarL116 = ov0Var.l();
                        dv1 dv1VarH116 = xp1.H(ov0Var, dv1VarE13);
                        ov0Var.g0();
                        if (ov0Var.S) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar, kk2VarA8);
                        q73.h(ov0Var, ghVar2, l72VarL116);
                        az2.s(iHashCode116, ov0Var, ghVar3, ov0Var, waVar);
                        q73.h(ov0Var, ghVar4, dv1VarH116);
                        wb1 wb1Var5 = new wb1(1.0f, true);
                        yz yzVarA7 = wz.a(hoVar2, nrVar6, ov0Var, 0);
                        av1Var = av1Var3;
                        int iHashCode117 = Long.hashCode(ov0Var.T);
                        l72 l72VarL117 = ov0Var.l();
                        dv1 dv1VarH117 = xp1.H(ov0Var, wb1Var5);
                        ov0Var.g0();
                        if (ov0Var.S) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar, yzVarA7);
                        q73.h(ov0Var, ghVar2, l72VarL117);
                        az2.s(iHashCode117, ov0Var, ghVar3, ov0Var, waVar);
                        q73.h(ov0Var, ghVar4, dv1VarH117);
                        kk2 kk2VarA9 = jk2.a(new jo(6.0f, true, new fo(0)), orVar6, ov0Var, 54);
                        int iHashCode118 = Long.hashCode(ov0Var.T);
                        l72 l72VarL118 = ov0Var.l();
                        dv1 dv1VarH118 = xp1.H(ov0Var, av1Var);
                        ov0Var.g0();
                        if (ov0Var.S) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar, kk2VarA9);
                        q73.h(ov0Var, ghVar2, l72VarL118);
                        az2.s(iHashCode118, ov0Var, ghVar3, ov0Var, waVar);
                        q73.h(ov0Var, ghVar4, dv1VarH118);
                        String str7 = w60Var.b;
                        long jB8 = v63.b(14.5d);
                        jr0 jr0Var5 = jr0.j;
                        if (zEquals) {
                            ov0Var.c0(-932796275);
                            ov0Var.p(false);
                            j2 = bk.g;
                        } else {
                            ov0Var.c0(-932794932);
                            long j13 = ((kz) ov0Var.j(mz.a)).q;
                            ov0Var.p(false);
                            j2 = j13;
                        }
                        s83.b(str7, null, j2, jB8, jr0Var5, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                        if (w60Var.c != null) {
                            ov0Var.c0(1148271898);
                            dv1 dv1VarN8 = xp1.n(av1Var, cj2.a(4.0f));
                            long j14 = bk.g;
                            iy0Var2 = iy0Var;
                            dv1 dv1VarE14 = zm3.E(xp1.k(dv1VarN8, hz.c(0.12f, j14), iy0Var2), 5.0f, 1.0f);
                            er1 er1VarC13 = ws.c(prVar, false);
                            int iHashCode119 = Long.hashCode(ov0Var.T);
                            l72 l72VarL119 = ov0Var.l();
                            dv1 dv1VarH119 = xp1.H(ov0Var, dv1VarE14);
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var);
                            } else {
                                ov0Var.p0();
                            }
                            ghVar5 = ghVar;
                            q73.h(ov0Var, ghVar5, er1VarC13);
                            q73.h(ov0Var, ghVar2, l72VarL119);
                            az2.s(iHashCode119, ov0Var, ghVar3, ov0Var, waVar);
                            q73.h(ov0Var, ghVar4, dv1VarH119);
                            s83.b(w60Var.c, null, j14, v63.c(10), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
                            z2 = true;
                            ov0Var.p(true);
                            z = false;
                        } else {
                            iy0Var2 = iy0Var;
                            z = false;
                            z2 = true;
                            ghVar5 = ghVar;
                            ov0Var.c0(1140346655);
                        }
                        ov0Var.p(z);
                        ov0Var.p(z2);
                        gh0.h(ov0Var, iw2.g(av1Var, 4.0f));
                        String str8 = w60Var.d;
                        long jB9 = v63.b(11.5d);
                        if (zEquals) {
                            ov0Var.c0(-1893372463);
                            ov0Var.p(z);
                            jC3 = hz.c(0.8f, bk.g);
                        } else {
                            ov0Var.c0(-1893370457);
                            jC3 = hz.c(0.5f, ((kz) ov0Var.j(mz.a)).q);
                            ov0Var.p(false);
                        }
                        s83.b(str8, null, jC3, jB9, null, null, 0L, null, null, v63.c(16), 0, false, 0, 0, null, ov0Var, 24576, 48, 260074);
                        az2.t(ov0Var, true, av1Var, 10.0f, ov0Var);
                        dv1 dv1VarK10 = iw2.k(av1Var, 20.0f);
                        bj2 bj2Var4 = cj2.a;
                        dv1 dv1VarN9 = xp1.n(dv1VarK10, bj2Var4);
                        if (zEquals) {
                            j3 = bk.g;
                        } else {
                            j3 = hz.f;
                        }
                        dv1 dv1VarK11 = xp1.k(dv1VarN9, j3, iy0Var2);
                        if (zEquals) {
                            f4 = 0.0f;
                        } else {
                            f4 = 1.5f;
                        }
                        if (zEquals) {
                            ov0Var.c0(1934874740);
                            z3 = false;
                            ov0Var.p(false);
                            jC4 = hz.f;
                        } else {
                            ov0Var.c0(1934876537);
                            jC4 = hz.c(0.3f, ((kz) ov0Var.j(mz.a)).q);
                            z3 = false;
                            ov0Var.p(false);
                        }
                        iy0 iy0Var7 = iy0Var2;
                        dv1 dv1VarW6 = ji2.w(dv1VarK11, f4, jC4, bj2Var4);
                        pr prVar7 = prVar3;
                        er1 er1VarC14 = ws.c(prVar7, z3);
                        int iHashCode1110 = Long.hashCode(ov0Var.T);
                        l72 l72VarL1110 = ov0Var.l();
                        dv1 dv1VarH1110 = xp1.H(ov0Var, dv1VarW6);
                        ov0Var.g0();
                        if (ov0Var.S) {
                            ov0Var.k(x30Var);
                        } else {
                            ov0Var.p0();
                        }
                        q73.h(ov0Var, ghVar5, er1VarC14);
                        q73.h(ov0Var, ghVar2, l72VarL1110);
                        az2.s(iHashCode1110, ov0Var, ghVar3, ov0Var, waVar);
                        q73.h(ov0Var, ghVar4, dv1VarH1110);
                        if (zEquals) {
                            ov0Var.c0(-1912759808);
                            t01.a(k22.t(), null, iw2.k(av1Var, 13.0f), hz.c, ov0Var, 3504, 0);
                            z4 = false;
                        } else {
                            z4 = false;
                            ov0Var.c0(-1923276589);
                        }
                        ov0Var.p(z4);
                        ov0Var.p(true);
                        ov0Var.p(true);
                        ov0Var.p(true);
                        av1Var3 = av1Var;
                        prVar3 = prVar7;
                        iy0Var3 = iy0Var7;
                        it = it5;
                        ey1Var3 = ey1Var7;
                        c30Var3 = c30Var7;
                        hoVar2 = hoVar2;
                        goVar2 = goVar6;
                        orVar2 = orVar6;
                        nrVar2 = nrVar6;
                    }
                    av1 av1Var4 = av1Var3;
                    pr prVar8 = prVar3;
                    or orVar7 = orVar2;
                    c30 c30Var8 = c30Var3;
                    iy0 iy0Var8 = iy0Var3;
                    ey1 ey1Var8 = ey1Var3;
                    ov0Var.p(false);
                    ov0Var.p(true);
                    dv1 dv1VarE15 = iw2.e(av1Var4, 1.0f);
                    kk2 kk2VarA10 = jk2.a(new jo(10.0f, true, new fo(0)), orVar7, ov0Var, 54);
                    int iHashCode20 = Long.hashCode(ov0Var.T);
                    l72 l72VarL20 = ov0Var.l();
                    dv1 dv1VarH20 = xp1.H(ov0Var, dv1VarE15);
                    w20.b.getClass();
                    x30 x30Var3 = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var3);
                    } else {
                        ov0Var.p0();
                    }
                    gh ghVar10 = v20.e;
                    q73.h(ov0Var, ghVar10, kk2VarA10);
                    gh ghVar11 = v20.d;
                    q73.h(ov0Var, ghVar11, l72VarL20);
                    Integer numValueOf6 = Integer.valueOf(iHashCode20);
                    gh ghVar12 = v20.f;
                    q73.h(ov0Var, ghVar12, numValueOf6);
                    wa waVar3 = v20.g;
                    q73.g(ov0Var, waVar3);
                    gh ghVar13 = v20.c;
                    q73.h(ov0Var, ghVar13, dv1VarH20);
                    lk2 lk2Var = lk2.a;
                    dv1 dv1VarN10 = xp1.n(iw2.g(lk2.a(lk2Var, av1Var4, 1.0f), 44.0f), cj2.a(14.0f));
                    if (z5) {
                        j = hz.c;
                        f = 0.08f;
                    } else {
                        j = hz.b;
                        f = 0.05f;
                    }
                    dv1 dv1VarA2 = bk.a(xp1.k(dv1VarN10, hz.c(f, j), iy0Var8), au0Var);
                    er1 er1VarC15 = ws.c(prVar8, false);
                    int iHashCode21 = Long.hashCode(ov0Var.T);
                    l72 l72VarL21 = ov0Var.l();
                    dv1 dv1VarH21 = xp1.H(ov0Var, dv1VarA2);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var3);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar10, er1VarC15);
                    q73.h(ov0Var, ghVar11, l72VarL21);
                    az2.s(iHashCode21, ov0Var, ghVar12, ov0Var, waVar3);
                    q73.h(ov0Var, ghVar13, dv1VarH21);
                    s83.b(ke0.N(2131624085, ov0Var), null, hz.c(0.75f, ((kz) ov0Var.j(mz.a)).q), v63.c(14), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                    ov0Var.p(true);
                    bj2 bj2VarA = cj2.a(14.0f);
                    b52 b52Var = hu.a;
                    gu guVarA = hu.a(bk.g, 0L, 0L, 0L, ov0Var, 14);
                    dv1 dv1VarG = iw2.g(lk2.a(lk2Var, av1Var4, 1.3f), 44.0f);
                    boolean zF2 = ov0Var.f(lu0Var);
                    Object objQ3 = ov0Var.Q();
                    if (zF2 || objQ3 == c30Var8) {
                        objQ3 = new y60(lu0Var, ey1Var8, 0);
                        ov0Var.m0(objQ3);
                    }
                    n51.a((au0) objQ3, dv1VarG, false, bj2VarA, guVarA, null, null, null, o51.Z, ov0Var, 805306368, 484);
                    ov0Var.p(true);
                    ov0Var.p(true);
                }
                break;
            case 1:
                CloudAccountState cloudAccountState = (CloudAccountState) obj7;
                au0 au0Var2 = (au0) obj8;
                au0 au0Var3 = (au0) obj6;
                au0 au0Var4 = (au0) obj5;
                au0 au0Var5 = (au0) obj4;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    da0.a(cloudAccountState, au0Var2, this.g, au0Var3, au0Var4, au0Var5, ov0Var2, 0);
                }
                break;
            default:
                CloudAccountState cloudAccountState2 = (CloudAccountState) obj8;
                SyncSelection syncSelection = (SyncSelection) obj7;
                CloudAccount cloudAccount = (CloudAccount) obj6;
                AccountSyncManager accountSyncManager = (AccountSyncManager) obj5;
                s03 s03Var = (s03) obj4;
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ov0Var3.W();
                } else {
                    dv1 dv1VarD = zm3.D(iw2.e(av1Var2, 1.0f), 16.0f);
                    yz yzVarA8 = wz.a(new jo(8.0f, true, new fo(0)), j9.r, ov0Var3, 6);
                    int iHashCode22 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL22 = ov0Var3.l();
                    dv1 dv1VarH22 = xp1.H(ov0Var3, dv1VarD);
                    w20.b.getClass();
                    x30 x30Var4 = v20.b;
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var4);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, v20.e, yzVarA8);
                    q73.h(ov0Var3, v20.d, l72VarL22);
                    q73.h(ov0Var3, v20.f, Integer.valueOf(iHashCode22));
                    q73.g(ov0Var3, v20.g);
                    q73.h(ov0Var3, v20.c, dv1VarH22);
                    if (cloudAccountState2.getValidated() && !z5) {
                        i2 = 550161351;
                        i = 2131625066;
                    } else if (!syncSelection.getEnabled()) {
                        i2 = 550164516;
                        i = 2131625082;
                    } else if (!syncSelection.getCategories().isEmpty()) {
                        boolean validated = cloudAccountState2.getValidated();
                        i = 2131625080;
                        if (!validated || cloudAccount == null || cloudAccount.isGuest()) {
                            i2 = 550172099;
                        } else {
                            if (!z5) {
                                i3 = 550174856;
                            } else if (!zy.g0(yo.H0(new String[]{"registered_account_required", "member_required"}), ((AccountSyncState) s03Var.getValue()).getAccessDeniedCode())) {
                                if (((AccountSyncState) s03Var.getValue()).getAccessDeniedCode() != null) {
                                    i3 = 550183496;
                                } else if (((AccountSyncState) s03Var.getValue()).getSyncing()) {
                                    i2 = 550186530;
                                    i = 2131624270;
                                } else if (((AccountSyncState) s03Var.getValue()).getError() != null) {
                                    i2 = 550189568;
                                    i = 2131624269;
                                } else if (((AccountSyncState) s03Var.getValue()).getLastSyncedAt() != null) {
                                    ov0Var3.c0(550192836);
                                    DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
                                    Long lastSyncedAt = ((AccountSyncState) s03Var.getValue()).getLastSyncedAt();
                                    lastSyncedAt.getClass();
                                    String str9 = dateTimeInstance.format(new Date(lastSyncedAt.longValue()));
                                    str9.getClass();
                                    strO = ke0.O(2131624271, new Object[]{str9}, ov0Var3);
                                    ov0Var3.p(false);
                                } else {
                                    i2 = 550197442;
                                    i = 2131624273;
                                }
                                String str10 = strO;
                                if (syncSelection.getActive() || !z5 || ((AccountSyncState) s03Var.getValue()).getError() == null) {
                                    ov0Var3.c0(550203783);
                                    j4 = ((kz) ov0Var3.j(mz.a)).s;
                                } else {
                                    ov0Var3.c0(550202588);
                                    j4 = ((kz) ov0Var3.j(mz.a)).w;
                                }
                                ov0Var3.p(false);
                                s83.b(str10, null, j4, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262138);
                                zH = ov0Var3.h(accountSyncManager);
                                objQ2 = ov0Var3.Q();
                                if (zH || objQ2 == c30Var2) {
                                    objQ2 = new w12(0, accountSyncManager, AccountSyncManager.class, "refresh", "refresh()V", 0, 14);
                                    ov0Var3.m0(objQ2);
                                }
                                au0 au0Var6 = (au0) ((o81) objQ2);
                                if (syncSelection.getActive() && z5 && !((AccountSyncState) s03Var.getValue()).getSyncing()) {
                                    z6 = true;
                                }
                                b52 b52Var2 = hu.a;
                                n51.h(au0Var6, null, z6, null, hu.e(0L, bk.g, ov0Var3, 13), null, null, n51.G, ov0Var3, 805306368, 490);
                                ov0Var3.p(true);
                            } else {
                                i2 = 550180067;
                            }
                            strO = az2.h(ov0Var3, i3, 2131625081, ov0Var3, false);
                            String str11 = strO;
                            if (syncSelection.getActive()) {
                                ov0Var3.c0(550203783);
                                j4 = ((kz) ov0Var3.j(mz.a)).s;
                            } else {
                                ov0Var3.c0(550203783);
                                j4 = ((kz) ov0Var3.j(mz.a)).s;
                            }
                            ov0Var3.p(false);
                            s83.b(str11, null, j4, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262138);
                            zH = ov0Var3.h(accountSyncManager);
                            objQ2 = ov0Var3.Q();
                            if (zH) {
                                objQ2 = new w12(0, accountSyncManager, AccountSyncManager.class, "refresh", "refresh()V", 0, 14);
                                ov0Var3.m0(objQ2);
                            } else {
                                objQ2 = new w12(0, accountSyncManager, AccountSyncManager.class, "refresh", "refresh()V", 0, 14);
                                ov0Var3.m0(objQ2);
                            }
                            au0 au0Var7 = (au0) ((o81) objQ2);
                            if (syncSelection.getActive()) {
                                z6 = true;
                            }
                            b52 b52Var3 = hu.a;
                            n51.h(au0Var7, null, z6, null, hu.e(0L, bk.g, ov0Var3, 13), null, null, n51.G, ov0Var3, 805306368, 490);
                            ov0Var3.p(true);
                        }
                    } else {
                        i2 = 550167971;
                        i = 2131625075;
                    }
                    strO = az2.h(ov0Var3, i2, i, ov0Var3, false);
                    String str12 = strO;
                    if (syncSelection.getActive()) {
                        ov0Var3.c0(550203783);
                        j4 = ((kz) ov0Var3.j(mz.a)).s;
                    } else {
                        ov0Var3.c0(550203783);
                        j4 = ((kz) ov0Var3.j(mz.a)).s;
                    }
                    ov0Var3.p(false);
                    s83.b(str12, null, j4, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262138);
                    zH = ov0Var3.h(accountSyncManager);
                    objQ2 = ov0Var3.Q();
                    if (zH) {
                        objQ2 = new w12(0, accountSyncManager, AccountSyncManager.class, "refresh", "refresh()V", 0, 14);
                        ov0Var3.m0(objQ2);
                    } else {
                        objQ2 = new w12(0, accountSyncManager, AccountSyncManager.class, "refresh", "refresh()V", 0, 14);
                        ov0Var3.m0(objQ2);
                    }
                    au0 au0Var8 = (au0) ((o81) objQ2);
                    if (syncSelection.getActive()) {
                        z6 = true;
                    }
                    b52 b52Var4 = hu.a;
                    n51.h(au0Var8, null, z6, null, hu.e(0L, bk.g, ov0Var3, 13), null, null, n51.G, ov0Var3, 805306368, 490);
                    ov0Var3.p(true);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ x60(CloudAccountState cloudAccountState, boolean z, SyncSelection syncSelection, CloudAccount cloudAccount, AccountSyncManager accountSyncManager, s03 s03Var) {
        this.f = cloudAccountState;
        this.g = z;
        this.h = syncSelection;
        this.i = cloudAccount;
        this.j = accountSyncManager;
        this.k = s03Var;
    }

    public /* synthetic */ x60(boolean z, au0 au0Var, AppInfoItem appInfoItem, List list, ey1 ey1Var, lu0 lu0Var) {
        this.g = z;
        this.f = au0Var;
        this.h = appInfoItem;
        this.i = list;
        this.j = ey1Var;
        this.k = lu0Var;
    }
}
