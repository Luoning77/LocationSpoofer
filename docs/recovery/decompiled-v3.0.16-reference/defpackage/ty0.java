package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ty0 {
    public final xt a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public mx0[] e = new mx0[8];
    public int f = 7;

    public ty0(xt xtVar) {
        this.a = xtVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                mx0 mx0Var = this.e[length];
                mx0Var.getClass();
                i -= mx0Var.c;
                int i4 = this.h;
                mx0 mx0Var2 = this.e[length];
                mx0Var2.getClass();
                this.h = i4 - mx0Var2.c;
                this.g--;
                i3++;
                length--;
            }
            mx0[] mx0VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(mx0VarArr, i5, mx0VarArr, i5 + i3, this.g);
            mx0[] mx0VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(mx0VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(mx0 mx0Var) {
        int i = mx0Var.c;
        int i2 = this.d;
        if (i > i2) {
            mx0[] mx0VarArr = this.e;
            yo.s0(0, mx0VarArr.length, null, mx0VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        mx0[] mx0VarArr2 = this.e;
        if (i3 > mx0VarArr2.length) {
            mx0[] mx0VarArr3 = new mx0[mx0VarArr2.length * 2];
            System.arraycopy(mx0VarArr2, 0, mx0VarArr3, mx0VarArr2.length, mx0VarArr2.length);
            this.f = this.e.length - 1;
            this.e = mx0VarArr3;
            mx0VarArr2 = mx0VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        mx0VarArr2[i4] = mx0Var;
        this.g++;
        this.h += i;
    }

    public final void c(uu uuVar) throws EOFException {
        uuVar.getClass();
        int[] iArr = b01.a;
        int iA = uuVar.a();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iA; i++) {
            byte bD = uuVar.d(i);
            byte[] bArr = bh3.a;
            j2 += (long) b01.b[bD & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iA2 = uuVar.a();
        xt xtVar = this.a;
        if (i2 >= iA2) {
            e(uuVar.a(), WorkQueueKt.MASK, 0);
            xtVar.g0(uuVar);
            return;
        }
        xt xtVar2 = new xt();
        int[] iArr2 = b01.a;
        int iA3 = uuVar.a();
        int i3 = 0;
        for (int i4 = 0; i4 < iA3; i4++) {
            byte bD2 = uuVar.d(i4);
            byte[] bArr2 = bh3.a;
            int i5 = bD2 & 255;
            int i6 = b01.a[i5];
            byte b = b01.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                xtVar2.h0((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            xtVar2.h0((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        uu uuVarO = xtVar2.o(xtVar2.f);
        e(uuVarO.a(), WorkQueueKt.MASK, WorkQueueKt.BUFFER_CAPACITY);
        xtVar.g0(uuVarO);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.c) {
            int i = this.b;
            if (i < this.d) {
                e(i, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mx0 mx0Var = (mx0) arrayList.get(i2);
            uu uuVarG = mx0Var.a.g();
            uu uuVar = mx0Var.b;
            Integer num = (Integer) uy0.b.get(uuVarG);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    mx0[] mx0VarArr = uy0.a;
                    if (o51.f(mx0VarArr[iIntValue].b, uuVar)) {
                        length = length2;
                    } else if (o51.f(mx0VarArr[length2].b, uuVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.e.length;
                for (int i3 = this.f + 1; i3 < length3; i3++) {
                    mx0 mx0Var2 = this.e[i3];
                    mx0Var2.getClass();
                    if (o51.f(mx0Var2.a, uuVarG)) {
                        mx0 mx0Var3 = this.e[i3];
                        mx0Var3.getClass();
                        if (o51.f(mx0Var3.b, uuVar)) {
                            length2 = uy0.a.length + (i3 - this.f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f) + uy0.a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, WorkQueueKt.MASK, WorkQueueKt.BUFFER_CAPACITY);
            } else if (length == -1) {
                this.a.h0(64);
                c(uuVarG);
                c(uuVar);
                b(mx0Var);
            } else {
                uu uuVar2 = mx0.d;
                uuVarG.getClass();
                uuVar2.getClass();
                if (!uuVarG.f(uuVar2, uuVar2.a()) || o51.f(mx0.i, uuVarG)) {
                    e(length, 63, 64);
                    c(uuVar);
                    b(mx0Var);
                } else {
                    e(length, 15, 0);
                    c(uuVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        xt xtVar = this.a;
        if (i < i2) {
            xtVar.h0(i | i3);
            return;
        }
        xtVar.h0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            xtVar.h0(128 | (i4 & WorkQueueKt.MASK));
            i4 >>>= 7;
        }
        xtVar.h0(i4);
    }
}
