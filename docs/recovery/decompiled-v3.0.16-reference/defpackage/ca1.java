package defpackage;

import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ca1 {
    public static final List a = am1.G(new ba1("English", "en", "English"), new ba1("Chinese", "zh", "简体中文"), new ba1("Arabic", "ar", "العربية"));

    public static final void a(ba1 ba1Var, boolean z, au0 au0Var, f30 f30Var, int i) {
        long jC;
        au0Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(390491957);
        int i2 = i | (ov0Var.f(ba1Var) ? 4 : 2) | (ov0Var.g(z) ? 32 : 16) | (ov0Var.h(au0Var) ? 256 : WorkQueueKt.BUFFER_CAPACITY);
        if (ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
            bj2 bj2VarA = cj2.a(12.0f);
            if (z) {
                ov0Var.c0(1600623527);
                ov0Var.p(false);
                jC = hz.c(0.1f, bk.g);
            } else {
                ov0Var.c0(1600625116);
                long j = ((kz) ov0Var.j(mz.a)).p;
                ov0Var.p(false);
                jC = j;
            }
            e33.b(au0Var, iw2.e(av1.a, 1.0f), false, bj2VarA, jC, 0L, 0.0f, z ? da0.h(2.0f, bk.g) : null, null, sb.a0(-843296704, new ty(z, ba1Var, 3), ov0Var), ov0Var, ((i2 >> 6) & 14) | 48, 740);
        } else {
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new o2(ba1Var, z, au0Var, i);
        }
    }

    public static final void b(ul1 ul1Var, f30 f30Var, int i) {
        ul1 ul1Var2;
        int i2;
        c30 c30Var;
        ey1 ey1Var;
        ul1Var.getClass();
        ov0 ov0Var = (ov0) f30Var;
        ov0Var.e0(-2054385562);
        int i3 = (i & 6) == 0 ? i | (ov0Var.h(ul1Var) ? 4 : 2) : i;
        if (ov0Var.T(i3 & 1, (i3 & 3) != 2)) {
            String language = ((rh1) ov0Var.j(z30.p)).a.getLanguage();
            language.getClass();
            String str = "zh";
            if (!s13.Z(language, "zh", false)) {
                str = "ar";
                if (!s13.Z(language, "ar", false)) {
                    str = "en";
                }
            }
            Object objQ = ov0Var.Q();
            c30 c30Var2 = d30.a;
            if (objQ == c30Var2) {
                objQ = ke0.H(str);
                ov0Var.m0(objQ);
            }
            ey1 ey1Var2 = (ey1) objQ;
            fn0 fn0Var = iw2.c;
            hh0 hh0Var = mz.a;
            long j = ((kz) ov0Var.j(hh0Var)).n;
            iy0 iy0Var = o51.p0;
            dv1 dv1VarK = xp1.k(fn0Var, j, iy0Var);
            pr prVar = j9.j;
            er1 er1VarC = ws.c(prVar, false);
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
            dv1 dv1VarD = zm3.D(iw2.e(av1Var, 1.0f), 32.0f);
            yz yzVarA = wz.a(new jo(24.0f, true, new fo(0)), j9.s, ov0Var, 54);
            int iHashCode2 = Long.hashCode(ov0Var.T);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarD);
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
            dv1 dv1VarN = xp1.n(iw2.k(av1Var, 72.0f), cj2.a);
            long j2 = bk.g;
            dv1 dv1VarK2 = xp1.k(dv1VarN, hz.c(0.1f, j2), iy0Var);
            er1 er1VarC2 = ws.c(prVar, false);
            int iHashCode3 = Long.hashCode(ov0Var.T);
            l72 l72VarL3 = ov0Var.l();
            dv1 dv1VarH3 = xp1.H(ov0Var, dv1VarK2);
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
            t01.a(dh0.q(), null, iw2.k(av1Var, 40.0f), j2, ov0Var, 3504, 0);
            ov0Var.p(true);
            ey1 ey1Var3 = ey1Var2;
            c30 c30Var3 = c30Var2;
            s83.b("Select Language / 选择语言 / اختر اللغة", null, ((kz) ov0Var.j(hh0Var)).o, v63.c(20), jr0.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597446, 0, 262058);
            dv1 dv1VarE = iw2.e(av1Var, 1.0f);
            i2 = 1;
            yz yzVarA2 = wz.a(new jo(12.0f, true, new fo(0)), j9.r, ov0Var, 6);
            int iHashCode4 = Long.hashCode(ov0Var.T);
            l72 l72VarL4 = ov0Var.l();
            dv1 dv1VarH4 = xp1.H(ov0Var, dv1VarE);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, yzVarA2);
            q73.h(ov0Var, ghVar2, l72VarL4);
            az2.s(iHashCode4, ov0Var, ghVar3, ov0Var, waVar);
            q73.h(ov0Var, ghVar4, dv1VarH4);
            ov0Var.c0(-377133479);
            for (ba1 ba1Var : a) {
                boolean zF = o51.f((String) ey1Var3.getValue(), ba1Var.b);
                boolean zF2 = ov0Var.f(ba1Var);
                Object objQ2 = ov0Var.Q();
                if (zF2) {
                    c30Var = c30Var3;
                } else {
                    c30Var = c30Var3;
                    if (objQ2 != c30Var) {
                        ey1Var = ey1Var3;
                    }
                    a(ba1Var, zF, (au0) objQ2, ov0Var, 0);
                    c30Var3 = c30Var;
                    ey1Var3 = ey1Var;
                }
                ey1Var = ey1Var3;
                objQ2 = new m5(17, ba1Var, ey1Var);
                ov0Var.m0(objQ2);
                a(ba1Var, zF, (au0) objQ2, ov0Var, 0);
                c30Var3 = c30Var;
                ey1Var3 = ey1Var;
            }
            ey1 ey1Var4 = ey1Var3;
            c30 c30Var4 = c30Var3;
            ov0Var.p(false);
            ov0Var.p(true);
            gh0.h(ov0Var, iw2.g(av1Var, 16.0f));
            ul1Var2 = ul1Var;
            boolean zH = ov0Var.h(ul1Var2);
            Object objQ3 = ov0Var.Q();
            if (zH || objQ3 == c30Var4) {
                objQ3 = new zm0(ul1Var2, ey1Var4, i2);
                ov0Var.m0(objQ3);
            }
            dv1 dv1VarG = iw2.g(iw2.e(av1Var, 1.0f), 52.0f);
            bj2 bj2VarA = cj2.a(14.0f);
            b52 b52Var = hu.a;
            n51.a((au0) objQ3, dv1VarG, false, bj2VarA, hu.a(bk.g, 0L, 0L, 0L, ov0Var, 14), null, null, null, sb.a0(351897938, new h5(ey1Var4, 9), ov0Var), ov0Var, 805306416, 484);
            ov0Var = ov0Var;
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            ul1Var2 = ul1Var;
            i2 = 1;
            ov0Var.W();
        }
        ee2 ee2VarT = ov0Var.t();
        if (ee2VarT != null) {
            ee2VarT.d = new dc(i, i2, ul1Var2);
        }
    }
}
