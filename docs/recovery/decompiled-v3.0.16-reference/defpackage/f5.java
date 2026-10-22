package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountDevice;
import com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates;
import com.vincenthzr.locationspoofer.data.update.UpdateArtifact;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class f5 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ f5(l6 l6Var, CloudAccountDevice cloudAccountDevice, ey1 ey1Var) {
        this.e = 8;
        this.g = l6Var;
        this.h = cloudAccountDevice;
        this.f = ey1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        c30 c30Var = d30.a;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                u4 u4Var = (u4) obj5;
                ey1 ey1Var = (ey1) obj4;
                ey1 ey1Var2 = (ey1) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else if (u4Var.a) {
                    ov0Var.c0(1533124105);
                    s83.b(ke0.O(2131624235, new Object[]{Integer.valueOf(((String) ey1Var.getValue()).length())}, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                    ov0Var.p(false);
                } else {
                    if (((Boolean) ey1Var2.getValue()).booleanValue()) {
                        ov0Var.c0(1533127763);
                        s83.b(ke0.N(2131624233, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                        z = false;
                    } else {
                        z = false;
                        ov0Var.c0(264226753);
                    }
                    ov0Var.p(z);
                }
                return mf3Var;
            case 1:
                dv1 dv1Var = (dv1) obj5;
                ey1 ey1Var3 = (ey1) obj4;
                p10 p10Var = (p10) obj3;
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objQ = ov0Var2.Q();
                    if (objQ == c30Var) {
                        objQ = new f4(ey1Var3, 10);
                        ov0Var2.m0(objQ);
                    }
                    dv1 dv1VarG = k22.G(dv1Var, (lu0) objQ);
                    er1 er1VarC = ws.c(j9.f, true);
                    int iHashCode = Long.hashCode(ov0Var2.T);
                    l72 l72VarL = ov0Var2.l();
                    dv1 dv1VarH = xp1.H(ov0Var2, dv1VarG);
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
                    p10Var.invoke(ov0Var2, 0);
                    ov0Var2.p(true);
                } else {
                    ov0Var2.W();
                }
                return mf3Var;
            case 2:
                ((Integer) obj2).getClass();
                k22.e((dv1) obj5, (x73) obj4, (p10) obj3, (f30) obj, wc0.m0(385));
                return mf3Var;
            case 3:
                pu0 pu0Var = (pu0) obj5;
                ey1 ey1Var4 = (ey1) obj4;
                ey1 ey1Var5 = (ey1) obj3;
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zF = ov0Var3.f(pu0Var);
                    Object objQ2 = ov0Var3.Q();
                    if (zF || objQ2 == c30Var) {
                        objQ2 = new q5(pu0Var, ey1Var4, ey1Var5, 2);
                        ov0Var3.m0(objQ2);
                    }
                    n51.j((au0) objQ2, null, false, null, null, null, am1.n, ov0Var3, 805306368, 510);
                } else {
                    ov0Var3.W();
                }
                return mf3Var;
            case 4:
                Context context = (Context) obj5;
                Configuration configuration = (Configuration) obj4;
                p10 p10Var2 = (p10) obj3;
                f30 f30Var4 = (f30) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i2 = 1;
                ov0 ov0Var4 = (ov0) f30Var4;
                if (ov0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    k22.c(new kk[]{AndroidCompositionLocals_androidKt.b.a(context), AndroidCompositionLocals_androidKt.a.a(configuration)}, sb.a0(-629437822, new c9(p10Var2, i2), ov0Var4), ov0Var4, 56);
                } else {
                    ov0Var4.W();
                }
                return mf3Var;
            case Logger.WARN /* 5 */:
                ul1 ul1Var = (ul1) obj5;
                lu0 lu0Var = (lu0) obj4;
                lr2 lr2Var = (lr2) obj3;
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                rm1.j(ul1Var, str);
                rm1.k(ul1Var, str2);
                Double dR = r13.R(str);
                if (dR != null) {
                    double dDoubleValue = dR.doubleValue();
                    Double dR2 = r13.R(str2);
                    if (dR2 != null) {
                        double dDoubleValue2 = dR2.doubleValue();
                        if (lr2Var != null) {
                            lr2Var.d(dDoubleValue, dDoubleValue2, Float.valueOf(17.5f));
                        }
                    }
                }
                lu0Var.invoke(new iz2(false));
                return mf3Var;
            case Logger.ERROR /* 6 */:
                ((Integer) obj2).getClass();
                wc0.b((is1) obj5, (au0) obj4, (au0) obj3, (f30) obj, wc0.m0(1));
                return mf3Var;
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                ((Integer) obj2).getClass();
                ee0.h((uz) obj5, (s93) obj4, (p10) obj3, (f30) obj, wc0.m0(385));
                return mf3Var;
            case 8:
                l6 l6Var = (l6) obj5;
                CloudAccountDevice cloudAccountDevice = (CloudAccountDevice) obj3;
                ey1 ey1Var6 = (ey1) obj4;
                f30 f30Var5 = (f30) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ov0 ov0Var5 = (ov0) f30Var5;
                if (ov0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zH = ov0Var5.h(l6Var) | ov0Var5.h(cloudAccountDevice);
                    Object objQ3 = ov0Var5.Q();
                    if (zH || objQ3 == c30Var) {
                        objQ3 = new b5(l6Var, cloudAccountDevice, ey1Var6, 1);
                        ov0Var5.m0(objQ3);
                    }
                    n51.j((au0) objQ3, null, false, null, null, null, da0.y, ov0Var5, 805306368, 510);
                } else {
                    ov0Var5.W();
                }
                return mf3Var;
            case mc0.b /* 9 */:
                s52 s52Var = (s52) obj5;
                lu0 lu0Var2 = (lu0) obj4;
                String str3 = (String) obj3;
                f30 f30Var6 = (f30) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ov0 ov0Var6 = (ov0) f30Var6;
                if (!ov0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ov0Var6.W();
                    return mf3Var;
                }
                av1 av1Var = av1.a;
                dv1 dv1VarD = zm3.D(iw2.e(av1Var, 1.0f), 12.0f);
                jo joVar = new jo(8.0f, true, new fo(0));
                nr nrVar = j9.r;
                yz yzVarA = wz.a(joVar, nrVar, ov0Var6, 6);
                int iHashCode2 = Long.hashCode(ov0Var6.T);
                l72 l72VarL2 = ov0Var6.l();
                dv1 dv1VarH2 = xp1.H(ov0Var6, dv1VarD);
                w20.b.getClass();
                x30 x30Var2 = v20.b;
                ov0Var6.g0();
                if (ov0Var6.S) {
                    ov0Var6.k(x30Var2);
                } else {
                    ov0Var6.p0();
                }
                gh ghVar = v20.e;
                q73.h(ov0Var6, ghVar, yzVarA);
                gh ghVar2 = v20.d;
                q73.h(ov0Var6, ghVar2, l72VarL2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                gh ghVar3 = v20.f;
                q73.h(ov0Var6, ghVar3, numValueOf);
                wa waVar = v20.g;
                q73.g(ov0Var6, waVar);
                gh ghVar4 = v20.c;
                q73.h(ov0Var6, ghVar4, dv1VarH2);
                dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                kk2 kk2VarA = jk2.a(am1.i, j9.p, ov0Var6, 54);
                int iHashCode3 = Long.hashCode(ov0Var6.T);
                l72 l72VarL3 = ov0Var6.l();
                dv1 dv1VarH3 = xp1.H(ov0Var6, dv1VarE);
                ov0Var6.g0();
                if (ov0Var6.S) {
                    ov0Var6.k(x30Var2);
                } else {
                    ov0Var6.p0();
                }
                q73.h(ov0Var6, ghVar, kk2VarA);
                q73.h(ov0Var6, ghVar2, l72VarL3);
                az2.s(iHashCode3, ov0Var6, ghVar3, ov0Var6, waVar);
                q73.h(ov0Var6, ghVar4, dv1VarH3);
                yz yzVarA2 = wz.a(am1.g, nrVar, ov0Var6, 0);
                int iHashCode4 = Long.hashCode(ov0Var6.T);
                l72 l72VarL4 = ov0Var6.l();
                dv1 dv1VarH4 = xp1.H(ov0Var6, av1Var);
                ov0Var6.g0();
                if (ov0Var6.S) {
                    ov0Var6.k(x30Var2);
                } else {
                    ov0Var6.p0();
                }
                q73.h(ov0Var6, ghVar, yzVarA2);
                q73.h(ov0Var6, ghVar2, l72VarL4);
                az2.s(iHashCode4, ov0Var6, ghVar3, ov0Var6, waVar);
                q73.h(ov0Var6, ghVar4, dv1VarH4);
                String strN = ke0.N(2131624369, ov0Var6);
                long jC = v63.c(12);
                jr0 jr0Var = jr0.j;
                hh0 hh0Var = mz.a;
                s83.b(strN, null, ((kz) ov0Var6.j(hh0Var)).q, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 1597440, 0, 262058);
                s83.b(ke0.O(2131624815, new Object[]{str3}, ov0Var6), null, hz.c(0.6f, ((kz) ov0Var6.j(hh0Var)).q), v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 24576, 0, 262122);
                ov0Var6.p(true);
                Locale locale = Locale.US;
                String str4 = String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(s52Var.g())}, 1)) + " m/s (" + String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) s52Var.g()) * 3.6d)}, 1)) + " km/h)";
                long jC2 = v63.c(13);
                long j = bk.g;
                s83.b(str4, null, j, jC2, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var6, 1597824, 0, 262058);
                ov0Var6.p(true);
                float fG = s52Var.g();
                boolean zF2 = ov0Var6.f(s52Var) | ov0Var6.f(lu0Var2);
                Object objQ4 = ov0Var6.Q();
                if (zF2 || objQ4 == c30Var) {
                    objQ4 = new u9(lu0Var2, s52Var, 2);
                    ov0Var6.m0(objQ4);
                }
                fy fyVar = new fy(0.2f, 45.0f);
                sw2 sw2Var = sw2.a;
                dx2.a(fG, (lu0) objQ4, null, false, fyVar, 447, null, sw2.d(j, j, ((kz) ov0Var6.j(hh0Var)).r, ov0Var6, 1012), null, ov0Var6, 196608, 332);
                ov0 ov0Var7 = ov0Var6;
                dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                kk2 kk2VarA2 = jk2.a(new jo(6.0f, true, new fo(0)), j9.o, ov0Var7, 6);
                int iHashCode5 = Long.hashCode(ov0Var7.T);
                l72 l72VarL5 = ov0Var7.l();
                dv1 dv1VarH5 = xp1.H(ov0Var7, dv1VarE2);
                ov0Var7.g0();
                if (ov0Var7.S) {
                    ov0Var7.k(x30Var2);
                } else {
                    ov0Var7.p0();
                }
                q73.h(ov0Var7, ghVar, kk2VarA2);
                q73.h(ov0Var7, ghVar2, l72VarL5);
                az2.s(iHashCode5, ov0Var7, ghVar3, ov0Var7, waVar);
                q73.h(ov0Var7, ghVar4, dv1VarH5);
                ov0Var7.c0(-2045774355);
                Iterator it = am1.G(Float.valueOf(-1.0f), Float.valueOf(-0.2f), Float.valueOf(0.2f), Float.valueOf(1.0f)).iterator();
                while (it.hasNext()) {
                    final float fFloatValue = ((Number) it.next()).floatValue();
                    bj2 bj2VarA = cj2.a(8.0f);
                    long jC3 = hz.c(0.6f, ((kz) ov0Var7.j(mz.a)).r);
                    wb1 wb1Var = new wb1(1.0f, true);
                    boolean zF3 = ov0Var7.f(s52Var) | ov0Var7.c(fFloatValue) | ov0Var7.f(lu0Var2);
                    Object objQ5 = ov0Var7.Q();
                    if (zF3 || objQ5 == c30Var) {
                        objQ5 = new dd(fFloatValue, lu0Var2, s52Var);
                        ov0Var7.m0(objQ5);
                    }
                    ov0 ov0Var8 = ov0Var7;
                    e33.a(zm3.m(wb1Var, false, null, (au0) objQ5, 15), bj2VarA, jC3, 0L, 0.0f, 0.0f, null, sb.a0(230135032, new pu0() { // from class: mj2
                        @Override // defpackage.pu0
                        public final Object invoke(Object obj6, Object obj7) {
                            f30 f30Var7 = (f30) obj6;
                            int iIntValue7 = ((Integer) obj7).intValue();
                            ov0 ov0Var9 = (ov0) f30Var7;
                            if (ov0Var9.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                float f = fFloatValue;
                                StringBuilder sb = f > 0.0f ? new StringBuilder("+") : new StringBuilder();
                                sb.append(f);
                                sb.append("m/s");
                                String string = sb.toString();
                                s83.b(string, zm3.F(av1.a, 0.0f, 4.0f, 1), ((kz) ov0Var9.j(mz.a)).q, v63.b(10.5d), null, null, 0L, null, new m53(3), 0L, 0, false, 0, 0, null, ov0Var9, 24624, 0, 261096);
                            } else {
                                ov0Var9.W();
                            }
                            return mf3.a;
                        }
                    }, ov0Var7), ov0Var8, 12582912, 120);
                    ov0Var7 = ov0Var8;
                }
                ov0Var7.p(false);
                ov0Var7.p(true);
                ov0Var7.p(true);
                return mf3Var;
            case mc0.c /* 10 */:
                te2 te2Var = (te2) obj5;
                wo2 wo2Var = (wo2) obj4;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jH = wo2Var.h(wo2Var.d(fFloatValue2 - te2Var.e));
                wo2 wo2Var2 = ((uo2) obj3).a;
                te2Var.e += wo2Var.d(wo2Var.g(wo2Var2.c(wo2Var2.k, jH, 1)));
                return mf3Var;
            default:
                return SelfHostedUpdates.download$lambda$3((UpdateArtifact) obj5, (File) obj4, (lu0) obj3, (qg2) obj, (au0) obj2);
        }
    }

    public /* synthetic */ f5(Object obj, Object obj2, xu0 xu0Var, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.f = obj2;
        this.h = xu0Var;
    }

    public /* synthetic */ f5(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.g = obj;
        this.f = obj2;
        this.h = obj3;
    }
}
