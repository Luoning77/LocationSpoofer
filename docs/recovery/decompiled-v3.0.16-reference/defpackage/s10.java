package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class s10 implements qu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ s10(int i) {
        this.e = i;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        f30 f30Var = (f30) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((lk2) obj).getClass();
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            s83.b(ke0.N(2131624937, ov0Var), null, 0L, v63.b(13.5d), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262062);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        f30 f30Var = (f30) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((lk2) obj).getClass();
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            s83.b(ke0.N(2131624938, ov0Var), null, 0L, v63.b(13.5d), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262062);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    s83.b(ke0.N(2131624697, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            case 1:
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    t01.a(hd0.E(), null, iw2.k(av1Var, 20.0f), 0L, ov0Var2, 432, 8);
                    s83.b(az2.i(av1Var, 8.0f, ov0Var2, 2131625061, ov0Var2), null, 0L, v63.c(15), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262062);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            case 2:
                pu0 pu0Var = (pu0) obj;
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((ov0) f30Var3).h(pu0Var) ? 4 : 2;
                }
                ov0 ov0Var3 = (ov0) f30Var3;
                if (ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    pu0Var.invoke(ov0Var3, Integer.valueOf(iIntValue3 & 14));
                } else {
                    ov0Var3.W();
                }
                return mf3Var;
            case 3:
                f30 f30Var4 = (f30) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    s83.b(ke0.N(2131624289, ov0Var4), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 0, 0, 262142);
                } else {
                    ov0Var4.W();
                }
                return mf3Var;
            case 4:
                f30 f30Var5 = (f30) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var5 = (ov0) f30Var5;
                if (ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    s83.b(ke0.N(2131624310, ov0Var5), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 0, 0, 262142);
                } else {
                    ov0Var5.W();
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                f30 f30Var6 = (f30) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var6 = (ov0) f30Var6;
                if (ov0Var6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    s83.b(ke0.N(2131624295, ov0Var6), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 0, 0, 262142);
                } else {
                    ov0Var6.W();
                }
                return mf3Var;
            case Logger.ERROR /* 6 */:
                f30 f30Var7 = (f30) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var7 = (ov0) f30Var7;
                if (ov0Var7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    s83.b(ke0.N(2131624302, ov0Var7), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 0, 0, 262142);
                } else {
                    ov0Var7.W();
                }
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                f30 f30Var8 = (f30) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var8 = (ov0) f30Var8;
                if (ov0Var8.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    s83.b(ke0.N(2131624304, ov0Var8), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var8, 0, 0, 262142);
                } else {
                    ov0Var8.W();
                }
                return mf3Var;
            case 8:
                f30 f30Var9 = (f30) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var9 = (ov0) f30Var9;
                if (ov0Var9.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    s83.b(ke0.N(2131624289, ov0Var9), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 0, 0, 262142);
                } else {
                    ov0Var9.W();
                }
                return mf3Var;
            case mc0.b /* 9 */:
                f30 f30Var10 = (f30) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var10 = (ov0) f30Var10;
                if (ov0Var10.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    s83.b(ke0.N(2131624128, ov0Var10), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var10, 0, 0, 262142);
                } else {
                    ov0Var10.W();
                }
                return mf3Var;
            case mc0.c /* 10 */:
                f30 f30Var11 = (f30) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var11 = (ov0) f30Var11;
                if (ov0Var11.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    s83.b(ke0.N(2131624085, ov0Var11), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var11, 0, 0, 262142);
                } else {
                    ov0Var11.W();
                }
                return mf3Var;
            case 11:
                f30 f30Var12 = (f30) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var12 = (ov0) f30Var12;
                if (ov0Var12.T(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    s83.b(ke0.N(2131624151, ov0Var12), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var12, 0, 0, 262142);
                } else {
                    ov0Var12.W();
                }
                return mf3Var;
            case mc0.d /* 12 */:
                f30 f30Var13 = (f30) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var13 = (ov0) f30Var13;
                if (ov0Var13.T(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    s83.b(ke0.N(2131624085, ov0Var13), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var13, 0, 0, 262142);
                } else {
                    ov0Var13.W();
                }
                return mf3Var;
            case 13:
                f30 f30Var14 = (f30) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var14 = (ov0) f30Var14;
                if (ov0Var14.T(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    s83.b(ke0.N(2131624148, ov0Var14), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var14, 0, 0, 262142);
                } else {
                    ov0Var14.W();
                }
                return mf3Var;
            case 14:
                f30 f30Var15 = (f30) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var15 = (ov0) f30Var15;
                if (ov0Var15.T(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    s83.b(ke0.N(2131624085, ov0Var15), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var15, 0, 0, 262142);
                } else {
                    ov0Var15.W();
                }
                return mf3Var;
            case a83.e /* 15 */:
                f30 f30Var16 = (f30) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var16 = (ov0) f30Var16;
                if (ov0Var16.T(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    s83.b(ke0.N(2131624146, ov0Var16), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var16, 0, 0, 262142);
                } else {
                    ov0Var16.W();
                }
                return mf3Var;
            case 16:
                f30 f30Var17 = (f30) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var17 = (ov0) f30Var17;
                if (ov0Var17.T(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    s83.b(ke0.N(2131624148, ov0Var17), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var17, 0, 0, 262142);
                } else {
                    ov0Var17.W();
                }
                return mf3Var;
            case 17:
                f30 f30Var18 = (f30) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var18 = (ov0) f30Var18;
                if (ov0Var18.T(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    s83.b(ke0.N(2131624151, ov0Var18), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var18, 0, 0, 262142);
                } else {
                    ov0Var18.W();
                }
                return mf3Var;
            case 18:
                f30 f30Var19 = (f30) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var19 = (ov0) f30Var19;
                if (ov0Var19.T(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    s83.b(ke0.N(2131624249, ov0Var19), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var19, 0, 0, 262142);
                } else {
                    ov0Var19.W();
                }
                return mf3Var;
            case 19:
                k60 k60Var = (k60) obj;
                f30 f30Var20 = (f30) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= ((ov0) f30Var20).f(k60Var) ? 4 : 2;
                }
                ov0 ov0Var20 = (ov0) f30Var20;
                if (ov0Var20.T(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    ws.a(xp1.k(iw2.g(iw2.e(zm3.F(av1Var, 0.0f, m60.g, 1), 1.0f), m60.f), k60Var.c, o51.p0), ov0Var20, 0);
                } else {
                    ov0Var20.W();
                }
                return mf3Var;
            case 20:
                f30 f30Var21 = (f30) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var21 = (ov0) f30Var21;
                if (ov0Var21.T(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    x01 x01VarV = ce0.v();
                    dv1 dv1VarK = iw2.k(av1Var, 15.0f);
                    long j = bk.g;
                    t01.a(x01VarV, null, dv1VarK, j, ov0Var21, 3504, 0);
                    s83.b(az2.i(av1Var, 4.0f, ov0Var21, 2131624364, ov0Var21), null, j, v63.c(13), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var21, 24960, 0, 262122);
                } else {
                    ov0Var21.W();
                }
                return mf3Var;
            case 21:
                f30 f30Var22 = (f30) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var22 = (ov0) f30Var22;
                if (ov0Var22.T(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    x01 x01VarB = ee0.f;
                    if (x01VarB == null) {
                        w01 w01Var = new w01("Rounded.StarBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = nh3.a;
                        qy2 qy2Var = new qy2(hz.b);
                        nx0 nx0Var = new nx0(3);
                        nx0Var.m(19.65f, 9.04f);
                        nx0Var.l(-4.84f, -0.42f);
                        nx0Var.l(-1.89f, -4.45f);
                        nx0Var.g(-0.34f, -0.81f, -1.5f, -0.81f, -1.84f, 0.0f);
                        nx0Var.k(9.19f, 8.63f);
                        nx0Var.l(-4.83f, 0.41f);
                        nx0Var.g(-0.88f, 0.07f, -1.24f, 1.17f, -0.57f, 1.75f);
                        nx0Var.l(3.67f, 3.18f);
                        nx0Var.l(-1.1f, 4.72f);
                        nx0Var.g(-0.2f, 0.86f, 0.73f, 1.54f, 1.49f, 1.08f);
                        nx0Var.l(4.15f, -2.5f);
                        nx0Var.l(4.15f, 2.51f);
                        nx0Var.g(0.76f, 0.46f, 1.69f, -0.22f, 1.49f, -1.08f);
                        nx0Var.l(-1.1f, -4.73f);
                        nx0Var.l(3.67f, -3.18f);
                        nx0Var.g(0.67f, -0.58f, 0.32f, -1.68f, -0.56f, -1.75f);
                        nx0Var.e();
                        nx0Var.m(12.0f, 15.4f);
                        nx0Var.l(-3.76f, 2.27f);
                        nx0Var.l(1.0f, -4.28f);
                        nx0Var.l(-3.32f, -2.88f);
                        nx0Var.l(4.38f, -0.38f);
                        nx0Var.k(12.0f, 6.1f);
                        nx0Var.l(1.71f, 4.04f);
                        nx0Var.l(4.38f, 0.38f);
                        nx0Var.l(-3.32f, 2.88f);
                        nx0Var.l(1.0f, 4.28f);
                        nx0Var.k(12.0f, 15.4f);
                        nx0Var.e();
                        w01.a(w01Var, nx0Var.a, qy2Var);
                        x01VarB = w01Var.b();
                        ee0.f = x01VarB;
                    }
                    x01 x01Var = x01VarB;
                    dv1 dv1VarK2 = iw2.k(av1Var, 16.0f);
                    long j2 = bk.g;
                    t01.a(x01Var, null, dv1VarK2, j2, ov0Var22, 3504, 0);
                    s83.b(az2.i(av1Var, 4.0f, ov0Var22, 2131624936, ov0Var22), null, j2, v63.c(13), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var22, 24960, 0, 262122);
                } else {
                    ov0Var22.W();
                }
                return mf3Var;
            case 22:
                f30 f30Var23 = (f30) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var23 = (ov0) f30Var23;
                if (ov0Var23.T(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    s83.b(ke0.N(2131624023, ov0Var23), null, 0L, v63.c(14), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var23, 1597440, 0, 262062);
                } else {
                    ov0Var23.W();
                }
                return mf3Var;
            case 23:
                f30 f30Var24 = (f30) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var24 = (ov0) f30Var24;
                if (ov0Var24.T(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    s83.b(ke0.N(2131624343, ov0Var24), null, bk.g, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var24, 384, 0, 262138);
                } else {
                    ov0Var24.W();
                }
                return mf3Var;
            case 24:
                f30 f30Var25 = (f30) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var25 = (ov0) f30Var25;
                if (ov0Var25.T(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var25, 48);
                    int iHashCode = Long.hashCode(ov0Var25.T);
                    l72 l72VarL = ov0Var25.l();
                    dv1 dv1VarH = xp1.H(ov0Var25, av1Var);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var25.g0();
                    if (ov0Var25.S) {
                        ov0Var25.k(x30Var);
                    } else {
                        ov0Var25.p0();
                    }
                    gh ghVar = v20.e;
                    q73.h(ov0Var25, ghVar, kk2VarA);
                    gh ghVar2 = v20.d;
                    q73.h(ov0Var25, ghVar2, l72VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    gh ghVar3 = v20.f;
                    q73.h(ov0Var25, ghVar3, numValueOf);
                    wa waVar = v20.g;
                    q73.g(ov0Var25, waVar);
                    gh ghVar4 = v20.c;
                    q73.h(ov0Var25, ghVar4, dv1VarH);
                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 40.0f), cj2.a(13.0f));
                    hh0 hh0Var = mz.a;
                    dv1 dv1VarK3 = xp1.k(dv1VarN, hz.c(0.12f, ((kz) ov0Var25.j(hh0Var)).w), o51.p0);
                    er1 er1VarC = ws.c(j9.j, false);
                    int iHashCode2 = Long.hashCode(ov0Var25.T);
                    l72 l72VarL2 = ov0Var25.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var25, dv1VarK3);
                    ov0Var25.g0();
                    if (ov0Var25.S) {
                        ov0Var25.k(x30Var);
                    } else {
                        ov0Var25.p0();
                    }
                    q73.h(ov0Var25, ghVar, er1VarC);
                    q73.h(ov0Var25, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var25, ghVar3, ov0Var25, waVar);
                    q73.h(ov0Var25, ghVar4, dv1VarH2);
                    t01.a(ld0.u(), null, iw2.k(av1Var, 20.0f), ((kz) ov0Var25.j(hh0Var)).w, ov0Var25, 432, 0);
                    az2.t(ov0Var25, true, av1Var, 12.0f, ov0Var25);
                    yz yzVarA = wz.a(am1.g, j9.r, ov0Var25, 0);
                    int iHashCode3 = Long.hashCode(ov0Var25.T);
                    l72 l72VarL3 = ov0Var25.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var25, av1Var);
                    ov0Var25.g0();
                    if (ov0Var25.S) {
                        ov0Var25.k(x30Var);
                    } else {
                        ov0Var25.p0();
                    }
                    q73.h(ov0Var25, ghVar, yzVarA);
                    q73.h(ov0Var25, ghVar2, l72VarL3);
                    az2.s(iHashCode3, ov0Var25, ghVar3, ov0Var25, waVar);
                    q73.h(ov0Var25, ghVar4, dv1VarH3);
                    s83.b(ke0.N(2131624882, ov0Var25), null, ((kz) ov0Var25.j(hh0Var)).q, v63.b(15.5d), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var25, 1597440, 0, 262058);
                    s83.b(ke0.N(2131624881, ov0Var25), null, hz.c(0.5f, ((kz) ov0Var25.j(hh0Var)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var25, 24576, 0, 262122);
                    ov0Var25.p(true);
                    ov0Var25.p(true);
                    gh0.h(ov0Var25, iw2.g(av1Var, 10.0f));
                    s83.b(ke0.N(2131624373, ov0Var25), null, hz.c(0.75f, ((kz) ov0Var25.j(hh0Var)).q), v63.b(12.5d), null, null, 0L, null, null, v63.c(18), 0, false, 0, 0, null, ov0Var25, 24576, 48, 260074);
                } else {
                    ov0Var25.W();
                }
                return mf3Var;
            case 25:
                f30 f30Var26 = (f30) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var26 = (ov0) f30Var26;
                if (ov0Var26.T(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    s83.b(ke0.N(2131624503, ov0Var26), null, 0L, v63.c(14), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var26, 1597440, 0, 262062);
                } else {
                    ov0Var26.W();
                }
                return mf3Var;
            case 26:
                f30 f30Var27 = (f30) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var27 = (ov0) f30Var27;
                if (ov0Var27.T(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    s83.b(ke0.N(2131624450, ov0Var27), null, 0L, v63.c(15), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var27, 1597440, 0, 262062);
                } else {
                    ov0Var27.W();
                }
                return mf3Var;
            case 27:
                return f(obj, obj2, obj3);
            case 28:
                return g(obj, obj2, obj3);
            default:
                f30 f30Var28 = (f30) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var28 = (ov0) f30Var28;
                if (ov0Var28.T(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    s83.b(ke0.N(2131624943, ov0Var28), null, 0L, v63.b(13.5d), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var28, 1597440, 0, 262062);
                } else {
                    ov0Var28.W();
                }
                return mf3Var;
        }
    }
}
