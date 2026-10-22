package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.widget.EdgeEffect;
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.db.CompleteLocation;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RoutePlanStage;
import com.vincenthzr.locationspoofer.data.model.RouteRunMode;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import java.io.IOException;
import java.net.ProtocolException;
import java.security.cert.Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class mc0 {
    public static x01 a = null;
    public static final int b = 9;
    public static final int c = 10;
    public static final int d = 12;
    public static x01 e;

    public static float A(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return oh0.c(edgeEffect, f, f2);
        }
        nh0.a(edgeEffect, f, f2);
        return f;
    }

    public static q01 B(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean Z = s13.Z(str, "HTTP/1.", false);
        bd2 bd2Var = bd2.f;
        if (Z) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                bd2Var = bd2.g;
            }
        } else {
            if (!s13.Z(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new q01(bd2Var, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static dv1 C(dv1 dv1Var, bf bfVar) {
        return dv1Var.d(new s92(bfVar));
    }

    public static final void D(kx2 kx2Var, un unVar, int i) {
        while (true) {
            int i2 = kx2Var.v;
            if (i > i2 && i < kx2Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            kx2Var.L();
            if (kx2Var.x(kx2Var.v)) {
                unVar.s();
            }
            kx2Var.i();
        }
    }

    public static final long E(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static Set H(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static final long I(long j) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j >> 32));
        return (((long) ((int) Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iIntBitsToFloat) << 32);
    }

    public static final long J(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final yz2 K(vv1 vv1Var, f30 f30Var) {
        uv1 uv1Var = (uv1) ((ov0) f30Var).j(wq1.a);
        int iOrdinal = vv1Var.ordinal();
        if (iOrdinal == 0) {
            uv1Var.getClass();
            yz2 yz2Var = uv1.b;
            yz2Var.getClass();
            return yz2Var;
        }
        if (iOrdinal == 1) {
            uv1Var.getClass();
            yz2 yz2Var2 = uv1.c;
            yz2Var2.getClass();
            return yz2Var2;
        }
        if (iOrdinal == 2) {
            uv1Var.getClass();
            yz2 yz2Var3 = uv1.d;
            yz2Var3.getClass();
            return yz2Var3;
        }
        if (iOrdinal == 3) {
            uv1Var.getClass();
            yz2 yz2Var4 = uv1.e;
            yz2Var4.getClass();
            return yz2Var4;
        }
        if (iOrdinal == 4) {
            uv1Var.getClass();
            yz2 yz2Var5 = uv1.f;
            yz2Var5.getClass();
            return yz2Var5;
        }
        if (iOrdinal != 5) {
            b81.d();
            return null;
        }
        uv1Var.getClass();
        yz2 yz2Var6 = uv1.g;
        yz2Var6.getClass();
        return yz2Var6;
    }

    public static final void a(f52 f52Var, String str, dv1 dv1Var, l9 l9Var, c30 c30Var, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1142754848);
        int i2 = i | (ov0Var.h(f52Var) ? 4 : 2) | (ov0Var.f(str) ? 32 : 16) | (ov0Var.f(l9Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var.f(c30Var) ? 16384 : 8192) | (ov0Var.c(1.0f) ? 131072 : 65536) | (ov0Var.f(null) ? 1048576 : 524288);
        if (ov0Var.T(i2 & 1, (599187 & i2) != 599186)) {
            dv1 dv1VarA = av1.a;
            c30 c30Var2 = d30.a;
            if (str != null) {
                ov0Var.c0(1899222916);
                boolean z = (i2 & 112) == 32;
                Object objQ = ov0Var.Q();
                if (z || objQ == c30Var2) {
                    objQ = new z90(str, 3);
                    ov0Var.m0(objQ);
                }
                dv1VarA = gs2.a(dv1VarA, false, (lu0) objQ);
                ov0Var.p(false);
            } else {
                ov0Var.c0(1899381698);
                ov0Var.p(false);
            }
            dv1 dv1VarY = sb.Y(xp1.o(dv1Var.d(dv1VarA)), f52Var, l9Var, c30Var, null, 2);
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var2) {
                objQ2 = lc.h;
                ov0Var.m0(objQ2);
            }
            er1 er1Var = (er1) objQ2;
            int iHashCode = Long.hashCode(ov0Var.T);
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarY);
            l72 l72VarL = ov0Var.l();
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, v20.e, er1Var);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new j3(f52Var, str, dv1Var, l9Var, c30Var, i);
        }
    }

    public static final void b(final Object obj, final int i, final tc1 tc1Var, final p10 p10Var, f30 f30Var, final int i2) {
        int i3;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(872548579);
        if ((i2 & 6) == 0) {
            i3 = (ov0Var.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ov0Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ov0Var.h(tc1Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ov0Var.h(p10Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zF = ov0Var.f(obj) | ov0Var.f(tc1Var);
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (zF || objQ == c30Var) {
                objQ = new rc1(obj, tc1Var);
                ov0Var.m0(objQ);
            }
            rc1 rc1Var = (rc1) objQ;
            rc1Var.c = i;
            w52 w52Var = rc1Var.g;
            hh0 hh0Var = f82.a;
            rc1 rc1Var2 = (rc1) ov0Var.j(hh0Var);
            nx2 nx2VarK = wc0.K();
            lu0 lu0VarE = nx2VarK != null ? nx2VarK.e() : null;
            nx2 nx2VarS = wc0.S(nx2VarK);
            try {
                if (rc1Var2 != ((rc1) w52Var.getValue())) {
                    w52Var.setValue(rc1Var2);
                    if (rc1Var.d > 0) {
                        rc1 rc1Var3 = rc1Var.e;
                        if (rc1Var3 != null) {
                            rc1Var3.b();
                        }
                        if (rc1Var2 != null) {
                            rc1Var2.a();
                        } else {
                            rc1Var2 = null;
                        }
                        rc1Var.e = rc1Var2;
                    }
                }
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                boolean zF2 = ov0Var.f(rc1Var);
                Object objQ2 = ov0Var.Q();
                if (zF2 || objQ2 == c30Var) {
                    objQ2 = new t(rc1Var, 22);
                    ov0Var.m0(objQ2);
                }
                oi0.a(rc1Var, (lu0) objQ2, ov0Var);
                k22.b(hh0Var.a(rc1Var), p10Var, ov0Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                wc0.g0(nx2VarK, nx2VarS, lu0VarE);
                throw th;
            }
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0() { // from class: sc1
                @Override // defpackage.pu0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    mc0.b(obj, i, tc1Var, p10Var, (f30) obj2, wc0.m0(i2 | 1));
                    return mf3.a;
                }
            };
        }
    }

    public static final void c(final CompleteLocation completeLocation, final String str, final boolean z, au0 au0Var, final au0 au0Var2, f30 f30Var, int i) {
        String strH;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1699507780);
        int i2 = i | (ov0Var.h(completeLocation) ? 4 : 2) | (ov0Var.f(str) ? 32 : 16) | (ov0Var.g(z) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var.h(au0Var2) ? 16384 : 8192);
        if (ov0Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zK0 = l13.k0(completeLocation.getLocation().getRemark());
            boolean zK1 = l13.k0(completeLocation.getLocation().getPlaceName());
            if (!zK1) {
                ov0Var.c0(1139416717);
                ov0Var.p(false);
                strH = completeLocation.getLocation().getPlaceName();
            } else if (zK0) {
                strH = az2.h(ov0Var, 1139418927, 2131624351, ov0Var, false);
            } else {
                ov0Var.c0(1139418154);
                ov0Var.p(false);
                strH = completeLocation.getLocation().getRemark();
            }
            final String str2 = strH;
            final String remark = (zK1 || zK0) ? null : completeLocation.getLocation().getRemark();
            final int size = completeLocation.getWifis().size() + (completeLocation.getConnectedWifi() == null ? 0 : 1);
            final int size2 = completeLocation.getCells().size();
            final int size3 = completeLocation.getBluetooths().size();
            zm3.b(bk.a(iw2.e(av1.a, 1.0f), au0Var), 16.0f, new b52(14.0f, 14.0f, 14.0f, 14.0f), sb.a0(-790446861, new qu0() { // from class: dh1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v18 */
                /* JADX WARN: Type inference failed for: r2v19, types: [boolean, byte] */
                /* JADX WARN: Type inference failed for: r2v21 */
                @Override // defpackage.qu0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    wa waVar;
                    boolean z2;
                    ?? r2;
                    f30 f30Var2 = (f30) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((zz) obj).getClass();
                    ov0 ov0Var2 = (ov0) f30Var2;
                    if (ov0Var2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        av1 av1Var = av1.a;
                        dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                        or orVar = j9.p;
                        kk2 kk2VarA = jk2.a(am1.e, orVar, ov0Var2, 48);
                        int iHashCode = Long.hashCode(ov0Var2.T);
                        l72 l72VarL = ov0Var2.l();
                        dv1 dv1VarH = xp1.H(ov0Var2, dv1VarE);
                        w20.b.getClass();
                        x30 x30Var = v20.b;
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
                        wa waVar2 = v20.g;
                        q73.g(ov0Var2, waVar2);
                        gh ghVar4 = v20.c;
                        q73.h(ov0Var2, ghVar4, dv1VarH);
                        if (1.0f <= 0.0d) {
                            n21.a("invalid weight; must be greater than zero");
                        }
                        wb1 wb1Var = new wb1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                        yz yzVarA = wz.a(new jo(6.0f, true, new fo(0)), j9.r, ov0Var2, 6);
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
                        az2.s(iHashCode2, ov0Var2, ghVar3, ov0Var2, waVar2);
                        q73.h(ov0Var2, ghVar4, dv1VarH2);
                        dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                        kk2 kk2VarA2 = jk2.a(am1.i, j9.o, ov0Var2, 54);
                        int iHashCode3 = Long.hashCode(ov0Var2.T);
                        l72 l72VarL3 = ov0Var2.l();
                        dv1 dv1VarH3 = xp1.H(ov0Var2, dv1VarE2);
                        ov0Var2.g0();
                        if (ov0Var2.S) {
                            ov0Var2.k(x30Var);
                        } else {
                            ov0Var2.p0();
                        }
                        q73.h(ov0Var2, ghVar, kk2VarA2);
                        q73.h(ov0Var2, ghVar2, l72VarL3);
                        az2.s(iHashCode3, ov0Var2, ghVar3, ov0Var2, waVar2);
                        q73.h(ov0Var2, ghVar4, dv1VarH3);
                        long jB = v63.b(15.5d);
                        jr0 jr0Var = jr0.j;
                        hh0 hh0Var = mz.a;
                        long j = ((kz) ov0Var2.j(hh0Var)).q;
                        if (1.0f <= 0.0d) {
                            n21.a("invalid weight; must be greater than zero");
                        }
                        gh ghVar5 = ghVar3;
                        gh ghVar6 = ghVar;
                        gh ghVar7 = ghVar2;
                        s83.b(str2, zm3.G(new wb1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), 0.0f, 0.0f, 8.0f, 0.0f, 11), j, jB, jr0Var, null, 0L, null, null, 0L, 2, false, 2, 0, null, ov0Var2, 1597440, 24960, 241576);
                        s83.b(str, null, hz.c(0.45f, ((kz) ov0Var2.j(hh0Var)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262122);
                        ov0 ov0Var3 = ov0Var2;
                        ov0Var3.p(true);
                        String str3 = remark;
                        if (str3 != null) {
                            ov0Var3.c0(-412990277);
                            kk2 kk2VarA3 = jk2.a(new jo(4.0f, true, new fo(0)), orVar, ov0Var3, 54);
                            int iHashCode4 = Long.hashCode(ov0Var3.T);
                            l72 l72VarL4 = ov0Var3.l();
                            dv1 dv1VarH4 = xp1.H(ov0Var3, av1Var);
                            ov0Var3.g0();
                            if (ov0Var3.S) {
                                ov0Var3.k(x30Var);
                            } else {
                                ov0Var3.p0();
                            }
                            q73.h(ov0Var3, ghVar6, kk2VarA3);
                            q73.h(ov0Var3, ghVar7, l72VarL4);
                            az2.s(iHashCode4, ov0Var3, ghVar5, ov0Var3, waVar2);
                            q73.h(ov0Var3, ghVar4, dv1VarH4);
                            ghVar6 = ghVar6;
                            ghVar5 = ghVar5;
                            ghVar7 = ghVar7;
                            t01.a(zm3.t(), null, iw2.k(av1Var, 13.0f), bk.g, ov0Var3, 3504, 0);
                            s83.b(str3, null, hz.c(0.7f, ((kz) ov0Var3.j(hh0Var)).q), v63.b(12.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                            waVar = waVar2;
                            ov0Var3 = ov0Var3;
                            ov0Var3.p(true);
                            z2 = false;
                        } else {
                            waVar = waVar2;
                            z2 = false;
                            ov0Var3.c0(-431825815);
                        }
                        ov0Var3.p(z2);
                        Locale locale = Locale.US;
                        CompleteLocation completeLocation2 = completeLocation;
                        String strK = az2.k(String.format(locale, "%.5f", Arrays.copyOf(new Object[]{Double.valueOf(completeLocation2.getLocation().getLat())}, 1)), ", ", String.format(locale, "%.5f", Arrays.copyOf(new Object[]{Double.valueOf(completeLocation2.getLocation().getLng())}, 1)));
                        long jC = v63.c(12);
                        long jC2 = hz.c(0.55f, ((kz) ov0Var3.j(hh0Var)).q);
                        ov0 ov0Var4 = ov0Var3;
                        wa waVar3 = waVar;
                        gh ghVar8 = ghVar5;
                        gh ghVar9 = ghVar7;
                        gh ghVar10 = ghVar6;
                        s83.b(strK, null, jC2, jC, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var4, 24576, 0, 262122);
                        kk2 kk2VarA4 = jk2.a(new jo(8.0f, true, new fo(0)), orVar, ov0Var4, 54);
                        int iHashCode5 = Long.hashCode(ov0Var4.T);
                        l72 l72VarL5 = ov0Var4.l();
                        dv1 dv1VarH5 = xp1.H(ov0Var4, av1Var);
                        ov0Var4.g0();
                        if (ov0Var4.S) {
                            ov0Var4.k(x30Var);
                        } else {
                            ov0Var4.p0();
                        }
                        q73.h(ov0Var4, ghVar10, kk2VarA4);
                        q73.h(ov0Var4, ghVar9, l72VarL5);
                        az2.s(iHashCode5, ov0Var4, ghVar8, ov0Var4, waVar3);
                        q73.h(ov0Var4, ghVar4, dv1VarH5);
                        int i3 = size;
                        if (i3 > 0) {
                            ov0Var4.c0(515171837);
                            mc0.i(k93.i(), String.valueOf(i3), bk.g, ov0Var4, 384);
                            r2 = 0;
                        } else {
                            r2 = 0;
                            ov0Var4.c0(494980452);
                        }
                        ov0Var4.p(r2);
                        int i4 = size2;
                        if (i4 > 0) {
                            ov0Var4.c0(515313879);
                            mc0.i(ks.R(), String.valueOf(i4), bk.h, ov0Var4, 384);
                        } else {
                            ov0Var4.c0(494980452);
                        }
                        ov0Var4.p(r2);
                        int i5 = size3;
                        if (i5 > 0) {
                            ov0Var4.c0(515459672);
                            mc0.i(am1.v(), String.valueOf(i5), bk.i, ov0Var4, 384);
                        } else {
                            ov0Var4.c0(494980452);
                        }
                        ov0Var4.p(r2);
                        int i6 = 1;
                        ov0Var4.p(true);
                        ov0Var4.p(true);
                        gh0.h(ov0Var4, iw2.o(av1Var, 8.0f));
                        xq1.l(au0Var2, iw2.k(av1Var, 36.0f), false, null, null, sb.a0(-1138704719, new i4(z, i6, r2), ov0Var4), ov0Var4, 1572912, 60);
                        ov0Var4.p(true);
                    } else {
                        ov0Var2.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, 25008, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new w4(completeLocation, str, z, au0Var, au0Var2, i, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0244  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final List list, final boolean z, List list2, final lu0 lu0Var, final lu0 lu0Var2, final au0 au0Var, final au0 au0Var2, final List list3, final lu0 lu0Var3, f30 f30Var, int i) {
        ov0 ov0Var;
        ArrayList arrayList;
        list.getClass();
        list2.getClass();
        lu0Var.getClass();
        lu0Var2.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-1962934620);
        int i2 = i | (ov0Var2.h(list) ? 4 : 2) | (ov0Var2.g(z) ? 32 : 16) | (ov0Var2.h(list2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(lu0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var2.h(lu0Var2) ? 16384 : 8192) | (ov0Var2.h(au0Var) ? 131072 : 65536) | (ov0Var2.h(list3) ? 8388608 : 4194304) | (ov0Var2.h(lu0Var3) ? 67108864 : 33554432);
        if (ov0Var2.T(i2 & 1, (38347923 & i2) != 38347922)) {
            Object objQ = ov0Var2.Q();
            Object obj = d30.a;
            if (objQ == obj) {
                objQ = ke0.H("");
                ov0Var2.m0(objQ);
            }
            final ey1 ey1Var = (ey1) objQ;
            Object objQ2 = ov0Var2.Q();
            if (objQ2 == obj) {
                objQ2 = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
                ov0Var2.m0(objQ2);
            }
            final SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objQ2;
            boolean zF = ov0Var2.f(list2);
            Object objQ3 = ov0Var2.Q();
            Object obj2 = objQ3;
            if (zF || objQ3 == obj) {
                HashSet hashSet = new HashSet();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Long sourceLocationId = ((SavedLocation) it.next()).getSourceLocationId();
                    if (sourceLocationId != null) {
                        hashSet.add(sourceLocationId);
                    }
                }
                ov0Var2.m0(hashSet);
                obj2 = hashSet;
            }
            final HashSet hashSet2 = (HashSet) obj2;
            boolean zF2 = ov0Var2.f(list2);
            Object objQ4 = ov0Var2.Q();
            Object obj3 = objQ4;
            if (zF2 || objQ4 == obj) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list2) {
                    if (((SavedLocation) obj4).getSourceLocationId() == null) {
                        arrayList2.add(obj4);
                    }
                }
                HashSet hashSet3 = new HashSet();
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    SavedLocation savedLocation = (SavedLocation) arrayList2.get(i3);
                    hashSet3.add(new i52(Double.valueOf(savedLocation.getLat()), Double.valueOf(savedLocation.getLng())));
                    i3++;
                    arrayList2 = arrayList2;
                }
                ov0Var2.m0(hashSet3);
                obj3 = hashSet3;
            }
            final HashSet hashSet4 = (HashSet) obj3;
            boolean zF3 = ov0Var2.f((String) ey1Var.getValue()) | ov0Var2.f(list);
            Object objQ5 = ov0Var2.Q();
            Object obj5 = objQ5;
            if (zF3 || objQ5 == obj) {
                if (l13.k0((String) ey1Var.getValue())) {
                    arrayList = list;
                } else {
                    String lowerCase = l13.D0((String) ey1Var.getValue()).toString().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        CompleteLocation completeLocation = (CompleteLocation) next;
                        String remark = completeLocation.getLocation().getRemark();
                        Iterator it3 = it2;
                        Locale locale = Locale.ROOT;
                        String lowerCase2 = remark.toLowerCase(locale);
                        lowerCase2.getClass();
                        if (l13.c0(lowerCase2, lowerCase, false)) {
                            arrayList.add(next);
                        } else {
                            String lowerCase3 = completeLocation.getLocation().getPlaceName().toLowerCase(locale);
                            lowerCase3.getClass();
                            if (l13.c0(lowerCase3, lowerCase, false) || l13.c0(String.valueOf(completeLocation.getLocation().getLat()), lowerCase, false) || l13.c0(String.valueOf(completeLocation.getLocation().getLng()), lowerCase, false)) {
                                arrayList.add(next);
                            } else {
                                if (l13.c0(completeLocation.getLocation().getLat() + "," + completeLocation.getLocation().getLng(), lowerCase, false)) {
                                    arrayList.add(next);
                                }
                            }
                        }
                        it2 = it3;
                    }
                }
                ov0Var2.m0(arrayList);
                obj5 = arrayList;
            }
            final List list4 = (List) obj5;
            boolean zF4 = ov0Var2.f((String) ey1Var.getValue()) | ov0Var2.f(list3);
            Object objQ6 = ov0Var2.Q();
            Object obj6 = objQ6;
            if (zF4 || objQ6 == obj) {
                String string = l13.D0((String) ey1Var.getValue()).toString();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : list3) {
                    CompleteCollectionRoute completeCollectionRoute = (CompleteCollectionRoute) obj7;
                    if (l13.k0(string) || l13.c0(completeCollectionRoute.getRoute().getName(), string, true) || l13.c0(completeCollectionRoute.getRoute().getRemark(), string, true)) {
                        arrayList3.add(obj7);
                    }
                }
                ov0Var2.m0(arrayList3);
                obj6 = arrayList3;
            }
            final List list5 = (List) obj6;
            ov0 ov0Var3 = ov0Var2;
            sb.F(au0Var2, new qc0(3), sb.a0(-278100819, new pu0() { // from class: fh1
                @Override // defpackage.pu0
                public final Object invoke(Object obj8, Object obj9) {
                    f30 f30Var2 = (f30) obj8;
                    int iIntValue = ((Integer) obj9).intValue();
                    ov0 ov0Var4 = (ov0) f30Var2;
                    if (ov0Var4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        bj2 bj2VarA = cj2.a(24.0f);
                        aw awVarT = ym3.t(((kz) ov0Var4.j(mz.a)).p, 0L, ov0Var4, 0, 14);
                        dv1 dv1VarF = zm3.F(iw2.e(av1.a, 0.92f), 0.0f, 20.0f, 1);
                        cw cwVarU = ym3.u(62, 10.0f);
                        final List list6 = list;
                        final List list7 = list3;
                        final boolean z2 = z;
                        final List list8 = list4;
                        final List list9 = list5;
                        final lu0 lu0Var4 = lu0Var3;
                        final SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
                        final HashSet hashSet5 = hashSet2;
                        final HashSet hashSet6 = hashSet4;
                        final lu0 lu0Var5 = lu0Var;
                        final au0 au0Var3 = au0Var2;
                        final lu0 lu0Var6 = lu0Var2;
                        final ey1 ey1Var2 = ey1Var;
                        final au0 au0Var4 = au0Var;
                        sb.C(dv1VarF, bj2VarA, awVarT, cwVarU, sb.a0(40484603, new qu0() { // from class: gh1
                            /* JADX WARN: Code duplicated, block: B:104:0x0920  */
                            /* JADX WARN: Code duplicated, block: B:106:0x0954  */
                            /* JADX WARN: Code duplicated, block: B:107:0x0958  */
                            @Override // defpackage.qu0
                            public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                String strO;
                                gh ghVar;
                                au0 au0Var5;
                                c30 c30Var;
                                float f;
                                boolean z3;
                                au0 au0Var6;
                                gh ghVar2;
                                au0 au0Var7;
                                wa waVar;
                                ov0 ov0Var5;
                                boolean z4;
                                int i4;
                                boolean z5;
                                f30 f30Var3 = (f30) obj11;
                                int iIntValue2 = ((Integer) obj12).intValue();
                                ((zz) obj10).getClass();
                                ov0 ov0Var6 = (ov0) f30Var3;
                                if (ov0Var6.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    av1 av1Var = av1.a;
                                    dv1 dv1VarD = zm3.D(iw2.e(av1Var, 1.0f), 20.0f);
                                    ho hoVar = am1.g;
                                    nr nrVar = j9.r;
                                    yz yzVarA = wz.a(hoVar, nrVar, ov0Var6, 0);
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
                                    gh ghVar3 = v20.e;
                                    q73.h(ov0Var6, ghVar3, yzVarA);
                                    gh ghVar4 = v20.d;
                                    q73.h(ov0Var6, ghVar4, l72VarL);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    gh ghVar5 = v20.f;
                                    q73.h(ov0Var6, ghVar5, numValueOf);
                                    wa waVar2 = v20.g;
                                    q73.g(ov0Var6, waVar2);
                                    gh ghVar6 = v20.c;
                                    q73.h(ov0Var6, ghVar6, dv1VarH);
                                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                                    or orVar = j9.p;
                                    u92 u92Var = am1.i;
                                    kk2 kk2VarA = jk2.a(u92Var, orVar, ov0Var6, 54);
                                    int iHashCode2 = Long.hashCode(ov0Var6.T);
                                    l72 l72VarL2 = ov0Var6.l();
                                    dv1 dv1VarH2 = xp1.H(ov0Var6, dv1VarE);
                                    ov0Var6.g0();
                                    if (ov0Var6.S) {
                                        ov0Var6.k(x30Var);
                                    } else {
                                        ov0Var6.p0();
                                    }
                                    q73.h(ov0Var6, ghVar3, kk2VarA);
                                    q73.h(ov0Var6, ghVar4, l72VarL2);
                                    az2.s(iHashCode2, ov0Var6, ghVar5, ov0Var6, waVar2);
                                    q73.h(ov0Var6, ghVar6, dv1VarH2);
                                    go goVar = am1.e;
                                    kk2 kk2VarA2 = jk2.a(goVar, orVar, ov0Var6, 48);
                                    int iHashCode3 = Long.hashCode(ov0Var6.T);
                                    l72 l72VarL3 = ov0Var6.l();
                                    dv1 dv1VarH3 = xp1.H(ov0Var6, av1Var);
                                    ov0Var6.g0();
                                    or orVar2 = orVar;
                                    if (ov0Var6.S) {
                                        ov0Var6.k(x30Var);
                                    } else {
                                        ov0Var6.p0();
                                    }
                                    q73.h(ov0Var6, ghVar3, kk2VarA2);
                                    q73.h(ov0Var6, ghVar4, l72VarL3);
                                    az2.s(iHashCode3, ov0Var6, ghVar5, ov0Var6, waVar2);
                                    q73.h(ov0Var6, ghVar6, dv1VarH3);
                                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 38.0f), cj2.a(12.0f));
                                    long j = bk.g;
                                    long jC = hz.c(0.12f, j);
                                    iy0 iy0Var = o51.p0;
                                    dv1 dv1VarK = xp1.k(dv1VarN, jC, iy0Var);
                                    pr prVar = j9.j;
                                    er1 er1VarC = ws.c(prVar, false);
                                    int iHashCode4 = Long.hashCode(ov0Var6.T);
                                    l72 l72VarL4 = ov0Var6.l();
                                    dv1 dv1VarH4 = xp1.H(ov0Var6, dv1VarK);
                                    ov0Var6.g0();
                                    if (ov0Var6.S) {
                                        ov0Var6.k(x30Var);
                                    } else {
                                        ov0Var6.p0();
                                    }
                                    q73.h(ov0Var6, ghVar3, er1VarC);
                                    q73.h(ov0Var6, ghVar4, l72VarL4);
                                    az2.s(iHashCode4, ov0Var6, ghVar5, ov0Var6, waVar2);
                                    q73.h(ov0Var6, ghVar6, dv1VarH4);
                                    gh ghVar7 = ghVar5;
                                    t01.a(ld0.y(), null, iw2.k(av1Var, 20.0f), j, ov0Var6, 3504, 0);
                                    az2.t(ov0Var6, true, av1Var, 12.0f, ov0Var6);
                                    yz yzVarA2 = wz.a(hoVar, nrVar, ov0Var6, 0);
                                    int iHashCode5 = Long.hashCode(ov0Var6.T);
                                    l72 l72VarL5 = ov0Var6.l();
                                    dv1 dv1VarH5 = xp1.H(ov0Var6, av1Var);
                                    ov0Var6.g0();
                                    if (ov0Var6.S) {
                                        ov0Var6.k(x30Var);
                                    } else {
                                        ov0Var6.p0();
                                    }
                                    q73.h(ov0Var6, ghVar3, yzVarA2);
                                    q73.h(ov0Var6, ghVar4, l72VarL5);
                                    az2.s(iHashCode5, ov0Var6, ghVar7, ov0Var6, waVar2);
                                    q73.h(ov0Var6, ghVar6, dv1VarH5);
                                    s83.b(ke0.N(2131624580, ov0Var6), null, dh0.p(ov0Var6).o, v63.c(18), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 1597440, 0, 262058);
                                    List list10 = list6;
                                    boolean zIsEmpty = list10.isEmpty();
                                    List list11 = list7;
                                    if (zIsEmpty && list11.isEmpty()) {
                                        strO = az2.h(ov0Var6, 82126513, 2131624800, ov0Var6, false);
                                    } else {
                                        ov0Var6.c0(82128100);
                                        strO = ke0.O(2131624584, new Object[]{Integer.valueOf(list10.size()), Integer.valueOf(list11.size())}, ov0Var6);
                                        ov0Var6.p(false);
                                    }
                                    s83.b(strO, null, hz.c(0.6f, dh0.p(ov0Var6).o), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 24576, 0, 262122);
                                    ov0Var6.p(true);
                                    ov0Var6.p(true);
                                    dv1 dv1VarK2 = iw2.k(av1Var, 32.0f);
                                    p10 p10Var = sb.x;
                                    au0 au0Var8 = au0Var3;
                                    xq1.l(au0Var8, dv1VarK2, false, null, null, p10Var, ov0Var6, 1572912, 60);
                                    ov0 ov0Var7 = ov0Var6;
                                    ov0Var7.p(true);
                                    gh0.h(ov0Var7, iw2.g(av1Var, 14.0f));
                                    boolean zIsEmpty2 = list10.isEmpty();
                                    c30 c30Var2 = d30.a;
                                    if (zIsEmpty2 && list11.isEmpty()) {
                                        ov0Var7.c0(175856285);
                                        z3 = false;
                                        ov0Var7.p(false);
                                        c30Var = c30Var2;
                                        au0Var5 = au0Var8;
                                        ghVar = ghVar6;
                                        f = 24.0f;
                                    } else {
                                        ov0Var7.c0(182756978);
                                        dv1 dv1VarF2 = zm3.F(xp1.k(xp1.n(iw2.g(iw2.e(av1Var, 1.0f), 42.0f), cj2.a(14.0f)), hz.c(0.5f, dh0.p(ov0Var7).r), iy0Var), 12.0f, 0.0f, 2);
                                        er1 er1VarC2 = ws.c(j9.i, false);
                                        int iHashCode6 = Long.hashCode(ov0Var7.T);
                                        l72 l72VarL6 = ov0Var7.l();
                                        dv1 dv1VarH6 = xp1.H(ov0Var7, dv1VarF2);
                                        ov0Var7.g0();
                                        if (ov0Var7.S) {
                                            ov0Var7.k(x30Var);
                                        } else {
                                            ov0Var7.p0();
                                        }
                                        q73.h(ov0Var7, ghVar3, er1VarC2);
                                        q73.h(ov0Var7, ghVar4, l72VarL6);
                                        ghVar7 = ghVar7;
                                        az2.s(iHashCode6, ov0Var7, ghVar7, ov0Var7, waVar2);
                                        q73.h(ov0Var7, ghVar6, dv1VarH6);
                                        dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                                        kk2 kk2VarA3 = jk2.a(goVar, orVar2, ov0Var7, 48);
                                        int iHashCode7 = Long.hashCode(ov0Var7.T);
                                        l72 l72VarL7 = ov0Var7.l();
                                        dv1 dv1VarH7 = xp1.H(ov0Var7, dv1VarE2);
                                        ov0Var7.g0();
                                        if (ov0Var7.S) {
                                            ov0Var7.k(x30Var);
                                        } else {
                                            ov0Var7.p0();
                                        }
                                        q73.h(ov0Var7, ghVar3, kk2VarA3);
                                        q73.h(ov0Var7, ghVar4, l72VarL7);
                                        az2.s(iHashCode7, ov0Var7, ghVar7, ov0Var7, waVar2);
                                        q73.h(ov0Var7, ghVar6, dv1VarH7);
                                        orVar2 = orVar2;
                                        ghVar = ghVar6;
                                        t01.a(dh0.s(), null, iw2.k(av1Var, 18.0f), hz.c(0.45f, dh0.p(ov0Var7).q), ov0Var7, 432, 0);
                                        gh0.h(ov0Var7, iw2.o(av1Var, 8.0f));
                                        ey1 ey1Var3 = ey1Var2;
                                        String str = (String) ey1Var3.getValue();
                                        q93 q93Var = new q93(dh0.p(ov0Var7).q, v63.b(13.5d), jr0.h, 0L, 0L, 0, 0L, 16777208);
                                        wb1 wb1Var = new wb1(1.0f, true);
                                        Object objQ7 = ov0Var7.Q();
                                        if (objQ7 == c30Var2) {
                                            objQ7 = new di0(ey1Var3, 18);
                                            ov0Var7.m0(objQ7);
                                        }
                                        au0Var5 = au0Var8;
                                        c30Var = c30Var2;
                                        xq.a(str, (lu0) objQ7, wb1Var, false, q93Var, null, null, true, 0, 0, null, null, null, null, sb.a0(-2034152189, new h5(ey1Var3, 10), ov0Var7), ov0Var7, 100663344, 196608, 32472);
                                        ov0Var7 = ov0Var7;
                                        if (((String) ey1Var3.getValue()).length() > 0) {
                                            ov0Var7.c0(-534831414);
                                            Object objQ8 = ov0Var7.Q();
                                            if (objQ8 == c30Var) {
                                                objQ8 = new mo0(ey1Var3, 4);
                                                ov0Var7.m0(objQ8);
                                            }
                                            f = 24.0f;
                                            xq1.l((au0) objQ8, iw2.k(av1Var, 24.0f), false, null, null, sb.y, ov0Var7, 1572918, 60);
                                            ov0Var7 = ov0Var7;
                                            z3 = false;
                                        } else {
                                            f = 24.0f;
                                            z3 = false;
                                            ov0Var7.c0(-543970462);
                                        }
                                        ov0Var7.p(z3);
                                        ov0Var7.p(true);
                                        ov0Var7.p(true);
                                        gh0.h(ov0Var7, iw2.g(av1Var, 12.0f));
                                        ov0Var7.p(z3);
                                    }
                                    boolean z6 = z2;
                                    au0 au0Var9 = au0Var4;
                                    if (z6) {
                                        ov0Var7.c0(185822537);
                                        dv1 dv1VarG = iw2.g(iw2.e(av1Var, 1.0f), 180.0f);
                                        er1 er1VarC3 = ws.c(prVar, z3);
                                        int iHashCode8 = Long.hashCode(ov0Var7.T);
                                        l72 l72VarL8 = ov0Var7.l();
                                        dv1 dv1VarH8 = xp1.H(ov0Var7, dv1VarG);
                                        ov0Var7.g0();
                                        if (ov0Var7.S) {
                                            ov0Var7.k(x30Var);
                                        } else {
                                            ov0Var7.p0();
                                        }
                                        q73.h(ov0Var7, ghVar3, er1VarC3);
                                        q73.h(ov0Var7, ghVar4, l72VarL8);
                                        waVar = waVar2;
                                        az2.s(iHashCode8, ov0Var7, ghVar7, ov0Var7, waVar);
                                        gh ghVar8 = ghVar;
                                        q73.h(ov0Var7, ghVar8, dv1VarH8);
                                        ov0 ov0Var8 = ov0Var7;
                                        au0Var6 = au0Var9;
                                        vc2.a(iw2.k(av1Var, 32.0f), j, 0.0f, 0L, 0, 0.0f, ov0Var8, 54, 60);
                                        ov0Var5 = ov0Var8;
                                        ov0Var5.p(true);
                                        z4 = false;
                                        ov0Var5.p(false);
                                        ghVar2 = ghVar8;
                                    } else {
                                        gh ghVar9 = ghVar;
                                        au0Var6 = au0Var9;
                                        if (list10.isEmpty() && list11.isEmpty()) {
                                            ov0Var7.c0(186400439);
                                            dv1 dv1VarF3 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, f, 1);
                                            yz yzVarA3 = wz.a(am1.h, j9.s, ov0Var7, 54);
                                            int iHashCode9 = Long.hashCode(ov0Var7.T);
                                            l72 l72VarL9 = ov0Var7.l();
                                            dv1 dv1VarH9 = xp1.H(ov0Var7, dv1VarF3);
                                            ov0Var7.g0();
                                            if (ov0Var7.S) {
                                                ov0Var7.k(x30Var);
                                            } else {
                                                ov0Var7.p0();
                                            }
                                            q73.h(ov0Var7, ghVar3, yzVarA3);
                                            q73.h(ov0Var7, ghVar4, l72VarL9);
                                            az2.s(iHashCode9, ov0Var7, ghVar7, ov0Var7, r0);
                                            q73.h(ov0Var7, ghVar9, dv1VarH9);
                                            x01 x01VarB = ce0.b;
                                            if (x01VarB != null) {
                                                i4 = 3;
                                            } else {
                                                w01 w01Var = new w01("Rounded.FolderOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                int i5 = nh3.a;
                                                long j2 = hz.b;
                                                qy2 qy2Var = new qy2(j2);
                                                nx0 nx0VarI = p91.i(2.81f, 2.81f);
                                                nx0VarI.g(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                                                nx0VarI.f(1.0f, 3.2f, 1.0f, 3.83f, 1.39f, 4.22f);
                                                nx0VarI.l(0.85f, 0.85f);
                                                nx0VarI.f(2.1f, 5.35f, 2.01f, 5.66f, 2.01f, 6.0f);
                                                nx0VarI.k(2.0f, 18.0f);
                                                nx0VarI.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                                nx0VarI.i(13.17f);
                                                nx0VarI.l(2.61f, 2.61f);
                                                nx0VarI.g(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                                                nx0VarI.g(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                                                nx0VarI.k(2.81f, 2.81f);
                                                nx0VarI.e();
                                                w01.a(w01Var, nx0VarI.a, qy2Var);
                                                qy2 qy2Var2 = new qy2(j2);
                                                i4 = 3;
                                                nx0 nx0Var = new nx0(3);
                                                nx0Var.m(20.0f, 6.0f);
                                                nx0Var.i(-8.0f);
                                                nx0Var.l(-1.41f, -1.41f);
                                                nx0Var.f(10.21f, 4.21f, 9.7f, 4.0f, 9.17f, 4.0f);
                                                nx0Var.h(6.83f);
                                                nx0Var.l(14.93f, 14.93f);
                                                nx0Var.f(21.91f, 18.65f, 22.0f, 18.34f, 22.0f, 18.0f);
                                                nx0Var.r(8.0f);
                                                nx0Var.f(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f);
                                                nx0Var.e();
                                                w01.a(w01Var, nx0Var.a, qy2Var2);
                                                x01VarB = w01Var.b();
                                                ce0.b = x01VarB;
                                            }
                                            x01 x01Var = x01VarB;
                                            ghVar2 = ghVar9;
                                            t01.a(x01Var, null, iw2.k(av1Var, 48.0f), hz.c(0.35f, dh0.p(ov0Var7).q), ov0Var7, 432, 0);
                                            gh0.h(ov0Var7, iw2.g(av1Var, 10.0f));
                                            ov0 ov0Var9 = ov0Var7;
                                            s83.b(ke0.N(2131624800, ov0Var7), null, hz.c(0.7f, dh0.p(ov0Var7).q), v63.c(15), jr0.h, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 1597440, 0, 262058);
                                            gh0.h(ov0Var9, iw2.g(av1Var, 4.0f));
                                            s83.b(ke0.N(2131624947, ov0Var9), zm3.F(av1Var, 16.0f, 0.0f, 2), hz.c(0.45f, dh0.p(ov0Var9).q), v63.c(12), null, null, 0L, null, new m53(i4), 0L, 0, false, 0, 0, null, ov0Var9, 24624, 0, 261096);
                                            gh0.h(ov0Var9, iw2.g(av1Var, 16.0f));
                                            n51.a(au0Var6, null, false, cj2.a(14.0f), hu.a(j, 0L, 0L, 0L, ov0Var9, 14), null, null, null, sb.z, ov0Var9, 805306368, 486);
                                            ov0Var5 = ov0Var9;
                                            ov0Var5.p(true);
                                            z4 = false;
                                            ov0Var5.p(false);
                                            au0Var7 = au0Var5;
                                            waVar = r0;
                                        } else {
                                            ghVar2 = ghVar9;
                                            List list12 = list8;
                                            boolean zIsEmpty3 = list12.isEmpty();
                                            List list13 = list9;
                                            if (zIsEmpty3 && list13.isEmpty()) {
                                                ov0Var7.c0(188607143);
                                                dv1 dv1VarG2 = iw2.g(iw2.e(av1Var, 1.0f), 140.0f);
                                                er1 er1VarC4 = ws.c(prVar, false);
                                                int iHashCode10 = Long.hashCode(ov0Var7.T);
                                                l72 l72VarL10 = ov0Var7.l();
                                                dv1 dv1VarH10 = xp1.H(ov0Var7, dv1VarG2);
                                                ov0Var7.g0();
                                                if (ov0Var7.S) {
                                                    ov0Var7.k(x30Var);
                                                } else {
                                                    ov0Var7.p0();
                                                }
                                                q73.h(ov0Var7, ghVar3, er1VarC4);
                                                q73.h(ov0Var7, ghVar4, l72VarL10);
                                                az2.s(iHashCode10, ov0Var7, ghVar7, ov0Var7, r0);
                                                q73.h(ov0Var7, ghVar2, dv1VarH10);
                                                ov0 ov0Var10 = ov0Var7;
                                                s83.b(ke0.N(2131624801, ov0Var7), null, hz.c(0.5f, dh0.p(ov0Var7).q), v63.c(14), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var10, 24576, 0, 262122);
                                                ov0Var5 = ov0Var10;
                                                ov0Var5.p(true);
                                                ov0Var5.p(false);
                                                z4 = false;
                                                waVar = r0;
                                            } else {
                                                ov0Var7.c0(189197507);
                                                dv1 dv1VarH11 = iw2.h(iw2.e(av1Var, 1.0f), 0.0f, 340.0f, 1);
                                                jo joVar = new jo(8.0f, true, new fo(0));
                                                boolean zH = ov0Var7.h(list13);
                                                lu0 lu0Var7 = lu0Var4;
                                                boolean zF5 = zH | ov0Var7.f(lu0Var7) | ov0Var7.h(list12);
                                                SimpleDateFormat simpleDateFormat3 = simpleDateFormat2;
                                                boolean zH2 = zF5 | ov0Var7.h(simpleDateFormat3);
                                                HashSet hashSet7 = hashSet5;
                                                boolean zH3 = zH2 | ov0Var7.h(hashSet7);
                                                HashSet hashSet8 = hashSet6;
                                                boolean zH4 = zH3 | ov0Var7.h(hashSet8);
                                                lu0 lu0Var8 = lu0Var5;
                                                boolean zF6 = zH4 | ov0Var7.f(lu0Var8);
                                                au0 au0Var10 = au0Var5;
                                                boolean zF7 = zF6 | ov0Var7.f(au0Var10);
                                                lu0 lu0Var9 = lu0Var6;
                                                boolean zF8 = zF7 | ov0Var7.f(lu0Var9);
                                                Object objQ9 = ov0Var7.Q();
                                                if (zF8 || objQ9 == c30Var) {
                                                    au0Var7 = au0Var10;
                                                    objQ9 = new eh1(list13, list12, lu0Var7, simpleDateFormat3, hashSet7, hashSet8, lu0Var8, au0Var7, lu0Var9);
                                                    ov0Var7.m0(objQ9);
                                                } else {
                                                    au0Var7 = au0Var10;
                                                }
                                                lu0 lu0Var10 = (lu0) objQ9;
                                                ov0 ov0Var11 = ov0Var7;
                                                waVar = r0;
                                                ke0.d(dv1VarH11, null, null, joVar, null, null, false, null, lu0Var10, ov0Var11, 24582, 494);
                                                ov0Var5 = ov0Var11;
                                                z4 = false;
                                                ov0Var5.p(false);
                                            }
                                        }
                                        if (list10.isEmpty() || !list11.isEmpty()) {
                                            ov0Var5.c0(190583486);
                                            gh0.h(ov0Var5, iw2.g(av1Var, 12.0f));
                                            dv1 dv1VarE3 = iw2.e(av1Var, 1.0f);
                                            kk2 kk2VarA4 = jk2.a(u92Var, orVar2, ov0Var5, 54);
                                            int iHashCode11 = Long.hashCode(ov0Var5.T);
                                            l72 l72VarL11 = ov0Var5.l();
                                            dv1 dv1VarH12 = xp1.H(ov0Var5, dv1VarE3);
                                            ov0Var5.g0();
                                            if (ov0Var5.S) {
                                                ov0Var5.k(x30Var);
                                            } else {
                                                ov0Var5.p0();
                                            }
                                            q73.h(ov0Var5, ghVar3, kk2VarA4);
                                            q73.h(ov0Var5, ghVar4, l72VarL11);
                                            az2.s(iHashCode11, ov0Var5, ghVar7, ov0Var5, waVar);
                                            q73.h(ov0Var5, ghVar2, dv1VarH12);
                                            ov0 ov0Var12 = ov0Var5;
                                            n51.j(au0Var6, null, false, null, null, zm3.e(2, 8.0f), sb.A, ov0Var12, 817889280, 382);
                                            n51.j(au0Var7, null, false, null, null, zm3.e(2, 12.0f), sb.B, ov0Var12, 817889280, 382);
                                            ov0Var5 = ov0Var12;
                                            z5 = true;
                                            ov0Var5.p(true);
                                            ov0Var5.p(false);
                                        } else {
                                            ov0Var5.c0(175856285);
                                            ov0Var5.p(z4);
                                            z5 = true;
                                        }
                                        ov0Var5.p(z5);
                                    }
                                    au0Var7 = au0Var5;
                                    if (list10.isEmpty()) {
                                        ov0Var5.c0(190583486);
                                        gh0.h(ov0Var5, iw2.g(av1Var, 12.0f));
                                        dv1 dv1VarE4 = iw2.e(av1Var, 1.0f);
                                        kk2 kk2VarA5 = jk2.a(u92Var, orVar2, ov0Var5, 54);
                                        int iHashCode12 = Long.hashCode(ov0Var5.T);
                                        l72 l72VarL12 = ov0Var5.l();
                                        dv1 dv1VarH13 = xp1.H(ov0Var5, dv1VarE4);
                                        ov0Var5.g0();
                                        if (ov0Var5.S) {
                                            ov0Var5.k(x30Var);
                                        } else {
                                            ov0Var5.p0();
                                        }
                                        q73.h(ov0Var5, ghVar3, kk2VarA5);
                                        q73.h(ov0Var5, ghVar4, l72VarL12);
                                        az2.s(iHashCode12, ov0Var5, ghVar7, ov0Var5, waVar);
                                        q73.h(ov0Var5, ghVar2, dv1VarH13);
                                        ov0 ov0Var13 = ov0Var5;
                                        n51.j(au0Var6, null, false, null, null, zm3.e(2, 8.0f), sb.A, ov0Var13, 817889280, 382);
                                        n51.j(au0Var7, null, false, null, null, zm3.e(2, 12.0f), sb.B, ov0Var13, 817889280, 382);
                                        ov0Var5 = ov0Var13;
                                        z5 = true;
                                        ov0Var5.p(true);
                                        ov0Var5.p(false);
                                    } else {
                                        ov0Var5.c0(190583486);
                                        gh0.h(ov0Var5, iw2.g(av1Var, 12.0f));
                                        dv1 dv1VarE5 = iw2.e(av1Var, 1.0f);
                                        kk2 kk2VarA6 = jk2.a(u92Var, orVar2, ov0Var5, 54);
                                        int iHashCode13 = Long.hashCode(ov0Var5.T);
                                        l72 l72VarL13 = ov0Var5.l();
                                        dv1 dv1VarH14 = xp1.H(ov0Var5, dv1VarE5);
                                        ov0Var5.g0();
                                        if (ov0Var5.S) {
                                            ov0Var5.k(x30Var);
                                        } else {
                                            ov0Var5.p0();
                                        }
                                        q73.h(ov0Var5, ghVar3, kk2VarA6);
                                        q73.h(ov0Var5, ghVar4, l72VarL13);
                                        az2.s(iHashCode13, ov0Var5, ghVar7, ov0Var5, waVar);
                                        q73.h(ov0Var5, ghVar2, dv1VarH14);
                                        ov0 ov0Var14 = ov0Var5;
                                        n51.j(au0Var6, null, false, null, null, zm3.e(2, 8.0f), sb.A, ov0Var14, 817889280, 382);
                                        n51.j(au0Var7, null, false, null, null, zm3.e(2, 12.0f), sb.B, ov0Var14, 817889280, 382);
                                        ov0Var5 = ov0Var14;
                                        z5 = true;
                                        ov0Var5.p(true);
                                        ov0Var5.p(false);
                                    }
                                    ov0Var5.p(z5);
                                } else {
                                    ov0Var6.W();
                                }
                                return mf3.a;
                            }
                        }, ov0Var4), ov0Var4, 196614, 16);
                    } else {
                        ov0Var4.W();
                    }
                    return mf3.a;
                }
            }, ov0Var3), ov0Var3, 438, 0);
            ov0Var = ov0Var3;
        } else {
            ov0 ov0Var4 = ov0Var2;
            ov0Var4.W();
            ov0Var = ov0Var4;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new ac1(list, z, list2, lu0Var, lu0Var2, au0Var, au0Var2, list3, lu0Var3, i);
        }
    }

    public static final void e(String str, String str2, boolean z, au0 au0Var, au0 au0Var2, f30 f30Var, int i) {
        String str3;
        str2.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1358380220);
        int i2 = (i & 6) == 0 ? i | 2 : i;
        if ((i & 48) == 0) {
            i2 |= ov0Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.g(z) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= ov0Var.h(au0Var2) ? 16384 : 8192;
        }
        if (ov0Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            ov0Var.Y();
            if ((i & 1) == 0 || ov0Var.B()) {
                str = ke0.N(2131624379, ov0Var);
            } else {
                ov0Var.W();
            }
            int i3 = i2 & (-15);
            String str4 = str;
            ov0Var.q();
            sb.F(au0Var, null, sb.a0(1153974925, new w4(str4, str2, z, au0Var, au0Var2, 12), ov0Var), ov0Var, ((i3 >> 9) & 14) | 384, 2);
            str3 = str4;
        } else {
            ov0Var.W();
            str3 = str;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new zk1(str3, str2, z, au0Var, au0Var2, i);
        }
    }

    public static final void f(dv1 dv1Var, final RoutePlanStage routePlanStage, final List list, final AppState appState, final au0 au0Var, final au0 au0Var2, final au0 au0Var3, final au0 au0Var4, final au0 au0Var5, final au0 au0Var6, qu0 qu0Var, f30 f30Var, int i) {
        boolean z;
        dv1Var.getClass();
        routePlanStage.getClass();
        list.getClass();
        appState.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        au0Var3.getClass();
        au0Var4.getClass();
        au0Var5.getClass();
        au0Var6.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1274638983);
        int i2 = i | (ov0Var.f(dv1Var) ? 4 : 2) | (ov0Var.d(routePlanStage.ordinal()) ? 32 : 16) | (ov0Var.h(list) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(appState) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var.h(au0Var) ? 16384 : 8192) | (ov0Var.h(au0Var2) ? 131072 : 65536) | (ov0Var.h(au0Var3) ? 1048576 : 524288) | (ov0Var.h(au0Var5) ? 67108864 : 33554432) | (ov0Var.h(au0Var6) ? 536870912 : 268435456);
        int i3 = ov0Var.h(qu0Var) ? 4 : 2;
        if (ov0Var.T(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            dv1 dv1VarQ = ym3.q(iw2.e(dv1Var, 1.0f), o51.D(0.75f, 400.0f, null, 4), 2);
            er1 er1VarC = ws.c(j9.f, false);
            int iHashCode = Long.hashCode(ov0Var.T);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarQ);
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
            av1 av1Var = av1.a;
            dv1 dv1VarE = iw2.e(av1Var, 1.0f);
            int i4 = i3;
            yz yzVarA = wz.a(new jo(10.0f, true, new fo(0)), j9.r, ov0Var, 6);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarE);
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
            if (qu0Var != null) {
                ov0Var.c0(-1071079307);
                qu0Var.invoke(iw2.e(av1Var, 1.0f), ov0Var, Integer.valueOf(((i4 << 3) & 112) | 6));
                z = false;
            } else {
                z = false;
                ov0Var.c0(-1073197289);
            }
            ov0Var.p(z);
            e33.a(iw2.e(av1Var, 1.0f), cj2.a(22.0f), ((kz) ov0Var.j(mz.a)).p, 0L, 0.0f, 8.0f, null, sb.a0(-813264816, new pu0() { // from class: ej2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ov0 ov0Var2;
                    boolean z2;
                    String strO;
                    f30 f30Var2 = (f30) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    or orVar = j9.p;
                    ov0 ov0Var3 = (ov0) f30Var2;
                    if (ov0Var3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        av1 av1Var2 = av1.a;
                        dv1 dv1VarD = zm3.D(av1Var2, 14.0f);
                        er1 er1VarC2 = ws.c(j9.f, false);
                        int iHashCode3 = Long.hashCode(ov0Var3.T);
                        l72 l72VarL3 = ov0Var3.l();
                        dv1 dv1VarH3 = xp1.H(ov0Var3, dv1VarD);
                        w20.b.getClass();
                        x30 x30Var2 = v20.b;
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var2);
                        } else {
                            ov0Var3.p0();
                        }
                        gh ghVar5 = v20.e;
                        q73.h(ov0Var3, ghVar5, er1VarC2);
                        gh ghVar6 = v20.d;
                        q73.h(ov0Var3, ghVar6, l72VarL3);
                        Integer numValueOf2 = Integer.valueOf(iHashCode3);
                        gh ghVar7 = v20.f;
                        q73.h(ov0Var3, ghVar7, numValueOf2);
                        wa waVar2 = v20.g;
                        q73.g(ov0Var3, waVar2);
                        gh ghVar8 = v20.c;
                        q73.h(ov0Var3, ghVar8, dv1VarH3);
                        int i5 = gj2.a[routePlanStage.ordinal()];
                        lk2 lk2Var = lk2.a;
                        if (i5 == 1 || i5 == 2) {
                            ov0Var3.c0(-886065060);
                            dv1 dv1VarE2 = iw2.e(av1Var2, 1.0f);
                            kk2 kk2VarA = jk2.a(new jo(10.0f, true, new fo(0)), orVar, ov0Var3, 54);
                            int iHashCode4 = Long.hashCode(ov0Var3.T);
                            l72 l72VarL4 = ov0Var3.l();
                            dv1 dv1VarH4 = xp1.H(ov0Var3, dv1VarE2);
                            ov0Var3.g0();
                            if (ov0Var3.S) {
                                ov0Var3.k(x30Var2);
                            } else {
                                ov0Var3.p0();
                            }
                            q73.h(ov0Var3, ghVar5, kk2VarA);
                            q73.h(ov0Var3, ghVar6, l72VarL4);
                            az2.s(iHashCode4, ov0Var3, ghVar7, ov0Var3, waVar2);
                            q73.h(ov0Var3, ghVar8, dv1VarH4);
                            dv1 dv1VarG = iw2.g(lk2.a(lk2Var, av1Var2, 1.2f), 50.0f);
                            bj2 bj2VarA = cj2.a(16.0f);
                            b52 b52Var = hu.a;
                            gu guVarA = hu.a(bk.g, 0L, 0L, 0L, ov0Var3, 14);
                            List list2 = list;
                            n51.a(au0Var, dv1VarG, false, bj2VarA, guVarA, null, null, null, sb.a0(-1672255070, new au(list2, 9), ov0Var3), ov0Var3, 805306368, 484);
                            n51.a(au0Var2, iw2.g(lk2.a(lk2Var, av1Var2, 1.0f), 50.0f), list2.size() >= 2, cj2.a(16.0f), hu.a(bk.h, 0L, hz.c(0.5f, ((kz) ov0Var3.j(mz.a)).r), 0L, ov0Var3, 10), null, null, null, sb.C, ov0Var3, 805306368, 480);
                            ov0Var2 = ov0Var3;
                            z2 = true;
                            ov0Var2.p(true);
                            ov0Var2.p(false);
                        } else if (i5 == 3) {
                            ov0Var3.c0(-882863318);
                            dv1 dv1VarE3 = iw2.e(av1Var2, 1.0f);
                            kk2 kk2VarA2 = jk2.a(new jo(8.0f, true, new fo(0)), orVar, ov0Var3, 54);
                            int iHashCode5 = Long.hashCode(ov0Var3.T);
                            l72 l72VarL5 = ov0Var3.l();
                            dv1 dv1VarH5 = xp1.H(ov0Var3, dv1VarE3);
                            ov0Var3.g0();
                            if (ov0Var3.S) {
                                ov0Var3.k(x30Var2);
                            } else {
                                ov0Var3.p0();
                            }
                            q73.h(ov0Var3, ghVar5, kk2VarA2);
                            q73.h(ov0Var3, ghVar6, l72VarL5);
                            az2.s(iHashCode5, ov0Var3, ghVar7, ov0Var3, waVar2);
                            q73.h(ov0Var3, ghVar8, dv1VarH5);
                            n51.h(au0Var3, iw2.g(lk2.a(lk2Var, av1Var2, 1.0f), 50.0f), false, cj2.a(16.0f), null, null, zm3.e(2, 4.0f), sb.D, ov0Var3, 817889280, 372);
                            n51.h(au0Var4, iw2.g(lk2.a(lk2Var, av1Var2, 1.0f), 50.0f), false, cj2.a(16.0f), null, null, zm3.e(2, 4.0f), sb.E, ov0Var3, 817889280, 372);
                            dv1 dv1VarG2 = iw2.g(lk2.a(lk2Var, av1Var2, 1.35f), 50.0f);
                            b52 b52VarE = zm3.e(2, 8.0f);
                            bj2 bj2VarA2 = cj2.a(16.0f);
                            b52 b52Var2 = hu.a;
                            n51.a(au0Var5, dv1VarG2, false, bj2VarA2, hu.a(bk.g, 0L, 0L, 0L, ov0Var3, 14), null, null, b52VarE, sb.F, ov0Var3, 817889280, 356);
                            ov0Var2 = ov0Var3;
                            ov0Var2.p(true);
                            ov0Var2.p(false);
                            z2 = true;
                        } else {
                            if (i5 != 4) {
                                ov0Var3.c0(2049631379);
                                ov0Var3.p(false);
                                b81.d();
                                return null;
                            }
                            ov0Var3.c0(-878910539);
                            dv1 dv1VarE4 = iw2.e(av1Var2, 1.0f);
                            kk2 kk2VarA3 = jk2.a(am1.i, orVar, ov0Var3, 54);
                            int iHashCode6 = Long.hashCode(ov0Var3.T);
                            l72 l72VarL6 = ov0Var3.l();
                            dv1 dv1VarH6 = xp1.H(ov0Var3, dv1VarE4);
                            ov0Var3.g0();
                            if (ov0Var3.S) {
                                ov0Var3.k(x30Var2);
                            } else {
                                ov0Var3.p0();
                            }
                            q73.h(ov0Var3, ghVar5, kk2VarA3);
                            q73.h(ov0Var3, ghVar6, l72VarL6);
                            az2.s(iHashCode6, ov0Var3, ghVar7, ov0Var3, waVar2);
                            q73.h(ov0Var3, ghVar8, dv1VarH6);
                            dv1 dv1VarG3 = zm3.G(av1Var2, 6.0f, 0.0f, 0.0f, 0.0f, 14);
                            kk2 kk2VarA4 = jk2.a(am1.e, orVar, ov0Var3, 48);
                            int iHashCode7 = Long.hashCode(ov0Var3.T);
                            l72 l72VarL7 = ov0Var3.l();
                            dv1 dv1VarH7 = xp1.H(ov0Var3, dv1VarG3);
                            ov0Var3.g0();
                            if (ov0Var3.S) {
                                ov0Var3.k(x30Var2);
                            } else {
                                ov0Var3.p0();
                            }
                            q73.h(ov0Var3, ghVar5, kk2VarA4);
                            q73.h(ov0Var3, ghVar6, l72VarL7);
                            az2.s(iHashCode7, ov0Var3, ghVar7, ov0Var3, waVar2);
                            q73.h(ov0Var3, ghVar8, dv1VarH7);
                            ws.a(xp1.k(xp1.n(iw2.k(av1Var2, 10.0f), cj2.a), bk.h, o51.p0), ov0Var3, 0);
                            gh0.h(ov0Var3, iw2.o(av1Var2, 8.0f));
                            AppState appState2 = appState;
                            if (appState2.getRouteRunMode() == RouteRunMode.MANUAL) {
                                strO = az2.h(ov0Var3, -2145180494, 2131624567, ov0Var3, false);
                            } else {
                                ov0Var3.c0(-2145178606);
                                strO = ke0.O(2131624358, new Object[]{Integer.valueOf((int) appState2.getRouteSimMode().getSpeedMs())}, ov0Var3);
                                ov0Var3.p(false);
                            }
                            long jC = v63.c(14);
                            jr0 jr0Var = jr0.j;
                            hh0 hh0Var = mz.a;
                            s83.b(strO, null, ((kz) ov0Var3.j(hh0Var)).q, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                            ov0Var3.p(true);
                            bj2 bj2VarA3 = cj2.a(16.0f);
                            b52 b52Var3 = hu.a;
                            n51.a(au0Var6, iw2.g(av1Var2, 46.0f), false, bj2VarA3, hu.a(((kz) ov0Var3.j(hh0Var)).y, ((kz) ov0Var3.j(hh0Var)).w, 0L, 0L, ov0Var3, 12), null, null, null, sb.G, ov0Var3, 805306416, 484);
                            ov0Var2 = ov0Var3;
                            ov0Var2.p(true);
                            ov0Var2.p(false);
                            z2 = true;
                        }
                        ov0Var2.p(z2);
                    } else {
                        ov0Var3.W();
                    }
                    return mf3.a;
                }
            }, ov0Var), ov0Var, 12779526, 88);
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new fj2(dv1Var, routePlanStage, list, appState, au0Var, au0Var2, au0Var3, au0Var4, au0Var5, au0Var6, qu0Var, i);
        }
    }

    public static final void g(dv1 dv1Var, p10 p10Var, f30 f30Var, int i) {
        p10 p10Var2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(1949207773);
        int i2 = i | 6;
        int i3 = 0;
        if (ov0Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = ke0.H(null);
                ov0Var.m0(objQ);
            }
            ey1 ey1Var = (ey1) objQ;
            xp2 xp2Var = (xp2) ey1Var.getValue();
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                objQ2 = new vu1(ey1Var, 16);
                ov0Var.m0(objQ2);
            }
            lu0 lu0Var = (lu0) objQ2;
            av1 av1Var = av1.a;
            p10Var2 = p10Var;
            h(av1Var, xp2Var, lu0Var, p10Var2, ov0Var, 3462);
            dv1Var = av1Var;
        } else {
            p10Var2 = p10Var;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new cq2(dv1Var, p10Var2, i, i3);
        }
    }

    public static final void h(dv1 dv1Var, xp2 xp2Var, lu0 lu0Var, p10 p10Var, f30 f30Var, int i) {
        int i2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-917932944);
        int i3 = 2;
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (ov0Var.f(dv1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ov0Var.f(xp2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ov0Var.h(lu0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        if ((i & 3072) == 0) {
            i2 |= ov0Var.h(p10Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (ov0Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objQ = ov0Var.Q();
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = new oi1(22);
                ov0Var.m0(objQ);
            }
            er2 er2Var = (er2) wc0.d0(objArr, er2.l, (au0) objQ, ov0Var, 384);
            Object objQ2 = ov0Var.Q();
            if (objQ2 == c30Var) {
                objQ2 = new ar2(er2Var);
                ov0Var.m0(objQ2);
            }
            ar2 ar2Var = (ar2) objQ2;
            zx zxVar = (zx) ov0Var.j(z30.f);
            Object objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                objQ3 = oi0.j(ov0Var);
                ov0Var.m0(objQ3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objQ3;
            ar2Var.e = (jx0) ov0Var.j(z30.l);
            boolean zF = ov0Var.f(coroutineScope) | ov0Var.f(zxVar);
            Object objQ4 = ov0Var.Q();
            if (zF || objQ4 == c30Var) {
                objQ4 = new jl1(17, coroutineScope, zxVar);
                ov0Var.m0(objQ4);
            }
            ar2Var.f = (lu0) objQ4;
            ar2Var.d = new jl1(18, ar2Var, lu0Var);
            ar2Var.l(xp2Var);
            ov0Var.c0(-82280708);
            ar2Var.w = e92.b(vp2.f, null, ov0Var, 54);
            ar2Var.v = coroutineScope;
            ov0Var.p(false);
            ar2Var.h();
            int i5 = 3;
            p70 p70Var = new p70(i3, ar2Var, new bq2(ar2Var, i5));
            dv1 dv1VarP = av1.a;
            dv1 dv1VarA = zm3.A(m33.a(n51.s(sb.X(ks.P(k22.G(m33.a(dv1VarP, mf3.a, p70Var), new dq2(ar2Var, i4)), ar2Var.h), new dq2(ar2Var, 5)), null, true), 8675309, new qc(new dq2(ar2Var, 6), i5)), new w3(ar2Var, i4));
            if (ar2Var.e() != null && ar2Var.g()) {
                xp2 xp2VarF = ar2Var.f();
                if (!(xp2VarF == null ? true : o51.f(xp2VarF.a, xp2VarF.b)) && sk1.a()) {
                    dv1VarP = xp1.p(dv1VarP, new au(ar2Var, 11));
                }
            }
            dh0.d(dv1Var.d(ym3.p(dv1VarA.d(dv1VarP), new s5(ar2Var, 27))), sb.a0(-1799563674, new aq2(ar2Var, er2Var, p10Var), ov0Var), ov0Var, 48);
            boolean zH = ov0Var.h(ar2Var);
            Object objQ5 = ov0Var.Q();
            if (zH || objQ5 == c30Var) {
                objQ5 = new dq2(ar2Var, 0);
                ov0Var.m0(objQ5);
            }
            oi0.a(ar2Var, (lu0) objQ5, ov0Var);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new b9(dv1Var, xp2Var, lu0Var, p10Var, i);
        }
    }

    public static final void i(x01 x01Var, String str, long j, f30 f30Var, int i) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1021228737);
        int i2 = i | (ov0Var.f(x01Var) ? 4 : 2) | (ov0Var.f(str) ? 32 : 16);
        int i3 = 0;
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            bj2 bj2VarA = cj2.a(6.0f);
            av1 av1Var = av1.a;
            dv1 dv1VarE = zm3.E(xp1.k(xp1.n(av1Var, bj2VarA), hz.c(0.1f, j), o51.p0), 6.0f, 2.0f);
            kk2 kk2VarA = jk2.a(new jo(3.0f, true, new fo(i3)), j9.p, ov0Var, 54);
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
            t01.a(x01Var, null, iw2.k(av1Var, 12.0f), j, ov0Var, (i2 & 14) | 3504, 0);
            s83.b(str, null, j, v63.b(10.5d), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, ((i2 >> 3) & 14) | 1597824, 0, 262058);
            ov0Var = ov0Var;
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new cc(x01Var, str, j, i, 2);
        }
    }

    public static void j(kx2 kx2Var, List list, t30 t30Var) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = kx2Var.c((iv0) list.get(i));
            int iM = kx2Var.M(kx2Var.b, kx2Var.q(iC));
            Object obj = iM < kx2Var.f(kx2Var.b, kx2Var.q(iC + 1)) ? kx2Var.c[kx2Var.g(iM)] : d30.a;
            ee2 ee2Var = obj instanceof ee2 ? (ee2) obj : null;
            if (ee2Var != null) {
                ee2Var.a = t30Var;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(StateFlow stateFlow, long j, r60 r60Var) {
        pt0 pt0Var;
        if (r60Var instanceof pt0) {
            pt0Var = (pt0) r60Var;
            int i = pt0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pt0Var.f = i - Integer.MIN_VALUE;
            } else {
                pt0Var = new pt0(r60Var);
            }
        } else {
            pt0Var = new pt0(r60Var);
        }
        Object objWithTimeoutOrNull = pt0Var.e;
        int i2 = pt0Var.f;
        q60 q60Var = null;
        boolean z = true;
        if (i2 == 0) {
            ee0.J(objWithTimeoutOrNull);
            if (stateFlow.getValue() == null) {
                d6 d6Var = new d6(stateFlow, q60Var, 6);
                pt0Var.f = 1;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, d6Var, pt0Var);
                z70 z70Var = z70.e;
                if (objWithTimeoutOrNull == z70Var) {
                    return z70Var;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(objWithTimeoutOrNull);
        if (objWithTimeoutOrNull == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static lt2 l(lt2 lt2Var) {
        lt2Var.e.b();
        return lt2Var.size() > 0 ? lt2Var : lt2.f;
    }

    public static w33 m(long j, long j2, long j3, long j4, long j5, long j6, f30 f30Var, int i) {
        long j7 = hz.f;
        long jD = mz.d(xp1.C, f30Var);
        long jD2 = (i & 16) != 0 ? mz.d(xp1.K, f30Var) : j3;
        long jD3 = (i & 32) != 0 ? mz.d(xp1.N, f30Var) : j4;
        long jD4 = (i & 64) != 0 ? mz.d(xp1.J, f30Var) : j5;
        long jD5 = mz.d(xp1.M, f30Var);
        long jC = hz.c(xp1.n, mz.d(xp1.m, f30Var));
        hh0 hh0Var = mz.a;
        long jQ = xp1.q(jC, ((kz) ((ov0) f30Var).j(hh0Var)).p);
        long jD6 = mz.d(xp1.q, f30Var);
        float f = xp1.r;
        return new w33(j, j2, j7, jD, jD2, jD3, jD4, jD5, jQ, xp1.q(hz.c(f, jD6), ((kz) ((ov0) f30Var).j(hh0Var)).p), j7, xp1.q(hz.c(xp1.p, mz.d(xp1.o, f30Var)), ((kz) ((ov0) f30Var).j(hh0Var)).p), xp1.q(hz.c(xp1.t, mz.d(xp1.s, f30Var)), ((kz) ((ov0) f30Var).j(hh0Var)).p), (i & 8192) != 0 ? xp1.q(hz.c(f, mz.d(xp1.w, f30Var)), ((kz) ((ov0) f30Var).j(hh0Var)).p) : j6, xp1.q(hz.c(f, mz.d(xp1.x, f30Var)), ((kz) ((ov0) f30Var).j(hh0Var)).p), xp1.q(hz.c(xp1.v, mz.d(xp1.u, f30Var)), ((kz) ((ov0) f30Var).j(hh0Var)).p));
    }

    public static final ap0 n(ii2 ii2Var, boolean z, String[] strArr, lu0 lu0Var) {
        ii2Var.getClass();
        return new ap0(FlowKt.conflate(ii2Var.getInvalidationTracker().a((String[]) Arrays.copyOf(strArr, strArr.length))), ii2Var, z, lu0Var);
    }

    public static gx0 o(SSLSession sSLSession) throws IOException {
        List listJ;
        List listJ2 = uj0.e;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            fo.n("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            fo.r("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        lx lxVarM = lx.b.m(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            fo.n("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            fo.r("tlsVersion == NONE");
            return null;
        }
        sa3 sa3VarH = v83.h(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listJ = peerCertificates != null ? bh3.j(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listJ2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listJ2 = bh3.j(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new gx0(sa3VarH, lxVarM, listJ2, new ye(listJ, 10));
    }

    public static kr1 p(String str) {
        str.getClass();
        Matcher matcher = kr1.e.matcher(str);
        if (!matcher.lookingAt()) {
            fo.f(p91.p("No subtype found for: \"", str, '\"'));
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = strGroup.toLowerCase(locale);
        lowerCase.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        String lowerCase2 = strGroup2.toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = kr1.f.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (s13.Z(strGroup4, "'", false) && strGroup4.endsWith("'") && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new kr1(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
    }

    public static float q(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return oh0.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final long s(zk2 zk2Var) throws Exception {
        if (w(zk2Var) == 0) {
            return -1L;
        }
        bl2 bl2VarA0 = zk2Var.a0("SELECT last_insert_rowid()");
        try {
            bl2VarA0.R();
            long j = bl2VarA0.getLong(0);
            am1.j(bl2VarA0, null);
            return j;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    public static final int t(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final int u(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                fo.i("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final Bundle v(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        fo.i(az2.k("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static final int w(zk2 zk2Var) throws Exception {
        bl2 bl2VarA0 = zk2Var.a0("SELECT changes()");
        try {
            bl2VarA0.R();
            int i = (int) bl2VarA0.getLong(0);
            am1.j(bl2VarA0, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                am1.j(bl2VarA0, th);
                throw th2;
            }
        }
    }

    public static final boolean x(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean y(String str) {
        str.getClass();
        try {
            return vd0.C(str).compareTo(vd0.C("3.0.16")) > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static List z(kx2 kx2Var, int i, kx2 kx2Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iT = kx2Var.t(i);
        int i2 = i + iT;
        int iF = kx2Var.f(kx2Var.b, kx2Var.q(i));
        int iF2 = kx2Var.f(kx2Var.b, kx2Var.q(i2));
        int i3 = iF2 - iF;
        boolean z5 = i >= 0 && (kx2Var.b[(kx2Var.q(i) * 5) + 1] & 201326592) != 0;
        kx2Var2.v(iT);
        kx2Var2.w(i3, kx2Var2.t);
        if (kx2Var.g < i2) {
            kx2Var.A(i2);
        }
        if (kx2Var.k < iF2) {
            kx2Var.B(iF2, i2);
        }
        int[] iArr = kx2Var2.b;
        int i4 = kx2Var2.t;
        int i5 = i4 * 5;
        yo.k0(i5, i * 5, i2 * 5, kx2Var.b, iArr);
        Object[] objArr = kx2Var2.c;
        int i6 = kx2Var2.i;
        System.arraycopy(kx2Var.c, iF, objArr, i6, i3);
        int i7 = kx2Var2.v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iT;
        int iF3 = i6 - kx2Var2.f(iArr, i4);
        int i10 = kx2Var2.m;
        int i11 = kx2Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = kx2.h(kx2Var2.f(iArr, i13) + iF3, i12 < i13 ? 0 : kx2Var2.k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        kx2Var2.m = i12;
        int iB = jx2.b(kx2Var.d, i, kx2Var.o());
        int iB2 = jx2.b(kx2Var.d, i2, kx2Var.o());
        if (iB < iB2) {
            ArrayList arrayList = kx2Var.d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i15 = iB; i15 < iB2; i15++) {
                iv0 iv0Var = (iv0) arrayList.get(i15);
                iv0Var.a += i8;
                arrayList2.add(iv0Var);
            }
            kx2Var2.d.addAll(jx2.b(kx2Var2.d, kx2Var2.t, kx2Var2.o()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = uj0.e;
        }
        if (!list.isEmpty()) {
            HashMap map = kx2Var.e;
            HashMap map2 = kx2Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = kx2Var2.v;
        kx2Var2.N(i7);
        int iD = kx2Var.D(kx2Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iD >= 0;
            if (z7) {
                kx2Var.O();
                kx2Var.a(iD - kx2Var.t);
                kx2Var.O();
            }
            kx2Var.a(i - kx2Var.t);
            boolean zG = kx2Var.G();
            if (z7) {
                kx2Var.L();
                kx2Var.i();
                kx2Var.L();
                kx2Var.i();
            }
            z4 = zG;
        } else {
            boolean zH = kx2Var.H(i, iT);
            kx2Var.I(iF, i3, i - 1);
            z4 = zH;
        }
        if (z4) {
            j30.a("Unexpectedly removed anchors");
        }
        int i18 = kx2Var2.o;
        int i19 = iArr3[i5 + 1];
        kx2Var2.o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            kx2Var2.t = i9;
            kx2Var2.i = i6 + i3;
        }
        if (z6) {
            kx2Var2.S(i7);
        }
        return list;
    }

    public abstract void F(boolean z);

    public abstract void G(boolean z);

    public abstract InputFilter[] r(InputFilter[] inputFilterArr);
}
