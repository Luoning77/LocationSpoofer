package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class u9 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lu0 f;
    public final /* synthetic */ s52 g;

    public /* synthetic */ u9(lu0 lu0Var, s52 s52Var, int i) {
        this.e = i;
        this.f = lu0Var;
        this.g = s52Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        s52 s52Var = this.g;
        lu0 lu0Var = this.f;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                s52Var.h(fFloatValue);
                lu0Var.invoke(Integer.valueOf((int) fFloatValue));
                break;
            case 1:
                s52Var.h(fFloatValue);
                lu0Var.invoke(Integer.valueOf((int) fFloatValue));
                break;
            default:
                s52Var.h(fFloatValue);
                lu0Var.invoke(Double.valueOf(fFloatValue));
                break;
        }
        return mf3Var;
    }
}
