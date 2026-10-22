package defpackage;

import android.content.Context;
import android.graphics.RectF;
import com.vincenthzr.locationspoofer.data.cloud.CloudDeviceSlot;
import com.vincenthzr.locationspoofer.data.cloud.CloudMemberInvite;
import com.vincenthzr.locationspoofer.data.cloud.RewardCoupon;
import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import com.vincenthzr.locationspoofer.data.model.RouteTravelMode;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.flow.internal.SafeCollector_commonKt;
import kotlinx.coroutines.future.FutureKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class s5 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s5(int i, int i2, Object obj) {
        this.e = i2;
        this.f = obj;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0510 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x0512 A[Catch: all -> 0x0503, LOOP:2: B:124:0x04d3->B:141:0x0512, LOOP_END, TryCatch #2 {all -> 0x0503, blocks: (B:117:0x04b0, B:119:0x04c0, B:121:0x04c6, B:124:0x04d3, B:126:0x04de, B:128:0x04e8, B:130:0x04ee, B:132:0x04f7, B:137:0x0505, B:138:0x0508, B:141:0x0512, B:151:0x053a, B:142:0x0517, B:143:0x051d, B:145:0x0523, B:147:0x052b, B:150:0x0536), top: B:340:0x04b0 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x059a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x059c A[Catch: all -> 0x05d2, LOOP:5: B:164:0x0571->B:174:0x059c, LOOP_END, TryCatch #1 {all -> 0x05d2, blocks: (B:161:0x055d, B:164:0x0571, B:166:0x057c, B:168:0x0586, B:170:0x058c, B:171:0x0594, B:174:0x059c, B:175:0x059f, B:178:0x05aa, B:180:0x05b5, B:182:0x05bf, B:184:0x05c5, B:187:0x05d4, B:190:0x05dc, B:191:0x05df), top: B:338:0x055d }] */
    /* JADX WARN: Code duplicated, block: B:189:0x05da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x05dc A[Catch: all -> 0x05d2, LOOP:7: B:178:0x05aa->B:190:0x05dc, LOOP_END, TryCatch #1 {all -> 0x05d2, blocks: (B:161:0x055d, B:164:0x0571, B:166:0x057c, B:168:0x0586, B:170:0x058c, B:171:0x0594, B:174:0x059c, B:175:0x059f, B:178:0x05aa, B:180:0x05b5, B:182:0x05bf, B:184:0x05c5, B:187:0x05d4, B:190:0x05dc, B:191:0x05df), top: B:338:0x055d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[LOOP:0: B:16:0x003d->B:29:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:344:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x053a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x059f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x05df A[SYNTHETIC] */
    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        boolean zH;
        boolean z;
        x01 x01VarB;
        long jL;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        int i = 7;
        CancellableContinuation cancellableContinuationY = null;
        sendChannel = null;
        sendChannel = null;
        sendChannel = null;
        SendChannel sendChannel = null;
        switch (this.e) {
            case 0:
                CloudMemberInvite cloudMemberInvite = (CloudMemberInvite) this.f;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s83.b(cloudMemberInvite.getCode(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                } else {
                    ov0Var.W();
                }
                return mf3.a;
            case 1:
                b81 b81Var = (b81) this.f;
                pe2 pe2VarJ = vd0.J((RectF) obj);
                pe2 pe2VarJ2 = vd0.J((RectF) obj2);
                switch (b81Var.e) {
                    case 19:
                        zH = pe2VarJ.h(pe2VarJ2);
                        break;
                    default:
                        zH = pe2VarJ2.a(pe2VarJ.c());
                        break;
                }
                return Boolean.valueOf(zH);
            case 2:
                x01 x01Var = (x01) this.f;
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    t01.a(x01Var, null, iw2.k(zm3.D(av1.a, 16.0f), 32.0f), ((kz) ov0Var2.j(mz.a)).a, ov0Var2, 432, 0);
                } else {
                    ov0Var2.W();
                }
                return mf3.a;
            case 3:
                Long l = (Long) obj2;
                if (fr2.a((er2) this.f, l.longValue())) {
                    return l;
                }
                return null;
            case 4:
                lj ljVar = (lj) this.f;
                ((Integer) obj).getClass();
                if (obj2 instanceof k20) {
                    k20 k20Var = (k20) obj2;
                    ay1 ay1Var = (ay1) ljVar.i;
                    if (ay1Var == null) {
                        ay1 ay1Var2 = in2.a;
                        ay1Var = new ay1();
                        ljVar.i = ay1Var;
                    }
                    ay1Var.k(k20Var);
                    ((gy1) ljVar.g).b(k20Var);
                }
                if (obj2 instanceof sv0) {
                    ljVar.f((sv0) obj2);
                }
                if (obj2 instanceof ee2) {
                    ((ee2) obj2).c();
                }
                return mf3.a;
            case Logger.WARN /* 5 */:
                ((Integer) obj2).getClass();
                k22.i((x73) this.f, (f30) obj, wc0.m0(1));
                return mf3.a;
            case Logger.ERROR /* 6 */:
                e63 e63Var = (e63) this.f;
                ((Integer) obj2).getClass();
                ov0 ov0Var3 = (ov0) ((f30) obj);
                ov0Var3.c0(666084174);
                String str = e63Var.b;
                ov0Var3.p(false);
                return str;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return FutureKt.asDeferred$lambda$5((CompletableDeferred) this.f, obj, (Throwable) obj2);
            case 8:
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var4 = (ov0) f30Var3;
                if (ov0Var4.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    throw null;
                }
                ov0Var4.W();
                return mf3.a;
            case mc0.b /* 9 */:
                ((Integer) obj2).getClass();
                ((g21) this.f).a(wc0.m0(1), (f30) obj);
                return mf3.a;
            case mc0.c /* 10 */:
                z41 z41Var = (z41) this.f;
                x92 x92Var = (x92) obj;
                x92Var.getClass();
                BuildersKt__Builders_commonKt.launch$default(z41Var.a, null, null, new k(z41Var, x92Var, cancellableContinuationY, 25), 3, null);
                return mf3.a;
            case 11:
                s52 s52Var = (s52) this.f;
                float fFloatValue = ((Float) obj2).floatValue();
                ((x92) obj).getClass();
                s52Var.h(s52Var.g() + fFloatValue);
                return mf3.a;
            case mc0.d /* 12 */:
                ((s63) this.f).e(((c12) obj2).a);
                return mf3.a;
            case 13:
                CollectionRouteRecord collectionRouteRecord = (CollectionRouteRecord) this.f;
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ov0 ov0Var5 = (ov0) f30Var4;
                if (ov0Var5.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    s83.b(ke0.O(2131624299, new Object[]{collectionRouteRecord.getName()}, ov0Var5), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 0, 0, 262142);
                } else {
                    ov0Var5.W();
                }
                return mf3.a;
            case 14:
                kq1 kq1Var = (kq1) this.f;
                f30 f30Var5 = (f30) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ov0 ov0Var6 = (ov0) f30Var5;
                if (ov0Var6.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    av1 av1Var = av1.a;
                    dv1 dv1VarE = zm3.E(av1Var, 10.0f, 6.0f);
                    kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var6, 48);
                    int iHashCode = Long.hashCode(ov0Var6.T);
                    l72 l72VarL = ov0Var6.l();
                    dv1 dv1VarH = xp1.H(ov0Var6, dv1VarE);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var6.g0();
                    if (ov0Var6.S) {
                        ov0Var6.k(x30Var);
                    } else {
                        ov0Var6.p0();
                    }
                    q73.h(ov0Var6, v20.e, kk2VarA);
                    q73.h(ov0Var6, v20.d, l72VarL);
                    q73.h(ov0Var6, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var6, v20.g);
                    q73.h(ov0Var6, v20.c, dv1VarH);
                    ws.a(xp1.k(iw2.g(iw2.o(av1Var, 3.0f), 18.0f), bk.g, cj2.a(2.0f)), ov0Var6, 0);
                    gh0.h(ov0Var6, iw2.o(av1Var, 8.0f));
                    s83.c(rq1.c(kq1Var.a), null, hz.c(0.75f, ((kz) ov0Var6.j(mz.a)).q), v63.b(12.5d), null, 0L, 0L, 0, false, 0, 0, null, null, null, ov0Var6, 24576, 0, 524266);
                    ov0Var6.p(true);
                } else {
                    ov0Var6.W();
                }
                return mf3.a;
            case a83.e /* 15 */:
                lq1 lq1Var = (lq1) this.f;
                f30 f30Var6 = (f30) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ov0 ov0Var7 = (ov0) f30Var6;
                if (ov0Var7.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    s83.b(lq1Var.a, zm3.D(av1.a, 10.0f), bk.g, v63.c(12), null, l43.c, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 25008, 0, 261992);
                } else {
                    ov0Var7.W();
                }
                return mf3.a;
            case 16:
                ((Integer) obj2).getClass();
                rq1.a((pq1) this.f, (f30) obj, wc0.m0(1));
                return mf3.a;
            case 17:
                RewardCoupon rewardCoupon = (RewardCoupon) this.f;
                f30 f30Var7 = (f30) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ov0 ov0Var8 = (ov0) f30Var7;
                if (ov0Var8.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    s83.b(ke0.O(2131624707, new Object[]{Integer.valueOf(rewardCoupon.getAmountCents() / 100)}, ov0Var8), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var8, 0, 0, 262142);
                } else {
                    ov0Var8.W();
                }
                return mf3.a;
            case 18:
                CloudDeviceSlot cloudDeviceSlot = (CloudDeviceSlot) this.f;
                f30 f30Var8 = (f30) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ov0 ov0Var9 = (ov0) f30Var8;
                if (ov0Var9.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    String name = cloudDeviceSlot.getName();
                    if (name == null) {
                        ov0Var9.c0(-1451061669);
                        int position = cloudDeviceSlot.getPosition();
                        name = ke0.O(2131624427, new Object[]{Integer.valueOf(position < 1 ? 1 : position)}, ov0Var9);
                        z = false;
                    } else {
                        z = false;
                        ov0Var9.c0(-1451062072);
                    }
                    ov0Var9.p(z);
                    s83.b(ke0.O(2131624424, new Object[]{name}, ov0Var9), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 0, 0, 262142);
                } else {
                    ov0Var9.W();
                }
                return mf3.a;
            case 19:
                zw1 zw1Var = (zw1) this.f;
                Set set = (Set) obj;
                synchronized (zw1Var.a) {
                    try {
                        zx1 zx1Var = zw1Var.b;
                        jl1 jl1Var = new jl1(i, set, zw1Var);
                        da0.o(1, jl1Var);
                        Object[] objArr = zx1Var.b;
                        long[] jArr = zx1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((j & 255) < 128) {
                                            jl1Var.invoke(objArr[(i2 << 3) + i4]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i3 == 8) {
                                        if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                } else if (i2 != length) {
                                    i2++;
                                }
                            }
                        }
                        ay1 ay1Var3 = zw1Var.d;
                        Object[] objArr2 = ay1Var3.b;
                        long[] jArr2 = ay1Var3.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j2 = jArr2[i5];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((j2 & 255) < 128) {
                                            ((SendChannel) objArr2[(i5 << 3) + i7]).mo32trySendJP2dKIU(mf3.a);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i6 == 8) {
                                        if (i5 != length2) {
                                            i5++;
                                        }
                                    }
                                } else if (i5 != length2) {
                                    i5++;
                                }
                            }
                        }
                        zw1Var.d.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return mf3.a;
            case 20:
                int i8 = 1;
                ke2 ke2Var = (ke2) this.f;
                Set set2 = (Set) obj;
                synchronized (ke2Var.c) {
                    try {
                        if (((ie2) ke2Var.u.getValue()).compareTo(ie2.i) >= 0) {
                            ay1 ay1Var4 = ke2Var.h;
                            if (set2 instanceof jn2) {
                                ay1 ay1Var5 = ((jn2) set2).e;
                                Object[] objArr3 = ay1Var5.b;
                                long[] jArr3 = ay1Var5.a;
                                int length3 = jArr3.length - 2;
                                if (length3 >= 0) {
                                    int i9 = 0;
                                    while (true) {
                                        long j3 = jArr3[i9];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i9 - length3)) >>> 31);
                                            int i11 = 0;
                                            while (i11 < i10) {
                                                if ((j3 & 255) < 128) {
                                                    Object obj3 = objArr3[(i9 << 3) + i11];
                                                    if (!(obj3 instanceof y03) || ((y03) obj3).e(i8)) {
                                                        ay1Var4.a(obj3);
                                                    }
                                                }
                                                j3 >>= 8;
                                                i11++;
                                                i8 = 1;
                                            }
                                            if (i10 == 8) {
                                                if (i9 != length3) {
                                                    i9++;
                                                    i8 = 1;
                                                }
                                            }
                                        } else if (i9 != length3) {
                                            i9++;
                                            i8 = 1;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set2) {
                                    if (!(obj4 instanceof y03) || ((y03) obj4).e(1)) {
                                        ay1Var4.a(obj4);
                                    }
                                }
                            }
                            cancellableContinuationY = ke2Var.y();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (cancellableContinuationY != null) {
                    cancellableContinuationY.resumeWith(mf3.a);
                }
                return mf3.a;
            case 21:
                z92 z92Var = (z92) this.f;
                pl2 pl2Var = (pl2) obj;
                ey1 ey1Var = (ey1) obj2;
                if (!(ey1Var instanceof yx2)) {
                    fo.i("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                    return null;
                }
                yx2 yx2Var = (yx2) ey1Var;
                Object objInvoke = ((pu0) z92Var.f).invoke(pl2Var, yx2Var.getValue());
                if (objInvoke == null) {
                    return null;
                }
                ay2 ay2VarD = yx2Var.d();
                ay2VarD.getClass();
                return new w52(objInvoke, ay2VarD);
            case 22:
                RouteTravelMode routeTravelMode = (RouteTravelMode) this.f;
                f30 f30Var9 = (f30) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ov0 ov0Var10 = (ov0) f30Var9;
                if (ov0Var10.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    s83.b(ke0.N(routeTravelMode.getLabelResId(), ov0Var10), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var10, 0, 0, 262142);
                } else {
                    ov0Var10.W();
                }
                return mf3.a;
            case 23:
                return Integer.valueOf(SafeCollector_commonKt.checkContext$lambda$0((SafeCollector) this.f, ((Integer) obj).intValue(), (w70) obj2));
            case 24:
                mi1 mi1Var = (mi1) this.f;
                f30 f30Var10 = (f30) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ov0 ov0Var11 = (ov0) f30Var10;
                if (ov0Var11.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    if (mi1Var == mi1.g) {
                        x01VarB = ld0.b;
                        if (x01VarB == null) {
                            w01 w01Var = new w01("Rounded.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i12 = nh3.a;
                            qy2 qy2Var = new qy2(hz.b);
                            nx0 nx0Var = new nx0(3);
                            nx0Var.m(8.12f, 9.29f);
                            nx0Var.k(12.0f, 13.17f);
                            nx0Var.l(3.88f, -3.88f);
                            nx0Var.g(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
                            nx0Var.g(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
                            nx0Var.l(-4.59f, 4.59f);
                            nx0Var.g(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
                            nx0Var.k(6.7f, 10.7f);
                            nx0Var.g(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
                            nx0Var.g(0.39f, -0.38f, 1.03f, -0.39f, 1.42f, 0.0f);
                            nx0Var.e();
                            w01.a(w01Var, nx0Var.a, qy2Var);
                            x01VarB = w01Var.b();
                            ld0.b = x01VarB;
                        }
                    } else {
                        x01VarB = vd0.b;
                        if (x01VarB == null) {
                            w01 w01Var2 = new w01("Rounded.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i13 = nh3.a;
                            qy2 qy2Var2 = new qy2(hz.b);
                            nx0 nx0Var2 = new nx0(3);
                            nx0Var2.m(8.12f, 14.71f);
                            nx0Var2.k(12.0f, 10.83f);
                            nx0Var2.l(3.88f, 3.88f);
                            nx0Var2.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                            nx0Var2.g(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                            nx0Var2.k(12.7f, 8.71f);
                            nx0Var2.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                            nx0Var2.k(6.7f, 13.3f);
                            nx0Var2.g(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                            nx0Var2.g(0.39f, 0.38f, 1.03f, 0.39f, 1.42f, 0.0f);
                            nx0Var2.e();
                            w01.a(w01Var2, nx0Var2.a, qy2Var2);
                            x01VarB = w01Var2.b();
                            vd0.b = x01VarB;
                        }
                    }
                    t01.a(x01VarB, null, iw2.k(av1.a, 20.0f), hz.c(0.6f, ((kz) ov0Var11.j(mz.a)).q), ov0Var11, 432, 0);
                } else {
                    ov0Var11.W();
                }
                return mf3.a;
            case 25:
                po2 po2Var = (po2) this.f;
                BuildersKt__Builders_commonKt.launch$default(po2Var.a1(), null, null, new oo2(po2Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null, 0), 3, null);
                return Boolean.TRUE;
            case 26:
                ve2 ve2Var = (ve2) this.f;
                ((x92) obj).a();
                ve2Var.e = ((c12) obj2).a;
                return mf3.a;
            case 27:
                ar2 ar2Var = (ar2) this.f;
                v53 v53Var = (v53) obj;
                Context context = (Context) obj2;
                i52 i52VarD = ar2Var.d();
                e92.a(v53Var, context, false, i52VarD != null ? (dj) i52VarD.e : null, i52VarD != null ? (f93) i52VarD.f : null, ar2Var.w, new jl1(19, ar2Var, context));
                return mf3.a;
            case 28:
                pa1 pa1Var = (pa1) this.f;
                pa1 pa1VarC = ((bx1) obj).c();
                pa1 pa1VarC2 = ((bx1) obj2).c();
                long jL2 = 0;
                if (pa1VarC != null) {
                    jL = pa1Var.L(pa1VarC, 0L);
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jL & 4294967295L)) + ((int) (pa1VarC.f0() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jL >> 32)) + ((int) (pa1VarC.f0() >> 32)))) << 32);
                } else {
                    jL = 0;
                    jFloatToRawIntBits = 0;
                }
                if (pa1VarC2 != null) {
                    jL2 = pa1Var.L(pa1VarC2, 0L);
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jL2 & 4294967295L)) + ((int) (pa1VarC2.f0() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jL2 >> 32)) + ((int) (pa1VarC2.f0() >> 32)))) << 32);
                } else {
                    jFloatToRawIntBits2 = 0;
                }
                int i14 = (int) (jFloatToRawIntBits & 4294967295L);
                int i15 = (int) (jL & 4294967295L);
                float fIntBitsToFloat = Float.intBitsToFloat(i14) - Float.intBitsToFloat(i15);
                int i16 = (int) (jFloatToRawIntBits >> 32);
                int i17 = (int) (jL >> 32);
                float fIntBitsToFloat2 = Float.intBitsToFloat(i16) - Float.intBitsToFloat(i17);
                int i18 = (int) (jFloatToRawIntBits2 & 4294967295L);
                int i19 = (int) (jL2 & 4294967295L);
                float fIntBitsToFloat3 = Float.intBitsToFloat(i18) - Float.intBitsToFloat(i19);
                int i20 = (int) (jFloatToRawIntBits2 >> 32);
                int i21 = (int) (jL2 >> 32);
                float fIntBitsToFloat4 = Float.intBitsToFloat(i20) - Float.intBitsToFloat(i21);
                float fMax = Math.max(0.0f, Math.min(Float.intBitsToFloat(i14), Float.intBitsToFloat(i18)) - Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i19)));
                float fMax2 = Math.max(0.0f, Math.min(Float.intBitsToFloat(i16), Float.intBitsToFloat(i20)) - Math.max(Float.intBitsToFloat(i17), Float.intBitsToFloat(i21)));
                return Integer.valueOf((((fMax > (fIntBitsToFloat * 0.5f) ? 1 : (fMax == (fIntBitsToFloat * 0.5f) ? 0 : -1)) >= 0 || (fMax > (fIntBitsToFloat3 * 0.5f) ? 1 : (fMax == (fIntBitsToFloat3 * 0.5f) ? 0 : -1)) >= 0) && ((fMax2 > (fIntBitsToFloat2 * 0.5f) ? 1 : (fMax2 == (fIntBitsToFloat2 * 0.5f) ? 0 : -1)) < 0 && (fMax2 > (fIntBitsToFloat4 * 0.5f) ? 1 : (fMax2 == (fIntBitsToFloat4 * 0.5f) ? 0 : -1)) < 0)) ? Float.valueOf(Float.intBitsToFloat(i17)).compareTo(Float.valueOf(Float.intBitsToFloat(i21))) : Float.valueOf(Float.intBitsToFloat(i15)).compareTo(Float.valueOf(Float.intBitsToFloat(i19))));
            default:
                zv2 zv2Var = (zv2) this.f;
                Set set3 = (Set) obj;
                synchronized (zv2Var.a) {
                    try {
                        ay1 ay1Var6 = zv2Var.d;
                        if (ay1Var6 != null) {
                            Object[] objArr4 = ay1Var6.b;
                            long[] jArr4 = ay1Var6.a;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j4 = jArr4[i22];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i22 - length4)) >>> 31);
                                        int i24 = 0;
                                        while (true) {
                                            if (i24 < i23) {
                                                if ((j4 & 255) >= 128 || !set3.contains(objArr4[(i22 << 3) + i24])) {
                                                    j4 >>= 8;
                                                    i24++;
                                                } else {
                                                    sendChannel = zv2Var.f;
                                                }
                                            } else if (i23 == 8) {
                                                if (i22 != length4) {
                                                    i22++;
                                                }
                                            }
                                        }
                                    } else if (i22 != length4) {
                                        i22++;
                                    }
                                }
                            }
                        } else if (zy.g0(set3, zv2Var.b)) {
                            sendChannel = zv2Var.f;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (sendChannel != null) {
                    ChannelResult.m46boximpl(sendChannel.mo32trySendJP2dKIU(mf3.a));
                }
                return mf3.a;
        }
    }

    public /* synthetic */ s5(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }
}
