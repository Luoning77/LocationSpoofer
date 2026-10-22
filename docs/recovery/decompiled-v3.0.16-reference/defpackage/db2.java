package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class db2 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public db2(boolean z, ip2 ip2Var, boolean z2, int i) {
        hh0 hh0Var = jf.a;
        int i2 = !z ? 262152 : 262144;
        i2 = ip2Var == ip2.f ? i2 | 8192 : i2;
        i2 = z2 ? i2 : i2 | 512;
        boolean z3 = ip2Var == ip2.e;
        this.a = i2;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db2)) {
            return false;
        }
        db2 db2Var = (db2) obj;
        return this.a == db2Var.a && this.b == db2Var.b && this.c == db2Var.c && this.d == db2Var.d && this.e == db2Var.e && this.f == db2Var.f;
    }

    public final int hashCode() {
        return (p91.e(p91.e(p91.e(p91.e(p91.e(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }
}
