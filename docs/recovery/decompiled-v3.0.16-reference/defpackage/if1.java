package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class if1 extends hj3 {
    public final gx1 b;

    public if1() {
        gx1 gx1Var = g41.a;
        this.b = new gx1();
    }

    @Override // defpackage.hj3
    public final void d() {
        gx1 gx1Var = this.b;
        int[] iArr = gx1Var.b;
        Object[] objArr = gx1Var.c;
        long[] jArr = gx1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        sx1 sx1Var = (sx1) objArr[i4];
                        Object[] objArr2 = sx1Var.a;
                        int i6 = sx1Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            hf1 hf1Var = (hf1) objArr2[i7];
                            tv tvVar = hf1Var.d;
                            if (tvVar != null) {
                                tvVar.cancel();
                            }
                            hf1Var.d = null;
                            oo1 oo1Var = (oo1) hf1Var.a.f;
                            oo1Var.f = true;
                            oo1Var.e = false;
                            oo1Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
