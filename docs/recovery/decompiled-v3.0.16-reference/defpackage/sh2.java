package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class sh2 {
    public static final hh0 a = new hh0(0, new oi1(16));
    public static final uh2 b;
    public static final uh2 c;

    static {
        long j = hz.g;
        b = new uh2(Float.NaN, j, true);
        c = new uh2(Float.NaN, j, false);
    }

    public static uh2 a(boolean z, float f, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = hz.g;
        if (td0.b(f, Float.NaN) && ye3.a(j, j)) {
            return z ? b : c;
        }
        return new uh2(f, j, z);
    }
}
