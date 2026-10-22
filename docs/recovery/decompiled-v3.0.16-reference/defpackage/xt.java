package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xt implements du, cu, Cloneable, ByteChannel {
    public jp2 e;
    public long f;

    public final void A(xt xtVar, long j, long j2) {
        xtVar.getClass();
        long j3 = j;
        zm3.j(this.f, j3, j2);
        if (j2 == 0) {
            return;
        }
        xtVar.f += j2;
        jp2 jp2Var = this.e;
        while (true) {
            jp2Var.getClass();
            long j4 = jp2Var.c - jp2Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            jp2Var = jp2Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            jp2Var.getClass();
            jp2 jp2VarC = jp2Var.c();
            int i = jp2VarC.b + ((int) j3);
            jp2VarC.b = i;
            jp2VarC.c = Math.min(i + ((int) j5), jp2VarC.c);
            jp2 jp2Var2 = xtVar.e;
            if (jp2Var2 == null) {
                jp2VarC.g = jp2VarC;
                jp2VarC.f = jp2VarC;
                xtVar.e = jp2VarC;
            } else {
                jp2 jp2Var3 = jp2Var2.g;
                jp2Var3.getClass();
                jp2Var3.b(jp2VarC);
            }
            j5 -= (long) (jp2VarC.c - jp2VarC.b);
            jp2Var = jp2Var.f;
            j3 = 0;
        }
    }

    @Override // defpackage.cu
    public final long B(sy2 sy2Var) {
        sy2Var.getClass();
        long j = 0;
        while (true) {
            long jC = sy2Var.C(this, 8192L);
            if (jC == -1) {
                return j;
            }
            j += jC;
        }
    }

    @Override // defpackage.sy2
    public final long C(xt xtVar, long j) {
        xtVar.getClass();
        if (j < 0) {
            fo.f(p91.o("byteCount < 0: ", j));
            return 0L;
        }
        long j2 = this.f;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        xtVar.i(this, j);
        return j;
    }

    public final boolean F() {
        return this.f == 0;
    }

    @Override // defpackage.du
    public final String G(long j) throws EOFException {
        if (j < 0) {
            fo.f(p91.o("limit < 0: ", j));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jP = P((byte) 10, 0L, j2);
        if (jP != -1) {
            return e.a(this, jP);
        }
        if (j2 < this.f && O(j2 - 1) == 13 && O(j2) == 10) {
            return e.a(this, j2);
        }
        xt xtVar = new xt();
        A(xtVar, 0L, Math.min(32L, this.f));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f, j) + " content=" + xtVar.o(xtVar.f).b() + (char) 8230);
    }

    @Override // defpackage.du
    public final int M(v32 v32Var) throws EOFException {
        v32Var.getClass();
        int iB = e.b(this, v32Var, false);
        if (iB == -1) {
            return -1;
        }
        skip(v32Var.e[iB].a());
        return iB;
    }

    public final byte O(long j) {
        zm3.j(this.f, j, 1L);
        jp2 jp2Var = this.e;
        jp2Var.getClass();
        long j2 = this.f;
        if (j2 - j < j) {
            while (j2 > j) {
                jp2Var = jp2Var.g;
                jp2Var.getClass();
                j2 -= (long) (jp2Var.c - jp2Var.b);
            }
            return jp2Var.a[(int) ((((long) jp2Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = jp2Var.c;
            int i2 = jp2Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return jp2Var.a[(int) ((((long) i2) + j) - j3)];
            }
            jp2Var = jp2Var.f;
            jp2Var.getClass();
            j3 = j4;
        }
    }

    public final long P(byte b, long j, long j2) {
        jp2 jp2Var;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.f + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.f;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (jp2Var = this.e) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                jp2Var = jp2Var.g;
                jp2Var.getClass();
                j6 -= (long) (jp2Var.c - jp2Var.b);
            }
            while (j6 < j4) {
                byte[] bArr = jp2Var.a;
                long j8 = j7;
                int iMin = (int) Math.min(jp2Var.c, (((long) jp2Var.b) + j4) - j6);
                for (int i = (int) ((((long) jp2Var.b) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - jp2Var.b)) + j6;
                    }
                }
                j6 += (long) (jp2Var.c - jp2Var.b);
                jp2Var = jp2Var.f;
                jp2Var.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = ((long) (jp2Var.c - jp2Var.b)) + j5;
            if (j9 > j3) {
                break;
            }
            jp2Var = jp2Var.f;
            jp2Var.getClass();
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = jp2Var.a;
            int iMin2 = (int) Math.min(jp2Var.c, (((long) jp2Var.b) + j4) - j5);
            for (int i2 = (int) ((((long) jp2Var.b) + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - jp2Var.b)) + j5;
                }
            }
            j5 += (long) (jp2Var.c - jp2Var.b);
            jp2Var = jp2Var.f;
            jp2Var.getClass();
            j3 = j5;
        }
        return -1L;
    }

    @Override // defpackage.du
    public final void S(long j) throws EOFException {
        if (this.f < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.cu
    public final /* bridge */ /* synthetic */ cu T(String str) {
        m0(str);
        return this;
    }

    public final byte[] U(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            fo.f(p91.o("byteCount: ", j));
            return null;
        }
        if (this.f < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
        return bArr;
    }

    @Override // defpackage.cu
    public final /* bridge */ /* synthetic */ cu X(uu uuVar) {
        g0(uuVar);
        return this;
    }

    @Override // defpackage.du
    public final long Y() throws EOFException {
        int i;
        if (this.f == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            jp2 jp2Var = this.e;
            jp2Var.getClass();
            byte[] bArr = jp2Var.a;
            int i3 = jp2Var.b;
            int i4 = jp2Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(zm3.T(b)));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    xt xtVar = new xt();
                    xtVar.i0(j);
                    xtVar.h0(b);
                    throw new NumberFormatException("Number too large: ".concat(xtVar.y()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.e = jp2Var.a();
                lp2.a(jp2Var);
            } else {
                jp2Var.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.e != null);
        this.f -= (long) i2;
        return j;
    }

    @Override // defpackage.du
    public final String Z(Charset charset) {
        charset.getClass();
        return d0(this.f, charset);
    }

    @Override // defpackage.du
    public final InputStream b0() {
        return new wt(this, 0);
    }

    public final short c0() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public final Object clone() {
        xt xtVar = new xt();
        if (this.f == 0) {
            return xtVar;
        }
        jp2 jp2Var = this.e;
        jp2Var.getClass();
        jp2 jp2VarC = jp2Var.c();
        xtVar.e = jp2VarC;
        jp2VarC.g = jp2VarC;
        jp2VarC.f = jp2VarC;
        for (jp2 jp2Var2 = jp2Var.f; jp2Var2 != jp2Var; jp2Var2 = jp2Var2.f) {
            jp2 jp2Var3 = jp2VarC.g;
            jp2Var3.getClass();
            jp2Var2.getClass();
            jp2Var3.b(jp2Var2.c());
        }
        xtVar.f = this.f;
        return xtVar;
    }

    @Override // defpackage.sy2
    public final pa3 d() {
        return pa3.d;
    }

    public final String d0(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            fo.f(p91.o("byteCount: ", j));
            return null;
        }
        if (this.f < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        jp2 jp2Var = this.e;
        jp2Var.getClass();
        int i = jp2Var.b;
        if (((long) i) + j > jp2Var.c) {
            return new String(U(j), charset);
        }
        int i2 = (int) j;
        String str = new String(jp2Var.a, i, i2, charset);
        int i3 = jp2Var.b + i2;
        jp2Var.b = i3;
        this.f -= j;
        if (i3 == jp2Var.c) {
            this.e = jp2Var.a();
            lp2.a(jp2Var);
        }
        return str;
    }

    public final uu e0(int i) {
        if (i == 0) {
            return uu.h;
        }
        zm3.j(this.f, 0L, i);
        jp2 jp2Var = this.e;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            jp2Var.getClass();
            int i5 = jp2Var.c;
            int i6 = jp2Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            jp2Var = jp2Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        jp2 jp2Var2 = this.e;
        int i7 = 0;
        while (i2 < i) {
            jp2Var2.getClass();
            bArr[i7] = jp2Var2.a;
            i2 += jp2Var2.c - jp2Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = jp2Var2.b;
            jp2Var2.d = true;
            i7++;
            jp2Var2 = jp2Var2.f;
        }
        return new mp2(bArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt)) {
            return false;
        }
        long j = this.f;
        xt xtVar = (xt) obj;
        if (j != xtVar.f) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        jp2 jp2Var = this.e;
        jp2Var.getClass();
        jp2 jp2Var2 = xtVar.e;
        jp2Var2.getClass();
        int i = jp2Var.b;
        int i2 = jp2Var2.b;
        long j2 = 0;
        while (j2 < this.f) {
            long jMin = Math.min(jp2Var.c - i, jp2Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (jp2Var.a[i] != jp2Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == jp2Var.c) {
                jp2Var = jp2Var.f;
                jp2Var.getClass();
                i = jp2Var.b;
            }
            if (i2 == jp2Var2.c) {
                jp2Var2 = jp2Var2.f;
                jp2Var2.getClass();
                i2 = jp2Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final jp2 f0(int i) {
        if (i < 1 || i > 8192) {
            fo.i("unexpected capacity");
            return null;
        }
        jp2 jp2Var = this.e;
        if (jp2Var == null) {
            jp2 jp2VarB = lp2.b();
            this.e = jp2VarB;
            jp2VarB.g = jp2VarB;
            jp2VarB.f = jp2VarB;
            return jp2VarB;
        }
        jp2 jp2Var2 = jp2Var.g;
        jp2Var2.getClass();
        if (jp2Var2.c + i <= 8192 && jp2Var2.e) {
            return jp2Var2;
        }
        jp2 jp2VarB2 = lp2.b();
        jp2Var2.b(jp2VarB2);
        return jp2VarB2;
    }

    public final void g0(uu uuVar) {
        uuVar.getClass();
        uuVar.i(this, uuVar.a());
    }

    public final void h0(int i) {
        jp2 jp2VarF0 = f0(1);
        byte[] bArr = jp2VarF0.a;
        int i2 = jp2VarF0.c;
        jp2VarF0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f++;
    }

    public final int hashCode() {
        jp2 jp2Var = this.e;
        if (jp2Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = jp2Var.c;
            for (int i3 = jp2Var.b; i3 < i2; i3++) {
                i = (i * 31) + jp2Var.a[i3];
            }
            jp2Var = jp2Var.f;
            jp2Var.getClass();
        } while (jp2Var != this.e);
        return i;
    }

    @Override // defpackage.bw2
    public final void i(xt xtVar, long j) {
        jp2 jp2VarB;
        xtVar.getClass();
        if (xtVar == this) {
            fo.i("source == this");
            return;
        }
        zm3.j(xtVar.f, 0L, j);
        while (j > 0) {
            jp2 jp2Var = xtVar.e;
            jp2Var.getClass();
            int i = jp2Var.c;
            jp2 jp2Var2 = xtVar.e;
            jp2Var2.getClass();
            long j2 = i - jp2Var2.b;
            int i2 = 0;
            if (j < j2) {
                jp2 jp2Var3 = this.e;
                jp2 jp2Var4 = jp2Var3 != null ? jp2Var3.g : null;
                if (jp2Var4 != null && jp2Var4.e) {
                    if ((((long) jp2Var4.c) + j) - ((long) (jp2Var4.d ? 0 : jp2Var4.b)) <= 8192) {
                        jp2 jp2Var5 = xtVar.e;
                        jp2Var5.getClass();
                        jp2Var5.d(jp2Var4, (int) j);
                        xtVar.f -= j;
                        this.f += j;
                        return;
                    }
                }
                jp2 jp2Var6 = xtVar.e;
                jp2Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > jp2Var6.c - jp2Var6.b) {
                    fo.i("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    jp2VarB = jp2Var6.c();
                } else {
                    jp2VarB = lp2.b();
                    byte[] bArr = jp2Var6.a;
                    byte[] bArr2 = jp2VarB.a;
                    int i4 = jp2Var6.b;
                    yo.l0(bArr, bArr2, 0, i4, i4 + i3);
                }
                jp2VarB.c = jp2VarB.b + i3;
                jp2Var6.b += i3;
                jp2 jp2Var7 = jp2Var6.g;
                jp2Var7.getClass();
                jp2Var7.b(jp2VarB);
                xtVar.e = jp2VarB;
            }
            jp2 jp2Var8 = xtVar.e;
            jp2Var8.getClass();
            long j3 = jp2Var8.c - jp2Var8.b;
            xtVar.e = jp2Var8.a();
            jp2 jp2Var9 = this.e;
            if (jp2Var9 == null) {
                this.e = jp2Var8;
                jp2Var8.g = jp2Var8;
                jp2Var8.f = jp2Var8;
            } else {
                jp2 jp2Var10 = jp2Var9.g;
                jp2Var10.getClass();
                jp2Var10.b(jp2Var8);
                jp2 jp2Var11 = jp2Var8.g;
                if (jp2Var11 == jp2Var8) {
                    fo.n("cannot compact");
                    return;
                }
                jp2Var11.getClass();
                if (jp2Var11.e) {
                    int i5 = jp2Var8.c - jp2Var8.b;
                    jp2 jp2Var12 = jp2Var8.g;
                    jp2Var12.getClass();
                    int i6 = 8192 - jp2Var12.c;
                    jp2 jp2Var13 = jp2Var8.g;
                    jp2Var13.getClass();
                    if (!jp2Var13.d) {
                        jp2 jp2Var14 = jp2Var8.g;
                        jp2Var14.getClass();
                        i2 = jp2Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        jp2 jp2Var15 = jp2Var8.g;
                        jp2Var15.getClass();
                        jp2Var8.d(jp2Var15, i5);
                        jp2Var8.a();
                        lp2.a(jp2Var8);
                    }
                }
            }
            xtVar.f -= j3;
            this.f += j3;
            j -= j3;
        }
    }

    public final void i0(long j) {
        if (j == 0) {
            h0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        jp2 jp2VarF0 = f0(i);
        byte[] bArr = jp2VarF0.a;
        int i2 = jp2VarF0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = e.a[(int) (15 & j)];
            j >>>= 4;
        }
        jp2VarF0.c += i;
        this.f += (long) i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.du
    public final String j(long j) {
        return d0(j, sw.a);
    }

    public final void j0(int i) {
        jp2 jp2VarF0 = f0(4);
        byte[] bArr = jp2VarF0.a;
        int i2 = jp2VarF0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        jp2VarF0.c = i2 + 4;
        this.f += 4;
    }

    public final void k0(int i) {
        jp2 jp2VarF0 = f0(2);
        byte[] bArr = jp2VarF0.a;
        int i2 = jp2VarF0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        jp2VarF0.c = i2 + 2;
        this.f += 2;
    }

    @Override // defpackage.cu
    public final /* bridge */ /* synthetic */ cu l(long j) {
        i0(j);
        return this;
    }

    public final void l0(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            fo.f(p91.l(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            fo.f(p91.n("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            fo.k(p91.r(i2, "endIndex > string.length: ", " > "), str.length());
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                jp2 jp2VarF0 = f0(1);
                byte[] bArr = jp2VarF0.a;
                int i3 = jp2VarF0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = jp2VarF0.c;
                int i6 = (i3 + i) - i5;
                jp2VarF0.c = i5 + i6;
                this.f += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    jp2 jp2VarF1 = f0(2);
                    byte[] bArr2 = jp2VarF1.a;
                    int i7 = jp2VarF1.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | WorkQueueKt.BUFFER_CAPACITY);
                    jp2VarF1.c = i7 + 2;
                    this.f += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    jp2 jp2VarF2 = f0(3);
                    byte[] bArr3 = jp2VarF2.a;
                    int i8 = jp2VarF2.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | WorkQueueKt.BUFFER_CAPACITY);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | WorkQueueKt.BUFFER_CAPACITY);
                    jp2VarF2.c = i8 + 3;
                    this.f += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        h0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        jp2 jp2VarF3 = f0(4);
                        byte[] bArr4 = jp2VarF3.a;
                        int i11 = jp2VarF3.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | WorkQueueKt.BUFFER_CAPACITY);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | WorkQueueKt.BUFFER_CAPACITY);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | WorkQueueKt.BUFFER_CAPACITY);
                        jp2VarF3.c = i11 + 4;
                        this.f += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void m0(String str) {
        str.getClass();
        l0(0, str.length(), str);
    }

    @Override // defpackage.du
    public final uu n() {
        return o(this.f);
    }

    public final void n0(int i) {
        String str;
        if (i < 128) {
            h0(i);
            return;
        }
        if (i < 2048) {
            jp2 jp2VarF0 = f0(2);
            byte[] bArr = jp2VarF0.a;
            int i2 = jp2VarF0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | WorkQueueKt.BUFFER_CAPACITY);
            jp2VarF0.c = i2 + 2;
            this.f += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            h0(63);
            return;
        }
        if (i < 65536) {
            jp2 jp2VarF1 = f0(3);
            byte[] bArr2 = jp2VarF1.a;
            int i3 = jp2VarF1.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | WorkQueueKt.BUFFER_CAPACITY);
            bArr2[i3 + 2] = (byte) ((i & 63) | WorkQueueKt.BUFFER_CAPACITY);
            jp2VarF1.c = i3 + 3;
            this.f += 3;
            return;
        }
        if (i <= 1114111) {
            jp2 jp2VarF2 = f0(4);
            byte[] bArr3 = jp2VarF2.a;
            int i4 = jp2VarF2.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | WorkQueueKt.BUFFER_CAPACITY);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | WorkQueueKt.BUFFER_CAPACITY);
            bArr3[i4 + 3] = (byte) ((i & 63) | WorkQueueKt.BUFFER_CAPACITY);
            jp2VarF2.c = i4 + 4;
            this.f += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = ks.a;
            int i5 = 0;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            o51.h(i5, 8, 8);
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.du
    public final uu o(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            fo.f(p91.o("byteCount: ", j));
            return null;
        }
        if (this.f < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new uu(U(j));
        }
        uu uuVarE0 = e0((int) j);
        skip(j);
        return uuVarE0;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        zm3.j(bArr.length, i, i2);
        jp2 jp2Var = this.e;
        if (jp2Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, jp2Var.c - jp2Var.b);
        byte[] bArr2 = jp2Var.a;
        int i3 = jp2Var.b;
        yo.l0(bArr2, bArr, i, i3, i3 + iMin);
        int i4 = jp2Var.b + iMin;
        jp2Var.b = i4;
        this.f -= (long) iMin;
        if (i4 == jp2Var.c) {
            this.e = jp2Var.a();
            lp2.a(jp2Var);
        }
        return iMin;
    }

    @Override // defpackage.du
    public final byte readByte() {
        if (this.f == 0) {
            throw new EOFException();
        }
        jp2 jp2Var = this.e;
        jp2Var.getClass();
        int i = jp2Var.b;
        int i2 = jp2Var.c;
        int i3 = i + 1;
        byte b = jp2Var.a[i];
        this.f--;
        if (i3 != i2) {
            jp2Var.b = i3;
            return b;
        }
        this.e = jp2Var.a();
        lp2.a(jp2Var);
        return b;
    }

    @Override // defpackage.du
    public final int readInt() throws EOFException {
        if (this.f < 4) {
            throw new EOFException();
        }
        jp2 jp2Var = this.e;
        jp2Var.getClass();
        int i = jp2Var.b;
        int i2 = jp2Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = jp2Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f -= 4;
        if (i5 != i2) {
            jp2Var.b = i5;
            return i6;
        }
        this.e = jp2Var.a();
        lp2.a(jp2Var);
        return i6;
    }

    @Override // defpackage.du
    public final short readShort() throws EOFException {
        if (this.f < 2) {
            throw new EOFException();
        }
        jp2 jp2Var = this.e;
        jp2Var.getClass();
        int i = jp2Var.b;
        int i2 = jp2Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = jp2Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f -= 2;
        if (i5 == i2) {
            this.e = jp2Var.a();
            lp2.a(jp2Var);
        } else {
            jp2Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.du
    public final boolean s(long j) {
        return this.f >= j;
    }

    @Override // defpackage.du
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            jp2 jp2Var = this.e;
            if (jp2Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, jp2Var.c - jp2Var.b);
            long j2 = iMin;
            this.f -= j2;
            j -= j2;
            int i = jp2Var.b + iMin;
            jp2Var.b = i;
            if (i == jp2Var.c) {
                this.e = jp2Var.a();
                lp2.a(jp2Var);
            }
        }
    }

    public final String toString() {
        long j = this.f;
        if (j <= 2147483647L) {
            return e0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f).toString());
    }

    @Override // defpackage.du
    public final String u() {
        return G(Long.MAX_VALUE);
    }

    @Override // defpackage.du
    public final byte[] v() {
        return U(this.f);
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m103write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        zm3.j(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            jp2 jp2VarF0 = f0(1);
            int iMin = Math.min(i3 - i, 8192 - jp2VarF0.c);
            int i4 = i + iMin;
            yo.l0(bArr, jp2VarF0.a, jp2VarF0.c, i, i4);
            jp2VarF0.c += iMin;
            i = i4;
        }
        this.f += j;
    }

    @Override // defpackage.cu
    public final /* bridge */ /* synthetic */ cu writeByte(int i) {
        h0(i);
        return this;
    }

    @Override // defpackage.cu
    public final /* bridge */ /* synthetic */ cu writeInt(int i) {
        j0(i);
        return this;
    }

    @Override // defpackage.cu
    public final /* bridge */ /* synthetic */ cu writeShort(int i) {
        k0(i);
        return this;
    }

    @Override // defpackage.du
    public final String y() {
        return d0(this.f, sw.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.bw2
    public final void close() {
    }

    @Override // defpackage.cu, defpackage.bw2, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.du
    public final xt x() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            jp2 jp2VarF0 = f0(1);
            int iMin = Math.min(i, 8192 - jp2VarF0.c);
            byteBuffer.get(jp2VarF0.a, jp2VarF0.c, iMin);
            i -= iMin;
            jp2VarF0.c += iMin;
        }
        this.f += (long) iRemaining;
        return iRemaining;
    }

    @Override // defpackage.cu
    public final cu write(byte[] bArr) {
        m103write(bArr, 0, bArr.length);
        return this;
    }

    @Override // defpackage.cu
    public final /* bridge */ /* synthetic */ cu write(byte[] bArr, int i, int i2) {
        m103write(bArr, i, i2);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        jp2 jp2Var = this.e;
        if (jp2Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), jp2Var.c - jp2Var.b);
        byteBuffer.put(jp2Var.a, jp2Var.b, iMin);
        int i = jp2Var.b + iMin;
        jp2Var.b = i;
        this.f -= (long) iMin;
        if (i == jp2Var.c) {
            this.e = jp2Var.a();
            lp2.a(jp2Var);
        }
        return iMin;
    }
}
