package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sd2 implements cu {
    public final bw2 e;
    public final xt f;
    public boolean g;

    public sd2(bw2 bw2Var) {
        bw2Var.getClass();
        this.e = bw2Var;
        this.f = new xt();
    }

    public final cu A() {
        if (this.g) {
            fo.n("closed");
            return null;
        }
        xt xtVar = this.f;
        long j = xtVar.f;
        if (j == 0) {
            j = 0;
        } else {
            jp2 jp2Var = xtVar.e;
            jp2Var.getClass();
            jp2 jp2Var2 = jp2Var.g;
            jp2Var2.getClass();
            int i = jp2Var2.c;
            if (i < 8192 && jp2Var2.e) {
                j -= (long) (i - jp2Var2.b);
            }
        }
        if (j > 0) {
            this.e.i(xtVar, j);
        }
        return this;
    }

    @Override // defpackage.cu
    public final long B(sy2 sy2Var) {
        long j = 0;
        while (true) {
            long jC = ((ep) sy2Var).C(this.f, 8192L);
            if (jC == -1) {
                return j;
            }
            j += jC;
            A();
        }
    }

    @Override // defpackage.cu
    public final cu T(String str) {
        str.getClass();
        if (this.g) {
            fo.n("closed");
            return null;
        }
        this.f.m0(str);
        A();
        return this;
    }

    @Override // defpackage.cu
    public final cu X(uu uuVar) {
        uuVar.getClass();
        if (this.g) {
            fo.n("closed");
            return null;
        }
        this.f.g0(uuVar);
        A();
        return this;
    }

    @Override // defpackage.bw2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        bw2 bw2Var = this.e;
        if (this.g) {
            return;
        }
        xt xtVar = this.f;
        long j = xtVar.f;
        if (j > 0) {
            bw2Var.i(xtVar, j);
        }
        th = null;
        try {
            bw2Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.g = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.bw2
    public final pa3 d() {
        return this.e.d();
    }

    @Override // defpackage.cu, defpackage.bw2, java.io.Flushable
    public final void flush() {
        if (this.g) {
            fo.n("closed");
            return;
        }
        xt xtVar = this.f;
        long j = xtVar.f;
        bw2 bw2Var = this.e;
        if (j > 0) {
            bw2Var.i(xtVar, j);
        }
        bw2Var.flush();
    }

    @Override // defpackage.bw2
    public final void i(xt xtVar, long j) {
        xtVar.getClass();
        if (this.g) {
            fo.n("closed");
        } else {
            this.f.i(xtVar, j);
            A();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.g;
    }

    @Override // defpackage.cu
    public final cu l(long j) {
        if (this.g) {
            fo.n("closed");
            return null;
        }
        this.f.i0(j);
        A();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.e + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.g) {
            fo.n("closed");
            return 0;
        }
        int iWrite = this.f.write(byteBuffer);
        A();
        return iWrite;
    }

    @Override // defpackage.cu
    public final cu writeByte(int i) {
        if (this.g) {
            fo.n("closed");
            return null;
        }
        this.f.h0(i);
        A();
        return this;
    }

    @Override // defpackage.cu
    public final cu writeInt(int i) {
        if (this.g) {
            fo.n("closed");
            return null;
        }
        this.f.j0(i);
        A();
        return this;
    }

    @Override // defpackage.cu
    public final cu writeShort(int i) {
        if (this.g) {
            fo.n("closed");
            return null;
        }
        this.f.k0(i);
        A();
        return this;
    }

    @Override // defpackage.cu
    public final cu write(byte[] bArr) {
        if (!this.g) {
            this.f.m103write(bArr, 0, bArr.length);
            A();
            return this;
        }
        fo.n("closed");
        return null;
    }

    @Override // defpackage.cu
    public final cu write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (!this.g) {
            this.f.m103write(bArr, i, i2);
            A();
            return this;
        }
        fo.n("closed");
        return null;
    }
}
