package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class go implements io {
    public final /* synthetic */ int e;

    public /* synthetic */ go(int i) {
        this.e = i;
    }

    @Override // defpackage.io
    public final void g(gr1 gr1Var, int i, int[] iArr, qa1 qa1Var, int[] iArr2) {
        int i2 = this.e;
        qa1 qa1Var2 = qa1.e;
        int i3 = 0;
        switch (i2) {
            case 0:
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int i6 = iArr[i3];
                    iArr2[i4] = i5;
                    i5 += i6;
                    i3++;
                    i4++;
                }
                break;
            case 1:
                int i7 = 0;
                for (int i8 : iArr) {
                    i7 += i8;
                }
                int i9 = i - i7;
                int length2 = iArr.length;
                int i10 = 0;
                while (i3 < length2) {
                    int i11 = iArr[i3];
                    iArr2[i10] = i9;
                    i9 += i11;
                    i3++;
                    i10++;
                }
                break;
            case 2:
                if (qa1Var == qa1Var2) {
                    int i12 = 0;
                    for (int i13 : iArr) {
                        i12 += i13;
                    }
                    int i14 = i - i12;
                    int length3 = iArr.length;
                    int i15 = 0;
                    while (i3 < length3) {
                        int i16 = iArr[i3];
                        iArr2[i15] = i14;
                        i14 += i16;
                        i3++;
                        i15++;
                    }
                } else {
                    for (int length4 = iArr.length - 1; -1 < length4; length4--) {
                        int i17 = iArr[length4];
                        iArr2[length4] = i3;
                        i3 += i17;
                    }
                }
                break;
            default:
                if (qa1Var == qa1Var2) {
                    int length5 = iArr.length;
                    int i18 = 0;
                    int i19 = 0;
                    while (i3 < length5) {
                        int i20 = iArr[i3];
                        iArr2[i18] = i19;
                        i19 += i20;
                        i3++;
                        i18++;
                    }
                } else {
                    int length6 = iArr.length;
                    int i21 = 0;
                    while (i3 < length6) {
                        i21 += iArr[i3];
                        i3++;
                    }
                    int i22 = i - i21;
                    for (int length7 = iArr.length - 1; -1 < length7; length7--) {
                        int i23 = iArr[length7];
                        iArr2[length7] = i22;
                        i22 += i23;
                    }
                }
                break;
        }
    }

    public final String toString() {
        switch (this.e) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
