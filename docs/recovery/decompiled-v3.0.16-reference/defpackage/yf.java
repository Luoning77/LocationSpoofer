package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppState;
import com.vincenthzr.locationspoofer.data.model.RootSetupTestResult;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class yf implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ yf(String str, boolean z, String str2, int i, int i2) {
        this.e = 2;
        this.i = str;
        this.f = z;
        this.g = str2;
        this.h = i2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        int i2 = this.h;
        boolean z = this.f;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.g;
        Object obj4 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ji2.v((dv1) obj4, (au0) obj3, z, (f30) obj, wc0.m0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                gh0.f((RootSetupTestResult) obj4, z, (au0) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM0 = wc0.m0(1);
                gh0.b((String) obj4, this.f, (String) obj3, (f30) obj, iM0, this.h);
                break;
            case 3:
                ((Integer) obj2).intValue();
                sj2.e((AppState) obj4, z, (lu0) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                sj2.c((ul1) obj4, (AppState) obj3, z, (f30) obj, wc0.m0(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                a83.a(z, (hg2) obj4, (x73) obj3, (f30) obj, wc0.m0(i2 | 1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ yf(Object obj, boolean z, xu0 xu0Var, int i, int i2) {
        this.e = i2;
        this.i = obj;
        this.f = z;
        this.g = xu0Var;
        this.h = i;
    }

    public /* synthetic */ yf(Object obj, Object obj2, boolean z, int i, int i2) {
        this.e = i2;
        this.i = obj;
        this.g = obj2;
        this.f = z;
        this.h = i;
    }

    public /* synthetic */ yf(boolean z, hg2 hg2Var, x73 x73Var, int i) {
        this.e = 5;
        this.f = z;
        this.i = hg2Var;
        this.g = x73Var;
        this.h = i;
    }
}
