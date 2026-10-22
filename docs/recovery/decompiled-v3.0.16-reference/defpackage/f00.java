package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f00 implements y70, Serializable {
    public final y70 e;
    public final w70 f;

    public f00(y70 y70Var, w70 w70Var) {
        y70Var.getClass();
        this.e = y70Var;
        this.f = w70Var;
    }

    public final boolean equals(Object obj) {
        boolean zF;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f00) {
            f00 f00Var = (f00) obj;
            int i = 2;
            f00 f00Var2 = f00Var;
            int i2 = 2;
            while (true) {
                y70 y70Var = f00Var2.e;
                f00Var2 = y70Var instanceof f00 ? (f00) y70Var : null;
                if (f00Var2 == null) {
                    break;
                }
                i2++;
            }
            f00 f00Var3 = this;
            while (true) {
                y70 y70Var2 = f00Var3.e;
                f00Var3 = y70Var2 instanceof f00 ? (f00) y70Var2 : null;
                if (f00Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    w70 w70Var = this.f;
                    if (!o51.f(f00Var.get(w70Var.getKey()), w70Var)) {
                        zF = false;
                        break;
                    }
                    y70 y70Var3 = this.e;
                    if (!(y70Var3 instanceof f00)) {
                        y70Var3.getClass();
                        w70 w70Var2 = (w70) y70Var3;
                        zF = o51.f(f00Var.get(w70Var2.getKey()), w70Var2);
                        break;
                    }
                    this = (f00) y70Var3;
                }
                if (zF) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.y70
    public final Object fold(Object obj, pu0 pu0Var) {
        pu0Var.getClass();
        return pu0Var.invoke(this.e.fold(obj, pu0Var), this.f);
    }

    @Override // defpackage.y70
    public final w70 get(x70 x70Var) {
        x70Var.getClass();
        while (true) {
            w70 w70Var = this.f.get(x70Var);
            if (w70Var != null) {
                return w70Var;
            }
            y70 y70Var = this.e;
            if (!(y70Var instanceof f00)) {
                return y70Var.get(x70Var);
            }
            this = (f00) y70Var;
        }
    }

    public final int hashCode() {
        return this.f.hashCode() + this.e.hashCode();
    }

    @Override // defpackage.y70
    public final y70 minusKey(x70 x70Var) {
        x70Var.getClass();
        w70 w70Var = this.f;
        w70 w70Var2 = w70Var.get(x70Var);
        y70 y70Var = this.e;
        if (w70Var2 != null) {
            return y70Var;
        }
        y70 y70VarMinusKey = y70Var.minusKey(x70Var);
        if (y70VarMinusKey == y70Var) {
            return this;
        }
        return y70VarMinusKey == sj0.e ? w70Var : new f00(y70VarMinusKey, w70Var);
    }

    @Override // defpackage.y70
    public final y70 plus(y70 y70Var) {
        y70Var.getClass();
        return y70Var == sj0.e ? this : (y70) y70Var.fold(this, new v70(0, (byte) 0));
    }

    public final String toString() {
        return p91.q(new StringBuilder("["), (String) fold("", new e00(0)), ']');
    }
}
