package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h21 implements sy2 {
    public final td2 e;
    public final Inflater f;
    public int g;
    public boolean h;

    public h21(td2 td2Var, Inflater inflater) {
        this.e = td2Var;
        this.f = inflater;
    }

    @Override // defpackage.sy2
    public final long C(xt xtVar, long j) throws IOException {
        long j2;
        xtVar.getClass();
        while (j >= 0) {
            if (this.h) {
                fo.n("closed");
                return 0L;
            }
            td2 td2Var = this.e;
            Inflater inflater = this.f;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    jp2 jp2VarF0 = xtVar.f0(1);
                    int iMin = (int) Math.min(j, 8192 - jp2VarF0.c);
                    if (inflater.needsInput() && !td2Var.A()) {
                        jp2 jp2Var = td2Var.f.e;
                        jp2Var.getClass();
                        int i = jp2Var.c;
                        int i2 = jp2Var.b;
                        int i3 = i - i2;
                        this.g = i3;
                        inflater.setInput(jp2Var.a, i2, i3);
                    }
                    int iInflate = inflater.inflate(jp2VarF0.a, jp2VarF0.c, iMin);
                    int i4 = this.g;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.g -= remaining;
                        td2Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        jp2VarF0.c += iInflate;
                        j2 = iInflate;
                        xtVar.f += j2;
                    } else {
                        if (jp2VarF0.b == jp2VarF0.c) {
                            xtVar.e = jp2VarF0.a();
                            lp2.a(jp2VarF0);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (td2Var.A()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        fo.f(p91.o("byteCount < 0: ", j));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.h) {
            return;
        }
        this.f.end();
        this.h = true;
        this.e.close();
    }

    @Override // defpackage.sy2
    public final pa3 d() {
        return this.e.e.d();
    }
}
