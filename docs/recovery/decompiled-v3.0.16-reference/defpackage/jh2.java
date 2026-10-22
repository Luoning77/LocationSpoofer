package defpackage;

import java.util.Arrays;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jh2 extends oz {
    public static final b81 r = new b81(11);
    public final gk3 d;
    public final float e;
    public final float f;
    public final yb3 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final pd0 k;
    public final ih2 l;
    public final fh2 m;
    public final pd0 n;
    public final ih2 o;
    public final fh2 p;
    public final boolean q;

    /* JADX WARN: Code duplicated, block: B:41:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x0213  */
    /* JADX WARN: Code duplicated, block: B:56:0x021c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0230  */
    /* JADX WARN: Code duplicated, block: B:65:0x0248  */
    /* JADX WARN: Code duplicated, block: B:75:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x020e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public jh2(String str, float[] fArr, gk3 gk3Var, float[] fArr2, pd0 pd0Var, pd0 pd0Var2, float f, float f2, yb3 yb3Var, int i) {
        char c;
        float f3;
        float[] fArr3;
        float f4;
        float[] fArr4;
        jh2 jh2Var;
        double d;
        boolean z;
        int i2;
        super(str, 12884901888L, i);
        this.d = gk3Var;
        this.e = f;
        this.f = f2;
        this.g = yb3Var;
        this.k = pd0Var;
        int i3 = 1;
        this.l = new ih2(this, i3);
        int i4 = 0;
        this.m = new fh2(this, i4);
        this.n = pd0Var2;
        this.o = new ih2(this, i4);
        this.p = new fh2(this, i3);
        if (fArr.length != 6 && fArr.length != 9) {
            fo.i("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr5 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr5[0] = f5 / f7;
            fArr5[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr5[2] = f8 / f10;
            fArr5[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr5[4] = f11 / f13;
            fArr5[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr5, 0, 6);
        }
        this.h = fArr5;
        if (fArr2 == null) {
            float f14 = fArr5[0];
            float f15 = fArr5[1];
            float f16 = fArr5[2];
            float f17 = fArr5[3];
            float f18 = fArr5[4];
            float f19 = fArr5[5];
            f3 = 1.0f;
            float f20 = gk3Var.a;
            c = 1;
            float f21 = gk3Var.b;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            fArr3 = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
            this.i = fArr3;
        } else {
            c = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.i = fArr2;
            fArr3 = fArr2;
        }
        this.j = k22.z(fArr3);
        float fP = ke0.p(fArr5);
        float[] fArr6 = qz.a;
        if (fP / ke0.p(qz.b) > 0.9f) {
            float[] fArr7 = qz.a;
            float f38 = fArr5[0];
            float f39 = fArr7[0];
            float f40 = fArr5[c];
            float f41 = fArr7[c];
            float f42 = fArr5[2];
            float f43 = fArr7[2];
            float f44 = fArr5[3];
            float f45 = fArr7[3];
            float f46 = fArr5[4];
            float f47 = fArr7[4];
            float f48 = fArr5[5];
            float f49 = fArr7[5];
            f4 = 0.0f;
            float[] fArr8 = new float[6];
            fArr8[0] = f38 - f39;
            fArr8[c] = f40 - f41;
            fArr8[2] = f42 - f43;
            fArr8[3] = f44 - f45;
            fArr8[4] = f46 - f47;
            fArr8[5] = f48 - f49;
            float f50 = fArr8[0];
            float f51 = fArr8[c];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr8[2];
                float f53 = fArr8[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr8[4];
                    float f55 = fArr8[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                fArr4 = qz.a;
                if (fArr5 == fArr4) {
                    i2 = 0;
                    while (true) {
                        if (i2 < 6) {
                            if (Float.compare(fArr5[i2], fArr4[i2]) != 0 || Math.abs(fArr5[i2] - fArr4[i2]) <= 0.001f) {
                                i2++;
                            }
                        } else if (k22.n(gk3Var, k22.u)) {
                            float[] fArr9 = qz.a;
                            jh2Var = qz.e;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = c;
                                } else if (Math.abs(pd0Var.c(d) - jh2Var.k.c(d)) > 0.001d) {
                                }
                                d += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (k22.n(gk3Var, k22.u) && f == f4 && f2 == f3) {
                    float[] fArr10 = qz.a;
                    jh2Var = qz.e;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = c;
                        } else if (Math.abs(pd0Var.c(d) - jh2Var.k.c(d)) > 0.001d && Math.abs(pd0Var2.c(d) - jh2Var.n.c(d)) <= 0.001d) {
                            d += 0.00392156862745098d;
                        }
                    }
                }
                z = 0;
            } else {
                z = c;
            }
            this.q = z;
        }
        f4 = 0.0f;
        int i5 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            fArr4 = qz.a;
            if (fArr5 == fArr4) {
                i2 = 0;
                while (true) {
                    if (i2 < 6) {
                        if (Float.compare(fArr5[i2], fArr4[i2]) != 0) {
                        }
                        i2++;
                    } else if (k22.n(gk3Var, k22.u)) {
                        float[] fArr11 = qz.a;
                        jh2Var = qz.e;
                        d = 0.0d;
                        while (true) {
                            if (d <= 1.0d) {
                                z = c;
                            } else if (Math.abs(pd0Var.c(d) - jh2Var.k.c(d)) > 0.001d) {
                            }
                            d += 0.00392156862745098d;
                        }
                    }
                }
            } else if (k22.n(gk3Var, k22.u)) {
                float[] fArr12 = qz.a;
                jh2Var = qz.e;
                d = 0.0d;
                while (true) {
                    if (d <= 1.0d) {
                        z = c;
                    } else if (Math.abs(pd0Var.c(d) - jh2Var.k.c(d)) > 0.001d) {
                    }
                    d += 0.00392156862745098d;
                }
            }
            z = 0;
        } else {
            z = c;
        }
        this.q = z;
    }

    @Override // defpackage.oz
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.oz
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.oz
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.oz
    public final long d(float f, float f2, float f3) {
        double d = f;
        fh2 fh2Var = this.p;
        float fC = (float) fh2Var.c(d);
        float fC2 = (float) fh2Var.c(f2);
        float fC3 = (float) fh2Var.c(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fC3) + ((fArr[3] * fC2) + (fArr[0] * fC)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC))));
    }

    @Override // defpackage.oz
    public final float e(float f, float f2, float f3) {
        double d = f;
        fh2 fh2Var = this.p;
        float fC = (float) fh2Var.c(d);
        float fC2 = (float) fh2Var.c(f2);
        float fC3 = (float) fh2Var.c(f3);
        float[] fArr = this.i;
        return (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
    }

    @Override // defpackage.oz
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jh2.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        jh2 jh2Var = (jh2) obj;
        if (Float.compare(jh2Var.e, this.e) != 0 || Float.compare(jh2Var.f, this.f) != 0 || !o51.f(this.d, jh2Var.d) || !Arrays.equals(this.h, jh2Var.h)) {
            return false;
        }
        yb3 yb3Var = jh2Var.g;
        yb3 yb3Var2 = this.g;
        if (yb3Var2 != null) {
            return o51.f(yb3Var2, yb3Var);
        }
        if (yb3Var == null) {
            return true;
        }
        if (o51.f(this.k, jh2Var.k)) {
            return o51.f(this.n, jh2Var.n);
        }
        return false;
    }

    @Override // defpackage.oz
    public final long f(float f, float f2, float f3, float f4, oz ozVar) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        fh2 fh2Var = this.m;
        return xp1.b((float) fh2Var.c(f5), (float) fh2Var.c(f6), (float) fh2Var.c(f7), f4, ozVar);
    }

    @Override // defpackage.oz
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        yb3 yb3Var = this.g;
        int iHashCode2 = iFloatToIntBits2 + (yb3Var != null ? yb3Var.hashCode() : 0);
        if (yb3Var != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public jh2(String str, float[] fArr, gk3 gk3Var, final yb3 yb3Var, int i) {
        double d;
        pd0 pd0Var;
        pd0 pd0Var2;
        double d2 = yb3Var.a;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = yb3Var.g;
        double d4 = yb3Var.f;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            pd0Var = new pd0() { // from class: hh2
                @Override // defpackage.pd0
                public final double c(double d5) {
                    int i5 = i4;
                    yb3 yb3Var2 = yb3Var;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = qz.a;
                            return qz.a(yb3Var2, d5);
                        case 1:
                            float[] fArr3 = qz.a;
                            return qz.c(yb3Var2, d5);
                        case 2:
                            double d6 = yb3Var2.b;
                            return d5 >= yb3Var2.e ? Math.pow((d6 * d5) + yb3Var2.c, yb3Var2.a) : yb3Var2.d * d5;
                        case 3:
                            double d7 = yb3Var2.b;
                            double d8 = yb3Var2.c;
                            double d9 = yb3Var2.d;
                            return d5 >= yb3Var2.e ? Math.pow((d7 * d5) + d8, yb3Var2.a) + yb3Var2.f : (d9 * d5) + yb3Var2.g;
                        case 4:
                            float[] fArr4 = qz.a;
                            return qz.b(yb3Var2, d5);
                        case Logger.WARN /* 5 */:
                            float[] fArr5 = qz.a;
                            return qz.d(yb3Var2, d5);
                        case Logger.ERROR /* 6 */:
                            double d10 = yb3Var2.b;
                            double d11 = yb3Var2.c;
                            double d12 = yb3Var2.d;
                            return d5 >= yb3Var2.e * d12 ? (Math.pow(d5, 1.0d / yb3Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = yb3Var2.b;
                            double d14 = yb3Var2.c;
                            double d15 = yb3Var2.d;
                            return d5 >= yb3Var2.e * d15 ? (Math.pow(d5 - yb3Var2.f, 1.0d / yb3Var2.a) - d14) / d13 : (d5 - yb3Var2.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                pd0Var = new pd0() { // from class: hh2
                    @Override // defpackage.pd0
                    public final double c(double d5) {
                        int i6 = i5;
                        yb3 yb3Var2 = yb3Var;
                        switch (i6) {
                            case 0:
                                float[] fArr2 = qz.a;
                                return qz.a(yb3Var2, d5);
                            case 1:
                                float[] fArr3 = qz.a;
                                return qz.c(yb3Var2, d5);
                            case 2:
                                double d6 = yb3Var2.b;
                                return d5 >= yb3Var2.e ? Math.pow((d6 * d5) + yb3Var2.c, yb3Var2.a) : yb3Var2.d * d5;
                            case 3:
                                double d7 = yb3Var2.b;
                                double d8 = yb3Var2.c;
                                double d9 = yb3Var2.d;
                                return d5 >= yb3Var2.e ? Math.pow((d7 * d5) + d8, yb3Var2.a) + yb3Var2.f : (d9 * d5) + yb3Var2.g;
                            case 4:
                                float[] fArr4 = qz.a;
                                return qz.b(yb3Var2, d5);
                            case Logger.WARN /* 5 */:
                                float[] fArr5 = qz.a;
                                return qz.d(yb3Var2, d5);
                            case Logger.ERROR /* 6 */:
                                double d10 = yb3Var2.b;
                                double d11 = yb3Var2.c;
                                double d12 = yb3Var2.d;
                                return d5 >= yb3Var2.e * d12 ? (Math.pow(d5, 1.0d / yb3Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = yb3Var2.b;
                                double d14 = yb3Var2.c;
                                double d15 = yb3Var2.d;
                                return d5 >= yb3Var2.e * d15 ? (Math.pow(d5 - yb3Var2.f, 1.0d / yb3Var2.a) - d14) / d13 : (d5 - yb3Var2.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                pd0Var = new pd0() { // from class: hh2
                    @Override // defpackage.pd0
                    public final double c(double d5) {
                        int i7 = i6;
                        yb3 yb3Var2 = yb3Var;
                        switch (i7) {
                            case 0:
                                float[] fArr2 = qz.a;
                                return qz.a(yb3Var2, d5);
                            case 1:
                                float[] fArr3 = qz.a;
                                return qz.c(yb3Var2, d5);
                            case 2:
                                double d6 = yb3Var2.b;
                                return d5 >= yb3Var2.e ? Math.pow((d6 * d5) + yb3Var2.c, yb3Var2.a) : yb3Var2.d * d5;
                            case 3:
                                double d7 = yb3Var2.b;
                                double d8 = yb3Var2.c;
                                double d9 = yb3Var2.d;
                                return d5 >= yb3Var2.e ? Math.pow((d7 * d5) + d8, yb3Var2.a) + yb3Var2.f : (d9 * d5) + yb3Var2.g;
                            case 4:
                                float[] fArr4 = qz.a;
                                return qz.b(yb3Var2, d5);
                            case Logger.WARN /* 5 */:
                                float[] fArr5 = qz.a;
                                return qz.d(yb3Var2, d5);
                            case Logger.ERROR /* 6 */:
                                double d10 = yb3Var2.b;
                                double d11 = yb3Var2.c;
                                double d12 = yb3Var2.d;
                                return d5 >= yb3Var2.e * d12 ? (Math.pow(d5, 1.0d / yb3Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = yb3Var2.b;
                                double d14 = yb3Var2.c;
                                double d15 = yb3Var2.d;
                                return d5 >= yb3Var2.e * d15 ? (Math.pow(d5 - yb3Var2.f, 1.0d / yb3Var2.a) - d14) / d13 : (d5 - yb3Var2.g) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                pd0Var = new pd0() { // from class: hh2
                    @Override // defpackage.pd0
                    public final double c(double d5) {
                        int i8 = i7;
                        yb3 yb3Var2 = yb3Var;
                        switch (i8) {
                            case 0:
                                float[] fArr2 = qz.a;
                                return qz.a(yb3Var2, d5);
                            case 1:
                                float[] fArr3 = qz.a;
                                return qz.c(yb3Var2, d5);
                            case 2:
                                double d6 = yb3Var2.b;
                                return d5 >= yb3Var2.e ? Math.pow((d6 * d5) + yb3Var2.c, yb3Var2.a) : yb3Var2.d * d5;
                            case 3:
                                double d7 = yb3Var2.b;
                                double d8 = yb3Var2.c;
                                double d9 = yb3Var2.d;
                                return d5 >= yb3Var2.e ? Math.pow((d7 * d5) + d8, yb3Var2.a) + yb3Var2.f : (d9 * d5) + yb3Var2.g;
                            case 4:
                                float[] fArr4 = qz.a;
                                return qz.b(yb3Var2, d5);
                            case Logger.WARN /* 5 */:
                                float[] fArr5 = qz.a;
                                return qz.d(yb3Var2, d5);
                            case Logger.ERROR /* 6 */:
                                double d10 = yb3Var2.b;
                                double d11 = yb3Var2.c;
                                double d12 = yb3Var2.d;
                                return d5 >= yb3Var2.e * d12 ? (Math.pow(d5, 1.0d / yb3Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = yb3Var2.b;
                                double d14 = yb3Var2.c;
                                double d15 = yb3Var2.d;
                                return d5 >= yb3Var2.e * d15 ? (Math.pow(d5 - yb3Var2.f, 1.0d / yb3Var2.a) - d14) / d13 : (d5 - yb3Var2.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            pd0Var2 = new pd0() { // from class: hh2
                @Override // defpackage.pd0
                public final double c(double d5) {
                    int i8 = i2;
                    yb3 yb3Var2 = yb3Var;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = qz.a;
                            return qz.a(yb3Var2, d5);
                        case 1:
                            float[] fArr3 = qz.a;
                            return qz.c(yb3Var2, d5);
                        case 2:
                            double d6 = yb3Var2.b;
                            return d5 >= yb3Var2.e ? Math.pow((d6 * d5) + yb3Var2.c, yb3Var2.a) : yb3Var2.d * d5;
                        case 3:
                            double d7 = yb3Var2.b;
                            double d8 = yb3Var2.c;
                            double d9 = yb3Var2.d;
                            return d5 >= yb3Var2.e ? Math.pow((d7 * d5) + d8, yb3Var2.a) + yb3Var2.f : (d9 * d5) + yb3Var2.g;
                        case 4:
                            float[] fArr4 = qz.a;
                            return qz.b(yb3Var2, d5);
                        case Logger.WARN /* 5 */:
                            float[] fArr5 = qz.a;
                            return qz.d(yb3Var2, d5);
                        case Logger.ERROR /* 6 */:
                            double d10 = yb3Var2.b;
                            double d11 = yb3Var2.c;
                            double d12 = yb3Var2.d;
                            return d5 >= yb3Var2.e * d12 ? (Math.pow(d5, 1.0d / yb3Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = yb3Var2.b;
                            double d14 = yb3Var2.c;
                            double d15 = yb3Var2.d;
                            return d5 >= yb3Var2.e * d15 ? (Math.pow(d5 - yb3Var2.f, 1.0d / yb3Var2.a) - d14) / d13 : (d5 - yb3Var2.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            pd0Var2 = new pd0() { // from class: hh2
                @Override // defpackage.pd0
                public final double c(double d5) {
                    int i8 = i3;
                    yb3 yb3Var2 = yb3Var;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = qz.a;
                            return qz.a(yb3Var2, d5);
                        case 1:
                            float[] fArr3 = qz.a;
                            return qz.c(yb3Var2, d5);
                        case 2:
                            double d6 = yb3Var2.b;
                            return d5 >= yb3Var2.e ? Math.pow((d6 * d5) + yb3Var2.c, yb3Var2.a) : yb3Var2.d * d5;
                        case 3:
                            double d7 = yb3Var2.b;
                            double d8 = yb3Var2.c;
                            double d9 = yb3Var2.d;
                            return d5 >= yb3Var2.e ? Math.pow((d7 * d5) + d8, yb3Var2.a) + yb3Var2.f : (d9 * d5) + yb3Var2.g;
                        case 4:
                            float[] fArr4 = qz.a;
                            return qz.b(yb3Var2, d5);
                        case Logger.WARN /* 5 */:
                            float[] fArr5 = qz.a;
                            return qz.d(yb3Var2, d5);
                        case Logger.ERROR /* 6 */:
                            double d10 = yb3Var2.b;
                            double d11 = yb3Var2.c;
                            double d12 = yb3Var2.d;
                            return d5 >= yb3Var2.e * d12 ? (Math.pow(d5, 1.0d / yb3Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = yb3Var2.b;
                            double d14 = yb3Var2.c;
                            double d15 = yb3Var2.d;
                            return d5 >= yb3Var2.e * d15 ? (Math.pow(d5 - yb3Var2.f, 1.0d / yb3Var2.a) - d14) / d13 : (d5 - yb3Var2.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            pd0Var2 = new pd0() { // from class: hh2
                @Override // defpackage.pd0
                public final double c(double d5) {
                    int i9 = i8;
                    yb3 yb3Var2 = yb3Var;
                    switch (i9) {
                        case 0:
                            float[] fArr2 = qz.a;
                            return qz.a(yb3Var2, d5);
                        case 1:
                            float[] fArr3 = qz.a;
                            return qz.c(yb3Var2, d5);
                        case 2:
                            double d6 = yb3Var2.b;
                            return d5 >= yb3Var2.e ? Math.pow((d6 * d5) + yb3Var2.c, yb3Var2.a) : yb3Var2.d * d5;
                        case 3:
                            double d7 = yb3Var2.b;
                            double d8 = yb3Var2.c;
                            double d9 = yb3Var2.d;
                            return d5 >= yb3Var2.e ? Math.pow((d7 * d5) + d8, yb3Var2.a) + yb3Var2.f : (d9 * d5) + yb3Var2.g;
                        case 4:
                            float[] fArr4 = qz.a;
                            return qz.b(yb3Var2, d5);
                        case Logger.WARN /* 5 */:
                            float[] fArr5 = qz.a;
                            return qz.d(yb3Var2, d5);
                        case Logger.ERROR /* 6 */:
                            double d10 = yb3Var2.b;
                            double d11 = yb3Var2.c;
                            double d12 = yb3Var2.d;
                            return d5 >= yb3Var2.e * d12 ? (Math.pow(d5, 1.0d / yb3Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = yb3Var2.b;
                            double d14 = yb3Var2.c;
                            double d15 = yb3Var2.d;
                            return d5 >= yb3Var2.e * d15 ? (Math.pow(d5 - yb3Var2.f, 1.0d / yb3Var2.a) - d14) / d13 : (d5 - yb3Var2.g) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            pd0Var2 = new pd0() { // from class: hh2
                @Override // defpackage.pd0
                public final double c(double d5) {
                    int i10 = i9;
                    yb3 yb3Var2 = yb3Var;
                    switch (i10) {
                        case 0:
                            float[] fArr2 = qz.a;
                            return qz.a(yb3Var2, d5);
                        case 1:
                            float[] fArr3 = qz.a;
                            return qz.c(yb3Var2, d5);
                        case 2:
                            double d6 = yb3Var2.b;
                            return d5 >= yb3Var2.e ? Math.pow((d6 * d5) + yb3Var2.c, yb3Var2.a) : yb3Var2.d * d5;
                        case 3:
                            double d7 = yb3Var2.b;
                            double d8 = yb3Var2.c;
                            double d9 = yb3Var2.d;
                            return d5 >= yb3Var2.e ? Math.pow((d7 * d5) + d8, yb3Var2.a) + yb3Var2.f : (d9 * d5) + yb3Var2.g;
                        case 4:
                            float[] fArr4 = qz.a;
                            return qz.b(yb3Var2, d5);
                        case Logger.WARN /* 5 */:
                            float[] fArr5 = qz.a;
                            return qz.d(yb3Var2, d5);
                        case Logger.ERROR /* 6 */:
                            double d10 = yb3Var2.b;
                            double d11 = yb3Var2.c;
                            double d12 = yb3Var2.d;
                            return d5 >= yb3Var2.e * d12 ? (Math.pow(d5, 1.0d / yb3Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = yb3Var2.b;
                            double d14 = yb3Var2.c;
                            double d15 = yb3Var2.d;
                            return d5 >= yb3Var2.e * d15 ? (Math.pow(d5 - yb3Var2.f, 1.0d / yb3Var2.a) - d14) / d13 : (d5 - yb3Var2.g) / d15;
                    }
                }
            };
        }
        this(str, fArr, gk3Var, null, pd0Var, pd0Var2, 0.0f, 1.0f, yb3Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jh2(String str, float[] fArr, gk3 gk3Var, final double d, float f, float f2, int i) {
        pd0 pd0Var;
        pd0 pd0Var2 = r;
        if (d == 1.0d) {
            pd0Var = pd0Var2;
        } else {
            final int i2 = 0;
            pd0Var = new pd0() { // from class: gh2
                @Override // defpackage.pd0
                public final double c(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            pd0Var2 = new pd0() { // from class: gh2
                @Override // defpackage.pd0
                public final double c(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        pd0 pd0Var3 = pd0Var2;
        this(str, fArr, gk3Var, null, pd0Var, pd0Var3, f, f2, new yb3(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
