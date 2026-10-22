package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class lo2 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ po2 f;

    public /* synthetic */ lo2(po2 po2Var, int i) {
        this.e = i;
        this.f = po2Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        po2 po2Var = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf(po2Var.r);
            default:
                dq0 dq0Var = po2Var.T;
                if (!dq0Var.e.r) {
                    return null;
                }
                zp0 zp0VarR1 = dq0Var.r1();
                if (!zp0VarR1.a()) {
                    return null;
                }
                if (zp0VarR1.b()) {
                    return dq0Var.p1(null);
                }
                dq0 dq0VarG = ((rp0) ((db) xp1.P(dq0Var)).getFocusOwner()).g();
                if (dq0VarG != null) {
                    return dq0VarG.p1(xp1.N(dq0Var));
                }
                return null;
        }
    }
}
