package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k41 extends i41 implements gy {
    public static final k41 h = new k41(1, 0, 1);

    @Override // defpackage.gy
    public final Comparable a() {
        return Integer.valueOf(this.e);
    }

    @Override // defpackage.gy
    public final Comparable b() {
        return Integer.valueOf(this.f);
    }

    public final boolean c(int i) {
        return this.e <= i && i <= this.f;
    }

    @Override // defpackage.i41
    public final boolean equals(Object obj) {
        if (!(obj instanceof k41)) {
            return false;
        }
        if (isEmpty() && ((k41) obj).isEmpty()) {
            return true;
        }
        k41 k41Var = (k41) obj;
        return this.e == k41Var.e && this.f == k41Var.f;
    }

    @Override // defpackage.i41
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.e * 31) + this.f;
    }

    @Override // defpackage.i41, defpackage.gy
    public final boolean isEmpty() {
        return this.e > this.f;
    }

    @Override // defpackage.i41
    public final String toString() {
        return this.e + ".." + this.f;
    }
}
