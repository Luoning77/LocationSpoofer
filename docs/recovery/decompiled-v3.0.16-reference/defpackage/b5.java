package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountDevice;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class b5 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ l6 f;
    public final /* synthetic */ CloudAccountDevice g;
    public final /* synthetic */ ey1 h;

    public /* synthetic */ b5(l6 l6Var, CloudAccountDevice cloudAccountDevice, ey1 ey1Var, int i) {
        this.e = i;
        this.f = l6Var;
        this.g = cloudAccountDevice;
        this.h = ey1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.h;
        CloudAccountDevice cloudAccountDevice = this.g;
        l6 l6Var = this.f;
        switch (i) {
            case 0:
                ey1Var.setValue(null);
                l6Var.g(new g6(l6Var, (Object) cloudAccountDevice, (q60) null, 3));
                break;
            default:
                ey1Var.setValue(null);
                l6Var.g(new g6(l6Var, (Object) cloudAccountDevice, (q60) null, 3));
                break;
        }
        return mf3Var;
    }
}
