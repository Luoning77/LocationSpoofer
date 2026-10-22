package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lk1 extends aa1 implements pu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ p10 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk1(p10 p10Var, int i, int i2) {
        super(2);
        this.f = i2;
        this.g = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        p10 p10Var = this.g;
        f30 f30Var = (f30) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                ee0.e(p10Var, f30Var, wc0.m0(7));
                break;
            default:
                zu2.b(p10Var, f30Var, wc0.m0(7));
                break;
        }
        return mf3Var;
    }
}
