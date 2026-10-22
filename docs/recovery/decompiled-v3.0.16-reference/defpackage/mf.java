package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mf implements nb2, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long l;
    public final View e;
    public boolean g;
    public boolean j;
    public long k;
    public final PriorityQueue f = new PriorityQueue(11, new kf(0));
    public final Choreographer h = Choreographer.getInstance();
    public final lf i = new lf();

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public mf(View view) {
        float refreshRate;
        this.e = view;
        if (l == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            l = (long) (1.0E9f / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.j = true;
        }
    }

    @Override // defpackage.nb2
    public final void a(mb2 mb2Var) {
        this.f.add(new ec2(1, mb2Var));
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.post(this);
    }

    public final boolean b() {
        lf lfVar = this.i;
        long jA = lfVar.a();
        ks.e0("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.f;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((ec2) objPeek).b.c(lfVar)) {
                priorityQueue.poll();
                z = false;
            }
            lfVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.j) {
            this.k = j;
            this.e.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.j = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.j = false;
        this.e.removeCallbacks(this);
        this.h.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f;
        if (!priorityQueue.isEmpty() && this.g && this.j) {
            View view = this.e;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * l) + nanos;
                lf lfVar = this.i;
                lfVar.a = z;
                lfVar.b = Math.max(this.k, nanos) + l;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (lfVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.h.postFrameCallback(this);
                } else {
                    this.g = false;
                }
                ks.e0("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.g = false;
    }
}
