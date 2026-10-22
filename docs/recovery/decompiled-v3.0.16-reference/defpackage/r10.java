package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class r10 implements pu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ r10(int i) {
        this.e = i;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    s83.b(ke0.N(2131624158, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                }
                break;
            case 1:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    s83.b(ke0.N(2131624280, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                }
                break;
            case 2:
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ov0Var3.W();
                } else {
                    er1 er1VarC = ws.c(j9.j, false);
                    int iHashCode = Long.hashCode(ov0Var3.T);
                    l72 l72VarL = ov0Var3.l();
                    dv1 dv1VarH = xp1.H(ov0Var3, av1Var);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, v20.e, er1VarC);
                    q73.h(ov0Var3, v20.d, l72VarL);
                    q73.h(ov0Var3, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var3, v20.g);
                    q73.h(ov0Var3, v20.c, dv1VarH);
                    t01.a(hd0.B(), null, iw2.k(av1Var, 30.0f), bk.g, ov0Var3, 3504, 0);
                    ov0Var3.p(true);
                }
                break;
            case 3:
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (!ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ov0Var4.W();
                } else {
                    t01.a(hd0.B(), ke0.N(2131624693, ov0Var4), null, bk.g, ov0Var4, 3072, 4);
                }
                break;
            case 4:
                f30 f30Var5 = (f30) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ov0 ov0Var5 = (ov0) f30Var5;
                if (!ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ov0Var5.W();
                } else {
                    s83.b(ke0.N(2131624007, ov0Var5), null, 0L, v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262126);
                }
                break;
            case Logger.WARN /* 5 */:
                f30 f30Var6 = (f30) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ov0 ov0Var6 = (ov0) f30Var6;
                if (!ov0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ov0Var6.W();
                } else {
                    s83.b(ke0.N(2131624290, ov0Var6), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 0, 0, 262142);
                }
                break;
            case Logger.ERROR /* 6 */:
                f30 f30Var7 = (f30) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ov0 ov0Var7 = (ov0) f30Var7;
                if (!ov0Var7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ov0Var7.W();
                } else {
                    s83.b(ke0.N(2131624292, ov0Var7), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 0, 0, 262142);
                }
                break;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                f30 f30Var8 = (f30) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ov0 ov0Var8 = (ov0) f30Var8;
                if (!ov0Var8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ov0Var8.W();
                } else {
                    s83.b(ke0.N(2131624989, ov0Var8), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var8, 0, 0, 262142);
                }
                break;
            case 8:
                f30 f30Var9 = (f30) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ov0 ov0Var9 = (ov0) f30Var9;
                if (!ov0Var9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ov0Var9.W();
                } else {
                    s83.b(ke0.N(2131624853, ov0Var9), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 0, 0, 262142);
                }
                break;
            case mc0.b /* 9 */:
                f30 f30Var10 = (f30) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ov0 ov0Var10 = (ov0) f30Var10;
                if (!ov0Var10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ov0Var10.W();
                } else {
                    s83.b(ke0.N(2131624001, ov0Var10), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var10, 0, 0, 262142);
                }
                break;
            case mc0.c /* 10 */:
                f30 f30Var11 = (f30) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ov0 ov0Var11 = (ov0) f30Var11;
                if (!ov0Var11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ov0Var11.W();
                } else {
                    s83.b(ke0.N(2131624294, ov0Var11), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var11, 0, 0, 262142);
                }
                break;
            case 11:
                f30 f30Var12 = (f30) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ov0 ov0Var12 = (ov0) f30Var12;
                if (!ov0Var12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ov0Var12.W();
                } else {
                    s83.b(ke0.N(2131624305, ov0Var12), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var12, 0, 0, 262142);
                }
                break;
            case mc0.d /* 12 */:
                f30 f30Var13 = (f30) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ov0 ov0Var13 = (ov0) f30Var13;
                if (!ov0Var13.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ov0Var13.W();
                } else {
                    s83.b(ke0.N(2131624301, ov0Var13), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var13, 0, 0, 262142);
                }
                break;
            case 13:
                f30 f30Var14 = (f30) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ov0 ov0Var14 = (ov0) f30Var14;
                if (!ov0Var14.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ov0Var14.W();
                } else {
                    s83.b(ke0.N(2131624306, ov0Var14), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var14, 0, 0, 262142);
                }
                break;
            case 14:
                f30 f30Var15 = (f30) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ov0 ov0Var15 = (ov0) f30Var15;
                if (!ov0Var15.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ov0Var15.W();
                } else {
                    s83.b(ke0.N(2131624853, ov0Var15), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var15, 0, 0, 262142);
                }
                break;
            case a83.e /* 15 */:
                f30 f30Var16 = (f30) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ov0 ov0Var16 = (ov0) f30Var16;
                if (!ov0Var16.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ov0Var16.W();
                } else {
                    t01.a(ce0.v(), ke0.N(2131624402, ov0Var16), null, 0L, ov0Var16, 0, 12);
                }
                break;
            case 16:
                f30 f30Var17 = (f30) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ov0 ov0Var17 = (ov0) f30Var17;
                if (!ov0Var17.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ov0Var17.W();
                } else {
                    x01 x01VarB = k22.U;
                    if (x01VarB == null) {
                        w01 w01Var = new w01("Outlined.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = nh3.a;
                        qy2 qy2Var = new qy2(hz.b);
                        nx0 nx0Var = new nx0(3);
                        nx0Var.m(16.0f, 9.0f);
                        nx0Var.s(10.0f);
                        nx0Var.h(8.0f);
                        nx0Var.r(9.0f);
                        nx0Var.i(8.0f);
                        y62 y62Var = new y62(-1.5f, -6.0f);
                        ArrayList arrayList = nx0Var.a;
                        arrayList.add(y62Var);
                        nx0Var.i(-5.0f);
                        nx0Var.l(-1.0f, 1.0f);
                        nx0Var.h(5.0f);
                        nx0Var.s(2.0f);
                        nx0Var.i(14.0f);
                        nx0Var.r(4.0f);
                        nx0Var.i(-3.5f);
                        nx0Var.l(-1.0f, -1.0f);
                        nx0Var.e();
                        nx0Var.m(18.0f, 7.0f);
                        nx0Var.h(6.0f);
                        nx0Var.s(12.0f);
                        nx0Var.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        nx0Var.i(8.0f);
                        nx0Var.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        nx0Var.r(7.0f);
                        nx0Var.e();
                        w01.a(w01Var, arrayList, qy2Var);
                        x01VarB = w01Var.b();
                        k22.U = x01VarB;
                    }
                    t01.a(x01VarB, ke0.N(2131624379, ov0Var17), null, 0L, ov0Var17, 0, 12);
                }
                break;
            case 17:
                f30 f30Var18 = (f30) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ov0 ov0Var18 = (ov0) f30Var18;
                if (!ov0Var18.T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ov0Var18.W();
                } else {
                    s83.b(ke0.N(2131624132, ov0Var18), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var18, 0, 0, 262142);
                }
                break;
            case 18:
                f30 f30Var19 = (f30) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ov0 ov0Var19 = (ov0) f30Var19;
                if (!ov0Var19.T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ov0Var19.W();
                } else {
                    s83.b(ke0.N(2131624128, ov0Var19), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var19, 0, 0, 262142);
                }
                break;
            case 19:
                f30 f30Var20 = (f30) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ov0 ov0Var20 = (ov0) f30Var20;
                if (!ov0Var20.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ov0Var20.W();
                } else {
                    s83.b(ke0.N(2131624151, ov0Var20), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var20, 0, 0, 262142);
                }
                break;
            case 20:
                f30 f30Var21 = (f30) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                ov0 ov0Var21 = (ov0) f30Var21;
                if (!ov0Var21.T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ov0Var21.W();
                } else {
                    s83.b(ke0.N(2131624148, ov0Var21), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var21, 0, 0, 262142);
                }
                break;
            case 21:
                f30 f30Var22 = (f30) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                ov0 ov0Var22 = (ov0) f30Var22;
                if (!ov0Var22.T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ov0Var22.W();
                } else {
                    s83.b(ke0.N(2131624149, ov0Var22), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var22, 0, 0, 262142);
                }
                break;
            case 22:
                f30 f30Var23 = (f30) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                ov0 ov0Var23 = (ov0) f30Var23;
                if (!ov0Var23.T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ov0Var23.W();
                } else {
                    s83.b(ke0.N(2131624367, ov0Var23), null, ((kz) ov0Var23.j(mz.a)).q, v63.c(18), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var23, 1597440, 0, 262058);
                }
                break;
            case 23:
                f30 f30Var24 = (f30) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                ov0 ov0Var24 = (ov0) f30Var24;
                if (!ov0Var24.T(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ov0Var24.W();
                } else {
                    s83.b(ke0.N(2131624591, ov0Var24), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var24, 0, 0, 262142);
                }
                break;
            case 24:
                f30 f30Var25 = (f30) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                ov0 ov0Var25 = (ov0) f30Var25;
                if (!ov0Var25.T(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ov0Var25.W();
                } else {
                    s83.b(ke0.N(2131624575, ov0Var25), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var25, 0, 0, 262142);
                }
                break;
            case 25:
                f30 f30Var26 = (f30) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                ov0 ov0Var26 = (ov0) f30Var26;
                if (!ov0Var26.T(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    ov0Var26.W();
                } else {
                    s83.b(ke0.N(2131624476, ov0Var26), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var26, 0, 0, 262142);
                }
                break;
            case 26:
                f30 f30Var27 = (f30) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                ov0 ov0Var27 = (ov0) f30Var27;
                if (!ov0Var27.T(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ov0Var27.W();
                } else {
                    t01.a(k22.u(), ke0.N(2131624114, ov0Var27), iw2.k(av1Var, 20.0f), hz.c(0.6f, ((kz) ov0Var27.j(mz.a)).q), ov0Var27, 384, 0);
                }
                break;
            case 27:
                f30 f30Var28 = (f30) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                ov0 ov0Var28 = (ov0) f30Var28;
                if (!ov0Var28.T(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    ov0Var28.W();
                } else {
                    x01 x01VarB2 = am1.O;
                    if (x01VarB2 == null) {
                        w01 w01Var2 = new w01("Rounded.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = nh3.a;
                        qy2 qy2Var2 = new qy2(hz.b);
                        nx0 nx0VarI = p91.i(18.3f, 5.71f);
                        nx0VarI.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        nx0VarI.k(12.0f, 10.59f);
                        nx0VarI.k(7.11f, 5.7f);
                        nx0VarI.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        nx0VarI.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        nx0VarI.k(10.59f, 12.0f);
                        nx0VarI.k(5.7f, 16.89f);
                        nx0VarI.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                        nx0VarI.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        nx0VarI.k(12.0f, 13.41f);
                        nx0VarI.l(4.89f, 4.89f);
                        nx0VarI.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                        nx0VarI.g(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        nx0VarI.k(13.41f, 12.0f);
                        nx0VarI.l(4.89f, -4.89f);
                        nx0VarI.g(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
                        nx0VarI.e();
                        w01.a(w01Var2, nx0VarI.a, qy2Var2);
                        x01VarB2 = w01Var2.b();
                        am1.O = x01VarB2;
                    }
                    t01.a(x01VarB2, null, iw2.k(av1Var, 16.0f), hz.c(0.5f, ((kz) ov0Var28.j(mz.a)).q), ov0Var28, 432, 0);
                }
                break;
            case 28:
                f30 f30Var29 = (f30) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                ov0 ov0Var29 = (ov0) f30Var29;
                if (!ov0Var29.T(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    ov0Var29.W();
                } else {
                    s83.b(ke0.N(2131624300, ov0Var29), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var29, 0, 0, 262142);
                }
                break;
            default:
                f30 f30Var30 = (f30) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                ov0 ov0Var30 = (ov0) f30Var30;
                if (!ov0Var30.T(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    ov0Var30.W();
                } else {
                    s83.b(ke0.N(2131624679, ov0Var30), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var30, 0, 0, 262142);
                }
                break;
        }
        return mf3Var;
    }
}
