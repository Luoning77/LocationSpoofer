package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class e9 implements pu0 {
    public final /* synthetic */ pu0 e;
    public final /* synthetic */ pu0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ p10 j;

    public e9(pu0 pu0Var, pu0 pu0Var2, long j, long j2, long j3, long j4, p10 p10Var) {
        this.e = pu0Var;
        this.f = pu0Var2;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        f30 f30Var = (f30) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 1;
        int i2 = 0;
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            dv1 dv1VarC = zm3.C(av1.a, i9.a);
            yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
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
            q73.h(ov0Var, ghVar, yzVarA);
            gh ghVar2 = v20.d;
            q73.h(ov0Var, ghVar2, l72VarL);
            gh ghVar3 = v20.f;
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT))) {
                az2.r(iT, ov0Var, iT, ghVar3);
            }
            gh ghVar4 = v20.c;
            q73.h(ov0Var, ghVar4, dv1VarH);
            ov0Var.c0(346092326);
            ov0Var.p(false);
            pu0 pu0Var = this.e;
            if (pu0Var == null) {
                ov0Var.c0(346396529);
            } else {
                ov0Var.c0(346396530);
                hd0.i(this.g, le3.a(sb.P, ov0Var), sb.a0(71284337, new d9(i2, pu0Var), ov0Var), ov0Var, 384);
            }
            ov0Var.p(false);
            pu0 pu0Var2 = this.f;
            if (pu0Var2 == null) {
                ov0Var.c0(347174009);
            } else {
                ov0Var.c0(347174010);
                hd0.i(this.h, le3.a(sb.R, ov0Var), sb.a0(705583346, new d9(i, pu0Var2), ov0Var), ov0Var, 384);
            }
            ov0Var.p(false);
            by0 by0Var = new by0(j9.t);
            er1 er1VarC = ws.c(j9.f, false);
            int iT2 = ks.T(ov0Var);
            l72 l72VarL2 = ov0Var.l();
            dv1 dv1VarH2 = xp1.H(ov0Var, by0Var);
            ov0Var.g0();
            if (ov0Var.S) {
                ov0Var.k(x30Var);
            } else {
                ov0Var.p0();
            }
            q73.h(ov0Var, ghVar, er1VarC);
            q73.h(ov0Var, ghVar2, l72VarL2);
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT2))) {
                az2.r(iT2, ov0Var, iT2, ghVar3);
            }
            q73.h(ov0Var, ghVar4, dv1VarH2);
            hd0.i(this.i, le3.a(sb.L, ov0Var), this.j, ov0Var, 0);
            ov0Var.p(true);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
