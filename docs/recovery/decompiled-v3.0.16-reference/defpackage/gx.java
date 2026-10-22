package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gx implements pu0 {
    public final /* synthetic */ float e;
    public final /* synthetic */ z42 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ p10 h;
    public final /* synthetic */ long i;

    public gx(float f, z42 z42Var, long j, p10 p10Var, long j2) {
        this.e = f;
        this.f = z42Var;
        this.g = j;
        this.h = p10Var;
        this.i = j2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        f30 f30Var = (f30) obj;
        int iIntValue = ((Number) obj2).intValue();
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            yz2 yz2VarK = mc0.K(vv1.i, ov0Var);
            yz2 yz2VarK2 = mc0.K(vv1.h, ov0Var);
            yz2 yz2VarK3 = mc0.K(vv1.f, ov0Var);
            yz2 yz2VarK4 = mc0.K(vv1.g, ov0Var);
            dv1 dv1VarC = zm3.C(iw2.b(0.0f, this.e, 1), this.f);
            Object objQ = ov0Var.Q();
            if (objQ == d30.a) {
                objQ = new kx();
                ov0Var.m0(objQ);
            }
            kx kxVar = (kx) objQ;
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
            gh ghVar = v20.e;
            q73.h(ov0Var, ghVar, kxVar);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            gh ghVar3 = v20.f;
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT))) {
                az2.r(iT, ov0Var, iT, ghVar3);
            }
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            av1 av1Var = av1.a;
            dv1 dv1VarE = xp1.E(av1Var, "leadingIcon");
            nr nrVar = j9.r;
            da0.d(false, dv1VarE, kk0.a(yz2VarK3, nrVar, 12).a(kk0.d(yz2VarK, 2)), kk0.f(yz2VarK4, nrVar, 12).a(kk0.e(yz2VarK2, 2)), null, sb.a0(687705959, new v10(2, this.g), ov0Var), ov0Var, 196656, 16);
            dv1 dv1VarE2 = xp1.E(av1Var, "label");
            b52 b52Var = ix.a;
            dv1 dv1VarF = zm3.F(dv1VarE2, 8.0f, 0.0f, 2);
            kk2 kk2VarA = jk2.a(am1.e, j9.p, ov0Var, 54);
            int iT2 = ks.T(ov0Var);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarF);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, kk2VarA);
            q73.h(ov0Var, ghVar2, l72VarL2);
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT2))) {
                az2.r(iT2, ov0Var, iT2, ghVar3);
            }
            q73.h(ov0Var, ghVar4, dv1VarH2);
            this.h.invoke(ov0Var, 0);
            ov0Var.p(true);
            dv1 dv1VarE3 = xp1.E(av1Var, "trailingIcon");
            nr nrVar2 = j9.t;
            da0.d(false, dv1VarE3, kk0.a(yz2VarK3, nrVar2, 12).a(kk0.d(yz2VarK, 2)), kk0.f(yz2VarK4, nrVar2, 12).a(kk0.e(yz2VarK2, 2)), null, sb.a0(1905252304, new v10(3, this.i), ov0Var), ov0Var, 196656, 16);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
