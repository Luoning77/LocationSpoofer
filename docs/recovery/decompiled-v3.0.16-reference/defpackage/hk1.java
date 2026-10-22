package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hk1 extends aa1 implements au0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ik1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk1(ik1 ik1Var, int i) {
        super(0);
        this.f = i;
        this.g = ik1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        ek1 ek1VarR1;
        int i = this.f;
        mf3 mf3Var = mf3.a;
        ik1 ik1Var = this.g;
        switch (i) {
            case 0:
                lb1 lb1Var = ik1Var.j;
                lb1Var.h = 0;
                gy1 gy1VarY = lb1Var.a.y();
                Object[] objArr = gy1VarY.e;
                int i2 = gy1VarY.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    ik1 ik1Var2 = ((hb1) objArr[i3]).L.q;
                    ik1Var2.getClass();
                    ik1Var2.l = ik1Var2.m;
                    ik1Var2.m = Integer.MAX_VALUE;
                    if (ik1Var2.n == fb1.f) {
                        ik1Var2.n = fb1.g;
                    }
                }
                hb1 hb1Var = lb1Var.a;
                hb1 hb1Var2 = lb1Var.a;
                gy1 gy1VarY2 = hb1Var.y();
                Object[] objArr2 = gy1VarY2.e;
                int i4 = gy1VarY2.g;
                for (int i5 = 0; i5 < i4; i5++) {
                    ik1 ik1Var3 = ((hb1) objArr2[i5]).L.q;
                    ik1Var3.getClass();
                    ik1Var3.v.d = false;
                }
                u21 u21Var = ik1Var.F().Y;
                if (u21Var != null) {
                    boolean z = u21Var.o;
                    qx1 qx1Var = (qx1) hb1Var2.n();
                    int i6 = ((gy1) qx1Var.f).g;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ek1 ek1VarR2 = ((hb1) qx1Var.get(i7)).K.d.r1();
                        if (ek1VarR2 != null) {
                            ek1VarR2.o = z;
                        }
                    }
                }
                u21 u21Var2 = ik1Var.F().Y;
                u21Var2.getClass();
                u21Var2.b1().a();
                if (ik1Var.F().Y != null) {
                    qx1 qx1Var2 = (qx1) hb1Var2.n();
                    int i8 = ((gy1) qx1Var2.f).g;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ek1 ek1VarR3 = ((hb1) qx1Var2.get(i9)).K.d.r1();
                        if (ek1VarR3 != null) {
                            ek1VarR3.o = false;
                        }
                    }
                }
                gy1 gy1VarY3 = hb1Var2.y();
                Object[] objArr3 = gy1VarY3.e;
                int i10 = gy1VarY3.g;
                for (int i11 = 0; i11 < i10; i11++) {
                    ik1 ik1Var4 = ((hb1) objArr3[i11]).L.q;
                    ik1Var4.getClass();
                    int i12 = ik1Var4.l;
                    int i13 = ik1Var4.m;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        ik1Var4.M0(true);
                    }
                }
                gy1 gy1VarY4 = hb1Var2.y();
                Object[] objArr4 = gy1VarY4.e;
                int i14 = gy1VarY4.g;
                for (int i15 = 0; i15 < i14; i15++) {
                    ik1 ik1Var5 = ((hb1) objArr4[i15]).L.q;
                    ik1Var5.getClass();
                    ib1 ib1Var = ik1Var5.v;
                    ib1Var.e = ib1Var.d;
                }
                break;
            case 1:
                lb1 lb1Var2 = ik1Var.j;
                g82 placementScope = null;
                if (vd0.B(lb1Var2.a) || lb1Var2.c) {
                    xz1 xz1Var = lb1Var2.a().w;
                    if (xz1Var != null) {
                        placementScope = xz1Var.p;
                    }
                } else {
                    xz1 xz1Var2 = lb1Var2.a().w;
                    if (xz1Var2 != null && (ek1VarR1 = xz1Var2.r1()) != null) {
                        placementScope = ek1VarR1.p;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((db) kb1.a(lb1Var2.a)).getPlacementScope();
                }
                ek1 ek1VarR4 = lb1Var2.a().r1();
                ek1VarR4.getClass();
                g82.A(placementScope, ek1VarR4, ik1Var.s);
                break;
            default:
                ek1 ek1VarR5 = ik1Var.j.a().r1();
                ek1VarR5.getClass();
                ek1VarR5.s(ik1Var.C);
                break;
        }
        return mf3Var;
    }
}
