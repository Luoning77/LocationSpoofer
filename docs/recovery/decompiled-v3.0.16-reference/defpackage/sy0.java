package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sy0 {
    public final td2 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public mx0[] d = new mx0[8];
    public int e = 7;

    public sy0(nz0 nz0Var) {
        this.c = new td2(nz0Var);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                mx0 mx0Var = this.d[length];
                mx0Var.getClass();
                int i4 = mx0Var.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            mx0[] mx0VarArr = this.d;
            int i5 = i2 + 1;
            System.arraycopy(mx0VarArr, i5, mx0VarArr, i5 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final uu b(int i) throws IOException {
        if (i >= 0) {
            mx0[] mx0VarArr = uy0.a;
            if (i <= mx0VarArr.length - 1) {
                return mx0VarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - uy0.a.length);
        if (length >= 0) {
            mx0[] mx0VarArr2 = this.d;
            if (length < mx0VarArr2.length) {
                mx0 mx0Var = mx0VarArr2[length];
                mx0Var.getClass();
                return mx0Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(mx0 mx0Var) {
        this.b.add(mx0Var);
        int i = mx0Var.c;
        int i2 = this.a;
        if (i > i2) {
            mx0[] mx0VarArr = this.d;
            yo.s0(0, mx0VarArr.length, null, mx0VarArr);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        mx0[] mx0VarArr2 = this.d;
        if (i3 > mx0VarArr2.length) {
            mx0[] mx0VarArr3 = new mx0[mx0VarArr2.length * 2];
            System.arraycopy(mx0VarArr2, 0, mx0VarArr3, mx0VarArr2.length, mx0VarArr2.length);
            this.e = this.d.length - 1;
            this.d = mx0VarArr3;
            mx0VarArr2 = mx0VarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        mx0VarArr2[i4] = mx0Var;
        this.f++;
        this.g += i;
    }

    public final uu d() {
        td2 td2Var = this.c;
        byte b = td2Var.readByte();
        byte[] bArr = bh3.a;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jE = e(i, WorkQueueKt.MASK);
        if (!z) {
            return td2Var.o(jE);
        }
        xt xtVar = new xt();
        a01 a01Var = b01.c;
        a01 a01Var2 = a01Var;
        int i3 = 0;
        for (long j = 0; j < jE; j++) {
            byte b2 = td2Var.readByte();
            byte[] bArr2 = bh3.a;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                a01[] a01VarArr = (a01[]) a01Var2.g;
                a01VarArr.getClass();
                a01Var2 = a01VarArr[(i2 >>> (i3 - 8)) & 255];
                a01Var2.getClass();
                if (((a01[]) a01Var2.g) == null) {
                    xtVar.h0(a01Var2.e);
                    i3 -= a01Var2.f;
                    a01Var2 = a01Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            a01[] a01VarArr2 = (a01[]) a01Var2.g;
            a01VarArr2.getClass();
            a01 a01Var3 = a01VarArr2[(i2 << (8 - i3)) & 255];
            a01Var3.getClass();
            int i4 = a01Var3.f;
            if (((a01[]) a01Var3.g) != null || i4 > i3) {
                break;
            }
            xtVar.h0(a01Var3.e);
            i3 -= i4;
            a01Var2 = a01Var;
        }
        return xtVar.o(xtVar.f);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.c.readByte();
            byte[] bArr = bh3.a;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}
