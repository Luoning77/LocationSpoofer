package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ii extends aa1 implements pu0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ dv1 g;
    public final /* synthetic */ pk0 h;
    public final /* synthetic */ lm0 i;
    public final /* synthetic */ String j;
    public final /* synthetic */ p10 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(boolean z, dv1 dv1Var, pk0 pk0Var, lm0 lm0Var, String str, p10 p10Var, int i, int i2) {
        super(2);
        this.f = z;
        this.g = dv1Var;
        this.h = pk0Var;
        this.i = lm0Var;
        this.j = str;
        this.k = p10Var;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        da0.d(this.f, this.g, this.h, this.i, this.j, this.k, (f30) obj, wc0.m0(this.l | 1), this.m);
        return mf3.a;
    }
}
