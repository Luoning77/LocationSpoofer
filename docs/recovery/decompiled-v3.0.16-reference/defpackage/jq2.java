package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jq2 implements xv1, rh3 {
    public long e;
    public final long f;
    public final Object g;
    public final Object h;

    public jq2(th3 th3Var, uf2 uf2Var) {
        this.g = th3Var;
        this.h = uf2Var;
        this.e = ((long) (th3Var.o() + th3Var.l())) * 1000000;
        this.f = 0L;
    }

    @Override // defpackage.rh3
    public boolean a() {
        return true;
    }

    @Override // defpackage.rh3
    public long b(yi yiVar, yi yiVar2, yi yiVar3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.xv1
    public void c() {
        bq2 bq2Var = ((er2) this.h).h;
        if (bq2Var != null) {
            bq2Var.invoke();
        }
    }

    @Override // defpackage.xv1
    public boolean d(long j) {
        pa1 pa1Var = (pa1) ((gq2) this.g).invoke();
        if (pa1Var == null) {
            return true;
        }
        er2 er2Var = (er2) this.h;
        if (!pa1Var.U() || !fr2.a(er2Var, this.f)) {
            return false;
        }
        if (!er2Var.b(pa1Var, j, this.e, u92.l, false)) {
            return true;
        }
        this.e = j;
        return true;
    }

    @Override // defpackage.xv1
    public boolean e(long j, yp2 yp2Var, int i) {
        pa1 pa1Var = (pa1) ((gq2) this.g).invoke();
        if (pa1Var == null) {
            return false;
        }
        er2 er2Var = (er2) this.h;
        if (!pa1Var.U()) {
            return false;
        }
        oe oeVar = er2Var.f;
        if (oeVar != null) {
            oeVar.invoke(Boolean.FALSE, pa1Var, new c12(j), yp2Var);
        }
        this.e = j;
        return fr2.a(er2Var, this.f);
    }

    @Override // defpackage.xv1
    public boolean f(long j, yp2 yp2Var) {
        pa1 pa1Var = (pa1) ((gq2) this.g).invoke();
        if (pa1Var == null) {
            return true;
        }
        er2 er2Var = (er2) this.h;
        if (!pa1Var.U() || !fr2.a(er2Var, this.f)) {
            return false;
        }
        if (!er2Var.b(pa1Var, j, this.e, yp2Var, false)) {
            return true;
        }
        this.e = j;
        return true;
    }

    @Override // defpackage.xv1
    public boolean g(long j) {
        pa1 pa1Var = (pa1) ((gq2) this.g).invoke();
        if (pa1Var == null) {
            return false;
        }
        er2 er2Var = (er2) this.h;
        if (!pa1Var.U()) {
            return false;
        }
        if (er2Var.b(pa1Var, j, this.e, u92.l, false)) {
            this.e = j;
        }
        return fr2.a(er2Var, this.f);
    }

    public long h(long j) {
        long j2 = this.f;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.e;
        long j5 = j3 / j4;
        return (((uf2) this.h) == uf2.e || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public yi i(long j, yi yiVar, yi yiVar2, yi yiVar3) {
        long j2 = this.f;
        long j3 = j + j2;
        long j4 = this.e;
        return j3 > j4 ? ((th3) this.g).m(j4 - j2, yiVar, yiVar3, yiVar2) : yiVar2;
    }

    @Override // defpackage.rh3
    public yi m(long j, yi yiVar, yi yiVar2, yi yiVar3) {
        return ((th3) this.g).m(h(j), yiVar, yiVar2, i(j, yiVar, yiVar3, yiVar2));
    }

    @Override // defpackage.rh3
    public yi p(long j, yi yiVar, yi yiVar2, yi yiVar3) {
        return ((th3) this.g).p(h(j), yiVar, yiVar2, i(j, yiVar, yiVar3, yiVar2));
    }

    public jq2(gq2 gq2Var, er2 er2Var, long j) {
        this.g = gq2Var;
        this.h = er2Var;
        this.f = j;
        this.e = 0L;
    }
}
