package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mf1 implements sk3 {
    public final lf3 a;
    public final int b;

    public mf1(lf3 lf3Var, int i) {
        this.a = lf3Var;
        this.b = i;
    }

    @Override // defpackage.sk3
    public final int a(xb0 xb0Var) {
        if ((this.b & 32) != 0) {
            return this.a.a(xb0Var);
        }
        return 0;
    }

    @Override // defpackage.sk3
    public final int b(xb0 xb0Var) {
        if ((this.b & 16) != 0) {
            return this.a.b(xb0Var);
        }
        return 0;
    }

    @Override // defpackage.sk3
    public final int c(xb0 xb0Var, qa1 qa1Var) {
        if (((qa1Var == qa1.e ? 4 : 1) & this.b) != 0) {
            return this.a.c(xb0Var, qa1Var);
        }
        return 0;
    }

    @Override // defpackage.sk3
    public final int d(xb0 xb0Var, qa1 qa1Var) {
        if (((qa1Var == qa1.e ? 8 : 2) & this.b) != 0) {
            return this.a.d(xb0Var, qa1Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf1)) {
            return false;
        }
        mf1 mf1Var = (mf1) obj;
        return this.a.equals(mf1Var.a) && this.b == mf1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = a83.a;
        if ((i & i2) == i2) {
            a83.j(sb3, "Start");
        }
        int i3 = a83.c;
        if ((i & i3) == i3) {
            a83.j(sb3, "Left");
        }
        if ((i & 16) == 16) {
            a83.j(sb3, "Top");
        }
        int i4 = a83.b;
        if ((i & i4) == i4) {
            a83.j(sb3, "End");
        }
        int i5 = a83.d;
        if ((i & i5) == i5) {
            a83.j(sb3, "Right");
        }
        if ((i & 32) == 32) {
            a83.j(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
