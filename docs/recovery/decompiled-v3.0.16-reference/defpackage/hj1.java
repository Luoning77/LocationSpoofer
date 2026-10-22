package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoSource;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.MapEngine;
import com.vincenthzr.locationspoofer.data.model.SavedLocation;
import com.vincenthzr.locationspoofer.data.model.SearchMode;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class hj1 {
    /* JADX WARN: Code duplicated, block: B:155:0x0458  */
    /* JADX WARN: Code duplicated, block: B:161:0x0477  */
    /* JADX WARN: Code duplicated, block: B:164:0x048b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0495  */
    /* JADX WARN: Code duplicated, block: B:168:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:169:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:175:0x04ba  */
    public static final void a(final ul1 ul1Var, final AppState appState, final lr2 lr2Var, final float f, lo1 lo1Var, final au0 au0Var, f30 f30Var, final int i) {
        lr2 lr2Var2;
        ov0 ov0Var;
        ul1 ul1Var2;
        final lo1 lo1Var2;
        lo1 lo1Var3;
        int i2;
        int i3;
        int i4;
        Object ii0Var;
        ny2 ny2Var;
        op0 op0Var;
        Context context;
        Object obj;
        float f2;
        ov0 ov0Var2;
        lo1 lo1Var4;
        c30 c30Var;
        boolean z;
        ov0 ov0Var3;
        ul1 ul1Var3;
        lu0 lu0Var;
        boolean z2;
        ov0 ov0Var4;
        int i5;
        boolean z3;
        c30 c30Var2;
        Object t4Var;
        ul1 ul1Var4;
        c30 c30Var3;
        boolean zH;
        Object objQ;
        boolean zH2;
        Object objQ2;
        Object objQ3;
        boolean z4;
        boolean z5;
        Object objQ4;
        ul1Var.getClass();
        appState.getClass();
        ov0 ov0Var5 = (ov0) f30Var;
        ov0Var5.e0(-1359692260);
        int i6 = i | (ov0Var5.h(ul1Var) ? 4 : 2) | (ov0Var5.h(appState) ? 32 : 16) | (ov0Var5.f(lr2Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var5.c(f) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | 8192 | (ov0Var5.h(au0Var) ? 131072 : 65536);
        if (ov0Var5.T(i6 & 1, (74899 & i6) != 74898)) {
            ov0Var5.Y();
            if ((i & 1) == 0 || ov0Var5.B()) {
                ov0Var5.d0(-1614864554);
                pj3 pj3VarA = qh1.a(ov0Var5);
                if (pj3VarA == null) {
                    fo.n("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                hj3 hj3VarG = ee0.G(xe2.a(lo1.class), pj3VarA.getViewModelStore(), x63.b(pj3VarA, ov0Var5), v91.a(ov0Var5));
                ov0Var5.p(false);
                lo1Var3 = (lo1) hj3VarG;
                i2 = i6 & (-57345);
            } else {
                ov0Var5.W();
                i2 = i6 & (-57345);
                lo1Var3 = lo1Var;
            }
            ov0Var5.q();
            Context context2 = (Context) ov0Var5.j(AndroidCompositionLocals_androidKt.b);
            w7 w7Var = new w7(3);
            boolean zH3 = ov0Var5.h(context2) | ov0Var5.h(ul1Var);
            Object objQ5 = ov0Var5.Q();
            c30 c30Var4 = d30.a;
            if (zH3 || objQ5 == c30Var4) {
                objQ5 = new m90(context2, ul1Var);
                ov0Var5.m0(objQ5);
            }
            final no1 no1VarB0 = sb.b0(w7Var, (lu0) objQ5, ov0Var5);
            op0 op0Var2 = (op0) ov0Var5.j(z30.i);
            ny2 ny2Var2 = (ny2) ov0Var5.j(z30.r);
            final ey1 ey1VarS = ee0.s(ul1Var.A, ov0Var5);
            final boolean zW = n51.w(ov0Var5);
            Object objQ6 = ov0Var5.Q();
            if (objQ6 == c30Var4) {
                objQ6 = oi0.j(ov0Var5);
                ov0Var5.m0(objQ6);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objQ6;
            Object objQ7 = ov0Var5.Q();
            if (objQ7 == c30Var4) {
                objQ7 = new vp0();
                ov0Var5.m0(objQ7);
            }
            final vp0 vp0Var = (vp0) objQ7;
            final boolean z6 = ((uz2) ey1VarS.getValue()).e;
            boolean zH4 = ov0Var5.h(ul1Var);
            Object objQ8 = ov0Var5.Q();
            if (zH4 || objQ8 == c30Var4) {
                objQ8 = new qi1(ul1Var, 0);
                ov0Var5.m0(objQ8);
            }
            lu0 lu0Var2 = (lu0) objQ8;
            Object objQ9 = ov0Var5.Q();
            pe2 pe2Var = pe2.e;
            if (objQ9 == c30Var4) {
                objQ9 = ke0.H(pe2Var);
                ov0Var5.m0(objQ9);
            }
            final ey1 ey1Var = (ey1) objQ9;
            Object objQ10 = ov0Var5.Q();
            if (objQ10 == c30Var4) {
                objQ10 = ke0.H(pe2Var);
                ov0Var5.m0(objQ10);
            }
            final ey1 ey1Var2 = (ey1) objQ10;
            Object objQ11 = ov0Var5.Q();
            if (objQ11 == c30Var4) {
                objQ11 = ke0.H(Boolean.FALSE);
                ov0Var5.m0(objQ11);
            }
            final ey1 ey1Var3 = (ey1) objQ11;
            Object objQ12 = ov0Var5.Q();
            if (objQ12 == c30Var4) {
                objQ12 = ke0.H(null);
                ov0Var5.m0(objQ12);
            }
            ey1 ey1Var4 = (ey1) objQ12;
            CloudGeoSource geoSearchSource = appState.getGeoSearchSource();
            lo1 lo1Var5 = lo1Var3;
            MapEngine mapEngine = appState.getMapEngine();
            SearchMode searchMode = appState.getSearchMode();
            boolean zF = ov0Var5.f(lu0Var2);
            Object objQ13 = ov0Var5.Q();
            if (zF || objQ13 == c30Var4) {
                objQ13 = new bj1(lu0Var2, ey1Var4, null);
                ov0Var5.m0(objQ13);
            }
            oi0.g(geoSearchSource, mapEngine, searchMode, (pu0) objQ13, ov0Var5);
            Object objQ14 = ov0Var5.Q();
            if (objQ14 == c30Var4) {
                objQ14 = new di0(ey1Var4, 19);
                ov0Var5.m0(objQ14);
            }
            oi0.a(mf3.a, (lu0) objQ14, ov0Var5);
            Object objQ15 = ov0Var5.Q();
            if (objQ15 == c30Var4) {
                i3 = 0;
                objQ15 = new t52(0);
                ov0Var5.m0(objQ15);
            } else {
                i3 = 0;
            }
            final t52 t52Var = (t52) objQ15;
            Object objQ16 = ov0Var5.Q();
            if (objQ16 == c30Var4) {
                objQ16 = new t52(i3);
                ov0Var5.m0(objQ16);
            }
            final t52 t52Var2 = (t52) objQ16;
            xb0 xb0Var = (xb0) ov0Var5.j(z30.h);
            float fU0 = t52Var.g() > 0 ? xb0Var.U0(t52Var.g()) : 180.0f;
            final float fU1 = t52Var2.g() > 0 ? xb0Var.U0(t52Var2.g()) : 210.0f;
            Object objQ17 = ov0Var5.Q();
            if (objQ17 == c30Var4) {
                objQ17 = ke0.H(appState.isSpoofingActive() ? mi1.e : mi1.f);
                ov0Var5.m0(objQ17);
            }
            final ey1 ey1Var5 = (ey1) objQ17;
            Boolean boolValueOf = Boolean.valueOf(appState.isSpoofingActive());
            boolean zH5 = ov0Var5.h(appState);
            Object objQ18 = ov0Var5.Q();
            if (zH5 || objQ18 == c30Var4) {
                i4 = 0;
                objQ18 = new cj1(appState, ey1Var5, null, 0);
                ov0Var5.m0(objQ18);
            } else {
                i4 = 0;
            }
            oi0.e(ov0Var5, (pu0) objQ18, boolValueOf);
            w7 w7Var2 = new w7(i4);
            boolean zH6 = ov0Var5.h(ul1Var) | ov0Var5.h(context2);
            Object objQ19 = ov0Var5.Q();
            if (zH6 || objQ19 == c30Var4) {
                objQ19 = new m90(ul1Var, context2, 2);
                ov0Var5.m0(objQ19);
            }
            no1 no1VarB1 = sb.b0(w7Var2, (lu0) objQ19, ov0Var5);
            boolean zH7 = ov0Var5.h(op0Var2) | ov0Var5.f(ny2Var2) | ov0Var5.f(ey1VarS) | ov0Var5.f(lu0Var2) | ov0Var5.h(appState) | ov0Var5.h(coroutineScope) | ov0Var5.h(ul1Var) | ov0Var5.h(context2);
            Object objQ20 = ov0Var5.Q();
            if (zH7 || objQ20 == c30Var4) {
                ny2Var = ny2Var2;
                op0Var = op0Var2;
                context = context2;
                ii0Var = new ii0(op0Var, ny2Var, lu0Var2, appState, coroutineScope, ul1Var, context, ey1Var4, ey1VarS);
                lu0Var2 = lu0Var2;
                ov0Var5.m0(ii0Var);
            } else {
                context = context2;
                ny2Var = ny2Var2;
                ii0Var = objQ20;
                op0Var = op0Var2;
            }
            final au0 au0Var2 = (au0) ii0Var;
            Boolean boolValueOf2 = Boolean.valueOf(z6);
            boolean zG = ov0Var5.g(z6) | ov0Var5.f(ny2Var);
            Object objQ21 = ov0Var5.Q();
            if (zG || objQ21 == c30Var4) {
                objQ21 = new mn(2, null, vp0Var, ny2Var, z6);
                obj = null;
                ov0Var5.m0(objQ21);
            } else {
                obj = null;
            }
            oi0.e(ov0Var5, (pu0) objQ21, boolValueOf2);
            boolean zH8 = ov0Var5.h(op0Var) | ov0Var5.f(ny2Var) | ov0Var5.f(lu0Var2);
            Object objQ22 = ov0Var5.Q();
            if (zH8 || objQ22 == c30Var4) {
                objQ22 = new a6(op0Var, ny2Var, lu0Var2, 11);
                ov0Var5.m0(objQ22);
            }
            xq1.g(z6, (au0) objQ22, ov0Var5, i4, i4);
            int iOrdinal = ((mi1) ey1Var5.getValue()).ordinal();
            if (iOrdinal == 0) {
                f2 = f + 74.0f;
            } else {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    b81.d();
                    return;
                }
                f2 = f + fU1 + 82.0f;
            }
            td0 td0Var = (td0) qh.a(f2, o51.D(1.0f, 400.0f, obj, 4), "location_fab_bottom_padding", ov0Var5, 432, 8).getValue();
            float f3 = td0Var.e;
            td0 td0Var2 = new td0(0.0f);
            if (td0Var.compareTo(td0Var2) < 0) {
                td0Var = td0Var2;
            }
            final float f4 = td0Var.e;
            int i7 = i2;
            final Context context3 = context;
            final lu0 lu0Var3 = lu0Var2;
            final float f5 = fU0;
            zu2.a(null, sb.a0(-1288826150, new qu0() { // from class: ri1
                @Override // defpackage.qu0
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    final wu2 wu2Var = (wu2) obj2;
                    f30 f30Var2 = (f30) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    wu2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((ov0) f30Var2).f(wu2Var) ? 4 : 2;
                    }
                    ov0 ov0Var6 = (ov0) f30Var2;
                    if (ov0Var6.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                        Boolean boolValueOf3 = Boolean.valueOf(z6);
                        Object objQ23 = ov0Var6.Q();
                        if (objQ23 == d30.a) {
                            objQ23 = new zs0(28);
                            ov0Var6.m0(objQ23);
                        }
                        lu0 lu0Var4 = (lu0) objQ23;
                        final ey1 ey1Var6 = ey1Var;
                        final float f6 = f4;
                        final AppState appState2 = appState;
                        final boolean z7 = zW;
                        final ul1 ul1Var5 = ul1Var;
                        final float f7 = f;
                        final float f8 = f5;
                        final float f9 = fU1;
                        final lu0 lu0Var5 = lu0Var3;
                        final lr2 lr2Var3 = lr2Var;
                        final Context context4 = context3;
                        final no1 no1Var = no1VarB0;
                        final ey1 ey1Var7 = ey1Var3;
                        final ey1 ey1Var8 = ey1Var5;
                        final t52 t52Var3 = t52Var;
                        final t52 t52Var4 = t52Var2;
                        final au0 au0Var3 = au0Var2;
                        final vp0 vp0Var2 = vp0Var;
                        final ey1 ey1Var9 = ey1VarS;
                        final ey1 ey1Var10 = ey1Var2;
                        ji2.n(boolValueOf3, null, lu0Var4, null, "location_search_transition", null, sb.a0(1498753821, new ru0() { // from class: ti1
                            @Override // defpackage.ru0
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                boolean z8;
                                boolean z9;
                                boolean z10;
                                boolean z11;
                                ul1 ul1Var6;
                                yh yhVar = (yh) obj5;
                                boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                                f30 f30Var3 = (f30) obj7;
                                ((Integer) obj8).getClass();
                                yhVar.getClass();
                                uu2 uu2VarB = wu2.b("location_search_bar", f30Var3);
                                ov0 ov0Var7 = (ov0) f30Var3;
                                Object objQ24 = ov0Var7.Q();
                                c30 c30Var5 = d30.a;
                                if (objQ24 == c30Var5) {
                                    objQ24 = new ui1(0);
                                    ov0Var7.m0(objQ24);
                                }
                                dv1 dv1VarD = wu2.d(wu2Var, uu2VarB, yhVar, (ui1) objQ24);
                                Object objQ25 = ov0Var7.Q();
                                ey1 ey1Var11 = ey1Var6;
                                if (objQ25 == c30Var5) {
                                    objQ25 = new di0(ey1Var11, 20);
                                    ov0Var7.m0(objQ25);
                                }
                                dv1 dv1VarG = k22.G(dv1VarD, (lu0) objQ25);
                                fn0 fn0Var = iw2.c;
                                er1 er1VarC = ws.c(j9.f, false);
                                int iHashCode = Long.hashCode(ov0Var7.T);
                                l72 l72VarL = ov0Var7.l();
                                dv1 dv1VarH = xp1.H(ov0Var7, fn0Var);
                                w20.b.getClass();
                                x30 x30Var = v20.b;
                                ov0Var7.g0();
                                if (ov0Var7.S) {
                                    ov0Var7.k(x30Var);
                                } else {
                                    ov0Var7.p0();
                                }
                                gh ghVar = v20.e;
                                q73.h(ov0Var7, ghVar, er1VarC);
                                gh ghVar2 = v20.d;
                                q73.h(ov0Var7, ghVar2, l72VarL);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                gh ghVar3 = v20.f;
                                q73.h(ov0Var7, ghVar3, numValueOf);
                                wa waVar = v20.g;
                                q73.g(ov0Var7, waVar);
                                gh ghVar4 = v20.c;
                                q73.h(ov0Var7, ghVar4, dv1VarH);
                                pr prVar = j9.n;
                                av1 av1Var = av1.a;
                                dv1 dv1VarG2 = zm3.G(k22.k(av1Var, prVar), 0.0f, 0.0f, 16.0f, f6, 3);
                                yz yzVarA = wz.a(new jo(10.0f, true, new fo(0)), j9.t, ov0Var7, 54);
                                int iHashCode2 = Long.hashCode(ov0Var7.T);
                                l72 l72VarL2 = ov0Var7.l();
                                dv1 dv1VarH2 = xp1.H(ov0Var7, dv1VarG2);
                                ov0Var7.g0();
                                if (ov0Var7.S) {
                                    ov0Var7.k(x30Var);
                                } else {
                                    ov0Var7.p0();
                                }
                                q73.h(ov0Var7, ghVar, yzVarA);
                                q73.h(ov0Var7, ghVar2, l72VarL2);
                                az2.s(iHashCode2, ov0Var7, ghVar3, ov0Var7, waVar);
                                q73.h(ov0Var7, ghVar4, dv1VarH2);
                                x01 x01VarJ = mh0.J();
                                String strN = ke0.N(2131624682, ov0Var7);
                                lr2 lr2Var4 = lr2Var3;
                                boolean zH9 = ov0Var7.h(lr2Var4);
                                Object objQ26 = ov0Var7.Q();
                                if (zH9 || objQ26 == c30Var5) {
                                    objQ26 = new xi1(lr2Var4, 0);
                                    ov0Var7.m0(objQ26);
                                }
                                hd0.h(x01VarJ, (au0) objQ26, strN, null, ov0Var7, 0, 8);
                                x01 x01VarY = hd0.y();
                                String strN2 = ke0.N(2131624462, ov0Var7);
                                AppState appState3 = appState2;
                                boolean fixedJoystickEnabled = appState3.getFixedJoystickEnabled();
                                boolean zH10 = ov0Var7.h(appState3);
                                Context context5 = context4;
                                boolean zH11 = zH10 | ov0Var7.h(context5);
                                no1 no1Var2 = no1Var;
                                boolean zH12 = zH11 | ov0Var7.h(no1Var2);
                                ul1 ul1Var7 = ul1Var5;
                                boolean zH13 = zH12 | ov0Var7.h(ul1Var7);
                                Object objQ27 = ov0Var7.Q();
                                if (zH13 || objQ27 == c30Var5) {
                                    objQ27 = new q2(appState3, context5, no1Var2, ul1Var7);
                                    ov0Var7.m0(objQ27);
                                }
                                hd0.h(x01VarY, (au0) objQ27, strN2, Boolean.valueOf(fixedJoystickEnabled), ov0Var7, 0, 0);
                                x01 x01VarY2 = vd0.y();
                                boolean zH14 = ov0Var7.h(ul1Var7) | ov0Var7.h(context5) | ov0Var7.h(lr2Var4);
                                Object objQ28 = ov0Var7.Q();
                                if (zH14 || objQ28 == c30Var5) {
                                    objQ28 = new yi1(0, ul1Var7, lr2Var4, context5);
                                    ov0Var7.m0(objQ28);
                                }
                                hd0.h(x01VarY2, (au0) objQ28, null, null, ov0Var7, 0, 12);
                                x01 x01VarC = ke0.C();
                                lu0 lu0Var6 = lu0Var5;
                                boolean zF2 = ov0Var7.f(lu0Var6);
                                Object objQ29 = ov0Var7.Q();
                                if (zF2 || objQ29 == c30Var5) {
                                    objQ29 = new vi1(6, lu0Var6);
                                    ov0Var7.m0(objQ29);
                                }
                                hd0.h(x01VarC, (au0) objQ29, null, null, ov0Var7, 0, 12);
                                x01 x01VarY3 = ld0.y();
                                Object objQ30 = ov0Var7.Q();
                                if (objQ30 == c30Var5) {
                                    objQ30 = new mo0(ey1Var7, 6);
                                    ov0Var7.m0(objQ30);
                                }
                                hd0.h(x01VarY3, (au0) objQ30, null, null, ov0Var7, 48, 12);
                                ov0Var7.p(true);
                                dv1 dv1VarK = k22.k(av1Var, j9.m);
                                ey1 ey1Var12 = ey1Var8;
                                mi1 mi1Var = (mi1) ey1Var12.getValue();
                                Object objQ31 = ov0Var7.Q();
                                if (objQ31 == c30Var5) {
                                    objQ31 = new di0(ey1Var12, 21);
                                    ov0Var7.m0(objQ31);
                                }
                                lu0 lu0Var7 = (lu0) objQ31;
                                Object objQ32 = ov0Var7.Q();
                                if (objQ32 == c30Var5) {
                                    objQ32 = new zi1(t52Var3, 0);
                                    ov0Var7.m0(objQ32);
                                }
                                lu0 lu0Var8 = (lu0) objQ32;
                                Object objQ33 = ov0Var7.Q();
                                if (objQ33 == c30Var5) {
                                    objQ33 = new zi1(t52Var4, 1);
                                    ov0Var7.m0(objQ33);
                                }
                                lu0 lu0Var9 = (lu0) objQ33;
                                boolean zF3 = ov0Var7.f(lu0Var6);
                                Object objQ34 = ov0Var7.Q();
                                if (zF3 || objQ34 == c30Var5) {
                                    z8 = false;
                                    objQ34 = new vi1(0, lu0Var6);
                                    ov0Var7.m0(objQ34);
                                } else {
                                    z8 = false;
                                }
                                au0 au0Var4 = (au0) objQ34;
                                boolean zF4 = ov0Var7.f(lu0Var6);
                                Object objQ35 = ov0Var7.Q();
                                if (zF4 || objQ35 == c30Var5) {
                                    objQ35 = new vi1(1, lu0Var6);
                                    ov0Var7.m0(objQ35);
                                }
                                au0 au0Var5 = (au0) objQ35;
                                boolean zF5 = ov0Var7.f(lu0Var6);
                                Object objQ36 = ov0Var7.Q();
                                if (zF5 || objQ36 == c30Var5) {
                                    objQ36 = new vi1(2, lu0Var6);
                                    ov0Var7.m0(objQ36);
                                }
                                au0 au0Var6 = (au0) objQ36;
                                boolean zH15 = ov0Var7.h(ul1Var7);
                                Object objQ37 = ov0Var7.Q();
                                if (zH15 || objQ37 == c30Var5) {
                                    objQ37 = new m6(ul1Var7, 5);
                                    ov0Var7.m0(objQ37);
                                }
                                au0 au0Var7 = (au0) objQ37;
                                boolean zH16 = ov0Var7.h(ul1Var7) | ov0Var7.h(lr2Var4) | ov0Var7.h(context5);
                                Object objQ38 = ov0Var7.Q();
                                if (zH16 || objQ38 == c30Var5) {
                                    objQ38 = new si1(1, ul1Var7, lr2Var4, context5);
                                    ov0Var7.m0(objQ38);
                                }
                                lu0 lu0Var10 = (lu0) objQ38;
                                boolean zH17 = ov0Var7.h(ul1Var7);
                                Object objQ39 = ov0Var7.Q();
                                if (zH17 || objQ39 == c30Var5) {
                                    objQ39 = new qi1(ul1Var7, 1);
                                    ov0Var7.m0(objQ39);
                                }
                                lu0 lu0Var11 = (lu0) objQ39;
                                boolean zF6 = ov0Var7.f(lu0Var6);
                                Object objQ40 = ov0Var7.Q();
                                if (zF6 || objQ40 == c30Var5) {
                                    objQ40 = new vi1(3, lu0Var6);
                                    ov0Var7.m0(objQ40);
                                }
                                au0 au0Var8 = (au0) objQ40;
                                au0 au0Var9 = au0Var3;
                                vp0 vp0Var3 = vp0Var2;
                                ey1 ey1Var13 = ey1Var9;
                                hd0.g(dv1VarK, appState3, z7, mi1Var, lu0Var7, ul1Var7, f7, f8, f9, lu0Var8, lu0Var9, au0Var4, au0Var5, au0Var6, au0Var7, lu0Var10, lu0Var11, au0Var8, sb.a0(-891070120, new wi1(zBooleanValue, appState3, ul1Var7, dv1VarG, lu0Var6, au0Var9, vp0Var3, ey1Var13), ov0Var7), ov0Var7, 805330944);
                                ov0 ov0Var8 = ov0Var7;
                                ey1 ey1Var14 = ey1Var10;
                                if (zBooleanValue && ((uz2) ey1Var13.getValue()).h) {
                                    ov0Var8.c0(-853211548);
                                    pe2 pe2Var2 = (pe2) ey1Var11.getValue();
                                    pe2 pe2Var3 = (pe2) ey1Var14.getValue();
                                    boolean zF7 = ov0Var8.f(lu0Var6);
                                    Object objQ41 = ov0Var8.Q();
                                    if (zF7 || objQ41 == c30Var5) {
                                        objQ41 = new di1(lu0Var6, ey1Var11, ey1Var14);
                                        ov0Var8.m0(objQ41);
                                    }
                                    dv1 dv1VarB = m33.b(fn0Var, pe2Var2, pe2Var3, (PointerInputEventHandler) objQ41);
                                    z9 = false;
                                    ws.a(dv1VarB, ov0Var8, 0);
                                } else {
                                    z9 = false;
                                    ov0Var8.c0(-871534005);
                                }
                                ov0Var8.p(z9);
                                if (zBooleanValue) {
                                    ov0Var8.c0(-852038136);
                                    dv1 dv1VarG3 = zm3.G(ji2.U(iw2.e(av1Var, 1.0f)), 0.0f, 8.0f, 0.0f, 0.0f, 13);
                                    yz yzVarA2 = wz.a(am1.g, j9.r, ov0Var8, 0);
                                    int iHashCode3 = Long.hashCode(ov0Var8.T);
                                    l72 l72VarL3 = ov0Var8.l();
                                    dv1 dv1VarH3 = xp1.H(ov0Var8, dv1VarG3);
                                    ov0Var8.g0();
                                    if (ov0Var8.S) {
                                        ov0Var8.k(x30Var);
                                    } else {
                                        ov0Var8.p0();
                                    }
                                    q73.h(ov0Var8, ghVar, yzVarA2);
                                    q73.h(ov0Var8, ghVar2, l72VarL3);
                                    az2.s(iHashCode3, ov0Var8, ghVar3, ov0Var8, waVar);
                                    q73.h(ov0Var8, ghVar4, dv1VarH3);
                                    String str = ((uz2) ey1Var13.getValue()).f;
                                    SearchMode searchMode2 = appState3.getSearchMode();
                                    CloudGeoSource geoSearchSource2 = appState3.getGeoSearchSource();
                                    boolean zH18 = ov0Var8.h(ul1Var7);
                                    Object objQ42 = ov0Var8.Q();
                                    if (zH18 || objQ42 == c30Var5) {
                                        ul1Var6 = ul1Var7;
                                        objQ42 = new l(1, ul1Var6, hn1.class, "setSearchMode", "setSearchMode(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Lcom/vincenthzr/locationspoofer/data/model/SearchMode;)V", 1, 7);
                                        ov0Var8.m0(objQ42);
                                    } else {
                                        ul1Var6 = ul1Var7;
                                    }
                                    dv1 dv1VarF = zm3.F(iw2.e(dv1VarG, 1.0f), 14.0f, 0.0f, 2);
                                    lu0 lu0Var12 = (lu0) ((o81) objQ42);
                                    boolean zF8 = ov0Var8.f(lu0Var6);
                                    Object objQ43 = ov0Var8.Q();
                                    if (zF8 || objQ43 == c30Var5) {
                                        objQ43 = new am0(4, lu0Var6);
                                        ov0Var8.m0(objQ43);
                                    }
                                    lu0 lu0Var13 = (lu0) objQ43;
                                    boolean zF9 = ov0Var8.f(lu0Var6);
                                    Object objQ44 = ov0Var8.Q();
                                    if (zF9 || objQ44 == c30Var5) {
                                        objQ44 = new vi1(4, lu0Var6);
                                        ov0Var8.m0(objQ44);
                                    }
                                    ks.F(str, searchMode2, lu0Var12, lu0Var13, au0Var9, (au0) objQ44, dv1VarF, vp0Var3, geoSearchSource2, ov0Var8, 12582912);
                                    da0.e(((uz2) ey1Var13.getValue()).h && !((uz2) ey1Var13.getValue()).g.isEmpty(), null, kk0.d(o51.I(160, 6, null), 2).a(kk0.c(o51.I(220, 6, null), 14)), kk0.e(o51.I(120, 6, null), 2).a(kk0.h(o51.I(160, 6, null), 14)), null, sb.a0(-428145737, new b3(ey1Var14, ey1Var13, ul1Var6, lr2Var4, lu0Var6), ov0Var8), ov0Var8, 1600518);
                                    ov0Var8 = ov0Var8;
                                    z11 = true;
                                    ov0Var8.p(true);
                                    z10 = false;
                                } else {
                                    z10 = false;
                                    z11 = true;
                                    ov0Var8.c0(-871534005);
                                }
                                ov0Var8.p(z10);
                                ov0Var8.p(z11);
                                return mf3.a;
                            }
                        }, ov0Var6), ov0Var6, 1597824);
                    } else {
                        ov0Var6.W();
                    }
                    return mf3.a;
                }
            }, ov0Var5), ov0Var5, 48);
            if (((Boolean) ey1Var3.getValue()).booleanValue()) {
                ov0Var5.c0(-735846536);
                ey1 ey1VarS2 = ee0.s(lo1Var5.d, ov0Var5);
                List list = ((fo1) ey1VarS2.getValue()).a;
                List list2 = ((fo1) ey1VarS2.getValue()).b;
                boolean z7 = ((fo1) ey1VarS2.getValue()).c;
                List<SavedLocation> savedLocations = appState.getSavedLocations();
                boolean zH9 = ((i7 & 896) == 256) | ov0Var5.h(ul1Var) | ov0Var5.h(context3);
                Object objQ23 = ov0Var5.Q();
                if (zH9) {
                    c30Var3 = c30Var4;
                } else {
                    c30Var3 = c30Var4;
                    if (objQ23 == c30Var3) {
                    }
                    lu0 lu0Var4 = (lu0) objQ23;
                    zH = ov0Var5.h(ul1Var) | ov0Var5.h(context3);
                    objQ = ov0Var5.Q();
                    if (zH || objQ == c30Var3) {
                        objQ = new m90(ul1Var, context3, 3);
                        ov0Var5.m0(objQ);
                    }
                    lu0 lu0Var5 = (lu0) objQ;
                    zH2 = ov0Var5.h(no1VarB1);
                    lo1Var4 = lo1Var5;
                    objQ2 = ov0Var5.Q();
                    if (zH2 || objQ2 == c30Var3) {
                        objQ2 = new d5(no1VarB1, 3);
                        ov0Var5.m0(objQ2);
                    }
                    au0 au0Var3 = (au0) objQ2;
                    objQ3 = ov0Var5.Q();
                    if (objQ3 == c30Var3) {
                        objQ3 = new mo0(ey1Var3, 5);
                        ov0Var5.m0(objQ3);
                    }
                    au0 au0Var4 = (au0) objQ3;
                    boolean zH10 = ov0Var5.h(ul1Var);
                    if ((i7 & 458752) == 131072) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zH10 | z4;
                    objQ4 = ov0Var5.Q();
                    if (z5 || objQ4 == c30Var3) {
                        objQ4 = new ji1(ul1Var, au0Var, ey1Var3, 12);
                        ov0Var5.m0(objQ4);
                    }
                    c30Var = c30Var3;
                    ov0Var2 = ov0Var5;
                    z = false;
                    mc0.d(list, z7, savedLocations, lu0Var4, lu0Var5, au0Var3, au0Var4, list2, (lu0) objQ4, ov0Var2, 1572864);
                }
                objQ23 = new si1(0, ul1Var, lr2Var, context3);
                ov0Var5.m0(objQ23);
                lu0 lu0Var6 = (lu0) objQ23;
                zH = ov0Var5.h(ul1Var) | ov0Var5.h(context3);
                objQ = ov0Var5.Q();
                if (zH) {
                    objQ = new m90(ul1Var, context3, 3);
                    ov0Var5.m0(objQ);
                } else {
                    objQ = new m90(ul1Var, context3, 3);
                    ov0Var5.m0(objQ);
                }
                lu0 lu0Var7 = (lu0) objQ;
                zH2 = ov0Var5.h(no1VarB1);
                lo1Var4 = lo1Var5;
                objQ2 = ov0Var5.Q();
                if (zH2) {
                    objQ2 = new d5(no1VarB1, 3);
                    ov0Var5.m0(objQ2);
                } else {
                    objQ2 = new d5(no1VarB1, 3);
                    ov0Var5.m0(objQ2);
                }
                au0 au0Var5 = (au0) objQ2;
                objQ3 = ov0Var5.Q();
                if (objQ3 == c30Var3) {
                    objQ3 = new mo0(ey1Var3, 5);
                    ov0Var5.m0(objQ3);
                }
                au0 au0Var6 = (au0) objQ3;
                boolean zH11 = ov0Var5.h(ul1Var);
                if ((i7 & 458752) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zH11 | z4;
                objQ4 = ov0Var5.Q();
                if (z5) {
                    objQ4 = new ji1(ul1Var, au0Var, ey1Var3, 12);
                    ov0Var5.m0(objQ4);
                } else {
                    objQ4 = new ji1(ul1Var, au0Var, ey1Var3, 12);
                    ov0Var5.m0(objQ4);
                }
                c30Var = c30Var3;
                ov0Var2 = ov0Var5;
                z = false;
                mc0.d(list, z7, savedLocations, lu0Var6, lu0Var7, au0Var5, au0Var6, list2, (lu0) objQ4, ov0Var2, 1572864);
            } else {
                ov0Var2 = ov0Var5;
                lo1Var4 = lo1Var5;
                c30Var = c30Var4;
                z = false;
                ov0Var2.c0(-760988218);
            }
            ov0Var2.p(z);
            if (((uz2) ey1VarS.getValue()).b) {
                ov0Var2.c0(-733360801);
                List<SavedLocation> savedLocations2 = appState.getSavedLocations();
                boolean zF2 = ov0Var2.f(lu0Var3);
                Object objQ24 = ov0Var2.Q();
                if (zF2 || objQ24 == c30Var) {
                    objQ24 = new vi1(5, lu0Var3);
                    ov0Var2.m0(objQ24);
                }
                au0 au0Var7 = (au0) objQ24;
                boolean zH12 = ov0Var2.h(ul1Var) | ((i7 & 896) != 256 ? z : true) | ov0Var2.f(lu0Var3) | ov0Var2.h(context3);
                Object objQ25 = ov0Var2.Q();
                if (zH12 || objQ25 == c30Var) {
                    lh lhVar = new lh(ul1Var, lr2Var, lu0Var3, context3, 9);
                    ul1Var3 = ul1Var;
                    lu0Var = lu0Var3;
                    ov0Var2.m0(lhVar);
                    objQ25 = lhVar;
                } else {
                    ul1Var3 = ul1Var;
                    lu0Var = lu0Var3;
                }
                lu0 lu0Var8 = (lu0) objQ25;
                boolean zH13 = ov0Var2.h(ul1Var3);
                Object objQ26 = ov0Var2.Q();
                if (zH13 || objQ26 == c30Var) {
                    l lVar = new l(1, ul1Var3, an1.class, "removeSavedLocation", "removeSavedLocation(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Lcom/vincenthzr/locationspoofer/data/model/SavedLocation;)V", 1, 2);
                    ov0Var2.m0(lVar);
                    objQ26 = lVar;
                }
                ov0Var3 = ov0Var2;
                dh0.c(savedLocations2, au0Var7, lu0Var8, (lu0) ((o81) objQ26), ov0Var3, 0);
            } else {
                ov0Var3 = ov0Var2;
                ul1Var3 = ul1Var;
                lu0Var = lu0Var3;
                ov0Var3.c0(-760988218);
            }
            ov0Var3.p(z);
            if (((uz2) ey1VarS.getValue()).a) {
                ov0Var3.c0(-732623807);
                String strN = ke0.N(2131624940, ov0Var3);
                boolean zH14 = ov0Var3.h(ul1Var3) | ov0Var3.f(lu0Var);
                Object objQ27 = ov0Var3.Q();
                if (zH14 || objQ27 == c30Var) {
                    objQ27 = new j(29, ul1Var3, lu0Var);
                    ov0Var3.m0(objQ27);
                }
                lu0 lu0Var9 = (lu0) objQ27;
                boolean zF3 = ov0Var3.f(lu0Var);
                Object objQ28 = ov0Var3.Q();
                if (zF3 || objQ28 == c30Var) {
                    objQ28 = new vi1(8, lu0Var);
                    ov0Var3.m0(objQ28);
                }
                vd0.c(strN, zW, lu0Var9, (au0) objQ28, ov0Var3, 0);
                z2 = zW;
                ov0Var4 = ov0Var3;
                ov0Var4.p(z);
                i5 = -760988218;
            } else {
                z2 = r14;
                ov0Var4 = ov0Var3;
                i5 = -760988218;
                ov0Var4.c0(-760988218);
                ov0Var4.p(z);
            }
            if (((uz2) ey1VarS.getValue()).d) {
                ov0Var4.c0(-732172881);
                boolean zF4 = ov0Var4.f(lu0Var);
                Object objQ29 = ov0Var4.Q();
                if (zF4 || objQ29 == c30Var) {
                    objQ29 = new vi1(9, lu0Var);
                    ov0Var4.m0(objQ29);
                }
                au0 au0Var8 = (au0) objQ29;
                boolean zH15 = ov0Var4.h(ul1Var3) | ov0Var4.f(lu0Var);
                Object objQ30 = ov0Var4.Q();
                if (zH15 || objQ30 == c30Var) {
                    objQ30 = new m5(20, ul1Var3, lu0Var);
                    ov0Var4.m0(objQ30);
                }
                au0 au0Var9 = (au0) objQ30;
                boolean zH16 = ov0Var4.h(ul1Var3);
                Object objQ31 = ov0Var4.Q();
                if (zH16 || objQ31 == c30Var) {
                    ul1Var4 = ul1Var;
                    t4Var = new t4(0, ul1Var4, on1.class, "toggleMockWifi", "toggleMockWifi(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 22);
                    ov0Var4.m0(t4Var);
                } else {
                    t4Var = objQ31;
                    ul1Var4 = ul1Var3;
                }
                au0 au0Var10 = (au0) ((o81) t4Var);
                boolean zH17 = ov0Var4.h(ul1Var4);
                Object objQ32 = ov0Var4.Q();
                if (zH17 || objQ32 == c30Var) {
                    t4 t4Var2 = new t4(0, ul1Var4, on1.class, "toggleMockCell", "toggleMockCell(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 23);
                    ov0Var4.m0(t4Var2);
                    objQ32 = t4Var2;
                }
                au0 au0Var11 = (au0) ((o81) objQ32);
                boolean zH18 = ov0Var4.h(ul1Var4);
                Object objQ33 = ov0Var4.Q();
                if (zH18 || objQ33 == c30Var) {
                    t4 t4Var3 = new t4(0, ul1Var4, on1.class, "toggleMockBluetooth", "toggleMockBluetooth(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 24);
                    ov0Var4.m0(t4Var3);
                    objQ33 = t4Var3;
                }
                au0 au0Var12 = (au0) ((o81) objQ33);
                boolean zH19 = ov0Var4.h(ul1Var4);
                Object objQ34 = ov0Var4.Q();
                if (zH19 || objQ34 == c30Var) {
                    t4 t4Var4 = new t4(0, ul1Var4, on1.class, "toggleEnableJitter", "toggleEnableJitter(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 25);
                    ov0Var4.m0(t4Var4);
                    objQ34 = t4Var4;
                }
                au0 au0Var13 = (au0) ((o81) objQ34);
                boolean zH20 = ov0Var4.h(ul1Var4);
                Object objQ35 = ov0Var4.Q();
                if (zH20 || objQ35 == c30Var) {
                    t4 t4Var5 = new t4(0, ul1Var4, on1.class, "toggleRestartAppsOnSpoof", "toggleRestartAppsOnSpoof(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 26);
                    ov0Var4.m0(t4Var5);
                    objQ35 = t4Var5;
                }
                au0 au0Var14 = (au0) ((o81) objQ35);
                boolean zH21 = ov0Var4.h(ul1Var4);
                Object objQ36 = ov0Var4.Q();
                if (zH21 || objQ36 == c30Var) {
                    l lVar2 = new l(1, ul1Var4, hn1.class, "setAltitude", "setAltitude(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Ljava/lang/String;)V", 1, 3);
                    ov0Var4.m0(lVar2);
                    objQ36 = lVar2;
                }
                lu0 lu0Var10 = (lu0) ((o81) objQ36);
                boolean zH22 = ov0Var4.h(ul1Var4);
                Object objQ37 = ov0Var4.Q();
                if (zH22 || objQ37 == c30Var) {
                    l lVar3 = new l(1, ul1Var4, hn1.class, "setAltitudeVariation", "setAltitudeVariation(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;I)V", 1, 4);
                    ov0Var4.m0(lVar3);
                    objQ37 = lVar3;
                }
                lu0 lu0Var11 = (lu0) ((o81) objQ37);
                boolean zH23 = ov0Var4.h(ul1Var4);
                Object objQ38 = ov0Var4.Q();
                if (zH23 || objQ38 == c30Var) {
                    l lVar4 = new l(1, ul1Var4, hn1.class, "setSatelliteCount", "setSatelliteCount(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Ljava/lang/String;)V", 1, 5);
                    ov0Var4.m0(lVar4);
                    objQ38 = lVar4;
                }
                ov0 ov0Var6 = ov0Var4;
                z3 = z2;
                dh0.f(appState, z3, au0Var8, au0Var9, au0Var10, au0Var11, au0Var12, au0Var13, au0Var14, lu0Var10, lu0Var11, (lu0) ((o81) objQ38), ov0Var6, (i7 >> 3) & 14);
                ov0Var = ov0Var6;
            } else {
                z3 = z2;
                ov0Var = ov0Var4;
                ov0Var.c0(i5);
            }
            ov0Var.p(z);
            if (((uz2) ey1VarS.getValue()).c) {
                ov0Var.c0(-731280515);
                String latitudeInput = appState.getLatitudeInput();
                boolean z8 = z3;
                String longitudeInput = appState.getLongitudeInput();
                boolean zF5 = ov0Var.f(lu0Var);
                Object objQ39 = ov0Var.Q();
                if (zF5 || objQ39 == c30Var2) {
                    c30Var2 = c30Var;
                    objQ39 = new vi1(10, lu0Var);
                    ov0Var.m0(objQ39);
                }
                au0 au0Var15 = (au0) objQ39;
                ul1Var2 = ul1Var;
                boolean zH24 = ov0Var.h(ul1Var2) | ((i7 & 896) != 256 ? z : true) | ov0Var.f(lu0Var);
                Object objQ40 = ov0Var.Q();
                if (zH24 || objQ40 == c30Var2) {
                    lr2Var2 = lr2Var;
                    objQ40 = new f5(ul1Var2, lu0Var, lr2Var2, 5);
                    ov0Var.m0(objQ40);
                } else {
                    lr2Var2 = lr2Var;
                }
                pu0 pu0Var = (pu0) objQ40;
                ov0 ov0Var7 = ov0Var;
                sb.E(latitudeInput, longitudeInput, z8, au0Var15, pu0Var, ov0Var7, 0);
                ov0Var = ov0Var7;
            } else {
                ul1Var2 = ul1Var;
                lr2Var2 = lr2Var;
                ov0Var.c0(-760988218);
            }
            ov0Var.p(z);
            lo1Var2 = lo1Var4;
        } else {
            lr2Var2 = lr2Var;
            ov0Var = ov0Var5;
            ul1Var2 = ul1Var;
            ov0Var.W();
            lo1Var2 = lo1Var;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            final ul1 ul1Var5 = ul1Var2;
            final lr2 lr2Var3 = lr2Var2;
            ee2VarT.d = new pu0(appState, lr2Var3, f, lo1Var2, au0Var, i) { // from class: pi1
                public final /* synthetic */ AppState f;
                public final /* synthetic */ lr2 g;
                public final /* synthetic */ float h;
                public final /* synthetic */ lo1 i;
                public final /* synthetic */ au0 j;

                @Override // defpackage.pu0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM0 = wc0.m0(1);
                    hj1.a(this.e, this.f, this.g, this.h, this.i, this.j, (f30) obj2, iM0);
                    return mf3.a;
                }
            };
        }
    }
}
