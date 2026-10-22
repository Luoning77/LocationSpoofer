package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ub1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ub1(vb1 vb1Var, Object obj, int i) {
        this.a = i;
        this.b = vb1Var;
        this.c = obj;
    }

    public nb1 b() {
        vb1 vb1Var = this.b;
        hb1 hb1Var = (hb1) vb1Var.n.g(this.c);
        if (hb1Var != null) {
            return (nb1) vb1Var.j.g(hb1Var);
        }
        return null;
    }

    public final boolean c() {
        g72 g72Var;
        switch (this.a) {
            case 0:
                return true;
            default:
                nb1 nb1VarB = b();
                if (nb1VarB == null || (g72Var = nb1VarB.f) == null) {
                    return true;
                }
                return g72Var.c();
        }
    }

    private final void a() {
    }
}
