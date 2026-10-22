package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.ImportExportCounts;
import com.vincenthzr.locationspoofer.data.model.ImportExportSelection;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.sync.AccountSyncManager;
import com.vincenthzr.locationspoofer.data.sync.SyncAccess;
import com.vincenthzr.locationspoofer.data.sync.SyncSelection;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class hd0 {
    public static x01 a;
    public static x01 b;
    public static x01 c;
    public static x01 d;
    public static x01 e;

    public static final int A(me1 me1Var, long j, aj3 aj3Var) {
        long jT;
        int iZ;
        y83 y83VarD = me1Var.d();
        if (y83VarD != null) {
            sw1 sw1Var = y83VarD.a.b;
            pa1 pa1VarC = me1Var.c();
            if (pa1VarC != null && (iZ = z(sw1Var, (jT = pa1VarC.T(j)), aj3Var)) != -1) {
                return sw1Var.g(c12.a((sw1Var.b(iZ) + sw1Var.f(iZ)) / 2.0f, 1, jT));
            }
        }
        return -1;
    }

    public static final x01 B() {
        x01 x01Var = b;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0VarI = p91.i(12.0f, 12.0f);
        nx0VarI.g(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        nx0VarI.o(-1.79f, -4.0f, -4.0f, -4.0f);
        nx0VarI.o(-4.0f, 1.79f, -4.0f, 4.0f);
        nx0VarI.o(1.79f, 4.0f, 4.0f, 4.0f);
        nx0VarI.e();
        nx0VarI.m(12.0f, 14.0f);
        nx0VarI.g(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        nx0VarI.s(1.0f);
        nx0VarI.g(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        nx0VarI.i(14.0f);
        nx0VarI.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        nx0VarI.s(-1.0f);
        nx0VarI.g(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var);
        x01 x01VarB = w01Var.b();
        b = x01VarB;
        return x01VarB;
    }

    public static final long C(me1 me1Var, pe2 pe2Var, int i) {
        b81 b81Var = u92.u;
        y83 y83VarD = me1Var.d();
        sw1 sw1Var = y83VarD != null ? y83VarD.a.b : null;
        pa1 pa1VarC = me1Var.c();
        return (sw1Var == null || pa1VarC == null) ? f93.b : sw1Var.h(pe2Var.j(pa1VarC.T(0L)), i, b81Var);
    }

    public static final long D(me1 me1Var, pe2 pe2Var, pe2 pe2Var2, int i) {
        long jC = C(me1Var, pe2Var, i);
        if (f93.c(jC)) {
            return f93.b;
        }
        long jC2 = C(me1Var, pe2Var2, i);
        if (f93.c(jC2)) {
            return f93.b;
        }
        int i2 = (int) (jC >> 32);
        int i3 = (int) (jC2 & 4294967295L);
        return g93.a(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final x01 E() {
        x01 x01Var = e;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Stop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(8.0f, 6.0f);
        nx0Var.i(8.0f);
        nx0Var.g(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        nx0Var.s(8.0f);
        nx0Var.g(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        nx0Var.h(8.0f);
        nx0Var.g(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        nx0Var.r(8.0f);
        nx0Var.g(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        e = x01VarB;
        return x01VarB;
    }

    public static final hg2 F(x83 x83Var, int i) {
        w83 w83Var = x83Var.a;
        sw1 sw1Var = x83Var.b;
        if (w83Var.a.f.length() != 0) {
            int iD = sw1Var.d(i);
            if ((i != 0 && iD == sw1Var.d(i - 1)) || (i != w83Var.a.f.length() && iD == sw1Var.d(i + 1))) {
                return x83Var.a(i);
            }
        }
        return x83Var.h(i);
    }

    public static q60 G(q60 q60Var) {
        q60 q60VarIntercepted;
        q60Var.getClass();
        r60 r60Var = q60Var instanceof r60 ? (r60) q60Var : null;
        return (r60Var == null || (q60VarIntercepted = r60Var.intercepted()) == null) ? q60Var : q60VarIntercepted;
    }

    public static final boolean H(x83 x83Var, int i) {
        sw1 sw1Var = x83Var.b;
        int iD = sw1Var.d(i);
        return i == x83Var.g(iD) || i == sw1Var.c(iD, false) ? x83Var.h(i) != x83Var.a(i) : x83Var.a(i) != x83Var.a(i - 1);
    }

    public static final boolean I(long j) {
        return (j & 2) != 0;
    }

    public static final boolean J(long j) {
        return (j & 1) != 0;
    }

    public static final boolean K(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean L(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean M(int i) {
        int type;
        return (!L(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static void N(k91 k91Var) {
        MutableStateFlow mutableStateFlow;
        w72 w72Var;
        w72 w72Var2;
        do {
            mutableStateFlow = ke2.z;
            w72Var = (w72) mutableStateFlow.getValue();
            m72 m72VarC = w72Var.g;
            jg1 jg1Var = (jg1) m72VarC.get(k91Var);
            if (jg1Var == null) {
                w72Var2 = w72Var;
            } else {
                Object obj = jg1Var.a;
                Object obj2 = jg1Var.b;
                zc3 zc3Var = m72VarC.e;
                zc3 zc3VarV = zc3Var.v(k91Var != null ? k91Var.hashCode() : 0, 0, k91Var);
                if (zc3Var != zc3VarV) {
                    m72VarC = zc3VarV == null ? m72.g : new m72(zc3VarV, m72VarC.f - 1);
                }
                j9 j9Var = j9.K;
                if (obj != j9Var) {
                    Object obj3 = m72VarC.get(obj);
                    obj3.getClass();
                    m72VarC = m72VarC.c(obj, new jg1(((jg1) obj3).a, obj2));
                }
                if (obj2 != j9Var) {
                    Object obj4 = m72VarC.get(obj2);
                    obj4.getClass();
                    m72VarC = m72VarC.c(obj2, new jg1(obj, ((jg1) obj4).b));
                }
                Object obj5 = obj != j9Var ? w72Var.e : obj2;
                if (obj2 != j9Var) {
                    obj = w72Var.f;
                }
                w72Var2 = new w72(obj5, obj, m72VarC);
            }
            if (w72Var == w72Var2) {
                return;
            }
        } while (!mutableStateFlow.compareAndSet(w72Var, w72Var2));
    }

    public static dv1 O(dv1 dv1Var, float f, au2 au2Var, long j, long j2, int i) {
        boolean z = false;
        if ((i & 4) != 0 && td0.a(f, 0.0f) > 0) {
            z = true;
        }
        return (td0.a(f, 0.0f) > 0 || z) ? dv1Var.d(new yt2(f, au2Var, z, (i & 8) != 0 ? pw0.a : j, (i & 16) != 0 ? pw0.a : j2)) : dv1Var;
    }

    public static final void P(p92 p92Var, long j, lu0 lu0Var, boolean z) {
        MotionEvent motionEventA = p92Var.a();
        if (motionEventA == null) {
            fo.i("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        lu0Var.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventA.setAction(action);
    }

    public static final long Q(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static Object R(pu0 pu0Var, Object obj, q60 q60Var) {
        pu0Var.getClass();
        q60Var.getClass();
        y70 context = q60Var.getContext();
        Object t51Var = context == sj0.e ? new t51(q60Var) : new u51(q60Var, context);
        da0.o(2, pu0Var);
        return pu0Var.invoke(obj, t51Var);
    }

    public static final void a(final dv1 dv1Var, final fy1 fy1Var, final ey1 ey1Var, final co2 co2Var, final au2 au2Var, final long j, final float f, final p10 p10Var, f30 f30Var, final int i) {
        float f2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(848986741);
        int i2 = i | (ov0Var.f(dv1Var) ? 4 : 2) | (ov0Var.f(fy1Var) ? 32 : 16) | (ov0Var.f(co2Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var.f(au2Var) ? 16384 : 8192) | (ov0Var.e(j) ? 131072 : 65536) | (ov0Var.c(0.0f) ? 1048576 : 524288) | (ov0Var.c(f) ? 8388608 : 4194304) | (ov0Var.f(null) ? 67108864 : 33554432) | (ov0Var.h(p10Var) ? 536870912 : 268435456);
        if (ov0Var.T(i2 & 1, (i2 & 306783379) != 306783378)) {
            mc3 mc3VarN = h73.n(fy1Var, ov0Var, (((i2 >> 3) & 14) | 48) & 126, 0);
            yz2 yz2VarK = mc0.K(vv1.f, ov0Var);
            yz2 yz2VarK2 = mc0.K(vv1.h, ov0Var);
            qd3 qd3Var = o51.v0;
            Object objC = mc3VarN.c();
            w52 w52Var = mc3VarN.d;
            boolean zBooleanValue = ((Boolean) objC).booleanValue();
            ov0Var.c0(143964305);
            float f3 = zBooleanValue ? 1.0f : 0.8f;
            ov0Var.p(false);
            Float fValueOf = Float.valueOf(f3);
            boolean zBooleanValue2 = ((Boolean) w52Var.getValue()).booleanValue();
            ov0Var.c0(143964305);
            float f4 = zBooleanValue2 ? 1.0f : 0.8f;
            ov0Var.p(false);
            Float fValueOf2 = Float.valueOf(f4);
            mc3VarN.f();
            ov0Var.c0(-745957716);
            ov0Var.p(false);
            kc3 kc3VarK = h73.k(mc3VarN, fValueOf, fValueOf2, yz2VarK, qd3Var, ov0Var, 0);
            boolean zBooleanValue3 = ((Boolean) mc3VarN.c()).booleanValue();
            ov0Var.c0(892761509);
            float f5 = zBooleanValue3 ? 1.0f : 0.0f;
            ov0Var.p(false);
            Float fValueOf3 = Float.valueOf(f5);
            boolean zBooleanValue4 = ((Boolean) w52Var.getValue()).booleanValue();
            ov0Var.c0(892761509);
            float f6 = zBooleanValue4 ? 1.0f : 0.0f;
            ov0Var.p(false);
            Float fValueOf4 = Float.valueOf(f6);
            mc3VarN.f();
            ov0Var.c0(2839488);
            ov0Var.p(false);
            kc3 kc3VarK2 = h73.k(mc3VarN, fValueOf3, fValueOf4, yz2VarK2, qd3Var, ov0Var, 0);
            boolean zBooleanValue5 = ((Boolean) ov0Var.j(t31.a)).booleanValue();
            boolean zG = ov0Var.g(zBooleanValue5) | ov0Var.f(kc3VarK) | ((i2 & 112) == 32) | ov0Var.f(kc3VarK2);
            Object objQ = ov0Var.Q();
            if (zG || objQ == d30.a) {
                f2 = 0.0f;
                xc xcVar = new xc(zBooleanValue5, fy1Var, ey1Var, kc3VarK, kc3VarK2);
                ov0Var.m0(xcVar);
                objQ = xcVar;
            } else {
                f2 = 0.0f;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            e33.a(am1.z(av1.a, (lu0) objQ), au2Var, j, 0L, f2, f, null, sb.a0(-1463404422, new bt1(dv1Var, co2Var, p10Var), ov0Var), ov0Var, (i3 & 896) | (i3 & 112) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
            ov0Var = ov0Var;
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0(fy1Var, ey1Var, co2Var, au2Var, j, f, p10Var, i) { // from class: at1
                public final /* synthetic */ fy1 f;
                public final /* synthetic */ ey1 g;
                public final /* synthetic */ co2 h;
                public final /* synthetic */ au2 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ float k;
                public final /* synthetic */ p10 l;

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(385);
                    hd0.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (f30) obj, iM0);
                    return mf3.a;
                }
            };
        }
    }

    public static final void b(p10 p10Var, au0 au0Var, dv1 dv1Var, boolean z, ss1 ss1Var, z42 z42Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1325192924);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(p10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.h(au0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.f(dv1Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.h(null) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= ov0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ov0Var.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ov0Var.f(ss1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ov0Var.f(z42Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= ov0Var.f(null) ? 67108864 : 33554432;
        }
        if (ov0Var.T(i2 & 1, (38347923 & i2) != 38347922)) {
            dv1 dv1VarC = zm3.C(iw2.n(iw2.e(zm3.l(dv1Var, null, sh2.a(true, 0.0f, 6), z, null, au0Var, 24), 1.0f), 112.0f, 280.0f, 8), z42Var);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
            int iT = ks.T(ov0Var);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarC);
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
            gh ghVar = v20.f;
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT))) {
                az2.r(iT, ov0Var, iT, ghVar);
            }
            q73.h(ov0Var, v20.c, dv1VarH);
            s83.a(((je3) ov0Var.j(le3.a)).m, sb.a0(865999929, new ct1(ss1Var, z, p10Var), ov0Var), ov0Var, 48);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new bd(p10Var, au0Var, dv1Var, z, ss1Var, z42Var, i);
        }
    }

    public static final void c(ji0 ji0Var, final boolean z, final au0 au0Var, final su0 su0Var, f30 f30Var, int i) {
        int i2;
        String str;
        String str2;
        String str3;
        au0Var.getClass();
        su0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1386241766);
        if ((i & 6) == 0) {
            i2 = (ov0Var.f(ji0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.h(su0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            final boolean z2 = ji0Var != null;
            Object objQ = ov0Var.Q();
            String str4 = "";
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                if (ji0Var == null || (str3 = ji0Var.b) == null) {
                    str3 = "";
                }
                objQ = ke0.H(str3);
                ov0Var.m0(objQ);
            }
            final ey1 ey1Var = (ey1) objQ;
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                if (ji0Var == null || (str2 = ji0Var.a) == null) {
                    str2 = "";
                }
                objQ2 = ke0.H(str2);
                ov0Var.m0(objQ2);
            }
            final ey1 ey1Var2 = (ey1) objQ2;
            Object objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                t52 t52Var = new t52(ji0Var != null ? ji0Var.d : -60);
                ov0Var.m0(t52Var);
                objQ3 = t52Var;
            }
            final t52 t52Var2 = (t52) objQ3;
            Object objQ4 = ov0Var.Q();
            if (objQ4 == c30Var) {
                if (ji0Var != null && (str = ji0Var.c) != null) {
                    str4 = str;
                }
                objQ4 = ke0.H(str4);
                ov0Var.m0(objQ4);
            }
            final ey1 ey1Var3 = (ey1) objQ4;
            Object objQ5 = ov0Var.Q();
            if (objQ5 == c30Var) {
                objQ5 = ke0.H(Boolean.valueOf(ji0Var != null ? ji0Var.e : true));
                ov0Var.m0(objQ5);
            }
            final ey1 ey1Var4 = (ey1) objQ5;
            sb.F(au0Var, new qc0(3), sb.a0(210561711, new pu0() { // from class: wh0
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ov0 ov0Var2 = (ov0) f30Var2;
                    if (ov0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        dv1 dv1VarC = iw2.c(iw2.e(av1.a, 0.92f), 0.85f);
                        bj2 bj2VarA = cj2.a(24.0f);
                        aw awVarT = ym3.t(((kz) ov0Var2.j(mz.a)).p, 0L, ov0Var2, 0, 14);
                        cw cwVarU = ym3.u(62, 8.0f);
                        final boolean z3 = z;
                        final au0 au0Var2 = au0Var;
                        final boolean z4 = z2;
                        final ey1 ey1Var5 = ey1Var;
                        final ey1 ey1Var6 = ey1Var2;
                        final t52 t52Var3 = t52Var2;
                        final ey1 ey1Var7 = ey1Var3;
                        final ey1 ey1Var8 = ey1Var4;
                        final su0 su0Var2 = su0Var;
                        sb.C(dv1VarC, bj2VarA, awVarT, cwVarU, sb.a0(-2124185219, new qu0() { // from class: xh0
                            /* JADX WARN: Code duplicated, block: B:114:0x07b6  */
                            /* JADX WARN: Code duplicated, block: B:115:0x07ba  */
                            /* JADX WARN: Code duplicated, block: B:118:0x07e2  */
                            /* JADX WARN: Code duplicated, block: B:120:0x07e7  */
                            /* JADX WARN: Code duplicated, block: B:122:0x07ec  */
                            /* JADX WARN: Code duplicated, block: B:124:0x07f9  */
                            @Override // defpackage.qu0
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                long j;
                                float f;
                                long j2;
                                float f2;
                                long j3;
                                float f3;
                                float f4;
                                long j4;
                                float f5;
                                long jC;
                                c30 c30Var2;
                                boolean z5;
                                x30 x30Var;
                                jr0 jr0Var;
                                long jC2;
                                f30 f30Var3 = (f30) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                u92 u92Var = am1.i;
                                or orVar = j9.p;
                                nr nrVar = j9.r;
                                ho hoVar = am1.g;
                                pr prVar = j9.j;
                                ((zz) obj3).getClass();
                                ov0 ov0Var3 = (ov0) f30Var3;
                                if (ov0Var3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    dv1 dv1VarD = zm3.D(iw2.d(), 20.0f);
                                    yz yzVarA = wz.a(hoVar, nrVar, ov0Var3, 0);
                                    int iHashCode = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ = ov0Var3.z();
                                    dv1 dv1VarH = xp1.H(ov0Var3, dv1VarD);
                                    w20.b.getClass();
                                    x30 x30Var2 = v20.b;
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    gh ghVar = v20.e;
                                    q73.h(ov0Var3, ghVar, yzVarA);
                                    gh ghVar2 = v20.d;
                                    q73.h(ov0Var3, ghVar2, l72VarZ);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    gh ghVar3 = v20.f;
                                    q73.h(ov0Var3, ghVar3, numValueOf);
                                    wa waVar = v20.g;
                                    q73.g(ov0Var3, waVar);
                                    gh ghVar4 = v20.c;
                                    q73.h(ov0Var3, ghVar4, dv1VarH);
                                    av1 av1Var = av1.a;
                                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                                    kk2 kk2VarA = jk2.a(u92Var, orVar, ov0Var3, 54);
                                    int iHashCode2 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ2 = ov0Var3.z();
                                    dv1 dv1VarH2 = xp1.H(ov0Var3, dv1VarE);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, kk2VarA);
                                    q73.h(ov0Var3, ghVar2, l72VarZ2);
                                    az2.s(iHashCode2, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH2);
                                    kk2 kk2VarA2 = jk2.a(am1.e, orVar, ov0Var3, 48);
                                    int iHashCode3 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ3 = ov0Var3.z();
                                    dv1 dv1VarH3 = xp1.H(ov0Var3, av1Var);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, kk2VarA2);
                                    q73.h(ov0Var3, ghVar2, l72VarZ3);
                                    az2.s(iHashCode3, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH3);
                                    dv1 dv1VarL = xp1.l(xp1.n(iw2.k(av1Var, 36.0f), cj2.a(11.0f)), hz.c(0.12f, xp1.d(4288423856L)));
                                    er1 er1VarC = ws.c(prVar, false);
                                    int iHashCode4 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ4 = ov0Var3.z();
                                    dv1 dv1VarH4 = xp1.H(ov0Var3, dv1VarL);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, er1VarC);
                                    q73.h(ov0Var3, ghVar2, l72VarZ4);
                                    az2.s(iHashCode4, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH4);
                                    t01.a(am1.v(), null, iw2.k(av1Var, 20.0f), xp1.d(4288423856L), ov0Var3, 3504, 0);
                                    ov0Var3.r();
                                    gh0.h(ov0Var3, iw2.o(av1Var, 10.0f));
                                    s83.b(ke0.N(z4 ? 2131624403 : 2131624785, ov0Var3), null, dh0.p(ov0Var3).q, v63.b(16.5d), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                                    ov0Var3.r();
                                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 28.0f), cj2.a);
                                    boolean z6 = z3;
                                    dv1 dv1VarL2 = xp1.l(dv1VarN, z6 ? hz.c(0.08f, hz.c) : hz.c(0.05f, hz.b));
                                    au0 au0Var3 = au0Var2;
                                    dv1 dv1VarA = bk.a(dv1VarL2, au0Var3);
                                    er1 er1VarC2 = ws.c(prVar, false);
                                    int iHashCode5 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ5 = ov0Var3.z();
                                    dv1 dv1VarH5 = xp1.H(ov0Var3, dv1VarA);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, er1VarC2);
                                    q73.h(ov0Var3, ghVar2, l72VarZ5);
                                    az2.s(iHashCode5, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH5);
                                    t01.a(k22.u(), ke0.N(2131624114, ov0Var3), iw2.k(av1Var, 14.0f), hz.c(0.6f, dh0.p(ov0Var3).q), ov0Var3, 384, 0);
                                    ov0Var3.r();
                                    ov0Var3.r();
                                    gh0.h(ov0Var3, iw2.g(av1Var, 12.0f));
                                    dv1 dv1VarW = zm3.W(new wb1(1.0f, true), zm3.O(ov0Var3));
                                    yz yzVarA2 = wz.a(new jo(12.0f, true, new fo(0)), nrVar, ov0Var3, 6);
                                    int iHashCode6 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ6 = ov0Var3.z();
                                    dv1 dv1VarH6 = xp1.H(ov0Var3, dv1VarW);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, yzVarA2);
                                    q73.h(ov0Var3, ghVar2, l72VarZ6);
                                    az2.s(iHashCode6, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH6);
                                    pr prVar2 = prVar;
                                    dv1 dv1VarE2 = zm3.E(ji2.w(xp1.l(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f)), z6 ? hz.c(0.04f, hz.c) : hz.c(0.03f, hz.b)), 0.8f, hz.c(z6 ? 0.12f : 0.06f, dh0.p(ov0Var3).A), cj2.a(14.0f)), 14.0f, 10.0f);
                                    yz yzVarA3 = wz.a(hoVar, nrVar, ov0Var3, 0);
                                    int iHashCode7 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ7 = ov0Var3.z();
                                    dv1 dv1VarH7 = xp1.H(ov0Var3, dv1VarE2);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, yzVarA3);
                                    q73.h(ov0Var3, ghVar2, l72VarZ7);
                                    az2.s(iHashCode7, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH7);
                                    String strN = ke0.N(2131624071, ov0Var3);
                                    long jB = v63.b(11.5d);
                                    long jC3 = hz.c(0.5f, dh0.p(ov0Var3).q);
                                    jr0 jr0Var2 = jr0.h;
                                    s83.b(strN, null, jC3, jB, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                                    gh0.h(ov0Var3, iw2.g(av1Var, 4.0f));
                                    ey1 ey1Var9 = ey1Var5;
                                    String str5 = (String) ey1Var9.getValue();
                                    q93 q93Var = new q93(dh0.p(ov0Var3).q, v63.b(14.5d), jr0.i, 0L, 0L, 0, 0L, 16777208);
                                    dv1 dv1VarE3 = iw2.e(av1Var, 1.0f);
                                    Object objQ6 = ov0Var3.Q();
                                    c30 c30Var3 = d30.a;
                                    if (objQ6 == c30Var3) {
                                        objQ6 = new f4(ey1Var9, 24);
                                        ov0Var3.m0(objQ6);
                                    }
                                    xq.a(str5, (lu0) objQ6, dv1VarE3, false, q93Var, null, null, true, 0, 0, null, null, null, null, sb.a0(1256962494, new h5(ey1Var9, 4), ov0Var3), ov0Var3, 100663728, 196608, 32472);
                                    ov0Var3.r();
                                    dv1 dv1VarN2 = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f));
                                    if (z6) {
                                        j = hz.c;
                                        f = 0.04f;
                                    } else {
                                        j = hz.b;
                                        f = 0.03f;
                                    }
                                    dv1 dv1VarE4 = zm3.E(ji2.w(xp1.l(dv1VarN2, hz.c(f, j)), 0.8f, hz.c(z6 ? 0.12f : 0.06f, dh0.p(ov0Var3).A), cj2.a(14.0f)), 14.0f, 10.0f);
                                    yz yzVarA4 = wz.a(hoVar, nrVar, ov0Var3, 0);
                                    int iHashCode8 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ8 = ov0Var3.z();
                                    dv1 dv1VarH8 = xp1.H(ov0Var3, dv1VarE4);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, yzVarA4);
                                    q73.h(ov0Var3, ghVar2, l72VarZ8);
                                    az2.s(iHashCode8, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH8);
                                    s83.b(ke0.N(2131624069, ov0Var3), null, hz.c(0.5f, dh0.p(ov0Var3).q), v63.b(11.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                                    gh0.h(ov0Var3, iw2.g(av1Var, 4.0f));
                                    ey1 ey1Var10 = ey1Var6;
                                    String str6 = (String) ey1Var10.getValue();
                                    q93 q93Var2 = new q93(dh0.p(ov0Var3).q, v63.c(14), jr0Var2, 0L, 0L, 0, 0L, 16777208);
                                    dv1 dv1VarE5 = iw2.e(av1Var, 1.0f);
                                    Object objQ7 = ov0Var3.Q();
                                    if (objQ7 == c30Var3) {
                                        objQ7 = new f4(ey1Var10, 25);
                                        ov0Var3.m0(objQ7);
                                    }
                                    xq.a(str6, (lu0) objQ7, dv1VarE5, false, q93Var2, null, null, true, 0, 0, null, null, null, null, sb.a0(-1701246617, new h5(ey1Var10, 5), ov0Var3), ov0Var3, 100663728, 196608, 32472);
                                    ov0Var3.r();
                                    dv1 dv1VarN3 = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f));
                                    if (z6) {
                                        j2 = hz.c;
                                        f2 = 0.04f;
                                    } else {
                                        j2 = hz.b;
                                        f2 = 0.03f;
                                    }
                                    c30 c30Var4 = c30Var3;
                                    dv1 dv1VarE6 = zm3.E(ji2.w(xp1.l(dv1VarN3, hz.c(f2, j2)), 0.8f, hz.c(z6 ? 0.12f : 0.06f, dh0.p(ov0Var3).A), cj2.a(14.0f)), 14.0f, 10.0f);
                                    yz yzVarA5 = wz.a(hoVar, nrVar, ov0Var3, 0);
                                    int iHashCode9 = Long.hashCode(ks.U(ov0Var3));
                                    l72 l72VarZ9 = ov0Var3.z();
                                    dv1 dv1VarH9 = xp1.H(ov0Var3, dv1VarE6);
                                    ov0Var3.g0();
                                    if (ov0Var3.D()) {
                                        ov0Var3.k(x30Var2);
                                    } else {
                                        ov0Var3.p0();
                                    }
                                    q73.h(ov0Var3, ghVar, yzVarA5);
                                    q73.h(ov0Var3, ghVar2, l72VarZ9);
                                    az2.s(iHashCode9, ov0Var3, ghVar3, ov0Var3, waVar);
                                    q73.h(ov0Var3, ghVar4, dv1VarH9);
                                    t52 t52Var4 = t52Var3;
                                    s83.b(ke0.O(2131624072, new Object[]{Integer.valueOf(t52Var4.g())}, ov0Var3), null, hz.c(0.5f, dh0.p(ov0Var3).q), v63.b(11.5d), jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                                    ov0 ov0Var4 = ov0Var3;
                                    gh0.h(ov0Var4, iw2.g(av1Var, 6.0f));
                                    dv1 dv1VarE7 = iw2.e(av1Var, 1.0f);
                                    kk2 kk2VarA3 = jk2.a(new jo(6.0f, true, new fo(0)), j9.o, ov0Var4, 6);
                                    int iHashCode10 = Long.hashCode(ks.U(ov0Var4));
                                    l72 l72VarZ10 = ov0Var4.z();
                                    dv1 dv1VarH10 = xp1.H(ov0Var4, dv1VarE7);
                                    ov0Var4.g0();
                                    if (ov0Var4.D()) {
                                        ov0Var4.k(x30Var2);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    q73.h(ov0Var4, ghVar, kk2VarA3);
                                    q73.h(ov0Var4, ghVar2, l72VarZ10);
                                    az2.s(iHashCode10, ov0Var4, ghVar3, ov0Var4, waVar);
                                    q73.h(ov0Var4, ghVar4, dv1VarH10);
                                    ov0Var4.c0(-1687602656);
                                    for (i52 i52Var : am1.G(g83.g(-45, "-45 极近"), g83.g(-60, "-60 良好"), g83.g(-75, "-75 一般"), g83.g(-90, "-90 较远"))) {
                                        int iIntValue3 = ((Number) i52Var.e).intValue();
                                        String str7 = (String) i52Var.f;
                                        boolean z7 = t52Var4.g() == iIntValue3;
                                        dv1 dv1VarN4 = xp1.n(new wb1(1.0f, true), cj2.a(8.0f));
                                        if (z7) {
                                            jC = xp1.d(4288423856L);
                                        } else {
                                            if (z6) {
                                                j4 = hz.c;
                                                f5 = 0.06f;
                                            } else {
                                                j4 = hz.b;
                                                f5 = 0.04f;
                                            }
                                            jC = hz.c(f5, j4);
                                        }
                                        dv1 dv1VarL3 = xp1.l(dv1VarN4, jC);
                                        boolean zD = ov0Var4.d(iIntValue3);
                                        Object objQ8 = ov0Var4.Q();
                                        if (zD) {
                                            c30Var2 = c30Var4;
                                        } else {
                                            c30Var2 = c30Var4;
                                            if (objQ8 != c30Var2) {
                                                z5 = false;
                                            }
                                            dv1 dv1VarF = zm3.F(bk.a(dv1VarL3, (au0) objQ8), 0.0f, 6.0f, 1);
                                            pr prVar3 = prVar2;
                                            er1 er1VarC3 = ws.c(prVar3, z5);
                                            int iHashCode11 = Long.hashCode(ks.U(ov0Var4));
                                            l72 l72VarZ11 = ov0Var4.z();
                                            dv1 dv1VarH11 = xp1.H(ov0Var4, dv1VarF);
                                            w20.b.getClass();
                                            x30Var = v20.b;
                                            ov0Var4.g0();
                                            if (ov0Var4.D()) {
                                                ov0Var4.k(x30Var);
                                            } else {
                                                ov0Var4.p0();
                                            }
                                            q73.h(ov0Var4, v20.e, er1VarC3);
                                            q73.h(ov0Var4, v20.d, l72VarZ11);
                                            q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode11));
                                            q73.g(ov0Var4, v20.g);
                                            q73.h(ov0Var4, v20.c, dv1VarH11);
                                            long jB2 = v63.b(10.5d);
                                            if (z7) {
                                                jr0Var = jr0.j;
                                            } else {
                                                jr0Var = jr0.g;
                                            }
                                            jr0 jr0Var3 = jr0Var;
                                            if (z7) {
                                                ov0Var4.c0(-928274511);
                                                ov0Var4.s();
                                                jC2 = hz.c;
                                            } else {
                                                ov0Var4.c0(-928272993);
                                                jC2 = hz.c(0.75f, ((kz) ov0Var4.j(mz.a)).q);
                                                ov0Var4.s();
                                            }
                                            c30Var4 = c30Var2;
                                            ov0 ov0Var5 = ov0Var4;
                                            s83.b(str7, null, jC2, jB2, jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var5, 24576, 0, 262058);
                                            ov0Var4 = ov0Var5;
                                            ov0Var4.r();
                                            prVar2 = prVar3;
                                        }
                                        z5 = false;
                                        objQ8 = new yh0(iIntValue3, t52Var4, 0);
                                        ov0Var4.m0(objQ8);
                                        dv1 dv1VarF2 = zm3.F(bk.a(dv1VarL3, (au0) objQ8), 0.0f, 6.0f, 1);
                                        pr prVar4 = prVar2;
                                        er1 er1VarC4 = ws.c(prVar4, z5);
                                        int iHashCode12 = Long.hashCode(ks.U(ov0Var4));
                                        l72 l72VarZ12 = ov0Var4.z();
                                        dv1 dv1VarH12 = xp1.H(ov0Var4, dv1VarF2);
                                        w20.b.getClass();
                                        x30Var = v20.b;
                                        ov0Var4.g0();
                                        if (ov0Var4.D()) {
                                            ov0Var4.k(x30Var);
                                        } else {
                                            ov0Var4.p0();
                                        }
                                        q73.h(ov0Var4, v20.e, er1VarC4);
                                        q73.h(ov0Var4, v20.d, l72VarZ12);
                                        q73.h(ov0Var4, v20.f, Integer.valueOf(iHashCode12));
                                        q73.g(ov0Var4, v20.g);
                                        q73.h(ov0Var4, v20.c, dv1VarH12);
                                        long jB3 = v63.b(10.5d);
                                        if (z7) {
                                            jr0Var = jr0.j;
                                        } else {
                                            jr0Var = jr0.g;
                                        }
                                        jr0 jr0Var4 = jr0Var;
                                        if (z7) {
                                            ov0Var4.c0(-928274511);
                                            ov0Var4.s();
                                            jC2 = hz.c;
                                        } else {
                                            ov0Var4.c0(-928272993);
                                            jC2 = hz.c(0.75f, ((kz) ov0Var4.j(mz.a)).q);
                                            ov0Var4.s();
                                        }
                                        c30Var4 = c30Var2;
                                        ov0 ov0Var6 = ov0Var4;
                                        s83.b(str7, null, jC2, jB3, jr0Var4, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 24576, 0, 262058);
                                        ov0Var4 = ov0Var6;
                                        ov0Var4.r();
                                        prVar2 = prVar4;
                                    }
                                    pr prVar5 = prVar2;
                                    c30 c30Var5 = c30Var4;
                                    ov0Var4.s();
                                    ov0Var4.r();
                                    ov0Var4.r();
                                    dv1 dv1VarL4 = xp1.l(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f)), z6 ? hz.c(0.04f, hz.c) : hz.c(0.03f, hz.b));
                                    hh0 hh0Var = mz.a;
                                    dv1 dv1VarE8 = zm3.E(ji2.w(dv1VarL4, 0.8f, hz.c(z6 ? 0.12f : 0.06f, ((kz) ov0Var4.j(hh0Var)).A), cj2.a(14.0f)), 14.0f, 10.0f);
                                    yz yzVarA6 = wz.a(hoVar, nrVar, ov0Var4, 0);
                                    int iHashCode13 = Long.hashCode(ks.U(ov0Var4));
                                    l72 l72VarZ13 = ov0Var4.z();
                                    dv1 dv1VarH13 = xp1.H(ov0Var4, dv1VarE8);
                                    w20.b.getClass();
                                    x30 x30Var3 = v20.b;
                                    ov0Var4.g0();
                                    if (ov0Var4.D()) {
                                        ov0Var4.k(x30Var3);
                                    } else {
                                        ov0Var4.p0();
                                    }
                                    gh ghVar5 = v20.e;
                                    q73.h(ov0Var4, ghVar5, yzVarA6);
                                    gh ghVar6 = v20.d;
                                    q73.h(ov0Var4, ghVar6, l72VarZ13);
                                    Integer numValueOf2 = Integer.valueOf(iHashCode13);
                                    gh ghVar7 = v20.f;
                                    q73.h(ov0Var4, ghVar7, numValueOf2);
                                    wa waVar2 = v20.g;
                                    q73.g(ov0Var4, waVar2);
                                    gh ghVar8 = v20.c;
                                    q73.h(ov0Var4, ghVar8, dv1VarH13);
                                    ov0 ov0Var7 = ov0Var4;
                                    s83.b(ke0.N(2131624074, ov0Var4), null, hz.c(0.5f, ((kz) ov0Var4.j(hh0Var)).q), v63.b(11.5d), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 1597440, 0, 262058);
                                    gh0.h(ov0Var7, iw2.g(av1Var, 4.0f));
                                    ey1 ey1Var11 = ey1Var7;
                                    String str8 = (String) ey1Var11.getValue();
                                    q93 q93Var3 = new q93(((kz) ov0Var7.j(hh0Var)).q, v63.b(12.5d), null, 0L, 0L, 0, 0L, 16777212);
                                    dv1 dv1VarE9 = iw2.e(av1Var, 1.0f);
                                    Object objQ9 = ov0Var7.Q();
                                    if (objQ9 == c30Var5) {
                                        objQ9 = new f4(ey1Var11, 26);
                                        ov0Var7.m0(objQ9);
                                    }
                                    xq.a(str8, (lu0) objQ9, dv1VarE9, false, q93Var3, null, null, false, 3, 2, null, null, null, null, sb.a0(-558787931, new h5(ey1Var11, 6), ov0Var7), ov0Var7, 805306800, 196614, 31192);
                                    ov0Var7.r();
                                    dv1 dv1VarN5 = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(14.0f));
                                    if (z6) {
                                        j3 = hz.c;
                                        f3 = 0.04f;
                                    } else {
                                        j3 = hz.b;
                                        f3 = 0.03f;
                                    }
                                    dv1 dv1VarE10 = zm3.E(ji2.w(xp1.l(dv1VarN5, hz.c(f3, j3)), 0.8f, hz.c(z6 ? 0.12f : 0.06f, ((kz) ov0Var7.j(hh0Var)).A), cj2.a(14.0f)), 14.0f, 6.0f);
                                    yz yzVarA7 = wz.a(hoVar, nrVar, ov0Var7, 0);
                                    int iHashCode14 = Long.hashCode(ks.U(ov0Var7));
                                    l72 l72VarZ14 = ov0Var7.z();
                                    dv1 dv1VarH14 = xp1.H(ov0Var7, dv1VarE10);
                                    ov0Var7.g0();
                                    if (ov0Var7.D()) {
                                        ov0Var7.k(x30Var3);
                                    } else {
                                        ov0Var7.p0();
                                    }
                                    q73.h(ov0Var7, ghVar5, yzVarA7);
                                    q73.h(ov0Var7, ghVar6, l72VarZ14);
                                    az2.s(iHashCode14, ov0Var7, ghVar7, ov0Var7, waVar2);
                                    q73.h(ov0Var7, ghVar8, dv1VarH14);
                                    dv1 dv1VarF3 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 6.0f, 1);
                                    kk2 kk2VarA4 = jk2.a(u92Var, orVar, ov0Var7, 54);
                                    int iHashCode15 = Long.hashCode(ks.U(ov0Var7));
                                    l72 l72VarZ15 = ov0Var7.z();
                                    dv1 dv1VarH15 = xp1.H(ov0Var7, dv1VarF3);
                                    ov0Var7.g0();
                                    if (ov0Var7.D()) {
                                        ov0Var7.k(x30Var3);
                                    } else {
                                        ov0Var7.p0();
                                    }
                                    q73.h(ov0Var7, ghVar5, kk2VarA4);
                                    q73.h(ov0Var7, ghVar6, l72VarZ15);
                                    az2.s(iHashCode15, ov0Var7, ghVar7, ov0Var7, waVar2);
                                    q73.h(ov0Var7, ghVar8, dv1VarH15);
                                    s83.b(ke0.N(2131624386, ov0Var7), null, ((kz) ov0Var7.j(hh0Var)).q, v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 24576, 0, 262122);
                                    ey1 ey1Var12 = ey1Var8;
                                    boolean zBooleanValue = ((Boolean) ey1Var12.getValue()).booleanValue();
                                    Object objQ10 = ov0Var7.Q();
                                    if (objQ10 == c30Var5) {
                                        objQ10 = new f4(ey1Var12, 23);
                                        ov0Var7.m0(objQ10);
                                    }
                                    long j5 = hz.c;
                                    long j6 = j5;
                                    b43.a(zBooleanValue, (lu0) objQ10, null, false, mc0.m(j5, xp1.d(4288423856L), 0L, 0L, 0L, 0L, ov0Var7, 65532), ov0Var7, 48, 92);
                                    ov0Var7.r();
                                    ov0Var7.r();
                                    ov0Var7.r();
                                    gh0.h(ov0Var7, iw2.g(av1Var, 14.0f));
                                    dv1 dv1VarE11 = iw2.e(av1Var, 1.0f);
                                    kk2 kk2VarA5 = jk2.a(new jo(10.0f, true, new fo(0)), orVar, ov0Var7, 54);
                                    int iHashCode16 = Long.hashCode(ks.U(ov0Var7));
                                    l72 l72VarZ16 = ov0Var7.z();
                                    dv1 dv1VarH16 = xp1.H(ov0Var7, dv1VarE11);
                                    ov0Var7.g0();
                                    if (ov0Var7.D()) {
                                        ov0Var7.k(x30Var3);
                                    } else {
                                        ov0Var7.p0();
                                    }
                                    q73.h(ov0Var7, ghVar5, kk2VarA5);
                                    q73.h(ov0Var7, ghVar6, l72VarZ16);
                                    az2.s(iHashCode16, ov0Var7, ghVar7, ov0Var7, waVar2);
                                    q73.h(ov0Var7, ghVar8, dv1VarH16);
                                    lk2 lk2Var = lk2.a;
                                    dv1 dv1VarN6 = xp1.n(iw2.g(lk2.a(lk2Var, av1Var, 1.0f), 42.0f), cj2.a(12.0f));
                                    if (z6) {
                                        f4 = 0.08f;
                                    } else {
                                        j6 = hz.b;
                                        f4 = 0.05f;
                                    }
                                    dv1 dv1VarA2 = bk.a(xp1.l(dv1VarN6, hz.c(f4, j6)), au0Var3);
                                    er1 er1VarC5 = ws.c(prVar5, false);
                                    int iHashCode17 = Long.hashCode(ks.U(ov0Var7));
                                    l72 l72VarZ17 = ov0Var7.z();
                                    dv1 dv1VarH17 = xp1.H(ov0Var7, dv1VarA2);
                                    ov0Var7.g0();
                                    if (ov0Var7.D()) {
                                        ov0Var7.k(x30Var3);
                                    } else {
                                        ov0Var7.p0();
                                    }
                                    q73.h(ov0Var7, ghVar5, er1VarC5);
                                    q73.h(ov0Var7, ghVar6, l72VarZ17);
                                    az2.s(iHashCode17, ov0Var7, ghVar7, ov0Var7, waVar2);
                                    q73.h(ov0Var7, ghVar8, dv1VarH17);
                                    s83.b(ke0.N(2131624085, ov0Var7), null, 0L, v63.b(13.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var7, 24576, 0, 262126);
                                    ov0Var7.r();
                                    bj2 bj2VarA2 = cj2.a(12.0f);
                                    b52 b52Var = hu.a;
                                    gu guVarA = hu.a(xp1.d(4288423856L), 0L, 0L, 0L, ov0Var7, 14);
                                    dv1 dv1VarG = iw2.g(lk2.a(lk2Var, av1Var, 1.3f), 42.0f);
                                    su0 su0Var3 = su0Var2;
                                    boolean zF = ov0Var7.f(su0Var3);
                                    Object objQ11 = ov0Var7.Q();
                                    if (zF || objQ11 == c30Var5) {
                                        d3 d3Var = new d3(su0Var3, ey1Var10, ey1Var9, ey1Var11, t52Var4, ey1Var12);
                                        ov0Var7.m0(d3Var);
                                        objQ11 = d3Var;
                                    }
                                    n51.a((au0) objQ11, dv1VarG, false, bj2VarA2, guVarA, null, null, null, k22.j, ov0Var7, 805306368, 484);
                                    ov0Var7.r();
                                    ov0Var7.r();
                                } else {
                                    ov0Var3.W();
                                }
                                return mf3.a;
                            }
                        }, ov0Var2), ov0Var2, 196614, 16);
                    } else {
                        ov0Var2.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, ((i2 >> 6) & 14) | 432, 0);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new xy(ji0Var, z, au0Var, su0Var, i, 1);
        }
    }

    public static final void d(boolean z, ImportExportCounts importExportCounts, lu0 lu0Var, au0 au0Var, f30 f30Var, int i) {
        lu0Var.getClass();
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(444853397);
        int i2 = i | (ov0Var.h(importExportCounts) ? 32 : 16) | (ov0Var.h(lu0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = ke0.H(new ImportExportSelection(false, false, false, false, false, 31, null));
                ov0Var.m0(objQ);
            }
            sb.F(au0Var, null, sb.a0(1046527390, new w4(z, importExportCounts, (ey1) objQ, au0Var, lu0Var), ov0Var), ov0Var, 390, 2);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new p2(z, importExportCounts, lu0Var, au0Var, i);
        }
    }

    public static final long e(int i) {
        long j = ((long) i) << 32;
        int i2 = c91.O;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0144  */
    /* JADX WARN: Code duplicated, block: B:110:0x014a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:121:0x016d  */
    /* JADX WARN: Code duplicated, block: B:127:0x018e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0192  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:132:0x0199  */
    /* JADX WARN: Code duplicated, block: B:134:0x019d  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:171:0x026b  */
    /* JADX WARN: Code duplicated, block: B:174:0x027c  */
    /* JADX WARN: Code duplicated, block: B:177:0x029b  */
    /* JADX WARN: Code duplicated, block: B:247:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:250:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:252:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:254:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:265:0x0401  */
    /* JADX WARN: Code duplicated, block: B:267:0x0416  */
    /* JADX WARN: Code duplicated, block: B:269:0x045b  */
    /* JADX WARN: Code duplicated, block: B:272:0x046d  */
    /* JADX WARN: Code duplicated, block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x016d, please report this as an issue */
    public static final void f(final dv1 dv1Var, yd1 yd1Var, final z42 z42Var, final boolean z, final ka0 ka0Var, final boolean z2, final o42 o42Var, k9 k9Var, ko koVar, or orVar, io ioVar, final lu0 lu0Var, f30 f30Var, final int i, final int i2, final int i3) {
        int i4;
        k9 k9Var2;
        int i5;
        boolean z3;
        boolean z4;
        yd1 yd1Var2;
        ov0 ov0Var;
        final ko koVar2;
        final or orVar2;
        final io ioVar2;
        ee2 ee2VarT;
        int i6;
        ko koVar3;
        or orVar3;
        io ioVar3;
        or orVar4;
        int i7;
        ey1 ey1VarL;
        boolean z5;
        Object objQ;
        c30 c30Var;
        w81 w81Var;
        boolean z6;
        Object objQ2;
        Object objQ3;
        CoroutineScope coroutineScope;
        iw0 iw0Var;
        gt2 gt2Var;
        boolean zD;
        Object objQ4;
        int i8;
        w81 w81Var2;
        x32 x32Var;
        x32 x32Var2;
        dv1 dv1VarI;
        boolean zD2;
        Object objQ5;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(924924659);
        if ((i & 6) == 0) {
            i4 = (ov0Var2.f(dv1Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= ov0Var2.f(yd1Var) ? 32 : 16;
        }
        int i9 = i & 384;
        int i10 = WorkQueueKt.BUFFER_CAPACITY;
        if (i9 == 0) {
            i4 |= ov0Var2.f(z42Var) ? 256 : 128;
        }
        int i11 = i & 3072;
        int i12 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i11 == 0) {
            i4 |= ov0Var2.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= ov0Var2.g(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= ov0Var2.f(ka0Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= ov0Var2.g(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= ov0Var2.f(o42Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i13 = i3 & 512;
        if (i13 != 0) {
            i4 |= 805306368;
            k9Var2 = k9Var;
        } else {
            k9Var2 = k9Var;
            if ((i & 805306368) == 0) {
                i4 |= ov0Var2.f(k9Var2) ? 536870912 : 268435456;
            }
        }
        int i14 = i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i14 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (ov0Var2.f(koVar) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i15 = i3 & 2048;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= ov0Var2.f(orVar) ? 32 : 16;
        }
        int i16 = i5;
        int i17 = i3 & 4096;
        if (i17 == 0) {
            if ((i2 & 384) == 0) {
                if (ov0Var2.f(ioVar)) {
                    i10 = 256;
                }
                i16 |= i10;
            }
            if ((i2 & 3072) == 0) {
                if (ov0Var2.h(lu0Var)) {
                    i12 = 2048;
                }
                i16 |= i12;
            }
            z3 = true;
            if ((i4 & 306783379) == 306783378 || (i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ov0Var2.T(i4 & 1, z4)) {
                ov0Var2.Y();
                if ((i & 1) != 0 || ov0Var2.B()) {
                    i6 = i4 & (-234881025);
                    if (i13 != 0) {
                        k9Var2 = null;
                    }
                    if (i14 != 0) {
                        koVar3 = null;
                    } else {
                        koVar3 = koVar;
                    }
                    if (i15 != 0) {
                        orVar3 = null;
                    } else {
                        orVar3 = orVar;
                    }
                    if (i17 != 0) {
                        ioVar3 = null;
                    } else {
                        ioVar3 = ioVar;
                    }
                    orVar4 = orVar3;
                } else {
                    ov0Var2.W();
                    i6 = i4 & (-234881025);
                    koVar3 = koVar;
                    i16 = i16;
                    k9Var2 = k9Var2;
                    orVar4 = orVar;
                    ioVar3 = ioVar;
                }
                ov0Var2.q();
                i7 = i6 >> 3;
                int i18 = i7 & 14;
                int i19 = i18 | ((i16 >> 6) & 112);
                int i20 = i6;
                ey1VarL = ke0.L(lu0Var, ov0Var2);
                int i21 = i16;
                z5 = (((i19 & 14) ^ 6) <= 4 && ov0Var2.f(yd1Var)) || (i19 & 6) == 4;
                objQ = ov0Var2.Q();
                c30Var = d30.a;
                if (z5 || objQ == c30Var) {
                    bc1 bc1Var = new bc1();
                    bc1Var.a = new t52(Integer.MAX_VALUE);
                    bc1Var.b = new t52(Integer.MAX_VALUE);
                    u92 u92Var = u92.h;
                    mo0 mo0Var = new mo0(ey1VarL, 3);
                    gn gnVar = by2.a;
                    objQ = new md1(0, 0, s03.class, new fc0(new a6(new fc0(mo0Var, u92Var), yd1Var, bc1Var, 9), u92Var), "value", "getValue()Ljava/lang/Object;");
                    ov0Var2.m0(objQ);
                }
                w81Var = (w81) objQ;
                int i22 = i20 >> 9;
                int i23 = i18 | (i22 & 112);
                z6 = ((((i23 & 112) ^ 48) <= 32 && ov0Var2.g(z)) || (i23 & 48) == 32) | ((((i23 & 14) ^ 6) <= 4 && ov0Var2.f(yd1Var)) || (i23 & 6) == 4);
                objQ2 = ov0Var2.Q();
                if (z6 || objQ2 == c30Var) {
                    objQ2 = new bd1(yd1Var, z);
                    ov0Var2.m0(objQ2);
                }
                bd1 bd1Var = (bd1) objQ2;
                objQ3 = ov0Var2.Q();
                if (objQ3 == c30Var) {
                    objQ3 = oi0.j(ov0Var2);
                    ov0Var2.m0(objQ3);
                }
                coroutineScope = (CoroutineScope) objQ3;
                iw0Var = (iw0) ov0Var2.j(z30.g);
                gt2Var = ((Boolean) ov0Var2.j(z30.x)).booleanValue() ? null : c13.a;
                int i24 = i21 << 18;
                int i25 = (i20 & 65520) | (i22 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | ((i21 << 27) & 1879048192);
                zD = ((((i25 & 112) ^ 48) <= 32 && ov0Var2.f(yd1Var)) || (i25 & 48) == 32) | ((((i25 & 896) ^ 384) <= 256 && ov0Var2.f(z42Var)) || (i25 & 384) == 256) | ((((i25 & 7168) ^ 3072) <= 2048 && ov0Var2.g(false)) || (i25 & 3072) == 2048) | ((((57344 & i25) ^ 24576) <= 16384 && ov0Var2.g(z)) || (i25 & 24576) == 16384) | ov0Var2.d(0) | ((((i25 & 3670016) ^ 1572864) <= 1048576 && ov0Var2.f(k9Var2)) || (i25 & 1572864) == 1048576) | ((((i25 & 29360128) ^ 12582912) <= 8388608 && ov0Var2.f(orVar4)) || (i25 & 12582912) == 8388608) | ((((i25 & 234881024) ^ 100663296) <= 67108864 && ov0Var2.f(ioVar3)) || (i25 & 100663296) == 67108864) | ((((i25 & 1879048192) ^ 805306368) <= 536870912 && ov0Var2.f(koVar3)) || (i25 & 805306368) == 536870912) | ov0Var2.f(iw0Var) | ov0Var2.f(gt2Var);
                objQ4 = ov0Var2.Q();
                if (!zD || objQ4 == c30Var) {
                    ov0Var = ov0Var2;
                    i8 = 4;
                    ko koVar4 = koVar3;
                    objQ4 = new pd1(yd1Var, z, z42Var, w81Var, koVar4, ioVar3, coroutineScope, iw0Var, gt2Var, k9Var2, orVar4);
                    w81Var2 = w81Var;
                    koVar2 = koVar4;
                    ov0Var.m0(objQ4);
                } else {
                    w81Var2 = w81Var;
                    koVar2 = koVar3;
                    ov0Var = ov0Var2;
                    i8 = 4;
                }
                pd1 pd1Var = (pd1) objQ4;
                if (z) {
                    x32Var = x32.e;
                } else {
                    x32Var = x32.f;
                }
                x32Var2 = x32Var;
                if (z2) {
                    ov0Var.c0(-2077147368);
                    if ((((i7 & 14) ^ 6) > i8 || !ov0Var.f(yd1Var)) && (i7 & 6) != i8) {
                    }
                    zD2 = z3 | ov0Var.d(0);
                    objQ5 = ov0Var.Q();
                    if (zD2 || objQ5 == c30Var) {
                        objQ5 = new hd1(yd1Var);
                        ov0Var.m0(objQ5);
                    }
                    dv1VarI = ji2.I((hd1) objQ5, yd1Var.p, x32Var2);
                    ov0Var.p(false);
                } else {
                    ov0Var.c0(-2076718545);
                    ov0Var.p(false);
                    dv1VarI = av1.a;
                }
                yd1Var2 = yd1Var;
                mh0.c(w81Var2, sb.d0(ym3.G(dv1Var.d(yd1Var.m).d(yd1Var.n), w81Var2, bd1Var, x32Var2, z2).d(dv1VarI).d(yd1Var.o.i), yd1Var, x32Var2, o42Var, z2, ka0Var, yd1Var.g), yd1Var2.q, pd1Var, ov0Var, 0);
                orVar2 = orVar4;
                ioVar2 = ioVar3;
            } else {
                yd1Var2 = yd1Var;
                ov0Var = ov0Var2;
                ov0Var.W();
                koVar2 = koVar;
                orVar2 = orVar;
                ioVar2 = ioVar;
                k9Var2 = k9Var2;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                final yd1 yd1Var3 = yd1Var2;
                final k9 k9Var3 = k9Var2;
                ee2VarT.d = new pu0() { // from class: nd1
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM0 = wc0.m0(i | 1);
                        int iM1 = wc0.m0(i2);
                        hd0.f(dv1Var, yd1Var3, z42Var, z, ka0Var, z2, o42Var, k9Var3, koVar2, orVar2, ioVar2, lu0Var, (f30) obj, iM0, iM1, i3);
                        return mf3.a;
                    }
                };
            }
        }
        i16 |= 384;
        if ((i2 & 3072) == 0) {
            if (ov0Var2.h(lu0Var)) {
                i12 = 2048;
            }
            i16 |= i12;
        }
        z3 = true;
        if ((i4 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (ov0Var2.T(i4 & 1, z4)) {
            ov0Var2.Y();
            if ((i & 1) != 0) {
                i6 = i4 & (-234881025);
                if (i13 != 0) {
                    k9Var2 = null;
                }
                if (i14 != 0) {
                    koVar3 = null;
                } else {
                    koVar3 = koVar;
                }
                if (i15 != 0) {
                    orVar3 = null;
                } else {
                    orVar3 = orVar;
                }
                if (i17 != 0) {
                    ioVar3 = null;
                } else {
                    ioVar3 = ioVar;
                }
                orVar4 = orVar3;
            } else {
                i6 = i4 & (-234881025);
                if (i13 != 0) {
                    k9Var2 = null;
                }
                if (i14 != 0) {
                    koVar3 = null;
                } else {
                    koVar3 = koVar;
                }
                if (i15 != 0) {
                    orVar3 = null;
                } else {
                    orVar3 = orVar;
                }
                if (i17 != 0) {
                    ioVar3 = null;
                } else {
                    ioVar3 = ioVar;
                }
                orVar4 = orVar3;
            }
            ov0Var2.q();
            i7 = i6 >> 3;
            int i110 = i7 & 14;
            int i111 = i110 | ((i16 >> 6) & 112);
            int i26 = i6;
            ey1VarL = ke0.L(lu0Var, ov0Var2);
            int i27 = i16;
            if (((i111 & 14) ^ 6) <= 4) {
            }
            objQ = ov0Var2.Q();
            c30Var = d30.a;
            if (z5) {
                bc1 bc1Var2 = new bc1();
                bc1Var2.a = new t52(Integer.MAX_VALUE);
                bc1Var2.b = new t52(Integer.MAX_VALUE);
                u92 u92Var2 = u92.h;
                mo0 mo0Var2 = new mo0(ey1VarL, 3);
                gn gnVar2 = by2.a;
                objQ = new md1(0, 0, s03.class, new fc0(new a6(new fc0(mo0Var2, u92Var2), yd1Var, bc1Var2, 9), u92Var2), "value", "getValue()Ljava/lang/Object;");
                ov0Var2.m0(objQ);
            } else {
                bc1 bc1Var3 = new bc1();
                bc1Var3.a = new t52(Integer.MAX_VALUE);
                bc1Var3.b = new t52(Integer.MAX_VALUE);
                u92 u92Var3 = u92.h;
                mo0 mo0Var3 = new mo0(ey1VarL, 3);
                gn gnVar3 = by2.a;
                objQ = new md1(0, 0, s03.class, new fc0(new a6(new fc0(mo0Var3, u92Var3), yd1Var, bc1Var3, 9), u92Var3), "value", "getValue()Ljava/lang/Object;");
                ov0Var2.m0(objQ);
            }
            w81Var = (w81) objQ;
            int i28 = i26 >> 9;
            int i29 = i110 | (i28 & 112);
            z6 = ((((i29 & 112) ^ 48) <= 32 && ov0Var2.g(z)) || (i29 & 48) == 32) | ((((i29 & 14) ^ 6) <= 4 && ov0Var2.f(yd1Var)) || (i29 & 6) == 4);
            objQ2 = ov0Var2.Q();
            if (z6) {
                objQ2 = new bd1(yd1Var, z);
                ov0Var2.m0(objQ2);
            } else {
                objQ2 = new bd1(yd1Var, z);
                ov0Var2.m0(objQ2);
            }
            bd1 bd1Var2 = (bd1) objQ2;
            objQ3 = ov0Var2.Q();
            if (objQ3 == c30Var) {
                objQ3 = oi0.j(ov0Var2);
                ov0Var2.m0(objQ3);
            }
            coroutineScope = (CoroutineScope) objQ3;
            iw0Var = (iw0) ov0Var2.j(z30.g);
            gt2Var = ((Boolean) ov0Var2.j(z30.x)).booleanValue() ? null : c13.a;
            int i210 = i27 << 18;
            int i211 = (i26 & 65520) | (i28 & 3670016) | (i210 & 29360128) | (i210 & 234881024) | ((i27 << 27) & 1879048192);
            zD = ((((i211 & 112) ^ 48) <= 32 && ov0Var2.f(yd1Var)) || (i211 & 48) == 32) | ((((i211 & 896) ^ 384) <= 256 && ov0Var2.f(z42Var)) || (i211 & 384) == 256) | ((((i211 & 7168) ^ 3072) <= 2048 && ov0Var2.g(false)) || (i211 & 3072) == 2048) | ((((57344 & i211) ^ 24576) <= 16384 && ov0Var2.g(z)) || (i211 & 24576) == 16384) | ov0Var2.d(0) | ((((i211 & 3670016) ^ 1572864) <= 1048576 && ov0Var2.f(k9Var2)) || (i211 & 1572864) == 1048576) | ((((i211 & 29360128) ^ 12582912) <= 8388608 && ov0Var2.f(orVar4)) || (i211 & 12582912) == 8388608) | ((((i211 & 234881024) ^ 100663296) <= 67108864 && ov0Var2.f(ioVar3)) || (i211 & 100663296) == 67108864) | ((((i211 & 1879048192) ^ 805306368) <= 536870912 && ov0Var2.f(koVar3)) || (i211 & 805306368) == 536870912) | ov0Var2.f(iw0Var) | ov0Var2.f(gt2Var);
            objQ4 = ov0Var2.Q();
            if (zD) {
                ov0Var = ov0Var2;
                i8 = 4;
                ko koVar5 = koVar3;
                objQ4 = new pd1(yd1Var, z, z42Var, w81Var, koVar5, ioVar3, coroutineScope, iw0Var, gt2Var, k9Var2, orVar4);
                w81Var2 = w81Var;
                koVar2 = koVar5;
                ov0Var.m0(objQ4);
            } else {
                ov0Var = ov0Var2;
                i8 = 4;
                ko koVar6 = koVar3;
                objQ4 = new pd1(yd1Var, z, z42Var, w81Var, koVar6, ioVar3, coroutineScope, iw0Var, gt2Var, k9Var2, orVar4);
                w81Var2 = w81Var;
                koVar2 = koVar6;
                ov0Var.m0(objQ4);
            }
            pd1 pd1Var2 = (pd1) objQ4;
            if (z) {
                x32Var = x32.e;
            } else {
                x32Var = x32.f;
            }
            x32Var2 = x32Var;
            if (z2) {
                ov0Var.c0(-2077147368);
                z3 = ((i7 & 14) ^ 6) > i8 ? false : false;
                zD2 = z3 | ov0Var.d(0);
                objQ5 = ov0Var.Q();
                if (zD2) {
                    objQ5 = new hd1(yd1Var);
                    ov0Var.m0(objQ5);
                } else {
                    objQ5 = new hd1(yd1Var);
                    ov0Var.m0(objQ5);
                }
                dv1VarI = ji2.I((hd1) objQ5, yd1Var.p, x32Var2);
                ov0Var.p(false);
            } else {
                ov0Var.c0(-2076718545);
                ov0Var.p(false);
                dv1VarI = av1.a;
            }
            yd1Var2 = yd1Var;
            mh0.c(w81Var2, sb.d0(ym3.G(dv1Var.d(yd1Var.m).d(yd1Var.n), w81Var2, bd1Var2, x32Var2, z2).d(dv1VarI).d(yd1Var.o.i), yd1Var, x32Var2, o42Var, z2, ka0Var, yd1Var.g), yd1Var2.q, pd1Var2, ov0Var, 0);
            orVar2 = orVar4;
            ioVar2 = ioVar3;
        } else {
            yd1Var2 = yd1Var;
            ov0Var = ov0Var2;
            ov0Var.W();
            koVar2 = koVar;
            orVar2 = orVar;
            ioVar2 = ioVar;
            k9Var2 = k9Var2;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final yd1 yd1Var4 = yd1Var2;
            final k9 k9Var4 = k9Var2;
            ee2VarT.d = new pu0() { // from class: nd1
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(i | 1);
                    int iM1 = wc0.m0(i2);
                    hd0.f(dv1Var, yd1Var4, z42Var, z, ka0Var, z2, o42Var, k9Var4, koVar2, orVar2, ioVar2, lu0Var, (f30) obj, iM0, iM1, i3);
                    return mf3.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0286  */
    /* JADX WARN: Code duplicated, block: B:103:0x028a  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:116:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:117:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:120:0x0325  */
    /* JADX WARN: Code duplicated, block: B:122:0x032e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0375  */
    /* JADX WARN: Code duplicated, block: B:126:0x0379  */
    /* JADX WARN: Code duplicated, block: B:130:0x0392  */
    /* JADX WARN: Code duplicated, block: B:133:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:135:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:142:0x041a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0472  */
    /* JADX WARN: Code duplicated, block: B:146:0x047e  */
    /* JADX WARN: Code duplicated, block: B:149:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:150:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:153:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:154:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:160:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:98:0x0230  */
    /* JADX WARN: Code duplicated, block: B:99:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final dv1 dv1Var, final AppState appState, final boolean z, final mi1 mi1Var, final lu0 lu0Var, final ul1 ul1Var, final float f, final float f2, final float f3, lu0 lu0Var2, final lu0 lu0Var3, final au0 au0Var, final au0 au0Var2, final au0 au0Var3, final au0 au0Var4, final lu0 lu0Var4, final lu0 lu0Var5, final au0 au0Var5, p10 p10Var, f30 f30Var, final int i) {
        lu0 lu0Var6;
        p10 p10Var2;
        final lu0 lu0Var7;
        ov0 ov0Var;
        Object obj;
        float f4;
        float f5;
        final float fR;
        td0 td0Var;
        td0 td0Var2;
        boolean zC;
        Object obj2;
        au0 au0Var6;
        boolean z2;
        final mi1 mi1Var2;
        boolean z3;
        Object obj3;
        long j;
        float f6;
        float f7;
        int i2;
        ov0 ov0Var2;
        boolean z4;
        Object objQ;
        Object obj4;
        Object objQ2;
        Object obj5;
        boolean z5;
        final int i3;
        Object obj6;
        dv1Var.getClass();
        appState.getClass();
        mi1Var.getClass();
        lu0Var.getClass();
        ul1Var.getClass();
        lu0Var2.getClass();
        lu0Var3.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        au0Var3.getClass();
        au0Var4.getClass();
        lu0Var4.getClass();
        lu0Var5.getClass();
        au0Var5.getClass();
        ov0 ov0Var3 = (ov0) f30Var;
        ov0Var3.e0(-219202311);
        int i4 = i | (ov0Var3.f(dv1Var) ? 4 : 2) | (ov0Var3.h(appState) ? 32 : 16);
        boolean zG = ov0Var3.g(z);
        int i5 = WorkQueueKt.BUFFER_CAPACITY;
        int i6 = i4 | (zG ? 256 : 128);
        boolean zD = ov0Var3.d(mi1Var.ordinal());
        int i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        int i8 = i6 | (zD ? 2048 : 1024) | (ov0Var3.h(ul1Var) ? 131072 : 65536) | (ov0Var3.c(f) ? 1048576 : 524288) | (ov0Var3.c(f2) ? 8388608 : 4194304) | (ov0Var3.c(f3) ? 67108864 : 33554432);
        int i9 = 100663302 | (ov0Var3.h(au0Var) ? 32 : 16);
        if (ov0Var3.h(au0Var2)) {
            i5 = 256;
        }
        int i10 = i9 | i5;
        if (ov0Var3.h(au0Var3)) {
            i7 = 2048;
        }
        int i11 = i10 | i7 | (ov0Var3.h(au0Var4) ? 16384 : 8192) | (ov0Var3.h(lu0Var4) ? 131072 : 65536) | (ov0Var3.h(lu0Var5) ? 1048576 : 524288) | (ov0Var3.h(au0Var5) ? 8388608 : 4194304);
        if (ov0Var3.T(i8 & 1, ((i8 & 306783379) == 306783378 && (i11 & 38347923) == 38347922) ? false : true)) {
            Object objQ3 = ov0Var3.Q();
            Object obj7 = d30.a;
            if (objQ3 == obj7) {
                obj = objQ3;
                Object s52Var = new s52(0.0f);
                ov0Var3.m0(s52Var);
                obj = s52Var;
            }
            obj = objQ3;
            s52 s52Var2 = (s52) obj;
            xb0 xb0Var = (xb0) ov0Var3.j(z30.h);
            int i12 = i8 & 7168;
            boolean z6 = i12 == 2048;
            Object objQ4 = ov0Var3.Q();
            Object obj8 = objQ4;
            if (z6 || objQ4 == obj7) {
                Object di1Var = new di1(s52Var2, mi1Var, lu0Var, 0);
                ov0Var3.m0(di1Var);
                obj8 = di1Var;
            }
            av1 av1Var = av1.a;
            dv1 dv1VarA = m33.a(av1Var, mi1Var, (PointerInputEventHandler) obj8);
            int iOrdinal = mi1Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    f4 = 8.0f + f2;
                } else {
                    if (iOrdinal != 2) {
                        b81.d();
                        return;
                    }
                    f5 = 0.0f;
                }
                fR = xb0Var.R(((td0) qh.a(f5, o51.D(1.0f, 400.0f, null, 4), "drawer_offset_y", ov0Var3, 432, 8).getValue()).e);
                dv1 dv1VarF = zm3.F(iw2.e(dv1Var, 1.0f), 14.0f, 0.0f, 2);
                td0Var = new td0(f + 10.0f);
                td0Var2 = new td0(0.0f);
                if (td0Var.compareTo(td0Var2) < 0) {
                    td0Var = td0Var2;
                }
                dv1 dv1VarG = zm3.G(dv1VarF, 0.0f, 0.0f, 0.0f, td0Var.e, 7);
                zC = ov0Var3.c(fR);
                Object objQ5 = ov0Var3.Q();
                obj2 = objQ5;
                if (zC || objQ5 == obj7) {
                    Object obj9 = new lu0() { // from class: zh1
                        @Override // defpackage.lu0
                        public final Object invoke(Object obj10) {
                            ((xb0) obj10).getClass();
                            return new h41(((long) xq1.P(fR)) & 4294967295L);
                        }
                    };
                    ov0Var3.m0(obj9);
                    obj2 = obj9;
                }
                dv1 dv1VarK = xq1.K(dv1VarG, (lu0) obj2);
                er1 er1VarC = ws.c(j9.f, false);
                int iHashCode = Long.hashCode(ov0Var3.T);
                l72 l72VarL = ov0Var3.l();
                dv1 dv1VarH = xp1.H(ov0Var3, dv1VarK);
                w20.b.getClass();
                au0Var6 = v20.b;
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(au0Var6);
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
                dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                yz yzVarA = wz.a(new jo(8.0f, true, new fo(0)), j9.s, ov0Var3, 54);
                int iHashCode2 = Long.hashCode(ov0Var3.T);
                l72 l72VarL2 = ov0Var3.l();
                dv1 dv1VarH2 = xp1.H(ov0Var3, dv1VarE);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(au0Var6);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar, yzVarA);
                q73.h(ov0Var3, ghVar2, l72VarL2);
                az2.s(iHashCode2, ov0Var3, ghVar3, ov0Var3, waVar);
                q73.h(ov0Var3, ghVar4, dv1VarH2);
                dv1 dv1VarD = zm3.G(iw2.e(av1Var, 1.0f), 0.0f, 2.0f, 0.0f, 4.0f, 5).d(dv1VarA);
                if (i12 == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objQ6 = ov0Var3.Q();
                if (!z2 || objQ6 == obj7) {
                    mi1Var2 = mi1Var;
                    z3 = false;
                    final boolean z7 = false ? 1 : 0;
                    Object obj10 = new au0() { // from class: ai1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            int i13 = z7;
                            mf3 mf3Var = mf3.a;
                            mi1 mi1Var3 = mi1.g;
                            lu0 lu0Var8 = lu0Var;
                            mi1 mi1Var4 = mi1Var2;
                            mi1 mi1Var5 = mi1.f;
                            switch (i13) {
                                case 0:
                                    int iOrdinal2 = mi1Var4.ordinal();
                                    if (iOrdinal2 == 0) {
                                        mi1Var3 = mi1Var5;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            b81.d();
                                            return null;
                                        }
                                        mi1Var3 = mi1Var5;
                                    }
                                    lu0Var8.invoke(mi1Var3);
                                    return mf3Var;
                                default:
                                    if (mi1Var4 == mi1Var3) {
                                        mi1Var3 = mi1Var5;
                                    }
                                    lu0Var8.invoke(mi1Var3);
                                    return mf3Var;
                            }
                        }
                    };
                    ov0Var3.m0(obj10);
                    obj3 = obj10;
                } else {
                    mi1Var2 = mi1Var;
                    z3 = false;
                    obj3 = objQ6;
                }
                dv1 dv1VarA2 = bk.a(dv1VarD, (au0) obj3);
                er1 er1VarC2 = ws.c(j9.j, z3);
                int iHashCode3 = Long.hashCode(ov0Var3.T);
                l72 l72VarL3 = ov0Var3.l();
                dv1 dv1VarH3 = xp1.H(ov0Var3, dv1VarA2);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(au0Var6);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar, er1VarC2);
                q73.h(ov0Var3, ghVar2, l72VarL3);
                az2.s(iHashCode3, ov0Var3, ghVar3, ov0Var3, waVar);
                q73.h(ov0Var3, ghVar4, dv1VarH3);
                dv1 dv1VarN = xp1.n(iw2.g(iw2.o(av1Var, 36.0f), 4.5f), cj2.a(3.0f));
                if (z) {
                    j = hz.c;
                    f6 = 0.25f;
                } else {
                    j = hz.b;
                    f6 = 0.2f;
                }
                ws.a(xp1.k(dv1VarN, hz.c(f6, j), o51.p0), ov0Var3, 0);
                ov0Var3.p(true);
                dv1 dv1VarD2 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 2.0f, 1).d(dv1VarA);
                kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var3, 48);
                int iHashCode4 = Long.hashCode(ov0Var3.T);
                l72 l72VarL4 = ov0Var3.l();
                dv1 dv1VarH4 = xp1.H(ov0Var3, dv1VarD2);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(au0Var6);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar, kk2VarA);
                q73.h(ov0Var3, ghVar2, l72VarL4);
                az2.s(iHashCode4, ov0Var3, ghVar3, ov0Var3, waVar);
                q73.h(ov0Var3, ghVar4, dv1VarH4);
                if (1.0f <= 0.0d) {
                    n21.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f7 = Float.MAX_VALUE;
                } else {
                    f7 = 1.0f;
                }
                p10 p10Var3 = p10Var;
                p10Var3.invoke(iw2.g(new wb1(f7, true), 52.0f), ov0Var3, 48);
                boolean zIsSpoofingActive = appState.isSpoofingActive();
                f80 f80Var = lh0.a;
                i2 = 3;
                da0.c(zIsSpoofingActive, null, kk0.a(o51.I(200, 2, f80Var), null, 14).a(kk0.d(o51.I(200, 6, null), 2)), kk0.f(o51.I(180, 2, f80Var), null, 14).a(kk0.e(o51.I(180, 6, null), 2)), null, sb.a0(-518178511, new ak(i2, au0Var4), ov0Var3), ov0Var3, 1572870);
                ov0Var2 = ov0Var3;
                if (appState.isSpoofingActive() && mi1Var2 == mi1.e) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                da0.c(z4, null, kk0.a(o51.I(200, 2, f80Var), null, 14).a(kk0.d(o51.I(200, 6, null), 2)), kk0.f(o51.I(180, 2, f80Var), null, 14).a(kk0.e(o51.I(180, 6, null), 2)), null, sb.a0(64788712, new bu(4, au0Var3, appState), ov0Var2), ov0Var2, 1572870);
                ov0Var2.p(true);
                dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                objQ = ov0Var2.Q();
                if (objQ == obj7) {
                    Object am0Var = new am0(2, lu0Var3);
                    ov0Var2.m0(am0Var);
                    obj4 = am0Var;
                } else {
                    obj4 = objQ;
                }
                e33.a(k22.G(dv1VarE2, (lu0) obj4).d(dv1VarA), cj2.a(22.0f), ((kz) ov0Var2.j(mz.a)).p, 0L, 0.0f, 8.0f, null, sb.a0(89395792, new w5(ul1Var, appState, z, au0Var, au0Var2, au0Var3), ov0Var2), ov0Var2, 12779520, 88);
                objQ2 = ov0Var2.Q();
                if (objQ2 == obj7) {
                    lu0Var6 = lu0Var2;
                    Object am0Var2 = new am0(i2, lu0Var6);
                    ov0Var2.m0(am0Var2);
                    obj5 = am0Var2;
                } else {
                    lu0Var6 = lu0Var2;
                    obj5 = objQ2;
                }
                dv1 dv1VarG2 = k22.G(av1Var, (lu0) obj5);
                List<SavedLocation> savedLocations = appState.getSavedLocations();
                if (i12 == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object objQ7 = ov0Var2.Q();
                if (!z5 || objQ7 == obj7) {
                    lu0Var7 = lu0Var;
                    i3 = 1;
                    Object obj11 = new au0() { // from class: ai1
                        @Override // defpackage.au0
                        public final Object invoke() {
                            int i13 = i3;
                            mf3 mf3Var = mf3.a;
                            mi1 mi1Var3 = mi1.g;
                            lu0 lu0Var8 = lu0Var7;
                            mi1 mi1Var4 = mi1Var2;
                            mi1 mi1Var5 = mi1.f;
                            switch (i13) {
                                case 0:
                                    int iOrdinal2 = mi1Var4.ordinal();
                                    if (iOrdinal2 == 0) {
                                        mi1Var3 = mi1Var5;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            b81.d();
                                            return null;
                                        }
                                        mi1Var3 = mi1Var5;
                                    }
                                    lu0Var8.invoke(mi1Var3);
                                    return mf3Var;
                                default:
                                    if (mi1Var4 == mi1Var3) {
                                        mi1Var3 = mi1Var5;
                                    }
                                    lu0Var8.invoke(mi1Var3);
                                    return mf3Var;
                            }
                        }
                    };
                    ov0Var2.m0(obj11);
                    obj6 = obj11;
                } else {
                    lu0Var7 = lu0Var;
                    i3 = 1;
                    obj6 = objQ7;
                }
                int i13 = i11 >> 3;
                int i14 = ((i8 >> 3) & 896) | ((i8 << 3) & 7168) | (57344 & i13) | (i13 & 458752) | (i11 & 29360128);
                mi1 mi1Var3 = mi1Var2;
                boolean z8 = i3;
                ig0.e(dv1VarG2, savedLocations, mi1Var3, z, lu0Var4, lu0Var5, (au0) obj6, au0Var5, dv1VarA, ov0Var2, i14);
                ov0Var2.p(z8);
                ov0Var2.p(z8);
                ov0Var = ov0Var2;
                p10Var2 = p10Var3;
            } else {
                f4 = f2 + f3 + 16.0f;
            }
            f5 = f4;
            fR = xb0Var.R(((td0) qh.a(f5, o51.D(1.0f, 400.0f, null, 4), "drawer_offset_y", ov0Var3, 432, 8).getValue()).e);
            dv1 dv1VarF2 = zm3.F(iw2.e(dv1Var, 1.0f), 14.0f, 0.0f, 2);
            td0Var = new td0(f + 10.0f);
            td0Var2 = new td0(0.0f);
            if (td0Var.compareTo(td0Var2) < 0) {
                td0Var = td0Var2;
            }
            dv1 dv1VarG3 = zm3.G(dv1VarF2, 0.0f, 0.0f, 0.0f, td0Var.e, 7);
            zC = ov0Var3.c(fR);
            Object objQ8 = ov0Var3.Q();
            obj2 = objQ8;
            if (zC) {
                Object obj12 = new lu0() { // from class: zh1
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj13) {
                        ((xb0) obj13).getClass();
                        return new h41(((long) xq1.P(fR)) & 4294967295L);
                    }
                };
                ov0Var3.m0(obj12);
                obj2 = obj12;
            } else {
                Object obj13 = new lu0() { // from class: zh1
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj14) {
                        ((xb0) obj14).getClass();
                        return new h41(((long) xq1.P(fR)) & 4294967295L);
                    }
                };
                ov0Var3.m0(obj13);
                obj2 = obj13;
            }
            dv1 dv1VarK2 = xq1.K(dv1VarG3, (lu0) obj2);
            er1 er1VarC3 = ws.c(j9.f, false);
            int iHashCode5 = Long.hashCode(ov0Var3.T);
            l72 l72VarL5 = ov0Var3.l();
            dv1 dv1VarH5 = xp1.H(ov0Var3, dv1VarK2);
            w20.b.getClass();
            au0Var6 = v20.b;
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(au0Var6);
            } else {
                ov0Var3.p0();
            }
            gh ghVar5 = v20.e;
            q73.h(ov0Var3, ghVar5, er1VarC3);
            gh ghVar6 = v20.d;
            q73.h(ov0Var3, ghVar6, l72VarL5);
            Integer numValueOf2 = Integer.valueOf(iHashCode5);
            gh ghVar7 = v20.f;
            q73.h(ov0Var3, ghVar7, numValueOf2);
            wa waVar2 = v20.g;
            q73.g(ov0Var3, waVar2);
            gh ghVar8 = v20.c;
            q73.h(ov0Var3, ghVar8, dv1VarH5);
            dv1 dv1VarE3 = iw2.e(av1Var, 1.0f);
            yz yzVarA2 = wz.a(new jo(8.0f, true, new fo(0)), j9.s, ov0Var3, 54);
            int iHashCode6 = Long.hashCode(ov0Var3.T);
            l72 l72VarL6 = ov0Var3.l();
            dv1 dv1VarH6 = xp1.H(ov0Var3, dv1VarE3);
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(au0Var6);
            } else {
                ov0Var3.p0();
            }
            q73.h(ov0Var3, ghVar5, yzVarA2);
            q73.h(ov0Var3, ghVar6, l72VarL6);
            az2.s(iHashCode6, ov0Var3, ghVar7, ov0Var3, waVar2);
            q73.h(ov0Var3, ghVar8, dv1VarH6);
            dv1 dv1VarD3 = zm3.G(iw2.e(av1Var, 1.0f), 0.0f, 2.0f, 0.0f, 4.0f, 5).d(dv1VarA);
            if (i12 == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object objQ9 = ov0Var3.Q();
            if (z2) {
                mi1Var2 = mi1Var;
                z3 = false;
                final int z9 = false ? 1 : 0;
                Object obj14 = new au0() { // from class: ai1
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i15 = z9;
                        mf3 mf3Var = mf3.a;
                        mi1 mi1Var4 = mi1.g;
                        lu0 lu0Var8 = lu0Var;
                        mi1 mi1Var5 = mi1Var2;
                        mi1 mi1Var6 = mi1.f;
                        switch (i15) {
                            case 0:
                                int iOrdinal2 = mi1Var5.ordinal();
                                if (iOrdinal2 == 0) {
                                    mi1Var4 = mi1Var6;
                                } else if (iOrdinal2 != 1) {
                                    if (iOrdinal2 != 2) {
                                        b81.d();
                                        return null;
                                    }
                                    mi1Var4 = mi1Var6;
                                }
                                lu0Var8.invoke(mi1Var4);
                                return mf3Var;
                            default:
                                if (mi1Var5 == mi1Var4) {
                                    mi1Var4 = mi1Var6;
                                }
                                lu0Var8.invoke(mi1Var4);
                                return mf3Var;
                        }
                    }
                };
                ov0Var3.m0(obj14);
                obj3 = obj14;
            } else {
                mi1Var2 = mi1Var;
                z3 = false;
                final int z10 = false ? 1 : 0;
                Object obj15 = new au0() { // from class: ai1
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i15 = z10;
                        mf3 mf3Var = mf3.a;
                        mi1 mi1Var4 = mi1.g;
                        lu0 lu0Var8 = lu0Var;
                        mi1 mi1Var5 = mi1Var2;
                        mi1 mi1Var6 = mi1.f;
                        switch (i15) {
                            case 0:
                                int iOrdinal2 = mi1Var5.ordinal();
                                if (iOrdinal2 == 0) {
                                    mi1Var4 = mi1Var6;
                                } else if (iOrdinal2 != 1) {
                                    if (iOrdinal2 != 2) {
                                        b81.d();
                                        return null;
                                    }
                                    mi1Var4 = mi1Var6;
                                }
                                lu0Var8.invoke(mi1Var4);
                                return mf3Var;
                            default:
                                if (mi1Var5 == mi1Var4) {
                                    mi1Var4 = mi1Var6;
                                }
                                lu0Var8.invoke(mi1Var4);
                                return mf3Var;
                        }
                    }
                };
                ov0Var3.m0(obj15);
                obj3 = obj15;
            }
            dv1 dv1VarA3 = bk.a(dv1VarD3, (au0) obj3);
            er1 er1VarC4 = ws.c(j9.j, z3);
            int iHashCode7 = Long.hashCode(ov0Var3.T);
            l72 l72VarL7 = ov0Var3.l();
            dv1 dv1VarH7 = xp1.H(ov0Var3, dv1VarA3);
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(au0Var6);
            } else {
                ov0Var3.p0();
            }
            q73.h(ov0Var3, ghVar5, er1VarC4);
            q73.h(ov0Var3, ghVar6, l72VarL7);
            az2.s(iHashCode7, ov0Var3, ghVar7, ov0Var3, waVar2);
            q73.h(ov0Var3, ghVar8, dv1VarH7);
            dv1 dv1VarN2 = xp1.n(iw2.g(iw2.o(av1Var, 36.0f), 4.5f), cj2.a(3.0f));
            if (z) {
                j = hz.c;
                f6 = 0.25f;
            } else {
                j = hz.b;
                f6 = 0.2f;
            }
            ws.a(xp1.k(dv1VarN2, hz.c(f6, j), o51.p0), ov0Var3, 0);
            ov0Var3.p(true);
            dv1 dv1VarD4 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 2.0f, 1).d(dv1VarA);
            kk2 kk2VarA2 = jk2.a(am1.e, j9.p, ov0Var3, 48);
            int iHashCode8 = Long.hashCode(ov0Var3.T);
            l72 l72VarL8 = ov0Var3.l();
            dv1 dv1VarH8 = xp1.H(ov0Var3, dv1VarD4);
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(au0Var6);
            } else {
                ov0Var3.p0();
            }
            q73.h(ov0Var3, ghVar5, kk2VarA2);
            q73.h(ov0Var3, ghVar6, l72VarL8);
            az2.s(iHashCode8, ov0Var3, ghVar7, ov0Var3, waVar2);
            q73.h(ov0Var3, ghVar8, dv1VarH8);
            if (1.0f <= 0.0d) {
                n21.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f7 = Float.MAX_VALUE;
            } else {
                f7 = 1.0f;
            }
            p10 p10Var4 = p10Var;
            p10Var4.invoke(iw2.g(new wb1(f7, true), 52.0f), ov0Var3, 48);
            boolean zIsSpoofingActive2 = appState.isSpoofingActive();
            f80 f80Var2 = lh0.a;
            i2 = 3;
            da0.c(zIsSpoofingActive2, null, kk0.a(o51.I(200, 2, f80Var2), null, 14).a(kk0.d(o51.I(200, 6, null), 2)), kk0.f(o51.I(180, 2, f80Var2), null, 14).a(kk0.e(o51.I(180, 6, null), 2)), null, sb.a0(-518178511, new ak(i2, au0Var4), ov0Var3), ov0Var3, 1572870);
            ov0Var2 = ov0Var3;
            if (appState.isSpoofingActive()) {
                z4 = false;
            } else {
                z4 = false;
            }
            da0.c(z4, null, kk0.a(o51.I(200, 2, f80Var2), null, 14).a(kk0.d(o51.I(200, 6, null), 2)), kk0.f(o51.I(180, 2, f80Var2), null, 14).a(kk0.e(o51.I(180, 6, null), 2)), null, sb.a0(64788712, new bu(4, au0Var3, appState), ov0Var2), ov0Var2, 1572870);
            ov0Var2.p(true);
            dv1 dv1VarE4 = iw2.e(av1Var, 1.0f);
            objQ = ov0Var2.Q();
            if (objQ == obj7) {
                Object am0Var3 = new am0(2, lu0Var3);
                ov0Var2.m0(am0Var3);
                obj4 = am0Var3;
            } else {
                obj4 = objQ;
            }
            e33.a(k22.G(dv1VarE4, (lu0) obj4).d(dv1VarA), cj2.a(22.0f), ((kz) ov0Var2.j(mz.a)).p, 0L, 0.0f, 8.0f, null, sb.a0(89395792, new w5(ul1Var, appState, z, au0Var, au0Var2, au0Var3), ov0Var2), ov0Var2, 12779520, 88);
            objQ2 = ov0Var2.Q();
            if (objQ2 == obj7) {
                lu0Var6 = lu0Var2;
                Object am0Var4 = new am0(i2, lu0Var6);
                ov0Var2.m0(am0Var4);
                obj5 = am0Var4;
            } else {
                lu0Var6 = lu0Var2;
                obj5 = objQ2;
            }
            dv1 dv1VarG4 = k22.G(av1Var, (lu0) obj5);
            List<SavedLocation> savedLocations2 = appState.getSavedLocations();
            if (i12 == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object objQ10 = ov0Var2.Q();
            if (z5) {
                lu0Var7 = lu0Var;
                i3 = 1;
                Object obj16 = new au0() { // from class: ai1
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i15 = i3;
                        mf3 mf3Var = mf3.a;
                        mi1 mi1Var4 = mi1.g;
                        lu0 lu0Var8 = lu0Var7;
                        mi1 mi1Var5 = mi1Var2;
                        mi1 mi1Var6 = mi1.f;
                        switch (i15) {
                            case 0:
                                int iOrdinal2 = mi1Var5.ordinal();
                                if (iOrdinal2 == 0) {
                                    mi1Var4 = mi1Var6;
                                } else if (iOrdinal2 != 1) {
                                    if (iOrdinal2 != 2) {
                                        b81.d();
                                        return null;
                                    }
                                    mi1Var4 = mi1Var6;
                                }
                                lu0Var8.invoke(mi1Var4);
                                return mf3Var;
                            default:
                                if (mi1Var5 == mi1Var4) {
                                    mi1Var4 = mi1Var6;
                                }
                                lu0Var8.invoke(mi1Var4);
                                return mf3Var;
                        }
                    }
                };
                ov0Var2.m0(obj16);
                obj6 = obj16;
            } else {
                lu0Var7 = lu0Var;
                i3 = 1;
                Object obj17 = new au0() { // from class: ai1
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i15 = i3;
                        mf3 mf3Var = mf3.a;
                        mi1 mi1Var4 = mi1.g;
                        lu0 lu0Var8 = lu0Var7;
                        mi1 mi1Var5 = mi1Var2;
                        mi1 mi1Var6 = mi1.f;
                        switch (i15) {
                            case 0:
                                int iOrdinal2 = mi1Var5.ordinal();
                                if (iOrdinal2 == 0) {
                                    mi1Var4 = mi1Var6;
                                } else if (iOrdinal2 != 1) {
                                    if (iOrdinal2 != 2) {
                                        b81.d();
                                        return null;
                                    }
                                    mi1Var4 = mi1Var6;
                                }
                                lu0Var8.invoke(mi1Var4);
                                return mf3Var;
                            default:
                                if (mi1Var5 == mi1Var4) {
                                    mi1Var4 = mi1Var6;
                                }
                                lu0Var8.invoke(mi1Var4);
                                return mf3Var;
                        }
                    }
                };
                ov0Var2.m0(obj17);
                obj6 = obj17;
            }
            int i15 = i11 >> 3;
            int i16 = ((i8 >> 3) & 896) | ((i8 << 3) & 7168) | (57344 & i15) | (i15 & 458752) | (i11 & 29360128);
            mi1 mi1Var4 = mi1Var2;
            boolean z11 = i3;
            ig0.e(dv1VarG4, savedLocations2, mi1Var4, z, lu0Var4, lu0Var5, (au0) obj6, au0Var5, dv1VarA, ov0Var2, i16);
            ov0Var2.p(z11);
            ov0Var2.p(z11);
            ov0Var = ov0Var2;
            p10Var2 = p10Var4;
        } else {
            lu0Var6 = lu0Var2;
            p10Var2 = p10Var;
            lu0Var7 = lu0Var;
            ov0Var3.W();
            ov0Var = ov0Var3;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final lu0 lu0Var8 = lu0Var6;
            final lu0 lu0Var9 = lu0Var7;
            final p10 p10Var5 = p10Var2;
            ee2VarT.d = new pu0(appState, z, mi1Var, lu0Var9, ul1Var, f, f2, f3, lu0Var8, lu0Var3, au0Var, au0Var2, au0Var3, au0Var4, lu0Var4, lu0Var5, au0Var5, p10Var5, i) { // from class: bi1
                public final /* synthetic */ AppState f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ mi1 h;
                public final /* synthetic */ lu0 i;
                public final /* synthetic */ ul1 j;
                public final /* synthetic */ float k;
                public final /* synthetic */ float l;
                public final /* synthetic */ float m;
                public final /* synthetic */ lu0 n;
                public final /* synthetic */ lu0 o;
                public final /* synthetic */ au0 p;
                public final /* synthetic */ au0 q;
                public final /* synthetic */ au0 r;
                public final /* synthetic */ au0 s;
                public final /* synthetic */ lu0 t;
                public final /* synthetic */ lu0 u;
                public final /* synthetic */ au0 v;
                public final /* synthetic */ p10 w;

                @Override // defpackage.pu0
                public final Object invoke(Object obj18, Object obj19) {
                    ((Integer) obj19).getClass();
                    int iM0 = wc0.m0(805330945);
                    hd0.g(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, (f30) obj18, iM0);
                    return mf3.a;
                }
            };
        }
    }

    public static final void h(x01 x01Var, au0 au0Var, String str, Boolean bool, f30 f30Var, int i, int i2) {
        String str2;
        int i3;
        Boolean bool2;
        int i4;
        String str3;
        Boolean bool3;
        long jC;
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1959506237);
        int i5 = i | (ov0Var.f(x01Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i5 |= ov0Var.h(au0Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
            str2 = str;
        } else {
            str2 = str;
            i3 = i5 | (ov0Var.f(str2) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i3 | 3072;
            bool2 = bool;
        } else {
            bool2 = bool;
            i4 = i3 | (ov0Var.f(bool2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
        if (ov0Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            if (i6 != 0) {
                str2 = null;
            }
            Boolean bool4 = i7 != 0 ? null : bool2;
            av1 av1Var = av1.a;
            dv1 dv1VarN = xp1.n(O(iw2.k(av1Var, 46.0f), 4.0f, cj2.a(14.0f), 0L, 0L, 28), cj2.a(14.0f));
            Boolean bool5 = Boolean.TRUE;
            if (o51.f(bool4, bool5)) {
                ov0Var.c0(1889829639);
                ov0Var.p(false);
                jC = bk.g;
            } else {
                ov0Var.c0(1889831248);
                jC = hz.c(0.94f, ((kz) ov0Var.j(mz.a)).p);
                ov0Var.p(false);
            }
            dv1 dv1VarK = xp1.k(dv1VarN, jC, o51.p0);
            boolean z = (i4 & 7168) == 2048;
            Object objQ = ov0Var.Q();
            if (z || objQ == d30.a) {
                objQ = new t(bool4, 27);
                ov0Var.m0(objQ);
            }
            dv1 dv1VarA = bk.a(gs2.a(dv1VarK, false, (lu0) objQ), au0Var);
            er1 er1VarC = ws.c(j9.j, false);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarA);
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
            t01.a(x01Var, str2, iw2.k(av1Var, 22.0f), o51.f(bool4, bool5) ? hz.c : bk.g, ov0Var, (i4 & 14) | 384 | ((i4 >> 3) & 112), 0);
            ov0Var.p(true);
            str3 = str2;
            bool3 = bool4;
        } else {
            ov0Var.W();
            str3 = str2;
            bool3 = bool2;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new wo1(x01Var, au0Var, str3, bool3, i, i2, 0);
        }
    }

    public static final void i(long j, q93 q93Var, pu0 pu0Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-684938728);
        if ((i & 6) == 0) {
            i2 = (ov0Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.f(q93Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(pu0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            hh0 hh0Var = s83.a;
            k22.c(new kk[]{v50.a.a(new hz(j)), hh0Var.a(((q93) ov0Var.j(hh0Var)).d(q93Var))}, pu0Var, ov0Var, ((i2 >> 3) & 112) | 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new dd2(j, q93Var, pu0Var, i, 0);
        }
    }

    public static final void j(x01 x01Var, au0 au0Var, f30 f30Var, int i) {
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-2038283882);
        int i2 = (ov0Var.f(x01Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= ov0Var.h(au0Var) ? 32 : 16;
        }
        if (ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            av1 av1Var = av1.a;
            dv1 dv1VarA = bk.a(xp1.k(xp1.n(O(iw2.k(av1Var, 46.0f), 4.0f, cj2.a(14.0f), 0L, 0L, 28), cj2.a(14.0f)), hz.c(0.94f, ((kz) ov0Var.j(mz.a)).p), o51.p0), au0Var);
            er1 er1VarC = ws.c(j9.j, false);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarA);
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
            t01.a(x01Var, null, iw2.k(av1Var, 22.0f), bk.g, ov0Var, (i2 & 14) | 3504, 0);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new fj(i, 5, x01Var, au0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:61:0x019a  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x0227  */
    /* JADX WARN: Code duplicated, block: B:77:0x026e  */
    /* JADX WARN: Code duplicated, block: B:79:0x027f  */
    /* JADX WARN: Code duplicated, block: B:82:0x028a  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void k(final String str, final int i, final boolean z, final lu0 lu0Var, boolean z2, f30 f30Var, final int i2, final int i3) {
        boolean z3;
        boolean z4;
        ov0 ov0Var;
        final boolean z5;
        ee2 ee2VarT;
        final boolean z6;
        boolean z7;
        boolean z8;
        Object objQ;
        x30 x30Var;
        boolean z9;
        boolean zG;
        Object objQ2;
        int i4;
        boolean z10;
        boolean z11;
        String str2;
        hh0 hh0Var;
        boolean z12;
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-390228368);
        int i5 = i2 | (ov0Var2.f(str) ? 4 : 2) | (ov0Var2.d(i) ? 32 : 16) | (ov0Var2.g(z) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        int i6 = i5 | 24576;
        int i7 = i3 & 32;
        if (i7 == 0) {
            if ((i2 & 196608) == 0) {
                z3 = z2;
                i6 |= ov0Var2.g(z3) ? 131072 : 65536;
            }
            if ((74899 & i6) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ov0Var2.T(i6 & 1, z4)) {
                if (i7 != 0) {
                    z3 = true;
                }
                if (i > 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                av1 av1Var = av1.a;
                dv1 dv1VarN = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(10.0f));
                boolean zG2 = ov0Var2.g(z6);
                if ((i6 & 896) == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z7 | zG2;
                objQ = ov0Var2.Q();
                c30 c30Var = d30.a;
                if (z8 || objQ == c30Var) {
                    objQ = new au0() { // from class: g11
                        @Override // defpackage.au0
                        public final Object invoke() {
                            if (z6) {
                                lu0Var.invoke(Boolean.valueOf(!z));
                            }
                            return mf3.a;
                        }
                    };
                    ov0Var2.m0(objQ);
                }
                dv1 dv1VarF = zm3.F(bk.a(dv1VarN, (au0) objQ), 0.0f, 4.0f, 1);
                kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var2, 48);
                int iHashCode = Long.hashCode(ov0Var2.T);
                l72 l72VarL = ov0Var2.l();
                dv1 dv1VarH = xp1.H(ov0Var2, dv1VarF);
                w20.b.getClass();
                x30Var = v20.b;
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
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
                if (z || !z6) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                zG = ov0Var2.g(z6);
                objQ2 = ov0Var2.Q();
                if (!zG || objQ2 == c30Var) {
                    i4 = 1;
                    objQ2 = new yc(z6, lu0Var, i4);
                    ov0Var2.m0(objQ2);
                } else {
                    i4 = 1;
                }
                z10 = z6;
                z11 = z3;
                ym3.f(z9, (lu0) objQ2, null, z10, da0.q(bk.g, 0L, 0L, 0L, 0L, ov0Var2, 62), ov0Var2, 0, 36);
                gh0.h(ov0Var2, iw2.o(av1Var, 4.0f));
                wb1 wb1Var = new wb1(1.0f, true);
                yz yzVarA = wz.a(am1.g, j9.r, ov0Var2, 0);
                int iHashCode2 = Long.hashCode(ov0Var2.T);
                l72 l72VarL2 = ov0Var2.l();
                dv1 dv1VarH2 = xp1.H(ov0Var2, wb1Var);
                ov0Var2.g0();
                if (ov0Var2.S) {
                    ov0Var2.k(x30Var);
                } else {
                    ov0Var2.p0();
                }
                q73.h(ov0Var2, ghVar, yzVarA);
                q73.h(ov0Var2, ghVar2, l72VarL2);
                az2.s(iHashCode2, ov0Var2, ghVar3, ov0Var2, waVar);
                q73.h(ov0Var2, ghVar4, dv1VarH2);
                if (z11 || !z10) {
                    ov0Var2.c0(681400699);
                    ov0Var2.p(false);
                    str2 = str;
                } else {
                    ov0Var2.c0(-351515094);
                    String strO = ke0.O(2131624092, new Object[]{str, Integer.valueOf(i)}, ov0Var2);
                    ov0Var2.p(false);
                    str2 = strO;
                }
                long jC = v63.c(14);
                jr0 jr0Var = jr0.h;
                hh0Var = mz.a;
                s83.b(str2, null, hz.c(z10 ? 1.0f : 0.4f, ((kz) ov0Var2.j(hh0Var)).q), jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
                ov0Var = ov0Var2;
                if (z10) {
                    z12 = false;
                    ov0Var.c0(-359486868);
                } else {
                    ov0Var.c0(-350923304);
                    s83.b(ke0.N(2131624089, ov0Var), null, hz.c(0.4f, ((kz) ov0Var.j(hh0Var)).q), v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                    ov0Var = ov0Var;
                    z12 = false;
                }
                ov0Var.p(z12);
                ov0Var.p(true);
                ov0Var.p(true);
                z5 = z11;
            } else {
                ov0Var = ov0Var2;
                ov0Var.W();
                z5 = z3;
            }
            ee2VarT = ov0Var.t();
            if (ee2VarT != null) {
                ee2VarT.d = new pu0() { // from class: h11
                    @Override // defpackage.pu0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        hd0.k(str, i, z, lu0Var, z5, (f30) obj, wc0.m0(i2 | 1), i3);
                        return mf3.a;
                    }
                };
            }
        }
        i6 = 221184 | i5;
        z3 = z2;
        if ((74899 & i6) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ov0Var2.T(i6 & 1, z4)) {
            if (i7 != 0) {
                z3 = true;
            }
            if (i > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            av1 av1Var2 = av1.a;
            dv1 dv1VarN2 = xp1.n(iw2.e(av1Var2, 1.0f), cj2.a(10.0f));
            boolean zG3 = ov0Var2.g(z6);
            if ((i6 & 896) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z7 | zG3;
            objQ = ov0Var2.Q();
            c30 c30Var2 = d30.a;
            if (z8) {
                objQ = new au0() { // from class: g11
                    @Override // defpackage.au0
                    public final Object invoke() {
                        if (z6) {
                            lu0Var.invoke(Boolean.valueOf(!z));
                        }
                        return mf3.a;
                    }
                };
                ov0Var2.m0(objQ);
            } else {
                objQ = new au0() { // from class: g11
                    @Override // defpackage.au0
                    public final Object invoke() {
                        if (z6) {
                            lu0Var.invoke(Boolean.valueOf(!z));
                        }
                        return mf3.a;
                    }
                };
                ov0Var2.m0(objQ);
            }
            dv1 dv1VarF2 = zm3.F(bk.a(dv1VarN2, (au0) objQ), 0.0f, 4.0f, 1);
            kk2 kk2VarA2 = jk2.a(am1.e, j9.p, ov0Var2, 48);
            int iHashCode3 = Long.hashCode(ov0Var2.T);
            l72 l72VarL3 = ov0Var2.l();
            dv1 dv1VarH3 = xp1.H(ov0Var2, dv1VarF2);
            w20.b.getClass();
            x30Var = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            gh ghVar5 = v20.e;
            q73.h(ov0Var2, ghVar5, kk2VarA2);
            gh ghVar6 = v20.d;
            q73.h(ov0Var2, ghVar6, l72VarL3);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            gh ghVar7 = v20.f;
            q73.h(ov0Var2, ghVar7, numValueOf2);
            wa waVar2 = v20.g;
            q73.g(ov0Var2, waVar2);
            gh ghVar8 = v20.c;
            q73.h(ov0Var2, ghVar8, dv1VarH3);
            if (z) {
                z9 = false;
            } else {
                z9 = false;
            }
            zG = ov0Var2.g(z6);
            objQ2 = ov0Var2.Q();
            if (zG) {
                i4 = 1;
                objQ2 = new yc(z6, lu0Var, i4);
                ov0Var2.m0(objQ2);
            } else {
                i4 = 1;
                objQ2 = new yc(z6, lu0Var, i4);
                ov0Var2.m0(objQ2);
            }
            z10 = z6;
            z11 = z3;
            ym3.f(z9, (lu0) objQ2, null, z10, da0.q(bk.g, 0L, 0L, 0L, 0L, ov0Var2, 62), ov0Var2, 0, 36);
            gh0.h(ov0Var2, iw2.o(av1Var2, 4.0f));
            wb1 wb1Var2 = new wb1(1.0f, true);
            yz yzVarA2 = wz.a(am1.g, j9.r, ov0Var2, 0);
            int iHashCode4 = Long.hashCode(ov0Var2.T);
            l72 l72VarL4 = ov0Var2.l();
            dv1 dv1VarH4 = xp1.H(ov0Var2, wb1Var2);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar5, yzVarA2);
            q73.h(ov0Var2, ghVar6, l72VarL4);
            az2.s(iHashCode4, ov0Var2, ghVar7, ov0Var2, waVar2);
            q73.h(ov0Var2, ghVar8, dv1VarH4);
            if (z11) {
                ov0Var2.c0(681400699);
                ov0Var2.p(false);
                str2 = str;
            } else {
                ov0Var2.c0(681400699);
                ov0Var2.p(false);
                str2 = str;
            }
            long jC2 = v63.c(14);
            jr0 jr0Var2 = jr0.h;
            hh0Var = mz.a;
            s83.b(str2, null, hz.c(z10 ? 1.0f : 0.4f, ((kz) ov0Var2.j(hh0Var)).q), jC2, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1597440, 0, 262058);
            ov0Var = ov0Var2;
            if (z10) {
                ov0Var.c0(-350923304);
                s83.b(ke0.N(2131624089, ov0Var), null, hz.c(0.4f, ((kz) ov0Var.j(hh0Var)).q), v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                ov0Var = ov0Var;
                z12 = false;
            } else {
                z12 = false;
                ov0Var.c0(-359486868);
            }
            ov0Var.p(z12);
            ov0Var.p(true);
            ov0Var.p(true);
            z5 = z11;
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
            z5 = z3;
        }
        ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: h11
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hd0.k(str, i, z, lu0Var, z5, (f30) obj, wc0.m0(i2 | 1), i3);
                    return mf3.a;
                }
            };
        }
    }

    public static final void l(final CloudAccountState cloudAccountState, final boolean z, au0 au0Var, au0 au0Var2, f30 f30Var, int i) {
        tt2 tt2Var;
        boolean z2;
        ov0 ov0Var;
        cloudAccountState.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-1366118161);
        int i2 = i | (ov0Var2.h(cloudAccountState) ? 4 : 2) | (ov0Var2.g(z) ? 32 : 16) | (ov0Var2.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(au0Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        int i3 = 1;
        if (ov0Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            ov0Var2.d0(414512006);
            kn2 kn2VarA = v91.a(ov0Var2);
            ov0Var2.d0(1274527078);
            ov0Var2.p(false);
            ov0Var2.d0(511388516);
            q60 q60Var = null;
            boolean zF = ov0Var2.f(null) | ov0Var2.f(kn2VarA);
            Object objQ = ov0Var2.Q();
            c30 c30Var = d30.a;
            if (zF || objQ == c30Var) {
                objQ = kn2VarA.a(xe2.a(tt2.class), null);
                ov0Var2.m0(objQ);
            }
            ov0Var2.p(false);
            ov0Var2.p(false);
            tt2 tt2Var2 = (tt2) objQ;
            ov0Var2.d0(414512006);
            kn2 kn2VarA2 = v91.a(ov0Var2);
            ov0Var2.d0(1274527078);
            ov0Var2.p(false);
            ov0Var2.d0(511388516);
            boolean zF2 = ov0Var2.f(null) | ov0Var2.f(kn2VarA2);
            Object objQ2 = ov0Var2.Q();
            if (zF2 || objQ2 == c30Var) {
                objQ2 = kn2VarA2.a(xe2.a(AccountSyncManager.class), null);
                ov0Var2.m0(objQ2);
            }
            ov0Var2.p(false);
            ov0Var2.p(false);
            final AccountSyncManager accountSyncManager = (AccountSyncManager) objQ2;
            boolean zF3 = ov0Var2.f(tt2Var2);
            Object objQ3 = ov0Var2.Q();
            if (zF3 || objQ3 == c30Var) {
                tt2Var2.getClass();
                objQ3 = FlowKt.callbackFlow(new rt2(tt2Var2, q60Var, i3));
                ov0Var2.m0(objQ3);
            }
            ey1 ey1VarR = ee0.r((Flow) objQ3, tt2Var2.d(), ov0Var2, 0, 2);
            final ey1 ey1VarS = ee0.s(accountSyncManager.getState(), ov0Var2);
            final CloudAccount account = cloudAccountState.getAccount();
            SyncAccess syncAccess = SyncAccess.INSTANCE;
            final boolean zAllowed = syncAccess.allowed(cloudAccountState);
            final SyncSelection syncSelectionSelection = syncAccess.selection(cloudAccountState, (SyncSelection) ey1VarR.getValue());
            Object objQ4 = ov0Var2.Q();
            if (objQ4 == c30Var) {
                objQ4 = ke0.H(Boolean.FALSE);
                ov0Var2.m0(objQ4);
            }
            final ey1 ey1Var = (ey1) objQ4;
            if (((Boolean) ey1Var.getValue()).booleanValue()) {
                ov0Var2.c0(1084661380);
                String strN = ke0.N(2131625068, ov0Var2);
                String strN2 = ke0.N(2131625066, ov0Var2);
                x01 x01VarW = da0.w();
                String strN3 = ke0.N(2131625067, ov0Var2);
                String strN4 = ke0.N(2131624085, ov0Var2);
                Object objQ5 = ov0Var2.Q();
                if (objQ5 == c30Var) {
                    objQ5 = new xj2(ey1Var, 17);
                    ov0Var2.m0(objQ5);
                }
                au0 au0Var3 = (au0) objQ5;
                boolean z3 = (i2 & 7168) == 2048;
                Object objQ6 = ov0Var2.Q();
                if (z3 || objQ6 == c30Var) {
                    objQ6 = new rr1(au0Var2, ey1Var, 1);
                    ov0Var2.m0(objQ6);
                }
                tt2Var = tt2Var2;
                z2 = false;
                ym3.c(strN, strN2, x01VarW, strN3, au0Var3, (au0) objQ6, strN4, ov0Var2, 24576, 0);
                ov0Var = ov0Var2;
            } else {
                tt2Var = tt2Var2;
                z2 = false;
                ov0Var = ov0Var2;
                ov0Var.c0(1082524147);
            }
            ov0Var.p(z2);
            long j = z ? bk.a : bk.d;
            long jD = z ? xp1.d(4280428334L) : hz.c;
            xq1.g(z2, au0Var, ov0Var, (i2 >> 3) & 112, 1);
            p10 p10VarA0 = sb.a0(-330137429, new s80(j, au0Var), ov0Var);
            ov0 ov0Var3 = ov0Var;
            final long j2 = j;
            final long j3 = jD;
            final tt2 tt2Var3 = tt2Var;
            wc0.n(null, p10VarA0, null, null, null, 0, j2, 0L, null, sb.a0(611470400, new qu0() { // from class: e43
                @Override // defpackage.qu0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z42 z42Var = (z42) obj;
                    f30 f30Var2 = (f30) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    z42Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((ov0) f30Var2).f(z42Var) ? 4 : 2;
                    }
                    ov0 ov0Var4 = (ov0) f30Var2;
                    if (ov0Var4.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                        dv1 dv1VarK = xp1.k(zm3.C(iw2.c, z42Var), j2, o51.p0);
                        b52 b52Var = new b52(16.0f, 16.0f, 16.0f, 16.0f);
                        jo joVar = new jo(14.0f, true, new fo(0));
                        final long j4 = j3;
                        boolean zE = ov0Var4.e(j4);
                        final SyncSelection syncSelection = syncSelectionSelection;
                        boolean zH = zE | ov0Var4.h(syncSelection);
                        final boolean z4 = zAllowed;
                        boolean zG = zH | ov0Var4.g(z4);
                        final tt2 tt2Var4 = tt2Var3;
                        boolean zH2 = zG | ov0Var4.h(tt2Var4);
                        final boolean z5 = z;
                        boolean zG2 = zH2 | ov0Var4.g(z5);
                        final CloudAccountState cloudAccountState2 = cloudAccountState;
                        boolean zH3 = zG2 | ov0Var4.h(cloudAccountState2);
                        final CloudAccount cloudAccount = account;
                        boolean zH4 = zH3 | ov0Var4.h(cloudAccount);
                        final s03 s03Var = ey1VarS;
                        boolean zF4 = zH4 | ov0Var4.f(s03Var);
                        final AccountSyncManager accountSyncManager2 = accountSyncManager;
                        boolean zH5 = zF4 | ov0Var4.h(accountSyncManager2);
                        Object objQ7 = ov0Var4.Q();
                        if (zH5 || objQ7 == d30.a) {
                            final ey1 ey1Var2 = ey1Var;
                            lu0 lu0Var = new lu0() { // from class: f43
                                @Override // defpackage.lu0
                                public final Object invoke(Object obj4) {
                                    kd1 kd1Var = (kd1) obj4;
                                    kd1Var.getClass();
                                    final long j5 = j4;
                                    final SyncSelection syncSelection2 = syncSelection;
                                    final boolean z6 = z4;
                                    final tt2 tt2Var5 = tt2Var4;
                                    final boolean z7 = z5;
                                    final ey1 ey1Var3 = ey1Var2;
                                    kd1Var.a(null, null, new p10(new qu0() { // from class: g43
                                        @Override // defpackage.qu0
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            f30 f30Var3 = (f30) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            ((bc1) obj5).getClass();
                                            ov0 ov0Var5 = (ov0) f30Var3;
                                            if (ov0Var5.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                aw awVarT = ym3.t(j5, 0L, ov0Var5, 0, 14);
                                                final SyncSelection syncSelection3 = syncSelection2;
                                                final boolean z8 = z6;
                                                final tt2 tt2Var6 = tt2Var5;
                                                final boolean z9 = z7;
                                                final ey1 ey1Var4 = ey1Var3;
                                                sb.C(null, null, awVarT, null, sb.a0(991039111, new qu0() { // from class: c43
                                                    @Override // defpackage.qu0
                                                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                        f30 f30Var4 = (f30) obj9;
                                                        int iIntValue3 = ((Integer) obj10).intValue();
                                                        ((zz) obj8).getClass();
                                                        ov0 ov0Var6 = (ov0) f30Var4;
                                                        if (ov0Var6.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                            dv1 dv1VarD = zm3.D(iw2.e(av1.a, 1.0f), 16.0f);
                                                            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var6, 48);
                                                            int iHashCode = Long.hashCode(ov0Var6.T);
                                                            l72 l72VarL = ov0Var6.l();
                                                            dv1 dv1VarH = xp1.H(ov0Var6, dv1VarD);
                                                            w20.b.getClass();
                                                            x30 x30Var = v20.b;
                                                            ov0Var6.g0();
                                                            if (ov0Var6.S) {
                                                                ov0Var6.k(x30Var);
                                                            } else {
                                                                ov0Var6.p0();
                                                            }
                                                            gh ghVar = v20.e;
                                                            q73.h(ov0Var6, ghVar, kk2VarA);
                                                            gh ghVar2 = v20.d;
                                                            q73.h(ov0Var6, ghVar2, l72VarL);
                                                            Integer numValueOf = Integer.valueOf(iHashCode);
                                                            gh ghVar3 = v20.f;
                                                            q73.h(ov0Var6, ghVar3, numValueOf);
                                                            wa waVar = v20.g;
                                                            q73.g(ov0Var6, waVar);
                                                            gh ghVar4 = v20.c;
                                                            q73.h(ov0Var6, ghVar4, dv1VarH);
                                                            dv1 dv1VarG = zm3.G(new wb1(1.0f, true), 0.0f, 0.0f, 12.0f, 0.0f, 11);
                                                            yz yzVarA = wz.a(am1.g, j9.r, ov0Var6, 0);
                                                            int iHashCode2 = Long.hashCode(ov0Var6.T);
                                                            l72 l72VarL2 = ov0Var6.l();
                                                            dv1 dv1VarH2 = xp1.H(ov0Var6, dv1VarG);
                                                            ov0Var6.g0();
                                                            if (ov0Var6.S) {
                                                                ov0Var6.k(x30Var);
                                                            } else {
                                                                ov0Var6.p0();
                                                            }
                                                            q73.h(ov0Var6, ghVar, yzVarA);
                                                            q73.h(ov0Var6, ghVar2, l72VarL2);
                                                            az2.s(iHashCode2, ov0Var6, ghVar3, ov0Var6, waVar);
                                                            q73.h(ov0Var6, ghVar4, dv1VarH2);
                                                            String strN5 = ke0.N(2131625076, ov0Var6);
                                                            hh0 hh0Var = le3.a;
                                                            s83.b(strN5, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var6.j(hh0Var)).h, ov0Var6, 0, 0, 131070);
                                                            s83.b(ke0.N(2131625069, ov0Var6), null, ((kz) ov0Var6.j(mz.a)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var6.j(hh0Var)).l, ov0Var6, 0, 0, 131066);
                                                            ov0Var6.p(true);
                                                            boolean enabled = syncSelection3.getEnabled();
                                                            boolean z10 = z8;
                                                            boolean zG3 = ov0Var6.g(z10);
                                                            tt2 tt2Var7 = tt2Var6;
                                                            boolean zH6 = zG3 | ov0Var6.h(tt2Var7);
                                                            Object objQ8 = ov0Var6.Q();
                                                            if (zH6 || objQ8 == d30.a) {
                                                                objQ8 = new d43(z10, tt2Var7, ey1Var4);
                                                                ov0Var6.m0(objQ8);
                                                            }
                                                            lu0 lu0Var2 = (lu0) objQ8;
                                                            long j6 = hz.c;
                                                            long j7 = bk.g;
                                                            boolean z11 = z9;
                                                            b43.a(enabled, lu0Var2, null, false, mc0.m(j6, j7, xp1.d(z11 ? 4289376957L : 4287075233L), xp1.d(z11 ? 4282073674L : 4293126383L), hz.f, 0L, ov0Var6, 65420), ov0Var6, 0, 92);
                                                            ov0Var6.p(true);
                                                        } else {
                                                            ov0Var6.W();
                                                        }
                                                        return mf3.a;
                                                    }
                                                }, ov0Var5), ov0Var5, 196608, 27);
                                            } else {
                                                ov0Var5.W();
                                            }
                                            return mf3.a;
                                        }
                                    }, true, 1472172181));
                                    kd1Var.a(null, null, n51.E);
                                    kd1Var.a(null, null, new p10(new iv2(j5, syncSelection2, tt2Var5), true, 1117919181));
                                    kd1Var.a(null, null, n51.F);
                                    kd1Var.a(null, null, new p10(new jl2(j5, cloudAccountState2, z6, syncSelection2, cloudAccount, accountSyncManager2, s03Var), true, -1794906929));
                                    return mf3.a;
                                }
                            };
                            ov0Var4.m0(lu0Var);
                            objQ7 = lu0Var;
                        }
                        ke0.d(dv1VarK, null, b52Var, joVar, null, null, false, null, (lu0) objQ7, ov0Var4, 24960, 490);
                    } else {
                        ov0Var4.W();
                    }
                    return mf3.a;
                }
            }, ov0Var3), ov0Var3, 805306416, 445);
            ov0Var2 = ov0Var3;
        } else {
            ov0Var2.W();
        }
        ee2 ee2VarT = ov0Var2.t();
        if (ee2VarT != null) {
            ee2VarT.d = new k2(cloudAccountState, z, au0Var, au0Var2, i, 2);
        }
    }

    public static final int m(ck1 ck1Var, m9 m9Var) {
        ck1 ck1VarT0 = ck1Var.T0();
        if (ck1VarT0 == null) {
            p21.c("Child of " + ck1Var + " cannot be null when calculating alignment line");
        }
        if (ck1Var.b1().c().containsKey(m9Var)) {
            Integer num = (Integer) ck1Var.b1().c().get(m9Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iX0 = ck1VarT0.x0(m9Var);
            if (iX0 != Integer.MIN_VALUE) {
                ck1VarT0.n = true;
                ck1Var.o = true;
                ck1Var.h1();
                ck1VarT0.n = false;
                ck1Var.o = false;
                return iX0 + ((int) (m9Var instanceof dy0 ? ck1VarT0.d1() & 4294967295L : ck1VarT0.d1() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final ey1 o(ix1 ix1Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        Object objQ = ov0Var.Q();
        c30 c30Var = d30.a;
        if (objQ == c30Var) {
            objQ = ke0.H(Boolean.FALSE);
            ov0Var.m0(objQ);
        }
        ey1 ey1Var = (ey1) objQ;
        int i2 = 1;
        boolean z = (((i & 14) ^ 6) > 4 && ov0Var.f(ix1Var)) || (i & 6) == 4;
        Object objQ2 = ov0Var.Q();
        if (z || objQ2 == c30Var) {
            objQ2 = new pf0(ix1Var, ey1Var, null, i2);
            ov0Var.m0(objQ2);
        }
        oi0.e(ov0Var, (pu0) objQ2, ix1Var);
        return ey1Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003e A[RETURN] */
    public static final int p(bl2 bl2Var, String str) {
        bl2Var.getClass();
        int columnCount = bl2Var.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(bl2Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String strP = p91.p("`", str, '`');
        int columnCount2 = bl2Var.getColumnCount();
        while (i < columnCount2) {
            if (strP.equals(bl2Var.getColumnName(i))) {
                if (i >= 0) {
                    return i;
                }
                return -1;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    public static final int q(long j, long j2) {
        boolean zJ = J(j);
        if (zJ != J(j2)) {
            return zJ ? -1 : 1;
        }
        int iSignum = (int) Math.signum(x(j) - x(j2));
        if (Math.min(x(j), x(j2)) >= 0.0f && I(j) != I(j2)) {
            return I(j) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static q60 r(pu0 pu0Var, Object obj, q60 q60Var) {
        pu0Var.getClass();
        q60Var.getClass();
        if (pu0Var instanceof oq) {
            return ((oq) pu0Var).create(obj, q60Var);
        }
        y70 context = q60Var.getContext();
        return context == sj0.e ? new r51(pu0Var, obj, q60Var) : new s51(q60Var, context, pu0Var, obj);
    }

    public static final wk0 s(Enum[] enumArr) {
        enumArr.getClass();
        return new wk0(enumArr);
    }

    public static final int t(List list, int i) {
        int i2;
        byte b2;
        int i3 = ((l52) zy.t0(list)).c;
        if (i > ((l52) zy.t0(list)).c) {
            q21.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            l52 l52Var = (l52) list.get(i2);
            if (l52Var.b > i) {
                b2 = 1;
            } else {
                b2 = l52Var.c <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbR = p91.r(i2, "Found paragraph index ", " should be in range [0, ");
        sbR.append(list.size());
        sbR.append(").\nDebug info: index=");
        sbR.append(i);
        sbR.append(", paragraphs=[");
        sbR.append(xg1.a(list, null, new yk1(15), 31));
        sbR.append(']');
        q21.a(sbR.toString());
        return i2;
    }

    public static final int u(List list, int i) {
        byte b2;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            l52 l52Var = (l52) list.get(i3);
            if (l52Var.d > i) {
                b2 = 1;
            } else {
                b2 = l52Var.e <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int v(ArrayList arrayList, float f) {
        byte b2;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((l52) zy.t0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            l52 l52Var = (l52) arrayList.get(i2);
            if (l52Var.f > f) {
                b2 = 1;
            } else {
                b2 = l52Var.g <= f ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i = i2 + 1;
            } else {
                if (b2 <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void w(ArrayList arrayList, long j, lu0 lu0Var) {
        int size = arrayList.size();
        for (int iT = t(arrayList, f93.f(j)); iT < size; iT++) {
            l52 l52Var = (l52) arrayList.get(iT);
            if (l52Var.b >= f93.e(j)) {
                return;
            }
            if (l52Var.b != l52Var.c) {
                lu0Var.invoke(l52Var);
            }
        }
    }

    public static final float x(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final x01 y() {
        x01 x01Var = a;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.Gamepad", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = nh3.a;
        qy2 qy2Var = new qy2(hz.b);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(15.0f, 7.29f);
        nx0Var.k(15.0f, 3.0f);
        nx0Var.g(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        nx0Var.i(-4.0f);
        nx0Var.g(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        nx0Var.s(4.29f);
        nx0Var.g(0.0f, 0.13f, 0.05f, 0.26f, 0.15f, 0.35f);
        nx0Var.l(2.5f, 2.5f);
        nx0Var.g(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        nx0Var.l(2.5f, -2.5f);
        nx0Var.g(0.09f, -0.09f, 0.14f, -0.21f, 0.14f, -0.35f);
        nx0Var.e();
        nx0Var.m(7.29f, 9.0f);
        nx0Var.k(3.0f, 9.0f);
        nx0Var.g(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        nx0Var.s(4.0f);
        nx0Var.g(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        nx0Var.i(4.29f);
        nx0Var.g(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
        nx0Var.l(2.5f, -2.5f);
        nx0Var.g(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        nx0Var.l(-2.5f, -2.5f);
        nx0Var.f(7.55f, 9.05f, 7.43f, 9.0f, 7.29f, 9.0f);
        nx0Var.e();
        nx0Var.m(9.0f, 16.71f);
        nx0Var.k(9.0f, 21.0f);
        nx0Var.g(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        nx0Var.i(4.0f);
        nx0Var.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        nx0Var.s(-4.29f);
        nx0Var.g(0.0f, -0.13f, -0.05f, -0.26f, -0.15f, -0.35f);
        nx0Var.l(-2.5f, -2.5f);
        nx0Var.g(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        nx0Var.l(-2.5f, 2.5f);
        nx0Var.g(-0.09f, 0.09f, -0.14f, 0.21f, -0.14f, 0.35f);
        nx0Var.e();
        nx0Var.m(16.35f, 9.15f);
        nx0Var.l(-2.5f, 2.5f);
        nx0Var.g(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        nx0Var.l(2.5f, 2.5f);
        nx0Var.g(0.09f, 0.09f, 0.22f, 0.15f, 0.35f, 0.15f);
        nx0Var.k(21.0f, 15.01f);
        nx0Var.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        nx0Var.s(-4.0f);
        nx0Var.g(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        nx0Var.i(-4.29f);
        nx0Var.g(-0.14f, -0.01f, -0.26f, 0.04f, -0.36f, 0.14f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        x01 x01VarB = w01Var.b();
        a = x01VarB;
        return x01VarB;
    }

    public static final int z(sw1 sw1Var, long j, aj3 aj3Var) {
        float f = aj3Var != null ? aj3Var.f() : 0.0f;
        int i = (int) (4294967295L & j);
        int iE = sw1Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < sw1Var.f(iE) - f || Float.intBitsToFloat(i) > sw1Var.b(iE) + f) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-f) || Float.intBitsToFloat(i2) > sw1Var.d + f) {
            return -1;
        }
        return iE;
    }

    public abstract void n();
}
