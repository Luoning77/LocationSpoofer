package defpackage;

import com.vincenthzr.locationspoofer.data.model.AppInfoItem;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class q6 implements pu0 {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ xu0 h;
    public final /* synthetic */ Object i;

    public /* synthetic */ q6(AppInfoItem appInfoItem, boolean z, boolean z2, lu0 lu0Var, int i) {
        this.i = appInfoItem;
        this.f = z;
        this.g = z2;
        this.h = lu0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        xu0 xu0Var = this.h;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM0 = wc0.m0(1);
                ym3.o(this.f, this.g, (String) obj3, (au0) xu0Var, (f30) obj, iM0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM1 = wc0.m0(3121);
                ke0.j(this.f, this.g, (au0) xu0Var, (lu0) obj3, (f30) obj, iM1);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = wc0.m0(1);
                xq1.s((AppInfoItem) obj3, this.f, this.g, (lu0) xu0Var, (f30) obj, iM2);
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ q6(boolean z, boolean z2, au0 au0Var, lu0 lu0Var, int i) {
        this.f = z;
        this.g = z2;
        this.h = au0Var;
        this.i = lu0Var;
    }

    public /* synthetic */ q6(boolean z, boolean z2, String str, au0 au0Var, int i) {
        this.f = z;
        this.g = z2;
        this.i = str;
        this.h = au0Var;
    }
}
