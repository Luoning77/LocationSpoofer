package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ki0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;
    public final boolean q;

    public ki0(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9, int i10, int i11, int i12, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = j;
        this.l = i9;
        this.m = i10;
        this.n = i11;
        this.o = i12;
        this.p = z;
        this.q = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki0)) {
            return false;
        }
        ki0 ki0Var = (ki0) obj;
        return o51.f(this.a, ki0Var.a) && o51.f(this.b, ki0Var.b) && this.c == ki0Var.c && this.d == ki0Var.d && this.e == ki0Var.e && this.f == ki0Var.f && this.g == ki0Var.g && this.h == ki0Var.h && this.i == ki0Var.i && this.j == ki0Var.j && this.k == ki0Var.k && this.l == ki0Var.l && this.m == ki0Var.m && this.n == ki0Var.n && this.o == ki0Var.o && this.p == ki0Var.p && this.q == ki0Var.q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.q) + p91.e(p91.b(this.o, p91.b(this.n, p91.b(this.m, p91.b(this.l, p91.c(p91.b(this.j, p91.b(this.i, p91.b(this.h, p91.b(this.g, p91.b(this.f, p91.b(this.e, p91.b(this.d, p91.b(this.c, p91.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.k), 31), 31), 31), 31), 31, this.p);
    }

    public final String toString() {
        StringBuilder sbT = p91.t("EditableCellItem(cellKey=", this.a, ", type=", this.b, ", mcc=");
        az2.w(sbT, this.c, ", mnc=", this.d, ", tac=");
        az2.w(sbT, this.e, ", ci=", this.f, ", pci=");
        az2.w(sbT, this.g, ", lac=", this.h, ", cid=");
        az2.w(sbT, this.i, ", psc=", this.j, ", nci=");
        sbT.append(this.k);
        sbT.append(", networkId=");
        sbT.append(this.l);
        sbT.append(", systemId=");
        sbT.append(this.m);
        sbT.append(", basestationId=");
        sbT.append(this.n);
        sbT.append(", dbm=");
        sbT.append(this.o);
        sbT.append(", isRegistered=");
        sbT.append(this.p);
        sbT.append(", isDesignated=");
        sbT.append(this.q);
        sbT.append(")");
        return sbT.toString();
    }
}
