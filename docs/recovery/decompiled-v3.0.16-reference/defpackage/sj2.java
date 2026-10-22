package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.GaitRecordingState;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class sj2 {
    public static final void a(AppState appState, lu0 lu0Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1890025476);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(appState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.h(lu0Var) ? 32 : 16;
        }
        int i3 = 0;
        if (ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            zm3.b(iw2.e(av1.a, 1.0f), 18.0f, new b52(16.0f, 16.0f, 16.0f, 16.0f), sb.a0(544943019, new pj2(appState, lu0Var, i3), ov0Var), ov0Var, 25014, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new qj2(appState, lu0Var, i, i3);
        }
    }

    public static final void b(x01 x01Var, long j, String str, String str2, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(960780856);
        int i2 = i | (ov0Var.f(x01Var) ? 4 : 2) | (ov0Var.f(str) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.f(str2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            av1 av1Var = av1.a;
            dv1 dv1VarH = xp1.H(ov0Var, av1Var);
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
            dv1 dv1VarK = xp1.k(xp1.n(iw2.k(av1Var, 36.0f), cj2.a(11.0f)), hz.c(0.12f, j), o51.p0);
            er1 er1VarC = ws.c(j9.j, false);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarK);
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
            t01.a(x01Var, null, iw2.k(av1Var, 19.0f), j, ov0Var, (i2 & 14) | 3504, 0);
            az2.t(ov0Var, true, av1Var, 12.0f, ov0Var);
            yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
            int iHashCode3 = Long.hashCode(ov0Var.T);
            l72 l72VarL3 = ov0Var.l();
            dv1 dv1VarH3 = xp1.H(ov0Var, av1Var);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA);
            q73.h(ov0Var, ghVar2, l72VarL3);
            az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH3);
            long jB = v63.b(15.5d);
            jr0 jr0Var = jr0.j;
            hh0 hh0Var = mz.a;
            s83.b(str, null, ((kz) ov0Var.j(hh0Var)).q, jB, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, ((i2 >> 6) & 14) | 1597440, 0, 262058);
            s83.b(str2, null, hz.c(0.45f, ((kz) ov0Var.j(hh0Var)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, ((i2 >> 9) & 14) | 24576, 0, 262122);
            ov0Var = ov0Var;
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new q80(x01Var, j, str, str2, i, 2);
        }
    }

    public static final void c(ul1 ul1Var, AppState appState, boolean z, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-2087212642);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(ul1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.h(appState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.g(z) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            zm3.b(iw2.e(av1.a, 1.0f), 18.0f, new b52(16.0f, 16.0f, 16.0f, 16.0f), sb.a0(-460749619, new pi2(appState, ul1Var, z), ov0Var), ov0Var, 25014, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new yf(ul1Var, appState, z, i, 4);
        }
    }

    public static final void d(final String str, final boolean z, f30 f30Var, final int i) {
        int i2;
        long j;
        float f;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-2005839264);
        if ((i & 6) == 0) {
            i2 = i | (ov0Var.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.g(z) ? 32 : 16;
        }
        int i3 = i2;
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            av1 av1Var = av1.a;
            dv1 dv1VarN = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(12.0f));
            if (z) {
                j = hz.c;
                f = 0.04f;
            } else {
                j = hz.b;
                f = 0.03f;
            }
            dv1 dv1VarE = zm3.E(xp1.k(dv1VarN, hz.c(f, j), o51.p0), 12.0f, 10.0f);
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
            q73.h(ov0Var, v20.e, kk2VarA);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            x01 x01VarB = ke0.g;
            if (x01VarB == null) {
                w01 w01Var = new w01("Rounded.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i4 = nh3.a;
                qy2 qy2Var = new qy2(hz.b);
                nx0 nx0VarI = p91.i(12.0f, 2.0f);
                nx0VarI.f(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                nx0VarI.o(4.48f, 10.0f, 10.0f, 10.0f);
                nx0VarI.o(10.0f, -4.48f, 10.0f, -10.0f);
                nx0VarI.n(17.52f, 2.0f, 12.0f, 2.0f);
                nx0VarI.e();
                nx0VarI.m(12.0f, 17.0f);
                nx0VarI.g(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                nx0VarI.s(-4.0f);
                nx0VarI.g(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                nx0VarI.o(1.0f, 0.45f, 1.0f, 1.0f);
                nx0VarI.s(4.0f);
                nx0VarI.g(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                nx0VarI.e();
                nx0VarI.m(13.0f, 9.0f);
                nx0VarI.i(-2.0f);
                nx0VarI.k(11.0f, 7.0f);
                nx0VarI.i(2.0f);
                nx0VarI.s(2.0f);
                nx0VarI.e();
                w01.a(w01Var, nx0VarI.a, qy2Var);
                x01VarB = w01Var.b();
                ke0.g = x01VarB;
            }
            x01 x01Var = x01VarB;
            hh0 hh0Var = mz.a;
            t01.a(x01Var, null, iw2.k(av1Var, 16.0f), hz.c(0.5f, ((kz) ov0Var.j(hh0Var)).q), ov0Var, 432, 0);
            gh0.h(ov0Var, iw2.o(av1Var, 8.0f));
            s83.b(str, null, hz.c(0.5f, ((kz) ov0Var.j(hh0Var)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, (i3 & 14) | 24576, 0, 262122);
            ov0Var = ov0Var;
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: rj2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iM0 = wc0.m0(i | 1);
                    sj2.d(str, z, (f30) obj, iM0);
                    return mf3.a;
                }
            };
        }
    }

    public static final void e(AppState appState, boolean z, lu0 lu0Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1566215500);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(appState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(lu0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            zm3.b(iw2.e(av1.a, 1.0f), 18.0f, new b52(16.0f, 16.0f, 16.0f, 16.0f), sb.a0(-293783301, new gl1(appState, z, lu0Var), ov0Var), ov0Var, 25014, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new yf(appState, z, lu0Var, i, 3);
        }
    }

    public static final void f(ul1 ul1Var, AppState appState, boolean z, f30 f30Var, int i) {
        ov0 ov0Var;
        boolean z2;
        boolean zW;
        int i2;
        ul1Var.getClass();
        appState.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-214731473);
        int i3 = 2;
        int i4 = i | (ov0Var2.h(ul1Var) ? 4 : 2) | (ov0Var2.h(appState) ? 32 : 16) | WorkQueueKt.BUFFER_CAPACITY;
        if (ov0Var2.T(i4 & 1, (i4 & 147) != 146)) {
            ov0Var2.Y();
            if ((i & 1) == 0 || ov0Var2.B()) {
                zW = n51.w(ov0Var2);
                i2 = i4 & (-897);
            } else {
                ov0Var2.W();
                i2 = i4 & (-897);
                zW = z;
            }
            ov0Var2.q();
            GaitRecordingState gaitRecording = appState.getGaitRecording();
            boolean z3 = (gaitRecording instanceof GaitRecordingState.Countdown) || (gaitRecording instanceof GaitRecordingState.Recording);
            View view = (View) ov0Var2.j(AndroidCompositionLocals_androidKt.f);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zH = ov0Var2.h(view) | ov0Var2.g(z3);
            Object objQ = ov0Var2.Q();
            c30 c30Var = d30.a;
            if (zH || objQ == c30Var) {
                objQ = new yc(view, z3, i3);
                ov0Var2.m0(objQ);
            }
            oi0.a(boolValueOf, (lu0) objQ, ov0Var2);
            boolean zH2 = ov0Var2.h(ul1Var);
            Object objQ2 = ov0Var2.Q();
            if (zH2 || objQ2 == c30Var) {
                objQ2 = new qi1(ul1Var, 7);
                ov0Var2.m0(objQ2);
            }
            oi0.a(mf3.a, (lu0) objQ2, ov0Var2);
            yz yzVarA = wz.a(new jo(14.0f, true, new fo(0)), j9.r, ov0Var2, 6);
            int iHashCode = Long.hashCode(ov0Var2.T);
            l72 l72VarL = ov0Var2.l();
            dv1 dv1VarH = xp1.H(ov0Var2, av1.a);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, v20.e, yzVarA);
            q73.h(ov0Var2, v20.d, l72VarL);
            q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var2, v20.g);
            q73.h(ov0Var2, v20.c, dv1VarH);
            int i5 = i2;
            boolean z4 = zW;
            s83.b(ke0.N(2131624775, ov0Var2), null, ((kz) ov0Var2.j(mz.a)).q, 0L, jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 1572864, 0, 262074);
            ov0Var = ov0Var2;
            boolean zH3 = ov0Var.h(ul1Var);
            Object objQ3 = ov0Var.Q();
            if (zH3 || objQ3 == c30Var) {
                objQ3 = new qi1(ul1Var, 9);
                ov0Var.m0(objQ3);
            }
            int i6 = i5 >> 3;
            int i7 = i6 & 14;
            z2 = z4;
            e(appState, z2, (lu0) objQ3, ov0Var, i6 & 126);
            boolean zH4 = ov0Var.h(ul1Var);
            Object objQ4 = ov0Var.Q();
            if (zH4 || objQ4 == c30Var) {
                objQ4 = new qi1(ul1Var, 10);
                ov0Var.m0(objQ4);
            }
            g(appState, (lu0) objQ4, ov0Var, i7);
            boolean zH5 = ov0Var.h(ul1Var);
            Object objQ5 = ov0Var.Q();
            if (zH5 || objQ5 == c30Var) {
                objQ5 = new qi1(ul1Var, 11);
                ov0Var.m0(objQ5);
            }
            a(appState, (lu0) objQ5, ov0Var, i7);
            c(ul1Var, appState, z2, ov0Var, i5 & 1022);
            d(ke0.N(2131624848, ov0Var), z2, ov0Var, 0);
            ov0Var.p(true);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
            z2 = z;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new n90(ul1Var, appState, z2, i, 1);
        }
    }

    public static final void g(AppState appState, lu0 lu0Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-910703038);
        if ((i & 6) == 0) {
            i2 = (ov0Var.h(appState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.h(lu0Var) ? 32 : 16;
        }
        int i3 = 1;
        if (ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            zm3.b(iw2.e(av1.a, 1.0f), 18.0f, new b52(16.0f, 16.0f, 16.0f, 16.0f), sb.a0(715759985, new pj2(appState, lu0Var, i3), ov0Var), ov0Var, 25014, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new qj2(appState, lu0Var, i, i3);
        }
    }
}
