package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class k2 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ CloudAccountState f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ au0 h;
    public final /* synthetic */ au0 i;

    public /* synthetic */ k2(CloudAccountState cloudAccountState, boolean z, au0 au0Var, au0 au0Var2, int i, int i2) {
        this.e = i2;
        this.f = cloudAccountState;
        this.g = z;
        this.h = au0Var;
        this.i = au0Var2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM0 = wc0.m0(1);
                xq1.o(this.f, this.g, this.h, this.i, (f30) obj, iM0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM1 = wc0.m0(1);
                xq1.k(this.f, this.g, this.h, this.i, (f30) obj, iM1);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = wc0.m0(1);
                hd0.l(this.f, this.g, this.h, this.i, (f30) obj, iM2);
                break;
        }
        return mf3Var;
    }
}
