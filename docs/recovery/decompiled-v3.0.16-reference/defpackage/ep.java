package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ep implements sy2 {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;

    public /* synthetic */ ep(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.sy2
    public final long C(xt xtVar, long j) {
        int i = this.e;
        Object obj = this.f;
        Object obj2 = this.g;
        xtVar.getClass();
        switch (i) {
            case 0:
                my2 my2Var = (my2) obj;
                ep epVar = (ep) obj2;
                my2Var.i();
                try {
                    try {
                        long jC = epVar.C(xtVar, j);
                        if (my2Var.j()) {
                            throw my2Var.l(null);
                        }
                        return jC;
                    } catch (IOException e) {
                        if (my2Var.j()) {
                            throw my2Var.l(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    my2Var.j();
                    throw th;
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    fo.f(p91.o("byteCount < 0: ", j));
                    return 0L;
                }
                try {
                    ((pa3) obj2).f();
                    jp2 jp2VarF0 = xtVar.f0(1);
                    int i2 = ((InputStream) obj).read(jp2VarF0.a, jp2VarF0.c, (int) Math.min(j, 8192 - jp2VarF0.c));
                    if (i2 == -1) {
                        if (jp2VarF0.b == jp2VarF0.c) {
                            xtVar.e = jp2VarF0.a();
                            lp2.a(jp2VarF0);
                        }
                        return -1L;
                    }
                    jp2VarF0.c += i2;
                    long j2 = i2;
                    xtVar.f += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        if (message != null ? l13.c0(message, "getsockname failed", false) : false) {
                            throw new IOException(e2);
                        }
                    }
                    throw e2;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                my2 my2Var = (my2) obj;
                ep epVar = (ep) this.g;
                my2Var.i();
                try {
                    try {
                        epVar.close();
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
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.sy2
    public final pa3 d() {
        switch (this.e) {
            case 0:
                return (my2) this.f;
            default:
                return (pa3) this.g;
        }
    }

    public final String toString() {
        switch (this.e) {
            case 0:
                return "AsyncTimeout.source(" + ((ep) this.g) + ')';
            default:
                return "source(" + ((InputStream) this.f) + ')';
        }
    }
}
