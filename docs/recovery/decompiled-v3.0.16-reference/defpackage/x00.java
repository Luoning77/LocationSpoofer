package defpackage;

import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class x00 implements bf1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ x00(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.bf1
    public final void U(df1 df1Var, ve1 ve1Var) {
        int i = this.e;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ComponentActivity.addObserverForBackInvoker$lambda$7((x12) obj2, (ComponentActivity) obj, df1Var, ve1Var);
                break;
            default:
                rs1 rs1Var = (rs1) obj2;
                qt1 qt1Var = (qt1) obj;
                rs1Var.getClass();
                if (ve1Var == ve1.ON_DESTROY) {
                    rs1Var.d(qt1Var);
                }
                break;
        }
    }
}
