package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class g82 implements xb0 {
    public boolean e;

    public static void A(g82 g82Var, h82 h82Var, long j) {
        g82Var.x(h82Var);
        h82Var.I0(h41.c(j, h82Var.i), 0.0f, null);
    }

    public static void B(g82 g82Var, h82 h82Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (g82Var.s() == qa1.e || g82Var.w() == 0) {
            g82Var.x(h82Var);
            h82Var.I0(h41.c(j, h82Var.i), 0.0f, null);
        } else {
            int iW = (g82Var.w() - h82Var.e) - ((int) (j >> 32));
            g82Var.x(h82Var);
            h82Var.I0(h41.c((((long) iW) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), h82Var.i), 0.0f, null);
        }
    }

    public static void C(g82 g82Var, h82 h82Var, int i, int i2) {
        int i3 = i82.b;
        ik0 ik0Var = ik0.x;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (g82Var.s() == qa1.e || g82Var.w() == 0) {
            g82Var.x(h82Var);
            h82Var.I0(h41.c(j, h82Var.i), 0.0f, ik0Var);
        } else {
            int iW = (g82Var.w() - h82Var.e) - ((int) (j >> 32));
            g82Var.x(h82Var);
            h82Var.I0(h41.c((((long) iW) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), h82Var.i), 0.0f, ik0Var);
        }
    }

    public static void E(g82 g82Var, h82 h82Var, int i, int i2, lu0 lu0Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = i82.b;
            lu0Var = ik0.x;
        }
        g82Var.x(h82Var);
        h82Var.I0(h41.c((((long) i2) & 4294967295L) | (((long) i) << 32), h82Var.i), 0.0f, lu0Var);
    }

    public static void F(g82 g82Var, h82 h82Var, long j, t tVar, int i) {
        lu0 lu0Var = tVar;
        if ((i & 4) != 0) {
            int i2 = i82.b;
            lu0Var = ik0.x;
        }
        g82Var.x(h82Var);
        h82Var.I0(h41.c(j, h82Var.i), 0.0f, lu0Var);
    }

    public static void z(g82 g82Var, h82 h82Var, int i, int i2) {
        g82Var.x(h82Var);
        h82Var.I0(h41.c((((long) i2) & 4294967295L) | (((long) i) << 32), h82Var.i), 0.0f, null);
    }

    public float c(gy0 gy0Var) {
        return Float.NaN;
    }

    public abstract pa1 h();

    public abstract qa1 s();

    public abstract int w();

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(h82 h82Var) {
        if (h82Var instanceof tv1) {
            ((tv1) h82Var).E(this.e);
        }
    }
}
