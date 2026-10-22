package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class f2 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ CloudAccountState f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ au0 h;

    public /* synthetic */ f2(CloudAccountState cloudAccountState, boolean z, au0 au0Var, int i, int i2) {
        this.e = i2;
        this.f = cloudAccountState;
        this.g = z;
        this.h = au0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        au0 au0Var = this.h;
        boolean z = this.g;
        CloudAccountState cloudAccountState = this.f;
        f30 f30Var = (f30) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                xq1.j(cloudAccountState, z, au0Var, f30Var, wc0.m0(1));
                break;
            case 1:
                xq1.d(cloudAccountState, z, au0Var, f30Var, wc0.m0(1));
                break;
            default:
                ee0.m(cloudAccountState, z, au0Var, f30Var, wc0.m0(1));
                break;
        }
        return mf3Var;
    }
}
