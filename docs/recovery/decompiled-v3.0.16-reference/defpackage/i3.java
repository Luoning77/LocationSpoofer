package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudCompanionDevice;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class i3 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ey1 f;

    public /* synthetic */ i3(ey1 ey1Var, int i) {
        this.e = i;
        this.f = ey1Var;
    }

    private final Object f(Object obj, Object obj2) {
        float f;
        boolean z;
        boolean z2;
        f30 f30Var = (f30) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            av1 av1Var = av1.a;
            dv1 dv1VarE = zm3.E(iw2.e(av1Var, 1.0f), 14.0f, 10.0f);
            kk2 kk2VarA = jk2.a(am1.e, j9.o, ov0Var, 48);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarE);
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
            x01 x01VarB = dh0.d;
            if (x01VarB != null) {
                f = 20.0f;
            } else {
                w01 w01Var = new w01("Rounded.Notes", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i = nh3.a;
                qy2 qy2Var = new qy2(hz.b);
                nx0 nx0Var = new nx0(3);
                nx0Var.m(20.0f, 11.0f);
                nx0Var.h(4.0f);
                nx0Var.g(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                nx0Var.o(0.45f, 1.0f, 1.0f, 1.0f);
                nx0Var.i(16.0f);
                nx0Var.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                nx0Var.o(-0.45f, -1.0f, -1.0f, -1.0f);
                nx0Var.e();
                nx0Var.m(4.0f, 18.0f);
                nx0Var.i(10.0f);
                nx0Var.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                nx0Var.o(-0.45f, -1.0f, -1.0f, -1.0f);
                nx0Var.h(4.0f);
                nx0Var.g(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                nx0Var.o(0.45f, 1.0f, 1.0f, 1.0f);
                nx0Var.e();
                f = 20.0f;
                nx0Var.m(20.0f, 6.0f);
                nx0Var.h(4.0f);
                nx0Var.g(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                nx0Var.s(0.01f);
                nx0Var.g(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                nx0Var.i(16.0f);
                nx0Var.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                nx0Var.r(7.0f);
                nx0Var.g(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                nx0Var.e();
                w01.a(w01Var, nx0Var.a, qy2Var);
                x01VarB = w01Var.b();
                dh0.d = x01VarB;
            }
            x01 x01Var = x01VarB;
            hh0 hh0Var = mz.a;
            t01.a(x01Var, null, iw2.k(zm3.G(av1Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), 18.0f), hz.c(0.5f, ((kz) ov0Var.j(hh0Var)).q), ov0Var, 432, 0);
            gh0.h(ov0Var, iw2.o(av1Var, 10.0f));
            ey1 ey1Var = this.f;
            String str = (String) ey1Var.getValue();
            q93 q93Var = new q93(((kz) ov0Var.j(hh0Var)).q, v63.c(14), jr0.g, 0L, 0L, 0, 0L, 16777208);
            wb1 wb1Var = new wb1(1.0f, true);
            boolean zF = ov0Var.f(ey1Var);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zF || objQ == c30Var) {
                objQ = new vu1(ey1Var, 4);
                ov0Var.m0(objQ);
            }
            xq.a(str, (lu0) objQ, wb1Var, false, q93Var, null, null, false, 3, 2, null, null, null, null, sb.a0(1198121178, new h5(ey1Var, 12), ov0Var), ov0Var, 805306368, 196614, 31192);
            if (((String) ey1Var.getValue()).length() > 0) {
                ov0Var.c0(-920206391);
                dv1 dv1VarK = xp1.k(xp1.n(iw2.k(av1Var, f), cj2.a), hz.c(0.1f, ((kz) ov0Var.j(hh0Var)).q), o51.p0);
                boolean zF2 = ov0Var.f(ey1Var);
                Object objQ2 = ov0Var.Q();
                if (zF2 || objQ2 == c30Var) {
                    objQ2 = new mo0(ey1Var, 23);
                    ov0Var.m0(objQ2);
                }
                dv1 dv1VarA = bk.a(dv1VarK, (au0) objQ2);
                er1 er1VarC = ws.c(j9.j, false);
                int iHashCode2 = Long.hashCode(ov0Var.T);
                l72 l72VarL2 = ov0Var.l();
                dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarA);
                ov0Var.g0();
                if (ov0Var.S) {
                    ov0Var.k(x30Var);
                } else {
                    ov0Var.p0();
                }
                q73.h(ov0Var, ghVar, er1VarC);
                q73.h(ov0Var, ghVar2, l72VarL2);
                az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
                q73.h(ov0Var, ghVar4, dv1VarH2);
                t01.a(k22.u(), null, iw2.k(av1Var, 12.0f), hz.c(0.6f, ((kz) ov0Var.j(hh0Var)).q), ov0Var, 432, 0);
                z2 = true;
                ov0Var.p(true);
                z = false;
            } else {
                z = false;
                z2 = true;
                ov0Var.c0(-945149115);
            }
            ov0Var.p(z);
            ov0Var.p(z2);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:129:0x05ce  */
    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        x01 x01VarB;
        float fMin;
        boolean z;
        int i = this.e;
        float fMin2 = 1.0f;
        av1 av1Var = av1.a;
        c30 c30Var = d30.a;
        int i2 = 2;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s83.b(ke0.N(((Boolean) ey1Var.getValue()).booleanValue() ? 2131624035 : 2131624044, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            case 1:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objQ = ov0Var2.Q();
                    if (objQ == c30Var) {
                        objQ = new s2(ey1Var, 3);
                        ov0Var2.m0(objQ);
                    }
                    xq1.l((au0) objQ, null, false, null, null, sb.a0(349801208, new i3(ey1Var, i2), ov0Var2), ov0Var2, 1572870, 62);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            case 2:
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (((Boolean) ey1Var.getValue()).booleanValue()) {
                        x01VarB = g93.a;
                        if (x01VarB == null) {
                            w01 w01Var = new w01("Rounded.VisibilityOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i3 = nh3.a;
                            qy2 qy2Var = new qy2(hz.b);
                            nx0 nx0VarI = p91.i(12.0f, 6.5f);
                            nx0VarI.g(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
                            nx0VarI.g(0.0f, 0.51f, -0.1f, 1.0f, -0.24f, 1.46f);
                            nx0VarI.l(3.06f, 3.06f);
                            nx0VarI.g(1.39f, -1.23f, 2.49f, -2.77f, 3.18f, -4.53f);
                            nx0VarI.f(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
                            nx0VarI.g(-1.27f, 0.0f, -2.49f, 0.2f, -3.64f, 0.57f);
                            nx0VarI.l(2.17f, 2.17f);
                            nx0VarI.g(0.47f, -0.14f, 0.96f, -0.24f, 1.47f, -0.24f);
                            nx0VarI.e();
                            nx0VarI.m(2.71f, 3.16f);
                            nx0VarI.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                            nx0VarI.l(1.97f, 1.97f);
                            nx0VarI.f(3.06f, 7.83f, 1.77f, 9.53f, 1.0f, 11.5f);
                            nx0VarI.f(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
                            nx0VarI.g(1.52f, 0.0f, 2.97f, -0.3f, 4.31f, -0.82f);
                            nx0VarI.l(2.72f, 2.72f);
                            nx0VarI.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                            nx0VarI.g(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                            nx0VarI.k(4.13f, 3.16f);
                            nx0VarI.g(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
                            nx0VarI.e();
                            nx0VarI.m(12.0f, 16.5f);
                            nx0VarI.g(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
                            nx0VarI.g(0.0f, -0.77f, 0.18f, -1.5f, 0.49f, -2.14f);
                            nx0VarI.l(1.57f, 1.57f);
                            nx0VarI.g(-0.03f, 0.18f, -0.06f, 0.37f, -0.06f, 0.57f);
                            nx0VarI.g(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                            nx0VarI.g(0.2f, 0.0f, 0.38f, -0.03f, 0.57f, -0.07f);
                            nx0VarI.k(14.14f, 16.0f);
                            nx0VarI.g(-0.65f, 0.32f, -1.37f, 0.5f, -2.14f, 0.5f);
                            nx0VarI.e();
                            nx0VarI.m(14.97f, 11.17f);
                            nx0VarI.g(-0.15f, -1.4f, -1.25f, -2.49f, -2.64f, -2.64f);
                            nx0VarI.l(2.64f, 2.64f);
                            nx0VarI.e();
                            w01.a(w01Var, nx0VarI.a, qy2Var);
                            x01VarB = w01Var.b();
                            g93.a = x01VarB;
                        }
                    } else {
                        x01VarB = v83.a;
                        if (x01VarB == null) {
                            w01 w01Var2 = new w01("Rounded.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i4 = nh3.a;
                            qy2 qy2Var2 = new qy2(hz.b);
                            nx0 nx0VarI2 = p91.i(12.0f, 4.0f);
                            nx0VarI2.f(7.0f, 4.0f, 2.73f, 7.11f, 1.0f, 11.5f);
                            nx0VarI2.f(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
                            nx0VarI2.o(9.27f, -3.11f, 11.0f, -7.5f);
                            nx0VarI2.f(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
                            nx0VarI2.e();
                            nx0VarI2.m(12.0f, 16.5f);
                            nx0VarI2.g(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
                            nx0VarI2.o(2.24f, -5.0f, 5.0f, -5.0f);
                            nx0VarI2.o(5.0f, 2.24f, 5.0f, 5.0f);
                            nx0VarI2.o(-2.24f, 5.0f, -5.0f, 5.0f);
                            nx0VarI2.e();
                            nx0VarI2.m(12.0f, 8.5f);
                            nx0VarI2.g(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                            nx0VarI2.o(1.34f, 3.0f, 3.0f, 3.0f);
                            nx0VarI2.o(3.0f, -1.34f, 3.0f, -3.0f);
                            nx0VarI2.o(-1.34f, -3.0f, -3.0f, -3.0f);
                            nx0VarI2.e();
                            w01.a(w01Var2, nx0VarI2.a, qy2Var2);
                            x01VarB = w01Var2.b();
                            v83.a = x01VarB;
                        }
                    }
                    t01.a(x01VarB, ke0.N(((Boolean) ey1Var.getValue()).booleanValue() ? 2131623974 : 2131623991, ov0Var3), null, 0L, ov0Var3, 0, 12);
                } else {
                    ov0Var3.W();
                }
                return mf3Var;
            case 3:
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objQ2 = ov0Var4.Q();
                    if (objQ2 == c30Var) {
                        objQ2 = new s2(ey1Var, 7);
                        ov0Var4.m0(objQ2);
                    }
                    n51.j((au0) objQ2, null, false, null, null, null, o51.F, ov0Var4, 805306374, 510);
                } else {
                    ov0Var4.W();
                }
                return mf3Var;
            case 4:
                f30 f30Var5 = (f30) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ov0 ov0Var5 = (ov0) f30Var5;
                if (ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Object objQ3 = ov0Var5.Q();
                    if (objQ3 == c30Var) {
                        objQ3 = new s2(ey1Var, 12);
                        ov0Var5.m0(objQ3);
                    }
                    n51.j((au0) objQ3, null, false, null, null, null, o51.Q, ov0Var5, 805306374, 510);
                } else {
                    ov0Var5.W();
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                f30 f30Var6 = (f30) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ov0 ov0Var6 = (ov0) f30Var6;
                if (ov0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    yz yzVarA = wz.a(new jo(12.0f, true, new fo(0)), j9.r, ov0Var6, 6);
                    int iHashCode = Long.hashCode(ov0Var6.T);
                    l72 l72VarL = ov0Var6.l();
                    dv1 dv1VarH = xp1.H(ov0Var6, av1Var);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var6.g0();
                    if (ov0Var6.S) {
                        ov0Var6.k(x30Var);
                    } else {
                        ov0Var6.p0();
                    }
                    q73.h(ov0Var6, v20.e, yzVarA);
                    q73.h(ov0Var6, v20.d, l72VarL);
                    q73.h(ov0Var6, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var6, v20.g);
                    q73.h(ov0Var6, v20.c, dv1VarH);
                    s83.b(ke0.N(2131624200, ov0Var6), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 0, 0, 262142);
                    mc0.g(null, sb.a0(1105554002, new i3(ey1Var, 7), ov0Var6), ov0Var6, 48);
                    ov0Var6.p(true);
                } else {
                    ov0Var6.W();
                }
                return mf3Var;
            case Logger.ERROR /* 6 */:
                f30 f30Var7 = (f30) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ov0 ov0Var7 = (ov0) f30Var7;
                if (ov0Var7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Object objQ4 = ov0Var7.Q();
                    if (objQ4 == c30Var) {
                        objQ4 = new s2(ey1Var, 11);
                        ov0Var7.m0(objQ4);
                    }
                    n51.j((au0) objQ4, null, false, null, null, null, o51.B, ov0Var7, 805306374, 510);
                } else {
                    ov0Var7.W();
                }
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                f30 f30Var8 = (f30) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ov0 ov0Var8 = (ov0) f30Var8;
                if (ov0Var8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    s83.b((String) ey1Var.getValue(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var8, 0, 0, 262142);
                } else {
                    ov0Var8.W();
                }
                return mf3Var;
            case 8:
                f30 f30Var9 = (f30) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ov0 ov0Var9 = (ov0) f30Var9;
                if (ov0Var9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    yz yzVarA2 = wz.a(new jo(12.0f, true, new fo(0)), j9.r, ov0Var9, 6);
                    int iHashCode2 = Long.hashCode(ov0Var9.T);
                    l72 l72VarL2 = ov0Var9.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var9, av1Var);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var9.g0();
                    if (ov0Var9.S) {
                        ov0Var9.k(x30Var2);
                    } else {
                        ov0Var9.p0();
                    }
                    q73.h(ov0Var9, v20.e, yzVarA2);
                    q73.h(ov0Var9, v20.d, l72VarL2);
                    q73.h(ov0Var9, v20.f, Integer.valueOf(iHashCode2));
                    q73.g(ov0Var9, v20.g);
                    q73.h(ov0Var9, v20.c, dv1VarH2);
                    s83.b(ke0.N(2131624199, ov0Var9), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 0, 0, 262142);
                    String str = (String) ey1Var.getValue();
                    j62 j62Var = new j62();
                    Object objQ5 = ov0Var9.Q();
                    if (objQ5 == c30Var) {
                        objQ5 = new f4(ey1Var, 1);
                        ov0Var9.m0(objQ5);
                    }
                    ee0.i(str, (lu0) objQ5, null, false, null, o51.K, null, null, null, null, false, j62Var, null, null, true, 0, 0, null, null, ov0Var9, 1572912, 12582912, 8241084);
                    ov0Var9.p(true);
                } else {
                    ov0Var9.W();
                }
                return mf3Var;
            case mc0.b /* 9 */:
                f30 f30Var10 = (f30) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ov0 ov0Var10 = (ov0) f30Var10;
                if (ov0Var10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    Object objQ6 = ov0Var10.Q();
                    if (objQ6 == c30Var) {
                        objQ6 = new s2(ey1Var, 10);
                        ov0Var10.m0(objQ6);
                    }
                    n51.j((au0) objQ6, null, false, null, null, null, o51.M, ov0Var10, 805306374, 510);
                } else {
                    ov0Var10.W();
                }
                return mf3Var;
            case mc0.c /* 10 */:
                l41 l41Var = (l41) obj;
                l41 l41Var2 = (l41) obj2;
                int i5 = l41Var2.a;
                int i6 = l41Var2.d;
                int i7 = l41Var2.c;
                int i8 = l41Var2.b;
                int i9 = l41Var.c;
                int i10 = l41Var.b;
                int i11 = l41Var.d;
                int i12 = l41Var.a;
                if (i5 >= i9) {
                    fMin = 0.0f;
                } else if (i7 <= i12) {
                    fMin = 1.0f;
                } else if (l41Var2.d() == 0) {
                    fMin = 0.0f;
                } else {
                    fMin = (((Math.min(l41Var.c, i7) + Math.max(i12, i5)) / 2) - i5) / l41Var2.d();
                }
                if (i8 >= i11) {
                    fMin2 = 0.0f;
                } else if (i6 > i10) {
                    if (l41Var2.b() == 0) {
                        fMin2 = 0.0f;
                    } else {
                        fMin2 = (((Math.min(i11, i6) + Math.max(i10, i8)) / 2) - i8) / l41Var2.b();
                    }
                }
                ey1Var.setValue(new ac3(x63.a(fMin, fMin2)));
                return mf3Var;
            case 11:
                f30 f30Var11 = (f30) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ov0 ov0Var11 = (ov0) f30Var11;
                if (ov0Var11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    CloudCompanionDevice cloudCompanionDevice = (CloudCompanionDevice) ey1Var.getValue();
                    cloudCompanionDevice.getClass();
                    s83.b(ke0.O(2131624152, new Object[]{cloudCompanionDevice.getDeviceName()}, ov0Var11), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var11, 0, 0, 262142);
                } else {
                    ov0Var11.W();
                }
                return mf3Var;
            case mc0.d /* 12 */:
                f30 f30Var12 = (f30) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ov0 ov0Var12 = (ov0) f30Var12;
                if (ov0Var12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    Object objQ7 = ov0Var12.Q();
                    if (objQ7 == c30Var) {
                        objQ7 = new mo0(ey1Var, 11);
                        ov0Var12.m0(objQ7);
                    }
                    n51.j((au0) objQ7, null, false, null, null, null, n51.v, ov0Var12, 805306374, 510);
                } else {
                    ov0Var12.W();
                }
                return mf3Var;
            case 13:
                f30 f30Var13 = (f30) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ov0 ov0Var13 = (ov0) f30Var13;
                if (ov0Var13.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    boolean zF = ov0Var13.f(ey1Var);
                    Object objQ8 = ov0Var13.Q();
                    if (zF || objQ8 == c30Var) {
                        objQ8 = new mo0(ey1Var, 20);
                        ov0Var13.m0(objQ8);
                    }
                    n51.j((au0) objQ8, null, false, null, null, null, xq1.s, ov0Var13, 805306368, 510);
                } else {
                    ov0Var13.W();
                }
                return mf3Var;
            case 14:
                f30 f30Var14 = (f30) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ov0 ov0Var14 = (ov0) f30Var14;
                if (ov0Var14.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    dv1 dv1VarE = zm3.E(iw2.e(av1Var, 1.0f), 14.0f, 10.0f);
                    kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var14, 48);
                    int iHashCode3 = Long.hashCode(ov0Var14.T);
                    l72 l72VarL3 = ov0Var14.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var14, dv1VarE);
                    w20.b.getClass();
                    x30 x30Var3 = v20.b;
                    ov0Var14.g0();
                    if (ov0Var14.S) {
                        ov0Var14.k(x30Var3);
                    } else {
                        ov0Var14.p0();
                    }
                    gh ghVar = v20.e;
                    q73.h(ov0Var14, ghVar, kk2VarA);
                    gh ghVar2 = v20.d;
                    q73.h(ov0Var14, ghVar2, l72VarL3);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    gh ghVar3 = v20.f;
                    q73.h(ov0Var14, ghVar3, numValueOf);
                    wa waVar = v20.g;
                    q73.g(ov0Var14, waVar);
                    gh ghVar4 = v20.c;
                    q73.h(ov0Var14, ghVar4, dv1VarH3);
                    t01.a(ee0.z(), null, iw2.k(av1Var, 18.0f), bk.g, ov0Var14, 3504, 0);
                    gh0.h(ov0Var14, iw2.o(av1Var, 10.0f));
                    String str2 = (String) ey1Var.getValue();
                    long jC = v63.c(14);
                    hh0 hh0Var = mz.a;
                    q93 q93Var = new q93(((kz) ov0Var14.j(hh0Var)).q, jC, jr0.h, 0L, 0L, 0, 0L, 16777208);
                    wb1 wb1Var = new wb1(1.0f, true);
                    boolean zF2 = ov0Var14.f(ey1Var);
                    Object objQ9 = ov0Var14.Q();
                    if (zF2 || objQ9 == c30Var) {
                        objQ9 = new vu1(ey1Var, 3);
                        ov0Var14.m0(objQ9);
                    }
                    xq.a(str2, (lu0) objQ9, wb1Var, false, q93Var, null, null, true, 0, 0, null, null, null, null, sb.a0(1628467451, new h5(ey1Var, 11), ov0Var14), ov0Var14, 100663296, 196608, 32472);
                    if (((String) ey1Var.getValue()).length() > 0) {
                        ov0Var14.c0(-951927611);
                        dv1 dv1VarK = xp1.k(xp1.n(iw2.k(av1Var, 20.0f), cj2.a), hz.c(0.1f, ((kz) ov0Var14.j(hh0Var)).q), o51.p0);
                        boolean zF3 = ov0Var14.f(ey1Var);
                        Object objQ10 = ov0Var14.Q();
                        if (zF3 || objQ10 == c30Var) {
                            objQ10 = new mo0(ey1Var, 22);
                            ov0Var14.m0(objQ10);
                        }
                        dv1 dv1VarA = bk.a(dv1VarK, (au0) objQ10);
                        er1 er1VarC = ws.c(j9.j, false);
                        int iHashCode4 = Long.hashCode(ov0Var14.T);
                        l72 l72VarL4 = ov0Var14.l();
                        dv1 dv1VarH4 = xp1.H(ov0Var14, dv1VarA);
                        ov0Var14.g0();
                        if (ov0Var14.S) {
                            ov0Var14.k(x30Var3);
                        } else {
                            ov0Var14.p0();
                        }
                        q73.h(ov0Var14, ghVar, er1VarC);
                        q73.h(ov0Var14, ghVar2, l72VarL4);
                        az2.s(iHashCode4, ov0Var14, ghVar3, ov0Var14, waVar);
                        q73.h(ov0Var14, ghVar4, dv1VarH4);
                        t01.a(k22.u(), null, iw2.k(av1Var, 12.0f), hz.c(0.6f, ((kz) ov0Var14.j(hh0Var)).q), ov0Var14, 432, 0);
                        ov0Var14.p(true);
                        z = false;
                    } else {
                        z = false;
                        ov0Var14.c0(-973548220);
                    }
                    ov0Var14.p(z);
                    ov0Var14.p(true);
                } else {
                    ov0Var14.W();
                }
                return mf3Var;
            case a83.e /* 15 */:
                return f(obj, obj2);
            case 16:
                f30 f30Var15 = (f30) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ov0 ov0Var15 = (ov0) f30Var15;
                if (ov0Var15.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    dv1 dv1VarE2 = zm3.E(av1Var, 10.0f, 6.0f);
                    yz yzVarA3 = wz.a(am1.g, j9.r, ov0Var15, 0);
                    int iHashCode5 = Long.hashCode(ov0Var15.T);
                    l72 l72VarL5 = ov0Var15.l();
                    dv1 dv1VarH5 = xp1.H(ov0Var15, dv1VarE2);
                    w20.b.getClass();
                    x30 x30Var4 = v20.b;
                    ov0Var15.g0();
                    if (ov0Var15.S) {
                        ov0Var15.k(x30Var4);
                    } else {
                        ov0Var15.p0();
                    }
                    q73.h(ov0Var15, v20.e, yzVarA3);
                    q73.h(ov0Var15, v20.d, l72VarL5);
                    q73.h(ov0Var15, v20.f, Integer.valueOf(iHashCode5));
                    q73.g(ov0Var15, v20.g);
                    q73.h(ov0Var15, v20.c, dv1VarH5);
                    String strN = ke0.N(2131624575, ov0Var15);
                    long jB = v63.b(10.5d);
                    jr0 jr0Var = jr0.h;
                    hh0 hh0Var2 = mz.a;
                    s83.b(strN, null, hz.c(0.55f, ((kz) ov0Var15.j(hh0Var2)).q), jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var15, 1597440, 0, 262058);
                    String str3 = (String) ey1Var.getValue();
                    q93 q93Var2 = new q93(((kz) ov0Var15.j(hh0Var2)).q, v63.b(13.5d), jr0.i, 0L, 0L, 0, 0L, 16777208);
                    n91 n91Var = new n91(3, 0, 123);
                    boolean zF4 = ov0Var15.f(ey1Var);
                    Object objQ11 = ov0Var15.Q();
                    if (zF4 || objQ11 == c30Var) {
                        objQ11 = new di0(ey1Var, 25);
                        ov0Var15.m0(objQ11);
                    }
                    xq.a(str3, (lu0) objQ11, null, false, q93Var2, n91Var, null, true, 0, 0, null, null, null, null, null, ov0Var15, 102236160, 0, 65180);
                    ov0Var15.p(true);
                } else {
                    ov0Var15.W();
                }
                return mf3Var;
            case 17:
                f30 f30Var16 = (f30) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ov0 ov0Var16 = (ov0) f30Var16;
                if (ov0Var16.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    dv1 dv1VarE3 = zm3.E(av1Var, 10.0f, 6.0f);
                    yz yzVarA4 = wz.a(am1.g, j9.r, ov0Var16, 0);
                    int iHashCode6 = Long.hashCode(ov0Var16.T);
                    l72 l72VarL6 = ov0Var16.l();
                    dv1 dv1VarH6 = xp1.H(ov0Var16, dv1VarE3);
                    w20.b.getClass();
                    x30 x30Var5 = v20.b;
                    ov0Var16.g0();
                    if (ov0Var16.S) {
                        ov0Var16.k(x30Var5);
                    } else {
                        ov0Var16.p0();
                    }
                    q73.h(ov0Var16, v20.e, yzVarA4);
                    q73.h(ov0Var16, v20.d, l72VarL6);
                    q73.h(ov0Var16, v20.f, Integer.valueOf(iHashCode6));
                    q73.g(ov0Var16, v20.g);
                    q73.h(ov0Var16, v20.c, dv1VarH6);
                    String strN2 = ke0.N(2131624591, ov0Var16);
                    long jB2 = v63.b(10.5d);
                    jr0 jr0Var2 = jr0.h;
                    hh0 hh0Var3 = mz.a;
                    s83.b(strN2, null, hz.c(0.55f, ((kz) ov0Var16.j(hh0Var3)).q), jB2, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var16, 1597440, 0, 262058);
                    String str4 = (String) ey1Var.getValue();
                    q93 q93Var3 = new q93(((kz) ov0Var16.j(hh0Var3)).q, v63.b(13.5d), jr0.i, 0L, 0L, 0, 0L, 16777208);
                    n91 n91Var2 = new n91(3, 0, 123);
                    boolean zF5 = ov0Var16.f(ey1Var);
                    Object objQ12 = ov0Var16.Q();
                    if (zF5 || objQ12 == c30Var) {
                        objQ12 = new di0(ey1Var, 27);
                        ov0Var16.m0(objQ12);
                    }
                    xq.a(str4, (lu0) objQ12, null, false, q93Var3, n91Var2, null, true, 0, 0, null, null, null, null, null, ov0Var16, 102236160, 0, 65180);
                    ov0Var16.p(true);
                } else {
                    ov0Var16.W();
                }
                return mf3Var;
            case 18:
                f30 f30Var17 = (f30) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ov0 ov0Var17 = (ov0) f30Var17;
                if (ov0Var17.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    Object objQ13 = ov0Var17.Q();
                    if (objQ13 == c30Var) {
                        objQ13 = new mo0(ey1Var, 26);
                        ov0Var17.m0(objQ13);
                    }
                    n51.j((au0) objQ13, null, false, null, null, null, da0.z, ov0Var17, 805306374, 510);
                } else {
                    ov0Var17.W();
                }
                return mf3Var;
            default:
                double dDoubleValue = ((Double) obj).doubleValue();
                double dDoubleValue2 = ((Double) obj2).doubleValue();
                lr2 lr2Var = (lr2) ey1Var.getValue();
                if (lr2Var != null) {
                    lr2Var.d(dDoubleValue, dDoubleValue2, Float.valueOf(16.5f));
                }
                return mf3Var;
        }
    }
}
