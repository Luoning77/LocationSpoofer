package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wh3 implements th3 {
    public final fx1 e;
    public final gx1 f;
    public final int g;
    public final jh0 h;
    public int[] i = sh3.a;
    public float[] j;
    public yi k;
    public yi l;
    public yi m;
    public yi n;
    public float[] o;
    public float[] p;
    public t1 q;

    public wh3(fx1 fx1Var, gx1 gx1Var, int i, jh0 jh0Var) {
        this.e = fx1Var;
        this.f = gx1Var;
        this.g = i;
        this.h = jh0Var;
        float[] fArr = sh3.b;
        this.j = fArr;
        this.o = fArr;
        this.p = fArr;
        this.q = sh3.c;
    }

    public final int c(int i) {
        int i2;
        fx1 fx1Var = this.e;
        int i3 = fx1Var.b;
        int i4 = 0;
        if (i3 <= 0) {
            fo.p("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = fx1Var.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float d(int i, int i2, boolean z) {
        jh0 jh0Var;
        float f;
        fx1 fx1Var = this.e;
        if (i >= fx1Var.b - 1) {
            f = i2;
        } else {
            int iC = fx1Var.c(i);
            int iC2 = fx1Var.c(i + 1);
            if (i2 != iC) {
                int i3 = iC2 - iC;
                vh3 vh3Var = (vh3) this.f.b(iC);
                if (vh3Var == null || (jh0Var = vh3Var.b) == null) {
                    jh0Var = this.h;
                }
                float f2 = i3;
                float fB = jh0Var.b((i2 - iC) / f2);
                return z ? fB : ((f2 * fB) + iC) / 1000.0f;
            }
            f = iC;
        }
        return f / 1000.0f;
    }

    public final void e(yi yiVar, yi yiVar2, yi yiVar3) {
        float[] fArr;
        boolean z = this.q != sh3.c;
        yi yiVar4 = this.k;
        gx1 gx1Var = this.f;
        fx1 fx1Var = this.e;
        if (yiVar4 == null) {
            this.k = yiVar.c();
            this.l = yiVar3.c();
            int i = fx1Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = fx1Var.c(i2) / 1000.0f;
            }
            this.j = fArr2;
            int i3 = fx1Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.i = iArr;
        }
        if (z) {
            if (this.q != sh3.c && o51.f(this.m, yiVar) && o51.f(this.n, yiVar2)) {
                return;
            }
            this.m = yiVar;
            this.n = yiVar2;
            int iB = yiVar.b() + (yiVar.b() % 2);
            this.o = new float[iB];
            this.p = new float[iB];
            int i5 = fx1Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = fx1Var.c(i6);
                vh3 vh3Var = (vh3) gx1Var.b(iC);
                if (iC == 0 && vh3Var == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = yiVar.a(i7);
                    }
                } else if (iC == this.g && vh3Var == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = yiVar2.a(i8);
                    }
                } else {
                    vh3Var.getClass();
                    yi yiVar5 = vh3Var.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = yiVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.q = new t1(this.i, this.j, fArr3);
        }
    }

    @Override // defpackage.th3
    public final int l() {
        return 0;
    }

    @Override // defpackage.rh3
    public final yi m(long j, yi yiVar, yi yiVar2, yi yiVar3) {
        long j2 = j / 1000000;
        int[] iArr = sh3.a;
        long j3 = this.g;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return yiVar3;
        }
        e(yiVar, yiVar2, yiVar3);
        yi yiVar4 = this.l;
        yiVar4.getClass();
        int i = 0;
        if (this.q != sh3.c) {
            int i2 = (int) j4;
            float fD = d(c(i2), i2, false);
            float[] fArr = this.p;
            bo[][] boVarArr = (bo[][]) this.q.f;
            float f = boVarArr[0][0].a;
            float f2 = boVarArr[boVarArr.length - 1][0].b;
            if (fD < f) {
                fD = f;
            }
            if (fD <= f2) {
                f2 = fD;
            }
            int length = fArr.length;
            boolean z = false;
            for (bo[] boVarArr2 : boVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    bo boVar = boVarArr2[i4];
                    if (f2 <= boVar.b) {
                        if (boVar.p) {
                            fArr[i3] = boVar.q;
                            fArr[i3 + 1] = boVar.r;
                        } else {
                            boVar.c(f2);
                            fArr[i3] = boVar.a();
                            fArr[i3 + 1] = boVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                yiVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            yi yiVarP = p((j4 - 1) * 1000000, yiVar, yiVar2, yiVar3);
            yi yiVarP2 = p(j4 * 1000000, yiVar, yiVar2, yiVar3);
            int iB = yiVarP.b();
            while (i < iB) {
                yiVar4.e(i, (yiVarP.a(i) - yiVarP2.a(i)) * 1000.0f);
                i++;
            }
        }
        return yiVar4;
    }

    @Override // defpackage.th3
    public final int o() {
        return this.g;
    }

    @Override // defpackage.rh3
    public final yi p(long j, yi yiVar, yi yiVar2, yi yiVar3) {
        yi yiVar4;
        yi yiVar5;
        yi yiVar6 = yiVar;
        long j2 = j / 1000000;
        int[] iArr = sh3.a;
        int i = this.g;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        gx1 gx1Var = this.f;
        vh3 vh3Var = (vh3) gx1Var.b(i2);
        if (vh3Var != null) {
            return vh3Var.a;
        }
        if (i2 >= i) {
            return yiVar2;
        }
        if (i2 <= 0) {
            return yiVar6;
        }
        e(yiVar6, yiVar2, yiVar3);
        yi yiVar7 = this.k;
        yiVar7.getClass();
        int i3 = 0;
        if (this.q != sh3.c) {
            float fD = d(c(i2), i2, false);
            float[] fArr = this.o;
            bo[][] boVarArr = (bo[][]) this.q.f;
            int length = boVarArr.length - 1;
            float f = boVarArr[0][0].a;
            float f2 = boVarArr[length][0].b;
            int length2 = fArr.length;
            if (fD < f || fD > f2) {
                if (fD > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fD - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    bo boVar = boVarArr[length][i5];
                    boolean z = boVar.p;
                    float f4 = boVar.r;
                    float f5 = boVar.q;
                    if (z) {
                        float f6 = boVar.a;
                        float f7 = boVar.k;
                        float f8 = boVar.c;
                        fArr[i4] = (f5 * f3) + ((boVar.e - f8) * (f - f6) * f7) + f8;
                        float f9 = (f - f6) * f7;
                        float f10 = boVar.d;
                        fArr[i4 + 1] = (f4 * f3) + ((boVar.f - f10) * f9) + f10;
                    } else {
                        boVar.c(f);
                        fArr[i4] = (boVar.a() * f3) + (boVar.n * boVar.h) + f5;
                        fArr[i4 + 1] = (boVar.b() * f3) + (boVar.o * boVar.i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    boVarArr = boVarArr;
                }
            } else {
                int length3 = boVarArr.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        bo boVar2 = boVarArr[i6][i8];
                        if (fD <= boVar2.b) {
                            if (boVar2.p) {
                                float f11 = boVar2.a;
                                float f12 = boVar2.k;
                                float f13 = boVar2.c;
                                fArr[i7] = ((boVar2.e - f13) * (fD - f11) * f12) + f13;
                                float f14 = boVar2.d;
                                fArr[i7 + 1] = ((boVar2.f - f14) * (fD - f11) * f12) + f14;
                            } else {
                                boVar2.c(fD);
                                fArr[i7] = (boVar2.n * boVar2.h) + boVar2.q;
                                fArr[i7 + 1] = (boVar2.o * boVar2.i) + boVar2.r;
                            }
                            z2 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z2) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                yiVar7.e(i9, fArr[i9]);
            }
        } else {
            int iC = c(i2);
            float fD2 = d(iC, i2, true);
            fx1 fx1Var = this.e;
            vh3 vh3Var2 = (vh3) gx1Var.b(fx1Var.c(iC));
            if (vh3Var2 != null && (yiVar5 = vh3Var2.a) != null) {
                yiVar6 = yiVar5;
            }
            vh3 vh3Var3 = (vh3) gx1Var.b(fx1Var.c(iC + 1));
            if (vh3Var3 == null || (yiVar4 = vh3Var3.a) == null) {
                yiVar4 = yiVar2;
            }
            int iB = yiVar7.b();
            for (int i10 = 0; i10 < iB; i10++) {
                yiVar7.e(i10, (yiVar4.a(i10) * fD2) + ((1.0f - fD2) * yiVar6.a(i10)));
            }
        }
        return yiVar7;
    }
}
