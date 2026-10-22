package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class gz implements lu0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ int f;

    public /* synthetic */ gz(int i) {
        this.f = i;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f + '.');
            default:
                uc1 uc1Var = (uc1) obj;
                nx2 nx2VarK = wc0.K();
                wc0.g0(nx2VarK, wc0.S(nx2VarK), nx2VarK != null ? nx2VarK.e() : null);
                uc1Var.getClass();
                return mf3.a;
        }
    }

    public /* synthetic */ gz(yd1 yd1Var, int i) {
        this.f = i;
    }
}
