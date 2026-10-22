package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ps {
    public final wu2 a;
    public final mc3 b;
    public final au0 c;
    public final w52 d;
    public final w52 e;
    public ln0 f = qs.a;
    public final w52 g = ke0.H(null);

    public ps(wu2 wu2Var, mc3 mc3Var, hc3 hc3Var, ui1 ui1Var, au0 au0Var) {
        this.a = wu2Var;
        this.b = mc3Var;
        this.c = au0Var;
        this.d = ke0.H(hc3Var);
        this.e = ke0.H(ui1Var);
    }

    public final void a(pe2 pe2Var, pe2 pe2Var2, ui1 ui1Var) {
        ln0 ln0VarD;
        if (this.a.a()) {
            w52 w52Var = this.g;
            int i = 3;
            if (((s03) w52Var.getValue()) == null) {
                if (ui1Var == null) {
                    ui1Var = (ui1) this.e.getValue();
                }
                switch (ui1Var.a) {
                    case 0:
                        float f = pe2Var2.b;
                        float f2 = pe2Var.b;
                        ln0VarD = ((f2 < 350.0f && f > 350.0f) || (f2 > 350.0f && f < 350.0f)) ? o51.D(1.0f, 400.0f, null, 4) : o51.C();
                        break;
                    case 1:
                        float f3 = pe2Var2.b;
                        float f4 = pe2Var.b;
                        ln0VarD = ((f4 < 350.0f && f3 > 350.0f) || (f4 > 350.0f && f3 < 350.0f)) ? o51.D(1.0f, 400.0f, null, 4) : o51.C();
                        break;
                    default:
                        ln0VarD = o51.D(0.0f, 0.0f, zj3.a, 3);
                        break;
                }
                this.f = ln0VarD;
            }
            w52Var.setValue(((hc3) this.d.getValue()).a(new q9(this, 7), new ah(this, pe2Var2, pe2Var, i)));
        }
    }

    public final boolean b() {
        return ((Boolean) this.b.d.getValue()).booleanValue();
    }

    public final pe2 c() {
        s03 s03Var;
        pe2 pe2Var;
        if (!this.a.a() || (s03Var = (s03) this.g.getValue()) == null || (pe2Var = (pe2) s03Var.getValue()) == null) {
            return null;
        }
        long j = ((c12) this.c.invoke()).a;
        return !c12.b(j, 0L) ? pe2Var.j(j) : pe2Var;
    }
}
