package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class yw implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ lu0 g;
    public final /* synthetic */ dv1 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public /* synthetic */ yw(boolean z, lu0 lu0Var, dv1 dv1Var, boolean z2, Object obj, int i, int i2, int i3) {
        this.e = i3;
        this.f = z;
        this.g = lu0Var;
        this.h = dv1Var;
        this.i = z2;
        this.l = obj;
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = this.j;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM0 = wc0.m0(i2 | 1);
                ym3.f(this.f, this.g, this.h, this.i, (uw) obj3, (f30) obj, iM0, this.k);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM1 = wc0.m0(i2 | 1);
                b43.a(this.f, this.g, this.h, this.i, (w33) obj3, (f30) obj, iM1, this.k);
                break;
        }
        return mf3Var;
    }
}
