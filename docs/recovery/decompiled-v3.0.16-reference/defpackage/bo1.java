package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bo1 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ CompleteCollectionRoute f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ bo1(CompleteCollectionRoute completeCollectionRoute, ey1 ey1Var, int i) {
        this.e = i;
        this.f = completeCollectionRoute;
        this.g = ey1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CompleteCollectionRoute completeCollectionRoute = this.f;
        ey1 ey1Var = this.g;
        switch (i) {
            case 0:
                ey1Var.setValue(completeCollectionRoute.getRoute());
                break;
            default:
                ey1Var.setValue(completeCollectionRoute.getRoute());
                break;
        }
        return mf3Var;
    }
}
