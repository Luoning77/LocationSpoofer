package defpackage;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j31 {
    public static final j31 e = new j31(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public j31(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static j31 a(j31 j31Var, j31 j31Var2) {
        return b(Math.max(j31Var.a, j31Var2.a), Math.max(j31Var.b, j31Var2.b), Math.max(j31Var.c, j31Var2.c), Math.max(j31Var.d, j31Var2.d));
    }

    public static j31 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new j31(i, i2, i3, i4);
    }

    public static j31 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return rn.i(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j31.class != obj.getClass()) {
            return false;
        }
        j31 j31Var = (j31) obj;
        return this.d == j31Var.d && this.a == j31Var.a && this.c == j31Var.c && this.b == j31Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return az2.o(sb, this.d, '}');
    }
}
