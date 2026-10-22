package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class dd2 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ q93 g;
    public final /* synthetic */ pu0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ dd2(long j, q93 q93Var, pu0 pu0Var, int i, int i2) {
        this.e = i2;
        this.f = j;
        this.g = q93Var;
        this.h = pu0Var;
        this.i = i;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iM0 = wc0.m0(i2 | 1);
                hd0.i(this.f, this.g, this.h, (f30) obj, iM0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM1 = wc0.m0(i2 | 1);
                h73.e(this.f, this.g, this.h, (f30) obj, iM1);
                break;
        }
        return mf3Var;
    }
}
