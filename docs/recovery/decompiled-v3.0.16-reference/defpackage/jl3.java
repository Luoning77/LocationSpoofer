package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class jl3 extends il3 {
    public j31 o;
    public j31 p;
    public j31 q;

    public jl3(ql3 ql3Var, WindowInsets windowInsets) {
        super(ql3Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.nl3
    public j31 i() {
        j31 j31Var = this.p;
        if (j31Var != null) {
            return j31Var;
        }
        j31 j31VarC = j31.c(this.c.getMandatorySystemGestureInsets());
        this.p = j31VarC;
        return j31VarC;
    }

    @Override // defpackage.nl3
    public j31 k() {
        j31 j31Var = this.o;
        if (j31Var != null) {
            return j31Var;
        }
        j31 j31VarC = j31.c(this.c.getSystemGestureInsets());
        this.o = j31VarC;
        return j31VarC;
    }

    @Override // defpackage.nl3
    public j31 m() {
        j31 j31Var = this.q;
        if (j31Var != null) {
            return j31Var;
        }
        j31 j31VarC = j31.c(this.c.getTappableElementInsets());
        this.q = j31VarC;
        return j31VarC;
    }

    @Override // defpackage.gl3, defpackage.nl3
    public ql3 n(int i, int i2, int i3, int i4) {
        return ql3.c(this.c.inset(i, i2, i3, i4), null);
    }

    public jl3(ql3 ql3Var, jl3 jl3Var) {
        super(ql3Var, jl3Var);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.hl3, defpackage.nl3
    public void u(j31 j31Var) {
    }
}
