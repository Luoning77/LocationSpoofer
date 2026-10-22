package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mc extends aa1 implements pu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ dv1 g;
    public final /* synthetic */ pu0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc(dv1 dv1Var, pu0 pu0Var, int i, int i2) {
        super(2);
        this.f = i2;
        this.g = dv1Var;
        this.h = pu0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        pu0 pu0Var = this.h;
        dv1 dv1Var = this.g;
        f30 f30Var = (f30) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                sb.G(dv1Var, pu0Var, f30Var, wc0.m0(1));
                break;
            default:
                o51.c(dv1Var, pu0Var, f30Var, wc0.m0(1));
                break;
        }
        return mf3Var;
    }
}
