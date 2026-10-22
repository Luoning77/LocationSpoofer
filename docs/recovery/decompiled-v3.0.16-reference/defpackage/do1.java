package defpackage;

import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute;
import com.vincenthzr.locationspoofer.data.model.GithubRelease;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class do1 implements ru0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ List f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ ey1 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public do1(List list, ul1 ul1Var, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3) {
        this.f = list;
        this.i = ul1Var;
        this.g = ey1Var;
        this.h = ey1Var2;
        this.j = ey1Var3;
    }

    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        GithubRelease githubRelease;
        int i = this.e;
        mf3 mf3Var = mf3.a;
        c30 c30Var = d30.a;
        ey1 ey1Var = this.h;
        List list = this.f;
        Object obj5 = this.i;
        Object obj6 = this.j;
        switch (i) {
            case 0:
                bc1 bc1Var = (bc1) obj;
                int iIntValue = ((Number) obj2).intValue();
                f30 f30Var = (f30) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                ul1 ul1Var = (ul1) obj5;
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((ov0) f30Var).f(bc1Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= ((ov0) f30Var).d(iIntValue) ? 32 : 16;
                }
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(i2 & 1, (i2 & 147) != 146)) {
                    ov0Var.W();
                } else {
                    CompleteCollectionRoute completeCollectionRoute = (CompleteCollectionRoute) list.get(iIntValue);
                    ov0Var.c0(851751652);
                    boolean zH = ov0Var.h(ul1Var) | ov0Var.h(completeCollectionRoute);
                    Object objQ = ov0Var.Q();
                    if (zH || objQ == c30Var) {
                        objQ = new hh1(ul1Var, completeCollectionRoute, this.g, 1);
                        ov0Var.m0(objQ);
                    }
                    au0 au0Var = (au0) objQ;
                    boolean zH2 = ov0Var.h(completeCollectionRoute);
                    Object objQ2 = ov0Var.Q();
                    if (zH2 || objQ2 == c30Var) {
                        objQ2 = new bo1(completeCollectionRoute, ey1Var, 0);
                        ov0Var.m0(objQ2);
                    }
                    au0 au0Var2 = (au0) objQ2;
                    boolean zH3 = ov0Var.h(completeCollectionRoute);
                    Object objQ3 = ov0Var.Q();
                    if (zH3 || objQ3 == c30Var) {
                        objQ3 = new bo1(completeCollectionRoute, (ey1) obj6, 1);
                        ov0Var.m0(objQ3);
                    }
                    n51.b(completeCollectionRoute, au0Var, au0Var2, (au0) objQ3, ov0Var, 0, 0);
                    ov0Var.p(false);
                }
                break;
            default:
                bc1 bc1Var2 = (bc1) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                f30 f30Var2 = (f30) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                yd1 yd1Var = (yd1) obj6;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((ov0) f30Var2).f(bc1Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= ((ov0) f30Var2).d(iIntValue3) ? 32 : 16;
                }
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(i3 & 1, (i3 & 147) != 146)) {
                    ov0Var2.W();
                } else {
                    GithubRelease githubRelease2 = (GithubRelease) list.get(iIntValue3);
                    ov0Var2.c0(1641605768);
                    String string = l13.D0(githubRelease2.getVersionName()).toString();
                    Locale locale = Locale.ROOT;
                    String lowerCase = string.toLowerCase(locale);
                    lowerCase.getClass();
                    String strQ0 = l13.q0(lowerCase, "v");
                    String lowerCase2 = l13.D0("3.0.16").toString().toLowerCase(locale);
                    lowerCase2.getClass();
                    boolean zEquals = strQ0.equals(l13.q0(lowerCase2, "v"));
                    og3 og3Var = (og3) ey1Var.getValue();
                    ey1 ey1Var2 = this.g;
                    boolean zF = ov0Var2.f(ey1Var2) | ov0Var2.h(githubRelease2) | ov0Var2.h(coroutineScope) | ov0Var2.f(yd1Var);
                    Object objQ4 = ov0Var2.Q();
                    if (zF || objQ4 == c30Var) {
                        objQ4 = new ej1(githubRelease2, coroutineScope, ey1Var2, yd1Var, 1);
                        githubRelease = githubRelease2;
                        ov0Var2.m0(objQ4);
                    } else {
                        githubRelease = githubRelease2;
                    }
                    n51.i(githubRelease, zEquals, og3Var, (au0) objQ4, ov0Var2, 3456);
                    ov0Var2.p(false);
                }
                break;
        }
        return mf3Var;
    }

    public do1(List list, ey1 ey1Var, CoroutineScope coroutineScope, yd1 yd1Var, ey1 ey1Var2) {
        this.f = list;
        this.g = ey1Var;
        this.i = coroutineScope;
        this.j = yd1Var;
        this.h = ey1Var2;
    }
}
