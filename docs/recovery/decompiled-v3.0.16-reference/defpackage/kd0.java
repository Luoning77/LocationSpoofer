package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class kd0 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ dv1 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ long h;

    public /* synthetic */ kd0(dv1 dv1Var, float f, long j, int i, int i2) {
        this.e = i2;
        this.f = dv1Var;
        this.g = f;
        this.h = j;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ld0.g(this.f, this.g, this.h, (f30) obj, wc0.m0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ld0.h(this.f, this.g, this.h, (f30) obj, wc0.m0(7));
                break;
        }
        return mf3Var;
    }
}
