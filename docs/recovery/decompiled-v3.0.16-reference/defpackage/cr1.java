package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cr1 extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ dr1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cr1(dr1 dr1Var, int i) {
        super(0);
        this.f = i;
        this.g = dr1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        dr1 dr1Var = this.g;
        switch (i) {
            case 0:
                lb1 lb1Var = dr1Var.j;
                lb1Var.i = 0;
                gy1 gy1VarY = lb1Var.a.y();
                Object[] objArr = gy1VarY.e;
                int i2 = gy1VarY.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    dr1 dr1Var2 = ((hb1) objArr[i3]).L.p;
                    dr1Var2.l = dr1Var2.m;
                    dr1Var2.m = Integer.MAX_VALUE;
                    dr1Var2.x = false;
                    if (dr1Var2.p == fb1.f) {
                        dr1Var2.p = fb1.g;
                    }
                }
                hb1 hb1Var = lb1Var.a;
                hb1 hb1Var2 = lb1Var.a;
                gy1 gy1VarY2 = hb1Var.y();
                Object[] objArr2 = gy1VarY2.e;
                int i4 = gy1VarY2.g;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((hb1) objArr2[i5]).L.p.B.d = false;
                }
                if (dr1Var.F().o) {
                    qx1 qx1Var = (qx1) hb1Var2.n();
                    int i6 = ((gy1) qx1Var.f).g;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((hb1) qx1Var.get(i7)).K.d.o = true;
                    }
                }
                dr1Var.F().b1().a();
                if (dr1Var.F().o) {
                    qx1 qx1Var2 = (qx1) hb1Var2.n();
                    int i8 = ((gy1) qx1Var2.f).g;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((hb1) qx1Var2.get(i9)).K.d.o = false;
                    }
                }
                gy1 gy1VarY3 = hb1Var2.y();
                Object[] objArr3 = gy1VarY3.e;
                int i10 = gy1VarY3.g;
                for (int i11 = 0; i11 < i10; i11++) {
                    hb1 hb1Var3 = (hb1) objArr3[i11];
                    lb1 lb1Var2 = hb1Var3.L;
                    if (lb1Var2.p.l != hb1Var3.v()) {
                        hb1Var2.N();
                        hb1Var2.B();
                        if (hb1Var3.v() == Integer.MAX_VALUE) {
                            if (lb1Var2.c || vd0.B(hb1Var3)) {
                                ik1 ik1Var = lb1Var2.q;
                                ik1Var.getClass();
                                ik1Var.M0(false);
                            }
                            lb1Var2.p.R0();
                        }
                    }
                }
                gy1 gy1VarY4 = hb1Var2.y();
                Object[] objArr4 = gy1VarY4.e;
                int i12 = gy1VarY4.g;
                for (int i13 = 0; i13 < i12; i13++) {
                    ib1 ib1Var = ((hb1) objArr4[i13]).L.p.B;
                    ib1Var.e = ib1Var.d;
                }
                break;
            case 1:
                dr1Var.j.a().s(dr1Var.F);
                break;
            default:
                lb1 lb1Var3 = dr1Var.j;
                xz1 xz1Var = lb1Var3.a().w;
                g82 placementScope = xz1Var != null ? xz1Var.p : ((db) kb1.a(lb1Var3.a)).getPlacementScope();
                lu0 lu0Var = dr1Var.K;
                if (lu0Var == null) {
                    xz1 xz1VarA = lb1Var3.a();
                    long j = dr1Var.L;
                    float f = dr1Var.M;
                    placementScope.x(xz1VarA);
                    xz1VarA.I0(h41.c(j, xz1VarA.i), f, null);
                } else {
                    xz1 xz1VarA2 = lb1Var3.a();
                    long j2 = dr1Var.L;
                    float f2 = dr1Var.M;
                    placementScope.x(xz1VarA2);
                    xz1VarA2.I0(h41.c(j2, xz1VarA2.i), f2, lu0Var);
                }
                break;
        }
        return mf3Var;
    }
}
