package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xd2 implements dv {
    public final k12 e;
    public final yf2 f;
    public final fg0 g;
    public final zl0 h;
    public final wd2 i;
    public final AtomicBoolean j;
    public Object k;
    public gm0 l;
    public ae2 m;
    public boolean n;
    public em0 o;
    public boolean p;
    public boolean q;
    public boolean r;
    public volatile boolean s;
    public volatile em0 t;
    public volatile ae2 u;

    public xd2(k12 k12Var, yf2 yf2Var) {
        yf2Var.getClass();
        this.e = k12Var;
        this.f = yf2Var;
        this.g = (fg0) k12Var.f.f;
        this.h = k12Var.i.a(this);
        wd2 wd2Var = new wd2(this);
        wd2Var.g(k12Var.A, TimeUnit.MILLISECONDS);
        this.i = wd2Var;
        this.j = new AtomicBoolean();
        this.r = true;
    }

    public final void a(ae2 ae2Var) {
        byte[] bArr = bh3.a;
        if (this.m != null) {
            fo.n("Check failed.");
        } else {
            this.m = ae2Var;
            ae2Var.p.add(new vd2(this, this.k));
        }
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket socketG;
        byte[] bArr = bh3.a;
        ae2 ae2Var = this.m;
        if (ae2Var != null) {
            synchronized (ae2Var) {
                socketG = g();
            }
            if (this.m == null) {
                if (socketG != null) {
                    bh3.d(socketG);
                }
                this.h.connectionReleased(this, ae2Var);
            } else if (socketG != null) {
                fo.n("Check failed.");
                return null;
            }
        }
        if (!this.n && this.i.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        zl0 zl0Var = this.h;
        if (iOException == null) {
            zl0Var.callEnd(this);
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        zl0Var.callFailed(this, interruptedIOException);
        return interruptedIOException;
    }

    public final void c(boolean z) {
        em0 em0Var;
        synchronized (this) {
            if (!this.r) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (em0Var = this.t) != null) {
            em0Var.d.cancel();
            em0Var.a.e(em0Var, true, true, null);
        }
        this.o = null;
    }

    @Override // defpackage.dv
    public final void cancel() {
        Socket socket;
        if (this.s) {
            return;
        }
        this.s = true;
        em0 em0Var = this.t;
        if (em0Var != null) {
            em0Var.d.cancel();
        }
        ae2 ae2Var = this.u;
        if (ae2Var != null && (socket = ae2Var.c) != null) {
            bh3.d(socket);
        }
        this.h.canceled(this);
    }

    public final Object clone() {
        return new xd2(this.e, this.f);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    public final qg2 d() throws Throwable {
        ArrayList arrayList = new ArrayList();
        fz.b0(arrayList, this.e.g);
        arrayList.add(new zs(this.e));
        arrayList.add(new zs(this.e.n));
        int i = 1;
        arrayList.add(new m40(i));
        arrayList.add(m40.b);
        fz.b0(arrayList, this.e.h);
        arrayList.add(new m40(2));
        yf2 yf2Var = this.f;
        k12 k12Var = this.e;
        try {
            qg2 qg2VarB = new be2(this, arrayList, 0, null, yf2Var, k12Var.B, k12Var.C, k12Var.D).b(this.f);
            if (this.s) {
                bh3.c(qg2VarB);
                throw new IOException("Canceled");
            }
            f(null);
            return qg2VarB;
        } catch (IOException e) {
            try {
                IOException iOExceptionF = f(e);
                iOExceptionF.getClass();
                throw iOExceptionF;
            } catch (Throwable th) {
                th = th;
                if (i == 0) {
                    f(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 0;
            if (i == 0) {
                f(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:8:0x0011, B:17:0x0020, B:19:0x0024, B:20:0x0026, B:22:0x002a, B:27:0x0033, B:29:0x0037, B:14:0x001a), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0024 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:8:0x0011, B:17:0x0020, B:19:0x0024, B:20:0x0026, B:22:0x002a, B:27:0x0033, B:29:0x0037, B:14:0x001a), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0030  */
    public final IOException e(em0 em0Var, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        em0Var.getClass();
        if (em0Var.equals(this.t)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (this.p) {
                            if (z) {
                                this.p = false;
                            }
                            if (z2) {
                                this.q = false;
                            }
                            z5 = this.p;
                            if (z5) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z5) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        } else if (z2 || !this.q) {
                            z4 = false;
                        } else {
                            if (z) {
                                this.p = false;
                            }
                            if (z2) {
                                this.q = false;
                            }
                            z5 = this.p;
                            if (z5 || this.q) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!z5 && !this.q && !this.r) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                }
            }
            if (z3) {
                this.t = null;
                ae2 ae2Var = this.m;
                if (ae2Var != null) {
                    synchronized (ae2Var) {
                        ae2Var.m++;
                    }
                }
            }
            if (z4) {
                return b(iOException);
            }
        }
        return iOException;
    }

    @Override // defpackage.dv
    public final void enqueue(gv gvVar) {
        ud2 ud2Var;
        if (!this.j.compareAndSet(false, true)) {
            fo.n("Already Executed");
            return;
        }
        l82 l82Var = l82.a;
        this.k = l82.a.g();
        this.h.callStart(this);
        yc0 yc0Var = this.e.e;
        ud2 ud2Var2 = new ud2(this, gvVar);
        yc0Var.getClass();
        synchronized (yc0Var) {
            yc0Var.d.add(ud2Var2);
            String str = this.f.a.d;
            Iterator it = yc0Var.e.iterator();
            do {
                if (!it.hasNext()) {
                    Iterator it2 = yc0Var.d.iterator();
                    do {
                        if (!it2.hasNext()) {
                            ud2Var = null;
                            break;
                        }
                        ud2Var = (ud2) it2.next();
                    } while (!o51.f(ud2Var.g.f.a.d, str));
                } else {
                    ud2Var = (ud2) it.next();
                }
            } while (!o51.f(ud2Var.g.f.a.d, str));
            if (ud2Var != null) {
                ud2Var2.f = ud2Var.f;
            }
        }
        yc0Var.c();
    }

    @Override // defpackage.dv
    public final qg2 execute() {
        if (!this.j.compareAndSet(false, true)) {
            fo.n("Already Executed");
            return null;
        }
        this.i.i();
        l82 l82Var = l82.a;
        this.k = l82.a.g();
        this.h.callStart(this);
        try {
            yc0 yc0Var = this.e.e;
            synchronized (yc0Var) {
                yc0Var.f.add(this);
            }
            qg2 qg2VarD = d();
            yc0 yc0Var2 = this.e.e;
            yc0Var2.getClass();
            yc0Var2.a(yc0Var2.f, this);
            return qg2VarD;
        } catch (Throwable th) {
            yc0 yc0Var3 = this.e.e;
            yc0Var3.getClass();
            yc0Var3.a(yc0Var3.f, this);
            throw th;
        }
    }

    public final IOException f(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.r) {
                this.r = false;
                if (!this.p && !this.q) {
                    z = true;
                }
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket g() {
        ae2 ae2Var = this.m;
        ae2Var.getClass();
        byte[] bArr = bh3.a;
        ArrayList arrayList = ae2Var.p;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (o51.f(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            fo.n("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.m = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        ae2Var.q = System.nanoTime();
        fg0 fg0Var = this.g;
        j53 j53Var = (j53) fg0Var.c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) fg0Var.e;
        byte[] bArr2 = bh3.a;
        if (!ae2Var.j && fg0Var.a != 0) {
            j53Var.c((jz0) fg0Var.d, 0L);
            return null;
        }
        ae2Var.j = true;
        concurrentLinkedQueue.remove(ae2Var);
        if (concurrentLinkedQueue.isEmpty()) {
            j53Var.a();
        }
        Socket socket = ae2Var.d;
        socket.getClass();
        return socket;
    }

    @Override // defpackage.dv
    public final yf2 request() {
        return this.f;
    }
}
