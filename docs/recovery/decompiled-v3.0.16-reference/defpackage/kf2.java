package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kf2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final up g;

    public kf2(long j, long j2, long j3, long j4, long j5, float[] fArr, up upVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = upVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && kf2.class == obj.getClass()) {
            kf2 kf2Var = (kf2) obj;
            if (this.a == kf2Var.a && this.b == kf2Var.b && this.e == kf2Var.e && h41.a(this.c, kf2Var.c) && h41.a(this.d, kf2Var.d)) {
                float[] fArr = kf2Var.f;
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    if (fArr == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                } else if (fArr == null) {
                    zEquals = false;
                } else {
                    zEquals = fArr2.equals(fArr);
                }
                return zEquals && this.g == kf2Var.g;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = p91.c(p91.c(p91.c(p91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iC + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
