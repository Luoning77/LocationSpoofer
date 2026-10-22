package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoSource;
import com.vincenthzr.locationspoofer.data.db.CollectionRouteRecord;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import com.vincenthzr.locationspoofer.data.model.MapEngine;
import com.vincenthzr.locationspoofer.data.model.SearchMode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ks implements ak0, m30 {
    public static final p10 A;
    public static final p10 C;
    public static final p10 D;
    public static final p10 E;
    public static final p10 F;
    public static final p10 G;
    public static final p10 H;
    public static final p10 I;
    public static final Class[] J;
    public static final k91 K;
    public static final Object L;
    public static final lz M;
    public static final lz N;
    public static x01 O;
    public static x01 P;
    public static final p10 d;
    public static final p10 e;
    public static final p10 j;
    public static final p10 k;
    public static final p10 m;
    public static final p10 n;
    public static final p10 o;
    public static final p10 u;
    public static final p10 v;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final p10 b = new p10(new e00(1), false, -860928442);
    public static final p10 c = new p10(new u1(3), false, 220568846);
    public static final p10 f = new p10(new u1(12), false, -1128766081);
    public static final p10 g = new p10(new u1(13), false, -1655168343);
    public static final p10 h = new p10(new u1(14), false, -518295761);
    public static final p10 i = new p10(new u1(15), false, -813186600);
    public static final p10 l = new p10(new u1(11), false, -701553707);
    public static final p10 p = new p10(new u1(21), false, 1467187454);
    public static final p10 q = new p10(new u1(22), false, -444844943);
    public static final p10 r = new p10(new u1(23), false, 611091404);
    public static final p10 s = new p10(new u1(24), false, -1287151867);
    public static final p10 t = new p10(new u1(25), false, 1902786416);
    public static final p10 w = new p10(new u1(5), false, -2134625052);
    public static final p10 x = new p10(new u1(6), false, -1463530813);
    public static final p10 y = new p10(new u1(7), false, 575893939);
    public static final p10 z = new p10(new u1(8), false, 1466968561);
    public static final p10 B = new p10(new y10(), false, -1571120048);

    static {
        int i2 = 16;
        int i3 = 9;
        d = new p10(new u1(i3), false, 736922451);
        int i4 = 10;
        e = new p10(new u1(i4), false, 1744517142);
        j = new p10(new u1(i2), false, 1343216574);
        int i5 = 17;
        k = new p10(new u1(i5), false, 511102407);
        int i6 = 18;
        m = new p10(new u1(i6), false, -616742146);
        int i7 = 19;
        n = new p10(new u1(i7), false, 771053051);
        int i8 = 20;
        o = new p10(new u1(i8), false, 1106312981);
        int i9 = 2;
        u = new p10(new u1(i9), false, 2034120213);
        int i10 = 4;
        v = new p10(new u1(i10), false, 1329259892);
        A = new p10(new e00(i9), false, 1942755852);
        C = new p10(new s10(i7), false, -1455401925);
        D = new p10(new a20(i10), false, -1095103739);
        new p10(new b20(i2), false, -577243847);
        E = new p10(new b20(i5), false, -961547896);
        F = new p10(new b20(i6), false, 1109153392);
        G = new p10(new c20(i8), false, -591923952);
        H = new p10(new d20(i3), false, 1140479902);
        I = new p10(new d20(i4), false, 1999649617);
        J = new Class[]{Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
        K = new k91(0);
        L = new Object();
        M = lz.m;
        N = lz.o;
    }

    /* JADX WARN: Code duplicated, block: B:196:0x096c  */
    /* JADX WARN: Code duplicated, block: B:197:0x096f  */
    /* JADX WARN: Code duplicated, block: B:200:0x0978  */
    /* JADX WARN: Code duplicated, block: B:201:0x097b  */
    /* JADX WARN: Code duplicated, block: B:204:0x098b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0991  */
    /* JADX WARN: Code duplicated, block: B:231:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v51 */
    public static final void B(ul1 ul1Var, AppState appState, au0 au0Var, f30 f30Var, int i2) throws Throwable {
        ov0 ov0Var;
        Object obj;
        int i3;
        ey1 ey1Var;
        ey1 ey1Var2;
        boolean zContainsKey;
        Object obj2;
        ey1 ey1Var3;
        Object obj3;
        gh ghVar;
        pr prVar;
        gh ghVar2;
        gh ghVar3;
        wa waVar;
        gh ghVar4;
        Object obj4;
        ?? r5;
        ?? r14;
        boolean z2;
        Object obj5;
        ey1 ey1Var4;
        Object obj6;
        ey1 ey1Var5;
        long j2;
        long j3;
        long j4;
        boolean z3;
        boolean z4;
        ov0 ov0Var2;
        ey1 ey1Var6;
        Object obj7;
        long j5;
        float f2;
        Object obj8;
        AppState appState2 = appState;
        ul1Var.getClass();
        appState2.getClass();
        au0Var.getClass();
        ov0 ov0Var3 = (ov0) f30Var;
        ov0Var3.e0(-1003567462);
        int i4 = i2 | (ov0Var3.h(ul1Var) ? 4 : 2) | (ov0Var3.h(appState2) ? 32 : 16) | (ov0Var3.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        boolean z5 = true;
        if (ov0Var3.T(i4 & 1, (i4 & 147) != 146)) {
            Object objQ = ov0Var3.Q();
            Object obj9 = d30.a;
            if (objQ == obj9) {
                obj = objQ;
                Object objH = ke0.H("");
                ov0Var3.m0(objH);
                obj = objH;
            }
            obj = objQ;
            ey1 ey1Var7 = (ey1) obj;
            Object objQ2 = ov0Var3.Q();
            Object obj10 = objQ2;
            if (objQ2 == obj9) {
                Object objH2 = ke0.H(u60.e);
                ov0Var3.m0(objH2);
                obj10 = objH2;
            }
            final ey1 ey1Var8 = (ey1) obj10;
            Object objQ3 = ov0Var3.Q();
            Throwable th = null;
            Object obj11 = objQ3;
            if (objQ3 == obj9) {
                Object objH3 = ke0.H(null);
                ov0Var3.m0(objH3);
                obj11 = objH3;
            }
            ey1 ey1Var9 = (ey1) obj11;
            final boolean zW = n51.w(ov0Var3);
            xq1.g(false, au0Var, ov0Var3, (i4 >> 3) & 112, 1);
            boolean zF = ov0Var3.f(appState2.getHookedApps()) | ov0Var3.f(appState2.getAppCoordinateSystems());
            Object objQ4 = ov0Var3.Q();
            Object obj12 = objQ4;
            if (zF || objQ4 == obj9) {
                List<AppInfoItem> hookedApps = appState2.getHookedApps();
                if (hookedApps == null || !hookedApps.isEmpty()) {
                    Iterator<T> it = hookedApps.iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        Throwable th2 = th;
                        if (appState2.getAppCoordinateSystems().containsKey(((AppInfoItem) it.next()).getPackageName()) && (i3 = i3 + 1) < 0) {
                            am1.W();
                            throw th2;
                        }
                        th = th2;
                    }
                } else {
                    i3 = 0;
                }
                Object objValueOf = Integer.valueOf(i3);
                ov0Var3.m0(objValueOf);
                obj12 = objValueOf;
            }
            final int iIntValue = ((Number) obj12).intValue();
            boolean zF2 = ov0Var3.f(appState2.getHookedApps()) | ov0Var3.f((String) ey1Var7.getValue()) | ov0Var3.d(((u60) ey1Var8.getValue()).ordinal()) | ov0Var3.f(appState2.getAppCoordinateSystems());
            Object objQ5 = ov0Var3.Q();
            if (zF2 || objQ5 == obj9) {
                List<AppInfoItem> hookedApps2 = appState2.getHookedApps();
                ArrayList arrayList = new ArrayList();
                for (Object obj13 : hookedApps2) {
                    AppInfoItem appInfoItem = (AppInfoItem) obj13;
                    if (l13.k0((String) ey1Var7.getValue())) {
                        ey1Var2 = ey1Var7;
                    } else {
                        ey1Var2 = ey1Var7;
                        if (!l13.c0(appInfoItem.getAppName(), (String) ey1Var7.getValue(), z5) && !l13.c0(appInfoItem.getPackageName(), (String) ey1Var2.getValue(), z5)) {
                            zContainsKey = false;
                        }
                        if (zContainsKey) {
                            arrayList.add(obj13);
                        }
                        ey1Var7 = ey1Var2;
                        z5 = true;
                    }
                    zContainsKey = appState2.getAppCoordinateSystems().containsKey(appInfoItem.getPackageName());
                    int iOrdinal = ((u60) ey1Var8.getValue()).ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != z5) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    b81.d();
                                    return;
                                }
                                zContainsKey = appInfoItem.isSystem();
                            } else if (appInfoItem.isSystem()) {
                                zContainsKey = false;
                            }
                        }
                        if (zContainsKey) {
                            arrayList.add(obj13);
                        }
                        ey1Var7 = ey1Var2;
                        z5 = true;
                    }
                    zContainsKey = true;
                    if (zContainsKey) {
                        arrayList.add(obj13);
                    }
                    ey1Var7 = ey1Var2;
                    z5 = true;
                }
                ey1Var = ey1Var7;
                ov0Var3.m0(arrayList);
                obj2 = arrayList;
            } else {
                ey1Var = ey1Var7;
                obj2 = objQ5;
            }
            List list = (List) obj2;
            fn0 fn0Var = iw2.c;
            long j6 = zW ? bk.a : bk.d;
            iy0 iy0Var = o51.p0;
            dv1 dv1VarK = xp1.k(fn0Var, j6, iy0Var);
            pr prVar2 = j9.f;
            er1 er1VarC = ws.c(prVar2, false);
            int iHashCode = Long.hashCode(ov0Var3.T);
            l72 l72VarL = ov0Var3.l();
            dv1 dv1VarH = xp1.H(ov0Var3, dv1VarK);
            w20.b.getClass();
            x30 x30Var = v20.b;
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(x30Var);
            } else {
                ov0Var3.p0();
            }
            gh ghVar5 = v20.e;
            q73.h(ov0Var3, ghVar5, er1VarC);
            gh ghVar6 = v20.d;
            q73.h(ov0Var3, ghVar6, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar7 = v20.f;
            q73.h(ov0Var3, ghVar7, numValueOf);
            wa waVar2 = v20.g;
            q73.g(ov0Var3, waVar2);
            gh ghVar8 = v20.c;
            q73.h(ov0Var3, ghVar8, dv1VarH);
            dv1 dv1VarU = ji2.U(fn0Var);
            ho hoVar = am1.g;
            nr nrVar = j9.r;
            yz yzVarA = wz.a(hoVar, nrVar, ov0Var3, 0);
            int iHashCode2 = Long.hashCode(ov0Var3.T);
            l72 l72VarL2 = ov0Var3.l();
            dv1 dv1VarH2 = xp1.H(ov0Var3, dv1VarU);
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(x30Var);
            } else {
                ov0Var3.p0();
            }
            q73.h(ov0Var3, ghVar5, yzVarA);
            q73.h(ov0Var3, ghVar6, l72VarL2);
            az2.s(iHashCode2, ov0Var3, ghVar7, ov0Var3, waVar2);
            q73.h(ov0Var3, ghVar8, dv1VarH2);
            av1 av1Var = av1.a;
            dv1 dv1VarE = zm3.E(iw2.e(av1Var, 1.0f), 16.0f, 10.0f);
            or orVar = j9.p;
            go goVar = am1.e;
            kk2 kk2VarA = jk2.a(goVar, orVar, ov0Var3, 48);
            int iHashCode3 = Long.hashCode(ov0Var3.T);
            l72 l72VarL3 = ov0Var3.l();
            dv1 dv1VarH3 = xp1.H(ov0Var3, dv1VarE);
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(x30Var);
            } else {
                ov0Var3.p0();
            }
            q73.h(ov0Var3, ghVar5, kk2VarA);
            q73.h(ov0Var3, ghVar6, l72VarL3);
            az2.s(iHashCode3, ov0Var3, ghVar7, ov0Var3, waVar2);
            q73.h(ov0Var3, ghVar8, dv1VarH3);
            dv1 dv1VarK2 = iw2.k(av1Var, 44.0f);
            bj2 bj2Var = cj2.a;
            dv1 dv1VarA = bk.a(ji2.w(xp1.k(xp1.n(hd0.O(dv1VarK2, 6.0f, bj2Var, 0L, 0L, 24), bj2Var), zW ? xp1.d(4280428334L) : hz.c, iy0Var), 1.0f, zW ? hz.c(0.14f, hz.c) : xp1.d(4293257452L), bj2Var), au0Var);
            pr prVar3 = j9.j;
            er1 er1VarC2 = ws.c(prVar3, false);
            int iHashCode4 = Long.hashCode(ov0Var3.T);
            l72 l72VarL4 = ov0Var3.l();
            dv1 dv1VarH4 = xp1.H(ov0Var3, dv1VarA);
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(x30Var);
            } else {
                ov0Var3.p0();
            }
            q73.h(ov0Var3, ghVar5, er1VarC2);
            q73.h(ov0Var3, ghVar6, l72VarL4);
            az2.s(iHashCode4, ov0Var3, ghVar7, ov0Var3, waVar2);
            q73.h(ov0Var3, ghVar8, dv1VarH4);
            ey1 ey1Var10 = ey1Var;
            t01.a(n51.u(), ke0.N(2131624056, ov0Var3), iw2.k(av1Var, 21.0f), zW ? hz.c : xp1.d(4279901472L), ov0Var3, 384, 0);
            az2.t(ov0Var3, true, av1Var, 14.0f, ov0Var3);
            yz yzVarA2 = wz.a(hoVar, nrVar, ov0Var3, 0);
            int iHashCode5 = Long.hashCode(ov0Var3.T);
            l72 l72VarL5 = ov0Var3.l();
            dv1 dv1VarH5 = xp1.H(ov0Var3, av1Var);
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(x30Var);
            } else {
                ov0Var3.p0();
            }
            q73.h(ov0Var3, ghVar5, yzVarA2);
            q73.h(ov0Var3, ghVar6, l72VarL5);
            az2.s(iHashCode5, ov0Var3, ghVar7, ov0Var3, waVar2);
            q73.h(ov0Var3, ghVar8, dv1VarH5);
            String strN = ke0.N(2131624366, ov0Var3);
            long jC = v63.c(18);
            jr0 jr0Var = jr0.j;
            s83.b(strN, null, dh0.p(ov0Var3).o, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
            s83.b(ke0.N(2131624022, ov0Var3), null, hz.c(0.5f, dh0.p(ov0Var3).o), v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
            ov0Var3.p(true);
            ov0Var3.p(true);
            dv1 dv1VarE2 = zm3.E(iw2.e(av1Var, 1.0f), 16.0f, 4.0f);
            er1 er1VarC3 = ws.c(prVar2, false);
            int iHashCode6 = Long.hashCode(ov0Var3.T);
            l72 l72VarL6 = ov0Var3.l();
            dv1 dv1VarH6 = xp1.H(ov0Var3, dv1VarE2);
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(x30Var);
            } else {
                ov0Var3.p0();
            }
            q73.h(ov0Var3, ghVar5, er1VarC3);
            q73.h(ov0Var3, ghVar6, l72VarL6);
            az2.s(iHashCode6, ov0Var3, ghVar7, ov0Var3, waVar2);
            q73.h(ov0Var3, ghVar8, dv1VarH6);
            dv1 dv1VarF = zm3.F(ji2.w(xp1.k(xp1.n(iw2.g(iw2.e(av1Var, 1.0f), 44.0f), cj2.a(14.0f)), zW ? xp1.d(4280428334L) : hz.c, iy0Var), 0.8f, zW ? hz.c(0.1f, hz.c) : hz.c(0.05f, hz.b), cj2.a(14.0f)), 14.0f, 0.0f, 2);
            kk2 kk2VarA2 = jk2.a(goVar, orVar, ov0Var3, 48);
            int iHashCode7 = Long.hashCode(ov0Var3.T);
            l72 l72VarL7 = ov0Var3.l();
            dv1 dv1VarH7 = xp1.H(ov0Var3, dv1VarF);
            ov0Var3.g0();
            if (ov0Var3.S) {
                ov0Var3.k(x30Var);
            } else {
                ov0Var3.p0();
            }
            q73.h(ov0Var3, ghVar5, kk2VarA2);
            q73.h(ov0Var3, ghVar6, l72VarL7);
            az2.s(iHashCode7, ov0Var3, ghVar7, ov0Var3, waVar2);
            q73.h(ov0Var3, ghVar8, dv1VarH7);
            t01.a(dh0.s(), null, iw2.k(av1Var, 18.0f), bk.g, ov0Var3, 3504, 0);
            gh0.h(ov0Var3, iw2.o(av1Var, 10.0f));
            String str = (String) ey1Var10.getValue();
            q93 q93Var = new q93(dh0.p(ov0Var3).q, v63.b(13.5d), jr0.h, 0L, 0L, 0, 0L, 16777208);
            wb1 wb1Var = new wb1(1.0f, true);
            Object objQ6 = ov0Var3.Q();
            if (objQ6 == obj9) {
                ey1Var3 = ey1Var10;
                Object f4Var = new f4(ey1Var3, 11);
                ov0Var3.m0(f4Var);
                obj3 = f4Var;
            } else {
                ey1Var3 = ey1Var10;
                obj3 = objQ6;
            }
            ey1 ey1Var11 = ey1Var3;
            xq.a(str, (lu0) obj3, wb1Var, false, q93Var, null, null, true, 0, 0, null, null, null, null, sb.a0(1191676631, new h5(ey1Var3, 3), ov0Var3), ov0Var3, 100663344, 196608, 32472);
            if (((String) ey1Var11.getValue()).length() > 0) {
                ov0Var3.c0(1899907501);
                dv1 dv1VarK3 = xp1.k(xp1.n(iw2.k(av1Var, 20.0f), bj2Var), hz.c(0.1f, dh0.p(ov0Var3).q), iy0Var);
                Object objQ7 = ov0Var3.Q();
                obj4 = obj9;
                if (objQ7 == obj4) {
                    obj8 = objQ7;
                    Object s2Var = new s2(ey1Var11, 17);
                    ov0Var3.m0(s2Var);
                    obj8 = s2Var;
                }
                obj8 = objQ7;
                dv1 dv1VarA2 = bk.a(dv1VarK3, (au0) obj8);
                prVar = prVar3;
                r14 = 0;
                er1 er1VarC4 = ws.c(prVar, false);
                int iHashCode8 = Long.hashCode(ov0Var3.T);
                l72 l72VarL8 = ov0Var3.l();
                dv1 dv1VarH8 = xp1.H(ov0Var3, dv1VarA2);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(x30Var);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar5, er1VarC4);
                q73.h(ov0Var3, ghVar6, l72VarL8);
                az2.s(iHashCode8, ov0Var3, ghVar7, ov0Var3, waVar2);
                q73.h(ov0Var3, ghVar8, dv1VarH8);
                ghVar3 = ghVar7;
                waVar = waVar2;
                ghVar2 = ghVar6;
                ghVar4 = ghVar8;
                ghVar = ghVar5;
                t01.a(k22.u(), null, iw2.k(av1Var, 12.0f), hz.c(0.6f, dh0.p(ov0Var3).q), ov0Var3, 432, 0);
                r5 = 1;
                ov0Var3.p(true);
            } else {
                ghVar = ghVar5;
                prVar = prVar3;
                ghVar2 = ghVar6;
                ghVar3 = ghVar7;
                waVar = waVar2;
                ghVar4 = ghVar8;
                obj4 = obj9;
                r5 = 1;
                r14 = 0;
                ov0Var3.c0(1891302862);
            }
            ov0Var3.p(r14);
            ov0Var3.p(r5);
            ov0Var3.p(r5);
            dv1 dv1VarF2 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 8.0f, r5);
            b52 b52VarE = zm3.e(2, 16.0f);
            jo joVar = new jo(8.0f, r5, new fo(r14));
            boolean zD = ov0Var3.d(iIntValue) | ov0Var3.g(zW);
            Object objQ8 = ov0Var3.Q();
            Object obj14 = objQ8;
            if (zD || objQ8 == obj4) {
                Object obj15 = new lu0() { // from class: an
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj16) {
                        kd1 kd1Var = (kd1) obj16;
                        kd1Var.getClass();
                        u60[] u60VarArrValues = u60.values();
                        kd1Var.c(u60VarArrValues.length, null, new cn(u60VarArrValues, 0), new p10(new dn(u60VarArrValues, iIntValue, zW, ey1Var8), true, -1781742563));
                        return mf3.a;
                    }
                };
                ov0Var3.m0(obj15);
                obj14 = obj15;
            }
            boolean z6 = r14;
            Object obj16 = obj4;
            pr prVar4 = prVar;
            ke0.e(dv1VarF2, null, b52VarE, joVar, null, null, false, null, (lu0) obj14, ov0Var3, 24966);
            if (list.isEmpty()) {
                ov0Var3.c0(-159491743);
                dv1 dv1VarD = zm3.D(fn0Var, 32.0f);
                er1 er1VarC5 = ws.c(prVar4, z6);
                int iHashCode9 = Long.hashCode(ov0Var3.T);
                l72 l72VarL9 = ov0Var3.l();
                dv1 dv1VarH9 = xp1.H(ov0Var3, dv1VarD);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(x30Var);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar, er1VarC5);
                q73.h(ov0Var3, ghVar2, l72VarL9);
                gh ghVar9 = ghVar3;
                wa waVar3 = waVar;
                az2.s(iHashCode9, ov0Var3, ghVar9, ov0Var3, waVar3);
                gh ghVar10 = ghVar4;
                q73.h(ov0Var3, ghVar10, dv1VarH9);
                yz yzVarA3 = wz.a(new jo(10.0f, true, new fo(z6 ? 1 : 0)), j9.s, ov0Var3, 54);
                int iHashCode10 = Long.hashCode(ov0Var3.T);
                l72 l72VarL10 = ov0Var3.l();
                dv1 dv1VarH10 = xp1.H(ov0Var3, av1Var);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(x30Var);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar, yzVarA3);
                q73.h(ov0Var3, ghVar2, l72VarL10);
                az2.s(iHashCode10, ov0Var3, ghVar9, ov0Var3, waVar3);
                q73.h(ov0Var3, ghVar10, dv1VarH10);
                dv1 dv1VarN = xp1.n(iw2.k(av1Var, 64.0f), cj2.a(20.0f));
                if (zW) {
                    j5 = hz.c;
                    f2 = 0.05f;
                } else {
                    j5 = hz.b;
                    f2 = 0.03f;
                }
                dv1 dv1VarK4 = xp1.k(dv1VarN, hz.c(f2, j5), iy0Var);
                er1 er1VarC6 = ws.c(prVar4, z6);
                int iHashCode11 = Long.hashCode(ov0Var3.T);
                l72 l72VarL11 = ov0Var3.l();
                dv1 dv1VarH11 = xp1.H(ov0Var3, dv1VarK4);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(x30Var);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar, er1VarC6);
                q73.h(ov0Var3, ghVar2, l72VarL11);
                az2.s(iHashCode11, ov0Var3, ghVar9, ov0Var3, waVar3);
                q73.h(ov0Var3, ghVar10, dv1VarH11);
                t01.a(gh0.B(), null, iw2.k(av1Var, 32.0f), hz.c(0.4f, dh0.p(ov0Var3).o), ov0Var3, 432, 0);
                ov0Var3.p(true);
                s83.b(ke0.N(2131624799, ov0Var3), null, dh0.p(ov0Var3).o, v63.c(15), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                s83.b(ke0.N(2131624962, ov0Var3), null, hz.c(0.5f, dh0.p(ov0Var3).o), v63.b(12.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                ov0 ov0Var4 = ov0Var3;
                ov0Var4.p(true);
                ov0Var4.p(true);
                ov0Var4.p(z6);
                appState2 = appState;
                z3 = z6 ? 1 : 0;
                z4 = true;
                ey1Var5 = ey1Var9;
                obj5 = obj16;
                z2 = zW;
                ov0Var2 = ov0Var4;
            } else {
                gh ghVar11 = ghVar3;
                wa waVar4 = waVar;
                gh ghVar12 = ghVar4;
                ov0Var3.c0(-157514501);
                dv1 dv1VarE3 = iw2.e(new wb1(1.0f, true), 1.0f);
                er1 er1VarC7 = ws.c(prVar2, z6);
                int iHashCode12 = Long.hashCode(ov0Var3.T);
                l72 l72VarL12 = ov0Var3.l();
                dv1 dv1VarH12 = xp1.H(ov0Var3, dv1VarE3);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(x30Var);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar, er1VarC7);
                q73.h(ov0Var3, ghVar2, l72VarL12);
                az2.s(iHashCode12, ov0Var3, ghVar11, ov0Var3, waVar4);
                q73.h(ov0Var3, ghVar12, dv1VarH12);
                b52 b52Var = new b52(16.0f, 8.0f, 16.0f, 24.0f);
                jo joVar2 = new jo(10.0f, true, new fo(z6 ? 1 : 0));
                appState2 = appState;
                z2 = zW;
                boolean zH = ov0Var3.h(list) | ov0Var3.h(appState2) | ov0Var3.g(z2);
                Object objQ9 = ov0Var3.Q();
                if (zH) {
                    obj5 = obj16;
                } else {
                    obj5 = obj16;
                    if (objQ9 != obj5) {
                        ey1Var4 = ey1Var9;
                        obj6 = objQ9;
                    }
                    ey1Var5 = ey1Var4;
                    ke0.d(fn0Var, null, b52Var, joVar2, null, null, false, null, (lu0) obj6, ov0Var3, 24582, 490);
                    ov0 ov0Var5 = ov0Var3;
                    dv1 dv1VarK5 = k22.k(iw2.g(iw2.e(av1Var, 1.0f), 20.0f), j9.g);
                    if (z2) {
                        j2 = bk.a;
                    } else {
                        j2 = bk.d;
                    }
                    hz hzVar = new hz(j2);
                    if (z2) {
                        j3 = bk.a;
                    } else {
                        j3 = bk.d;
                    }
                    hz hzVar2 = new hz(hz.c(0.85f, j3));
                    if (z2) {
                        j4 = bk.a;
                    } else {
                        j4 = bk.d;
                    }
                    z3 = false;
                    ws.a(xp1.j(dv1VarK5, u92.p(am1.G(hzVar, hzVar2, new hz(hz.c(0.4f, j4)), new hz(hz.f)))), ov0Var5, 0);
                    z4 = true;
                    ov0Var5.p(true);
                    ov0Var5.p(false);
                    ov0Var2 = ov0Var5;
                }
                ey1Var4 = ey1Var9;
                Object sfVar = new sf(list, appState2, z2, ey1Var4);
                ov0Var3.m0(sfVar);
                obj6 = sfVar;
                ey1Var5 = ey1Var4;
                ke0.d(fn0Var, null, b52Var, joVar2, null, null, false, null, (lu0) obj6, ov0Var3, 24582, 490);
                ov0 ov0Var6 = ov0Var3;
                dv1 dv1VarK6 = k22.k(iw2.g(iw2.e(av1Var, 1.0f), 20.0f), j9.g);
                if (z2) {
                    j2 = bk.a;
                } else {
                    j2 = bk.d;
                }
                hz hzVar3 = new hz(j2);
                if (z2) {
                    j3 = bk.a;
                } else {
                    j3 = bk.d;
                }
                hz hzVar4 = new hz(hz.c(0.85f, j3));
                if (z2) {
                    j4 = bk.a;
                } else {
                    j4 = bk.d;
                }
                z3 = false;
                ws.a(xp1.j(dv1VarK6, u92.p(am1.G(hzVar3, hzVar4, new hz(hz.c(0.4f, j4)), new hz(hz.f)))), ov0Var6, 0);
                z4 = true;
                ov0Var6.p(true);
                ov0Var6.p(false);
                ov0Var2 = ov0Var6;
            }
            ov0Var2.p(z4);
            ov0Var2.p(z4);
            AppInfoItem appInfoItem2 = (AppInfoItem) ey1Var5.getValue();
            if (appInfoItem2 == null) {
                ov0Var2.c0(1694963);
                ov0Var2.p(z3);
                ov0Var = ov0Var2;
            } else {
                ov0Var2.c0(1694964);
                String str2 = appState2.getAppCoordinateSystems().get(appInfoItem2.getPackageName());
                if (str2 == null) {
                    str2 = "AUTO";
                }
                String str3 = str2;
                Object objQ10 = ov0Var2.Q();
                if (objQ10 == obj5) {
                    ey1Var6 = ey1Var5;
                    Object s2Var2 = new s2(ey1Var6, 18);
                    ov0Var2.m0(s2Var2);
                    obj7 = s2Var2;
                } else {
                    ey1Var6 = ey1Var5;
                    obj7 = objQ10;
                }
                au0 au0Var2 = (au0) obj7;
                boolean zH2 = ov0Var2.h(ul1Var) | ov0Var2.h(appInfoItem2);
                Object objQ11 = ov0Var2.Q();
                Object obj17 = objQ11;
                if (zH2 || objQ11 == obj5) {
                    Object ji1Var = new ji1(ul1Var, appInfoItem2, ey1Var6, 2);
                    ov0Var2.m0(ji1Var);
                    obj17 = ji1Var;
                }
                xp1.f(appInfoItem2, str3, z2, au0Var2, (lu0) obj17, ov0Var2, 3072);
                ov0Var2.p(false);
                ov0Var = ov0Var2;
            }
        } else {
            ov0Var3.W();
            ov0Var = ov0Var3;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new xm(ul1Var, appState2, au0Var, i2, 0);
        }
    }

    public static final void C(String str, dv1 dv1Var, f30 f30Var, int i2) {
        dv1 dv1Var2;
        str.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-80638523);
        int i3 = (ov0Var.f(str) ? 4 : 2) | i2;
        int i4 = 0;
        if (ov0Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) ov0Var.j(AndroidCompositionLocals_androidKt.b);
            Object objQ = ov0Var.Q();
            int i5 = 14;
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = new v1(i5);
                ov0Var.m0(objQ);
            }
            lu0 lu0Var = (lu0) objQ;
            boolean zH = ov0Var.h(context) | ((i3 & 14) == 4);
            Object objQ2 = ov0Var.Q();
            if (zH || objQ2 == c30Var) {
                objQ2 = new j(3, context, str);
                ov0Var.m0(objQ2);
            }
            dv1Var2 = dv1Var;
            xq1.c(lu0Var, dv1Var2, (lu0) objQ2, ov0Var, 54, 0);
        } else {
            dv1Var2 = dv1Var;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new zm(str, dv1Var2, i2, i4);
        }
    }

    public static final void D(AppInfoItem appInfoItem, String str, boolean z2, au0 au0Var, f30 f30Var, int i2) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-1873964415);
        int i3 = (ov0Var.h(appInfoItem) ? 4 : 2) | i2 | (ov0Var.f(str) ? 32 : 16) | (ov0Var.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var.h(au0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (ov0Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            zm3.b(bk.a(iw2.e(av1.a, 1.0f), au0Var), 16.0f, new b52(14.0f, 12.0f, 14.0f, 12.0f), sb.a0(-247501392, new ym(z2, appInfoItem, str != null, str == null ? "AUTO" : str), ov0Var), ov0Var, 25008, 8);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new p2(appInfoItem, str, z2, au0Var, i2);
        }
    }

    public static final void E(final CollectionRouteRecord collectionRouteRecord, boolean z2, au0 au0Var, pu0 pu0Var, f30 f30Var, int i2) {
        ov0 ov0Var;
        boolean z3 = z2;
        au0Var.getClass();
        pu0Var.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-667500947);
        int i3 = (ov0Var2.h(collectionRouteRecord) ? 4 : 2) | i2 | (ov0Var2.g(z3) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= ov0Var2.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY;
        }
        int i4 = i3 | (ov0Var2.h(pu0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        final int i5 = 0;
        final int i6 = 1;
        if (ov0Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
            Object[] objArr = {Long.valueOf(collectionRouteRecord.getId())};
            boolean zH = ov0Var2.h(collectionRouteRecord);
            Object objQ = ov0Var2.Q();
            c30 c30Var = d30.a;
            if (zH || objQ == c30Var) {
                objQ = new au0() { // from class: wy
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i7 = i5;
                        CollectionRouteRecord collectionRouteRecord2 = collectionRouteRecord;
                        switch (i7) {
                            case 0:
                                return ke0.H(collectionRouteRecord2.getName());
                            default:
                                return ke0.H(collectionRouteRecord2.getRemark());
                        }
                    }
                };
                ov0Var2.m0(objQ);
            }
            ey1 ey1Var = (ey1) wc0.c0(objArr, (au0) objQ, ov0Var2, 0);
            Object[] objArr2 = {Long.valueOf(collectionRouteRecord.getId())};
            boolean zH2 = ov0Var2.h(collectionRouteRecord);
            Object objQ2 = ov0Var2.Q();
            if (zH2 || objQ2 == c30Var) {
                objQ2 = new au0() { // from class: wy
                    @Override // defpackage.au0
                    public final Object invoke() {
                        int i7 = i6;
                        CollectionRouteRecord collectionRouteRecord2 = collectionRouteRecord;
                        switch (i7) {
                            case 0:
                                return ke0.H(collectionRouteRecord2.getName());
                            default:
                                return ke0.H(collectionRouteRecord2.getRemark());
                        }
                    }
                };
                ov0Var2.m0(objQ2);
            }
            ey1 ey1Var2 = (ey1) wc0.c0(objArr2, (au0) objQ2, ov0Var2, 0);
            dv1 dv1VarH = ji2.H(av1.a);
            int i7 = ((i4 & 112) == 32 ? 1 : 0) | ((i4 & 896) == 256 ? 1 : 0);
            Object objQ3 = ov0Var2.Q();
            if (i7 != 0 || objQ3 == c30Var) {
                objQ3 = new n5(z3, au0Var, 1);
                ov0Var2.m0(objQ3);
            }
            z3 = z2;
            ov0Var = ov0Var2;
            xq1.a((au0) objQ3, sb.a0(1428319525, new p2(5, pu0Var, ey1Var, ey1Var2, z2), ov0Var2), dv1VarH, sb.a0(80185955, new o5(z3, au0Var), ov0Var2), ym3.f, sb.a0(-1942014400, new l5(z3, ey1Var, ey1Var2, i6), ov0Var2), null, 0L, 0L, 0L, 0L, null, ov0Var, 1772592, 16272);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new xy(collectionRouteRecord, z3, au0Var, pu0Var, i2, 0);
        }
    }

    public static final void F(final String str, final SearchMode searchMode, final lu0 lu0Var, lu0 lu0Var2, au0 au0Var, final au0 au0Var2, final dv1 dv1Var, final vp0 vp0Var, final CloudGeoSource cloudGeoSource, f30 f30Var, final int i2) {
        lu0 lu0Var3;
        au0 au0Var3;
        ov0 ov0Var;
        c30 c30Var;
        av1 av1Var;
        boolean z2;
        dv1 dv1VarP;
        str.getClass();
        searchMode.getClass();
        lu0Var.getClass();
        lu0Var2.getClass();
        au0Var.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(915737223);
        int i3 = (ov0Var2.f(str) ? 4 : 2) | i2 | (ov0Var2.d(searchMode.ordinal()) ? 32 : 16);
        if ((i2 & 3072) == 0) {
            i3 |= ov0Var2.h(lu0Var2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i4 = i3 | (ov0Var2.h(au0Var) ? 16384 : 8192);
        if ((196608 & i2) == 0) {
            i4 |= ov0Var2.h(au0Var2) ? 131072 : 65536;
        }
        int i5 = i4 | (ov0Var2.f(dv1Var) ? 1048576 : 524288) | (ov0Var2.d(cloudGeoSource == null ? -1 : cloudGeoSource.ordinal()) ? 67108864 : 33554432);
        if (ov0Var2.T(i5 & 1, (38347795 & i5) != 38347794)) {
            dv1 dv1VarG = iw2.g(dv1Var, 52.0f);
            bj2 bj2VarA = cj2.a(26.0f);
            long j2 = hz.b;
            dv1 dv1VarO = hd0.O(dv1VarG, 6.0f, bj2VarA, hz.c(0.05f, j2), hz.c(0.1f, j2), 4);
            hh0 hh0Var = mz.a;
            dv1 dv1VarK = xp1.k(dv1VarO, ((kz) ov0Var2.j(hh0Var)).p, cj2.a(26.0f));
            pr prVar = j9.j;
            er1 er1VarC = ws.c(prVar, false);
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
            gh ghVar = v20.e;
            q73.h(ov0Var2, ghVar, er1VarC);
            gh ghVar2 = v20.d;
            q73.h(ov0Var2, ghVar2, l72VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            gh ghVar3 = v20.f;
            q73.h(ov0Var2, ghVar3, numValueOf);
            wa waVar = v20.g;
            q73.g(ov0Var2, waVar);
            gh ghVar4 = v20.c;
            q73.h(ov0Var2, ghVar4, dv1VarH);
            dv1 dv1VarG2 = zm3.G(iw2.c, 0.0f, 0.0f, 6.0f, 0.0f, 11);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var2, 48);
            int iHashCode2 = Long.hashCode(ov0Var2.T);
            l72 l72VarL2 = ov0Var2.l();
            dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarG2);
            ov0Var2.g0();
            if (ov0Var2.S) {
                ov0Var2.k(x30Var);
            } else {
                ov0Var2.p0();
            }
            q73.h(ov0Var2, ghVar, kk2VarA);
            q73.h(ov0Var2, ghVar2, l72VarL2);
            az2.s(iHashCode2, ov0Var2, ghVar3, ov0Var2, waVar);
            q73.h(ov0Var2, ghVar4, dv1VarH2);
            q93 q93Var = new q93(((kz) ov0Var2.j(hh0Var)).q, v63.c(15), jr0.h, 0L, 0L, 0, 0L, 16777208);
            n91 n91Var = new n91(0, 3, 119);
            int i6 = i5 & 57344;
            boolean z3 = i6 == 16384;
            Object objQ = ov0Var2.Q();
            int i7 = 13;
            c30 c30Var2 = d30.a;
            if (z3 || objQ == c30Var2) {
                objQ = new m4(i7, au0Var);
                ov0Var2.m0(objQ);
            }
            m91 m91Var = new m91(null, null, (lu0) objQ, 47);
            dv1 dv1VarG3 = zm3.G(iw2.c(new wb1(1.0f, true), 1.0f), 20.0f, 0.0f, 8.0f, 0.0f, 10);
            av1 av1Var2 = av1.a;
            dv1 dv1VarD = dv1VarG3.d((vp0Var == null || (dv1VarP = P(av1Var2, vp0Var)) == null) ? av1Var2 : dv1VarP);
            boolean z4 = (i5 & 458752) == 131072;
            Object objQ2 = ov0Var2.Q();
            if (z4 || objQ2 == c30Var2) {
                objQ2 = new m4(14, au0Var2);
                ov0Var2.m0(objQ2);
            }
            xq.a(str, lu0Var2, sb.X(dv1VarD, (lu0) objQ2), false, q93Var, n91Var, m91Var, true, 0, 0, null, null, null, null, sb.a0(-921471872, new zt(str, cloudGeoSource, searchMode, 5), ov0Var2), ov0Var2, (i5 & 14) | 102236160 | ((i5 >> 6) & 112), 196608, 32280);
            lu0Var3 = lu0Var2;
            ov0Var = ov0Var2;
            if (str.length() > 0) {
                ov0Var.c0(27239892);
                boolean z5 = (i5 & 7168) == 2048;
                Object objQ3 = ov0Var.Q();
                c30Var = c30Var2;
                if (z5 || objQ3 == c30Var) {
                    objQ3 = new hl1(13, lu0Var3);
                    ov0Var.m0(objQ3);
                }
                av1Var = av1Var2;
                xq1.l((au0) objQ3, iw2.k(av1Var, 36.0f), false, null, null, zm3.h, ov0Var, 1572912, 60);
                ov0Var = ov0Var;
                gh0.h(ov0Var, iw2.o(av1Var, 4.0f));
                z2 = false;
            } else {
                c30Var = c30Var2;
                av1Var = av1Var2;
                z2 = false;
                ov0Var.c0(20083077);
            }
            ov0Var.p(z2);
            dv1 dv1VarK2 = xp1.k(xp1.n(iw2.k(av1Var, 40.0f), cj2.a), bk.g, o51.p0);
            boolean z6 = i6 == 16384 ? true : z2;
            Object objQ4 = ov0Var.Q();
            if (z6 || objQ4 == c30Var) {
                au0Var3 = au0Var;
                objQ4 = new o6(20, au0Var3);
                ov0Var.m0(objQ4);
            } else {
                au0Var3 = au0Var;
            }
            dv1 dv1VarM = zm3.m(dv1VarK2, z2, null, (au0) objQ4, 15);
            er1 er1VarC2 = ws.c(prVar, z2);
            int iHashCode3 = Long.hashCode(ov0Var.T);
            l72 l72VarL3 = ov0Var.l();
            dv1 dv1VarH3 = xp1.H(ov0Var, dv1VarM);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC2);
            q73.h(ov0Var, ghVar2, l72VarL3);
            az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH3);
            t01.a(dh0.s(), ke0.N(2131624956, ov0Var), iw2.k(av1Var, 20.0f), hz.c, ov0Var, 3456, 0);
            ov0Var.p(true);
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            lu0Var3 = lu0Var2;
            au0Var3 = au0Var;
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final au0 au0Var4 = au0Var3;
            final lu0 lu0Var4 = lu0Var3;
            ee2VarT.d = new pu0() { // from class: qz2
                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ks.F(str, searchMode, lu0Var, lu0Var4, au0Var4, au0Var2, dv1Var, vp0Var, cloudGeoSource, (f30) obj, wc0.m0(i2 | 1));
                    return mf3.a;
                }
            };
        }
    }

    public static final void G(final AppState appState, final CloudAccountState cloudAccountState, final boolean z2, final og3 og3Var, final float f2, final au0 au0Var, final au0 au0Var2, final au0 au0Var3, final au0 au0Var4, final au0 au0Var5, final au0 au0Var6, final au0 au0Var7, final au0 au0Var8, final au0 au0Var9, final au0 au0Var10, final au0 au0Var11, f30 f30Var, final int i2) {
        ov0 ov0Var;
        Object next;
        appState.getClass();
        cloudAccountState.getClass();
        og3Var.getClass();
        au0Var.getClass();
        au0Var2.getClass();
        au0Var3.getClass();
        au0Var4.getClass();
        au0Var5.getClass();
        au0Var6.getClass();
        au0Var7.getClass();
        au0Var8.getClass();
        au0Var9.getClass();
        au0Var10.getClass();
        au0Var11.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(495080958);
        int i3 = i2 | (ov0Var2.h(appState) ? 4 : 2) | (ov0Var2.h(cloudAccountState) ? 32 : 16) | (ov0Var2.g(z2) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(og3Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var2.c(f2) ? 16384 : 8192) | (ov0Var2.h(au0Var) ? 131072 : 65536) | (ov0Var2.h(au0Var2) ? 1048576 : 524288) | (ov0Var2.h(au0Var3) ? 8388608 : 4194304) | (ov0Var2.h(au0Var4) ? 67108864 : 33554432) | (ov0Var2.h(au0Var5) ? 536870912 : 268435456);
        int i4 = (ov0Var2.h(au0Var6) ? (char) 4 : (char) 2) | (ov0Var2.h(au0Var7) ? ' ' : (char) 16) | (ov0Var2.h(au0Var8) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.h(au0Var9) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (ov0Var2.h(au0Var10) ? (char) 16384 : (char) 8192) | (ov0Var2.h(au0Var11) ? (char) 0 : (char) 0);
        if (ov0Var2.T(i3 & 1, ((i3 & 306783379) == 306783378 && (74899 & i4) == 74898) ? false : true)) {
            final boolean zW = n51.w(ov0Var2);
            final GithubRelease githubRelease = (GithubRelease) zy.o0(og3Var.c);
            final boolean z3 = githubRelease != null && mc0.y(githubRelease.getVersionName());
            Iterator it = ca1.a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((ba1) next).b.equals(appState.getCurrentLanguage()));
            ba1 ba1Var = (ba1) next;
            String strH = ba1Var != null ? ba1Var.c : null;
            if (strH == null) {
                strH = az2.h(ov0Var2, -968538937, 2131624376, ov0Var2, false);
            } else {
                ov0Var2.c0(-968541541);
                ov0Var2.p(false);
            }
            final String str = strH;
            dv1 dv1VarF = zm3.F(xp1.k(iw2.c, zW ? bk.a : bk.d, o51.p0), 16.0f, 0.0f, 2);
            b52 b52VarF = zm3.f(7, f2 + 24.0f);
            jo joVar = new jo(14.0f, true, new fo(0));
            boolean zH = ((i3 & 3670016) == 1048576) | ov0Var2.h(cloudAccountState) | ((i3 & 458752) == 131072) | ((i3 & 896) == 256) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864) | ((1879048192 & i3) == 536870912) | ((i4 & 14) == 4) | ov0Var2.f(str) | ((i4 & 458752) == 131072) | ov0Var2.g(zW) | ov0Var2.g(z3) | ov0Var2.h(githubRelease) | ((i4 & 112) == 32);
            Object objQ = ov0Var2.Q();
            if (zH || objQ == d30.a) {
                lu0 lu0Var = new lu0() { // from class: b82
                    @Override // defpackage.lu0
                    public final Object invoke(Object obj) {
                        kd1 kd1Var = (kd1) obj;
                        kd1Var.getClass();
                        kd1Var.a(null, null, ym3.j);
                        kd1Var.a(null, null, new p10(new x60(cloudAccountState, au0Var, z2, au0Var8, au0Var9, au0Var10), true, 1394295154));
                        kd1Var.a(null, null, new p10(new d82(au0Var3, au0Var4, au0Var5, au0Var6, au0Var2, str, 0), true, 1807201361));
                        kd1Var.a(null, null, new p10(new ak(5, au0Var11), true, -2074859728));
                        boolean z4 = zW;
                        kd1Var.a(null, null, new p10(new ym(z4, z3, githubRelease, au0Var7), true, -1661953521));
                        kd1Var.a(null, null, new p10(new z5(6, z4), true, -1249047314));
                        return mf3.a;
                    }
                };
                ov0Var = ov0Var2;
                ov0Var.m0(lu0Var);
                objQ = lu0Var;
            } else {
                ov0Var = ov0Var2;
            }
            ke0.d(dv1VarF, null, b52VarF, joVar, null, null, false, null, (lu0) objQ, ov0Var, 24576, 490);
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0(cloudAccountState, z2, og3Var, f2, au0Var, au0Var2, au0Var3, au0Var4, au0Var5, au0Var6, au0Var7, au0Var8, au0Var9, au0Var10, au0Var11, i2) { // from class: c82
                public final /* synthetic */ CloudAccountState f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ og3 h;
                public final /* synthetic */ float i;
                public final /* synthetic */ au0 j;
                public final /* synthetic */ au0 k;
                public final /* synthetic */ au0 l;
                public final /* synthetic */ au0 m;
                public final /* synthetic */ au0 n;
                public final /* synthetic */ au0 o;
                public final /* synthetic */ au0 p;
                public final /* synthetic */ au0 q;
                public final /* synthetic */ au0 r;
                public final /* synthetic */ au0 s;
                public final /* synthetic */ au0 t;

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(1);
                    ks.G(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (f30) obj, iM0);
                    return mf3.a;
                }
            };
        }
    }

    public static final void H(dv1 dv1Var, f30 f30Var, int i2) {
        dv1 dv1Var2;
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-69665345);
        int i3 = i2 | 6;
        if (ov0Var.T(i3 & 1, (i3 & 3) != 2)) {
            long j2 = bk.i;
            bj2 bj2VarA = cj2.a(8.0f);
            av1 av1Var = av1.a;
            dv1 dv1VarE = zm3.E(xp1.k(xp1.n(av1Var, bj2VarA), hz.c(0.15f, j2), o51.p0), 8.0f, 4.0f);
            er1 er1VarC = ws.c(j9.f, false);
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
            q73.h(ov0Var, v20.e, er1VarC);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            s83.b(ke0.N(2131624954, ov0Var), null, j2, v63.c(12), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
            ov0Var = ov0Var;
            ov0Var.p(true);
            dv1Var2 = av1Var;
        } else {
            ov0Var.W();
            dv1Var2 = dv1Var;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new l8(dv1Var2, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int I(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks.I(int, int, int, boolean):int");
    }

    public static final Bundle J(i52... i52VarArr) {
        Bundle bundle = new Bundle(i52VarArr.length);
        for (i52 i52Var : i52VarArr) {
            String str = (String) i52Var.e;
            Object obj = i52Var.f;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        fo.j("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    fo.j("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final boolean K(Object obj) {
        if (obj instanceof yx2) {
            yx2 yx2Var = (yx2) obj;
            if (yx2Var.d() == j9.W || yx2Var.d() == u92.q || yx2Var.d() == u92.h) {
                Object value = yx2Var.getValue();
                if (value == null) {
                    return true;
                }
                return K(value);
            }
        } else if (!(obj instanceof xu0) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (J[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void L(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        b81.e(i2, i3, ") is greater than size (", "toIndex (");
    }

    public static final int M(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final dv1 P(dv1 dv1Var, vp0 vp0Var) {
        return dv1Var.d(new wp0(vp0Var));
    }

    public static final int Q(jr0 jr0Var, int i2) {
        boolean z2 = o51.m(jr0Var.e, jr0.f.e) >= 0;
        boolean z3 = i2 == 1;
        if (z3 && z2) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        return z3 ? 2 : 0;
    }

    public static final x01 R() {
        x01 x01Var = O;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Rounded.CellTower", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = nh3.a;
        long j2 = hz.b;
        qy2 qy2Var = new qy2(j2);
        nx0 nx0Var = new nx0(3);
        nx0Var.m(7.9f, 14.1f);
        nx0Var.l(0.09f, -0.09f);
        nx0Var.g(0.27f, -0.27f, 0.32f, -0.71f, 0.08f, -1.01f);
        nx0Var.f(7.36f, 12.09f, 7.0f, 11.01f, 7.0f, 10.0f);
        nx0Var.g(0.0f, -1.08f, 0.35f, -2.16f, 1.04f, -3.01f);
        nx0Var.g(0.25f, -0.3f, 0.21f, -0.75f, -0.07f, -1.02f);
        nx0Var.k(7.9f, 5.9f);
        nx0Var.f(7.56f, 5.56f, 7.0f, 5.6f, 6.7f, 5.98f);
        nx0Var.f(5.79f, 7.16f, 5.3f, 8.58f, 5.3f, 10.0f);
        nx0Var.g(0.0f, 1.42f, 0.49f, 2.84f, 1.4f, 4.02f);
        nx0Var.f(7.0f, 14.4f, 7.56f, 14.44f, 7.9f, 14.1f);
        nx0Var.e();
        w01.a(w01Var, nx0Var.a, qy2Var);
        qy2 qy2Var2 = new qy2(j2);
        nx0 nx0Var2 = new nx0(3);
        nx0Var2.m(18.51f, 3.49f);
        nx0Var2.l(-0.08f, 0.08f);
        nx0Var2.g(-0.3f, 0.3f, -0.29f, 0.76f, -0.03f, 1.08f);
        nx0Var2.g(1.26f, 1.53f, 1.9f, 3.48f, 1.9f, 5.35f);
        nx0Var2.g(0.0f, 1.87f, -0.63f, 3.81f, -1.9f, 5.35f);
        nx0Var2.g(-0.28f, 0.33f, -0.23f, 0.83f, 0.08f, 1.14f);
        nx0Var2.s(0.0f);
        nx0Var2.g(0.35f, 0.35f, 0.93f, 0.31f, 1.24f, -0.07f);
        nx0Var2.f(21.29f, 14.54f, 22.0f, 12.31f, 22.0f, 10.0f);
        nx0Var2.g(0.0f, -2.32f, -0.79f, -4.55f, -2.31f, -6.43f);
        nx0Var2.f(19.39f, 3.2f, 18.84f, 3.16f, 18.51f, 3.49f);
        nx0Var2.e();
        w01.a(w01Var, nx0Var2.a, qy2Var2);
        qy2 qy2Var3 = new qy2(j2);
        nx0 nx0Var3 = new nx0(3);
        nx0Var3.m(5.57f, 3.57f);
        nx0Var3.k(5.49f, 3.49f);
        nx0Var3.f(5.16f, 3.16f, 4.61f, 3.2f, 4.31f, 3.57f);
        nx0Var3.f(2.79f, 5.45f, 2.0f, 7.68f, 2.0f, 10.0f);
        nx0Var3.g(0.0f, 2.32f, 0.79f, 4.55f, 2.31f, 6.43f);
        nx0Var3.g(0.3f, 0.37f, 0.85f, 0.42f, 1.18f, 0.08f);
        nx0Var3.l(0.08f, -0.08f);
        nx0Var3.g(0.3f, -0.3f, 0.29f, -0.76f, 0.03f, -1.08f);
        nx0Var3.f(4.33f, 13.81f, 3.7f, 11.87f, 3.7f, 10.0f);
        nx0Var3.g(0.0f, -1.87f, 0.63f, -3.81f, 1.9f, -5.35f);
        nx0Var3.f(5.86f, 4.33f, 5.87f, 3.87f, 5.57f, 3.57f);
        nx0Var3.e();
        w01.a(w01Var, nx0Var3.a, qy2Var3);
        qy2 qy2Var4 = new qy2(j2);
        nx0 nx0VarI = p91.i(16.07f, 14.07f);
        nx0VarI.g(0.36f, 0.36f, 0.95f, 0.32f, 1.26f, -0.09f);
        nx0VarI.g(0.9f, -1.18f, 1.37f, -2.58f, 1.37f, -3.98f);
        nx0VarI.g(-0.08f, -1.41f, -0.51f, -2.83f, -1.4f, -4.01f);
        nx0VarI.g(-0.29f, -0.39f, -0.86f, -0.43f, -1.2f, -0.09f);
        nx0VarI.l(-0.08f, 0.08f);
        nx0VarI.g(-0.27f, 0.27f, -0.32f, 0.71f, -0.08f, 1.01f);
        nx0VarI.f(16.64f, 7.91f, 17.0f, 8.99f, 17.0f, 10.0f);
        nx0VarI.g(0.0f, 1.07f, -0.34f, 2.13f, -1.01f, 2.98f);
        nx0VarI.f(15.73f, 13.3f, 15.77f, 13.77f, 16.07f, 14.07f);
        nx0VarI.k(16.07f, 14.07f);
        nx0VarI.e();
        w01.a(w01Var, nx0VarI.a, qy2Var4);
        qy2 qy2Var5 = new qy2(j2);
        nx0 nx0VarI2 = p91.i(14.5f, 10.0f);
        nx0VarI2.g(0.0f, -1.6f, -1.51f, -2.85f, -3.18f, -2.41f);
        nx0VarI2.g(-0.8f, 0.21f, -1.46f, 0.85f, -1.7f, 1.65f);
        nx0VarI2.g(-0.32f, 1.06f, 0.06f, 2.04f, 0.76f, 2.64f);
        nx0VarI2.l(-2.96f, 8.87f);
        nx0VarI2.f(7.21f, 21.37f, 7.67f, 22.0f, 8.32f, 22.0f);
        nx0VarI2.i(0.0f);
        nx0VarI2.g(0.41f, 0.0f, 0.77f, -0.26f, 0.9f, -0.65f);
        nx0VarI2.k(9.67f, 20.0f);
        nx0VarI2.i(4.67f);
        nx0VarI2.l(0.45f, 1.35f);
        nx0VarI2.g(0.13f, 0.39f, 0.49f, 0.65f, 0.9f, 0.65f);
        nx0VarI2.i(0.0f);
        nx0VarI2.g(0.65f, 0.0f, 1.1f, -0.63f, 0.9f, -1.25f);
        nx0VarI2.l(-2.96f, -8.87f);
        nx0VarI2.f(14.16f, 11.42f, 14.5f, 10.76f, 14.5f, 10.0f);
        nx0VarI2.e();
        nx0VarI2.m(10.33f, 18.0f);
        nx0VarI2.k(12.0f, 13.0f);
        nx0VarI2.l(1.67f, 5.0f);
        nx0VarI2.h(10.33f);
        nx0VarI2.e();
        w01.a(w01Var, nx0VarI2.a, qy2Var5);
        x01 x01VarB = w01Var.b();
        O = x01VarB;
        return x01VarB;
    }

    public static final y70 S(ii2 ii2Var, boolean z2, r60 r60Var) {
        vb3 vb3Var = (vb3) r60Var.getContext().get(vb3.f);
        y70 y70Var = vb3Var != null ? vb3Var.e : null;
        if (ii2Var.inCompatibilityMode()) {
            if (y70Var != null) {
                return ii2Var.getQueryContext().plus(y70Var);
            }
            return z2 ? ii2Var.getTransactionContext$room_runtime() : ii2Var.getQueryContext();
        }
        y70 queryContext = ii2Var.getQueryContext();
        if (y70Var == null) {
            y70Var = sj0.e;
        }
        return queryContext.plus(y70Var);
    }

    public static final int T(f30 f30Var) {
        f30Var.getClass();
        return Long.hashCode(((ov0) f30Var).T);
    }

    public static final long U(f30 f30Var) {
        return ((ov0) f30Var).T;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object V(q60 q60Var, lu0 lu0Var, ii2 ii2Var) {
        v80 v80Var;
        lu0 lu0Var2;
        if (q60Var instanceof v80) {
            v80Var = (v80) q60Var;
            int i2 = v80Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v80Var.h = i2 - Integer.MIN_VALUE;
            } else {
                v80Var = new v80(q60Var);
            }
        } else {
            v80Var = new v80(q60Var);
        }
        Object objS = v80Var.g;
        int i3 = v80Var.h;
        int i4 = 1;
        q60 q60Var2 = null;
        Object obj = z70.e;
        if (i3 == 0) {
            ee0.J(objS);
            int i5 = 0;
            if (ii2Var.inCompatibilityMode()) {
                y80 y80Var = new y80(i5, q60Var2, lu0Var, ii2Var);
                v80Var.h = 1;
                Object objY = ji2.Y(v80Var, y80Var, ii2Var);
                if (objY != obj) {
                    return objY;
                }
            } else if (ii2Var.inCompatibilityMode() && ii2Var.isOpenInternal$room_runtime() && ii2Var.inTransaction()) {
                x80 x80Var = new x80(i4, q60Var2, lu0Var, ii2Var);
                v80Var.h = 2;
                Object objUseConnection = ii2Var.useConnection(false, x80Var, v80Var);
                if (objUseConnection != obj) {
                    return objUseConnection;
                }
            } else {
                v80Var.e = ii2Var;
                v80Var.f = (k33) lu0Var;
                v80Var.h = 3;
                objS = S(ii2Var, true, v80Var);
                lu0Var2 = lu0Var;
                if (objS != obj) {
                }
            }
        }
        if (i3 == 1) {
            ee0.J(objS);
            return objS;
        }
        if (i3 == 2) {
            ee0.J(objS);
            return objS;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                ee0.J(objS);
                return objS;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lu0 lu0Var3 = (lu0) v80Var.f;
        ii2Var = v80Var.e;
        ee0.J(objS);
        lu0Var2 = lu0Var3;
        k kVar = new k((q60) null, lu0Var2, ii2Var);
        v80Var.e = null;
        v80Var.f = null;
        v80Var.h = 4;
        Object objWithContext = BuildersKt.withContext((y70) objS, kVar, v80Var);
        return objWithContext == obj ? obj : objWithContext;
    }

    public static final Job W(Context context, MapEngine mapEngine, String str, CoroutineScope coroutineScope, CloudGeoSource cloudGeoSource, lu0 lu0Var) {
        context.getClass();
        mapEngine.getClass();
        str.getClass();
        coroutineScope.getClass();
        cloudGeoSource.getClass();
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new yd(cloudGeoSource, mapEngine, str, lu0Var, context, (q60) null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object X(q60 q60Var, lu0 lu0Var, ii2 ii2Var, boolean z2, boolean z3) {
        a90 a90Var;
        boolean z4;
        lu0 lu0Var2;
        ii2 ii2Var2;
        boolean z5;
        if (q60Var instanceof a90) {
            a90Var = (a90) q60Var;
            int i2 = a90Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a90Var.j = i2 - Integer.MIN_VALUE;
            } else {
                a90Var = new a90(q60Var);
            }
        } else {
            a90Var = new a90(q60Var);
        }
        a90 a90Var2 = a90Var;
        Object obj = a90Var2.i;
        int i3 = a90Var2.j;
        z70 z70Var = z70.e;
        if (i3 == 0) {
            ee0.J(obj);
            if (ii2Var.inCompatibilityMode() && ii2Var.isOpenInternal$room_runtime() && ii2Var.inTransaction()) {
                b90 b90Var = new b90(null, lu0Var, ii2Var, z3, z2);
                a90Var2.j = 1;
                Object objUseConnection = ii2Var.useConnection(z2, b90Var, a90Var2);
                if (objUseConnection != z70Var) {
                    return objUseConnection;
                }
            } else {
                z4 = z3;
                a90Var2.e = ii2Var;
                a90Var2.f = lu0Var;
                a90Var2.g = z2;
                a90Var2.h = z4;
                a90Var2.j = 2;
                y70 y70VarS = S(ii2Var, z4, a90Var2);
                if (y70VarS != z70Var) {
                    lu0Var2 = lu0Var;
                    ii2Var2 = ii2Var;
                    obj = y70VarS;
                    z5 = z2;
                }
            }
        }
        if (i3 == 1) {
            ee0.J(obj);
            return obj;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                ee0.J(obj);
                return obj;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z4 = a90Var2.h;
        boolean z6 = a90Var2.g;
        lu0 lu0Var3 = a90Var2.f;
        ii2 ii2Var3 = a90Var2.e;
        ee0.J(obj);
        z5 = z6;
        lu0Var2 = lu0Var3;
        ii2Var2 = ii2Var3;
        z80 z80Var = new z80(null, lu0Var2, ii2Var2, z5, z4);
        a90Var2.e = null;
        a90Var2.f = null;
        a90Var2.j = 3;
        Object objWithContext = BuildersKt.withContext((y70) obj, z80Var, a90Var2);
        return objWithContext == z70Var ? z70Var : objWithContext;
    }

    public static final mv0 Y(f30 f30Var) {
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.Z(206, j30.e);
        if (ov0Var.S) {
            kx2.y(ov0Var.I);
        }
        Object objI = ov0Var.I();
        sv0 zg2Var = objI instanceof sv0 ? (sv0) objI : null;
        if (zg2Var == null) {
            zg2Var = new zg2(new lv0(new mv0(ov0Var, ov0Var.T, ov0Var.q, ov0Var.C, ov0Var.h.x)), -1);
            ov0Var.n0(zg2Var);
        }
        mv0 mv0Var = ((lv0) zg2Var.a).e;
        mv0Var.f.setValue(ov0Var.l());
        ov0Var.p(false);
        return mv0Var;
    }

    public static final Object Z(dq0 dq0Var, int i2, lu0 lu0Var) {
        int i3;
        int i4;
        Object objInvoke;
        cv1 cv1VarJ;
        gc1 gc1VarQ1;
        int i5;
        tz1 tz1Var;
        if (!dq0Var.e.r) {
            p21.c("visitAncestors called on an unattached node");
        }
        cv1 cv1Var = dq0Var.e.i;
        hb1 hb1VarO = xp1.O(dq0Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            objInvoke = null;
            if (hb1VarO == null) {
                cv1VarJ = null;
                break;
            }
            if ((hb1VarO.K.f.h & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                while (cv1Var != null) {
                    if ((cv1Var.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        cv1VarJ = cv1Var;
                        gy1 gy1Var = null;
                        while (cv1VarJ != null) {
                            if (cv1VarJ instanceof dq0) {
                                break loop0;
                            }
                            if ((cv1VarJ.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (cv1VarJ instanceof lb0)) {
                                int i6 = 0;
                                for (cv1 cv1Var2 = ((lb0) cv1VarJ).t; cv1Var2 != null; cv1Var2 = cv1Var2.j) {
                                    if ((cv1Var2.g & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            cv1VarJ = cv1Var2;
                                        } else {
                                            if (gy1Var == null) {
                                                gy1Var = new gy1(new cv1[16]);
                                            }
                                            if (cv1VarJ != null) {
                                                gy1Var.b(cv1VarJ);
                                                cv1VarJ = null;
                                            }
                                            gy1Var.b(cv1Var2);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            cv1VarJ = xp1.J(gy1Var);
                        }
                    }
                    cv1Var = cv1Var.i;
                }
            }
            hb1VarO = hb1VarO.u();
            cv1Var = (hb1VarO == null || (tz1Var = hb1VarO.K) == null) ? null : tz1Var.e;
        }
        dq0 dq0Var2 = (dq0) cv1VarJ;
        if ((dq0Var2 == null || !o51.f(dq0Var2.q1(), dq0Var.q1())) && (gc1VarQ1 = dq0Var.q1()) != null) {
            int i7 = 5;
            if (i2 != 5) {
                i7 = 6;
                if (i2 != 6) {
                    i7 = 3;
                    if (i2 != 3) {
                        i7 = 4;
                        if (i2 != 4) {
                            if (i2 == 1) {
                                i7 = 2;
                            } else if (i2 == 2) {
                                i7 = 1;
                            } else {
                                fo.n("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (gc1VarQ1.s.a.h().n <= 0 || gc1VarQ1.s.a.h().k.isEmpty() || !gc1VarQ1.r) {
                return lu0Var.invoke(gc1.v);
            }
            boolean zN1 = gc1VarQ1.n1(i7);
            hd1 hd1Var = gc1VarQ1.s;
            int iMin = zN1 ? Math.min(hd1Var.a.h().n - 1, ((rd1) zy.t0(hd1Var.a.h().k)).a) : Math.max(0, ((t52) hd1Var.a.e.b).g());
            we2 we2Var = new we2();
            dt dtVar = gc1VarQ1.t;
            dtVar.getClass();
            cc1 cc1Var = new cc1(iMin, iMin);
            dtVar.a.b(cc1Var);
            we2Var.e = cc1Var;
            yd1 yd1Var = gc1VarQ1.s.a;
            if (yd1Var.h().k.isEmpty()) {
                i4 = 0;
            } else {
                qd1 qd1VarH = yd1Var.h();
                int iG = (int) (qd1VarH.o == x32.e ? qd1VarH.g() & 4294967295L : qd1VarH.g() >> 32);
                int iO = ld0.O(yd1Var.h());
                if (iO != 0 && (i5 = iG / iO) >= 1) {
                    i4 = i5;
                }
            }
            int i8 = i4 * 2;
            int i9 = gc1VarQ1.s.a.h().n;
            if (i8 > i9) {
                i8 = i9;
            }
            while (objInvoke == null && gc1VarQ1.m1((cc1) we2Var.e, i7) && i3 < i8) {
                cc1 cc1Var2 = (cc1) we2Var.e;
                int i10 = cc1Var2.a;
                int i11 = cc1Var2.b;
                if (gc1VarQ1.n1(i7)) {
                    i11++;
                } else {
                    i10--;
                }
                dt dtVar2 = gc1VarQ1.t;
                dtVar2.getClass();
                cc1 cc1Var3 = new cc1(i10, i11);
                dtVar2.a.b(cc1Var3);
                gc1VarQ1.t.a.j((cc1) we2Var.e);
                we2Var.e = cc1Var3;
                i3++;
                xp1.O(gc1VarQ1).k();
                objInvoke = lu0Var.invoke(new fc1(gc1VarQ1, we2Var, i7));
            }
            gc1VarQ1.t.a.j((cc1) we2Var.e);
            xp1.O(gc1VarQ1).k();
            return objInvoke;
        }
        return null;
    }

    public static final dv1 a0(dv1 dv1Var, boolean z2, ix1 ix1Var, uh2 uh2Var, boolean z3, vh2 vh2Var, au0 au0Var) {
        dv1 dv1VarD;
        if (uh2Var != null) {
            dv1VarD = new pp2(z2, ix1Var, uh2Var, false, z3, vh2Var, au0Var);
        } else if (uh2Var == null) {
            dv1VarD = new pp2(z2, ix1Var, null, false, z3, vh2Var, au0Var);
        } else {
            av1 av1Var = av1.a;
            dv1VarD = ix1Var != null ? m11.a(av1Var, ix1Var, uh2Var).d(new pp2(z2, ix1Var, null, false, z3, vh2Var, au0Var)) : xp1.p(av1Var, new rp2(uh2Var, z2, z3, vh2Var, au0Var));
        }
        return dv1Var.d(dv1VarD);
    }

    public static dv1 b0(dv1 dv1Var, boolean z2, boolean z3, vh2 vh2Var, au0 au0Var) {
        return dv1Var.d(new pp2(z2, null, null, true, z3, vh2Var, au0Var));
    }

    public static final dv1 c0(boolean z2, ix1 ix1Var, boolean z3, vh2 vh2Var, lu0 lu0Var) {
        return au1.a.d(new ta3(z2, ix1Var, false, z3, vh2Var, lu0Var));
    }

    public static final dv1 d0(dv1 dv1Var, boolean z2, boolean z3, vh2 vh2Var, ix1 ix1Var, lu0 lu0Var) {
        return dv1Var.d(new ta3(z2, ix1Var, true, z3, vh2Var, lu0Var));
    }

    public static final void e0(String str, long j2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j2);
        }
    }

    public static final dv1 f0(xa3 xa3Var, uh2 uh2Var, boolean z2, vh2 vh2Var, au0 au0Var) {
        if (uh2Var != null) {
            return new wc3(xa3Var, null, uh2Var, z2, vh2Var, au0Var);
        }
        if (uh2Var == null) {
            return new wc3(xa3Var, null, null, z2, vh2Var, au0Var);
        }
        return xp1.p(av1.a, new ua3(uh2Var, xa3Var, z2, vh2Var, au0Var));
    }

    @Override // defpackage.ak0
    public void A(String str) {
        str.getClass();
        O(str);
    }

    public void N(bt2 bt2Var, int i2) {
        bt2Var.getClass();
    }

    public void O(Object obj) {
        throw new x31("Non-serializable " + xe2.a(obj.getClass()) + " is not supported by " + xe2.a(getClass()) + " encoder");
    }

    public void a(bt2 bt2Var) {
        bt2Var.getClass();
    }

    @Override // defpackage.ak0
    public m30 b(bt2 bt2Var) {
        bt2Var.getClass();
        return this;
    }

    @Override // defpackage.ak0
    public void c() {
        throw new x31("'null' is not supported by default");
    }

    @Override // defpackage.m30
    public void f(zb2 zb2Var, int i2, short s2) {
        N(zb2Var, i2);
        h(s2);
    }

    @Override // defpackage.ak0
    public void g(double d2) {
        O(Double.valueOf(d2));
    }

    @Override // defpackage.ak0
    public void h(short s2) {
        O(Short.valueOf(s2));
    }

    @Override // defpackage.m30
    public void i(int i2, int i3, bt2 bt2Var) {
        bt2Var.getClass();
        N(bt2Var, i2);
        q(i3);
    }

    @Override // defpackage.m30
    public void j(bt2 bt2Var, int i2, long j2) {
        bt2Var.getClass();
        N(bt2Var, i2);
        v(j2);
    }

    @Override // defpackage.ak0
    public void k(byte b2) {
        O(Byte.valueOf(b2));
    }

    @Override // defpackage.ak0
    public void l(boolean z2) {
        O(Boolean.valueOf(z2));
    }

    @Override // defpackage.ak0
    public ak0 m(bt2 bt2Var) {
        bt2Var.getClass();
        return this;
    }

    @Override // defpackage.m30
    public void n(bt2 bt2Var, int i2, String str) {
        bt2Var.getClass();
        str.getClass();
        N(bt2Var, i2);
        A(str);
    }

    @Override // defpackage.m30
    public void o(bt2 bt2Var, int i2, boolean z2) {
        bt2Var.getClass();
        N(bt2Var, i2);
        l(z2);
    }

    @Override // defpackage.m30
    public void p(zb2 zb2Var, int i2, char c2) {
        N(zb2Var, i2);
        x(c2);
    }

    @Override // defpackage.ak0
    public void q(int i2) {
        O(Integer.valueOf(i2));
    }

    @Override // defpackage.m30
    public void r(bt2 bt2Var, int i2, y81 y81Var, Object obj) {
        bt2Var.getClass();
        y81Var.getClass();
        N(bt2Var, i2);
        e(y81Var, obj);
    }

    @Override // defpackage.ak0
    public void s(float f2) {
        O(Float.valueOf(f2));
    }

    @Override // defpackage.m30
    public void t(bt2 bt2Var, int i2, double d2) {
        bt2Var.getClass();
        N(bt2Var, i2);
        g(d2);
    }

    public void u(bt2 bt2Var, int i2, y81 y81Var, Object obj) {
        bt2Var.getClass();
        y81Var.getClass();
        N(bt2Var, i2);
        if (y81Var.getDescriptor().g()) {
            e(y81Var, obj);
        } else if (obj == null) {
            c();
        } else {
            e(y81Var, obj);
        }
    }

    @Override // defpackage.ak0
    public void v(long j2) {
        O(Long.valueOf(j2));
    }

    @Override // defpackage.m30
    public void w(zb2 zb2Var, int i2, byte b2) {
        N(zb2Var, i2);
        k(b2);
    }

    @Override // defpackage.ak0
    public void x(char c2) {
        O(Character.valueOf(c2));
    }

    @Override // defpackage.m30
    public ak0 y(zb2 zb2Var, int i2) {
        N(zb2Var, i2);
        return m(zb2Var.i(i2));
    }

    @Override // defpackage.m30
    public void z(zb2 zb2Var, int i2, float f2) {
        N(zb2Var, i2);
        s(f2);
    }
}
