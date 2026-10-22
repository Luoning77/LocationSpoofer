package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class oa2 implements bl2 {
    public final bl2 e;
    public final long f;
    public final /* synthetic */ ua2 g;

    public oa2(ua2 ua2Var, bl2 bl2Var) {
        bl2Var.getClass();
        this.g = ua2Var;
        this.e = bl2Var;
        this.f = h73.l();
    }

    @Override // defpackage.bl2
    public final void D(int i, String str) {
        str.getClass();
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            this.e.D(i, str);
        } else {
            mh0.d0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.bl2
    public final boolean R() {
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            return this.e.R();
        }
        mh0.d0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.bl2
    public final void a(double d, int i) {
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            this.e.a(d, i);
        } else {
            mh0.d0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.bl2
    public final void b(int i) {
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            this.e.b(i);
        } else {
            mh0.d0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            this.e.close();
        } else {
            mh0.d0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.bl2
    public final void e(int i, long j) {
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            this.e.e(i, j);
        } else {
            mh0.d0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.bl2
    public final void f() {
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            this.e.f();
        } else {
            mh0.d0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // defpackage.bl2
    public final int getColumnCount() {
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            return this.e.getColumnCount();
        }
        mh0.d0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.bl2
    public final String getColumnName(int i) {
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            return this.e.getColumnName(i);
        }
        mh0.d0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.bl2
    public final double getDouble(int i) {
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            return this.e.getDouble(i);
        }
        mh0.d0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.bl2
    public final long getLong(int i) {
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            return this.e.getLong(i);
        }
        mh0.d0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.bl2
    public final boolean isNull(int i) {
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            return this.e.isNull(i);
        }
        mh0.d0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.bl2
    public final String m(int i) {
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            return this.e.m(i);
        }
        mh0.d0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // defpackage.bl2
    public final void reset() {
        if (this.g.e) {
            mh0.d0(21, "Statement is recycled");
            throw null;
        }
        if (this.f == h73.l()) {
            this.e.reset();
        } else {
            mh0.d0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
