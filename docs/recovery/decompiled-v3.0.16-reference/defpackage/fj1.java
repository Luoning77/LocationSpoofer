package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fj1 implements ru0 {
    public final /* synthetic */ List e;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ lr2 g;
    public final /* synthetic */ lu0 h;

    public fj1(List list, ul1 ul1Var, lr2 lr2Var, lu0 lu0Var) {
        this.e = list;
        this.f = ul1Var;
        this.g = lr2Var;
        this.h = lu0Var;
    }

    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        bc1 bc1Var = (bc1) obj;
        int iIntValue = ((Number) obj2).intValue();
        f30 f30Var = (f30) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((ov0) f30Var).f(bc1Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((ov0) f30Var).d(iIntValue) ? 32 : 16;
        }
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (i & 147) != 146)) {
            sn snVar = (sn) this.e.get(iIntValue);
            ov0Var.c0(551078628);
            av1 av1Var = av1.a;
            dv1 dv1VarE = iw2.e(av1Var, 1.0f);
            ul1 ul1Var = this.f;
            boolean zH = ov0Var.h(ul1Var) | ov0Var.f(snVar);
            lr2 lr2Var = this.g;
            boolean zH2 = zH | ov0Var.h(lr2Var);
            lu0 lu0Var = this.h;
            boolean zF = zH2 | ov0Var.f(lu0Var);
            Object objQ = ov0Var.Q();
            if (zF || objQ == d30.a) {
                ej1 ej1Var = new ej1(ul1Var, snVar, lr2Var, lu0Var, 0);
                ov0Var.m0(ej1Var);
                objQ = ej1Var;
            }
            dv1 dv1VarE2 = zm3.E(bk.a(dv1VarE, (au0) objQ), 16.0f, 12.0f);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 48);
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
            dv1 dv1VarN = xp1.n(iw2.k(av1Var, 36.0f), cj2.a(10.0f));
            long j = bk.g;
            dv1 dv1VarK = xp1.k(dv1VarN, hz.c(0.12f, j), o51.p0);
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
            t01.a(ee0.z(), null, iw2.k(av1Var, 18.0f), j, ov0Var, 3504, 0);
            ov0Var.p(true);
            gh0.h(ov0Var, iw2.o(av1Var, 12.0f));
            wb1 wb1Var = new wb1(1.0f, true);
            yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
            int iHashCode3 = Long.hashCode(ov0Var.T);
            l72 l72VarL3 = ov0Var.l();
            dv1 dv1VarH3 = xp1.H(ov0Var, wb1Var);
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
            String str = snVar.a;
            String str2 = snVar.e;
            jr0 jr0Var = jr0.h;
            long jC = v63.c(14);
            hh0 hh0Var = mz.a;
            s83.b(str, null, ((kz) ov0Var.j(hh0Var)).o, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
            s83.b(az2.y(snVar.b, !l13.k0(str2) ? "\n".concat(str2) : ""), null, hz.c(0.6f, ((kz) ov0Var.j(hh0Var)).o), v63.b(11.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
            ov0Var.p(true);
            ov0Var.p(true);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
