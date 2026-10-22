package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ai3 {
    public final boolean a;
    public final zh3 b;
    public final int c;
    public final o90[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public ai3(boolean z, zh3 zh3Var) {
        int i;
        this.a = z;
        this.b = zh3Var;
        if (z && zh3Var.equals(zh3.e)) {
            fo.n("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = zh3Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                b81.d();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new o90[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        o90[] o90VarArr = this.d;
        o90 o90Var = o90VarArr[i];
        if (o90Var != null) {
            o90Var.a = j;
            o90Var.b = f;
        } else {
            o90 o90Var2 = new o90();
            o90Var2.a = j;
            o90Var2.b = f;
            o90VarArr[i] = o90Var2;
        }
    }

    public final float b(float f) {
        zh3 zh3Var;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float fSignum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            p21.c("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.e;
        o90[] o90VarArr = this.d;
        o90 o90Var = o90VarArr[i2];
        if (o90Var == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            o90 o90Var2 = o90Var;
            while (true) {
                o90 o90Var3 = o90VarArr[i2];
                boolean z2 = this.a;
                zh3Var = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (o90Var3 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = o90Var.a;
                f2 = f4;
                int i4 = i2;
                long j2 = o90Var3.a;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - o90Var2.a);
                o90Var2 = (zh3Var == zh3.e || z) ? o90Var3 : o90Var;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = o90Var3.b;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.c) {
                int iOrdinal = zh3Var.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        k93.j(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iOrdinal != i) {
                        b81.d();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f6 = fArr2[i5];
                    int i6 = i5;
                    float fAbs2 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f7 = fArr2[i7];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f))));
                            if (i6 == i5) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i6--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f));
                }
                f3 = fSignum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f9 = -f;
            if (f3 < f9) {
                return f9;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ ai3() {
        this(false, zh3.e);
    }

    public ai3(int i) {
        this(true, zh3.f);
    }
}
