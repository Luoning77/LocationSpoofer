package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l91 {
    public final ny2 a;
    public m91 b;
    public op0 c;

    public l91(ny2 ny2Var) {
        this.a = ny2Var;
    }

    public final m91 a() {
        m91 m91Var = this.b;
        if (m91Var != null) {
            return m91Var;
        }
        o51.F("keyboardActions");
        throw null;
    }

    public final boolean b(int i) {
        lu0 lu0Var;
        ny2 ny2Var;
        if (i == 7) {
            lu0Var = a().a;
        } else {
            if (i == 2) {
                a();
            } else if (i == 6) {
                lu0Var = a().b;
            } else if (i == 5) {
                a();
            } else if (i == 3) {
                lu0Var = a().c;
            } else if (i == 4) {
                a();
            } else if (i != 1 && i != 0) {
                fo.n("invalid ImeAction");
                return false;
            }
            lu0Var = null;
        }
        if (lu0Var != null) {
            lu0Var.invoke(this);
            return true;
        }
        if (i == 6) {
            op0 op0Var = this.c;
            if (op0Var != null) {
                ((rp0) op0Var).h(1, true);
                return true;
            }
            o51.F("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (ny2Var = this.a) == null) {
                return false;
            }
            ((nb0) ny2Var).a();
            return true;
        }
        op0 op0Var2 = this.c;
        if (op0Var2 != null) {
            ((rp0) op0Var2).h(2, true);
            return true;
        }
        o51.F("focusManager");
        throw null;
    }
}
