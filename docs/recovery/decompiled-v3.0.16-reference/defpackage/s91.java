package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s91 implements bh0 {
    public final r91 a;

    public s91(r91 r91Var) {
        this.a = r91Var;
    }

    @Override // defpackage.bh0, defpackage.si
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final wh3 a(qd3 qd3Var) {
        int[] iArr;
        Object[] objArr;
        r91 r91Var = this.a;
        gx1 gx1Var = r91Var.b;
        fx1 fx1Var = new fx1(gx1Var.e + 2);
        gx1 gx1Var2 = new gx1(gx1Var.e);
        int[] iArr2 = gx1Var.b;
        Object[] objArr2 = gx1Var.c;
        long[] jArr = gx1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            q91 q91Var = (q91) objArr2[i5];
                            fx1Var.a(i6);
                            gx1Var2.h(i6, new vh3((yi) qd3Var.a.invoke(q91Var.a), q91Var.b));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!gx1Var.a(0)) {
            int i7 = fx1Var.b;
            if (i7 < 0) {
                fo.p("Index must be between 0 and size");
                return null;
            }
            fx1Var.b(i7 + 1);
            int[] iArr3 = fx1Var.a;
            int i8 = fx1Var.b;
            if (i8 != 0) {
                yo.k0(1, 0, i8, iArr3, iArr3);
            }
            iArr3[0] = 0;
            fx1Var.b++;
        }
        if (!gx1Var.a(r91Var.a)) {
            fx1Var.a(r91Var.a);
        }
        int i9 = fx1Var.b;
        if (i9 != 0) {
            int[] iArr4 = fx1Var.a;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i9);
        }
        return new wh3(fx1Var, gx1Var2, r91Var.a, lh0.c);
    }
}
