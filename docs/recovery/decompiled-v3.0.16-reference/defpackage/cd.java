package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class cd implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ te2 f;

    public /* synthetic */ cd(te2 te2Var, int i) {
        this.e = i;
        this.f = te2Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        te2 te2Var = this.f;
        switch (i) {
            case 0:
                j90 j90Var = (j90) obj;
                j90Var.getClass();
                te2Var.e = ((Number) j90Var.l.e.getValue()).floatValue();
                break;
            case 1:
                float fFloatValue = ((Float) obj2).floatValue();
                ((x92) obj).a();
                te2Var.e = fFloatValue;
                break;
            default:
                float fFloatValue2 = ((Float) obj2).floatValue();
                ((x92) obj).a();
                te2Var.e = fFloatValue2;
                break;
        }
        return mf3Var;
    }
}
