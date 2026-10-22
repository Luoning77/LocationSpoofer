package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ch3 implements Comparable, Serializable {
    public static final ch3 g = new ch3(0, 0);
    public final long e;
    public final long f;

    public ch3(long j, long j2) {
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ch3 ch3Var = (ch3) obj;
        ch3Var.getClass();
        long j = ch3Var.e;
        long j2 = this.e;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.f, ch3Var.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch3)) {
            return false;
        }
        ch3 ch3Var = (ch3) obj;
        return this.e == ch3Var.e && this.f == ch3Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.e ^ this.f);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        g83.a(this.e, bArr, 0, 0, 4);
        bArr[8] = 45;
        g83.a(this.e, bArr, 9, 4, 6);
        bArr[13] = 45;
        g83.a(this.e, bArr, 14, 6, 8);
        bArr[18] = 45;
        g83.a(this.f, bArr, 19, 0, 2);
        bArr[23] = 45;
        g83.a(this.f, bArr, 24, 2, 8);
        return new String(bArr, sw.a);
    }
}
