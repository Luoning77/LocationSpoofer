package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class d03 {
    public static final i43 a = new i43(new oi1(25));

    public static final void a(vv vvVar, float f, je jeVar, hz hzVar, jb1 jb1Var, kw0 kw0Var, e03 e03Var, float f2, float f3, boolean z, boolean z2, boolean z3) {
        vvVar.o(new pe2(0.0f, f2, f, f3), jeVar);
        if (z3) {
            vvVar.f(0.0f, f2, f, f3, 1);
        }
        jg0.c0(jb1Var, hzVar.a, 0L, 0L, 0.0f, null, 0, 126);
        dh0.m(jb1Var, kw0Var);
        b(jb1Var, e03Var, z, z2);
        vvVar.i();
    }

    public static final void b(jb1 jb1Var, e03 e03Var, boolean z, boolean z2) {
        jb1 jb1Var2;
        e03 e03Var2;
        xv xvVar = jb1Var.e;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xvVar.a() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xvVar.a() & 4294967295L));
        vv vvVarI = xvVar.f.i();
        if (z) {
            jb1Var2 = jb1Var;
            e03Var2 = e03Var;
            c(vvVarI, jb1Var2, e03Var2, 0.0f, 0.0f, e03Var.c(0, xvVar.a()));
            float fC = e03Var2.c(1, xvVar.a());
            c(vvVarI, jb1Var2, e03Var2, fIntBitsToFloat - fC, 0.0f, fC);
        } else {
            jb1Var2 = jb1Var;
            e03Var2 = e03Var;
        }
        if (z2) {
            float fC2 = e03Var2.c(2, xvVar.a());
            c(vvVarI, jb1Var2, e03Var2, fIntBitsToFloat - fC2, fIntBitsToFloat2 - fC2, fC2);
            float fC3 = e03Var2.c(3, xvVar.a());
            c(vvVarI, jb1Var2, e03Var2, 0.0f, fIntBitsToFloat2 - fC3, fC3);
        }
    }

    public static final void c(vv vvVar, jb1 jb1Var, e03 e03Var, float f, float f2, float f3) {
        if (f3 <= 0.0f) {
            return;
        }
        vvVar.l();
        vvVar.f(f, f2, f + f3, f2 + f3, 1);
        jg0.P0(jb1Var, e03Var, 0L, 0L, 0.0f, null, 6, 62);
        vvVar.i();
    }
}
