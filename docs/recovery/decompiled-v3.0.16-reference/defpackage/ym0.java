package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ym0 implements qu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ AppState f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ au0 h;

    public /* synthetic */ ym0(AppState appState, boolean z, au0 au0Var) {
        this.f = appState;
        this.g = z;
        this.h = au0Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        au0 au0Var = this.h;
        boolean z = this.g;
        AppState appState = this.f;
        bc1 bc1Var = (bc1) obj;
        f30 f30Var = (f30) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                bc1Var.getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    ee0.k(0, ov0Var, au0Var, appState, z);
                }
                break;
            default:
                bc1Var.getClass();
                ov0 ov0Var2 = (ov0) f30Var;
                if (!ov0Var2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    ee0.o(0, ov0Var2, au0Var, appState, z);
                }
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ ym0(boolean z, AppState appState, au0 au0Var) {
        this.g = z;
        this.f = appState;
        this.h = au0Var;
    }
}
