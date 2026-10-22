package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class co2 implements qo2 {
    public static final z92 j = new z92(2, new xm2(24), new ym2(8));
    public final t52 a;
    public float f;
    public final fc0 h;
    public final fc0 i;
    public final t52 b = new t52(0);
    public final t52 c = new t52(0);
    public final ix1 d = new ix1();
    public final t52 e = new t52(Integer.MAX_VALUE);
    public final va0 g = new va0(new ge2(this, 6));

    public co2(int i) {
        this.a = new t52(i);
        final int i2 = 0;
        this.h = by2.b(new au0(this) { // from class: bo2
            public final /* synthetic */ co2 f;

            {
                this.f = this;
            }

            @Override // defpackage.au0
            public final Object invoke() {
                int i3 = i2;
                co2 co2Var = this.f;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(co2Var.a.g() < co2Var.e.g());
                    default:
                        return Boolean.valueOf(co2Var.a.g() > 0);
                }
            }
        });
        final int i3 = 1;
        this.i = by2.b(new au0(this) { // from class: bo2
            public final /* synthetic */ co2 f;

            {
                this.f = this;
            }

            @Override // defpackage.au0
            public final Object invoke() {
                int i4 = i3;
                co2 co2Var = this.f;
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(co2Var.a.g() < co2Var.e.g());
                    default:
                        return Boolean.valueOf(co2Var.a.g() > 0);
                }
            }
        });
    }

    public static Object f(co2 co2Var, int i, k33 k33Var) {
        Object objO = ke0.o(co2Var, i - co2Var.a.g(), new yz2(null, 7), k33Var);
        return objO == z70.e ? objO : mf3.a;
    }

    @Override // defpackage.qo2
    public final boolean a() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.qo2
    public final boolean b() {
        return this.g.b();
    }

    @Override // defpackage.qo2
    public final boolean c() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.qo2
    public final Object d(jy1 jy1Var, pu0 pu0Var, r60 r60Var) {
        Object objD = this.g.d(jy1Var, pu0Var, r60Var);
        return objD == z70.e ? objD : mf3.a;
    }

    @Override // defpackage.qo2
    public final float e(float f) {
        return this.g.e(f);
    }
}
