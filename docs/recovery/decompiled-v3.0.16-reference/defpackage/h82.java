package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class h82 {
    public int e;
    public int f;
    public long g = 0;
    public long h = i82.a;
    public long i = 0;

    public Object A() {
        return null;
    }

    public int D0() {
        return (int) (this.g & 4294967295L);
    }

    public int E0() {
        return (int) (this.g >> 32);
    }

    public final void F0() {
        this.e = mh0.v((int) (this.g >> 32), l50.j(this.h), l50.h(this.h));
        int iV = mh0.v((int) (this.g & 4294967295L), l50.i(this.h), l50.g(this.h));
        this.f = iV;
        int i = this.e;
        long j = this.g;
        this.i = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iV - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void I0(long j, float f, lu0 lu0Var);

    public final void J0(long j) {
        if (p41.b(this.g, j)) {
            return;
        }
        this.g = j;
        F0();
    }

    public final void K0(long j) {
        if (l50.b(this.h, j)) {
            return;
        }
        this.h = j;
        F0();
    }

    public abstract int x0(m9 m9Var);
}
