package defpackage;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class lp1 extends SurfaceView implements SurfaceHolder.Callback2 {
    public final k91 e;
    public f33 f;
    public mp1 g;
    public kp1 h;
    public boolean i;

    public lp1(Context context) {
        super(context);
        this.e = new k91(5);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-2);
        holder.addCallback(this);
    }

    public final void finalize() throws Throwable {
        try {
            mp1 mp1Var = this.g;
            if (mp1Var != null && mp1Var.isAlive()) {
                this.g.c();
            }
        } finally {
            super.finalize();
        }
    }

    public pp1 getRenderingRefreshMode() {
        pp1 pp1Var;
        mp1 mp1Var = this.g;
        synchronized (mp1Var.t) {
            pp1Var = mp1Var.m;
        }
        return pp1Var;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        pp1 pp1Var;
        super.onAttachedToWindow();
        if (this.i && this.f != null) {
            pp1 pp1Var2 = pp1.WHEN_DIRTY;
            mp1 mp1Var = this.g;
            if (mp1Var != null) {
                synchronized (mp1Var.t) {
                    pp1Var = mp1Var.m;
                }
            } else {
                pp1Var = pp1Var2;
            }
            np1 np1Var = (np1) this;
            np1Var.g = new mp1(np1Var.j);
            if (pp1Var != pp1Var2) {
                mp1 mp1Var2 = this.g;
                synchronized (mp1Var2.t) {
                    mp1Var2.m = pp1Var;
                    mp1Var2.t.notifyAll();
                }
            }
            this.g.start();
        }
        this.i = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        kp1 kp1Var = this.h;
        if (kp1Var != null) {
            ((f33) ((us1) kp1Var).f).nativeReset();
        }
        mp1 mp1Var = this.g;
        if (mp1Var != null && mp1Var.isAlive()) {
            this.g.c();
        }
        this.i = true;
        super.onDetachedFromWindow();
    }

    public void setDetachedListener(kp1 kp1Var) {
        if (this.h == null) {
            this.h = kp1Var;
        } else {
            fo.i("Detached from window listener has been already set.");
        }
    }

    public void setRenderer(f33 f33Var) {
        if (this.g != null) {
            fo.n("setRenderer has already been called for this instance.");
            return;
        }
        this.f = f33Var;
        np1 np1Var = (np1) this;
        np1Var.g = new mp1(np1Var.j);
        this.g.start();
    }

    public void setRenderingRefreshMode(pp1 pp1Var) {
        mp1 mp1Var = this.g;
        synchronized (mp1Var.t) {
            mp1Var.m = pp1Var;
            mp1Var.t.notifyAll();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        mp1 mp1Var = this.g;
        synchronized (mp1Var.t) {
            try {
                mp1Var.k = i2;
                mp1Var.l = i3;
                mp1Var.r = true;
                mp1Var.n = true;
                mp1Var.p = false;
                if (Thread.currentThread() == mp1Var) {
                    return;
                }
                mp1Var.t.notifyAll();
                while (!mp1Var.f && !mp1Var.h && !mp1Var.p && mp1Var.u && mp1Var.b()) {
                    try {
                        mp1Var.t.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        mp1 mp1Var = this.g;
        synchronized (mp1Var.t) {
            mp1Var.i = true;
            mp1Var.t.notifyAll();
            while (!mp1Var.f && mp1Var.j) {
                try {
                    mp1Var.t.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        mp1 mp1Var = this.g;
        synchronized (mp1Var.t) {
            mp1Var.i = false;
            mp1Var.t.notifyAll();
            while (!mp1Var.f && !mp1Var.j) {
                try {
                    mp1Var.t.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        mp1 mp1Var = this.g;
        if (mp1Var != null) {
            synchronized (mp1Var.t) {
                try {
                    if (Thread.currentThread() == mp1Var) {
                        return;
                    }
                    mp1Var.o = true;
                    mp1Var.n = true;
                    mp1Var.p = false;
                    mp1Var.s = new ub(4, mp1Var.s, runnable);
                    mp1Var.t.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
