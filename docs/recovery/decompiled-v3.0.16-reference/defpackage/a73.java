package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a73 implements pu0 {
    public final /* synthetic */ ey1 e;
    public final /* synthetic */ l73 f;
    public final /* synthetic */ z42 g;
    public final /* synthetic */ p10 h;

    public a73(ey1 ey1Var, l73 l73Var, z42 z42Var, p10 p10Var) {
        this.e = ey1Var;
        this.f = l73Var;
        this.g = z42Var;
        this.h = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        f30 f30Var = (f30) obj;
        int iIntValue = ((Number) obj2).intValue();
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            dv1 dv1VarE = xp1.E(av1.a, "Container");
            z63 z63Var = new z63(this.e, ey1.class, "value", "getValue()Ljava/lang/Object;", 0);
            h73.m(this.f);
            dv1 dv1VarW = xp1.w(dv1VarE, new ji1(z63Var, this.g, j9.r, 13));
            er1 er1VarC = ws.c(j9.f, true);
            int iT = ks.T(ov0Var);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarW);
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
            gh ghVar = v20.f;
            if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT))) {
                az2.r(iT, ov0Var, iT, ghVar);
            }
            q73.h(ov0Var, v20.c, dv1VarH);
            this.h.invoke(ov0Var, 0);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
