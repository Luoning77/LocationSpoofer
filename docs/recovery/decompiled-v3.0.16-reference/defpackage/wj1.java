package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wj1 implements gy, Iterable, p81 {
    public final long e;
    public final long f;

    public wj1(long j, long j2) {
        this.e = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.f = j2;
    }

    @Override // defpackage.gy
    public final Comparable a() {
        return Long.valueOf(this.e);
    }

    @Override // defpackage.gy
    public final Comparable b() {
        return Long.valueOf(this.f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wj1)) {
            return false;
        }
        if (isEmpty() && ((wj1) obj).isEmpty()) {
            return true;
        }
        wj1 wj1Var = (wj1) obj;
        return this.e == wj1Var.e && this.f == wj1Var.f;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.f) + (Long.hashCode(this.e) * 31);
    }

    @Override // defpackage.gy
    public final boolean isEmpty() {
        return this.e > this.f;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new vj1(this.e, this.f);
    }

    public final String toString() {
        return this.e + ".." + this.f;
    }
}
