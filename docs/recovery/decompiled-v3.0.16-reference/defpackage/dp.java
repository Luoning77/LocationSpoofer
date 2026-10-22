package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dp implements bw2 {
    public final /* synthetic */ int e = 1;
    public final my2 f;
    public final Object g;

    public dp(OutputStream outputStream, my2 my2Var) {
        this.g = outputStream;
        this.f = my2Var;
    }

    @Override // defpackage.bw2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                dp dpVar = (dp) obj;
                my2 my2Var = this.f;
                my2Var.i();
                try {
                    try {
                        dpVar.close();
                        if (my2Var.j()) {
                            throw my2Var.l(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!my2Var.j()) {
                            throw e;
                        }
                        throw my2Var.l(e);
                    }
                } catch (Throwable th) {
                    my2Var.j();
                    throw th;
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.bw2
    public final pa3 d() {
        int i = this.e;
        return this.f;
    }

    @Override // defpackage.bw2, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                dp dpVar = (dp) obj;
                my2 my2Var = this.f;
                my2Var.i();
                try {
                    try {
                        dpVar.flush();
                        if (my2Var.j()) {
                            throw my2Var.l(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!my2Var.j()) {
                            throw e;
                        }
                        throw my2Var.l(e);
                    }
                } catch (Throwable th) {
                    my2Var.j();
                    throw th;
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0094 A[LOOP:1: B:12:0x0061->B:25:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0096 A[SYNTHETIC] */
    @Override // defpackage.bw2
    public final void i(xt xtVar, long j) throws IOException {
        long j2;
        int i = this.e;
        Object obj = this.g;
        my2 my2Var = this.f;
        switch (i) {
            case 0:
                zm3.j(xtVar.f, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    jp2 jp2Var = xtVar.e;
                    jp2Var.getClass();
                    j2 = 0;
                    try {
                        try {
                            while (j2 < 65536) {
                                j2 += (long) (jp2Var.c - jp2Var.b);
                                if (j2 >= j3) {
                                    j2 = j3;
                                    dp dpVar = (dp) obj;
                                    my2Var.i();
                                    dpVar.i(xtVar, j2);
                                    if (!my2Var.j()) {
                                        throw my2Var.l(null);
                                    }
                                } else {
                                    jp2Var = jp2Var.f;
                                    jp2Var.getClass();
                                }
                            }
                            dpVar.i(xtVar, j2);
                            if (!my2Var.j()) {
                                throw my2Var.l(null);
                            }
                        } catch (IOException e) {
                            if (!my2Var.j()) {
                                throw e;
                            }
                            throw my2Var.l(e);
                        }
                    } catch (Throwable th) {
                        my2Var.j();
                        throw th;
                    }
                    dp dpVar2 = (dp) obj;
                    my2Var.i();
                }
                return;
            default:
                zm3.j(xtVar.f, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    my2Var.f();
                    jp2 jp2Var2 = xtVar.e;
                    jp2Var2.getClass();
                    int iMin = (int) Math.min(j4, jp2Var2.c - jp2Var2.b);
                    ((OutputStream) obj).write(jp2Var2.a, jp2Var2.b, iMin);
                    int i2 = jp2Var2.b + iMin;
                    jp2Var2.b = i2;
                    long j5 = iMin;
                    j4 -= j5;
                    xtVar.f -= j5;
                    if (i2 == jp2Var2.c) {
                        xtVar.e = jp2Var2.a();
                        lp2.a(jp2Var2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                return "AsyncTimeout.sink(" + ((dp) obj) + ')';
            default:
                return "sink(" + ((OutputStream) obj) + ')';
        }
    }

    public dp(my2 my2Var, dp dpVar) {
        this.f = my2Var;
        this.g = dpVar;
    }
}
