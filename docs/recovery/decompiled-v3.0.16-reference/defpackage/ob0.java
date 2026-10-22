package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ob0 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ qb0 f;

    public /* synthetic */ ob0(qb0 qb0Var, int i) {
        this.e = i;
        this.f = qb0Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        qb0 qb0Var = this.f;
        switch (i) {
            case 0:
                ph2 ph2Var = (ph2) xq1.C(qb0Var, sh2.a);
                of ofVar = qb0Var.y;
                if (ph2Var == null) {
                    if (ofVar != null) {
                        qb0Var.n1(ofVar);
                    }
                    qb0Var.y = null;
                } else if (ofVar == null) {
                    pb0 pb0Var = new pb0(qb0Var);
                    ob0 ob0Var = new ob0(qb0Var, 1);
                    ix1 ix1Var = qb0Var.u;
                    boolean z = qb0Var.v;
                    float f = qb0Var.w;
                    od3 od3Var = th2.a;
                    of ofVar2 = new of(ix1Var, z, f, pb0Var, ob0Var);
                    qb0Var.m1(ofVar2);
                    qb0Var.y = ofVar2;
                }
                return mf3.a;
            default:
                return xp1.k;
        }
    }
}
