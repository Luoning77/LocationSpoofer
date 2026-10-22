package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d32 extends s32 {
    public static final d32 c = new d32(1, 0, 2);

    @Override // defpackage.s32
    public final void a(jv0 jv0Var, un unVar, kx2 kx2Var, lj ljVar, t32 t32Var) {
        int[] iArr;
        iv0 iv0Var;
        int iC;
        int iB = jv0Var.b(0);
        if (kx2Var.n != 0) {
            j30.a("Cannot move a group while inserting");
        }
        if (iB < 0) {
            j30.a("Parameter offset is out of bounds");
        }
        if (iB == 0) {
            return;
        }
        int i = kx2Var.t;
        int i2 = kx2Var.v;
        int i3 = kx2Var.u;
        int i4 = i;
        while (true) {
            iArr = kx2Var.b;
            if (iB <= 0) {
                break;
            }
            i4 += iArr[(kx2Var.q(i4) * 5) + 3];
            if (i4 > i3) {
                j30.a("Parameter offset is out of bounds");
            }
            iB--;
        }
        int i5 = iArr[(kx2Var.q(i4) * 5) + 3];
        int iF = kx2Var.f(kx2Var.b, kx2Var.q(kx2Var.t));
        int iF2 = kx2Var.f(kx2Var.b, kx2Var.q(i4));
        int i6 = i4 + i5;
        int iF3 = kx2Var.f(kx2Var.b, kx2Var.q(i6));
        int i7 = iF3 - iF2;
        kx2Var.w(i7, Math.max(kx2Var.t - 1, 0));
        kx2Var.v(i5);
        int[] iArr2 = kx2Var.b;
        int iQ = kx2Var.q(i6) * 5;
        yo.k0(kx2Var.q(i) * 5, iQ, (i5 * 5) + iQ, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = kx2Var.c;
            int iG = kx2Var.g(iF2 + i7);
            System.arraycopy(objArr, iG, objArr, iF, kx2Var.g(iF3 + i7) - iG);
        }
        int i8 = iF2 + i7;
        int i9 = i8 - iF;
        int i10 = kx2Var.k;
        int i11 = kx2Var.l;
        int length = kx2Var.c.length;
        int i12 = kx2Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iQ2 = kx2Var.q(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iQ2 * 5) + 4] = kx2.h(kx2.h(kx2Var.f(iArr2, iQ2) - i15, i12 < iQ2 ? 0 : i10, i11, length), kx2Var.k, kx2Var.l, kx2Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iO = kx2Var.o();
        int iB2 = jx2.b(kx2Var.d, i6, iO);
        ArrayList arrayList = new ArrayList();
        if (iB2 >= 0) {
            while (iB2 < kx2Var.d.size() && (iC = kx2Var.c((iv0Var = (iv0) kx2Var.d.get(iB2)))) >= i6 && iC < i16) {
                arrayList.add(iv0Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            iv0 iv0Var2 = (iv0) arrayList.get(i18);
            int iC2 = kx2Var.c(iv0Var2) + i17;
            if (iC2 >= kx2Var.g) {
                iv0Var2.a = -(iO - iC2);
            } else {
                iv0Var2.a = iC2;
            }
            kx2Var.d.add(jx2.b(kx2Var.d, iC2, iO), iv0Var2);
        }
        if (kx2Var.H(i6, i5)) {
            j30.a("Unexpectedly removed anchors");
        }
        kx2Var.l(i2, kx2Var.u, i);
        if (i7 > 0) {
            kx2Var.I(i8, i7, i6 - 1);
        }
    }
}
