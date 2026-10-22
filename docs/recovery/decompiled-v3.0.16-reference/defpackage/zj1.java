package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zj1 implements Cloneable {
    public /* synthetic */ boolean e;
    public /* synthetic */ long[] f;
    public /* synthetic */ Object[] g;
    public /* synthetic */ int h;

    public zj1(int i) {
        if (i == 0) {
            this.f = xq1.B;
            this.g = xq1.C;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.f = new long[i5];
        this.g = new Object[i5];
    }

    public final void a() {
        int i = this.h;
        Object[] objArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.h = 0;
        this.e = false;
    }

    public final boolean b(long j) {
        return d(j) >= 0;
    }

    public final Object c(long j) {
        Object obj;
        int iY = xq1.y(this.f, this.h, j);
        if (iY < 0 || (obj = this.g[iY]) == ks.L) {
            return null;
        }
        return obj;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        zj1 zj1Var = (zj1) objClone;
        zj1Var.f = (long[]) this.f.clone();
        zj1Var.g = (Object[]) this.g.clone();
        return zj1Var;
    }

    public final int d(long j) {
        if (this.e) {
            int i = this.h;
            long[] jArr = this.f;
            Object[] objArr = this.g;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != ks.L) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.e = false;
            this.h = i2;
        }
        return xq1.y(this.f, this.h, j);
    }

    public final boolean e() {
        return j() == 0;
    }

    public final long f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.h)) {
            fo.i(p91.l(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.e) {
            long[] jArr = this.f;
            Object[] objArr = this.g;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != ks.L) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.e = false;
            this.h = i3;
        }
        return this.f[i];
    }

    public final void g(long j, Object obj) {
        Object obj2 = ks.L;
        int iY = xq1.y(this.f, this.h, j);
        if (iY >= 0) {
            this.g[iY] = obj;
            return;
        }
        int i = ~iY;
        int i2 = this.h;
        if (i < i2) {
            Object[] objArr = this.g;
            if (objArr[i] == obj2) {
                this.f[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.e) {
            long[] jArr = this.f;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.g;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.e = false;
                this.h = i3;
                i = ~xq1.y(this.f, i3, j);
            }
        }
        int i5 = this.h;
        if (i5 >= this.f.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.f = Arrays.copyOf(this.f, i9);
            this.g = Arrays.copyOf(this.g, i9);
        }
        int i10 = this.h;
        if (i10 - i != 0) {
            long[] jArr2 = this.f;
            int i11 = i + 1;
            yo.m0(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.g;
            yo.n0(objArr3, objArr3, i11, i, this.h);
        }
        this.f[i] = j;
        this.g[i] = obj;
        this.h++;
    }

    public final void h(long j) {
        int iY = xq1.y(this.f, this.h, j);
        if (iY >= 0) {
            Object[] objArr = this.g;
            Object obj = objArr[iY];
            Object obj2 = ks.L;
            if (obj != obj2) {
                objArr[iY] = obj2;
                this.e = true;
            }
        }
    }

    public final void i(int i, Object obj) {
        int i2;
        if (i < 0 || i >= (i2 = this.h)) {
            fo.i(p91.l(i, "Expected index to be within 0..size()-1, but was "));
            return;
        }
        if (this.e) {
            long[] jArr = this.f;
            Object[] objArr = this.g;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj2 = objArr[i4];
                if (obj2 != ks.L) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj2;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.e = false;
            this.h = i3;
        }
        this.g[i] = obj;
    }

    public final int j() {
        if (this.e) {
            int i = this.h;
            long[] jArr = this.f;
            Object[] objArr = this.g;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != ks.L) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.e = false;
            this.h = i2;
        }
        return this.h;
    }

    public final Object k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.h)) {
            fo.i(p91.l(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.e) {
            long[] jArr = this.f;
            Object[] objArr = this.g;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != ks.L) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.e = false;
            this.h = i3;
        }
        return this.g[i];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(f(i2));
            sb.append('=');
            Object objK = k(i2);
            if (objK != sb) {
                sb.append(objK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ zj1(Object obj) {
        this(10);
    }
}
