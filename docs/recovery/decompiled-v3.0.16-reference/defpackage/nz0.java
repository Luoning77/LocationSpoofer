package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nz0 implements sy2 {
    public final du e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    public nz0(du duVar) {
        this.e = duVar;
    }

    @Override // defpackage.sy2
    public final long C(xt xtVar, long j) throws IOException {
        int i;
        int i2;
        xtVar.getClass();
        do {
            int i3 = this.i;
            du duVar = this.e;
            if (i3 == 0) {
                duVar.skip(this.j);
                this.j = 0;
                if ((this.g & 4) == 0) {
                    i = this.h;
                    int iR = bh3.r(duVar);
                    this.i = iR;
                    this.f = iR;
                    int i4 = duVar.readByte() & 255;
                    this.g = duVar.readByte() & 255;
                    Logger logger = oz0.h;
                    if (logger.isLoggable(Level.FINE)) {
                        uu uuVar = cz0.a;
                        logger.fine(cz0.a(true, this.h, this.f, i4, this.g));
                    }
                    i2 = duVar.readInt() & Integer.MAX_VALUE;
                    this.h = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jC = duVar.C(xtVar, Math.min(j, i3));
                if (jC != -1) {
                    this.i -= (int) jC;
                    return jC;
                }
            }
            return -1L;
        } while (i2 == i);
        fo.r("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // defpackage.sy2
    public final pa3 d() {
        return this.e.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
