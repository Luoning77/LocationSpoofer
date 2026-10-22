package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cs2 implements Comparable {
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final int i;

    public cs2(boolean z, int i, int i2, int i3, int i4) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = z;
        this.i = i4;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(cs2 cs2Var) {
        cs2Var.getClass();
        boolean z = cs2Var.h;
        int i = cs2Var.e;
        int i2 = this.e;
        if (i2 != i) {
            return o51.m(i2, i);
        }
        int i3 = cs2Var.f;
        int i4 = this.f;
        if (i4 != i3) {
            return o51.m(i4, i3);
        }
        int i5 = cs2Var.g;
        int i6 = this.g;
        if (i6 != i5) {
            return o51.m(i6, i5);
        }
        boolean z2 = this.h;
        if (!z2 && z) {
            return 1;
        }
        if (z2 && !z) {
            return -1;
        }
        if (z2 || z) {
            return o51.m(this.i, cs2Var.i);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs2)) {
            return false;
        }
        cs2 cs2Var = (cs2) obj;
        return this.e == cs2Var.e && this.f == cs2Var.f && this.g == cs2Var.g && this.h == cs2Var.h && this.i == cs2Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + p91.e(p91.b(this.g, p91.b(this.f, Integer.hashCode(this.e) * 31, 31), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbS = p91.s("SemVer(major=", ", minor=", this.e, this.f, ", patch=");
        sbS.append(this.g);
        sbS.append(", isBeta=");
        sbS.append(this.h);
        sbS.append(", betaNumber=");
        sbS.append(this.i);
        sbS.append(")");
        return sbS.toString();
    }
}
