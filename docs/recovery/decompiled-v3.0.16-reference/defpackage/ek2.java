package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ek2 implements au0 {
    public final /* synthetic */ lr2 e;
    public final /* synthetic */ sn f;
    public final /* synthetic */ op0 g;
    public final /* synthetic */ ny2 h;
    public final /* synthetic */ ey1 i;
    public final /* synthetic */ ey1 j;

    public ek2(lr2 lr2Var, sn snVar, op0 op0Var, ny2 ny2Var, ey1 ey1Var, ey1 ey1Var2) {
        this.e = lr2Var;
        this.f = snVar;
        this.g = op0Var;
        this.h = ny2Var;
        this.i = ey1Var;
        this.j = ey1Var2;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        lr2 lr2Var = this.e;
        if (lr2Var != null) {
            sn snVar = this.f;
            lr2Var.d(snVar.c, snVar.d, Float.valueOf(17.0f));
        }
        this.i.setValue(Boolean.FALSE);
        gk2.b(this.j, false);
        op0.a(this.g);
        ny2 ny2Var = this.h;
        if (ny2Var != null) {
            ((nb0) ny2Var).a();
        }
        return mf3.a;
    }
}
