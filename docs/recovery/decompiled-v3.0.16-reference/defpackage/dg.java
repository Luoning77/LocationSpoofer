package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class dg implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ jg f;
    public final /* synthetic */ y53 g;

    public /* synthetic */ dg(jg jgVar, y53 y53Var, int i) {
        this.e = i;
        this.f = jgVar;
        this.g = y53Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        int i2 = 4;
        int i3 = 2;
        y53 y53Var = this.g;
        jg jgVar = this.f;
        switch (i) {
            case 0:
                cg cgVar = jgVar.f;
                hd hdVar = new hd(y53Var, i3);
                we2 we2Var = new we2();
                jgVar.e.c("dataBuilder", cgVar, new m5(i2, we2Var, hdVar));
                Object obj = we2Var.e;
                if (obj != null) {
                    return (x53) obj;
                }
                o51.F("result");
                throw null;
            case 1:
                cg cgVar2 = jgVar.g;
                dg dgVar = new dg(jgVar, y53Var, i3);
                we2 we2Var2 = new we2();
                jgVar.e.c("positioner", cgVar2, new m5(i2, we2Var2, dgVar));
                Object obj2 = we2Var2.e;
                if (obj2 != null) {
                    return (pe2) obj2;
                }
                o51.F("result");
                throw null;
            default:
                Object objInvoke = jgVar.c.invoke();
                pa1 pa1Var = (pa1) (((pa1) objInvoke).U() ? objInvoke : null);
                return pa1Var == null ? pe2.e : y53Var.E(pa1Var).j(pa1Var.h0(0L));
        }
    }
}
