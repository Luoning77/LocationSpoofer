package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zy0 implements bw2 {
    public final sr0 e;
    public boolean f;
    public final /* synthetic */ bz0 g;

    public zy0(bz0 bz0Var) {
        this.g = bz0Var;
        this.e = new sr0(bz0Var.d.d());
    }

    @Override // defpackage.bw2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        sr0 sr0Var = this.e;
        pa3 pa3Var = sr0Var.e;
        sr0Var.e = pa3.d;
        pa3Var.a();
        pa3Var.b();
        this.g.e = 3;
    }

    @Override // defpackage.bw2
    public final pa3 d() {
        return this.e;
    }

    @Override // defpackage.bw2, java.io.Flushable
    public final void flush() {
        if (this.f) {
            return;
        }
        this.g.d.flush();
    }

    @Override // defpackage.bw2
    public final void i(xt xtVar, long j) {
        if (this.f) {
            fo.n("closed");
            return;
        }
        long j2 = xtVar.f;
        byte[] bArr = bh3.a;
        if (j < 0 || 0 > j2 || j2 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.g.d.i(xtVar, j);
    }
}
