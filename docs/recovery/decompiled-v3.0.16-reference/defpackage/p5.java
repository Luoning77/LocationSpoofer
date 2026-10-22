package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountDevice;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class p5 implements au0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ CloudAccountDevice f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ p5(CloudAccountDevice cloudAccountDevice, ey1 ey1Var, int i) {
        this.e = i;
        this.f = cloudAccountDevice;
        this.g = ey1Var;
    }

    @Override // defpackage.au0
    public final Object invoke() {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.g;
        CloudAccountDevice cloudAccountDevice = this.f;
        switch (i) {
            case 0:
                ey1Var.setValue(cloudAccountDevice);
                break;
            default:
                ey1Var.setValue(cloudAccountDevice);
                break;
        }
        return mf3Var;
    }
}
