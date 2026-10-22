package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class n90 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ AppState g;
    public final /* synthetic */ boolean h;

    public /* synthetic */ n90(ul1 ul1Var, AppState appState, boolean z, int i, int i2) {
        this.e = i2;
        this.f = ul1Var;
        this.g = appState;
        this.h = z;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        boolean z = this.h;
        AppState appState = this.g;
        ul1 ul1Var = this.f;
        f30 f30Var = (f30) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                k22.f(ul1Var, appState, z, f30Var, wc0.m0(1));
                break;
            default:
                sj2.f(ul1Var, appState, z, f30Var, wc0.m0(1));
                break;
        }
        return mf3Var;
    }
}
