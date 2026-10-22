package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class ea1 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ AppState g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ au0 i;

    public /* synthetic */ ea1(ul1 ul1Var, AppState appState, boolean z, au0 au0Var, int i, int i2) {
        this.e = i2;
        this.f = ul1Var;
        this.g = appState;
        this.h = z;
        this.i = au0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM0 = wc0.m0(1);
                n51.f(this.f, this.g, this.h, this.i, (f30) obj, iM0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM1 = wc0.m0(1);
                xq1.r(this.f, this.g, this.h, this.i, (f30) obj, iM1);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = wc0.m0(1);
                ym3.m(this.f, this.g, this.h, this.i, (f30) obj, iM2);
                break;
        }
        return mf3Var;
    }
}
