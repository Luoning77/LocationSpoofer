package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hh extends aa1 implements pu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ dv1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ xu0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh(Object obj, dv1 dv1Var, xu0 xu0Var, int i, int i2) {
        super(2);
        this.f = i2;
        this.i = obj;
        this.g = dv1Var;
        this.j = xu0Var;
        this.h = i;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        int i2 = this.h;
        xu0 xu0Var = this.j;
        dv1 dv1Var = this.g;
        Object obj3 = this.i;
        f30 f30Var = (f30) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                xq1.b((lu0) obj3, dv1Var, (lu0) xu0Var, f30Var, wc0.m0(i2 | 1));
                break;
            default:
                o51.d((g23) obj3, dv1Var, (pu0) xu0Var, f30Var, wc0.m0(i2 | 1));
                break;
        }
        return mf3Var;
    }
}
