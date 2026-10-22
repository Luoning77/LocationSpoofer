package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class cr2 implements lu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ au0 f;
    public final /* synthetic */ au0 g;

    public /* synthetic */ cr2(au0 au0Var, au0 au0Var2, int i) {
        this.e = i;
        this.f = au0Var;
        this.g = au0Var2;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        au0 au0Var = this.g;
        au0 au0Var2 = this.f;
        k63 k63Var = (k63) obj;
        switch (i) {
            case 0:
                au0Var2.invoke();
                if (au0Var != null ? ((Boolean) au0Var.invoke()).booleanValue() : true) {
                    k63Var.close();
                }
                break;
            default:
                au0Var2.invoke();
                if (au0Var != null ? ((Boolean) au0Var.invoke()).booleanValue() : true) {
                    k63Var.close();
                }
                break;
        }
        return mf3Var;
    }
}
