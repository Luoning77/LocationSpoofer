package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository;
import com.vincenthzr.locationspoofer.data.cloud.CloudRuntimeBinding;
import com.vincenthzr.locationspoofer.data.cloud.MapStartupTiming;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.g;
import org.maplibre.android.maps.k;
import org.maplibre.android.maps.renderer.MapRenderer;
import org.maplibre.android.net.a;
import org.maplibre.android.offline.OfflineManager;
import org.maplibre.android.storage.FileSource;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class as2 {
    /* JADX WARN: Code duplicated, block: B:138:0x02e6  */
    public static final void a(Context context, df1 df1Var, final CloudRepository cloudRepository, boolean z, dv1 dv1Var, lu0 lu0Var, lu0 lu0Var2, Double d, Double d2, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var;
        boolean z2;
        ov0 ov0Var2;
        ey1 ey1Var;
        lr2 lr2Var;
        CloudRepository cloudRepository2;
        ey1 ey1Var2;
        ey1 ey1Var3;
        ey1 ey1Var4;
        Object t3Var;
        lr2 lr2Var2;
        ey1 ey1Var5;
        ey1 ey1Var6;
        ey1 ey1Var7;
        ey1 ey1Var8;
        boolean z3;
        ey1 ey1Var9;
        ey1 ey1Var10;
        int i3;
        ov0 ov0Var3;
        boolean z4;
        final ey1 ey1Var11;
        ov0 ov0Var4;
        ey1 ey1Var12;
        int i4;
        c30 c30Var;
        bs2 bs2Var;
        ov0 ov0Var5 = (ov0) f30Var;
        ov0Var5.e0(1057342401);
        if ((i & 6) == 0) {
            i2 = (ov0Var5.h(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var5.h(df1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var5.h(cloudRepository) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var5.g(z) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= ov0Var5.f(dv1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ov0Var5.h(lu0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ov0Var5.h(lu0Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ov0Var5.f(d) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= ov0Var5.f(d2) ? 67108864 : 33554432;
        }
        if (ov0Var5.T(i2 & 1, (38347923 & i2) != 38347922)) {
            final ey1 ey1VarL = ke0.L(lu0Var, ov0Var5);
            final ey1 ey1VarL2 = ke0.L(lu0Var2, ov0Var5);
            final ey1 ey1VarL3 = ke0.L(Boolean.valueOf(z), ov0Var5);
            Object objQ = ov0Var5.Q();
            q60 q60Var = null;
            c30 c30Var2 = d30.a;
            if (objQ == c30Var2) {
                objQ = ke0.H(null);
                ov0Var5.m0(objQ);
            }
            ey1 ey1Var13 = (ey1) objQ;
            Object objQ2 = ov0Var5.Q();
            if (objQ2 == c30Var2) {
                objQ2 = ke0.H(Boolean.TRUE);
                ov0Var5.m0(objQ2);
            }
            final ey1 ey1Var14 = (ey1) objQ2;
            Object objQ3 = ov0Var5.Q();
            if (objQ3 == c30Var2) {
                objQ3 = ke0.H(Boolean.FALSE);
                ov0Var5.m0(objQ3);
            }
            final ey1 ey1Var15 = (ey1) objQ3;
            Object objQ4 = ov0Var5.Q();
            if (objQ4 == c30Var2) {
                objQ4 = ke0.H(Boolean.FALSE);
                ov0Var5.m0(objQ4);
            }
            final ey1 ey1Var16 = (ey1) objQ4;
            ey1 ey1VarS = ee0.s(cloudRepository.getState(), ov0Var5);
            ey1 ey1VarS2 = ee0.s(cloudRepository.getMapQuotaExceeded(), ov0Var5);
            Object objQ5 = ov0Var5.Q();
            if (objQ5 == c30Var2) {
                objQ5 = ke0.H(Boolean.FALSE);
                ov0Var5.m0(objQ5);
            }
            ey1 ey1Var17 = (ey1) objQ5;
            Object objQ6 = ov0Var5.Q();
            if (objQ6 == c30Var2) {
                objQ6 = ke0.H(Boolean.FALSE);
                ov0Var5.m0(objQ6);
            }
            ey1 ey1Var18 = (ey1) objQ6;
            Object objQ7 = ov0Var5.Q();
            if (objQ7 == c30Var2) {
                objQ7 = ke0.H(Boolean.FALSE);
                ov0Var5.m0(objQ7);
            }
            final ey1 ey1Var19 = (ey1) objQ7;
            Object objQ8 = ov0Var5.Q();
            if (objQ8 == c30Var2) {
                objQ8 = ke0.H(Boolean.FALSE);
                ov0Var5.m0(objQ8);
            }
            ey1 ey1Var20 = (ey1) objQ8;
            Object objQ9 = ov0Var5.Q();
            if (objQ9 == c30Var2) {
                objQ9 = ke0.H(Boolean.FALSE);
                ov0Var5.m0(objQ9);
            }
            ey1 ey1Var21 = (ey1) objQ9;
            Object objQ10 = ov0Var5.Q();
            if (objQ10 == c30Var2) {
                objQ10 = ke0.H(Boolean.FALSE);
                ov0Var5.m0(objQ10);
            }
            ey1 ey1Var22 = (ey1) objQ10;
            Boolean bool = (Boolean) ey1Var22.getValue();
            bool.getClass();
            lr2 lr2Var3 = (lr2) ey1Var13.getValue();
            boolean zH = ov0Var5.h(cloudRepository);
            Object objQ11 = ov0Var5.Q();
            if (zH || objQ11 == c30Var2) {
                ov0Var2 = ov0Var5;
                ey1Var = ey1Var21;
                lr2Var = lr2Var3;
                cloudRepository2 = cloudRepository;
                objQ11 = new ph(cloudRepository2, ey1Var22, ey1Var20, ey1Var13, ey1Var17, ey1Var, (q60) null);
                ey1Var2 = ey1Var22;
                ey1Var3 = ey1Var13;
                ey1Var4 = ey1Var17;
                ov0Var2.m0(objQ11);
            } else {
                ov0Var2 = ov0Var5;
                lr2Var = lr2Var3;
                ey1Var4 = ey1Var17;
                ey1Var = ey1Var21;
                ey1Var3 = ey1Var13;
                ey1Var2 = ey1Var22;
                cloudRepository2 = cloudRepository;
            }
            oi0.f(bool, lr2Var, (pu0) objQ11, ov0Var2);
            Boolean bool2 = (Boolean) ey1Var4.getValue();
            bool2.getClass();
            CloudAccountState cloudAccountState = (CloudAccountState) ey1VarS.getValue();
            lr2 lr2Var4 = (lr2) ey1Var3.getValue();
            boolean zH2 = ov0Var2.h(cloudRepository2);
            Object objQ12 = ov0Var2.Q();
            if (zH2 || objQ12 == c30Var2) {
                lr2Var2 = lr2Var4;
                ey1Var5 = ey1Var18;
                t3Var = new t3(cloudRepository2, ey1Var4, ey1Var3, ey1Var5, (q60) null);
                ey1Var6 = ey1Var3;
                ov0Var2.m0(t3Var);
            } else {
                ey1Var6 = ey1Var3;
                lr2Var2 = lr2Var4;
                t3Var = objQ12;
                ey1Var5 = ey1Var18;
            }
            oi0.g(bool2, cloudAccountState, lr2Var2, (pu0) t3Var, ov0Var2);
            Object objQ13 = ov0Var2.Q();
            if (objQ13 == c30Var2) {
                objQ13 = ke0.H(Boolean.FALSE);
                ov0Var2.m0(objQ13);
            }
            final ey1 ey1Var23 = (ey1) objQ13;
            Object objQ14 = ov0Var2.Q();
            if (objQ14 == c30Var2) {
                objQ14 = ke0.H(Boolean.FALSE);
                ov0Var2.m0(objQ14);
            }
            final ey1 ey1Var24 = (ey1) objQ14;
            Object objQ15 = ov0Var2.Q();
            if (objQ15 == c30Var2) {
                final se2 se2Var = new se2();
                if (d == null || d2 == null || Math.abs(d.doubleValue()) > Double.MAX_VALUE || Math.abs(d2.doubleValue()) > Double.MAX_VALUE) {
                    bs2Var = null;
                } else {
                    double dDoubleValue = d.doubleValue();
                    if (dDoubleValue < -90.0d || dDoubleValue > 90.0d) {
                        bs2Var = null;
                    } else {
                        double dDoubleValue2 = d2.doubleValue();
                        if (dDoubleValue2 < -180.0d || dDoubleValue2 > 180.0d) {
                            bs2Var = null;
                        } else {
                            z60 z60VarE = xq1.E(d.doubleValue(), d2.doubleValue());
                            bs2Var = new bs2(z60VarE.a, z60VarE.b);
                        }
                    }
                }
                bs2 bs2Var2 = bs2Var == null ? o51.q0 : bs2Var;
                jp1 jp1Var = new jp1();
                jp1Var.g = true;
                jp1Var.h = true;
                jp1Var.i = 8388661;
                jp1Var.l = true;
                jp1Var.m = 8388691;
                jp1Var.o = -1;
                jp1Var.p = true;
                jp1Var.q = 8388691;
                jp1Var.s = 0.0d;
                jp1Var.t = 25.5d;
                jp1Var.u = 0.0d;
                jp1Var.v = 60.0d;
                jp1Var.w = true;
                jp1Var.x = true;
                jp1Var.y = true;
                jp1Var.z = true;
                jp1Var.A = true;
                jp1Var.B = true;
                jp1Var.C = true;
                jp1Var.D = true;
                jp1Var.E = 4;
                jp1Var.F = false;
                jp1Var.G = true;
                jp1Var.O = true;
                jp1Var.P = false;
                jp1Var.Q = "";
                jp1Var.R = 1048576L;
                jp1Var.S = 5L;
                jp1Var.T = 60;
                jp1Var.U = false;
                jp1Var.V = false;
                jp1Var.K = true;
                jp1Var.l = false;
                jp1Var.p = false;
                jp1Var.g = false;
                jp1Var.z = false;
                jp1Var.D = false;
                jp1Var.G = false;
                jp1Var.s = 1.0d;
                jp1Var.t = 18.0d;
                ov0 ov0Var6 = ov0Var2;
                jp1Var.e = new CameraPosition(new LatLng(bs2Var2.a, bs2Var2.b), bs2Var != null ? 15.0d : 3.5d, -1.0d, -1.0d, null);
                k kVar = new k(context, jp1Var);
                Bundle bundle = new Bundle();
                if (bundle.getBoolean("maplibre_savedState")) {
                    kVar.u = bundle;
                }
                gq1 gq1Var = new gq1() { // from class: sr2
                    @Override // defpackage.gq1
                    public final void a() {
                        se2Var.e = true;
                        MapStartupTiming.INSTANCE.mark(MapStartupTiming.Phase.MAP_STYLE_READY);
                    }
                };
                vo1 vo1Var = kVar.e;
                vo1Var.m.add(gq1Var);
                vo1Var.h.add(new tr2(se2Var));
                vo1Var.f.add(new fq1() { // from class: ur2
                    @Override // defpackage.fq1
                    public final void d() {
                        ey1Var15.setValue(Boolean.TRUE);
                    }
                });
                ov0Var2 = ov0Var6;
                ov0Var2.m0(kVar);
                objQ15 = kVar;
            } else {
                ey1Var6 = ey1Var6;
                ey1Var5 = ey1Var5;
                ey1Var4 = ey1Var4;
                ey1Var = ey1Var;
                ey1Var2 = ey1Var2;
            }
            final k kVar2 = (k) objQ15;
            boolean zH3 = ov0Var2.h(kVar2) | ov0Var2.h(df1Var) | ov0Var2.h(context);
            Object objQ16 = ov0Var2.Q();
            if (zH3 || objQ16 == c30Var2) {
                ey1Var7 = ey1Var15;
                ey1Var8 = ey1Var6;
                lh lhVar = new lh(df1Var, context, kVar2, ey1Var8, 12);
                ov0Var2.m0(lhVar);
                objQ16 = lhVar;
            } else {
                ey1Var7 = ey1Var15;
                ey1Var8 = ey1Var6;
            }
            oi0.b(kVar2, df1Var, (lu0) objQ16, ov0Var2);
            Boolean boolValueOf = Boolean.valueOf(z);
            lr2 lr2Var5 = (lr2) ey1Var8.getValue();
            int i5 = i2 & 7168;
            boolean zH4 = (i5 == 2048) | ov0Var2.h(context);
            Object objQ17 = ov0Var2.Q();
            if (zH4 || objQ17 == c30Var2) {
                mn mnVar = new mn(1, q60Var, context, ey1Var8, z);
                ov0Var2.m0(mnVar);
                objQ17 = mnVar;
            }
            oi0.f(boolValueOf, lr2Var5, (pu0) objQ17, ov0Var2);
            if (((Boolean) ey1Var19.getValue()).booleanValue()) {
                ov0Var2.c0(-1801019369);
                boolean zBooleanValue = ((Boolean) ey1Var4.getValue()).booleanValue();
                boolean z5 = !((Boolean) ey1Var16.getValue()).booleanValue() || ((Boolean) ey1Var20.getValue()).booleanValue() || ((Boolean) ey1Var2.getValue()).booleanValue();
                Object objQ18 = ov0Var2.Q();
                if (objQ18 == c30Var2) {
                    ey1Var19 = ey1Var19;
                    objQ18 = new xj2(ey1Var19, 12);
                    ov0Var2.m0(objQ18);
                } else {
                    ey1Var19 = ey1Var19;
                }
                au0 au0Var = (au0) objQ18;
                boolean zH5 = ov0Var2.h(cloudRepository2);
                Object objQ19 = ov0Var2.Q();
                if (zH5 || objQ19 == c30Var2) {
                    final ey1 ey1Var25 = ey1Var8;
                    final CloudRepository cloudRepository3 = cloudRepository2;
                    final ey1 ey1Var26 = ey1Var5;
                    final ey1 ey1Var27 = ey1Var2;
                    final ey1 ey1Var28 = ey1Var4;
                    final ey1 ey1Var29 = ey1Var;
                    lu0 lu0Var3 = new lu0() { // from class: vr2
                        @Override // defpackage.lu0
                        public final Object invoke(Object obj) {
                            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                            Boolean bool3 = Boolean.FALSE;
                            ey1Var19.setValue(bool3);
                            ey1 ey1Var30 = ey1Var28;
                            ey1 ey1Var31 = ey1Var29;
                            if (!zBooleanValue2) {
                                lr2 lr2Var6 = (lr2) ey1Var25.getValue();
                                if (lr2Var6 != null) {
                                    lr2Var6.m(false);
                                }
                                ey1Var30.setValue(bool3);
                                ey1Var31.setValue(bool3);
                            } else if (!cloudRepository3.satelliteAvailable()) {
                                ey1Var26.setValue(Boolean.TRUE);
                            } else if (!((Boolean) ey1Var30.getValue()).booleanValue()) {
                                ey1Var31.setValue(bool3);
                                ey1Var27.setValue(Boolean.TRUE);
                            }
                            return mf3.a;
                        }
                    };
                    ey1Var9 = ey1Var25;
                    ey1Var10 = ey1Var26;
                    ov0Var2.m0(lu0Var3);
                    objQ19 = lu0Var3;
                } else {
                    ey1Var9 = ey1Var8;
                    ey1Var10 = ey1Var5;
                }
                ke0.j(zBooleanValue, z5, au0Var, (lu0) objQ19, ov0Var2, 3120);
                z3 = false;
            } else {
                z3 = false;
                ey1Var9 = ey1Var8;
                ey1Var10 = ey1Var5;
                context = context;
                ov0Var2.c0(-21196351);
            }
            ov0Var2.p(z3);
            if (((Boolean) ey1Var10.getValue()).booleanValue()) {
                ov0Var2.c0(-1800998655);
                String strN = ke0.N(2131624926, ov0Var2);
                String strN2 = ke0.N(2131624925, ov0Var2);
                x01 x01VarX = ld0.x();
                String strN3 = ke0.N(2131624918, ov0Var2);
                Object objQ20 = ov0Var2.Q();
                if (objQ20 == c30Var2) {
                    objQ20 = new xj2(ey1Var10, 13);
                    ov0Var2.m0(objQ20);
                }
                i3 = i5;
                ov0 ov0Var7 = ov0Var2;
                ym3.c(strN, strN2, x01VarX, strN3, (au0) objQ20, null, null, ov0Var7, 24576, 96);
                ov0Var3 = ov0Var7;
                z4 = false;
            } else {
                i3 = i5;
                ov0Var3 = ov0Var2;
                z4 = false;
                ov0Var3.c0(-21196351);
            }
            ov0Var3.p(z4);
            pr prVar = j9.f;
            er1 er1VarC = ws.c(prVar, z4);
            int iHashCode = Long.hashCode(ov0Var3.T);
            l72 l72VarL = ov0Var3.l();
            dv1 dv1VarH = xp1.H(ov0Var3, dv1Var);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(x30Var);
            } else {
                ov0Var3.p0();
            }
            gh ghVar = v20.e;
            q73.h(ov0Var3, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var3, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var3, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var3, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var3, ghVar4, dv1VarH);
            boolean zH6 = ov0Var3.h(kVar2) | ov0Var3.h(context) | ov0Var3.h(cloudRepository) | ov0Var3.f(ey1VarL) | ov0Var3.f(ey1VarL2) | ov0Var3.f(ey1VarL3);
            ov0 ov0Var8 = ov0Var3;
            Object objQ21 = ov0Var8.Q();
            if (zH6 || objQ21 == c30Var2) {
                final ey1 ey1Var30 = ey1Var7;
                final ey1 ey1Var31 = ey1Var19;
                ey1Var11 = ey1Var9;
                final Context context2 = context;
                ov0Var4 = ov0Var8;
                objQ21 = new lu0() { // from class: nr2
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        ((Context) obj).getClass();
                        pr2 pr2Var = new pr2();
                        k kVar3 = kVar2;
                        kVar3.setOnTouchListener(pr2Var);
                        qr2 qr2Var = new qr2(kVar3, kVar3, context2, cloudRepository, ey1Var14, ey1Var30, ey1Var16, ey1VarL, ey1Var23, ey1Var24, ey1Var31, ey1Var11, ey1VarL2, ey1VarL3);
                        g gVar = kVar3.i;
                        if (gVar == null) {
                            kVar3.f.a.add(qr2Var);
                            return kVar3;
                        }
                        qr2Var.a(gVar);
                        return kVar3;
                    }
                };
                ey1Var12 = ey1Var14;
                ey1Var7 = ey1Var30;
                ov0Var4.m0(objQ21);
            } else {
                ov0Var4 = ov0Var8;
                ey1Var12 = ey1Var14;
                ey1Var11 = ey1Var9;
            }
            ov0 ov0Var9 = ov0Var4;
            xq1.c((lu0) objQ21, iw2.c, null, ov0Var9, 48, 4);
            ov0Var = ov0Var9;
            dv1 dv1VarG = zm3.G(ji2.U(k22.k(av1.a, prVar)), 16.0f, 76.0f, 16.0f, 0.0f, 8);
            int i6 = 1;
            yz yzVarA = wz.a(new jo(4.0f, true, new fo(0)), j9.r, ov0Var, 6);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarG);
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
            if (!((Boolean) ey1VarS2.getValue()).booleanValue() || ((Boolean) ey1Var4.getValue()).booleanValue()) {
                ov0Var.c0(-1735793827);
            } else {
                ov0Var.c0(-1856263731);
                d(ke0.N(2131624076, ov0Var), true, ov0Var, 48, 0);
            }
            ov0Var.p(false);
            if (((Boolean) ey1Var20.getValue()).booleanValue()) {
                ov0Var.c0(-1856260322);
                i4 = 2;
                d(ke0.N(2131624924, ov0Var), false, ov0Var, 0, 2);
            } else {
                i4 = 2;
                ov0Var.c0(-1735793827);
            }
            ov0Var.p(false);
            if (((Boolean) ey1Var.getValue()).booleanValue()) {
                ov0Var.c0(-1856257425);
                d(ke0.N(2131624923, ov0Var), true, ov0Var, 48, 0);
            } else {
                ov0Var.c0(-1735793827);
            }
            ov0Var.p(false);
            ov0Var.c0(-1735793827);
            ov0Var.p(false);
            if (((Boolean) ey1Var12.getValue()).booleanValue()) {
                ov0Var.c0(-1735793827);
            } else {
                ov0Var.c0(-1856209340);
                d(ke0.N(2131624980, ov0Var), false, ov0Var, 0, i4);
            }
            ov0Var.p(false);
            if (((Boolean) ey1Var12.getValue()).booleanValue()) {
                c30Var = c30Var2;
                ov0Var.c0(-1735793827);
            } else {
                ov0Var.c0(-1856206406);
                Object objQ22 = ov0Var.Q();
                if (objQ22 == c30Var) {
                    c30Var = c30Var2;
                    objQ22 = new xj2(ey1Var11, 10);
                    ov0Var.m0(objQ22);
                }
                c30Var = c30Var2;
                n51.j((au0) objQ22, null, false, null, null, null, da0.B, ov0Var, 805306374, 510);
            }
            ov0Var.p(false);
            if (((Boolean) ey1Var7.getValue()).booleanValue()) {
                ov0Var.c0(-1856201822);
                boolean z6 = i3 == 2048;
                Object objQ23 = ov0Var.Q();
                if (z6 || objQ23 == c30Var) {
                    z2 = z;
                    objQ23 = new c5(z2, ey1Var7, ey1Var11, i6);
                    ov0Var.m0(objQ23);
                } else {
                    z2 = z;
                }
                n51.j((au0) objQ23, null, false, null, null, null, da0.C, ov0Var, 805306368, 510);
            } else {
                z2 = z;
                ov0Var.c0(-1735793827);
            }
            ov0Var.p(false);
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            ov0Var = ov0Var5;
            z2 = z;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new yl2(context, df1Var, cloudRepository, z2, dv1Var, lu0Var, lu0Var2, d, d2, i);
        }
    }

    public static final void b(se2 se2Var, k kVar, ey1 ey1Var, se2 se2Var2, se2 se2Var3) {
        if (se2Var.e) {
            return;
        }
        lr2 lr2Var = (lr2) ey1Var.getValue();
        if (lr2Var != null) {
            lr2Var.d.setSatelliteView(false);
            lr2Var.i = true;
            lr2Var.n = null;
            lr2Var.m = null;
        }
        if (se2Var2.e) {
            MapRenderer mapRenderer = kVar.m;
            if (mapRenderer != null) {
                mapRenderer.onPause();
            }
            se2Var2.e = false;
        }
        if (se2Var3.e) {
            kVar.f();
            se2Var3.e = false;
        }
        kVar.d();
        se2Var.e = true;
    }

    public static final void c(se2 se2Var, df1 df1Var, se2 se2Var2, k kVar, se2 se2Var3) {
        if (se2Var.e) {
            return;
        }
        we1 we1Var = ((ff1) df1Var.getLifecycle()).d;
        we1 we1Var2 = we1.h;
        if (we1Var.compareTo(we1Var2) >= 0 && !se2Var2.e) {
            if (!kVar.v) {
                a aVarA = a.a(kVar.getContext());
                if (aVarA.c == 0) {
                    aVarA.b.registerReceiver(aVarA, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
                aVarA.c++;
                FileSource.b(kVar.getContext()).activate();
                kVar.v = true;
            }
            g gVar = kVar.i;
            if (gVar != null) {
                gVar.i.getClass();
            }
            MapRenderer mapRenderer = kVar.m;
            if (mapRenderer != null) {
                mapRenderer.onStart();
            }
            se2Var2.e = true;
        }
        we1 we1Var3 = we1.i;
        if (we1Var.compareTo(we1Var3) >= 0 && !se2Var3.e) {
            MapRenderer mapRenderer2 = kVar.m;
            if (mapRenderer2 != null) {
                mapRenderer2.onResume();
            }
            se2Var3.e = true;
        }
        if (we1Var.compareTo(we1Var3) < 0 && se2Var3.e) {
            MapRenderer mapRenderer3 = kVar.m;
            if (mapRenderer3 != null) {
                mapRenderer3.onPause();
            }
            se2Var3.e = false;
        }
        if (we1Var.compareTo(we1Var2) < 0 && se2Var2.e) {
            kVar.f();
            se2Var2.e = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public static final void d(final String str, boolean z, f30 f30Var, final int i, final int i2) {
        final boolean z2;
        boolean z3;
        ee2 ee2VarT;
        boolean z4;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-54097031);
        int i3 = (ov0Var.f(str) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= ov0Var.g(z2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ov0Var.T(i3 & 1, z3)) {
                if (i4 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                e33.a(null, cj2.a(12.0f), hz.c(0.94f, ((kz) ov0Var.j(mz.a)).p), 0L, 0.0f, 0.0f, null, sb.a0(270607124, new j4(z4, str), ov0Var), ov0Var, 12582912, 121);
                z2 = z4;
            } else {
                ov0Var.W();
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: rr2
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM0 = wc0.m0(i | 1);
                        as2.d(str, z2, (f30) obj, iM0, i2);
                        return mf3.a;
                    }
                };
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i3 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ov0Var.T(i3 & 1, z3)) {
            if (i4 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            e33.a(null, cj2.a(12.0f), hz.c(0.94f, ((kz) ov0Var.j(mz.a)).p), 0L, 0.0f, 0.0f, null, sb.a0(270607124, new j4(z4, str), ov0Var), ov0Var, 12582912, 121);
            z2 = z4;
        } else {
            ov0Var.W();
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: rr2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(i | 1);
                    as2.d(str, z2, (f30) obj, iM0, i2);
                    return mf3.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bd  */
    public static final void e(final Context context, final df1 df1Var, final boolean z, final dv1 dv1Var, final lu0 lu0Var, final lu0 lu0Var2, final Double d, final Double d2, f30 f30Var, final int i) {
        int i2;
        ov0 ov0Var;
        ee2 ee2VarT;
        pu0 pu0Var;
        ey1 ey1Var;
        CloudRepository cloudRepository;
        boolean z2;
        boolean z3;
        String str;
        int i3;
        context.getClass();
        df1Var.getClass();
        dv1Var.getClass();
        lu0Var.getClass();
        lu0Var2.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(911392013);
        if ((i & 6) == 0) {
            i2 = (ov0Var2.h(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var2.h(df1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var2.g(z) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var2.f(dv1Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= ov0Var2.h(lu0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ov0Var2.h(lu0Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ov0Var2.f(d) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ov0Var2.f(d2) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if (ov0Var2.T(i4 & 1, (i4 & 4793491) != 4793490)) {
            ov0Var2.d0(414512006);
            kn2 kn2VarA = v91.a(ov0Var2);
            ov0Var2.d0(1274527078);
            ov0Var2.p(false);
            ov0Var2.d0(511388516);
            boolean zF = ov0Var2.f(null) | ov0Var2.f(kn2VarA);
            Object objQ = ov0Var2.Q();
            c30 c30Var = d30.a;
            if (zF || objQ == c30Var) {
                objQ = kn2VarA.a(xe2.a(CloudRepository.class), null);
                ov0Var2.m0(objQ);
            }
            ov0Var2.p(false);
            ov0Var2.p(false);
            CloudRepository cloudRepository2 = (CloudRepository) objQ;
            ey1 ey1VarS = ee0.s(cloudRepository2.getState(), ov0Var2);
            ey1 ey1VarS2 = ee0.s(cloudRepository2.getMapDisplayBinding(), ov0Var2);
            Object objQ2 = ov0Var2.Q();
            if (objQ2 == c30Var) {
                objQ2 = ke0.H(Boolean.FALSE);
                ov0Var2.m0(objQ2);
            }
            ey1 ey1Var2 = (ey1) objQ2;
            Object objQ3 = ov0Var2.Q();
            if (objQ3 == c30Var) {
                objQ3 = ke0.H(Boolean.FALSE);
                ov0Var2.m0(objQ3);
            }
            ey1 ey1Var3 = (ey1) objQ3;
            boolean zH = ov0Var2.h(context) | ov0Var2.h(cloudRepository2);
            Object objQ4 = ov0Var2.Q();
            if (zH || objQ4 == c30Var) {
                ey1Var = ey1Var2;
                cloudRepository = cloudRepository2;
                z2 = true;
                z3 = false;
                str = null;
                yd ydVar = new yd(context, cloudRepository, ey1Var, ey1Var3, (q60) null, 7);
                ov0Var2.m0(ydVar);
                objQ4 = ydVar;
            } else {
                ey1Var = ey1Var2;
                cloudRepository = cloudRepository2;
                z2 = true;
                z3 = false;
                str = null;
            }
            oi0.e(ov0Var2, (pu0) objQ4, cloudRepository);
            CloudAccountState cloudAccountState = (CloudAccountState) ey1VarS.getValue();
            boolean configured = cloudRepository.getConfigured();
            boolean zBooleanValue = ((Boolean) ey1Var.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) ey1Var3.getValue()).booleanValue();
            boolean z4 = ((CloudRuntimeBinding) ey1VarS2.getValue()) != null ? z2 : z3;
            cloudAccountState.getClass();
            gr2 gr2Var = gr2.i;
            gr2 gr2Var2 = gr2.f;
            if (configured) {
                CloudAccount account = cloudAccountState.getAccount();
                if (account != null && account.getSoftwareMembershipRequired() == z2) {
                    gr2Var = gr2.h;
                } else if (!zBooleanValue2) {
                    gr2Var = gr2.e;
                    if (z4) {
                        if (zBooleanValue) {
                            gr2Var = gr2Var2;
                        }
                    } else if (cloudAccountState.getValidated() && cloudAccountState.getHasSession() && cloudAccountState.getAccount() != null) {
                        if (zBooleanValue) {
                            gr2Var = gr2Var2;
                        }
                    } else if (!cloudAccountState.getInitializing() && !cloudAccountState.getChecking()) {
                        gr2Var = gr2.g;
                    }
                }
            }
            if (gr2Var != gr2Var2) {
                ov0Var2.c0(-1502728710);
                dv1 dv1VarK = xp1.k(dv1Var, ((kz) ov0Var2.j(mz.a)).p, o51.p0);
                er1 er1VarC = ws.c(j9.j, z3);
                int iHashCode = Long.hashCode(ov0Var2.T);
                l72 l72VarL = ov0Var2.l();
                dv1 dv1VarH = xp1.H(ov0Var2, dv1VarK);
                w20.b.getClass();
                x30 x30Var = v20.b;
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, v20.e, er1VarC);
                q73.h(ov0Var2, v20.d, l72VarL);
                q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode));
                q73.g(ov0Var2, v20.g);
                q73.h(ov0Var2, v20.c, dv1VarH);
                int iOrdinal = gr2Var.ordinal();
                if (iOrdinal == 2) {
                    i3 = 2131624978;
                } else if (iOrdinal != 3) {
                    i3 = iOrdinal != 4 ? 2131624979 : 2131624985;
                } else {
                    i3 = 2131625027;
                }
                s83.b(ke0.N(i3, ov0Var2), zm3.D(av1.a, 24.0f), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 48, 0, 262140);
                ov0Var2.p(z2);
                ov0Var2.p(z3);
                ee2VarT = ov0Var2.t();
                if (ee2VarT == null) {
                    return;
                }
                final int i5 = 0;
                pu0Var = new pu0() { // from class: mr2
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        mf3 mf3Var = mf3.a;
                        int i7 = i;
                        switch (i6) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM0 = wc0.m0(i7 | 1);
                                as2.e(context, df1Var, z, dv1Var, lu0Var, lu0Var2, d, d2, (f30) obj, iM0);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM1 = wc0.m0(i7 | 1);
                                as2.e(context, df1Var, z, dv1Var, lu0Var, lu0Var2, d, d2, (f30) obj, iM1);
                                break;
                        }
                        return mf3Var;
                    }
                };
            } else {
                boolean z5 = z3;
                ov0Var2.c0(-1519034059);
                ov0Var2.p(z5);
                CloudRuntimeBinding cloudRuntimeBinding = (CloudRuntimeBinding) ey1VarS2.getValue();
                String userId = cloudRuntimeBinding != null ? cloudRuntimeBinding.getUserId() : str;
                CloudRuntimeBinding cloudRuntimeBinding2 = (CloudRuntimeBinding) ey1VarS2.getValue();
                Object objH = ov0Var2.H(userId, cloudRuntimeBinding2 != null ? cloudRuntimeBinding2.getDeviceId() : str);
                CloudRuntimeBinding cloudRuntimeBinding3 = (CloudRuntimeBinding) ey1VarS2.getValue();
                ov0Var2.a0(-325549321, ov0Var2.H(objH, cloudRuntimeBinding3 != null ? cloudRuntimeBinding3.getPublicKeyFingerprint() : str));
                int i6 = i4 << 3;
                ov0Var = ov0Var2;
                a(context, df1Var, cloudRepository, z, dv1Var, lu0Var, lu0Var2, d, d2, ov0Var, (i4 & 126) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024));
                ov0Var.p(z5);
            }
            ee2VarT.d = pu0Var;
        }
        ov0Var = ov0Var2;
        ov0Var.W();
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final int i7 = 1;
            pu0Var = new pu0() { // from class: mr2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    int i8 = i7;
                    mf3 mf3Var = mf3.a;
                    int i9 = i;
                    switch (i8) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM0 = wc0.m0(i9 | 1);
                            as2.e(context, df1Var, z, dv1Var, lu0Var, lu0Var2, d, d2, (f30) obj, iM0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM1 = wc0.m0(i9 | 1);
                            as2.e(context, df1Var, z, dv1Var, lu0Var, lu0Var2, d, d2, (f30) obj, iM1);
                            break;
                    }
                    return mf3Var;
                }
            };
            ee2VarT.d = pu0Var;
        }
    }

    public static final Object f(Context context, rp1 rp1Var) {
        OfflineManager offlineManager;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(rp1Var), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (OfflineManager.c) {
            context.getClass();
            offlineManager = OfflineManager.d;
            if (offlineManager == null) {
                offlineManager = new OfflineManager(context);
                OfflineManager.d = offlineManager;
            }
        }
        offlineManager.b(new yr2(offlineManager, new zr2(cancellableContinuationImpl)));
        return cancellableContinuationImpl.getResult();
    }
}
