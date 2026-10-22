package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b93 {
    public final uy2 a;
    public final uy2 b;
    public final uy2 c;
    public final uy2 d;

    public b93(uy2 uy2Var, uy2 uy2Var2, uy2 uy2Var3, uy2 uy2Var4) {
        this.a = uy2Var;
        this.b = uy2Var2;
        this.c = uy2Var3;
        this.d = uy2Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b93)) {
            return false;
        }
        b93 b93Var = (b93) obj;
        return o51.f(this.a, b93Var.a) && o51.f(this.b, b93Var.b) && o51.f(this.c, b93Var.c) && o51.f(this.d, b93Var.d);
    }

    public final int hashCode() {
        uy2 uy2Var = this.a;
        int iHashCode = (uy2Var != null ? uy2Var.hashCode() : 0) * 31;
        uy2 uy2Var2 = this.b;
        int iHashCode2 = (iHashCode + (uy2Var2 != null ? uy2Var2.hashCode() : 0)) * 31;
        uy2 uy2Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (uy2Var3 != null ? uy2Var3.hashCode() : 0)) * 31;
        uy2 uy2Var4 = this.d;
        return iHashCode3 + (uy2Var4 != null ? uy2Var4.hashCode() : 0);
    }
}
