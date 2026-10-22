package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class i41 implements Iterable, p81 {
    public final int e;
    public final int f;
    public final int g;

    public i41(int i, int i2, int i3) {
        if (i3 == 0) {
            fo.i("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            fo.i("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.e = i;
        this.f = mc0.u(i, i2, i3);
        this.g = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i41)) {
            return false;
        }
        if (isEmpty() && ((i41) obj).isEmpty()) {
            return true;
        }
        i41 i41Var = (i41) obj;
        return this.e == i41Var.e && this.f == i41Var.f && this.g == i41Var.g;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.e * 31) + this.f) * 31) + this.g;
    }

    public boolean isEmpty() {
        int i = this.f;
        int i2 = this.g;
        int i3 = this.e;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j41(this.e, this.f, this.g);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f;
        int i2 = this.g;
        int i3 = this.e;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
