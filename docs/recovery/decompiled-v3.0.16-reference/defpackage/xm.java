package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class xm implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ AppState g;
    public final /* synthetic */ au0 h;

    public /* synthetic */ xm(ul1 ul1Var, AppState appState, au0 au0Var, int i, int i2) {
        this.e = i2;
        this.f = ul1Var;
        this.g = appState;
        this.h = au0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        au0 au0Var = this.h;
        AppState appState = this.g;
        ul1 ul1Var = this.f;
        f30 f30Var = (f30) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ks.B(ul1Var, appState, au0Var, f30Var, wc0.m0(1));
                break;
            default:
                xq1.t(ul1Var, appState, au0Var, f30Var, wc0.m0(1));
                break;
        }
        return mf3Var;
    }
}
