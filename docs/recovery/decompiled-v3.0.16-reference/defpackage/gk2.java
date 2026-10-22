package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.CloudGeoSource;
import com.vincenthzr.locationspoofer.data.model.AppMapType;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.MapEngine;
import com.vincenthzr.locationspoofer.data.model.RoutePlanStage;
import com.vincenthzr.locationspoofer.data.model.RoutePoint;
import com.vincenthzr.locationspoofer.data.model.RouteRunMode;
import com.vincenthzr.locationspoofer.data.model.SearchMode;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class gk2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ul1 ul1Var, final AppState appState, final lr2 lr2Var, final float f, lo1 lo1Var, f30 f30Var, final int i) {
        ov0 ov0Var;
        final lo1 lo1Var2;
        lo1 lo1Var3;
        int i2;
        boolean z;
        Object n2Var;
        ey1 ey1Var;
        int i3;
        ny2 ny2Var;
        op0 op0Var;
        ey1 ey1Var2;
        AppState appState2;
        final vp0 vp0Var;
        final op0 op0Var2;
        final ny2 ny2Var2;
        ey1 ey1Var3;
        lr2 lr2Var2;
        int i4;
        Context context;
        List<RoutePoint> list;
        AppState appState3;
        ey1 ey1Var4;
        lr2 lr2Var3;
        List<RoutePoint> list2;
        int i5;
        c30 c30Var;
        boolean z2;
        c30 c30Var2;
        Object lVar;
        ul1Var.getClass();
        appState.getClass();
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.e0(-594648490);
        int i6 = i | (ov0Var2.h(ul1Var) ? 4 : 2) | (ov0Var2.h(appState) ? 32 : 16) | (ov0Var2.f(lr2Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY) | (ov0Var2.c(f) ? 16384 : 8192) | 65536;
        if (ov0Var2.T(i6 & 1, (74899 & i6) != 74898)) {
            ov0Var2.Y();
            if ((i & 1) == 0 || ov0Var2.B()) {
                ov0Var2.d0(-1614864554);
                pj3 pj3VarA = qh1.a(ov0Var2);
                if (pj3VarA == null) {
                    fo.n("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                hj3 hj3VarG = ee0.G(xe2.a(lo1.class), pj3VarA.getViewModelStore(), x63.b(pj3VarA, ov0Var2), v91.a(ov0Var2));
                ov0Var2.p(false);
                lo1Var3 = (lo1) hj3VarG;
                i2 = i6 & (-458753);
            } else {
                ov0Var2.W();
                i2 = i6 & (-458753);
                lo1Var3 = lo1Var;
            }
            ov0Var2.q();
            ey1 ey1VarS = ee0.s(ul1Var.v, ov0Var2);
            Context context2 = (Context) ov0Var2.j(AndroidCompositionLocals_androidKt.b);
            Object objQ = ov0Var2.Q();
            c30 c30Var3 = d30.a;
            if (objQ == c30Var3) {
                objQ = ke0.H(Boolean.FALSE);
                ov0Var2.m0(objQ);
            }
            final ey1 ey1Var5 = (ey1) objQ;
            Object objQ2 = ov0Var2.Q();
            if (objQ2 == c30Var3) {
                objQ2 = ke0.H(Boolean.FALSE);
                ov0Var2.m0(objQ2);
            }
            final ey1 ey1Var6 = (ey1) objQ2;
            Object objQ3 = ov0Var2.Q();
            if (objQ3 == c30Var3) {
                objQ3 = ke0.H(Boolean.FALSE);
                ov0Var2.m0(objQ3);
            }
            final ey1 ey1Var7 = (ey1) objQ3;
            Object objQ4 = ov0Var2.Q();
            if (objQ4 == c30Var3) {
                objQ4 = ke0.H("");
                ov0Var2.m0(objQ4);
            }
            ey1 ey1Var8 = (ey1) objQ4;
            Object objQ5 = ov0Var2.Q();
            if (objQ5 == c30Var3) {
                objQ5 = ke0.H(uj0.e);
                ov0Var2.m0(objQ5);
            }
            ey1 ey1Var9 = (ey1) objQ5;
            Object objQ6 = ov0Var2.Q();
            if (objQ6 == c30Var3) {
                objQ6 = ke0.H(Boolean.FALSE);
                ov0Var2.m0(objQ6);
            }
            ey1 ey1Var10 = (ey1) objQ6;
            Object objQ7 = ov0Var2.Q();
            if (objQ7 == c30Var3) {
                objQ7 = ke0.H(Boolean.FALSE);
                ov0Var2.m0(objQ7);
            }
            final ey1 ey1Var11 = (ey1) objQ7;
            Object objQ8 = ov0Var2.Q();
            pe2 pe2Var = pe2.e;
            if (objQ8 == c30Var3) {
                objQ8 = ke0.H(pe2Var);
                ov0Var2.m0(objQ8);
            }
            final ey1 ey1Var12 = (ey1) objQ8;
            Object objQ9 = ov0Var2.Q();
            if (objQ9 == c30Var3) {
                objQ9 = ke0.H(pe2Var);
                ov0Var2.m0(objQ9);
            }
            final ey1 ey1Var13 = (ey1) objQ9;
            op0 op0Var3 = (op0) ov0Var2.j(z30.i);
            int i7 = i2;
            ny2 ny2Var3 = (ny2) ov0Var2.j(z30.r);
            Object objQ10 = ov0Var2.Q();
            if (objQ10 == c30Var3) {
                objQ10 = oi0.j(ov0Var2);
                ov0Var2.m0(objQ10);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objQ10;
            lo1 lo1Var4 = lo1Var3;
            Object objQ11 = ov0Var2.Q();
            if (objQ11 == c30Var3) {
                objQ11 = new vp0();
                ov0Var2.m0(objQ11);
            }
            vp0 vp0Var2 = (vp0) objQ11;
            Object objQ12 = ov0Var2.Q();
            if (objQ12 == c30Var3) {
                objQ12 = new t52(0);
                ov0Var2.m0(objQ12);
            }
            final t52 t52Var = (t52) objQ12;
            final RoutePlanStage routePlanStage = appState.getRoutePlanStage();
            boolean z3 = routePlanStage == RoutePlanStage.RUNNING;
            boolean z4 = appState.getRouteRunMode() == RouteRunMode.MANUAL;
            List<RoutePoint> routePoints = appState.getRoutePoints();
            Object objQ13 = ov0Var2.Q();
            if (objQ13 == c30Var3) {
                objQ13 = ke0.H(null);
                ov0Var2.m0(objQ13);
            }
            ey1 ey1Var14 = (ey1) objQ13;
            CloudGeoSource geoSearchSource = appState.getGeoSearchSource();
            MapEngine mapEngine = appState.getMapEngine();
            SearchMode searchMode = appState.getSearchMode();
            Object objQ14 = ov0Var2.Q();
            if (objQ14 == c30Var3) {
                z = false;
                objQ14 = new bk2(ey1Var14, ey1Var9, ey1Var10, null);
                ov0Var2.m0(objQ14);
            } else {
                z = false;
            }
            oi0.g(geoSearchSource, mapEngine, searchMode, (pu0) objQ14, ov0Var2);
            Object objQ15 = ov0Var2.Q();
            if (objQ15 == c30Var3) {
                objQ15 = new vu1(ey1Var14, 8);
                ov0Var2.m0(objQ15);
            }
            oi0.a(mf3.a, (lu0) objQ15, ov0Var2);
            boolean zH = ov0Var2.h(op0Var3) | ov0Var2.f(ny2Var3) | ov0Var2.h(appState) | ov0Var2.h(coroutineScope) | ov0Var2.h(ul1Var) | ov0Var2.h(context2) | ov0Var2.g(true);
            Object objQ16 = ov0Var2.Q();
            if (zH || objQ16 == c30Var3) {
                ey1Var = ey1Var8;
                i3 = 0;
                ny2Var = ny2Var3;
                op0Var = op0Var3;
                n2Var = new n2(op0Var, ny2Var, appState, coroutineScope, context2, ey1Var14, ul1Var, ey1Var9, ey1Var10, ey1Var);
                context2 = context2;
                ey1Var2 = ey1Var9;
                ey1Var10 = ey1Var10;
                appState2 = appState;
                ov0Var2.m0(n2Var);
            } else {
                ny2Var = ny2Var3;
                op0Var = op0Var3;
                ey1Var2 = ey1Var9;
                ey1Var = ey1Var8;
                appState2 = appState;
                n2Var = objQ16;
                i3 = 0;
            }
            final au0 au0Var = (au0) n2Var;
            Boolean bool = (Boolean) ey1Var11.getValue();
            bool.getClass();
            boolean zF = ov0Var2.f(ny2Var);
            Object objQ17 = ov0Var2.Q();
            if (zF || objQ17 == c30Var3) {
                objQ17 = new s3(vp0Var2, ny2Var, ey1Var11, z, 3);
                vp0Var = vp0Var2;
                ov0Var2.m0(objQ17);
            } else {
                vp0Var = vp0Var2;
            }
            oi0.e(ov0Var2, (pu0) objQ17, bool);
            boolean z5 = (((Boolean) ey1Var11.getValue()).booleanValue() || ((Boolean) ey1Var10.getValue()).booleanValue()) ? 1 : i3;
            boolean zH2 = ov0Var2.h(op0Var) | ov0Var2.f(ny2Var);
            Object objQ18 = ov0Var2.Q();
            if (zH2 || objQ18 == c30Var3) {
                op0Var2 = op0Var;
                ny2Var2 = ny2Var;
                ey1Var3 = ey1Var10;
                objQ18 = new q2((Object) op0Var2, (Object) ny2Var2, ey1Var11, ey1Var3, 11);
                ov0Var2.m0(objQ18);
            } else {
                op0Var2 = op0Var;
                ny2Var2 = ny2Var;
                ey1Var3 = ey1Var10;
            }
            xq1.g(z5, (au0) objQ18, ov0Var2, i3, i3);
            xb0 xb0Var = (xb0) ov0Var2.j(z30.h);
            final float fU0 = xb0Var.U0(t52Var.g());
            AppMapType mapType = appState2.getMapType();
            int i8 = i7 & 896;
            int i9 = (i8 != 256 ? i3 : 1) | (ov0Var2.h(appState2) ? 1 : 0);
            Object objQ19 = ov0Var2.Q();
            int i10 = 14;
            if (i9 != 0 || objQ19 == c30Var3) {
                lr2Var2 = lr2Var;
                objQ19 = new l80(lr2Var2, appState2, z, i10);
                ov0Var2.m0(objQ19);
            } else {
                lr2Var2 = lr2Var;
            }
            int i11 = i7 >> 3;
            oi0.g(lr2Var2, mapType, true, (pu0) objQ19, ov0Var2);
            List list3 = ((fo1) ee0.s(lo1Var4.d, ov0Var2).getValue()).a;
            Object objQ20 = ov0Var2.Q();
            if (objQ20 == c30Var3) {
                objQ20 = ke0.H(z);
                ov0Var2.m0(objQ20);
            }
            ey1 ey1Var15 = (ey1) objQ20;
            Object[] objArr = {routePoints, lr2Var2, list3, true, (List) ey1VarS.getValue(), appState2.getSelectedCollectionRouteId()};
            boolean zF2 = (i8 == 256) | ov0Var2.f(ey1VarS) | ov0Var2.h(appState2) | ov0Var2.h(list3) | ov0Var2.h(routePoints) | ov0Var2.h(context2);
            Object objQ21 = ov0Var2.Q();
            if (zF2 || objQ21 == c30Var3) {
                i4 = i8;
                context = context2;
                AppState appState4 = appState2;
                objQ21 = new ck2(lr2Var, list3, routePoints, appState4, context, ey1VarS, ey1Var15, null);
                list = routePoints;
                appState3 = appState4;
                ey1Var4 = ey1Var15;
                ov0Var2.m0(objQ21);
            } else {
                appState3 = appState2;
                ey1Var4 = ey1Var15;
                context = context2;
                i4 = i8;
                list = routePoints;
            }
            oi0.h(objArr, (pu0) objQ21, ov0Var2);
            Double dR = r13.R(appState3.getLatitudeInput());
            Double dR2 = r13.R(appState3.getLongitudeInput());
            Object[] objArr2 = {dR, dR2, Boolean.valueOf(appState3.isSpoofingActive()), appState3.getRoutePlanStage()};
            boolean zH3 = ov0Var2.h(appState3) | ov0Var2.f(dR) | ov0Var2.f(dR2) | (i4 == 256) | ov0Var2.h(context);
            Object objQ22 = ov0Var2.Q();
            if (zH3 || objQ22 == c30Var3) {
                a4 a4Var = new a4(appState3, dR, dR2, lr2Var, context, ey1Var4, (q60) null);
                lr2Var3 = lr2Var;
                ov0Var2.m0(a4Var);
                objQ22 = a4Var;
            } else {
                lr2Var3 = lr2Var;
            }
            oi0.h(objArr2, (pu0) objQ22, ov0Var2);
            Object[] objArr3 = {appState3.getRoutePlanStage(), list, true, lr2Var3, appState3.getSelectedCollectionRouteId()};
            int i12 = i7 & 57344;
            boolean zH4 = ov0Var2.h(appState3) | ov0Var2.h(list) | ov0Var2.f(r5) | ov0Var2.c(fU0) | (i12 == 16384) | (i4 == 256);
            Object objQ23 = ov0Var2.Q();
            if (zH4 || objQ23 == c30Var3) {
                lr2 lr2Var4 = lr2Var3;
                list2 = list;
                dk2 dk2Var = new dk2(appState3, list2, xb0Var, fU0, f, lr2Var4, null);
                ov0Var2.m0(dk2Var);
                objQ23 = dk2Var;
            } else {
                list2 = list;
            }
            oi0.h(objArr3, (pu0) objQ23, ov0Var2);
            final ey1 ey1Var16 = ey1Var;
            final List<RoutePoint> list4 = list2;
            final ey1 ey1Var17 = ey1Var3;
            final boolean z6 = z3;
            final boolean z7 = z4;
            final Context context3 = context;
            int i13 = i4;
            final ey1 ey1Var18 = ey1Var2;
            q60 q60Var = null;
            zu2.a(null, sb.a0(-1525721836, new qu0() { // from class: zj2
                @Override // defpackage.qu0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final wu2 wu2Var = (wu2) obj;
                    f30 f30Var2 = (f30) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    wu2Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((ov0) f30Var2).f(wu2Var) ? 4 : 2;
                    }
                    ov0 ov0Var3 = (ov0) f30Var2;
                    if (ov0Var3.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final ey1 ey1Var19 = ey1Var11;
                        Boolean bool2 = (Boolean) ey1Var19.getValue();
                        bool2.getClass();
                        Object objQ24 = ov0Var3.Q();
                        if (objQ24 == d30.a) {
                            objQ24 = new yk1(24);
                            ov0Var3.m0(objQ24);
                        }
                        lu0 lu0Var = (lu0) objQ24;
                        final ey1 ey1Var20 = ey1Var12;
                        final RoutePlanStage routePlanStage2 = routePlanStage;
                        final boolean z8 = z6;
                        final boolean z9 = z7;
                        final List list5 = list4;
                        final float f2 = f;
                        final float f3 = fU0;
                        final AppState appState5 = appState;
                        final lr2 lr2Var5 = lr2Var;
                        final ul1 ul1Var2 = ul1Var;
                        final ey1 ey1Var21 = ey1Var17;
                        final ey1 ey1Var22 = ey1Var13;
                        final Context context4 = context3;
                        final ey1 ey1Var23 = ey1Var7;
                        final t52 t52Var2 = t52Var;
                        final ey1 ey1Var24 = ey1Var6;
                        final ey1 ey1Var25 = ey1Var5;
                        final au0 au0Var2 = au0Var;
                        final vp0 vp0Var3 = vp0Var;
                        final ey1 ey1Var26 = ey1Var16;
                        final ey1 ey1Var27 = ey1Var18;
                        final op0 op0Var4 = op0Var2;
                        final ny2 ny2Var4 = ny2Var2;
                        ji2.n(bool2, null, lu0Var, null, "route_search_transition", null, sb.a0(361259095, new ru0() { // from class: wj2
                            /* JADX WARN: Code duplicated, block: B:120:0x055c  */
                            /* JADX WARN: Code duplicated, block: B:123:0x0570  */
                            /* JADX WARN: Code duplicated, block: B:124:0x057b  */
                            /* JADX WARN: Code duplicated, block: B:130:0x05ae  */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r0v1 */
                            /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r0v4 */
                            /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r3v53 */
                            /* JADX WARN: Type inference failed for: r3v54 */
                            @Override // defpackage.ru0
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                int i14;
                                wa waVar;
                                gh ghVar;
                                gh ghVar2;
                                int i15;
                                boolean z10;
                                boolean z11;
                                ul1 ul1Var3;
                                c30 c30Var4;
                                RoutePlanStage routePlanStage3;
                                ey1 ey1Var28;
                                ov0 ov0Var4;
                                ?? r3;
                                boolean z12;
                                Object obj8;
                                int i16;
                                Object obj9;
                                ?? r0;
                                boolean z13;
                                dv1 dv1Var;
                                boolean z14;
                                ov0 ov0Var5;
                                c30 c30Var5;
                                Object objQ25;
                                Object obj10;
                                Object objQ26;
                                ey1 ey1Var29;
                                Object obj11;
                                boolean zBooleanValue;
                                boolean z15;
                                Object obj12;
                                yh yhVar = (yh) obj4;
                                boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                f30 f30Var3 = (f30) obj6;
                                ((Integer) obj7).getClass();
                                pr prVar = j9.j;
                                yhVar.getClass();
                                uu2 uu2VarB = wu2.b("route_search_bar", f30Var3);
                                ov0 ov0Var6 = (ov0) f30Var3;
                                Object objQ27 = ov0Var6.Q();
                                c30 c30Var6 = d30.a;
                                Object obj13 = objQ27;
                                if (objQ27 == c30Var6) {
                                    ui1 ui1Var = new ui1(1);
                                    ov0Var6.m0(ui1Var);
                                    obj13 = ui1Var;
                                }
                                dv1 dv1VarD = wu2.d(wu2Var, uu2VarB, yhVar, (ui1) obj13);
                                Object objQ28 = ov0Var6.Q();
                                ey1 ey1Var30 = ey1Var20;
                                Object obj14 = objQ28;
                                if (objQ28 == c30Var6) {
                                    vu1 vu1Var = new vu1(ey1Var30, 10);
                                    ov0Var6.m0(vu1Var);
                                    obj14 = vu1Var;
                                }
                                dv1 dv1VarG = k22.G(dv1VarD, (lu0) obj14);
                                fn0 fn0Var = iw2.c;
                                pr prVar2 = j9.f;
                                er1 er1VarC = ws.c(prVar2, false);
                                int iHashCode = Long.hashCode(ov0Var6.T);
                                l72 l72VarL = ov0Var6.l();
                                dv1 dv1VarH = xp1.H(ov0Var6, fn0Var);
                                w20.b.getClass();
                                x30 x30Var = v20.b;
                                ov0Var6.g0();
                                if (ov0Var6.S) {
                                    ov0Var6.k(x30Var);
                                } else {
                                    ov0Var6.p0();
                                }
                                gh ghVar3 = v20.e;
                                q73.h(ov0Var6, ghVar3, er1VarC);
                                gh ghVar4 = v20.d;
                                q73.h(ov0Var6, ghVar4, l72VarL);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                gh ghVar5 = v20.f;
                                q73.h(ov0Var6, ghVar5, numValueOf);
                                wa waVar2 = v20.g;
                                q73.g(ov0Var6, waVar2);
                                gh ghVar6 = v20.c;
                                q73.h(ov0Var6, ghVar6, dv1VarH);
                                final ey1 ey1Var31 = ey1Var21;
                                ey1 ey1Var32 = ey1Var22;
                                if (zBooleanValue2 && ((Boolean) ey1Var31.getValue()).booleanValue()) {
                                    ov0Var6.c0(-864255109);
                                    pe2 pe2Var2 = (pe2) ey1Var30.getValue();
                                    pe2 pe2Var3 = (pe2) ey1Var32.getValue();
                                    Object objQ29 = ov0Var6.Q();
                                    if (objQ29 == c30Var6) {
                                        di1 di1Var = new di1(ey1Var30, ey1Var32, ey1Var31, 2);
                                        ov0Var6.m0(di1Var);
                                        obj12 = di1Var;
                                    } else {
                                        obj12 = objQ29;
                                    }
                                    ws.a(m33.b(fn0Var, pe2Var2, pe2Var3, (PointerInputEventHandler) obj12), ov0Var6, 0);
                                    ov0Var6.p(false);
                                    i14 = -878763791;
                                } else {
                                    dv1VarG = dv1VarG;
                                    i14 = -878763791;
                                    ov0Var6.c0(-878763791);
                                    ov0Var6.p(false);
                                }
                                RoutePlanStage routePlanStage4 = RoutePlanStage.SELECTING;
                                RoutePlanStage routePlanStage5 = routePlanStage2;
                                av1 av1Var = av1.a;
                                if ((routePlanStage5 == routePlanStage4 || routePlanStage5 == RoutePlanStage.IDLE) && !zBooleanValue2) {
                                    ov0Var6.c0(-863153152);
                                    waVar = waVar2;
                                    ghVar = ghVar5;
                                    ghVar2 = ghVar4;
                                    i15 = i14;
                                    ce0.c(bk.g, k22.k(av1Var, prVar), ov0Var6, 6, 0);
                                    z10 = false;
                                } else {
                                    ghVar2 = ghVar4;
                                    waVar = waVar2;
                                    ghVar = ghVar5;
                                    z10 = false;
                                    i15 = i14;
                                    ov0Var6.c0(i15);
                                }
                                ov0Var6.p(z10);
                                if (z8 && z9) {
                                    ov0Var6.c0(-862869378);
                                    ce0.c(bk.i, k22.k(av1Var, prVar), ov0Var6, 6, 0);
                                    z11 = false;
                                } else {
                                    z11 = false;
                                    ov0Var6.c0(i15);
                                }
                                ov0Var6.p(z11);
                                List list6 = list5;
                                boolean zIsEmpty = list6.isEmpty();
                                ul1 ul1Var4 = ul1Var2;
                                if (zIsEmpty || (!(routePlanStage5 == RoutePlanStage.IDLE || routePlanStage5 == routePlanStage4) || zBooleanValue2)) {
                                    boolean z16 = z11;
                                    ul1Var3 = ul1Var4;
                                    c30Var4 = c30Var6;
                                    routePlanStage3 = routePlanStage5;
                                    ey1Var28 = ey1Var32;
                                    ov0Var6.c0(i15);
                                    ov0Var6.p(z16);
                                    r3 = z16;
                                    ov0Var4 = ov0Var6;
                                } else {
                                    ov0Var6.c0(-862332241);
                                    dv1 dv1VarQ = ym3.q(zm3.G(ji2.U(k22.k(av1Var, j9.g)), 0.0f, 12.0f, 0.0f, 0.0f, 13), null, 3);
                                    bj2 bj2VarA = cj2.a(20.0f);
                                    long jC = hz.c(0.94f, ((kz) ov0Var6.j(mz.a)).p);
                                    p10 p10VarA0 = sb.a0(-437410110, new j2(19, list6, ul1Var4), ov0Var6);
                                    ul1Var3 = ul1Var4;
                                    ey1Var28 = ey1Var32;
                                    c30Var4 = c30Var6;
                                    routePlanStage3 = routePlanStage5;
                                    r3 = 0;
                                    e33.a(dv1VarQ, bj2VarA, jC, 0L, 0.0f, 8.0f, null, p10VarA0, ov0Var6, 12779520, 88);
                                    ov0 ov0Var7 = ov0Var6;
                                    ov0Var7.p(false);
                                    ov0Var4 = ov0Var7;
                                }
                                float f4 = f2;
                                dv1 dv1VarG2 = zm3.G(k22.k(av1Var, j9.n), 0.0f, 0.0f, 16.0f, ((td0) qh.a(f3 + f4 + 16.0f, o51.I(200, 6, null), "fab_padding", ov0Var4, 432, 8).getValue()).e, 3);
                                er1 er1VarC2 = ws.c(prVar2, r3);
                                int iHashCode2 = Long.hashCode(ov0Var4.T);
                                l72 l72VarL2 = ov0Var4.l();
                                dv1 dv1VarH2 = xp1.H(ov0Var4, dv1VarG2);
                                ov0Var4.g0();
                                if (ov0Var4.S) {
                                    ov0Var4.k(x30Var);
                                } else {
                                    ov0Var4.p0();
                                }
                                q73.h(ov0Var4, ghVar3, er1VarC2);
                                q73.h(ov0Var4, ghVar2, l72VarL2);
                                gh ghVar7 = ghVar;
                                wa waVar3 = waVar;
                                az2.s(iHashCode2, ov0Var4, ghVar7, ov0Var4, waVar3);
                                q73.h(ov0Var4, ghVar6, dv1VarH2);
                                yz yzVarA = wz.a(new jo(10.0f, true, new fo(r3)), j9.s, ov0Var4, 54);
                                int iHashCode3 = Long.hashCode(ov0Var4.T);
                                l72 l72VarL3 = ov0Var4.l();
                                dv1 dv1VarH3 = xp1.H(ov0Var4, av1Var);
                                ov0Var4.g0();
                                if (ov0Var4.S) {
                                    ov0Var4.k(r16);
                                } else {
                                    ov0Var4.p0();
                                }
                                q73.h(ov0Var4, ghVar3, yzVarA);
                                q73.h(ov0Var4, ghVar2, l72VarL3);
                                az2.s(iHashCode3, ov0Var4, ghVar7, ov0Var4, waVar3);
                                q73.h(ov0Var4, ghVar6, dv1VarH3);
                                x01 x01VarJ = mh0.J();
                                String strN = ke0.N(2131624682, ov0Var4);
                                final lr2 lr2Var6 = lr2Var5;
                                boolean zH5 = ov0Var4.h(lr2Var6);
                                Object objQ30 = ov0Var4.Q();
                                Object obj15 = objQ30;
                                if (zH5 || objQ30 == c30Var4) {
                                    xi1 xi1Var = new xi1(lr2Var6, 1);
                                    ov0Var4.m0(xi1Var);
                                    obj15 = xi1Var;
                                }
                                ov0 ov0Var8 = ov0Var4;
                                p10 p10Var = null;
                                hd0.h(x01VarJ, (au0) obj15, strN, null, ov0Var8, 0, 8);
                                x01 x01VarR = k22.r();
                                Object objQ31 = ov0Var8.Q();
                                Object obj16 = objQ31;
                                if (objQ31 == c30Var4) {
                                    xj2 xj2Var = new xj2(ey1Var23, 1);
                                    ov0Var8.m0(xj2Var);
                                    obj16 = xj2Var;
                                }
                                hd0.j(x01VarR, (au0) obj16, ov0Var8, 48);
                                x01 x01VarY = vd0.y();
                                ul1 ul1Var5 = ul1Var3;
                                boolean zH6 = ov0Var8.h(ul1Var5);
                                Context context5 = context4;
                                boolean zH7 = zH6 | ov0Var8.h(context5) | ov0Var8.h(lr2Var6);
                                Object objQ32 = ov0Var8.Q();
                                if (zH7 || objQ32 == c30Var4) {
                                    z12 = true;
                                    yi1 yi1Var = new yi1(true ? 1 : 0, ul1Var5, lr2Var6, context5);
                                    ov0Var8.m0(yi1Var);
                                    obj8 = yi1Var;
                                } else {
                                    z12 = true;
                                    obj8 = objQ32;
                                }
                                hd0.j(x01VarY, (au0) obj8, ov0Var8, 0);
                                ov0Var8.p(z12);
                                ov0Var8.p(z12);
                                dv1 dv1VarG3 = zm3.G(k22.k(av1Var, j9.m), 14.0f, 0.0f, 14.0f, f4 + 6.0f, 2);
                                Object objQ33 = ov0Var8.Q();
                                if (objQ33 == c30Var4) {
                                    i16 = 2;
                                    zi1 zi1Var = new zi1(t52Var2, 2);
                                    ov0Var8.m0(zi1Var);
                                    obj9 = zi1Var;
                                } else {
                                    i16 = 2;
                                    obj9 = objQ33;
                                }
                                dv1 dv1VarG4 = k22.G(dv1VarG3, (lu0) obj9);
                                boolean zH8 = ov0Var8.h(lr2Var6) | ov0Var8.h(ul1Var5);
                                AppState appState6 = appState5;
                                boolean zH9 = zH8 | ov0Var8.h(appState6);
                                Object objQ34 = ov0Var8.Q();
                                Object obj17 = objQ34;
                                if (zH9 || objQ34 == c30Var4) {
                                    vy vyVar = new vy(lr2Var6, ul1Var5, appState6);
                                    ov0Var8.m0(vyVar);
                                    obj17 = vyVar;
                                }
                                au0 au0Var3 = (au0) obj17;
                                boolean zH10 = ov0Var8.h(ul1Var5);
                                Object objQ35 = ov0Var8.Q();
                                Object obj18 = objQ35;
                                if (zH10 || objQ35 == c30Var4) {
                                    m6 m6Var = new m6(ul1Var5, 15);
                                    ov0Var8.m0(m6Var);
                                    obj18 = m6Var;
                                }
                                au0 au0Var4 = (au0) obj18;
                                boolean zH11 = ov0Var8.h(ul1Var5);
                                Object objQ36 = ov0Var8.Q();
                                Object obj19 = objQ36;
                                if (zH11 || objQ36 == c30Var4) {
                                    m6 m6Var2 = new m6(ul1Var5, 16);
                                    ov0Var8.m0(m6Var2);
                                    obj19 = m6Var2;
                                }
                                au0 au0Var5 = (au0) obj19;
                                Object objQ37 = ov0Var8.Q();
                                Object obj20 = objQ37;
                                if (objQ37 == c30Var4) {
                                    mo0 mo0Var = new mo0(ey1Var24, 29);
                                    ov0Var8.m0(mo0Var);
                                    obj20 = mo0Var;
                                }
                                au0 au0Var6 = (au0) obj20;
                                boolean zH12 = ov0Var8.h(ul1Var5);
                                Object objQ38 = ov0Var8.Q();
                                Object obj21 = objQ38;
                                if (zH12 || objQ38 == c30Var4) {
                                    zm0 zm0Var = new zm0(ul1Var5, ey1Var25, i16);
                                    ov0Var8.m0(zm0Var);
                                    obj21 = zm0Var;
                                }
                                au0 au0Var7 = (au0) obj21;
                                boolean zH13 = ov0Var8.h(ul1Var5);
                                Object objQ39 = ov0Var8.Q();
                                int i17 = 14;
                                Object obj22 = objQ39;
                                if (zH13 || objQ39 == c30Var4) {
                                    m6 m6Var3 = new m6(ul1Var5, i17);
                                    ov0Var8.m0(m6Var3);
                                    obj22 = m6Var3;
                                }
                                au0 au0Var8 = (au0) obj22;
                                RoutePlanStage routePlanStage6 = RoutePlanStage.IDLE;
                                au0 au0Var9 = au0Var2;
                                c30 c30Var7 = c30Var4;
                                vp0 vp0Var4 = vp0Var3;
                                ey1 ey1Var33 = ey1Var26;
                                ey1 ey1Var34 = ey1Var19;
                                RoutePlanStage routePlanStage7 = routePlanStage3;
                                if (routePlanStage7 == routePlanStage6 || routePlanStage7 == routePlanStage4) {
                                    ov0Var8.c0(-855350886);
                                    dv1 dv1Var2 = dv1VarG;
                                    r0 = 0;
                                    z13 = zBooleanValue2;
                                    dv1Var = dv1Var2;
                                    p10 p10VarA1 = sb.a0(92761441, new wi1(z13, appState6, ul1Var5, dv1Var2, au0Var9, vp0Var4, ey1Var33, ey1Var34), ov0Var8);
                                    ov0Var8.p(false);
                                    p10Var = p10VarA1;
                                } else {
                                    ov0Var8.c0(-854369396);
                                    ov0Var8.p(false);
                                    r0 = 0;
                                    dv1Var = dv1VarG;
                                    z13 = zBooleanValue2;
                                }
                                mc0.f(dv1VarG4, routePlanStage7, list6, r5, au0Var3, au0Var4, au0Var5, au0Var6, au0Var7, au0Var8, p10Var, ov0Var8, 12582912);
                                ov0 ov0Var9 = ov0Var8;
                                if (z13) {
                                    ov0Var9.c0(-854104500);
                                    dv1 dv1VarG5 = zm3.G(ji2.U(iw2.e(av1Var, 1.0f)), 0.0f, 8.0f, 0.0f, 0.0f, 13);
                                    yz yzVarA2 = wz.a(am1.g, j9.r, ov0Var9, r0);
                                    int iHashCode4 = Long.hashCode(ov0Var9.T);
                                    l72 l72VarL4 = ov0Var9.l();
                                    dv1 dv1VarH4 = xp1.H(ov0Var9, dv1VarG5);
                                    ov0Var9.g0();
                                    if (ov0Var9.S) {
                                        ov0Var9.k(r16);
                                    } else {
                                        ov0Var9.p0();
                                    }
                                    q73.h(ov0Var9, ghVar3, yzVarA2);
                                    q73.h(ov0Var9, ghVar2, l72VarL4);
                                    az2.s(iHashCode4, ov0Var9, ghVar7, ov0Var9, waVar3);
                                    q73.h(ov0Var9, ghVar6, dv1VarH4);
                                    String str = (String) ey1Var33.getValue();
                                    SearchMode searchMode2 = appState6.getSearchMode();
                                    CloudGeoSource geoSearchSource2 = appState6.getGeoSearchSource();
                                    boolean zH14 = ov0Var9.h(ul1Var5);
                                    Object objQ40 = ov0Var9.Q();
                                    if (zH14) {
                                        c30Var5 = c30Var7;
                                    } else {
                                        c30Var5 = c30Var7;
                                        if (objQ40 == c30Var5) {
                                        }
                                        dv1 dv1VarF = zm3.F(iw2.e(dv1Var, 1.0f), 14.0f, 0.0f, 2);
                                        lu0 lu0Var2 = (lu0) ((o81) objQ40);
                                        objQ25 = ov0Var9.Q();
                                        obj10 = objQ25;
                                        if (objQ25 == c30Var5) {
                                            vu1 vu1Var2 = new vu1(ey1Var33, 9);
                                            ov0Var9.m0(vu1Var2);
                                            obj10 = vu1Var2;
                                        }
                                        lu0 lu0Var3 = (lu0) obj10;
                                        objQ26 = ov0Var9.Q();
                                        if (objQ26 == c30Var5) {
                                            ey1Var29 = ey1Var34;
                                            xj2 xj2Var2 = new xj2(ey1Var29, r0);
                                            ov0Var9.m0(xj2Var2);
                                            obj11 = xj2Var2;
                                        } else {
                                            ey1Var29 = ey1Var34;
                                            obj11 = objQ26;
                                        }
                                        ks.F(str, searchMode2, lu0Var2, lu0Var3, au0Var9, (au0) obj11, dv1VarF, vp0Var4, geoSearchSource2, ov0Var9, 12782592);
                                        zBooleanValue = ((Boolean) ey1Var31.getValue()).booleanValue();
                                        final ey1 ey1Var35 = ey1Var27;
                                        if (zBooleanValue || ((List) ey1Var35.getValue()).isEmpty()) {
                                            z15 = r0;
                                        } else {
                                            z15 = 1;
                                        }
                                        pk0 pk0VarA = kk0.d(o51.I(160, 6, null), 2).a(kk0.c(o51.I(220, 6, null), 14));
                                        lm0 lm0VarA = kk0.e(o51.I(120, 6, null), 2).a(kk0.h(o51.I(160, 6, null), 14));
                                        final op0 op0Var5 = op0Var4;
                                        final ny2 ny2Var5 = ny2Var4;
                                        final ey1 ey1Var36 = ey1Var29;
                                        final ey1 ey1Var37 = ey1Var28;
                                        da0.e(z15, null, pk0VarA, lm0VarA, null, sb.a0(-2066071346, new qu0() { // from class: yj2
                                            @Override // defpackage.qu0
                                            public final Object invoke(Object obj23, Object obj24, Object obj25) {
                                                f30 f30Var4 = (f30) obj24;
                                                ((Integer) obj25).getClass();
                                                ((mi) obj23).getClass();
                                                bj2 bj2VarA2 = cj2.a(16.0f);
                                                ov0 ov0Var10 = (ov0) f30Var4;
                                                aw awVarT = ym3.t(((kz) ov0Var10.j(mz.a)).p, 0L, f30Var4, 0, 14);
                                                cw cwVarU = ym3.u(62, 6.0f);
                                                dv1 dv1VarE = zm3.E(iw2.e(av1.a, 1.0f), 14.0f, 6.0f);
                                                Object objQ41 = ov0Var10.Q();
                                                if (objQ41 == d30.a) {
                                                    objQ41 = new vu1(ey1Var37, 12);
                                                    ov0Var10.m0(objQ41);
                                                }
                                                sb.C(k22.G(dv1VarE, (lu0) objQ41), bj2VarA2, awVarT, cwVarU, sb.a0(363957532, new z2(lr2Var6, op0Var5, ny2Var5, ey1Var35, ey1Var36, ey1Var31, 1), ov0Var10), ov0Var10, 196614, 16);
                                                return mf3.a;
                                            }
                                        }, ov0Var9), ov0Var9, 1600518);
                                        ov0 ov0Var10 = ov0Var9;
                                        z14 = true;
                                        ov0Var10.p(true);
                                        ov0Var5 = ov0Var10;
                                    }
                                    objQ40 = new l(1, ul1Var5, hn1.class, "setSearchMode", "setSearchMode(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Lcom/vincenthzr/locationspoofer/data/model/SearchMode;)V", 1, 22);
                                    ov0Var9.m0(objQ40);
                                    dv1 dv1VarF2 = zm3.F(iw2.e(dv1Var, 1.0f), 14.0f, 0.0f, 2);
                                    lu0 lu0Var4 = (lu0) ((o81) objQ40);
                                    objQ25 = ov0Var9.Q();
                                    obj10 = objQ25;
                                    if (objQ25 == c30Var5) {
                                        vu1 vu1Var3 = new vu1(ey1Var33, 9);
                                        ov0Var9.m0(vu1Var3);
                                        obj10 = vu1Var3;
                                    }
                                    lu0 lu0Var5 = (lu0) obj10;
                                    objQ26 = ov0Var9.Q();
                                    if (objQ26 == c30Var5) {
                                        ey1Var29 = ey1Var34;
                                        xj2 xj2Var3 = new xj2(ey1Var29, r0);
                                        ov0Var9.m0(xj2Var3);
                                        obj11 = xj2Var3;
                                    } else {
                                        ey1Var29 = ey1Var34;
                                        obj11 = objQ26;
                                    }
                                    ks.F(str, searchMode2, lu0Var4, lu0Var5, au0Var9, (au0) obj11, dv1VarF2, vp0Var4, geoSearchSource2, ov0Var9, 12782592);
                                    zBooleanValue = ((Boolean) ey1Var31.getValue()).booleanValue();
                                    final ey1 ey1Var38 = ey1Var27;
                                    if (zBooleanValue) {
                                        z15 = r0;
                                    } else {
                                        z15 = r0;
                                    }
                                    pk0 pk0VarA2 = kk0.d(o51.I(160, 6, null), 2).a(kk0.c(o51.I(220, 6, null), 14));
                                    lm0 lm0VarA2 = kk0.e(o51.I(120, 6, null), 2).a(kk0.h(o51.I(160, 6, null), 14));
                                    final op0 op0Var6 = op0Var4;
                                    final ny2 ny2Var6 = ny2Var4;
                                    final ey1 ey1Var39 = ey1Var29;
                                    final ey1 ey1Var310 = ey1Var28;
                                    da0.e(z15, null, pk0VarA2, lm0VarA2, null, sb.a0(-2066071346, new qu0() { // from class: yj2
                                        @Override // defpackage.qu0
                                        public final Object invoke(Object obj23, Object obj24, Object obj25) {
                                            f30 f30Var4 = (f30) obj24;
                                            ((Integer) obj25).getClass();
                                            ((mi) obj23).getClass();
                                            bj2 bj2VarA2 = cj2.a(16.0f);
                                            ov0 ov0Var11 = (ov0) f30Var4;
                                            aw awVarT = ym3.t(((kz) ov0Var11.j(mz.a)).p, 0L, f30Var4, 0, 14);
                                            cw cwVarU = ym3.u(62, 6.0f);
                                            dv1 dv1VarE = zm3.E(iw2.e(av1.a, 1.0f), 14.0f, 6.0f);
                                            Object objQ41 = ov0Var11.Q();
                                            if (objQ41 == d30.a) {
                                                objQ41 = new vu1(ey1Var310, 12);
                                                ov0Var11.m0(objQ41);
                                            }
                                            sb.C(k22.G(dv1VarE, (lu0) objQ41), bj2VarA2, awVarT, cwVarU, sb.a0(363957532, new z2(lr2Var6, op0Var6, ny2Var6, ey1Var38, ey1Var39, ey1Var31, 1), ov0Var11), ov0Var11, 196614, 16);
                                            return mf3.a;
                                        }
                                    }, ov0Var9), ov0Var9, 1600518);
                                    ov0 ov0Var11 = ov0Var9;
                                    z14 = true;
                                    ov0Var11.p(true);
                                    ov0Var5 = ov0Var11;
                                } else {
                                    z14 = true;
                                    ov0Var9.c0(-878763791);
                                    ov0Var5 = ov0Var9;
                                }
                                ov0Var5.p(r0);
                                ov0Var5.p(z14);
                                return mf3.a;
                            }
                        }, ov0Var3), ov0Var3, 1597824);
                    } else {
                        ov0Var3.W();
                    }
                    return mf3.a;
                }
            }, ov0Var2), ov0Var2, 48);
            int i14 = 3;
            if (((Boolean) ey1Var5.getValue()).booleanValue()) {
                ov0Var2.c0(1592074574);
                Object objO0 = zy.o0(appState.getRoutePoints());
                Boolean boolValueOf = Boolean.valueOf(appState.getCloudWifiConfigured());
                Boolean boolValueOf2 = Boolean.valueOf(appState.getCloudCellsConfigured());
                boolean zH5 = ov0Var2.h(ul1Var);
                Object objQ24 = ov0Var2.Q();
                if (zH5 || objQ24 == c30Var3) {
                    objQ24 = new sl1(ul1Var, q60Var, 15);
                    ov0Var2.m0(objQ24);
                }
                oi0.g(objO0, boolValueOf, boolValueOf2, (pu0) objQ24, ov0Var2);
                Object objQ25 = ov0Var2.Q();
                if (objQ25 == c30Var3) {
                    objQ25 = new xj2(ey1Var5, 4);
                    ov0Var2.m0(objQ25);
                }
                au0 au0Var2 = (au0) objQ25;
                boolean zH6 = ov0Var2.h(ul1Var);
                Object objQ26 = ov0Var2.Q();
                if (zH6 || objQ26 == c30Var3) {
                    objQ26 = new zm0(ul1Var, ey1Var5, i14);
                    ov0Var2.m0(objQ26);
                }
                au0 au0Var3 = (au0) objQ26;
                boolean zH7 = ov0Var2.h(ul1Var);
                Object objQ27 = ov0Var2.Q();
                if (zH7 || objQ27 == c30Var3) {
                    l lVar2 = new l(1, ul1Var, an1.class, "setRouteRunMode", "setRouteRunMode(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Lcom/vincenthzr/locationspoofer/data/model/RouteRunMode;)V", 1, 8);
                    ov0Var2.m0(lVar2);
                    objQ27 = lVar2;
                }
                lu0 lu0Var = (lu0) ((o81) objQ27);
                boolean zH8 = ov0Var2.h(ul1Var);
                Object objQ28 = ov0Var2.Q();
                if (zH8 || objQ28 == c30Var3) {
                    l lVar3 = new l(1, ul1Var, an1.class, "setRouteSimMode", "setRouteSimMode(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Lcom/vincenthzr/locationspoofer/data/model/SimMode;)V", 1, 9);
                    ov0Var2.m0(lVar3);
                    objQ28 = lVar3;
                }
                lu0 lu0Var2 = (lu0) ((o81) objQ28);
                boolean zH9 = ov0Var2.h(ul1Var);
                Object objQ29 = ov0Var2.Q();
                if (zH9 || objQ29 == c30Var3) {
                    l lVar4 = new l(1, ul1Var, an1.class, "setCustomSpeedMs", "setCustomSpeedMs(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;D)V", 1, 10);
                    ov0Var2.m0(lVar4);
                    objQ29 = lVar4;
                }
                lu0 lu0Var3 = (lu0) ((o81) objQ29);
                boolean zH10 = ov0Var2.h(ul1Var);
                Object objQ30 = ov0Var2.Q();
                if (zH10 || objQ30 == c30Var3) {
                    l lVar5 = new l(1, ul1Var, an1.class, "setUseRealRoute", "setUseRealRoute(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Z)V", 1, 11);
                    ov0Var2.m0(lVar5);
                    objQ30 = lVar5;
                }
                lu0 lu0Var4 = (lu0) ((o81) objQ30);
                boolean zH11 = ov0Var2.h(ul1Var);
                Object objQ31 = ov0Var2.Q();
                if (zH11 || objQ31 == c30Var3) {
                    l lVar6 = new l(1, ul1Var, an1.class, "setRouteTravelMode", "setRouteTravelMode(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Lcom/vincenthzr/locationspoofer/data/model/RouteTravelMode;)V", 1, 12);
                    ov0Var2.m0(lVar6);
                    objQ31 = lVar6;
                }
                lu0 lu0Var5 = (lu0) ((o81) objQ31);
                boolean zH12 = ov0Var2.h(ul1Var);
                Object objQ32 = ov0Var2.Q();
                if (zH12 || objQ32 == c30Var3) {
                    l lVar7 = new l(1, ul1Var, an1.class, "setStopAtDestination", "setStopAtDestination(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Z)V", 1, 13);
                    ov0Var2.m0(lVar7);
                    objQ32 = lVar7;
                }
                lu0 lu0Var6 = (lu0) ((o81) objQ32);
                boolean zH13 = ov0Var2.h(ul1Var);
                Object objQ33 = ov0Var2.Q();
                if (zH13 || objQ33 == c30Var3) {
                    l lVar8 = new l(1, ul1Var, an1.class, "setEnableStepSimulation", "setEnableStepSimulation(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Z)V", 1, 14);
                    ov0Var2.m0(lVar8);
                    objQ33 = lVar8;
                }
                lu0 lu0Var7 = (lu0) ((o81) objQ33);
                boolean zH14 = ov0Var2.h(ul1Var);
                Object objQ34 = ov0Var2.Q();
                if (zH14 || objQ34 == c30Var3) {
                    l lVar9 = new l(1, ul1Var, an1.class, "setStepCadenceSpm", "setStepCadenceSpm(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;I)V", 1, 15);
                    ov0Var2.m0(lVar9);
                    objQ34 = lVar9;
                }
                lu0 lu0Var8 = (lu0) ((o81) objQ34);
                boolean zH15 = ov0Var2.h(ul1Var);
                Object objQ35 = ov0Var2.Q();
                if (zH15 || objQ35 == c30Var3) {
                    l lVar10 = new l(1, ul1Var, an1.class, "setIsAutoCadence", "setIsAutoCadence(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Z)V", 1, 16);
                    ov0Var2.m0(lVar10);
                    objQ35 = lVar10;
                }
                lu0 lu0Var9 = (lu0) ((o81) objQ35);
                boolean zH16 = ov0Var2.h(ul1Var);
                Object objQ36 = ov0Var2.Q();
                if (zH16 || objQ36 == c30Var3) {
                    w12 w12Var = new w12(0, ul1Var, on1.class, "toggleMockWifi", "toggleMockWifi(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 9);
                    ov0Var2.m0(w12Var);
                    objQ36 = w12Var;
                }
                au0 au0Var4 = (au0) ((o81) objQ36);
                boolean zH17 = ov0Var2.h(ul1Var);
                Object objQ37 = ov0Var2.Q();
                if (zH17 || objQ37 == c30Var3) {
                    w12 w12Var2 = new w12(0, ul1Var, on1.class, "toggleMockCell", "toggleMockCell(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 10);
                    ov0Var2.m0(w12Var2);
                    objQ37 = w12Var2;
                }
                au0 au0Var5 = (au0) ((o81) objQ37);
                boolean zH18 = ov0Var2.h(ul1Var);
                Object objQ38 = ov0Var2.Q();
                if (zH18 || objQ38 == c30Var3) {
                    w12 w12Var3 = new w12(0, ul1Var, on1.class, "toggleMockBluetooth", "toggleMockBluetooth(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 11);
                    ov0Var2.m0(w12Var3);
                    objQ38 = w12Var3;
                }
                au0 au0Var6 = (au0) ((o81) objQ38);
                boolean zH19 = ov0Var2.h(ul1Var);
                Object objQ39 = ov0Var2.Q();
                if (zH19 || objQ39 == c30Var3) {
                    w12 w12Var4 = new w12(0, ul1Var, on1.class, "toggleEnableJitter", "toggleEnableJitter(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;)V", 1, 12);
                    ov0Var2.m0(w12Var4);
                    objQ39 = w12Var4;
                }
                au0 au0Var7 = (au0) ((o81) objQ39);
                boolean zH20 = ov0Var2.h(ul1Var);
                Object objQ40 = ov0Var2.Q();
                if (zH20 || objQ40 == c30Var3) {
                    l lVar11 = new l(1, ul1Var, hn1.class, "setAltitude", "setAltitude(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Ljava/lang/String;)V", 1, 17);
                    ov0Var2.m0(lVar11);
                    objQ40 = lVar11;
                }
                lu0 lu0Var10 = (lu0) ((o81) objQ40);
                boolean zH21 = ov0Var2.h(ul1Var);
                Object objQ41 = ov0Var2.Q();
                if (zH21 || objQ41 == c30Var3) {
                    l lVar12 = new l(1, ul1Var, hn1.class, "setAltitudeVariation", "setAltitudeVariation(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;I)V", 1, 18);
                    ov0Var2.m0(lVar12);
                    objQ41 = lVar12;
                }
                lu0 lu0Var11 = (lu0) ((o81) objQ41);
                boolean zH22 = ov0Var2.h(ul1Var);
                Object objQ42 = ov0Var2.Q();
                if (zH22 || objQ42 == c30Var3) {
                    l lVar13 = new l(1, ul1Var, hn1.class, "setSatelliteCount", "setSatelliteCount(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Ljava/lang/String;)V", 1, 19);
                    ov0Var2.m0(lVar13);
                    objQ42 = lVar13;
                }
                lu0 lu0Var12 = (lu0) ((o81) objQ42);
                boolean zH23 = ov0Var2.h(ul1Var);
                Object objQ43 = ov0Var2.Q();
                if (zH23 || objQ43 == c30Var3) {
                    lVar = new l(1, ul1Var, on1.class, "setRouteLateralDeviation", "setRouteLateralDeviation(Lcom/vincenthzr/locationspoofer/viewmodel/MainViewModel;Z)V", 1, 20);
                    ov0Var2.m0(lVar);
                } else {
                    lVar = objQ43;
                }
                c30Var = c30Var3;
                wc0.k(appState, au0Var2, au0Var3, lu0Var, lu0Var2, lu0Var3, lu0Var4, lu0Var5, lu0Var6, lu0Var7, lu0Var8, lu0Var9, au0Var4, au0Var5, au0Var6, au0Var7, lu0Var10, lu0Var11, lu0Var12, (lu0) ((o81) lVar), sb.a0(1406693283, new j2(20, ul1Var, appState), ov0Var2), ov0Var2, (i11 & 14) | 48);
                ov0Var = ov0Var2;
                z2 = false;
                ov0Var.p(false);
                i5 = 1562040844;
            } else {
                ov0Var = ov0Var2;
                i5 = 1562040844;
                c30Var = c30Var3;
                z2 = false;
                ov0Var.c0(1562040844);
                ov0Var.p(false);
            }
            if (appState.isFetchingRoute()) {
                ov0Var.c0(1593805924);
                dv1 dv1VarK = xp1.k(iw2.c, hz.c(0.35f, hz.b), o51.p0);
                er1 er1VarC = ws.c(j9.j, z2);
                int iHashCode = Long.hashCode(ov0Var.T);
                l72 l72VarL = ov0Var.l();
                dv1 dv1VarH = xp1.H(ov0Var, dv1VarK);
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
                ov0 ov0Var3 = ov0Var;
                sb.C(zm3.D(av1.a, 32.0f), cj2.a(20.0f), ym3.t(((kz) ov0Var.j(mz.a)).p, 0L, ov0Var, 0, 14), ym3.u(62, 10.0f), o51.d0, ov0Var3, 196614, 16);
                ov0Var = ov0Var3;
                ov0Var.p(true);
            } else {
                ov0Var.c0(i5);
            }
            ov0Var.p(z2);
            if (((Boolean) ey1Var6.getValue()).booleanValue()) {
                ov0Var.c0(1595018272);
                Object objQ44 = ov0Var.Q();
                c30Var2 = c30Var;
                if (objQ44 == c30Var2) {
                    objQ44 = new xj2(ey1Var6, 5);
                    ov0Var.m0(objQ44);
                }
                ce0.e(list4, ul1Var, false, (au0) objQ44, ov0Var, ((i7 << 3) & 112) | 3072);
            } else {
                c30Var2 = c30Var;
                ov0Var.c0(i5);
            }
            ov0Var.p(z2);
            if (((Boolean) r15.getValue()).booleanValue()) {
                ov0Var.c0(1595226065);
                Object objQ45 = ov0Var.Q();
                if (objQ45 == c30Var2) {
                    objQ45 = new xj2(ey1Var7, 6);
                    ov0Var.m0(objQ45);
                }
                ov0 ov0Var4 = ov0Var;
                gh0.g(appState, ul1Var, lr2Var, fU0, f, (au0) objQ45, ov0Var4, (i11 & 14) | 196608 | ((i7 << 3) & 112) | i13 | i12);
                ov0Var = ov0Var4;
            } else {
                ov0Var.c0(i5);
            }
            ov0Var.p(z2);
            lo1Var2 = lo1Var4;
        } else {
            ov0Var = ov0Var2;
            ov0Var.W();
            lo1Var2 = lo1Var;
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new pu0(appState, lr2Var, f, lo1Var2, i) { // from class: ak2
                public final /* synthetic */ AppState f;
                public final /* synthetic */ lr2 g;
                public final /* synthetic */ float h;
                public final /* synthetic */ lo1 i;

                @Override // defpackage.pu0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM0 = wc0.m0(3073);
                    gk2.a(this.e, this.f, this.g, this.h, this.i, (f30) obj, iM0);
                    return mf3.a;
                }
            };
        }
    }

    public static final void b(ey1 ey1Var, boolean z) {
        ey1Var.setValue(Boolean.valueOf(z));
    }
}
