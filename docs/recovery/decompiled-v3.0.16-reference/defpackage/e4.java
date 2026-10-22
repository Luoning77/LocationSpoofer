package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class e4 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ l6 f;
    public final /* synthetic */ int g;

    public /* synthetic */ e4(l6 l6Var, int i, int i2) {
        this.e = i2;
        this.f = l6Var;
        this.g = i;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = this.g;
        l6 l6Var = this.f;
        f30 f30Var = (f30) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                o51.b(l6Var, f30Var, wc0.m0(i2 | 1));
                break;
            default:
                gh0.a(l6Var, f30Var, wc0.m0(i2 | 1));
                break;
        }
        return mf3Var;
    }
}
