package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteLocation;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class co1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ CompleteLocation f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ co1(CompleteLocation completeLocation, ey1 ey1Var, int i) {
        this.e = i;
        this.f = completeLocation;
        this.g = ey1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CompleteLocation completeLocation = this.f;
        ey1 ey1Var = this.g;
        switch (i) {
            case 0:
                ey1Var.setValue(completeLocation);
                break;
            default:
                ey1Var.setValue(completeLocation);
                break;
        }
        return mf3Var;
    }
}
