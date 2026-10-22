package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ee2 {
    public t30 a;
    public int b;
    public iv0 c;
    public pu0 d;
    public int e;
    public ox1 f;
    public zx1 g;

    public ee2(t30 t30Var) {
        this.a = t30Var;
    }

    public final boolean a() {
        if (this.a != null) {
            iv0 iv0Var = this.c;
            if (iv0Var != null ? iv0Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final y51 b(Object obj) {
        y51 y51VarS;
        t30 t30Var = this.a;
        return (t30Var == null || (y51VarS = t30Var.s(this, obj)) == null) ? y51.e : y51VarS;
    }

    public final void c() {
        t30 t30Var = this.a;
        if (t30Var != null) {
            t30Var.s = true;
            t30Var.x.u();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }

    public final void e(pu0 pu0Var) {
        this.d = pu0Var;
    }
}
