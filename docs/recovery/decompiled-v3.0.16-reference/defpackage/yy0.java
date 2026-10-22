package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yy0 extends vy0 {
    public long h;
    public final /* synthetic */ bz0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy0(bz0 bz0Var, long j) {
        super(bz0Var);
        this.i = bz0Var;
        this.h = j;
        if (j == 0) {
            A();
        }
    }

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
        long j2 = this.h;
        if (j2 == 0) {
            return -1L;
        }
        long jC = super.C(xtVar, Math.min(j2, j));
        if (jC == -1) {
            this.i.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            A();
            throw protocolException;
        }
        long j3 = this.h - jC;
        this.h = j3;
        if (j3 == 0) {
            A();
        }
        return jC;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zS;
        if (this.f) {
            return;
        }
        if (this.h != 0) {
            byte[] bArr = bh3.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zS = bh3.s(this, 100);
            } catch (IOException unused) {
                zS = false;
            }
            if (!zS) {
                this.i.b.k();
                A();
            }
        }
        this.f = true;
    }
}
