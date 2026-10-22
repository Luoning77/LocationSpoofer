package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yt1 {
    public static yt1 h;
    public final qa1 a;
    public final q93 b;
    public final ac0 c;
    public final lq0 d;
    public final q93 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public yt1(qa1 qa1Var, q93 q93Var, ac0 ac0Var, lq0 lq0Var) {
        this.a = qa1Var;
        this.b = q93Var;
        this.c = ac0Var;
        this.d = lq0Var;
        this.e = r93.c(q93Var, qa1Var);
    }

    public final long a(int i, long j) {
        int i2;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = zt1.a;
            long jB = m50.b(0, 0, 0, 0, 15);
            q93 q93Var = this.e;
            ac0 ac0Var = this.c;
            float fB = dh0.b(str, q93Var, jB, ac0Var, this.d, 1, 96).b();
            float fB2 = dh0.b(zt1.b, q93Var, m50.b(0, 0, 0, 0, 15), ac0Var, this.d, 2, 96).b() - fB;
            this.g = fB;
            this.f = fB2;
            f2 = fB2;
            f = fB;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            i2 = iRound >= 0 ? iRound : 0;
            int iG = l50.g(j);
            if (i2 > iG) {
                i2 = iG;
            }
        } else {
            i2 = l50.i(j);
        }
        return m50.a(l50.j(j), l50.h(j), i2, l50.g(j));
    }
}
