package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ah2 implements ow0 {
    public int e;
    public float f = 1.0f;
    public float g = 1.0f;
    public float h = 1.0f;
    public float i;
    public float j;
    public float k;
    public long l;
    public long m;
    public float n;
    public long o;
    public au2 p;
    public boolean q;
    public int r;
    public long s;
    public xb0 t;
    public qa1 u;
    public rr v;
    public int w;
    public vd0 x;

    public ah2() {
        long j = pw0.a;
        this.l = j;
        this.m = j;
        this.n = 8.0f;
        this.o = ac3.b;
        this.p = o51.p0;
        this.r = 0;
        this.s = 9205357640488583168L;
        this.t = ym3.i();
        this.u = qa1.e;
        this.w = 3;
    }

    @Override // defpackage.ow0
    public final void B0(int i) {
        if (this.r == i) {
            return;
        }
        this.e |= 32768;
        this.r = i;
    }

    @Override // defpackage.xb0
    public final float D() {
        return this.t.D();
    }

    @Override // defpackage.ow0
    public final void N(au2 au2Var) {
        if (o51.f(this.p, au2Var)) {
            return;
        }
        this.e |= 8192;
        this.p = au2Var;
    }

    @Override // defpackage.ow0
    public final long a() {
        return this.s;
    }

    public final void c() {
        l(1.0f);
        r(1.0f);
        d(1.0f);
        p(0.0f);
        j(0.0f);
        f(0.0f);
        long j = pw0.a;
        k(j);
        q(j);
        u(8.0f);
        o0(ac3.b);
        N(o51.p0);
        n(false);
        t(null);
        m(3);
        B0(0);
        this.s = 9205357640488583168L;
        this.x = null;
        this.e = 0;
    }

    @Override // defpackage.ow0
    public final void d(float f) {
        if (this.h == f) {
            return;
        }
        this.e |= 4;
        this.h = f;
    }

    @Override // defpackage.ow0
    public final float e() {
        return this.f;
    }

    @Override // defpackage.ow0
    public final void f(float f) {
        if (this.k == f) {
            return;
        }
        this.e |= 32;
        this.k = f;
    }

    @Override // defpackage.xb0
    public final float g() {
        return this.t.g();
    }

    @Override // defpackage.ow0
    public final void j(float f) {
        if (this.j == f) {
            return;
        }
        this.e |= 16;
        this.j = f;
    }

    @Override // defpackage.ow0
    public final void k(long j) {
        long j2 = this.l;
        int i = hz.h;
        if (ye3.a(j2, j)) {
            return;
        }
        this.e |= 64;
        this.l = j;
    }

    @Override // defpackage.ow0
    public final void l(float f) {
        if (this.f == f) {
            return;
        }
        this.e |= 1;
        this.f = f;
    }

    @Override // defpackage.ow0
    public final void m(int i) {
        if (this.w == i) {
            return;
        }
        this.e |= 524288;
        this.w = i;
    }

    @Override // defpackage.ow0
    public final void n(boolean z) {
        if (this.q != z) {
            this.e |= 16384;
            this.q = z;
        }
    }

    @Override // defpackage.ow0
    public final void o0(long j) {
        if (ac3.a(this.o, j)) {
            return;
        }
        this.e |= 4096;
        this.o = j;
    }

    @Override // defpackage.ow0
    public final void p(float f) {
        if (this.i == f) {
            return;
        }
        this.e |= 8;
        this.i = f;
    }

    @Override // defpackage.ow0
    public final void q(long j) {
        long j2 = this.m;
        int i = hz.h;
        if (ye3.a(j2, j)) {
            return;
        }
        this.e |= WorkQueueKt.BUFFER_CAPACITY;
        this.m = j;
    }

    @Override // defpackage.ow0
    public final void r(float f) {
        if (this.g == f) {
            return;
        }
        this.e |= 2;
        this.g = f;
    }

    @Override // defpackage.ow0
    public final void t(rr rrVar) {
        if (o51.f(this.v, rrVar)) {
            return;
        }
        this.e |= 262144;
        this.v = rrVar;
    }

    @Override // defpackage.ow0
    public final void u(float f) {
        if (this.n == f) {
            return;
        }
        this.e |= 2048;
        this.n = f;
    }

    @Override // defpackage.ow0
    public final float v() {
        return this.g;
    }

    @Override // defpackage.ow0
    public final void M() {
    }

    @Override // defpackage.ow0
    public final void b() {
    }

    @Override // defpackage.ow0
    public final void i() {
    }

    @Override // defpackage.ow0
    public final void o() {
    }
}
