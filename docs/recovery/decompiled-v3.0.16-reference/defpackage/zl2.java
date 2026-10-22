package defpackage;

import com.vincenthzr.locationspoofer.data.model.SavedLocation;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zl2 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lu0 f;
    public final /* synthetic */ SavedLocation g;

    public /* synthetic */ zl2(lu0 lu0Var, SavedLocation savedLocation, int i) {
        this.e = i;
        this.f = lu0Var;
        this.g = savedLocation;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        SavedLocation savedLocation = this.g;
        lu0 lu0Var = this.f;
        switch (i) {
            case 0:
                lu0Var.invoke(savedLocation);
                break;
            case 1:
                lu0Var.invoke(savedLocation);
                break;
            case 2:
                lu0Var.invoke(savedLocation);
                break;
            default:
                lu0Var.invoke(savedLocation);
                break;
        }
        return mf3Var;
    }
}
