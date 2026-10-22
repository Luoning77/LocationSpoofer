package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d73 implements qu0 {
    public final /* synthetic */ s03 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ q93 g;
    public final /* synthetic */ pu0 h;

    public d73(kc3 kc3Var, long j, q93 q93Var, pu0 pu0Var) {
        this.e = kc3Var;
        this.f = j;
        this.g = q93Var;
        this.h = pu0Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dv1 dv1Var = (dv1) obj;
        f30 f30Var = (f30) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((ov0) f30Var).f(dv1Var) ? 4 : 2;
        }
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
            s03 s03Var = this.e;
            boolean zF = ov0Var.f(s03Var);
            Object objQ = ov0Var.Q();
            if (zF || objQ == d30.a) {
                objQ = new fd(s03Var, 7);
                ov0Var.m0(objQ);
            }
            dv1 dv1VarZ = am1.z(dv1Var, (lu0) objQ);
            er1 er1VarC = ws.c(j9.f, false);
            int iT = ks.T(ov0Var);
            l72 l72VarL = ov0Var.l();
            dv1 dv1VarH = xp1.H(ov0Var, dv1VarZ);
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
            h73.e(this.f, this.g, this.h, ov0Var, 0);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
