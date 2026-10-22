package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class qk1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ rk1 f;

    public /* synthetic */ qk1(rk1 rk1Var, int i) {
        this.e = i;
        this.f = rk1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        rk1 rk1Var = this.f;
        switch (i) {
            case 0:
                rk1Var.o1();
                return mf3.a;
            case 1:
                return new c12(rk1Var.G);
            default:
                pa1 pa1Var = (pa1) rk1Var.E.getValue();
                return new c12(pa1Var != null ? pa1Var.h0(0L) : 9205357640488583168L);
        }
    }
}
