package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cm0 implements bw2 {
    public final bw2 e;
    public final long f;
    public boolean g;
    public long h;
    public boolean i;
    public final /* synthetic */ em0 j;

    public cm0(em0 em0Var, bw2 bw2Var, long j) {
        bw2Var.getClass();
        this.j = em0Var;
        this.e = bw2Var;
        this.f = j;
    }

    public final void A() {
        this.e.close();
    }

    public final IOException F(IOException iOException) {
        if (this.g) {
            return iOException;
        }
        this.g = true;
        return this.j.a(this.h, false, true, iOException);
    }

    public final void O() {
        this.e.flush();
    }

    @Override // defpackage.bw2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.i) {
            return;
        }
        this.i = true;
        long j = this.f;
        if (j != -1 && this.h != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            A();
            F(null);
        } catch (IOException e) {
            throw F(e);
        }
    }

    @Override // defpackage.bw2
    public final pa3 d() {
        return this.e.d();
    }

    @Override // defpackage.bw2, java.io.Flushable
    public final void flush() throws IOException {
        try {
            O();
        } catch (IOException e) {
            throw F(e);
        }
    }

    @Override // defpackage.bw2
    public final void i(xt xtVar, long j) throws IOException {
        if (this.i) {
            fo.n("closed");
            return;
        }
        long j2 = this.f;
        if (j2 == -1 || this.h + j <= j2) {
            try {
                this.e.i(xtVar, j);
                this.h += j;
                return;
            } catch (IOException e) {
                throw F(e);
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + (this.h + j));
    }

    public final String toString() {
        return cm0.class.getSimpleName() + '(' + this.e + ')';
    }
}
