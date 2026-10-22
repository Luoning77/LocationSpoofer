package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class u1 implements qu0 {
    public final /* synthetic */ int e;

    public /* synthetic */ u1(int i) {
        this.e = i;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        vj0 vj0Var = vj0.e;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        final int i2 = 1;
        boolean z = false;
        switch (i) {
            case 0:
                gr1 gr1Var = (gr1) obj;
                final int iN0 = gr1Var.n0(10.0f);
                int i3 = iN0 * 2;
                final h82 h82VarS = ((zq1) obj2).s(m50.i(i3, 0, ((l50) obj3).a));
                return gr1Var.H0(h82VarS.e - i3, h82VarS.f, vj0Var, new lu0() { // from class: w1
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj4) {
                        int i4 = i2;
                        mf3 mf3Var2 = mf3.a;
                        int i5 = iN0;
                        h82 h82Var = h82VarS;
                        g82 g82Var = (g82) obj4;
                        switch (i4) {
                            case 0:
                                g82.z(g82Var, h82Var, 0, -i5);
                                break;
                            default:
                                g82.z(g82Var, h82Var, -i5, 0);
                                break;
                        }
                        return mf3Var2;
                    }
                });
            case 1:
                gr1 gr1Var2 = (gr1) obj;
                final int iN1 = gr1Var2.n0(10.0f);
                int i4 = iN1 * 2;
                final h82 h82VarS2 = ((zq1) obj2).s(m50.i(0, i4, ((l50) obj3).a));
                int i5 = h82VarS2.f - i4;
                int i6 = h82VarS2.e;
                final int i7 = z ? 1 : 0;
                return gr1Var2.H0(i6, i5, vj0Var, new lu0() { // from class: w1
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj4) {
                        int i8 = i7;
                        mf3 mf3Var2 = mf3.a;
                        int i9 = iN1;
                        h82 h82Var = h82VarS2;
                        g82 g82Var = (g82) obj4;
                        switch (i8) {
                            case 0:
                                g82.z(g82Var, h82Var, 0, -i9);
                                break;
                            default:
                                g82.z(g82Var, h82Var, -i9, 0);
                                break;
                        }
                        return mf3Var2;
                    }
                });
            case 2:
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    s83.b(ke0.N(2131624877, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            case 3:
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    s83.b(ke0.N(2131624040, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(le3.a)).l, ov0Var2, 0, 0, 131070);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            case 4:
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    s83.b(ke0.N(2131624876, ov0Var3), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 0, 0, 262142);
                } else {
                    ov0Var3.W();
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                f30 f30Var4 = (f30) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var4 = (ov0) f30Var4;
                if (ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    s83.b(ke0.N(2131624880, ov0Var4), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 0, 0, 262142);
                } else {
                    ov0Var4.W();
                }
                return mf3Var;
            case Logger.ERROR /* 6 */:
                f30 f30Var5 = (f30) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var5 = (ov0) f30Var5;
                if (ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    s83.b(ke0.N(2131624872, ov0Var5), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var5.j(le3.a)).h, ov0Var5, 0, 0, 131070);
                } else {
                    ov0Var5.W();
                }
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                f30 f30Var6 = (f30) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var6 = (ov0) f30Var6;
                if (ov0Var6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    s83.b(ke0.N(2131624867, ov0Var6), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 0, 0, 262142);
                } else {
                    ov0Var6.W();
                }
                return mf3Var;
            case 8:
                f30 f30Var7 = (f30) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var7 = (ov0) f30Var7;
                if (ov0Var7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    s83.b(ke0.N(2131624085, ov0Var7), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 0, 0, 262142);
                } else {
                    ov0Var7.W();
                }
                return mf3Var;
            case mc0.b /* 9 */:
                f30 f30Var8 = (f30) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var8 = (ov0) f30Var8;
                if (ov0Var8.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    s83.b(ke0.N(2131624042, ov0Var8), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var8, 0, 0, 262142);
                } else {
                    ov0Var8.W();
                }
                return mf3Var;
            case mc0.c /* 10 */:
                f30 f30Var9 = (f30) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var9 = (ov0) f30Var9;
                if (ov0Var9.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    s83.b(ke0.N(2131624041, ov0Var9), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 0, 0, 262142);
                } else {
                    ov0Var9.W();
                }
                return mf3Var;
            case 11:
                f30 f30Var10 = (f30) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var10 = (ov0) f30Var10;
                if (ov0Var10.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    s83.b(ke0.N(2131624045, ov0Var10), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var10, 0, 0, 262142);
                } else {
                    ov0Var10.W();
                }
                return mf3Var;
            case mc0.d /* 12 */:
                f30 f30Var11 = (f30) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var11 = (ov0) f30Var11;
                if (ov0Var11.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    s83.b(ke0.N(2131624050, ov0Var11), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var11, 0, 0, 262142);
                } else {
                    ov0Var11.W();
                }
                return mf3Var;
            case 13:
                f30 f30Var12 = (f30) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var12 = (ov0) f30Var12;
                if (ov0Var12.T(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    s83.b(ke0.N(2131624061, ov0Var12), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var12, 0, 0, 262142);
                } else {
                    ov0Var12.W();
                }
                return mf3Var;
            case 14:
                f30 f30Var13 = (f30) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var13 = (ov0) f30Var13;
                if (ov0Var13.T(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    vc2.c(iw2.e(av1Var, 1.0f), bk.g, 0L, 0, 0.0f, ov0Var13, 54, 28);
                } else {
                    ov0Var13.W();
                }
                return mf3Var;
            case a83.e /* 15 */:
                f30 f30Var14 = (f30) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var14 = (ov0) f30Var14;
                if (ov0Var14.T(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    s83.b(ke0.N(2131624037, ov0Var14), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var14, 0, 0, 262142);
                } else {
                    ov0Var14.W();
                }
                return mf3Var;
            case 16:
                f30 f30Var15 = (f30) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var15 = (ov0) f30Var15;
                if (ov0Var15.T(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    s83.b(ke0.N(2131624044, ov0Var15), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var15, 0, 0, 262142);
                } else {
                    ov0Var15.W();
                }
                return mf3Var;
            case 17:
                f30 f30Var16 = (f30) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var16 = (ov0) f30Var16;
                if (ov0Var16.T(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    s83.b(ke0.N(2131624047, ov0Var16), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var16, 0, 0, 262142);
                } else {
                    ov0Var16.W();
                }
                return mf3Var;
            case 18:
                f30 f30Var17 = (f30) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var17 = (ov0) f30Var17;
                if (ov0Var17.T(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    s83.b(ke0.N(2131624043, ov0Var17), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var17, 0, 0, 262142);
                } else {
                    ov0Var17.W();
                }
                return mf3Var;
            case 19:
                f30 f30Var18 = (f30) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var18 = (ov0) f30Var18;
                if (ov0Var18.T(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    s83.b(ke0.N(2131624047, ov0Var18), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var18, 0, 0, 262142);
                } else {
                    ov0Var18.W();
                }
                return mf3Var;
            case 20:
                f30 f30Var19 = (f30) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var19 = (ov0) f30Var19;
                if (ov0Var19.T(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    s83.b(ke0.N(2131624039, ov0Var19), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var19, 0, 0, 262142);
                } else {
                    ov0Var19.W();
                }
                return mf3Var;
            case 21:
                f30 f30Var20 = (f30) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var20 = (ov0) f30Var20;
                if (ov0Var20.T(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    s83.b(ke0.N(2131624085, ov0Var20), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var20, 0, 0, 262142);
                } else {
                    ov0Var20.W();
                }
                return mf3Var;
            case 22:
                f30 f30Var21 = (f30) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var21 = (ov0) f30Var21;
                if (ov0Var21.T(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    s83.b(ke0.N(2131624347, ov0Var21), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var21.j(le3.a)).l, ov0Var21, 0, 0, 131070);
                } else {
                    ov0Var21.W();
                }
                return mf3Var;
            case 23:
                f30 f30Var22 = (f30) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var22 = (ov0) f30Var22;
                if (ov0Var22.T(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    s83.b(ke0.N(2131624042, ov0Var22), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var22, 0, 0, 262142);
                } else {
                    ov0Var22.W();
                }
                return mf3Var;
            case 24:
                f30 f30Var23 = (f30) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var23 = (ov0) f30Var23;
                if (ov0Var23.T(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    s83.b(ke0.N(2131624061, ov0Var23), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var23, 0, 0, 262142);
                } else {
                    ov0Var23.W();
                }
                return mf3Var;
            case 25:
                f30 f30Var24 = (f30) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var24 = (ov0) f30Var24;
                if (ov0Var24.T(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    vc2.c(iw2.e(av1Var, 1.0f), bk.g, 0L, 0, 0.0f, ov0Var24, 54, 28);
                } else {
                    ov0Var24.W();
                }
                return mf3Var;
            case 26:
                f30 f30Var25 = (f30) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var25 = (ov0) f30Var25;
                if (ov0Var25.T(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    s83.b(ke0.N(2131624249, ov0Var25), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var25, 0, 0, 262142);
                } else {
                    ov0Var25.W();
                }
                return mf3Var;
            case 27:
                f30 f30Var26 = (f30) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var26 = (ov0) f30Var26;
                if (ov0Var26.T(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    s83.b(ke0.N(2131624249, ov0Var26), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var26, 0, 0, 262142);
                } else {
                    ov0Var26.W();
                }
                return mf3Var;
            case 28:
                f30 f30Var27 = (f30) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var27 = (ov0) f30Var27;
                if (ov0Var27.T(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    s83.b(ke0.N(2131624509, ov0Var27), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var27, 0, 0, 262142);
                } else {
                    ov0Var27.W();
                }
                return mf3Var;
            default:
                f30 f30Var28 = (f30) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var28 = (ov0) f30Var28;
                if (ov0Var28.T(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    s83.b(ke0.N(2131624508, ov0Var28), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var28, 0, 0, 262142);
                } else {
                    ov0Var28.W();
                }
                return mf3Var;
        }
    }
}
