package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v12 implements rv {
    public final o12 e;
    public final /* synthetic */ x12 f;

    public v12(x12 x12Var, o12 o12Var) {
        o12Var.getClass();
        this.f = x12Var;
        this.e = o12Var;
    }

    @Override // defpackage.rv
    public final void cancel() {
        x12 x12Var = this.f;
        mo moVar = x12Var.b;
        o12 o12Var = this.e;
        moVar.remove(o12Var);
        if (o51.f(x12Var.c, o12Var)) {
            o12Var.a();
            x12Var.c = null;
        }
        o12Var.getClass();
        o12Var.b.remove(this);
        au0 au0Var = o12Var.c;
        if (au0Var != null) {
            au0Var.invoke();
        }
        o12Var.c = null;
    }
}
