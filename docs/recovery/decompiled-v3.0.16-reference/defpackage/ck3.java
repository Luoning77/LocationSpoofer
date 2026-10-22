package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ck3 extends Thread implements TextureView.SurfaceTextureListener {
    public final qp1 e;
    public final Object f = new Object();
    public final LinkedList g = new LinkedList();
    public SurfaceTexture h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public Surface r;

    public ck3(TextureView textureView, qp1 qp1Var) {
        textureView.setOpaque(!qp1Var.b);
        textureView.setSurfaceTextureListener(this);
        this.e = qp1Var;
    }

    public final void a() {
        if (this.r != null) {
            this.e.onSurfaceDestroyed();
            this.r.release();
            this.r = null;
        }
        this.i = false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.f) {
            this.h = surfaceTexture;
            this.j = i;
            this.k = i2;
            this.l = true;
            this.f.notifyAll();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        synchronized (this.f) {
            this.h = null;
            this.o = true;
            this.l = false;
            this.f.notifyAll();
            while (this.i && !this.q) {
                try {
                    this.f.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.f) {
            this.j = i;
            this.k = i2;
            this.m = true;
            this.l = true;
            this.f.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        Runnable runnable;
        boolean z;
        boolean z2;
        int i2;
        while (true) {
            try {
                synchronized (this.f) {
                    while (true) {
                        if (!this.p) {
                            i = -1;
                            if (!this.g.isEmpty()) {
                                runnable = (Runnable) this.g.remove(0);
                                z = false;
                                z2 = false;
                            } else if (!this.o) {
                                if (this.h != null && !this.n && this.l) {
                                    i = this.j;
                                    int i3 = this.k;
                                    if (this.r == null) {
                                        this.r = new Surface(this.h);
                                        this.i = true;
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (this.m) {
                                        this.m = false;
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    this.l = false;
                                    i2 = i3;
                                    runnable = null;
                                    break;
                                }
                                this.f.wait();
                            } else {
                                if (this.r != null) {
                                    this.e.onSurfaceDestroyed();
                                    this.r.release();
                                    this.r = null;
                                }
                                this.i = false;
                                this.o = false;
                                this.f.notifyAll();
                                z = false;
                                z2 = false;
                                runnable = null;
                            }
                            i2 = -1;
                            break;
                        }
                        synchronized (this.f) {
                            a();
                            this.q = true;
                            this.f.notifyAll();
                        }
                        return;
                    }
                }
                if (runnable != null) {
                    runnable.run();
                } else if (z) {
                    this.e.onSurfaceCreated(this.r);
                    this.e.onSurfaceChanged(i, i2);
                } else if (z2) {
                    this.e.onSurfaceChanged(i, i2);
                } else if (this.r != null) {
                    this.e.onDrawFrame();
                }
            } catch (InterruptedException unused) {
                synchronized (this.f) {
                    a();
                    this.q = true;
                    this.f.notifyAll();
                    return;
                }
            } catch (Throwable th) {
                synchronized (this.f) {
                    a();
                    this.q = true;
                    this.f.notifyAll();
                    throw th;
                }
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
