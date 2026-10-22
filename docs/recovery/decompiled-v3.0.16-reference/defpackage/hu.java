package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class hu {
    public static final b52 a;
    public static final b52 b;
    public static final float c;
    public static final float d;

    static {
        float f = ji2.C;
        float f2 = ji2.D;
        a = new b52(f, 8.0f, f2, 8.0f);
        if (!((f2 >= 0.0f) & (16.0f >= 0.0f) & (8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            n21.a("Padding must be non-negative");
        }
        b = new b52(12.0f, 8.0f, 12.0f, 8.0f);
        if (!((16.0f >= 0.0f) & (12.0f >= 0.0f) & (8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            n21.a("Padding must be non-negative");
        }
        c = 58.0f;
        d = 40.0f;
    }

    public static gu a(long j, long j2, long j3, long j4, f30 f30Var, int i) {
        if ((i & 2) != 0) {
            j2 = hz.g;
        }
        return b((kz) ((ov0) f30Var).j(mz.a)).a(j, j2, (i & 4) != 0 ? hz.g : j3, (i & 8) != 0 ? hz.g : j4);
    }

    public static gu b(kz kzVar) {
        gu guVar = kzVar.W;
        if (guVar != null) {
            return guVar;
        }
        gu guVar2 = new gu(mz.c(kzVar, da0.D), mz.c(kzVar, da0.J), hz.c(da0.F, mz.c(kzVar, da0.E)), hz.c(da0.H, mz.c(kzVar, da0.G)));
        kzVar.W = guVar2;
        return guVar2;
    }

    public static gu c(kz kzVar) {
        gu guVar = kzVar.X;
        if (guVar != null) {
            return guVar;
        }
        long j = hz.f;
        gu guVar2 = new gu(j, mz.c(kzVar, da0.N), j, hz.c(da0.M, mz.c(kzVar, da0.L)));
        kzVar.X = guVar2;
        return guVar2;
    }

    public static gu d(kz kzVar) {
        gu guVar = kzVar.Y;
        if (guVar != null) {
            return guVar;
        }
        long j = hz.f;
        gu guVar2 = new gu(j, mz.c(kzVar, lz.m), j, hz.c(k22.P, mz.c(kzVar, k22.O)));
        kzVar.Y = guVar2;
        return guVar2;
    }

    public static gu e(long j, long j2, ov0 ov0Var, int i) {
        if ((i & 1) != 0) {
            j = hz.g;
        }
        long j3 = j;
        long j4 = hz.g;
        return c((kz) ov0Var.j(mz.a)).a(j3, j2, j4, j4);
    }

    public static gu f(long j, f30 f30Var) {
        long j2 = hz.g;
        return d((kz) ((ov0) f30Var).j(mz.a)).a(j2, j, j2, j2);
    }
}
