package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountDevice;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class x4 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ CloudAccountDevice f;

    public /* synthetic */ x4(CloudAccountDevice cloudAccountDevice, int i) {
        this.e = i;
        this.f = cloudAccountDevice;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CloudAccountDevice cloudAccountDevice = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    s83.b(ke0.O(2131624257, new Object[]{cloudAccountDevice.getName()}, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                }
                break;
            default:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    s83.b(ke0.O(2131623983, new Object[]{cloudAccountDevice.getName()}, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                }
                break;
        }
        return mf3Var;
    }
}
