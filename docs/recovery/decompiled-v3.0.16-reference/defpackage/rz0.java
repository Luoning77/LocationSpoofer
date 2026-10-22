package defpackage;

import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rz0 extends fp {
    public final /* synthetic */ sz0 m;

    public rz0(sz0 sz0Var) {
        this.m = sz0Var;
    }

    @Override // defpackage.fp
    public final void k() {
        this.m.e(9);
        lz0 lz0Var = this.m.b;
        synchronized (lz0Var) {
            long j = lz0Var.r;
            long j2 = lz0Var.q;
            if (j < j2) {
                return;
            }
            lz0Var.q = j2 + 1;
            lz0Var.s = System.nanoTime() + 1000000000;
            lz0Var.l.c(new jz0(az2.p(new StringBuilder(), lz0Var.g, " ping"), lz0Var, 0), 0L);
        }
    }

    public final void l() {
        if (j()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
