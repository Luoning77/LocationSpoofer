package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class h53 implements oi {
    public final rh3 a;
    public final qd3 b;
    public final Object c;
    public final Object d;
    public final yi e;
    public final yi f;
    public final yi g;
    public long h;
    public yi i;

    public h53(si siVar, qd3 qd3Var, Object obj, Object obj2, yi yiVar) {
        this.a = siVar.a(qd3Var);
        this.b = qd3Var;
        this.c = obj2;
        this.d = obj;
        this.e = (yi) qd3Var.a.invoke(obj);
        lu0 lu0Var = qd3Var.a;
        this.f = (yi) lu0Var.invoke(obj2);
        this.g = yiVar != null ? xp1.r(yiVar) : ((yi) lu0Var.invoke(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.oi
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.oi
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        yi yiVarP = this.a.p(j, this.e, this.f, this.g);
        int iB = yiVarP.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(yiVarP.a(i))) {
                jb2.b("AnimationVector cannot contain a NaN. " + yiVarP + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.invoke(yiVarP);
    }

    @Override // defpackage.oi
    public final long c() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long jB = this.a.b(this.e, this.f, this.g);
        this.h = jB;
        return jB;
    }

    @Override // defpackage.oi
    public final qd3 d() {
        return this.b;
    }

    @Override // defpackage.oi
    public final Object e() {
        return this.c;
    }

    @Override // defpackage.oi
    public final yi f(long j) {
        if (!g(j)) {
            return this.a.m(j, this.e, this.f, this.g);
        }
        yi yiVar = this.i;
        if (yiVar != null) {
            return yiVar;
        }
        yi yiVarQ = this.a.q(this.e, this.f, this.g);
        this.i = yiVarQ;
        return yiVarQ;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
