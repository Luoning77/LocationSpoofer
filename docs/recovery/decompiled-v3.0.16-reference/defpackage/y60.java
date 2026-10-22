package defpackage;

import com.vincenthzr.locationspoofer.data.model.ImportExportSelection;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class y60 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lu0 f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ y60(lu0 lu0Var, ey1 ey1Var, int i) {
        this.e = i;
        this.f = lu0Var;
        this.g = ey1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.g;
        lu0 lu0Var = this.f;
        switch (i) {
            case 0:
                lu0Var.invoke((String) ey1Var.getValue());
                break;
            case 1:
                lu0Var.invoke((String) ey1Var.getValue());
                break;
            case 2:
                lu0Var.invoke((ImportExportSelection) ey1Var.getValue());
                break;
            case 3:
                ey1Var.setValue(Boolean.FALSE);
                lu0Var.invoke(ml1.n);
                break;
            default:
                if (!l13.k0((String) ey1Var.getValue())) {
                    lu0Var.invoke((String) ey1Var.getValue());
                }
                break;
        }
        return mf3Var;
    }
}
