package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class r73 {
    public static final z92 g = mh0.P(new xm2(27), new i73(4));
    public final s52 a;
    public final s52 b = new s52(0.0f);
    public final t52 c = new t52(0);
    public pe2 d = pe2.e;
    public long e = f93.b;
    public final w52 f;

    public r73(x32 x32Var, float f) {
        this.a = new s52(f);
        this.f = new w52(x32Var, u92.q);
    }

    public final void a(x32 x32Var, pe2 pe2Var, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.b.h(f2);
        float f3 = pe2Var.a;
        float f4 = pe2Var.b;
        pe2 pe2Var2 = this.d;
        float f5 = pe2Var2.a;
        s52 s52Var = this.a;
        if (f3 != f5 || f4 != pe2Var2.b) {
            boolean z = x32Var == x32.e;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? pe2Var.d : pe2Var.c;
            float fG = s52Var.g();
            float f7 = i;
            float f8 = fG + f7;
            if (f6 <= f8 && (f3 >= fG || f6 - f3 <= f7)) {
                f = (f3 >= fG || f6 - f3 > f7) ? 0.0f : f3 - fG;
            } else {
                f = f6 - f8;
            }
            s52Var.h(s52Var.g() + f);
            this.d = pe2Var;
        }
        s52Var.h(mh0.u(s52Var.g(), 0.0f, f2));
        this.c.h(i);
    }
}
