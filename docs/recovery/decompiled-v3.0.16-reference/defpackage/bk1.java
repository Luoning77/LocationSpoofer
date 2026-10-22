package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bk1 extends aa1 implements au0 {
    public final /* synthetic */ ck1 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ j82 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk1(ck1 ck1Var, long j, long j2, j82 j82Var) {
        super(0);
        this.f = ck1Var;
        this.g = j;
        this.h = j2;
        this.i = j82Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        ck1 ck1Var = this.f;
        ck1Var.e1().e = false;
        ck1Var.e1().f = this.g;
        ck1Var.e1().g = this.h;
        lu0 lu0VarD = this.i.e.d();
        if (lu0VarD != null) {
            lu0VarD.invoke(ck1Var.e1());
        }
        return mf3.a;
    }
}
