package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mp2 extends uu {
    public final transient byte[][] i;
    public final transient int[] j;

    public mp2(byte[][] bArr, int[] iArr) {
        super(uu.h.e);
        this.i = bArr;
        this.j = iArr;
    }

    @Override // defpackage.uu
    public final int a() {
        return this.j[this.i.length - 1];
    }

    @Override // defpackage.uu
    public final String b() {
        return new uu(j()).b();
    }

    @Override // defpackage.uu
    public final byte[] c() {
        return j();
    }

    @Override // defpackage.uu
    public final byte d(int i) {
        byte[][] bArr = this.i;
        int length = bArr.length - 1;
        int[] iArr = this.j;
        zm3.j(iArr[length], i, 1L);
        int iM = ym3.M(this, i);
        return bArr[iM][(i - (iM == 0 ? 0 : iArr[iM - 1])) + iArr[bArr.length + iM]];
    }

    @Override // defpackage.uu
    public final boolean e(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= a() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iM = ym3.M(this, i);
            while (i < i4) {
                int[] iArr = this.j;
                int i5 = iM == 0 ? 0 : iArr[iM - 1];
                int i6 = iArr[iM] - i5;
                byte[][] bArr2 = this.i;
                int i7 = iArr[bArr2.length + iM];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[iM];
                bArr3.getClass();
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iM++;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.uu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uu)) {
            return false;
        }
        uu uuVar = (uu) obj;
        return uuVar.a() == a() && f(uuVar, a());
    }

    @Override // defpackage.uu
    public final boolean f(uu uuVar, int i) {
        uuVar.getClass();
        if (a() - i >= 0) {
            int iM = ym3.M(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.j;
                int i4 = iM == 0 ? 0 : iArr[iM - 1];
                int i5 = iArr[iM] - i4;
                byte[][] bArr = this.i;
                int i6 = iArr[bArr.length + iM];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (uuVar.e(i3, bArr[iM], (i2 - i4) + i6, iMin)) {
                    i3 += iMin;
                    i2 += iMin;
                    iM++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.uu
    public final uu g() {
        return new uu(j()).g();
    }

    @Override // defpackage.uu
    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.i;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.j;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f = i3;
        return i3;
    }

    @Override // defpackage.uu
    public final void i(xt xtVar, int i) {
        int iM = ym3.M(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.j;
            int i3 = iM == 0 ? 0 : iArr[iM - 1];
            int i4 = iArr[iM] - i3;
            byte[][] bArr = this.i;
            int i5 = iArr[bArr.length + iM];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            jp2 jp2Var = new jp2(bArr[iM], i6, i6 + iMin, true);
            jp2 jp2Var2 = xtVar.e;
            if (jp2Var2 == null) {
                jp2Var.g = jp2Var;
                jp2Var.f = jp2Var;
                xtVar.e = jp2Var;
            } else {
                jp2 jp2Var3 = jp2Var2.g;
                jp2Var3.getClass();
                jp2Var3.b(jp2Var);
            }
            i2 += iMin;
            iM++;
        }
        xtVar.f += (long) i;
    }

    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.i;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.j;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            yo.l0(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.uu
    public final String toString() {
        return new uu(j()).toString();
    }
}
