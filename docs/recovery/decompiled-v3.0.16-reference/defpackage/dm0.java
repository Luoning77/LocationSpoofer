package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dm0 implements sy2 {
    public final sy2 e;
    public final long f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final /* synthetic */ em0 k;

    public dm0(em0 em0Var, sy2 sy2Var, long j) {
        sy2Var.getClass();
        this.k = em0Var;
        this.e = sy2Var;
        this.f = j;
        this.h = true;
        if (j == 0) {
            F(null);
        }
    }

    public final void A() throws IOException {
        this.e.close();
    }

    @Override // defpackage.sy2
    public final long C(xt xtVar, long j) throws IOException {
        xtVar.getClass();
        if (this.j) {
            fo.n("closed");
            return 0L;
        }
        try {
            long jC = this.e.C(xtVar, j);
            if (this.h) {
                this.h = false;
                em0 em0Var = this.k;
                em0Var.b.responseBodyStart(em0Var.a);
            }
            if (jC == -1) {
                F(null);
                return -1L;
            }
            long j2 = this.g + jC;
            long j3 = this.f;
            if (j3 == -1 || j2 <= j3) {
                this.g = j2;
                if (j2 == j3) {
                    F(null);
                }
                return jC;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw F(e);
        }
    }

    public final IOException F(IOException iOException) {
        if (this.i) {
            return iOException;
        }
        this.i = true;
        em0 em0Var = this.k;
        if (iOException == null && this.h) {
            this.h = false;
            em0Var.b.responseBodyStart(em0Var.a);
        }
        return em0Var.a(this.g, true, false, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.j) {
            return;
        }
        this.j = true;
        try {
            A();
            F(null);
        } catch (IOException e) {
            throw F(e);
        }
    }

    @Override // defpackage.sy2
    public final pa3 d() {
        return this.e.d();
    }

    public final String toString() {
        return dm0.class.getSimpleName() + '(' + this.e + ')';
    }
}
