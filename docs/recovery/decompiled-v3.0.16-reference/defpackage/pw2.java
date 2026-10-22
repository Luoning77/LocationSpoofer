package defpackage;

import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class pw2 implements pu0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ pw2(sw2 sw2Var, ix1 ix1Var, dv1 dv1Var, mw2 mw2Var, boolean z, long j, int i) {
        this.h = sw2Var;
        this.i = ix1Var;
        this.j = dv1Var;
        this.k = mw2Var;
        this.g = z;
        this.f = j;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM0 = wc0.m0(196609);
                ((sw2) obj6).a((ix1) obj5, (dv1) obj4, (mw2) obj3, this.g, this.f, (f30) obj, iM0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM1 = wc0.m0(1);
                h73.h((GithubRelease) obj6, (List) obj5, this.f, this.g, (lu0) obj4, (pu0) obj3, (f30) obj, iM1);
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ pw2(GithubRelease githubRelease, List list, long j, boolean z, lu0 lu0Var, pu0 pu0Var, int i) {
        this.h = githubRelease;
        this.i = list;
        this.f = j;
        this.g = z;
        this.j = lu0Var;
        this.k = pu0Var;
    }
}
