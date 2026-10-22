package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jr0 implements Comparable {
    public static final jr0 f;
    public static final jr0 g;
    public static final jr0 h;
    public static final jr0 i;
    public static final jr0 j;
    public final int e;

    static {
        jr0 jr0Var = new jr0(100);
        jr0 jr0Var2 = new jr0(200);
        jr0 jr0Var3 = new jr0(300);
        jr0 jr0Var4 = new jr0(400);
        jr0 jr0Var5 = new jr0(500);
        jr0 jr0Var6 = new jr0(600);
        f = jr0Var6;
        jr0 jr0Var7 = new jr0(700);
        jr0 jr0Var8 = new jr0(800);
        jr0 jr0Var9 = new jr0(900);
        g = jr0Var4;
        h = jr0Var5;
        i = jr0Var6;
        j = jr0Var7;
        am1.G(jr0Var, jr0Var2, jr0Var3, jr0Var4, jr0Var5, jr0Var6, jr0Var7, jr0Var8, jr0Var9);
    }

    public jr0(int i2) {
        this.e = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        q21.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return o51.m(this.e, ((jr0) obj).e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jr0) {
            return this.e == ((jr0) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        return az2.o(new StringBuilder("FontWeight(weight="), this.e, ')');
    }
}
