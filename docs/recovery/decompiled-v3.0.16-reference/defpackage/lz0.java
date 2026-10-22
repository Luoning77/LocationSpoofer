package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lz0 implements Closeable {
    public static final qt2 D;
    public final tz0 A;
    public final bn B;
    public final LinkedHashSet C;
    public final ez0 e;
    public final LinkedHashMap f = new LinkedHashMap();
    public final String g;
    public int h;
    public int i;
    public boolean j;
    public final k53 k;
    public final j53 l;
    public final j53 m;
    public final j53 n;
    public final u92 o;
    public long p;
    public long q;
    public long r;
    public long s;
    public final qt2 t;
    public qt2 u;
    public long v;
    public long w;
    public long x;
    public long y;
    public final Socket z;

    static {
        qt2 qt2Var = new qt2();
        qt2Var.b(7, 65535);
        qt2Var.b(5, 16384);
        D = qt2Var;
    }

    public lz0(bl blVar) {
        this.e = (ez0) blVar.f;
        String str = (String) blVar.c;
        if (str == null) {
            o51.F("connectionName");
            throw null;
        }
        this.g = str;
        this.i = 3;
        k53 k53Var = (k53) blVar.a;
        this.k = k53Var;
        this.l = k53Var.d();
        this.m = k53Var.d();
        this.n = k53Var.d();
        this.o = u92.g;
        qt2 qt2Var = new qt2();
        qt2Var.b(7, 16777216);
        this.t = qt2Var;
        qt2 qt2Var2 = D;
        this.u = qt2Var2;
        this.y = qt2Var2.a();
        Socket socket = (Socket) blVar.b;
        if (socket == null) {
            o51.F("socket");
            throw null;
        }
        this.z = socket;
        sd2 sd2Var = (sd2) blVar.e;
        if (sd2Var == null) {
            o51.F("sink");
            throw null;
        }
        this.A = new tz0(sd2Var);
        td2 td2Var = (td2) blVar.d;
        if (td2Var == null) {
            o51.F("source");
            throw null;
        }
        this.B = new bn(this, new oz0(td2Var));
        this.C = new LinkedHashSet();
    }

    public final void A(int i, int i2, IOException iOException) {
        int i3;
        Object[] array = null;
        if (i == 0 || i2 == 0) {
            throw null;
        }
        byte[] bArr = bh3.a;
        try {
            P(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f.isEmpty()) {
                array = this.f.values().toArray(new sz0[0]);
                this.f.clear();
            }
        }
        sz0[] sz0VarArr = (sz0[]) array;
        if (sz0VarArr != null) {
            for (sz0 sz0Var : sz0VarArr) {
                try {
                    sz0Var.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.A.close();
        } catch (IOException unused3) {
        }
        try {
            this.z.close();
        } catch (IOException unused4) {
        }
        this.l.e();
        this.m.e();
        this.n.e();
    }

    public final synchronized sz0 F(int i) {
        return (sz0) this.f.get(Integer.valueOf(i));
    }

    public final synchronized sz0 O(int i) {
        sz0 sz0Var;
        sz0Var = (sz0) this.f.remove(Integer.valueOf(i));
        notifyAll();
        return sz0Var;
    }

    public final void P(int i) {
        if (i == 0) {
            throw null;
        }
        synchronized (this.A) {
            synchronized (this) {
                if (this.j) {
                    return;
                }
                this.j = true;
                this.A.P(bh3.a, this.h, i);
            }
        }
    }

    public final synchronized void U(long j) {
        long j2 = this.v + j;
        this.v = j2;
        long j3 = j2 - this.w;
        if (j3 >= this.t.a() / 2) {
            e0(0, j3);
            this.w += j3;
        }
    }

    public final void c0(int i, boolean z, xt xtVar, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.A.F(z, i, xtVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.x;
                            j3 = this.y;
                            if (j2 >= j3) {
                                if (!this.f.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.A.g);
                j4 = iMin;
                this.x += j4;
            }
            j -= j4;
            this.A.F(z && j == 0, i, xtVar, iMin);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        A(1, 9, null);
    }

    public final void d0(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        this.l.c(new gz0(this.g + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void e0(int i, long j) {
        this.l.c(new kz0(this.g + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    public final void flush() {
        this.A.flush();
    }
}
