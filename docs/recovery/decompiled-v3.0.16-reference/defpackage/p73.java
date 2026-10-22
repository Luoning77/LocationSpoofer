package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p73 implements qo2 {
    public final /* synthetic */ qo2 a;
    public final fc0 b;
    public final fc0 c;

    public p73(qo2 qo2Var, final r73 r73Var) {
        this.a = qo2Var;
        final int i = 0;
        this.b = by2.b(new au0() { // from class: o73
            @Override // defpackage.au0
            public final Object invoke() {
                int i2 = i;
                r73 r73Var2 = r73Var;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(r73Var2.a.g() < r73Var2.b.g());
                    default:
                        return Boolean.valueOf(r73Var2.a.g() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.c = by2.b(new au0() { // from class: o73
            @Override // defpackage.au0
            public final Object invoke() {
                int i3 = i2;
                r73 r73Var2 = r73Var;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(r73Var2.a.g() < r73Var2.b.g());
                    default:
                        return Boolean.valueOf(r73Var2.a.g() > 0.0f);
                }
            }
        });
    }

    @Override // defpackage.qo2
    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.qo2
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.qo2
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.qo2
    public final Object d(jy1 jy1Var, pu0 pu0Var, r60 r60Var) {
        return this.a.d(jy1Var, pu0Var, r60Var);
    }

    @Override // defpackage.qo2
    public final float e(float f) {
        return this.a.e(f);
    }
}
