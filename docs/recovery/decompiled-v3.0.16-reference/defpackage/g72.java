package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g72 {
    public final t30 a;
    public final o30 b;
    public final ov0 c;
    public final pu0 d;
    public final boolean e;
    public final if3 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(i72.g);
    public long i = a83.b();
    public ay1 j;
    public final lj k;
    public final le2 l;

    public g72(t30 t30Var, o30 o30Var, ov0 ov0Var, cy1 cy1Var, pu0 pu0Var, boolean z, if3 if3Var, Object obj) {
        this.a = t30Var;
        this.b = o30Var;
        this.c = ov0Var;
        this.d = pu0Var;
        this.e = z;
        this.f = if3Var;
        this.g = obj;
        ay1 ay1Var = in2.a;
        ay1Var.getClass();
        this.j = ay1Var;
        lj ljVar = new lj();
        ljVar.j(cy1Var, ov0Var.C());
        this.k = ljVar;
        this.l = new le2(if3Var.g);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((i72) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case Logger.WARN /* 5 */:
                    b();
                    i72 i72Var = i72.j;
                    i72 i72Var2 = i72.k;
                    while (!atomicReference.compareAndSet(i72Var, i72Var2)) {
                        if (atomicReference.get() != i72Var) {
                            hb2.b("Unexpected state change from: " + i72Var + " to: " + i72Var2 + '.');
                            return;
                        }
                    }
                    return;
                case Logger.ERROR /* 6 */:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new iv();
            }
        } catch (Exception e) {
            atomicReference.set(i72.e);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.d();
                    this.k.e();
                    this.k.c();
                    this.a.u = null;
                } catch (Throwable th) {
                    this.k.c();
                    this.a.u = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean c() {
        return ((i72) this.h.get()).compareTo(i72.j) >= 0;
    }

    public final void d() {
        AtomicReference atomicReference;
        i72 i72Var;
        i72 i72Var2;
        do {
            atomicReference = this.h;
            i72Var = i72.h;
            i72Var2 = i72.j;
            if (atomicReference.compareAndSet(i72Var, i72Var2)) {
                return;
            }
        } while (atomicReference.get() == i72Var);
        hb2.b("Unexpected state change from: " + i72Var + " to: " + i72Var2 + '.');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:46:0x00e3, B:49:0x00f2, B:50:0x00f5, B:51:0x00f7, B:57:0x011f, B:59:0x0127, B:54:0x00fe, B:56:0x0104, B:64:0x0132, B:65:0x0135, B:66:0x0136, B:67:0x013d, B:68:0x013e, B:69:0x0145, B:23:0x006b, B:47:0x00e8), top: B:74:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:46:0x00e3, B:49:0x00f2, B:50:0x00f5, B:51:0x00f7, B:57:0x011f, B:59:0x0127, B:54:0x00fe, B:56:0x0104, B:64:0x0132, B:65:0x0135, B:66:0x0136, B:67:0x013d, B:68:0x013e, B:69:0x0145, B:23:0x006b, B:47:0x00e8), top: B:74:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0127 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:46:0x00e3, B:49:0x00f2, B:50:0x00f5, B:51:0x00f7, B:57:0x011f, B:59:0x0127, B:54:0x00fe, B:56:0x0104, B:64:0x0132, B:65:0x0135, B:66:0x0136, B:67:0x013d, B:68:0x013e, B:69:0x0145, B:23:0x006b, B:47:0x00e8), top: B:74:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:1: B:25:0x007b->B:82:?, LOOP_END, SYNTHETIC] */
    public final boolean e(pv2 pv2Var) throws Exception {
        long j;
        i72 i72Var = i72.i;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((i72) atomicReference.get()).ordinal();
            i72 i72Var2 = i72.h;
            t30 t30Var = this.a;
            o30 o30Var = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    ov0 ov0Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        ov0Var.z = 0;
                        ov0Var.y = true;
                    }
                    try {
                        this.j = o30Var.b(t30Var, pv2Var, this.d);
                        if (z) {
                            ov0Var.u();
                        }
                        i72 i72Var3 = i72.g;
                        while (!atomicReference.compareAndSet(i72Var3, i72Var2)) {
                            if (atomicReference.get() != i72Var3) {
                                hb2.b("Unexpected state change from: " + i72Var3 + " to: " + i72Var2 + '.');
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        if (z) {
                            ov0Var.u();
                        }
                        throw th;
                    }
                case 3:
                    try {
                        while (!atomicReference.compareAndSet(i72Var2, i72Var)) {
                            if (atomicReference.get() != i72Var2) {
                                hb2.b("Unexpected state change from: " + i72Var2 + " to: " + i72Var + '.');
                                j = this.i;
                                this.i = a83.b();
                                this.j = o30Var.n(t30Var, pv2Var, this.j);
                                this.i = j;
                                while (!atomicReference.compareAndSet(i72Var, i72Var2)) {
                                    if (atomicReference.get() != i72Var) {
                                        hb2.b("Unexpected state change from: " + i72Var + " to: " + i72Var2 + '.');
                                        if (this.j.g()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.i = a83.b();
                        this.j = o30Var.n(t30Var, pv2Var, this.j);
                        this.i = j;
                        while (!atomicReference.compareAndSet(i72Var, i72Var2)) {
                            if (atomicReference.get() != i72Var) {
                                hb2.b("Unexpected state change from: " + i72Var + " to: " + i72Var2 + '.');
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th2) {
                        this.i = j;
                        while (!atomicReference.compareAndSet(i72Var, i72Var2)) {
                            if (atomicReference.get() != i72Var) {
                                hb2.b("Unexpected state change from: " + i72Var + " to: " + i72Var2 + '.');
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                    j = this.i;
                case 4:
                    j30.b("Recursive call to resume()");
                    throw new iv();
                case Logger.WARN /* 5 */:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case Logger.ERROR /* 6 */:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new iv();
            }
        } catch (Exception e) {
            atomicReference.set(i72.e);
            throw e;
        }
    }
}
