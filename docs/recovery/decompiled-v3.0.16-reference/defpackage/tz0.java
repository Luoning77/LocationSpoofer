package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tz0 implements Closeable {
    public static final Logger j = Logger.getLogger(cz0.class.getName());
    public final cu e;
    public final xt f;
    public int g;
    public boolean h;
    public final ty0 i;

    public tz0(sd2 sd2Var) {
        sd2Var.getClass();
        this.e = sd2Var;
        xt xtVar = new xt();
        this.f = xtVar;
        this.g = 16384;
        this.i = new ty0(xtVar);
    }

    public final synchronized void A(qt2 qt2Var) {
        try {
            qt2Var.getClass();
            if (this.h) {
                throw new IOException("closed");
            }
            int i = this.g;
            int i2 = qt2Var.a;
            if ((i2 & 32) != 0) {
                i = qt2Var.b[5];
            }
            this.g = i;
            if (((i2 & 2) != 0 ? qt2Var.b[1] : -1) != -1) {
                ty0 ty0Var = this.i;
                int iMin = Math.min((i2 & 2) != 0 ? qt2Var.b[1] : -1, 16384);
                int i3 = ty0Var.d;
                if (i3 != iMin) {
                    if (iMin < i3) {
                        ty0Var.b = Math.min(ty0Var.b, iMin);
                    }
                    ty0Var.c = true;
                    ty0Var.d = iMin;
                    int i4 = ty0Var.h;
                    if (iMin < i4) {
                        if (iMin == 0) {
                            mx0[] mx0VarArr = ty0Var.e;
                            yo.s0(0, mx0VarArr.length, null, mx0VarArr);
                            ty0Var.f = ty0Var.e.length - 1;
                            ty0Var.g = 0;
                            ty0Var.h = 0;
                        } else {
                            ty0Var.a(i4 - iMin);
                        }
                    }
                }
            }
            O(0, 0, 4, 1);
            this.e.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void F(boolean z, int i, xt xtVar, int i2) {
        if (this.h) {
            throw new IOException("closed");
        }
        O(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            cu cuVar = this.e;
            xtVar.getClass();
            cuVar.i(xtVar, i2);
        }
    }

    public final void O(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = j;
        if (logger.isLoggable(level)) {
            logger.fine(cz0.a(false, i, i2, i3, i4));
        }
        if (i2 > this.g) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.g + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            fo.f(p91.l(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = bh3.a;
        cu cuVar = this.e;
        cuVar.writeByte((i2 >>> 16) & 255);
        cuVar.writeByte((i2 >>> 8) & 255);
        cuVar.writeByte(i2 & 255);
        cuVar.writeByte(i3 & 255);
        cuVar.writeByte(i4 & 255);
        cuVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void P(byte[] bArr, int i, int i2) {
        try {
            if (i2 == 0) {
                throw null;
            }
            if (this.h) {
                throw new IOException("closed");
            }
            if (az2.z(i2) == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            O(0, bArr.length + 8, 7, 0);
            this.e.writeInt(i);
            this.e.writeInt(az2.z(i2));
            if (bArr.length != 0) {
                this.e.write(bArr);
            }
            this.e.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void U(boolean z, int i, ArrayList arrayList) {
        if (this.h) {
            throw new IOException("closed");
        }
        this.i.d(arrayList);
        long j2 = this.f.f;
        long jMin = Math.min(this.g, j2);
        int i2 = j2 == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        O(i, (int) jMin, 1, i2);
        this.e.i(this.f, jMin);
        if (j2 > jMin) {
            long j3 = j2 - jMin;
            while (j3 > 0) {
                long jMin2 = Math.min(this.g, j3);
                j3 -= jMin2;
                O(i, (int) jMin2, 9, j3 == 0 ? 4 : 0);
                this.e.i(this.f, jMin2);
            }
        }
    }

    public final synchronized void c0(int i, int i2, boolean z) {
        if (this.h) {
            throw new IOException("closed");
        }
        O(0, 8, 6, z ? 1 : 0);
        this.e.writeInt(i);
        this.e.writeInt(i2);
        this.e.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.h = true;
        this.e.close();
    }

    public final synchronized void d0(int i, int i2) {
        try {
            if (i2 == 0) {
                throw null;
            }
            if (this.h) {
                throw new IOException("closed");
            }
            if (az2.z(i2) == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            O(i, 4, 3, 0);
            this.e.writeInt(az2.z(i2));
            this.e.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e0(int i, long j2) {
        if (this.h) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        O(i, 4, 8, 0);
        this.e.writeInt((int) j2);
        this.e.flush();
    }

    public final synchronized void flush() {
        if (this.h) {
            throw new IOException("closed");
        }
        this.e.flush();
    }
}
