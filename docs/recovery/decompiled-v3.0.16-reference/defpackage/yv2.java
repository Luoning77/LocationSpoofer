package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yv2 implements uq2 {
    public final boolean a;
    public final int b;
    public final int c;
    public final xp2 d;
    public final qp2 e;

    public yv2(boolean z, int i, int i2, xp2 xp2Var, qp2 qp2Var) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = xp2Var;
        this.e = qp2Var;
    }

    @Override // defpackage.uq2
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.uq2
    public final qp2 b() {
        return this.e;
    }

    @Override // defpackage.uq2
    public final xp2 c() {
        return this.d;
    }

    @Override // defpackage.uq2
    public final qp2 d() {
        return this.e;
    }

    @Override // defpackage.uq2
    public final qp2 e() {
        return this.e;
    }

    @Override // defpackage.uq2
    public final int f() {
        return this.b;
    }

    @Override // defpackage.uq2
    public final boolean g(uq2 uq2Var) {
        if (this.d == null || uq2Var == null || !(uq2Var instanceof yv2)) {
            return true;
        }
        yv2 yv2Var = (yv2) uq2Var;
        if (this.b != yv2Var.b || this.c != yv2Var.c || this.a != yv2Var.a) {
            return true;
        }
        qp2 qp2Var = yv2Var.e;
        qp2 qp2Var2 = this.e;
        return (qp2Var2.a == qp2Var.a && qp2Var2.c == qp2Var.c && qp2Var2.d == qp2Var.d) ? false : true;
    }

    @Override // defpackage.uq2
    public final lx1 h(xp2 xp2Var) {
        boolean z = xp2Var.c;
        wp2 wp2Var = xp2Var.b;
        wp2 wp2Var2 = xp2Var.a;
        if ((!z && wp2Var2.b > wp2Var.b) || (z && wp2Var2.b <= wp2Var.b)) {
            xp2Var = xp2.a(xp2Var, null, null, !z, 3);
        }
        long j = this.e.a;
        lx1 lx1Var = nj1.a;
        lx1 lx1Var2 = new lx1();
        lx1Var2.h(j, xp2Var);
        return lx1Var2;
    }

    @Override // defpackage.uq2
    public final int i() {
        return this.c;
    }

    @Override // defpackage.uq2
    public final qp2 j() {
        return this.e;
    }

    @Override // defpackage.uq2
    public final e80 k() {
        int i = this.b;
        int i2 = this.c;
        if (i < i2) {
            return e80.f;
        }
        return i > i2 ? e80.e : this.e.b();
    }

    @Override // defpackage.uq2
    public final int m() {
        return 1;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + k() + ", info=\n\t" + this.e + ')';
    }

    @Override // defpackage.uq2
    public final void l(lu0 lu0Var) {
    }
}
