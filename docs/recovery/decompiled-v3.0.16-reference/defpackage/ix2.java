package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ix2 implements q30, Iterable, p81 {
    public final hx2 e;
    public final int f;
    public final int g;

    public ix2(hx2 hx2Var, int i, int i2) {
        this.e = hx2Var;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ix2)) {
            return false;
        }
        ix2 ix2Var = (ix2) obj;
        return ix2Var.f == this.f && ix2Var.g == this.g && ix2Var.e == this.e;
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.f;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        hx2 hx2Var = this.e;
        if (hx2Var.l != this.g) {
            jx2.e();
        }
        int i = this.f;
        hx2Var.f(i);
        return new xw0(hx2Var, i + 1, hx2Var.e[(i * 5) + 3] + i);
    }
}
