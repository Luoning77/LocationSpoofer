package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qz0 implements sy2 {
    public final long e;
    public boolean f;
    public final xt g = new xt();
    public final xt h = new xt();
    public boolean i;
    public final /* synthetic */ sz0 j;

    public qz0(sz0 sz0Var, long j, boolean z) {
        this.j = sz0Var;
        this.e = j;
        this.f = z;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x003c A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x0015, B:9:0x0018, B:12:0x001c, B:14:0x0020, B:16:0x0024, B:17:0x0026, B:19:0x0029, B:21:0x002c, B:25:0x0034, B:28:0x0037, B:29:0x0038, B:31:0x003c, B:33:0x0047, B:35:0x005d, B:37:0x006c, B:38:0x0078, B:41:0x0082, B:44:0x0088, B:45:0x0094, B:58:0x00ac, B:59:0x00b3, B:62:0x00b6, B:8:0x0016, B:18:0x0027), top: B:69:0x0015, outer: #3, inners: #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0047 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x0015, B:9:0x0018, B:12:0x001c, B:14:0x0020, B:16:0x0024, B:17:0x0026, B:19:0x0029, B:21:0x002c, B:25:0x0034, B:28:0x0037, B:29:0x0038, B:31:0x003c, B:33:0x0047, B:35:0x005d, B:37:0x006c, B:38:0x0078, B:41:0x0082, B:44:0x0088, B:45:0x0094, B:58:0x00ac, B:59:0x00b3, B:62:0x00b6, B:8:0x0016, B:18:0x0027), top: B:69:0x0015, outer: #3, inners: #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x0015, B:9:0x0018, B:12:0x001c, B:14:0x0020, B:16:0x0024, B:17:0x0026, B:19:0x0029, B:21:0x002c, B:25:0x0034, B:28:0x0037, B:29:0x0038, B:31:0x003c, B:33:0x0047, B:35:0x005d, B:37:0x006c, B:38:0x0078, B:41:0x0082, B:44:0x0088, B:45:0x0094, B:58:0x00ac, B:59:0x00b3, B:62:0x00b6, B:8:0x0016, B:18:0x0027), top: B:69:0x0015, outer: #3, inners: #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x009d A[LOOP:0: B:4:0x000d->B:49:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a1 A[SYNTHETIC] */
    @Override // defpackage.sy2
    public final long C(xt xtVar, long j) throws Throwable {
        int i;
        Throwable th;
        xt xtVar2;
        long j2;
        boolean z;
        long j3;
        long jC;
        long j4;
        xtVar.getClass();
        long j5 = 0;
        if (j < 0) {
            fo.f(p91.o("byteCount < 0: ", j));
            return 0L;
        }
        while (true) {
            sz0 sz0Var = this.j;
            synchronized (sz0Var) {
                sz0Var.k.i();
                try {
                    synchronized (sz0Var) {
                        i = sz0Var.m;
                    }
                    if (!z) {
                        if (jC != -1) {
                            return jC;
                        }
                        if (th == null) {
                            return -1L;
                        }
                        throw th;
                    }
                    j5 = j3;
                } catch (Throwable th2) {
                    sz0Var.k.l();
                    throw th2;
                }
            }
            th = null;
            if (i != 0 && !this.f) {
                Throwable d13Var = sz0Var.n;
                if (d13Var == null) {
                    synchronized (sz0Var) {
                        int i2 = sz0Var.m;
                        if (i2 == 0) {
                            throw null;
                        }
                        d13Var = new d13(i2);
                    }
                }
                th = d13Var;
                if (!this.i) {
                    throw new IOException("stream closed");
                }
                xtVar2 = this.h;
                j2 = xtVar2.f;
                z = false;
                if (j2 > j5) {
                    jC = xtVar2.C(xtVar, Math.min(j, j2));
                    long j6 = sz0Var.c + jC;
                    sz0Var.c = j6;
                    j3 = j5;
                    j4 = j6 - sz0Var.d;
                    if (th == null) {
                        sz0Var.b.e0(sz0Var.a, j4);
                        sz0Var.d = sz0Var.c;
                    }
                } else {
                    j3 = j5;
                    if (!this.f) {
                        sz0Var.wait();
                        z = true;
                    }
                    jC = -1;
                }
                sz0Var.k.l();
                if (!z) {
                    if (jC != -1) {
                        return jC;
                    }
                    if (th == null) {
                        return -1L;
                    }
                    throw th;
                }
                j5 = j3;
            } else {
                if (!this.i) {
                    throw new IOException("stream closed");
                }
                xtVar2 = this.h;
                j2 = xtVar2.f;
                z = false;
                if (j2 > j5) {
                    jC = xtVar2.C(xtVar, Math.min(j, j2));
                    long j7 = sz0Var.c + jC;
                    sz0Var.c = j7;
                    j3 = j5;
                    j4 = j7 - sz0Var.d;
                    if (th == null && j4 >= sz0Var.b.t.a() / 2) {
                        sz0Var.b.e0(sz0Var.a, j4);
                        sz0Var.d = sz0Var.c;
                    }
                } else {
                    j3 = j5;
                    if (!this.f && th == null) {
                        try {
                            sz0Var.wait();
                            z = true;
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                    jC = -1;
                }
                sz0Var.k.l();
                if (!z) {
                    if (jC != -1) {
                        return jC;
                    }
                    if (th == null) {
                        return -1L;
                    }
                    throw th;
                }
                j5 = j3;
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        sz0 sz0Var = this.j;
        synchronized (sz0Var) {
            this.i = true;
            xt xtVar = this.h;
            j = xtVar.f;
            xtVar.skip(j);
            sz0Var.notifyAll();
        }
        if (j > 0) {
            sz0 sz0Var2 = this.j;
            byte[] bArr = bh3.a;
            sz0Var2.b.U(j);
        }
        this.j.a();
    }

    @Override // defpackage.sy2
    public final pa3 d() {
        return this.j.k;
    }
}
