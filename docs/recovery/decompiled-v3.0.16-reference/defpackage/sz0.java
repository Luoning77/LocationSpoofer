package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sz0 {
    public final int a;
    public final lz0 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final qz0 i;
    public final pz0 j;
    public final rz0 k;
    public final rz0 l;
    public int m;
    public IOException n;

    public sz0(int i, lz0 lz0Var, boolean z, boolean z2, ox0 ox0Var) {
        lz0Var.getClass();
        this.a = i;
        this.b = lz0Var;
        this.f = lz0Var.u.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new qz0(this, lz0Var.t.a(), z2);
        this.j = new pz0(this, z);
        this.k = new rz0(this);
        this.l = new rz0(this);
        if (ox0Var == null) {
            if (g()) {
                return;
            }
            fo.n("remotely-initiated streams should have headers");
            throw null;
        }
        if (g()) {
            fo.n("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(ox0Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z;
        boolean zH;
        byte[] bArr = bh3.a;
        synchronized (this) {
            try {
                qz0 qz0Var = this.i;
                if (qz0Var.f || !qz0Var.i) {
                    z = false;
                } else {
                    pz0 pz0Var = this.j;
                    if (pz0Var.e || pz0Var.g) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zH = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else {
            if (zH) {
                return;
            }
            this.b.O(this.a);
        }
    }

    public final void b() throws IOException {
        pz0 pz0Var = this.j;
        if (pz0Var.g) {
            fo.r("stream closed");
            return;
        }
        if (pz0Var.e) {
            fo.r("stream finished");
            return;
        }
        int i = this.m;
        if (i != 0) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            if (i == 0) {
                throw null;
            }
            throw new d13(i);
        }
    }

    public final void c(int i, IOException iOException) {
        if (i == 0) {
            throw null;
        }
        if (d(i, iOException)) {
            lz0 lz0Var = this.b;
            lz0Var.getClass();
            lz0Var.A.d0(this.a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = bh3.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.f && this.j.e) {
                return false;
            }
            this.b.O(this.a);
            return true;
        }
    }

    public final void e(int i) {
        if (i == 0) {
            throw null;
        }
        if (d(i, null)) {
            this.b.d0(this.a, i);
        }
    }

    public final pz0 f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean h() {
        try {
            if (this.m != 0) {
                return false;
            }
            qz0 qz0Var = this.i;
            if (qz0Var.f || qz0Var.i) {
                pz0 pz0Var = this.j;
                if ((pz0Var.e || pz0Var.g) && this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(ox0 ox0Var, boolean z) {
        boolean zH;
        ox0Var.getClass();
        byte[] bArr = bh3.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                } else {
                    this.h = true;
                    this.g.add(ox0Var);
                }
                if (z) {
                    this.i.f = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.b.O(this.a);
    }
}
