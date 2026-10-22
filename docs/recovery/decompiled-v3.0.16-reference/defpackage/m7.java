package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m7 extends cv2 {
    public final mn2 a;
    public final w52 b;
    public final w52 c;

    public m7(mn2 mn2Var, ju2 ju2Var, pe2 pe2Var) {
        this.a = mn2Var;
        this.b = ke0.H(ju2Var);
        this.c = ke0.H(pe2Var);
    }

    @Override // defpackage.cv2
    public final cv2 a(nu2 nu2Var, ju2 ju2Var, long j, long j2, long j3) {
        w52 w52Var = this.b;
        ce0.X(this.a, j, j2, j3, !o51.f((ju2) w52Var.getValue(), ju2Var));
        w52Var.setValue(ju2Var);
        return this;
    }

    @Override // defpackage.cv2
    public final pe2 c() {
        return (pe2) this.c.getValue();
    }

    @Override // defpackage.cv2
    public final boolean d() {
        return true;
    }

    @Override // defpackage.cv2
    public final mn2 e() {
        return this.a;
    }

    @Override // defpackage.cv2
    public final cv2 h() {
        mn2 mn2Var = this.a;
        ce0.d(c12.e(((c12) ((w52) mn2Var.h).getValue()).a, ((c12) ((w52) mn2Var.g).getValue()).a), ((cw2) ((w52) mn2Var.e).getValue()).a);
        pu2 pu2Var = ((ju2) this.b.getValue()).u;
        w52 w52Var = pu2Var.m;
        ru2 ru2Var = (ru2) ((uu2) w52Var.getValue()).b.getValue();
        pa1 pa1Var = pu2Var.e().b.j;
        if (pa1Var == null) {
            fo.i("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
            return null;
        }
        mc0.J(pa1Var.f0());
        ru2Var.getClass();
        return pz1.a;
    }

    @Override // defpackage.cv2
    public final void i(pe2 pe2Var) {
        this.c.setValue(pe2Var);
    }

    @Override // defpackage.cv2
    public final cv2 g(ju2 ju2Var) {
        return this;
    }
}
