package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ph3 extends f52 {
    public final w52 e = ke0.H(new cw2(0));
    public final w52 f = ke0.H(Boolean.FALSE);
    public final jh3 g;
    public final w52 h;
    public float i;
    public rr j;

    public ph3(vw0 vw0Var) {
        jh3 jh3Var = new jh3(vw0Var);
        jh3Var.f = new ye(this, 26);
        this.g = jh3Var;
        this.h = new w52(mf3.a, j9.W);
        this.i = 1.0f;
    }

    @Override // defpackage.f52
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.f52
    public final void b(rr rrVar) {
        this.j = rrVar;
    }

    @Override // defpackage.f52
    public final long d() {
        return ((cw2) this.e.getValue()).a;
    }

    @Override // defpackage.f52
    public final void e(jb1 jb1Var) {
        xv xvVar = jb1Var.e;
        rr rrVar = this.j;
        jh3 jh3Var = this.g;
        if (rrVar == null) {
            rrVar = (rr) jh3Var.g.getValue();
        }
        if (((Boolean) this.f.getValue()).booleanValue() && jb1Var.getLayoutDirection() == qa1.f) {
            long jV0 = xvVar.v0();
            gn gnVar = xvVar.f;
            long jR = gnVar.r();
            gnVar.i().l();
            try {
                ((t1) gnVar.a).B(-1.0f, 1.0f, jV0);
                jh3Var.e(jb1Var, this.i, rrVar);
                p91.v(gnVar, jR);
            } catch (Throwable th) {
                p91.v(gnVar, jR);
                throw th;
            }
        } else {
            jh3Var.e(jb1Var, this.i, rrVar);
        }
        this.h.getValue();
    }
}
