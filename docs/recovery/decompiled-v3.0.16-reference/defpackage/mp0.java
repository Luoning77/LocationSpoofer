package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mp0 {
    public final rp0 a;
    public final db b;
    public final ay1 c;
    public final ay1 d;
    public boolean e;

    public mp0(rp0 rp0Var, db dbVar) {
        this.a = rp0Var;
        this.b = dbVar;
        ay1 ay1Var = in2.a;
        this.c = new ay1();
        this.d = new ay1();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        t4 t4Var = new t4(0, this, mp0.class, "invalidateNodes", "invalidateNodes()V", 0, 20);
        sx1 sx1Var = this.b.D0;
        if (sx1Var.g(t4Var) < 0) {
            sx1Var.a(t4Var);
        }
        this.e = true;
    }
}
