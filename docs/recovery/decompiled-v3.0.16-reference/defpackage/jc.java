package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jc extends aa1 implements pu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ xu0 i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ xu0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jc(xu0 xu0Var, Object obj, xu0 xu0Var2, int i, int i2, int i3) {
        super(2);
        this.f = i3;
        this.i = xu0Var;
        this.j = obj;
        this.k = xu0Var2;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        int i2 = this.g;
        xu0 xu0Var = this.k;
        Object obj3 = this.j;
        xu0 xu0Var2 = this.i;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                sb.F((au0) xu0Var2, (qc0) obj3, (p10) xu0Var, (f30) obj, wc0.m0(i2 | 1), this.h);
                break;
            default:
                ((Number) obj2).intValue();
                xq1.c((lu0) xu0Var2, (dv1) obj3, (lu0) xu0Var, (f30) obj, wc0.m0(i2 | 1), this.h);
                break;
        }
        return mf3Var;
    }
}
