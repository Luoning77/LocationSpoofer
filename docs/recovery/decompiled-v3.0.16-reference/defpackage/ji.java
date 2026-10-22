package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ji extends aa1 implements pu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ dv1 h;
    public final /* synthetic */ pk0 i;
    public final /* synthetic */ lm0 j;
    public final /* synthetic */ String k;
    public final /* synthetic */ p10 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji(boolean z, dv1 dv1Var, pk0 pk0Var, lm0 lm0Var, String str, p10 p10Var, int i, int i2) {
        super(2);
        this.f = i2;
        this.g = z;
        this.h = dv1Var;
        this.i = pk0Var;
        this.j = lm0Var;
        this.k = str;
        this.l = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iM0 = wc0.m0(1572871);
                da0.c(this.g, this.h, this.i, this.j, this.k, this.l, (f30) obj, iM0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM1 = wc0.m0(1600519);
                da0.e(this.g, this.h, this.i, this.j, this.k, this.l, (f30) obj, iM1);
                break;
        }
        return mf3Var;
    }
}
