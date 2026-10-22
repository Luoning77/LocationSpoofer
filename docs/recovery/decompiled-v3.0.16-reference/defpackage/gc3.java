package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class gc3 implements s03 {
    public final kc3 e;
    public lu0 f;
    public lu0 g;
    public final /* synthetic */ hc3 h;

    public gc3(hc3 hc3Var, kc3 kc3Var, lu0 lu0Var, lu0 lu0Var2) {
        this.h = hc3Var;
        this.e = kc3Var;
        this.f = lu0Var;
        this.g = lu0Var2;
    }

    public final void a(ic3 ic3Var) {
        Object objInvoke = this.g.invoke(ic3Var.c());
        boolean zG = this.h.c.g();
        kc3 kc3Var = this.e;
        if (zG) {
            kc3Var.e(this.g.invoke(ic3Var.a()), objInvoke, (ln0) this.f.invoke(ic3Var));
        } else {
            kc3Var.f(objInvoke, (ln0) this.f.invoke(ic3Var));
        }
    }

    @Override // defpackage.s03
    public final Object getValue() {
        a(this.h.c.f());
        return this.e.l.getValue();
    }
}
