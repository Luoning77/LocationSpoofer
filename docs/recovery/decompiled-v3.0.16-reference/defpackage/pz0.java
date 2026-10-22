package defpackage;

import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pz0 implements bw2 {
    public final boolean e;
    public final xt f = new xt();
    public boolean g;
    public final /* synthetic */ sz0 h;

    public pz0(sz0 sz0Var, boolean z) {
        this.h = sz0Var;
        this.e = z;
    }

    public final void A(boolean z) {
        long jMin;
        boolean z2;
        sz0 sz0Var = this.h;
        synchronized (sz0Var) {
            sz0Var.l.i();
            while (sz0Var.e >= sz0Var.f && !this.e && !this.g) {
                try {
                    synchronized (sz0Var) {
                        int i = sz0Var.m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            sz0Var.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    sz0Var.l.l();
                    throw th;
                }
            }
            sz0Var.l.l();
            sz0Var.b();
            jMin = Math.min(sz0Var.f - sz0Var.e, this.f.f);
            sz0Var.e += jMin;
            z2 = z && jMin == this.f.f;
        }
        this.h.l.i();
        try {
            sz0 sz0Var2 = this.h;
            sz0Var2.b.c0(sz0Var2.a, z2, this.f, jMin);
        } finally {
            this.h.l.l();
        }
    }

    @Override // defpackage.bw2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        sz0 sz0Var = this.h;
        byte[] bArr = bh3.a;
        synchronized (sz0Var) {
            if (this.g) {
                return;
            }
            synchronized (sz0Var) {
                z = sz0Var.m == 0;
            }
            sz0 sz0Var2 = this.h;
            if (!sz0Var2.j.e) {
                if (this.f.f > 0) {
                    while (this.f.f > 0) {
                        A(true);
                    }
                } else if (z) {
                    sz0Var2.b.c0(sz0Var2.a, true, null, 0L);
                }
            }
            synchronized (this.h) {
                this.g = true;
            }
            this.h.b.flush();
            this.h.a();
        }
    }

    @Override // defpackage.bw2
    public final pa3 d() {
        return this.h.l;
    }

    @Override // defpackage.bw2, java.io.Flushable
    public final void flush() {
        sz0 sz0Var = this.h;
        byte[] bArr = bh3.a;
        synchronized (sz0Var) {
            sz0Var.b();
        }
        while (this.f.f > 0) {
            A(false);
            this.h.b.flush();
        }
    }

    @Override // defpackage.bw2
    public final void i(xt xtVar, long j) {
        byte[] bArr = bh3.a;
        xt xtVar2 = this.f;
        xtVar2.i(xtVar, j);
        while (xtVar2.f >= 16384) {
            A(false);
        }
    }
}
