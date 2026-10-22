package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class a01 implements un, e12, th3 {
    public final int e;
    public int f;
    public final Object g;

    public a01(int i, int i2, jh0 jh0Var) {
        this.e = i;
        this.f = i2;
        this.g = new mn2((wn0) new co0(i, i2, jh0Var));
    }

    @Override // defpackage.un
    public void c(int i, Object obj) {
        ((un) this.g).c(i + (this.f == 0 ? this.e : 0), obj);
    }

    @Override // defpackage.un
    public void d(Object obj) {
        this.f++;
        ((un) this.g).d(obj);
    }

    @Override // defpackage.un
    public void e() {
        ((un) this.g).e();
    }

    @Override // defpackage.un
    public void f(int i, Object obj) {
        ((un) this.g).f(i + (this.f == 0 ? this.e : 0), obj);
    }

    @Override // defpackage.un
    public void h(int i, int i2, int i3) {
        int i4 = this.f == 0 ? this.e : 0;
        ((un) this.g).h(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.un
    public void i(Object obj, pu0 pu0Var) {
        ((un) this.g).i(obj, pu0Var);
    }

    @Override // defpackage.un
    public Object j() {
        return ((un) this.g).j();
    }

    @Override // defpackage.un
    public void k(int i, int i2) {
        ((un) this.g).k(i + (this.f == 0 ? this.e : 0), i2);
    }

    @Override // defpackage.th3
    public int l() {
        return this.f;
    }

    @Override // defpackage.rh3
    public yi m(long j, yi yiVar, yi yiVar2, yi yiVar3) {
        return ((mn2) this.g).m(j, yiVar, yiVar2, yiVar3);
    }

    @Override // defpackage.e12
    public int n(int i) {
        int iN = ((e12) this.g).n(i);
        if (i >= 0 && i <= this.f) {
            fh3.c(iN, this.e, i);
        }
        return iN;
    }

    @Override // defpackage.th3
    public int o() {
        return this.e;
    }

    @Override // defpackage.rh3
    public yi p(long j, yi yiVar, yi yiVar2, yi yiVar3) {
        return ((mn2) this.g).p(j, yiVar, yiVar2, yiVar3);
    }

    @Override // defpackage.e12
    public int r(int i) {
        int iR = ((e12) this.g).r(i);
        if (i >= 0 && i <= this.e) {
            fh3.b(iR, this.f, i);
        }
        return iR;
    }

    @Override // defpackage.un
    public void s() {
        if (this.f <= 0) {
            j30.a("OffsetApplier up called with no corresponding down");
        }
        this.f--;
        ((un) this.g).s();
    }

    public a01() {
        this.g = new a01[256];
        this.e = 0;
        this.f = 0;
    }

    public a01(int i, int i2) {
        this.g = null;
        this.e = i;
        int i3 = i2 & 7;
        this.f = i3 == 0 ? 8 : i3;
    }

    public a01(un unVar, int i) {
        this.g = unVar;
        this.e = i;
    }

    public a01(int i, int i2, au0 au0Var) {
        this.e = i;
        this.f = i2;
        this.g = au0Var;
    }

    public a01(e12 e12Var, int i, int i2) {
        this.g = e12Var;
        this.e = i;
        this.f = i2;
    }
}
