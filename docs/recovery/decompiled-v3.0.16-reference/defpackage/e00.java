package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class e00 implements pu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ e00(int i) {
        this.e = i;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                String str = (String) obj;
                w70 w70Var = (w70) obj2;
                str.getClass();
                w70Var.getClass();
                if (str.length() == 0) {
                    return w70Var.toString();
                }
                return str + ", " + w70Var;
            case 1:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t01.a(n51.u(), ke0.N(2131624056, ov0Var), null, 0L, ov0Var, 0, 12);
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            case 2:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    s83.b(ke0.N(2131624868, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            case 3:
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x01 x01VarB = ld0.d;
                    if (x01VarB == null) {
                        w01 w01Var = new w01("Rounded.PersonOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = nh3.a;
                        qy2 qy2Var = new qy2(hz.b);
                        nx0 nx0Var = new nx0(3);
                        nx0Var.m(12.0f, 5.9f);
                        nx0Var.g(1.16f, 0.0f, 2.1f, 0.94f, 2.1f, 2.1f);
                        nx0Var.o(-0.94f, 2.1f, -2.1f, 2.1f);
                        nx0Var.n(9.9f, 9.16f, 9.9f, 8.0f);
                        nx0Var.o(0.94f, -2.1f, 2.1f, -2.1f);
                        y62 y62Var = new y62(0.0f, 9.0f);
                        ArrayList arrayList = nx0Var.a;
                        arrayList.add(y62Var);
                        nx0Var.g(2.97f, 0.0f, 6.1f, 1.46f, 6.1f, 2.1f);
                        nx0Var.s(1.1f);
                        nx0Var.k(5.9f, 18.1f);
                        nx0Var.k(5.9f, 17.0f);
                        nx0Var.g(0.0f, -0.64f, 3.13f, -2.1f, 6.1f, -2.1f);
                        nx0Var.m(12.0f, 4.0f);
                        nx0Var.f(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f);
                        nx0Var.o(1.79f, 4.0f, 4.0f, 4.0f);
                        nx0Var.o(4.0f, -1.79f, 4.0f, -4.0f);
                        nx0Var.o(-1.79f, -4.0f, -4.0f, -4.0f);
                        nx0Var.e();
                        nx0Var.m(12.0f, 13.0f);
                        nx0Var.g(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
                        nx0Var.s(2.0f);
                        nx0Var.g(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                        nx0Var.i(14.0f);
                        nx0Var.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        nx0Var.s(-2.0f);
                        nx0Var.g(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
                        nx0Var.e();
                        w01.a(w01Var, arrayList, qy2Var);
                        x01VarB = w01Var.b();
                        ld0.d = x01VarB;
                    }
                    t01.a(x01VarB, null, null, 0L, ov0Var3, 48, 12);
                } else {
                    ov0Var3.W();
                }
                return mf3Var;
            case 4:
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    s83.b(ke0.N(2131624230, ov0Var4), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 0, 0, 262142);
                } else {
                    ov0Var4.W();
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                f30 f30Var5 = (f30) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ov0 ov0Var5 = (ov0) f30Var5;
                if (ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    t01.a(ld0.u(), null, null, 0L, ov0Var5, 48, 12);
                } else {
                    ov0Var5.W();
                }
                return mf3Var;
            case Logger.ERROR /* 6 */:
                f30 f30Var6 = (f30) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ov0 ov0Var6 = (ov0) f30Var6;
                if (ov0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    s83.b(ke0.N(2131624158, ov0Var6), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 0, 0, 262142);
                } else {
                    ov0Var6.W();
                }
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                f30 f30Var7 = (f30) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ov0 ov0Var7 = (ov0) f30Var7;
                if (ov0Var7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    t01.a(ld0.u(), null, null, 0L, ov0Var7, 48, 12);
                } else {
                    ov0Var7.W();
                }
                return mf3Var;
            case 8:
                f30 f30Var8 = (f30) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ov0 ov0Var8 = (ov0) f30Var8;
                if (ov0Var8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    s83.b(ke0.N(2131624507, ov0Var8), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var8, 0, 0, 262142);
                } else {
                    ov0Var8.W();
                }
                return mf3Var;
            case mc0.b /* 9 */:
                f30 f30Var9 = (f30) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ov0 ov0Var9 = (ov0) f30Var9;
                if (ov0Var9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    s83.b(ke0.N(2131624506, ov0Var9), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 0, 0, 262142);
                } else {
                    ov0Var9.W();
                }
                return mf3Var;
            case mc0.c /* 10 */:
                f30 f30Var10 = (f30) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ov0 ov0Var10 = (ov0) f30Var10;
                if (ov0Var10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    t01.a(n51.u(), ke0.N(2131624056, ov0Var10), null, 0L, ov0Var10, 0, 12);
                } else {
                    ov0Var10.W();
                }
                return mf3Var;
            case 11:
                f30 f30Var11 = (f30) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ov0 ov0Var11 = (ov0) f30Var11;
                if (ov0Var11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    s83.b(ke0.N(2131624280, ov0Var11), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var11, 0, 0, 262142);
                } else {
                    ov0Var11.W();
                }
                return mf3Var;
            case mc0.d /* 12 */:
                f30 f30Var12 = (f30) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ov0 ov0Var12 = (ov0) f30Var12;
                if (ov0Var12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    s83.b(ke0.N(2131624121, ov0Var12), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var12, 0, 0, 262142);
                } else {
                    ov0Var12.W();
                }
                return mf3Var;
            case 13:
                f30 f30Var13 = (f30) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ov0 ov0Var13 = (ov0) f30Var13;
                if (ov0Var13.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    s83.b(ke0.N(2131624281, ov0Var13), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var13, 0, 0, 262142);
                } else {
                    ov0Var13.W();
                }
                return mf3Var;
            case 14:
                f30 f30Var14 = (f30) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ov0 ov0Var14 = (ov0) f30Var14;
                if (ov0Var14.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    t01.a(n51.u(), ke0.N(2131624056, ov0Var14), null, 0L, ov0Var14, 0, 12);
                } else {
                    ov0Var14.W();
                }
                return mf3Var;
            case a83.e /* 15 */:
                f30 f30Var15 = (f30) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ov0 ov0Var15 = (ov0) f30Var15;
                if (ov0Var15.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    s83.b(ke0.N(2131624230, ov0Var15), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var15, 0, 0, 262142);
                } else {
                    ov0Var15.W();
                }
                return mf3Var;
            case 16:
                f30 f30Var16 = (f30) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ov0 ov0Var16 = (ov0) f30Var16;
                if (ov0Var16.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    s83.b(ke0.N(2131624158, ov0Var16), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var16, 0, 0, 262142);
                } else {
                    ov0Var16.W();
                }
                return mf3Var;
            case 17:
                f30 f30Var17 = (f30) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ov0 ov0Var17 = (ov0) f30Var17;
                if (ov0Var17.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    s83.b(ke0.N(2131624213, ov0Var17), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var17, 0, 0, 262142);
                } else {
                    ov0Var17.W();
                }
                return mf3Var;
            case 18:
                f30 f30Var18 = (f30) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ov0 ov0Var18 = (ov0) f30Var18;
                if (ov0Var18.T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    s83.b(ke0.N(2131624182, ov0Var18), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var18, 0, 0, 262142);
                } else {
                    ov0Var18.W();
                }
                return mf3Var;
            case 19:
                f30 f30Var19 = (f30) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ov0 ov0Var19 = (ov0) f30Var19;
                if (ov0Var19.T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    s83.b(ke0.N(2131624201, ov0Var19), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var19, 0, 0, 262142);
                } else {
                    ov0Var19.W();
                }
                return mf3Var;
            case 20:
                f30 f30Var20 = (f30) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ov0 ov0Var20 = (ov0) f30Var20;
                if (ov0Var20.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    s83.b(ke0.N(2131624205, ov0Var20), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var20, 0, 0, 262142);
                } else {
                    ov0Var20.W();
                }
                return mf3Var;
            case 21:
                f30 f30Var21 = (f30) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                ov0 ov0Var21 = (ov0) f30Var21;
                if (ov0Var21.T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    s83.b(ke0.N(2131624279, ov0Var21), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var21, 0, 0, 262142);
                } else {
                    ov0Var21.W();
                }
                return mf3Var;
            case 22:
                f30 f30Var22 = (f30) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                ov0 ov0Var22 = (ov0) f30Var22;
                if (ov0Var22.T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    s83.b(ke0.N(2131624205, ov0Var22), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var22, 0, 0, 262142);
                } else {
                    ov0Var22.W();
                }
                return mf3Var;
            case 23:
                f30 f30Var23 = (f30) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                ov0 ov0Var23 = (ov0) f30Var23;
                if (ov0Var23.T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    s83.b(ke0.N(2131624161, ov0Var23), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var23, 0, 0, 262142);
                } else {
                    ov0Var23.W();
                }
                return mf3Var;
            case 24:
                f30 f30Var24 = (f30) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                ov0 ov0Var24 = (ov0) f30Var24;
                if (ov0Var24.T(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    s83.b(ke0.N(2131624245, ov0Var24), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var24, 0, 0, 262142);
                } else {
                    ov0Var24.W();
                }
                return mf3Var;
            case 25:
                f30 f30Var25 = (f30) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                ov0 ov0Var25 = (ov0) f30Var25;
                if (ov0Var25.T(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    s83.b(ke0.N(2131624256, ov0Var25), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var25, 0, 0, 262142);
                } else {
                    ov0Var25.W();
                }
                return mf3Var;
            case 26:
                f30 f30Var26 = (f30) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                ov0 ov0Var26 = (ov0) f30Var26;
                if (ov0Var26.T(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    s83.b(ke0.N(2131624124, ov0Var26), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var26, 0, 0, 262142);
                } else {
                    ov0Var26.W();
                }
                return mf3Var;
            case 27:
                f30 f30Var27 = (f30) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                ov0 ov0Var27 = (ov0) f30Var27;
                if (ov0Var27.T(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    s83.b(ke0.N(2131624164, ov0Var27), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var27, 0, 0, 262142);
                } else {
                    ov0Var27.W();
                }
                return mf3Var;
            case 28:
                f30 f30Var28 = (f30) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                ov0 ov0Var28 = (ov0) f30Var28;
                if (ov0Var28.T(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    s83.b(ke0.N(2131624225, ov0Var28), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var28, 0, 0, 262142);
                } else {
                    ov0Var28.W();
                }
                return mf3Var;
            default:
                f30 f30Var29 = (f30) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                ov0 ov0Var29 = (ov0) f30Var29;
                if (ov0Var29.T(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    s83.b(ke0.N(2131624233, ov0Var29), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var29, 0, 0, 262142);
                } else {
                    ov0Var29.W();
                }
                return mf3Var;
        }
    }
}
