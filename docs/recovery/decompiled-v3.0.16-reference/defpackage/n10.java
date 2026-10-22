package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class n10 implements pu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int f;
    public final /* synthetic */ p10 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ n10(int i, pu0 pu0Var, p10 p10Var, pu0 pu0Var2, pu0 pu0Var3, sk3 sk3Var, pu0 pu0Var4, int i2) {
        this.f = i;
        this.h = pu0Var;
        this.g = p10Var;
        this.i = pu0Var2;
        this.j = pu0Var3;
        this.k = sk3Var;
        this.l = pu0Var4;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM0 = wc0.m0(this.f) | 1;
                this.g.k(this.h, this.i, this.j, this.k, this.l, (f30) obj, iM0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM1 = wc0.m0(1);
                wc0.o(this.f, (pu0) this.h, this.g, (pu0) this.i, (pu0) this.j, (sk3) this.k, (pu0) this.l, (f30) obj, iM1);
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ n10(p10 p10Var, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.g = p10Var;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
        this.l = obj5;
        this.f = i;
    }
}
