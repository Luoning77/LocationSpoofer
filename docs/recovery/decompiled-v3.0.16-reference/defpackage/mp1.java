package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mp1 extends Thread {
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public pp1 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final ArrayList q;
    public boolean r;
    public ub s;
    public final k91 t;
    public boolean u;
    public final WeakReference v;

    public mp1(WeakReference weakReference) {
        k91 k91Var = ((np1) weakReference.get()).e;
        this.j = true;
        this.q = new ArrayList();
        this.r = true;
        this.s = null;
        this.k = 0;
        this.l = 0;
        this.n = true;
        this.m = pp1.WHEN_DIRTY;
        this.o = false;
        this.t = k91Var;
        this.v = weakReference;
    }

    public final void a() {
        np1 np1Var;
        np1 np1Var2;
        this.o = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i = 0;
        int i2 = 0;
        ub ubVar = null;
        Runnable runnable = null;
        while (true) {
            synchronized (this.t) {
                while (true) {
                    try {
                        if (!this.e) {
                            if (!this.q.isEmpty()) {
                                runnable = (Runnable) this.q.remove(0);
                                break;
                            }
                            boolean z5 = this.h;
                            boolean z6 = this.g;
                            if (z5 != z6) {
                                this.h = z6;
                                this.t.notifyAll();
                            }
                            if (!this.i && !this.j) {
                                np1 np1Var3 = (np1) this.v.get();
                                if (np1Var3 != null && this.u) {
                                    np1Var3.f.onSurfaceDestroyed();
                                }
                                this.u = false;
                                this.j = true;
                                this.t.notifyAll();
                            }
                            if (this.i && this.j) {
                                if (((np1) this.v.get()) != null) {
                                    this.u = true;
                                    z3 = true;
                                }
                                this.j = false;
                                this.t.notifyAll();
                            }
                            if (z) {
                                this.o = false;
                                this.p = true;
                                this.t.notifyAll();
                                z = false;
                            }
                            ub ubVar2 = this.s;
                            if (ubVar2 != null) {
                                this.s = null;
                                ubVar = ubVar2;
                            }
                            if (b() && this.u) {
                                if (this.r) {
                                    i = this.k;
                                    i2 = this.l;
                                    this.o = true;
                                    this.r = false;
                                    z2 = true;
                                }
                                this.n = false;
                                this.t.notifyAll();
                                if (!this.o) {
                                    break;
                                }
                                z4 = true;
                                break;
                            }
                            if (ubVar != null) {
                                Log.w("MapLibreSurfaceView", "Warning, !readyToDraw() but waiting for draw finished! Early reporting draw finished.");
                                ubVar.run();
                                ubVar = null;
                            }
                            this.t.wait();
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (runnable != null) {
                runnable.run();
                runnable = null;
            } else {
                if (z3 && (np1Var2 = (np1) this.v.get()) != null) {
                    np1Var2.f.onSurfaceCreated(np1Var2.getHolder().getSurface());
                    z3 = false;
                }
                if (z2 && (np1Var = (np1) this.v.get()) != null) {
                    np1Var.f.onSurfaceChanged(i, i2);
                    z2 = false;
                }
                np1 np1Var4 = (np1) this.v.get();
                if (np1Var4 != null) {
                    np1Var4.f.onDrawFrame();
                    if (ubVar != null) {
                        ubVar.run();
                        ubVar = null;
                    }
                }
                if (z4) {
                    z4 = false;
                    z = true;
                }
            }
        }
    }

    public final boolean b() {
        if (this.h || !this.i || this.k <= 0 || this.l <= 0) {
            return false;
        }
        return this.n || this.m == pp1.CONTINUOUS;
    }

    public final void c() {
        synchronized (this.t) {
            this.e = true;
            this.t.notifyAll();
            while (!this.f && isAlive()) {
                try {
                    this.t.wait(100L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        k91 k91Var = this.t;
        setName("RenderThread " + getId());
        try {
            a();
        } catch (InterruptedException unused) {
        } finally {
            k91Var.w(this);
        }
    }
}
