package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ax0 implements sy2 {
    public byte e;
    public final td2 f;
    public final Inflater g;
    public final h21 h;
    public final CRC32 i;

    public ax0(sy2 sy2Var) {
        sy2Var.getClass();
        td2 td2Var = new td2(sy2Var);
        this.f = td2Var;
        Inflater inflater = new Inflater(true);
        this.g = inflater;
        this.h = new h21(td2Var, inflater);
        this.i = new CRC32();
    }

    public static void A(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // defpackage.sy2
    public final long C(xt xtVar, long j) throws IOException {
        long j2;
        byte b;
        long j3;
        ax0 ax0Var = this;
        td2 td2Var = ax0Var.f;
        xt xtVar2 = td2Var.f;
        xtVar.getClass();
        long j4 = 0;
        if (j < 0) {
            fo.f(p91.o("byteCount < 0: ", j));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = ax0Var.e;
        CRC32 crc32 = ax0Var.i;
        if (b2 == 0) {
            td2Var.S(10L);
            byte bO = xtVar2.O(3L);
            boolean z = ((bO >> 1) & 1) == 1;
            if (z) {
                b = 0;
                ax0Var.F(xtVar2, 0L, 10L);
            } else {
                b = 0;
            }
            A(8075, td2Var.readShort(), "ID1ID2");
            td2Var.skip(8L);
            if (((bO >> 2) & 1) == 1) {
                td2Var.S(2L);
                if (z) {
                    j2 = -1;
                    j3 = 2;
                    F(xtVar2, 0L, 2L);
                } else {
                    j3 = 2;
                    j2 = -1;
                }
                long jC0 = xtVar2.c0() & 65535;
                td2Var.S(jC0);
                if (z) {
                    F(xtVar2, 0L, jC0);
                }
                td2Var.skip(jC0);
            } else {
                j3 = 2;
                j2 = -1;
            }
            if (((bO >> 3) & 1) == 1) {
                long jF = td2Var.F(b);
                if (jF == j2) {
                    throw new EOFException();
                }
                if (z) {
                    F(xtVar2, 0L, jF + 1);
                }
                td2Var.skip(jF + 1);
            }
            if (((bO >> 4) & 1) == 1) {
                long jF2 = td2Var.F(b);
                if (jF2 == j2) {
                    throw new EOFException();
                }
                if (z) {
                    ax0Var = this;
                    ax0Var.F(xtVar2, 0L, jF2 + 1);
                } else {
                    ax0Var = this;
                }
                td2Var.skip(jF2 + 1);
            } else {
                ax0Var = this;
            }
            if (z) {
                td2Var.S(j3);
                A(td2Var.f.c0(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            ax0Var.e = (byte) 1;
            b2 = 1;
        } else {
            j4 = 0;
            j2 = -1;
        }
        if (b2 == 1) {
            long j5 = xtVar.f;
            long jC = ax0Var.h.C(xtVar, j);
            if (jC != j2) {
                ax0Var.F(xtVar, j5, jC);
                return jC;
            }
            ax0Var.e = (byte) 2;
            b2 = 2;
        }
        if (b2 == 2) {
            A(td2Var.U(), (int) crc32.getValue(), "CRC");
            A(td2Var.U(), (int) ax0Var.g.getBytesWritten(), "ISIZE");
            ax0Var.e = (byte) 3;
            if (!td2Var.A()) {
                fo.r("gzip finished without exhausting source");
                return j4;
            }
        }
        return j2;
    }

    public final void F(xt xtVar, long j, long j2) {
        jp2 jp2Var = xtVar.e;
        jp2Var.getClass();
        while (true) {
            long j3 = jp2Var.c - jp2Var.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            jp2Var = jp2Var.f;
            jp2Var.getClass();
        }
        while (j2 > 0) {
            int i = (int) (((long) jp2Var.b) + j);
            int iMin = (int) Math.min(jp2Var.c - i, j2);
            this.i.update(jp2Var.a, i, iMin);
            j2 -= (long) iMin;
            jp2Var = jp2Var.f;
            jp2Var.getClass();
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h.close();
    }

    @Override // defpackage.sy2
    public final pa3 d() {
        return this.f.e.d();
    }
}
