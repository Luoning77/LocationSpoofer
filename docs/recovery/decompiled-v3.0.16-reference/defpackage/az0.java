package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class az0 extends vy0 {
    public boolean h;

    @Override // defpackage.vy0, defpackage.sy2
    public final long C(xt xtVar, long j) throws IOException {
        xtVar.getClass();
        if (j < 0) {
            fo.f(p91.o("byteCount < 0: ", j));
            return 0L;
        }
        if (this.f) {
            fo.n("closed");
            return 0L;
        }
        if (this.h) {
            return -1L;
        }
        long jC = super.C(xtVar, j);
        if (jC != -1) {
            return jC;
        }
        this.h = true;
        A();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        if (!this.h) {
            A();
        }
        this.f = true;
    }
}
