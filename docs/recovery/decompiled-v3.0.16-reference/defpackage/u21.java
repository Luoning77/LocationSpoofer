package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u21 extends ek1 {
    @Override // defpackage.ck1
    public final int M0(m9 m9Var) {
        ik1 ik1Var = this.s.s.L.q;
        ik1Var.getClass();
        ib1 ib1Var = ik1Var.v;
        if (!ik1Var.o) {
            lb1 lb1Var = ik1Var.j;
            if (lb1Var.d == db1.f) {
                ib1Var.f = true;
                if (ib1Var.b) {
                    lb1Var.f = true;
                    lb1Var.g = true;
                }
            } else {
                ib1Var.g = true;
            }
        }
        u21 u21Var = ik1Var.F().Y;
        if (u21Var != null) {
            u21Var.o = true;
        }
        ik1Var.I();
        u21 u21Var2 = ik1Var.F().Y;
        if (u21Var2 != null) {
            u21Var2.o = false;
        }
        Integer num = (Integer) ib1Var.i.get(m9Var);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.x.g(iIntValue, m9Var);
        return iIntValue;
    }

    @Override // defpackage.zq1
    public final int j0(int i) {
        d31 d31VarT = this.s.s.t();
        er1 er1VarV = d31VarT.v();
        hb1 hb1Var = (hb1) d31VarT.f;
        return er1VarV.j(hb1Var.K.d, hb1Var.l(), i);
    }

    @Override // defpackage.ek1
    public final void j1() {
        ik1 ik1Var = this.s.s.L.q;
        ik1Var.getClass();
        ik1Var.V0();
    }

    @Override // defpackage.zq1
    public final h82 s(long j) {
        K0(j);
        xz1 xz1Var = this.s;
        gy1 gy1VarY = xz1Var.s.y();
        Object[] objArr = gy1VarY.e;
        int i = gy1VarY.g;
        for (int i2 = 0; i2 < i; i2++) {
            ik1 ik1Var = ((hb1) objArr[i2]).L.q;
            ik1Var.getClass();
            ik1Var.n = fb1.g;
        }
        hb1 hb1Var = xz1Var.s;
        m1(hb1Var.B.g(this, hb1Var.l(), j));
        return this;
    }

    @Override // defpackage.zq1
    public final int s0(int i) {
        d31 d31VarT = this.s.s.t();
        er1 er1VarV = d31VarT.v();
        hb1 hb1Var = (hb1) d31VarT.f;
        return er1VarV.d(hb1Var.K.d, hb1Var.l(), i);
    }

    @Override // defpackage.zq1
    public final int u0(int i) {
        d31 d31VarT = this.s.s.t();
        er1 er1VarV = d31VarT.v();
        hb1 hb1Var = (hb1) d31VarT.f;
        return er1VarV.h(hb1Var.K.d, hb1Var.l(), i);
    }

    @Override // defpackage.zq1
    public final int w(int i) {
        d31 d31VarT = this.s.s.t();
        er1 er1VarV = d31VarT.v();
        hb1 hb1Var = (hb1) d31VarT.f;
        return er1VarV.b(hb1Var.K.d, hb1Var.l(), i);
    }
}
