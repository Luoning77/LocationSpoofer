package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class b9 implements pu0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ xu0 j;

    public /* synthetic */ b9(p10 p10Var, Object obj, Object obj2, Object obj3, int i) {
        this.j = p10Var;
        this.h = obj;
        this.g = obj2;
        this.i = obj3;
        this.f = i;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        int i2 = this.f;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        mf3 mf3Var = mf3.a;
        xu0 xu0Var = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                i9.d((au0) obj4, (dv1) obj5, (qc0) obj3, (p10) xu0Var, (f30) obj, wc0.m0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM0 = wc0.m0(1);
                xp1.a((String) obj4, this.f, (lu0) obj3, (lu0) xu0Var, (dv1) obj5, (f30) obj, iM0);
                break;
            case 2:
                ((Integer) obj2).getClass();
                nd.c((lk2) obj3, (au0) obj4, (dv1) obj5, (p10) xu0Var, (f30) obj, wc0.m0(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ym3.b((String) obj5, (x01) obj3, (au0) obj4, (p10) xu0Var, (f30) obj, wc0.m0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                n51.b((CompleteCollectionRoute) obj5, (au0) obj4, (au0) obj3, (au0) xu0Var, (f30) obj, wc0.m0(1), this.f);
                break;
            case Logger.WARN /* 5 */:
                ((Integer) obj2).getClass();
                int iM1 = wc0.m0(i2) | 1;
                ((p10) xu0Var).i(this.h, this.g, this.i, (f30) obj, iM1);
                break;
            default:
                ((Integer) obj2).getClass();
                mc0.h((dv1) obj5, (xp2) obj4, (lu0) obj3, (p10) xu0Var, (f30) obj, wc0.m0(i2 | 1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ b9(au0 au0Var, dv1 dv1Var, qc0 qc0Var, p10 p10Var, int i) {
        this.h = au0Var;
        this.g = dv1Var;
        this.i = qc0Var;
        this.j = p10Var;
        this.f = i;
    }

    public /* synthetic */ b9(dv1 dv1Var, xp2 xp2Var, lu0 lu0Var, p10 p10Var, int i) {
        this.g = dv1Var;
        this.h = xp2Var;
        this.i = lu0Var;
        this.j = p10Var;
        this.f = i;
    }

    public /* synthetic */ b9(lk2 lk2Var, au0 au0Var, dv1 dv1Var, p10 p10Var, int i) {
        this.i = lk2Var;
        this.h = au0Var;
        this.g = dv1Var;
        this.j = p10Var;
        this.f = i;
    }

    public /* synthetic */ b9(CompleteCollectionRoute completeCollectionRoute, au0 au0Var, au0 au0Var2, au0 au0Var3, int i, int i2) {
        this.g = completeCollectionRoute;
        this.h = au0Var;
        this.i = au0Var2;
        this.j = au0Var3;
        this.f = i2;
    }

    public /* synthetic */ b9(String str, int i, lu0 lu0Var, lu0 lu0Var2, dv1 dv1Var, int i2) {
        this.h = str;
        this.f = i;
        this.i = lu0Var;
        this.j = lu0Var2;
        this.g = dv1Var;
    }

    public /* synthetic */ b9(String str, x01 x01Var, au0 au0Var, p10 p10Var, int i) {
        this.g = str;
        this.i = x01Var;
        this.h = au0Var;
        this.j = p10Var;
        this.f = i;
    }
}
