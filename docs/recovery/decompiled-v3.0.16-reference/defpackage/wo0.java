package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.vincenthzr.locationspoofer.data.motion.MotionController;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class wo0 {
    public static final j52 a = new j52(xp1.d(4294967295L), xp1.d(4291876830L), xp1.d(4293849846L), xp1.d(4294967295L), xp1.d(4280559919L), xp1.d(4283916394L), xp1.d(4291764782L));
    public static final j52 b = new j52(xp1.d(4280034099L), xp1.d(4281349693L), xp1.d(4280362541L), xp1.d(4281349693L), xp1.d(4293324275L), xp1.d(4287337630L), xp1.d(4294463817L));
    public static final long c = xp1.d(4281895933L);
    public static final long d = xp1.d(4281245763L);
    public static final long e = xp1.d(4291991842L);

    public static final void a(MotionController.State state, j52 j52Var, au0 au0Var, au0 au0Var2, au0 au0Var3, au0 au0Var4, au0 au0Var5, f30 f30Var, int i) {
        au0 au0Var6;
        au0 au0Var7;
        ov0 ov0Var;
        ov0 ov0Var2;
        boolean z;
        ov0 ov0Var3;
        ov0 ov0Var4 = (ov0) f30Var;
        ov0Var4.e0(-1166114013);
        int i2 = (ov0Var4.h(state) ? 4 : 2) | i | (ov0Var4.f(j52Var) ? 32 : 16);
        if ((i & 384) == 0) {
            au0Var6 = au0Var;
            i2 |= ov0Var4.h(au0Var6) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        } else {
            au0Var6 = au0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var4.h(au0Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            au0Var7 = au0Var3;
            i2 |= ov0Var4.h(au0Var7) ? 16384 : 8192;
        } else {
            au0Var7 = au0Var3;
        }
        if ((196608 & i) == 0) {
            i2 |= ov0Var4.h(au0Var4) ? 131072 : 65536;
        }
        if (ov0Var4.T(i2 & 1, (599187 & i2) != 599186)) {
            dv1 dv1VarE = iw2.e(av1.a, 1.0f);
            kk2 kk2VarA = jk2.a(new jo(6.0f, true, new fo(0)), j9.o, ov0Var4, 6);
            int iHashCode = Long.hashCode(ov0Var4.T);
            l72 l72VarL = ov0Var4.l();
            dv1 dv1VarH = xp1.H(ov0Var4, dv1VarE);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var4.g0();
            if (ov0Var4.S) {
                ov0Var4.k(x30Var);
            } else {
                ov0Var4.p0();
            }
            q73.h(ov0Var4, v20.e, kk2VarA);
            q73.h(ov0Var4, v20.d, l72VarL);
            q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var4, v20.g);
            q73.h(ov0Var4, v20.c, dv1VarH);
            if (state.getHasRoute()) {
                ov0Var4.c0(1570212186);
                if (state.getPaused()) {
                    ov0Var4.c0(-2027556637);
                    g(ig0.u(), ke0.N(2131624475, ov0Var4), d, hz.c, state.getActive() && !state.getReturning(), au0Var2, ov0Var4, 27654 | ((i2 << 9) & 3670016));
                    ov0Var2 = ov0Var4;
                    ov0Var2.p(false);
                    z = false;
                } else {
                    ov0Var4.c0(-2027547522);
                    x01 x01VarB = mc0.e;
                    if (x01VarB == null) {
                        w01 w01Var = new w01("Rounded.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = nh3.a;
                        qy2 qy2Var = new qy2(hz.b);
                        nx0 nx0VarI = p91.i(8.0f, 19.0f);
                        nx0VarI.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        nx0VarI.k(10.0f, 7.0f);
                        nx0VarI.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        nx0VarI.o(-2.0f, 0.9f, -2.0f, 2.0f);
                        nx0VarI.s(10.0f);
                        nx0VarI.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        nx0VarI.e();
                        nx0VarI.m(14.0f, 7.0f);
                        nx0VarI.s(10.0f);
                        nx0VarI.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        nx0VarI.o(2.0f, -0.9f, 2.0f, -2.0f);
                        nx0VarI.k(18.0f, 7.0f);
                        nx0VarI.g(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        nx0VarI.o(-2.0f, 0.9f, -2.0f, 2.0f);
                        nx0VarI.e();
                        w01.a(w01Var, nx0VarI.a, qy2Var);
                        x01VarB = w01Var.b();
                        mc0.e = x01VarB;
                    }
                    g(x01VarB, ke0.N(2131624468, ov0Var4), e, hz.c, state.getActive() && !state.getReturning(), au0Var6, ov0Var4, 27654 | ((i2 << 12) & 3670016));
                    ov0Var2 = ov0Var4;
                    z = false;
                    ov0Var2.p(false);
                }
            } else {
                ov0Var2 = ov0Var4;
                z = false;
                ov0Var2.c0(1551140707);
            }
            ov0Var2.p(z);
            if (state.getRecording()) {
                ov0Var2.c0(1570842044);
                ov0 ov0Var5 = ov0Var2;
                g(hd0.E(), ke0.N(2131624479, ov0Var2), j52Var.g, hz.c, true, au0Var4, ov0Var5, 221190 | ((i2 << 3) & 3670016));
                ov0Var3 = ov0Var5;
                ov0Var3.p(false);
            } else {
                ov0Var2.c0(1571078791);
                x01 x01VarB2 = dh0.a;
                if (x01VarB2 == null) {
                    w01 w01Var2 = new w01("Rounded.FiberManualRecord", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i4 = nh3.a;
                    qy2 qy2Var2 = new qy2(hz.b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new q62(12.0f, 12.0f));
                    arrayList.add(new y62(-8.0f, 0.0f));
                    arrayList.add(new u62(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f));
                    arrayList.add(new u62(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f));
                    w01.a(w01Var2, arrayList, qy2Var2);
                    x01VarB2 = w01Var2.b();
                    dh0.a = x01VarB2;
                }
                ov0 ov0Var6 = ov0Var2;
                g(x01VarB2, ke0.N(2131624474, ov0Var2), hz.c(0.12f, j52Var.g), j52Var.g, state.getActive(), au0Var7, ov0Var6, 6 | ((i2 << 6) & 3670016));
                ov0Var3 = ov0Var6;
                ov0Var3.p(false);
            }
            x01 x01VarB3 = hd0.c;
            if (x01VarB3 == null) {
                w01 w01Var3 = new w01("Rounded.Remove", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i5 = nh3.a;
                qy2 qy2Var3 = new qy2(hz.b);
                ArrayList arrayList2 = new ArrayList(32);
                arrayList2.add(new q62(18.0f, 13.0f));
                arrayList2.add(new o62(6.0f));
                arrayList2.add(new v62(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f));
                arrayList2.add(new a72(0.45f, -1.0f, 1.0f, -1.0f));
                arrayList2.add(new w62(12.0f));
                arrayList2.add(new v62(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f));
                arrayList2.add(new a72(-0.45f, 1.0f, -1.0f, 1.0f));
                arrayList2.add(m62.c);
                w01.a(w01Var3, arrayList2, qy2Var3);
                x01VarB3 = w01Var3.b();
                hd0.c = x01VarB3;
            }
            ov0 ov0Var7 = ov0Var3;
            g(x01VarB3, ke0.N(2131624465, ov0Var3), j52Var.c, j52Var.f, true, au0Var5, ov0Var7, 1769478);
            ov0Var = ov0Var7;
            ov0Var.p(true);
        } else {
            ov0Var = ov0Var4;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new l10(state, j52Var, au0Var, au0Var2, au0Var3, au0Var4, au0Var5, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
    public static final void b(MotionController.State state, j52 j52Var, dv1 dv1Var, au0 au0Var, f30 f30Var, int i) {
        long j;
        boolean z;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-280836945);
        int i2 = i | (ov0Var.h(state) ? 4 : 2) | (ov0Var.f(j52Var) ? 32 : 16) | (ov0Var.f(dv1Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            av1 av1Var = av1.a;
            dv1 dv1VarD = zm3.D(av1Var, 12.0f);
            er1 er1VarC = ws.c(j9.f, false);
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
            q73.h(ov0Var, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            dv1 dv1VarK = iw2.k(av1Var, 52.0f);
            bj2 bj2Var = cj2.a;
            dv1 dv1VarN = xp1.n(hd0.O(dv1VarK, 12.0f, bj2Var, 0L, 0L, 28), bj2Var);
            long j2 = j52Var.a;
            iy0 iy0Var = o51.p0;
            dv1 dv1VarK2 = xp1.k(dv1VarN, j2, iy0Var);
            boolean active = state.getActive();
            long j3 = c;
            if (!active) {
                j = j52Var.f;
            } else if (state.getReturning()) {
                j = j3;
            } else if (state.getPaused()) {
                j = e;
            } else if (state.getMode() == MotionController.Mode.ROUTE) {
                j = d;
            } else {
                j = j3;
            }
            dv1 dv1VarD2 = ji2.w(dv1VarK2, 2.0f, j, bj2Var).d(dv1Var);
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = new oo0(au0Var);
                ov0Var.m0(objQ);
            }
            dv1 dv1VarA = m33.a(dv1VarD2, mf3.a, (PointerInputEventHandler) objQ);
            er1 er1VarC2 = ws.c(j9.j, false);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarA);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC2);
            q73.h(ov0Var, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH2);
            t01.a(hd0.y(), ke0.N(2131624482, ov0Var), iw2.k(av1Var, 24.0f), j3, ov0Var, 3456, 0);
            ov0Var.p(true);
            if (state.getRecording()) {
                ov0Var.c0(-832976207);
                z = false;
                ws.a(xp1.k(xp1.n(zm3.D(xp1.k(xp1.n(iw2.k(k22.k(av1Var, j9.h), 14.0f), bj2Var), j52Var.a, iy0Var), 2.0f), bj2Var), j52Var.g, iy0Var), ov0Var, 0);
            } else {
                z = false;
                ov0Var.c0(-846715655);
            }
            ov0Var.p(z);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new lr1(state, j52Var, dv1Var, au0Var, i);
        }
    }

    public static final void c(final MotionController.State state, final pu0 pu0Var, final pu0 pu0Var2, final au0 au0Var, final au0 au0Var2, final lu0 lu0Var, final au0 au0Var3, final au0 au0Var4, final lu0 lu0Var2, final au0 au0Var5, final lu0 lu0Var3, f30 f30Var, final int i) {
        lu0 lu0Var4;
        ee2 ee2VarT;
        pu0 pu0Var3;
        j52 j52Var;
        int i2;
        boolean z;
        c30 c30Var;
        ey1 ey1Var;
        boolean z2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(306880405);
        int i3 = i | (ov0Var.h(state) ? 4 : 2) | (ov0Var.h(pu0Var) ? 32 : 16) | (ov0Var.h(pu0Var2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var.h(au0Var2) ? 16384 : 8192) | (ov0Var.h(lu0Var) ? 131072 : 65536) | (ov0Var.h(au0Var3) ? 1048576 : 524288) | (ov0Var.h(au0Var4) ? 8388608 : 4194304) | (ov0Var.h(lu0Var2) ? 67108864 : 33554432) | (ov0Var.h(au0Var5) ? 536870912 : 268435456);
        char c2 = ov0Var.h(lu0Var3) ? (char) 4 : (char) 2;
        if (ov0Var.T(i3 & 1, ((i3 & 306783379) == 306783378 && (c2 & 3) == 2) ? false : true)) {
            j52 j52Var2 = n51.w(ov0Var) ? b : a;
            Object objQ = ov0Var.Q();
            c30 c30Var2 = d30.a;
            if (objQ == c30Var2) {
                objQ = ke0.H(Boolean.FALSE);
                ov0Var.m0(objQ);
            }
            ey1 ey1Var2 = (ey1) objQ;
            Boolean boolValueOf = Boolean.valueOf(state.getHasPendingRecording());
            int i4 = c2 & 14;
            j52 j52Var3 = j52Var2;
            boolean zH = ov0Var.h(state) | (i4 == 4);
            Object objQ2 = ov0Var.Q();
            if (zH || objQ2 == c30Var2) {
                objQ2 = new po0(state, lu0Var3, ey1Var2, null);
                ov0Var.m0(objQ2);
            }
            oi0.e(ov0Var, (pu0) objQ2, boolValueOf);
            boolean z3 = (i3 & 112) == 32;
            Object objQ3 = ov0Var.Q();
            if (z3 || objQ3 == c30Var2) {
                objQ3 = new ro0(pu0Var);
                ov0Var.m0(objQ3);
            }
            av1 av1Var = av1.a;
            dv1 dv1VarA = m33.a(av1Var, mf3.a, (PointerInputEventHandler) objQ3);
            if (((Boolean) ey1Var2.getValue()).booleanValue()) {
                ov0Var.c0(-1710280405);
                Object objQ4 = ov0Var.Q();
                if (objQ4 == c30Var2) {
                    z2 = false;
                    objQ4 = new mo0(ey1Var2, 0);
                    ov0Var.m0(objQ4);
                } else {
                    z2 = false;
                }
                b(state, j52Var3, dv1VarA, (au0) objQ4, ov0Var, (i3 & 14) | 3072);
                ov0Var.p(z2);
                ee2 ee2VarT2 = ov0Var.t();
                if (ee2VarT2 == null) {
                    return;
                }
                final int i5 = 0;
                ee2VarT = ee2VarT2;
                pu0Var3 = new pu0(state, pu0Var, pu0Var2, au0Var, au0Var2, lu0Var, au0Var3, au0Var4, lu0Var2, au0Var5, lu0Var3, i, i5) { // from class: no0
                    public final /* synthetic */ int e;
                    public final /* synthetic */ MotionController.State f;
                    public final /* synthetic */ pu0 g;
                    public final /* synthetic */ pu0 h;
                    public final /* synthetic */ au0 i;
                    public final /* synthetic */ au0 j;
                    public final /* synthetic */ lu0 k;
                    public final /* synthetic */ au0 l;
                    public final /* synthetic */ au0 m;
                    public final /* synthetic */ lu0 n;
                    public final /* synthetic */ au0 o;
                    public final /* synthetic */ lu0 p;

                    {
                        this.e = i5;
                    }

                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = this.e;
                        mf3 mf3Var = mf3.a;
                        switch (i6) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM0 = wc0.m0(1);
                                wo0.c(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (f30) obj, iM0);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM1 = wc0.m0(1);
                                wo0.c(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (f30) obj, iM1);
                                break;
                        }
                        return mf3Var;
                    }
                };
            } else {
                ov0Var.c0(-1721451379);
                ov0Var.p(false);
                dv1 dv1VarN = xp1.n(hd0.O(iw2.o(zm3.D(av1Var, 12.0f), 208.0f), 14.0f, cj2.a(22.0f), 0L, 0L, 28), cj2.a(22.0f));
                long j = j52Var3.a;
                long j2 = j52Var3.b;
                iy0 iy0Var = o51.p0;
                dv1 dv1VarG = zm3.G(ji2.w(xp1.k(dv1VarN, j, iy0Var), 1.0f, hz.c(0.6f, j2), cj2.a(22.0f)), 12.0f, 0.0f, 12.0f, 12.0f, 2);
                yz yzVarA = wz.a(new jo(10.0f, true, new fo(0)), j9.s, ov0Var, 54);
                int iHashCode = Long.hashCode(ov0Var.T);
                l72 l72VarL = ov0Var.l();
                dv1 dv1VarH = xp1.H(ov0Var, dv1VarG);
                w20.b.getClass();
                x30 x30Var = v20.b;
                ov0Var.g0();
                if (ov0Var.S) {
                    ov0Var.k(x30Var);
                } else {
                    ov0Var.p0();
                }
                gh ghVar = v20.e;
                q73.h(ov0Var, ghVar, yzVarA);
                gh ghVar2 = v20.d;
                q73.h(ov0Var, ghVar2, l72VarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                gh ghVar3 = v20.f;
                q73.h(ov0Var, ghVar3, numValueOf);
                wa waVar = v20.g;
                q73.g(ov0Var, waVar);
                gh ghVar4 = v20.c;
                q73.h(ov0Var, ghVar4, dv1VarH);
                ov0Var.c0(1977327385);
                dv1 dv1VarD = iw2.g(iw2.e(av1Var, 1.0f), 18.0f).d(dv1VarA);
                er1 er1VarC = ws.c(j9.j, false);
                int iHashCode2 = Long.hashCode(ov0Var.T);
                l72 l72VarL2 = ov0Var.l();
                dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarD);
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
                ws.a(xp1.k(xp1.n(iw2.l(av1Var, 28.0f, 4.0f), cj2.a(2.0f)), j2, iy0Var), ov0Var, 0);
                boolean z4 = true;
                ov0Var.p(true);
                if (state.getHasPendingRecording()) {
                    ov0Var.c0(1977765414);
                    e(j52Var3, lu0Var2, au0Var5, ov0Var, (i3 >> 21) & 1008);
                    ov0Var.p(false);
                    ov0Var.p(false);
                    lu0Var4 = lu0Var;
                } else {
                    ov0Var.c0(1965473015);
                    ov0Var.p(false);
                    d(state.getJoystickEnabled(), j52Var3, pu0Var2, ov0Var, i3 & 896);
                    if (state.getActive()) {
                        j52Var = j52Var3;
                        i2 = i3;
                        z = false;
                        c30Var = c30Var2;
                        ey1Var = ey1Var2;
                        ov0Var.c0(1965473015);
                    } else {
                        ov0Var.c0(1978000518);
                        i2 = i3;
                        ey1Var = ey1Var2;
                        c30Var = c30Var2;
                        j52Var = j52Var3;
                        s83.b(ke0.N(2131624480, ov0Var), null, j52Var3.f, v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                        ov0Var = ov0Var;
                        z = false;
                    }
                    ov0Var.p(z);
                    int i6 = i2 & 14;
                    lu0Var4 = lu0Var;
                    j52 j52Var4 = j52Var;
                    f(state, j52Var4, lu0Var4, ov0Var, ((i2 >> 9) & 896) | i6);
                    Object objQ5 = ov0Var.Q();
                    if (objQ5 == c30Var) {
                        z4 = true;
                        objQ5 = new mo0(ey1Var, 1);
                        ov0Var.m0(objQ5);
                    } else {
                        z4 = true;
                    }
                    au0 au0Var6 = (au0) objQ5;
                    int i7 = i2 >> 3;
                    int i8 = i6 | 1572864 | (i7 & 896) | (i7 & 7168);
                    int i9 = i2 >> 6;
                    ov0 ov0Var2 = ov0Var;
                    a(state, j52Var4, au0Var, au0Var2, au0Var3, au0Var4, au0Var6, ov0Var2, i8 | (57344 & i9) | (i9 & 458752));
                    ov0Var = ov0Var2;
                    ov0Var.p(z);
                }
                ov0Var.p(z4);
            }
            ee2VarT.d = pu0Var3;
        }
        lu0Var4 = lu0Var;
        ov0Var.W();
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final int i10 = 1;
            final lu0 lu0Var5 = lu0Var4;
            pu0Var3 = new pu0(state, pu0Var, pu0Var2, au0Var, au0Var2, lu0Var5, au0Var3, au0Var4, lu0Var2, au0Var5, lu0Var3, i, i10) { // from class: no0
                public final /* synthetic */ int e;
                public final /* synthetic */ MotionController.State f;
                public final /* synthetic */ pu0 g;
                public final /* synthetic */ pu0 h;
                public final /* synthetic */ au0 i;
                public final /* synthetic */ au0 j;
                public final /* synthetic */ lu0 k;
                public final /* synthetic */ au0 l;
                public final /* synthetic */ au0 m;
                public final /* synthetic */ lu0 n;
                public final /* synthetic */ au0 o;
                public final /* synthetic */ lu0 p;

                {
                    this.e = i10;
                }

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    int i11 = this.e;
                    mf3 mf3Var = mf3.a;
                    switch (i11) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM0 = wc0.m0(1);
                            wo0.c(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (f30) obj, iM0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM1 = wc0.m0(1);
                            wo0.c(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (f30) obj, iM1);
                            break;
                    }
                    return mf3Var;
                }
            };
            ee2VarT.d = pu0Var3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(boolean z, j52 j52Var, pu0 pu0Var, f30 f30Var, int i) {
        char c2;
        Object obj;
        iy0 iy0Var = o51.p0;
        pr prVar = j9.j;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1196169164);
        int i2 = i | (ov0Var.g(z) ? 4 : 2) | (ov0Var.f(j52Var) ? 32 : 16) | (ov0Var.h(pu0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            float fR = ((xb0) ov0Var.j(z30.h)).R(38.0f);
            Object objQ = ov0Var.Q();
            Object obj2 = d30.a;
            if (objQ == obj2) {
                c2 = 1;
                Object objH = ke0.H(new c12(0L));
                ov0Var.m0(objH);
                obj = objH;
            } else {
                c2 = 1;
                obj = objQ;
            }
            ey1 ey1Var = (ey1) obj;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 14;
            char c3 = i3 == 4 ? c2 : (char) 0;
            Object objQ2 = ov0Var.Q();
            Object obj3 = objQ2;
            if (c3 != 0 || objQ2 == obj2) {
                Object so0Var = new so0(z, ey1Var, (q60) null);
                ov0Var.m0(so0Var);
                obj3 = so0Var;
            }
            oi0.e(ov0Var, (pu0) obj3, boolValueOf);
            av1 av1Var = av1.a;
            dv1 dv1VarC = am1.c(iw2.k(av1Var, 120.0f), z ? 1.0f : 0.4f);
            bj2 bj2Var = cj2.a;
            dv1 dv1VarW = ji2.w(xp1.k(xp1.n(dv1VarC, bj2Var), j52Var.c, iy0Var), 1.0f, hz.c(0.5f, j52Var.b), bj2Var);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            int i4 = ((i2 & 896) == 256 ? c2 : (char) 0) | (i3 == 4 ? c2 : (char) 0) | (ov0Var.c(fR) ? 1 : 0);
            Object objQ3 = ov0Var.Q();
            Object obj4 = objQ3;
            if (i4 != 0 || objQ3 == obj2) {
                Object vo0Var = new vo0(z, pu0Var, ey1Var, fR);
                ov0Var.m0(vo0Var);
                obj4 = vo0Var;
            }
            dv1 dv1VarA = m33.a(dv1VarW, boolValueOf2, (PointerInputEventHandler) obj4);
            er1 er1VarC = ws.c(prVar, false);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarA);
            w20.b.getClass();
            au0 au0Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(au0Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, er1VarC);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            ov0Var.c0(2106465252);
            l9[] l9VarArr = new l9[4];
            l9VarArr[0] = j9.g;
            l9VarArr[c2] = j9.m;
            l9VarArr[2] = j9.i;
            l9VarArr[3] = j9.k;
            Iterator it = am1.G(l9VarArr).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else {
                    ws.a(xp1.k(xp1.n(iw2.k(zm3.D(k22.k(av1Var, (l9) it.next()), 6.0f), 4.0f), cj2.a), hz.c(0.45f, j52Var.f), iy0Var), ov0Var, 0);
                }
            }
            ov0Var.p(false);
            Object objQ4 = ov0Var.Q();
            Object obj5 = objQ4;
            if (objQ4 == obj2) {
                Object di0Var = new di0(ey1Var, 10);
                ov0Var.m0(di0Var);
                obj5 = di0Var;
            }
            dv1 dv1VarK = iw2.k(xq1.K(av1Var, (lu0) obj5), 44.0f);
            float f = z ? 6.0f : 0.0f;
            bj2 bj2Var2 = cj2.a;
            dv1 dv1VarK2 = xp1.k(xp1.n(hd0.O(dv1VarK, f, bj2Var2, 0L, 0L, 28), bj2Var2), c, iy0Var);
            er1 er1VarC2 = ws.c(prVar, false);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarK2);
            w20.b.getClass();
            au0 au0Var2 = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(au0Var2);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, er1VarC2);
            q73.h(ov0Var, v20.d, l72VarL2);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode2));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH2);
            ws.a(xp1.k(xp1.n(iw2.k(av1Var, 14.0f), bj2Var2), hz.c(0.85f, hz.c), iy0Var), ov0Var, 0);
            boolean z2 = c2;
            ov0Var.p(z2);
            ov0Var.p(z2);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new o2(z, j52Var, pu0Var, i);
        }
    }

    public static final void e(j52 j52Var, lu0 lu0Var, au0 au0Var, f30 f30Var, int i) {
        int i2;
        boolean z;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-141407773);
        if ((i & 6) == 0) {
            i2 = (ov0Var.f(j52Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.h(lu0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            String str = new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault()).format(new Date());
            str.getClass();
            String strO = ke0.O(2131624466, new Object[]{str}, ov0Var);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = ke0.H(strO);
                ov0Var.m0(objQ);
            }
            ey1 ey1Var = (ey1) objQ;
            String str2 = (String) ey1Var.getValue();
            bj2 bj2VarA = cj2.a(12.0f);
            q93 q93Var = new q93(0L, v63.c(14), null, 0L, 0L, 0, 0L, 16777213);
            long j = j52Var.e;
            long j2 = j52Var.b;
            long j3 = c;
            int i3 = i2;
            t63 t63VarK = j9.k(j, j, 0L, 0L, 0L, 0L, j3, j3, j2, 0L, 0L, 0L, ov0Var, 2147477244);
            av1 av1Var = av1.a;
            dv1 dv1VarE = iw2.e(av1Var, 1.0f);
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                objQ2 = new di0(ey1Var, 11);
                ov0Var.m0(objQ2);
            }
            ee0.i(str2, (lu0) objQ2, dv1VarE, false, q93Var, null, ym3.i, null, null, null, false, null, null, null, true, 0, 0, bj2VarA, t63VarK, ov0Var, 12779952, 12582912, 1965912);
            ov0Var = ov0Var;
            dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
            kk2 kk2VarA = jk2.a(new jo(6.0f, true, new fo(0)), j9.o, ov0Var, 6);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarE2);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, kk2VarA);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            g(k22.u(), ke0.N(2131624467, ov0Var), j52Var.c, j52Var.f, true, au0Var, ov0Var, 196614 | ((i3 << 12) & 3670016));
            x01 x01VarT = k22.t();
            String strN = ke0.N(2131624477, ov0Var);
            long j4 = hz.c;
            boolean z2 = !l13.k0((String) ey1Var.getValue());
            boolean z3 = (i3 & 112) == 32;
            Object objQ3 = ov0Var.Q();
            if (z3 || objQ3 == c30Var) {
                z = true;
                objQ3 = new y60(lu0Var, ey1Var, 1);
                ov0Var.m0(objQ3);
            } else {
                z = true;
            }
            g(x01VarT, strN, j3, j4, z2, (au0) objQ3, ov0Var, 27654);
            ov0Var.p(z);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new rf(j52Var, lu0Var, au0Var, i, 7);
        }
    }

    public static final void f(MotionController.State state, j52 j52Var, lu0 lu0Var, f30 f30Var, int i) {
        ov0 ov0Var;
        float f;
        wb1 wb1Var;
        boolean z;
        iy0 iy0Var = o51.p0;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-489501429);
        MotionController.State state2 = state;
        int i2 = (ov0Var2.h(state2) ? 4 : 2) | i | (ov0Var2.f(j52Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= ov0Var2.h(lu0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var2.T(i2 & 1, (i2 & 147) != 146)) {
            Map mapN = jq1.N(new i52("WALKING", ke0.N(2131624473, ov0Var2)), new i52(DebugCoroutineInfoImplKt.RUNNING, ke0.N(2131624472, ov0Var2)), new i52("CYCLING", ke0.N(2131624470, ov0Var2)), new i52("DRIVING", ke0.N(2131624471, ov0Var2)));
            MotionController.Companion companion = MotionController.Companion;
            List<MotionController.SpeedPreset> presets = companion.getPRESETS();
            MotionController.SpeedPreset preset = state2.getPreset();
            List<MotionController.SpeedPreset> presets2 = companion.getPRESETS();
            if (presets2 == null || !presets2.isEmpty()) {
                Iterator<T> it = presets2.iterator();
                while (it.hasNext()) {
                    if (o51.f(((MotionController.SpeedPreset) it.next()).getName(), preset.getName())) {
                        preset = null;
                        break;
                    }
                }
            }
            ArrayList arrayListX0 = zy.x0(presets, preset != null ? am1.F(preset) : uj0.e);
            dv1 dv1VarO = av1.a;
            float f2 = 1.0f;
            ArrayList arrayList = arrayListX0;
            dv1 dv1VarD = zm3.D(xp1.k(xp1.n(iw2.e(dv1VarO, 1.0f), cj2.a(11.0f)), j52Var.c, iy0Var), 3.0f);
            kk2 kk2VarA = jk2.a(new jo(2.0f, true, new fo(0)), j9.o, ov0Var2, 6);
            int iHashCode = Long.hashCode(ov0Var2.T);
            l72 l72VarL = ov0Var2.l();
            dv1 dv1VarH = xp1.H(ov0Var2, dv1VarD);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, v20.e, kk2VarA);
            q73.h(ov0Var2, v20.d, l72VarL);
            q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var2, v20.g);
            q73.h(ov0Var2, v20.c, dv1VarH);
            ov0Var2.c0(-1797870648);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                ArrayList arrayList2 = arrayList;
                int i4 = i3 + 1;
                MotionController.SpeedPreset speedPreset = (MotionController.SpeedPreset) arrayList2.get(i3);
                boolean zF = o51.f(speedPreset.getName(), state2.getPreset().getName());
                wb1 wb1Var2 = new wb1(f2, true);
                if (zF) {
                    wb1Var = wb1Var2;
                    f = f2;
                    dv1VarO = hd0.O(dv1VarO, 2.0f, cj2.a(8.0f), 0L, 0L, 28);
                } else {
                    f = f2;
                    wb1Var = wb1Var2;
                }
                dv1 dv1VarK = xp1.k(xp1.n(wb1Var.d(dv1VarO), cj2.a(8.0f)), zF ? j52Var.d : hz.f, iy0Var);
                boolean active = state2.getActive();
                boolean zH = ((i2 & 896) == 256) | ov0Var2.h(speedPreset);
                Object objQ = ov0Var2.Q();
                int i5 = 14;
                if (zH || objQ == d30.a) {
                    objQ = new m5(i5, lu0Var, speedPreset);
                    ov0Var2.m0(objQ);
                }
                dv1 dv1VarF = zm3.F(zm3.m(dv1VarK, active, null, (au0) objQ, 14), 0.0f, 6.0f, 1);
                er1 er1VarC = ws.c(j9.j, false);
                int iHashCode2 = Long.hashCode(ov0Var2.T);
                l72 l72VarL2 = ov0Var2.l();
                dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarF);
                w20.b.getClass();
                x30 x30Var2 = v20.b;
                ov0Var2.g0();
                iy0 iy0Var2 = iy0Var;
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var2);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, v20.e, er1VarC);
                q73.h(ov0Var2, v20.d, l72VarL2);
                q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode2));
                q73.g(ov0Var2, v20.g);
                q73.h(ov0Var2, v20.c, dv1VarH2);
                String strH = (String) mapN.get(speedPreset.getName());
                if (strH == null) {
                    z = false;
                    strH = az2.h(ov0Var2, -1245180243, 2131624469, ov0Var2, false);
                } else {
                    z = false;
                    ov0Var2.c0(-1245180956);
                    ov0Var2.p(false);
                }
                ov0 ov0Var3 = ov0Var2;
                s83.b(strH, null, zF ? c : j52Var.f, v63.c(12), zF ? jr0.j : jr0.h, null, 0L, null, null, 0L, 0, false, 1, 0, null, ov0Var3, 24576, 24576, 245674);
                ov0Var3.p(true);
                size = size;
                ov0Var2 = ov0Var3;
                i3 = i4;
                f2 = f;
                dv1VarO = dv1VarO;
                iy0Var = iy0Var2;
                arrayList = arrayList2;
                mapN = mapN;
                i2 = i2;
                state2 = state;
            }
            ov0Var = ov0Var2;
            ov0Var.p(false);
            ov0Var.p(true);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new rf(state, j52Var, lu0Var, i, 8);
        }
    }

    public static final void g(final x01 x01Var, final String str, final long j, final long j2, final boolean z, final au0 au0Var, f30 f30Var, final int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-639593687);
        int i3 = i & 6;
        lk2 lk2Var = lk2.a;
        if (i3 == 0) {
            i2 = (ov0Var.f(lk2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.f(x01Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.f(str) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.e(j) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= ov0Var.e(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ov0Var.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ov0Var.h(au0Var) ? 1048576 : 524288;
        }
        if (ov0Var.T(i2 & 1, (599187 & i2) != 599186)) {
            av1 av1Var = av1.a;
            dv1 dv1VarM = zm3.m(xp1.k(xp1.n(am1.c(iw2.g(lk2.a(lk2Var, av1Var, 1.0f), 38.0f), z ? 1.0f : 0.45f), cj2.a(11.0f)), j, o51.p0), z, null, au0Var, 14);
            er1 er1VarC = ws.c(j9.j, false);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarM);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, er1VarC);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            int i4 = i2 >> 3;
            t01.a(x01Var, str, iw2.k(av1Var, 20.0f), j2, ov0Var, (i4 & 14) | 384 | (i4 & 112) | (i4 & 7168), 0);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: lo0
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wo0.g(x01Var, str, j, j2, z, au0Var, (f30) obj, wc0.m0(i | 1));
                    return mf3.a;
                }
            };
        }
    }
}
