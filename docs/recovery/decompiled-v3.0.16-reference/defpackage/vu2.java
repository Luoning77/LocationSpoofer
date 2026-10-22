package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class vu2 extends aa1 implements qu0 {
    public final /* synthetic */ uu2 f;
    public final /* synthetic */ mc3 g;
    public final /* synthetic */ wu2 h;
    public final /* synthetic */ xu2 i;
    public final /* synthetic */ ui1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu2(uu2 uu2Var, mc3 mc3Var, wu2 wu2Var, xu2 xu2Var, ui1 ui1Var) {
        super(3);
        this.f = uu2Var;
        this.g = mc3Var;
        this.h = wu2Var;
        this.i = xu2Var;
        this.j = ui1Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mc3 mc3VarN;
        hc3 hc3Var;
        boolean z;
        dv1 dv1Var = (dv1) obj;
        ((Number) obj3).intValue();
        ik0 ik0Var = ik0.C;
        ov0 ov0Var = (ov0) ((f30) obj2);
        ov0Var.c0(-1539505585);
        uu2 uu2Var = this.f;
        String str = uu2Var.a;
        ov0Var.a0(-1996110647, str);
        Object objQ = ov0Var.Q();
        wu2 wu2Var = this.h;
        c30 c30Var = d30.a;
        if (objQ == c30Var) {
            hy2 hy2Var = wu2Var.l;
            nu2 nu2Var = (nu2) hy2Var.get(str);
            if (nu2Var == null) {
                nu2Var = new nu2(str, wu2Var);
                hy2Var.put(str, nu2Var);
            }
            objQ = nu2Var;
            ov0Var.m0(objQ);
        }
        nu2 nu2Var2 = (nu2) objQ;
        mc3 mc3Var = this.g;
        ov0Var.a0(-1996106866, mc3Var);
        if (mc3Var != null) {
            ov0Var.c0(-1749734647);
            String string = str.toString();
            boolean zF = ov0Var.f(mc3Var);
            Object objQ2 = ov0Var.Q();
            if (zF || objQ2 == c30Var) {
                objQ2 = mc3Var.c();
                ov0Var.m0(objQ2);
            }
            if (mc3Var.g()) {
                objQ2 = mc3Var.c();
            }
            ov0Var.c0(1498260051);
            Boolean bool = (Boolean) ik0Var.invoke(objQ2);
            ov0Var.p(false);
            Object value = mc3Var.d.getValue();
            ov0Var.c0(1498260051);
            Boolean bool2 = (Boolean) ik0Var.invoke(value);
            ov0Var.p(false);
            mc3VarN = h73.i(mc3Var, bool, bool2, string, ov0Var, 0);
            ov0Var = ov0Var;
            ov0Var.p(false);
        } else {
            ov0Var.c0(-1749482679);
            boolean z2 = true;
            da0.o(1, ik0Var);
            Boolean bool3 = (Boolean) ik0Var.invoke(mf3.a);
            boolean zBooleanValue = bool3.booleanValue();
            Object objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                if (nu2Var2.c().isEmpty()) {
                    z2 = zBooleanValue;
                } else if (zBooleanValue) {
                    z2 = false;
                }
                objQ3 = new fy1(Boolean.valueOf(z2));
                ov0Var.m0(objQ3);
            }
            fy1 fy1Var = (fy1) objQ3;
            fy1Var.c.setValue(bool3);
            mc3VarN = h73.n(fy1Var, ov0Var, 0, 2);
            ov0Var.p(false);
        }
        mc3 mc3Var2 = mc3VarN;
        ov0Var.a0(-1996043323, Boolean.valueOf(wu2Var.a()));
        hc3 hc3VarJ = h73.j(mc3Var2, o51.D0, null, ov0Var, 0, 2);
        ov0Var.p(false);
        boolean zF2 = ov0Var.f(mc3Var2);
        Object objQ4 = ov0Var.Q();
        if (zF2 || objQ4 == c30Var) {
            hc3Var = hc3VarJ;
            z = false;
            ps psVar = new ps(wu2Var, mc3Var2, hc3Var, this.j, nu2Var2.h);
            ov0Var.m0(psVar);
            objQ4 = psVar;
        } else {
            hc3Var = hc3VarJ;
            z = false;
        }
        ps psVar2 = (ps) objQ4;
        if (!o51.f((hc3) psVar2.d.getValue(), hc3Var)) {
            psVar2.d.setValue(hc3Var);
            psVar2.g.setValue(null);
            psVar2.f = qs.a;
        }
        psVar2.e.setValue(this.j);
        ov0Var.p(z);
        Object objQ5 = ov0Var.Q();
        xu2 xu2Var = this.i;
        if (objQ5 == c30Var) {
            objQ5 = new pu2(nu2Var2, psVar2, xu2Var, uu2Var);
            ov0Var.m0(objQ5);
        }
        pu2 pu2Var = (pu2) objQ5;
        uu2Var.c.setValue(pu2Var);
        pu2Var.h.setValue(nu2Var2);
        w52 w52Var = pu2Var.k;
        Boolean bool4 = Boolean.TRUE;
        w52Var.setValue(bool4);
        pu2Var.i.setValue(psVar2);
        pu2Var.j.setValue(su2.b);
        pu2Var.l.setValue(xu2Var);
        pu2Var.f.h(0.0f);
        pu2Var.g.setValue(bool4);
        pu2Var.m.setValue(uu2Var);
        ov0Var.p(z);
        dv1 dv1VarD = dv1Var.d(new ku2(pu2Var));
        ov0Var.p(z);
        return dv1VarD;
    }
}
