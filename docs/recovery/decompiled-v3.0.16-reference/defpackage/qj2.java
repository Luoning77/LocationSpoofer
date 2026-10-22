package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class qj2 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ AppState f;
    public final /* synthetic */ lu0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ qj2(AppState appState, lu0 lu0Var, int i, int i2) {
        this.e = i2;
        this.f = appState;
        this.g = lu0Var;
        this.h = i;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        int i2 = this.h;
        lu0 lu0Var = this.g;
        AppState appState = this.f;
        f30 f30Var = (f30) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                sj2.a(appState, lu0Var, f30Var, wc0.m0(i2 | 1));
                break;
            default:
                sj2.g(appState, lu0Var, f30Var, wc0.m0(i2 | 1));
                break;
        }
        return mf3Var;
    }
}
