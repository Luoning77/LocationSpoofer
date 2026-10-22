package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jo implements io, ko {
    public final float e;
    public final boolean f;
    public final fo g;
    public final float h;

    public jo(float f, boolean z, fo foVar) {
        this.e = f;
        this.f = z;
        this.g = foVar;
        this.h = f;
    }

    @Override // defpackage.io, defpackage.ko
    public final float a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo)) {
            return false;
        }
        jo joVar = (jo) obj;
        return td0.b(this.e, joVar.e) && this.f == joVar.f && this.g.equals(joVar.g);
    }

    @Override // defpackage.io
    public final void g(gr1 gr1Var, int i, int[] iArr, qa1 qa1Var, int[] iArr2) {
        int i2;
        int iRound;
        if (iArr.length == 0) {
            return;
        }
        int iN0 = gr1Var.n0(this.e);
        boolean z = this.f && qa1Var == qa1.f;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iN0, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iN0, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        if (i2 > 0) {
            switch (this.g.e) {
                case 0:
                    iRound = Math.round((1.0f + (qa1Var == qa1.e ? -1.0f : 1.0f)) * (i2 / 2.0f));
                    break;
                default:
                    iRound = Math.round((1.0f + 0.0f) * ((i2 + 0) / 2.0f));
                    break;
            }
            if (z) {
                iRound -= i2;
            }
            if (iRound != 0) {
                int length3 = iArr2.length;
                for (int i11 = 0; i11 < length3; i11++) {
                    iArr2[i11] = iArr2[i11] + iRound;
                }
            }
        }
    }

    @Override // defpackage.ko
    public final void h(int i, gr1 gr1Var, int[] iArr, int[] iArr2) {
        g(gr1Var, i, iArr, qa1.e, iArr2);
    }

    public final int hashCode() {
        return this.g.hashCode() + p91.e(Float.hashCode(this.e) * 31, 31, this.f);
    }

    public final String toString() {
        return (this.f ? "" : "Absolute") + "Arrangement#spacedAligned(" + ((Object) td0.c(this.e)) + ", " + this.g + ')';
    }
}
