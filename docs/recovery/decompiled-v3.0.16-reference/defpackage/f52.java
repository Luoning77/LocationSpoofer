package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class f52 {
    public je a;
    public rr b;
    public float c = 1.0f;
    public qa1 d = qa1.e;

    public abstract void a(float f);

    public abstract void b(rr rrVar);

    public final void c(jb1 jb1Var, long j, float f, rr rrVar) {
        xv xvVar = jb1Var.e;
        if (this.c != f) {
            a(f);
            this.c = f;
        }
        if (!o51.f(this.b, rrVar)) {
            b(rrVar);
            this.b = rrVar;
        }
        qa1 layoutDirection = jb1Var.getLayoutDirection();
        if (this.d != layoutDirection) {
            this.d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xvVar.a() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xvVar.a() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((t1) xvVar.f.a).x(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    e(jb1Var);
                }
            } finally {
                ((t1) xvVar.f.a).x(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(jb1 jb1Var);
}
