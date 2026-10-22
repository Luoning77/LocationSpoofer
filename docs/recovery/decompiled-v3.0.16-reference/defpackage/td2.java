package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class td2 implements du {
    public final sy2 e;
    public final xt f;
    public boolean g;

    public td2(sy2 sy2Var) {
        sy2Var.getClass();
        this.e = sy2Var;
        this.f = new xt();
    }

    public final boolean A() {
        if (this.g) {
            fo.n("closed");
            return false;
        }
        xt xtVar = this.f;
        return xtVar.F() && this.e.C(xtVar, 8192L) == -1;
    }

    @Override // defpackage.sy2
    public final long C(xt xtVar, long j) {
        xtVar.getClass();
        if (j < 0) {
            fo.f(p91.o("byteCount < 0: ", j));
            return 0L;
        }
        if (this.g) {
            fo.n("closed");
            return 0L;
        }
        xt xtVar2 = this.f;
        if (xtVar2.f == 0 && this.e.C(xtVar2, 8192L) == -1) {
            return -1L;
        }
        return xtVar2.C(xtVar, Math.min(j, xtVar2.f));
    }

    public final long F(byte b) {
        return O(b, 0L, Long.MAX_VALUE);
    }

    @Override // defpackage.du
    public final String G(long j) throws EOFException {
        if (j < 0) {
            fo.f(p91.o("limit < 0: ", j));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jO = O((byte) 10, 0L, j2);
        xt xtVar = this.f;
        if (jO != -1) {
            return e.a(xtVar, jO);
        }
        if (j2 < Long.MAX_VALUE && s(j2) && xtVar.O(j2 - 1) == 13 && s(j2 + 1) && xtVar.O(j2) == 10) {
            return e.a(xtVar, j2);
        }
        xt xtVar2 = new xt();
        xtVar.A(xtVar2, 0L, Math.min(32L, xtVar.f));
        throw new EOFException("\\n not found: limit=" + Math.min(xtVar.f, j) + " content=" + xtVar2.o(xtVar2.f).b() + (char) 8230);
    }

    @Override // defpackage.du
    public final int M(v32 v32Var) throws EOFException {
        xt xtVar;
        v32Var.getClass();
        if (this.g) {
            fo.n("closed");
            return 0;
        }
        do {
            xtVar = this.f;
            int iB = e.b(xtVar, v32Var, true);
            if (iB != -2) {
                if (iB == -1) {
                    break;
                }
                xtVar.skip(v32Var.e[iB].a());
                return iB;
            }
        } while (this.e.C(xtVar, 8192L) != -1);
        return -1;
    }

    public final long O(byte b, long j, long j2) {
        if (this.g) {
            fo.n("closed");
            return 0L;
        }
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long jMax = j;
        while (jMax < j2) {
            xt xtVar = this.f;
            byte b2 = b;
            long j3 = j2;
            long jP = xtVar.P(b2, jMax, j3);
            if (jP != -1) {
                return jP;
            }
            long j4 = xtVar.f;
            if (j4 >= j3 || this.e.C(xtVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    public final byte[] P(long j) throws EOFException {
        S(j);
        return this.f.U(j);
    }

    @Override // defpackage.du
    public final void S(long j) throws EOFException {
        if (!s(j)) {
            throw new EOFException();
        }
    }

    public final int U() throws EOFException {
        S(4L);
        int i = this.f.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // defpackage.du
    public final long Y() throws EOFException {
        xt xtVar;
        S(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zS = s(i2);
            xtVar = this.f;
            if (!zS) {
                break;
            }
            byte bO = xtVar.O(i);
            if ((bO < 48 || bO > 57) && ((bO < 97 || bO > 102) && (bO < 65 || bO > 70))) {
                if (i != 0) {
                    break;
                }
                xp1.m(16);
                xp1.m(16);
                String string = Integer.toString(bO, 16);
                string.getClass();
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i2;
        }
        return xtVar.Y();
    }

    @Override // defpackage.du
    public final String Z(Charset charset) {
        charset.getClass();
        sy2 sy2Var = this.e;
        xt xtVar = this.f;
        xtVar.B(sy2Var);
        return xtVar.d0(xtVar.f, charset);
    }

    @Override // defpackage.du
    public final InputStream b0() {
        return new wt(this, 1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.close();
        xt xtVar = this.f;
        xtVar.skip(xtVar.f);
    }

    @Override // defpackage.sy2
    public final pa3 d() {
        return this.e.d();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.g;
    }

    @Override // defpackage.du
    public final String j(long j) throws EOFException {
        S(j);
        return this.f.d0(j, sw.a);
    }

    @Override // defpackage.du
    public final uu n() {
        sy2 sy2Var = this.e;
        xt xtVar = this.f;
        xtVar.B(sy2Var);
        return xtVar.o(xtVar.f);
    }

    @Override // defpackage.du
    public final uu o(long j) throws EOFException {
        S(j);
        return this.f.o(j);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        xt xtVar = this.f;
        if (xtVar.f == 0 && this.e.C(xtVar, 8192L) == -1) {
            return -1;
        }
        return xtVar.read(byteBuffer);
    }

    @Override // defpackage.du
    public final byte readByte() {
        S(1L);
        return this.f.readByte();
    }

    @Override // defpackage.du
    public final int readInt() throws EOFException {
        S(4L);
        return this.f.readInt();
    }

    @Override // defpackage.du
    public final short readShort() throws EOFException {
        S(2L);
        return this.f.readShort();
    }

    @Override // defpackage.du
    public final boolean s(long j) {
        xt xtVar;
        if (j < 0) {
            fo.f(p91.o("byteCount < 0: ", j));
            return false;
        }
        if (this.g) {
            fo.n("closed");
            return false;
        }
        do {
            xtVar = this.f;
            if (xtVar.f >= j) {
                return true;
            }
        } while (this.e.C(xtVar, 8192L) != -1);
        return false;
    }

    @Override // defpackage.du
    public final void skip(long j) throws EOFException {
        if (this.g) {
            fo.n("closed");
            return;
        }
        while (j > 0) {
            xt xtVar = this.f;
            if (xtVar.f == 0 && this.e.C(xtVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, xtVar.f);
            xtVar.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.e + ')';
    }

    @Override // defpackage.du
    public final String u() {
        return G(Long.MAX_VALUE);
    }

    @Override // defpackage.du
    public final byte[] v() {
        sy2 sy2Var = this.e;
        xt xtVar = this.f;
        xtVar.B(sy2Var);
        return xtVar.U(xtVar.f);
    }

    @Override // defpackage.du
    public final xt x() {
        return this.f;
    }

    @Override // defpackage.du
    public final String y() {
        sy2 sy2Var = this.e;
        xt xtVar = this.f;
        xtVar.B(sy2Var);
        return xtVar.y();
    }
}
