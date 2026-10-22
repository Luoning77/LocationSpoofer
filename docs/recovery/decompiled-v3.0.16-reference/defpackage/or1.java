package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class or1 implements bf1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ or1(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.bf1
    public final void U(df1 df1Var, ve1 ve1Var) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                is1 is1Var = (is1) obj;
                int i2 = xr1.a[ve1Var.ordinal()];
                if (i2 == 1) {
                    is1Var.n(true);
                    break;
                } else if (i2 == 2) {
                    is1Var.n(false);
                    break;
                }
                break;
            default:
                sm2 sm2Var = (sm2) obj;
                if (ve1Var == ve1.ON_START) {
                    sm2Var.h = true;
                } else if (ve1Var == ve1.ON_STOP) {
                    sm2Var.h = false;
                }
                break;
        }
    }
}
