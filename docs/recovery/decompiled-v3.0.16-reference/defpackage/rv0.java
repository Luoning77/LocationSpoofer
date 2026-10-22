package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rv0 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final gx1 e;
    public final i43 f;

    public rv0(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            hb2.a("Invalid start index");
        }
        this.d = new ArrayList();
        gx1 gx1Var = new gx1();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            g91 g91Var = (g91) this.a.get(i3);
            int i4 = g91Var.c;
            int i5 = g91Var.d;
            gx1Var.h(i4, new ww0(i3, i2, i5));
            i2 += i5;
        }
        this.e = gx1Var;
        this.f = new i43(new ya0(this, 1));
    }

    public final boolean a(int i, int i2) {
        ww0 ww0Var;
        int i3;
        int i4;
        gx1 gx1Var = this.e;
        ww0 ww0Var2 = (ww0) gx1Var.b(i);
        if (ww0Var2 == null) {
            return false;
        }
        int i5 = ww0Var2.b;
        int i6 = i2 - ww0Var2.c;
        ww0Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = gx1Var.c;
        long[] jArr = gx1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (ww0Var = (ww0) objArr[(i7 << 3) + i9]).b) >= i5 && ww0Var != ww0Var2 && (i4 = i3 + i6) >= 0) {
                        ww0Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
