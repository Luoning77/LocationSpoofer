package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class wy1 implements pu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ AppState f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ au0 h;

    public /* synthetic */ wy1(AppState appState, boolean z, au0 au0Var, int i) {
        this.f = appState;
        this.g = z;
        this.h = au0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        au0 au0Var = this.h;
        boolean z = this.g;
        AppState appState = this.f;
        f30 f30Var = (f30) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ee0.k(wc0.m0(1), f30Var, au0Var, appState, z);
                break;
            default:
                ee0.o(wc0.m0(1), f30Var, au0Var, appState, z);
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ wy1(boolean z, AppState appState, au0 au0Var, int i) {
        this.g = z;
        this.f = appState;
        this.h = au0Var;
    }
}
