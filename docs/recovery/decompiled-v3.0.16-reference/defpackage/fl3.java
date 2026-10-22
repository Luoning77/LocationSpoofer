package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class fl3 {
    public final ql3 a;
    public j31[] b;

    public fl3() {
        this(new ql3((ql3) null));
    }

    public final void a() {
        j31[] j31VarArr = this.b;
        if (j31VarArr != null) {
            j31 j31VarG = j31VarArr[0];
            j31 j31VarG2 = j31VarArr[1];
            ql3 ql3Var = this.a;
            if (j31VarG2 == null) {
                j31VarG2 = ql3Var.a.g(2);
            }
            if (j31VarG == null) {
                j31VarG = ql3Var.a.g(1);
            }
            g(j31.a(j31VarG, j31VarG2));
            j31 j31Var = this.b[x63.d(16)];
            if (j31Var != null) {
                f(j31Var);
            }
            j31 j31Var2 = this.b[x63.d(32)];
            if (j31Var2 != null) {
                d(j31Var2);
            }
            j31 j31Var3 = this.b[x63.d(64)];
            if (j31Var3 != null) {
                h(j31Var3);
            }
        }
    }

    public abstract ql3 b();

    public void c(int i, j31 j31Var) {
        if (this.b == null) {
            this.b = new j31[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[x63.d(i2)] = j31Var;
            }
        }
    }

    public abstract void e(j31 j31Var);

    public abstract void g(j31 j31Var);

    public fl3(ql3 ql3Var) {
        this.a = ql3Var;
    }

    public void d(j31 j31Var) {
    }

    public void f(j31 j31Var) {
    }

    public void h(j31 j31Var) {
    }
}
