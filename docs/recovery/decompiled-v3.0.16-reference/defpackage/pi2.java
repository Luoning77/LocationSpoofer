package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.vincenthzr.locationspoofer.data.model.AppInfoItem;
import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.GaitRecordingState;
import com.vincenthzr.locationspoofer.data.model.RootSolution;
import com.vincenthzr.locationspoofer.utils.LSPosedManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class pi2 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ AppState f;
    public final /* synthetic */ ul1 g;
    public final /* synthetic */ boolean h;

    public /* synthetic */ pi2(AppState appState, ul1 ul1Var, boolean z) {
        this.e = 1;
        this.f = appState;
        this.g = ul1Var;
        this.h = z;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x035c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [f30] */
    /* JADX WARN: Type inference failed for: r13v12, types: [f30, ov0] */
    /* JADX WARN: Type inference failed for: r13v15, types: [f30, ov0] */
    /* JADX WARN: Type inference failed for: r13v16, types: [ov0] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r16v21, types: [f30] */
    /* JADX WARN: Type inference failed for: r5v28, types: [int] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    private final Object f(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        String strH;
        ov0 ov0Var;
        boolean z;
        ov0 ov0Var2;
        ?? r13;
        ?? r5;
        String strH2;
        Object obj4;
        ?? r6;
        ?? r14;
        boolean z2;
        ?? r15;
        int i3;
        int i4;
        Object obj5;
        boolean zH;
        Object objQ;
        f30 f30Var = (f30) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        or orVar = j9.o;
        ((zz) obj).getClass();
        ov0 ov0Var3 = (ov0) f30Var;
        if (ov0Var3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            x01 x01VarB = wc0.a;
            if (x01VarB == null) {
                w01 w01Var = new w01("AutoMirrored.Rounded.DirectionsWalk", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                int i5 = nh3.a;
                qy2 qy2Var = new qy2(hz.b);
                nx0 nx0VarI = p91.i(13.5f, 5.5f);
                nx0VarI.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                nx0VarI.o(-0.9f, -2.0f, -2.0f, -2.0f);
                nx0VarI.o(-2.0f, 0.9f, -2.0f, 2.0f);
                nx0VarI.o(0.9f, 2.0f, 2.0f, 2.0f);
                nx0VarI.e();
                nx0VarI.m(9.8f, 8.9f);
                nx0VarI.k(7.24f, 21.81f);
                nx0VarI.g(-0.13f, 0.61f, 0.35f, 1.19f, 0.98f, 1.19f);
                nx0VarI.i(0.08f);
                nx0VarI.g(0.47f, 0.0f, 0.87f, -0.32f, 0.98f, -0.78f);
                nx0VarI.k(10.9f, 15.0f);
                nx0VarI.l(2.1f, 2.0f);
                nx0VarI.s(5.0f);
                nx0VarI.g(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                nx0VarI.o(1.0f, -0.45f, 1.0f, -1.0f);
                nx0VarI.s(-5.64f);
                nx0VarI.g(0.0f, -0.55f, -0.22f, -1.07f, -0.62f, -1.45f);
                nx0VarI.k(12.9f, 13.5f);
                nx0VarI.l(0.6f, -3.0f);
                nx0VarI.g(1.07f, 1.24f, 2.62f, 2.13f, 4.36f, 2.41f);
                nx0VarI.g(0.6f, 0.09f, 1.14f, -0.39f, 1.14f, -1.0f);
                nx0VarI.g(0.0f, -0.49f, -0.36f, -0.9f, -0.85f, -0.98f);
                nx0VarI.g(-1.52f, -0.25f, -2.78f, -1.15f, -3.45f, -2.33f);
                nx0VarI.l(-1.0f, -1.6f);
                nx0VarI.g(-0.56f, -0.89f, -1.68f, -1.25f, -2.65f, -0.84f);
                nx0VarI.k(7.22f, 7.78f);
                nx0VarI.f(6.48f, 8.1f, 6.0f, 8.82f, 6.0f, 9.63f);
                nx0VarI.r(12.0f);
                nx0VarI.g(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                nx0VarI.o(1.0f, -0.45f, 1.0f, -1.0f);
                nx0VarI.r(9.6f);
                nx0VarI.l(1.8f, -0.7f);
                w01.a(w01Var, nx0VarI.a, qy2Var);
                x01VarB = w01Var.b();
                wc0.a = x01VarB;
            }
            x01 x01Var = x01VarB;
            long j = bk.h;
            sj2.b(x01Var, j, ke0.N(2131624499, ov0Var3), ke0.N(2131624487, ov0Var3), ov0Var3, 48);
            av1 av1Var = av1.a;
            gh0.h(ov0Var3, iw2.g(av1Var, 12.0f));
            AppState appState = this.f;
            GaitRecordingState gaitRecording = appState.getGaitRecording();
            boolean z3 = gaitRecording instanceof GaitRecordingState.Countdown;
            ul1 ul1Var = this.g;
            Object obj6 = d30.a;
            if (z3 || (gaitRecording instanceof GaitRecordingState.Recording) || o51.f(gaitRecording, GaitRecordingState.Processing.INSTANCE)) {
                ov0Var3.c0(524028974);
                if (z3) {
                    ov0Var3.c0(-398735758);
                    strH = ke0.O(2131624485, new Object[]{Integer.valueOf(((GaitRecordingState.Countdown) gaitRecording).getSecondsLeft())}, ov0Var3);
                    ov0Var3.p(false);
                } else {
                    if (gaitRecording instanceof GaitRecordingState.Recording) {
                        i = -398731788;
                        i2 = 2131624495;
                    } else {
                        i = -398729611;
                        i2 = 2131624492;
                    }
                    strH = az2.h(ov0Var3, i, i2, ov0Var3, false);
                }
                s83.b(strH, null, ((kz) ov0Var3.j(mz.a)).q, v63.c(13), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                gh0.h(ov0Var3, iw2.g(av1Var, 10.0f));
                if (gaitRecording instanceof GaitRecordingState.Recording) {
                    ov0Var3.c0(524581084);
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    boolean zH2 = ov0Var3.h(gaitRecording);
                    Object objQ2 = ov0Var3.Q();
                    if (zH2 || objQ2 == obj6) {
                        objQ2 = new hd((GaitRecordingState.Recording) gaitRecording, 29);
                        ov0Var3.m0(objQ2);
                    }
                    vc2.b((au0) objQ2, dv1VarE, j, 0L, 0, 0.0f, null, ov0Var3, 432, 120);
                    ov0 ov0Var4 = ov0Var3;
                    ov0Var4.p(false);
                    ov0Var = ov0Var4;
                } else {
                    ov0Var3.c0(524830045);
                    vc2.c(iw2.e(av1Var, 1.0f), j, 0L, 0, 0.0f, ov0Var3, 54, 28);
                    ov0 ov0Var5 = ov0Var3;
                    ov0Var5.p(false);
                    ov0Var = ov0Var5;
                }
                if (gaitRecording instanceof GaitRecordingState.Processing) {
                    z = false;
                    ov0Var.c0(514033365);
                    ov0Var2 = ov0Var;
                } else {
                    ov0Var.c0(525018370);
                    gh0.h(ov0Var, iw2.g(av1Var, 10.0f));
                    boolean zH3 = ov0Var.h(ul1Var);
                    Object objQ3 = ov0Var.Q();
                    if (zH3 || objQ3 == obj6) {
                        objQ3 = new m6(ul1Var, 9);
                        ov0Var.m0(objQ3);
                    }
                    ov0 ov0Var6 = ov0Var;
                    n51.h((au0) objQ3, null, false, null, null, null, null, n51.y, ov0Var6, 805306368, 510);
                    ov0Var2 = ov0Var6;
                    z = false;
                }
                ov0Var2.p(z);
                ov0Var2.p(z);
                r5 = z;
                r13 = ov0Var2;
            } else if (gaitRecording instanceof GaitRecordingState.Failed) {
                ov0Var3.c0(525344428);
                int iOrdinal = ((GaitRecordingState.Failed) gaitRecording).getReason().ordinal();
                if (iOrdinal == 0) {
                    i3 = -398692901;
                    i4 = 2131624490;
                } else if (iOrdinal == 1) {
                    i3 = -398689701;
                    i4 = 2131624488;
                } else {
                    if (iOrdinal != 2) {
                        ov0Var3.c0(-398695120);
                        ov0Var3.p(false);
                        b81.d();
                        return null;
                    }
                    i3 = -398686303;
                    i4 = 2131624489;
                }
                s83.b(az2.h(ov0Var3, i3, i4, ov0Var3, false), null, ((kz) ov0Var3.j(mz.a)).w, v63.c(13), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                gh0.h(ov0Var3, iw2.g(av1Var, 10.0f));
                kk2 kk2VarA = jk2.a(new jo(10.0f, true, new fo(0)), orVar, ov0Var3, 6);
                int iHashCode = Long.hashCode(ov0Var3.T);
                l72 l72VarL = ov0Var3.l();
                dv1 dv1VarH = xp1.H(ov0Var3, av1Var);
                w20.b.getClass();
                x30 x30Var = v20.b;
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(x30Var);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, v20.e, kk2VarA);
                q73.h(ov0Var3, v20.d, l72VarL);
                q73.h(ov0Var3, v20.f, Integer.valueOf(iHashCode));
                q73.g(ov0Var3, v20.g);
                q73.h(ov0Var3, v20.c, dv1VarH);
                boolean zH4 = ov0Var3.h(ul1Var);
                Object objQ4 = ov0Var3.Q();
                if (zH4) {
                    obj5 = obj6;
                } else {
                    obj5 = obj6;
                    if (objQ4 == obj5) {
                    }
                    n51.a((au0) objQ4, null, false, null, hu.a(j, 0L, 0L, 0L, ov0Var3, 14), null, null, null, n51.z, ov0Var3, 805306368, 494);
                    zH = ov0Var3.h(ul1Var);
                    objQ = ov0Var3.Q();
                    if (zH || objQ == obj5) {
                        objQ = new m6(ul1Var, 11);
                        ov0Var3.m0(objQ);
                    }
                    n51.h((au0) objQ, null, false, null, null, null, null, n51.A, ov0Var3, 805306368, 510);
                    ov0 ov0Var7 = ov0Var3;
                    ov0Var7.p(true);
                    ov0Var7.p(false);
                    r5 = 0;
                    r13 = ov0Var7;
                }
                objQ4 = new m6(ul1Var, 10);
                ov0Var3.m0(objQ4);
                n51.a((au0) objQ4, null, false, null, hu.a(j, 0L, 0L, 0L, ov0Var3, 14), null, null, null, n51.z, ov0Var3, 805306368, 494);
                zH = ov0Var3.h(ul1Var);
                objQ = ov0Var3.Q();
                if (zH) {
                    objQ = new m6(ul1Var, 11);
                    ov0Var3.m0(objQ);
                } else {
                    objQ = new m6(ul1Var, 11);
                    ov0Var3.m0(objQ);
                }
                n51.h((au0) objQ, null, false, null, null, null, null, n51.A, ov0Var3, 805306368, 510);
                ov0 ov0Var8 = ov0Var3;
                ov0Var8.p(true);
                ov0Var8.p(false);
                r5 = 0;
                r13 = ov0Var8;
            } else {
                if (!o51.f(gaitRecording, GaitRecordingState.Idle.INSTANCE)) {
                    ov0Var3.c0(-398739625);
                    ov0Var3.p(false);
                    b81.d();
                    return null;
                }
                ov0Var3.c0(526468922);
                Integer gaitTemplateCadence = appState.getGaitTemplateCadence();
                if (gaitTemplateCadence != null) {
                    ov0Var3.c0(526541586);
                    strH2 = ke0.O(2131624494, new Object[]{gaitTemplateCadence, Integer.valueOf(appState.getGaitTemplateStrides())}, ov0Var3);
                    ov0Var3.p(false);
                } else {
                    strH2 = az2.h(ov0Var3, 526676219, 2131624491, ov0Var3, false);
                }
                long jC = v63.c(13);
                hh0 hh0Var = mz.a;
                s83.b(strH2, null, hz.c(0.75f, ((kz) ov0Var3.j(hh0Var)).q), jC, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                ov0 ov0Var9 = ov0Var3;
                if (gaitTemplateCadence != null) {
                    ov0Var9.c0(526960644);
                    gh0.h(ov0Var9, iw2.g(av1Var, 6.0f));
                    kk2 kk2VarA2 = jk2.a(am1.e, j9.p, ov0Var9, 48);
                    int iHashCode2 = Long.hashCode(ov0Var9.T);
                    l72 l72VarL2 = ov0Var9.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var9, av1Var);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var9.g0();
                    if (ov0Var9.S) {
                        ov0Var9.k(x30Var2);
                    } else {
                        ov0Var9.p0();
                    }
                    q73.h(ov0Var9, v20.e, kk2VarA2);
                    q73.h(ov0Var9, v20.d, l72VarL2);
                    q73.h(ov0Var9, v20.f, Integer.valueOf(iHashCode2));
                    q73.g(ov0Var9, v20.g);
                    q73.h(ov0Var9, v20.c, dv1VarH2);
                    s83.b(ke0.N(2131624500, ov0Var9), new wb1(1.0f, true), ((kz) ov0Var9.j(hh0Var)).q, v63.b(13.5d), jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var9, 1597440, 0, 262056);
                    ov0 ov0Var10 = ov0Var9;
                    boolean useGaitTemplate = appState.getUseGaitTemplate();
                    boolean zH5 = ov0Var10.h(ul1Var);
                    Object objQ5 = ov0Var10.Q();
                    if (zH5) {
                        obj4 = obj6;
                    } else {
                        obj4 = obj6;
                        if (objQ5 == obj4) {
                        }
                        b43.a(useGaitTemplate, (lu0) objQ5, null, false, null, ov0Var10, 0, 124);
                        ov0Var10.p(true);
                        r6 = 0;
                        r14 = ov0Var10;
                    }
                    objQ5 = new qi1(ul1Var, 8);
                    ov0Var10.m0(objQ5);
                    b43.a(useGaitTemplate, (lu0) objQ5, null, false, null, ov0Var10, 0, 124);
                    ov0Var10.p(true);
                    r6 = 0;
                    r14 = ov0Var10;
                } else {
                    obj4 = obj6;
                    r6 = 0;
                    ov0Var9.c0(514033365);
                    r14 = ov0Var9;
                }
                r14.p(r6);
                gh0.h(r14, iw2.g(av1Var, 10.0f));
                kk2 kk2VarA3 = jk2.a(new jo(10.0f, true, new fo(r6)), orVar, r14, 6);
                int iHashCode3 = Long.hashCode(r14.T);
                l72 l72VarL3 = r14.l();
                dv1 dv1VarH3 = xp1.H(r14, av1Var);
                w20.b.getClass();
                x30 x30Var3 = v20.b;
                r14.g0();
                if (r14.S) {
                    r14.k(x30Var3);
                } else {
                    r14.p0();
                }
                q73.h(r14, v20.e, kk2VarA3);
                q73.h(r14, v20.d, l72VarL3);
                q73.h(r14, v20.f, Integer.valueOf(iHashCode3));
                q73.g(r14, v20.g);
                q73.h(r14, v20.c, dv1VarH3);
                boolean zH6 = r14.h(ul1Var);
                Object objQ6 = r14.Q();
                if (zH6 || objQ6 == obj4) {
                    objQ6 = new m6(ul1Var, 12);
                    r14.m0(objQ6);
                }
                ?? r16 = r14;
                n51.a((au0) objQ6, null, false, null, hu.a(j, 0L, 0L, 0L, r16, 14), null, null, null, sb.a0(942926137, new au(gaitTemplateCadence, 10), r16), r16, 805306368, 494);
                ?? r17 = r16;
                if (gaitTemplateCadence != null) {
                    r17.c0(-360385526);
                    boolean zH7 = r17.h(ul1Var);
                    Object objQ7 = r17.Q();
                    if (zH7 || objQ7 == obj4) {
                        objQ7 = new m6(ul1Var, 13);
                        r17.m0(objQ7);
                    }
                    n51.h((au0) objQ7, null, false, null, null, null, null, n51.B, r17, 805306368, 510);
                    r15 = r17;
                    z2 = false;
                } else {
                    z2 = false;
                    r17.c0(-374461479);
                    r15 = r17;
                }
                r15.p(z2);
                r15.p(true);
                r15.p(z2);
                r5 = z2;
                r13 = r15;
            }
            gh0.h(r13, iw2.g(av1Var, 12.0f));
            sj2.d(ke0.N(2131624498, r13), this.h, r13, r5);
        } else {
            ov0Var3.W();
        }
        return mf3.a;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x09db  */
    /* JADX WARN: Code duplicated, block: B:144:0x09df  */
    /* JADX WARN: Code duplicated, block: B:147:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:149:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:152:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:51:0x040a  */
    /* JADX WARN: Code duplicated, block: B:52:0x040e  */
    /* JADX WARN: Code duplicated, block: B:55:0x043d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0441  */
    /* JADX WARN: Code duplicated, block: B:61:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x053b  */
    /* JADX WARN: Code duplicated, block: B:67:0x053f  */
    /* JADX WARN: Code duplicated, block: B:70:0x059d  */
    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        float f;
        long jC;
        c30 c30Var;
        int i;
        x30 x30Var;
        long j2;
        jr0 jr0Var;
        long jC2;
        int i2;
        long jC3;
        c30 c30Var2;
        boolean zH;
        Object objQ;
        boolean z;
        boolean z2;
        int i3 = this.e;
        lk2 lk2Var = lk2.a;
        c30 c30Var3 = d30.a;
        mf3 mf3Var = mf3.a;
        av1 av1Var = av1.a;
        ul1 ul1Var = this.g;
        boolean z3 = this.h;
        final AppState appState = this.f;
        switch (i3) {
            case 0:
                iy0 iy0Var = o51.p0;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                nr nrVar = j9.r;
                ho hoVar = am1.g;
                pr prVar = j9.j;
                or orVar = j9.p;
                ((zz) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    kk2 kk2VarA = jk2.a(am1.e, orVar, ov0Var, 48);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, av1Var);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
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
                    dv1 dv1VarN = xp1.n(iw2.k(av1Var, 36.0f), cj2.a(11.0f));
                    ul1 ul1Var2 = ul1Var;
                    long j3 = bk.g;
                    c30 c30Var4 = c30Var3;
                    dv1 dv1VarK = xp1.k(dv1VarN, hz.c(0.12f, j3), iy0Var);
                    er1 er1VarC = ws.c(prVar, false);
                    int iHashCode2 = Long.hashCode(ov0Var.T);
                    l72 l72VarL2 = ov0Var.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarK);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, er1VarC);
                    q73.h(ov0Var, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH2);
                    t01.a(ke0.B(), null, iw2.k(av1Var, 19.0f), j3, ov0Var, 3504, 0);
                    az2.t(ov0Var, true, av1Var, 12.0f, ov0Var);
                    yz yzVarA = wz.a(hoVar, nrVar, ov0Var, 0);
                    int iHashCode3 = Long.hashCode(ov0Var.T);
                    l72 l72VarL3 = ov0Var.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var, av1Var);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, yzVarA);
                    q73.h(ov0Var, ghVar2, l72VarL3);
                    az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH3);
                    String strN = ke0.N(2131624890, ov0Var);
                    long jB = v63.b(15.5d);
                    jr0 jr0Var2 = jr0.j;
                    hh0 hh0Var = mz.a;
                    s83.b(strN, null, ((kz) ov0Var.j(hh0Var)).q, jB, jr0Var2, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                    s83.b(ke0.N(2131624885, ov0Var), null, hz.c(0.45f, ((kz) ov0Var.j(hh0Var)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                    ov0Var.p(true);
                    ov0Var.p(true);
                    gh0.h(ov0Var, iw2.g(av1Var, 14.0f));
                    List listG = am1.G(new i52(RootSolution.AUTO, ke0.N(2131624884, ov0Var)), new i52(RootSolution.MAGISK, ke0.N(2131624887, ov0Var)), new i52(RootSolution.KERNELSU, ke0.N(2131624886, ov0Var)), new i52(RootSolution.APATCH, ke0.N(2131624883, ov0Var)), new i52(RootSolution.SUKISU_ULTRA, ke0.N(2131624889, ov0Var)), new i52(RootSolution.RESUKISU_ULTRA, ke0.N(2131624888, ov0Var)));
                    yz yzVarA2 = wz.a(new jo(8.0f, true, new fo(0)), nrVar, ov0Var, 6);
                    int iHashCode4 = Long.hashCode(ov0Var.T);
                    l72 l72VarL4 = ov0Var.l();
                    dv1 dv1VarH4 = xp1.H(ov0Var, av1Var);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var2);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, yzVarA2);
                    q73.h(ov0Var, ghVar2, l72VarL4);
                    az2.s(iHashCode4, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH4);
                    ov0Var.c0(628324129);
                    ArrayList arrayListF0 = zy.f0(listG, 3);
                    int size = arrayListF0.size();
                    int i4 = 0;
                    while (true) {
                        float f2 = 0.04f;
                        if (i4 < size) {
                            Object obj4 = arrayListF0.get(i4);
                            i4++;
                            List list = (List) obj4;
                            dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                            kk2 kk2VarA2 = jk2.a(new jo(8.0f, true, new fo(0)), j9.o, ov0Var, 6);
                            int iHashCode5 = Long.hashCode(ov0Var.T);
                            l72 l72VarL5 = ov0Var.l();
                            dv1 dv1VarH5 = xp1.H(ov0Var, dv1VarE);
                            w20.b.getClass();
                            x30 x30Var3 = v20.b;
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var3);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, v20.e, kk2VarA2);
                            q73.h(ov0Var, v20.d, l72VarL5);
                            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode5));
                            q73.g(ov0Var, v20.g);
                            q73.h(ov0Var, v20.c, dv1VarH5);
                            ov0Var.c0(-222697105);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                i52 i52Var = (i52) it.next();
                                RootSolution rootSolution = (RootSolution) i52Var.e;
                                String str = (String) i52Var.f;
                                boolean z4 = appState.getRootSolution() == rootSolution;
                                dv1 dv1VarN2 = xp1.n(new wb1(1.0f, true), cj2.a(10.0f));
                                if (z4) {
                                    jC = bk.g;
                                } else {
                                    jC = z3 ? hz.c(0.05f, hz.c) : hz.c(f2, hz.b);
                                }
                                dv1 dv1VarK2 = xp1.k(dv1VarN2, jC, iy0Var);
                                ul1 ul1Var3 = ul1Var2;
                                boolean zD = ov0Var.d(rootSolution.ordinal()) | ov0Var.h(ul1Var3);
                                Object objQ2 = ov0Var.Q();
                                if (zD) {
                                    c30Var = c30Var4;
                                } else {
                                    c30Var = c30Var4;
                                    if (objQ2 != c30Var) {
                                        i = 1;
                                    }
                                    dv1 dv1VarF = zm3.F(bk.a(dv1VarK2, (au0) objQ2), 0.0f, 9.0f, i);
                                    er1 er1VarC2 = ws.c(prVar, false);
                                    Iterator it2 = it;
                                    int iHashCode6 = Long.hashCode(ov0Var.T);
                                    l72 l72VarL6 = ov0Var.l();
                                    dv1 dv1VarH6 = xp1.H(ov0Var, dv1VarF);
                                    w20.b.getClass();
                                    x30Var = v20.b;
                                    ov0Var.g0();
                                    ArrayList arrayList = arrayListF0;
                                    if (ov0Var.S) {
                                        ov0Var.k(x30Var);
                                    } else {
                                        ov0Var.p0();
                                    }
                                    q73.h(ov0Var, v20.e, er1VarC2);
                                    q73.h(ov0Var, v20.d, l72VarL6);
                                    q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode6));
                                    q73.g(ov0Var, v20.g);
                                    q73.h(ov0Var, v20.c, dv1VarH6);
                                    if (z4) {
                                        ov0Var.c0(1536117709);
                                        ov0Var.p(false);
                                        j2 = hz.c;
                                    } else {
                                        ov0Var.c0(1536118897);
                                        j2 = ((kz) ov0Var.j(mz.a)).q;
                                        ov0Var.p(false);
                                    }
                                    long j4 = j2;
                                    long jB2 = v63.b(11.5d);
                                    if (z4) {
                                        jr0Var = jr0.j;
                                    } else {
                                        jr0Var = jr0.g;
                                    }
                                    s83.b(str, null, j4, jB2, jr0Var, null, 0L, null, null, 0L, 2, false, 1, 0, null, ov0Var, 24576, 24960, 241578);
                                    ov0Var.p(true);
                                    it = it2;
                                    c30Var4 = c30Var;
                                    arrayListF0 = arrayList;
                                    f2 = 0.04f;
                                    ul1Var2 = ul1Var3;
                                }
                                i = 1;
                                objQ2 = new qi2(1, ul1Var3, rootSolution);
                                ov0Var.m0(objQ2);
                                dv1 dv1VarF2 = zm3.F(bk.a(dv1VarK2, (au0) objQ2), 0.0f, 9.0f, i);
                                er1 er1VarC3 = ws.c(prVar, false);
                                Iterator it3 = it;
                                int iHashCode7 = Long.hashCode(ov0Var.T);
                                l72 l72VarL7 = ov0Var.l();
                                dv1 dv1VarH7 = xp1.H(ov0Var, dv1VarF2);
                                w20.b.getClass();
                                x30Var = v20.b;
                                ov0Var.g0();
                                ArrayList arrayList2 = arrayListF0;
                                if (ov0Var.S) {
                                    ov0Var.k(x30Var);
                                } else {
                                    ov0Var.p0();
                                }
                                q73.h(ov0Var, v20.e, er1VarC3);
                                q73.h(ov0Var, v20.d, l72VarL7);
                                q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode7));
                                q73.g(ov0Var, v20.g);
                                q73.h(ov0Var, v20.c, dv1VarH7);
                                if (z4) {
                                    ov0Var.c0(1536117709);
                                    ov0Var.p(false);
                                    j2 = hz.c;
                                } else {
                                    ov0Var.c0(1536118897);
                                    j2 = ((kz) ov0Var.j(mz.a)).q;
                                    ov0Var.p(false);
                                }
                                long j5 = j2;
                                long jB3 = v63.b(11.5d);
                                if (z4) {
                                    jr0Var = jr0.j;
                                } else {
                                    jr0Var = jr0.g;
                                }
                                s83.b(str, null, j5, jB3, jr0Var, null, 0L, null, null, 0L, 2, false, 1, 0, null, ov0Var, 24576, 24960, 241578);
                                ov0Var.p(true);
                                it = it3;
                                c30Var4 = c30Var;
                                arrayListF0 = arrayList2;
                                f2 = 0.04f;
                                ul1Var2 = ul1Var3;
                            }
                            ov0Var.p(false);
                            ov0Var.p(true);
                            ul1Var2 = ul1Var2;
                        } else {
                            c30 c30Var5 = c30Var4;
                            final ul1 ul1Var4 = ul1Var2;
                            ov0Var.p(false);
                            ov0Var.p(true);
                            gh0.h(ov0Var, iw2.g(av1Var, 14.0f));
                            dv1 dv1VarK3 = xp1.k(xp1.n(iw2.e(av1Var, 1.0f), cj2.a(12.0f)), z3 ? hz.c(0.04f, hz.c) : hz.c(0.03f, hz.b), iy0Var);
                            boolean zH2 = ov0Var.h(appState) | ov0Var.h(ul1Var4);
                            Object objQ3 = ov0Var.Q();
                            if (zH2 || objQ3 == c30Var5) {
                                final int i5 = 0;
                                objQ3 = new au0() { // from class: ri2
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        Object value;
                                        AppInfoItem appInfoItem;
                                        int i6 = i5;
                                        mf3 mf3Var2 = mf3.a;
                                        ul1 ul1Var5 = ul1Var4;
                                        AppState appState2 = appState;
                                        switch (i6) {
                                            case 0:
                                                if (!appState2.isTestingRootSetup()) {
                                                    ul1Var5.getClass();
                                                    BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var5), Dispatchers.getIO(), null, new sl1(ul1Var5, null, 14), 2, null);
                                                }
                                                break;
                                            default:
                                                if (!appState2.isRestartingHookedApps()) {
                                                    ul1Var5.getClass();
                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                    LSPosedManager lSPosedManager = ul1Var5.d;
                                                    Context context = ul1Var5.j;
                                                    List<AppInfoItem> hookedApps = lSPosedManager.getHookedApps(context);
                                                    ArrayList arrayList3 = new ArrayList(az.Y(hookedApps, 10));
                                                    Iterator<T> it4 = hookedApps.iterator();
                                                    while (it4.hasNext()) {
                                                        arrayList3.add(((AppInfoItem) it4.next()).getPackageName());
                                                    }
                                                    linkedHashSet.addAll(arrayList3);
                                                    linkedHashSet.addAll(ul1Var5.c.getSystemHookPackages());
                                                    Set setH0 = yo.H0(new String[]{context.getPackageName(), "android", "system", "system_server", "com.android.systemui", "com.android.phone", "com.android.bluetooth", "com.android.server.telecom", "com.xiaomi.metoknlp", "com.google.android.gms"});
                                                    PackageManager packageManager = context.getPackageManager();
                                                    ArrayList arrayList4 = new ArrayList();
                                                    for (Object obj5 : linkedHashSet) {
                                                        String str2 = (String) obj5;
                                                        if (!l13.k0(str2) && !setH0.contains(str2)) {
                                                            arrayList4.add(obj5);
                                                        }
                                                    }
                                                    ArrayList arrayList5 = new ArrayList();
                                                    int size2 = arrayList4.size();
                                                    int i7 = 0;
                                                    while (i7 < size2) {
                                                        Object obj6 = arrayList4.get(i7);
                                                        i7++;
                                                        String str3 = (String) obj6;
                                                        try {
                                                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str3, 0);
                                                            applicationInfo.getClass();
                                                            String string = packageManager.getApplicationLabel(applicationInfo).toString();
                                                            boolean z5 = true;
                                                            if ((applicationInfo.flags & 1) == 0) {
                                                                z5 = false;
                                                            }
                                                            appInfoItem = new AppInfoItem(str3, string, z5);
                                                        } catch (Exception unused) {
                                                            appInfoItem = new AppInfoItem(str3, str3, false);
                                                        }
                                                        arrayList5.add(appInfoItem);
                                                    }
                                                    List listC0 = zy.C0(arrayList5, new gq0(14));
                                                    MutableStateFlow mutableStateFlow = ul1Var5.x;
                                                    do {
                                                        value = mutableStateFlow.getValue();
                                                    } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, listC0, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -16777217, -1, 134217727, null)));
                                                }
                                                break;
                                        }
                                        return mf3Var2;
                                    }
                                };
                                ov0Var.m0(objQ3);
                            }
                            dv1 dv1VarE2 = zm3.E(bk.a(dv1VarK3, (au0) objQ3), 12.0f, 12.0f);
                            u92 u92Var = am1.i;
                            kk2 kk2VarA3 = jk2.a(u92Var, orVar, ov0Var, 54);
                            int iHashCode8 = Long.hashCode(ov0Var.T);
                            l72 l72VarL8 = ov0Var.l();
                            dv1 dv1VarH8 = xp1.H(ov0Var, dv1VarE2);
                            w20.b.getClass();
                            x30 x30Var4 = v20.b;
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var4);
                            } else {
                                ov0Var.p0();
                            }
                            gh ghVar5 = v20.e;
                            q73.h(ov0Var, ghVar5, kk2VarA3);
                            gh ghVar6 = v20.d;
                            q73.h(ov0Var, ghVar6, l72VarL8);
                            Integer numValueOf2 = Integer.valueOf(iHashCode8);
                            gh ghVar7 = v20.f;
                            q73.h(ov0Var, ghVar7, numValueOf2);
                            wa waVar2 = v20.g;
                            q73.g(ov0Var, waVar2);
                            gh ghVar8 = v20.c;
                            q73.h(ov0Var, ghVar8, dv1VarH8);
                            dv1 dv1VarA = lk2.a(lk2Var, av1Var, 1.0f);
                            yz yzVarA3 = wz.a(hoVar, nrVar, ov0Var, 0);
                            int iHashCode9 = Long.hashCode(ov0Var.T);
                            l72 l72VarL9 = ov0Var.l();
                            dv1 dv1VarH9 = xp1.H(ov0Var, dv1VarA);
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var4);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar5, yzVarA3);
                            q73.h(ov0Var, ghVar6, l72VarL9);
                            az2.s(iHashCode9, ov0Var, ghVar7, ov0Var, waVar2);
                            q73.h(ov0Var, ghVar8, dv1VarH9);
                            String strN2 = ke0.N(2131625116, ov0Var);
                            long jB4 = v63.b(13.5d);
                            jr0 jr0Var3 = jr0.i;
                            hh0 hh0Var2 = mz.a;
                            s83.b(strN2, null, ((kz) ov0Var.j(hh0Var2)).q, jB4, jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                            gh0.h(ov0Var, iw2.g(av1Var, 2.0f));
                            s83.b(ke0.N(2131625115, ov0Var), null, hz.c(0.45f, ((kz) ov0Var.j(hh0Var2)).q), v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                            ov0Var.p(true);
                            if (appState.isTestingRootSetup()) {
                                ov0Var.c0(-417337941);
                                vc2.a(iw2.k(av1Var, 18.0f), bk.g, 2.0f, 0L, 0, 0.0f, ov0Var, 438, 56);
                                ov0Var.p(false);
                            } else {
                                ov0Var.c0(-417027600);
                                t01.a(sb.S(), ke0.N(2131625116, ov0Var), iw2.k(av1Var, 18.0f), bk.g, ov0Var, 3456, 0);
                                ov0Var.p(false);
                            }
                            ov0Var.p(true);
                            gh0.h(ov0Var, iw2.g(av1Var, 8.0f));
                            dv1 dv1VarN3 = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(12.0f));
                            if (z3) {
                                j = hz.c;
                                f = 0.04f;
                            } else {
                                j = hz.b;
                                f = 0.03f;
                            }
                            dv1 dv1VarK4 = xp1.k(dv1VarN3, hz.c(f, j), iy0Var);
                            boolean zH3 = ov0Var.h(appState) | ov0Var.h(ul1Var4);
                            Object objQ4 = ov0Var.Q();
                            if (zH3 || objQ4 == c30Var5) {
                                final int i6 = 1;
                                objQ4 = new au0() { // from class: ri2
                                    @Override // defpackage.au0
                                    public final Object invoke() {
                                        Object value;
                                        AppInfoItem appInfoItem;
                                        int i7 = i6;
                                        mf3 mf3Var2 = mf3.a;
                                        ul1 ul1Var5 = ul1Var4;
                                        AppState appState2 = appState;
                                        switch (i7) {
                                            case 0:
                                                if (!appState2.isTestingRootSetup()) {
                                                    ul1Var5.getClass();
                                                    BuildersKt__Builders_commonKt.launch$default(am1.y(ul1Var5), Dispatchers.getIO(), null, new sl1(ul1Var5, null, 14), 2, null);
                                                }
                                                break;
                                            default:
                                                if (!appState2.isRestartingHookedApps()) {
                                                    ul1Var5.getClass();
                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                    LSPosedManager lSPosedManager = ul1Var5.d;
                                                    Context context = ul1Var5.j;
                                                    List<AppInfoItem> hookedApps = lSPosedManager.getHookedApps(context);
                                                    ArrayList arrayList3 = new ArrayList(az.Y(hookedApps, 10));
                                                    Iterator<T> it4 = hookedApps.iterator();
                                                    while (it4.hasNext()) {
                                                        arrayList3.add(((AppInfoItem) it4.next()).getPackageName());
                                                    }
                                                    linkedHashSet.addAll(arrayList3);
                                                    linkedHashSet.addAll(ul1Var5.c.getSystemHookPackages());
                                                    Set setH0 = yo.H0(new String[]{context.getPackageName(), "android", "system", "system_server", "com.android.systemui", "com.android.phone", "com.android.bluetooth", "com.android.server.telecom", "com.xiaomi.metoknlp", "com.google.android.gms"});
                                                    PackageManager packageManager = context.getPackageManager();
                                                    ArrayList arrayList4 = new ArrayList();
                                                    for (Object obj5 : linkedHashSet) {
                                                        String str2 = (String) obj5;
                                                        if (!l13.k0(str2) && !setH0.contains(str2)) {
                                                            arrayList4.add(obj5);
                                                        }
                                                    }
                                                    ArrayList arrayList5 = new ArrayList();
                                                    int size2 = arrayList4.size();
                                                    int i8 = 0;
                                                    while (i8 < size2) {
                                                        Object obj6 = arrayList4.get(i8);
                                                        i8++;
                                                        String str3 = (String) obj6;
                                                        try {
                                                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str3, 0);
                                                            applicationInfo.getClass();
                                                            String string = packageManager.getApplicationLabel(applicationInfo).toString();
                                                            boolean z5 = true;
                                                            if ((applicationInfo.flags & 1) == 0) {
                                                                z5 = false;
                                                            }
                                                            appInfoItem = new AppInfoItem(str3, string, z5);
                                                        } catch (Exception unused) {
                                                            appInfoItem = new AppInfoItem(str3, str3, false);
                                                        }
                                                        arrayList5.add(appInfoItem);
                                                    }
                                                    List listC0 = zy.C0(arrayList5, new gq0(14));
                                                    MutableStateFlow mutableStateFlow = ul1Var5.x;
                                                    do {
                                                        value = mutableStateFlow.getValue();
                                                    } while (!mutableStateFlow.compareAndSet(value, AppState.copy$default((AppState) value, null, null, null, false, false, null, false, null, null, false, false, false, null, 0, false, 0, null, 0, false, null, false, false, null, false, listC0, false, null, null, false, false, false, null, null, 0, null, null, null, null, 0.0f, null, null, null, null, null, 0.0d, false, 0, false, false, null, false, false, null, false, false, null, false, false, null, false, false, false, null, null, null, 0, 0, 0, 0, null, null, false, false, null, false, null, null, null, false, false, false, false, false, null, 0, null, false, false, false, null, null, -16777217, -1, 134217727, null)));
                                                }
                                                break;
                                        }
                                        return mf3Var2;
                                    }
                                };
                                ov0Var.m0(objQ4);
                            }
                            dv1 dv1VarE3 = zm3.E(bk.a(dv1VarK4, (au0) objQ4), 12.0f, 12.0f);
                            kk2 kk2VarA4 = jk2.a(u92Var, orVar, ov0Var, 54);
                            int iHashCode10 = Long.hashCode(ov0Var.T);
                            l72 l72VarL10 = ov0Var.l();
                            dv1 dv1VarH10 = xp1.H(ov0Var, dv1VarE3);
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var4);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar5, kk2VarA4);
                            q73.h(ov0Var, ghVar6, l72VarL10);
                            az2.s(iHashCode10, ov0Var, ghVar7, ov0Var, waVar2);
                            q73.h(ov0Var, ghVar8, dv1VarH10);
                            dv1 dv1VarA2 = lk2.a(lk2Var, av1Var, 1.0f);
                            yz yzVarA4 = wz.a(hoVar, nrVar, ov0Var, 0);
                            int iHashCode11 = Long.hashCode(ov0Var.T);
                            l72 l72VarL11 = ov0Var.l();
                            dv1 dv1VarH11 = xp1.H(ov0Var, dv1VarA2);
                            ov0Var.g0();
                            if (ov0Var.S) {
                                ov0Var.k(x30Var4);
                            } else {
                                ov0Var.p0();
                            }
                            q73.h(ov0Var, ghVar5, yzVarA4);
                            q73.h(ov0Var, ghVar6, l72VarL11);
                            az2.s(iHashCode11, ov0Var, ghVar7, ov0Var, waVar2);
                            q73.h(ov0Var, ghVar8, dv1VarH11);
                            s83.b(ke0.N(2131624863, ov0Var), null, ((kz) ov0Var.j(hh0Var2)).q, v63.b(13.5d), jr0Var3, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                            gh0.h(ov0Var, iw2.g(av1Var, 2.0f));
                            s83.b(ke0.N(2131624860, ov0Var), null, hz.c(0.45f, ((kz) ov0Var.j(hh0Var2)).q), v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                            ov0Var.p(true);
                            if (appState.isRestartingHookedApps()) {
                                ov0Var.c0(-2071263480);
                                vc2.a(iw2.k(av1Var, 18.0f), bk.i, 2.0f, 0L, 0, 0.0f, ov0Var, 438, 56);
                                ov0Var.p(false);
                            } else {
                                ov0Var.c0(-2070951031);
                                t01.a(sb.S(), ke0.N(2131624863, ov0Var), iw2.k(av1Var, 18.0f), bk.i, ov0Var, 3456, 0);
                                ov0Var.p(false);
                            }
                            ov0Var.p(true);
                        }
                    }
                } else {
                    ov0Var.W();
                }
                return mf3Var;
            case 1:
                return f(obj, obj2, obj3);
            case 2:
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dv1 dv1VarF3 = zm3.F(iw2.e(av1Var, 1.0f), 0.0f, 4.0f, 1);
                    er1 er1VarC4 = ws.c(j9.f, false);
                    int iHashCode12 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL12 = ov0Var2.l();
                    dv1 dv1VarH12 = xp1.H(ov0Var2, dv1VarF3);
                    w20.b.getClass();
                    x30 x30Var5 = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var5);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, v20.e, er1VarC4);
                    q73.h(ov0Var2, v20.d, l72VarL12);
                    q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode12));
                    q73.g(ov0Var2, v20.g);
                    q73.h(ov0Var2, v20.c, dv1VarH12);
                    zm3.b(iw2.e(av1Var, 1.0f), 16.0f, new b52(14.0f, 12.0f, 14.0f, 12.0f), sb.a0(-1253215042, new pi2(appState, z3, ul1Var, 3), ov0Var2), ov0Var2, 25014, 8);
                    ov0Var2.p(true);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            default:
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ov0Var3.W();
                    return mf3Var;
                }
                ho hoVar2 = am1.g;
                nr nrVar2 = j9.r;
                yz yzVarA5 = wz.a(hoVar2, nrVar2, ov0Var3, 0);
                int iHashCode13 = Long.hashCode(ov0Var3.T);
                l72 l72VarL13 = ov0Var3.l();
                dv1 dv1VarH13 = xp1.H(ov0Var3, av1Var);
                w20.b.getClass();
                x30 x30Var6 = v20.b;
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(x30Var6);
                } else {
                    ov0Var3.p0();
                }
                gh ghVar9 = v20.e;
                q73.h(ov0Var3, ghVar9, yzVarA5);
                gh ghVar10 = v20.d;
                q73.h(ov0Var3, ghVar10, l72VarL13);
                Integer numValueOf3 = Integer.valueOf(iHashCode13);
                gh ghVar11 = v20.f;
                q73.h(ov0Var3, ghVar11, numValueOf3);
                wa waVar3 = v20.g;
                q73.g(ov0Var3, waVar3);
                gh ghVar12 = v20.c;
                q73.h(ov0Var3, ghVar12, dv1VarH13);
                dv1 dv1VarE4 = iw2.e(av1Var, 1.0f);
                or orVar2 = j9.p;
                go goVar = am1.e;
                kk2 kk2VarA5 = jk2.a(goVar, orVar2, ov0Var3, 48);
                int iHashCode14 = Long.hashCode(ov0Var3.T);
                l72 l72VarL14 = ov0Var3.l();
                dv1 dv1VarH14 = xp1.H(ov0Var3, dv1VarE4);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(x30Var6);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar9, kk2VarA5);
                q73.h(ov0Var3, ghVar10, l72VarL14);
                az2.s(iHashCode14, ov0Var3, ghVar11, ov0Var3, waVar3);
                q73.h(ov0Var3, ghVar12, dv1VarH14);
                dv1 dv1VarN4 = xp1.n(iw2.k(av1Var, 38.0f), cj2.a(11.0f));
                if (appState.isSystemHookGlobalMode()) {
                    jC2 = hz.c(0.16f, bk.g);
                } else {
                    jC2 = z3 ? hz.c(0.08f, hz.c) : hz.c(0.05f, hz.b);
                }
                iy0 iy0Var2 = o51.p0;
                dv1 dv1VarK5 = xp1.k(dv1VarN4, jC2, iy0Var2);
                er1 er1VarC5 = ws.c(j9.j, false);
                int iHashCode15 = Long.hashCode(ov0Var3.T);
                l72 l72VarL15 = ov0Var3.l();
                dv1 dv1VarH15 = xp1.H(ov0Var3, dv1VarK5);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(x30Var6);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar9, er1VarC5);
                q73.h(ov0Var3, ghVar10, l72VarL15);
                az2.s(iHashCode15, ov0Var3, ghVar11, ov0Var3, waVar3);
                q73.h(ov0Var3, ghVar12, dv1VarH15);
                x01 x01VarB = ld0.e;
                if (x01VarB == null) {
                    w01 w01Var = new w01("Rounded.Public", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i7 = nh3.a;
                    qy2 qy2Var = new qy2(hz.b);
                    nx0 nx0VarI = p91.i(12.0f, 2.0f);
                    nx0VarI.f(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    nx0VarI.o(4.48f, 10.0f, 10.0f, 10.0f);
                    nx0VarI.o(10.0f, -4.48f, 10.0f, -10.0f);
                    nx0VarI.n(17.52f, 2.0f, 12.0f, 2.0f);
                    nx0VarI.e();
                    nx0VarI.m(11.0f, 19.93f);
                    nx0VarI.g(-3.95f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f);
                    nx0VarI.g(0.0f, -0.62f, 0.08f, -1.21f, 0.21f, -1.79f);
                    nx0VarI.k(9.0f, 15.0f);
                    nx0VarI.s(1.0f);
                    nx0VarI.g(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    nx0VarI.s(1.93f);
                    nx0VarI.e();
                    nx0VarI.m(17.9f, 17.39f);
                    nx0VarI.g(-0.26f, -0.81f, -1.0f, -1.39f, -1.9f, -1.39f);
                    nx0VarI.i(-1.0f);
                    nx0VarI.s(-3.0f);
                    nx0VarI.g(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                    nx0VarI.k(8.0f, 12.0f);
                    nx0VarI.s(-2.0f);
                    nx0VarI.i(2.0f);
                    nx0VarI.g(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                    nx0VarI.k(11.0f, 7.0f);
                    nx0VarI.i(2.0f);
                    nx0VarI.g(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    nx0VarI.s(-0.41f);
                    nx0VarI.g(2.93f, 1.19f, 5.0f, 4.06f, 5.0f, 7.41f);
                    nx0VarI.g(0.0f, 2.08f, -0.8f, 3.97f, -2.1f, 5.39f);
                    nx0VarI.e();
                    w01.a(w01Var, nx0VarI.a, qy2Var);
                    x01VarB = w01Var.b();
                    ld0.e = x01VarB;
                }
                x01 x01Var = x01VarB;
                if (appState.isSystemHookGlobalMode()) {
                    ov0Var3.c0(482924520);
                    i2 = 0;
                    ov0Var3.p(false);
                    jC3 = bk.g;
                } else {
                    i2 = 0;
                    ov0Var3.c0(482926192);
                    jC3 = hz.c(0.6f, ((kz) ov0Var3.j(mz.a)).q);
                    ov0Var3.p(false);
                }
                t01.a(x01Var, null, iw2.k(av1Var, 20.0f), jC3, ov0Var3, 432, 0);
                az2.t(ov0Var3, true, av1Var, 12.0f, ov0Var3);
                dv1 dv1VarA3 = lk2.a(lk2Var, av1Var, 1.0f);
                yz yzVarA6 = wz.a(hoVar2, nrVar2, ov0Var3, i2);
                int iHashCode16 = Long.hashCode(ov0Var3.T);
                l72 l72VarL16 = ov0Var3.l();
                dv1 dv1VarH16 = xp1.H(ov0Var3, dv1VarA3);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(x30Var6);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar9, yzVarA6);
                q73.h(ov0Var3, ghVar10, l72VarL16);
                az2.s(iHashCode16, ov0Var3, ghVar11, ov0Var3, waVar3);
                q73.h(ov0Var3, ghVar12, dv1VarH16);
                String strN3 = ke0.N(2131625096, ov0Var3);
                long jC4 = v63.c(15);
                jr0 jr0Var4 = jr0.j;
                hh0 hh0Var3 = mz.a;
                s83.b(strN3, null, ((kz) ov0Var3.j(hh0Var3)).q, jC4, jr0Var4, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 1597440, 0, 262058);
                gh0.h(ov0Var3, iw2.g(av1Var, 2.0f));
                s83.b(ke0.N(2131625095, ov0Var3), null, hz.c(0.55f, ((kz) ov0Var3.j(hh0Var3)).q), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                az2.t(ov0Var3, true, av1Var, 8.0f, ov0Var3);
                boolean zIsSystemHookGlobalMode = appState.isSystemHookGlobalMode();
                boolean zH4 = ov0Var3.h(ul1Var);
                Object objQ5 = ov0Var3.Q();
                if (!zH4) {
                    c30Var2 = c30Var3;
                    if (objQ5 == c30Var2) {
                    }
                    b43.a(zIsSystemHookGlobalMode, (lu0) objQ5, null, false, null, ov0Var3, 0, 124);
                    ov0Var3.p(true);
                    ov0Var3.c0(1774200134);
                    gh0.h(ov0Var3, iw2.g(av1Var, 8.0f));
                    dv1 dv1VarE5 = iw2.e(av1Var, 1.0f);
                    c30 c30Var6 = c30Var2;
                    kk2 kk2VarA6 = jk2.a(goVar, orVar2, ov0Var3, 48);
                    int iHashCode17 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL17 = ov0Var3.l();
                    dv1 dv1VarH17 = xp1.H(ov0Var3, dv1VarE5);
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var6);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, ghVar9, kk2VarA6);
                    q73.h(ov0Var3, ghVar10, l72VarL17);
                    az2.s(iHashCode17, ov0Var3, ghVar11, ov0Var3, waVar3);
                    q73.h(ov0Var3, ghVar12, dv1VarH17);
                    dv1 dv1VarA4 = lk2.a(lk2Var, av1Var, 1.0f);
                    yz yzVarA7 = wz.a(hoVar2, nrVar2, ov0Var3, 0);
                    int iHashCode18 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL18 = ov0Var3.l();
                    dv1 dv1VarH18 = xp1.H(ov0Var3, dv1VarA4);
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var6);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, ghVar9, yzVarA7);
                    q73.h(ov0Var3, ghVar10, l72VarL18);
                    az2.s(iHashCode18, ov0Var3, ghVar11, ov0Var3, waVar3);
                    q73.h(ov0Var3, ghVar12, dv1VarH18);
                    s83.b(ke0.N(2131625100, ov0Var3), null, 0L, v63.c(14), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262126);
                    s83.b(ke0.N(2131625099, ov0Var3), null, hz.c(0.6f, ((kz) ov0Var3.j(hh0Var3)).q), v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                    ov0Var3.p(true);
                    boolean forceLocationEnabled = appState.getForceLocationEnabled();
                    zH = ov0Var3.h(ul1Var);
                    objQ = ov0Var3.Q();
                    if (zH || objQ == c30Var6) {
                        objQ = new qi1(ul1Var, 13);
                        ov0Var3.m0(objQ);
                    }
                    b43.a(forceLocationEnabled, (lu0) objQ, null, false, null, ov0Var3, 0, 124);
                    ov0Var3.p(true);
                    ov0Var3.p(false);
                    if (appState.isSystemHookGlobalMode()) {
                        ov0Var3.c0(1775194676);
                        gh0.h(ov0Var3, iw2.g(av1Var, 8.0f));
                        dv1 dv1VarN5 = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(8.0f));
                        long j6 = bk.g;
                        dv1 dv1VarE6 = zm3.E(xp1.k(dv1VarN5, hz.c(0.08f, j6), iy0Var2), 10.0f, 6.0f);
                        kk2 kk2VarA7 = jk2.a(goVar, orVar2, ov0Var3, 48);
                        int iHashCode19 = Long.hashCode(ov0Var3.T);
                        l72 l72VarL19 = ov0Var3.l();
                        dv1 dv1VarH19 = xp1.H(ov0Var3, dv1VarE6);
                        ov0Var3.g0();
                        if (ov0Var3.S) {
                            ov0Var3.k(x30Var6);
                        } else {
                            ov0Var3.p0();
                        }
                        q73.h(ov0Var3, ghVar9, kk2VarA7);
                        q73.h(ov0Var3, ghVar10, l72VarL19);
                        az2.s(iHashCode19, ov0Var3, ghVar11, ov0Var3, waVar3);
                        q73.h(ov0Var3, ghVar12, dv1VarH19);
                        t01.a(xq1.G(), null, iw2.k(av1Var, 14.0f), j6, ov0Var3, 3504, 0);
                        s83.b(az2.i(av1Var, 6.0f, ov0Var3, 2131625094, ov0Var3), null, j6, v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24960, 0, 262122);
                        z = true;
                        ov0Var3.p(true);
                        z2 = false;
                    } else {
                        z = true;
                        z2 = false;
                        ov0Var3.c0(1763316282);
                    }
                    ov0Var3.p(z2);
                    ov0Var3.p(z);
                    return mf3Var;
                }
                c30Var2 = c30Var3;
                objQ5 = new qi1(ul1Var, 12);
                ov0Var3.m0(objQ5);
                b43.a(zIsSystemHookGlobalMode, (lu0) objQ5, null, false, null, ov0Var3, 0, 124);
                ov0Var3.p(true);
                ov0Var3.c0(1774200134);
                gh0.h(ov0Var3, iw2.g(av1Var, 8.0f));
                dv1 dv1VarE7 = iw2.e(av1Var, 1.0f);
                c30 c30Var7 = c30Var2;
                kk2 kk2VarA8 = jk2.a(goVar, orVar2, ov0Var3, 48);
                int iHashCode110 = Long.hashCode(ov0Var3.T);
                l72 l72VarL110 = ov0Var3.l();
                dv1 dv1VarH110 = xp1.H(ov0Var3, dv1VarE7);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(x30Var6);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar9, kk2VarA8);
                q73.h(ov0Var3, ghVar10, l72VarL110);
                az2.s(iHashCode110, ov0Var3, ghVar11, ov0Var3, waVar3);
                q73.h(ov0Var3, ghVar12, dv1VarH110);
                dv1 dv1VarA5 = lk2.a(lk2Var, av1Var, 1.0f);
                yz yzVarA8 = wz.a(hoVar2, nrVar2, ov0Var3, 0);
                int iHashCode111 = Long.hashCode(ov0Var3.T);
                l72 l72VarL111 = ov0Var3.l();
                dv1 dv1VarH111 = xp1.H(ov0Var3, dv1VarA5);
                ov0Var3.g0();
                if (ov0Var3.S) {
                    ov0Var3.k(x30Var6);
                } else {
                    ov0Var3.p0();
                }
                q73.h(ov0Var3, ghVar9, yzVarA8);
                q73.h(ov0Var3, ghVar10, l72VarL111);
                az2.s(iHashCode111, ov0Var3, ghVar11, ov0Var3, waVar3);
                q73.h(ov0Var3, ghVar12, dv1VarH111);
                s83.b(ke0.N(2131625100, ov0Var3), null, 0L, v63.c(14), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262126);
                s83.b(ke0.N(2131625099, ov0Var3), null, hz.c(0.6f, ((kz) ov0Var3.j(hh0Var3)).q), v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                ov0Var3.p(true);
                boolean forceLocationEnabled2 = appState.getForceLocationEnabled();
                zH = ov0Var3.h(ul1Var);
                objQ = ov0Var3.Q();
                if (zH) {
                    objQ = new qi1(ul1Var, 13);
                    ov0Var3.m0(objQ);
                } else {
                    objQ = new qi1(ul1Var, 13);
                    ov0Var3.m0(objQ);
                }
                b43.a(forceLocationEnabled2, (lu0) objQ, null, false, null, ov0Var3, 0, 124);
                ov0Var3.p(true);
                ov0Var3.p(false);
                if (appState.isSystemHookGlobalMode()) {
                    ov0Var3.c0(1775194676);
                    gh0.h(ov0Var3, iw2.g(av1Var, 8.0f));
                    dv1 dv1VarN6 = xp1.n(iw2.e(av1Var, 1.0f), cj2.a(8.0f));
                    long j7 = bk.g;
                    dv1 dv1VarE8 = zm3.E(xp1.k(dv1VarN6, hz.c(0.08f, j7), iy0Var2), 10.0f, 6.0f);
                    kk2 kk2VarA9 = jk2.a(goVar, orVar2, ov0Var3, 48);
                    int iHashCode112 = Long.hashCode(ov0Var3.T);
                    l72 l72VarL112 = ov0Var3.l();
                    dv1 dv1VarH112 = xp1.H(ov0Var3, dv1VarE8);
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var6);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, ghVar9, kk2VarA9);
                    q73.h(ov0Var3, ghVar10, l72VarL112);
                    az2.s(iHashCode112, ov0Var3, ghVar11, ov0Var3, waVar3);
                    q73.h(ov0Var3, ghVar12, dv1VarH112);
                    t01.a(xq1.G(), null, iw2.k(av1Var, 14.0f), j7, ov0Var3, 3504, 0);
                    s83.b(az2.i(av1Var, 6.0f, ov0Var3, 2131625094, ov0Var3), null, j7, v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24960, 0, 262122);
                    z = true;
                    ov0Var3.p(true);
                    z2 = false;
                } else {
                    z = true;
                    z2 = false;
                    ov0Var3.c0(1763316282);
                }
                ov0Var3.p(z2);
                ov0Var3.p(z);
                return mf3Var;
        }
    }

    public /* synthetic */ pi2(AppState appState, boolean z, ul1 ul1Var, int i) {
        this.e = i;
        this.f = appState;
        this.h = z;
        this.g = ul1Var;
    }

    public /* synthetic */ pi2(boolean z, AppState appState, ul1 ul1Var) {
        this.e = 0;
        this.h = z;
        this.f = appState;
        this.g = ul1Var;
    }
}
