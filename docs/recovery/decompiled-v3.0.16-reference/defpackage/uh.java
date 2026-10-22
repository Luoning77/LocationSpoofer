package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uh extends aa1 implements pu0 {
    public final /* synthetic */ mc3 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ lu0 h;
    public final /* synthetic */ ei i;
    public final /* synthetic */ fy2 j;
    public final /* synthetic */ p10 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(mc3 mc3Var, Object obj, lu0 lu0Var, ei eiVar, fy2 fy2Var, p10 p10Var) {
        super(2);
        this.f = mc3Var;
        this.g = obj;
        this.h = lu0Var;
        this.i = eiVar;
        this.j = fy2Var;
        this.k = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        f30 f30Var = (f30) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 2;
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objQ = ov0Var.Q();
            lu0 lu0Var = this.h;
            ei eiVar = this.i;
            c30 c30Var = d30.a;
            if (objQ == c30Var) {
                objQ = (g60) lu0Var.invoke(eiVar);
                ov0Var.m0(objQ);
            }
            g60 g60Var = (g60) objQ;
            mc3 mc3Var = this.f;
            ic3 ic3VarF = mc3Var.f();
            w52 w52Var = mc3Var.d;
            Object objC = ic3VarF.c();
            Object obj3 = this.g;
            boolean zG = ov0Var.g(o51.f(objC, obj3));
            Object objQ2 = ov0Var.Q();
            if (zG || objQ2 == c30Var) {
                objQ2 = o51.f(mc3Var.f().c(), obj3) ? lm0.b : ((g60) lu0Var.invoke(eiVar)).b;
                ov0Var.m0(objQ2);
            }
            lm0 lm0Var = (lm0) objQ2;
            Object objQ3 = ov0Var.Q();
            if (objQ3 == c30Var) {
                objQ3 = new zh(o51.f(obj3, w52Var.getValue()));
                ov0Var.m0(objQ3);
            }
            zh zhVar = (zh) objQ3;
            pk0 pk0Var = g60Var.a;
            boolean zH = ov0Var.h(g60Var);
            Object objQ4 = ov0Var.Q();
            if (zH || objQ4 == c30Var) {
                objQ4 = new yu2(g60Var, 1);
                ov0Var.m0(objQ4);
            }
            dv1 dv1VarA = k22.A(av1.a, (qu0) objQ4);
            zhVar.a.setValue(Boolean.valueOf(o51.f(obj3, w52Var.getValue())));
            dv1 dv1VarD = dv1VarA.d(zhVar);
            boolean zH2 = ov0Var.h(obj3);
            Object objQ5 = ov0Var.Q();
            if (zH2 || objQ5 == c30Var) {
                objQ5 = new q9(obj3, 6);
                ov0Var.m0(objQ5);
            }
            lu0 lu0Var2 = (lu0) objQ5;
            boolean zF = ov0Var.f(lm0Var);
            Object objQ6 = ov0Var.Q();
            if (zF || objQ6 == c30Var) {
                objQ6 = new x(lm0Var, i);
                ov0Var.m0(objQ6);
            }
            da0.b(mc3Var, lu0Var2, dv1VarD, pk0Var, lm0Var, (pu0) objQ6, sb.a0(-143346359, new th(this.j, obj3, eiVar, this.k), ov0Var), ov0Var, 12582912);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
