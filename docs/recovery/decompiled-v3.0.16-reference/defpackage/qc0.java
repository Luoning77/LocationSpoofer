package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qc0 {
    public final boolean a;
    public final boolean b;
    public final ip2 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;

    public qc0(int i, boolean z, boolean z2) {
        this.a = true;
        this.b = true;
        this.c = ip2.e;
        this.d = z;
        this.e = z2;
        this.f = "";
        this.g = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0)) {
            return false;
        }
        qc0 qc0Var = (qc0) obj;
        return this.a == qc0Var.a && this.b == qc0Var.b && this.c == qc0Var.c && this.d == qc0Var.d && this.e == qc0Var.e && this.g == qc0Var.g;
    }

    public final int hashCode() {
        return (p91.e(p91.e((this.c.hashCode() + p91.e(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }

    public qc0(int i) {
        this(224, (i & 4) != 0, true);
    }
}
