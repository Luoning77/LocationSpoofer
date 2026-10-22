package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hc3 {
    public final qd3 a;
    public final w52 b = ke0.H(null);
    public final /* synthetic */ mc3 c;

    public hc3(mc3 mc3Var, qd3 qd3Var, String str) {
        this.c = mc3Var;
        this.a = qd3Var;
    }

    public final gc3 a(lu0 lu0Var, lu0 lu0Var2) {
        w52 w52Var = this.b;
        gc3 gc3Var = (gc3) w52Var.getValue();
        mc3 mc3Var = this.c;
        if (gc3Var == null) {
            Object objInvoke = lu0Var2.invoke(mc3Var.c());
            Object objInvoke2 = lu0Var2.invoke(mc3Var.c());
            qd3 qd3Var = this.a;
            yi yiVar = (yi) qd3Var.a.invoke(objInvoke2);
            yiVar.d();
            kc3 kc3Var = new kc3(mc3Var, objInvoke, yiVar, qd3Var);
            gc3Var = new gc3(this, kc3Var, lu0Var, lu0Var2);
            w52Var.setValue(gc3Var);
            mc3Var.i.add(kc3Var);
        }
        gc3Var.g = lu0Var2;
        gc3Var.f = lu0Var;
        gc3Var.a(mc3Var.f());
        return gc3Var;
    }
}
