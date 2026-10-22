package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x40 implements bl2 {
    public final bl2 e;

    public x40(bl2 bl2Var) {
        this.e = bl2Var;
    }

    @Override // defpackage.bl2
    public final void D(int i, String str) {
        str.getClass();
        this.e.D(i, str);
    }

    @Override // defpackage.bl2
    public final boolean I() {
        return this.e.I();
    }

    @Override // defpackage.bl2
    public final boolean R() {
        return this.e.R();
    }

    @Override // defpackage.bl2
    public final void a(double d, int i) {
        this.e.a(d, i);
    }

    @Override // defpackage.bl2
    public final void b(int i) {
        this.e.b(i);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        bl2 bl2Var = this.e;
        bl2Var.reset();
        bl2Var.f();
    }

    @Override // defpackage.bl2
    public final void e(int i, long j) {
        this.e.e(i, j);
    }

    @Override // defpackage.bl2
    public final void f() {
        this.e.f();
    }

    @Override // defpackage.bl2
    public final int getColumnCount() {
        return this.e.getColumnCount();
    }

    @Override // defpackage.bl2
    public final String getColumnName(int i) {
        return this.e.getColumnName(i);
    }

    @Override // defpackage.bl2
    public final double getDouble(int i) {
        return this.e.getDouble(i);
    }

    @Override // defpackage.bl2
    public final long getLong(int i) {
        return this.e.getLong(i);
    }

    @Override // defpackage.bl2
    public final boolean isNull(int i) {
        return this.e.isNull(i);
    }

    @Override // defpackage.bl2
    public final String m(int i) {
        return this.e.m(i);
    }

    @Override // defpackage.bl2
    public final void reset() {
        this.e.reset();
    }
}
