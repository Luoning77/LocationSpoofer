package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class zi1 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ t52 f;

    public /* synthetic */ zi1(t52 t52Var, int i) {
        this.e = i;
        this.f = t52Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        t52 t52Var = this.f;
        switch (i) {
            case 0:
                t52Var.h(((Integer) obj).intValue());
                break;
            case 1:
                t52Var.h(((Integer) obj).intValue());
                break;
            default:
                pa1 pa1Var = (pa1) obj;
                pa1Var.getClass();
                t52Var.h((int) (pa1Var.f0() & 4294967295L));
                break;
        }
        return mf3Var;
    }
}
