package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface jg0 extends xb0 {
    static void C0(jb1 jb1Var, kw0 kw0Var, lu0 lu0Var) {
        jb1Var.b0(kw0Var, mc0.I(jb1Var.e.a()), lu0Var);
    }

    static void K(jg0 jg0Var, re reVar, st stVar, float f, t13 t13Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        kg0 kg0Var = t13Var;
        if ((i & 8) != 0) {
            kg0Var = en0.a;
        }
        jg0Var.y(reVar, stVar, f2, kg0Var, (i & 32) != 0 ? 3 : 0);
    }

    static void O0(jg0 jg0Var, re reVar, long j, kg0 kg0Var, int i) {
        if ((i & 8) != 0) {
            kg0Var = en0.a;
        }
        jg0Var.w0(reVar, j, kg0Var);
    }

    static void P0(jb1 jb1Var, st stVar, long j, long j2, float f, kg0 kg0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        jb1Var.s(stVar, j3, (i2 & 4) != 0 ? Z0(jb1Var.e.a(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? en0.a : kg0Var, (i2 & 64) != 0 ? 3 : i);
    }

    static void Y(jg0 jg0Var, long j, float f, long j2, kg0 kg0Var, int i) {
        if ((i & 2) != 0) {
            f = cw2.b(jg0Var.a()) / 2.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            j2 = jg0Var.v0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            kg0Var = en0.a;
        }
        jg0Var.N0(j, f2, j3, kg0Var);
    }

    static long Z0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static void a0(jb1 jb1Var, st stVar, long j, long j2, long j3, kg0 kg0Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        jb1Var.w(stVar, j4, (i & 4) != 0 ? Z0(jb1Var.e.a(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? en0.a : kg0Var);
    }

    static void c0(jg0 jg0Var, long j, long j2, long j3, float f, t13 t13Var, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j2;
        jg0Var.V(j, j4, (i2 & 4) != 0 ? Z0(jg0Var.a(), j4) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? en0.a : t13Var, (i2 & 64) != 0 ? 3 : i);
    }

    static void g0(jb1 jb1Var, td tdVar, rr rrVar) {
        xv xvVar = jb1Var.e;
        xvVar.e.c.a(tdVar, xvVar.h(null, en0.a, 1.0f, rrVar, 3, 1));
    }

    static void k0(jg0 jg0Var, long j, long j2, long j3, float f, int i, int i2) {
        jg0Var.t0(j, j2, j3, f, (i2 & 16) != 0 ? 0 : i);
    }

    static void q0(jg0 jg0Var, td tdVar, long j, long j2, float f, rr rrVar, int i, int i2) {
        jg0Var.l0(tdVar, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, rrVar, (i2 & 512) != 0 ? 1 : i);
    }

    static void y0(jg0 jg0Var, long j, long j2, long j3, long j4, kg0 kg0Var, int i) {
        jg0Var.Q(j, (i & 2) != 0 ? 0L : j2, j3, j4, kg0Var);
    }

    void N0(long j, float f, long j2, kg0 kg0Var);

    void Q(long j, long j2, long j3, long j4, kg0 kg0Var);

    void V(long j, long j2, long j3, float f, kg0 kg0Var, int i);

    gn X();

    void Y0(long j, float f, float f2, long j2, long j3, kg0 kg0Var);

    default long a() {
        return X().r();
    }

    default void b0(kw0 kw0Var, long j, lu0 lu0Var) {
        kw0Var.e(this, getLayoutDirection(), j, new ze(8, this, lu0Var));
    }

    qa1 getLayoutDirection();

    void l0(td tdVar, long j, long j2, long j3, float f, rr rrVar, int i);

    void t0(long j, long j2, long j3, float f, int i);

    default long v0() {
        return gh0.z(X().r());
    }

    void w0(re reVar, long j, kg0 kg0Var);

    void y(re reVar, st stVar, float f, kg0 kg0Var, int i);
}
